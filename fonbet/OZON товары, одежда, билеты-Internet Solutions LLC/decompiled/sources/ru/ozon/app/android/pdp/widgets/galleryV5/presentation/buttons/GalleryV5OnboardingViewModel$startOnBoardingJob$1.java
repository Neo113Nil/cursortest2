package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5ButtonsOnBoardingRepository;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5buttonsOnBoardingViewState;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel$startOnBoardingJob$1", f = "GalleryV5OnboardingViewModel.kt", l = {51, 55}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class GalleryV5OnboardingViewModel$startOnBoardingJob$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $days;
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GalleryV5OnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5OnboardingViewModel$startOnBoardingJob$1(GalleryV5OnboardingViewModel galleryV5OnboardingViewModel, String str, int i11, d<? super GalleryV5OnboardingViewModel$startOnBoardingJob$1> dVar) {
        super(2, dVar);
        this.this$0 = galleryV5OnboardingViewModel;
        this.$id = str;
        this.$days = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        GalleryV5OnboardingViewModel$startOnBoardingJob$1 galleryV5OnboardingViewModel$startOnBoardingJob$1 = new GalleryV5OnboardingViewModel$startOnBoardingJob$1(this.this$0, this.$id, this.$days, dVar);
        galleryV5OnboardingViewModel$startOnBoardingJob$1.L$0 = obj;
        return galleryV5OnboardingViewModel$startOnBoardingJob$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (xe.Y.b(1400, r6) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        GalleryV5ButtonsOnBoardingRepository galleryV5ButtonsOnBoardingRepository;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent;
        boolean z11;
        M m12;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent2;
        GalleryV5ButtonsOnBoardingRepository galleryV5ButtonsOnBoardingRepository2;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            galleryV5ButtonsOnBoardingRepository = this.this$0.buttonsOnBoardingRepository;
            if (galleryV5ButtonsOnBoardingRepository.canShown(this.$id, this.$days)) {
                z11 = this.this$0.wasShown;
                if (!z11) {
                    this.this$0.wasShown = true;
                    this.L$0 = m11;
                    this.label = 1;
                }
            }
            broadcastSingleLiveEvent = this.this$0._events;
            broadcastSingleLiveEvent.setValue(new GalleryV5buttonsOnBoardingViewState.Unsubscribe(this.$id));
            return Unit.f71690a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m12 = (M) this.L$0;
            s.b(obj);
            if (N.f(m12)) {
                galleryV5ButtonsOnBoardingRepository2 = this.this$0.buttonsOnBoardingRepository;
                galleryV5ButtonsOnBoardingRepository2.saveShowData(this.$id);
                broadcastSingleLiveEvent3 = this.this$0._events;
                broadcastSingleLiveEvent3.setValue(new GalleryV5buttonsOnBoardingViewState.Hide(this.$id));
            }
            return Unit.f71690a;
        }
        M m13 = (M) this.L$0;
        s.b(obj);
        m11 = m13;
        if (N.f(m11)) {
            broadcastSingleLiveEvent2 = this.this$0._events;
            broadcastSingleLiveEvent2.setValue(new GalleryV5buttonsOnBoardingViewState.Show(this.$id));
        }
        this.L$0 = m11;
        this.label = 2;
        if (Y.b(2600L, this) != aVar) {
            m12 = m11;
            if (N.f(m12)) {
            }
            return Unit.f71690a;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((GalleryV5OnboardingViewModel$startOnBoardingJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
