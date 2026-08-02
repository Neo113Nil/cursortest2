package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final c f16154e = new c(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z5 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        int length = codecInfos.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            String name = codecInfos[i5].getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.A(name, "c2.exynos", false)) {
                z5 = true;
                break;
            }
            i5++;
        }
        return Boolean.valueOf(z5);
    }
}
