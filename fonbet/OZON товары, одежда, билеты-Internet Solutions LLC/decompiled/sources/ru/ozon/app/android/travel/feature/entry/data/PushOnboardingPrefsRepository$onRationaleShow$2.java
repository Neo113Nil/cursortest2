package ru.ozon.app.android.travel.feature.entry.data;

import Sc.s;
import Wc.a;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.data.PushOnboardingPrefsRepository$onRationaleShow$2", f = "PushOnboardingPrefsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushOnboardingPrefsRepository$onRationaleShow$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ PushOnboardingPrefsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushOnboardingPrefsRepository$onRationaleShow$2(PushOnboardingPrefsRepository pushOnboardingPrefsRepository, d<? super PushOnboardingPrefsRepository$onRationaleShow$2> dVar) {
        super(2, dVar);
        this.this$0 = pushOnboardingPrefsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PushOnboardingPrefsRepository$onRationaleShow$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        sharedPreferences = this.this$0.sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("notification_rationale", true);
        edit.apply();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PushOnboardingPrefsRepository$onRationaleShow$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
