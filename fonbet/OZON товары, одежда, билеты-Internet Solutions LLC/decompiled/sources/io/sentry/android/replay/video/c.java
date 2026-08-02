package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f67700b = new c(0);

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z11 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        int length = codecInfos.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            String name = codecInfos[i11].getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (h.t(name, "c2.exynos", false)) {
                z11 = true;
                break;
            }
            i11++;
        }
        return Boolean.valueOf(z11);
    }
}
