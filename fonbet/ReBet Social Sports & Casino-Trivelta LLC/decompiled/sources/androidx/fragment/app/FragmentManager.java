package androidx.fragment.app;

import S0.c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C2035b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.view.InterfaceC2120x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import androidx.savedstate.a;
import j.AbstractC5086b;
import j.InterfaceC5085a;
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
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k.AbstractC5140a;
import l0.InterfaceC5340e;
import l0.InterfaceC5341f;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: U, reason: collision with root package name */
    public static boolean f19926U = false;

    /* renamed from: V, reason: collision with root package name */
    public static boolean f19927V = true;

    /* renamed from: A, reason: collision with root package name */
    public Fragment f19928A;

    /* renamed from: F, reason: collision with root package name */
    public AbstractC5086b f19933F;

    /* renamed from: G, reason: collision with root package name */
    public AbstractC5086b f19934G;

    /* renamed from: H, reason: collision with root package name */
    public AbstractC5086b f19935H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f19937J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f19938K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f19939L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f19940M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f19941N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f19942O;

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f19943P;

    /* renamed from: Q, reason: collision with root package name */
    public ArrayList f19944Q;

    /* renamed from: R, reason: collision with root package name */
    public H f19945R;

    /* renamed from: S, reason: collision with root package name */
    public c.C0202c f19946S;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19949b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f19952e;

    /* renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f19954g;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC2173x f19971x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC2170u f19972y;

    /* renamed from: z, reason: collision with root package name */
    public Fragment f19973z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19948a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final M f19950c = new M();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f19951d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C2174y f19953f = new LayoutInflaterFactory2C2174y(this);

    /* renamed from: h, reason: collision with root package name */
    public C2151a f19955h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19956i = false;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.activity.F f19957j = new b(false);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f19958k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f19959l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f19960m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final Map f19961n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f19962o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final C2175z f19963p = new C2175z(this);

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f19964q = new CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC6772a f19965r = new InterfaceC6772a() { // from class: androidx.fragment.app.A
        @Override // x0.InterfaceC6772a
        public final void accept(Object obj) {
            FragmentManager.f(FragmentManager.this, (Configuration) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC6772a f19966s = new InterfaceC6772a() { // from class: androidx.fragment.app.B
        @Override // x0.InterfaceC6772a
        public final void accept(Object obj) {
            FragmentManager.a(FragmentManager.this, (Integer) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC6772a f19967t = new InterfaceC6772a() { // from class: androidx.fragment.app.C
        @Override // x0.InterfaceC6772a
        public final void accept(Object obj) {
            FragmentManager.e(FragmentManager.this, (androidx.core.app.i) obj);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC6772a f19968u = new InterfaceC6772a() { // from class: androidx.fragment.app.D
        @Override // x0.InterfaceC6772a
        public final void accept(Object obj) {
            FragmentManager.d(FragmentManager.this, (androidx.core.app.w) obj);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public final androidx.core.view.C f19969v = new c();

    /* renamed from: w, reason: collision with root package name */
    public int f19970w = -1;

    /* renamed from: B, reason: collision with root package name */
    public AbstractC2172w f19929B = null;

    /* renamed from: C, reason: collision with root package name */
    public AbstractC2172w f19930C = new d();

    /* renamed from: D, reason: collision with root package name */
    public Y f19931D = null;

    /* renamed from: E, reason: collision with root package name */
    public Y f19932E = new e();

    /* renamed from: I, reason: collision with root package name */
    public ArrayDeque f19936I = new ArrayDeque();

    /* renamed from: T, reason: collision with root package name */
    public Runnable f19947T = new f();

    public class a implements InterfaceC5085a {
        public a() {
        }

        @Override // j.InterfaceC5085a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f19936I.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfo.f19978a;
            int i11 = launchedFragmentInfo.f19979b;
            Fragment i12 = FragmentManager.this.f19950c.i(str);
            if (i12 != null) {
                i12.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends androidx.activity.F {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.F
        public void handleOnBackCancelled() {
            if (FragmentManager.Q0(3)) {
                boolean z10 = FragmentManager.f19926U;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.f19927V) {
                FragmentManager.this.t();
            }
        }

        @Override // androidx.activity.F
        public void handleOnBackPressed() {
            if (FragmentManager.Q0(3)) {
                boolean z10 = FragmentManager.f19926U;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager.this.M0();
        }

        @Override // androidx.activity.F
        public void handleOnBackProgressed(C2035b c2035b) {
            if (FragmentManager.Q0(2)) {
                boolean z10 = FragmentManager.f19926U;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f19955h != null) {
                Iterator it = fragmentManager.A(new ArrayList(Collections.singletonList(FragmentManager.this.f19955h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((X) it.next()).A(c2035b);
                }
                Iterator it2 = FragmentManager.this.f19962o.iterator();
                while (it2.hasNext()) {
                    ((m) it2.next()).a(c2035b);
                }
            }
        }

        @Override // androidx.activity.F
        public void handleOnBackStarted(C2035b c2035b) {
            if (FragmentManager.Q0(3)) {
                boolean z10 = FragmentManager.f19926U;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.f19927V) {
                FragmentManager.this.d0();
                FragmentManager.this.m1();
            }
        }
    }

    public class c implements androidx.core.view.C {
        public c() {
        }

        @Override // androidx.core.view.C
        public void a(Menu menu) {
            FragmentManager.this.Q(menu);
        }

        @Override // androidx.core.view.C
        public void b(Menu menu) {
            FragmentManager.this.U(menu);
        }

        @Override // androidx.core.view.C
        public boolean c(MenuItem menuItem) {
            return FragmentManager.this.P(menuItem);
        }

        @Override // androidx.core.view.C
        public void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.I(menu, menuInflater);
        }
    }

    public class d extends AbstractC2172w {
        public d() {
        }

        @Override // androidx.fragment.app.AbstractC2172w
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.D0().b(FragmentManager.this.D0().f(), str, null);
        }
    }

    public class e implements Y {
        public e() {
        }

        @Override // androidx.fragment.app.Y
        public X a(ViewGroup viewGroup) {
            return new C2154d(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.g0(true);
        }
    }

    public class g implements I {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19986a;

        public g(Fragment fragment) {
            this.f19986a = fragment;
        }

        @Override // androidx.fragment.app.I
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f19986a.onAttachFragment(fragment);
        }
    }

    public class h implements InterfaceC5085a {
        public h() {
        }

        @Override // j.InterfaceC5085a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f19936I.pollLast();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfo.f19978a;
            int i10 = launchedFragmentInfo.f19979b;
            Fragment i11 = FragmentManager.this.f19950c.i(str);
            if (i11 != null) {
                i11.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class i implements InterfaceC5085a {
        public i() {
        }

        @Override // j.InterfaceC5085a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f19936I.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfo.f19978a;
            int i10 = launchedFragmentInfo.f19979b;
            Fragment i11 = FragmentManager.this.f19950c.i(str);
            if (i11 != null) {
                i11.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class j extends AbstractC5140a {
        @Override // k.AbstractC5140a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.Q0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // k.AbstractC5140a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class k {
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void d(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void k(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void l(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    public static class l implements J {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC2185j f19990a;

        /* renamed from: b, reason: collision with root package name */
        public final J f19991b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2191p f19992c;

        public l(AbstractC2185j abstractC2185j, J j10, InterfaceC2191p interfaceC2191p) {
            this.f19990a = abstractC2185j;
            this.f19991b = j10;
            this.f19992c = interfaceC2191p;
        }

        @Override // androidx.fragment.app.J
        public void a(String str, Bundle bundle) {
            this.f19991b.a(str, bundle);
        }

        public boolean b(AbstractC2185j.b bVar) {
            return this.f19990a.b().b(bVar);
        }

        public void c() {
            this.f19990a.d(this.f19992c);
        }
    }

    public interface m {
        default void a(C2035b c2035b) {
        }

        default void b(Fragment fragment, boolean z10) {
        }

        default void c(Fragment fragment, boolean z10) {
        }

        default void d() {
        }

        void onBackStackChanged();
    }

    public interface n {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class o implements n {

        /* renamed from: a, reason: collision with root package name */
        public final String f19993a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19994b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19995c;

        public o(String str, int i10, int i11) {
            this.f19993a = str;
            this.f19994b = i10;
            this.f19995c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f19928A;
            if (fragment == null || this.f19994b >= 0 || this.f19993a != null || !fragment.getChildFragmentManager().h1()) {
                return FragmentManager.this.k1(arrayList, arrayList2, this.f19993a, this.f19994b, this.f19995c);
            }
            return false;
        }
    }

    public class p implements n {
        public p() {
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean l12 = FragmentManager.this.l1(arrayList, arrayList2);
            if (!FragmentManager.this.f19962o.isEmpty() && arrayList.size() > 0) {
                boolean booleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.u0((C2151a) it.next()));
                }
                Iterator it2 = FragmentManager.this.f19962o.iterator();
                while (it2.hasNext()) {
                    m mVar = (m) it2.next();
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        mVar.c((Fragment) it3.next(), booleanValue);
                    }
                }
            }
            return l12;
        }
    }

    public static Fragment K0(View view) {
        Object tag = view.getTag(R0.b.f9915a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean Q0(int i10) {
        return f19926U || Log.isLoggable("FragmentManager", i10);
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.S0() && num.intValue() == 80) {
            fragmentManager.L(false);
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        Iterator it = fragmentManager.f19962o.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, androidx.core.app.w wVar) {
        if (fragmentManager.S0()) {
            fragmentManager.T(wVar.a(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, androidx.core.app.i iVar) {
        if (fragmentManager.S0()) {
            fragmentManager.M(iVar.a(), false);
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.S0()) {
            fragmentManager.F(configuration, false);
        }
    }

    public static void i0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C2151a c2151a = (C2151a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c2151a.y(-1);
                c2151a.E();
            } else {
                c2151a.y(1);
                c2151a.D();
            }
            i10++;
        }
    }

    public static Fragment n0(View view) {
        Fragment s02 = s0(view);
        if (s02 != null) {
            return s02;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager r0(View view) {
        AbstractActivityC2168s abstractActivityC2168s;
        Fragment s02 = s0(view);
        if (s02 != null) {
            if (s02.isAdded()) {
                return s02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + s02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC2168s = null;
                break;
            }
            if (context instanceof AbstractActivityC2168s) {
                abstractActivityC2168s = (AbstractActivityC2168s) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC2168s != null) {
            return abstractActivityC2168s.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static Fragment s0(View view) {
        while (view != null) {
            Fragment K02 = K0(view);
            if (K02 != null) {
                return K02;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static int v1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public Set A(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C2151a) arrayList.get(i10)).f20048c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((N.a) it.next()).f20066b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(X.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final ViewGroup A0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f19972y.d()) {
            View c10 = this.f19972y.c(fragment.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    public final void A1(String str, Bundle bundle) {
        l lVar = (l) this.f19961n.get(str);
        if (lVar == null || !lVar.b(AbstractC2185j.b.f20393d)) {
            this.f19960m.put(str, bundle);
        } else {
            lVar.a(str, bundle);
        }
        if (Q0(2)) {
            Objects.toString(bundle);
        }
    }

    public K B(Fragment fragment) {
        K n10 = this.f19950c.n(fragment.mWho);
        if (n10 != null) {
            return n10;
        }
        K k10 = new K(this.f19963p, this.f19950c, fragment);
        k10.o(this.f19971x.f().getClassLoader());
        k10.t(this.f19970w);
        return k10;
    }

    public AbstractC2172w B0() {
        AbstractC2172w abstractC2172w = this.f19929B;
        if (abstractC2172w != null) {
            return abstractC2172w;
        }
        Fragment fragment = this.f19973z;
        return fragment != null ? fragment.mFragmentManager.B0() : this.f19930C;
    }

    public final void B1(final String str, InterfaceC2193s interfaceC2193s, final J j10) {
        final AbstractC2185j lifecycle = interfaceC2193s.getLifecycle();
        if (lifecycle.b() == AbstractC2185j.b.f20390a) {
            return;
        }
        InterfaceC2191p interfaceC2191p = new InterfaceC2191p() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.InterfaceC2191p
            public void k(InterfaceC2193s interfaceC2193s2, AbstractC2185j.a aVar) {
                Bundle bundle;
                if (aVar == AbstractC2185j.a.ON_START && (bundle = (Bundle) FragmentManager.this.f19960m.get(str)) != null) {
                    j10.a(str, bundle);
                    FragmentManager.this.y(str);
                }
                if (aVar == AbstractC2185j.a.ON_DESTROY) {
                    lifecycle.d(this);
                    FragmentManager.this.f19961n.remove(str);
                }
            }
        };
        l lVar = (l) this.f19961n.put(str, new l(lifecycle, j10, interfaceC2191p));
        if (lVar != null) {
            lVar.c();
        }
        if (Q0(2)) {
            lifecycle.toString();
            Objects.toString(j10);
        }
        lifecycle.a(interfaceC2191p);
    }

    public void C(Fragment fragment) {
        if (Q0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Q0(2)) {
                fragment.toString();
            }
            this.f19950c.u(fragment);
            if (R0(fragment)) {
                this.f19937J = true;
            }
            E1(fragment);
        }
    }

    public List C0() {
        return this.f19950c.o();
    }

    public void C1(Fragment fragment, AbstractC2185j.b bVar) {
        if (fragment.equals(l0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void D() {
        this.f19938K = false;
        this.f19939L = false;
        this.f19945R.l(false);
        Y(4);
    }

    public AbstractC2173x D0() {
        return this.f19971x;
    }

    public void D1(Fragment fragment) {
        if (fragment == null || (fragment.equals(l0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f19928A;
            this.f19928A = fragment;
            R(fragment2);
            R(this.f19928A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void E() {
        this.f19938K = false;
        this.f19939L = false;
        this.f19945R.l(false);
        Y(0);
    }

    public LayoutInflater.Factory2 E0() {
        return this.f19953f;
    }

    public final void E1(Fragment fragment) {
        ViewGroup A02 = A0(fragment);
        if (A02 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (A02.getTag(R0.b.f9917c) == null) {
            A02.setTag(R0.b.f9917c, fragment);
        }
        ((Fragment) A02.getTag(R0.b.f9917c)).setPopDirection(fragment.getPopDirection());
    }

    public void F(Configuration configuration, boolean z10) {
        if (z10 && (this.f19971x instanceof InterfaceC5340e)) {
            H1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.F(configuration, true);
                }
            }
        }
    }

    public C2175z F0() {
        return this.f19963p;
    }

    public void F1(Fragment fragment) {
        if (Q0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public boolean G(MenuItem menuItem) {
        if (this.f19970w < 1) {
            return false;
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment G0() {
        return this.f19973z;
    }

    public final void G1() {
        Iterator it = this.f19950c.k().iterator();
        while (it.hasNext()) {
            e1((K) it.next());
        }
    }

    public void H() {
        this.f19938K = false;
        this.f19939L = false;
        this.f19945R.l(false);
        Y(1);
    }

    public Fragment H0() {
        return this.f19928A;
    }

    public final void H1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new U("FragmentManager"));
        AbstractC2173x abstractC2173x = this.f19971x;
        if (abstractC2173x != null) {
            try {
                abstractC2173x.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            c0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public boolean I(Menu menu, MenuInflater menuInflater) {
        if (this.f19970w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null && U0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f19952e != null) {
            for (int i10 = 0; i10 < this.f19952e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f19952e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f19952e = arrayList;
        return z10;
    }

    public Y I0() {
        Y y10 = this.f19931D;
        if (y10 != null) {
            return y10;
        }
        Fragment fragment = this.f19973z;
        return fragment != null ? fragment.mFragmentManager.I0() : this.f19932E;
    }

    public void I1(k kVar) {
        this.f19963p.p(kVar);
    }

    public void J() {
        this.f19940M = true;
        g0(true);
        d0();
        x();
        Y(-1);
        Object obj = this.f19971x;
        if (obj instanceof InterfaceC5341f) {
            ((InterfaceC5341f) obj).removeOnTrimMemoryListener(this.f19966s);
        }
        Object obj2 = this.f19971x;
        if (obj2 instanceof InterfaceC5340e) {
            ((InterfaceC5340e) obj2).removeOnConfigurationChangedListener(this.f19965r);
        }
        Object obj3 = this.f19971x;
        if (obj3 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj3).removeOnMultiWindowModeChangedListener(this.f19967t);
        }
        Object obj4 = this.f19971x;
        if (obj4 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) obj4).removeOnPictureInPictureModeChangedListener(this.f19968u);
        }
        Object obj5 = this.f19971x;
        if ((obj5 instanceof InterfaceC2120x) && this.f19973z == null) {
            ((InterfaceC2120x) obj5).removeMenuProvider(this.f19969v);
        }
        this.f19971x = null;
        this.f19972y = null;
        this.f19973z = null;
        if (this.f19954g != null) {
            this.f19957j.remove();
            this.f19954g = null;
        }
        AbstractC5086b abstractC5086b = this.f19933F;
        if (abstractC5086b != null) {
            abstractC5086b.d();
            this.f19934G.d();
            this.f19935H.d();
        }
    }

    public c.C0202c J0() {
        return this.f19946S;
    }

    public final void J1() {
        synchronized (this.f19948a) {
            try {
                if (!this.f19948a.isEmpty()) {
                    this.f19957j.setEnabled(true);
                    if (Q0(3)) {
                        toString();
                    }
                } else {
                    boolean z10 = w0() > 0 && V0(this.f19973z);
                    if (Q0(3)) {
                        toString();
                    }
                    this.f19957j.setEnabled(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void K() {
        Y(1);
    }

    public void L(boolean z10) {
        if (z10 && (this.f19971x instanceof InterfaceC5341f)) {
            H1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.L(true);
                }
            }
        }
    }

    public androidx.lifecycle.V L0(Fragment fragment) {
        return this.f19945R.i(fragment);
    }

    public void M(boolean z10, boolean z11) {
        if (z11 && (this.f19971x instanceof androidx.core.app.s)) {
            H1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.M(z10, true);
                }
            }
        }
    }

    public void M0() {
        this.f19956i = true;
        g0(true);
        this.f19956i = false;
        if (!f19927V || this.f19955h == null) {
            if (this.f19957j.isEnabled()) {
                Q0(3);
                h1();
                return;
            } else {
                Q0(3);
                this.f19954g.l();
                return;
            }
        }
        if (!this.f19962o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(u0(this.f19955h));
            Iterator it = this.f19962o.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    mVar.b((Fragment) it2.next(), true);
                }
            }
        }
        Iterator it3 = this.f19955h.f20048c.iterator();
        while (it3.hasNext()) {
            Fragment fragment = ((N.a) it3.next()).f20066b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it4 = A(new ArrayList(Collections.singletonList(this.f19955h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((X) it4.next()).f();
        }
        Iterator it5 = this.f19955h.f20048c.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = ((N.a) it5.next()).f20066b;
            if (fragment2 != null && fragment2.mContainer == null) {
                B(fragment2).m();
            }
        }
        this.f19955h = null;
        J1();
        if (Q0(3)) {
            this.f19957j.isEnabled();
            toString();
        }
    }

    public void N(Fragment fragment) {
        Iterator it = this.f19964q.iterator();
        while (it.hasNext()) {
            ((I) it.next()).a(this, fragment);
        }
    }

    public void N0(Fragment fragment) {
        if (Q0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        E1(fragment);
    }

    public void O() {
        for (Fragment fragment : this.f19950c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.O();
            }
        }
    }

    public void O0(Fragment fragment) {
        if (fragment.mAdded && R0(fragment)) {
            this.f19937J = true;
        }
    }

    public boolean P(MenuItem menuItem) {
        if (this.f19970w < 1) {
            return false;
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean P0() {
        return this.f19940M;
    }

    public void Q(Menu menu) {
        if (this.f19970w < 1) {
            return;
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void R(Fragment fragment) {
        if (fragment == null || !fragment.equals(l0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public final boolean R0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.u();
    }

    public void S() {
        Y(5);
    }

    public final boolean S0() {
        Fragment fragment = this.f19973z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f19973z.getParentFragmentManager().S0();
    }

    public void T(boolean z10, boolean z11) {
        if (z11 && (this.f19971x instanceof androidx.core.app.t)) {
            H1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.T(z10, true);
                }
            }
        }
    }

    public boolean T0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public boolean U(Menu menu) {
        boolean z10 = false;
        if (this.f19970w < 1) {
            return false;
        }
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null && U0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean U0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void V() {
        J1();
        R(this.f19928A);
    }

    public boolean V0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.H0()) && V0(fragmentManager.f19973z);
    }

    public void W() {
        this.f19938K = false;
        this.f19939L = false;
        this.f19945R.l(false);
        Y(7);
    }

    public boolean W0(int i10) {
        return this.f19970w >= i10;
    }

    public void X() {
        this.f19938K = false;
        this.f19939L = false;
        this.f19945R.l(false);
        Y(5);
    }

    public boolean X0() {
        return this.f19938K || this.f19939L;
    }

    public final void Y(int i10) {
        try {
            this.f19949b = true;
            this.f19950c.d(i10);
            b1(i10, false);
            Iterator it = z().iterator();
            while (it.hasNext()) {
                ((X) it.next()).q();
            }
            this.f19949b = false;
            g0(true);
        } catch (Throwable th2) {
            this.f19949b = false;
            throw th2;
        }
    }

    public void Y0(Fragment fragment, String[] strArr, int i10) {
        if (this.f19935H == null) {
            this.f19971x.l(fragment, strArr, i10);
            return;
        }
        this.f19936I.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        this.f19935H.b(strArr);
    }

    public void Z() {
        this.f19939L = true;
        this.f19945R.l(true);
        Y(4);
    }

    public void Z0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f19933F == null) {
            this.f19971x.n(fragment, intent, i10, bundle);
            return;
        }
        this.f19936I.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f19933F.b(intent);
    }

    public void a0() {
        Y(2);
    }

    public void a1(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.f19934G == null) {
            this.f19971x.o(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Q0(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest a10 = new IntentSenderRequest.a(intentSender).b(intent).c(i12, i11).a();
        this.f19936I.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (Q0(2)) {
            fragment.toString();
        }
        this.f19934G.b(a10);
    }

    public final void b0() {
        if (this.f19941N) {
            this.f19941N = false;
            G1();
        }
    }

    public void b1(int i10, boolean z10) {
        AbstractC2173x abstractC2173x;
        if (this.f19971x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f19970w) {
            this.f19970w = i10;
            this.f19950c.t();
            G1();
            if (this.f19937J && (abstractC2173x = this.f19971x) != null && this.f19970w == 7) {
                abstractC2173x.p();
                this.f19937J = false;
            }
        }
    }

    public void c0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f19950c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f19952e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f19952e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.f19951d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C2151a c2151a = (C2151a) this.f19951d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c2151a.toString());
                c2151a.B(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f19958k.get());
        synchronized (this.f19948a) {
            try {
                int size3 = this.f19948a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        n nVar = (n) this.f19948a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(nVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f19971x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f19972y);
        if (this.f19973z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f19973z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f19970w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f19938K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f19939L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f19940M);
        if (this.f19937J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f19937J);
        }
    }

    public void c1() {
        if (this.f19971x == null) {
            return;
        }
        this.f19938K = false;
        this.f19939L = false;
        this.f19945R.l(false);
        for (Fragment fragment : this.f19950c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void d0() {
        Iterator it = z().iterator();
        while (it.hasNext()) {
            ((X) it.next()).q();
        }
    }

    public final void d1(FragmentContainerView fragmentContainerView) {
        View view;
        for (K k10 : this.f19950c.k()) {
            Fragment k11 = k10.k();
            if (k11.mContainerId == fragmentContainerView.getId() && (view = k11.mView) != null && view.getParent() == null) {
                k11.mContainer = fragmentContainerView;
                k10.b();
                k10.m();
            }
        }
    }

    public void e0(n nVar, boolean z10) {
        if (!z10) {
            if (this.f19971x == null) {
                if (!this.f19940M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            v();
        }
        synchronized (this.f19948a) {
            try {
                if (this.f19971x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f19948a.add(nVar);
                    y1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e1(K k10) {
        Fragment k11 = k10.k();
        if (k11.mDeferStart) {
            if (this.f19949b) {
                this.f19941N = true;
            } else {
                k11.mDeferStart = false;
                k10.m();
            }
        }
    }

    public final void f0(boolean z10) {
        if (this.f19949b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f19971x == null) {
            if (!this.f19940M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f19971x.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            v();
        }
        if (this.f19942O == null) {
            this.f19942O = new ArrayList();
            this.f19943P = new ArrayList();
        }
    }

    public void f1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            e0(new o(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean g0(boolean z10) {
        C2151a c2151a;
        f0(z10);
        boolean z11 = false;
        if (!this.f19956i && (c2151a = this.f19955h) != null) {
            c2151a.f20143u = false;
            c2151a.z();
            if (Q0(3)) {
                Objects.toString(this.f19955h);
                Objects.toString(this.f19948a);
            }
            this.f19955h.A(false, false);
            this.f19948a.add(0, this.f19955h);
            Iterator it = this.f19955h.f20048c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((N.a) it.next()).f20066b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f19955h = null;
        }
        while (v0(this.f19942O, this.f19943P)) {
            z11 = true;
            this.f19949b = true;
            try {
                r1(this.f19942O, this.f19943P);
            } finally {
                w();
            }
        }
        J1();
        b0();
        this.f19950c.b();
        return z11;
    }

    public void g1(String str, int i10) {
        e0(new o(str, -1, i10), false);
    }

    public void h0(n nVar, boolean z10) {
        if (z10 && (this.f19971x == null || this.f19940M)) {
            return;
        }
        f0(z10);
        C2151a c2151a = this.f19955h;
        boolean z11 = false;
        if (c2151a != null) {
            c2151a.f20143u = false;
            c2151a.z();
            if (Q0(3)) {
                Objects.toString(this.f19955h);
                Objects.toString(nVar);
            }
            this.f19955h.A(false, false);
            boolean a10 = this.f19955h.a(this.f19942O, this.f19943P);
            Iterator it = this.f19955h.f20048c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((N.a) it.next()).f20066b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f19955h = null;
            z11 = a10;
        }
        boolean a11 = nVar.a(this.f19942O, this.f19943P);
        if (z11 || a11) {
            this.f19949b = true;
            try {
                r1(this.f19942O, this.f19943P);
            } finally {
                w();
            }
        }
        J1();
        b0();
        this.f19950c.b();
    }

    public boolean h1() {
        return j1(null, -1, 0);
    }

    public boolean i1(int i10, int i11) {
        if (i10 >= 0) {
            return j1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public final void j0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = ((C2151a) arrayList.get(i10)).f20063r;
        ArrayList arrayList3 = this.f19944Q;
        if (arrayList3 == null) {
            this.f19944Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f19944Q.addAll(this.f19950c.o());
        Fragment H02 = H0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C2151a c2151a = (C2151a) arrayList.get(i12);
            H02 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c2151a.F(this.f19944Q, H02) : c2151a.I(this.f19944Q, H02);
            z11 = z11 || c2151a.f20054i;
        }
        this.f19944Q.clear();
        if (!z10 && this.f19970w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C2151a) arrayList.get(i13)).f20048c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((N.a) it.next()).f20066b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f19950c.r(B(fragment));
                    }
                }
            }
        }
        i0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && !this.f19962o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(u0((C2151a) it2.next()));
            }
            if (this.f19955h == null) {
                Iterator it3 = this.f19962o.iterator();
                while (it3.hasNext()) {
                    m mVar = (m) it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        mVar.c((Fragment) it4.next(), booleanValue);
                    }
                }
                Iterator it5 = this.f19962o.iterator();
                while (it5.hasNext()) {
                    m mVar2 = (m) it5.next();
                    Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        mVar2.b((Fragment) it6.next(), booleanValue);
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C2151a c2151a2 = (C2151a) arrayList.get(i14);
            if (booleanValue) {
                for (int size = c2151a2.f20048c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((N.a) c2151a2.f20048c.get(size)).f20066b;
                    if (fragment2 != null) {
                        B(fragment2).m();
                    }
                }
            } else {
                Iterator it7 = c2151a2.f20048c.iterator();
                while (it7.hasNext()) {
                    Fragment fragment3 = ((N.a) it7.next()).f20066b;
                    if (fragment3 != null) {
                        B(fragment3).m();
                    }
                }
            }
        }
        b1(this.f19970w, true);
        for (X x10 : A(arrayList, i10, i11)) {
            x10.D(booleanValue);
            x10.z();
            x10.n();
        }
        while (i10 < i11) {
            C2151a c2151a3 = (C2151a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c2151a3.f20144v >= 0) {
                c2151a3.f20144v = -1;
            }
            c2151a3.H();
            i10++;
        }
        if (z11) {
            t1();
        }
    }

    public final boolean j1(String str, int i10, int i11) {
        g0(false);
        f0(true);
        Fragment fragment = this.f19928A;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().h1()) {
            return true;
        }
        boolean k12 = k1(this.f19942O, this.f19943P, str, i10, i11);
        if (k12) {
            this.f19949b = true;
            try {
                r1(this.f19942O, this.f19943P);
            } finally {
                w();
            }
        }
        J1();
        b0();
        this.f19950c.b();
        return k12;
    }

    public void k(C2151a c2151a) {
        this.f19951d.add(c2151a);
    }

    public boolean k0() {
        boolean g02 = g0(true);
        t0();
        return g02;
    }

    public boolean k1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int m02 = m0(str, i10, (i11 & 1) != 0);
        if (m02 < 0) {
            return false;
        }
        for (int size = this.f19951d.size() - 1; size >= m02; size--) {
            arrayList.add((C2151a) this.f19951d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public K l(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            S0.c.f(fragment, str);
        }
        if (Q0(2)) {
            fragment.toString();
        }
        K B10 = B(fragment);
        fragment.mFragmentManager = this;
        this.f19950c.r(B10);
        if (!fragment.mDetached) {
            this.f19950c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (R0(fragment)) {
                this.f19937J = true;
            }
        }
        return B10;
    }

    public Fragment l0(String str) {
        return this.f19950c.f(str);
    }

    public boolean l1(ArrayList arrayList, ArrayList arrayList2) {
        if (Q0(2)) {
            Objects.toString(this.f19948a);
        }
        if (this.f19951d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList arrayList3 = this.f19951d;
        C2151a c2151a = (C2151a) arrayList3.get(arrayList3.size() - 1);
        this.f19955h = c2151a;
        Iterator it = c2151a.f20048c.iterator();
        while (it.hasNext()) {
            Fragment fragment = ((N.a) it.next()).f20066b;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return k1(arrayList, arrayList2, null, -1, 0);
    }

    public void m(I i10) {
        this.f19964q.add(i10);
    }

    public final int m0(String str, int i10, boolean z10) {
        if (this.f19951d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f19951d.size() - 1;
        }
        int size = this.f19951d.size() - 1;
        while (size >= 0) {
            C2151a c2151a = (C2151a) this.f19951d.get(size);
            if ((str != null && str.equals(c2151a.G())) || (i10 >= 0 && i10 == c2151a.f20144v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f19951d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2151a c2151a2 = (C2151a) this.f19951d.get(size - 1);
            if ((str == null || !str.equals(c2151a2.G())) && (i10 < 0 || i10 != c2151a2.f20144v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void m1() {
        e0(new p(), false);
    }

    public void n(m mVar) {
        this.f19962o.add(mVar);
    }

    public void n1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            H1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void o(Fragment fragment) {
        this.f19945R.a(fragment);
    }

    public Fragment o0(int i10) {
        return this.f19950c.g(i10);
    }

    public void o1(k kVar, boolean z10) {
        this.f19963p.o(kVar, z10);
    }

    public int p() {
        return this.f19958k.getAndIncrement();
    }

    public Fragment p0(String str) {
        return this.f19950c.h(str);
    }

    public void p1(Fragment fragment) {
        if (Q0(2)) {
            Objects.toString(fragment);
            int i10 = fragment.mBackStackNesting;
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        this.f19950c.u(fragment);
        if (R0(fragment)) {
            this.f19937J = true;
        }
        fragment.mRemoving = true;
        E1(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(AbstractC2173x abstractC2173x, AbstractC2170u abstractC2170u, Fragment fragment) {
        String str;
        if (this.f19971x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f19971x = abstractC2173x;
        this.f19972y = abstractC2170u;
        this.f19973z = fragment;
        if (fragment != null) {
            m(new g(fragment));
        } else if (abstractC2173x instanceof I) {
            m((I) abstractC2173x);
        }
        if (this.f19973z != null) {
            J1();
        }
        if (abstractC2173x instanceof androidx.activity.H) {
            androidx.activity.H h10 = (androidx.activity.H) abstractC2173x;
            OnBackPressedDispatcher onBackPressedDispatcher = h10.getOnBackPressedDispatcher();
            this.f19954g = onBackPressedDispatcher;
            InterfaceC2193s interfaceC2193s = h10;
            if (fragment != null) {
                interfaceC2193s = fragment;
            }
            onBackPressedDispatcher.i(interfaceC2193s, this.f19957j);
        }
        if (fragment != null) {
            this.f19945R = fragment.mFragmentManager.x0(fragment);
        } else if (abstractC2173x instanceof androidx.lifecycle.W) {
            this.f19945R = H.g(((androidx.lifecycle.W) abstractC2173x).getViewModelStore());
        } else {
            this.f19945R = new H(false);
        }
        this.f19945R.l(X0());
        this.f19950c.A(this.f19945R);
        Object obj = this.f19971x;
        if ((obj instanceof B2.g) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((B2.g) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new a.b() { // from class: androidx.fragment.app.E
                @Override // androidx.savedstate.a.b
                public final Bundle a() {
                    Bundle w12;
                    w12 = FragmentManager.this.w1();
                    return w12;
                }
            });
            Bundle a10 = savedStateRegistry.a("android:support:fragments");
            if (a10 != null) {
                u1(a10);
            }
        }
        Object obj2 = this.f19971x;
        if (obj2 instanceof j.e) {
            j.d activityResultRegistry = ((j.e) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f19933F = activityResultRegistry.m(str2 + "StartActivityForResult", new k.i(), new h());
            this.f19934G = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f19935H = activityResultRegistry.m(str2 + "RequestPermissions", new k.g(), new a());
        }
        Object obj3 = this.f19971x;
        if (obj3 instanceof InterfaceC5340e) {
            ((InterfaceC5340e) obj3).addOnConfigurationChangedListener(this.f19965r);
        }
        Object obj4 = this.f19971x;
        if (obj4 instanceof InterfaceC5341f) {
            ((InterfaceC5341f) obj4).addOnTrimMemoryListener(this.f19966s);
        }
        Object obj5 = this.f19971x;
        if (obj5 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj5).addOnMultiWindowModeChangedListener(this.f19967t);
        }
        Object obj6 = this.f19971x;
        if (obj6 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) obj6).addOnPictureInPictureModeChangedListener(this.f19968u);
        }
        Object obj7 = this.f19971x;
        if ((obj7 instanceof InterfaceC2120x) && fragment == null) {
            ((InterfaceC2120x) obj7).addMenuProvider(this.f19969v);
        }
    }

    public Fragment q0(String str) {
        return this.f19950c.i(str);
    }

    public void q1(m mVar) {
        this.f19962o.remove(mVar);
    }

    public void r(Fragment fragment) {
        if (Q0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f19950c.a(fragment);
            if (Q0(2)) {
                fragment.toString();
            }
            if (R0(fragment)) {
                this.f19937J = true;
            }
        }
    }

    public final void r1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C2151a) arrayList.get(i10)).f20063r) {
                if (i11 != i10) {
                    j0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C2151a) arrayList.get(i11)).f20063r) {
                        i11++;
                    }
                }
                j0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            j0(arrayList, arrayList2, i11, size);
        }
    }

    public N s() {
        return new C2151a(this);
    }

    public void s1(Fragment fragment) {
        this.f19945R.k(fragment);
    }

    public void t() {
        if (Q0(3)) {
            Objects.toString(this.f19955h);
        }
        C2151a c2151a = this.f19955h;
        if (c2151a != null) {
            c2151a.f20143u = false;
            c2151a.z();
            this.f19955h.r(true, new Runnable() { // from class: androidx.fragment.app.F
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(FragmentManager.this);
                }
            });
            this.f19955h.h();
            this.f19956i = true;
            k0();
            this.f19956i = false;
            this.f19955h = null;
        }
    }

    public final void t0() {
        Iterator it = z().iterator();
        while (it.hasNext()) {
            ((X) it.next()).r();
        }
    }

    public final void t1() {
        for (int i10 = 0; i10 < this.f19962o.size(); i10++) {
            ((m) this.f19962o.get(i10)).onBackStackChanged();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f19973z;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f19973z)));
            sb2.append("}");
        } else {
            AbstractC2173x abstractC2173x = this.f19971x;
            if (abstractC2173x != null) {
                sb2.append(abstractC2173x.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f19971x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public boolean u() {
        boolean z10 = false;
        for (Fragment fragment : this.f19950c.l()) {
            if (fragment != null) {
                z10 = R0(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public Set u0(C2151a c2151a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c2151a.f20048c.size(); i10++) {
            Fragment fragment = ((N.a) c2151a.f20048c.get(i10)).f20066b;
            if (fragment != null && c2151a.f20054i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public void u1(Parcelable parcelable) {
        K k10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f19971x.f().getClassLoader());
                this.f19960m.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f19971x.f().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f19950c.x(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f19950c.v();
        Iterator it = fragmentManagerState.f19998a.iterator();
        while (it.hasNext()) {
            Bundle B10 = this.f19950c.B((String) it.next(), null);
            if (B10 != null) {
                Fragment e10 = this.f19945R.e(((FragmentState) B10.getParcelable("state")).f20006b);
                if (e10 != null) {
                    if (Q0(2)) {
                        e10.toString();
                    }
                    k10 = new K(this.f19963p, this.f19950c, e10, B10);
                } else {
                    k10 = new K(this.f19963p, this.f19950c, this.f19971x.f().getClassLoader(), B0(), B10);
                }
                Fragment k11 = k10.k();
                k11.mSavedFragmentState = B10;
                k11.mFragmentManager = this;
                if (Q0(2)) {
                    k11.toString();
                }
                k10.o(this.f19971x.f().getClassLoader());
                this.f19950c.r(k10);
                k10.t(this.f19970w);
            }
        }
        for (Fragment fragment : this.f19945R.h()) {
            if (!this.f19950c.c(fragment.mWho)) {
                if (Q0(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.f19998a);
                }
                this.f19945R.k(fragment);
                fragment.mFragmentManager = this;
                K k12 = new K(this.f19963p, this.f19950c, fragment);
                k12.t(1);
                k12.m();
                fragment.mRemoving = true;
                k12.m();
            }
        }
        this.f19950c.w(fragmentManagerState.f19999b);
        if (fragmentManagerState.mBackStack != null) {
            this.f19951d = new ArrayList(fragmentManagerState.mBackStack.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                C2151a b10 = backStackRecordStateArr[i10].b(this);
                if (Q0(2)) {
                    int i11 = b10.f20144v;
                    b10.toString();
                    PrintWriter printWriter = new PrintWriter(new U("FragmentManager"));
                    b10.C("  ", printWriter, false);
                    printWriter.close();
                }
                this.f19951d.add(b10);
                i10++;
            }
        } else {
            this.f19951d = new ArrayList();
        }
        this.f19958k.set(fragmentManagerState.f20000c);
        String str3 = fragmentManagerState.f20001d;
        if (str3 != null) {
            Fragment l02 = l0(str3);
            this.f19928A = l02;
            R(l02);
        }
        ArrayList arrayList = fragmentManagerState.f20002e;
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                this.f19959l.put((String) arrayList.get(i12), (BackStackState) fragmentManagerState.f20003f.get(i12));
            }
        }
        this.f19936I = new ArrayDeque(fragmentManagerState.f20004g);
    }

    public final void v() {
        if (X0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean v0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f19948a) {
            if (this.f19948a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f19948a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= ((n) this.f19948a.get(i10)).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f19948a.clear();
                this.f19971x.h().removeCallbacks(this.f19947T);
            }
        }
    }

    public final void w() {
        this.f19949b = false;
        this.f19943P.clear();
        this.f19942O.clear();
    }

    public int w0() {
        return this.f19951d.size() + (this.f19955h != null ? 1 : 0);
    }

    public Bundle w1() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        t0();
        d0();
        g0(true);
        this.f19938K = true;
        this.f19945R.l(true);
        ArrayList y10 = this.f19950c.y();
        HashMap m10 = this.f19950c.m();
        if (m10.isEmpty()) {
            Q0(2);
            return bundle;
        }
        ArrayList z10 = this.f19950c.z();
        int size = this.f19951d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackRecordStateArr[i10] = new BackStackRecordState((C2151a) this.f19951d.get(i10));
                if (Q0(2)) {
                    Objects.toString(this.f19951d.get(i10));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f19998a = y10;
        fragmentManagerState.f19999b = z10;
        fragmentManagerState.mBackStack = backStackRecordStateArr;
        fragmentManagerState.f20000c = this.f19958k.get();
        Fragment fragment = this.f19928A;
        if (fragment != null) {
            fragmentManagerState.f20001d = fragment.mWho;
        }
        fragmentManagerState.f20002e.addAll(this.f19959l.keySet());
        fragmentManagerState.f20003f.addAll(this.f19959l.values());
        fragmentManagerState.f20004g = new ArrayList(this.f19936I);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this.f19960m.keySet()) {
            bundle.putBundle("result_" + str, (Bundle) this.f19960m.get(str));
        }
        for (String str2 : m10.keySet()) {
            bundle.putBundle("fragment_" + str2, (Bundle) m10.get(str2));
        }
        return bundle;
    }

    public final void x() {
        AbstractC2173x abstractC2173x = this.f19971x;
        if (abstractC2173x instanceof androidx.lifecycle.W ? this.f19950c.p().j() : abstractC2173x.f() instanceof Activity ? !((Activity) this.f19971x.f()).isChangingConfigurations() : true) {
            Iterator it = this.f19959l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f19876a.iterator();
                while (it2.hasNext()) {
                    this.f19950c.p().c((String) it2.next(), false);
                }
            }
        }
    }

    public final H x0(Fragment fragment) {
        return this.f19945R.f(fragment);
    }

    public Fragment.SavedState x1(Fragment fragment) {
        K n10 = this.f19950c.n(fragment.mWho);
        if (n10 == null || !n10.k().equals(fragment)) {
            H1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n10.q();
    }

    public final void y(String str) {
        this.f19960m.remove(str);
        Q0(2);
    }

    public AbstractC2170u y0() {
        return this.f19972y;
    }

    public void y1() {
        synchronized (this.f19948a) {
            try {
                if (this.f19948a.size() == 1) {
                    this.f19971x.h().removeCallbacks(this.f19947T);
                    this.f19971x.h().post(this.f19947T);
                    J1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Set z() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f19950c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((K) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(X.v(viewGroup, I0()));
            }
        }
        return hashSet;
    }

    public Fragment z0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment l02 = l0(string);
        if (l02 == null) {
            H1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return l02;
    }

    public void z1(Fragment fragment, boolean z10) {
        ViewGroup A02 = A0(fragment);
        if (A02 == null || !(A02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) A02).setDrawDisappearingViewsLast(!z10);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f19978a;

        /* renamed from: b, reason: collision with root package name */
        public int f19979b;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(String str, int i10) {
            this.f19978a = str;
            this.f19979b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f19978a);
            parcel.writeInt(this.f19979b);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f19978a = parcel.readString();
            this.f19979b = parcel.readInt();
        }
    }
}
