package com.vk.catalog.mvi.block.video.impl.p002short;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vkontakte.android.R;
import xsna.g7s0;
import xsna.kqu0;
import xsna.mno0;
import xsna.nmc;
import xsna.pco;
import xsna.pls0;
import xsna.q020;
import xsna.qwe;
import xsna.r2a;
import xsna.rmw;
import xsna.s2a;
import xsna.tlo0;
import xsna.w7d;
import xsna.xpm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b implements s2a {
    public final /* synthetic */ g7s0 b;
    public final /* synthetic */ qwe c;

    public /* synthetic */ b(g7s0 g7s0Var, qwe qweVar) {
        this.b = g7s0Var;
        this.c = qweVar;
    }

    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        PreviewViewState previewViewState;
        ClipListView.ClipListState clipListState = (ClipListView.ClipListState) catalogBlockState;
        boolean z = clipListState.f;
        String str = clipListState.d;
        VideoFile videoFile = clipListState.e;
        g7s0 g7s0Var = this.b;
        PreviewViewState.n nVar = g7s0Var.J().o() ? new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_more_vertical_24), null, null, VkColorToken.IconContrast, 6) : null;
        if (videoFile.Z9() && !g7s0Var.c(videoFile)) {
            previewViewState = new PreviewViewState(new q020(str != null ? new rmw.h(str) : null, null, null, null, new pco(kqu0.e), null, false, 478), null, null, nVar, null, new PreviewViewState.q(new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_block_48), null, null, null, null, 30)), 0.5625f, 246);
        } else if (pls0.f(videoFile)) {
            previewViewState = new PreviewViewState(new q020(str != null ? new rmw.h(str) : null, null, null, null, new pco(kqu0.e), null, false, 478), null, null, nVar, null, new PreviewViewState.q(new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_clock_outline_24), new mno0.i(ClipListView.a(videoFile.k1())), null, null, null, 28)), 0.5625f, 246);
        } else if (this.c.d(videoFile)) {
            previewViewState = new PreviewViewState(new q020(str != null ? new rmw.h(str) : null, null, null, null, new pco(kqu0.e), null, false, 478), null, null, nVar, null, new PreviewViewState.q(new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_users_outline_28), new mno0.g(R.string.subscribers_only), null, null, null, 28)), 0.5625f, 246);
        } else {
            rmw.h hVar = str != null ? new rmw.h(str) : null;
            tlo0.a aVar = tlo0.Companion;
            String a = xpm0.a(videoFile.L8());
            aVar.getClass();
            previewViewState = new PreviewViewState(new q020(hVar, null, null, null, new pco(kqu0.e), null, true, 350), null, null, nVar, z ? new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_pin_16), null, null, VkColorToken.IconContrast, 6) : null, new PreviewViewState.i(new w7d(new tlo0.h(a))), 0.5625f, 230);
        }
        return new ClipListView.c(clipListState.b, pls0.f(videoFile) ? ClipListView.a(videoFile.k1()) : null, z, new nmc(previewViewState));
    }
}
