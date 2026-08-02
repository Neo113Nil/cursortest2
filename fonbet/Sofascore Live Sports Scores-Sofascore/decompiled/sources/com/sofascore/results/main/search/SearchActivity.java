package com.sofascore.results.main.search;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.main.search.SearchActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.view.SofaTextInputLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.awg;
import defpackage.bxg;
import defpackage.cwg;
import defpackage.duf;
import defpackage.eqb;
import defpackage.fvg;
import defpackage.g5k;
import defpackage.hwg;
import defpackage.ikj;
import defpackage.joa;
import defpackage.k13;
import defpackage.kp5;
import defpackage.mqi;
import defpackage.otk;
import defpackage.pte;
import defpackage.ql4;
import defpackage.qwg;
import defpackage.te;
import defpackage.ur1;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z3f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/search/SearchActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchActivity extends Hilt_SearchActivity {
    public static final /* synthetic */ int Q = 0;
    public final otk K;
    public final mqi L;
    public final mqi M;
    public final joa N;
    public final mqi O;
    public boolean P;

    public SearchActivity() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.K = new otk(duf.a.getOrCreateKotlinClass(bxg.class), new cwg(this, i2), new cwg(this, i), new cwg(this, i3));
        this.L = ypa.b(new Function0(this) { // from class: bwg
            public final /* synthetic */ SearchActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                SearchActivity searchActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = SearchActivity.Q;
                        Bundle extras = searchActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (hwg) gz8.M(extras, "ENTITY_SEARCH_TYPE", hwg.class);
                        }
                        return null;
                    case 1:
                        int i6 = SearchActivity.Q;
                        View inflate = searchActivity.getLayoutInflater().inflate(R.layout.activity_search, (ViewGroup) null, false);
                        int i7 = R.id.no_internet_view;
                        if (((ViewStub) nq8.B(R.id.no_internet_view, inflate)) != null) {
                            i7 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                i7 = R.id.search_type_selector;
                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.search_type_selector, inflate);
                                if (typeHeaderView != null) {
                                    i7 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        return new te((CoordinatorLayout) inflate, recyclerView, typeHeaderView, z3f.b(B));
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 2:
                        int i8 = SearchActivity.Q;
                        return new qwg(searchActivity, new jaf(1));
                    default:
                        int i9 = SearchActivity.Q;
                        View inflate2 = searchActivity.getLayoutInflater().inflate(R.layout.toolbar_custom_search, (ViewGroup) searchActivity.Q().d.c, false);
                        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.edit_text, inflate2);
                        if (textInputEditText != null) {
                            return new ikj((SofaTextInputLayout) inflate2, textInputEditText);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.edit_text)));
                        return null;
                }
            }
        });
        this.M = ypa.b(new Function0(this) { // from class: bwg
            public final /* synthetic */ SearchActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                SearchActivity searchActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = SearchActivity.Q;
                        Bundle extras = searchActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (hwg) gz8.M(extras, "ENTITY_SEARCH_TYPE", hwg.class);
                        }
                        return null;
                    case 1:
                        int i6 = SearchActivity.Q;
                        View inflate = searchActivity.getLayoutInflater().inflate(R.layout.activity_search, (ViewGroup) null, false);
                        int i7 = R.id.no_internet_view;
                        if (((ViewStub) nq8.B(R.id.no_internet_view, inflate)) != null) {
                            i7 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                i7 = R.id.search_type_selector;
                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.search_type_selector, inflate);
                                if (typeHeaderView != null) {
                                    i7 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        return new te((CoordinatorLayout) inflate, recyclerView, typeHeaderView, z3f.b(B));
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 2:
                        int i8 = SearchActivity.Q;
                        return new qwg(searchActivity, new jaf(1));
                    default:
                        int i9 = SearchActivity.Q;
                        View inflate2 = searchActivity.getLayoutInflater().inflate(R.layout.toolbar_custom_search, (ViewGroup) searchActivity.Q().d.c, false);
                        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.edit_text, inflate2);
                        if (textInputEditText != null) {
                            return new ikj((SofaTextInputLayout) inflate2, textInputEditText);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.edit_text)));
                        return null;
                }
            }
        });
        this.N = ypa.a(ysa.c, new Function0(this) { // from class: bwg
            public final /* synthetic */ SearchActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                SearchActivity searchActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = SearchActivity.Q;
                        Bundle extras = searchActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (hwg) gz8.M(extras, "ENTITY_SEARCH_TYPE", hwg.class);
                        }
                        return null;
                    case 1:
                        int i6 = SearchActivity.Q;
                        View inflate = searchActivity.getLayoutInflater().inflate(R.layout.activity_search, (ViewGroup) null, false);
                        int i7 = R.id.no_internet_view;
                        if (((ViewStub) nq8.B(R.id.no_internet_view, inflate)) != null) {
                            i7 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                i7 = R.id.search_type_selector;
                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.search_type_selector, inflate);
                                if (typeHeaderView != null) {
                                    i7 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        return new te((CoordinatorLayout) inflate, recyclerView, typeHeaderView, z3f.b(B));
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 2:
                        int i8 = SearchActivity.Q;
                        return new qwg(searchActivity, new jaf(1));
                    default:
                        int i9 = SearchActivity.Q;
                        View inflate2 = searchActivity.getLayoutInflater().inflate(R.layout.toolbar_custom_search, (ViewGroup) searchActivity.Q().d.c, false);
                        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.edit_text, inflate2);
                        if (textInputEditText != null) {
                            return new ikj((SofaTextInputLayout) inflate2, textInputEditText);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.edit_text)));
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.O = ypa.b(new Function0(this) { // from class: bwg
            public final /* synthetic */ SearchActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                SearchActivity searchActivity = this.b;
                switch (i42) {
                    case 0:
                        int i5 = SearchActivity.Q;
                        Bundle extras = searchActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (hwg) gz8.M(extras, "ENTITY_SEARCH_TYPE", hwg.class);
                        }
                        return null;
                    case 1:
                        int i6 = SearchActivity.Q;
                        View inflate = searchActivity.getLayoutInflater().inflate(R.layout.activity_search, (ViewGroup) null, false);
                        int i7 = R.id.no_internet_view;
                        if (((ViewStub) nq8.B(R.id.no_internet_view, inflate)) != null) {
                            i7 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                i7 = R.id.search_type_selector;
                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.search_type_selector, inflate);
                                if (typeHeaderView != null) {
                                    i7 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        return new te((CoordinatorLayout) inflate, recyclerView, typeHeaderView, z3f.b(B));
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 2:
                        int i8 = SearchActivity.Q;
                        return new qwg(searchActivity, new jaf(1));
                    default:
                        int i9 = SearchActivity.Q;
                        View inflate2 = searchActivity.getLayoutInflater().inflate(R.layout.toolbar_custom_search, (ViewGroup) searchActivity.Q().d.c, false);
                        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.edit_text, inflate2);
                        if (textInputEditText != null) {
                            return new ikj((SofaTextInputLayout) inflate2, textInputEditText);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.edit_text)));
                        return null;
                }
            }
        });
    }

    public final te Q() {
        return (te) this.M.getValue();
    }

    public final qwg R() {
        return (qwg) this.N.getValue();
    }

    public final bxg S() {
        return (bxg) this.K.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        z3f z3fVar = Q().d;
        int i = 0;
        ((UnderlinedToolbar) Q().d.c).setContentInsetStartWithNavigation(0);
        ((AppCompatTextView) z3fVar.d).setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) z3fVar.b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        linearLayout.setLayoutParams(marginLayoutParams);
        mqi mqiVar = this.O;
        linearLayout.addView(((ikj) mqiVar.getValue()).a);
        AbstractActivity.M(this, Q().d, "", null, null, 44);
        g5k g5kVar = new g5k(Q().c);
        kp5 kp5Var = hwg.h;
        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
        Iterator<E> it = kp5Var.iterator();
        while (it.hasNext()) {
            arrayList.add(getString(((hwg) it.next()).b));
        }
        g5kVar.a = arrayList;
        hwg hwgVar = (hwg) this.L.getValue();
        g5kVar.c = hwgVar != null ? getString(hwgVar.b) : null;
        int i2 = 1;
        g5kVar.j = true;
        g5kVar.m = new ur1(this, 19);
        g5kVar.b();
        RecyclerView recyclerView = Q().b;
        recyclerView.setAdapter(R());
        recyclerView.setLayoutManager(new SearchActivity$onCreate$5$1());
        recyclerView.setHasFixedSize(true);
        qwg R = R();
        fvg fvgVar = new fvg(this, i2);
        R.getClass();
        R.f = fvgVar;
        qwg R2 = R();
        pte pteVar = new pte(this, 17);
        R2.getClass();
        R2.d.d = pteVar;
        R().o(new awg(this, i));
        S().j.e(this, new eqb(23, new awg(this, i2)));
        ((ikj) mqiVar.getValue()).b.addTextChangedListener(new ql4(this, 3));
        ((ikj) mqiVar.getValue()).b.requestFocus();
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "SearchScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
