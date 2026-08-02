package com.plaid.internal;

import com.plaid.internal.C3556a6;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class I7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3787x3 f39303a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final B6 f39304b;

    @Inject
    public I7(@NotNull C3787x3 workflowAnalytics, @NotNull B6 readWebviewFallbackId) {
        Intrinsics.checkNotNullParameter(workflowAnalytics, "workflowAnalytics");
        Intrinsics.checkNotNullParameter(readWebviewFallbackId, "readWebviewFallbackId");
        this.f39303a = workflowAnalytics;
        this.f39304b = readWebviewFallbackId;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        F7 f72;
        int i10;
        I7 i72;
        String str;
        if (continuationImpl instanceof F7) {
            f72 = (F7) continuationImpl;
            int i11 = f72.f39254d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f72.f39254d = i11 - Integer.MIN_VALUE;
                Object obj = f72.f39252b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = f72.f39254d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    B6 b62 = this.f39304b;
                    f72.f39251a = this;
                    f72.f39254d = 1;
                    obj = b62.a(f72);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i72 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i72 = f72.f39251a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    C3556a6.a.e(C3556a6.f39823a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackCancelEvent");
                } else {
                    i72.f39303a.a(str);
                    C3556a6.a.a(C3556a6.f39823a, "WebviewFallbackCancel webviewFallbackId=" + str);
                }
                return Unit.INSTANCE;
            }
        }
        f72 = new F7(this, continuationImpl);
        Object obj2 = f72.f39252b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = f72.f39254d;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull ContinuationImpl continuationImpl) {
        G7 g72;
        int i10;
        I7 i72;
        String str;
        if (continuationImpl instanceof G7) {
            g72 = (G7) continuationImpl;
            int i11 = g72.f39266d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g72.f39266d = i11 - Integer.MIN_VALUE;
                Object obj = g72.f39264b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = g72.f39266d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    B6 b62 = this.f39304b;
                    g72.f39263a = this;
                    g72.f39266d = 1;
                    obj = b62.a(g72);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i72 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i72 = g72.f39263a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    C3556a6.a.e(C3556a6.f39823a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackEmitPreCompletionResultEvent");
                } else {
                    i72.f39303a.b(str);
                    C3556a6.a.a(C3556a6.f39823a, "WebviewFallbackEmitPreCompletionResult webviewFallbackId=" + str);
                }
                return Unit.INSTANCE;
            }
        }
        g72 = new G7(this, continuationImpl);
        Object obj2 = g72.f39264b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = g72.f39266d;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull ContinuationImpl continuationImpl) {
        H7 h72;
        int i10;
        I7 i72;
        String str;
        if (continuationImpl instanceof H7) {
            h72 = (H7) continuationImpl;
            int i11 = h72.f39287d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h72.f39287d = i11 - Integer.MIN_VALUE;
                Object obj = h72.f39285b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = h72.f39287d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    B6 b62 = this.f39304b;
                    h72.f39284a = this;
                    h72.f39287d = 1;
                    obj = b62.a(h72);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i72 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i72 = h72.f39284a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                i72.getClass();
                if (str != null) {
                    C3556a6.a.e(C3556a6.f39823a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackOpenEvent");
                } else {
                    i72.f39303a.c(str);
                    C3556a6.a.a(C3556a6.f39823a, "WebviewFallbackOpen webviewFallbackId=" + str);
                }
                return Unit.INSTANCE;
            }
        }
        h72 = new H7(this, continuationImpl);
        Object obj2 = h72.f39285b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = h72.f39287d;
        if (i10 != 0) {
        }
        str = (String) obj2;
        i72.getClass();
        if (str != null) {
        }
        return Unit.INSTANCE;
    }
}
