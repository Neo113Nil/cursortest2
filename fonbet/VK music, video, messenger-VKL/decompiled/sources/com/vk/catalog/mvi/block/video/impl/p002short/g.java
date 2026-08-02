package com.vk.catalog.mvi.block.video.impl.p002short;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.dto.common.VideoFile;
import java.util.Locale;
import xsna.g7s0;
import xsna.pls0;
import xsna.pvo0;
import xsna.r2a;
import xsna.s2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements s2a {
    public final /* synthetic */ g7s0 b;

    public /* synthetic */ g(g7s0 g7s0Var) {
        this.b = g7s0Var;
    }

    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        boolean z;
        boolean z2;
        String str;
        ShortVideoListView.State state = (ShortVideoListView.State) catalogBlockState;
        BlockId.CompositeId compositeId = state.b;
        int i = state.d;
        String str2 = state.e;
        boolean z3 = state.f;
        g7s0 g7s0Var = this.b;
        boolean o = g7s0Var.J().o();
        VideoFile videoFile = state.g;
        if (!videoFile.Z9() || g7s0Var.c(videoFile)) {
            z = o;
            z2 = false;
        } else {
            z = o;
            z2 = true;
        }
        boolean z4 = state.i;
        if (pls0.f(videoFile)) {
            str = pvo0.i(false, videoFile.k1(), false, true);
            if (str.length() > 0) {
                str = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
            }
        } else {
            str = null;
        }
        return new ShortVideoListView.e(compositeId, i, str2, z3, z, z2, z4, str);
    }
}
