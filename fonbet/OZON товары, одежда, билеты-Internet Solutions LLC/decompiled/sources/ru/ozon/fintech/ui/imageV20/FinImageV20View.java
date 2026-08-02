package ru.ozon.fintech.ui.imageV20;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/ui/imageV20/FinImageV20View;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "image", "Landroid/widget/ImageView;", "state", "Lru/ozon/fintech/ui/imageV20/FinImageV20State;", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinImageV20View extends WidgetFrameLayout {

    @NotNull
    private final ImageView image;
    private FinImageV20State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinImageV20View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull FinImageV20State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        FinImageV20State finImageV20State = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, finImageV20State != null ? finImageV20State.getCommon() : null);
        Common common2 = state.getCommon();
        FinImageV20State finImageV20State2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, finImageV20State2 != null ? finImageV20State2.getCommon() : null);
        Common common3 = state.getCommon();
        FinImageV20State finImageV20State3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, finImageV20State3 != null ? finImageV20State3.getCommon() : null, null, 4, null);
        this.state = state;
        if (state.getIconBase64() != null) {
            if (state.getScaleType() != null) {
                this.image.setScaleType(state.getScaleType());
            } else {
                this.image.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            try {
                byte[] decode = Base64.decode(state.getIconBase64(), 0);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                ImageViewExtKt.load$default(this.image, BitmapFactory.decodeByteArray(decode, 0, decode.length), null, null, null, 14, null);
            } catch (IllegalArgumentException unused) {
                this.image.setImageDrawable(null);
            }
        } else if (state.getIconSrc() != null) {
            this.image.setColorFilter((ColorFilter) null);
            if (state.getScaleType() != null) {
                this.image.setScaleType(state.getScaleType());
            } else {
                this.image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            ImageViewExtKt.loadOriginal$default(this.image, state.getIconSrc(), null, null, null, false, null, 62, null);
        } else if (state.getIcon() != null) {
            if (state.getScaleType() != null) {
                this.image.setScaleType(state.getScaleType());
            } else {
                this.image.setScaleType(ImageView.ScaleType.CENTER);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer iconResByToken = TokensExtKt.getIconResByToken(context, state.getIcon());
            if (iconResByToken != null) {
                this.image.setImageResource(iconResByToken.intValue());
            }
        } else {
            this.image.setImageDrawable(null);
        }
        if (state.getIconColor() == null) {
            this.image.setColorFilter((ColorFilter) null);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.image.setColorFilter(styleParser.parseColor(context2, state.getIconColor(), R.color.oz_semantic_text_action), PorterDuff.Mode.SRC_IN);
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.image;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinImageV20View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public FinImageV20State getState() {
        return this.state;
    }

    public /* synthetic */ FinImageV20View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinImageV20View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.image = imageView;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        getPaddingFrameLayout().addView(imageView);
        setTag("FinImageV20View");
    }
}
