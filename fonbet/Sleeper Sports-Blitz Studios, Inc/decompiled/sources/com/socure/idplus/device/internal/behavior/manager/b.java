package com.socure.idplus.device.internal.behavior.manager;

import com.socure.idplus.device.internal.behavior.model.SessionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f846a;
    public final /* synthetic */ SessionData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, SessionData sessionData) {
        super(1);
        this.f846a = cVar;
        this.b = sessionData;
    }

    public final void a(com.socure.idplus.device.internal.network.a networkError) {
        Function0 function0;
        com.socure.idplus.device.internal.thread.b bVar;
        Function0 function02;
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        com.socure.idplus.device.internal.logger.b.a("BehaviorSessionManager", "Error uploading behavior data " + networkError.b());
        Integer c = networkError.c();
        if (c != null && c.intValue() == 401) {
            bVar = this.f846a.f847a;
            final c cVar = this.f846a;
            final SessionData sessionData = this.b;
            ((com.socure.idplus.device.internal.thread.c) bVar).a(new Runnable() { // from class: com.socure.idplus.device.internal.behavior.manager.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(c.this, sessionData);
                }
            });
            function02 = this.f846a.q;
            if (function02 != null) {
                function02.invoke();
                return;
            }
        }
        function0 = this.f846a.c;
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((com.socure.idplus.device.internal.network.a) obj);
        return Unit.INSTANCE;
    }

    public static final void a(c this$0, SessionData sessionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionData, "$sessionData");
        this$0.d = null;
        this$0.g.add(sessionData);
    }
}
