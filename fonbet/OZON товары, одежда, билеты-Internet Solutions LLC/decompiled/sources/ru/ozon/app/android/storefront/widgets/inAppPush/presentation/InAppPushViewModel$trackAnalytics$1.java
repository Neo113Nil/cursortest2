package ru.ozon.app.android.storefront.widgets.inAppPush.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.widgets.inAppPush.pixelAnalytics.InAppPushPixelApiRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.inAppPush.presentation.InAppPushViewModel$trackAnalytics$1", f = "InAppPushViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InAppPushViewModel$trackAnalytics$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $pixelUrl;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InAppPushViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPushViewModel$trackAnalytics$1(InAppPushViewModel inAppPushViewModel, String str, d<? super InAppPushViewModel$trackAnalytics$1> dVar) {
        super(2, dVar);
        this.this$0 = inAppPushViewModel;
        this.$pixelUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        InAppPushViewModel$trackAnalytics$1 inAppPushViewModel$trackAnalytics$1 = new InAppPushViewModel$trackAnalytics$1(this.this$0, this.$pixelUrl, dVar);
        inAppPushViewModel$trackAnalytics$1.L$0 = obj;
        return inAppPushViewModel$trackAnalytics$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InAppPushPixelApiRepository inAppPushPixelApiRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                InAppPushViewModel inAppPushViewModel = this.this$0;
                String str = this.$pixelUrl;
                r.Companion companion = r.INSTANCE;
                inAppPushPixelApiRepository = inAppPushViewModel.analyticsRepo;
                this.label = 1;
                if (inAppPushPixelApiRepository.track(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            Unit unit = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            s.a(th2);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InAppPushViewModel$trackAnalytics$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
