package a2;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.j1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import androidx.lifecycle.y;
import androidx.navigation.fragment.NavHostFragment;
import androidx.work.impl.WorkDatabase;
import c1.m0;
import com.android.billingclient.api.l0;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.accountsetting.database.AccountSetting_Impl;
import com.sports.insider.data.repository.room.billing.BillingDatabase_Impl;
import com.sports.insider.data.repository.room.live.LiveDatabase_Impl;
import com.sports.insider.data.repository.room.news.NewsDatabase_Impl;
import com.sports.insider.ui.live.LiveFragment;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import f3.v;
import gf.t;
import gh.u;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.b6;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import k2.d0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import le.z;
import y1.f0;
import y1.g0;
import y1.u0;
import y1.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60b;

    public /* synthetic */ q(int i5, Object obj) {
        this.f59a = i5;
        this.f60b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v149, types: [gf.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t tVar;
        b2.j jVar;
        Bundle[] bundleArr;
        y lifecycle;
        int i5;
        int i10 = 5;
        int i11 = 1;
        int i12 = 0;
        switch (this.f59a) {
            case 0:
                NavHostFragment owner = (NavHostFragment) this.f60b;
                Context context = owner.getContext();
                if (context == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                Intrinsics.checkNotNullParameter(context, "context");
                f0 navController = new f0(context);
                t tVar2 = navController.f25631h;
                b2.j jVar2 = navController.f25625b;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                e eVar = jVar2.q;
                u0 u0Var = jVar2.f3001r;
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (!Intrinsics.areEqual(owner, jVar2.f2997m)) {
                    e0 e0Var = jVar2.f2997m;
                    if (e0Var != null && (lifecycle = e0Var.getLifecycle()) != null) {
                        lifecycle.b(eVar);
                    }
                    jVar2.f2997m = owner;
                    owner.getLifecycle().a(eVar);
                }
                o1 viewModelStore = owner.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "<get-viewModelStore>(...)");
                Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
                Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
                Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
                if (!Intrinsics.areEqual(jVar2.f2998n, u6.h.j(viewModelStore))) {
                    if (!jVar2.f2991f.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    jVar2.f2998n = u6.h.j(viewModelStore);
                }
                Intrinsics.checkNotNullParameter(navController, "navHostController");
                Intrinsics.checkNotNullParameter(navController, "navController");
                Context requireContext = owner.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                j1 childFragmentManager = owner.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                u0Var.a(new d(requireContext, childFragmentManager));
                Context requireContext2 = owner.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                j1 childFragmentManager2 = owner.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                int id2 = owner.getId();
                if (id2 == 0 || id2 == -1) {
                    id2 = R.id.nav_host_fragment_container;
                }
                u0Var.a(new m(requireContext2, childFragmentManager2, id2));
                Bundle source = owner.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                if (source != null) {
                    source.setClassLoader(context.getClassLoader());
                    LinkedHashMap linkedHashMap = jVar2.f2996l;
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:navigatorState", "key");
                    jVar2.f2989d = source.containsKey("android-support-nav:controller:navigatorState") ? d5.x(source, "android-support-nav:controller:navigatorState") : null;
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStack", "key");
                    if (source.containsKey("android-support-nav:controller:backStack")) {
                        tVar = tVar2;
                        bundleArr = (Bundle[]) d5.y(source, "android-support-nav:controller:backStack").toArray(new Bundle[0]);
                    } else {
                        tVar = tVar2;
                        bundleArr = null;
                    }
                    jVar2.f2990e = bundleArr;
                    linkedHashMap.clear();
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackDestIds", "key");
                    if (source.containsKey("android-support-nav:controller:backStackDestIds")) {
                        Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackIds", "key");
                        if (source.containsKey("android-support-nav:controller:backStackIds")) {
                            Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackDestIds", "key");
                            int[] intArray = source.getIntArray("android-support-nav:controller:backStackDestIds");
                            if (intArray == null) {
                                com.google.android.play.core.appupdate.b.v("android-support-nav:controller:backStackDestIds");
                                throw null;
                            }
                            Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackIds", "key");
                            ArrayList<String> stringArrayList = source.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList == null) {
                                com.google.android.play.core.appupdate.b.v("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                            int length = intArray.length;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < length) {
                                int i15 = i14 + 1;
                                int[] iArr = intArray;
                                int i16 = length;
                                int i17 = i13;
                                b2.j jVar3 = jVar2;
                                jVar2.f2995k.put(Integer.valueOf(intArray[i13]), !Intrinsics.areEqual(stringArrayList.get(i14), "") ? stringArrayList.get(i14) : null);
                                i13 = i17 + 1;
                                length = i16;
                                i14 = i15;
                                intArray = iArr;
                                jVar2 = jVar3;
                            }
                        }
                    }
                    jVar = jVar2;
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackStates", "key");
                    if (source.containsKey("android-support-nav:controller:backStackStates")) {
                        Intrinsics.checkNotNullParameter("android-support-nav:controller:backStackStates", "key");
                        ArrayList<String> stringArrayList2 = source.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            com.google.android.play.core.appupdate.b.v("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        for (String str : stringArrayList2) {
                            if (d5.k(source, "android-support-nav:controller:backStackStates:" + str)) {
                                ArrayList y5 = d5.y(source, "android-support-nav:controller:backStackStates:" + str);
                                kotlin.collections.l lVar = new kotlin.collections.l(y5.size());
                                Iterator it = y5.iterator();
                                while (it.hasNext()) {
                                    lVar.addLast(new y1.m((Bundle) it.next()));
                                }
                                linkedHashMap.put(str, lVar);
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkHandled", "key");
                    boolean z5 = source.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z5 || !source.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z5) : null;
                    navController.f25628e = valueOf != null ? valueOf.booleanValue() : false;
                } else {
                    tVar = tVar2;
                    jVar = jVar2;
                }
                owner.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new r(0, navController));
                Bundle a7 = owner.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                if (a7 != null) {
                    owner.f2266c = a7.getInt("android-support-nav:fragment:graphId");
                }
                owner.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new r(1, owner));
                int i18 = owner.f2266c;
                if (i18 != 0) {
                    jVar.q(((g0) tVar.getValue()).b(i18), null);
                } else {
                    b2.j jVar4 = jVar;
                    Bundle arguments = owner.getArguments();
                    int i19 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i19 != 0) {
                        jVar4.q(((g0) tVar.getValue()).b(i19), bundle);
                    }
                }
                return navController;
            case 1:
                ((androidx.lifecycle.i) this.f60b).f2187m = null;
                return Unit.f19194a;
            case 2:
                return d1.h((p1) this.f60b);
            case 3:
                ((y1.o) this.f60b).invoke();
                return Unit.f19194a;
            case 4:
                String uriPattern = (String) this.f60b;
                Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                return new x(uriPattern, null, null);
            case 5:
                return this.f60b;
            case 6:
                File file = (File) this.f60b;
                synchronized (m0.f3431d) {
                    m0.f3430c.remove(file.getAbsolutePath());
                }
                return Unit.f19194a;
            case 7:
                return kotlin.collections.t.c((Pair) this.f60b);
            case 8:
                Context context2 = (Context) ((a0) this.f60b).f680b;
                double d10 = 0.2d;
                try {
                    Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                    Intrinsics.checkNotNull(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d10 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d10 || d10 > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                l0 l0Var = new l0((byte) 0, 5);
                try {
                    Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                    Intrinsics.checkNotNull(systemService2);
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    i5 = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused2) {
                    i5 = 256;
                }
                return new l4.c(new l4.e((long) (d10 * i5 * b6.MAX_EVENT_SIZE_BYTES), l0Var), l0Var);
            case 9:
                return d4.e.b((d4.e) this.f60b);
            case 10:
                return new db.e((AccountSetting_Impl) this.f60b);
            case 11:
                return new eb.e((BillingDatabase_Impl) this.f60b);
            case 12:
                f3.p pVar = (f3.p) this.f60b;
                pVar.getClass();
                n3.c.a(pVar);
                return Unit.f19194a;
            case 13:
                v vVar = (v) this.f60b;
                WorkDatabase workDatabase = vVar.f9428c;
                Context context3 = vVar.f9426a;
                String str2 = h3.c.f10349f;
                if (Build.VERSION.SDK_INT >= 34) {
                    h3.a.b(context3).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context3.getSystemService("jobscheduler");
                ArrayList f6 = h3.c.f(context3, jobScheduler);
                if (f6 != null && !f6.isEmpty()) {
                    Iterator it2 = f6.iterator();
                    while (it2.hasNext()) {
                        h3.c.a(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                ((Number) f3.x.n0(workDatabase.y().f20360a, false, true, new d0(11))).intValue();
                f3.j.b(vVar.f9427b, workDatabase, vVar.f9430e);
                return Unit.f19194a;
            case 14:
                File file2 = (File) ((l) this.f60b).invoke();
                Intrinsics.checkNotNullParameter(file2, "<this>");
                String name = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(StringsKt.V('.', name, ""), "preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "getAbsoluteFile(...)");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 15:
                g4.h hVar = (g4.h) this.f60b;
                d4.r rVar = hVar.f9764a;
                q4.n nVar = hVar.f9765b;
                d4.r z7 = com.google.android.play.core.appupdate.b.z(rVar, true);
                try {
                    Movie decodeStream = Movie.decodeStream(z7.m0().inputStream());
                    u6.h.g(z7, null);
                    if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                        throw new IllegalStateException("Failed to decode GIF.");
                    }
                    g4.j jVar5 = new g4.j(decodeStream, (decodeStream.isOpaque() && ((Boolean) c4.p.f(nVar, q4.j.f22005g)).booleanValue()) ? Bitmap.Config.RGB_565 : s6.a.o(q4.j.a(nVar)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) c4.p.f(nVar, q4.j.f22000b), nVar.f22009c);
                    c4.k kVar = g4.i.f9766a;
                    if (((Number) c4.p.f(nVar, kVar)).intValue() != -2) {
                        int intValue = ((Number) c4.p.f(nVar, kVar)).intValue();
                        if (intValue < -1) {
                            throw new IllegalArgumentException(c1.i(intValue, "Invalid repeatCount: ").toString());
                        }
                        jVar5.q = intValue;
                    }
                    Function0 function0 = (Function0) c4.p.f(nVar, g4.i.f9768c);
                    Function0 function02 = (Function0) c4.p.f(nVar, g4.i.f9769d);
                    if (function0 != null || function02 != null) {
                        jVar5.f9774e.add(new h4.d(function0, function02));
                    }
                    if (c4.p.f(nVar, g4.i.f9767b) != null) {
                        throw new ClassCastException();
                    }
                    jVar5.f9785r = null;
                    jVar5.f9786s = g4.k.f9788a;
                    jVar5.f9787t = false;
                    jVar5.invalidateSelf();
                    return new d4.i(c4.p.c(jVar5), false);
                } finally {
                }
            case 16:
                return new gb.b((LiveDatabase_Impl) this.f60b);
            case 17:
                LiveFragment owner2 = (LiveFragment) this.f60b;
                Intrinsics.checkNotNullParameter(owner2, "fragmentActivity");
                ge.n factory = new ge.n(i12);
                Intrinsics.checkNotNullParameter(owner2, "owner");
                Intrinsics.checkNotNullParameter(factory, "factory");
                o1 store = owner2.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner2, "owner");
                t1.c defaultCreationExtras = owner2.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
                Intrinsics.checkNotNullParameter(ge.s.class, "modelClass");
                ag.c modelClass = u6.h.m(ge.s.class);
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                String r5 = d5.r(modelClass);
                if (r5 != null) {
                    return (ge.s) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 18:
                return (List) this.f60b;
            case 19:
                return new ib.c((NewsDatabase_Impl) this.f60b);
            case 20:
                return ((Callable) this.f60b).call();
            case 21:
                ((Runnable) this.f60b).run();
                return Unit.f19194a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                NoEthernetFragment owner3 = (NoEthernetFragment) this.f60b;
                Intrinsics.checkNotNullParameter(owner3, "fragmentActivity");
                ge.n factory2 = new ge.n(i10);
                Intrinsics.checkNotNullParameter(owner3, "owner");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                o1 store2 = owner3.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner3, "owner");
                t1.c defaultCreationExtras2 = owner3.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store2, "store");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar2 = new com.google.firebase.messaging.x(store2, factory2, defaultCreationExtras2);
                Intrinsics.checkNotNullParameter(oe.g.class, "modelClass");
                ag.c modelClass2 = u6.h.m(oe.g.class);
                Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
                String r6 = d5.r(modelClass2);
                if (r6 != null) {
                    return (oe.g) xVar2.x(modelClass2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r6));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                List<Certificate> a10 = ((u) this.f60b).a();
                ArrayList arrayList = new ArrayList(kotlin.collections.v.k(a10, 10));
                for (Certificate certificate : a10) {
                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return ArrayIteratorKt.iterator((Object[]) this.f60b);
            case C0122e9.F /* 25 */:
                LivePayFragment owner4 = (LivePayFragment) this.f60b;
                Intrinsics.checkNotNullParameter(owner4, "fragmentActivity");
                ge.n factory3 = new ge.n(2);
                Intrinsics.checkNotNullParameter(owner4, "owner");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                o1 store3 = owner4.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner4, "owner");
                t1.c defaultCreationExtras3 = owner4.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store3, "store");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras3, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar3 = new com.google.firebase.messaging.x(store3, factory3, defaultCreationExtras3);
                Intrinsics.checkNotNullParameter(z.class, "modelClass");
                ag.c modelClass3 = u6.h.m(z.class);
                Intrinsics.checkNotNullParameter(modelClass3, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass3, "modelClass");
                String r10 = d5.r(modelClass3);
                if (r10 != null) {
                    return (z) xVar3.x(modelClass3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r10));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case C0122e9.G /* 26 */:
                VipAccessFragment owner5 = (VipAccessFragment) this.f60b;
                Intrinsics.checkNotNullParameter(owner5, "fragmentActivity");
                ge.n factory4 = new ge.n(i11);
                Intrinsics.checkNotNullParameter(owner5, "owner");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                o1 store4 = owner5.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner5, "owner");
                t1.c defaultCreationExtras4 = owner5.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store4, "store");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras4, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar4 = new com.google.firebase.messaging.x(store4, factory4, defaultCreationExtras4);
                Intrinsics.checkNotNullParameter(le.h.class, "modelClass");
                ag.c modelClass4 = u6.h.m(le.h.class);
                Intrinsics.checkNotNullParameter(modelClass4, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass4, "modelClass");
                String r11 = d5.r(modelClass4);
                if (r11 != null) {
                    return (le.h) xVar4.x(modelClass4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r11));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case C0122e9.H /* 27 */:
                return ((io.sentry.util.network.b) this.f60b).c(":memory:");
            case 28:
                m2.s sVar = (m2.s) this.f60b;
                return sVar.f20267a.c(sVar.f20268b);
            default:
                return (e4.a) ((c4.v) this.f60b).f3628a.f3606e.getValue();
        }
    }
}
