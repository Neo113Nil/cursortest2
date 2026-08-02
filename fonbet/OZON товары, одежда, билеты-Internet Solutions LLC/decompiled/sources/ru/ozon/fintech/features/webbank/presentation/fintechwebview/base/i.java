package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models.GoBackModel;
import ru.ozon.fintech.network.models.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$toolbarClose$1", f = "FintechWebViewViewModelBase.kt", l = {698}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96588d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f96589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(a aVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f96589e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f96589e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        int i11;
        String f7;
        int i12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f96588d;
        a aVar2 = this.f96589e;
        if (i13 == 0) {
            s.b(obj);
            J60.a c11 = aVar2.Y0().J().c();
            if (c11 != null) {
                String b11 = aVar2.S0().b();
                if (b11 == null) {
                    b11 = "";
                }
                GoBackModel goBackModel = new GoBackModel(b11);
                this.f96588d = 1;
                obj = c11.c(goBackModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            z11 = false;
            if (z11) {
                aVar2.f96479Q = 0;
            } else {
                i11 = aVar2.f96479Q;
                aVar2.f96479Q = i11 + 1;
                new Integer(i11);
            }
            f7 = aVar2.S0().f();
            if (f7 == null && f7.length() == 0) {
                Intrinsics.g(aVar2.W0(), "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Boolean?>");
                aVar2.W0().tryEmit(Boolean.FALSE);
            } else {
                if (!z11) {
                    i12 = aVar2.f96479Q;
                    if (i12 > 1) {
                        Intrinsics.g(aVar2.W0(), "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Boolean?>");
                        aVar2.W0().tryEmit(Boolean.FALSE);
                    }
                }
                if (z11 && (aVar2.f96460E instanceof a.C2102a)) {
                    Intrinsics.g(aVar2.W0(), "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Boolean?>");
                    aVar2.W0().tryEmit(Boolean.FALSE);
                } else if (!z11) {
                    aVar2.D1(aVar2.S0().f());
                }
            }
            return Unit.f71690a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((Boolean) obj).booleanValue()) {
            z11 = true;
            if (z11) {
            }
            f7 = aVar2.S0().f();
            if (f7 == null) {
            }
            if (!z11) {
            }
            if (z11) {
            }
            if (!z11) {
            }
            return Unit.f71690a;
        }
        z11 = false;
        if (z11) {
        }
        f7 = aVar2.S0().f();
        if (f7 == null) {
        }
        if (!z11) {
        }
        if (z11) {
        }
        if (!z11) {
        }
        return Unit.f71690a;
    }
}
