package y70;

import Sc.s;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.settings.models.FeatureValue;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$updateAdvertisementText$1", f = "OnboardingViewModel.kt", l = {351, 352}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f106251d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f106252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f fVar, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f106252e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f106252e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        if (xe.Y.b(9000, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        List<String> stringArrayData;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f106251d;
        f fVar = this.f106252e;
        if (i11 == 0) {
            s.b(obj);
            this.f106251d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                FeatureValue featureValue = (FeatureValue) obj;
                Set<String> Y02 = (featureValue == null || (stringArrayData = featureValue.getStringArrayData()) == null) ? null : C7714v.Y0(stringArrayData);
                sharedPreferences = fVar.f106212c;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putStringSet("SP_SAVED_ONBOARDING_TEXT", Y02);
                edit.commit();
                return Unit.f71690a;
            }
            s.b(obj);
        }
        Q90.c cVar = fVar.f106216g;
        S90.d dVar = S90.d.MOB_ONBOARDING_TEXT;
        this.f106251d = 2;
        obj = cVar.u(dVar, this);
    }
}
