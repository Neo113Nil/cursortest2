package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import coil.decode.GifDecoder;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.transform.RoundedCornersTransformation;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.coil.GrayscaleTransformation;
import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.sentry.protocol.DebugMeta;

/* loaded from: classes9.dex */
public class NetworkImage extends Image implements ImageBlock {
    private final ImageClickListener listener;
    private final Twig twig;
    private final UploadingImageCache uploadingImageCache;

    NetworkImage(StyleType styleType, UploadingImageCache uploadingImageCache, ImageClickListener imageClickListener) {
        super(styleType);
        this.twig = LumberMill.getLogger();
        this.uploadingImageCache = uploadingImageCache;
        this.listener = imageClickListener;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock
    public View addImage(String str, String str2, String str3, int i, int i2, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int dpToPx = ScreenUtils.dpToPx(i, context);
        int dpToPx2 = ScreenUtils.dpToPx(i2, context);
        ShimmerFrameLayout intercomShimmerLayout = new IntercomShimmerLayout(context);
        BlockUtils.createLayoutParams(intercomShimmerLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(intercomShimmerLayout);
        ResizableImageView resizableImageView = new ResizableImageView(context);
        resizableImageView.setTransitionName(LightBoxActivity.TRANSITION_KEY);
        resizableImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        setBackground(resizableImageView);
        intercomShimmerLayout.addView(resizableImageView);
        loadImageFromUrl(str, str2, context, dpToPx, dpToPx2, resizableImageView, intercomShimmerLayout);
        BlockUtils.setLayoutMarginsAndGravity(intercomShimmerLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement(resizableImageView);
            return intercomShimmerLayout;
        }
        if (!TextUtils.isEmpty(str3)) {
            resizableImageView.setFocusable(true);
            resizableImageView.setContentDescription(str3);
        }
        return intercomShimmerLayout;
    }

    private void loadImageFromUrl(final String str, final String str2, final Context context, final int i, final int i2, final ResizableImageView resizableImageView, final ShimmerFrameLayout shimmerFrameLayout) {
        if (TextUtils.isEmpty(str)) {
            hideLoadingState(shimmerFrameLayout, resizableImageView);
            resizableImageView.setImageResource(R.drawable.intercom_image_load_failed);
            resizableImageView.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        ImageRequest.Builder data = new ImageRequest.Builder(context).error(R.drawable.intercom_image_load_failed).crossfade(true).target(resizableImageView).data(str);
        setImageViewBounds(i, i2, resizableImageView, data);
        Resources resources = context.getResources();
        if (getStyle() != StyleType.CAROUSEL) {
            if (ImageUtils.isGif(str)) {
                data.setParameter(GifDecoder.ANIMATED_TRANSFORMATION_KEY, new RoundedCornersAnimatedTransformation(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners)));
            } else {
                data.transformations(new RoundedCornersTransformation(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners)));
            }
        }
        Uri localImageUriForRemoteUrl = this.uploadingImageCache.getLocalImageUriForRemoteUrl(str);
        if (localImageUriForRemoteUrl != null) {
            data.transformations(new GrayscaleTransformation()).data(localImageUriForRemoteUrl);
        }
        data.listener(new ImageRequest.Listener() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1
            @Override // coil.request.ImageRequest.Listener
            public void onCancel(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
                resizableImageView.setScaleType(ImageView.ScaleType.CENTER);
                NetworkImage.this.hideLoadingState(shimmerFrameLayout, resizableImageView);
                NetworkImage.this.twig.internal(DebugMeta.JsonKeys.IMAGES, "FAILURE");
                resizableImageView.setScaleType(ImageView.ScaleType.CENTER);
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
                NetworkImage.this.twig.internal(DebugMeta.JsonKeys.IMAGES, "SUCCESS");
                NetworkImage.this.hideLoadingState(shimmerFrameLayout, resizableImageView);
                if (NetworkImage.this.getStyle() == StyleType.CHAT_FULL || NetworkImage.this.listener == null) {
                    return;
                }
                resizableImageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        NetworkImage.this.listener.onImageClicked(str, str2, resizableImageView, i, i2);
                    }
                });
            }
        });
        IntercomCoilKt.loadIntercomImage(context, data.build());
    }

    int getSampleSize(int i, int i2, DisplayMetrics displayMetrics) {
        if (i > displayMetrics.widthPixels || i2 > displayMetrics.heightPixels) {
            return (int) Math.pow(2.0d, (int) Math.ceil(Math.log(displayMetrics.widthPixels / Math.max(i2, i)) / Math.log(0.5d)));
        }
        return 1;
    }

    void hideLoadingState(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView) {
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.hideShimmer();
            imageView.setBackgroundResource(android.R.color.transparent);
        }
    }
}
