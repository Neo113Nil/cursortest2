package com.vk.clips.tool.view.viewer.feed.list.nps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.fm70;

/* compiled from: LazyNpsView.kt */
/* loaded from: classes17.dex */
public final class LazyNpsView extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public c b;

    /* compiled from: LazyNpsView.kt */
    public final class b implements c {
        public fm70.a a;
        public Integer b;

        public b() {
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView.c
        public final void a(fm70.a aVar) {
            Integer num;
            this.a = aVar;
            if ((aVar instanceof fm70.a.C2883a) || (num = this.b) == null) {
                return;
            }
            if (num != null && num.intValue() == 8) {
                return;
            }
            b();
        }

        public final void b() {
            int i = LazyNpsView.c;
            LazyNpsView lazyNpsView = LazyNpsView.this;
            fm70 fm70Var = new fm70(lazyNpsView.getContext());
            fm70Var.setId(R.id.clips_inline_nps_view);
            lazyNpsView.addView(fm70Var);
            a aVar = new a(lazyNpsView);
            lazyNpsView.b = aVar;
            fm70.a aVar2 = this.a;
            if (aVar2 != null) {
                aVar.a(aVar2);
            }
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView.c
        public final void setVisibility(int i) {
            fm70.a aVar;
            if (i == 8 || (aVar = this.a) == null || (aVar instanceof fm70.a.C2883a)) {
                this.b = Integer.valueOf(i);
            } else {
                b();
            }
        }
    }

    public LazyNpsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new b();
    }

    public final void setState(fm70.a aVar) {
        this.b.a(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.b.setVisibility(i);
    }

    /* compiled from: LazyNpsView.kt */
    public final class a implements c {
        public final fm70 a;

        public a(LazyNpsView lazyNpsView) {
            this.a = (fm70) lazyNpsView.findViewById(R.id.clips_inline_nps_view);
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView.c
        public final void a(fm70.a aVar) {
            this.a.setState(aVar);
        }

        @Override // com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView.c
        public final void setVisibility(int i) {
        }
    }

    /* compiled from: LazyNpsView.kt */
    public interface c {
        void a(fm70.a aVar);

        default void setVisibility(int i) {
        }
    }
}
