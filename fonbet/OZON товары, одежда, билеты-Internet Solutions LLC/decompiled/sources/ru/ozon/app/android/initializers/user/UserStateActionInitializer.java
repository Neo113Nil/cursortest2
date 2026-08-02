package ru.ozon.app.android.initializers.user;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.C2862e;
import Sc.s;
import Wc.a;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.csma.flags.OzonSentryHelperEnabledFlag;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/initializers/user/UserStateActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "userManager", "Lru/ozon/app/android/account/user/UserManager;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/account/user/UserManager;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserStateActionInitializer implements ActionInitializer {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final UserManager userManager;

    public UserStateActionInitializer(@NotNull UserManager userManager, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.userManager = userManager;
        this.featureChecker = featureChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object init$setUserId(BxLogger bxLogger, String str, d dVar) {
        bxLogger.setUserId(str);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    @SuppressLint({"CheckResult"})
    public void init() {
        if (this.featureChecker.isEnabled(OzonSentryHelperEnabledFlag.INSTANCE)) {
            return;
        }
        C2862e a11 = N.a(X0.b());
        final InterfaceC2395h<Long> userIdFlow = this.userManager.getUserIdFlow();
        C2399j.C(new C(new C2408n0(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.initializers.user.UserStateActionInitializer$init$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.initializers.user.UserStateActionInitializer$init$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.initializers.user.UserStateActionInitializer$init$$inlined$map$1$2", f = "UserStateActionInitializer.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.initializers.user.UserStateActionInitializer$init$$inlined$map$1$2$1, reason: invalid class name */
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
                                long longValue = ((Number) obj).longValue();
                                String valueOf = longValue == 0 ? null : String.valueOf(longValue);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(valueOf, anonymousClass1) == aVar) {
                                    return aVar;
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
            public Object collect(InterfaceC2397i<? super String> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new UserStateActionInitializer$init$2(BxLogger.INSTANCE)), new UserStateActionInitializer$init$3(null)), a11);
    }
}
