package com.facebook.appevents.integrity;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.cordova.networkinformation.NetworkManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MACARuleMatchingManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/facebook/appevents/integrity/MACARuleMatchingManager;", "", "()V", "MACARules", "Lorg/json/JSONArray;", "enabled", "", "keys", "", "", "[Ljava/lang/String;", a.j, "", "generateInfo", "params", "Landroid/os/Bundle;", "event", "getKey", "logic", "Lorg/json/JSONObject;", "getMatchPropertyIDs", "getStringArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonArray", "isMatchCCRule", "ruleString", "data", "loadMACARules", "processParameters", "removeGeneratedInfo", "stringComparison", RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_VARIABLE, "values", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MACARuleMatchingManager {
    private static JSONArray MACARules;
    private static boolean enabled;
    public static final MACARuleMatchingManager INSTANCE = new MACARuleMatchingManager();
    private static String[] keys = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    @JvmStatic
    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            INSTANCE.loadMACARules();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    private final void loadMACARules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            MACARules = queryAppSettings.getMACARuleMatchingSetting();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    public static final String getKey(JSONObject logic) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> keys2 = logic.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0252 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0253 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b2 A[Catch: all -> 0x03f7, TryCatch #0 {all -> 0x03f7, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:31:0x0086, B:33:0x008c, B:35:0x0097, B:37:0x00a5, B:38:0x00aa, B:39:0x00ab, B:40:0x00b0, B:41:0x00b1, B:44:0x00bb, B:48:0x00cb, B:53:0x0261, B:55:0x0267, B:58:0x0271, B:59:0x0275, B:61:0x027b, B:63:0x0283, B:65:0x0292, B:71:0x02a2, B:72:0x02a7, B:74:0x02a8, B:75:0x02ad, B:78:0x00d5, B:81:0x00df, B:83:0x00e5, B:85:0x00f2, B:87:0x0102, B:88:0x0107, B:89:0x0108, B:90:0x010d, B:91:0x010e, B:96:0x02bc, B:98:0x02c2, B:101:0x02cc, B:102:0x02d0, B:104:0x02d6, B:106:0x02de, B:108:0x02ed, B:114:0x02fd, B:115:0x0302, B:117:0x0303, B:118:0x0308, B:121:0x0118, B:124:0x0122, B:126:0x0128, B:128:0x0133, B:130:0x0141, B:131:0x0146, B:132:0x0147, B:133:0x014c, B:134:0x014d, B:137:0x01fd, B:141:0x0157, B:144:0x01e1, B:148:0x0161, B:151:0x01bb, B:155:0x016b, B:158:0x0175, B:161:0x0242, B:165:0x017f, B:168:0x0189, B:173:0x03b2, B:175:0x0193, B:178:0x0213, B:182:0x019d, B:185:0x01a7, B:188:0x022f, B:190:0x01b1, B:193:0x01cd, B:196:0x01d7, B:199:0x01f3, B:202:0x0209, B:205:0x0225, B:208:0x0238, B:211:0x0254, B:214:0x02af, B:217:0x030a, B:220:0x0314, B:222:0x031a, B:224:0x0325, B:228:0x0336, B:229:0x033b, B:230:0x033c, B:231:0x0341, B:232:0x0342, B:235:0x034c, B:237:0x0359, B:242:0x039d, B:244:0x0363, B:247:0x036e, B:249:0x037e, B:252:0x0388, B:254:0x0391, B:257:0x03a6, B:260:0x03bb, B:263:0x03c4, B:265:0x03ca, B:267:0x03d7, B:271:0x03ea, B:272:0x03ef, B:273:0x03f0, B:274:0x03f5, B:276:0x0054), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0224 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x039c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x039d A[Catch: all -> 0x03f7, TryCatch #0 {all -> 0x03f7, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:31:0x0086, B:33:0x008c, B:35:0x0097, B:37:0x00a5, B:38:0x00aa, B:39:0x00ab, B:40:0x00b0, B:41:0x00b1, B:44:0x00bb, B:48:0x00cb, B:53:0x0261, B:55:0x0267, B:58:0x0271, B:59:0x0275, B:61:0x027b, B:63:0x0283, B:65:0x0292, B:71:0x02a2, B:72:0x02a7, B:74:0x02a8, B:75:0x02ad, B:78:0x00d5, B:81:0x00df, B:83:0x00e5, B:85:0x00f2, B:87:0x0102, B:88:0x0107, B:89:0x0108, B:90:0x010d, B:91:0x010e, B:96:0x02bc, B:98:0x02c2, B:101:0x02cc, B:102:0x02d0, B:104:0x02d6, B:106:0x02de, B:108:0x02ed, B:114:0x02fd, B:115:0x0302, B:117:0x0303, B:118:0x0308, B:121:0x0118, B:124:0x0122, B:126:0x0128, B:128:0x0133, B:130:0x0141, B:131:0x0146, B:132:0x0147, B:133:0x014c, B:134:0x014d, B:137:0x01fd, B:141:0x0157, B:144:0x01e1, B:148:0x0161, B:151:0x01bb, B:155:0x016b, B:158:0x0175, B:161:0x0242, B:165:0x017f, B:168:0x0189, B:173:0x03b2, B:175:0x0193, B:178:0x0213, B:182:0x019d, B:185:0x01a7, B:188:0x022f, B:190:0x01b1, B:193:0x01cd, B:196:0x01d7, B:199:0x01f3, B:202:0x0209, B:205:0x0225, B:208:0x0238, B:211:0x0254, B:214:0x02af, B:217:0x030a, B:220:0x0314, B:222:0x031a, B:224:0x0325, B:228:0x0336, B:229:0x033b, B:230:0x033c, B:231:0x0341, B:232:0x0342, B:235:0x034c, B:237:0x0359, B:242:0x039d, B:244:0x0363, B:247:0x036e, B:249:0x037e, B:252:0x0388, B:254:0x0391, B:257:0x03a6, B:260:0x03bb, B:263:0x03c4, B:265:0x03ca, B:267:0x03d7, B:271:0x03ea, B:272:0x03ef, B:273:0x03f0, B:274:0x03f5, B:276:0x0054), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0260 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0261 A[Catch: all -> 0x03f7, TryCatch #0 {all -> 0x03f7, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:31:0x0086, B:33:0x008c, B:35:0x0097, B:37:0x00a5, B:38:0x00aa, B:39:0x00ab, B:40:0x00b0, B:41:0x00b1, B:44:0x00bb, B:48:0x00cb, B:53:0x0261, B:55:0x0267, B:58:0x0271, B:59:0x0275, B:61:0x027b, B:63:0x0283, B:65:0x0292, B:71:0x02a2, B:72:0x02a7, B:74:0x02a8, B:75:0x02ad, B:78:0x00d5, B:81:0x00df, B:83:0x00e5, B:85:0x00f2, B:87:0x0102, B:88:0x0107, B:89:0x0108, B:90:0x010d, B:91:0x010e, B:96:0x02bc, B:98:0x02c2, B:101:0x02cc, B:102:0x02d0, B:104:0x02d6, B:106:0x02de, B:108:0x02ed, B:114:0x02fd, B:115:0x0302, B:117:0x0303, B:118:0x0308, B:121:0x0118, B:124:0x0122, B:126:0x0128, B:128:0x0133, B:130:0x0141, B:131:0x0146, B:132:0x0147, B:133:0x014c, B:134:0x014d, B:137:0x01fd, B:141:0x0157, B:144:0x01e1, B:148:0x0161, B:151:0x01bb, B:155:0x016b, B:158:0x0175, B:161:0x0242, B:165:0x017f, B:168:0x0189, B:173:0x03b2, B:175:0x0193, B:178:0x0213, B:182:0x019d, B:185:0x01a7, B:188:0x022f, B:190:0x01b1, B:193:0x01cd, B:196:0x01d7, B:199:0x01f3, B:202:0x0209, B:205:0x0225, B:208:0x0238, B:211:0x0254, B:214:0x02af, B:217:0x030a, B:220:0x0314, B:222:0x031a, B:224:0x0325, B:228:0x0336, B:229:0x033b, B:230:0x033c, B:231:0x0341, B:232:0x0342, B:235:0x034c, B:237:0x0359, B:242:0x039d, B:244:0x0363, B:247:0x036e, B:249:0x037e, B:252:0x0388, B:254:0x0391, B:257:0x03a6, B:260:0x03bb, B:263:0x03c4, B:265:0x03ca, B:267:0x03d7, B:271:0x03ea, B:272:0x03ef, B:273:0x03f0, B:274:0x03f5, B:276:0x0054), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc A[Catch: all -> 0x03f7, TryCatch #0 {all -> 0x03f7, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:31:0x0086, B:33:0x008c, B:35:0x0097, B:37:0x00a5, B:38:0x00aa, B:39:0x00ab, B:40:0x00b0, B:41:0x00b1, B:44:0x00bb, B:48:0x00cb, B:53:0x0261, B:55:0x0267, B:58:0x0271, B:59:0x0275, B:61:0x027b, B:63:0x0283, B:65:0x0292, B:71:0x02a2, B:72:0x02a7, B:74:0x02a8, B:75:0x02ad, B:78:0x00d5, B:81:0x00df, B:83:0x00e5, B:85:0x00f2, B:87:0x0102, B:88:0x0107, B:89:0x0108, B:90:0x010d, B:91:0x010e, B:96:0x02bc, B:98:0x02c2, B:101:0x02cc, B:102:0x02d0, B:104:0x02d6, B:106:0x02de, B:108:0x02ed, B:114:0x02fd, B:115:0x0302, B:117:0x0303, B:118:0x0308, B:121:0x0118, B:124:0x0122, B:126:0x0128, B:128:0x0133, B:130:0x0141, B:131:0x0146, B:132:0x0147, B:133:0x014c, B:134:0x014d, B:137:0x01fd, B:141:0x0157, B:144:0x01e1, B:148:0x0161, B:151:0x01bb, B:155:0x016b, B:158:0x0175, B:161:0x0242, B:165:0x017f, B:168:0x0189, B:173:0x03b2, B:175:0x0193, B:178:0x0213, B:182:0x019d, B:185:0x01a7, B:188:0x022f, B:190:0x01b1, B:193:0x01cd, B:196:0x01d7, B:199:0x01f3, B:202:0x0209, B:205:0x0225, B:208:0x0238, B:211:0x0254, B:214:0x02af, B:217:0x030a, B:220:0x0314, B:222:0x031a, B:224:0x0325, B:228:0x0336, B:229:0x033b, B:230:0x033c, B:231:0x0341, B:232:0x0342, B:235:0x034c, B:237:0x0359, B:242:0x039d, B:244:0x0363, B:247:0x036e, B:249:0x037e, B:252:0x0388, B:254:0x0391, B:257:0x03a6, B:260:0x03bb, B:263:0x03c4, B:265:0x03ca, B:267:0x03d7, B:271:0x03ea, B:272:0x03ef, B:273:0x03f0, B:274:0x03f5, B:276:0x0054), top: B:5:0x000a }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean stringComparison(String variable, JSONObject values, Bundle data) {
        Object obj;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(values, "values");
            String key = getKey(values);
            if (key == null) {
                return false;
            }
            String obj2 = values.get(key).toString();
            ArrayList<String> stringArrayList = getStringArrayList(values.optJSONArray(key));
            Boolean bool = null;
            if (Intrinsics.areEqual(key, "exists")) {
                if (data != null) {
                    bool = Boolean.valueOf(data.containsKey(variable));
                }
                return Intrinsics.areEqual(bool, Boolean.valueOf(Boolean.parseBoolean(obj2)));
            }
            if (data == null) {
                obj = null;
            } else {
                String lowerCase = variable.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                obj = data.get(lowerCase);
            }
            if (obj == null) {
                obj = data == null ? null : data.get(variable);
                if (obj == null) {
                    return false;
                }
            }
            switch (key.hashCode()) {
                case -1729128927:
                    if (!key.equals("i_not_contains")) {
                        return false;
                    }
                    String obj3 = obj.toString();
                    if (obj3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase2 = obj3.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    String str = lowerCase2;
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase3 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return !StringsKt.contains$default((CharSequence) str, (CharSequence) lowerCase3, false, 2, (Object) null);
                case -1179774633:
                    if (!key.equals("is_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -1039699439:
                    if (!key.equals("not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -969266188:
                    if (key.equals("starts_with")) {
                        return StringsKt.startsWith$default(obj.toString(), obj2, false, 2, (Object) null);
                    }
                    return false;
                case -966353971:
                    if (key.equals("regex_match")) {
                        return new Regex(obj2).matches(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!key.equals("is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case -567445985:
                    if (key.equals("contains")) {
                        return StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null);
                    }
                    return false;
                case -327990090:
                    if (!key.equals("i_str_neq")) {
                        return false;
                    }
                    String obj4 = obj.toString();
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase4 = obj4.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase5 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return !Intrinsics.areEqual(lowerCase4, lowerCase5);
                case -159812115:
                    if (!key.equals("i_is_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    ArrayList<String> arrayList = stringArrayList;
                    if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                        return false;
                    }
                    for (String str2 : arrayList) {
                        if (str2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase6 = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        String obj5 = obj.toString();
                        if (obj5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase7 = obj5.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase7, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase6, lowerCase7)) {
                            return true;
                        }
                    }
                    return false;
                case -92753547:
                    if (!key.equals("i_str_not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    ArrayList<String> arrayList2 = stringArrayList;
                    if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                        return true;
                    }
                    for (String str3 : arrayList2) {
                        if (str3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase8 = str3.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase8, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        String obj6 = obj.toString();
                        if (obj6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase9 = obj6.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase9, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase8, lowerCase9)) {
                            return false;
                        }
                    }
                    return true;
                case 60:
                    if (!key.equals("<")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2);
                case 61:
                    if (!key.equals("=")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 62:
                    if (!key.equals(">")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2);
                case 1084:
                    if (!key.equals("!=")) {
                        return false;
                    }
                    return !Intrinsics.areEqual(obj.toString(), obj2);
                case 1921:
                    if (!key.equals("<=")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2);
                case 1952:
                    if (!key.equals("==")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 1983:
                    if (!key.equals(">=")) {
                        return false;
                    }
                    return Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2);
                case 3244:
                    if (!key.equals("eq")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 3294:
                    if (!key.equals(UserDataStore.GENDER)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3309:
                    if (!key.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3365:
                    if (!key.equals(ScarConstants.IN_SIGNAL_KEY)) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 3449:
                    if (!key.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3464:
                    if (!key.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                    }
                    break;
                case 3511:
                    if (!key.equals("ne")) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                    break;
                case 102680:
                    if (!key.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                    }
                    break;
                case 107485:
                    if (!key.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                    }
                    break;
                case 108954:
                    if (!key.equals("neq")) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                    break;
                case 127966736:
                    if (!key.equals("i_str_eq")) {
                        return false;
                    }
                    String obj7 = obj.toString();
                    if (obj7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase10 = obj7.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase10, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase11 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase11, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return Intrinsics.areEqual(lowerCase10, lowerCase11);
                case 127966857:
                    if (!key.equals("i_str_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 363990325:
                    if (!key.equals("i_contains")) {
                        return false;
                    }
                    String obj8 = obj.toString();
                    if (obj8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase12 = obj8.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase12, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    String str4 = lowerCase12;
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase13 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase13, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.contains$default((CharSequence) str4, (CharSequence) lowerCase13, false, 2, (Object) null);
                case 1091487233:
                    if (!key.equals("i_is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 1918401035:
                    return key.equals("not_contains") && !StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null);
                case 1961112862:
                    if (!key.equals("i_starts_with")) {
                        return false;
                    }
                    String obj9 = obj.toString();
                    if (obj9 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase14 = obj9.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase14, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase15 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase15, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.startsWith$default(lowerCase14, lowerCase15, false, 2, (Object) null);
                default:
                    return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final ArrayList<String> getStringArrayList(JSONArray jsonArray) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) || jsonArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jsonArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(jsonArray.get(i).toString());
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isMatchCCRule(String ruleString, Bundle data) {
        int length;
        if (!CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) && ruleString != null && data != null) {
            try {
                JSONObject jSONObject = new JSONObject(ruleString);
                String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                Object obj = jSONObject.get(key);
                int hashCode = key.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && key.equals("not")) {
                            return !isMatchCCRule(obj.toString(), data);
                        }
                    } else if (key.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (!isMatchCCRule(jSONArray.get(i).toString(), data)) {
                                    return false;
                                }
                                if (i2 >= length2) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (isMatchCCRule(jSONArray2.get(i3).toString(), data)) {
                                return true;
                            }
                            if (i4 >= length) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, data);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            }
        }
        return false;
    }

    @JvmStatic
    public static final String getMatchPropertyIDs(Bundle params) {
        String optString;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return "[]";
            }
            Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = MACARules;
            if (jSONArray2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    String optString2 = jSONArray2.optString(i);
                    if (optString2 != null) {
                        JSONObject jSONObject = new JSONObject(optString2);
                        long optLong = jSONObject.optLong("id");
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && isMatchCCRule(optString, params)) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    @JvmStatic
    public static final void processParameters(Bundle params, String event) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!enabled || params == null) {
                return;
            }
            try {
                generateInfo(params, event);
                params.putString("_audiencePropertyIds", getMatchPropertyIDs(params));
                params.putString("cs_maca", "1");
                removeGeneratedInfo(params);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:6:0x000d, B:10:0x0033, B:13:0x004e, B:16:0x0064, B:19:0x007a, B:22:0x0094, B:26:0x0047, B:29:0x002c), top: B:5:0x000d }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void generateInfo(Bundle params, String event) {
        String language;
        Locale locale;
        String country;
        String versionName;
        String str;
        String versionName2;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString("event", event);
            StringBuilder sb = new StringBuilder();
            Locale locale2 = Utility.INSTANCE.getLocale();
            String str2 = "";
            if (locale2 != null) {
                language = locale2.getLanguage();
                if (language == null) {
                }
                StringBuilder append = sb.append(language).append('_');
                locale = Utility.INSTANCE.getLocale();
                if (locale != null) {
                    country = locale.getCountry();
                    if (country != null) {
                    }
                    params.putString("_locale", append.append(country).toString());
                    versionName = Utility.INSTANCE.getVersionName();
                    if (versionName == null) {
                        versionName = "";
                    }
                    params.putString("_appVersion", versionName);
                    params.putString("_deviceOS", "ANDROID");
                    params.putString("_platform", NetworkManager.MOBILE);
                    str = Build.MODEL;
                    if (str == null) {
                        str = "";
                    }
                    params.putString("_deviceModel", str);
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    params.putString("_nativeAppID", FacebookSdk.getApplicationId());
                    versionName2 = Utility.INSTANCE.getVersionName();
                    if (versionName2 != null) {
                        str2 = versionName2;
                    }
                    params.putString("_nativeAppShortVersion", str2);
                    params.putString("_timezone", Utility.INSTANCE.getDeviceTimeZoneName());
                    params.putString("_carrier", Utility.INSTANCE.getCarrierName());
                    params.putString("_deviceOSTypeName", "ANDROID");
                    params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                    params.putLong("_remainingDiskGB", Utility.INSTANCE.getAvailableExternalStorageGB());
                }
                country = "";
                params.putString("_locale", append.append(country).toString());
                versionName = Utility.INSTANCE.getVersionName();
                if (versionName == null) {
                }
                params.putString("_appVersion", versionName);
                params.putString("_deviceOS", "ANDROID");
                params.putString("_platform", NetworkManager.MOBILE);
                str = Build.MODEL;
                if (str == null) {
                }
                params.putString("_deviceModel", str);
                FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
                params.putString("_nativeAppID", FacebookSdk.getApplicationId());
                versionName2 = Utility.INSTANCE.getVersionName();
                if (versionName2 != null) {
                }
                params.putString("_nativeAppShortVersion", str2);
                params.putString("_timezone", Utility.INSTANCE.getDeviceTimeZoneName());
                params.putString("_carrier", Utility.INSTANCE.getCarrierName());
                params.putString("_deviceOSTypeName", "ANDROID");
                params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                params.putLong("_remainingDiskGB", Utility.INSTANCE.getAvailableExternalStorageGB());
            }
            language = "";
            StringBuilder append2 = sb.append(language).append('_');
            locale = Utility.INSTANCE.getLocale();
            if (locale != null) {
            }
            country = "";
            params.putString("_locale", append2.append(country).toString());
            versionName = Utility.INSTANCE.getVersionName();
            if (versionName == null) {
            }
            params.putString("_appVersion", versionName);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", NetworkManager.MOBILE);
            str = Build.MODEL;
            if (str == null) {
            }
            params.putString("_deviceModel", str);
            FacebookSdk facebookSdk22 = FacebookSdk.INSTANCE;
            params.putString("_nativeAppID", FacebookSdk.getApplicationId());
            versionName2 = Utility.INSTANCE.getVersionName();
            if (versionName2 != null) {
            }
            params.putString("_nativeAppShortVersion", str2);
            params.putString("_timezone", Utility.INSTANCE.getDeviceTimeZoneName());
            params.putString("_carrier", Utility.INSTANCE.getCarrierName());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", Utility.INSTANCE.getAvailableExternalStorageGB());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    @JvmStatic
    public static final void removeGeneratedInfo(Bundle params) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            String[] strArr = keys;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                params.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }
}
