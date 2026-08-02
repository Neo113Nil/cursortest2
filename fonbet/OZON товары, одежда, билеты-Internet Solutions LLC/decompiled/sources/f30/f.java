package f30;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AppsFlyerLib;
import f30.q;
import h30.C6793a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements Jb.e<C6793a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f62514a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<AppsFlyerLib> f62515b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f62516c;

    public f(Pc.a<Context> aVar, Pc.a<AppsFlyerLib> aVar2, Pc.a<SharedPreferences> aVar3) {
        this.f62514a = aVar;
        this.f62515b = aVar2;
        this.f62516c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        Context appContext = (Context) ((q.f) this.f62514a).get();
        AppsFlyerLib lib = this.f62515b.get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((q.c) this.f62516c).get();
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(lib, "lib");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new C6793a(appContext, lib, sharedPreferences);
    }
}
