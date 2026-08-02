package com.sports.insider.ui.activities;

import android.animation.ValueAnimator;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.g0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.k2;
import androidx.core.view.x;
import androidx.core.view.z0;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.q0;
import androidx.lifecycle.z;
import androidx.navigation.fragment.NavHostFragment;
import c4.d;
import cd.n;
import com.android.billingclient.api.i;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.views.CustomBottomNavigationView;
import com.sports.insider.ui.views.DrawerMenu;
import com.sports.insider.ui.views.HomeRowView;
import com.sports.insider.ui.views.ToolbarView;
import da.m;
import e.a0;
import e.d0;
import e.o;
import eg.c0;
import eg.h1;
import eg.m0;
import eg.t1;
import gf.t;
import gf.u;
import h8.b;
import hg.d1;
import ic.i0;
import io.sentry.internal.debugmeta.c;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.p;
import kotlin.collections.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.y;
import pd.e;
import pd.f;
import pd.g;
import pd.h;
import pe.s;
import ve.j;
import ve.k;
import ve.l;
import ve.v0;
import ve.w0;
import y1.b0;
import y1.f0;
import y1.q;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sports/insider/ui/activities/MainActivity;", "Lcom/sports/insider/ui/activities/a;", "Ly1/q;", "Lve/v0;", "Lve/w0;", "Lve/l;", "Lve/k;", "Landroidx/core/view/x;", "Lve/j;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/sports/insider/ui/activities/MainActivity\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1947:1\n296#2,10:1948\n1#3:1958\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/sports/insider/ui/activities/MainActivity\n*L\n393#1:1948,10\n*E\n"})
/* loaded from: classes.dex */
public final class MainActivity extends a implements q, v0, w0, l, k, x, j {
    public static final Set J0;
    public static final Set K0;
    public final f A0;
    public int B0;
    public int C0;
    public int D0;
    public final Object E0;
    public boolean F0;
    public String G0;
    public t1 H;
    public final g H0;
    public t1 I;
    public final f I0;
    public t1 J;
    public t1 K;
    public t1 L;
    public t1 X;
    public t1 Y;
    public t1 Z;

    /* renamed from: g0, reason: collision with root package name */
    public t1 f6884g0;

    /* renamed from: h0, reason: collision with root package name */
    public i f6885h0;

    /* renamed from: i0, reason: collision with root package name */
    public g0 f6886i0;
    public final IntentFilter j0;
    public final t k0;

    /* renamed from: l0, reason: collision with root package name */
    public final t f6887l0;

    /* renamed from: m0, reason: collision with root package name */
    public final t f6888m0;

    /* renamed from: n0, reason: collision with root package name */
    public final t f6889n0;

    /* renamed from: o0, reason: collision with root package name */
    public final t f6890o0;

    /* renamed from: p0, reason: collision with root package name */
    public final f f6891p0;

    /* renamed from: q0, reason: collision with root package name */
    public final f f6892q0;

    /* renamed from: r0, reason: collision with root package name */
    public final f f6893r0;

    /* renamed from: s0, reason: collision with root package name */
    public final f f6894s0;

    /* renamed from: t0, reason: collision with root package name */
    public Timer f6895t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f6896u0;

    /* renamed from: v0, reason: collision with root package name */
    public c f6897v0;

    /* renamed from: w0, reason: collision with root package name */
    public com.google.firebase.messaging.x f6898w0;
    public final f x0;

    /* renamed from: y0, reason: collision with root package name */
    public final f f6899y0;
    public final f z0;

    static {
        Integer[] elements = {Integer.valueOf(R.id.sportInsiderFragment), Integer.valueOf(R.id.boardSiAcademyFragment), Integer.valueOf(R.id.authScreenFragment), Integer.valueOf(R.id.identifyFragment), Integer.valueOf(R.id.noEthernetFragment)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        J0 = p.B(elements);
        K0 = u0.b(Integer.valueOf(R.id.allPredictionsFragment));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v12, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v13, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v14, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v15, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v16, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v17, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v18, types: [pd.f] */
    /* JADX WARN: Type inference failed for: r0v22, types: [pd.f] */
    public MainActivity() {
        IntentFilter intentFilter = new IntentFilter("OpenPrediction");
        intentFilter.addAction("Bonus");
        intentFilter.addAction("Announcement");
        this.j0 = intentFilter;
        this.k0 = gf.k.b(new id.a(26));
        this.f6887l0 = gf.k.b(new e(this, 1));
        this.f6888m0 = gf.k.b(new e(this, 2));
        this.f6889n0 = gf.k.b(new e(this, 3));
        this.f6890o0 = gf.k.b(new e(this, 4));
        final int i5 = 1;
        this.f6891p0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                r2 = false;
                boolean z5 = false;
                switch (i5) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i10 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i10++;
                                }
                            }
                            if (i10 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 2;
        this.f6892q0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i10) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 3;
        this.f6893r0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i11) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 4;
        this.f6894s0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i12) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 5;
        this.x0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i13) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 6;
        this.f6899y0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i14) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 7;
        this.z0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i15) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 8;
        this.A0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i16) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
        this.E0 = gf.k.a(gf.l.f10028b, new e(this, 0));
        this.H0 = new g(this);
        final int i17 = 0;
        this.I0 = new q0(this) { // from class: pd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21762b;

            {
                this.f21762b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
            
                if (r7 == null) goto L28;
             */
            @Override // androidx.lifecycle.q0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                y1.c0 c0Var;
                ve.u0[] u0VarArr;
                z5 = false;
                boolean z5 = false;
                switch (i17) {
                    case 0:
                        MainActivity mainActivity = this.f21762b;
                        i0 i0Var = (i0) obj;
                        Set set = MainActivity.J0;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                if (mainActivity.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                                    mainActivity.C().d(c0Var);
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        MainActivity mainActivity2 = this.f21762b;
                        List list = (List) obj;
                        Set set2 = MainActivity.J0;
                        if (list != null) {
                            mainActivity2.F().invalidate();
                            break;
                        }
                        break;
                    case 2:
                        MainActivity mainActivity3 = this.f21762b;
                        List list2 = (List) obj;
                        Set set3 = MainActivity.J0;
                        if (list2 != null) {
                            mainActivity3.F().invalidate();
                            break;
                        }
                        break;
                    case 3:
                        MainActivity mainActivity4 = this.f21762b;
                        List list3 = (List) obj;
                        Set set4 = MainActivity.J0;
                        if (list3 != null) {
                            mainActivity4.F().invalidate();
                            break;
                        }
                        break;
                    case 4:
                        MainActivity mainActivity5 = this.f21762b;
                        Integer num = (Integer) obj;
                        Set set5 = MainActivity.J0;
                        if (num != null) {
                            CustomBottomNavigationView D = mainActivity5.D();
                            D.f7276r = num.intValue();
                            D.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        MainActivity mainActivity6 = this.f21762b;
                        Set set6 = MainActivity.J0;
                        Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                        x K = mainActivity6.K();
                        String str = gc.d.f9945a;
                        K.g(null, null, null, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K.f21825x == K.f21824w) {
                            K.f();
                        }
                        mainActivity6.G().f21739k = true;
                        break;
                    case 6:
                        MainActivity mainActivity7 = this.f21762b;
                        List items = (List) obj;
                        Set set7 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(items, "items");
                        ToolbarView L = mainActivity7.L();
                        if (items != null) {
                            L.getClass();
                            u0VarArr = (ve.u0[]) items.toArray(new ve.u0[0]);
                            break;
                        }
                        u0VarArr = new ve.u0[0];
                        L.C0 = u0VarArr;
                        int length = u0VarArr.length;
                        L.f8053s0 = length;
                        if (length > 0) {
                            int i102 = 0;
                            for (ve.u0 u0Var : u0VarArr) {
                                if (u0Var.f24911b) {
                                    i102++;
                                }
                            }
                            if (i102 > 0) {
                                ValueAnimator valueAnimator = L.f8037i0;
                                if (valueAnimator != null) {
                                    valueAnimator.start();
                                }
                                L.g();
                                break;
                            }
                        }
                        ValueAnimator valueAnimator2 = L.f8037i0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        L.g();
                    case 7:
                        MainActivity mainActivity8 = this.f21762b;
                        List<Integer> list4 = (List) obj;
                        Set set8 = MainActivity.J0;
                        if (list4 != null) {
                            mainActivity8.L().setIconKeys(list4);
                            break;
                        }
                        break;
                    default:
                        MainActivity mainActivity9 = this.f21762b;
                        Pair pair = (Pair) obj;
                        Set set9 = MainActivity.J0;
                        boolean z7 = (pair != null ? ((Number) pair.f19192a).intValue() : 0) > 0;
                        if (pair != null && ((Boolean) pair.f19193b).booleanValue()) {
                            z5 = true;
                        }
                        x K2 = mainActivity9.K();
                        Boolean valueOf = Boolean.valueOf(z7);
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        String str2 = gc.d.f9945a;
                        K2.g(null, valueOf, valueOf2, Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru")));
                        if (K2.f21825x == K2.f21824w) {
                            K2.f();
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final boolean B() {
        DrawerLayout E = E();
        View d10 = E.d(8388611);
        if (!(d10 != null ? DrawerLayout.k(d10) : false)) {
            return false;
        }
        View d11 = E.d(8388611);
        if (d11 != null) {
            E.b(d11, true);
            return true;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.h(8388611));
    }

    public final f0 C() {
        Fragment D = r().D(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = D instanceof NavHostFragment ? (NavHostFragment) D : null;
        if (navHostFragment != null) {
            return navHostFragment.F();
        }
        throw new IllegalStateException("NavHostFragment with id R.id.nav_host_fragment not found");
    }

    public final CustomBottomNavigationView D() {
        com.google.firebase.messaging.x xVar = this.f6898w0;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xVar = null;
        }
        CustomBottomNavigationView bottomNavigation = (CustomBottomNavigationView) ((d) xVar.f6183b).f3578c;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        return bottomNavigation;
    }

    public final DrawerLayout E() {
        com.google.firebase.messaging.x xVar = this.f6898w0;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xVar = null;
        }
        DrawerLayout drawerLayout = (DrawerLayout) xVar.f6184c;
        Intrinsics.checkNotNullExpressionValue(drawerLayout, "drawerLayout");
        return drawerLayout;
    }

    public final DrawerMenu F() {
        com.google.firebase.messaging.x xVar = this.f6898w0;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xVar = null;
        }
        DrawerMenu drawerMenu = (DrawerMenu) xVar.f6185d;
        Intrinsics.checkNotNullExpressionValue(drawerMenu, "drawerMenu");
        return drawerMenu;
    }

    public final pd.c G() {
        return (pd.c) this.f6889n0.getValue();
    }

    public final pd.t H() {
        return (pd.t) this.f6887l0.getValue();
    }

    public final s I() {
        return (s) this.f6888m0.getValue();
    }

    public final FrameLayout J() {
        com.google.firebase.messaging.x xVar = this.f6898w0;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xVar = null;
        }
        FrameLayout spaceNav = (FrameLayout) ((d) xVar.f6183b).f3580e;
        Intrinsics.checkNotNullExpressionValue(spaceNav, "spaceNav");
        return spaceNav;
    }

    public final pd.x K() {
        return (pd.x) this.f6890o0.getValue();
    }

    public final ToolbarView L() {
        com.google.firebase.messaging.x xVar = this.f6898w0;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xVar = null;
        }
        ToolbarView toolbarView = (ToolbarView) ((d) xVar.f6183b).f3581f;
        Intrinsics.checkNotNullExpressionValue(toolbarView, "toolbarView");
        return toolbarView;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair M(int i5) {
        List list;
        kc.a aVar;
        Pair pair;
        pd.c G = G();
        G.getClass();
        d1 d1Var = G.f21732c;
        if (i5 >= 0) {
            if (i5 < 0 || i5 >= 2) {
                int i10 = i5 - 2;
                List list2 = (List) androidx.lifecycle.d1.a(d1Var).d();
                int size = list2 != null ? list2.size() : 0;
                if (size > 0 && i10 < size && (list = (List) androidx.lifecycle.d1.a(d1Var).d()) != null && (aVar = (kc.a) CollectionsKt.G(i10, list)) != null) {
                    pair = new Pair(Integer.valueOf(aVar.f18990a), aVar.f18991b);
                }
            } else if (i5 == 0) {
                pair = new Pair(-1, "onKind");
            } else if (i5 == 1) {
                pair = new Pair(0, "onKindAllSport");
            }
            if (pair != null) {
                return null;
            }
            return pair;
        }
        pair = null;
        if (pair != null) {
        }
    }

    public final void N(String str) {
        c0.t(MyApp.f6830c, null, null, new y(this, str, null, 5), 3);
    }

    public final void O(Integer num, String str) {
        s I = I();
        int intValue = num.intValue();
        AtomicInteger atomicInteger = I.f21875o;
        atomicInteger.set(intValue);
        d1 d1Var = I.f21876p;
        Integer valueOf = Integer.valueOf(intValue);
        d1Var.getClass();
        d1Var.k(null, valueOf);
        int i5 = atomicInteger.get();
        AtomicInteger atomicInteger2 = I.f21874n;
        if (i5 != atomicInteger2.get()) {
            atomicInteger2.set(atomicInteger.get());
            I.g(s.F);
        }
        b0 f6 = C().f25625b.f();
        if ((f6 != null ? f6.f25534b.f3017e : 0) == R.id.allPredictionsFragment) {
            if (Intrinsics.areEqual(str, "onKindAllSport")) {
                G().getClass();
                str = pd.c.e();
            }
            b0 f10 = C().f25625b.f();
            V(f10 != null ? f10.f25536d : null, str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void P(String idMenu) {
        Intrinsics.checkNotNullParameter(idMenu, "idMenu");
        switch (idMenu.hashCode()) {
            case -1614418270:
                if (idMenu.equals("onMyBonuses")) {
                    W();
                    B();
                    break;
                }
                break;
            case -1338366732:
                if (idMenu.equals("onRates")) {
                    pd.t H = H();
                    if (H.f21800k != R.id.listSubsFragment) {
                        H.e(new da.e());
                    }
                    B();
                    break;
                }
                break;
            case -1013205485:
                idMenu.equals("onKind");
                break;
            case -1013175445:
                if (idMenu.equals("onLive")) {
                    H().g(false);
                    B();
                    break;
                }
                break;
            case -518487824:
                if (idMenu.equals("onSupport")) {
                    Y(-1);
                    new cd.d().i("SideBar");
                    B();
                    break;
                }
                break;
            case -474223461:
                if (idMenu.equals("onFavorite")) {
                    pd.t H2 = H();
                    if (H2.f21800k != R.id.savedPredictionsFragment) {
                        H2.e(new y1.a(R.id.action_global_savedPredictionsFragment));
                    }
                    B();
                    break;
                }
                break;
            case -90382558:
                if (idMenu.equals("onSettings")) {
                    pd.t H3 = H();
                    H3.getClass();
                    H3.e(new y1.a(R.id.action_global_settingFragment));
                    B();
                    break;
                }
                break;
            case 251195782:
                idMenu.equals("onKindAllSport");
                break;
            case 1295251639:
                idMenu.equals("onKindOtherSport");
                break;
            case 1361983639:
                if (idMenu.equals("onSiAcademy")) {
                    pd.t H4 = H();
                    if (H4.f21800k != R.id.academyFragment) {
                        H4.e(new y1.a(R.id.action_global_academyFragment));
                    }
                    B();
                    break;
                }
                break;
            case 1410913824:
                if (idMenu.equals("onPersonalBonus")) {
                    pd.t H5 = H();
                    if (H5.f21800k != R.id.viewPageFragment) {
                        H5.e(new y1.a(R.id.action_global_viewPageFragment));
                    }
                    B();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:4|(1:6)(40:173|(4:175|(1:177)|178|(1:180))|8|(1:10)|11|12|13|(1:15)|16|(1:18)|19|20|(3:22|(1:24)(1:26)|25)|27|(3:29|(1:31)(1:34)|32)|35|(1:37)|38|(4:40|(1:66)(1:46)|47|(5:50|51|52|53|(3:55|(1:61)|59)))|67|(4:69|(1:73)|74|(1:76))|77|(1:79)|(4:81|(1:104)(1:87)|88|(4:(1:98)(1:93)|94|(1:96)|97)(1:(1:103)(1:102)))|105|(1:107)(1:171)|(1:109)|(4:111|(1:122)(1:117)|118|(1:120)(1:121))|123|(1:125)|126|(6:128|(1:130)(1:155)|(1:132)(1:154)|133|(1:135)(1:153)|136)(2:156|(6:158|(1:160)(1:169)|(1:162)(1:168)|163|(1:165)(1:167)|166)(1:170))|137|(1:139)|140|(3:142|(1:144)|145)|146|(2:148|(1:150))|151|152)|7|8|(0)|11|12|13|(0)|16|(0)|19|20|(0)|27|(0)|35|(0)|38|(0)|67|(0)|77|(0)|(0)|105|(0)(0)|(0)|(0)|123|(0)|126|(0)(0)|137|(0)|140|(0)|146|(0)|151|152) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb A[Catch: Exception -> 0x0124, TryCatch #2 {Exception -> 0x0124, blocks: (B:13:0x00af, B:15:0x00bb, B:16:0x00cb, B:18:0x00d7, B:19:0x00e3, B:22:0x00f1, B:24:0x00f7, B:25:0x00fd, B:27:0x0104, B:29:0x0110, B:31:0x0116, B:32:0x011c), top: B:12:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7 A[Catch: Exception -> 0x0124, TryCatch #2 {Exception -> 0x0124, blocks: (B:13:0x00af, B:15:0x00bb, B:16:0x00cb, B:18:0x00d7, B:19:0x00e3, B:22:0x00f1, B:24:0x00f7, B:25:0x00fd, B:27:0x0104, B:29:0x0110, B:31:0x0116, B:32:0x011c), top: B:12:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[Catch: Exception -> 0x0124, TRY_ENTER, TryCatch #2 {Exception -> 0x0124, blocks: (B:13:0x00af, B:15:0x00bb, B:16:0x00cb, B:18:0x00d7, B:19:0x00e3, B:22:0x00f1, B:24:0x00f7, B:25:0x00fd, B:27:0x0104, B:29:0x0110, B:31:0x0116, B:32:0x011c), top: B:12:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110 A[Catch: Exception -> 0x0124, TryCatch #2 {Exception -> 0x0124, blocks: (B:13:0x00af, B:15:0x00bb, B:16:0x00cb, B:18:0x00d7, B:19:0x00e3, B:22:0x00f1, B:24:0x00f7, B:25:0x00fd, B:27:0x0104, B:29:0x0110, B:31:0x0116, B:32:0x011c), top: B:12:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(Intent intent) {
        boolean areEqual;
        Uri data;
        boolean areEqual2;
        boolean areEqual3;
        u uVar;
        int intExtra;
        y1.a direction;
        String str;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        int i5 = 6;
        int i10 = 2;
        int i11 = 1;
        Continuation continuation = null;
        if (!Intrinsics.areEqual(action, "LivePassedPushClick")) {
            if (Intrinsics.areEqual(action, "LiveClickAction")) {
                new io.sentry.hints.j(i5).E("open_push_live");
                WeakReference weakReference = new WeakReference(new dd.a());
                if (((dd.a) weakReference.get()) == null) {
                    weakReference = new WeakReference(new dd.a());
                }
                dd.a aVar = (dd.a) weakReference.get();
                if (aVar != null) {
                    aVar.w().c("open_push_live", null);
                }
            }
            int i12 = 5;
            gf.k.b(new id.a(i12));
            gf.k.b(new id.a(i5));
            int i13 = 7;
            gf.k.b(new id.a(i13));
            if (Intrinsics.areEqual(intent.getAction(), "SupportClickAction")) {
                z g10 = androidx.lifecycle.d1.g(this);
                lg.e eVar = m0.f9201a;
                c0.t(g10, jg.q.f18523a, null, new h(this, continuation, i10), 2);
            }
            int i14 = 0;
            if (Intrinsics.areEqual(intent.getAction(), "userCancelPayLiveAction")) {
                z g11 = androidx.lifecycle.d1.g(this);
                lg.e eVar2 = m0.f9201a;
                c0.t(g11, jg.q.f18523a, null, new h(this, continuation, i12), 2);
            }
            if (Intrinsics.areEqual(intent.getAction(), "userCancelPayDiamondAction")) {
                H().e(new da.p());
            }
            if (Intrinsics.areEqual(intent.getAction(), "userCancelPayPremiumAction")) {
                pd.t.i(H(), intent.hasExtra("idPrediction") ? b.q(0, intent, "idPrediction") : 0, 2);
            }
            if (Intrinsics.areEqual(intent.getAction(), "userCancelPayExpressAction")) {
                pd.t.i(H(), intent.hasExtra("idPrediction") ? b.q(0, intent, "idPrediction") : 0, 3);
            }
            areEqual = Intrinsics.areEqual(intent.getAction(), "ay");
            if (areEqual) {
                new rc.b0().c("open_click_ay", null);
            }
            if (areEqual) {
                Bundle bundleExtra = intent.getBundleExtra("args");
                String source = (bundleExtra == null || bundleExtra.isEmpty() || !bundleExtra.containsKey("ay")) ? null : bundleExtra.getString("ay");
                Context context = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).f25901a;
                if (source != null && context != null) {
                    try {
                        Intrinsics.checkNotNullParameter(source, "source");
                        try {
                            byte[] decode = Base64.decode(source, 0);
                            Intrinsics.checkNotNull(decode);
                            Charset forName = Charset.forName("UTF-8");
                            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                            str = new String(decode, forName);
                        } catch (UnsupportedEncodingException unused) {
                            str = null;
                        }
                        if (str != null) {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            int i15 = Build.VERSION.SDK_INT;
                            if (i15 <= 23 || i15 >= 28) {
                                intent2.addFlags(402653184);
                            }
                            intent2.addFlags(268435456);
                            intent2.addFlags(2097152);
                            Intent addCategory = intent2.addCategory("android.intent.category.BROWSABLE");
                            String decode2 = Uri.decode(str);
                            Intrinsics.checkNotNullExpressionValue(decode2, "decode(...)");
                            Intent data2 = addCategory.setData(Uri.parse(decode2));
                            Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            context.startActivity(data2);
                        }
                    } catch (Exception e7) {
                        zc.d.b(6, null, e7);
                    }
                }
            }
            data = intent.getData();
            if (data != null) {
                if (Intrinsics.areEqual(data.getScheme(), "insightsapp") && Intrinsics.areEqual(data.getHost(), "bonuses")) {
                    z g12 = androidx.lifecycle.d1.g(this);
                    lg.e eVar3 = m0.f9201a;
                    c0.t(g12, jg.q.f18523a, null, new h(this, continuation, i14), 2);
                }
                if (Intrinsics.areEqual(data.getScheme(), "insightsapp")) {
                    Intrinsics.areEqual(data.getHost(), "open");
                }
            }
            areEqual2 = Intrinsics.areEqual(intent.getAction(), "OPEN_NEWS");
            if (areEqual2) {
                new cd.d().c("open_click_push_news", null);
            }
            if (areEqual2) {
                Bundle bundleExtra2 = intent.getBundleExtra("args");
                Integer valueOf = (bundleExtra2 == null || bundleExtra2.isEmpty() || !bundleExtra2.containsKey("newsId")) ? null : Integer.valueOf(bundleExtra2.getInt("newsId"));
                if (!H().f21792b) {
                    if (valueOf == null || valueOf.intValue() <= 0) {
                        y1.a aVar2 = new y1.a(R.id.action_global_newsFragment);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "actionGlobalNewsFragment(...)");
                        direction = aVar2;
                    } else {
                        m mVar = new m();
                        mVar.f8338a.put("newsId", valueOf);
                        Intrinsics.checkNotNullExpressionValue(mVar, "setNewsId(...)");
                        direction = mVar;
                    }
                    i iVar = this.f6885h0;
                    if (iVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("queueController");
                        iVar = null;
                    }
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    ((kotlin.collections.l) iVar.f4029c).addLast(direction);
                } else if (valueOf == null || valueOf.intValue() <= 0) {
                    y1.c0 aVar3 = new y1.a(R.id.action_global_newsFragment);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "actionGlobalNewsFragment(...)");
                    X(aVar3);
                } else {
                    m mVar2 = new m();
                    mVar2.f8338a.put("newsId", valueOf);
                    Intrinsics.checkNotNullExpressionValue(mVar2, "setNewsId(...)");
                    X(mVar2);
                }
            }
            gf.k.b(new id.a(i12));
            gf.k.b(new id.a(i5));
            gf.k.b(new id.a(i13));
            String action2 = intent.getAction();
            areEqual3 = action2 != null ? false : Intrinsics.areEqual(action2, "OPEN_TG");
            if (areEqual3) {
                new cd.d().c("open_click_push_tg_bot", null);
            }
            if (areEqual3) {
                Bundle bundleExtra3 = intent.getBundleExtra("args");
                this.G0 = (bundleExtra3 == null || bundleExtra3.isEmpty() || !bundleExtra3.containsKey("tgId")) ? null : bundleExtra3.getString("tgId");
                if (H().f21792b) {
                    N(this.G0);
                } else {
                    this.F0 = true;
                }
            }
            io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
            if (Intrinsics.areEqual(intent.getAction(), "needUpdate")) {
                c0.t(MyApp.f6830c, (eg.y) bVar.f17176b, null, new ad.a(bVar, continuation, 18), 2);
            }
            gf.k.b(new id.a(i12));
            gf.k.b(new id.a(i5));
            gf.k.b(new id.a(i13));
            if (!Intrinsics.areEqual(intent.getAction(), "OPEN_FORECAST")) {
                Bundle bundleExtra4 = intent.getBundleExtra("args");
                int i16 = bundleExtra4 != null ? bundleExtra4.getInt("predictionId") : -1;
                Integer valueOf2 = bundleExtra4 != null ? Integer.valueOf(bundleExtra4.getInt("predictionType")) : null;
                c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.l(new n(), valueOf2, continuation, i11), 2);
                uVar = new u(Boolean.TRUE, Integer.valueOf(i16), Integer.valueOf(valueOf2 != null ? valueOf2.intValue() : -1));
            } else if (Intrinsics.areEqual(intent.getAction(), "CLOSING_SALE")) {
                Bundle bundleExtra5 = intent.getBundleExtra("args");
                int i17 = bundleExtra5 != null ? bundleExtra5.getInt("predictionId") : -1;
                Integer valueOf3 = bundleExtra5 != null ? Integer.valueOf(bundleExtra5.getInt("predictionType")) : null;
                c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.l(new n(), valueOf3, continuation, i14), 2);
                uVar = new u(Boolean.TRUE, Integer.valueOf(i17), Integer.valueOf(valueOf3 != null ? valueOf3.intValue() : -1));
            } else {
                uVar = new u(Boolean.FALSE, -1, -1);
            }
            if (((Boolean) uVar.f10039a).booleanValue()) {
                z g13 = androidx.lifecycle.d1.g(this);
                lg.e eVar4 = m0.f9201a;
                c0.t(g13, jg.q.f18523a, null, new oe.j(uVar, this, continuation, i12), 2);
            }
            if (Intrinsics.areEqual(intent.getAction(), "diamond_banner")) {
                cd.g gVar = new cd.g(i5);
                gVar.f3769d = new WeakReference(new rc.b0());
                sc.a[] aVarArr = sc.a.f23428a;
                Intrinsics.checkNotNullParameter("push_vip", "bannerType");
                gVar.w().c("push_vip_click", null);
                gVar.n("clickBanner", "push_vip");
                da.p pVar = new da.p();
                Intrinsics.checkNotNullExpressionValue(pVar, "actionGlobalVipAccessFragment(...)");
                Bundle bundle = new Bundle();
                bundle.putString("event", "push_vip");
                Integer valueOf4 = Integer.valueOf(bundle.getInt("id", 0));
                HashMap hashMap = pVar.f8341a;
                hashMap.put("id", valueOf4);
                hashMap.put("event", bundle.getString("event"));
                if (bundle.containsKey("mAnnouncementId")) {
                    hashMap.put("announcementId", Integer.valueOf(bundle.getInt("mAnnouncementId", -1)));
                }
                H().e(pVar);
            }
            intExtra = intent.getIntExtra("push_id", -1);
            if (intExtra > 0) {
                m3.f fVar = new m3.f(i5);
                if (intExtra >= 1) {
                    c0.t(MyApp.f6830c, m3.f.k(), null, new cd.f(fVar, intExtra, continuation, i14), 2);
                }
            }
            setIntent(new Intent());
        }
        cd.b bVar2 = new cd.b(i5);
        Intrinsics.checkNotNullParameter("LivePassedPushClick", "nameEvent");
        bVar2.n("LivePassedPushClick", "1");
        new rc.b0().c("LivePassedPushClick", null);
        z g14 = androidx.lifecycle.d1.g(this);
        lg.e eVar5 = m0.f9201a;
        c0.t(g14, jg.q.f18523a, null, new h(this, continuation, i11), 2);
        int i122 = 5;
        gf.k.b(new id.a(i122));
        gf.k.b(new id.a(i5));
        int i132 = 7;
        gf.k.b(new id.a(i132));
        if (Intrinsics.areEqual(intent.getAction(), "SupportClickAction")) {
        }
        int i142 = 0;
        if (Intrinsics.areEqual(intent.getAction(), "userCancelPayLiveAction")) {
        }
        if (Intrinsics.areEqual(intent.getAction(), "userCancelPayDiamondAction")) {
        }
        if (Intrinsics.areEqual(intent.getAction(), "userCancelPayPremiumAction")) {
        }
        if (Intrinsics.areEqual(intent.getAction(), "userCancelPayExpressAction")) {
        }
        areEqual = Intrinsics.areEqual(intent.getAction(), "ay");
        if (areEqual) {
        }
        if (areEqual) {
        }
        data = intent.getData();
        if (data != null) {
        }
        areEqual2 = Intrinsics.areEqual(intent.getAction(), "OPEN_NEWS");
        if (areEqual2) {
        }
        if (areEqual2) {
        }
        gf.k.b(new id.a(i122));
        gf.k.b(new id.a(i5));
        gf.k.b(new id.a(i132));
        String action22 = intent.getAction();
        if (action22 != null) {
        }
        if (areEqual3) {
        }
        if (areEqual3) {
        }
        io.sentry.util.network.b bVar3 = new io.sentry.util.network.b(7);
        if (Intrinsics.areEqual(intent.getAction(), "needUpdate")) {
        }
        gf.k.b(new id.a(i122));
        gf.k.b(new id.a(i5));
        gf.k.b(new id.a(i132));
        if (!Intrinsics.areEqual(intent.getAction(), "OPEN_FORECAST")) {
        }
        if (((Boolean) uVar.f10039a).booleanValue()) {
        }
        if (Intrinsics.areEqual(intent.getAction(), "diamond_banner")) {
        }
        intExtra = intent.getIntExtra("push_id", -1);
        if (intExtra > 0) {
        }
        setIntent(new Intent());
    }

    public final void R() {
        View[] view = {D()};
        Intrinsics.checkNotNullParameter(view, "view");
        for (View view2 : view) {
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        J().getLayoutParams().height = 0;
    }

    public final void S(int i5) {
        G().n(i5);
        if (i5 == 0) {
            H().f();
            return;
        }
        if (i5 == 1) {
            y1.a aVar = new y1.a(R.id.action_global_newsFragment);
            Intrinsics.checkNotNullExpressionValue(aVar, "actionGlobalNewsFragment(...)");
            X(aVar);
            return;
        }
        if (i5 == 2) {
            pd.t H = H();
            if (H.f21800k != R.id.listSubsFragment) {
                H.e(new da.e());
                return;
            }
            return;
        }
        if (i5 != 3) {
            if (i5 != 4) {
                return;
            }
            H().g(false);
        } else {
            pd.t H2 = H();
            if (H2.f21800k != R.id.faqFragment) {
                H2.e(new y1.a(R.id.action_global_faqFragment));
            }
        }
    }

    public final void T() {
        J().getLayoutParams().height = this.D0;
        View[] view = {D()};
        Intrinsics.checkNotNullParameter(view, "view");
        for (View view2 : view) {
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    public final void U() {
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(67108864);
            launchIntentForPackage.addFlags(268435456);
        } else {
            launchIntentForPackage = null;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, launchIntentForPackage, 335544320);
        Object systemService = context.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).set(1, System.currentTimeMillis() + 100, activity);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public final void V(CharSequence charSequence, String str) {
        L().f(charSequence, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        if (r3.intValue() != com.sports.insider.R.id.bonusesInfo) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        try {
            f0 C = C();
            b0 f6 = C.f25625b.f();
            y1.a aVar = null;
            Integer valueOf = f6 != null ? Integer.valueOf(f6.f25534b.f3017e) : null;
            if (valueOf != null) {
            }
            aVar = new y1.a(R.id.action_global_bonusesInfo);
            if (aVar == null) {
                return;
            }
            if (this.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                C.d(aVar);
                return;
            }
            zc.d.c("isAtLeast not State.STARTED." + valueOf, "toBonusesInfo");
        } catch (Exception e7) {
            zc.d.b(4, "toBonusesInfo", e7);
        }
    }

    public final boolean X(y1.c0 nav) {
        Intrinsics.checkNotNullParameter(nav, "nav");
        try {
            f0 C = C();
            b0 f6 = C.f25625b.f();
            Integer valueOf = f6 != null ? Integer.valueOf(f6.f25534b.f3017e) : null;
            if (Intrinsics.areEqual(nav, new y1.a(R.id.action_global_newsFragment)) && valueOf != null && valueOf.intValue() == R.id.newsFragment) {
                return true;
            }
            if (this.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                C.d(nav);
                return true;
            }
            zc.d.c("isAtLeast not State.STARTED. currentDestination:" + valueOf, "toNewsFragment");
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "toNewsFragment", e7);
            return false;
        }
    }

    public final boolean Y(int i5) {
        try {
            f0 C = C();
            b0 f6 = C.f25625b.f();
            Integer valueOf = f6 != null ? Integer.valueOf(f6.f25534b.f3017e) : null;
            da.n nVar = new da.n();
            nVar.c(i5);
            Intrinsics.checkNotNullExpressionValue(nVar, "setErrorCode(...)");
            if (valueOf != null && valueOf.intValue() == R.id.supportChat) {
                return true;
            }
            if (this.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                C.d(nVar);
                return true;
            }
            zc.d.c("isAtLeast not State.STARTED. currentDestination:" + valueOf, "toSupportFragment");
            return false;
        } catch (Exception e7) {
            zc.d.b(4, "toSupportFragment", e7);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r4 != null) goto L31;
     */
    @Override // y1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(r controller, b0 destination) {
        i iVar;
        Object obj;
        String e7;
        Object obj2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        pd.t H = H();
        b2.m mVar = destination.f25534b;
        int i5 = mVar.f3017e;
        H.f21800k = i5;
        if (i5 == R.id.allPredictionsFragment) {
            b0 f6 = C().f25625b.f();
            CharSequence charSequence = f6 != null ? f6.f25536d : null;
            pd.c G = G();
            Integer num = (Integer) androidx.lifecycle.d1.a(I().f21876p).d();
            int intValue = num != null ? num.intValue() : 0;
            G.getClass();
            if (intValue == -1 || intValue == 0) {
                e7 = pd.c.e();
            } else {
                List list = (List) androidx.lifecycle.d1.a(G.f21732c).d();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (((kc.a) obj2).f18990a == intValue) {
                                break;
                            }
                        }
                    }
                    kc.a aVar = (kc.a) obj2;
                    if (aVar != null) {
                        e7 = aVar.f18991b;
                    }
                }
                e7 = "Unknown";
            }
            V(charSequence, e7);
            T();
        } else if (i5 == R.id.liveFragment) {
            b0 f10 = C().f25625b.f();
            V(f10 != null ? f10.f25536d : null, null);
            T();
        } else if (i5 == R.id.listSubsFragment || i5 == R.id.newsFragment || i5 == R.id.faqFragment) {
            b0 f11 = C().f25625b.f();
            V(f11 != null ? f11.f25536d : null, null);
            T();
        } else if (i5 == R.id.livePayFragment || i5 == R.id.vipAccessFragment || i5 == R.id.payExpressFragment || i5 == R.id.payPremiumFragment) {
            b0 f12 = C().f25625b.f();
            V(f12 != null ? f12.f25536d : null, null);
            R();
        } else {
            if (!(destination instanceof y1.g)) {
                b0 f13 = C().f25625b.f();
                V(f13 != null ? f13.f25536d : null, null);
            }
            R();
        }
        boolean z5 = destination instanceof y1.g;
        if (!z5) {
            c cVar = this.f6897v0;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
                cVar = null;
            }
            Iterator it2 = ((HashSet) cVar.f16517b).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((Number) obj).intValue() == mVar.f3017e) {
                        break;
                    }
                }
            }
            boolean z7 = obj != null;
            com.google.firebase.messaging.x xVar = this.f6898w0;
            if (xVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xVar = null;
            }
            HomeRowView homeRowView = (HomeRowView) ((d) xVar.f6183b).f3579d;
            Intrinsics.checkNotNullExpressionValue(homeRowView, "homeRowView");
            homeRowView.f(z7);
        }
        int i10 = mVar.f3017e;
        if (i10 == R.id.allPredictionsFragment || i10 == R.id.predictionFragment || i10 == R.id.premiumFragment || i10 == R.id.expressFragment || i10 == R.id.supportChat || i10 == R.id.viewCloudFragment) {
            ToolbarView L = L();
            int i11 = L.f8053s0;
            ve.u0[] u0VarArr = L.C0;
            if (i11 == u0VarArr.length) {
                Rect rect = L.f8052s;
                L.postInvalidateDelayed(100L, rect.left, rect.top, rect.right, rect.bottom);
            } else {
                L.f8053s0 = u0VarArr.length;
                L.g();
            }
        } else if (!z5) {
            K().f21807d.h(e0.f19204a);
        }
        int i12 = mVar.f3017e;
        if (i12 == R.id.sportInsiderFragment || i12 == R.id.boardSiAcademyFragment || i12 == R.id.authScreenFragment || i12 == R.id.identifyFragment || i12 == R.id.noEthernetFragment) {
            DrawerLayout E = E();
            E.c(false);
            E.setDrawerLockMode(1);
        } else {
            E().setDrawerLockMode(0);
        }
        int i13 = mVar.f3017e;
        if (i13 == R.id.vipAccessFragment || i13 == R.id.payPremiumFragment || i13 == R.id.payExpressFragment || i13 == R.id.livePayFragment || i13 == R.id.sportInsiderFragment || i13 == R.id.boardSiAcademyFragment || i13 == R.id.authScreenFragment || i13 == R.id.identifyFragment || i13 == R.id.noEthernetFragment) {
            View[] view = {L()};
            Intrinsics.checkNotNullParameter(view, "view");
            View view2 = view[0];
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else if (i13 == R.id.viewPageFragment) {
            View[] view3 = {L()};
            Intrinsics.checkNotNullParameter(view3, "view");
            View view4 = view3[0];
            if (view4 != null) {
                view4.setVisibility(0);
            }
        } else {
            View[] view5 = {L()};
            Intrinsics.checkNotNullParameter(view5, "view");
            View view6 = view5[0];
            if (view6 != null) {
                view6.setVisibility(0);
            }
        }
        int i14 = mVar.f3017e;
        try {
            if (i14 == R.id.allPredictionsFragment) {
                G().n(0);
            } else if (i14 == R.id.newsFragment) {
                G().n(1);
            } else if (i14 == R.id.listSubsFragment) {
                G().n(2);
            } else if (i14 == R.id.faqFragment) {
                G().n(3);
            } else if (i14 == R.id.liveFragment) {
                G().n(4);
            } else {
                G().n(-1);
            }
        } catch (Exception e9) {
            zc.d.b(4, "selectedNavigationBottomMenu", e9);
        }
        if (H().f21792b || J0.contains(Integer.valueOf(mVar.f3017e))) {
            return;
        }
        H().f21792b = true;
        i iVar2 = this.f6885h0;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("queueController");
            iVar = null;
        } else {
            iVar = iVar2;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (!iVar.f4027a && !((kotlin.collections.l) iVar.f4029c).isEmpty()) {
            iVar.f4027a = true;
            iVar.f4028b = controller;
            controller.a((pd.u) iVar.f4030d);
            iVar.f();
        }
        if (this.F0) {
            N(this.G0);
            this.F0 = false;
        }
    }

    @Override // ve.w0
    public final void k(int i5) {
        if (i5 == 7) {
            pd.t H = H();
            int i10 = H.f21800k;
            d1 d1Var = H.j;
            if (i10 != R.id.viewPageEventFragment) {
                H.e(new y1.a(R.id.action_global_viewPageEventFragment));
            }
            Pair pair = (Pair) androidx.lifecycle.d1.a(d1Var).d();
            Pair pair2 = pair != null ? new Pair(pair.f19192a, Boolean.TRUE) : new Pair(0, Boolean.FALSE);
            d1Var.getClass();
            d1Var.k(null, pair2);
            return;
        }
        if (i5 != 8) {
            if (i5 != 9) {
                return;
            }
            N(null);
            new cd.d().c("open_click_tg_bot", null);
            return;
        }
        pd.t H2 = H();
        if (H2.f21800k != R.id.viewPageFragment) {
            H2.e(new y1.a(R.id.action_global_viewPageFragment));
        }
    }

    @Override // androidx.core.view.x
    public final k2 onApplyWindowInsets(View v5, k2 insets) {
        Intrinsics.checkNotNullParameter(v5, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        g0.d f6 = insets.f1349a.f(519);
        Intrinsics.checkNotNullExpressionValue(f6, "getInsets(...)");
        this.C0 = f6.f9677b;
        this.D0 = f6.f9679d;
        this.B0 = (int) (v5.getResources().getDisplayMetrics().density * 56);
        DrawerMenu F = F();
        ViewGroup.LayoutParams layoutParams = F.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = this.B0 + this.C0;
            marginLayoutParams.bottomMargin = this.D0;
            F.setLayoutParams(marginLayoutParams);
        }
        FrameLayout J = J();
        ViewGroup.LayoutParams layoutParams2 = J.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            J().getLayoutParams().height = this.D0;
            J.setLayoutParams(marginLayoutParams2);
        }
        ToolbarView L = L();
        L.f8051r0 = this.C0;
        L.requestLayout();
        return insets;
    }

    @Override // com.sports.insider.ui.activities.a, androidx.appcompat.app.o, e.j, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i5 = newConfig.hardKeyboardHidden;
        if (i5 == 1) {
            R();
        } else if (i5 == 2) {
            T();
        }
    }

    @Override // com.sports.insider.ui.activities.a, androidx.fragment.app.p0, e.j, c0.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a2.j jVar = new a2.j(17);
        e.f0 statusBarStyle = new e.f0(jVar);
        a2.j jVar2 = new a2.j(17);
        e.f0 navigationBarStyle = new e.f0(jVar2);
        k2.x xVar = e.m.f8436a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        jVar.invoke(resources);
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = bool.booleanValue();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        jVar2.invoke(resources2);
        boolean booleanValue2 = bool.booleanValue();
        k2.x xVar2 = e.m.f8436a;
        if (xVar2 == null) {
            int i5 = Build.VERSION.SDK_INT;
            xVar2 = i5 >= 35 ? new e.s() : i5 >= 30 ? new e.r() : i5 >= 29 ? new e.q() : i5 >= 28 ? new e.p() : i5 >= 26 ? new o() : new e.n();
            e.m.f8436a = xVar2;
        }
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        xVar2.C(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
        xVar2.c(window2);
        Continuation continuation = null;
        View inflate = getLayoutInflater().inflate(R.layout.main_layout, (ViewGroup) null, false);
        int i10 = R.id.app_bar_main;
        View j = y3.j(R.id.app_bar_main, inflate);
        if (j != null) {
            int i11 = R.id.bottom_navigation;
            CustomBottomNavigationView customBottomNavigationView = (CustomBottomNavigationView) y3.j(R.id.bottom_navigation, j);
            if (customBottomNavigationView != null) {
                i11 = R.id.content_main;
                View j6 = y3.j(R.id.content_main, j);
                if (j6 != null) {
                    if (((FragmentContainerView) y3.j(R.id.nav_host_fragment, j6)) == null) {
                        throw new NullPointerException("Missing required view with ID: ".concat(j6.getResources().getResourceName(R.id.nav_host_fragment)));
                    }
                    i11 = R.id.homeRowView;
                    HomeRowView homeRowView = (HomeRowView) y3.j(R.id.homeRowView, j);
                    if (homeRowView != null) {
                        i11 = R.id.space_nav;
                        FrameLayout frameLayout = (FrameLayout) y3.j(R.id.space_nav, j);
                        if (frameLayout != null) {
                            i11 = R.id.toolbarView;
                            ToolbarView toolbarView = (ToolbarView) y3.j(R.id.toolbarView, j);
                            if (toolbarView != null) {
                                d dVar = new d((ConstraintLayout) j, customBottomNavigationView, homeRowView, frameLayout, toolbarView, 3);
                                i10 = R.id.drawer_layout;
                                DrawerLayout drawerLayout = (DrawerLayout) y3.j(R.id.drawer_layout, inflate);
                                if (drawerLayout != null) {
                                    i10 = R.id.drawerMenu;
                                    DrawerMenu drawerMenu = (DrawerMenu) y3.j(R.id.drawerMenu, inflate);
                                    if (drawerMenu != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) inflate;
                                        com.google.firebase.messaging.x xVar3 = new com.google.firebase.messaging.x(frameLayout2, dVar, drawerLayout, drawerMenu);
                                        Intrinsics.checkNotNullExpressionValue(xVar3, "inflate(...)");
                                        this.f6898w0 = xVar3;
                                        setContentView(frameLayout2);
                                        float f6 = Resources.getSystem().getDisplayMetrics().density;
                                        this.B0 = (int) (56 * f6);
                                        com.google.firebase.messaging.x xVar4 = this.f6898w0;
                                        if (xVar4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            xVar4 = null;
                                        }
                                        FrameLayout frameLayout3 = (FrameLayout) xVar4.f6182a;
                                        WeakHashMap weakHashMap = z0.f1413a;
                                        androidx.core.view.q0.l(frameLayout3, this);
                                        DrawerLayout E = E();
                                        Set topLevelDestinationIds = K0;
                                        Intrinsics.checkNotNullParameter(topLevelDestinationIds, "topLevelDestinationIds");
                                        HashSet hashSet = new HashSet();
                                        hashSet.addAll(topLevelDestinationIds);
                                        pd.p function = pd.p.f21786a;
                                        Intrinsics.checkNotNullParameter(function, "function");
                                        int i12 = 2;
                                        this.f6897v0 = new c(hashSet, E, new pd.i(), i12);
                                        f0 navController = C();
                                        Intrinsics.checkNotNullParameter(navController, "navController");
                                        final i iVar = new i();
                                        iVar.f4028b = navController;
                                        iVar.f4029c = new kotlin.collections.l();
                                        iVar.f4030d = new q() { // from class: pd.u
                                            @Override // y1.q
                                            public final void a(y1.r controller, y1.b0 destination) {
                                                Intrinsics.checkNotNullParameter(controller, "controller");
                                                Intrinsics.checkNotNullParameter(destination, "destination");
                                                com.android.billingclient.api.i iVar2 = com.android.billingclient.api.i.this;
                                                if (iVar2.f4027a) {
                                                    iVar2.f();
                                                }
                                            }
                                        };
                                        this.f6885h0 = iVar;
                                        navController.a(this);
                                        pd.t H = H();
                                        H.getClass();
                                        u1.a i13 = androidx.lifecycle.d1.i(H);
                                        lg.e eVar = m0.f9201a;
                                        c0.t(i13, lg.d.f20063c, null, new bd.b(i12, continuation, 19), 2);
                                        Q(getIntent());
                                        View decorView2 = getWindow().getDecorView();
                                        List c2 = kotlin.collections.t.c(new Rect(0, (int) (150 * f6), (int) (40 * f6), (int) (350 * f6)));
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            androidx.core.view.v0.c(decorView2, c2);
                                        }
                                        this.f6886i0 = new g0(i12, this);
                                        pd.t H2 = H();
                                        Context context = getApplicationContext();
                                        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                                        H2.getClass();
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        c0.t(MyApp.f6830c, new eg.y("setTagSentrySignatureApp"), null, new oe.j(H2, context, continuation, 6), 2);
                                        d0 onBackPressedDispatcher = getOnBackPressedDispatcher();
                                        onBackPressedDispatcher.getClass();
                                        g onBackPressedCallback = this.H0;
                                        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
                                        a0 info = new a0(null, onBackPressedCallback);
                                        Intrinsics.checkNotNullParameter(info, "info");
                                        e.y yVar = new e.y(onBackPressedCallback, info);
                                        onBackPressedCallback.f8454a.add(yVar);
                                        d2.c.a(onBackPressedDispatcher.f8404b, yVar);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(j.getResources().getResourceName(i11)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.appcompat.app.o, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.google.firebase.messaging.x xVar = this.f6898w0;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xVar = null;
        }
        FrameLayout frameLayout = (FrameLayout) xVar.f6182a;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            WeakHashMap weakHashMap = z0.f1413a;
            androidx.core.view.q0.l(frameLayout, null);
        }
        this.f6886i0 = null;
    }

    @Override // e.j, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Q(intent);
    }

    @Override // com.sports.insider.ui.activities.a, androidx.appcompat.app.o, androidx.fragment.app.p0, android.app.Activity
    public final void onStart() {
        super.onStart();
        pd.t H = H();
        H.getClass();
        jg.d dVar = MyApp.f6830c;
        Continuation continuation = null;
        final int i5 = 3;
        c0.t(dVar, null, null, new ad.a(H, continuation, 25), 3);
        int i10 = 13;
        c0.t(androidx.lifecycle.d1.i(H), null, null, new cd.k(H, continuation, i10), 3);
        g0 g0Var = this.f6886i0;
        final int i11 = 4;
        if (g0Var != null) {
            c0.t(androidx.lifecycle.d1.g(this), null, null, new oe.j(g0Var, this, continuation, i11), 3);
        }
        androidx.lifecycle.d1.a(H().j).e(this, this.A0);
        final int i12 = 0;
        Timer timer = new Timer(false);
        timer.schedule(new pd.q(), 0L, 1000L);
        this.f6895t0 = timer;
        s I = I();
        I.getClass();
        u1.a i13 = androidx.lifecycle.d1.i(I);
        lg.e eVar = m0.f9201a;
        lg.d dVar2 = lg.d.f20063c;
        final int i14 = 2;
        c0.t(i13, dVar2, null, new pe.r(I, continuation, i14), 2);
        pd.c G = G();
        G.getClass();
        c0.t(dVar, null, null, new ad.a(G, continuation, 24), 3);
        G.m(R.drawable.ic_category201);
        G.m(R.drawable.ic_news);
        G.m(R.drawable.ic_tarif);
        G.m(R.drawable.ic_faq);
        G.m(R.drawable.ic_live);
        androidx.lifecycle.d1.a(G().f21734e).e(this, this.f6892q0);
        DrawerMenu F = F();
        F.setDataDrawerMenu(this);
        F.setBitmapProviderLogo(new Function1(this) { // from class: pd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21749b;

            {
                this.f21749b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i15 = i12;
                Continuation continuation2 = null;
                MainActivity mainActivity = this.f21749b;
                switch (i15) {
                    case 0:
                        String key = (String) obj;
                        Set set = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key, "key");
                        c G2 = mainActivity.G();
                        G2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Bitmap) G2.f21736g.get(key);
                    case 1:
                        String key2 = (String) obj;
                        Set set2 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c G3 = mainActivity.G();
                        G3.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        if (G3.f21736g.get(key2) == null) {
                            u1.a i16 = androidx.lifecycle.d1.i(G3);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(i16, lg.d.f20063c, null, new oe.j(G3, key2, continuation2, 3), 2);
                        }
                        return Unit.f19194a;
                    case 2:
                        Integer num = (Integer) obj;
                        num.intValue();
                        Set set3 = MainActivity.J0;
                        return (Bitmap) mainActivity.G().f21735f.get(num);
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        Set set4 = MainActivity.J0;
                        mainActivity.G().m(intValue);
                        return Unit.f19194a;
                    case 4:
                        Integer num2 = (Integer) obj;
                        num2.intValue();
                        Set set5 = MainActivity.J0;
                        return (Bitmap) mainActivity.K().f21805b.get(num2);
                    default:
                        Integer num3 = (Integer) obj;
                        int intValue2 = num3.intValue();
                        Set set6 = MainActivity.J0;
                        x K = mainActivity.K();
                        if (K.f21805b.get(num3) == null) {
                            u1.a i17 = androidx.lifecycle.d1.i(K);
                            lg.e eVar3 = m0.f9201a;
                            eg.c0.t(i17, lg.d.f20063c, null, new cd.k(intValue2, K, continuation2, 14), 2);
                        }
                        return Unit.f19194a;
                }
            }
        });
        final int i15 = 1;
        F.setBitmapRequesterLogo(new Function1(this) { // from class: pd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21749b;

            {
                this.f21749b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i152 = i15;
                Continuation continuation2 = null;
                MainActivity mainActivity = this.f21749b;
                switch (i152) {
                    case 0:
                        String key = (String) obj;
                        Set set = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key, "key");
                        c G2 = mainActivity.G();
                        G2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Bitmap) G2.f21736g.get(key);
                    case 1:
                        String key2 = (String) obj;
                        Set set2 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c G3 = mainActivity.G();
                        G3.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        if (G3.f21736g.get(key2) == null) {
                            u1.a i16 = androidx.lifecycle.d1.i(G3);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(i16, lg.d.f20063c, null, new oe.j(G3, key2, continuation2, 3), 2);
                        }
                        return Unit.f19194a;
                    case 2:
                        Integer num = (Integer) obj;
                        num.intValue();
                        Set set3 = MainActivity.J0;
                        return (Bitmap) mainActivity.G().f21735f.get(num);
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        Set set4 = MainActivity.J0;
                        mainActivity.G().m(intValue);
                        return Unit.f19194a;
                    case 4:
                        Integer num2 = (Integer) obj;
                        num2.intValue();
                        Set set5 = MainActivity.J0;
                        return (Bitmap) mainActivity.K().f21805b.get(num2);
                    default:
                        Integer num3 = (Integer) obj;
                        int intValue2 = num3.intValue();
                        Set set6 = MainActivity.J0;
                        x K = mainActivity.K();
                        if (K.f21805b.get(num3) == null) {
                            u1.a i17 = androidx.lifecycle.d1.i(K);
                            lg.e eVar3 = m0.f9201a;
                            eg.c0.t(i17, lg.d.f20063c, null, new cd.k(intValue2, K, continuation2, 14), 2);
                        }
                        return Unit.f19194a;
                }
            }
        });
        F.setBitmapProviderIconRes(new Function1(this) { // from class: pd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21749b;

            {
                this.f21749b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i152 = i14;
                Continuation continuation2 = null;
                MainActivity mainActivity = this.f21749b;
                switch (i152) {
                    case 0:
                        String key = (String) obj;
                        Set set = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key, "key");
                        c G2 = mainActivity.G();
                        G2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Bitmap) G2.f21736g.get(key);
                    case 1:
                        String key2 = (String) obj;
                        Set set2 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c G3 = mainActivity.G();
                        G3.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        if (G3.f21736g.get(key2) == null) {
                            u1.a i16 = androidx.lifecycle.d1.i(G3);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(i16, lg.d.f20063c, null, new oe.j(G3, key2, continuation2, 3), 2);
                        }
                        return Unit.f19194a;
                    case 2:
                        Integer num = (Integer) obj;
                        num.intValue();
                        Set set3 = MainActivity.J0;
                        return (Bitmap) mainActivity.G().f21735f.get(num);
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        Set set4 = MainActivity.J0;
                        mainActivity.G().m(intValue);
                        return Unit.f19194a;
                    case 4:
                        Integer num2 = (Integer) obj;
                        num2.intValue();
                        Set set5 = MainActivity.J0;
                        return (Bitmap) mainActivity.K().f21805b.get(num2);
                    default:
                        Integer num3 = (Integer) obj;
                        int intValue2 = num3.intValue();
                        Set set6 = MainActivity.J0;
                        x K = mainActivity.K();
                        if (K.f21805b.get(num3) == null) {
                            u1.a i17 = androidx.lifecycle.d1.i(K);
                            lg.e eVar3 = m0.f9201a;
                            eg.c0.t(i17, lg.d.f20063c, null, new cd.k(intValue2, K, continuation2, 14), 2);
                        }
                        return Unit.f19194a;
                }
            }
        });
        F.setBitmapRequesterIconRes(new Function1(this) { // from class: pd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21749b;

            {
                this.f21749b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i152 = i5;
                Continuation continuation2 = null;
                MainActivity mainActivity = this.f21749b;
                switch (i152) {
                    case 0:
                        String key = (String) obj;
                        Set set = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key, "key");
                        c G2 = mainActivity.G();
                        G2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Bitmap) G2.f21736g.get(key);
                    case 1:
                        String key2 = (String) obj;
                        Set set2 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c G3 = mainActivity.G();
                        G3.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        if (G3.f21736g.get(key2) == null) {
                            u1.a i16 = androidx.lifecycle.d1.i(G3);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(i16, lg.d.f20063c, null, new oe.j(G3, key2, continuation2, 3), 2);
                        }
                        return Unit.f19194a;
                    case 2:
                        Integer num = (Integer) obj;
                        num.intValue();
                        Set set3 = MainActivity.J0;
                        return (Bitmap) mainActivity.G().f21735f.get(num);
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        Set set4 = MainActivity.J0;
                        mainActivity.G().m(intValue);
                        return Unit.f19194a;
                    case 4:
                        Integer num2 = (Integer) obj;
                        num2.intValue();
                        Set set5 = MainActivity.J0;
                        return (Bitmap) mainActivity.K().f21805b.get(num2);
                    default:
                        Integer num3 = (Integer) obj;
                        int intValue2 = num3.intValue();
                        Set set6 = MainActivity.J0;
                        x K = mainActivity.K();
                        if (K.f21805b.get(num3) == null) {
                            u1.a i17 = androidx.lifecycle.d1.i(K);
                            lg.e eVar3 = m0.f9201a;
                            eg.c0.t(i17, lg.d.f20063c, null, new cd.k(intValue2, K, continuation2, 14), 2);
                        }
                        return Unit.f19194a;
                }
            }
        });
        F().setListenerDrawerMenu(this);
        I().E.e(this, this.x0);
        K().f21807d.e(this, this.f6899y0);
        androidx.lifecycle.d1.a(K().f21806c).e(this, this.z0);
        ToolbarView L = L();
        L.setBitmapProvider(new Function1(this) { // from class: pd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21749b;

            {
                this.f21749b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i152 = i11;
                Continuation continuation2 = null;
                MainActivity mainActivity = this.f21749b;
                switch (i152) {
                    case 0:
                        String key = (String) obj;
                        Set set = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key, "key");
                        c G2 = mainActivity.G();
                        G2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Bitmap) G2.f21736g.get(key);
                    case 1:
                        String key2 = (String) obj;
                        Set set2 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c G3 = mainActivity.G();
                        G3.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        if (G3.f21736g.get(key2) == null) {
                            u1.a i16 = androidx.lifecycle.d1.i(G3);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(i16, lg.d.f20063c, null, new oe.j(G3, key2, continuation2, 3), 2);
                        }
                        return Unit.f19194a;
                    case 2:
                        Integer num = (Integer) obj;
                        num.intValue();
                        Set set3 = MainActivity.J0;
                        return (Bitmap) mainActivity.G().f21735f.get(num);
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        Set set4 = MainActivity.J0;
                        mainActivity.G().m(intValue);
                        return Unit.f19194a;
                    case 4:
                        Integer num2 = (Integer) obj;
                        num2.intValue();
                        Set set5 = MainActivity.J0;
                        return (Bitmap) mainActivity.K().f21805b.get(num2);
                    default:
                        Integer num3 = (Integer) obj;
                        int intValue2 = num3.intValue();
                        Set set6 = MainActivity.J0;
                        x K = mainActivity.K();
                        if (K.f21805b.get(num3) == null) {
                            u1.a i17 = androidx.lifecycle.d1.i(K);
                            lg.e eVar3 = m0.f9201a;
                            eg.c0.t(i17, lg.d.f20063c, null, new cd.k(intValue2, K, continuation2, 14), 2);
                        }
                        return Unit.f19194a;
                }
            }
        });
        final int i16 = 5;
        L.setBitmapRequester(new Function1(this) { // from class: pd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f21749b;

            {
                this.f21749b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i152 = i16;
                Continuation continuation2 = null;
                MainActivity mainActivity = this.f21749b;
                switch (i152) {
                    case 0:
                        String key = (String) obj;
                        Set set = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key, "key");
                        c G2 = mainActivity.G();
                        G2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Bitmap) G2.f21736g.get(key);
                    case 1:
                        String key2 = (String) obj;
                        Set set2 = MainActivity.J0;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c G3 = mainActivity.G();
                        G3.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        if (G3.f21736g.get(key2) == null) {
                            u1.a i162 = androidx.lifecycle.d1.i(G3);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(i162, lg.d.f20063c, null, new oe.j(G3, key2, continuation2, 3), 2);
                        }
                        return Unit.f19194a;
                    case 2:
                        Integer num = (Integer) obj;
                        num.intValue();
                        Set set3 = MainActivity.J0;
                        return (Bitmap) mainActivity.G().f21735f.get(num);
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        Set set4 = MainActivity.J0;
                        mainActivity.G().m(intValue);
                        return Unit.f19194a;
                    case 4:
                        Integer num2 = (Integer) obj;
                        num2.intValue();
                        Set set5 = MainActivity.J0;
                        return (Bitmap) mainActivity.K().f21805b.get(num2);
                    default:
                        Integer num3 = (Integer) obj;
                        int intValue2 = num3.intValue();
                        Set set6 = MainActivity.J0;
                        x K = mainActivity.K();
                        if (K.f21805b.get(num3) == null) {
                            u1.a i17 = androidx.lifecycle.d1.i(K);
                            lg.e eVar3 = m0.f9201a;
                            eg.c0.t(i17, lg.d.f20063c, null, new cd.k(intValue2, K, continuation2, 14), 2);
                        }
                        return Unit.f19194a;
                }
            }
        });
        androidx.lifecycle.d1.a(G().f21732c).e(this, this.f6891p0);
        androidx.lifecycle.d1.a(hg.u0.h(G().f21733d, 100L)).e(this, this.f6893r0);
        H().f21795e.e(this, this.I0);
        z lifecycleScope = androidx.lifecycle.d1.g(this);
        pd.o block = new pd.o(4, this, MainActivity.class, "showToast", "showToast(ILjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        androidx.lifecycle.g0 lifecycle = this.f3250a;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(block, "block");
        int i17 = 22;
        this.H = c0.t(lifecycleScope, m0.f9201a, null, new oe.j(lifecycle, block, continuation, i17), 2);
        this.I = c0.t(androidx.lifecycle.d1.g(this), dVar2, null, new pd.m(this, continuation, i14), 2);
        this.J = c0.t(androidx.lifecycle.d1.g(this), dVar2, null, new pd.m(this, continuation, i15), 2);
        this.K = c0.t(androidx.lifecycle.d1.g(this), dVar2, null, new pd.m(this, continuation, i12), 2);
        h1 block2 = new h1(1, this, MainActivity.class, "showErrorCodeMess", "showErrorCodeMess(I)V", 0, 3);
        Intrinsics.checkNotNullParameter(block2, "block");
        this.L = c0.t(dVar, null, null, new androidx.lifecycle.b(block2, continuation, i17), 3);
        this.X = c0.t(dVar, new eg.y("observeStatePremiumSubs"), null, new bd.b(i14, continuation, 14), 2);
        this.Y = c0.t(dVar, new eg.y("observeStateExpressSubs"), null, new bd.b(i14, continuation, 12), 2);
        this.Z = c0.t(dVar, new eg.y("observeStateDiamondSubs"), null, new bd.b(i14, continuation, 11), 2);
        this.f6884g0 = c0.t(dVar, new eg.y("observeStateLiveSubs"), null, new bd.b(i14, continuation, i10), 2);
        L().setToolbarInterface(this);
        L().setToolbarMenuGenerale(this);
        c0.t(androidx.lifecycle.d1.g(this), null, null, new bd.b(i14, continuation, 16), 3);
        G().f21742n.e(this, this.f6894s0);
        D().setDataProvider(this);
    }

    @Override // com.sports.insider.ui.activities.a, androidx.appcompat.app.o, androidx.fragment.app.p0, android.app.Activity
    public final void onStop() {
        super.onStop();
        ToolbarView L = L();
        L.toolbarInterface = null;
        L.toolbarMenuGenerale = null;
        L.bitmapProvider = null;
        L.bitmapRequester = null;
        androidx.lifecycle.d1.a(G().f21732c).i(this.f6891p0);
        K().f21807d.i(this.f6899y0);
        androidx.lifecycle.d1.a(K().f21806c).i(this.z0);
        G().f21742n.i(this.f6894s0);
        D().setDataProvider(null);
        DrawerMenu F = F();
        F.listenerDrawerMenu = null;
        F.dataDrawerMenu = null;
        F.bitmapProviderLogo = null;
        F.bitmapRequesterLogo = null;
        F.bitmapProviderIconRes = null;
        F.bitmapRequesterIconRes = null;
        androidx.lifecycle.d1.a(G().f21734e).i(this.f6892q0);
        androidx.lifecycle.d1.a(hg.u0.h(G().f21733d, 100L)).i(this.f6893r0);
        I().E.i(this.x0);
        I().getClass();
        pd.c G = G();
        t1 t1Var = G.f21731b;
        if (t1Var != null) {
            t1Var.k(null);
        }
        G.f21731b = null;
        pd.t H = H();
        t1 t1Var2 = H.f21798h;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        H.f21798h = null;
        androidx.lifecycle.d1.a(H().j).i(this.A0);
        H().f21795e.i(this.I0);
        g0 g0Var = this.f6886i0;
        if (g0Var != null) {
            x1.b a7 = x1.b.a(this);
            synchronized (a7.f25378b) {
                try {
                    ArrayList arrayList = (ArrayList) a7.f25378b.remove(g0Var);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            x1.a aVar = (x1.a) arrayList.get(size);
                            aVar.f25374d = true;
                            for (int i5 = 0; i5 < aVar.f25371a.countActions(); i5++) {
                                String action = aVar.f25371a.getAction(i5);
                                ArrayList arrayList2 = (ArrayList) a7.f25379c.get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        x1.a aVar2 = (x1.a) arrayList2.get(size2);
                                        if (aVar2.f25372b == g0Var) {
                                            aVar2.f25374d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        a7.f25379c.remove(action);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        Timer timer = this.f6895t0;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.f6895t0;
        if (timer2 != null) {
            timer2.purge();
        }
        this.f6895t0 = null;
        t1 t1Var3 = this.H;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        this.H = null;
        t1 t1Var4 = this.I;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        this.I = null;
        t1 t1Var5 = this.J;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        this.J = null;
        t1 t1Var6 = this.K;
        if (t1Var6 != null) {
            t1Var6.k(null);
        }
        this.K = null;
        t1 t1Var7 = this.L;
        if (t1Var7 != null) {
            t1Var7.k(null);
        }
        this.L = null;
        t1 t1Var8 = this.X;
        if (t1Var8 != null) {
            t1Var8.k(null);
        }
        this.X = null;
        t1 t1Var9 = this.Y;
        if (t1Var9 != null) {
            t1Var9.k(null);
        }
        this.Y = null;
        t1 t1Var10 = this.Z;
        if (t1Var10 != null) {
            t1Var10.k(null);
        }
        this.Z = null;
        t1 t1Var11 = this.f6884g0;
        if (t1Var11 != null) {
            t1Var11.k(null);
        }
        this.f6884g0 = null;
    }
}
