package ru.ozon.fintech.preferences.presentation.develop;

import B90.v0;
import P60.o;
import Sc.s;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$getInstalledBankApps$1", f = "FintechPreferencesViewModel.kt", l = {297}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96759d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0 f96760e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f96761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(v0 v0Var, long j11, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f96760e = v0Var;
        this.f96761f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f96760e, this.f96761f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        o oVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96759d;
        long j11 = this.f96761f;
        try {
            if (i11 == 0) {
                s.b(obj);
                oVar = this.f96760e.f3208j;
                this.f96759d = 1;
                obj = oVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            L80.a.a("InstalledBanksAppsBridgeInterface", "getInstalledBankApps executed in " + (System.currentTimeMillis() - j11) + " ms");
            StringBuilder sb2 = new StringBuilder("getInstalledBankApps result ");
            sb2.append((List) obj);
            L80.a.a("InstalledBanksAppsBridgeInterface", sb2.toString());
        } catch (Exception e11) {
            L80.a.b("InstalledBanksAppsBridgeInterface", "Error in getInstalledBankApps after " + (System.currentTimeMillis() - j11) + " ms: " + e11.getMessage());
        }
        return Unit.f71690a;
    }
}
