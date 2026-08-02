package com.sports.insider.ui.strip;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.v0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import c4.m;
import c4.o;
import c4.v;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.strip.FollowPredictionsFragment;
import com.sports.insider.ui.views.EmptySectionFollowView;
import eg.c0;
import eg.m0;
import eg.t1;
import ge.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m2.f0;
import me.y;
import oe.j;
import pe.a;
import pe.b;
import pe.d;
import pe.f;
import pe.h;
import q4.r;
import qe.e;
import r4.g;
import rc.b0;
import t1.c;
import zc.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sports/insider/ui/strip/FollowPredictionsFragment;", "Landroidx/fragment/app/Fragment;", "Lpe/h;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFollowPredictionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowPredictionsFragment.kt\ncom/sports/insider/ui/strip/FollowPredictionsFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 4 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n*L\n1#1,276:1\n1#2:277\n17#3:278\n414#4,5:279\n*S KotlinDebug\n*F\n+ 1 FollowPredictionsFragment.kt\ncom/sports/insider/ui/strip/FollowPredictionsFragment\n*L\n102#1:278\n110#1:279,5\n*E\n"})
/* loaded from: classes.dex */
public final class FollowPredictionsFragment extends Fragment implements h {

    /* renamed from: a, reason: collision with root package name */
    public final a f7020a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7021b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7022c;

    /* renamed from: d, reason: collision with root package name */
    public v0 f7023d;

    /* JADX WARN: Type inference failed for: r0v1, types: [pe.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pe.a] */
    public FollowPredictionsFragment() {
        super(R.layout.follow_predictions_layout);
        final int i5 = 0;
        this.f7020a = new q0(this) { // from class: pe.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FollowPredictionsFragment f21828b;

            {
                this.f21828b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                int i10 = i5;
                FollowPredictionsFragment followPredictionsFragment = this.f21828b;
                switch (i10) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        v0 v0Var = followPredictionsFragment.f7023d;
                        if (v0Var != null) {
                            ((EmptySectionFollowView) v0Var.f365c).setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        List list = (List) obj;
                        if (list != null) {
                            z g10 = d1.g(followPredictionsFragment);
                            lg.e eVar = m0.f9201a;
                            c0.t(g10, jg.q.f18523a, null, new y(followPredictionsFragment, list, null, 9), 2);
                            break;
                        }
                        break;
                }
            }
        };
        this.f7021b = new e();
        final int i10 = 1;
        this.f7022c = new q0(this) { // from class: pe.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FollowPredictionsFragment f21828b;

            {
                this.f21828b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                int i102 = i10;
                FollowPredictionsFragment followPredictionsFragment = this.f21828b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        v0 v0Var = followPredictionsFragment.f7023d;
                        if (v0Var != null) {
                            ((EmptySectionFollowView) v0Var.f365c).setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        List list = (List) obj;
                        if (list != null) {
                            z g10 = d1.g(followPredictionsFragment);
                            lg.e eVar = m0.f9201a;
                            c0.t(g10, jg.q.f18523a, null, new y(followPredictionsFragment, list, null, 9), 2);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final f F() {
        p0 owner = requireActivity();
        Intrinsics.checkNotNullExpressionValue(owner, "requireActivity(...)");
        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
        n factory = new n(9);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        o1 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(f.class, "modelClass");
        ag.c modelClass = u6.h.m(f.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (f) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void G(m mVar) {
        EmptySectionFollowView emptySectionFollowView;
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        Bitmap bitmap = aVar != null ? aVar.f3564a : null;
        v0 v0Var = this.f7023d;
        if (v0Var == null || (emptySectionFollowView = (EmptySectionFollowView) v0Var.f365c) == null) {
            return;
        }
        emptySectionFollowView.setBitmap(bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pe.h
    public final void l(ja.c item) {
        d dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        int i5 = item.f18391d;
        int i10 = item.f18388a;
        if (i5 == 1) {
            d dVar2 = new d();
            dVar2.f21831a.put("id", Integer.valueOf(i10));
            dVar = dVar2;
        } else if (i5 == 2) {
            pe.e eVar = new pe.e();
            eVar.f21832a.put("id", Integer.valueOf(i10));
            dVar = eVar;
        } else if (i5 != 3) {
            dVar = null;
        } else {
            b bVar = new b();
            bVar.f21829a.put("id", Integer.valueOf(i10));
            dVar = bVar;
        }
        if (dVar != null) {
            try {
                a.a.r(this).d(dVar);
            } catch (Exception ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                jg.d dVar3 = MyApp.f6830c;
                lg.e eVar2 = m0.f9201a;
                c0.t(dVar3, lg.d.f20063c, null, new r(ex, null, 18), 2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.follow_predictions_layout, viewGroup, false);
        int i5 = R.id.empty_selection;
        EmptySectionFollowView emptySectionFollowView = (EmptySectionFollowView) y3.j(R.id.empty_selection, inflate);
        if (emptySectionFollowView != null) {
            i5 = R.id.follow_predictions_recycler;
            RecyclerView recyclerView = (RecyclerView) y3.j(R.id.follow_predictions_recycler, inflate);
            if (recyclerView != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                this.f7023d = new v0(frameLayout, emptySectionFollowView, recyclerView, 12);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
                return frameLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        G(null);
        this.f7023d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f7021b.f22131b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7021b.f22131b = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        f F = F();
        F.getClass();
        Continuation continuation = null;
        c0.t(MyApp.f6830c, null, null, new ad.a(F, continuation, 26), 3);
        v0 v0Var = this.f7023d;
        if (v0Var != null) {
            ((RecyclerView) v0Var.f366d).addItemDecoration(F().f21839h);
        }
        v0 v0Var2 = this.f7023d;
        if (v0Var2 != null) {
            ((RecyclerView) v0Var2.f366d).setAdapter(this.f7021b);
        }
        c0.t(d1.g(this), lg.d.f20063c, null, new j(this, F().f21840i, continuation, 9), 2);
        d1.a(F().f21835d).e(getViewLifecycleOwner(), this.f7022c);
        d1.a(F().f21834c).e(getViewLifecycleOwner(), this.f7020a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        f F = F();
        t1 t1Var = F.f21837f;
        if (t1Var != null) {
            t1Var.k(null);
        }
        F.f21837f = null;
        d1.a(F().f21835d).i(this.f7022c);
        d1.a(F().f21834c).i(this.f7020a);
        f F2 = F();
        v0 v0Var = this.f7023d;
        k1 layoutManager = v0Var != null ? ((RecyclerView) v0Var.f366d).getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        F2.f21840i = linearLayoutManager != null ? linearLayoutManager.onSaveInstanceState() : null;
        v0 v0Var2 = this.f7023d;
        if (v0Var2 != null) {
            ((RecyclerView) v0Var2.f366d).removeItemDecoration(F().f21839h);
        }
        v0 v0Var3 = this.f7023d;
        if (v0Var3 != null) {
            ((RecyclerView) v0Var3.f366d).setAdapter(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        F().f21833b.getClass();
        Continuation continuation = null;
        c0.t(MyApp.f6830c, b0.b(), null, new androidx.lifecycle.b(new cd.h(), continuation, 1), 2);
        v0 v0Var = this.f7023d;
        if (v0Var != null) {
            EmptySectionFollowView emptySectionFollowView = (EmptySectionFollowView) v0Var.f365c;
            me.d blockRegular = new me.d(1, new k(), k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 26);
            Intrinsics.checkNotNullParameter(blockRegular, "blockRegular");
            c0.t(emptySectionFollowView.D, null, null, new f0(emptySectionFollowView, blockRegular, continuation, 16), 3);
        }
        v0 v0Var2 = this.f7023d;
        if (v0Var2 != null) {
            EmptySectionFollowView emptySectionFollowView2 = (EmptySectionFollowView) v0Var2.f365c;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer valueOf = Integer.valueOf(R.drawable.ic_empty_list);
            int f7397p = emptySectionFollowView2.getF7397p();
            int f7396o = emptySectionFollowView2.getF7396o();
            o a7 = c4.y.a(context);
            q4.e eVar = new q4.e(context);
            eVar.f21940c = valueOf;
            eVar.f21951o = g.f22299b;
            if (f7397p > 0 || f7396o > 0) {
                eVar.c(f7397p, f7396o);
            }
            q4.b bVar = q4.b.f21930c;
            eVar.f21946i = bVar;
            eVar.f21945h = bVar;
            eVar.j = q4.b.f21931d;
            eVar.f21941d = new i2.d(26, this);
            ((v) a7).a(eVar.a());
        }
    }

    @Override // pe.g
    public final void x(String betText) {
        Intrinsics.checkNotNullParameter(betText, "betText");
        try {
            y1.r r5 = a.a.r(this);
            pe.c cVar = new pe.c();
            cVar.f21830a.put("searchBet", betText);
            Intrinsics.checkNotNullExpressionValue(cVar, "setSearchBet(...)");
            r5.d(cVar);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, null, 18), 2);
        }
    }
}
