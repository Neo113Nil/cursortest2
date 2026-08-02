package ru.ozon.app.android.account.locale.app.data;

import Ae.B0;
import Ae.C2399j;
import Cb0.g;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.flags.ShouldLogUnsupportedLanguage;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryImpl$collectNetworkCookieEvents$1", f = "AppLocaleRepositoryImpl.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AppLocaleRepositoryImpl$collectNetworkCookieEvents$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppLocaleRepositoryImpl this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCb0/g;", "event", "", "<anonymous>", "(LCb0/g;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryImpl$collectNetworkCookieEvents$1$1", f = "AppLocaleRepositoryImpl.kt", l = {201}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryImpl$collectNetworkCookieEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<g, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AppLocaleRepositoryImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AppLocaleRepositoryImpl appLocaleRepositoryImpl, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = appLocaleRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(g gVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(gVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean isAvailableAndRequireLanguage;
            FeatureService featureService;
            Object applicationLocaleLocal;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                g gVar = (g) this.L$0;
                if (gVar instanceof g.a) {
                    this.this$0.updateLocaleInCookie();
                } else {
                    if (!(gVar instanceof g.b)) {
                        throw new o();
                    }
                    g.b bVar = (g.b) gVar;
                    isAvailableAndRequireLanguage = this.this$0.isAvailableAndRequireLanguage(bVar.b(), bVar.a());
                    if (isAvailableAndRequireLanguage) {
                        AppLocaleRepositoryImpl appLocaleRepositoryImpl = this.this$0;
                        String a11 = bVar.a();
                        this.label = 1;
                        applicationLocaleLocal = appLocaleRepositoryImpl.setApplicationLocaleLocal(a11, this);
                        if (applicationLocaleLocal == aVar) {
                            return aVar;
                        }
                    } else {
                        featureService = this.this$0.featureService;
                        if (featureService.getBooleanKey(ShouldLogUnsupportedLanguage.INSTANCE)) {
                            this.this$0.logInvalidLocalization(bVar);
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppLocaleRepositoryImpl$collectNetworkCookieEvents$1(AppLocaleRepositoryImpl appLocaleRepositoryImpl, d<? super AppLocaleRepositoryImpl$collectNetworkCookieEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = appLocaleRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppLocaleRepositoryImpl$collectNetworkCookieEvents$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ob0.a aVar;
        a aVar2 = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.ozonIdAppApi;
            B0<g> events = aVar.L().getEvents();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C2399j.h(events, anonymousClass1, this) == aVar2) {
                return aVar2;
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
        return ((AppLocaleRepositoryImpl$collectNetworkCookieEvents$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
