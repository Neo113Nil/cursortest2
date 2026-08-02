package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.h;
import androidx.fragment.app.l;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.a100;
import xsna.aa80;
import xsna.bb0;
import xsna.c820;
import xsna.cb0;
import xsna.d0;
import xsna.ejk0;
import xsna.f5z;
import xsna.fbs;
import xsna.fo8;
import xsna.fpf0;
import xsna.g5g;
import xsna.go9;
import xsna.h380;
import xsna.i5s;
import xsna.j5g;
import xsna.j620;
import xsna.kas;
import xsna.lb0;
import xsna.lhg;
import xsna.m180;
import xsna.mc80;
import xsna.mcs;
import xsna.nb0;
import xsna.o7j;
import xsna.p180;
import xsna.pcs;
import xsna.qbk;
import xsna.qbs;
import xsna.r180;
import xsna.r980;
import xsna.rbs;
import xsna.rfc;
import xsna.s3q0;
import xsna.sb0;
import xsna.sbs;
import xsna.tbs;
import xsna.ua0;
import xsna.uas;
import xsna.v1h0;
import xsna.va0;
import xsna.vyt0;
import xsna.wu5;
import xsna.xy9;
import xsna.xyt0;
import xsna.y57;
import xsna.z1h0;
import xsna.zr;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public nb0 C;
    public nb0 D;
    public nb0 E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList<androidx.fragment.app.a> L;
    public ArrayList<Boolean> M;
    public ArrayList<Fragment> N;
    public androidx.fragment.app.i O;
    public boolean b;
    public ArrayList<Fragment> e;
    public p180 g;
    public fbs<?> w;
    public uas x;
    public Fragment y;

    @Nullable
    public Fragment z;
    public final ArrayList<p> a = new ArrayList<>();
    public final androidx.fragment.app.k c = new androidx.fragment.app.k();
    public ArrayList<androidx.fragment.app.a> d = new ArrayList<>();
    public final androidx.fragment.app.g f = new androidx.fragment.app.g(this);
    public androidx.fragment.app.a h = null;
    public final b i = new b();
    public final AtomicInteger j = new AtomicInteger();
    public final Map<String, BackStackState> k = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> l = Collections.synchronizedMap(new HashMap());
    public final Map<String, n> m = Collections.synchronizedMap(new HashMap());
    public final ArrayList<o> n = new ArrayList<>();
    public final androidx.fragment.app.h o = new androidx.fragment.app.h(this);
    public final CopyOnWriteArrayList<mcs> p = new CopyOnWriteArrayList<>();
    public final qbs q = new o7j() { // from class: xsna.qbs
        @Override // xsna.o7j
        public final void accept(Object obj) {
            Configuration configuration = (Configuration) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.R()) {
                fragmentManager.k(false, configuration);
            }
        }
    };
    public final rbs r = new o7j() { // from class: xsna.rbs
        @Override // xsna.o7j
        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.R() && num.intValue() == 80) {
                fragmentManager.o(false);
            }
        }
    };
    public final sbs s = new o7j() { // from class: xsna.sbs
        @Override // xsna.o7j
        public final void accept(Object obj) {
            b740 b740Var = (b740) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.R()) {
                fragmentManager.p(b740Var.a(), false);
            }
        }
    };
    public final tbs t = new o7j() { // from class: xsna.tbs
        @Override // xsna.o7j
        public final void accept(Object obj) {
            yja0 yja0Var = (yja0) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.R()) {
                fragmentManager.u(yja0Var.a(), false);
            }
        }
    };
    public final c u = new c();
    public int v = -1;
    public final d A = new d();
    public final e B = new e();
    public ArrayDeque<LaunchedFragmentInfo> F = new ArrayDeque<>();
    public final f P = new f();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes12.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String b;
        public int c;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.b = parcel.readString();
                launchedFragmentInfo.c = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(@NonNull String str, int i) {
            this.b = str;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
        }
    }

    public class a implements ua0<Map<String, Boolean>> {
        public a() {
        }

        @Override // xsna.ua0
        public final void onActivityResult(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollFirst = fragmentManager.F.pollFirst();
            if (pollFirst == null) {
                return;
            }
            String str = pollFirst.b;
            int i2 = pollFirst.c;
            Fragment c = fragmentManager.c.c(str);
            if (c == null) {
                return;
            }
            c.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public class b extends m180 {
        public b() {
            super(false);
        }

        @Override // xsna.m180
        public final void handleOnBackCancelled() {
            boolean P = FragmentManager.P(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (P) {
                Objects.toString(fragmentManager);
            }
            androidx.fragment.app.a aVar = fragmentManager.h;
            if (aVar != null) {
                aVar.u = false;
                aVar.h(new d0(fragmentManager, 5), true);
                fragmentManager.h.k(false);
                fragmentManager.F();
            }
            fragmentManager.h = null;
        }

        @Override // xsna.m180
        public final void handleOnBackPressed() {
            boolean P = FragmentManager.P(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (P) {
                Objects.toString(fragmentManager);
            }
            b bVar = fragmentManager.i;
            ArrayList<o> arrayList = fragmentManager.n;
            fragmentManager.C(true);
            if (fragmentManager.h == null) {
                if (bVar.isEnabled()) {
                    fragmentManager.Y();
                    return;
                } else {
                    fragmentManager.g.d();
                    return;
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(FragmentManager.J(fragmentManager.h));
                Iterator<o> it = arrayList.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    for (Fragment fragment : linkedHashSet) {
                        next.getClass();
                    }
                }
            }
            Iterator<l.a> it2 = fragmentManager.h.c.iterator();
            while (it2.hasNext()) {
                Fragment fragment2 = it2.next().b;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            Iterator it3 = fragmentManager.h(new ArrayList(Collections.singletonList(fragmentManager.h)), 0, 1).iterator();
            while (it3.hasNext()) {
                SpecialEffectsController specialEffectsController = (SpecialEffectsController) it3.next();
                ArrayList arrayList2 = specialEffectsController.c;
                specialEffectsController.k(arrayList2);
                specialEffectsController.c(arrayList2);
            }
            Iterator<l.a> it4 = fragmentManager.h.c.iterator();
            while (it4.hasNext()) {
                Fragment fragment3 = it4.next().b;
                if (fragment3 != null && fragment3.mContainer == null) {
                    fragmentManager.i(fragment3).i();
                }
            }
            fragmentManager.h = null;
            fragmentManager.s0();
            if (FragmentManager.P(3)) {
                bVar.isEnabled();
                fragmentManager.toString();
            }
        }

        @Override // xsna.m180
        public final void handleOnBackProgressed(@NonNull wu5 wu5Var) {
            boolean P = FragmentManager.P(2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (P) {
                Objects.toString(fragmentManager);
            }
            if (fragmentManager.h != null) {
                Iterator it = fragmentManager.h(new ArrayList(Collections.singletonList(fragmentManager.h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ArrayList arrayList = ((SpecialEffectsController) it.next()).c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        g5g.y(((SpecialEffectsController.Operation) it2.next()).k, arrayList2);
                    }
                    List O0 = j5g.O0(j5g.S0(arrayList2));
                    int size = O0.size();
                    for (int i = 0; i < size; i++) {
                        ((SpecialEffectsController.a) O0.get(i)).e(wu5Var);
                    }
                }
                Iterator<o> it3 = fragmentManager.n.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        }

        @Override // xsna.m180
        public final void handleOnBackStarted(@NonNull wu5 wu5Var) {
            boolean P = FragmentManager.P(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (P) {
                Objects.toString(fragmentManager);
            }
            fragmentManager.z();
            fragmentManager.A(fragmentManager.new r(), false);
        }
    }

    public class c implements c820 {
        public c() {
        }

        @Override // xsna.c820
        public final void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.m(menu, menuInflater);
        }

        @Override // xsna.c820
        public final void onMenuClosed(@NonNull Menu menu) {
            FragmentManager.this.s(menu);
        }

        @Override // xsna.c820
        public final boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
            return FragmentManager.this.r(menuItem);
        }

        @Override // xsna.c820
        public final void onPrepareMenu(@NonNull Menu menu) {
            FragmentManager.this.v(menu);
        }
    }

    public class d extends androidx.fragment.app.f {
        public d() {
        }

        @Override // androidx.fragment.app.f
        @NonNull
        public final Fragment a(@NonNull String str) {
            return Fragment.instantiate(FragmentManager.this.w.c, str, null);
        }
    }

    public class e implements ejk0 {
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.C(true);
        }
    }

    /* loaded from: classes12.dex */
    public class g implements androidx.lifecycle.l {
        public final /* synthetic */ String b;
        public final /* synthetic */ pcs c;
        public final /* synthetic */ Lifecycle d;

        public g(String str, pcs pcsVar, Lifecycle lifecycle) {
            this.b = str;
            this.c = pcsVar;
            this.d = lifecycle;
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(@NonNull f5z f5zVar, @NonNull Lifecycle.Event event) {
            Bundle bundle;
            Lifecycle.Event event2 = Lifecycle.Event.ON_START;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.b;
            if (event == event2 && (bundle = fragmentManager.l.get(str)) != null) {
                this.c.p(bundle, str);
                fragmentManager.e(str);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.d.removeObserver(this);
                fragmentManager.m.remove(str);
            }
        }
    }

    public class h implements mcs {
        public final /* synthetic */ Fragment b;

        public h(Fragment fragment) {
            this.b = fragment;
        }

        @Override // xsna.mcs
        public final void a(@NonNull Fragment fragment) {
            this.b.onAttachFragment(fragment);
        }
    }

    public class i implements ua0<ActivityResult> {
        public i() {
        }

        @Override // xsna.ua0
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollLast = fragmentManager.F.pollLast();
            if (pollLast == null) {
                return;
            }
            String str = pollLast.b;
            int i = pollLast.c;
            Fragment c = fragmentManager.c.c(str);
            if (c == null) {
                return;
            }
            c.onActivityResult(i, activityResult2.b, activityResult2.c);
        }
    }

    public class j implements ua0<ActivityResult> {
        public j() {
        }

        @Override // xsna.ua0
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo pollFirst = fragmentManager.F.pollFirst();
            if (pollFirst == null) {
                return;
            }
            String str = pollFirst.b;
            int i = pollFirst.c;
            Fragment c = fragmentManager.c.c(str);
            if (c == null) {
                return;
            }
            c.onActivityResult(i, activityResult2.b, activityResult2.c);
        }
    }

    public interface k {
        @Nullable
        String getName();
    }

    public static class l extends va0<IntentSenderRequest, ActivityResult> {
        @Override // xsna.va0
        @NonNull
        public final Intent a(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent d = intentSenderRequest2.d();
            if (d != null && (bundleExtra = d.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                d.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (d.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.a aVar = new IntentSenderRequest.a(intentSenderRequest2.g());
                    aVar.b(null);
                    aVar.c(intentSenderRequest2.f(), intentSenderRequest2.e());
                    intentSenderRequest2 = aVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.P(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // xsna.va0
        @NonNull
        public final ActivityResult c(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* loaded from: classes12.dex */
    public static class n implements pcs {
        public final Lifecycle b;
        public final pcs c;
        public final g d;

        public n(@NonNull Lifecycle lifecycle, @NonNull pcs pcsVar, @NonNull g gVar) {
            this.b = lifecycle;
            this.c = pcsVar;
            this.d = gVar;
        }

        public final boolean a(Lifecycle.State state) {
            return this.b.getCurrentState().a(state);
        }

        public final void b() {
            this.b.removeObserver(this.d);
        }

        @Override // xsna.pcs
        public final void p(@NonNull Bundle bundle, @NonNull String str) {
            this.c.p(bundle, str);
        }
    }

    /* loaded from: classes12.dex */
    public interface o {
        void onBackStackChanged();
    }

    public interface p {
        boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes12.dex */
    public class q implements p {
        public final int a;
        public final int b;

        public q(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public final boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            Fragment fragment = fragmentManager.z;
            if (fragment == null || this.a >= 0 || !fragment.getChildFragmentManager().Y()) {
                return fragmentManager.a0(arrayList, arrayList2, null, this.a, this.b);
            }
            return false;
        }
    }

    /* loaded from: classes12.dex */
    public class r implements p {
        public r() {
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public final boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            ArrayList<androidx.fragment.app.a> arrayList3;
            ArrayList<Boolean> arrayList4;
            boolean a0;
            boolean P = FragmentManager.P(2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (P) {
                Objects.toString(fragmentManager.a);
            }
            if (fragmentManager.d.isEmpty()) {
                a0 = false;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
            } else {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) xy9.b(1, fragmentManager.d);
                fragmentManager.h = aVar;
                Iterator<l.a> it = aVar.c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().b;
                    if (fragment != null) {
                        fragment.mTransitioning = true;
                    }
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                a0 = fragmentManager.a0(arrayList3, arrayList4, null, -1, 0);
            }
            if (!fragmentManager.n.isEmpty() && arrayList3.size() > 0) {
                arrayList4.get(arrayList3.size() - 1).getClass();
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.a> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.J(it2.next()));
                }
                Iterator<o> it3 = fragmentManager.n.iterator();
                while (it3.hasNext()) {
                    o next = it3.next();
                    for (Fragment fragment2 : linkedHashSet) {
                        next.getClass();
                    }
                }
            }
            return a0;
        }
    }

    public static HashSet J(@NonNull androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.c.size(); i2++) {
            Fragment fragment = aVar.c.get(i2).b;
            if (fragment != null && aVar.i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean P(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean Q(@NonNull Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.c.e().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z = Q(fragment2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.z) && S(fragmentManager.y);
    }

    public final void A(@NonNull p pVar, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (T()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(pVar);
                    i0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.w.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && T()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList<>();
            this.M = new ArrayList<>();
        }
    }

    public final boolean C(boolean z) {
        boolean z2;
        B(z);
        boolean z3 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.L;
            ArrayList<Boolean> arrayList2 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        z2 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z2 |= this.a.get(i2).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                s0();
                x();
                this.c.b.values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.b = true;
            try {
                e0(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    public final void D(@NonNull androidx.fragment.app.a aVar, boolean z) {
        if (z && (this.w == null || this.J)) {
            return;
        }
        B(z);
        aVar.a(this.L, this.M);
        this.b = true;
        try {
            e0(this.L, this.M);
            d();
            s0();
            x();
            this.c.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void E(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10 = i2;
        boolean z4 = arrayList.get(i10).r;
        ArrayList<Fragment> arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<Fragment> arrayList4 = this.N;
        androidx.fragment.app.k kVar = this.c;
        arrayList4.addAll(kVar.f());
        Fragment fragment = this.z;
        int i11 = i10;
        boolean z5 = false;
        while (true) {
            int i12 = 1;
            if (i11 >= i3) {
                boolean z6 = z4;
                boolean z7 = z5;
                this.N.clear();
                if (!z6 && this.v >= 1) {
                    for (int i13 = i10; i13 < i3; i13++) {
                        Iterator<l.a> it = arrayList.get(i13).c.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                kVar.g(i(fragment2));
                            }
                        }
                    }
                }
                int i14 = i10;
                while (i14 < i3) {
                    androidx.fragment.app.a aVar = arrayList.get(i14);
                    if (arrayList2.get(i14).booleanValue()) {
                        aVar.j(-1);
                        FragmentManager fragmentManager = aVar.t;
                        ArrayList<l.a> arrayList5 = aVar.c;
                        boolean z8 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            l.a aVar2 = arrayList5.get(size);
                            Fragment fragment3 = aVar2.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(z8);
                                int i15 = aVar.h;
                                int i16 = 8194;
                                int i17 = 4097;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = 4100;
                                        if (i15 != 8197) {
                                            i17 = 4099;
                                            if (i15 != 4099) {
                                                i16 = i15 != 4100 ? 0 : 8197;
                                            }
                                        }
                                    }
                                    i16 = i17;
                                }
                                fragment3.setNextTransition(i16);
                                fragment3.setSharedElementNames(aVar.q, aVar.p);
                            }
                            switch (aVar2.a) {
                                case 1:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    z8 = true;
                                    fragmentManager.j0(fragment3, true);
                                    fragmentManager.d0(fragment3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar2.a);
                                case 3:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.a(fragment3);
                                    z8 = true;
                                case 4:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.getClass();
                                    if (P(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    z8 = true;
                                case 5:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.j0(fragment3, true);
                                    if (P(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (!fragment3.mHidden) {
                                        fragment3.mHidden = true;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                        fragmentManager.o0(fragment3);
                                    }
                                    z8 = true;
                                case 6:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.c(fragment3);
                                    z8 = true;
                                case 7:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.j0(fragment3, true);
                                    fragmentManager.j(fragment3);
                                    z8 = true;
                                case 8:
                                    fragmentManager.n0(null);
                                    z8 = true;
                                case 9:
                                    fragmentManager.n0(fragment3);
                                    z8 = true;
                                case 10:
                                    fragmentManager.m0(fragment3, aVar2.h);
                                    z8 = true;
                            }
                        }
                    } else {
                        aVar.j(1);
                        FragmentManager fragmentManager2 = aVar.t;
                        ArrayList<l.a> arrayList6 = aVar.c;
                        int size2 = arrayList6.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            l.a aVar3 = arrayList6.get(i18);
                            Fragment fragment4 = aVar3.b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(aVar.h);
                                fragment4.setSharedElementNames(aVar.p, aVar.q);
                            }
                            switch (aVar3.a) {
                                case 1:
                                    i4 = i14;
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.j0(fragment4, false);
                                    fragmentManager2.a(fragment4);
                                    i18++;
                                    i14 = i4;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar3.a);
                                case 3:
                                    i4 = i14;
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.d0(fragment4);
                                    i18++;
                                    i14 = i4;
                                case 4:
                                    i4 = i14;
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.getClass();
                                    if (P(2)) {
                                        Objects.toString(fragment4);
                                    }
                                    if (!fragment4.mHidden) {
                                        fragment4.mHidden = true;
                                        fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                        fragmentManager2.o0(fragment4);
                                    }
                                    i18++;
                                    i14 = i4;
                                case 5:
                                    i4 = i14;
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.j0(fragment4, false);
                                    if (P(2)) {
                                        Objects.toString(fragment4);
                                    }
                                    if (fragment4.mHidden) {
                                        fragment4.mHidden = false;
                                        fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                    }
                                    i18++;
                                    i14 = i4;
                                case 6:
                                    i4 = i14;
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.j(fragment4);
                                    i18++;
                                    i14 = i4;
                                case 7:
                                    i4 = i14;
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.j0(fragment4, false);
                                    fragmentManager2.c(fragment4);
                                    i18++;
                                    i14 = i4;
                                case 8:
                                    fragmentManager2.n0(fragment4);
                                    i4 = i14;
                                    i18++;
                                    i14 = i4;
                                case 9:
                                    fragmentManager2.n0(null);
                                    i4 = i14;
                                    i18++;
                                    i14 = i4;
                                case 10:
                                    fragmentManager2.m0(fragment4, aVar3.i);
                                    i4 = i14;
                                    i18++;
                                    i14 = i4;
                            }
                        }
                    }
                    i14++;
                }
                boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
                ArrayList<o> arrayList7 = this.n;
                if (z7 && !arrayList7.isEmpty()) {
                    LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                    Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(J(it2.next()));
                    }
                    if (this.h == null) {
                        Iterator<o> it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            o next = it3.next();
                            for (Fragment fragment5 : linkedHashSet) {
                                next.getClass();
                            }
                        }
                        Iterator<o> it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            o next2 = it4.next();
                            for (Fragment fragment6 : linkedHashSet) {
                                next2.getClass();
                            }
                        }
                    }
                }
                for (int i19 = i10; i19 < i3; i19++) {
                    androidx.fragment.app.a aVar4 = arrayList.get(i19);
                    if (booleanValue) {
                        for (int size3 = aVar4.c.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment7 = aVar4.c.get(size3).b;
                            if (fragment7 != null) {
                                i(fragment7).i();
                            }
                        }
                    } else {
                        Iterator<l.a> it5 = aVar4.c.iterator();
                        while (it5.hasNext()) {
                            Fragment fragment8 = it5.next().b;
                            if (fragment8 != null) {
                                i(fragment8).i();
                            }
                        }
                    }
                }
                U(this.v, true);
                Iterator it6 = h(arrayList, i10, i3).iterator();
                while (it6.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it6.next();
                    specialEffectsController.d = booleanValue;
                    specialEffectsController.j();
                    specialEffectsController.e();
                }
                while (i10 < i3) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i10);
                    if (arrayList2.get(i10).booleanValue() && aVar5.v >= 0) {
                        aVar5.v = -1;
                    }
                    if (aVar5.s != null) {
                        for (int i20 = 0; i20 < aVar5.s.size(); i20++) {
                            aVar5.s.get(i20).run();
                        }
                        aVar5.s = null;
                    }
                    i10++;
                }
                if (z7) {
                    for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                        arrayList7.get(i21).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            androidx.fragment.app.a aVar6 = arrayList.get(i11);
            if (arrayList2.get(i11).booleanValue()) {
                z = z4;
                i5 = i11;
                z2 = z5;
                int i22 = 1;
                ArrayList<Fragment> arrayList8 = this.N;
                ArrayList<l.a> arrayList9 = aVar6.c;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    l.a aVar7 = arrayList9.get(size4);
                    int i23 = aVar7.a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar7.b;
                                    break;
                                case 10:
                                    aVar7.i = aVar7.h;
                                    break;
                            }
                            size4--;
                            i22 = 1;
                        }
                        arrayList8.add(aVar7.b);
                        size4--;
                        i22 = 1;
                    }
                    arrayList8.remove(aVar7.b);
                    size4--;
                    i22 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList10 = this.N;
                ArrayList<l.a> arrayList11 = aVar6.c;
                int i24 = 0;
                while (i24 < arrayList11.size()) {
                    l.a aVar8 = arrayList11.get(i24);
                    boolean z9 = z4;
                    int i25 = aVar8.a;
                    if (i25 != i12) {
                        if (i25 != 2) {
                            if (i25 == 3 || i25 == 6) {
                                i6 = i11;
                                arrayList10.remove(aVar8.b);
                                Fragment fragment9 = aVar8.b;
                                if (fragment9 == fragment) {
                                    arrayList11.add(i24, new l.a(fragment9, 9));
                                    i24++;
                                    z3 = z5;
                                    fragment = null;
                                    i7 = 1;
                                }
                            } else if (i25 == 7) {
                                i6 = i11;
                                i7 = 1;
                            } else if (i25 != 8) {
                                i6 = i11;
                            } else {
                                i6 = i11;
                                arrayList11.add(i24, new l.a(9, fragment, 0));
                                aVar8.c = true;
                                i24++;
                                fragment = aVar8.b;
                            }
                            z3 = z5;
                            i7 = 1;
                        } else {
                            i6 = i11;
                            Fragment fragment10 = aVar8.b;
                            int i26 = fragment10.mContainerId;
                            int size5 = arrayList10.size() - 1;
                            boolean z10 = false;
                            while (size5 >= 0) {
                                boolean z11 = z5;
                                Fragment fragment11 = arrayList10.get(size5);
                                int i27 = size5;
                                if (fragment11.mContainerId != i26) {
                                    i8 = i26;
                                } else if (fragment11 == fragment10) {
                                    i8 = i26;
                                    z10 = true;
                                } else {
                                    if (fragment11 == fragment) {
                                        i8 = i26;
                                        i9 = 0;
                                        arrayList11.add(i24, new l.a(9, fragment11, 0));
                                        i24++;
                                        fragment = null;
                                    } else {
                                        i8 = i26;
                                        i9 = 0;
                                    }
                                    l.a aVar9 = new l.a(3, fragment11, i9);
                                    aVar9.d = aVar8.d;
                                    aVar9.f = aVar8.f;
                                    aVar9.e = aVar8.e;
                                    aVar9.g = aVar8.g;
                                    arrayList11.add(i24, aVar9);
                                    arrayList10.remove(fragment11);
                                    i24++;
                                    fragment = fragment;
                                }
                                size5 = i27 - 1;
                                i26 = i8;
                                z5 = z11;
                            }
                            z3 = z5;
                            i7 = 1;
                            if (z10) {
                                arrayList11.remove(i24);
                                i24--;
                            } else {
                                aVar8.a = 1;
                                aVar8.c = true;
                                arrayList10.add(fragment10);
                            }
                        }
                        i24 += i7;
                        i12 = i7;
                        z4 = z9;
                        i11 = i6;
                        z5 = z3;
                    } else {
                        i6 = i11;
                        i7 = i12;
                    }
                    z3 = z5;
                    arrayList10.add(aVar8.b);
                    i24 += i7;
                    i12 = i7;
                    z4 = z9;
                    i11 = i6;
                    z5 = z3;
                }
                z = z4;
                i5 = i11;
                z2 = z5;
            }
            z5 = z2 || aVar6.i;
            i11 = i5 + 1;
            z4 = z;
        }
    }

    public final void F() {
        C(true);
        I();
    }

    @Nullable
    public final Fragment G(int i2) {
        androidx.fragment.app.k kVar = this.c;
        ArrayList<Fragment> arrayList = kVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (androidx.fragment.app.j jVar : kVar.b.values()) {
            if (jVar != null) {
                Fragment fragment2 = jVar.c;
                if (fragment2.mFragmentId == i2) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Nullable
    public final Fragment H(@Nullable String str) {
        androidx.fragment.app.k kVar = this.c;
        ArrayList<Fragment> arrayList = kVar.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.j jVar : kVar.b.values()) {
            if (jVar != null) {
                Fragment fragment2 = jVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void I() {
        Iterator it = g().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.e) {
                specialEffectsController.e = false;
                specialEffectsController.e();
            }
        }
    }

    public final int K() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    @Nullable
    public final Fragment L(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment b2 = this.c.b(string);
        if (b2 != null) {
            return b2;
        }
        q0(new IllegalStateException(y57.a("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup M(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.x.c()) {
            return null;
        }
        View b2 = this.x.b(fragment.mContainerId);
        if (b2 instanceof ViewGroup) {
            return (ViewGroup) b2;
        }
        return null;
    }

    @NonNull
    public final androidx.fragment.app.f N() {
        Fragment fragment = this.y;
        return fragment != null ? fragment.mFragmentManager.N() : this.A;
    }

    @NonNull
    public final ejk0 O() {
        Fragment fragment = this.y;
        return fragment != null ? fragment.mFragmentManager.O() : this.B;
    }

    public final boolean R() {
        Fragment fragment = this.y;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.y.getParentFragmentManager().R();
    }

    public final boolean T() {
        return this.H || this.I;
    }

    public final void U(int i2, boolean z) {
        fbs<?> fbsVar;
        if (this.w == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.v) {
            this.v = i2;
            androidx.fragment.app.k kVar = this.c;
            HashMap<String, androidx.fragment.app.j> hashMap = kVar.b;
            Iterator<Fragment> it = kVar.a.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.j jVar = hashMap.get(it.next().mWho);
                if (jVar != null) {
                    jVar.i();
                }
            }
            for (androidx.fragment.app.j jVar2 : hashMap.values()) {
                if (jVar2 != null) {
                    jVar2.i();
                    Fragment fragment = jVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !kVar.c.containsKey(fragment.mWho)) {
                            kVar.i(jVar2.l(), fragment.mWho);
                        }
                        kVar.h(jVar2);
                    }
                }
            }
            p0();
            if (this.G && (fbsVar = this.w) != null && this.v == 7) {
                fbsVar.h();
                this.G = false;
            }
        }
    }

    public final void V() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.g = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void W() {
        A(new q(-1, 0), false);
    }

    public final void X(int i2, boolean z) {
        if (i2 < 0) {
            throw new IllegalArgumentException(lhg.a(i2, "Bad id: "));
        }
        A(new q(i2, 1), z);
    }

    public final boolean Y() {
        return Z(-1, 0, null);
    }

    public final boolean Z(int i2, int i3, @Nullable String str) {
        C(false);
        B(true);
        Fragment fragment = this.z;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().Y()) {
            return true;
        }
        boolean a0 = a0(this.L, this.M, str, i2, i3);
        if (a0) {
            this.b = true;
            try {
                e0(this.L, this.M);
            } finally {
                d();
            }
        }
        s0();
        x();
        this.c.b.values().removeAll(Collections.singleton(null));
        return a0;
    }

    public final androidx.fragment.app.j a(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.d(fragment, str);
        }
        if (P(2)) {
            fragment.toString();
        }
        androidx.fragment.app.j i2 = i(fragment);
        fragment.mFragmentManager = this;
        androidx.fragment.app.k kVar = this.c;
        kVar.g(i2);
        if (!fragment.mDetached) {
            kVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Q(fragment)) {
                this.G = true;
            }
        }
        return i2;
    }

    public final boolean a0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i2, int i3) {
        boolean z = (i3 & 1) != 0;
        int i4 = -1;
        if (!this.d.isEmpty()) {
            if (str != null || i2 >= 0) {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    androidx.fragment.app.a aVar = this.d.get(size);
                    if ((str != null && str.equals(aVar.k)) || (i2 >= 0 && i2 == aVar.v)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i4 = size;
                } else if (z) {
                    i4 = size;
                    while (i4 > 0) {
                        androidx.fragment.app.a aVar2 = this.d.get(i4 - 1);
                        if ((str == null || !str.equals(aVar2.k)) && (i2 < 0 || i2 != aVar2.v)) {
                            break;
                        }
                        i4--;
                    }
                } else if (size != this.d.size() - 1) {
                    i4 = size + 1;
                }
            } else {
                i4 = z ? 0 : this.d.size() - 1;
            }
        }
        if (i4 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i4; size2--) {
            arrayList.add(this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NonNull fbs<?> fbsVar, @NonNull uas uasVar, @Nullable Fragment fragment) {
        if (this.w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.w = fbsVar;
        this.x = uasVar;
        this.y = fragment;
        CopyOnWriteArrayList<mcs> copyOnWriteArrayList = this.p;
        if (fragment != null) {
            copyOnWriteArrayList.add(new h(fragment));
        } else if (fbsVar instanceof mcs) {
            copyOnWriteArrayList.add((mcs) fbsVar);
        }
        if (this.y != null) {
            s0();
        }
        if (fbsVar instanceof r180) {
            r180 r180Var = (r180) fbsVar;
            p180 onBackPressedDispatcher = r180Var.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            f5z f5zVar = r180Var;
            if (fragment != null) {
                f5zVar = fragment;
            }
            onBackPressedDispatcher.a(f5zVar, this.i);
        }
        if (fragment != null) {
            androidx.fragment.app.i iVar = fragment.mFragmentManager.O;
            HashMap<String, androidx.fragment.app.i> hashMap = iVar.c;
            androidx.fragment.app.i iVar2 = hashMap.get(fragment.mWho);
            if (iVar2 == null) {
                iVar2 = new androidx.fragment.app.i(iVar.e);
                hashMap.put(fragment.mWho, iVar2);
            }
            this.O = iVar2;
        } else if (fbsVar instanceof xyt0) {
            vyt0 vyt0Var = new vyt0(((xyt0) fbsVar).getViewModelStore(), androidx.fragment.app.i.h, qbk.a.b);
            rfc a2 = fpf0.a(androidx.fragment.app.i.class);
            String h2 = a2.h();
            if (h2 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.O = (androidx.fragment.app.i) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h2), a2);
        } else {
            this.O = new androidx.fragment.app.i(false);
        }
        this.O.g = T();
        this.c.d = this.O;
        Object obj = this.w;
        if ((obj instanceof z1h0) && fragment == null) {
            v1h0 savedStateRegistry = ((z1h0) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new v1h0.b() { // from class: xsna.ubs
                @Override // xsna.v1h0.b
                public final Bundle r() {
                    return FragmentManager.this.g0();
                }
            });
            Bundle a3 = savedStateRegistry.a("android:support:fragments");
            if (a3 != null) {
                f0(a3);
            }
        }
        Object obj2 = this.w;
        if (obj2 instanceof sb0) {
            lb0 activityResultRegistry = ((sb0) obj2).getActivityResultRegistry();
            String b2 = go9.b("FragmentManager:", fragment != null ? i5s.a(new StringBuilder(), fragment.mWho, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.C = activityResultRegistry.d(fo8.a(b2, "StartActivityForResult"), new cb0(), new i());
            this.D = activityResultRegistry.d(fo8.a(b2, "StartIntentSenderForResult"), new l(), new j());
            this.E = activityResultRegistry.d(fo8.a(b2, "RequestPermissions"), new bb0(), new a());
        }
        Object obj3 = this.w;
        if (obj3 instanceof h380) {
            ((h380) obj3).addOnConfigurationChangedListener(this.q);
        }
        Object obj4 = this.w;
        if (obj4 instanceof mc80) {
            ((mc80) obj4).addOnTrimMemoryListener(this.r);
        }
        Object obj5 = this.w;
        if (obj5 instanceof r980) {
            ((r980) obj5).addOnMultiWindowModeChangedListener(this.s);
        }
        Object obj6 = this.w;
        if (obj6 instanceof aa80) {
            ((aa80) obj6).addOnPictureInPictureModeChangedListener(this.t);
        }
        Object obj7 = this.w;
        if ((obj7 instanceof j620) && fragment == null) {
            ((j620) obj7).addMenuProvider(this.u);
        }
    }

    public final void b0(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            q0(new IllegalStateException(kas.a("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void c(@NonNull Fragment fragment) {
        if (P(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (P(2)) {
                fragment.toString();
            }
            if (Q(fragment)) {
                this.G = true;
            }
        }
    }

    public final void c0(@NonNull m mVar, boolean z) {
        this.o.b.add(new h.a(mVar, z));
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(@NonNull Fragment fragment) {
        if (P(2)) {
            Objects.toString(fragment);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        androidx.fragment.app.k kVar = this.c;
        synchronized (kVar.a) {
            kVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (Q(fragment)) {
            this.G = true;
        }
        fragment.mRemoving = true;
        o0(fragment);
    }

    public final void e(@NonNull String str) {
        this.l.remove(str);
    }

    public final void e0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    E(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                E(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            E(arrayList, arrayList2, i3, size);
        }
    }

    public final void f(@NonNull String str) {
        n remove = this.m.remove(str);
        if (remove != null) {
            remove.b();
        }
    }

    public final void f0(@Nullable Bundle bundle) {
        androidx.fragment.app.h hVar;
        androidx.fragment.app.j jVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.w.c.getClassLoader());
                this.l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.w.c.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        androidx.fragment.app.k kVar = this.c;
        HashMap<String, Bundle> hashMap2 = kVar.c;
        HashMap<String, androidx.fragment.app.j> hashMap3 = kVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        hashMap3.clear();
        Iterator<String> it = fragmentManagerState.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hVar = this.o;
            if (!hasNext) {
                break;
            }
            Bundle i2 = kVar.i(null, it.next());
            if (i2 != null) {
                Fragment fragment = this.O.b.get(((FragmentState) i2.getParcelable("state")).c);
                if (fragment != null) {
                    if (P(2)) {
                        fragment.toString();
                    }
                    jVar = new androidx.fragment.app.j(hVar, kVar, fragment, i2);
                } else {
                    jVar = new androidx.fragment.app.j(this.o, this.c, this.w.c.getClassLoader(), N(), i2);
                }
                Fragment fragment2 = jVar.c;
                fragment2.mSavedFragmentState = i2;
                fragment2.mFragmentManager = this;
                if (P(2)) {
                    fragment2.toString();
                }
                jVar.j(this.w.c.getClassLoader());
                kVar.g(jVar);
                jVar.e = this.v;
            }
        }
        androidx.fragment.app.i iVar = this.O;
        iVar.getClass();
        Iterator it2 = new ArrayList(iVar.b.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (P(2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.b);
                }
                this.O.k(fragment3);
                fragment3.mFragmentManager = this;
                androidx.fragment.app.j jVar2 = new androidx.fragment.app.j(hVar, kVar, fragment3);
                jVar2.e = 1;
                jVar2.i();
                fragment3.mRemoving = true;
                jVar2.i();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.c;
        kVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b2 = kVar.b(str3);
                if (b2 == null) {
                    throw new IllegalStateException(zr.a("No instantiated fragment for (", str3, ")"));
                }
                if (P(2)) {
                    b2.toString();
                }
                kVar.a(b2);
            }
        }
        if (fragmentManagerState.d != null) {
            this.d = new ArrayList<>(fragmentManagerState.d.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.d;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a a2 = backStackRecordStateArr[i3].a(this);
                if (P(2)) {
                    a2.toString();
                    PrintWriter printWriter = new PrintWriter(new a100());
                    a2.o("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a2);
                i3++;
            }
        } else {
            this.d = new ArrayList<>();
        }
        this.j.set(fragmentManagerState.e);
        String str4 = fragmentManagerState.f;
        if (str4 != null) {
            Fragment b3 = kVar.b(str4);
            this.z = b3;
            t(b3);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.g;
        if (arrayList2 != null) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                this.k.put(arrayList2.get(i4), fragmentManagerState.h.get(i4));
            }
        }
        this.F = new ArrayDeque<>(fragmentManagerState.i);
    }

    public final HashSet g() {
        Object bVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((androidx.fragment.app.j) it.next()).c.mContainer;
            if (viewGroup != null) {
                O();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof SpecialEffectsController) {
                    bVar = (SpecialEffectsController) tag;
                } else {
                    bVar = new androidx.fragment.app.b(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
                }
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    @NonNull
    public final Bundle g0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        I();
        z();
        C(true);
        this.H = true;
        this.O.g = true;
        androidx.fragment.app.k kVar = this.c;
        kVar.getClass();
        HashMap<String, androidx.fragment.app.j> hashMap = kVar.b;
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.size());
        for (androidx.fragment.app.j jVar : hashMap.values()) {
            if (jVar != null) {
                Fragment fragment = jVar.c;
                kVar.i(jVar.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (P(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> hashMap2 = this.c.c;
        if (!hashMap2.isEmpty()) {
            androidx.fragment.app.k kVar2 = this.c;
            synchronized (kVar2.a) {
                try {
                    backStackRecordStateArr = null;
                    if (kVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(kVar2.a.size());
                        Iterator<Fragment> it = kVar2.a.iterator();
                        while (it.hasNext()) {
                            Fragment next = it.next();
                            arrayList.add(next.mWho);
                            if (P(2)) {
                                next.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState(this.d.get(i2));
                    if (P(2)) {
                        Objects.toString(this.d.get(i2));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.b = arrayList2;
            fragmentManagerState.c = arrayList;
            fragmentManagerState.d = backStackRecordStateArr;
            fragmentManagerState.e = this.j.get();
            Fragment fragment2 = this.z;
            if (fragment2 != null) {
                fragmentManagerState.f = fragment2.mWho;
            }
            fragmentManagerState.g.addAll(this.k.keySet());
            fragmentManagerState.h.addAll(this.k.values());
            fragmentManagerState.i = new ArrayList<>(this.F);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.l.keySet()) {
                bundle.putBundle(go9.b("result_", str), this.l.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(go9.b("fragment_", str2), hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final HashSet h(@NonNull ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        Object bVar;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<l.a> it = ((androidx.fragment.app.a) arrayList.get(i2)).c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    O();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof SpecialEffectsController) {
                        bVar = (SpecialEffectsController) tag;
                    } else {
                        bVar = new androidx.fragment.app.b(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
                    }
                    hashSet.add(bVar);
                }
            }
            i2++;
        }
        return hashSet;
    }

    @Nullable
    public final Fragment.SavedState h0(@NonNull Fragment fragment) {
        androidx.fragment.app.j jVar = this.c.b.get(fragment.mWho);
        if (jVar != null) {
            Fragment fragment2 = jVar.c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(jVar.l());
                }
                return null;
            }
        }
        q0(new IllegalStateException(kas.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    @NonNull
    public final androidx.fragment.app.j i(@NonNull Fragment fragment) {
        String str = fragment.mWho;
        androidx.fragment.app.k kVar = this.c;
        androidx.fragment.app.j jVar = kVar.b.get(str);
        if (jVar != null) {
            return jVar;
        }
        androidx.fragment.app.j jVar2 = new androidx.fragment.app.j(this.o, kVar, fragment);
        jVar2.j(this.w.c.getClassLoader());
        jVar2.e = this.v;
        return jVar2;
    }

    public final void i0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.d.removeCallbacks(this.P);
                    this.w.d.post(this.P);
                    s0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(@NonNull Fragment fragment) {
        if (P(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (P(2)) {
                fragment.toString();
            }
            androidx.fragment.app.k kVar = this.c;
            synchronized (kVar.a) {
                kVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (Q(fragment)) {
                this.G = true;
            }
            o0(fragment);
        }
    }

    public final void j0(@NonNull Fragment fragment, boolean z) {
        ViewGroup M = M(fragment);
        if (M == null || !(M instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) M).setDrawDisappearingViewsLast(!z);
    }

    public final void k(boolean z, @NonNull Configuration configuration) {
        if (z && (this.w instanceof h380)) {
            q0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.k(true, configuration);
                }
            }
        }
    }

    public final void k0(@NonNull Bundle bundle, @NonNull String str) {
        n nVar = this.m.get(str);
        if (nVar == null || !nVar.a(Lifecycle.State.STARTED)) {
            this.l.put(str, bundle);
        } else {
            nVar.p(bundle, str);
        }
        if (P(2)) {
            Objects.toString(bundle);
        }
    }

    public final boolean l(@NonNull MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void l0(@NonNull String str, @NonNull f5z f5zVar, @NonNull pcs pcsVar) {
        Lifecycle lifecycle = f5zVar.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        g gVar = new g(str, pcsVar, lifecycle);
        n put = this.m.put(str, new n(lifecycle, pcsVar, gVar));
        if (put != null) {
            put.b();
        }
        if (P(2)) {
            lifecycle.toString();
            Objects.toString(pcsVar);
        }
        lifecycle.addObserver(gVar);
    }

    public final boolean m(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.v < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void m0(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void n() {
        boolean z = true;
        this.J = true;
        C(true);
        z();
        fbs<?> fbsVar = this.w;
        boolean z2 = fbsVar instanceof xyt0;
        androidx.fragment.app.k kVar = this.c;
        if (z2) {
            z = kVar.d.f;
        } else {
            FragmentActivity fragmentActivity = fbsVar.c;
            if (fragmentActivity != null) {
                z = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator<BackStackState> it = this.k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().b.iterator();
                while (it2.hasNext()) {
                    kVar.d.j((String) it2.next(), false);
                }
            }
        }
        w(-1);
        Object obj = this.w;
        if (obj instanceof mc80) {
            ((mc80) obj).removeOnTrimMemoryListener(this.r);
        }
        Object obj2 = this.w;
        if (obj2 instanceof h380) {
            ((h380) obj2).removeOnConfigurationChangedListener(this.q);
        }
        Object obj3 = this.w;
        if (obj3 instanceof r980) {
            ((r980) obj3).removeOnMultiWindowModeChangedListener(this.s);
        }
        Object obj4 = this.w;
        if (obj4 instanceof aa80) {
            ((aa80) obj4).removeOnPictureInPictureModeChangedListener(this.t);
        }
        Object obj5 = this.w;
        if ((obj5 instanceof j620) && this.y == null) {
            ((j620) obj5).removeMenuProvider(this.u);
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.i.remove();
            this.g = null;
        }
        nb0 nb0Var = this.C;
        if (nb0Var != null) {
            nb0Var.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void n0(@Nullable Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.z;
        this.z = fragment;
        t(fragment2);
        t(this.z);
    }

    public final void o(boolean z) {
        if (z && (this.w instanceof mc80)) {
            q0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.o(true);
                }
            }
        }
    }

    public final void o0(@NonNull Fragment fragment) {
        ViewGroup M = M(fragment);
        if (M != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (M.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    M.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) M.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void p(boolean z, boolean z2) {
        if (z2 && (this.w instanceof r980)) {
            q0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.p(z, true);
                }
            }
        }
    }

    public final void p0() {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            androidx.fragment.app.j jVar = (androidx.fragment.app.j) it.next();
            Fragment fragment = jVar.c;
            if (fragment.mDeferStart) {
                if (this.b) {
                    this.K = true;
                } else {
                    fragment.mDeferStart = false;
                    jVar.i();
                }
            }
        }
    }

    public final void q() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.q();
            }
        }
    }

    public final void q0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a100());
        fbs<?> fbsVar = this.w;
        if (fbsVar != null) {
            try {
                fbsVar.d(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            y("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final boolean r(@NonNull MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r0(@NonNull m mVar) {
        androidx.fragment.app.h hVar = this.o;
        synchronized (hVar.b) {
            try {
                int size = hVar.b.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (hVar.b.get(i2).a() == mVar) {
                        hVar.b.remove(i2);
                        break;
                    }
                    i2++;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(@NonNull Menu menu) {
        if (this.v < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void s0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.i.setEnabled(true);
                    if (P(3)) {
                        toString();
                    }
                } else {
                    boolean z = K() > 0 && S(this.y);
                    if (P(3)) {
                        toString();
                    }
                    this.i.setEnabled(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(@Nullable Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.y;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            fbs<?> fbsVar = this.w;
            if (fbsVar != null) {
                sb.append(fbsVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(boolean z, boolean z2) {
        if (z2 && (this.w instanceof aa80)) {
            q0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.u(z, true);
                }
            }
        }
    }

    public final boolean v(@NonNull Menu menu) {
        boolean z = false;
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void w(int i2) {
        try {
            this.b = true;
            for (androidx.fragment.app.j jVar : this.c.b.values()) {
                if (jVar != null) {
                    jVar.e = i2;
                }
            }
            U(i2, false);
            Iterator it = g().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).h();
            }
            this.b = false;
            C(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.K) {
            this.K = false;
            p0();
        }
    }

    public final void y(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        String a2 = fo8.a(str, "    ");
        androidx.fragment.app.k kVar = this.c;
        ArrayList<Fragment> arrayList = kVar.a;
        String a3 = fo8.a(str, "    ");
        HashMap<String, androidx.fragment.app.j> hashMap = kVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.j jVar : hashMap.values()) {
                printWriter.print(str);
                if (jVar != null) {
                    Fragment fragment = jVar.c;
                    printWriter.println(fragment);
                    fragment.dump(a3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment2 = arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment3 = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(a2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (p) this.a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void z() {
        Iterator it = g().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).h();
        }
    }

    public static abstract class m {
        public void e(@NonNull Fragment fragment) {
        }

        public void f(@NonNull Fragment fragment) {
        }

        public void g(@NonNull Fragment fragment) {
        }

        public void i(@NonNull Fragment fragment) {
        }

        public void j(@NonNull Fragment fragment) {
        }

        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void c(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void d(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void h(@NonNull Bundle bundle, @NonNull Fragment fragment) {
        }

        public void k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view) {
        }
    }
}
