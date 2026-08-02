package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzpd extends zzjv {
    private static final String zza = zza.UNIVERSAL_ANALYTICS.toString();
    private static final List<String> zzb = Arrays.asList(ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, "purchase", ProductAction.ACTION_REFUND);
    private static final Pattern zzc = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzd = Pattern.compile("metric(\\d+)");
    private static final Set<String> zze = CollectionUtils.setOf("", "0", "false");
    private static final Map<String, String> zzf = CollectionUtils.mapOf("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");
    private static final Map<String, String> zzg = CollectionUtils.mapOf(AppMeasurementSdk.ConditionalUserProperty.NAME, "&in", "sku", "&ic", "category", "&iv", "price", "&ip", "quantity", "&iq", "currency", "&cu");
    private final zzjp zzh;
    private final zzhy zzi;
    private Map<String, Object> zzj;

    public zzpd(Context context, zzhy zzhyVar) {
        zzjp zzjpVar = new zzjp(context);
        this.zzi = zzhyVar;
        this.zzh = zzjpVar;
    }

    private static final Map<String, String> zzb(zzqw<?> zzqwVar) {
        Preconditions.checkNotNull(zzqwVar);
        Preconditions.checkArgument(zzqwVar instanceof zzre);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzri.zze(zzqwVar);
        Object zzg2 = zzri.zzg(zzqwVar);
        Preconditions.checkState(zzg2 instanceof Map);
        for (Map.Entry entry : ((Map) zzg2).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private static final Double zzc(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e11) {
                String valueOf = String.valueOf(e11.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf) : new String("Cannot convert the object to Double: "));
            }
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        String valueOf2 = String.valueOf(obj.toString());
        throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf2) : new String("Cannot convert the object to Double: "));
    }

    private static final Integer zze(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e11) {
                String valueOf = String.valueOf(e11.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf) : new String("Cannot convert the object to Integer: "));
            }
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        String valueOf2 = String.valueOf(obj.toString());
        throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf2) : new String("Cannot convert the object to Integer: "));
    }

    private static final Map<String, String> zzf(zzqw<?> zzqwVar) {
        Map<String, String> zzb2 = zzb(zzqwVar);
        String str = zzb2.get("&aip");
        if (str != null && zze.contains(str.toLowerCase())) {
            zzb2.remove("&aip");
        }
        return zzb2;
    }

    private static final Product zzg(Map<String, Object> map) {
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(String.valueOf(obj));
        }
        Object obj2 = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (obj2 != null) {
            product.setName(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            product.setBrand(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            product.setCategory(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            product.setVariant(String.valueOf(obj5));
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            product.setCouponCode(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            product.setPosition(zze(obj7).intValue());
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            product.setPrice(zzc(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            product.setQuantity(zze(obj9).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = zzc.matcher(str);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(str);
                    zzhl.zze(valueOf.length() != 0 ? "illegal number in custom dimension value: ".concat(valueOf) : new String("illegal number in custom dimension value: "));
                }
            } else {
                Matcher matcher2 = zzd.matcher(str);
                if (matcher2.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher2.group(1)), zze(map.get(str)).intValue());
                    } catch (NumberFormatException unused2) {
                        String valueOf2 = String.valueOf(str);
                        zzhl.zze(valueOf2.length() != 0 ? "illegal number in custom metric value: ".concat(valueOf2) : new String("illegal number in custom metric value: "));
                    }
                }
            }
        }
        return product;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0224, code lost:
    
        r6 = (java.util.Map) r8.get(r5);
        r0 = (java.util.List) r6.get("products");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0233, code lost:
    
        if (r0 == null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0235, code lost:
    
        r8 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023d, code lost:
    
        if (r8.hasNext() == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0245, code lost:
    
        r2.addProduct(zzg((java.util.Map) r8.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x024e, code lost:
    
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x025a, code lost:
    
        if (r0.length() != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025c, code lost:
    
        r0 = "Failed to extract a product from event data. ".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0266, code lost:
    
        com.google.android.gms.internal.gtm.zzhl.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0261, code lost:
    
        r0 = new java.lang.String("Failed to extract a product from event data. ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x026e, code lost:
    
        if (r6.containsKey("actionField") == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0270, code lost:
    
        r0 = (java.util.Map) r6.get("actionField");
        r3 = new com.google.android.gms.analytics.ecommerce.ProductAction(r5);
        r4 = r0.get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027f, code lost:
    
        if (r4 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0281, code lost:
    
        r3.setTransactionId(java.lang.String.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x028c, code lost:
    
        r4 = r0.get("affiliation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0292, code lost:
    
        if (r4 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0294, code lost:
    
        r3.setTransactionAffiliation(java.lang.String.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029b, code lost:
    
        r4 = r0.get("coupon");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a1, code lost:
    
        if (r4 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a3, code lost:
    
        r3.setTransactionCouponCode(java.lang.String.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02aa, code lost:
    
        r4 = r0.get("list");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ae, code lost:
    
        if (r4 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02b0, code lost:
    
        r3.setProductActionList(java.lang.String.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b7, code lost:
    
        r4 = r0.get("option");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bd, code lost:
    
        if (r4 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02bf, code lost:
    
        r3.setCheckoutOptions(java.lang.String.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c6, code lost:
    
        r4 = r0.get("revenue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02cc, code lost:
    
        if (r4 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ce, code lost:
    
        r3.setTransactionRevenue(zzc(r4).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d9, code lost:
    
        r4 = r0.get("tax");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02df, code lost:
    
        if (r4 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e1, code lost:
    
        r3.setTransactionTax(zzc(r4).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02ec, code lost:
    
        r4 = r0.get("shipping");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02f2, code lost:
    
        if (r4 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02f4, code lost:
    
        r3.setTransactionShipping(zzc(r4).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ff, code lost:
    
        r0 = r0.get("step");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0305, code lost:
    
        if (r0 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0307, code lost:
    
        r3.setCheckoutStep(zze(r0).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0318, code lost:
    
        r2.setProductAction(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0313, code lost:
    
        r3 = new com.google.android.gms.analytics.ecommerce.ProductAction(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0289, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x031c, code lost:
    
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x032a, code lost:
    
        if (r0.length() != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x032c, code lost:
    
        r0 = "Failed to extract a product action from event data. ".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0336, code lost:
    
        com.google.android.gms.internal.gtm.zzhl.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0331, code lost:
    
        r0 = new java.lang.String("Failed to extract a product action from event data. ");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0343 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:6:0x001c, B:8:0x0030, B:11:0x0041, B:14:0x004e, B:17:0x0056, B:20:0x005e, B:23:0x006b, B:26:0x0078, B:29:0x0081, B:30:0x008b, B:32:0x0094, B:35:0x00a1, B:37:0x00a6, B:40:0x00ad, B:42:0x00b2, B:45:0x00bb, B:48:0x00d9, B:50:0x00eb, B:51:0x00fb, B:53:0x00ff, B:55:0x0109, B:57:0x0113, B:58:0x0116, B:61:0x0124, B:62:0x012a, B:64:0x0130, B:66:0x0136, B:71:0x0145, B:73:0x0153, B:74:0x015d, B:76:0x0158, B:78:0x0161, B:81:0x0169, B:84:0x018e, B:85:0x0192, B:87:0x0198, B:89:0x019e, B:93:0x01ab, B:94:0x01b1, B:96:0x01b9, B:97:0x01bc, B:99:0x01c6, B:100:0x01c9, B:102:0x01d3, B:103:0x01d6, B:108:0x01da, B:110:0x01ea, B:111:0x01f4, B:113:0x01ef, B:115:0x01f8, B:118:0x0200, B:119:0x0207, B:120:0x020c, B:121:0x0212, B:123:0x0218, B:126:0x0224, B:128:0x0235, B:129:0x0239, B:131:0x023f, B:133:0x0245, B:138:0x024e, B:140:0x025c, B:141:0x0266, B:143:0x0261, B:145:0x026a, B:147:0x0270, B:149:0x0281, B:150:0x028c, B:152:0x0294, B:153:0x029b, B:155:0x02a3, B:156:0x02aa, B:158:0x02b0, B:159:0x02b7, B:161:0x02bf, B:162:0x02c6, B:164:0x02ce, B:165:0x02d9, B:167:0x02e1, B:168:0x02ec, B:170:0x02f4, B:171:0x02ff, B:173:0x0307, B:174:0x0318, B:176:0x0313, B:179:0x031c, B:181:0x032c, B:182:0x0336, B:183:0x0331, B:186:0x0176, B:188:0x017c, B:190:0x0339, B:195:0x00f4, B:196:0x0343, B:198:0x0349, B:199:0x0351, B:201:0x0357, B:203:0x0363, B:204:0x0369, B:206:0x036e, B:208:0x0379, B:209:0x0383, B:210:0x038b, B:212:0x0391, B:215:0x03a5, B:220:0x03af, B:224:0x03e1, B:225:0x03e5, B:227:0x03eb, B:246:0x03f7, B:229:0x03fe, B:231:0x0410, B:232:0x0417, B:233:0x041f, B:235:0x0425, B:238:0x0435, B:243:0x0443, B:244:0x0413, B:248:0x0447, B:249:0x044b, B:251:0x0451, B:253:0x03be, B:255:0x03c2, B:256:0x03c8, B:258:0x03ce, B:262:0x03d7, B:263:0x03de, B:265:0x045b, B:266:0x0462, B:267:0x037f, B:270:0x0463, B:271:0x046a, B:276:0x0084, B:277:0x007b, B:278:0x006e, B:279:0x0061, B:280:0x0059, B:281:0x0051, B:282:0x0044, B:283:0x0037), top: B:5:0x001c, inners: #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:6:0x001c, B:8:0x0030, B:11:0x0041, B:14:0x004e, B:17:0x0056, B:20:0x005e, B:23:0x006b, B:26:0x0078, B:29:0x0081, B:30:0x008b, B:32:0x0094, B:35:0x00a1, B:37:0x00a6, B:40:0x00ad, B:42:0x00b2, B:45:0x00bb, B:48:0x00d9, B:50:0x00eb, B:51:0x00fb, B:53:0x00ff, B:55:0x0109, B:57:0x0113, B:58:0x0116, B:61:0x0124, B:62:0x012a, B:64:0x0130, B:66:0x0136, B:71:0x0145, B:73:0x0153, B:74:0x015d, B:76:0x0158, B:78:0x0161, B:81:0x0169, B:84:0x018e, B:85:0x0192, B:87:0x0198, B:89:0x019e, B:93:0x01ab, B:94:0x01b1, B:96:0x01b9, B:97:0x01bc, B:99:0x01c6, B:100:0x01c9, B:102:0x01d3, B:103:0x01d6, B:108:0x01da, B:110:0x01ea, B:111:0x01f4, B:113:0x01ef, B:115:0x01f8, B:118:0x0200, B:119:0x0207, B:120:0x020c, B:121:0x0212, B:123:0x0218, B:126:0x0224, B:128:0x0235, B:129:0x0239, B:131:0x023f, B:133:0x0245, B:138:0x024e, B:140:0x025c, B:141:0x0266, B:143:0x0261, B:145:0x026a, B:147:0x0270, B:149:0x0281, B:150:0x028c, B:152:0x0294, B:153:0x029b, B:155:0x02a3, B:156:0x02aa, B:158:0x02b0, B:159:0x02b7, B:161:0x02bf, B:162:0x02c6, B:164:0x02ce, B:165:0x02d9, B:167:0x02e1, B:168:0x02ec, B:170:0x02f4, B:171:0x02ff, B:173:0x0307, B:174:0x0318, B:176:0x0313, B:179:0x031c, B:181:0x032c, B:182:0x0336, B:183:0x0331, B:186:0x0176, B:188:0x017c, B:190:0x0339, B:195:0x00f4, B:196:0x0343, B:198:0x0349, B:199:0x0351, B:201:0x0357, B:203:0x0363, B:204:0x0369, B:206:0x036e, B:208:0x0379, B:209:0x0383, B:210:0x038b, B:212:0x0391, B:215:0x03a5, B:220:0x03af, B:224:0x03e1, B:225:0x03e5, B:227:0x03eb, B:246:0x03f7, B:229:0x03fe, B:231:0x0410, B:232:0x0417, B:233:0x041f, B:235:0x0425, B:238:0x0435, B:243:0x0443, B:244:0x0413, B:248:0x0447, B:249:0x044b, B:251:0x0451, B:253:0x03be, B:255:0x03c2, B:256:0x03c8, B:258:0x03ce, B:262:0x03d7, B:263:0x03de, B:265:0x045b, B:266:0x0462, B:267:0x037f, B:270:0x0463, B:271:0x046a, B:276:0x0084, B:277:0x007b, B:278:0x006e, B:279:0x0061, B:280:0x0059, B:281:0x0051, B:282:0x0044, B:283:0x0037), top: B:5:0x001c, inners: #1, #2, #3, #4, #5 }] */
    @Override // com.google.android.gms.internal.gtm.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        zzqw<?> zzqxVar;
        zzqw<?> zzqxVar2;
        zzqw<?> zzqwVar2;
        zzqw<?> zzqwVar3;
        zzqw<?> zzqxVar3;
        zzqw<?> zzqxVar4;
        zzqw<?> zzqwVar4;
        zzqw<?> zzqxVar5;
        zzra zzraVar;
        zzqw<?> zzqwVar5;
        boolean z11;
        boolean zzg2;
        List<Map> list;
        Object zzg3;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0);
        try {
            this.zzj = zzri.zzh(this.zzi.zza().zza());
            zzqwVar = zzqwVarArr[0];
            zzqxVar = length > 1 ? zzqwVarArr[1] : new zzqx(Boolean.TRUE);
            zzqxVar2 = length > 2 ? zzqwVarArr[2] : new zzqx(Boolean.FALSE);
            zzqwVar2 = length > 3 ? zzqwVarArr[3] : zzra.zze;
            zzqwVar3 = length > 4 ? zzqwVarArr[4] : zzra.zze;
            zzqxVar3 = length > 5 ? zzqwVarArr[5] : new zzqx(Boolean.FALSE);
            zzqxVar4 = length > 6 ? zzqwVarArr[6] : new zzqx(Boolean.FALSE);
            zzqwVar4 = length > 7 ? zzqwVarArr[7] : zzra.zze;
            zzqxVar5 = length > 8 ? zzqwVarArr[8] : new zzqx(Boolean.FALSE);
            Preconditions.checkArgument(zzqwVar instanceof zzre);
            zzraVar = zzra.zze;
        } catch (Throwable th2) {
            this.zzj = null;
            throw th2;
        }
        if (zzqwVar2 != zzraVar) {
            zzqwVar5 = zzqxVar5;
            if (!(zzqwVar2 instanceof zzre)) {
                z11 = false;
                Preconditions.checkArgument(z11);
                Preconditions.checkArgument(zzqwVar3 != zzraVar || (zzqwVar3 instanceof zzre));
                Preconditions.checkArgument(zzqwVar4 != zzraVar || (zzqwVar4 instanceof zzre));
                zzqw<?> zzqwVar6 = zzqxVar3;
                Tracker zza2 = this.zzh.zza("_GTM_DEFAULT_TRACKER_");
                zza2.enableAdvertisingIdCollection(zzju.zzg(zzqwVar5));
                zzg2 = zzju.zzg(zzqwVar6);
                zzqw<?> zzqwVar7 = zzqxVar4;
                if (zzg2) {
                    if (zzju.zzg(zzqxVar)) {
                        zza2.send(zzf(zzqwVar));
                    } else if (zzju.zzg(zzqxVar2)) {
                        String str = (String) this.zzj.get("transactionId");
                        if (str == null) {
                            zzhl.zza("Cannot find transactionId in data layer.");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            try {
                                Map<String, String> zzf2 = zzf(zzqwVar);
                                zzf2.put("&t", "transaction");
                                for (Map.Entry<String, String> entry : (zzqwVar2 == zzraVar ? zzf : zzb(zzqwVar2)).entrySet()) {
                                    String str2 = (String) this.zzj.get(entry.getKey());
                                    if (str2 != null) {
                                        zzf2.put(entry.getValue(), str2);
                                    }
                                }
                                arrayList.add(zzf2);
                                Object obj = this.zzj.get("transactionProducts");
                                if (obj == null) {
                                    list = null;
                                } else {
                                    if (!(obj instanceof List)) {
                                        throw new IllegalArgumentException("transactionProducts should be of type List.");
                                    }
                                    list = (List) obj;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        if (!(it.next() instanceof Map)) {
                                            throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                                        }
                                    }
                                }
                                if (list != null) {
                                    for (Map map : list) {
                                        if (map.get(AppMeasurementSdk.ConditionalUserProperty.NAME) == null) {
                                            zzhl.zza("Unable to send transaction item hit due to missing 'name' field.");
                                            break;
                                        }
                                        Map<String, String> zzf3 = zzf(zzqwVar);
                                        zzf3.put("&t", "item");
                                        zzf3.put("&ti", str);
                                        for (Map.Entry<String, String> entry2 : (zzqwVar3 == zzra.zze ? zzg : zzb(zzqwVar3)).entrySet()) {
                                            Object obj2 = map.get(entry2.getKey());
                                            if (obj2 != null) {
                                                zzf3.put(entry2.getValue(), obj2.toString());
                                            }
                                        }
                                        arrayList.add(zzf3);
                                    }
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    zza2.send((Map) it2.next());
                                }
                            } catch (IllegalArgumentException e11) {
                                zzhl.zzb("Unable to send transaction", e11);
                            }
                        }
                    } else {
                        zzhl.zze("Ignoring unknown tag.");
                    }
                    this.zzj = null;
                    return zzra.zze;
                }
                HitBuilders.ScreenViewBuilder screenViewBuilder = new HitBuilders.ScreenViewBuilder();
                Map<String, String> zzf4 = zzf(zzqwVar);
                screenViewBuilder.setAll(zzf4);
                if (zzju.zzg(zzqwVar7)) {
                    zzg3 = this.zzj.get("ecommerce");
                } else {
                    zzri.zze(zzqwVar4);
                    zzg3 = zzri.zzg(zzqwVar4);
                }
                if (zzg3 instanceof Map) {
                    Map map2 = (Map) zzg3;
                    String str3 = zzf4.get("&cu");
                    if (str3 == null) {
                        str3 = (String) map2.get(AppsFlyerProperties.CURRENCY_CODE);
                    }
                    if (str3 != null) {
                        screenViewBuilder.set("&cu", str3);
                    }
                    Object obj3 = map2.get("impressions");
                    if (obj3 instanceof List) {
                        for (Map map3 : (List) obj3) {
                            try {
                                screenViewBuilder.addImpression(zzg(map3), (String) map3.get("list"));
                            } catch (RuntimeException e12) {
                                String valueOf = String.valueOf(e12.getMessage());
                                zzhl.zza(valueOf.length() != 0 ? "Failed to extract a product from event data. ".concat(valueOf) : new String("Failed to extract a product from event data. "));
                            }
                        }
                    }
                    List<Map> list2 = map2.containsKey("promoClick") ? (List) ((Map) map2.get("promoClick")).get("promotions") : map2.containsKey("promoView") ? (List) ((Map) map2.get("promoView")).get("promotions") : null;
                    if (list2 != null) {
                        for (Map map4 : list2) {
                            try {
                                Promotion promotion = new Promotion();
                                String str4 = (String) map4.get("id");
                                if (str4 != null) {
                                    promotion.setId(str4);
                                }
                                String str5 = (String) map4.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                                if (str5 != null) {
                                    promotion.setName(str5);
                                }
                                String str6 = (String) map4.get("creative");
                                if (str6 != null) {
                                    promotion.setCreative(str6);
                                }
                                String str7 = (String) map4.get("position");
                                if (str7 != null) {
                                    promotion.setPosition(str7);
                                }
                                screenViewBuilder.addPromotion(promotion);
                            } catch (RuntimeException e13) {
                                String valueOf2 = String.valueOf(e13.getMessage());
                                zzhl.zza(valueOf2.length() != 0 ? "Failed to extract a promotion from event data. ".concat(valueOf2) : new String("Failed to extract a promotion from event data. "));
                            }
                        }
                        if (map2.containsKey("promoClick")) {
                            screenViewBuilder.set("&promoa", "click");
                        } else {
                            screenViewBuilder.set("&promoa", "view");
                        }
                    }
                    Iterator<String> it3 = zzb.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        String next = it3.next();
                        if (map2.containsKey(next)) {
                            break;
                        }
                    }
                }
                zza2.send(screenViewBuilder.build());
                this.zzj = null;
                return zzra.zze;
                this.zzj = null;
                throw th2;
            }
        } else {
            zzqwVar5 = zzqxVar5;
        }
        z11 = true;
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVar3 != zzraVar || (zzqwVar3 instanceof zzre));
        Preconditions.checkArgument(zzqwVar4 != zzraVar || (zzqwVar4 instanceof zzre));
        zzqw<?> zzqwVar62 = zzqxVar3;
        Tracker zza22 = this.zzh.zza("_GTM_DEFAULT_TRACKER_");
        zza22.enableAdvertisingIdCollection(zzju.zzg(zzqwVar5));
        zzg2 = zzju.zzg(zzqwVar62);
        zzqw<?> zzqwVar72 = zzqxVar4;
        if (zzg2) {
        }
        this.zzj = null;
        throw th2;
    }
}
