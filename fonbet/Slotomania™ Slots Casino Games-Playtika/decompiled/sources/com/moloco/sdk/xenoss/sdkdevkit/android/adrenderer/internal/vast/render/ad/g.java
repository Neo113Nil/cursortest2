package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.ironsource.InterfaceC2517l1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes6.dex */
public final class g {
    public static final String a = "AdController";

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImplKt$isLinearPlaylistItemPlayingFlow$1", f = "AdPlaylistControllerImpl.kt", i = {}, l = {InterfaceC2517l1.a.b.f}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Flow<k> b;
        public final /* synthetic */ MutableStateFlow<Boolean> c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImplKt$isLinearPlaylistItemPlayingFlow$1$1", f = "AdPlaylistControllerImpl.kt", i = {}, l = {InterfaceC2517l1.a.b.j}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a, reason: collision with other inner class name */
        public static final class C0350a extends SuspendLambda implements Function2<k, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ MutableStateFlow<Boolean> c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a$a, reason: collision with other inner class name */
            public static final class C0351a<T> implements FlowCollector {
                public final /* synthetic */ MutableStateFlow<Boolean> a;

                public C0351a(MutableStateFlow<Boolean> mutableStateFlow) {
                    this.a = mutableStateFlow;
                }

                public final Object a(boolean z, Continuation<? super Unit> continuation) {
                    this.a.setValue(Boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((Boolean) obj).booleanValue(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0350a(MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super C0350a> continuation) {
                super(2, continuation);
                this.c = mutableStateFlow;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k kVar, Continuation<? super Unit> continuation) {
                return ((C0350a) create(kVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0350a c0350a = new C0350a(this.c, continuation);
                c0350a.b = obj;
                return c0350a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    k kVar = (k) this.b;
                    if (!(kVar instanceof k.c)) {
                        this.c.setValue(null);
                        return Unit.INSTANCE;
                    }
                    StateFlow<Boolean> isPlaying = ((k.c) kVar).a().isPlaying();
                    C0351a c0351a = new C0351a(this.c);
                    this.a = 1;
                    if (isPlaying.collect(c0351a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Flow<? extends k> flow, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = flow;
            this.c = mutableStateFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<k> flow = this.b;
                C0350a c0350a = new C0350a(this.c, null);
                this.a = 1;
                if (FlowKt.collectLatest(flow, c0350a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Flow<Boolean> b(Flow<? extends k> flow, CoroutineScope coroutineScope) {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(flow, MutableStateFlow, null), 3, null);
        return MutableStateFlow;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a b(List<? extends k> list, k kVar) {
        k kVar2 = (k) CollectionsKt.getOrNull(list, CollectionsKt.indexOf(list, kVar) + 1);
        k.b bVar = kVar2 instanceof k.b ? (k.b) kVar2 : null;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a ad, r externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, l linkHandler) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        return new f(j.a(ad, externalLinkHandler, context, customUserEventBuilderService, z, bool, i, i2, i3, z2, z3, linkHandler), new h(ad.i(), ad.j().n().b(), ad.h(), null, 8, null));
    }

    public static final a.AbstractC0383a.c.EnumC0385a b(List<? extends k> list, k kVar, a.AbstractC0383a.c.EnumC0385a enumC0385a) {
        return (enumC0385a != a.AbstractC0383a.c.EnumC0385a.c || b(list, kVar) == null) ? enumC0385a : a.AbstractC0383a.c.EnumC0385a.d;
    }

    public static final a.AbstractC0383a.c b(List<? extends k> list, k kVar, a.AbstractC0383a.c cVar) {
        a.AbstractC0383a.c.EnumC0385a b = b(list, kVar, cVar.d());
        return b == cVar.d() ? cVar : a.AbstractC0383a.c.a(cVar, b, null, null, 6, null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c mraidAdData, r externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraidFullscreenContentController, int i, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, l linkHandler) {
        Intrinsics.checkNotNullParameter(mraidAdData, "mraidAdData");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        return new f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d.a(mraidAdData, mraidFullscreenContentController, i, context, externalLinkHandler, customUserEventBuilderService, linkHandler), null);
    }
}
