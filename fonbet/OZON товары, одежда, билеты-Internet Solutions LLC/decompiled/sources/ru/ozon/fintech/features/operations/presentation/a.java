package ru.ozon.fintech.features.operations.presentation;

import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.p;
import Sc.s;
import android.content.Context;
import androidx.lifecycle.w0;
import h3.C6788a;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.fintech.features.operations.network.BonusDto;
import ru.ozon.fintech.features.operations.network.BonusType;
import ru.ozon.fintech.features.operations.network.C2bReceiptContainer;
import ru.ozon.fintech.features.operations.network.C2bReceiptInfoDto;
import ru.ozon.fintech.features.operations.network.MerchantDto;
import ru.ozon.fintech.features.operations.network.OperationInfoDto;
import ru.ozon.fintech.features.operations.network.OperationsApi;
import ru.ozon.fintech.features.operations.network.ReceiptContainer;
import ru.ozon.fintech.features.operations.network.ReceiptInfoDto;
import ru.ozon.fintech.features.operations.presentation.ReceiptFragment;
import ru.ozon.fintech.features.operations.ui.operationinfo.a;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;

/* loaded from: classes3.dex */
public final class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f96046a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f96047b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f96048c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final OperationsApi f96049d;

    /* renamed from: e, reason: collision with root package name */
    private OperationInfoDto f96050e;

    /* renamed from: f, reason: collision with root package name */
    private ReceiptInfoDto f96051f;

    /* renamed from: g, reason: collision with root package name */
    private C2bReceiptInfoDto f96052g;

    /* renamed from: h, reason: collision with root package name */
    private C70.c f96053h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private C70.b f96054i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f96055j;

    /* renamed from: k, reason: collision with root package name */
    private String f96056k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final h f96057l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<FinToolbarState> f96058m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.fintech.features.operations.ui.operationinfo.a> f96059n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f96060o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final x0<G70.a> f96061p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final x0<G70.a> f96062q;

    /* renamed from: ru.ozon.fintech.features.operations.presentation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2065a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96063a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f96064b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f96065c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f96066d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f96067e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f96068f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f96069g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f96070h;

        static {
            int[] iArr = new int[C70.c.values().length];
            try {
                iArr[C70.c.SBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C70.c.DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C70.c.PURCHASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C70.c.AUTHORIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C70.c.INSTALLMENTREPAYMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C70.c.C2B.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f96063a = iArr;
            int[] iArr2 = new int[C70.b.values().length];
            try {
                iArr2[C70.b.OPERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[C70.b.RECEIPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[C70.b.C2B_RECEIPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f96064b = iArr2;
            int[] iArr3 = new int[a.b.values().length];
            try {
                iArr3[a.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[a.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[a.b.PROCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f96065c = iArr3;
            int[] iArr4 = new int[E70.b.values().length];
            try {
                iArr4[E70.b.SBP_INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[E70.b.SBP_OUTGOING_CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[E70.b.TRANSFER_INCOMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[E70.b.INCOMING_PAYMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[E70.b.HUGO_INCOMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[E70.b.BALZAC_INCOMING.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            f96066d = iArr4;
            int[] iArr5 = new int[E70.e.values().length];
            try {
                iArr5[E70.e.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[E70.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[E70.e.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            f96067e = iArr5;
            int[] iArr6 = new int[BonusType.values().length];
            try {
                iArr6[BonusType.PREMIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[BonusType.CASHBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[BonusType.FAVORITE_CATEGORY_CASHBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[BonusType.HOLD_CASHBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[BonusType.OZON_DISCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            f96068f = iArr6;
            int[] iArr7 = new int[E70.f.values().length];
            try {
                iArr7[E70.f.ACWP.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[E70.f.RCVD.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[E70.f.RJCT.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[E70.f.UNKNOWN_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            f96069g = iArr7;
            int[] iArr8 = new int[E70.d.values().length];
            try {
                iArr8[E70.d.INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr8[E70.d.OUTGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            f96070h = iArr8;
        }
    }

    /* synthetic */ class b extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.k0((a) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class c extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.h0((a) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((S80.b) this.receiver).pop();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoViewModel$loadOperation$1", f = "OperationInfoViewModel.kt", l = {95}, m = "invokeSuspend")
    static final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        a f96071d;

        /* renamed from: e, reason: collision with root package name */
        int f96072e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f96074g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f96074g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new e(this.f96074g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96072e;
            a aVar3 = a.this;
            if (i11 == 0) {
                s.b(obj);
                OperationsApi operationsApi = aVar3.f96049d;
                this.f96071d = aVar3;
                this.f96072e = 1;
                obj = operationsApi.getReceiptInfo(this.f96074g, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f96071d;
                s.b(obj);
            }
            aVar.f96051f = ((ReceiptContainer) obj).getReceiptDto();
            aVar3.f96055j = a.b.f96629a;
            aVar3.handleState();
            L80.a.a("OperationInfoViewModel", String.valueOf(aVar3.f96051f));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoViewModel$loadOperation$2", f = "OperationInfoViewModel.kt", l = {105}, m = "invokeSuspend")
    static final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        a f96075d;

        /* renamed from: e, reason: collision with root package name */
        int f96076e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f96078g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f96078g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new f(this.f96078g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96076e;
            a aVar3 = a.this;
            if (i11 == 0) {
                s.b(obj);
                OperationsApi operationsApi = aVar3.f96049d;
                this.f96075d = aVar3;
                this.f96076e = 1;
                obj = operationsApi.getOperationInfo(this.f96078g, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f96075d;
                s.b(obj);
            }
            aVar.f96050e = (OperationInfoDto) obj;
            aVar3.f96055j = a.b.f96629a;
            aVar3.handleState();
            L80.a.a("OperationInfoViewModel", String.valueOf(aVar3.f96050e));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.operations.presentation.OperationInfoViewModel$loadOperation$3", f = "OperationInfoViewModel.kt", l = {114}, m = "invokeSuspend")
    static final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        a f96079d;

        /* renamed from: e, reason: collision with root package name */
        int f96080e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f96082g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f96082g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new g(this.f96082g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96080e;
            a aVar3 = a.this;
            if (i11 == 0) {
                s.b(obj);
                OperationsApi operationsApi = aVar3.f96049d;
                this.f96079d = aVar3;
                this.f96080e = 1;
                obj = operationsApi.getC2bReceiptInfo(this.f96082g, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f96079d;
                s.b(obj);
            }
            aVar.f96052g = ((C2bReceiptContainer) obj).getDto();
            aVar3.f96055j = a.b.f96629a;
            aVar3.handleState();
            L80.a.a("OperationInfoViewModel", String.valueOf(aVar3.f96052g));
            return Unit.f71690a;
        }
    }

    public static final class h extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f96083a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(J.a aVar, a aVar2) {
            super(aVar);
            this.f96083a = aVar2;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            L80.a.c("OperationInfoViewModel", null, th2);
            a aVar = this.f96083a;
            aVar.f96050e = null;
            aVar.f96051f = null;
            aVar.f96052g = null;
            aVar.f96055j = new a.C2102a(new Exception(th2));
            aVar.handleState();
        }
    }

    public a(@NotNull Context context, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull OperationsApi operationsApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(operationsApi, "operationsApi");
        this.f96046a = context;
        this.f96047b = fintechNavigation;
        this.f96048c = fintechSettings;
        this.f96049d = operationsApi;
        this.f96054i = C70.b.OPERATION;
        this.f96055j = a.b.f96629a;
        this.f96057l = new h(J.f105405n0, this);
        this.f96058m = O0.a(FinToolbarState.INSTANCE.getEMPTY());
        this.f96059n = O0.a(null);
        this.f96060o = O0.a(null);
        this.f96061p = O0.a(null);
        this.f96062q = O0.a(null);
    }

    private final void A0(String str, C70.c cVar) {
        int i11 = cVar == null ? -1 : C2065a.f96063a[cVar.ordinal()];
        h hVar = this.f96057l;
        switch (i11) {
            case -1:
                this.f96047b.pop();
                Unit unit = Unit.f71690a;
                return;
            case 0:
            default:
                throw new o();
            case 1:
                this.f96054i = C70.b.RECEIPT;
                C6788a a11 = androidx.lifecycle.x0.a(this);
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(a11, He.b.f10879b.plus(hVar), null, new e(str, null), 2);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                this.f96054i = C70.b.OPERATION;
                C6788a a12 = androidx.lifecycle.x0.a(this);
                C10720e0 c10720e02 = C10720e0.f105451a;
                C10727i.c(a12, He.b.f10879b.plus(hVar), null, new f(str, null), 2);
                return;
            case 6:
                this.f96054i = C70.b.C2B_RECEIPT;
                C6788a a13 = androidx.lifecycle.x0.a(this);
                C10720e0 c10720e03 = C10720e0.f105451a;
                C10727i.c(a13, He.b.f10879b.plus(hVar), null, new g(str, null), 2);
                return;
        }
    }

    private static a.b C0(E70.f fVar) {
        int i11 = C2065a.f96069g[fVar.ordinal()];
        if (i11 == 1) {
            return a.b.SUCCESS;
        }
        if (i11 == 2) {
            return a.b.PROCESS;
        }
        if (i11 == 3) {
            return a.b.ERROR;
        }
        if (i11 == 4) {
            return a.b.PROCESS;
        }
        throw new o();
    }

    public static final void h0(a aVar) {
        aVar.f96047b.x(0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleState() {
        ScreenState progress;
        C70.a aVar;
        a.b bVar;
        String str;
        BonusDto bonus;
        a.C2066a c2066a;
        String str2;
        MerchantDto merchantDto;
        String name;
        a.C2066a.EnumC2067a enumC2067a;
        String string;
        String string2;
        x0<ScreenState> x0Var = this.f96060o;
        ru.ozon.fintech.network.models.a aVar2 = this.f96055j;
        boolean z11 = aVar2 instanceof a.C2102a;
        Context context = this.f96046a;
        if (z11) {
            progress = ScreenState.INSTANCE.getError(new ru.ozon.fintech.features.operations.presentation.c(0, this, a.class, DeleteAccountApiResponse.Error.TYPE_RELOAD, "reload()V", 0), context, ((a.C2102a) aVar2).a());
        } else if (Intrinsics.d(aVar2, a.b.f96629a)) {
            progress = null;
        } else {
            if (!Intrinsics.d(aVar2, a.c.f96630a)) {
                throw new o();
            }
            progress = new ScreenState.Progress(0L, null, 3, null);
        }
        x0Var.setValue(progress);
        int i11 = C2065a.f96064b[this.f96054i.ordinal()];
        x0<G70.a> x0Var2 = this.f96062q;
        x0<ru.ozon.fintech.features.operations.ui.operationinfo.a> x0Var3 = this.f96059n;
        if (i11 == 1) {
            OperationInfoDto operationInfoDto = this.f96050e;
            if (operationInfoDto != null) {
                String s02 = s0(operationInfoDto.getTime());
                E70.c type = operationInfoDto.getType();
                E70.c cVar = E70.c.OPERATION_AUTHORIZATION;
                if (type == cVar) {
                    int i12 = C2065a.f96070h[operationInfoDto.getDirection().ordinal()];
                    if (i12 == 1) {
                        aVar = new C70.a(operationInfoDto.getPurpose(), context.getString(R.string.fintech_operations_ozon_card));
                    } else {
                        if (i12 != 2) {
                            throw new o();
                        }
                        String string3 = context.getString(R.string.fintech_operations_ozon_card);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        aVar = new C70.a(string3, operationInfoDto.getPurpose());
                    }
                } else if (operationInfoDto.getType() == E70.c.OPERATION_OZON) {
                    String string4 = context.getString(R.string.fintech_operations_ozon_count);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    aVar = new C70.a(string4, null);
                } else if (kotlin.text.h.t(operationInfoDto.getPurpose(), "OZON", false)) {
                    String string5 = context.getString(R.string.fintech_operations_ozon_card);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    aVar = new C70.a(string5, null);
                } else {
                    aVar = new C70.a(operationInfoDto.getPurpose(), null);
                }
                String purpose = operationInfoDto.getPurpose();
                String categoryGroupName = operationInfoDto.getCategoryGroupName();
                Integer valueOf = (kotlin.text.h.t(purpose, "OZON", false) || (categoryGroupName != null && kotlin.text.h.t(categoryGroupName, "OZON", false))) ? Integer.valueOf(R.drawable.fintech_operations_ic_ozon_purchase_48) : null;
                E70.e status = operationInfoDto.getStatus();
                int[] iArr = C2065a.f96067e;
                int i13 = iArr[status.ordinal()];
                if (i13 == 1) {
                    bVar = a.b.SUCCESS;
                } else if (i13 == 2) {
                    bVar = a.b.ERROR;
                } else {
                    if (i13 != 3) {
                        throw new o();
                    }
                    bVar = a.b.PROCESS;
                }
                a.b bVar2 = bVar;
                C70.c cVar2 = this.f96053h;
                if (cVar2 != null) {
                    switch (C2065a.f96063a[cVar2.ordinal()]) {
                        case 1:
                            if (operationInfoDto.getDirection() != E70.d.OUTGOING) {
                                string = context.getString(R.string.fintech_operations_success_sbp_incoming);
                                break;
                            } else {
                                string = context.getString(R.string.fintech_operations_success_sbp_outgoing);
                                break;
                            }
                        case 2:
                        case 5:
                        case 6:
                            string = "";
                            break;
                        case 3:
                        case 4:
                            if (operationInfoDto.getType() != cVar) {
                                string = x0(operationInfoDto.getStatus());
                                break;
                            } else if (operationInfoDto.getDirection() != E70.d.INCOMING) {
                                String categoryGroupName2 = operationInfoDto.getCategoryGroupName();
                                if (categoryGroupName2 != null && kotlin.text.h.t(categoryGroupName2, "Финансовые услуги", false)) {
                                    int i14 = iArr[operationInfoDto.getStatus().ordinal()];
                                    if (i14 == 1) {
                                        string = context.getString(R.string.fintech_operations_success__2__outgoing_res_0x7f13023d);
                                        break;
                                    } else if (i14 == 2) {
                                        string = context.getString(R.string.fintech_operations_error__2__outgoing_res_0x7f130223);
                                        break;
                                    } else {
                                        if (i14 != 3) {
                                            throw new o();
                                        }
                                        string = context.getString(R.string.fintech_operations_process__2__outgoing_res_0x7f13022c);
                                        break;
                                    }
                                } else {
                                    string = x0(operationInfoDto.getStatus());
                                    break;
                                }
                            } else {
                                string = context.getString(R.string.fintech_operations_success__2__incoming_res_0x7f13023c);
                                break;
                            }
                        default:
                            throw new o();
                    }
                    if (string != null) {
                        str = string;
                        String w02 = w0(operationInfoDto.getAccountAmount());
                        String a11 = aVar.a();
                        String b11 = aVar.b();
                        String categoryGroupName3 = operationInfoDto.getCategoryGroupName();
                        MerchantDto merchantDto2 = operationInfoDto.getMerchantDto();
                        String logoUrl = merchantDto2 == null ? merchantDto2.getLogoUrl() : null;
                        bonus = operationInfoDto.getBonus();
                        if (bonus == null) {
                            String w03 = w0(bonus.getAmount());
                            int i15 = C2065a.f96068f[bonus.getType().ordinal()];
                            if (i15 == 1) {
                                enumC2067a = a.C2066a.EnumC2067a.PREMIUM;
                            } else {
                                if (i15 != 2) {
                                    if (i15 == 3) {
                                        throw new p(null, 1, null);
                                    }
                                    if (i15 == 4) {
                                        throw new p(null, 1, null);
                                    }
                                    if (i15 == 5) {
                                        throw new p(null, 1, null);
                                    }
                                    throw new o();
                                }
                                enumC2067a = a.C2066a.EnumC2067a.CURRENCY;
                            }
                            c2066a = new a.C2066a(enumC2067a, w03);
                        } else {
                            c2066a = null;
                        }
                        x0Var3.setValue(new ru.ozon.fintech.features.operations.ui.operationinfo.a(bVar2, str, w02, a11, b11, categoryGroupName3, valueOf, logoUrl, c2066a, null, 15616));
                        if (!kotlin.text.h.t(operationInfoDto.getPurpose(), "OZON", false) || ((merchantDto = operationInfoDto.getMerchantDto()) != null && (name = merchantDto.getName()) != null && kotlin.text.h.t(name, "OZON", false))) {
                            String string6 = context.getString(R.string.fintech_operations_ozon_view_order);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            x0Var2.setValue(new G70.a(string6, R.drawable.fintech_operations_ic_box_24, new b(0, this, a.class, "openOzonOrder", "openOzonOrder()V", 0)));
                        }
                        str2 = s02;
                    }
                }
                str = "";
                String w022 = w0(operationInfoDto.getAccountAmount());
                String a112 = aVar.a();
                String b112 = aVar.b();
                String categoryGroupName32 = operationInfoDto.getCategoryGroupName();
                MerchantDto merchantDto22 = operationInfoDto.getMerchantDto();
                if (merchantDto22 == null) {
                }
                bonus = operationInfoDto.getBonus();
                if (bonus == null) {
                }
                x0Var3.setValue(new ru.ozon.fintech.features.operations.ui.operationinfo.a(bVar2, str, w022, a112, b112, categoryGroupName32, valueOf, logoUrl, c2066a, null, 15616));
                if (!kotlin.text.h.t(operationInfoDto.getPurpose(), "OZON", false)) {
                }
                String string62 = context.getString(R.string.fintech_operations_ozon_view_order);
                Intrinsics.checkNotNullExpressionValue(string62, "getString(...)");
                x0Var2.setValue(new G70.a(string62, R.drawable.fintech_operations_ic_box_24, new b(0, this, a.class, "openOzonOrder", "openOzonOrder()V", 0)));
                str2 = s02;
            }
            str2 = "";
        } else if (i11 == 2) {
            ReceiptInfoDto receiptInfoDto = this.f96051f;
            if (receiptInfoDto != null) {
                String s03 = s0(receiptInfoDto.getTime());
                a.b C02 = C0(receiptInfoDto.getStatus());
                String w04 = w0(receiptInfoDto.getAmount());
                String logoUrl2 = receiptInfoDto.getLogoUrl();
                String counterPartyBank = receiptInfoDto.getCounterPartyBank();
                E70.b sourceType = receiptInfoDto.getSourceType();
                int[] iArr2 = C2065a.f96066d;
                int i16 = iArr2[sourceType.ordinal()];
                if (i16 != 1 && i16 != 3 && i16 != 4 && i16 != 5 && i16 != 6) {
                    counterPartyBank = context.getString(R.string.fintech_operations_ozon_count);
                    Intrinsics.f(counterPartyBank);
                }
                String str3 = counterPartyBank;
                String counterPartyBank2 = receiptInfoDto.getCounterPartyBank();
                int i17 = iArr2[receiptInfoDto.getSourceType().ordinal()];
                if (i17 == 1 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6) {
                    counterPartyBank2 = context.getString(R.string.fintech_operations_ozon_count);
                    Intrinsics.f(counterPartyBank2);
                }
                x0Var3.setValue(new ru.ozon.fintech.features.operations.ui.operationinfo.a(C02, r0(receiptInfoDto.getSourceType(), C02), w04, str3, counterPartyBank2, G.g.c(receiptInfoDto.getCounterPartyName(), "\n", receiptInfoDto.getCounterPartyPhone()), null, logoUrl2, null, context.getString(R.string.fintech_operations_without_comission), 14144));
                String string7 = context.getString(R.string.fintech_operations_receipt_action_card_title);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                x0Var2.setValue(new G70.a(string7, R.drawable.fintech_operations_ic_receipt, new ru.ozon.fintech.features.operations.presentation.b(0, this, a.class, "gotoReceiptScreen", "gotoReceiptScreen()V", 0)));
                str2 = s03;
            }
            str2 = "";
        } else {
            if (i11 != 3) {
                throw new o();
            }
            C2bReceiptInfoDto c2bReceiptInfoDto = this.f96052g;
            if (c2bReceiptInfoDto != null) {
                String s04 = s0(c2bReceiptInfoDto.getTime());
                String w05 = w0(c2bReceiptInfoDto.getAmount());
                String logoUrl3 = c2bReceiptInfoDto.getLogoUrl();
                String counterPartyBank3 = c2bReceiptInfoDto.getCounterPartyBank();
                String string8 = context.getString(R.string.fintech_operations_ozon_count);
                E70.a status2 = c2bReceiptInfoDto.getStatus();
                E70.a aVar3 = E70.a.SUCCESS;
                a.b bVar3 = status2 == aVar3 ? a.b.SUCCESS : a.b.ERROR;
                if (c2bReceiptInfoDto.getStatus() == aVar3) {
                    string2 = context.getString(R.string.fintech_operations_success_sbp_incoming);
                    Intrinsics.f(string2);
                } else {
                    string2 = context.getString(R.string.fintech_operations_error_sbp_outgoing);
                    Intrinsics.f(string2);
                }
                x0Var3.setValue(new ru.ozon.fintech.features.operations.ui.operationinfo.a(bVar3, string2, w05, counterPartyBank3, string8, G.g.c(c2bReceiptInfoDto.getCounterPartyName(), "\n", c2bReceiptInfoDto.getCounterPartyPhone()), null, logoUrl3, null, null, 16192));
                String string9 = context.getString(R.string.fintech_operations_receipt_action_card_title);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                x0Var2.setValue(new G70.a(string9, R.drawable.fintech_operations_ic_receipt, new ru.ozon.fintech.features.operations.presentation.b(0, this, a.class, "gotoReceiptScreen", "gotoReceiptScreen()V", 0)));
                str2 = s04;
            }
            str2 = "";
        }
        OperationInfoDto operationInfoDto2 = this.f96050e;
        x0<G70.a> x0Var4 = this.f96061p;
        if (operationInfoDto2 == null && this.f96051f == null && this.f96052g == null) {
            x0Var4.setValue(null);
        } else {
            String string10 = context.getString(R.string.fintech_operations_goto_main_screen);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            x0Var4.setValue(new G70.a(string10, R.drawable.fintech_operations_ic_m_home_24, new c(0, this, a.class, "goHome", "goHome()V", 0)));
        }
        this.f96058m.setValue(new FinToolbarState(str2, null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new d(0, this.f96047b, S80.b.class, "pop", "pop()V", 0), null, null, null, null, 17, 61950, null));
    }

    public static final void i0(a aVar) {
        ReceiptFragment.a aVar2;
        String string;
        int i11 = C2065a.f96064b[aVar.f96054i.ordinal()];
        Context context = aVar.f96046a;
        if (i11 == 2) {
            ReceiptInfoDto receiptInfoDto = aVar.f96051f;
            if (receiptInfoDto != null) {
                String s02 = s0(receiptInfoDto.getTime());
                a.b C02 = C0(receiptInfoDto.getStatus());
                int i12 = C2065a.f96065c[C02.ordinal()];
                if (i12 == 1) {
                    aVar2 = ReceiptFragment.a.SUCCESS;
                } else if (i12 == 2) {
                    aVar2 = ReceiptFragment.a.ERROR;
                } else {
                    if (i12 != 3) {
                        throw new o();
                    }
                    aVar2 = ReceiptFragment.a.PROCESS;
                }
                String r02 = aVar.r0(receiptInfoDto.getSourceType(), C02);
                String id2 = receiptInfoDto.getId();
                int ordinal = aVar2.ordinal();
                String w02 = aVar.w0(receiptInfoDto.getAmount());
                String string2 = context.getString(R.string.fintech_operations_ozon_card);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                aVar.f96047b.w0(id2, r02, ordinal, s02, w02, string2, receiptInfoDto.getCounterPartyName(), receiptInfoDto.getCounterPartyPhone(), receiptInfoDto.getCounterPartyBank(), receiptInfoDto.getMessage());
                return;
            }
            return;
        }
        if (i11 != 3) {
            L80.a.a("OperationInfoViewModel", "gotoReceiptScreen: incorrect flow type for this invoked method");
            return;
        }
        C2bReceiptInfoDto c2bReceiptInfoDto = aVar.f96052g;
        if (c2bReceiptInfoDto != null) {
            String s03 = s0(c2bReceiptInfoDto.getTime());
            E70.a status = c2bReceiptInfoDto.getStatus();
            E70.a aVar3 = E70.a.SUCCESS;
            ReceiptFragment.a aVar4 = status == aVar3 ? ReceiptFragment.a.SUCCESS : ReceiptFragment.a.ERROR;
            String id3 = c2bReceiptInfoDto.getId();
            if (c2bReceiptInfoDto.getStatus() == aVar3) {
                string = context.getString(R.string.fintech_operations_success_sbp_incoming);
                Intrinsics.f(string);
            } else {
                string = context.getString(R.string.fintech_operations_error_sbp_outgoing);
                Intrinsics.f(string);
            }
            String str = string;
            int ordinal2 = aVar4.ordinal();
            String w03 = aVar.w0(c2bReceiptInfoDto.getAmount());
            String string3 = context.getString(R.string.fintech_operations_ozon_card);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            aVar.f96047b.w0(id3, str, ordinal2, s03, w03, string3, c2bReceiptInfoDto.getCounterPartyName(), c2bReceiptInfoDto.getCounterPartyPhone(), c2bReceiptInfoDto.getCounterPartyBank(), null);
        }
    }

    public static final void k0(a aVar) {
        OperationInfoDto operationInfoDto = aVar.f96050e;
        if (operationInfoDto != null) {
            String b11 = Nk.a.b("ozon://my/orderDetails/?order=", operationInfoDto.getOzonOrderNumber());
            ru.ozon.fintech.settings.domain.a aVar2 = aVar.f96048c;
            boolean isStandAloneIntegration = aVar2.isStandAloneIntegration();
            S80.b bVar = aVar.f96047b;
            if (!isStandAloneIntegration) {
                bVar.gotoDeeplinkOnlyIntegration(b11);
            } else if (aVar2.p()) {
                bVar.m(b11);
            } else {
                bVar.u("ru.ozon.app.android");
            }
        }
    }

    public static final void l0(a aVar) {
        String str = aVar.f96056k;
        if (str != null) {
            aVar.f96055j = a.c.f96630a;
            aVar.handleState();
            aVar.A0(str, aVar.f96053h);
        }
    }

    private final String r0(E70.b bVar, a.b bVar2) {
        int i11 = C2065a.f96066d[bVar.ordinal()];
        Context context = this.f96046a;
        if (i11 == 1) {
            String string = context.getString(R.string.fintech_operations_success_sbp_incoming);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i11 != 2) {
            return "";
        }
        int i12 = C2065a.f96065c[bVar2.ordinal()];
        if (i12 == 1) {
            String string2 = context.getString(R.string.fintech_operations_success_sbp_outgoing);
            Intrinsics.f(string2);
            return string2;
        }
        if (i12 == 2) {
            String string3 = context.getString(R.string.fintech_operations_error_sbp_outgoing);
            Intrinsics.f(string3);
            return string3;
        }
        if (i12 != 3) {
            throw new o();
        }
        String string4 = context.getString(R.string.fintech_operations_process_sbp_outgoing);
        Intrinsics.f(string4);
        return string4;
    }

    private static String s0(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd.MM.YYYY, HH:mm");
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return "";
            }
            String format = simpleDateFormat2.format(parse);
            return format == null ? "" : format;
        } catch (Exception unused) {
            return "";
        }
    }

    private final String w0(String str) {
        String q02 = kotlin.text.h.q0(str.length() - 2, str);
        String r02 = kotlin.text.h.r0(2, str);
        if (!Intrinsics.d(r02, "00")) {
            q02 = G.g.c(q02, ".", r02);
        }
        return G.g.c(q02, " ", this.f96046a.getString(R.string.fintech_operations_amount_valute));
    }

    private final String x0(E70.e eVar) {
        int i11 = C2065a.f96067e[eVar.ordinal()];
        Context context = this.f96046a;
        if (i11 == 1) {
            String string = context.getString(R.string.fintech_operations_success_purchase);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i11 == 2) {
            String string2 = context.getString(R.string.fintech_operations_error_purchase);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i11 != 3) {
            throw new o();
        }
        String string3 = context.getString(R.string.fintech_operations_process_purchase);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final void B0(@NotNull String id2, C70.c cVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        L80.a.a("OperationInfoViewModel", "Operation type: " + cVar);
        this.f96055j = a.c.f96630a;
        handleState();
        this.f96053h = cVar;
        this.f96056k = id2;
        A0(id2, cVar);
    }

    @NotNull
    public final x0<G70.a> t0() {
        return this.f96062q;
    }

    @NotNull
    public final x0<G70.a> u0() {
        return this.f96061p;
    }

    @NotNull
    public final x0<ru.ozon.fintech.features.operations.ui.operationinfo.a> v0() {
        return this.f96059n;
    }

    @NotNull
    public final x0<ScreenState> y0() {
        return this.f96060o;
    }

    @NotNull
    public final x0<FinToolbarState> z0() {
        return this.f96058m;
    }
}
