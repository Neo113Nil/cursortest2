package ru.ozon.app.android.network.initializers;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.C2862e;
import He.b;
import Ib.a;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.bank.externals.FintechAccountInitializerOzonId;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import xe.C10720e0;
import xe.N;
import xe.X0;
import zb0.f;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/network/initializers/OzonIdInitializerDelegate;", "", "LOb0/a;", "ozonIdAppApi", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "authEventsCollector", "LIb/a;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "cookieEventsLazy", "<init>", "(LOb0/a;Lru/ozon/app/android/account/authEvents/AuthEventsCollector;LIb/a;)V", "", "observeFintechBankWebViewCookie", "()V", "subscribeOnCookieEvents", "init", "LOb0/a;", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "LIb/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonIdInitializerDelegate {

    @NotNull
    private final AuthEventsCollector authEventsCollector;

    @NotNull
    private final a<OzonIdCookieEvents> cookieEventsLazy;

    @NotNull
    private final Ob0.a ozonIdAppApi;

    public OzonIdInitializerDelegate(@NotNull Ob0.a ozonIdAppApi, @NotNull AuthEventsCollector authEventsCollector, @NotNull a<OzonIdCookieEvents> cookieEventsLazy) {
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        Intrinsics.checkNotNullParameter(authEventsCollector, "authEventsCollector");
        Intrinsics.checkNotNullParameter(cookieEventsLazy, "cookieEventsLazy");
        this.ozonIdAppApi = ozonIdAppApi;
        this.authEventsCollector = authEventsCollector;
        this.cookieEventsLazy = cookieEventsLazy;
    }

    private final void observeFintechBankWebViewCookie() {
        FintechAccountInitializerOzonId.INSTANCE.setObserveCookieChanged(new OzonIdInitializerDelegate$observeFintechBankWebViewCookie$1(this));
    }

    private final void subscribeOnCookieEvents() {
        Set h11 = e0.h("apparelSelectedTab");
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(b.f10879b.plus(X0.b()));
        final InterfaceC2395h<f> flow = this.cookieEventsLazy.get().getFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<f>() { // from class: ru.ozon.app.android.network.initializers.OzonIdInitializerDelegate$subscribeOnCookieEvents$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.network.initializers.OzonIdInitializerDelegate$subscribeOnCookieEvents$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.network.initializers.OzonIdInitializerDelegate$subscribeOnCookieEvents$$inlined$filter$1$2", f = "OzonIdInitializerDelegate.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.network.initializers.OzonIdInitializerDelegate$subscribeOnCookieEvents$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes12.dex */
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
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((f) obj).a().a() == f.b.Logout) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super f> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new OzonIdInitializerDelegate$subscribeOnCookieEvents$2(this, h11, null)), a11);
    }

    public final void init() {
        try {
            this.authEventsCollector.collect();
            observeFintechBankWebViewCookie();
            subscribeOnCookieEvents();
        } catch (Throwable th2) {
            Lm0.a.f17149a.e(th2);
            BxLogger.INSTANCE.logException(th2);
        }
    }
}
