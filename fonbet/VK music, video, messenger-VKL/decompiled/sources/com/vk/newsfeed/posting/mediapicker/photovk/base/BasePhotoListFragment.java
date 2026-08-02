package com.vk.newsfeed.posting.mediapicker.photovk.base;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.screen.a;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.movika.sdk.base.logic.interactor.e;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a920;
import xsna.bw;
import xsna.bwt0;
import xsna.c5g;
import xsna.efc0;
import xsna.faa0;
import xsna.gj6;
import xsna.h44;
import xsna.iah0;
import xsna.ify;
import xsna.ij6;
import xsna.ikv0;
import xsna.j03;
import xsna.k9;
import xsna.kj6;
import xsna.msy;
import xsna.nv9;
import xsna.om1;
import xsna.oz50;
import xsna.p870;
import xsna.px0;
import xsna.qhh0;
import xsna.s5;
import xsna.sx0;
import xsna.t61;
import xsna.u40;
import xsna.vda0;
import xsna.w40;
import xsna.w65;
import xsna.wj6;
import xsna.wm1;
import xsna.wq10;
import xsna.xm1;
import xsna.ym1;
import xsna.yvw;

/* compiled from: BasePhotoListFragment.kt */
/* loaded from: classes.dex */
public abstract class BasePhotoListFragment<P extends gj6> extends BaseMvpFragment<P> implements ij6<P>, qhh0 {
    public static final /* synthetic */ int l0 = 0;
    public final Object T;
    public final Object U;
    public final Object V;
    public final nv9 W;
    public GridLayoutManager X;
    public int Y;
    public final int Z;
    public PickerRecyclerPaginatedView a0;
    public a920 b0;
    public int c0;
    public int d0;
    public final io.reactivex.rxjava3.disposables.b e0;
    public final e f0;
    public final h44 g0;
    public final yvw h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;

    /* compiled from: BasePhotoListFragment.kt */
    /* loaded from: classes4.dex */
    public static abstract class a extends oz50 {
        public a(UserId userId, Class<? extends FragmentImpl> cls) {
            super(cls, null, null);
            this.j.putParcelable("uid", userId);
        }
    }

    /* compiled from: BasePhotoListFragment.kt */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.n {
        public final /* synthetic */ BasePhotoListFragment<P> b;

        public b(BasePhotoListFragment<P> basePhotoListFragment) {
            this.b = basePhotoListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            BasePhotoListFragment<P> basePhotoListFragment = this.b;
            if (childAdapterPosition == 1) {
                rect.top = basePhotoListFragment.Z;
            }
            int i = basePhotoListFragment.Z;
            rect.right = i;
            rect.left = i;
            if (childAdapterPosition < basePhotoListFragment.d0) {
                return;
            }
            rect.right = i;
            rect.left = i;
            rect.top = i;
            rect.bottom = i;
        }
    }

    /* compiled from: BasePhotoListFragment.kt */
    /* loaded from: classes4.dex */
    public static final class c extends GridLayoutManager.c {
        public final /* synthetic */ BasePhotoListFragment<P> d;

        public c(BasePhotoListFragment<P> basePhotoListFragment) {
            this.d = basePhotoListFragment;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            BasePhotoListFragment<P> basePhotoListFragment = this.d;
            a920 a920Var = basePhotoListFragment.b0;
            if (a920Var == null) {
                a920Var = null;
            }
            if (a920Var.L0(i) instanceof faa0) {
                return 1;
            }
            return basePhotoListFragment.Y;
        }
    }

    public BasePhotoListFragment() {
        px0 px0Var = new px0(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, px0Var);
        this.U = msy.a(lazyThreadSafetyMode, new sx0(this, 6));
        this.V = msy.a(lazyThreadSafetyMode, new t61(5));
        this.W = new nv9();
        this.Y = 1;
        this.Z = iah0.a(1);
        this.e0 = new io.reactivex.rxjava3.disposables.b();
        this.f0 = new e(this, 6);
        this.g0 = new h44(this, 1);
        this.h0 = new yvw(null);
        int i = 6;
        this.i0 = msy.a(lazyThreadSafetyMode, new wm1(this, i));
        this.j0 = msy.a(lazyThreadSafetyMode, new xm1(this, i));
        this.k0 = msy.a(lazyThreadSafetyMode, new s5(this, 8));
    }

    @Override // xsna.ij6
    public final void C1(PhotoAlbum photoAlbum) {
        yvw yvwVar = this.h0;
        yvwVar.clear();
        jo();
        yvwVar.notifyDataSetChanged();
        this.d0 = yvwVar.E0();
    }

    public void I0() {
        C1(null);
    }

    @Override // xsna.ij6
    public final void T2(int i) {
        if (this.c0 != i) {
            this.c0 = i;
            C1(null);
        }
    }

    @Override // xsna.ij6
    public final void de(Throwable th) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        String f = com.vk.core.utils.newtork.b.d() ? j03.f(activity, th) : activity.getString(R.string.posting_common_network_error);
        ikv0.a aVar = new ikv0.a(activity);
        aVar.h(new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12));
        aVar.i(new ikv0.d(new ikv0.d.c(f, 3), (ikv0.d.b) null, (ikv0.d.a) null, 6));
        int i = ify.a;
        if (ify.e(ify.c)) {
            aVar.e(iah0.a(8) + ify.d(3, null));
        } else {
            aVar.e(iah0.a(8));
        }
        aVar.n();
    }

    public void g1(Photo photo) {
        faa0 lo = lo();
        P io2 = io();
        faa0.K0(lo, this.W.d(io2 != null ? ((wj6) io2).u7() : null, photo, false));
        C1(null);
    }

    public final a.c k9(int i) {
        a.c cVar = new a.c();
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = this.a0;
        if (pickerRecyclerPaginatedView == null) {
            pickerRecyclerPaginatedView = null;
        }
        RecyclerView.e0 findViewHolderForAdapterPosition = pickerRecyclerPaginatedView.getRecyclerView().findViewHolderForAdapterPosition(this.h0.E0() + i + 1);
        vda0 vda0Var = findViewHolderForAdapterPosition instanceof vda0 ? (vda0) findViewHolderForAdapterPosition : null;
        if (vda0Var != null) {
            cVar.c(vda0Var.q6());
            cVar.a(vda0Var.q6());
            PickerRecyclerPaginatedView pickerRecyclerPaginatedView2 = this.a0;
            cVar.d((pickerRecyclerPaginatedView2 != null ? pickerRecyclerPaginatedView2 : null).getRecyclerView().getRootView());
            cVar.b(w65.j(vda0Var.getItem().b()));
            if (vda0Var.q6().c0()) {
                cVar.f(vda0Var.q6().getImageWidth());
                cVar.e(vda0Var.q6().getImageHeight());
            }
        }
        return cVar;
    }

    public a920 ko() {
        a920 a920Var = new a920();
        a920Var.K0(this.h0);
        a920Var.K0(lo());
        return a920Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final faa0 lo() {
        return (faa0) this.i0.getValue();
    }

    public final efc0 mo() {
        Fragment parentFragment = getParentFragment();
        PostingFragment postingFragment = parentFragment instanceof PostingFragment ? (PostingFragment) parentFragment : null;
        if (postingFragment != null) {
            return postingFragment.getFeature();
        }
        return null;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    /* renamed from: no, reason: merged with bridge method [inline-methods] */
    public P io() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.faa0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [xsna.wj6] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ?? r5;
        j1 d0;
        List<wq10> c0;
        super.onCreate(bundle);
        P io2 = io();
        if (io2 != null) {
            io2.i6(requireArguments(), bundle);
        }
        efc0 mo = mo();
        if (mo == null || (c0 = mo.c0()) == null) {
            r5 = EmptyList.b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : c0) {
                if (obj instanceof wq10.b) {
                    arrayList.add(obj);
                }
            }
            r5 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r5.add(((wq10.b) it.next()).a());
            }
        }
        lo().N0(r5);
        P io3 = io();
        if (io3 != null) {
            ((wj6) io3).j7(r5);
        }
        efc0 mo2 = mo();
        if (mo2 != null && (d0 = mo2.d0()) != null) {
            io.reactivex.rxjava3.disposables.c subscribe = d0.subscribe(new bw(new k9(this, 9), 8), new om1(new ym1(com.vk.metrics.eventtracking.b.a, 2), 2));
            if (subscribe != null) {
                this.e0.b(subscribe);
            }
        }
        this.b0 = ko();
        ?? r52 = this.U;
        p870 p870Var = (p870) r52.getValue();
        h44 h44Var = this.g0;
        p870Var.b(130, h44Var);
        ((p870) r52.getValue()).b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, h44Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.media_picker_photos_vk_fragment, viewGroup, false);
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.Y);
        gridLayoutManager.Y((c) this.j0.getValue());
        this.X = gridLayoutManager;
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = (PickerRecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        RecyclerView recyclerView = pickerRecyclerPaginatedView.getRecyclerView();
        recyclerView.addItemDecoration((b) this.k0.getValue());
        GridLayoutManager gridLayoutManager2 = this.X;
        if (gridLayoutManager2 == null) {
            gridLayoutManager2 = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager2);
        int i = -this.Z;
        recyclerView.setPadding(i, i, i, i);
        bwt0.R(pickerRecyclerPaginatedView, new kj6(0, this, inflate));
        pickerRecyclerPaginatedView.setOnRefreshListener(new u40(this, 6));
        pickerRecyclerPaginatedView.setOnReloadRetryClickListener(new w40(this, 10));
        a920 a920Var = this.b0;
        pickerRecyclerPaginatedView.setAdapter(a920Var != null ? a920Var : null);
        pickerRecyclerPaginatedView.e0();
        this.a0 = pickerRecyclerPaginatedView;
        pickerRecyclerPaginatedView.setSwipeRefreshEnabled(io() == null);
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((p870) this.U.getValue()).g(this.g0);
        this.e0.dispose();
    }

    public void r0(int i) {
        lo().L0(i);
        yvw yvwVar = this.h0;
        yvwVar.notifyItemRangeChanged(0, yvwVar.E0());
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView;
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = this.a0;
        if (pickerRecyclerPaginatedView == null) {
            pickerRecyclerPaginatedView = null;
        }
        if (pickerRecyclerPaginatedView == null || (recyclerView = pickerRecyclerPaginatedView.getRecyclerView()) == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    public void jo() {
    }
}
