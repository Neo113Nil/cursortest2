package com.vk.clips.tool.view.viewer.feed.list.nps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.w8i;
import xsna.yl70;

/* compiled from: LazyNpsOverlay.kt */
/* loaded from: classes17.dex */
public final class LazyNpsOverlay extends FrameLayout implements w8i {
    public static final /* synthetic */ int c = 0;
    public c b;

    /* compiled from: LazyNpsOverlay.kt */
    public final class b implements c {
        public yl70.b a;

        public b() {
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsOverlay.c
        public final void a(yl70.b bVar) {
            this.a = bVar;
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsOverlay.c
        public final void setVisibility(int i) {
            if (i != 8) {
                int i2 = LazyNpsOverlay.c;
                LazyNpsOverlay lazyNpsOverlay = LazyNpsOverlay.this;
                yl70 yl70Var = new yl70(lazyNpsOverlay.getContext());
                yl70Var.setId(R.id.clips_inline_nps_overlay);
                lazyNpsOverlay.addView(yl70Var);
                a aVar = new a(lazyNpsOverlay);
                lazyNpsOverlay.b = aVar;
                yl70.b bVar = this.a;
                if (bVar != null) {
                    aVar.a(bVar);
                }
            }
        }
    }

    public LazyNpsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new b();
    }

    public final void setState(yl70.b bVar) {
        this.b.a(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.b.setVisibility(i);
    }

    /* compiled from: LazyNpsOverlay.kt */
    public final class a implements c {
        public final yl70 a;

        public a(LazyNpsOverlay lazyNpsOverlay) {
            this.a = (yl70) lazyNpsOverlay.findViewById(R.id.clips_inline_nps_overlay);
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsOverlay.c
        public final void a(yl70.b bVar) {
            this.a.setState(bVar);
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsOverlay.c
        public final void setVisibility(int i) {
        }
    }

    /* compiled from: LazyNpsOverlay.kt */
    public interface c {
        void a(yl70.b bVar);

        default void setVisibility(int i) {
        }
    }
}
