package nL;

import android.animation.ValueAnimator;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel.CarouselNaviBlockViewHolder;
import ru.ozon.fintech.ui.pinprogress.PinProgressView;

/* renamed from: nL.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8468a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76658c;

    public /* synthetic */ C8468a(int i11, Object obj, Object obj2) {
        this.f76656a = i11;
        this.f76657b = obj;
        this.f76658c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f76656a) {
            case 0:
                CarouselNaviBlockViewHolder.frameAnimation$lambda$2$lambda$0((CarouselNaviBlockViewHolder) this.f76657b, (ValueAnimator) this.f76658c, valueAnimator);
                break;
            default:
                PinProgressView.moveToCenterAnim$lambda$42$lambda$41((PinProgressView.DotState) this.f76657b, (PinProgressView) this.f76658c, valueAnimator);
                break;
        }
    }
}
