package com.plaid.internal;

import com.plaid.internal.I2;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$next$1", f = "WorkflowViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class t8 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f41100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f41101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3678l1 f41102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pane$PaneOutput.a f41103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f41104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(List list, C3678l1 c3678l1, Pane$PaneOutput.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f41101b = list;
        this.f41102c = c3678l1;
        this.f41103d = aVar;
        this.f41104e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new t8(this.f41101b, this.f41102c, this.f41103d, this.f41104e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((t8) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f41100a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            List<Common$SDKEvent> list = this.f41101b;
            if (list != null) {
                this.f41102c.getClass();
                for (Common$SDKEvent common$SDKEvent : list) {
                    if (!Intrinsics.areEqual(common$SDKEvent, Common$SDKEvent.getDefaultInstance()) && (linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release()) != null) {
                        linkEventListenerInternal$link_sdk_release.invoke(S6.a(common$SDKEvent), I2.d.f39294a);
                    }
                }
            }
            InterfaceC3759u2 interfaceC3759u2 = this.f41102c.f41127c;
            if (interfaceC3759u2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkController");
                interfaceC3759u2 = null;
            }
            Pane$PaneOutput build = this.f41103d.b(this.f41102c.f41125a.f41038b).a(this.f41104e).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            Pane$PaneOutput[] pane$PaneOutputArr = {build};
            this.f41100a = 1;
            if (interfaceC3759u2.a(pane$PaneOutputArr, this) == coroutine_suspended) {
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
