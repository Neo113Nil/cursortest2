package com.vk.catalog2.feature.music.holders.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.music.ui.common.MusicErrorScrollableView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.e3m;
import xsna.ee;
import xsna.f4m;
import xsna.gxp;
import xsna.gzs;
import xsna.iah0;
import xsna.s3q0;

/* compiled from: MusicCatalogRecyclerPaginatedView.kt */
/* loaded from: classes16.dex */
public final class MusicCatalogRecyclerPaginatedView extends CatalogRecyclerPaginatedView {
    public gzs<s3q0> R;
    public gzs<s3q0> S;
    public MusicErrorScrollableView T;
    public int U;

    /* compiled from: ViewExt.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ MusicCatalogRecyclerPaginatedView e;
        public final /* synthetic */ Context f;

        public a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, MusicCatalogRecyclerPaginatedView musicCatalogRecyclerPaginatedView, Context context) {
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = musicCatalogRecyclerPaginatedView;
            this.f = context;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            MusicCatalogRecyclerPaginatedView musicCatalogRecyclerPaginatedView = MusicCatalogRecyclerPaginatedView.this;
            int measuredWidth = musicCatalogRecyclerPaginatedView.getMeasuredWidth();
            int measuredHeight = musicCatalogRecyclerPaginatedView.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                MusicCatalogRecyclerPaginatedView musicCatalogRecyclerPaginatedView2 = this.e;
                View findViewById = musicCatalogRecyclerPaginatedView2.findViewById(R.id.error_content);
                int i2 = measuredHeight < (findViewById != null ? findViewById.getHeight() : 0) ? musicCatalogRecyclerPaginatedView2.U : 0;
                int i3 = iah0.s(this.f) ? musicCatalogRecyclerPaginatedView2.U : 0;
                MusicErrorScrollableView musicErrorScrollableView = musicCatalogRecyclerPaginatedView2.T;
                if (musicErrorScrollableView != null) {
                    View findViewById2 = musicErrorScrollableView.findViewById(R.id.error_content);
                    f4m.y(i2, findViewById2);
                    f4m.v(i3, findViewById2);
                }
            }
            return s3q0.a;
        }
    }

    public MusicCatalogRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = e3m.a(R.dimen.catalog_music_search_query_height, getContext());
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        Context context2;
        if (context != null) {
            MusicErrorScrollableView musicErrorScrollableView = new MusicErrorScrollableView(context, attributeSet, 0);
            musicErrorScrollableView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
            this.T = musicErrorScrollableView;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = getMeasuredHeight();
            context2 = context;
            f4m.a(this, new a(ref$IntRef, ref$IntRef2, this, context2));
            MusicErrorScrollableView musicErrorScrollableView2 = this.T;
            if (musicErrorScrollableView2 != null) {
                return musicErrorScrollableView2;
            }
        } else {
            context2 = context;
        }
        return super.d(context2, attributeSet);
    }

    @Override // com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        super.fj(th, gxpVar);
        MusicErrorScrollableView musicErrorScrollableView = this.T;
        if (musicErrorScrollableView != null) {
            musicErrorScrollableView.d(this.R, this.S);
        }
    }

    public final gzs<s3q0> getOnActionClick() {
        return this.S;
    }

    public final gzs<s3q0> getOnRetryClick() {
        return this.R;
    }

    public final void setOnActionClick(gzs<s3q0> gzsVar) {
        this.S = gzsVar;
    }

    public final void setOnRetryClick(gzs<s3q0> gzsVar) {
        this.R = gzsVar;
    }
}
