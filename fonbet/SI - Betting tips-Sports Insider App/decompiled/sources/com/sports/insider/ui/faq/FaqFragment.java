package com.sports.insider.ui.faq;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.R;
import da.d;
import eg.m0;
import fe.b;
import io.sentry.internal.debugmeta.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lg.e;
import te.q;
import ud.a;
import y1.c0;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sports/insider/ui/faq/FaqFragment;", "Landroidx/fragment/app/Fragment;", "Lud/a;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class FaqFragment extends Fragment implements a {

    /* renamed from: a, reason: collision with root package name */
    public c f6907a;

    public fe.c G() {
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "owner");
        o1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        m1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        t1.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(b.class, "modelClass");
        Intrinsics.checkNotNullParameter(b.class, "<this>");
        ag.c modelClass = Reflection.getOrCreateKotlinClass(b.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (b) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void c(String str) {
        c0 c0Var;
        if (Intrinsics.areEqual(str, "Academy")) {
            str = null;
        }
        try {
            r r5 = a.a.r(this);
            if (str == null) {
                c0Var = new y1.a(R.id.action_faqFragment_to_academyFragment);
            } else {
                d dVar = new d();
                dVar.c(str);
                c0Var = dVar;
            }
            Intrinsics.checkNotNull(c0Var);
            r5.d(c0Var);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getWindow().setSoftInputMode(34);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.faq_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) y3.j(R.id.faq_recycler, inflate);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.faq_recycler)));
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.f6907a = new c(5, linearLayout, recyclerView);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f6907a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        c cVar = this.f6907a;
        if (cVar != null) {
            ((RecyclerView) cVar.f16518c).setAdapter(G().e());
        }
        F();
        fe.c G = G();
        G.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        q qVar = G.f9615m;
        if (qVar != null) {
            Intrinsics.checkNotNullParameter(this, "listener");
            qVar.f23915c = this;
        }
        Parcelable parcelable = G().f9616n;
        if (parcelable != null) {
            z g10 = d1.g(this);
            e eVar = m0.f9201a;
            eg.c0.t(g10, lg.d.f20063c, null, new td.b(this, parcelable, null, 0), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        fe.c G = G();
        c cVar = this.f6907a;
        k1 layoutManager = cVar != null ? ((RecyclerView) cVar.f16518c).getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        G.f9616n = linearLayoutManager != null ? linearLayoutManager.onSaveInstanceState() : null;
        q qVar = G().f9615m;
        if (qVar != null) {
            qVar.f23915c = null;
        }
        c cVar2 = this.f6907a;
        if (cVar2 != null) {
            ((RecyclerView) cVar2.f16518c).setAdapter(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        G().f();
    }

    public void F() {
    }
}
