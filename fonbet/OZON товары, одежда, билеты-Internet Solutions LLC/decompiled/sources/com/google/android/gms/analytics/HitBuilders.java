package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.gtm.zzfs;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes9.dex */
public class HitBuilders {

    @VisibleForTesting
    @Deprecated
    public static class AppViewBuilder extends HitBuilder<AppViewBuilder> {
        public AppViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    @VisibleForTesting
    public static class ExceptionBuilder extends HitBuilder<ExceptionBuilder> {
        public ExceptionBuilder() {
            set("&t", "exception");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @RecentlyNonNull
        public ExceptionBuilder setDescription(@RecentlyNonNull String str) {
            set("&exd", str);
            return this;
        }

        @RecentlyNonNull
        public ExceptionBuilder setFatal(boolean z11) {
            set("&exf", zzfs.zzc(z11));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public static class HitBuilder<T extends HitBuilder> {
        ProductAction zza;
        private Map<String, String> zze = new HashMap();
        Map<String, List<Product>> zzb = new HashMap();
        List<Promotion> zzc = new ArrayList();
        List<Product> zzd = new ArrayList();

        protected HitBuilder() {
        }

        private final T zza(String str, String str2) {
            if (str2 != null) {
                this.zze.put(str, str2);
            }
            return this;
        }

        @RecentlyNonNull
        public T addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            if (product == null) {
                zzfa.zze("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, new ArrayList());
            }
            this.zzb.get(str).add(product);
            return this;
        }

        @RecentlyNonNull
        public T addProduct(@RecentlyNonNull Product product) {
            if (product == null) {
                zzfa.zze("product should be non-null");
                return this;
            }
            this.zzd.add(product);
            return this;
        }

        @RecentlyNonNull
        public T addPromotion(@RecentlyNonNull Promotion promotion) {
            if (promotion == null) {
                zzfa.zze("promotion should be non-null");
                return this;
            }
            this.zzc.add(promotion);
            return this;
        }

        @RecentlyNonNull
        public Map<String, String> build() {
            HashMap hashMap = new HashMap(this.zze);
            ProductAction productAction = this.zza;
            if (productAction != null) {
                hashMap.putAll(productAction.zza());
            }
            Iterator<Promotion> it = this.zzc.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                hashMap.putAll(it.next().zza(zzd.zzl(i11)));
                i11++;
            }
            Iterator<Product> it2 = this.zzd.iterator();
            int i12 = 1;
            while (it2.hasNext()) {
                hashMap.putAll(it2.next().zza(zzd.zzj(i12)));
                i12++;
            }
            int i13 = 1;
            for (Map.Entry<String, List<Product>> entry : this.zzb.entrySet()) {
                List<Product> value = entry.getValue();
                String zzg = zzd.zzg(i13);
                int i14 = 1;
                for (Product product : value) {
                    String valueOf = String.valueOf(zzg);
                    String valueOf2 = String.valueOf(zzd.zzi(i14));
                    hashMap.putAll(product.zza(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i14++;
                }
                if (!TextUtils.isEmpty(entry.getKey())) {
                    hashMap.put(String.valueOf(zzg).concat("nm"), entry.getKey());
                }
                i13++;
            }
            return hashMap;
        }

        @RecentlyNonNull
        @VisibleForTesting
        protected String get(@RecentlyNonNull String str) {
            return this.zze.get(str);
        }

        @RecentlyNonNull
        public final T set(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            if (str != null) {
                this.zze.put(str, str2);
                return this;
            }
            zzfa.zze("HitBuilder.set() called with a null paramName.");
            return this;
        }

        @RecentlyNonNull
        public final T setAll(@RecentlyNonNull Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.zze.putAll(new HashMap(map));
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            if (r15.contains("=") == false) goto L28;
         */
        @RecentlyNonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public T setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            String str2 = null;
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("?")) {
                    String[] split = str.split("[\\?]");
                    if (split.length > 1) {
                        str = split[1];
                    }
                }
                if (str.contains("%3D")) {
                    try {
                        str = URLDecoder.decode(str, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                Map<String, String> zzf = zzfs.zzf(str);
                String[] strArr = {"dclid", "utm_source", "gclid", "aclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t"};
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < 11; i11++) {
                    if (!TextUtils.isEmpty(zzf.get(strArr[i11]))) {
                        if (sb2.length() > 0) {
                            sb2.append("&");
                        }
                        sb2.append(strArr[i11]);
                        sb2.append("=");
                        sb2.append(zzf.get(strArr[i11]));
                    }
                }
                str2 = sb2.toString();
            }
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            Map<String, String> zzf2 = zzfs.zzf(str2);
            zza("&cc", zzf2.get("utm_content"));
            zza("&cm", zzf2.get("utm_medium"));
            zza("&cn", zzf2.get("utm_campaign"));
            zza("&cs", zzf2.get("utm_source"));
            zza("&ck", zzf2.get("utm_term"));
            zza("&ci", zzf2.get("utm_id"));
            zza("&anid", zzf2.get("anid"));
            zza("&gclid", zzf2.get("gclid"));
            zza("&dclid", zzf2.get("dclid"));
            zza("&aclid", zzf2.get("aclid"));
            zza("&gmob_t", zzf2.get("gmob_t"));
            return this;
        }

        @RecentlyNonNull
        public T setCustomDimension(int i11, @RecentlyNonNull String str) {
            set(zzd.zza(i11), str);
            return this;
        }

        @RecentlyNonNull
        public T setCustomMetric(int i11, float f7) {
            set(zzd.zzd(i11), Float.toString(f7));
            return this;
        }

        @RecentlyNonNull
        protected T setHitType(@RecentlyNonNull String str) {
            set("&t", str);
            return this;
        }

        @RecentlyNonNull
        public T setNewSession() {
            set("&sc", "start");
            return this;
        }

        @RecentlyNonNull
        public T setNonInteraction(boolean z11) {
            set("&ni", zzfs.zzc(z11));
            return this;
        }

        @RecentlyNonNull
        public T setProductAction(@RecentlyNonNull ProductAction productAction) {
            this.zza = productAction;
            return this;
        }

        @RecentlyNonNull
        public T setPromotionAction(@RecentlyNonNull String str) {
            this.zze.put("&promoa", str);
            return this;
        }
    }

    @VisibleForTesting
    @Deprecated
    public static class ItemBuilder extends HitBuilder<ItemBuilder> {
        public ItemBuilder() {
            set("&t", "item");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @RecentlyNonNull
        public ItemBuilder setCategory(@RecentlyNonNull String str) {
            set("&iv", str);
            return this;
        }

        @RecentlyNonNull
        public ItemBuilder setCurrencyCode(@RecentlyNonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @RecentlyNonNull
        public ItemBuilder setName(@RecentlyNonNull String str) {
            set("&in", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @RecentlyNonNull
        public ItemBuilder setPrice(double d11) {
            set("&ip", Double.toString(d11));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @RecentlyNonNull
        public ItemBuilder setQuantity(long j11) {
            set("&iq", Long.toString(j11));
            return this;
        }

        @RecentlyNonNull
        public ItemBuilder setSku(@RecentlyNonNull String str) {
            set("&ic", str);
            return this;
        }

        @RecentlyNonNull
        public ItemBuilder setTransactionId(@RecentlyNonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    @VisibleForTesting
    public static class ScreenViewBuilder extends HitBuilder<ScreenViewBuilder> {
        public ScreenViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    @VisibleForTesting
    public static class SocialBuilder extends HitBuilder<SocialBuilder> {
        public SocialBuilder() {
            set("&t", "social");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @RecentlyNonNull
        public SocialBuilder setAction(@RecentlyNonNull String str) {
            set("&sa", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @RecentlyNonNull
        public SocialBuilder setNetwork(@RecentlyNonNull String str) {
            set("&sn", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @RecentlyNonNull
        public SocialBuilder setTarget(@RecentlyNonNull String str) {
            set("&st", str);
            return this;
        }
    }

    @VisibleForTesting
    @Deprecated
    public static class TransactionBuilder extends HitBuilder<TransactionBuilder> {
        public TransactionBuilder() {
            set("&t", "transaction");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @RecentlyNonNull
        public TransactionBuilder setAffiliation(@RecentlyNonNull String str) {
            set("&ta", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @RecentlyNonNull
        public TransactionBuilder setCurrencyCode(@RecentlyNonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @RecentlyNonNull
        public TransactionBuilder setRevenue(double d11) {
            set("&tr", Double.toString(d11));
            return this;
        }

        @RecentlyNonNull
        public TransactionBuilder setShipping(double d11) {
            set("&ts", Double.toString(d11));
            return this;
        }

        @RecentlyNonNull
        public TransactionBuilder setTax(double d11) {
            set("&tt", Double.toString(d11));
            return this;
        }

        @RecentlyNonNull
        public TransactionBuilder setTransactionId(@RecentlyNonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    @VisibleForTesting
    public static class EventBuilder extends HitBuilder<EventBuilder> {
        public EventBuilder() {
            set("&t", "event");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @RecentlyNonNull
        public EventBuilder setAction(@RecentlyNonNull String str) {
            set("&ea", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @RecentlyNonNull
        public EventBuilder setCategory(@RecentlyNonNull String str) {
            set("&ec", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @RecentlyNonNull
        public EventBuilder setLabel(@RecentlyNonNull String str) {
            set("&el", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ EventBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @RecentlyNonNull
        public EventBuilder setValue(long j11) {
            set("&ev", Long.toString(j11));
            return this;
        }

        public EventBuilder(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this();
            setCategory(str);
            setAction(str2);
        }
    }

    @VisibleForTesting
    public static class TimingBuilder extends HitBuilder<TimingBuilder> {
        public TimingBuilder() {
            set("&t", "timing");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addImpression(@RecentlyNonNull Product product, @RecentlyNonNull String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addProduct(@RecentlyNonNull Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addPromotion(@RecentlyNonNull Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCampaignParamsFromUrl(@RecentlyNonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @RecentlyNonNull
        public TimingBuilder setCategory(@RecentlyNonNull String str) {
            set("&utc", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCustomDimension(int i11, @RecentlyNonNull String str) {
            super.setCustomDimension(i11, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCustomMetric(int i11, float f7) {
            super.setCustomMetric(i11, f7);
            return this;
        }

        @RecentlyNonNull
        public TimingBuilder setLabel(@RecentlyNonNull String str) {
            set("&utl", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setNonInteraction(boolean z11) {
            super.setNonInteraction(z11);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setProductAction(@RecentlyNonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setPromotionAction(@RecentlyNonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @RecentlyNonNull
        public TimingBuilder setValue(long j11) {
            set("&utt", Long.toString(j11));
            return this;
        }

        @RecentlyNonNull
        public TimingBuilder setVariable(@RecentlyNonNull String str) {
            set("&utv", str);
            return this;
        }

        public TimingBuilder(@RecentlyNonNull String str, @RecentlyNonNull String str2, long j11) {
            this();
            setVariable(str2);
            setValue(j11);
            setCategory(str);
        }
    }
}
