package com.vk.documents.impl.ui.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.id.UserId;
import com.vk.file_picker.FilePickerFragment;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vkontakte.android.R;
import com.vkontakte.android.api.DocsGetTypesResult;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abg0;
import xsna.asu0;
import xsna.awt0;
import xsna.awu;
import xsna.bvn;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dvn;
import xsna.epx;
import xsna.f4m;
import xsna.ft9;
import xsna.fux;
import xsna.g3p0;
import xsna.gvn;
import xsna.gz80;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.j34;
import xsna.jbs;
import xsna.jjc;
import xsna.l0i0;
import xsna.l50;
import xsna.msy;
import xsna.n14;
import xsna.nf1;
import xsna.ng3;
import xsna.nun;
import xsna.o14;
import xsna.oz50;
import xsna.qa;
import xsna.rsg0;
import xsna.s3q0;
import xsna.tk5;
import xsna.to;
import xsna.tp0;
import xsna.u3d0;
import xsna.usn0;
import xsna.vif0;
import xsna.vs;
import xsna.wun;
import xsna.xtn;
import xsna.y9r;
import xsna.ysg0;
import xsna.z1q0;
import xsna.zom0;
import xsna.zx0;

/* compiled from: AttachDocumentsFragment.kt */
/* loaded from: classes18.dex */
public final class AttachDocumentsFragment extends BaseAttachPickerFragment<Document, b> implements u3d0<Document>, l0i0.c, View.OnClickListener, y9r {
    public static final /* synthetic */ int R0 = 0;
    public CoordinatorLayout D0;
    public nun E0;
    public ViewPager F0;
    public View G0;
    public View H0;
    public VKTabLayout I0;
    public ProgressBar J0;
    public ViewGroup K0;
    public ViewStub L0;
    public View M0;
    public boolean N0;
    public io.reactivex.rxjava3.disposables.c P0;
    public final int z0 = R.layout.attachpicker_fragment_documents;
    public final String A0 = "mDocuments";
    public final String B0 = "document";
    public final dvn C0 = new dvn();
    public final z1q0 O0 = new z1q0(0);
    public final Object Q0 = msy.a(LazyThreadSafetyMode.NONE, new j(this, 6));

    /* compiled from: AttachDocumentsFragment.kt */
    public static final class a extends BaseAttachPickerFragment.a {
    }

    /* compiled from: AttachDocumentsFragment.kt */
    public static final class b extends wun.a {
        public final fux<Document> t;
        public final u3d0<Document> u;
        public final BaseAttachPickerFragment.b<Document> v;

        /* compiled from: AttachDocumentsFragment.kt */
        public static final class a implements izs<Boolean, s3q0> {
            public a() {
            }

            @Override // xsna.izs
            public final s3q0 invoke(Boolean bool) {
                int a = bool.booleanValue() ? iah0.a(40) : 0;
                b bVar = b.this;
                TextView textView = bVar.q;
                TextView textView2 = bVar.r;
                ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = a;
                }
                ViewGroup.LayoutParams layoutParams2 = textView2 != null ? textView2.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.rightMargin = a;
                }
                TextView textView3 = bVar.q;
                if (textView3 != null) {
                    textView3.requestLayout();
                }
                if (textView2 != null) {
                    textView2.requestLayout();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(ViewGroup viewGroup, zom0<Document> zom0Var, fux<? super Document> fuxVar, u3d0<? super Document> u3d0Var, boolean z) {
            super(viewGroup, null, null);
            this.t = fuxVar;
            this.u = u3d0Var;
            BaseAttachPickerFragment.b<Document> bVar = new BaseAttachPickerFragment.b<>((ViewGroup) this.itemView, zom0Var, z ? R.layout.attachpicker_check_on_circle_view : R.layout.attachpicker_check_view);
            this.v = bVar;
            VKImageView vKImageView = this.s;
            if (vKImageView != null) {
                vKImageView.setOnClickListener(this);
            }
            bVar.d = new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.wun.a, android.view.View.OnClickListener
        public final void onClick(View view) {
            Document document;
            Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
            if (valueOf != null && valueOf.intValue() == R.id.holder_document_preview_image) {
                u3d0<Document> u3d0Var = this.u;
                if (u3d0Var != null) {
                    u3d0Var.oe(this.m);
                    return;
                }
                return;
            }
            fux<Document> fuxVar = this.t;
            if (fuxVar == null || (document = (Document) this.m) == null) {
                return;
            }
            fuxVar.li(getAdapterPosition(), document);
        }

        @Override // xsna.wun.a, android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return false;
        }

        @Override // xsna.wun.a, xsna.vif0
        /* renamed from: q6, reason: merged with bridge method [inline-methods] */
        public final void i6(Document document) {
            super.i6(document);
            this.v.a(document);
            bwt0.Z(R.attr.vk_ui_background_content, this.itemView);
        }
    }

    /* compiled from: AttachDocumentsFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocsGetTypesResult.DocType.Type.values().length];
            try {
                iArr[DocsGetTypesResult.DocType.Type.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.TEXTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.ARCHIVES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.GIFS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.IMAGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.MUSIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.VIDEOS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.EBOOKS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocsGetTypesResult.DocType.Type.OTHERS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AttachDocumentsFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            AttachDocumentsFragment attachDocumentsFragment = (AttachDocumentsFragment) this.receiver;
            int i = AttachDocumentsFragment.R0;
            attachDocumentsFragment.oo().d(8);
            return s3q0.a;
        }
    }

    @Override // xsna.txt0
    public final vif0 Cl(ViewGroup viewGroup, zom0 zom0Var) {
        return new b(viewGroup, zom0Var, this, this, this.j0);
    }

    @Override // xsna.y9r
    public final void Fj(int i, Intent intent) {
        View view;
        if (i != 0) {
            oo().b();
            if (intent == null) {
                return;
            }
            xo(103, intent);
            return;
        }
        if (getChildFragmentManager().c.f().isEmpty() || (view = this.M0) == null || !f4m.h(view)) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a b2 = tk5.b(childFragmentManager, childFragmentManager);
        b2.q(getChildFragmentManager().c.f().get(0));
        b2.k(false);
        View view2 = this.M0;
        if (view2 != null) {
            f4m.j(view2);
        }
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, xsna.iin0
    public final ViewGroup Wj(Context context) {
        Toolbar toolbar = this.X;
        if (toolbar == null) {
            return null;
        }
        g3p0.c(toolbar);
        return toolbar;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final int jo() {
        return this.z0;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<Document>> ko(int i, com.vk.lists.c cVar) {
        return rsg0.y0(new xtn(i, this.b0, cVar.k(), this.q0), null, null, 3).U(new qa(new ng3(1, this, cVar), 1));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final String mo() {
        return this.A0;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final String no() {
        return this.B0;
    }

    @Override // xsna.u3d0
    public final void oe(Document document) {
        gvn.e(document, kn(), null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.j0 || i == 103 || i == 101) {
            if (i2 == -1) {
                oo().b();
            }
            if (intent == null) {
                return;
            }
            xo(i, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent;
        oz50 cVar;
        Intent intent2;
        super.onClick(view);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.holder_add_document_from_gallery_btn) {
            FragmentActivity activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                oo().a(intent);
            }
            gvn.a(gvn.a, this, this.g0, false, this.h0, 111, 12);
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.holder_add_document_from_device_btn) {
            if (valueOf != null && valueOf.intValue() == R.id.error_retry) {
                yo();
                return;
            }
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
            oo().a(intent2);
        }
        if (!this.j0) {
            ((bvn) this.Q0.getValue()).a(new jbs(this));
            return;
        }
        ViewStub viewStub = this.L0;
        if (viewStub == null || !bwt0.J(viewStub)) {
            ViewStub viewStub2 = this.L0;
            this.M0 = viewStub2 != null ? viewStub2.inflate() : null;
        }
        View view2 = this.M0;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (gz80.a(30)) {
            cVar = new ExternalFilePickerFragment.a();
            Bundle bundle = cVar.j;
            bundle.putLong("size_limit", 10737418240L);
            bundle.putStringArrayList("unavailable_extensions", arrayList);
        } else {
            cVar = new FilePickerFragment.c(FilePickerFragment.class, null, null);
            Bundle bundle2 = cVar.j;
            bundle2.putLong("size_limit", 10737418240L);
            bundle2.putStringArrayList("unavailable_extensions", arrayList);
        }
        cVar.s(true);
        FragmentImpl f = cVar.f();
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.g(R.id.attachpicker_documents_system_picker_container, f, null);
        aVar.k(false);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E0 = new nun();
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D0 = (CoordinatorLayout) super.onCreateView(layoutInflater, viewGroup, bundle);
        f<Object> fVar = ysg0.b.a;
        to toVar = new to(3);
        fVar.getClass();
        this.P0 = new i0(fVar, toVar).a0(asu0.a.d()).subscribe(new nf1(this, 3));
        return this.D0;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.I0 = null;
        this.H0 = null;
        this.G0 = null;
        ViewPager viewPager = this.F0;
        if (viewPager != null) {
            viewPager.clearOnPageChangeListeners();
        }
        this.F0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.D0 = null;
        io.reactivex.rxjava3.disposables.c cVar = this.P0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.P0 = null;
        super.onDestroyView();
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        super.onViewCreated(view, bundle);
        ((AppCompatActivity) getActivity()).setTitle(R.string.docs);
        this.H0 = view.findViewById(R.id.attachpicker_documents_toolbar_shadow);
        this.G0 = view.findViewById(R.id.attachpicker_documents_holder_document_layout);
        abg0 abg0Var = dhr0.t;
        int c2 = abg0Var.c(R.attr.vk_ui_background_modal);
        View view2 = this.G0;
        if (view2 != null) {
            getResources();
            view2.setBackground(new ft9(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c2, true));
        }
        View view3 = this.G0;
        ((ViewGroup.MarginLayoutParams) (view3 != null ? view3.getLayoutParams() : null)).bottomMargin = iah0.a(6);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.attachpicker_documents_view_pager);
        this.F0 = viewPager;
        if (viewPager != null) {
            viewPager.setAdapter(this.E0);
        }
        VKTabLayout vKTabLayout = (VKTabLayout) view.findViewById(R.id.attachpicker_documents_tab_layout);
        this.I0 = vKTabLayout;
        if (vKTabLayout != null) {
            vKTabLayout.setTabMode(0);
        }
        VKTabLayout vKTabLayout2 = this.I0;
        if (vKTabLayout2 != null) {
            usn0.a(vKTabLayout2);
        }
        this.J0 = (ProgressBar) view.findViewById(R.id.attachpicker_documents_progressbar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.attachpicker_documents_error);
        this.K0 = viewGroup;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.error_retry)) != null) {
            findViewById.setOnClickListener(this);
        }
        this.L0 = (ViewStub) view.findViewById(R.id.attachpicker_documents_system_picker_stub);
        jjc.f(this, view.findViewById(R.id.holder_add_document_from_gallery_btn));
        jjc.f(this, view.findViewById(R.id.holder_add_document_from_device_btn));
        AppBarLayout appBarLayout = this.Y;
        if (appBarLayout != null) {
            bwt0.p0(appBarLayout, true);
        }
        l0i0 l0i0Var = this.U;
        if (l0i0Var != null) {
            l0i0Var.f = this;
        }
        yo();
        view.setBackgroundColor(abg0Var.c(R.attr.vk_ui_background));
        awt0.v(view.findViewById(R.id.attach_counter_divider), this.j0);
        if (this.j0) {
            ViewPager viewPager2 = this.F0;
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener(new o14(this));
            }
            Toolbar toolbar = this.X;
            if (toolbar != null) {
                toolbar.setNavigationOnClickListener(new n14(this, 0));
            }
        }
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<Document>> po(int i, com.vk.lists.c cVar) {
        return q.T(new VkPaginationList(new ArrayList(), 0, false, 0, 8, null));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final boolean qo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            VKTabLayout vKTabLayout = this.I0;
            if (vKTabLayout != null) {
                vKTabLayout.f(this.O0);
            }
            VKTabLayout vKTabLayout2 = this.I0;
            if (vKTabLayout2 != null) {
                vKTabLayout2.setupWithViewPager(this.F0);
            }
        }
    }

    @Override // xsna.l0i0.c
    public final void sg(boolean z) {
        com.vk.lists.c cVar;
        Dialog dialog;
        View currentFocus;
        IBinder windowToken;
        if (!z && this.j0) {
            Fragment parentFragment = getParentFragment();
            androidx.fragment.app.d dVar = parentFragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) parentFragment : null;
            if (dVar != null && (dialog = dVar.s) != null) {
                Object systemService = dialog.getContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                Window window = dialog.getWindow();
                if (window != null && (currentFocus = window.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null && inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 1);
                }
            }
        }
        this.N0 = z;
        if (z && (cVar = this.t0) != null) {
            cVar.p(false);
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
        if (vkRecyclerPaginatedView != null) {
            bwt0.p0(vkRecyclerPaginatedView, z);
        }
        View view = this.G0;
        if (view != null) {
            bwt0.p0(view, !z);
        }
        View view2 = this.H0;
        if (view2 != null) {
            bwt0.p0(view2, !z);
        }
        VKTabLayout vKTabLayout = this.I0;
        if (vKTabLayout != null) {
            bwt0.p0(vKTabLayout, !z);
        }
        ViewPager viewPager = this.F0;
        if (viewPager != null) {
            bwt0.p0(viewPager, !z);
        }
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    /* renamed from: wo, reason: merged with bridge method [inline-methods] */
    public final void li(Document document, int i) {
        if (this.N0 || !this.i0) {
            super.li(document, i);
            nun nunVar = this.E0;
            if (nunVar != null) {
                nunVar.b(document);
                return;
            }
            return;
        }
        if (ro(document)) {
            nun nunVar2 = this.E0;
            if (nunVar2 != null) {
                nunVar2.b(document);
            }
            awu awuVar = this.a0;
            if (awuVar != null) {
                Iterator it = awuVar.y0().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (epx.f((Serializer.StreamParcelable) it.next(), document)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                awu awuVar2 = this.a0;
                if (awuVar2 != null) {
                    awuVar2.notifyItemChanged(i2);
                }
            }
        }
    }

    public final void xo(int i, Intent intent) {
        Intent putParcelableArrayListExtra = new Intent().putParcelableArrayListExtra("documents", gvn.c(i, intent));
        oo().a(putParcelableArrayListExtra);
        j34 io2 = io();
        if (io2 != null) {
            io2.V2(putParcelableArrayListExtra);
        }
    }

    public final void yo() {
        zo(0);
        UserId userId = this.b0;
        this.C0.getClass();
        this.Q.b(dvn.a(userId).subscribe(new l50(new vs(this, 5), 2), new tp0(new zx0(this, 5), 1)));
    }

    public final void zo(int i) {
        VKTabLayout vKTabLayout = this.I0;
        if (vKTabLayout != null) {
            bwt0.p0(vKTabLayout, i == 1);
        }
        View view = this.G0;
        if (view != null) {
            bwt0.p0(view, i == 1);
        }
        ViewPager viewPager = this.F0;
        if (viewPager != null) {
            bwt0.p0(viewPager, i == 1);
        }
        ProgressBar progressBar = this.J0;
        if (progressBar != null) {
            bwt0.p0(progressBar, i == 0);
        }
        ViewGroup viewGroup = this.K0;
        if (viewGroup != null) {
            bwt0.p0(viewGroup, i == 2);
        }
    }
}
