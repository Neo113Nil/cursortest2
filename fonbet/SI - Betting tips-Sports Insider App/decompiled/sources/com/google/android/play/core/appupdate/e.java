package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.internal.measurement.d5;
import io.sentry.android.core.w0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k f5997a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5998b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5999c;

    public e(k kVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f5997a = kVar;
        this.f5998b = cVar;
        this.f5999c = context;
    }

    public static void c(a aVar, g.f fVar, n nVar) {
        if (aVar == null || fVar == null || aVar.a(nVar) == null || aVar.f5993f) {
            return;
        }
        aVar.f5993f = true;
        IntentSender intentSender = aVar.a(nVar).getIntentSender();
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        fVar.a(new IntentSenderRequest(intentSender, null, 0, 0));
    }

    public final void a() {
        String packageName = this.f5999c.getPackageName();
        k kVar = this.f5997a;
        y7.n nVar = kVar.f6011a;
        if (nVar != null) {
            k.f6009e.g("completeUpdate(%s)", packageName);
            w7.g gVar = new w7.g();
            nVar.a().post(new g(nVar, gVar, gVar, new g(kVar, gVar, gVar, packageName, 1), 2));
        } else {
            com.android.billingclient.api.a aVar = k.f6009e;
            Object[] objArr = {-9};
            aVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                w0.d("PlayCore", com.android.billingclient.api.a.h(aVar.f3966b, "onError(%d)", objArr));
            }
            d5.p(new d6.k(-9));
        }
    }

    public final w7.m b() {
        String packageName = this.f5999c.getPackageName();
        k kVar = this.f5997a;
        y7.n nVar = kVar.f6011a;
        if (nVar != null) {
            k.f6009e.g("requestUpdateInfo(%s)", packageName);
            w7.g gVar = new w7.g();
            nVar.a().post(new g(nVar, gVar, gVar, new g(kVar, gVar, packageName, gVar), 2));
            return gVar.f24979a;
        }
        com.android.billingclient.api.a aVar = k.f6009e;
        Object[] objArr = {-9};
        aVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            w0.d("PlayCore", com.android.billingclient.api.a.h(aVar.f3966b, "onError(%d)", objArr));
        }
        return d5.p(new d6.k(-9));
    }
}
