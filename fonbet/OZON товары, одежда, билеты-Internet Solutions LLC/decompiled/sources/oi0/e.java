package oi0;

import Am.C2438a;
import Cd.C2749j;
import Sc.o;
import ei0.InterfaceC6369b;
import ij0.InterfaceC7087b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import oi0.InterfaceC8743a;
import org.jetbrains.annotations.NotNull;
import tj0.InterfaceC9881a;
import tj0.InterfaceC9882b;
import wi0.C10564a;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f78391k = {C2438a.c(e.class, "sendTrackCampaign", "getSendTrackCampaign()Lru/ozon/tracker/debug/menu/domain/tracker/usecase/impl/SendTrackCampaignEventUseCase;", 0), C2438a.c(e.class, "sendEventV2", "getSendEventV2()Lru/ozon/tracker/debug/menu/domain/tracker/usecase/SendEventsUseCase;", 0), C2438a.c(e.class, "sendTrinityEvents", "getSendTrinityEvents()Lru/ozon/tracker/debug/menu/domain/tracker/usecase/SendTrinityEventsUseCase;", 0), C2438a.c(e.class, "sendCustomEvents", "getSendCustomEvents()Lru/ozon/tracker/debug/menu/domain/tracker/usecase/SendEventsUseCase;", 0), C2438a.c(e.class, "sendPageViewEvent", "getSendPageViewEvent()Lru/ozon/tracker/debug/menu/domain/tracker/usecase/SendPageViewEventUseCase;", 0), C2438a.c(e.class, "resetConfigs", "getResetConfigs()Lru/ozon/tracker/debug/menu/shared/configuration/domain/usecase/ResetConfigsUseCase;", 0), C2438a.c(e.class, "trackTraces", "getTrackTraces()Lru/ozon/tracker/debug/menu/shared/traces/domain/usecase/TrackTracesUseCase;", 0), C2438a.c(e.class, "dispatchTraces", "getDispatchTraces()Lru/ozon/tracker/debug/menu/shared/traces/domain/usecase/DispatchTracesUseCase;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f78392a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7087b f78393b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ib.a f78394c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Ib.a f78395d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Ib.a f78396e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Ib.a f78397f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Ib.a f78398g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Ib.a f78399h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Ib.a f78400i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Ib.a f78401j;

    public e(@NotNull InterfaceC6369b tracker, @NotNull InterfaceC7087b changeConfiguration, @NotNull Ib.a<Bi0.f> sendTrackCampaignEventLazy, @NotNull Ib.a<Ai0.a> sendEventV2Lazy, @NotNull Ib.a<Ai0.c> sendTrinityEventsLazy, @NotNull Ib.a<Ai0.a> sendCustomEventsLazy, @NotNull Ib.a<Ai0.b> sendPageViewEventLazy, @NotNull Ib.a<ij0.e> resetConfigsLazy, @NotNull Ib.a<InterfaceC9882b> trackTracesLazy, @NotNull Ib.a<InterfaceC9881a> dispatchTraceLazy) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(changeConfiguration, "changeConfiguration");
        Intrinsics.checkNotNullParameter(sendTrackCampaignEventLazy, "sendTrackCampaignEventLazy");
        Intrinsics.checkNotNullParameter(sendEventV2Lazy, "sendEventV2Lazy");
        Intrinsics.checkNotNullParameter(sendTrinityEventsLazy, "sendTrinityEventsLazy");
        Intrinsics.checkNotNullParameter(sendCustomEventsLazy, "sendCustomEventsLazy");
        Intrinsics.checkNotNullParameter(sendPageViewEventLazy, "sendPageViewEventLazy");
        Intrinsics.checkNotNullParameter(resetConfigsLazy, "resetConfigsLazy");
        Intrinsics.checkNotNullParameter(trackTracesLazy, "trackTracesLazy");
        Intrinsics.checkNotNullParameter(dispatchTraceLazy, "dispatchTraceLazy");
        this.f78392a = tracker;
        this.f78393b = changeConfiguration;
        this.f78394c = sendTrackCampaignEventLazy;
        this.f78395d = sendEventV2Lazy;
        this.f78396e = sendTrinityEventsLazy;
        this.f78397f = sendCustomEventsLazy;
        this.f78398g = sendPageViewEventLazy;
        this.f78399h = resetConfigsLazy;
        this.f78400i = trackTracesLazy;
        this.f78401j = dispatchTraceLazy;
    }

    public final Object a(InterfaceC8743a interfaceC8743a, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        boolean z11 = interfaceC8743a instanceof InterfaceC8743a.h;
        InterfaceC6369b interfaceC6369b = this.f78392a;
        m<Object>[] mVarArr = f78391k;
        if (z11) {
            m<Object> mVar = mVarArr[0];
            InterfaceC8743a.h hVar = (InterfaceC8743a.h) interfaceC8743a;
            ((Bi0.f) C2749j.d(this.f78394c)).a(hVar.b(), hVar.c(), hVar.a());
            interfaceC6369b.g();
        } else if (interfaceC8743a instanceof d) {
            m<Object> mVar2 = mVarArr[1];
            d dVar2 = (d) interfaceC8743a;
            ((Ai0.a) C2749j.d(this.f78395d)).a(dVar2.b(), dVar2.a());
            interfaceC6369b.g();
        } else if (interfaceC8743a instanceof c) {
            m<Object> mVar3 = mVarArr[2];
            c cVar = (c) interfaceC8743a;
            ((Ai0.c) C2749j.d(this.f78396e)).a(cVar.a(), cVar.b(), cVar.c());
            interfaceC6369b.g();
        } else if (interfaceC8743a instanceof b) {
            m<Object> mVar4 = mVarArr[3];
            b bVar = (b) interfaceC8743a;
            ((Ai0.a) C2749j.d(this.f78397f)).a(bVar.b(), bVar.a());
            interfaceC6369b.g();
        } else if (interfaceC8743a instanceof InterfaceC8743a.f) {
            m<Object> mVar5 = mVarArr[4];
            InterfaceC8743a.f fVar = (InterfaceC8743a.f) interfaceC8743a;
            ((Ai0.b) C2749j.d(this.f78398g)).a(fVar.a(), fVar.b());
            interfaceC6369b.g();
        } else if (interfaceC8743a instanceof InterfaceC8743a.b) {
            interfaceC6369b.g();
        } else {
            if (interfaceC8743a instanceof InterfaceC8743a.d) {
                m<Object> mVar6 = mVarArr[5];
                ij0.e eVar = (ij0.e) C2749j.d(this.f78399h);
                Intrinsics.checkNotNullExpressionValue(eVar, "<get-resetConfigs>(...)");
                Object a11 = C10564a.a(eVar, (j) dVar);
                return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
            }
            if (interfaceC8743a instanceof InterfaceC8743a.g) {
                m<Object> mVar7 = mVarArr[6];
                InterfaceC8743a.g gVar = (InterfaceC8743a.g) interfaceC8743a;
                Unit a12 = ((InterfaceC9882b) C2749j.d(this.f78400i)).a(gVar.b(), new Integer(gVar.a()), new Long(gVar.c()));
                return a12 == Wc.a.COROUTINE_SUSPENDED ? a12 : Unit.f71690a;
            }
            if (interfaceC8743a instanceof InterfaceC8743a.c) {
                m<Object> mVar8 = mVarArr[7];
                Unit invoke = ((InterfaceC9881a) C2749j.d(this.f78401j)).invoke();
                return invoke == Wc.a.COROUTINE_SUSPENDED ? invoke : Unit.f71690a;
            }
            if (interfaceC8743a instanceof InterfaceC8743a.e) {
                interfaceC6369b.e();
            } else {
                if (interfaceC8743a instanceof InterfaceC8743a.C1330a) {
                    InterfaceC8743a.C1330a c1330a = (InterfaceC8743a.C1330a) interfaceC8743a;
                    Object a13 = this.f78393b.a(c1330a.a(), Boolean.valueOf(c1330a.b()), (j) dVar);
                    return a13 == Wc.a.COROUTINE_SUSPENDED ? a13 : Unit.f71690a;
                }
                if (interfaceC8743a != null) {
                    throw new o();
                }
            }
        }
        return Unit.f71690a;
    }
}
