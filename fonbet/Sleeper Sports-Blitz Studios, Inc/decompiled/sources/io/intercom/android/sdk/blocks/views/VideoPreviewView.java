package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* loaded from: classes9.dex */
public class VideoPreviewView extends RelativeLayout {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 48;
    private final ProgressBar loadingSpinner;
    private final ImageView playButton;
    private final ImageView thumbnailImageView;

    public VideoPreviewView(Context context, Provider<AppConfig> provider, StyleType styleType) {
        super(context);
        BlockUtils.createLayoutParams(this, -2, -2);
        BlockUtils.setDefaultMarginBottom(this);
        ImageView videoImageView = getVideoImageView(context);
        this.thumbnailImageView = videoImageView;
        ImageView playButtonView = getPlayButtonView(context);
        this.playButton = playButtonView;
        ProgressBar loadingSpinner = getLoadingSpinner();
        this.loadingSpinner = loadingSpinner;
        addView(videoImageView);
        addView(playButtonView);
        addView(loadingSpinner);
        int primaryColor = provider.get().getPrimaryColor();
        primaryColor = styleType == StyleType.POST ? ColorUtils.lightenColor(primaryColor) : primaryColor;
        if (ColorUtils.isColorLight(primaryColor)) {
            playButtonView.setColorFilter(ContextCompat.getColor(context, R.color.intercom_accessibility_black), PorterDuff.Mode.SRC_ATOP);
        } else {
            playButtonView.setColorFilter(primaryColor, PorterDuff.Mode.SRC_ATOP);
        }
        AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement(this);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(playButtonView);
    }

    public ImageView getThumbnailImageView() {
        return this.thumbnailImageView;
    }

    public void displayThumbnail(String str) {
        this.loadingSpinner.setVisibility(0);
        this.thumbnailImageView.setVisibility(4);
        IntercomCoilKt.loadIntercomImage(getContext(), new ImageRequest.Builder(getContext()).data(str).placeholder(R.drawable.intercom_video_thumbnail_fallback).error(R.drawable.intercom_video_thumbnail_fallback).crossfade(true).target(this.thumbnailImageView).listener(new ImageRequest.Listener() { // from class: io.intercom.android.sdk.blocks.views.VideoPreviewView.1
            @Override // coil.request.ImageRequest.Listener
            public void onCancel(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
                VideoPreviewView.this.loadingSpinner.setVisibility(8);
                VideoPreviewView.this.thumbnailImageView.setVisibility(0);
                VideoPreviewView.this.updateThumbnailAspectRatio();
                VideoPreviewView.this.playButton.setVisibility(8);
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
                VideoPreviewView.this.loadingSpinner.setVisibility(8);
                VideoPreviewView.this.thumbnailImageView.setVisibility(0);
                VideoPreviewView.this.updateThumbnailAspectRatio();
                VideoPreviewView.this.thumbnailImageView.setColorFilter(ContextCompat.getColor(VideoPreviewView.this.thumbnailImageView.getContext(), R.color.intercom_semi_transparent), PorterDuff.Mode.DARKEN);
                VideoPreviewView.this.playButton.setVisibility(0);
            }
        }).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateThumbnailAspectRatio() {
        this.thumbnailImageView.getLayoutParams().height = (this.thumbnailImageView.getWidth() * 3) / 4;
    }

    /* renamed from: lambda$showFailedImage$0$io-intercom-android-sdk-blocks-views-VideoPreviewView, reason: not valid java name */
    /* synthetic */ void m12000xcd4d94f2() {
        BackgroundUtils.setBackground(this.thumbnailImageView, ContextCompat.getDrawable(getContext(), R.drawable.intercom_video_thumbnail_fallback));
    }

    public void showFailedImage() {
        this.thumbnailImageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.views.VideoPreviewView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VideoPreviewView.this.m12000xcd4d94f2();
            }
        });
    }

    private ImageView getPlayButtonView(Context context) {
        int dpToPx = ScreenUtils.dpToPx(48.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(R.drawable.intercom_solid_circle);
        imageView.setVisibility(8);
        imageView.setId(R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(imageView);
        return imageView;
    }

    private ImageView getVideoImageView(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setId(R.id.intercom_video_thumbnail);
        return imageView;
    }

    private ProgressBar getLoadingSpinner() {
        return (ProgressBar) inflate(getContext(), R.layout.intercom_progress_bar, null).findViewById(R.id.progressBar);
    }
}
