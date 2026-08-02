package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.conversation.UploadProgressListener;
import io.intercom.android.sdk.logger.LumberMill;

/* loaded from: classes9.dex */
public class ProgressLinearLayout extends LinearLayout implements UploadProgressListener {
    ImageView attachmentIcon;
    private final Twig twig;
    UploadProgressBar uploadProgressBar;

    public ProgressLinearLayout(Context context) {
        this(context, null);
    }

    public ProgressLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.twig = LumberMill.getLogger();
    }

    public void setUploadProgressBar(UploadProgressBar uploadProgressBar) {
        this.uploadProgressBar = uploadProgressBar;
    }

    public void setAttachmentIcon(ImageView imageView) {
        this.attachmentIcon = imageView;
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStarted() {
        this.uploadProgressBar.smoothStartAnimation();
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadNotice(final byte b) {
        this.twig.internal("progress", "" + ((int) b));
        post(new Runnable() { // from class: io.intercom.android.sdk.views.ProgressLinearLayout.1
            @Override // java.lang.Runnable
            public void run() {
                if (ProgressLinearLayout.this.uploadProgressBar != null) {
                    ProgressLinearLayout.this.uploadProgressBar.setProgress(b);
                }
            }
        });
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadSmoothEnd() {
        post(new Runnable() { // from class: io.intercom.android.sdk.views.ProgressLinearLayout.2
            @Override // java.lang.Runnable
            public void run() {
                if (ProgressLinearLayout.this.uploadProgressBar != null) {
                    ProgressLinearLayout.this.uploadProgressBar.smoothEndAnimation(new Animator.AnimatorListener() { // from class: io.intercom.android.sdk.views.ProgressLinearLayout.2.1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            ProgressLinearLayout.this.uploadProgressBar.hideBar();
                            if (ProgressLinearLayout.this.attachmentIcon != null) {
                                ProgressLinearLayout.this.attachmentIcon.setVisibility(0);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ProgressLinearLayout.this.attachmentIcon, "alpha", 0.0f, 1.0f);
                                ofFloat.setDuration(300L);
                                ofFloat.setInterpolator(new DecelerateInterpolator());
                                ofFloat.start();
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStopped() {
        this.uploadProgressBar.hideBar();
    }
}
