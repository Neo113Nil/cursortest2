package io.intercom.android.sdk.lightbox;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import coil.request.ImageRequest;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.IntercomCoilKt;

/* loaded from: classes9.dex */
public class LightBoxActivity extends AppCompatActivity implements LightBoxListener {
    private static final int ANIMATION_TIME_MS = 300;
    private static final String EXTRA_ACTIVITY_FULLSCREEN = "extra_activity_fullscreen";
    private static final String EXTRA_IMAGE_URL = "extra_image_url";
    public static final String TRANSITION_KEY = "lightbox_image";
    private String imageUrl = "";
    ViewGroup rootView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.imageUrl = extras.getString(EXTRA_IMAGE_URL, "");
            if (extras.getBoolean(EXTRA_ACTIVITY_FULLSCREEN, false)) {
                requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.intercom_activity_lightbox);
        this.rootView = (ViewGroup) findViewById(R.id.root_view);
        LightBoxImageView lightBoxImageView = (LightBoxImageView) findViewById(R.id.full_image);
        lightBoxImageView.setTransitionName(TRANSITION_KEY);
        loadImage(lightBoxImageView);
        reloadAfterTransition(lightBoxImageView);
        lightBoxImageView.setLightBoxListener(this);
        fadeIn();
    }

    private void reloadAfterTransition(final LightBoxImageView lightBoxImageView) {
        getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                new Handler().postDelayed(new Runnable() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LightBoxActivity.this.loadImage(lightBoxImageView);
                    }
                }, 10L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImage(ImageView imageView) {
        IntercomCoilKt.loadIntercomImage(imageView.getContext(), new ImageRequest.Builder(imageView.getContext()).data(this.imageUrl).crossfade(true).error(R.drawable.intercom_image_load_failed).target(imageView).build());
    }

    private void fadeIn() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(ContextCompat.getColor(this, R.color.intercom_full_transparent_full_black)), Integer.valueOf(ContextCompat.getColor(this, R.color.intercom_transparent_black_lightbox)));
        ofObject.setDuration(300L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    private void fadeOut() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(ContextCompat.getColor(this, R.color.intercom_transparent_black_lightbox)), Integer.valueOf(ContextCompat.getColor(this, R.color.intercom_full_transparent_full_black)));
        ofObject.setDuration(300L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    public static Intent imageIntent(Context context, String str, boolean z) {
        return new Intent(context, (Class<?>) LightBoxActivity.class).putExtra(EXTRA_IMAGE_URL, str).putExtra(EXTRA_ACTIVITY_FULLSCREEN, z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        closeLightBox();
    }

    @Override // io.intercom.android.sdk.lightbox.LightBoxListener
    public void closeLightBox() {
        fadeOut();
        supportFinishAfterTransition();
    }
}
