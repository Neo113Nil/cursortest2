package ru.ozon.app.android.common.serviceCarousel.presentation.onboarding;

import Sc.s;
import Wc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.E0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.OnboardingHelperDelegate$show$1", f = "OnboardingHelperDelegate.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OnboardingHelperDelegate$show$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ServiceCarouselVO $vo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OnboardingHelperDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingHelperDelegate$show$1(OnboardingHelperDelegate onboardingHelperDelegate, ServiceCarouselVO serviceCarouselVO, d<? super OnboardingHelperDelegate$show$1> dVar) {
        super(2, dVar);
        this.this$0 = onboardingHelperDelegate;
        this.$vo = serviceCarouselVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        OnboardingHelperDelegate$show$1 onboardingHelperDelegate$show$1 = new OnboardingHelperDelegate$show$1(this.this$0, this.$vo, dVar);
        onboardingHelperDelegate$show$1.L$0 = obj;
        return onboardingHelperDelegate$show$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r6 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        if (xe.Y.b(500, r5) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        ComposerReferences composerReferences;
        List<ComponentCallbacksC5392m> r02;
        Object showOnboarding;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            this.L$0 = m11;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        E0.f(m11.getCoroutineContext());
        composerReferences = this.this$0.refs;
        G d11 = composerReferences.getContainer().d();
        if (d11 != null && (r02 = d11.r0()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : r02) {
                if (obj2 instanceof BottomSheetComposerFragment) {
                    arrayList.add(obj2);
                }
            }
            OnboardingHelperDelegate onboardingHelperDelegate = this.this$0;
            ServiceCarouselVO serviceCarouselVO = this.$vo;
            if (arrayList.isEmpty()) {
                this.L$0 = null;
                this.label = 2;
                showOnboarding = onboardingHelperDelegate.showOnboarding(serviceCarouselVO, this);
            } else {
                onboardingHelperDelegate.listenDialogToClose((BottomSheetComposerFragment) arrayList.get(0), serviceCarouselVO);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OnboardingHelperDelegate$show$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
