package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalViewModel$processAction$1", f = "TopTravelModalViewModel.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TopTravelModalViewModel$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ TopTravelModalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopTravelModalViewModel$processAction$1(TopTravelModalViewModel topTravelModalViewModel, String str, Map<String, String> map, d<? super TopTravelModalViewModel$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = topTravelModalViewModel;
        this.$actionName = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TopTravelModalViewModel$processAction$1(this.this$0, this.$actionName, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        TravelCommonCompletableApi travelCommonCompletableApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                TopTravelModalViewModel topTravelModalViewModel = this.this$0;
                String str = this.$actionName;
                Map<String, String> map = this.$params;
                r.Companion companion = r.INSTANCE;
                travelCommonCompletableApi = topTravelModalViewModel.api;
                if (map == null) {
                    map = U.c();
                }
                this.label = 1;
                if (travelCommonCompletableApi.performCompletableAction(str, map, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TopTravelModalViewModel$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
