package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.C4005g;
import Sc.s;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AppConfigTab;
import ru.ozon.fintech.settings.models.AuthPinpad;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$handleOnCreateSpecific$1", f = "FintechWebViewViewModelBase.kt", l = {830}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96567d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a f96568e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a f96569a;

        a(ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar) {
            this.f96569a = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.d(r2, (r5 == null || (r5 = r5.getAuthPinpad()) == null || (r5 = r5.getData()) == null || (r5 = r5.getLinks()) == null) ? null : r5.getRoot()) == false) goto L48;
         */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            AppConfig appConfig;
            String e11;
            AuthPinpad authPinpad;
            AuthPinpad.Data data;
            AuthPinpad.Links links;
            AppConfig appConfig2;
            AuthPinpad.Data data2;
            AuthPinpad.Links links2;
            List<AppConfigTab> tabs;
            AppConfig appConfig3 = (AppConfig) obj;
            ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar = this.f96569a;
            if (appConfig3 != null) {
                L80.a.a("TABSFLOW", "handleOnCreateSpecific  tab=" + aVar.S0().d());
                L80.a.a("TABSFLOW", "handleOnCreateSpecific " + aVar.S0().d() + " LOAD ALLappConfig.tabs.size=" + appConfig3.getTabs().size());
                if (aVar.S0().e() < appConfig3.getTabs().size()) {
                    AppConfigTab appConfigTab = (AppConfigTab) C7714v.Q(aVar.S0().e(), appConfig3.getTabs());
                    appConfig = aVar.f96509u0;
                    AppConfigTab appConfigTab2 = (appConfig == null || (tabs = appConfig.getTabs()) == null) ? null : (AppConfigTab) C7714v.Q(aVar.S0().e(), tabs);
                    if (Intrinsics.d(appConfigTab != null ? appConfigTab.getPath() : null, appConfigTab2 != null ? appConfigTab2.getPath() : null)) {
                        if (Intrinsics.d(appConfigTab != null ? appConfigTab.getId() : null, appConfigTab2 != null ? appConfigTab2.getId() : null)) {
                            AuthPinpad authPinpad2 = appConfig3.getAuthPinpad();
                            String root = (authPinpad2 == null || (data2 = authPinpad2.getData()) == null || (links2 = data2.getLinks()) == null) ? null : links2.getRoot();
                            appConfig2 = aVar.f96509u0;
                        }
                    }
                    AuthPinpad authPinpad3 = appConfig3.getAuthPinpad();
                    String root2 = (authPinpad3 == null || (data = authPinpad3.getData()) == null || (links = data.getLinks()) == null) ? null : links.getRoot();
                    if (aVar.S0().e() != 0 || (authPinpad = appConfig3.getAuthPinpad()) == null || !authPinpad.getShowPinpad() || root2 == null) {
                        e11 = U7.d.e(aVar.R0().f(), appConfigTab != null ? appConfigTab.getPath() : null);
                        root2 = null;
                    } else {
                        e11 = aVar.R0().f() + (appConfigTab != null ? appConfigTab.getPath() : null);
                        aVar.f96480R = null;
                        x0<String> L11 = aVar.Q0().L();
                        if (L11 != null) {
                            L11.setValue(null);
                        }
                    }
                    String id2 = appConfigTab != null ? appConfigTab.getId() : null;
                    aVar.O0().S1(id2);
                    A80.a a11 = A80.a.a(aVar.S0(), e11, root2, id2);
                    Intrinsics.checkNotNullParameter(a11, "<set-?>");
                    aVar.f96465G0 = a11;
                    L80.a.a("TABSFLOW", "handleOnCreateSpecific " + aVar.S0().d() + " LOAD ALL ACTUALL");
                    ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a.u0(aVar, appConfig3);
                }
            }
            aVar.f96509u0 = appConfig3;
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f96568e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f96568e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96567d;
        if (i11 == 0) {
            s.b(obj);
            ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar2 = this.f96568e;
            x0<AppConfig> o11 = aVar2.N0().o();
            a aVar3 = new a(aVar2);
            this.f96567d = 1;
            if (o11.collect(aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
