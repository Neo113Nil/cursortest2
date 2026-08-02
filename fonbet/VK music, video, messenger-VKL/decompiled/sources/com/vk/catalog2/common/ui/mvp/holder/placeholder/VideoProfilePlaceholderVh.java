package com.vk.catalog2.common.ui.mvp.holder.placeholder;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.asu0;
import xsna.dot0;
import xsna.hg1;
import xsna.izs;
import xsna.nda;
import xsna.ndg0;
import xsna.qw40;
import xsna.rt10;
import xsna.s3q0;

/* compiled from: VideoProfilePlaceholderVh.kt */
/* loaded from: classes16.dex */
public class VideoProfilePlaceholderVh extends PlaceholderVh {
    public final dot0 t;
    public final b u;

    /* compiled from: VideoProfilePlaceholderVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public VideoProfilePlaceholderVh(com.vk.catalog2.common.ui.mvp.util.a aVar, nda ndaVar, dot0 dot0Var) {
        super(aVar, true, false, null, null, R.layout.vk_video_profile_catalog_placeholder_fullscreen, ndaVar, -1, 8);
        this.t = dot0Var;
        this.u = new b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        super.L();
        this.u.dispose();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        dot0 dot0Var = this.t;
        if (dot0Var != null) {
            hg1.e(this.u, dot0Var.b().a0(asu0.a.d()).subscribe(new qw40(new ndg0(8, this, uIBlock), 27), new rt10(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 23)));
        }
    }
}
