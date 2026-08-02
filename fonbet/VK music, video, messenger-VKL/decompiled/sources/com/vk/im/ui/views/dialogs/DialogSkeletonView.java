package com.vk.im.ui.views.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.im.design.view.listitem.skeleton.ImChatSkeleton;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.b6g;
import xsna.cew;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.g2v;
import xsna.i7o0;
import xsna.qj80;
import xsna.tjm;
import xsna.zdw;
import xsna.zn;

/* compiled from: DialogSkeletonView.kt */
/* loaded from: classes2.dex */
public final class DialogSkeletonView extends FrameLayout implements dhr0.e {
    public int b;
    public boolean c;
    public final ShimmerFrameLayout d;
    public final a e;
    public final Shimmer f;
    public final ThemableShimmer g;

    /* compiled from: DialogSkeletonView.kt */
    public final class a extends FrameLayout {
        public final b b;
        public final int c;

        /* compiled from: DialogSkeletonView.kt */
        /* renamed from: com.vk.im.ui.views.dialogs.DialogSkeletonView$a$a, reason: collision with other inner class name */
        public static final class C1180a extends RecyclerView {
            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        }

        public a(Context context) {
            super(context);
            C1180a c1180a = new C1180a(context);
            b bVar = DialogSkeletonView.this.new b();
            this.b = bVar;
            g2v.c().getClass();
            this.c = e3m.a(R.dimen.vkim_dialog_item_skeleton_size_app, context);
            c1180a.setAdapter(bVar);
            c1180a.setLayoutManager(new LinearLayoutManager());
            addView(c1180a, new FrameLayout.LayoutParams(-1, -1));
        }

        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            qj80.a(this, new tjm(this, this, View.MeasureSpec.getMode(i2) == 1073741824, View.MeasureSpec.getSize(i2)));
        }
    }

    /* compiled from: DialogSkeletonView.kt */
    public final class b extends RecyclerView.Adapter<c> {
        public int c;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(c cVar, int i) {
            cVar.V5();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final c onCreateViewHolder(ViewGroup viewGroup, int i) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            g2v.c().getClass();
            View inflate = from.inflate(R.layout.vkim_dialogs_list_item_dialog_skeleton_app, viewGroup, false);
            ImFeatures imFeatures = ImFeatures.IM_CHATS_SKELETONS_REDESIGN;
            imFeatures.getClass();
            if (!com.vk.toggle.b.A.a(imFeatures)) {
                return new d(inflate);
            }
            return DialogSkeletonView.this.new e(from.inflate(R.layout.vkim_dialogs_list_item_dialog_skeleton_new, viewGroup, false));
        }
    }

    /* compiled from: DialogSkeletonView.kt */
    public static abstract class c extends RecyclerView.e0 {
        public abstract void V5();
    }

    /* compiled from: DialogSkeletonView.kt */
    public final class d extends c {
        public final View l;

        public d(View view) {
            super(view);
            this.l = view.findViewById(R.id.msg_three_lines);
        }

        @Override // com.vk.im.ui.views.dialogs.DialogSkeletonView.c
        public final void V5() {
            View view = this.l;
            if (view != null) {
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                zdwVar.u.getClass();
                if (cew.h().getInt("pref_dialogs_list_lines_number", 3) == 3) {
                    view.setVisibility(0);
                } else {
                    f4m.j(view);
                }
            }
        }
    }

    /* compiled from: DialogSkeletonView.kt */
    public final class e extends c {
        public final ImChatSkeleton l;

        public e(View view) {
            super(view);
            ImChatSkeleton imChatSkeleton = (ImChatSkeleton) view.findViewById(R.id.skeleton);
            this.l = imChatSkeleton;
            imChatSkeleton.setShimmer(DialogSkeletonView.this.g);
        }

        @Override // com.vk.im.ui.views.dialogs.DialogSkeletonView.c
        public final void V5() {
            ImChatSkeleton imChatSkeleton = this.l;
            imChatSkeleton.setArea(new a.C0863a(imChatSkeleton));
            DialogSkeletonView.this.g.b();
        }
    }

    public DialogSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        ImFeatures imFeatures = ImFeatures.IM_CHATS_SKELETONS_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            this.g.c();
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout = this.d;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.e();
        int i = this.b;
        a aVar = this.e;
        b bVar = aVar.b;
        if (bVar.c != i) {
            bVar.c = i;
            bVar.notifyDataSetChanged();
        }
        aVar.requestLayout();
    }

    public final int getSkeletonCount() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dhr0.f(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dhr0.a.getClass();
        dhr0.X(this);
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        setDarkTheme(dhr0.M());
    }

    public final void setDarkTheme(boolean z) {
        if (this.c != z) {
            this.c = z;
            int a2 = b6g.a(R.attr.vk_ui_skeleton_from, getContext());
            Shimmer shimmer = this.f;
            shimmer.e = a2;
            shimmer.d = b6g.a(R.attr.vk_ui_skeleton_to, getContext());
            shimmer.a();
            ShimmerFrameLayout shimmerFrameLayout = this.d;
            if (shimmerFrameLayout == null) {
                shimmerFrameLayout = null;
            }
            shimmerFrameLayout.b(shimmer);
        }
    }

    public final void setSkeletonCount(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public DialogSkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = 2;
        this.c = dhr0.M();
        a aVar = new a(context);
        this.e = aVar;
        Shimmer a2 = ((Shimmer.c) ((Shimmer.c) ((Shimmer.c) zn.a(true)).i()).e(1200L).h()).a();
        this.f = a2;
        ThemableShimmer.a aVar2 = new ThemableShimmer.a(context);
        aVar2.a.getClass();
        aVar2.b();
        aVar2.e();
        this.g = aVar2.a();
        ImFeatures imFeatures = ImFeatures.IM_CHATS_SKELETONS_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            addView(aVar, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context, null, 6);
        this.d = shimmerFrameLayout;
        a2.e = b6g.a(R.attr.vk_ui_skeleton_from, getContext());
        a2.d = b6g.a(R.attr.vk_ui_skeleton_to, getContext());
        a2.a();
        shimmerFrameLayout.b(a2);
        shimmerFrameLayout.addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        addView(shimmerFrameLayout, new FrameLayout.LayoutParams(-1, -1));
    }
}
