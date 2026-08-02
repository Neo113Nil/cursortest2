package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1483w0;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3751t3;
import com.plaid.internal.I2;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import ei.AbstractC4212b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nWebviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewViewModel.kt\ncom/plaid/internal/workflow/webview/WebviewViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,240:1\n37#2,2:241\n*S KotlinDebug\n*F\n+ 1 WebviewViewModel.kt\ncom/plaid/internal/workflow/webview/WebviewViewModel\n*L\n190#1:241,2\n*E\n"})
/* loaded from: classes3.dex */
public final class U7 extends androidx.lifecycle.Q implements L5, M5, C3751t3.a {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public final AbstractC4212b f39672a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final InterfaceC3759u2 f39673b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final C6 f39674c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public final C3655i5 f39675d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public final B6 f39676e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public final A6 f39677f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public final I7 f39678g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public final N5 f39679h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public final InterfaceC3781w6 f39680i;

    /* renamed from: j, reason: collision with root package name */
    @Inject
    public final F f39681j;

    /* renamed from: k, reason: collision with root package name */
    @Inject
    public final C3755t7 f39682k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final C3751t3 f39683l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.x f39684m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public ValueCallback<Uri[]> f39685n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public final C3736r6 f39686o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public final H6 f39687p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public String f39688q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public final T7 f39689r;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onCleared$1", f = "WebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWebviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewViewModel.kt\ncom/plaid/internal/workflow/webview/WebviewViewModel$onCleared$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n1855#2,2:241\n*S KotlinDebug\n*F\n+ 1 WebviewViewModel.kt\ncom/plaid/internal/workflow/webview/WebviewViewModel$onCleared$1\n*L\n142#1:241,2\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public U7 f39690a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f39691b;

        /* renamed from: c, reason: collision with root package name */
        public int f39692c;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return U7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return U7.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
        
            if (r8 == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            U7 u72;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39692c;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3655i5 c3655i5 = U7.this.f39675d;
                if (c3655i5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
                    c3655i5 = null;
                }
                this.f39692c = 1;
                obj = c3655i5.a(this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f39691b;
                    u72 = this.f39690a;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        C3655i5 c3655i52 = u72.f39675d;
                        if (c3655i52 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
                            c3655i52 = null;
                        }
                        this.f39690a = u72;
                        this.f39691b = it;
                        this.f39692c = 2;
                        if (c3655i52.a(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            u72 = U7.this;
            it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onWebviewCancelled$1", f = "WebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39694a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return U7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return U7.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39694a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC3759u2 b10 = U7.this.b();
                this.f39694a = 1;
                if (b10.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public U7(@NotNull H1 webviewComponent) {
        Intrinsics.checkNotNullParameter(webviewComponent, "webviewComponent");
        this.f39684m = kotlinx.coroutines.flow.E.b(1, 0, null, 6, null);
        this.f39689r = new T7(this);
        C3695n0 c3695n0 = (C3695n0) webviewComponent;
        AbstractC4212b abstractC4212b = c3695n0.f40813a.f40936e.get();
        this.f39672a = abstractC4212b;
        this.f39673b = c3695n0.f40826n.get();
        this.f39674c = c3695n0.f40827o.get();
        this.f39675d = c3695n0.f40828p.get();
        this.f39676e = c3695n0.f40829q.get();
        this.f39677f = c3695n0.f40830r.get();
        this.f39678g = c3695n0.f40831s.get();
        this.f39679h = c3695n0.f40813a.f40946o.get();
        this.f39680i = c3695n0.f40832t.get();
        this.f39681j = c3695n0.f40833u.get();
        this.f39682k = c3695n0.f40835w.get();
        this.f39686o = c3695n0.f40836x.get();
        this.f39687p = c3695n0.f40814b.f40894m.get();
        if (abstractC4212b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("json");
            abstractC4212b = null;
        }
        this.f39683l = new C3751t3(this, abstractC4212b);
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new Q7(this, null), 3, null);
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new R7(this, null), 3, null);
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull C3551a1 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new S7(this, null), 3, null);
        b().a(L2.b(exception, null));
    }

    @NotNull
    public final InterfaceC3759u2 b() {
        InterfaceC3759u2 interfaceC3759u2 = this.f39673b;
        if (interfaceC3759u2 != null) {
            return interfaceC3759u2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkController");
        return null;
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        b().a(url);
    }

    @Override // androidx.lifecycle.Q
    public final void onCleared() {
        AbstractC1459k.d(C1483w0.f9135a, null, null, new a(null), 3, null);
        super.onCleared();
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void b(@NotNull String linkSessionId) {
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        if (Intrinsics.areEqual(this.f39688q, linkSessionId)) {
            return;
        }
        this.f39688q = linkSessionId;
        H6 h62 = this.f39687p;
        if (h62 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteLogController");
            h62 = null;
        }
        h62.f39275a.a(linkSessionId);
        h62.a();
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new S7(this, null), 3, null);
        b().a(linkExit);
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkSuccess linkSuccess) {
        Intrinsics.checkNotNullParameter(linkSuccess, "linkSuccess");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new S7(this, null), 3, null);
        b().a(linkSuccess);
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkedHashMap linkData) {
        Intrinsics.checkNotNullParameter(linkData, "linkData");
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new V7(this, linkData, null), 3, null);
    }

    @Override // com.plaid.internal.M5
    public final boolean a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f39683l.a(url);
        return true;
    }

    @Override // com.plaid.internal.L5
    public final void a() {
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new b(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        ValueCallback<Uri[]> valueCallback = this.f39685n;
        if (valueCallback != 0) {
            valueCallback.onReceiveValue(uris.toArray(new Uri[0]));
        }
    }

    @Override // com.plaid.internal.M5
    public final void a(@NotNull AbstractC3743s4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
        b().a(openInterstitialMessage);
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull LinkEvent linkEvent, @NotNull I2 queueOptions) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        Intrinsics.checkNotNullParameter(queueOptions, "queueOptions");
        C3556a6.a.a(C3556a6.f39823a, "Event: " + linkEvent.getEventName());
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, queueOptions);
        }
    }

    @Override // com.plaid.internal.C3751t3.a
    public final void a(@NotNull String string, @NotNull LinkEventMetadata metadata) {
        Intrinsics.checkNotNullParameter(string, "action");
        Intrinsics.checkNotNullParameter(metadata, "linkEventMetadata");
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            Intrinsics.checkNotNullParameter(string, "string");
            LinkEventName eventName = LinkEventName.INSTANCE.fromString$link_sdk_release(string);
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            linkEventListenerInternal$link_sdk_release.invoke(new LinkEvent(eventName, metadata), I2.d.f39294a);
        }
    }
}
