package com.vk.clips.design.view.templates;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.w;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.awt0;
import xsna.b40;
import xsna.c5f;
import xsna.i70;
import xsna.j5;
import xsna.j70;
import xsna.k7f;
import xsna.msy;
import xsna.o7f;
import xsna.o93;
import xsna.p7f;
import xsna.q7f;
import xsna.s7f;
import xsna.u8f;

/* compiled from: ClipsTemplateEditorFragmentsBottomView.kt */
/* loaded from: classes16.dex */
public final class ClipsTemplateEditorFragmentsBottomView extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public a b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final com.vk.lists.a<o7f> f;
    public final LinearLayoutManager g;
    public final u8f h;
    public final b i;

    /* compiled from: ClipsTemplateEditorFragmentsBottomView.kt */
    public interface a {
        void a(int i);
    }

    /* compiled from: ClipsTemplateEditorFragmentsBottomView.kt */
    public static final class b extends w {
        public static int h(RecyclerView.o oVar, View view) {
            new Rect();
            return ((view.getMeasuredWidth() / 2) + view.getLeft()) - ((((oVar.getWidth() - oVar.getPaddingLeft()) - oVar.getPaddingRight()) / 2) + oVar.getPaddingLeft());
        }

        @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.o0
        public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
            return new int[]{h(oVar, view), h(oVar, view)};
        }
    }

    /* compiled from: ClipsTemplateEditorFragmentsBottomView.kt */
    public static final class c implements a {
        public final k7f a;

        public c(k7f k7fVar) {
            this.a = k7fVar;
        }

        @Override // com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView.a
        public final void a(int i) {
            this.a.invoke(Integer.valueOf(i));
        }
    }

    /* compiled from: ClipsTemplateEditorFragmentsBottomView.kt */
    public static final class d extends m.e<o7f> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(o7f o7fVar, o7f o7fVar2) {
            return o7fVar.equals(o7fVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(o7f o7fVar, o7f o7fVar2) {
            return o7fVar.a == o7fVar2.a;
        }
    }

    public ClipsTemplateEditorFragmentsBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i70 i70Var = new i70(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, i70Var);
        this.d = msy.a(lazyThreadSafetyMode, new j70(this, 27));
        this.e = msy.a(lazyThreadSafetyMode, new c5f(this, 1));
        com.vk.lists.a<o7f> aVar = new com.vk.lists.a<>(new d());
        this.f = aVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.g = linearLayoutManager;
        u8f u8fVar = new u8f(aVar, new j5(this, 28));
        this.h = u8fVar;
        this.i = new b();
        LayoutInflater.from(context).inflate(R.layout.clips_template_editor_fragments_bottom_view, (ViewGroup) this, true);
        RecyclerView recycler = getRecycler();
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setItemAnimator(null);
        recycler.setClipToPadding(false);
        recycler.setAdapter(u8fVar);
        recycler.addOnScrollListener(new s7f(this));
    }

    public static void a(final ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView, final long j2) {
        clipsTemplateEditorFragmentsBottomView.g.scrollToPosition((int) j2);
        clipsTemplateEditorFragmentsBottomView.getRecycler().post(new Runnable() { // from class: xsna.r7f
            @Override // java.lang.Runnable
            public final void run() {
                ClipsTemplateEditorFragmentsBottomView.b(ClipsTemplateEditorFragmentsBottomView.this, j2);
            }
        });
        clipsTemplateEditorFragmentsBottomView.getRecycler().postDelayed(new o93(clipsTemplateEditorFragmentsBottomView, 6), 100L);
        clipsTemplateEditorFragmentsBottomView.i.attachToRecyclerView(null);
    }

    public static void b(ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView, long j2) {
        View findViewByPosition = clipsTemplateEditorFragmentsBottomView.g.findViewByPosition((int) j2);
        if (findViewByPosition == null) {
            L.l("ClipsTemplateEditorFragmentsBottomView", "Cant find target for snap");
            return;
        }
        int[] calculateDistanceToFinalSnap = clipsTemplateEditorFragmentsBottomView.i.calculateDistanceToFinalSnap(clipsTemplateEditorFragmentsBottomView.g, findViewByPosition);
        if (calculateDistanceToFinalSnap[0] == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        clipsTemplateEditorFragmentsBottomView.getRecycler().smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getRecycler() {
        return (RecyclerView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getRecyclerLeftShadow() {
        return (View) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getRecyclerRightShadow() {
        return (View) this.e.getValue();
    }

    public final void c() {
        LinearLayoutManager linearLayoutManager = this.g;
        awt0.v(getRecyclerRightShadow(), linearLayoutManager.w() < this.h.getItemCount() - 1);
        awt0.v(getRecyclerLeftShadow(), linearLayoutManager.v() > 0);
    }

    public final void d() {
        o7f t = this.f.t(new p7f(new b40(9), 0));
        if (t != null) {
            RecyclerView recycler = getRecycler();
            b bVar = this.i;
            bVar.attachToRecyclerView(recycler);
            long j2 = t.a;
            L.e("ClipsTemplateEditorFragmentsBottomView", "positionToScroll = " + ((int) j2));
            if (j2 < 0 || j2 >= this.g.getItemCount()) {
                bVar.attachToRecyclerView(null);
            } else {
                post(new q7f(0, j2, this));
            }
            c();
        }
    }

    public final a getCallback() {
        return this.b;
    }

    public final void setCallback(a aVar) {
        this.b = aVar;
    }
}
