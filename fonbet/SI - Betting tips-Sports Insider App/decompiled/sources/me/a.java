package me;

import android.accounts.Account;
import android.content.Context;
import androidx.fragment.app.p0;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.o1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.sports.db.impl.SportsDatabase_Impl;
import com.sports.insider.data.repository.room.support.dp.impl.SupportDatabase_Impl;
import com.sports.insider.ui.authScreen.AuthScreenFragment;
import com.sports.insider.ui.prediction.ExpressFragment;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.prediction.PremiumFragment;
import com.sports.insider.ui.strip.PredictionListFragment;
import com.sports.insider.ui.subs.ListSubsFragment;
import com.sports.insider.ui.viewpage.ViewCloudFragment;
import com.sports.insider.ui.viewpage.ViewPageEventFragment;
import com.sports.insider.ui.viewpage.ViewPageFragment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;
import sg.r0;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20602b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f20601a = i5;
        this.f20602b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List roots_delegate$lambda$0;
        u2.g gVar;
        int i5 = this.f20601a;
        Object obj = this.f20602b;
        switch (i5) {
            case 0:
                ExpressFragment owner = (ExpressFragment) obj;
                Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
                Intrinsics.checkNotNullParameter(owner, "owner");
                o1 store = owner.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner, "owner");
                m1 factory = owner.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner, "owner");
                t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
                Intrinsics.checkNotNullParameter(h.class, "modelClass");
                Intrinsics.checkNotNullParameter(h.class, "<this>");
                ag.c modelClass = Reflection.getOrCreateKotlinClass(h.class);
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                String r5 = d5.r(modelClass);
                if (r5 != null) {
                    return (h) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 1:
                PredictionFragment owner2 = (PredictionFragment) obj;
                Intrinsics.checkNotNullParameter(owner2, "fragmentActivity");
                Intrinsics.checkNotNullParameter(owner2, "owner");
                o1 store2 = owner2.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner2, "owner");
                m1 factory2 = owner2.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner2, "owner");
                t1.c defaultCreationExtras2 = owner2.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store2, "store");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar2 = new com.google.firebase.messaging.x(store2, factory2, defaultCreationExtras2);
                Intrinsics.checkNotNullParameter(c0.class, "modelClass");
                Intrinsics.checkNotNullParameter(c0.class, "<this>");
                ag.c modelClass2 = Reflection.getOrCreateKotlinClass(c0.class);
                Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
                String r6 = d5.r(modelClass2);
                if (r6 != null) {
                    return (c0) xVar2.x(modelClass2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r6));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 2:
                PremiumFragment owner3 = (PremiumFragment) obj;
                Intrinsics.checkNotNullParameter(owner3, "fragmentActivity");
                Intrinsics.checkNotNullParameter(owner3, "owner");
                o1 store3 = owner3.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner3, "owner");
                m1 factory3 = owner3.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner3, "owner");
                t1.c defaultCreationExtras3 = owner3.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store3, "store");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras3, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar3 = new com.google.firebase.messaging.x(store3, factory3, defaultCreationExtras3);
                Intrinsics.checkNotNullParameter(g0.class, "modelClass");
                Intrinsics.checkNotNullParameter(g0.class, "<this>");
                ag.c modelClass3 = Reflection.getOrCreateKotlinClass(g0.class);
                Intrinsics.checkNotNullParameter(modelClass3, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass3, "modelClass");
                String r10 = d5.r(modelClass3);
                if (r10 != null) {
                    return (g0) xVar3.x(modelClass3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r10));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 3:
                nh.q qVar = (nh.q) obj;
                qVar.getClass();
                try {
                    qVar.f21001w.w(2, 0, false);
                } catch (IOException e7) {
                    nh.b bVar = nh.b.f20917d;
                    qVar.c(bVar, bVar, e7);
                }
                return Unit.f19194a;
            case 4:
                return new p4.b((gh.g0) obj);
            case 5:
                return Integer.valueOf((int) (24 * ((oc.a) obj).f21154a.getResources().getDisplayMetrics().density));
            case 6:
                og.d dVar = (og.d) obj;
                qg.h d10 = y4.a.d("kotlinx.serialization.Polymorphic", qg.c.f22155e, new qg.g[0], new a2.f(14, dVar));
                ag.c context = dVar.f21222a;
                Intrinsics.checkNotNullParameter(d10, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                return new qg.b(d10, context);
            case 7:
                roots_delegate$lambda$0 = ResourceFileSystem.roots_delegate$lambda$0((ResourceFileSystem) obj);
                return roots_delegate$lambda$0;
            case 8:
                return new pb.b((SportsDatabase_Impl) obj);
            case 9:
                mc.a aVar = pe.s.F;
                p0 requireActivity = ((PredictionListFragment) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return a.a.C(requireActivity);
            case 10:
                q2.f fVar = (q2.f) obj;
                fVar.getLifecycle().a(new q2.a(fVar));
                return Unit.f19194a;
            case 11:
                AuthScreenFragment owner4 = (AuthScreenFragment) obj;
                Intrinsics.checkNotNullParameter(owner4, "fragmentActivity");
                Intrinsics.checkNotNullParameter(owner4, "owner");
                o1 store4 = owner4.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner4, "owner");
                m1 factory4 = owner4.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner4, "owner");
                t1.c defaultCreationExtras4 = owner4.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store4, "store");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras4, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar4 = new com.google.firebase.messaging.x(store4, factory4, defaultCreationExtras4);
                Intrinsics.checkNotNullParameter(qd.h.class, "modelClass");
                Intrinsics.checkNotNullParameter(qd.h.class, "<this>");
                ag.c modelClass4 = Reflection.getOrCreateKotlinClass(qd.h.class);
                Intrinsics.checkNotNullParameter(modelClass4, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass4, "modelClass");
                String r11 = d5.r(modelClass4);
                if (r11 != null) {
                    return (qd.h) xVar4.x(modelClass4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r11));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 12:
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f4397k;
                new HashSet();
                new HashMap();
                g6.v.h(googleSignInOptions);
                HashSet hashSet = new HashSet(googleSignInOptions.f4404b);
                boolean z5 = googleSignInOptions.f4407e;
                boolean z7 = googleSignInOptions.f4408f;
                String str = googleSignInOptions.f4409g;
                Account account = googleSignInOptions.f4405c;
                String str2 = googleSignInOptions.f4410h;
                HashMap l02 = GoogleSignInOptions.l0(googleSignInOptions.f4411i);
                String str3 = googleSignInOptions.j;
                String string = ((qd.e) obj).getString(R.string.default_web_client_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                g6.v.e(string);
                g6.v.a("two different server client ids provided", str == null || str.equals(string));
                hashSet.add(GoogleSignInOptions.f4398l);
                if (hashSet.contains(GoogleSignInOptions.f4401o)) {
                    Scope scope = GoogleSignInOptions.f4400n;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                if (account == null || !hashSet.isEmpty()) {
                    hashSet.add(GoogleSignInOptions.f4399m);
                }
                GoogleSignInOptions googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet), account, true, z5, z7, string, str2, l02, str3);
                Intrinsics.checkNotNullExpressionValue(googleSignInOptions2, "build(...)");
                return googleSignInOptions2;
            case 13:
                qg.h hVar = (qg.h) obj;
                return Integer.valueOf(s0.d(hVar, hVar.f22174k));
            case 14:
                return new rb.e((SupportDatabase_Impl) obj);
            case 15:
                p0 requireActivity2 = ((rd.b) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                return y4.a.G(requireActivity2);
            case 16:
                ListSubsFragment owner5 = (ListSubsFragment) obj;
                Intrinsics.checkNotNullParameter(owner5, "fragmentActivity");
                ge.n factory5 = new ge.n(11);
                Intrinsics.checkNotNullParameter(owner5, "owner");
                Intrinsics.checkNotNullParameter(factory5, "factory");
                o1 store5 = owner5.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner5, "owner");
                t1.c defaultCreationExtras5 = owner5.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store5, "store");
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras5, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar5 = new com.google.firebase.messaging.x(store5, factory5, defaultCreationExtras5);
                Intrinsics.checkNotNullParameter(se.p.class, "modelClass");
                ag.c modelClass5 = u6.h.m(se.p.class);
                Intrinsics.checkNotNullParameter(modelClass5, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass5, "modelClass");
                String r12 = d5.r(modelClass5);
                if (r12 != null) {
                    return (se.p) xVar5.x(modelClass5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r12));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 17:
                return y4.a.d("kotlin.Unit", qg.k.f22181h, new qg.g[0], new a2.f(21, (r0) obj));
            case 18:
                u2.h hVar2 = (u2.h) obj;
                String str4 = hVar2.f24041b;
                if (str4 == null || !hVar2.f24043d) {
                    gVar = new u2.g(hVar2.f24040a, hVar2.f24041b, new r7.a(11), hVar2.f24042c, hVar2.f24044e);
                } else {
                    Context context2 = hVar2.f24040a;
                    Intrinsics.checkNotNullParameter(context2, "context");
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    gVar = new u2.g(hVar2.f24040a, new File(noBackupFilesDir, str4).getAbsolutePath(), new r7.a(11), hVar2.f24042c, hVar2.f24044e);
                }
                gVar.setWriteAheadLoggingEnabled(hVar2.f24046g);
                return gVar;
            case 19:
                p0 requireActivity3 = ((ViewCloudFragment) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                return y4.a.G(requireActivity3);
            case 20:
                ViewPageEventFragment owner6 = (ViewPageEventFragment) obj;
                Intrinsics.checkNotNullParameter(owner6, "viewPageFragment");
                Intrinsics.checkNotNullParameter(owner6, "owner");
                o1 store6 = owner6.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner6, "owner");
                m1 factory6 = owner6.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner6, "owner");
                t1.c defaultCreationExtras6 = owner6.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store6, "store");
                Intrinsics.checkNotNullParameter(factory6, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras6, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar6 = new com.google.firebase.messaging.x(store6, factory6, defaultCreationExtras6);
                Intrinsics.checkNotNullParameter(ue.h.class, "modelClass");
                Intrinsics.checkNotNullParameter(ue.h.class, "<this>");
                ag.c modelClass6 = Reflection.getOrCreateKotlinClass(ue.h.class);
                Intrinsics.checkNotNullParameter(modelClass6, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass6, "modelClass");
                String r13 = d5.r(modelClass6);
                if (r13 != null) {
                    return (ue.h) xVar6.x(modelClass6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r13));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 21:
                ViewPageFragment owner7 = (ViewPageFragment) obj;
                Intrinsics.checkNotNullParameter(owner7, "viewPageFragment");
                Intrinsics.checkNotNullParameter(owner7, "owner");
                o1 store7 = owner7.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner7, "owner");
                m1 factory7 = owner7.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner7, "owner");
                t1.c defaultCreationExtras7 = owner7.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store7, "store");
                Intrinsics.checkNotNullParameter(factory7, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras7, "defaultCreationExtras");
                com.google.firebase.messaging.x xVar7 = new com.google.firebase.messaging.x(store7, factory7, defaultCreationExtras7);
                Intrinsics.checkNotNullParameter(ue.h.class, "modelClass");
                Intrinsics.checkNotNullParameter(ue.h.class, "<this>");
                ag.c modelClass7 = Reflection.getOrCreateKotlinClass(ue.h.class);
                Intrinsics.checkNotNullParameter(modelClass7, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass7, "modelClass");
                String r14 = d5.r(modelClass7);
                if (r14 != null) {
                    return (ue.h) xVar7.x(modelClass7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r14));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            default:
                b2.d dVar2 = ((y1.l) obj).f25589h;
                if (!dVar2.f2964i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (dVar2.j.f2169d == androidx.lifecycle.x.f2253a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                n1 t3 = io.sentry.hints.j.t(dVar2.f2956a, (m1) dVar2.f2967m.getValue());
                ag.c modelClass8 = Reflection.getOrCreateKotlinClass(b2.c.class);
                Intrinsics.checkNotNullParameter(modelClass8, "modelClass");
                com.google.firebase.messaging.x xVar8 = (com.google.firebase.messaging.x) t3.f2220a;
                Intrinsics.checkNotNullParameter(modelClass8, "modelClass");
                String r15 = d5.r(modelClass8);
                if (r15 != null) {
                    return ((b2.c) xVar8.x(modelClass8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r15))).f2955b;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }
}
