package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import Je.InterfaceC3394a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$onPassengerTabClicked$1", f = "FlightSeatsSchemeV2ViewModel.kt", l = {485, 159}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ViewModel$onPassengerTabClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI $passenger;
    final /* synthetic */ int $position;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FlightSeatsSchemeV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2ViewModel$onPassengerTabClicked$1(FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel, int i11, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI, d<? super FlightSeatsSchemeV2ViewModel$onPassengerTabClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = flightSeatsSchemeV2ViewModel;
        this.$position = i11;
        this.$passenger = passengerV2VI;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatsSchemeV2ViewModel$onPassengerTabClicked$1(this.this$0, this.$position, this.$passenger, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(9:6|7|8|9|10|(1:12)|13|14|15)(2:22|23))(1:24))(3:36|(1:38)|28)|25|26|(7:29|9|10|(0)|13|14|15)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        r0 = r9;
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:10:0x007e, B:12:0x0084, B:13:0x008c, B:21:0x0078, B:33:0x0094), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [Je.a, Wc.a, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel;
        int i11;
        FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI;
        InterfaceC3394a interfaceC3394a2;
        Object selectPassengerInternal;
        Object a11;
        Throwable b11;
        ?? r02 = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        try {
            if (i12 == 0) {
                s.b(obj);
                interfaceC3394a = this.this$0.mutex;
                flightSeatsSchemeV2ViewModel = this.this$0;
                i11 = this.$position;
                FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI2 = this.$passenger;
                this.L$0 = interfaceC3394a;
                this.L$1 = flightSeatsSchemeV2ViewModel;
                this.L$2 = passengerV2VI2;
                this.I$0 = i11;
                this.label = 1;
                if (interfaceC3394a.a(this) != r02) {
                    passengerV2VI = passengerV2VI2;
                }
                return r02;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3394a2 = (InterfaceC3394a) this.L$0;
                try {
                    s.b(obj);
                    a11 = Unit.f71690a;
                    r.Companion companion = r.INSTANCE;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th3);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    Unit unit = Unit.f71690a;
                    interfaceC3394a2.c(null);
                    return Unit.f71690a;
                }
                b11 = r.b(a11);
                if (b11 != null) {
                    Lm0.a.f17149a.e(b11);
                }
                Unit unit2 = Unit.f71690a;
                interfaceC3394a2.c(null);
                return Unit.f71690a;
            }
            i11 = this.I$0;
            passengerV2VI = (FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI) this.L$2;
            flightSeatsSchemeV2ViewModel = (FlightSeatsSchemeV2ViewModel) this.L$1;
            InterfaceC3394a interfaceC3394a3 = (InterfaceC3394a) this.L$0;
            s.b(obj);
            interfaceC3394a = interfaceC3394a3;
            r.Companion companion3 = r.INSTANCE;
            this.L$0 = interfaceC3394a;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            selectPassengerInternal = flightSeatsSchemeV2ViewModel.selectPassengerInternal(i11, passengerV2VI, this);
            if (selectPassengerInternal != r02) {
                interfaceC3394a2 = interfaceC3394a;
                a11 = Unit.f71690a;
                r.Companion companion4 = r.INSTANCE;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                Unit unit22 = Unit.f71690a;
                interfaceC3394a2.c(null);
                return Unit.f71690a;
            }
            return r02;
        } catch (Throwable th4) {
            r02.c(null);
            throw th4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightSeatsSchemeV2ViewModel$onPassengerTabClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
