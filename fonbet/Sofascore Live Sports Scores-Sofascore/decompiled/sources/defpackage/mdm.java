package defpackage;

import com.blaze.blazesdk.widgets.models.RecommendationsDataSourceRemoteDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class mdm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RecommendationsDataSourceRemoteDto.values().length];
        try {
            iArr[RecommendationsDataSourceRemoteDto.TRENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RecommendationsDataSourceRemoteDto.FOR_YOU.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
