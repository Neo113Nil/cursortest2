package ru.ozon.app.android.bank.domain;

import Ae.C;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Be.m;
import De.C2862e;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import i3.C7003a;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.app.android.storage.user.model.User;
import ru.ozon.fintech.features.finwebview.domain.badge.ExternalBadgeCallback$BadgeState;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t*\u0001!\u0018\u0000 '2\u00020\u0001:\u0002'(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006)"}, d2 = {"Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Landroid/content/Context;", "context", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/user/UserManager;Landroid/content/Context;Lcom/squareup/moshi/Moshi;)V", "LAe/h;", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager$BankBadgeState;", "requestActionFlow", "()LAe/h;", "", "registerReceiver", "()V", "unregisterReceiver", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/account/user/UserManager;", "Landroid/content/Context;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/finwebview/domain/badge/ExternalBadgeCallback$BadgeState;", "badgeDTOJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lxe/M;", "scope", "Lxe/M;", "LAe/w0;", "mutableBadgeState", "LAe/w0;", "ru/ozon/app/android/bank/domain/BankTabBadgeManager$localBroadCastReceiver$1", "localBroadCastReceiver", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager$localBroadCastReceiver$1;", "badgeFlow", "LAe/h;", "getBadgeFlow", "Companion", "BankBadgeState", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankTabBadgeManager {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final JsonAdapter<ExternalBadgeCallback$BadgeState> badgeDTOJsonAdapter;

    @NotNull
    private final InterfaceC2395h<BankBadgeState> badgeFlow;

    @NotNull
    private final Context context;

    @NotNull
    private final BankTabBadgeManager$localBroadCastReceiver$1 localBroadCastReceiver;

    @NotNull
    private final w0<BankBadgeState> mutableBadgeState;

    @NotNull
    private final M scope;

    @NotNull
    private final UserManager userManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.bank.domain.BankTabBadgeManager$1", f = "BankTabBadgeManager.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.bank.domain.BankTabBadgeManager$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return BankTabBadgeManager.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h requestActionFlow = BankTabBadgeManager.this.requestActionFlow();
                final BankTabBadgeManager bankTabBadgeManager = BankTabBadgeManager.this;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.bank.domain.BankTabBadgeManager.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((BankBadgeState) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(BankBadgeState bankBadgeState, d<? super Unit> dVar) {
                        BankTabBadgeManager.this.mutableBadgeState.tryEmit(bankBadgeState);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (requestActionFlow.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.bank.domain.BankTabBadgeManager$2", f = "BankTabBadgeManager.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.bank.domain.BankTabBadgeManager$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return BankTabBadgeManager.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                p<User> skip = BankTabBadgeManager.this.userManager.observeUser().skip(1L);
                Intrinsics.checkNotNullExpressionValue(skip, "skip(...)");
                m Q11 = C2399j.Q(n.a(skip), new BankTabBadgeManager$2$invokeSuspend$$inlined$flatMapLatest$1(null, BankTabBadgeManager.this));
                final BankTabBadgeManager bankTabBadgeManager = BankTabBadgeManager.this;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.bank.domain.BankTabBadgeManager.2.2
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((BankBadgeState) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(BankBadgeState bankBadgeState, d<? super Unit> dVar) {
                        BankTabBadgeManager.this.mutableBadgeState.tryEmit(bankBadgeState);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (Q11.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/bank/domain/BankTabBadgeManager$BankBadgeState;", "", "", "isVisible", "", "count", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getCount", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankBadgeState {

        @NotNull
        private final String count;
        private final boolean isVisible;

        public BankBadgeState(boolean z11, @NotNull String count) {
            Intrinsics.checkNotNullParameter(count, "count");
            this.isVisible = z11;
            this.count = count;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankBadgeState)) {
                return false;
            }
            BankBadgeState bankBadgeState = (BankBadgeState) other;
            return this.isVisible == bankBadgeState.isVisible && Intrinsics.d(this.count, bankBadgeState.count);
        }

        @NotNull
        public final String getCount() {
            return this.count;
        }

        public int hashCode() {
            return this.count.hashCode() + (Boolean.hashCode(this.isVisible) * 31);
        }

        /* renamed from: isVisible, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        @NotNull
        public String toString() {
            return "BankBadgeState(isVisible=" + this.isVisible + ", count=" + this.count + ")";
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ru.ozon.app.android.bank.domain.BankTabBadgeManager$localBroadCastReceiver$1] */
    public BankTabBadgeManager(@NotNull ActionV2Repository actionRepository, @NotNull UserManager userManager, @NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.actionRepository = actionRepository;
        this.userManager = userManager;
        this.context = context;
        this.badgeDTOJsonAdapter = moshi.c(ExternalBadgeCallback$BadgeState.class);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(b.f10879b.plus(X0.b()));
        this.scope = a11;
        C0 a12 = E0.a(1, 1, EnumC11113a.DROP_LATEST);
        this.mutableBadgeState = a12;
        this.localBroadCastReceiver = new BroadcastReceiver() { // from class: ru.ozon.app.android.bank.domain.BankTabBadgeManager$localBroadCastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String stringExtra;
                M m11;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (!Intrinsics.d(intent.getAction(), "ru.ozon.fintech.TAB_MESSAGE") || (stringExtra = intent.getStringExtra("extra_message_data")) == null) {
                    return;
                }
                BankTabBadgeManager bankTabBadgeManager = BankTabBadgeManager.this;
                m11 = bankTabBadgeManager.scope;
                C10727i.c(m11, null, null, new BankTabBadgeManager$localBroadCastReceiver$1$onReceive$1$1(bankTabBadgeManager, stringExtra, null), 3);
            }
        };
        this.badgeFlow = a12;
        C10727i.c(a11, null, null, new AnonymousClass1(null), 3);
        C10727i.c(a11, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<BankBadgeState> requestActionFlow() {
        p k11 = this.actionRepository.callAction(new ActionV2Request(null, "bankTabNotification", false, 5, null), BankTabBadgeActionDto.class).k();
        Intrinsics.checkNotNullExpressionValue(k11, "toObservable(...)");
        final InterfaceC2395h a11 = n.a(k11);
        return new C(new InterfaceC2395h<BankBadgeState>() { // from class: ru.ozon.app.android.bank.domain.BankTabBadgeManager$requestActionFlow$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.bank.domain.BankTabBadgeManager$requestActionFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.bank.domain.BankTabBadgeManager$requestActionFlow$$inlined$mapNotNull$1$2", f = "BankTabBadgeManager.kt", l = {57}, m = "emit")
                /* renamed from: ru.ozon.app.android.bank.domain.BankTabBadgeManager$requestActionFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                BankTabBadgeActionDto bankTabBadgeActionDto = (BankTabBadgeActionDto) ((ActionV2Response) obj).getData();
                                BankTabBadgeManager.BankBadgeState bankBadgeState = bankTabBadgeActionDto != null ? new BankTabBadgeManager.BankBadgeState(bankTabBadgeActionDto.getActive(), bankTabBadgeActionDto.getItem()) : null;
                                if (bankBadgeState != null) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(bankBadgeState, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super BankTabBadgeManager.BankBadgeState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new BankTabBadgeManager$requestActionFlow$2(null));
    }

    @NotNull
    public final InterfaceC2395h<BankBadgeState> getBadgeFlow() {
        return this.badgeFlow;
    }

    public final void registerReceiver() {
        C7003a.b(this.context).c(this.localBroadCastReceiver, new IntentFilter("ru.ozon.fintech.TAB_MESSAGE"));
    }

    public final void unregisterReceiver() {
        C7003a.b(this.context).e(this.localBroadCastReceiver);
    }
}
