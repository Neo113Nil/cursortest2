package com.vk.video.playlist.playlistscreen.catalog;

import ru.ok.android.api.core.ApiInvocationException;
import xsna.a8a;
import xsna.ckk;
import xsna.i3;
import xsna.izs;
import xsna.kai;
import xsna.q2a;
import xsna.q630;
import xsna.s3q0;
import xsna.ziv0;

/* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
/* loaded from: classes6.dex */
public final class k extends q2a<n, j> {
    @Override // xsna.q2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(a8a a8aVar, n nVar, izs<? super j, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(755973859);
        if ((i & 48) == 0) {
            i2 = (M.J(nVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(755973859, i2, -1, "com.vk.video.playlist.playlistscreen.catalog.PlaylistHorizontalFiltersWithScrollView.BlockView.ContentImpl (PlaylistHorizontalFiltersWithScrollView.kt:125)");
            }
            aVar2 = M;
            ziv0.b(nVar.d, kai.c(386566685, new i3(nVar, izsVar, 2), M), q630Var, 0L, false, null, null, null, false, aVar2, ((i2 >> 3) & 896) | 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ckk(this, a8aVar, nVar, izsVar, q630Var, i);
        }
    }
}
