package com.plaid.internal;

import Ph.C1452g0;
import com.plaid.internal.AbstractC3710o6;
import com.plaid.internal.C3556a6;
import com.plaid.internal.N2;
import com.plaid.link.OnLoadCallback;
import com.plaid.link.SubmissionData;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nPreloadLinkController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadLinkController.kt\ncom/plaid/internal/workflow/preload/PreloadLinkController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* renamed from: com.plaid.internal.k6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3674k6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Z2 f40732a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Y2 f40733b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final N5 f40734c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final C3561b1 f40735d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final C3692m6 f40736e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final L7 f40737f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public SubmissionData f40738g;

    @Inject
    public C3674k6(@NotNull Z2 linkStateStore, @NotNull Y2 linkStateReducer, @NotNull N5 webViewRegistry, @NotNull C3561b1 featureManager, @NotNull C3692m6 preloadPlaidWebViewListener, @NotNull L7 webviewFallbackBaseUrlOverWriter) {
        Intrinsics.checkNotNullParameter(linkStateStore, "linkStateStore");
        Intrinsics.checkNotNullParameter(linkStateReducer, "linkStateReducer");
        Intrinsics.checkNotNullParameter(webViewRegistry, "webViewRegistry");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        Intrinsics.checkNotNullParameter(preloadPlaidWebViewListener, "preloadPlaidWebViewListener");
        Intrinsics.checkNotNullParameter(webviewFallbackBaseUrlOverWriter, "webviewFallbackBaseUrlOverWriter");
        this.f40732a = linkStateStore;
        this.f40733b = linkStateReducer;
        this.f40734c = webViewRegistry;
        this.f40735d = featureManager;
        this.f40736e = preloadPlaidWebViewListener;
        this.f40737f = webviewFallbackBaseUrlOverWriter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (Ph.AbstractC1455i.g(r11, r2, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (Ph.AbstractC1455i.g(r11, r2, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        if (Ph.AbstractC1455i.g(Ph.C1452g0.c(), new com.plaid.internal.C3647h6(r2, r11, r10, null), r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@Nullable OnLoadCallback onLoadCallback, @NotNull ContinuationImpl continuationImpl) {
        C3620e6 c3620e6;
        int i10;
        C3674k6 c3674k6;
        if (continuationImpl instanceof C3620e6) {
            c3620e6 = (C3620e6) continuationImpl;
            int i11 = c3620e6.f40586e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3620e6.f40586e = i11 - Integer.MIN_VALUE;
                Object obj = c3620e6.f40584c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3620e6.f40586e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c3620e6.f40582a = this;
                    c3620e6.f40583b = onLoadCallback;
                    c3620e6.f40586e = 1;
                    obj = a(c3620e6);
                    if (obj != coroutine_suspended) {
                        c3674k6 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    C3556a6.a.a(C3556a6.f39823a, "Preload link complete");
                    return Unit.INSTANCE;
                }
                onLoadCallback = c3620e6.f40583b;
                c3674k6 = c3620e6.f40582a;
                ResultKt.throwOnFailure(obj);
                AbstractC3710o6 abstractC3710o6 = (AbstractC3710o6) obj;
                if (Ph.F0.q(c3620e6.get$context())) {
                    return Unit.INSTANCE;
                }
                C3556a6.a.a(C3556a6.f39823a, "Preload Link " + abstractC3710o6);
                if (!Intrinsics.areEqual(abstractC3710o6, AbstractC3710o6.a.f40920a)) {
                    if (abstractC3710o6 instanceof AbstractC3710o6.d) {
                        if (onLoadCallback != null) {
                            Ph.M0 c10 = C1452g0.c();
                            C3629f6 c3629f6 = new C3629f6(onLoadCallback, null);
                            c3620e6.f40582a = null;
                            c3620e6.f40583b = null;
                            c3620e6.f40586e = 2;
                        }
                    } else if (abstractC3710o6 instanceof AbstractC3710o6.b) {
                        c3674k6.getClass();
                        if (onLoadCallback != null) {
                            Ph.M0 c11 = C1452g0.c();
                            C3638g6 c3638g6 = new C3638g6(onLoadCallback, null);
                            c3620e6.f40582a = null;
                            c3620e6.f40583b = null;
                            c3620e6.f40586e = 3;
                        }
                    } else if (abstractC3710o6 instanceof AbstractC3710o6.c) {
                        String a10 = ((AbstractC3710o6.c) abstractC3710o6).a();
                        c3620e6.f40582a = null;
                        c3620e6.f40583b = null;
                        c3620e6.f40586e = 4;
                        c3674k6.getClass();
                    }
                }
                C3556a6.a.a(C3556a6.f39823a, "Preload link complete");
                return Unit.INSTANCE;
            }
        }
        c3620e6 = new C3620e6(this, continuationImpl);
        Object obj2 = c3620e6.f40584c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3620e6.f40586e;
        if (i10 != 0) {
        }
        AbstractC3710o6 abstractC3710o62 = (AbstractC3710o6) obj2;
        if (Ph.F0.q(c3620e6.get$context())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        if (r2.a(r10, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull ContinuationImpl continuationImpl) {
        C3656i6 c3656i6;
        int i10;
        C3674k6 c3674k6;
        if (continuationImpl instanceof C3656i6) {
            c3656i6 = (C3656i6) continuationImpl;
            int i11 = c3656i6.f40682d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3656i6.f40682d = i11 - Integer.MIN_VALUE;
                Object obj = c3656i6.f40680b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3656i6.f40682d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!Ph.F0.q(c3656i6.get$context())) {
                        return Unit.INSTANCE;
                    }
                    Z2 z22 = this.f40732a;
                    c3656i6.f40679a = this;
                    c3656i6.f40682d = 1;
                    obj = z22.a(c3656i6);
                    if (obj != coroutine_suspended) {
                        c3674k6 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    c3674k6 = c3656i6.f40679a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3674k6 = c3656i6.f40679a;
                    ResultKt.throwOnFailure(obj);
                    N2 n22 = (N2) obj;
                    if (!Ph.F0.q(c3656i6.get$context())) {
                        return Unit.INSTANCE;
                    }
                    C3556a6.a.a(C3556a6.f39823a, "Preload workflow complete " + n22);
                    Z2 z23 = c3674k6.f40732a;
                    c3656i6.f40679a = null;
                    c3656i6.f40682d = 3;
                }
                N2 n23 = (N2) obj;
                if (Ph.F0.q(c3656i6.get$context())) {
                    return Unit.INSTANCE;
                }
                C3556a6.a.a(C3556a6.f39823a, "Preload workflow from " + n23);
                Y2 y22 = c3674k6.f40733b;
                c3656i6.f40679a = c3674k6;
                c3656i6.f40682d = 2;
                obj = y22.a(n23, true, (ContinuationImpl) c3656i6);
            }
        }
        c3656i6 = new C3656i6(this, continuationImpl);
        Object obj2 = c3656i6.f40680b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3656i6.f40682d;
        if (i10 != 0) {
        }
        N2 n232 = (N2) obj2;
        if (Ph.F0.q(c3656i6.get$context())) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3611d6 c3611d6;
        int i10;
        C3674k6 c3674k6;
        N2 n22;
        boolean z10;
        if (continuationImpl instanceof C3611d6) {
            c3611d6 = (C3611d6) continuationImpl;
            int i11 = c3611d6.f40561d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3611d6.f40561d = i11 - Integer.MIN_VALUE;
                Object obj = c3611d6.f40559b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3611d6.f40561d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Z2 z22 = this.f40732a;
                    c3611d6.f40558a = this;
                    c3611d6.f40561d = 1;
                    obj = z22.a(c3611d6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c3674k6 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3674k6 = c3611d6.f40558a;
                    ResultKt.throwOnFailure(obj);
                }
                n22 = (N2) obj;
                if (!(n22 instanceof N2.b)) {
                    return AbstractC3710o6.a.f40920a;
                }
                if (!(n22 instanceof N2.k)) {
                    return AbstractC3710o6.d.f40922a;
                }
                N2.k kVar = (N2.k) n22;
                if (!kVar.f39438k) {
                    c3674k6.f40735d.getClass();
                    EnumC3571c1 enumC3571c1 = EnumC3571c1.BACKEND_DETERMINES;
                    if (enumC3571c1.isSet()) {
                        c3674k6.f40735d.getClass();
                        z10 = enumC3571c1.toBoolean();
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return AbstractC3710o6.d.f40922a;
                    }
                }
                if (kVar.f39437j) {
                    return new AbstractC3710o6.b(kVar.f39433f);
                }
                return new AbstractC3710o6.c(kVar.f39433f);
            }
        }
        c3611d6 = new C3611d6(this, continuationImpl);
        Object obj2 = c3611d6.f40559b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3611d6.f40561d;
        if (i10 != 0) {
        }
        n22 = (N2) obj2;
        if (!(n22 instanceof N2.b)) {
        }
    }
}
