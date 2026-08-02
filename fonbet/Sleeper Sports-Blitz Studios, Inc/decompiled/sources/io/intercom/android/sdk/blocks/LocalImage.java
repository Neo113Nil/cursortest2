package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.transform.RoundedCornersTransformation;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressFrameLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.android.sdk.views.UploadProgressBar;
import io.sentry.protocol.DebugMeta;

/* loaded from: classes9.dex */
class LocalImage extends Image implements LocalImageBlock {
    private final Twig twig;

    LocalImage(StyleType styleType) {
        super(styleType);
        this.twig = LumberMill.getLogger();
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock
    public View addImage(Uri uri, int i, int i2, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int dpToPx = ScreenUtils.dpToPx(i, context);
        int dpToPx2 = ScreenUtils.dpToPx(i2, context);
        ProgressFrameLayout progressFrameLayout = new ProgressFrameLayout(context);
        BlockUtils.createLayoutParams(progressFrameLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom(progressFrameLayout);
        final ResizableImageView resizableImageView = new ResizableImageView(context);
        BlockUtils.createLayoutParams(resizableImageView, -2, -2);
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        progressFrameLayout.addView(resizableImageView);
        ImageRequest.Builder data = new ImageRequest.Builder(context).target(resizableImageView).data(uri);
        setImageViewBounds(dpToPx, dpToPx2, resizableImageView, data);
        View childAt = progressFrameLayout.getChildAt(0);
        Resources resources = context.getResources();
        if (childAt instanceof UploadProgressBar) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.intercom_local_image_upload_size);
            childAt.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            childAt.bringToFront();
            progressFrameLayout.uploadStarted();
        }
        setBackground(resizableImageView);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        resizableImageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        data.transformations(new RoundedCornersTransformation(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners))).crossfade(true).listener(new ImageRequest.Listener() { // from class: io.intercom.android.sdk.blocks.LocalImage.1
            @Override // coil.request.ImageRequest.Listener
            public void onCancel(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(ImageRequest imageRequest) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
                LocalImage.this.twig.internal(DebugMeta.JsonKeys.IMAGES, "FAILURE");
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
                LocalImage.this.twig.internal(DebugMeta.JsonKeys.IMAGES, "SUCCESS");
                resizableImageView.setBackgroundResource(android.R.color.transparent);
            }
        });
        IntercomCoilKt.loadIntercomImage(context, data.build());
        BlockUtils.setLayoutMarginsAndGravity(progressFrameLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        return progressFrameLayout;
    }
}
