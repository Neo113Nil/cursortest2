package m70;

import Sc.o;
import Sc.s;
import androidx.lifecycle.x0;
import d40.InterfaceC6083a;
import e70.InterfaceC6317d;
import g30.InterfaceC6618a;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import n70.EnumC8449a;
import n70.EnumC8450b;
import org.jetbrains.annotations.NotNull;
import q50.C8989a;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;
import xe.C10727i;
import xe.M;
import y40.C10837a;

/* renamed from: m70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8101a extends C8989a {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f74616n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final S80.b f74617o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final V60.a f74618p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private EnumC8449a f74619q;

    /* renamed from: r, reason: collision with root package name */
    private Map<String, String> f74620r;

    @e(c = "ru.ozon.fintech.features.offline.presentation.sheethow.OfflineSheetHowViewModel$actionListenerV2$1", f = "OfflineSheetHowViewModel.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: m70.a$a, reason: collision with other inner class name */
    static final class C1262a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f74621d;

        C1262a(d<? super C1262a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return C8101a.this.new C1262a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((C1262a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74621d;
            C8101a c8101a = C8101a.this;
            if (i11 == 0) {
                s.b(obj);
                V60.a aVar2 = c8101a.f74618p;
                EnumC8449a enumC8449a = EnumC8449a.TARIFF_AND_LIMITS;
                this.f74621d = 1;
                obj = aVar2.h(enumC8449a, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            c8101a.f74617o.pop();
            c8101a.f74617o.q(c8101a.getUuid(), "TARIFF_AND_LIMITS", (Map) obj);
            return Unit.f71690a;
        }
    }

    @e(c = "ru.ozon.fintech.features.offline.presentation.sheethow.OfflineSheetHowViewModel$onCreate$1", f = "OfflineSheetHowViewModel.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: m70.a$b */
    static final class b extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        C8101a f74623d;

        /* renamed from: e, reason: collision with root package name */
        int f74624e;

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return C8101a.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C8101a c8101a;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74624e;
            if (i11 == 0) {
                s.b(obj);
                C8101a c8101a2 = C8101a.this;
                V60.a aVar2 = c8101a2.f74618p;
                EnumC8449a enumC8449a = c8101a2.f74619q;
                this.f74623d = c8101a2;
                this.f74624e = 1;
                Object c11 = aVar2.c(enumC8449a, this);
                if (c11 == aVar) {
                    return aVar;
                }
                c8101a = c8101a2;
                obj = c11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8101a = this.f74623d;
                s.b(obj);
            }
            InterfaceC6317d interfaceC6317d = (InterfaceC6317d) obj;
            if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                    throw new o();
                }
                c8101a.j0(h.E0(C8101a.s0(c8101a, (String) ((InterfaceC6317d.b) interfaceC6317d).a(), c8101a.f74619q)), null, new Integer(2), c8101a.getUuid(), null);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8101a(@NotNull InterfaceC6083a exchanger, @NotNull S80.b fintechNavigation, @NotNull V60.a repository, @NotNull C10656a cbottomMapper2, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        super(cbottomMapper2, fintechAnalyticInteractor, exchanger);
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f74616n = exchanger;
        this.f74617o = fintechNavigation;
        this.f74618p = repository;
        this.f74619q = EnumC8449a.CONNECTED_SMS_STATUS;
    }

    public static final String s0(C8101a c8101a, String str, EnumC8449a enumC8449a) {
        String str2;
        List<EnumC8449a.EnumC1291a> d11 = enumC8449a.d();
        if (d11 == null) {
            d11 = K.f71697a;
        }
        if (d11.isEmpty()) {
            return str;
        }
        for (EnumC8449a.EnumC1291a enumC1291a : d11) {
            Map<String, String> map = c8101a.f74620r;
            if (map != null && (str2 = map.get(enumC1291a.name())) != null) {
                str = h.X(str, enumC1291a.toString(), str2, false);
            }
        }
        return str;
    }

    @Override // G40.a
    public final void d0(@NotNull ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "actionResult2UI");
        String widgetId = actionResult2UI.getWidgetId();
        boolean d11 = Intrinsics.d(widgetId, EnumC8450b.CONFIRM_BUTTON.a());
        S80.b bVar = this.f74617o;
        if (d11) {
            bVar.pop();
            return;
        }
        if (Intrinsics.d(widgetId, EnumC8450b.TRANSFER_BUTTON.a())) {
            this.f74616n.push(C10837a.a(actionResult2UI));
            bVar.pop();
        } else if (Intrinsics.d(widgetId, EnumC8450b.TARIFFS_AND_LIMITS.a())) {
            C10727i.c(x0.a(this), null, null, new C1262a(null), 3);
        }
    }

    @Override // q50.C8989a, G40.a
    public final void g0() {
        super.g0();
        C10727i.c(x0.a(this), null, null, new b(null), 3);
    }

    public final void x0(@NotNull EnumC8449a offlineCbottomType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(offlineCbottomType, "offlineCbottomType");
        this.f74619q = offlineCbottomType;
        this.f74620r = map;
    }
}
