package iw;

import android.animation.ValueAnimator;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewController;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;

/* renamed from: iw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C7231a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68707b;

    public /* synthetic */ C7231a(Object obj, int i11) {
        this.f68706a = i11;
        this.f68707b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f68706a) {
            case 0:
                FakeSearchViewController.animateCornersChangeSticky$lambda$5$lambda$4((FakeSearchViewController) this.f68707b, valueAnimator);
                break;
            default:
                MobilizationTextInputLayout.riseHint$lambda$13$lambda$12((MobilizationTextInputLayout) this.f68707b, valueAnimator);
                break;
        }
    }
}
