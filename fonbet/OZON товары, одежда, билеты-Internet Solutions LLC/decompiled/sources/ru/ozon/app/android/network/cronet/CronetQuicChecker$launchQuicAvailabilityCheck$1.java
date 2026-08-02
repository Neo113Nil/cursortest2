package ru.ozon.app.android.network.cronet;

import Lm0.a;
import Sc.r;
import Sc.s;
import We.L;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import ei0.InterfaceC6369b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import qj.C9067a;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.H3CheckEventsEnabled;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.network.cronet.CronetQuicChecker$launchQuicAvailabilityCheck$1", f = "CronetQuicChecker.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 66}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CronetQuicChecker$launchQuicAvailabilityCheck$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC6369b $ozonTracker;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CronetQuicChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CronetQuicChecker$launchQuicAvailabilityCheck$1(CronetQuicChecker cronetQuicChecker, InterfaceC6369b interfaceC6369b, d<? super CronetQuicChecker$launchQuicAvailabilityCheck$1> dVar) {
        super(2, dVar);
        this.this$0 = cronetQuicChecker;
        this.$ozonTracker = interfaceC6369b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CronetQuicChecker$launchQuicAvailabilityCheck$1 cronetQuicChecker$launchQuicAvailabilityCheck$1 = new CronetQuicChecker$launchQuicAvailabilityCheck$1(this.this$0, this.$ozonTracker, dVar);
        cronetQuicChecker$launchQuicAvailabilityCheck$1.L$0 = obj;
        return cronetQuicChecker$launchQuicAvailabilityCheck$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0243  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r rVar;
        r rVar2;
        AtomicBoolean atomicBoolean;
        C9067a c9067a;
        ConnectionType g10;
        U a11;
        Object s11;
        r rVar3;
        Object s12;
        a.b bVar;
        AtomicBoolean atomicBoolean2;
        CronetPrefs cronetPrefs;
        FeatureService featureService;
        AtomicBoolean atomicBoolean3;
        InterfaceC6369b interfaceC6369b;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
                if (i11 == 0) {
                    s.b(obj);
                    M m11 = (M) this.L$0;
                    c9067a = this.this$0.networkInfoProvider;
                    g10 = C9067a.g(c9067a);
                    U a12 = C10727i.a(m11, null, null, new CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1(this.this$0, null), 3);
                    a11 = C10727i.a(m11, null, null, new CronetQuicChecker$launchQuicAvailabilityCheck$1$h3Deferred$1(this.this$0, null), 3);
                    this.L$0 = g10;
                    this.L$1 = a11;
                    this.label = 1;
                    s11 = a12.s(this);
                    if (s11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = (r) this.L$1;
                        ConnectionType connectionType = (ConnectionType) this.L$0;
                        try {
                            s.b(obj);
                            g10 = connectionType;
                            s12 = obj;
                            rVar2 = (r) s12;
                            try {
                                bVar = a.f17149a;
                                bVar.b("QuicCheck");
                                bVar.i("Quic check h2 response: " + rVar, new Object[0]);
                                bVar.b("QuicCheck");
                                bVar.i("Quic check h3 response: " + rVar2, new Object[0]);
                                if (rVar != null) {
                                    Object f26106a = rVar.getF26106a();
                                    if (f26106a instanceof r.b) {
                                        f26106a = null;
                                    }
                                    L l11 = (L) f26106a;
                                    if (l11 != null) {
                                        this.this$0.safeCloseBody(l11);
                                    }
                                }
                                if (rVar2 != null) {
                                    Object f26106a2 = rVar2.getF26106a();
                                    L l12 = (L) (f26106a2 instanceof r.b ? null : f26106a2);
                                    if (l12 != null) {
                                        this.this$0.safeCloseBody(l12);
                                    }
                                }
                                if (rVar != null || !(!(rVar.getF26106a() instanceof r.b)) || (rVar2 != null && (!(rVar2.getF26106a() instanceof r.b)))) {
                                    bVar.b("QuicCheck");
                                    bVar.i("Quic check - quic fail NOT detected", new Object[0]);
                                    atomicBoolean2 = this.this$0.isCheckInProgress;
                                    atomicBoolean2.set(false);
                                    return Unit.f71690a;
                                }
                                bVar.b("QuicCheck");
                                bVar.i("Quic check - quic FAIL detected!", new Object[0]);
                                cronetPrefs = this.this$0.cronetPrefs;
                                cronetPrefs.setQuicBroken(g10);
                                featureService = this.this$0.featureService;
                                if (featureService.getBooleanKey(H3CheckEventsEnabled.INSTANCE) && (interfaceC6369b = this.$ozonTracker) != null) {
                                    interfaceC6369b.sendEvent(new ActionType.Custom(TokenizedTrackingInfo.ACTION_ERROR_VIEW), (r27 & 2) != 0 ? null : new EventEntity.Obj("error", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null), (r27 & 4) != 0 ? null : new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, g10.name(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "quic_check_error", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870913, -262145, 16383, null), (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : new EventEntity.Widget(null, "error.quicError", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573, null), null, (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
                                }
                                atomicBoolean3 = this.this$0.isCheckInProgress;
                                atomicBoolean3.set(false);
                                return Unit.f71690a;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    a.b bVar2 = a.f17149a;
                                    bVar2.b("QuicCheck");
                                    bVar2.i(th, "Quic check unexpected error", new Object[0]);
                                    atomicBoolean = this.this$0.isCheckInProgress;
                                    atomicBoolean.set(false);
                                    Unit unit = Unit.f71690a;
                                    if (rVar != null) {
                                        Object f26106a3 = rVar.getF26106a();
                                        if (f26106a3 instanceof r.b) {
                                            f26106a3 = null;
                                        }
                                        L l13 = (L) f26106a3;
                                        if (l13 != null) {
                                            this.this$0.safeCloseBody(l13);
                                        }
                                    }
                                    if (rVar2 != null) {
                                        Object f26106a4 = rVar2.getF26106a();
                                        L l14 = (L) (f26106a4 instanceof r.b ? null : f26106a4);
                                        if (l14 != null) {
                                            this.this$0.safeCloseBody(l14);
                                        }
                                    }
                                    return unit;
                                } catch (Throwable th3) {
                                    if (rVar != null) {
                                        Object f26106a5 = rVar.getF26106a();
                                        if (f26106a5 instanceof r.b) {
                                            f26106a5 = null;
                                        }
                                        L l15 = (L) f26106a5;
                                        if (l15 != null) {
                                            this.this$0.safeCloseBody(l15);
                                        }
                                    }
                                    if (rVar2 != null) {
                                        Object f26106a6 = rVar2.getF26106a();
                                        L l16 = (L) (f26106a6 instanceof r.b ? null : f26106a6);
                                        if (l16 != null) {
                                            this.this$0.safeCloseBody(l16);
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            rVar2 = null;
                            a.b bVar22 = a.f17149a;
                            bVar22.b("QuicCheck");
                            bVar22.i(th, "Quic check unexpected error", new Object[0]);
                            atomicBoolean = this.this$0.isCheckInProgress;
                            atomicBoolean.set(false);
                            Unit unit2 = Unit.f71690a;
                            if (rVar != null) {
                            }
                            if (rVar2 != null) {
                            }
                            return unit2;
                        }
                    }
                    a11 = (U) this.L$1;
                    g10 = (ConnectionType) this.L$0;
                    s.b(obj);
                    s11 = obj;
                }
                this.L$0 = g10;
                this.L$1 = rVar3;
                this.label = 2;
                s12 = a11.s(this);
                if (s12 != aVar) {
                    rVar = rVar3;
                    rVar2 = (r) s12;
                    bVar = a.f17149a;
                    bVar.b("QuicCheck");
                    bVar.i("Quic check h2 response: " + rVar, new Object[0]);
                    bVar.b("QuicCheck");
                    bVar.i("Quic check h3 response: " + rVar2, new Object[0]);
                    if (rVar != null) {
                    }
                    if (rVar2 != null) {
                    }
                    if (rVar != null) {
                    }
                    bVar.b("QuicCheck");
                    bVar.i("Quic check - quic fail NOT detected", new Object[0]);
                    atomicBoolean2 = this.this$0.isCheckInProgress;
                    atomicBoolean2.set(false);
                    return Unit.f71690a;
                }
                return aVar;
            } catch (Throwable th5) {
                th = th5;
                rVar2 = null;
                rVar = rVar3;
                a.b bVar222 = a.f17149a;
                bVar222.b("QuicCheck");
                bVar222.i(th, "Quic check unexpected error", new Object[0]);
                atomicBoolean = this.this$0.isCheckInProgress;
                atomicBoolean.set(false);
                Unit unit22 = Unit.f71690a;
                if (rVar != null) {
                }
                if (rVar2 != null) {
                }
                return unit22;
            }
            rVar3 = (r) s11;
        } catch (Throwable th6) {
            th = th6;
            rVar = null;
            rVar2 = null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CronetQuicChecker$launchQuicAvailabilityCheck$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
