package com.vk.attachpicker.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.Ad;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.serialize.Serializer.StreamParcelable;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.movika.sdk.base.ui.t;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.awt0;
import xsna.b34;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c34;
import xsna.ca;
import xsna.cuz;
import xsna.cvk;
import xsna.d14;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.eu;
import xsna.f50;
import xsna.fux;
import xsna.g3p0;
import xsna.h2u;
import xsna.iah0;
import xsna.iin0;
import xsna.iwg0;
import xsna.izs;
import xsna.j34;
import xsna.krv0;
import xsna.kwg0;
import xsna.l0i0;
import xsna.m33;
import xsna.msy;
import xsna.nds;
import xsna.ne3;
import xsna.o25;
import xsna.oz50;
import xsna.rh4;
import xsna.rwi;
import xsna.s3q0;
import xsna.sp;
import xsna.sx0;
import xsna.txt0;
import xsna.u1u0;
import xsna.vif0;
import xsna.xl0;
import xsna.zom0;

/* compiled from: BaseAttachPickerFragment.kt */
/* loaded from: classes15.dex */
public abstract class BaseAttachPickerFragment<T extends Serializer.StreamParcelable, VH extends vif0<T>> extends BaseFragment implements txt0<T, VH>, iin0, fux<T>, View.OnClickListener, nds {
    public static final /* synthetic */ int y0 = 0;
    public io.reactivex.rxjava3.disposables.c S;
    public LinearLayoutManager T;
    public l0i0 U;
    public VkButton V;
    public ViewGroup W;
    public Toolbar X;
    public AppBarLayout Y;
    public VkRecyclerPaginatedView Z;
    public b34<T, VH> a0;
    public boolean e0;
    public boolean f0;
    public int g0;
    public boolean i0;
    public boolean j0;
    public int r0;
    public com.vk.lists.c t0;
    public com.vk.lists.c u0;
    public UserId b0 = UserId.d;
    public final zom0<T> c0 = new zom0<>();
    public boolean d0 = true;
    public int h0 = 10;
    public final int k0 = R.layout.fragment_attach;
    public final String l0 = "";
    public final String m0 = "";
    public final Object n0 = msy.a(LazyThreadSafetyMode.NONE, new ca(this, 9));
    public final bpn0 o0 = new bpn0(new d14(2));
    public final e p0 = new e(this);
    public String q0 = "";
    public final ArrayList<T> s0 = new ArrayList<>();
    public final bpn0 v0 = new bpn0(new t(this, 6));
    public final bpn0 w0 = new bpn0(new sx0(this, 3));
    public final bpn0 x0 = new bpn0(new com.vk.movika.sdk.base.logic.interactor.b(this, 5));

    /* compiled from: BaseAttachPickerFragment.kt */
    public static class a extends oz50 {
        public final void A(int i) {
            this.j.putInt("maxCount", i);
        }

        public final void y(boolean z) {
            this.j.putBoolean("shouldMeasureTechStats", z);
        }

        public final void z(int i) {
            this.j.putInt("allowedCount", i);
        }
    }

    /* compiled from: BaseAttachPickerFragment.kt */
    public static final class b<T extends Serializer.StreamParcelable> {
        public static final int e;
        public final ViewGroup a;
        public final zom0<T> b;
        public final View c;
        public izs<? super Boolean, s3q0> d;

        static {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            e3m.a aVar = e3m.a;
            e = context.getColor(android.R.color.transparent);
        }

        public /* synthetic */ b(ViewGroup viewGroup, zom0 zom0Var) {
            this(viewGroup, zom0Var, R.layout.attachpicker_check_view);
        }

        public final void a(T t) {
            if (t == null) {
                return;
            }
            zom0<T> zom0Var = this.b;
            boolean contains = zom0Var != null ? zom0Var.a.contains(t) : false;
            this.a.setBackgroundColor(contains ? dhr0.t.c(R.attr.vk_ui_write_bar_input_background) : e);
            bwt0.p0(this.c, contains);
            izs<? super Boolean, s3q0> izsVar = this.d;
            if (izsVar != null) {
                izsVar.invoke(Boolean.valueOf(contains));
            }
        }

        public b(ViewGroup viewGroup, zom0<T> zom0Var, int i) {
            this.a = viewGroup;
            this.b = zom0Var;
            View I = bwt0.I(i, viewGroup, false);
            this.c = I;
            viewGroup.addView(I);
        }
    }

    /* compiled from: BaseAttachPickerFragment.kt */
    public static final class c extends RecyclerView.t {
        public final /* synthetic */ BaseAttachPickerFragment<T, VH> b;

        public c(BaseAttachPickerFragment<T, VH> baseAttachPickerFragment) {
            this.b = baseAttachPickerFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            l0i0 l0i0Var;
            VkSearchView vkSearchView;
            if (i2 <= 0 || (l0i0Var = this.b.U) == null || (vkSearchView = l0i0Var.h) == null) {
                return;
            }
            vkSearchView.d0();
        }
    }

    /* compiled from: BaseAttachPickerFragment.kt */
    public static final class d implements c.l<VkPaginationList<T>> {
        public final /* synthetic */ BaseAttachPickerFragment<T, VH> b;

        public d(BaseAttachPickerFragment<T, VH> baseAttachPickerFragment) {
            this.b = baseAttachPickerFragment;
        }

        @Override // com.vk.lists.c.k
        public final q<VkPaginationList<T>> hj(com.vk.lists.c cVar, boolean z) {
            return ui(0, cVar);
        }

        @Override // com.vk.lists.c.l
        public final q<VkPaginationList<T>> ui(int i, com.vk.lists.c cVar) {
            io.reactivex.rxjava3.disposables.c cVar2;
            BaseAttachPickerFragment<T, VH> baseAttachPickerFragment = this.b;
            io.reactivex.rxjava3.disposables.c cVar3 = baseAttachPickerFragment.S;
            if (cVar3 != null && !cVar3.h() && (cVar2 = baseAttachPickerFragment.S) != null) {
                cVar2.dispose();
            }
            return baseAttachPickerFragment.ko(i, cVar);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<VkPaginationList<T>> qVar, boolean z, com.vk.lists.c cVar) {
            BaseAttachPickerFragment<T, VH> baseAttachPickerFragment = this.b;
            f50 f50Var = new f50(new rh4(1, baseAttachPickerFragment, cVar), 5);
            int i = kwg0.a;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(f50Var, new iwg0());
            baseAttachPickerFragment.S = subscribe;
            if (subscribe == null) {
                return;
            }
            baseAttachPickerFragment.eo(subscribe);
        }
    }

    /* compiled from: BaseAttachPickerFragment.kt */
    public static final class e implements l0i0.b {
        public final /* synthetic */ BaseAttachPickerFragment<T, VH> a;

        public e(BaseAttachPickerFragment<T, VH> baseAttachPickerFragment) {
            this.a = baseAttachPickerFragment;
        }

        @Override // xsna.l0i0.b
        public final void a(String str) {
            if (str == null || str.length() == 0) {
                this.a.vo("");
            }
        }

        @Override // xsna.l0i0.b
        public final void b(String str) {
            if (str == null) {
                str = "";
            }
            this.a.vo(str);
        }

        @Override // xsna.l0i0.b
        public final void c(String str) {
            if (str == null) {
                str = "";
            }
            this.a.vo(str);
        }
    }

    /* compiled from: BaseAttachPickerFragment.kt */
    public static final class f implements Runnable {
        public final /* synthetic */ BaseAttachPickerFragment<T, VH> b;

        public f(BaseAttachPickerFragment<T, VH> baseAttachPickerFragment) {
            this.b = baseAttachPickerFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView;
            BaseAttachPickerFragment<T, VH> baseAttachPickerFragment = this.b;
            VkRecyclerPaginatedView vkRecyclerPaginatedView = baseAttachPickerFragment.Z;
            if (vkRecyclerPaginatedView == null || (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) == null) {
                return;
            }
            if (recyclerView.isComputingLayout()) {
                if (baseAttachPickerFragment.isResumed()) {
                    u1u0.b.removeCallbacks(this);
                    u1u0.f(200L, this);
                    return;
                }
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: BaseAttachPickerFragment.kt */
    public static final class g implements c.l<VkPaginationList<T>> {
        public final /* synthetic */ BaseAttachPickerFragment<T, VH> b;

        public g(BaseAttachPickerFragment<T, VH> baseAttachPickerFragment) {
            this.b = baseAttachPickerFragment;
        }

        @Override // com.vk.lists.c.k
        public final q<VkPaginationList<T>> hj(com.vk.lists.c cVar, boolean z) {
            BaseAttachPickerFragment<T, VH> baseAttachPickerFragment = this.b;
            ArrayList<T> arrayList = baseAttachPickerFragment.s0;
            if (arrayList.isEmpty()) {
                return baseAttachPickerFragment.po(0, cVar);
            }
            boolean z2 = false;
            int i = baseAttachPickerFragment.r0;
            if (arrayList.size() < baseAttachPickerFragment.r0) {
                z2 = true;
            }
            return q.T(new VkPaginationList(arrayList, i, z2, 0, 8, null));
        }

        @Override // com.vk.lists.c.l
        public final q<VkPaginationList<T>> ui(int i, com.vk.lists.c cVar) {
            return this.b.po(i, cVar);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<VkPaginationList<T>> qVar, final boolean z, final com.vk.lists.c cVar) {
            final BaseAttachPickerFragment<T, VH> baseAttachPickerFragment = this.b;
            io.reactivex.rxjava3.functions.f<? super VkPaginationList<T>> fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.k56
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    VkPaginationList vkPaginationList = (VkPaginationList) obj;
                    BaseAttachPickerFragment baseAttachPickerFragment2 = BaseAttachPickerFragment.this;
                    baseAttachPickerFragment2.e0 = true;
                    ArrayList<T> arrayList = baseAttachPickerFragment2.s0;
                    l0i0 l0i0Var = baseAttachPickerFragment2.U;
                    if (l0i0Var != null) {
                        l0i0Var.c.setVisible(true);
                    }
                    if (myc0.f(baseAttachPickerFragment2.q0)) {
                        return;
                    }
                    List<T> list = vkPaginationList.b;
                    int i = vkPaginationList.c;
                    int size = list.size();
                    com.vk.lists.c cVar2 = cVar;
                    boolean z2 = cVar2.i() + size < i;
                    cVar2.l(i);
                    if (!z || arrayList.isEmpty()) {
                        arrayList.clear();
                        arrayList.addAll(list);
                        baseAttachPickerFragment2.r0 = i;
                    }
                    awu awuVar = baseAttachPickerFragment2.a0;
                    if (awuVar != null) {
                        if (arrayList.isEmpty()) {
                            awuVar.setItems(list);
                        } else {
                            awuVar.n0(list);
                        }
                    }
                    if (!z2) {
                        cVar2.r(false);
                    } else {
                        awu awuVar2 = baseAttachPickerFragment2.a0;
                        cVar2.q(awuVar2 != null ? awuVar2.getItemCount() : 0);
                    }
                }
            };
            int i = kwg0.a;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(fVar, new iwg0());
            if (subscribe == null) {
                return;
            }
            baseAttachPickerFragment.eo(subscribe);
        }
    }

    /* compiled from: BaseAttachPickerFragment.kt */
    public static final class h implements izs<VKList<T>, VkPaginationList<T>> {
        @Override // xsna.izs
        public final Object invoke(Object obj) {
            VKList vKList = (VKList) obj;
            return new VkPaginationList(vKList, vKList.i(), vKList.k() == 1, 0, 8, null);
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // xsna.iin0
    public ViewGroup Wj(Context context) {
        Toolbar toolbar = this.X;
        if (toolbar != null) {
            g3p0.c(toolbar);
        }
        return this.Y;
    }

    @Override // xsna.txt0
    public RecyclerView.e0 bn(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final j34 io() {
        j34 a2 = rwi.d().p().a(this);
        if (a2 != null) {
            return a2;
        }
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                r0 = getActivity();
                if (!(r0 != 0 ? r0 instanceof j34 : true)) {
                    r0 = 0;
                }
            } else {
                if (r0 instanceof j34) {
                    break;
                }
                r0 = r0.getParentFragment();
            }
        }
        return (j34) r0;
    }

    public int jo() {
        return this.k0;
    }

    public abstract q<VkPaginationList<T>> ko(int i, com.vk.lists.c cVar);

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    public Bundle lo(String str) {
        zom0<T> zom0Var = this.c0;
        zom0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(str, new ArrayList<>(zom0Var.a));
        return bundle;
    }

    public String mo() {
        return this.l0;
    }

    public String no() {
        return this.m0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f0 = rwi.d().p().d(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.attach_counter_view) {
            so();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        UserId c2;
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.g0 = arguments != null ? arguments.getInt("allowedCount", 10) : 10;
        Bundle arguments2 = getArguments();
        this.h0 = arguments2 != null ? arguments2.getInt("maxCount", 10) : 10;
        this.i0 = !(getArguments() != null ? r0.getBoolean(Ad.d, false) : false);
        Bundle arguments3 = getArguments();
        this.d0 = arguments3 != null ? arguments3.getBoolean("search", true) : true;
        Bundle arguments4 = getArguments();
        this.j0 = arguments4 != null ? arguments4.getBoolean("newPosting", false) : false;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (c2 = (UserId) arguments5.getParcelable("uid")) == null) {
            c2 = o25.a().c();
        }
        this.b0 = c2;
        zom0<T> zom0Var = this.c0;
        if (bundle != null && bundle.containsKey("selection") && (parcelableArrayList = bundle.getParcelableArrayList("selection")) != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                zom0Var.a.add((Serializer.StreamParcelable) it.next());
                BaseAttachPickerFragment baseAttachPickerFragment = zom0Var.b;
                if (baseAttachPickerFragment != null) {
                    baseAttachPickerFragment.to(baseAttachPickerFragment.c0.a.size());
                }
            }
        }
        zom0Var.b = this;
        b34<T, VH> b34Var = new b34<>(this, zom0Var);
        this.a0 = b34Var;
        boolean qo = qo();
        b34Var.o = qo;
        b34.a<T> aVar = b34Var.l;
        if (qo) {
            b34Var.K0(aVar);
        } else {
            b34Var.T0(aVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Menu menu2;
        Toolbar toolbar = this.X;
        if (toolbar != null && (menu2 = toolbar.getMenu()) != null) {
            menu2.clear();
        }
        l0i0 l0i0Var = this.U;
        if (l0i0Var != null) {
            Toolbar toolbar2 = this.X;
            l0i0Var.a(toolbar2 != null ? toolbar2.getMenu() : null, menuInflater);
        }
        l0i0 l0i0Var2 = this.U;
        if (l0i0Var2 != null) {
            l0i0Var2.c.setVisible(this.d0 && this.e0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(jo(), viewGroup, false);
        this.Y = (AppBarLayout) inflate.findViewById(R.id.attach_appbar_layout);
        this.X = (Toolbar) inflate.findViewById(R.id.toolbar);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        oo().onDestroy();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.vk.lists.c cVar = this.u0;
        if (cVar != null) {
            cVar.v();
        }
        this.u0 = null;
        com.vk.lists.c cVar2 = this.t0;
        if (cVar2 != null) {
            cVar2.v();
        }
        this.t0 = null;
        this.Z = null;
        this.U = null;
        this.X = null;
        this.Y = null;
        this.W = null;
        this.V = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zom0<T> zom0Var = this.c0;
        zom0Var.getClass();
        bundle.putParcelableArrayList("selection", new ArrayList<>(zom0Var.a));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Toolbar toolbar;
        eu supportActionBar;
        super.onViewCreated(view, bundle);
        int i = 1;
        setHasOptionsMenu(true);
        this.U = new l0i0((Activity) getActivity(), (l0i0.b) this.p0);
        Toolbar toolbar2 = this.X;
        Menu menu = toolbar2 != null ? toolbar2.getMenu() : null;
        FragmentActivity activity = getActivity();
        onCreateOptionsMenu(menu, activity != null ? activity.getMenuInflater() : null);
        this.W = (ViewGroup) view.findViewById(R.id.attach_counter_view_wrapper);
        VkButton vkButton = (VkButton) view.findViewById(R.id.attach_counter_view);
        this.V = vkButton;
        if (vkButton != null) {
            vkButton.setOnClickListener(this);
        }
        if (this.j0) {
            ViewGroup viewGroup = this.W;
            if (viewGroup != null) {
                bwt0.c0(e3m.a(R.dimen.picker_attach_posting_btn_height, requireContext()), viewGroup);
            }
            VkButton vkButton2 = this.V;
            if (vkButton2 != null) {
                vkButton2.setText(requireContext().getString(R.string.picker_done));
            }
            VkButton vkButton3 = this.V;
            if (vkButton3 != null) {
                bwt0.c0(iah0.a(44), vkButton3);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.attachpicker_warning_single_mode_text);
        if (textView != null) {
            awt0.v(textView, this.j0);
        }
        FragmentActivity activity2 = getActivity();
        AppCompatActivity appCompatActivity = activity2 instanceof AppCompatActivity ? (AppCompatActivity) activity2 : null;
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(this.X);
        }
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getBoolean("closeBtn", true) : true) && appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_icon_arrow_left_outline_28, appCompatActivity);
            if (a2 != null) {
                a2.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_accent_themed), PorterDuff.Mode.SRC_IN);
                supportActionBar.n(true);
                supportActionBar.r(a2);
                supportActionBar.p();
            }
        }
        AppBarLayout appBarLayout = this.Y;
        if (appBarLayout != null) {
            bwt0.p0(appBarLayout, !this.f0);
        }
        getActivity();
        this.T = new LinearLayoutManager();
        VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) view.findViewById(R.id.attach_recycler_view);
        boolean z = false;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.setAdapter(this.a0);
            vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
            vkRecyclerPaginatedView.getRecyclerView().setLayoutManager(this.T);
            vkRecyclerPaginatedView.getRecyclerView().addOnScrollListener(new c(this));
            vkRecyclerPaginatedView.setLoaderVisibilityChangeListener(new xl0(this, 6));
        } else {
            vkRecyclerPaginatedView = null;
        }
        this.Z = vkRecyclerPaginatedView;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.setOnClickListener(null);
        }
        c.h hVar = new c.h((d) this.w0.getValue());
        hVar.i = 50;
        hVar.c = 5;
        hVar.g = false;
        this.u0 = com.vk.lists.f.a(hVar, this.Z);
        c.h hVar2 = new c.h((g) this.v0.getValue());
        hVar2.i = 50;
        hVar2.c = 5;
        this.t0 = com.vk.lists.f.a(hVar2, this.Z);
        VkRecyclerPaginatedView vkRecyclerPaginatedView2 = this.Z;
        if (vkRecyclerPaginatedView2 != null) {
            vkRecyclerPaginatedView2.e0();
        }
        if (!dhr0.M() && !this.f0) {
            z = true;
        }
        sp.u(view, z);
        if (!this.f0 || (toolbar = this.X) == null) {
            return;
        }
        toolbar.setNavigationOnClickListener(new ne3(this, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final c34 oo() {
        return (c34) this.n0.getValue();
    }

    public abstract q<VkPaginationList<T>> po(int i, com.vk.lists.c cVar);

    public boolean qo() {
        return false;
    }

    public final boolean ro(T t) {
        zom0<T> zom0Var = this.c0;
        ArrayList<T> arrayList = zom0Var.a;
        ArrayList<T> arrayList2 = zom0Var.a;
        if (arrayList.contains(t)) {
            arrayList2.remove(t);
            BaseAttachPickerFragment baseAttachPickerFragment = zom0Var.b;
            if (baseAttachPickerFragment != null) {
                baseAttachPickerFragment.to(baseAttachPickerFragment.c0.a.size());
            }
            return true;
        }
        if (arrayList2.size() + 1 > this.g0) {
            int i = this.h0;
            cvk.v(i == 1 ? R.string.attachments_limit_one : R.string.attachments_limit, Integer.valueOf(i));
            return false;
        }
        arrayList2.add(t);
        BaseAttachPickerFragment baseAttachPickerFragment2 = zom0Var.b;
        if (baseAttachPickerFragment2 != null) {
            baseAttachPickerFragment2.to(baseAttachPickerFragment2.c0.a.size());
        }
        return true;
    }

    public final void so() {
        Intent intent;
        oo().b();
        Intent putExtras = new Intent().putExtras(lo(mo()));
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            UserId userId = (UserId) intent.getParcelableExtra("owner_id");
            if (userId != null) {
                putExtras.putExtra("owner_id", userId);
            }
            int intExtra = intent.getIntExtra("post_id", 0);
            if (intExtra != 0) {
                putExtras.putExtra("post_id", intExtra);
            }
        }
        oo().a(putExtras);
        j34 io2 = io();
        if (io2 != null) {
            io2.V2(putExtras);
        }
    }

    public final void to(int i) {
        VkButton vkButton = this.V;
        if (vkButton != null) {
            vkButton.setCount(Integer.valueOf(this.j0 ? 1 : i));
        }
        ViewGroup viewGroup = this.W;
        int i2 = 0;
        if (viewGroup != null) {
            bwt0.p0(viewGroup, this.c0.a.size() > 0 && !this.f0);
        }
        if (this.f0) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            cuz.a(activity).c(new Intent("count").putExtra("count", i));
            return;
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (vkRecyclerPaginatedView != null ? vkRecyclerPaginatedView.getLayoutParams() : null);
        ViewGroup viewGroup2 = this.W;
        if (viewGroup2 != null && bwt0.K(viewGroup2) && this.j0) {
            Context context = e43.a;
            i2 = e3m.a(R.dimen.picker_attach_posting_btn_height, context != null ? context : null);
        } else {
            ViewGroup viewGroup3 = this.W;
            if (viewGroup3 != null && bwt0.K(viewGroup3)) {
                Context context2 = e43.a;
                i2 = e3m.a(R.dimen.picker_attach_btn_height, context2 != null ? context2 : null);
            }
        }
        marginLayoutParams.bottomMargin = i2;
        VkRecyclerPaginatedView vkRecyclerPaginatedView2 = this.Z;
        if (vkRecyclerPaginatedView2 != null) {
            vkRecyclerPaginatedView2.requestLayout();
        }
    }

    @Override // xsna.fux
    /* renamed from: uo, reason: merged with bridge method [inline-methods] */
    public void li(T t, int i) {
        if (this.i0 && ro(t)) {
            b34<T, VH> b34Var = this.a0;
            if (b34Var != null) {
                b34Var.notifyItemChanged(i);
                return;
            }
            return;
        }
        if (this.i0) {
            return;
        }
        oo().b();
        Intent putExtra = new Intent().putExtra(no(), t);
        oo().a(putExtra);
        j34 io2 = io();
        if (io2 != null) {
            io2.V2(putExtra);
        }
    }

    public void vo(String str) {
        com.vk.lists.c cVar;
        RecyclerView recyclerView;
        VkRecyclerPaginatedView vkRecyclerPaginatedView;
        RecyclerView recyclerView2;
        if (epx.f(this.q0, str)) {
            return;
        }
        this.q0 = str;
        b34<T, VH> b34Var = this.a0;
        if (b34Var != null) {
            b34Var.clear();
            b34Var.W0(0);
            h2u<T> h2uVar = b34Var.k;
            b34Var.n = false;
            b34Var.T0(h2uVar);
        }
        boolean z = TextUtils.isEmpty(str) || TextUtils.getTrimmedLength(str) == 0;
        b34<T, VH> b34Var2 = this.a0;
        if (b34Var2 != null) {
            boolean z2 = z && qo();
            b34.a<T> aVar = b34Var2.l;
            b34Var2.o = z2;
            if (z2) {
                b34Var2.K0(aVar);
            } else {
                b34Var2.T0(aVar);
            }
        }
        LinearLayoutManager linearLayoutManager = this.T;
        if ((linearLayoutManager != null ? linearLayoutManager.v() : 0) > 50 && (vkRecyclerPaginatedView = this.Z) != null && (recyclerView2 = vkRecyclerPaginatedView.getRecyclerView()) != null) {
            recyclerView2.scrollToPosition(30);
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView2 = this.Z;
        if (vkRecyclerPaginatedView2 != null && (recyclerView = vkRecyclerPaginatedView2.getRecyclerView()) != null) {
            recyclerView.smoothScrollToPosition(0);
        }
        com.vk.lists.c cVar2 = this.u0;
        if (cVar2 == null || (cVar = this.t0) == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.S;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        if (z) {
            cVar2.v();
            cVar2.r(false);
            cVar.r(true);
            cVar.b(this.Z, true, false, 0L, null);
            return;
        }
        cVar.v();
        cVar2.b(this.Z, false, false, 0L, null);
        cVar2.r(true);
        cVar2.p(false);
    }
}
