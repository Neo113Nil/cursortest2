package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.C3678l1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5322g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3696n1<T> implements InterfaceC5322g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3678l1 f40839a;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$doOnStart$2", f = "HeadlessOAuthViewModel.kt", i = {0}, l = {68, 69, 70}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: com.plaid.internal.n1$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public C3696n1 f40840a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f40841b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3696n1<T> f40842c;

        /* renamed from: d, reason: collision with root package name */
        public int f40843d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C3696n1<? super T> c3696n1, Continuation<? super a> continuation) {
            super(continuation);
            this.f40842c = c3696n1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40841b = obj;
            this.f40843d |= Integer.MIN_VALUE;
            return this.f40842c.emit(null, this);
        }
    }

    public C3696n1(C3678l1 c3678l1) {
        this.f40839a = c3678l1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (com.plaid.internal.C3678l1.a(r8, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (com.plaid.internal.C3678l1.b(r8, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.InterfaceC5322g
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(@NotNull Pane$PaneRendering pane$PaneRendering, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        int i10;
        C3696n1<T> c3696n1;
        C3678l1.b bVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f40843d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f40843d = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f40841b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f40843d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C3678l1 c3678l1 = this.f40839a;
                    aVar.f40840a = this;
                    aVar.f40843d = 1;
                    obj = C3678l1.a(c3678l1, pane$PaneRendering, aVar);
                    if (obj != coroutine_suspended) {
                        c3696n1 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                c3696n1 = aVar.f40840a;
                ResultKt.throwOnFailure(obj);
                bVar = (C3678l1.b) obj;
                if (!(bVar instanceof C3678l1.b.C0587b)) {
                    C3678l1 c3678l12 = c3696n1.f40839a;
                    String str = ((C3678l1.b.C0587b) bVar).f40752a;
                    aVar.f40840a = null;
                    aVar.f40843d = 2;
                } else {
                    if (!(bVar instanceof C3678l1.b.a)) {
                        if (bVar instanceof C3678l1.b.c) {
                            C3678l1 c3678l13 = c3696n1.f40839a;
                            String oauthRedirectUri = ((C3678l1.b.c) bVar).f40753a;
                            c3678l13.getClass();
                            C3556a6.f39823a.getClass();
                            C3556a6.a.a("Submit redirect URI", true);
                            Intrinsics.checkNotNullParameter(oauthRedirectUri, "oauthRedirectUri");
                            HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b a10 = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().b(oauthRedirectUri));
                            Intrinsics.checkNotNullExpressionValue(a10, "submitUri(...)");
                            C3678l1.a(c3678l13, a10);
                        }
                        return Unit.INSTANCE;
                    }
                    C3678l1 c3678l14 = c3696n1.f40839a;
                    String str2 = ((C3678l1.b.a) bVar).f40751a;
                    aVar.f40840a = null;
                    aVar.f40843d = 3;
                }
                return coroutine_suspended;
            }
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.f40841b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f40843d;
        if (i10 != 0) {
        }
        bVar = (C3678l1.b) obj2;
        if (!(bVar instanceof C3678l1.b.C0587b)) {
        }
        return coroutine_suspended2;
    }
}
