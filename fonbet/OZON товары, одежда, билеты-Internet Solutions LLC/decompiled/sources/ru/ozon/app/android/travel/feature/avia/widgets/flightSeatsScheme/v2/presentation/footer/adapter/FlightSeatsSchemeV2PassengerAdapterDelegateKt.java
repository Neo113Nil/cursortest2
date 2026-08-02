package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter;

import TM.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengerAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2PassengerTabView;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a_\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010!\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b!\u0010\"\u001a3\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030%H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020*2\u0006\u0010$\u001a\u00020*2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00030%H\u0002¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0001H\u0002¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "", "onPassengerSelected", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "flightSeatsSchemeV2PassengerAdapterDelegate", "(Lkotlin/jvm/functions/Function2;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;", "view", "Landroid/view/animation/Interpolator;", "changeInterpolator", "oldPassenger", "newPassenger", "updateTabColors", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;Landroid/view/animation/Interpolator;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "oldSeat", "newSeat", "updateSelectedSeat", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;Landroid/view/animation/Interpolator;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;)V", "fromBackgroundColor", "toBackgroundColor", "fromTextColor", "toTextColor", "fromSeatBackgroundColor", "toSeatBackgroundColor", "fromSeatTextColor", "toSeatTextColor", "Landroid/animation/Animator;", "colorAnimator", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/animation/Animator;", "seatSelectionAnimator", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;)Landroid/animation/Animator;", "from", "to", "Lkotlin/Function1;", "update", "Landroid/animation/ValueAnimator;", "intAnimator", "(IILkotlin/jvm/functions/Function1;)Landroid/animation/ValueAnimator;", "", "alphaAnimator", "(FFLkotlin/jvm/functions/Function1;)Landroid/animation/ValueAnimator;", "Landroid/view/View;", "newWidth", "updateWidth", "(Landroid/view/View;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2PassengerAdapterDelegateKt {
    private static final ValueAnimator alphaAnimator(float f7, float f11, Function1<? super Float, Unit> function1) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f11);
        ofFloat.addUpdateListener(new b(function1, 0));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alphaAnimator$lambda$10$lambda$9(Function1 function1, ValueAnimator valueAnimator) {
        function1.invoke((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float"));
    }

    private static final Animator colorAnimator(FlightSeatsSchemeV2PassengerTabView flightSeatsSchemeV2PassengerTabView, int i11, int i12, int i13, int i14, Integer num, Integer num2, Integer num3, Integer num4) {
        ArrayList m02 = C7714v.m0(intAnimator(i11, i12, new FlightSeatsSchemeV2PassengerAdapterDelegateKt$colorAnimator$animators$1(flightSeatsSchemeV2PassengerTabView)), intAnimator(i13, i14, new FlightSeatsSchemeV2PassengerAdapterDelegateKt$colorAnimator$animators$2(flightSeatsSchemeV2PassengerTabView)));
        if (num != null && num3 != null && num2 != null && num4 != null) {
            m02.add(intAnimator(num.intValue(), num2.intValue(), new FlightSeatsSchemeV2PassengerAdapterDelegateKt$colorAnimator$1(flightSeatsSchemeV2PassengerTabView)));
            m02.add(intAnimator(num3.intValue(), num4.intValue(), new FlightSeatsSchemeV2PassengerAdapterDelegateKt$colorAnimator$2(flightSeatsSchemeV2PassengerTabView)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m02);
        return animatorSet;
    }

    @NotNull
    public static final AdapterDelegate<List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI>> flightSeatsSchemeV2PassengerAdapterDelegate(@NotNull Function2<? super Integer, ? super FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, Unit> onPassengerSelected) {
        Intrinsics.checkNotNullParameter(onPassengerSelected, "onPassengerSelected");
        return new DslViewBindingListAdapterDelegate(FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$1.INSTANCE, FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$2(onPassengerSelected), FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }

    private static final ValueAnimator intAnimator(int i11, int i12, final Function1<? super Integer, Unit> function1) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11, i12);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: TM.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FlightSeatsSchemeV2PassengerAdapterDelegateKt.intAnimator$lambda$8$lambda$7(Function1.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofArgb, "apply(...)");
        return ofArgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void intAnimator$lambda$8$lambda$7(Function1 function1, ValueAnimator valueAnimator) {
        function1.invoke((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int"));
    }

    private static final Animator seatSelectionAnimator(final FlightSeatsSchemeV2PassengerTabView flightSeatsSchemeV2PassengerTabView, final FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI, final FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI2) {
        boolean z11 = (selectedSeatV2VI == null && selectedSeatV2VI2 != null) || (selectedSeatV2VI != null && selectedSeatV2VI2 == null);
        int width = flightSeatsSchemeV2PassengerTabView.getWidth();
        int height = flightSeatsSchemeV2PassengerTabView.getHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        flightSeatsSchemeV2PassengerTabView.bindSeat(selectedSeatV2VI2);
        flightSeatsSchemeV2PassengerTabView.measure(makeMeasureSpec, makeMeasureSpec2);
        ValueAnimator intAnimator = intAnimator(width, flightSeatsSchemeV2PassengerTabView.getMeasuredWidth(), new FlightSeatsSchemeV2PassengerAdapterDelegateKt$seatSelectionAnimator$widthAnimator$1(flightSeatsSchemeV2PassengerTabView));
        intAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengerAdapterDelegateKt$seatSelectionAnimator$widthAnimator$2$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
                FlightSeatsSchemeV2PassengerTabView.this.bindSeat(selectedSeatV2VI2);
                FlightSeatsSchemeV2PassengerAdapterDelegateKt.updateWidth(FlightSeatsSchemeV2PassengerTabView.this, -2);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                FlightSeatsSchemeV2PassengerTabView.this.bindSeat(selectedSeatV2VI);
            }
        });
        if (z11) {
            return intAnimator;
        }
        ValueAnimator alphaAnimator = alphaAnimator(1.0f, 0.0f, new FlightSeatsSchemeV2PassengerAdapterDelegateKt$seatSelectionAnimator$fadeOut$1(flightSeatsSchemeV2PassengerTabView));
        ValueAnimator alphaAnimator2 = alphaAnimator(0.0f, 1.0f, new FlightSeatsSchemeV2PassengerAdapterDelegateKt$seatSelectionAnimator$fadeIn$1(flightSeatsSchemeV2PassengerTabView));
        alphaAnimator2.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengerAdapterDelegateKt$seatSelectionAnimator$fadeIn$2$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
                FlightSeatsSchemeV2PassengerTabView.this.setIndicatorAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                FlightSeatsSchemeV2PassengerTabView.this.bindSeat(selectedSeatV2VI2);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(alphaAnimator, alphaAnimator2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(intAnimator, animatorSet);
        return animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSelectedSeat(FlightSeatsSchemeV2PassengerTabView flightSeatsSchemeV2PassengerTabView, Interpolator interpolator, FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI, FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeatV2VI2) {
        Animator seatSelectionAnimator = seatSelectionAnimator(flightSeatsSchemeV2PassengerTabView, selectedSeatV2VI, selectedSeatV2VI2);
        seatSelectionAnimator.setInterpolator(interpolator);
        seatSelectionAnimator.setDuration(200L);
        seatSelectionAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTabColors(FlightSeatsSchemeV2PassengerTabView flightSeatsSchemeV2PassengerTabView, Interpolator interpolator, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI2) {
        if (passengerV2VI == null) {
            flightSeatsSchemeV2PassengerTabView.bind(passengerV2VI2);
            return;
        }
        int backgroundColor = passengerV2VI.getBackgroundColor();
        int backgroundColor2 = passengerV2VI2.getBackgroundColor();
        int textColor = passengerV2VI.getTextColor();
        int textColor2 = passengerV2VI2.getTextColor();
        FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeat = passengerV2VI.getSelectedSeat();
        Integer valueOf = selectedSeat != null ? Integer.valueOf(selectedSeat.getBackgroundColor()) : null;
        FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeat2 = passengerV2VI2.getSelectedSeat();
        Integer valueOf2 = selectedSeat2 != null ? Integer.valueOf(selectedSeat2.getBackgroundColor()) : null;
        FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeat3 = passengerV2VI.getSelectedSeat();
        Integer valueOf3 = selectedSeat3 != null ? Integer.valueOf(selectedSeat3.getTextColor()) : null;
        FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeat4 = passengerV2VI2.getSelectedSeat();
        Animator colorAnimator = colorAnimator(flightSeatsSchemeV2PassengerTabView, backgroundColor, backgroundColor2, textColor, textColor2, valueOf, valueOf2, valueOf3, selectedSeat4 != null ? Integer.valueOf(selectedSeat4.getTextColor()) : null);
        colorAnimator.setInterpolator(interpolator);
        colorAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWidth(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i11;
        view.setLayoutParams(layoutParams);
    }
}
