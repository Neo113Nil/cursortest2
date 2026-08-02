package i70;

import Ae.O0;
import Ae.x0;
import Sc.s;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import d40.InterfaceC6083a;
import e70.InterfaceC6317d;
import g30.InterfaceC6618a;
import i70.l.c;
import j70.C7301a;
import j70.C7302b;
import j70.C7303c;
import j70.C7304d;
import j70.InterfaceC7305e;
import j70.g;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l70.C7892a;
import n70.EnumC8449a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.badgekit.BadgeKitState;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class l extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f65986a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f65987b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d70.d f65988c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f65989d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final K40.a f65990e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final R30.a f65991f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final V60.a f65992g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f65993h;

    /* renamed from: i, reason: collision with root package name */
    private String f65994i;

    /* renamed from: j, reason: collision with root package name */
    private String f65995j;

    /* renamed from: k, reason: collision with root package name */
    private String f65996k;

    /* renamed from: l, reason: collision with root package name */
    private String f65997l;

    /* renamed from: m, reason: collision with root package name */
    private C7892a f65998m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f65999n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final x0<j70.g> f66000o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final x0<a> f66001p;

    /* renamed from: q, reason: collision with root package name */
    private j70.f f66002q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f66003r;

    /* renamed from: s, reason: collision with root package name */
    private long f66004s;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f66005a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f66006b;

        public a() {
            this(false, false);
        }

        public static a a(a aVar, boolean z11, boolean z12, int i11) {
            if ((i11 & 1) != 0) {
                z11 = aVar.f66005a;
            }
            if ((i11 & 2) != 0) {
                z12 = aVar.f66006b;
            }
            return new a(z11, z12);
        }

        public final boolean b() {
            return this.f66006b;
        }

        public final boolean c() {
            return this.f66005a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66005a == aVar.f66005a && this.f66006b == aVar.f66006b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f66006b) + (Boolean.hashCode(this.f66005a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CommissionTogglesState(isSenderToggleSelected=");
            sb2.append(this.f66005a);
            sb2.append(", isReceiverToggleSelected=");
            return Pk0.a.a(")", sb2, this.f66006b);
        }

        public a(boolean z11, boolean z12) {
            this.f66005a = z11;
            this.f66006b = z12;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.pay.OfflinePayViewModel$handleState$1", f = "OfflinePayViewModel.kt", l = {122}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66007d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66007d;
            l lVar = l.this;
            if (i11 == 0) {
                s.b(obj);
                this.f66007d = 1;
                obj = l.p0(lVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            j70.f fVar = (j70.f) obj;
            if (fVar != null) {
                lVar.w0().setValue(new g.b(l.s0(lVar), l.k0(lVar), l.l0(lVar), l.r0(lVar), l.q0(lVar), fVar, l.m0(lVar)));
            } else {
                lVar.w0().setValue(g.a.f69496a);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.pay.OfflinePayViewModel$showCbottom$1$1", f = "OfflinePayViewModel.kt", l = {191}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        S80.b f66009d;

        /* renamed from: e, reason: collision with root package name */
        String f66010e;

        /* renamed from: f, reason: collision with root package name */
        String f66011f;

        /* renamed from: g, reason: collision with root package name */
        int f66012g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ EnumC8449a f66014i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f66015j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EnumC8449a enumC8449a, Map<String, String> map, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f66014i = enumC8449a;
            this.f66015j = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new c(this.f66014i, this.f66015j, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            S80.b bVar;
            String str;
            String name;
            Map<String, String> map;
            S80.b bVar2;
            String str2;
            String str3;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66012g;
            if (i11 == 0) {
                s.b(obj);
                l lVar = l.this;
                bVar = lVar.f65987b;
                str = lVar.f65994i;
                if (str == null) {
                    Intrinsics.n("uuid");
                    throw null;
                }
                EnumC8449a enumC8449a = this.f66014i;
                name = enumC8449a.name();
                map = this.f66015j;
                if (map == null) {
                    V60.a aVar2 = lVar.f65992g;
                    this.f66009d = bVar;
                    this.f66010e = str;
                    this.f66011f = name;
                    this.f66012g = 1;
                    obj = aVar2.h(enumC8449a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bVar2 = bVar;
                    str2 = str;
                    str3 = name;
                }
                bVar.q(str, name, map);
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = this.f66011f;
            str2 = this.f66010e;
            bVar2 = this.f66009d;
            s.b(obj);
            map = (Map) obj;
            name = str3;
            str = str2;
            bVar = bVar2;
            bVar.q(str, name, map);
            return Unit.f71690a;
        }
    }

    public l(@NotNull Context context, @NotNull S80.b fintechNavigation, @NotNull d70.d offlineManager, @NotNull InterfaceC6083a exchanger, @NotNull K40.a cbottomDisplay, @NotNull R30.a appCoroutineScopes, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull V60.a offlineRepository, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(offlineRepository, "offlineRepository");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f65986a = context;
        this.f65987b = fintechNavigation;
        this.f65988c = offlineManager;
        this.f65989d = exchanger;
        this.f65990e = cbottomDisplay;
        this.f65991f = appCoroutineScopes;
        this.f65992g = offlineRepository;
        this.f65993h = fintechAnalyticInteractor;
        this.f65999n = true;
        this.f66000o = O0.a(null);
        this.f66001p = O0.a(new a(false, false));
        this.f66004s = -1L;
    }

    private static Common A0(String str, Function1 function1) {
        return new Common(P4.f.b("toString(...)"), str, null, Boolean.TRUE, null, null, null, function1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435456, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B0(kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        InterfaceC6317d interfaceC6317d;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f66018f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f66018f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mVar.f66016d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f66018f;
                if (i11 != 0) {
                    s.b(obj);
                    mVar.f66018f = 1;
                    obj = this.f65992g.n(mVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                interfaceC6317d = (InterfaceC6317d) obj;
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    return null;
                }
                if (interfaceC6317d instanceof InterfaceC6317d.b) {
                    return (MainData) ((InterfaceC6317d.b) interfaceC6317d).a();
                }
                throw new Sc.o();
            }
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f66016d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f66018f;
        if (i11 != 0) {
        }
        interfaceC6317d = (InterfaceC6317d) obj2;
        if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C0(kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        int i11;
        InterfaceC6317d interfaceC6317d;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f66026f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f66026f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = pVar.f66024d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f66026f;
                if (i11 != 0) {
                    s.b(obj);
                    pVar.f66026f = 1;
                    obj = this.f65992g.j(pVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                interfaceC6317d = (InterfaceC6317d) obj;
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    return null;
                }
                if (interfaceC6317d instanceof InterfaceC6317d.b) {
                    return (TransferData) ((InterfaceC6317d.b) interfaceC6317d).a();
                }
                throw new Sc.o();
            }
        }
        pVar = new p(this, cVar);
        Object obj2 = pVar.f66024d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f66026f;
        if (i11 != 0) {
        }
        interfaceC6317d = (InterfaceC6317d) obj2;
        if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
        }
    }

    public static Unit d0(l lVar, ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "<unused var>");
        x0<a> x0Var = lVar.f66001p;
        x0Var.setValue(a.a(x0Var.getValue(), !r0.c(), false, 2));
        lVar.handleState();
        return Unit.f71690a;
    }

    public static Unit e0(l lVar, String bankName, String numberNormalized, String transferPhone) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(numberNormalized, "numberNormalized");
        Intrinsics.checkNotNullParameter(transferPhone, "transferPhone");
        d70.d dVar = lVar.f65988c;
        String valueOf = String.valueOf(lVar.f66004s);
        x0<a> x0Var = lVar.f66001p;
        dVar.e(valueOf, numberNormalized, bankName, transferPhone, x0Var.getValue().c(), x0Var.getValue().b());
        return Unit.f71690a;
    }

    public static Unit f0(l lVar, ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "<unused var>");
        x0<a> x0Var = lVar.f66001p;
        x0Var.setValue(a.a(x0Var.getValue(), false, !r0.b(), 1));
        lVar.handleState();
        return Unit.f71690a;
    }

    public static Unit g0(l lVar, C7892a c7892a, ActionResult2 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        E30.g.b(new h(lVar, 0), lVar.f65996k, c7892a != null ? c7892a.g() : null, lVar.f65997l);
        return Unit.f71690a;
    }

    public static final BadgeKitState k0(l lVar) {
        String string = lVar.f65986a.getString(R.string.offline_badge_sms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new BadgeKitState(string, BadgeKitState.Size.S_500, BadgeKitState.Color.NEUTRAL_SECONDARY, false, null);
    }

    public static final BadgeKitState l0(l lVar) {
        String string = lVar.f65986a.getString(R.string.offline_badge_how);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new BadgeKitState(string, BadgeKitState.Size.S_500, BadgeKitState.Color.WARNING_SECONDARY, true, new R70.a(lVar, 2));
    }

    public static final InterfaceC7305e m0(l lVar) {
        long j11 = lVar.f66004s;
        if (j11 == -1) {
            return InterfaceC7305e.a.f69486a;
        }
        if (j11 < 1) {
            return C7304d.f69485a;
        }
        j70.f fVar = lVar.f66002q;
        if (fVar != null) {
            long j12 = j11 * 100;
            long u02 = lVar.u0();
            if (j12 > fVar.d()) {
                return C7302b.f69483a;
            }
            if (j12 < fVar.e()) {
                return C7303c.f69484a;
            }
            if (j12 + u02 > fVar.a()) {
                return C7301a.f69482a;
            }
        }
        return InterfaceC7305e.b.f69487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0055, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p0(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        Wc.a aVar;
        int i11;
        Object C02;
        l lVar2;
        MainData mainData;
        TransferData transferData;
        C7892a c7892a;
        Iterator<T> it;
        Object obj;
        Iterator<T> it2;
        Object obj2;
        l lVar3 = lVar;
        lVar3.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i12 = nVar.f66023h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f66023h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj3 = nVar.f66021f;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f66023h;
                if (i11 != 0) {
                    s.b(obj3);
                    if (lVar3.f66003r) {
                        return lVar3.f66002q;
                    }
                    nVar.f66019d = lVar3;
                    nVar.f66023h = 1;
                    obj3 = lVar3.B0(nVar);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mainData = nVar.f66020e;
                        lVar2 = nVar.f66019d;
                        s.b(obj3);
                        transferData = (TransferData) obj3;
                        if (mainData != null && transferData != null) {
                            int balanceCents = mainData.getAccountData().getBalanceCents();
                            String c11 = d70.c.c(mainData.getAccountData().getUpdatedAtMs());
                            c7892a = lVar2.f65998m;
                            if (c7892a != null || (r4 = c7892a.e()) == null) {
                                String str = "";
                            }
                            String str2 = str;
                            it = transferData.getBanks().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (Intrinsics.d(((BankInfo) obj).getId(), lVar2.f65995j)) {
                                    break;
                                }
                            }
                            BankInfo bankInfo = (BankInfo) obj;
                            String logoUrl = bankInfo == null ? bankInfo.getLogoUrl() : null;
                            it2 = transferData.getBanks().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                if (Intrinsics.d(((BankInfo) obj2).getId(), lVar2.f65995j)) {
                                    break;
                                }
                            }
                            BankInfo bankInfo2 = (BankInfo) obj2;
                            lVar2.f65996k = bankInfo2 != null ? bankInfo2.getRusName() : null;
                            lVar2.f65997l = transferData.getTransferPhone();
                            boolean isPriviliged = mainData.getClient().isPriviliged();
                            lVar2.f66002q = new j70.f(balanceCents, c11, str2, logoUrl, !isPriviliged ? transferData.getCommissions().getReceiverPriviligedAmountCents() : transferData.getCommissions().getReceiverCommonAmountCents(), !isPriviliged ? transferData.getCommissions().getSenderPriviligedAmountCents() : transferData.getCommissions().getSenderCommonAmountCents(), transferData.getLimitCents().getMin(), transferData.getLimitCents().getMax());
                            lVar2.f66003r = true;
                        }
                        return lVar2.f66002q;
                    }
                    lVar3 = nVar.f66019d;
                    s.b(obj3);
                }
                MainData mainData2 = (MainData) obj3;
                nVar.f66019d = lVar3;
                nVar.f66020e = mainData2;
                nVar.f66023h = 2;
                C02 = lVar3.C0(nVar);
                if (C02 != aVar) {
                    lVar2 = lVar3;
                    mainData = mainData2;
                    obj3 = C02;
                    transferData = (TransferData) obj3;
                    if (mainData != null) {
                        int balanceCents2 = mainData.getAccountData().getBalanceCents();
                        String c112 = d70.c.c(mainData.getAccountData().getUpdatedAtMs());
                        c7892a = lVar2.f65998m;
                        if (c7892a != null) {
                        }
                        String str3 = "";
                        String str22 = str3;
                        it = transferData.getBanks().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        BankInfo bankInfo3 = (BankInfo) obj;
                        if (bankInfo3 == null) {
                        }
                        it2 = transferData.getBanks().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                            }
                        }
                        BankInfo bankInfo22 = (BankInfo) obj2;
                        lVar2.f65996k = bankInfo22 != null ? bankInfo22.getRusName() : null;
                        lVar2.f65997l = transferData.getTransferPhone();
                        boolean isPriviliged2 = mainData.getClient().isPriviliged();
                        if (!isPriviliged2) {
                        }
                        lVar2.f66002q = new j70.f(balanceCents2, c112, str22, logoUrl, !isPriviliged2 ? transferData.getCommissions().getReceiverPriviligedAmountCents() : transferData.getCommissions().getReceiverCommonAmountCents(), !isPriviliged2 ? transferData.getCommissions().getSenderPriviligedAmountCents() : transferData.getCommissions().getSenderCommonAmountCents(), transferData.getLimitCents().getMin(), transferData.getLimitCents().getMax());
                        lVar2.f66003r = true;
                    }
                    return lVar2.f66002q;
                }
                return aVar;
            }
        }
        nVar = new n(lVar3, cVar);
        Object obj32 = nVar.f66021f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f66023h;
        if (i11 != 0) {
        }
        MainData mainData22 = (MainData) obj32;
        nVar.f66019d = lVar3;
        nVar.f66020e = mainData22;
        nVar.f66023h = 2;
        C02 = lVar3.C0(nVar);
        if (C02 != aVar) {
        }
        return aVar;
    }

    public static final ToggleAtomWrapperState q0(final l lVar) {
        lVar.getClass();
        return new ToggleAtomWrapperState(A0("receiver_toggle_widget", new Function1() { // from class: i70.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.f0(l.this, (ActionResult2UI) obj);
            }
        }), new ToggleDTO(Boolean.valueOf(lVar.f66001p.getValue().b()), null, null, null, null, null, 62, null));
    }

    public static final ToggleAtomWrapperState r0(final l lVar) {
        lVar.getClass();
        return new ToggleAtomWrapperState(A0("sender_toggle_widget", new Function1() { // from class: i70.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.d0(l.this, (ActionResult2UI) obj);
            }
        }), new ToggleDTO(Boolean.valueOf(lVar.f66001p.getValue().c()), null, null, null, null, null, 62, null));
    }

    public static final FinToolbarState s0(l lVar) {
        Context context = lVar.f65986a;
        String string = context.getString(R.string.offline_by_phone_number);
        if (!lVar.f65999n) {
            j70.f fVar = lVar.f66002q;
            r3 = context.getString(R.string.offline_current_account, fVar != null ? d70.c.h(fVar.a()) : null);
        }
        return new FinToolbarState(string, r3, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new o(0, lVar, l.class, "onBackPressed", "onBackPressed()V", 0), null, null, null, null, 17, 61948, null);
    }

    private final long u0() {
        a value = this.f66001p.getValue();
        j70.f fVar = this.f66002q;
        long j11 = 0;
        long h11 = (!value.c() || fVar == null) ? 0L : fVar.h();
        if (value.b() && fVar != null) {
            j11 = fVar.g();
        }
        return h11 + j11;
    }

    public final void D0(boolean z11) {
        if (this.f65999n != z11) {
            this.f65999n = z11;
            handleState();
        }
    }

    public final void E0(@NotNull final EnumC8449a offlineCbottomType, final Map<String, String> map) {
        Intrinsics.checkNotNullParameter(offlineCbottomType, "offlineCbottomType");
        Activity c11 = this.f65987b.c();
        if (c11 instanceof androidx.appcompat.app.g) {
            H30.m.a((androidx.appcompat.app.g) c11);
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i70.k
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                C10727i.c(androidx.lifecycle.x0.a(lVar), null, null, lVar.new c(offlineCbottomType, map, null), 3);
            }
        });
    }

    public final void handleState() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new b(null), 3);
    }

    public final void onBackPressed() {
        this.f65987b.pop();
    }

    public final void onDestroy() {
        this.f65989d.d(ActionResult2.class);
    }

    public final void v0() {
        j70.g value = this.f66000o.getValue();
        g.b bVar = value instanceof g.b ? (g.b) value : null;
        InterfaceC7305e d11 = bVar != null ? bVar.d() : null;
        if ((d11 instanceof InterfaceC7305e.b) || (d11 instanceof C7301a)) {
            long u02 = u0();
            String d12 = d70.c.d(String.valueOf((u02 / 100) + this.f66004s));
            String h11 = d70.c.h(u02);
            a value2 = this.f66001p.getValue();
            if (value2.c() || value2.b()) {
                E0(EnumC8449a.DONE_TRANSFER_WITH_SMS, U.j(new Pair("AMOUNT_KEY", d12), new Pair("SMS_AMOUNT_KEY", h11)));
            } else {
                E0(EnumC8449a.DONE_TRANSFER_NO_SMS, U.i(new Pair("AMOUNT_KEY", d12)));
            }
        } else if (d11 instanceof InterfaceC7305e.a) {
            this.f66004s = 0L;
            handleState();
        } else {
            handleState();
        }
        this.f65993h.C();
    }

    @NotNull
    public final x0<j70.g> w0() {
        return this.f66000o;
    }

    public final void x0(@NotNull String uuid, String str, final C7892a c7892a) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f65994i = uuid;
        this.f65995j = str;
        this.f65998m = c7892a;
        this.f65989d.e(ActionResult2.class, androidx.lifecycle.x0.a(this), false, new Function1() { // from class: i70.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.g0(l.this, c7892a, (ActionResult2) obj);
            }
        });
        handleState();
    }

    public final void y0(@NotNull String newAmount) {
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        try {
            if (newAmount.length() == 0) {
                this.f66004s = 0L;
            } else {
                this.f66004s = Long.parseLong(newAmount);
            }
            handleState();
        } catch (NumberFormatException unused) {
            L80.a.a("OfflinePayViewModel", "Can't convert " + newAmount + " to Int");
        }
    }

    public final void z0() {
        this.f65993h.a2("offline_send_add_amount", false);
    }
}
