package com.vk.newsfeed.posting.mediapicker.localmedia;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.vk.attachpicker.screen.a;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$MeasureColdStart;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveStartTime;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abg0;
import xsna.ak3;
import xsna.asu0;
import xsna.atm;
import xsna.awt0;
import xsna.bhc0;
import xsna.bu0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.ef90;
import xsna.efc0;
import xsna.epx;
import xsna.evz;
import xsna.fmc0;
import xsna.fvz;
import xsna.gb0;
import xsna.gvz;
import xsna.h2s;
import xsna.it7;
import xsna.iwg0;
import xsna.izs;
import xsna.jgu;
import xsna.kn9;
import xsna.kwg0;
import xsna.lf90;
import xsna.lvz;
import xsna.msy;
import xsna.og;
import xsna.oyt;
import xsna.oz50;
import xsna.pmc0;
import xsna.q3;
import xsna.qcs;
import xsna.qhh0;
import xsna.s3q0;
import xsna.sim;
import xsna.smc0;
import xsna.st0;
import xsna.u3k;
import xsna.v0q0;
import xsna.wjf0;
import xsna.yg1;
import xsna.zqh;

/* compiled from: LocalMediaPickerFragmentOld.kt */
/* loaded from: classes.dex */
public final class LocalMediaPickerFragmentOld extends FragmentImpl implements bhc0, v0q0, smc0, qhh0, qcs {
    public static final /* synthetic */ int c0 = 0;
    public View P;
    public View Q;
    public View R;
    public TextView S;
    public TextView T;
    public VkButton U;
    public FrameLayout V;
    public RecyclerView W;
    public jgu X;
    public gvz a0;
    public gvz b0;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new bu0(17));
    public final io.reactivex.rxjava3.disposables.b O = new io.reactivex.rxjava3.disposables.b();
    public final h2s Y = new h2s(this, 9);
    public final evz Z = new evz(new u3k(this, 27), new it7(this, 3), new zqh(this, 25));

    /* compiled from: LocalMediaPickerFragmentOld.kt */
    /* loaded from: classes4.dex */
    public static final class a extends oz50 {
    }

    /* compiled from: LocalMediaPickerFragmentOld.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public final void eo(gvz gvzVar) {
        this.a0 = gvzVar;
        boolean z = gvzVar instanceof gvz.b;
        evz evzVar = this.Z;
        if (z) {
            if (PermissionHelper.o(requireContext())) {
                View view = this.P;
                if (view != null) {
                    bwt0.p0(view, false);
                }
                FrameLayout frameLayout = this.V;
                if (frameLayout != null) {
                    bwt0.p0(frameLayout, true);
                }
                RecyclerView recyclerView = this.W;
                if (recyclerView != null) {
                    bwt0.p0(recyclerView, true);
                }
                evzVar.submitList(Collections.singletonList(fvz.b.a));
                return;
            }
            View view2 = this.P;
            if (view2 != null) {
                bwt0.p0(view2, true);
            }
            RecyclerView recyclerView2 = this.W;
            if (recyclerView2 != null) {
                bwt0.p0(recyclerView2, false);
            }
            TextView textView = this.S;
            if (textView != null) {
                textView.setText(R.string.media_picker_empty_gallery);
            }
            TextView textView2 = this.T;
            if (textView2 != null) {
                textView2.setText(R.string.media_picker_empty_gallery_description);
            }
            VkButton vkButton = this.U;
            if (vkButton != null) {
                vkButton.setOnClickListener(new kn9(this, 5));
            }
            VkButton vkButton2 = this.U;
            if (vkButton2 != null) {
                vkButton2.setText(R.string.media_picker_open_camera);
            }
            VkButton vkButton3 = this.U;
            if (vkButton3 != null) {
                Integer valueOf = Integer.valueOf(R.drawable.vk_icon_camera_outline_24);
                int[] iArr = VkButton.W;
                vkButton3.a5(true, valueOf);
                return;
            }
            return;
        }
        if (gvzVar instanceof gvz.c) {
            FrameLayout frameLayout2 = this.V;
            if (frameLayout2 != null) {
                bwt0.p0(frameLayout2, false);
            }
            View view3 = this.P;
            if (view3 != null) {
                bwt0.p0(view3, true);
            }
            RecyclerView recyclerView3 = this.W;
            if (recyclerView3 != null) {
                bwt0.p0(recyclerView3, false);
            }
            TextView textView3 = this.S;
            if (textView3 != null) {
                textView3.setText(R.string.media_picker_grant_gallery_view_permission);
            }
            TextView textView4 = this.T;
            if (textView4 != null) {
                textView4.setText(R.string.media_picker_grant_gallery_view_permission_description);
            }
            VkButton vkButton4 = this.U;
            if (vkButton4 != null) {
                vkButton4.setOnClickListener(new oyt(this, 2));
            }
            VkButton vkButton5 = this.U;
            if (vkButton5 != null) {
                vkButton5.setText(R.string.media_picker_grant_permission);
            }
            VkButton vkButton6 = this.U;
            if (vkButton6 != null) {
                int[] iArr2 = VkButton.W;
                vkButton6.a5(true, null);
                return;
            }
            return;
        }
        if (!(gvzVar instanceof gvz.a)) {
            if (!(gvzVar instanceof gvz.d)) {
                throw new NoWhenBranchMatchedException();
            }
            View view4 = this.P;
            if (view4 != null) {
                bwt0.p0(view4, false);
            }
            FrameLayout frameLayout3 = this.V;
            if (frameLayout3 != null) {
                bwt0.p0(frameLayout3, false);
            }
            RecyclerView recyclerView4 = this.W;
            if (recyclerView4 != null) {
                bwt0.p0(recyclerView4, true);
            }
            evzVar.x0();
            return;
        }
        gvz.a aVar = (gvz.a) gvzVar;
        FrameLayout frameLayout4 = this.V;
        if (frameLayout4 != null) {
            Context mo2getContext = mo2getContext();
            bwt0.p0(frameLayout4, mo2getContext != null ? PermissionHelper.o(mo2getContext) : false);
        }
        evzVar.submitList(aVar.a());
        View view5 = this.P;
        if (view5 != null) {
            bwt0.p0(view5, false);
        }
        RecyclerView recyclerView5 = this.W;
        if (recyclerView5 != null) {
            bwt0.p0(recyclerView5, true);
        }
    }

    public final efc0 fo() {
        Fragment parentFragment = getParentFragment();
        PostingFragment postingFragment = parentFragment instanceof PostingFragment ? (PostingFragment) parentFragment : null;
        if (postingFragment != null) {
            return postingFragment.getFeature();
        }
        return null;
    }

    public final a.c go(int i) {
        a.c cVar = new a.c();
        RecyclerView recyclerView = this.W;
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i + 1) : null;
        lvz lvzVar = findViewHolderForAdapterPosition instanceof lvz ? (lvz) findViewHolderForAdapterPosition : null;
        if (lvzVar != null) {
            VkImage s6 = lvzVar.s6();
            cVar.c(s6);
            cVar.a(s6);
            RecyclerView recyclerView2 = this.W;
            cVar.d(recyclerView2 != null ? recyclerView2.getRootView() : null);
            cVar.b(lvzVar.q6());
            if (s6.c0()) {
                cVar.f(s6.getImageWidth());
                cVar.e(s6.getImageHeight());
            }
        }
        return cVar;
    }

    @Override // xsna.smc0
    public final void o6(fmc0 fmc0Var) {
        efc0 fo;
        if (!(fmc0Var instanceof pmc0)) {
            if (!(fmc0Var instanceof fmc0.i.a) || (fo = fo()) == null) {
                return;
            }
            fo.j0(new fmc0.i.b(go(((fmc0.i.a) fmc0Var).a())));
            return;
        }
        if (((pmc0) fmc0Var).a() == MobileOfficialAppsFeedStat$PickerType.PHOTO) {
            v vVar = new v(new gb0(this, 1));
            asu0.a.getClass();
            f0 q = vVar.q(asu0.m());
            int i = kwg0.a;
            c subscribe = q.subscribe(new iwg0(), new st0(new b(com.vk.metrics.eventtracking.b.a), 23));
            if (subscribe != null) {
                this.O.b(subscribe);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        RecyclerView recyclerView;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            i = cn70.b(configuration.screenWidthDp) / e3m.a(R.dimen.media_picker_photo_cell_size_in_landscape, requireContext());
            if (i < 1) {
                i = 1;
            }
        } else {
            i = 3;
        }
        RecyclerView recyclerView2 = this.W;
        if (recyclerView2 != null) {
            mo2getContext();
            recyclerView2.setLayoutManager(new GridLayoutManager(i));
        }
        jgu jguVar = this.X;
        if (jguVar != null && (recyclerView = this.W) != null) {
            recyclerView.removeItemDecoration(jguVar);
        }
        jgu jguVar2 = new jgu(i, cn70.b(2), false);
        RecyclerView recyclerView3 = this.W;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(jguVar2);
        }
        this.X = jguVar2;
        RecyclerView recyclerView4 = this.W;
        if (recyclerView4 != null) {
            recyclerView4.invalidateItemDecorations();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.PHOTO;
        PostingAction$TechStats$Picker$SaveStartTime postingAction$TechStats$Picker$SaveStartTime = new PostingAction$TechStats$Picker$SaveStartTime(mobileOfficialAppsFeedStat$PickerType, SystemClock.elapsedRealtime());
        h2s h2sVar = this.Y;
        h2sVar.invoke(postingAction$TechStats$Picker$SaveStartTime);
        h2sVar.invoke(new PostingAction$TechStats$Picker$MeasureColdStart(mobileOfficialAppsFeedStat$PickerType));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.media_picker_local_media_tab_fragment, viewGroup, false);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.select_part_access_button);
        if (vkButton != null) {
            vkButton.setOnClickListener(new yg1(this, 4));
        }
        this.V = (FrameLayout) inflate.findViewById(R.id.select_part_access_images);
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.O.e();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        efc0 fo;
        super.onViewCreated(view, bundle);
        this.P = view.findViewById(R.id.media_picker_unavailable_gallery_view);
        this.Q = view.findViewById(R.id.unavailable_gallery_banner_content);
        this.R = view.findViewById(R.id.unavailable_gallery_banner_close_button);
        this.U = (VkButton) view.findViewById(R.id.media_picker_unavailable_gallery_action_button);
        this.S = (TextView) view.findViewById(R.id.unavailable_gallery_banner_title);
        this.T = (TextView) view.findViewById(R.id.unavailable_gallery_banner_description);
        View view2 = this.R;
        if (view2 != null) {
            view2.setOnClickListener(new q3(this, 5));
        }
        VkButton vkButton = this.U;
        int i = 3;
        if (vkButton != null) {
            vkButton.setOnClickListener(new og(this, i));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.local_media_recycler_view);
        this.W = recyclerView;
        lf90 lf90Var = new lf90(new sim(this, 16));
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new ef90(lf90Var));
        }
        Configuration configuration = view.getContext().getResources().getConfiguration();
        if (configuration.orientation == 2 && (i = cn70.b(configuration.screenWidthDp) / e3m.a(R.dimen.media_picker_photo_cell_size_in_landscape, requireContext())) < 1) {
            i = 1;
        }
        RecyclerView recyclerView2 = this.W;
        if (recyclerView2 != null) {
            mo2getContext();
            recyclerView2.setLayoutManager(new GridLayoutManager(i));
        }
        jgu jguVar = new jgu(i, cn70.b(2), false);
        RecyclerView recyclerView3 = this.W;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(jguVar);
        }
        this.X = jguVar;
        RecyclerView recyclerView4 = this.W;
        evz evzVar = this.Z;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(evzVar);
        }
        RecyclerView recyclerView5 = this.W;
        if (recyclerView5 != null) {
            awt0.g(recyclerView5);
        }
        RecyclerView recyclerView6 = this.W;
        if (recyclerView6 != null) {
            g gVar = new g();
            gVar.g = false;
            recyclerView6.setItemAnimator(gVar);
        }
        wjf0.b(evzVar, new atm(this, 17));
        evzVar.x0();
        if (bundle == null && (fo = fo()) != null) {
            fo.C(PostingAction.MediaPicker.PageViewCreated.b);
        }
        gvz gvzVar = this.b0;
        if (gvzVar != null) {
            eo(gvzVar);
            this.b0 = null;
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView = this.W;
        if (recyclerView == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    @Override // xsna.v0q0
    public final boolean sk() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bhc0
    public final void tb(float f, int i) {
        gvz gvzVar = this.a0;
        if (epx.f(gvzVar, gvz.b.a) || epx.f(gvzVar, gvz.c.a)) {
            abg0 abg0Var = dhr0.t;
            int c = abg0Var.c(R.attr.vk_ui_background_secondary);
            int c2 = abg0Var.c(R.attr.vk_ui_background_content);
            ak3 ak3Var = (ak3) this.N.getValue();
            Integer valueOf = Integer.valueOf(c);
            Integer valueOf2 = Integer.valueOf(c2);
            ak3Var.getClass();
            int intValue = ak3.a(f, valueOf, valueOf2).intValue();
            View view = this.P;
            if (view != null) {
                view.setBackgroundColor(intValue);
            }
            View view2 = this.Q;
            int measuredHeight = view2 != null ? view2.getMeasuredHeight() : 0;
            View view3 = this.Q;
            if (view3 != null) {
                view3.setTranslationY((i - measuredHeight) / 2.0f);
            }
            View view4 = this.R;
            if (view4 != null) {
                view4.setAlpha(1 - f);
            }
            View view5 = this.R;
            if (view5 != null) {
                bwt0.p0(view5, f < 0.99f);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO;
    }

    @Override // xsna.qcs
    public final void Vk() {
    }
}
