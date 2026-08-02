package ru.ozon.fintech.ui.pinprogress;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f97085b;

    public /* synthetic */ h(View view, int i11) {
        this.f97084a = i11;
        this.f97085b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f97084a) {
            case 0:
                PinProgressView.playLoaderAnimation$lambda$32$lambda$31((PinProgressView) this.f97085b, valueAnimator);
                break;
            default:
                SearchFormV5LocationsView.fadeTextAnimator$lambda$32$lambda$31((TextAtomV2View) this.f97085b, valueAnimator);
                break;
        }
    }
}
