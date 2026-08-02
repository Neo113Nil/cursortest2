package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* loaded from: classes9.dex */
abstract class ChatNotification extends InAppNotification {
    private static final int ANIMATION_DURATION = 170;
    private static final int GROWTH_WIDTH = 355;

    protected abstract View getContentContainer();

    protected abstract ViewGroup inflateChatRootView(ViewGroup viewGroup, LayoutInflater layoutInflater);

    abstract void populateViewsWithData();

    protected abstract void updateContentContainer(Part part);

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected abstract void updateViewDataDuringReplyPulse(int i);

    protected ChatNotification(Context context, Conversation conversation, int i, int i2, InAppNotification.Listener listener, Provider<AppConfig> provider) {
        super(context, conversation, i, i2, listener, provider);
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, int i) {
        if (this.overlayRoot == null) {
            this.overlayRoot = inflateChatRootView(viewGroup, layoutInflater);
        }
        if (!isAttached()) {
            viewGroup.addView(this.overlayRoot, 0);
        }
        if (this.bottomPadding != i) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin + this.overlayRoot.getResources().getDimensionPixelSize(R.dimen.intercom_bottom_padding) + i);
            this.overlayRoot.setLayoutParams(layoutParams);
            this.bottomPadding = i;
        }
        populateViewsWithData();
        this.overlayRoot.setVisibility(0);
        beginListeningForTouchEvents();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected void onNotificationPressed(View view) {
        view.animate().scaleX(0.9f).scaleY(0.9f).alpha(0.9f).setDuration(50L).start();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    protected void onNotificationReleased(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(50L).start();
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification
    public void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        this.position++;
        animateToPosition(viewGroup.getContext());
        expandChat(viewGroup, animatorListenerAdapter);
    }

    private void expandChat(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.chathead_text_container);
        if (viewGroup2 == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.chathead_text_header);
        View contentContainer = getContentContainer();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
        View findViewById = viewGroup.findViewById(R.id.chat_avatar_container);
        float translationX = findViewById.getTranslationX();
        float translationY = findViewById.getTranslationY();
        ObjectAnimator.ofPropertyValuesHolder(findViewById, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.8f), PropertyValuesHolder.ofFloat("translationX", translationX, 100.0f + translationX), PropertyValuesHolder.ofFloat("translationY", translationY, translationY - 40.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.8f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.8f)).setDuration(170L).start();
        ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(170L).start();
        ObjectAnimator.ofFloat(contentContainer, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(170L).start();
        getWidthAnimator(viewGroup2, animatorListenerAdapter).start();
        getWidthAnimator(this.overlayRoot).start();
        getMarginAnimator(viewGroup2, marginLayoutParams).start();
    }

    private Animator getMarginAnimator(final ViewGroup viewGroup, ViewGroup.MarginLayoutParams marginLayoutParams) {
        ValueAnimator ofInt = ValueAnimator.ofInt(marginLayoutParams.leftMargin, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.ChatNotification.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams2.leftMargin = intValue;
                viewGroup.setLayoutParams(marginLayoutParams2);
            }
        });
        ofInt.setDuration(170L);
        return ofInt;
    }

    private Animator getWidthAnimator(ViewGroup viewGroup, final Animator.AnimatorListener animatorListener) {
        final int abs = Math.abs(viewGroup.getMeasuredWidth() - ScreenUtils.dpToPx(355.0f, viewGroup.getContext()));
        ValueAnimator widthAnimator = getWidthAnimator(viewGroup);
        widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.ChatNotification.2
            boolean hasSentUpdate = false;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = abs;
                if ((i > 0 ? 100 * (intValue / i) : 100) <= 80 || this.hasSentUpdate) {
                    return;
                }
                this.hasSentUpdate = true;
                animatorListener.onAnimationEnd(null);
            }
        });
        return widthAnimator;
    }

    private ValueAnimator getWidthAnimator(final ViewGroup viewGroup) {
        ValueAnimator ofInt = ValueAnimator.ofInt(viewGroup.getMeasuredWidth(), ScreenUtils.dpToPx(355.0f, viewGroup.getContext()));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.ChatNotification.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.width = intValue;
                viewGroup.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(170L);
        return ofInt;
    }
}
