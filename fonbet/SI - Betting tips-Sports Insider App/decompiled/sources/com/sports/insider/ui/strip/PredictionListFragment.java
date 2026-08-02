package com.sports.insider.ui.strip;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.z;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c4.o;
import c4.v;
import c4.y;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.strip.PredictionListFragment;
import com.sports.insider.ui.views.EmptySectionView;
import com.sports.insider.ui.views.FloatingActionButton;
import d2.i;
import ec.b0;
import eg.m0;
import eg.t1;
import gf.k;
import gf.t;
import ic.i0;
import ja.c;
import java.util.List;
import jg.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import m2.f0;
import me.a;
import pd.x;
import pe.h;
import pe.j;
import pe.m;
import pe.s;
import qe.e;
import rc.g;
import rd.b;
import y1.c0;
import y1.r;
import zc.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sports/insider/ui/strip/PredictionListFragment;", "Lrd/b;", "Lec/b0;", "Lpe/h;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictionListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionListFragment.kt\ncom/sports/insider/ui/strip/PredictionListFragment\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n*L\n1#1,458:1\n35#2,3:459\n17#2:462\n38#2,6:463\n44#2,2:470\n35#2,3:472\n17#2:475\n40#2,6:476\n38#3:469\n*S KotlinDebug\n*F\n+ 1 PredictionListFragment.kt\ncom/sports/insider/ui/strip/PredictionListFragment\n*L\n246#1:459,3\n246#1:462\n246#1:463,6\n246#1:470,2\n116#1:472,3\n116#1:475\n116#1:476,6\n246#1:469\n*E\n"})
/* loaded from: classes.dex */
public final class PredictionListFragment extends b<b0> implements h {

    /* renamed from: c, reason: collision with root package name */
    public e f7024c;

    /* renamed from: d, reason: collision with root package name */
    public t1 f7025d;

    /* renamed from: e, reason: collision with root package name */
    public final j f7026e;

    /* renamed from: f, reason: collision with root package name */
    public final j f7027f;

    /* renamed from: g, reason: collision with root package name */
    public final j f7028g;

    /* renamed from: h, reason: collision with root package name */
    public final j f7029h;

    /* renamed from: i, reason: collision with root package name */
    public final j f7030i;
    public final j j;

    /* renamed from: k, reason: collision with root package name */
    public final j f7031k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f7032l = new Rect();

    /* renamed from: m, reason: collision with root package name */
    public final t f7033m = k.b(new a(9, this));

    /* renamed from: n, reason: collision with root package name */
    public final j f7034n;

    /* renamed from: o, reason: collision with root package name */
    public final j f7035o;

    /* renamed from: p, reason: collision with root package name */
    public final z f7036p;

    /* JADX WARN: Type inference failed for: r0v0, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v1, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v10, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v11, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v4, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v5, types: [pe.j] */
    /* JADX WARN: Type inference failed for: r0v6, types: [pe.j] */
    public PredictionListFragment() {
        final int i5 = 3;
        this.f7026e = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i5) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 4;
        this.f7027f = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i10) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 5;
        this.f7028g = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i11) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 6;
        this.f7029h = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i12) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 7;
        this.f7030i = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i13) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 8;
        this.j = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i14) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 0;
        this.f7031k = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i15) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 1;
        this.f7034n = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i16) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i17 = 2;
        this.f7035o = new q0(this) { // from class: pe.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionListFragment f21844b;

            {
                this.f21844b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                SwipeRefreshLayout swipeRefreshLayout;
                c0 c0Var;
                boolean z5 = true;
                z5 = true;
                switch (i17) {
                    case 0:
                        PredictionListFragment predictionListFragment = this.f21844b;
                        String str = (String) obj;
                        b0 b0Var4 = (b0) predictionListFragment.f22459a;
                        if (b0Var4 != null) {
                            AppCompatImageView appCompatImageView = b0Var4.f8871d;
                            c4.o a7 = y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str;
                            q4.j.d(eVar, appCompatImageView);
                            eVar.f21942e = new me.n(predictionListFragment, z5 ? 1 : 0);
                            ((v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        PredictionListFragment predictionListFragment2 = this.f21844b;
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (b0Var = (b0) predictionListFragment2.f22459a) != null) {
                            EmptySectionView emptySectionView = b0Var.f8869b;
                            if (!bool.booleanValue()) {
                                emptySectionView.setVisibility(8);
                                break;
                            } else {
                                emptySectionView.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 2:
                        PredictionListFragment predictionListFragment3 = this.f21844b;
                        List list = (List) obj;
                        j jVar = predictionListFragment3.f7034n;
                        if (list != null && !list.isEmpty()) {
                            z5 = false;
                        }
                        jVar.a(Boolean.valueOf(z5));
                        if (list != null) {
                            eg.c0.t(d1.g(predictionListFragment3), null, null, new me.y(predictionListFragment3, list, null, 12), 3);
                            break;
                        }
                        break;
                    case 3:
                        PredictionListFragment predictionListFragment4 = this.f21844b;
                        Integer num = (Integer) obj;
                        if (num != null && (b0Var2 = (b0) predictionListFragment4.f22459a) != null) {
                            b0Var2.f8870c.setVisibility(num.intValue());
                            break;
                        }
                        break;
                    case 4:
                        PredictionListFragment predictionListFragment5 = this.f21844b;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionListFragment5.isAdded() && (b0Var3 = (b0) predictionListFragment5.f22459a) != null && (swipeRefreshLayout = b0Var3.f8876i) != null) {
                            swipeRefreshLayout.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 5:
                        PredictionListFragment predictionListFragment6 = this.f21844b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(predictionListFragment6).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        PredictionListFragment predictionListFragment7 = this.f21844b;
                        ((Boolean) obj).getClass();
                        x G = predictionListFragment7.G();
                        String str2 = gc.d.f9945a;
                        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
                        Boolean bool2 = Boolean.FALSE;
                        G.f21825x = G.f21824w;
                        G.g(bool2, null, null, valueOf);
                        G.f();
                        break;
                    case 7:
                        PredictionListFragment predictionListFragment8 = this.f21844b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        b0 b0Var5 = (b0) predictionListFragment8.f22459a;
                        if (b0Var5 != null) {
                            b0Var5.f8874g.setVisibility(booleanValue2 ? 0 : 4);
                            break;
                        }
                        break;
                    default:
                        PredictionListFragment predictionListFragment9 = this.f21844b;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        b0 b0Var6 = (b0) predictionListFragment9.f22459a;
                        if (b0Var6 != null) {
                            b0Var6.f8872e.setVisibility(booleanValue3 ? 0 : 8);
                        }
                        b0 b0Var7 = (b0) predictionListFragment9.f22459a;
                        if (b0Var7 != null) {
                            b0Var7.f8873f.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        this.f7036p = new z(i17, this);
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.strip_prediction, viewGroup, false);
        int i5 = R.id.empty_selection;
        EmptySectionView emptySectionView = (EmptySectionView) y3.j(R.id.empty_selection, inflate);
        if (emptySectionView != null) {
            i5 = R.id.fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) y3.j(R.id.fab, inflate);
            if (floatingActionButton != null) {
                i5 = R.id.image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.image, inflate);
                if (appCompatImageView != null) {
                    i5 = R.id.imageCross;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.imageCross, inflate);
                    if (appCompatImageView2 != null) {
                        i5 = R.id.imageCrossTouch;
                        View j = y3.j(R.id.imageCrossTouch, inflate);
                        if (j != null) {
                            i5 = R.id.navigateBanner;
                            FrameLayout frameLayout = (FrameLayout) y3.j(R.id.navigateBanner, inflate);
                            if (frameLayout != null) {
                                i5 = R.id.predictions_recycler_strip;
                                RecyclerView recyclerView = (RecyclerView) y3.j(R.id.predictions_recycler_strip, inflate);
                                if (recyclerView != null) {
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                                    b0 b0Var = new b0(swipeRefreshLayout, emptySectionView, floatingActionButton, appCompatImageView, appCompatImageView2, j, frameLayout, recyclerView, swipeRefreshLayout);
                                    Intrinsics.checkNotNullExpressionValue(b0Var, "inflate(...)");
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final s H() {
        return (s) this.f7033m.getValue();
    }

    @Override // rd.b, ve.w0
    public final void k(int i5) {
        if (i5 != 1) {
            if (i5 != 2) {
                return;
            }
            r r5 = a.a.r(this);
            y1.a aVar = new y1.a(R.id.action_global_settingFragment);
            Intrinsics.checkNotNullExpressionValue(aVar, "actionGlobalSettingFragment(...)");
            r5.d(aVar);
            return;
        }
        try {
            r r6 = a.a.r(this);
            y1.a aVar2 = new y1.a(R.id.action_global_viewImageFragment);
            Intrinsics.checkNotNullExpressionValue(aVar2, "actionGlobalViewImageFragment(...)");
            r6.d(aVar2);
        } catch (Exception e7) {
            d.b(4, "toAppEventView", e7);
        }
    }

    @Override // pe.h
    public final void l(c item) {
        Intrinsics.checkNotNullParameter(item, "item");
        s H = H();
        p0 activity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        H.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(activity, "activity");
        u1.a i5 = d1.i(H);
        lg.e eVar = m0.f9201a;
        eg.c0.t(i5, q.f18523a, null, new f0(item, H, activity, (Continuation) null, 10), 2);
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b0 b0Var = (b0) this.f22459a;
        if (b0Var != null) {
            SwipeRefreshLayout swipeRefreshLayout = b0Var.f8876i;
            swipeRefreshLayout.setOnRefreshListener(null);
            swipeRefreshLayout.setRefreshing(false);
        }
        d1.a(H().f21871k).i(this.f7027f);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onPause();
        b0 b0Var = (b0) this.f22459a;
        if (b0Var != null && (swipeRefreshLayout = b0Var.f8876i) != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        b0 b0Var2 = (b0) this.f22459a;
        if (b0Var2 != null) {
            b0Var2.f8870c.setOnClickListener(null);
        }
        b0 b0Var3 = (b0) this.f22459a;
        if (b0Var3 != null) {
            b0Var3.f8875h.removeOnScrollListener(this.f7036p);
        }
        e eVar = this.f7024c;
        if (eVar != null) {
            eVar.f22131b = null;
        }
        b0 b0Var4 = (b0) this.f22459a;
        if (b0Var4 != null) {
            b0Var4.f8873f.setOnClickListener(null);
        }
        b0 b0Var5 = (b0) this.f22459a;
        if (b0Var5 != null) {
            b0Var5.f8874g.setOnClickListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onResume();
        b0 b0Var = (b0) this.f22459a;
        if (b0Var != null && (swipeRefreshLayout = b0Var.f8876i) != null) {
            swipeRefreshLayout.setEnabled(true);
        }
        b0 b0Var2 = (b0) this.f22459a;
        if (b0Var2 != null) {
            final int i5 = 0;
            io.sentry.config.a.y(b0Var2.f8870c, 600L, new Function1(this) { // from class: pe.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionListFragment f21842b;

                {
                    this.f21842b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            b0 b0Var3 = (b0) this.f21842b.f22459a;
                            if (b0Var3 != null) {
                                k1 layoutManager = b0Var3.f8875h.getLayoutManager();
                                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.scrollToPosition(0);
                                }
                            }
                            break;
                        case 1:
                            s H = this.f21842b.H();
                            H.f21882w.set(true);
                            hg.d1 d1Var = H.f21881v;
                            Boolean bool = Boolean.FALSE;
                            d1Var.getClass();
                            d1Var.k(null, bool);
                            H.f21880u.h(bool);
                            break;
                        default:
                            PredictionListFragment predictionListFragment = this.f21842b;
                            s H2 = predictionListFragment.H();
                            Context context = predictionListFragment.getContext();
                            if (context == null) {
                                H2.getClass();
                            } else if (!H2.f21882w.get()) {
                                H2.q.B(context, H2.f21884y, H2.A);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        b0 b0Var3 = (b0) this.f22459a;
        if (b0Var3 != null) {
            b0Var3.f8875h.addOnScrollListener(this.f7036p);
        }
        e eVar = this.f7024c;
        if (eVar != null) {
            eVar.f22131b = this;
        }
        b0 b0Var4 = (b0) this.f22459a;
        if (b0Var4 != null) {
            final int i10 = 1;
            io.sentry.config.a.y(b0Var4.f8873f, 500L, new Function1(this) { // from class: pe.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionListFragment f21842b;

                {
                    this.f21842b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            b0 b0Var32 = (b0) this.f21842b.f22459a;
                            if (b0Var32 != null) {
                                k1 layoutManager = b0Var32.f8875h.getLayoutManager();
                                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.scrollToPosition(0);
                                }
                            }
                            break;
                        case 1:
                            s H = this.f21842b.H();
                            H.f21882w.set(true);
                            hg.d1 d1Var = H.f21881v;
                            Boolean bool = Boolean.FALSE;
                            d1Var.getClass();
                            d1Var.k(null, bool);
                            H.f21880u.h(bool);
                            break;
                        default:
                            PredictionListFragment predictionListFragment = this.f21842b;
                            s H2 = predictionListFragment.H();
                            Context context = predictionListFragment.getContext();
                            if (context == null) {
                                H2.getClass();
                            } else if (!H2.f21882w.get()) {
                                H2.q.B(context, H2.f21884y, H2.A);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        b0 b0Var5 = (b0) this.f22459a;
        if (b0Var5 != null) {
            final int i11 = 2;
            io.sentry.config.a.y(b0Var5.f8874g, 500L, new Function1(this) { // from class: pe.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionListFragment f21842b;

                {
                    this.f21842b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            b0 b0Var32 = (b0) this.f21842b.f22459a;
                            if (b0Var32 != null) {
                                k1 layoutManager = b0Var32.f8875h.getLayoutManager();
                                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.scrollToPosition(0);
                                }
                            }
                            break;
                        case 1:
                            s H = this.f21842b.H();
                            H.f21882w.set(true);
                            hg.d1 d1Var = H.f21881v;
                            Boolean bool = Boolean.FALSE;
                            d1Var.getClass();
                            d1Var.k(null, bool);
                            H.f21880u.h(bool);
                            break;
                        default:
                            PredictionListFragment predictionListFragment = this.f21842b;
                            s H2 = predictionListFragment.H();
                            Context context = predictionListFragment.getContext();
                            if (context == null) {
                                H2.getClass();
                            } else if (!H2.f21882w.get()) {
                                H2.q.B(context, H2.f21884y, H2.A);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
    }

    @Override // rd.b, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        s H = H();
        H.f21863b.getClass();
        int i5 = 0;
        int i10 = 1;
        id.x.f11224a = (da.r.c() || (da.r.f() && da.r.d())) ? false : true;
        H.g(s.F);
        Continuation continuation = null;
        eg.c0.t(d1.i(H), null, null, new me.y(H, continuation, 15), 3);
        d1.a(H().f21870i).e(getViewLifecycleOwner(), this.f7026e);
        H().f21869h.e(getViewLifecycleOwner(), this.f7028g);
        this.f7024c = new e();
        s H2 = H();
        H2.getClass();
        eg.c0.t(d1.i(H2), null, null, new pe.q(H2, null), 3);
        b0 b0Var = (b0) this.f22459a;
        if (b0Var != null) {
            b0Var.f8875h.setAdapter(this.f7024c);
        }
        d1.a(H().f21867f).e(getViewLifecycleOwner(), this.f7035o);
        eg.c0.t(d1.g(this), null, null, new pe.k(this, continuation, i5), 3);
        this.f7025d = eg.c0.t(d1.g(this), m0.f9201a, null, new pe.k(this, continuation, i10), 2);
        H().f21879t.e(getViewLifecycleOwner(), this.f7029h);
        x G = G();
        String str = gc.d.f9945a;
        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(i.c(), "ru"));
        Boolean bool = Boolean.FALSE;
        G.f21825x = G.f21824w;
        G.g(bool, null, null, valueOf);
        G.f();
        H().f21880u.e(getViewLifecycleOwner(), this.f7030i);
        d1.a(H().f21881v).e(getViewLifecycleOwner(), this.j);
        H().C.e(getViewLifecycleOwner(), this.f7031k);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    @Override // rd.b, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStop() {
        Parcelable parcelable;
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        k1 layoutManager;
        super.onStop();
        G().f21825x = 0;
        s H = H();
        t1 t1Var = H.f21873m;
        if (t1Var != null) {
            t1Var.k(null);
        }
        H.f21873m = null;
        t1 t1Var2 = this.f7025d;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.f7025d = null;
        try {
            b0Var3 = (b0) this.f22459a;
        } catch (TransactionTooLargeException unused) {
        }
        if (b0Var3 != null && (layoutManager = b0Var3.f8875h.getLayoutManager()) != null) {
            parcelable = layoutManager.onSaveInstanceState();
            H().f21866e = parcelable;
            b0Var = (b0) this.f22459a;
            if (b0Var != null) {
                RecyclerView recyclerView = b0Var.f8875h;
                recyclerView.clearOnScrollListeners();
                recyclerView.setAdapter(null);
            }
            d1.a(H().f21867f).i(this.f7035o);
            b0Var2 = (b0) this.f22459a;
            if (b0Var2 != null) {
                b0Var2.f8875h.setAdapter(null);
            }
            d1.a(H().f21870i).i(this.f7026e);
            H().f21869h.i(this.f7028g);
            H().f21879t.i(this.f7029h);
            H().f21880u.i(this.f7030i);
            d1.a(H().f21881v).i(this.j);
            H().C.i(this.f7031k);
        }
        parcelable = null;
        H().f21866e = parcelable;
        b0Var = (b0) this.f22459a;
        if (b0Var != null) {
        }
        d1.a(H().f21867f).i(this.f7035o);
        b0Var2 = (b0) this.f22459a;
        if (b0Var2 != null) {
        }
        d1.a(H().f21870i).i(this.f7026e);
        H().f21869h.i(this.f7028g);
        H().f21879t.i(this.f7029h);
        H().f21880u.i(this.f7030i);
        d1.a(H().f21881v).i(this.j);
        H().C.i(this.f7031k);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SwipeRefreshLayout swipeRefreshLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        H().f21863b.getClass();
        Continuation continuation = null;
        eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(new g(), continuation, 10), 2);
        s H = H();
        H.getClass();
        H.j(d1.i(H), new k2.v(2, H, s.class, "refreshPreviewWork", "refreshPreviewWork(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), false);
        b0 b0Var = (b0) this.f22459a;
        if (b0Var != null && (swipeRefreshLayout = b0Var.f8876i) != null) {
            swipeRefreshLayout.setOnRefreshListener(new io.sentry.android.core.internal.gestures.c(18, this));
        }
        b0 b0Var2 = (b0) this.f22459a;
        if (b0Var2 != null) {
            EmptySectionView emptySectionView = b0Var2.f8869b;
            me.d blockRegular = new me.d(1, new zc.k(), zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 27);
            Intrinsics.checkNotNullParameter(blockRegular, "blockRegular");
            eg.c0.t(emptySectionView.f7428x, null, null, new f0(emptySectionView, blockRegular, continuation, 17), 3);
        }
        d1.a(H().f21871k).e(getViewLifecycleOwner(), this.f7027f);
        b0 b0Var3 = (b0) this.f22459a;
        if (b0Var3 != null) {
            b0Var3.f8875h.addItemDecoration(H().f21865d);
        }
        b0 b0Var4 = (b0) this.f22459a;
        if (b0Var4 != null) {
            AppCompatImageView appCompatImageView = b0Var4.f8872e;
            Integer valueOf = Integer.valueOf(R.drawable.ic_cross_inside_circle);
            o a7 = y.a(appCompatImageView.getContext());
            q4.e eVar = new q4.e(appCompatImageView.getContext());
            eVar.f21940c = valueOf;
            q4.j.d(eVar, appCompatImageView);
            ((v) a7).a(eVar.a());
        }
    }

    @Override // pe.g
    public final void x(String betText) {
        Intrinsics.checkNotNullParameter(betText, "betText");
        s H = H();
        H.getClass();
        Intrinsics.checkNotNullParameter(betText, "betText");
        if (betText.length() <= 0 || StringsKt.H(betText)) {
            return;
        }
        m mVar = new m();
        mVar.f21849a.put("searchBet", betText);
        Intrinsics.checkNotNullExpressionValue(mVar, "setSearchBet(...)");
        H.i(mVar);
    }
}
