package b2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.q4;
import com.google.firebase.messaging.x;
import g6.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t0.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements d8.g, j1.i {

    /* renamed from: a, reason: collision with root package name */
    public Context f2968a;

    public /* synthetic */ e(Context context, char c2) {
        this.f2968a = context;
    }

    public static t0.k c(e eVar, Object request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (Intrinsics.areEqual(request, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return eVar.d();
        }
        if (request instanceof p) {
            for (t0.j jVar : ((p) request).f23734a) {
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            t0.m mVar = new t0.m(eVar.f2968a);
            t0.m mVar2 = mVar.isAvailableOnDevice() ? mVar : null;
            return mVar2 == null ? eVar.d() : mVar2;
        }
        if (i5 <= 33) {
            return eVar.d();
        }
        return null;
    }

    @Override // d8.h
    public Object a() {
        return this.f2968a;
    }

    public e5.j b() {
        Context context = this.f2968a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        e5.j jVar = new e5.j();
        jVar.f8645b = g5.a.a(e5.m.f8653a);
        c4.k kVar = new c4.k(context);
        jVar.f8649f = kVar;
        jVar.f8646c = g5.a.a(new l1.a(18, kVar, new h9.c(24, kVar), false));
        c4.k kVar2 = (c4.k) jVar.f8649f;
        jVar.f8650g = new l5.e(kVar2, 1);
        ff.a a7 = g5.a.a(new d7.e(12, (l5.e) jVar.f8650g, g5.a.a(new l5.e(kVar2, 0))));
        jVar.f8647d = a7;
        io.sentry.hints.j jVar2 = new io.sentry.hints.j(24);
        c4.k kVar3 = (c4.k) jVar.f8649f;
        v0 v0Var = new v0(kVar3, a7, jVar2, 24);
        ff.a aVar = (ff.a) jVar.f8645b;
        ff.a aVar2 = (ff.a) jVar.f8646c;
        jVar.f8648e = g5.a.a(new v0(new c4.d(aVar, aVar2, v0Var, a7, a7, 7), new q4(kVar3, aVar2, a7, v0Var, aVar, a7, a7, 7), new x(aVar, a7, v0Var, a7), 10));
        return jVar;
    }

    public t0.k d() {
        String string;
        Context context = this.f2968a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNull(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List W = CollectionsKt.W(arrayList);
        if (W.isEmpty()) {
            return null;
        }
        Iterator it = W.iterator();
        t0.k kVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                t0.k kVar2 = (t0.k) newInstance;
                if (!kVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (kVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    kVar = kVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return kVar;
    }

    public e(Context context, int i5) {
        switch (i5) {
            case 5:
                v.h(context);
                Context applicationContext = context.getApplicationContext();
                v.h(applicationContext);
                this.f2968a = applicationContext;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f2968a = context;
                break;
            default:
                this.f2968a = context.getApplicationContext();
                break;
        }
    }

    @Override // j1.i
    public void a(k2.x xVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new j1.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.fragment.app.d(this, xVar, threadPoolExecutor, 18));
    }
}
