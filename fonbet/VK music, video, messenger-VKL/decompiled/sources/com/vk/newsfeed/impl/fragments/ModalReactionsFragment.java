package com.vk.newsfeed.impl.fragments;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.likes.LikesGetList;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.reactions.fragments.BaseReactionsTabFragment;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.ayo;
import xsna.b0u0;
import xsna.bv9;
import xsna.bwt0;
import xsna.ce60;
import xsna.dhr0;
import xsna.e3m;
import xsna.e6f0;
import xsna.epx;
import xsna.ey50;
import xsna.fcn;
import xsna.fkq0;
import xsna.hfv;
import xsna.i230;
import xsna.i990;
import xsna.iah0;
import xsna.iut0;
import xsna.jno0;
import xsna.krv0;
import xsna.lwh;
import xsna.m33;
import xsna.o25;
import xsna.oz50;
import xsna.p870;
import xsna.p90;
import xsna.r3h;
import xsna.r6f0;
import xsna.rtt;
import xsna.s01;
import xsna.sm9;
import xsna.t6g0;
import xsna.too0;
import xsna.ts90;
import xsna.tw3;
import xsna.u080;
import xsna.u6f0;
import xsna.ww50;

/* compiled from: ModalReactionsFragment.kt */
/* loaded from: classes4.dex */
public final class ModalReactionsFragment extends ReactionsFragment implements too0, fcn {
    public static final int G0 = iah0.a(16);
    public ViewGroup k0;
    public ImageView l0;
    public TextView m0;
    public View n0;
    public View o0;
    public View p0;
    public View q0;
    public LinearLayout r0;
    public View s0;
    public CharSequence t0;
    public ModalBottomSheetBehavior<View> v0;
    public Integer x0;
    public boolean y0;
    public final Handler u0 = new Handler(Looper.getMainLooper());
    public final ListDataSet<ReactionMeta> w0 = new ListDataSet<>();
    public final sm9 z0 = new sm9(this, 10);
    public final tw3 A0 = new tw3(this, 12);
    public final bv9 B0 = new bv9(this, 5);
    public final r3h C0 = new r3h(this, 27);
    public final int D0 = 1;
    public final b E0 = new b();
    public final i230 F0 = new i230(this, 0);

    public static void oo(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
        if (dVar != null) {
            dVar.a = 0;
        }
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment, xsna.i6f0
    public final void Fg(ReactionSet reactionSet, ItemReactions itemReactions) {
        LinearLayout linearLayout;
        ArrayList<ReactionMeta> arrayList = reactionSet != null ? reactionSet.c : null;
        ListDataSet<ReactionMeta> listDataSet = this.w0;
        if (arrayList == null || arrayList.isEmpty()) {
            View view = this.q0;
            if (view != null) {
                bwt0.p0(view, false);
            }
            LinearLayout linearLayout2 = this.r0;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
            }
            listDataSet.clear();
            setTitle(this.t0);
            return;
        }
        View view2 = this.q0;
        if (view2 != null) {
            bwt0.p0(view2, true);
        }
        this.x0 = itemReactions != null ? itemReactions.e : null;
        FragmentActivity activity = getActivity();
        if (activity != null && (linearLayout = this.r0) != null) {
            ArrayList<ReactionMeta> arrayList2 = reactionSet != null ? reactionSet.c : null;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                linearLayout.removeAllViews();
            } else if (linearLayout.getChildCount() == 0) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    linearLayout.addView(new hfv(activity, this.x0, arrayList2.get(i), this.C0));
                }
            } else {
                ro();
            }
        }
        listDataSet.setItems(reactionSet != null ? reactionSet.c : null);
        setTitle(getString(R.string.reactions_title_select));
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        VKTabLayout vKTabLayout = this.X;
        if (vKTabLayout != null) {
            dhr0.W(vKTabLayout);
        }
        View view = this.p0;
        if (view != null) {
            dhr0.W(view);
        }
        View view2 = this.q0;
        if (view2 != null) {
            dhr0.W(view2);
        }
        View view3 = this.o0;
        if (view3 != null) {
            FragmentActivity activity = getActivity();
            Drawable drawable = null;
            if (activity != null) {
                e3m.a aVar = e3m.a;
                Drawable a2 = m33.a(R.drawable.vk_bg_card_elevation16_top, activity);
                if (a2 != null) {
                    a2.mutate();
                    a2.setColorFilter(e3m.f(R.attr.vk_ui_background_content, activity), PorterDuff.Mode.MULTIPLY);
                    drawable = a2;
                }
            }
            view3.setBackground(drawable);
        }
        ImageView imageView = this.l0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(dhr0.t.c(R.attr.vk_ui_icon_accent_themed), PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.m0;
        if (textView != null) {
            jno0.c(textView, R.attr.vk_ui_text_primary);
        }
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment, xsna.i6f0
    public final void Ve(Integer num) {
        u6f0 io2;
        r6f0 r6f0Var = this.e0;
        if (r6f0Var == null) {
            return;
        }
        if (num == null && !epx.f(this.x0, num)) {
            int size = r6f0Var.k.size();
            for (int i = 0; i < size; i++) {
                i990 h = r6f0Var.h(i);
                if (h != null) {
                    String str = h.a;
                    if (!epx.f(str, "all")) {
                        if (!epx.f(str, "reaction" + this.x0)) {
                        }
                    }
                    Integer num2 = this.f0.get(str);
                    int intValue = (num2 != null ? num2.intValue() : 0) - 1;
                    e6f0 e6f0Var = this.T;
                    if (e6f0Var != null) {
                        e6f0Var.N4(intValue, str, false);
                    }
                }
            }
        }
        r6f0 r6f0Var2 = this.e0;
        if (r6f0Var2 != null) {
            Integer num3 = this.x0;
            Iterator<i990> it = r6f0Var2.k.iterator();
            while (it.hasNext()) {
                FragmentImpl fragmentImpl = it.next().b;
                if ((fragmentImpl instanceof BaseReactionsTabFragment) && (io2 = ((BaseReactionsTabFragment) fragmentImpl).io()) != null) {
                    io2.F0(num3, num);
                }
            }
        }
        this.x0 = num;
        ro();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ModalBottomSheetBehavior<View> modalBottomSheetBehavior;
        if (this.y0 || ((modalBottomSheetBehavior = this.v0) != null && modalBottomSheetBehavior.k == 5)) {
            no();
            return true;
        }
        tw3 tw3Var = this.A0;
        Handler handler = this.u0;
        handler.removeCallbacks(tw3Var);
        handler.removeCallbacks(this.z0);
        handler.postDelayed(this.B0, 400L);
        ModalBottomSheetBehavior<View> modalBottomSheetBehavior2 = this.v0;
        if (modalBottomSheetBehavior2 != null) {
            modalBottomSheetBehavior2.O(5);
        }
        this.y0 = true;
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fcn
    public final void b(boolean z) {
        if (z) {
            a0();
        } else {
            finish();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        this.u0.removeCallbacksAndMessages(null);
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        ComponentCallbacks2 h;
        ww50<?> Y;
        FragmentActivity activity = getActivity();
        if (activity == null || (h = e3m.h(activity)) == null) {
            return;
        }
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            Y.H(this);
        }
        this.u0.removeCallbacks(this.A0);
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment, xsna.i6f0
    public final void kl(rtt rttVar, String str, Counters counters, boolean z) {
        super.kl(rttVar, str, counters, z);
        Fg(rttVar.d, rttVar.e);
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment
    public final View lo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_modal_reactions, viewGroup, false);
        this.k0 = (ViewGroup) inflate.findViewById(R.id.design_bottom_sheet);
        this.o0 = inflate.findViewById(R.id.bottom_sheet_content_holder);
        this.l0 = (ImageView) inflate.findViewById(R.id.reactions_modal_close);
        TextView textView = (TextView) inflate.findViewById(R.id.reactions_modal_title);
        if (textView != null) {
            com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, Float.valueOf(23.0f), 4);
        } else {
            textView = null;
        }
        this.m0 = textView;
        this.n0 = inflate.findViewById(R.id.reactions_modal_toolbar);
        this.p0 = inflate.findViewById(R.id.reactions_modal_container);
        this.q0 = inflate.findViewById(R.id.reactions_items);
        this.r0 = (LinearLayout) inflate.findViewById(R.id.reactions_selector);
        this.s0 = inflate.findViewById(R.id.reactions_divider);
        u080 u080Var = new u080() { // from class: xsna.j230
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                int i = ModalReactionsFragment.G0;
                int a2 = wqx0.a(bqx0Var);
                View view2 = ModalReactionsFragment.this.o0;
                if (view2 != null) {
                    f4m.t(a2 - ModalReactionsFragment.G0, view2);
                }
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(inflate, u080Var);
        return inflate;
    }

    public final void no() {
        sm9 sm9Var = this.z0;
        Handler handler = this.u0;
        handler.removeCallbacks(sm9Var);
        handler.removeCallbacks(this.B0);
        LinearLayout linearLayout = this.r0;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                hfv hfvVar = childAt instanceof hfv ? (hfv) childAt : null;
                if (hfvVar != null) {
                    hfvVar.e.g();
                }
            }
        }
        finish();
        FragmentActivity activity = getActivity();
        if (activity == null || p90.e(activity) || isDetached()) {
            return;
        }
        tn();
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qo();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ww50<?> Y;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Object h = activity != null ? e3m.h(activity) : null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            Y.S(this);
        }
        if (bundle != null) {
            no();
        }
        e6f0 e6f0Var = this.T;
        if (e6f0Var != null) {
            e6f0Var.q.set(true);
            e6f0Var.r.set(false);
        }
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment, com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ce60.b.getClass();
        p870.f().g(this.F0);
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment, com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bwt0.i0(view.findViewById(R.id.touch_outside), new ayo(this, 20));
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.h230
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    int i2 = ModalReactionsFragment.G0;
                    if (i != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    ModalReactionsFragment.this.a0();
                    return true;
                }
            });
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(80);
                window.getDecorView().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                window.clearFlags(1024);
                window.setLayout(-1, -1);
                window.setGravity(1);
                window.setWindowAnimations(0);
                Bundle arguments = getArguments();
                Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("theme")) : null;
                dhr0.a.getClass();
                int i = dhr0.u().c;
                if (valueOf != null && valueOf.intValue() == i) {
                    krv0.t(window, NavigationBarStyle.DARK);
                } else {
                    TypedValue typedValue = krv0.a;
                    krv0.s(window, 0);
                }
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
            }
        }
        View view2 = this.o0;
        if (view2 != null) {
            Context context = view.getContext();
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_bg_card_elevation16_top, context);
            if (a2 != null) {
                a2.mutate();
                a2.setColorFilter(e3m.f(R.attr.vk_ui_background_content, context), PorterDuff.Mode.MULTIPLY);
            } else {
                a2 = null;
            }
            view2.setBackground(a2);
        }
        ViewGroup viewGroup = this.k0;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            if (fVar != null) {
                ModalBottomSheetBehavior modalBottomSheetBehavior = new ModalBottomSheetBehavior(new ts90(0.75f, 2), null);
                modalBottomSheetBehavior.b = view;
                fVar.c(modalBottomSheetBehavior);
            }
            ModalBottomSheetBehavior<View> H = ModalBottomSheetBehavior.H(viewGroup);
            H.u = this.E0;
            H.M(true);
            H.O(5);
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                this.v0 = H;
                this.u0.postDelayed(this.z0, 64L);
            }
        }
        ImageView imageView = this.l0;
        if (imageView != null) {
            bwt0.i0(imageView, new lwh(this, 28));
        }
        View view3 = this.n0;
        if (view3 != null) {
            view3.setOnClickListener(new s01(this, 6));
        }
        r6f0 r6f0Var = this.e0;
        if (r6f0Var != null) {
            r6f0Var.l = false;
            ArrayList<i990> arrayList = r6f0Var.k;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentImpl fragmentImpl = arrayList.get(i2).b;
                if (fragmentImpl instanceof BaseReactionsTabFragment) {
                    BaseReactionsTabFragment baseReactionsTabFragment = (BaseReactionsTabFragment) fragmentImpl;
                    baseReactionsTabFragment.V = false;
                    RecyclerPaginatedView recyclerPaginatedView = baseReactionsTabFragment.T;
                    if (recyclerPaginatedView != null) {
                        recyclerPaginatedView.setSwipeRefreshEnabled(false);
                    }
                }
            }
        }
        qo();
        ce60.b.getClass();
        p870.f().b(102, this.F0);
    }

    public final void po(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
        if (dVar != null) {
            dVar.a = this.D0;
        }
    }

    public final void qo() {
        Resources resources;
        FragmentActivity activity = getActivity();
        Configuration configuration = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getConfiguration();
        if (configuration == null || configuration.orientation != 2) {
            View view = this.n0;
            if (view != null) {
                oo(view);
            }
            View view2 = this.q0;
            if (view2 != null) {
                oo(view2);
            }
            VKTabLayout vKTabLayout = this.X;
            if (vKTabLayout != null) {
                oo(vKTabLayout);
                return;
            }
            return;
        }
        View view3 = this.n0;
        if (view3 != null) {
            po(view3);
        }
        View view4 = this.q0;
        if (view4 != null) {
            po(view4);
        }
        VKTabLayout vKTabLayout2 = this.X;
        if (vKTabLayout2 != null) {
            po(vKTabLayout2);
        }
    }

    public final void ro() {
        LinearLayout linearLayout = this.r0;
        if (linearLayout == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            hfv hfvVar = childAt instanceof hfv ? (hfv) childAt : null;
            if (hfvVar != null) {
                hfvVar.setSelectedReactionId(this.x0);
                hfvVar.a();
            }
        }
    }

    @Override // com.vk.reactions.fragments.ReactionsFragment, xsna.i6f0
    public final void setTitle(CharSequence charSequence) {
        this.t0 = charSequence;
        TextView textView = this.m0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFullScreenBottomSheetTheme_NoAnim;
    }

    /* compiled from: ModalReactionsFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, int i) {
            super(ModalReactionsFragment.class, null, null);
            boolean g0;
            this.j.putParcelable("owner_id", userId);
            this.j.putLong("item_id", i);
            UserId c = o25.a().c();
            if (fkq0.d(userId)) {
                g0 = epx.f(c, userId);
            } else {
                t6g0 t6g0Var = t6g0.b;
                g0 = t6g0.b().g0(userId);
            }
            this.j.putBoolean("shares_available", g0);
        }

        public a(VideoFile videoFile) {
            this(videoFile.I0(), videoFile.o0());
            this.j.putSerializable("ltype", LikesGetList.Type.VIDEO);
            this.j.putParcelable("counters", videoFile.H());
        }
    }

    /* compiled from: ModalReactionsFragment.kt */
    public static final class b extends ModalBottomSheetBehavior.d {
        public b() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            ModalReactionsFragment modalReactionsFragment = ModalReactionsFragment.this;
            if (i != 3 && i != 4) {
                if (i != 5) {
                    return;
                }
                int i2 = ModalReactionsFragment.G0;
                modalReactionsFragment.no();
                return;
            }
            e6f0 e6f0Var = modalReactionsFragment.T;
            if (e6f0Var != null) {
                g<Boolean> gVar = e6f0Var.s;
                if (e6f0Var.r.getAndSet(true)) {
                    return;
                }
                gVar.onNext(Boolean.TRUE);
                gVar.onComplete();
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
        }
    }
}
