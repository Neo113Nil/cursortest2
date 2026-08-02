package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.os.d;
import androidx.fragment.app.C5402x;
import kotlin.Metadata;
import kotlin.Pair;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingResultState;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "<unused var>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OnBoardingDialog$bind$1$2$3 implements View.OnTouchListener {
    final /* synthetic */ OnBoardingDialog this$0;

    OnBoardingDialog$bind$1$2$3(OnBoardingDialog onBoardingDialog) {
        this.this$0 = onBoardingDialog;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        C5402x.a(d.b(new Pair("onBoardingState", new OnBoardingResultState.Tap(motionEvent.getX(), motionEvent.getY()))), this.this$0, "OnboardingResultFragment");
        this.this$0.dismissAllowingStateLoss();
        return false;
    }
}
