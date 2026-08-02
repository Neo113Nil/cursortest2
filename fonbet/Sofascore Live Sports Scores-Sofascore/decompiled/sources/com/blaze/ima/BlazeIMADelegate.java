package com.blaze.ima;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdInfo;
import defpackage.lm5;
import defpackage.mr9;
import defpackage.rq3;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/blaze/ima/BlazeIMADelegate;", "", "Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;", "eventType", "Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;", "adInfo", "", "onIMAAdEvent", "(Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;)V", "", "errMsg", "onIMAAdError", "(Ljava/lang/String;)V", "Lcom/blaze/ima/BlazeIMAAdRequestInformation;", "requestData", "Lmr9;", "customIMASettings", "(Lcom/blaze/ima/BlazeIMAAdRequestInformation;Lrq3;)Ljava/lang/Object;", "", "additionalIMATagQueryParams", "overrideAdTagUrl", "blaze_ima_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BlazeIMADelegate {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @Nullable
        public static Object additionalIMATagQueryParams(@NotNull BlazeIMADelegate blazeIMADelegate, @NotNull BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, @NotNull rq3<? super Map<String, String>> rq3Var) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }

        @Nullable
        public static Object customIMASettings(@NotNull BlazeIMADelegate blazeIMADelegate, @NotNull BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, @NotNull rq3<? super mr9> rq3Var) {
            return null;
        }

        public static void onIMAAdError(@NotNull BlazeIMADelegate blazeIMADelegate, @NotNull String str) {
            str.getClass();
        }

        public static void onIMAAdEvent(@NotNull BlazeIMADelegate blazeIMADelegate, @NotNull BlazeIMAHandlerEventType blazeIMAHandlerEventType, @Nullable BlazeImaAdInfo blazeImaAdInfo) {
            blazeIMAHandlerEventType.getClass();
        }

        @Nullable
        public static Object overrideAdTagUrl(@NotNull BlazeIMADelegate blazeIMADelegate, @NotNull BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, @NotNull rq3<? super String> rq3Var) {
            return null;
        }
    }

    @Nullable
    Object additionalIMATagQueryParams(@NotNull BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, @NotNull rq3<? super Map<String, String>> rq3Var);

    @Nullable
    Object customIMASettings(@NotNull BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, @NotNull rq3<? super mr9> rq3Var);

    void onIMAAdError(@NotNull String errMsg);

    void onIMAAdEvent(@NotNull BlazeIMAHandlerEventType eventType, @Nullable BlazeImaAdInfo adInfo);

    @Nullable
    Object overrideAdTagUrl(@NotNull BlazeIMAAdRequestInformation blazeIMAAdRequestInformation, @NotNull rq3<? super String> rq3Var);
}
