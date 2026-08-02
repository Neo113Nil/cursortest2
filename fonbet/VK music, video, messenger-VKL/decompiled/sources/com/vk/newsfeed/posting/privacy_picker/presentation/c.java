package com.vk.newsfeed.posting.privacy_picker.presentation;

import androidx.compose.runtime.f;
import xsna.as;
import xsna.ec2;
import xsna.fwu0;
import xsna.lg90;
import xsna.s3q0;
import xsna.wq5;
import xsna.yzs;

/* compiled from: PrivacySettingsNewContentView.kt */
/* loaded from: classes4.dex */
public final class c implements wq5<String> {
    public static final c b = new c();

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void e(String str, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1859676333);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1859676333, i3, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.resolvePrivacyTypeSlot.<anonymous>.<anonymous>.<no name provided>.Content (PrivacySettingsNewContentView.kt:447)");
            }
            if (as.a((i3 & 112) | 8, yzsVar, fwu0.l(str, null, null, null, M, i3 & 14, 62), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ec2(i, 5, this, str, yzsVar);
        }
    }
}
