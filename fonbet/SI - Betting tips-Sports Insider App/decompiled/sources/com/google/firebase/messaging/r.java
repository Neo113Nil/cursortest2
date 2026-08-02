package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements o8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o8.p f6168b;

    public /* synthetic */ r(o8.p pVar, int i5) {
        this.f6167a = i5;
        this.f6168b = pVar;
    }

    @Override // o8.d
    public final Object h(x xVar) {
        FirebaseMessaging lambda$getComponents$0;
        i9.i lambda$getComponents$02;
        switch (this.f6167a) {
            case 0:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f6168b, xVar);
                return lambda$getComponents$0;
            case 1:
                lambda$getComponents$02 = RemoteConfigRegistrar.lambda$getComponents$0(this.f6168b, xVar);
                return lambda$getComponents$02;
            default:
                return new y8.c((Context) xVar.a(Context.class), ((h8.g) xVar.a(h8.g.class)).d(), xVar.O(y8.d.class), xVar.e(h9.b.class), (Executor) xVar.g(this.f6168b));
        }
    }
}
