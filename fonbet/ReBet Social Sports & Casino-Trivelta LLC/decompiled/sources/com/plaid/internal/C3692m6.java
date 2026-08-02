package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1483w0;
import com.plaid.internal.C3556a6;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventName;
import ei.AbstractC4212b;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.m6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3692m6 implements M5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final N5 f40799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3575c5 f40800b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f40801c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final C3751t3 f40802d;

    /* renamed from: com.plaid.internal.m6$a */
    public static final class a extends Lambda implements Function0<List<? extends LinkEventName>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40803a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends LinkEventName> invoke() {
            return CollectionsKt.listOf((Object[]) new LinkEventName[]{LinkEventName.PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE, LinkEventName.LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE, LinkEventName.LAYER_READY.INSTANCE, LinkEventName.LAYER_NOT_AVAILABLE.INSTANCE});
        }
    }

    /* renamed from: com.plaid.internal.m6$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2<LinkEvent, I2, Unit> {
        public b(C3692m6 c3692m6) {
            super(2, c3692m6, C3692m6.class, "onEvent", "onEvent(Lcom/plaid/link/event/LinkEvent;Lcom/plaid/internal/event/LinkQueueOptions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LinkEvent linkEvent, I2 i22) {
            LinkEvent p02 = linkEvent;
            I2 p12 = i22;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((C3692m6) this.receiver).a(p02, p12);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.m6$c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(C3692m6 c3692m6) {
            super(0, c3692m6, C3692m6.class, "preLoadFailed", "preLoadFailed()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C3692m6 c3692m6 = (C3692m6) this.receiver;
            C3575c5 c3575c5 = c3692m6.f40800b;
            c3575c5.getClass();
            Intrinsics.checkNotNullParameter("Preload received unexpected action", "message");
            AbstractC1459k.d(C1483w0.f9135a, null, null, new C3555a5(c3575c5, "Preload received unexpected action", null), 3, null);
            c3692m6.f40799a.a();
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C3692m6(@NotNull N5 webViewRegistry, @NotNull C3575c5 crashReporter, @NotNull AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(webViewRegistry, "webViewRegistry");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f40799a = webViewRegistry;
        this.f40800b = crashReporter;
        this.f40801c = LazyKt.lazy(a.f40803a);
        this.f40802d = new C3751t3(new W0(new b(this), new c(this)), json);
    }

    @Override // com.plaid.internal.M5
    public final void a(@NotNull AbstractC3743s4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
    }

    public final void a(LinkEvent linkEvent, I2 i22) {
        if (((List) this.f40801c.getValue()).contains(linkEvent.getEventName())) {
            C3556a6.a.a(C3556a6.f39823a, "Preload delivered event: " + linkEvent.getEventName());
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(linkEvent);
            return;
        }
        C3556a6.a.a(C3556a6.f39823a, "Preload enqueued event: " + linkEvent.getEventName());
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, i22);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.plaid.internal.M5
    public final boolean a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f40802d.a(url);
        return true;
    }
}
