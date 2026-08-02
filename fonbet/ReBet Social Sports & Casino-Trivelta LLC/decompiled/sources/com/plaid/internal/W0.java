package com.plaid.internal;

import com.plaid.internal.C3692m6;
import com.plaid.internal.C3751t3;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class W0 implements C3751t3.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3692m6.b f39729a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3692m6.c f39730b;

    public W0(@NotNull C3692m6.b eventHandler, @NotNull C3692m6.c unexpectedActionHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(unexpectedActionHandler, "unexpectedActionHandler");
        this.f39729a = eventHandler;
        this.f39730b = unexpectedActionHandler;
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkEvent linkEvent, @NotNull I2 queueOptions) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        Intrinsics.checkNotNullParameter(queueOptions, "queueOptions");
        this.f39729a.invoke(linkEvent, queueOptions);
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void b(@NotNull String linkSessionId) {
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f39730b.invoke();
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkedHashMap linkData) {
        Intrinsics.checkNotNullParameter(linkData, "linkData");
        this.f39730b.invoke();
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkSuccess linkSuccess) {
        Intrinsics.checkNotNullParameter(linkSuccess, "linkSuccess");
        this.f39730b.invoke();
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull C3551a1 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f39730b.invoke();
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        this.f39730b.invoke();
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull String action, @NotNull LinkEventMetadata linkEventMetadata) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(linkEventMetadata, "linkEventMetadata");
        this.f39730b.invoke();
    }
}
