package ru.ozon.android.messenger.framework.data.remote.websocket;

import Lm0.a;
import Sc.r;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;

/* loaded from: classes10.dex */
public final class O implements InterfaceC4866h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f87940a;

    O(C10737n c10737n) {
        this.f87940a = c10737n;
    }

    @Override // We.InterfaceC4866h
    public final void onFailure(InterfaceC4865g call, IOException e11) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e11, "e");
        a.b bVar = Lm0.a.f17149a;
        bVar.b("WebSocketHttpProxy");
        bVar.e(e11, "onFailure for call %s", call.request());
        r.Companion companion = Sc.r.INSTANCE;
        this.f87940a.resumeWith(Sc.s.a(e11));
    }

    @Override // We.InterfaceC4866h
    public final void onResponse(InterfaceC4865g call, We.L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        r.Companion companion = Sc.r.INSTANCE;
        this.f87940a.resumeWith(response);
    }
}
