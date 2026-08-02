package com.sports.insider.ui.news.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.z;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.i;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.R;
import com.sports.insider.ui.news.fragment.NewsFragment;
import ec.e;
import eg.c0;
import eg.m0;
import he.c;
import java.util.ArrayList;
import java.util.List;
import je.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lg.d;
import rd.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sports/insider/ui/news/fragment/NewsFragment;", "Lrd/a;", "Lec/e;", "Lud/a;", "Landroidx/swiperefreshlayout/widget/i;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NewsFragment extends a<e> implements ud.a, i {

    /* renamed from: b, reason: collision with root package name */
    public c f6919b;

    /* renamed from: c, reason: collision with root package name */
    public final ie.a f6920c;

    /* renamed from: d, reason: collision with root package name */
    public final ie.a f6921d;

    /* renamed from: e, reason: collision with root package name */
    public final ie.a f6922e;

    /* renamed from: f, reason: collision with root package name */
    public final z f6923f = new z(1, this);

    /* JADX WARN: Type inference failed for: r0v0, types: [ie.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ie.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ie.a] */
    public NewsFragment() {
        final int i5 = 0;
        this.f6920c = new q0(this) { // from class: ie.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFragment f11234b;

            {
                this.f11234b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                he.c cVar;
                e eVar;
                SwipeRefreshLayout swipeRefreshLayout;
                switch (i5) {
                    case 0:
                        List newList = (List) obj;
                        if (newList != null && (cVar = this.f11234b.f6919b) != null) {
                            Intrinsics.checkNotNullParameter(newList, "news");
                            he.a aVar = cVar.f10588b;
                            ArrayList oldList = cVar.f10587a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            u c2 = androidx.recyclerview.widget.d.c(aVar, true);
                            Intrinsics.checkNotNullExpressionValue(c2, "calculateDiff(...)");
                            cVar.f10587a = CollectionsKt.X(newList);
                            c2.f(new androidx.recyclerview.widget.c(cVar));
                            break;
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        NewsFragment newsFragment = this.f11234b;
                        if (newsFragment.isAdded() && (eVar = (e) newsFragment.f22459a) != null && (swipeRefreshLayout = eVar.f8931c) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    default:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            this.f11234b.G().e(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6921d = new q0(this) { // from class: ie.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFragment f11234b;

            {
                this.f11234b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                he.c cVar;
                e eVar;
                SwipeRefreshLayout swipeRefreshLayout;
                switch (i10) {
                    case 0:
                        List newList = (List) obj;
                        if (newList != null && (cVar = this.f11234b.f6919b) != null) {
                            Intrinsics.checkNotNullParameter(newList, "news");
                            he.a aVar = cVar.f10588b;
                            ArrayList oldList = cVar.f10587a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            u c2 = androidx.recyclerview.widget.d.c(aVar, true);
                            Intrinsics.checkNotNullExpressionValue(c2, "calculateDiff(...)");
                            cVar.f10587a = CollectionsKt.X(newList);
                            c2.f(new androidx.recyclerview.widget.c(cVar));
                            break;
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        NewsFragment newsFragment = this.f11234b;
                        if (newsFragment.isAdded() && (eVar = (e) newsFragment.f22459a) != null && (swipeRefreshLayout = eVar.f8931c) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    default:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            this.f11234b.G().e(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6922e = new q0(this) { // from class: ie.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFragment f11234b;

            {
                this.f11234b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                he.c cVar;
                e eVar;
                SwipeRefreshLayout swipeRefreshLayout;
                switch (i11) {
                    case 0:
                        List newList = (List) obj;
                        if (newList != null && (cVar = this.f11234b.f6919b) != null) {
                            Intrinsics.checkNotNullParameter(newList, "news");
                            he.a aVar = cVar.f10588b;
                            ArrayList oldList = cVar.f10587a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            u c2 = androidx.recyclerview.widget.d.c(aVar, true);
                            Intrinsics.checkNotNullExpressionValue(c2, "calculateDiff(...)");
                            cVar.f10587a = CollectionsKt.X(newList);
                            c2.f(new androidx.recyclerview.widget.c(cVar));
                            break;
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        NewsFragment newsFragment = this.f11234b;
                        if (newsFragment.isAdded() && (eVar = (e) newsFragment.f22459a) != null && (swipeRefreshLayout = eVar.f8931c) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    default:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            this.f11234b.G().e(false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_news, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) y3.j(R.id.news_recycler, inflate);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.news_recycler)));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
        e eVar = new e(swipeRefreshLayout, recyclerView, swipeRefreshLayout);
        Intrinsics.checkNotNullExpressionValue(eVar, "inflate(...)");
        return eVar;
    }

    public final b G() {
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6919b = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f6919b = null;
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerView recyclerView;
        e eVar = (e) this.f22459a;
        if (eVar != null && (recyclerView = eVar.f8930b) != null) {
            recyclerView.setAdapter(null);
        }
        e eVar2 = (e) this.f22459a;
        if (eVar2 != null && (swipeRefreshLayout = eVar2.f8931c) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onPause();
        e eVar = (e) this.f22459a;
        if (eVar != null && (swipeRefreshLayout = eVar.f8931c) != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        c cVar = this.f6919b;
        if (cVar != null) {
            cVar.f10589c = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onResume();
        e eVar = (e) this.f22459a;
        if (eVar != null && (swipeRefreshLayout = eVar.f8931c) != null) {
            swipeRefreshLayout.setEnabled(true);
        }
        c cVar = this.f6919b;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(this, "listener");
            cVar.f10589c = this;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onStart();
        G().getClass();
        b G = G();
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        G.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (G.f18472i == null) {
            G.f18472i = new we.a(context);
        }
        we.a aVar = G().f18472i;
        if (aVar != null) {
            aVar.e(getViewLifecycleOwner(), this.f6922e);
        }
        G().f18467d.e(getViewLifecycleOwner(), this.f6921d);
        G().f18469f.e(getViewLifecycleOwner(), this.f6920c);
        e eVar = (e) this.f22459a;
        if (eVar != null) {
            eVar.f8930b.addOnScrollListener(this.f6923f);
        }
        e eVar2 = (e) this.f22459a;
        if (eVar2 != null && (swipeRefreshLayout = eVar2.f8931c) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        Parcelable parcelable = G().j;
        if (parcelable != null) {
            e0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.z g10 = d1.g(viewLifecycleOwner);
            lg.e eVar3 = m0.f9201a;
            c0.t(g10, d.f20063c, null, new androidx.lifecycle.c(this, parcelable, (Continuation) null, 19), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onStop();
        G().getClass();
        b G = G();
        e eVar = (e) this.f22459a;
        k1 layoutManager = eVar != null ? eVar.f8930b.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        G.j = linearLayoutManager != null ? linearLayoutManager.onSaveInstanceState() : null;
        we.a aVar = G().f18472i;
        if (aVar != null) {
            aVar.i(this.f6922e);
        }
        G().f18467d.i(this.f6921d);
        G().f18469f.i(this.f6920c);
        e eVar2 = (e) this.f22459a;
        if (eVar2 != null) {
            eVar2.f8930b.removeOnScrollListener(this.f6923f);
        }
        e eVar3 = (e) this.f22459a;
        if (eVar3 == null || (swipeRefreshLayout = eVar3.f8931c) == null) {
            return;
        }
        swipeRefreshLayout.setOnRefreshListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        e eVar = (e) this.f22459a;
        if (eVar == null || (recyclerView = eVar.f8930b) == null) {
            return;
        }
        recyclerView.setAdapter(this.f6919b);
    }

    @Override // androidx.swiperefreshlayout.widget.i
    public final void p() {
        G().e(true);
    }

    @Override // ud.a
    public final /* bridge */ void c(String str) {
    }
}
