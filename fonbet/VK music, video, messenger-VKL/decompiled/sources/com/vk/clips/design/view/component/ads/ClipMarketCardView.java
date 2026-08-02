package com.vk.clips.design.view.component.ads;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.image.c;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.bcr0;
import xsna.gcd0;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.r7d;
import xsna.s3q0;
import xsna.s7d;
import xsna.x7g;
import xsna.zrp;

/* compiled from: ClipMarketCardView.kt */
/* loaded from: classes16.dex */
public final class ClipMarketCardView extends ConstraintLayout {
    public ImageSize A;
    public final FrameLayout t;
    public final VkContentBadge u;
    public final VkText v;
    public final VkText w;
    public final VkText x;
    public final VkButton y;
    public VKImageController<? extends ImageView> z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipMarketCardView.kt */
    public static final class ImageSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageSize[] $VALUES;
        public static final ImageSize SIZE_NORMAL;
        public static final ImageSize SIZE_SMALL;
        private final int value;

        static {
            ImageSize imageSize = new ImageSize("SIZE_SMALL", 0, iah0.a(160));
            SIZE_SMALL = imageSize;
            ImageSize imageSize2 = new ImageSize("SIZE_NORMAL", 1, iah0.a(230));
            SIZE_NORMAL = imageSize2;
            ImageSize[] imageSizeArr = {imageSize, imageSize2};
            $VALUES = imageSizeArr;
            $ENTRIES = new asp(imageSizeArr);
        }

        public ImageSize(String str, int i, int i2) {
            this.value = i2;
        }

        public static ImageSize valueOf(String str) {
            return (ImageSize) Enum.valueOf(ImageSize.class, str);
        }

        public static ImageSize[] values() {
            return (ImageSize[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    public ClipMarketCardView(Context context, ImageSize imageSize) {
        super(context, null, 0);
        this.A = ImageSize.SIZE_NORMAL;
        LayoutInflater.from(context).inflate(R.layout.clips_ads_card, (ViewGroup) this, true);
        this.t = (FrameLayout) findViewById(R.id.card_image);
        VkContentBadge vkContentBadge = (VkContentBadge) findViewById(R.id.card_badge);
        this.u = vkContentBadge;
        this.v = (VkText) findViewById(R.id.card_price);
        this.w = (VkText) findViewById(R.id.card_old_price);
        this.x = (VkText) findViewById(R.id.card_description);
        this.y = (VkButton) findViewById(R.id.card_button);
        vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_contrast_themed), new x7g(R.attr.vk_ui_background_content_inverse), null, 12));
        if (imageSize != null) {
            setImageSize(imageSize);
        }
        setBackgroundResource(R.drawable.clips_bg_secondary_rounded_12);
    }

    private final void setSize(int i) {
        FrameLayout frameLayout = this.t;
        frameLayout.getLayoutParams().width = i;
        frameLayout.getLayoutParams().height = i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = -2;
        } else {
            layoutParams = new ConstraintLayout.b(i, -2);
        }
        setLayoutParams(layoutParams);
    }

    public final ImageSize getImageSize() {
        return this.A;
    }

    public final void setBadgeText(String str) {
        int i = str == null || str.length() == 0 ? 8 : 0;
        VkContentBadge vkContentBadge = this.u;
        vkContentBadge.setVisibility(i);
        vkContentBadge.setText(str);
    }

    public final void setButtonText(String str) {
        int i = str == null || str.length() == 0 ? 8 : 0;
        VkButton vkButton = this.y;
        vkButton.setVisibility(i);
        vkButton.setText(str);
    }

    public final void setImageSize(ImageSize imageSize) {
        setSize(imageSize.h());
        this.A = imageSize;
    }

    public final void setOldPrice(String str) {
        VkText vkText = this.w;
        if (str == null) {
            vkText.setText((CharSequence) null);
            vkText.setVisibility(8);
        } else {
            SpannableString valueOf = SpannableString.valueOf(str);
            valueOf.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
            vkText.setText(valueOf);
            vkText.setVisibility(0);
        }
    }

    public final void setOnButtonClickAction(izs<? super View, s3q0> izsVar) {
        this.y.setOnClickListener(new r7d(0, izsVar, this));
    }

    public final void setOnCardClickAction(gzs<s3q0> gzsVar) {
        setOnClickListener(new s7d(0, gzsVar));
    }

    public final void setViewControllerFactory(bcr0<? extends ImageView> bcr0Var) {
        FrameLayout frameLayout = this.t;
        frameLayout.removeAllViews();
        this.z = null;
        if (bcr0Var != null) {
            VKImageController<? extends ImageView> create = bcr0Var.create(getContext());
            this.z = create;
            c cVar = (c) create;
            View view = cVar.getView();
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView == null) {
                throw new IllegalArgumentException("Expected ImageView but got ".concat(cVar.getView().getClass().getSimpleName()).toString());
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            gcd0.d(imageView, 4, iah0.b(12.0f));
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(imageView);
        }
    }
}
