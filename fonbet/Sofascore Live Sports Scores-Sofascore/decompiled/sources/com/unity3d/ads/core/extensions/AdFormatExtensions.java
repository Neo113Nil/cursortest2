package com.unity3d.ads.core.extensions;

import com.unity3d.ads.AdFormat;
import defpackage.zzl;
import gatewayprotocol.v1.AdFormatOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProtoAdFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "Lcom/unity3d/ads/AdFormat;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdFormatExtensions {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(@NotNull AdFormat adFormat) {
        adFormat.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i == 1) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        if (i == 2) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i == 3) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i == 4) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
        }
        zzl.b();
        return null;
    }
}
