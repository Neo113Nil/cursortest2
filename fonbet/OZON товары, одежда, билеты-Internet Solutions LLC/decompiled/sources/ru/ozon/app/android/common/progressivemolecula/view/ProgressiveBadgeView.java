package ru.ozon.app.android.common.progressivemolecula.view;

import Hj.C3143a;
import Tl.a;
import android.R;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.progressive_molecula.databinding.ViewProgressiveBadgeBinding;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveBadgeDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveBadgeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/common/progressive_molecula/databinding/ViewProgressiveBadgeBinding;", "bind", "", "data", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;", "bindOrGone", "Companion", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveBadgeView extends FrameLayout {

    @NotNull
    private final ViewProgressiveBadgeBinding binding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float BADGE_CORNER_RADIUS_PX_F = UiExtKt.toPxF(8);
    private static final float PROGRESS_CORNER_RADIUS_PX_F = UiExtKt.toPxF(2);
    private static final int STROKE_WIDTH = UiExtKt.toPx(1);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/view/ProgressiveBadgeView$Companion;", "", "<init>", "()V", "", "BADGE_CORNER_RADIUS_PX_F", "F", "getBADGE_CORNER_RADIUS_PX_F", "()F", "MAX_FILL_PERCENTAGE", "", "BADGE_CORNER_RADIUS", "I", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBADGE_CORNER_RADIUS_PX_F() {
            return ProgressiveBadgeView.BADGE_CORNER_RADIUS_PX_F;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressiveBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull ProgressiveBadgeDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ViewProgressiveBadgeBinding viewProgressiveBadgeBinding = this.binding;
        TextAtomV2View text = viewProgressiveBadgeBinding.text;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        TextHolderKt.bindOrGone$default(text, data.getTitle(), null, 2, null);
        View constraintLayout = viewProgressiveBadgeBinding.getConstraintLayout();
        GradientDrawable gradientDrawable = new GradientDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, data.getBackgroundColor(), R.color.transparent));
        int i11 = STROKE_WIDTH;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawable.setStroke(i11, styleParser.parseColor(context2, data.getBorderColor(), R.color.transparent));
        gradientDrawable.setCornerRadius(BADGE_CORNER_RADIUS_PX_F);
        constraintLayout.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout2 = viewProgressiveBadgeBinding.container;
        d d11 = a.d(constraintLayout2, "container", constraintLayout2);
        d11.z(data.getFillPercentage() / 100.1f, this.binding.progress.getId());
        d11.f(constraintLayout2);
        View view = viewProgressiveBadgeBinding.progress;
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = PROGRESS_CORNER_RADIUS_PX_F;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        paint.setColor(styleParser2.parseColor(context3, data.getProgressBackgroundColor(), R.color.transparent));
        view.setBackground(shapeDrawable);
    }

    public final void bindOrGone(ProgressiveBadgeDTO data) {
        if (data == null) {
            View constraintLayout = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.gone(constraintLayout);
        } else {
            bind(data);
            View constraintLayout2 = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ViewExtKt.show(constraintLayout2);
        }
    }

    public /* synthetic */ ProgressiveBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewProgressiveBadgeBinding inflate = ViewProgressiveBadgeBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.common.progressivemolecula.view.ProgressiveBadgeView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), ProgressiveBadgeView.Companion.getBADGE_CORNER_RADIUS_PX_F());
            }
        });
        setClipToOutline(true);
        inflate.text.setTextIsSelectable(false);
    }
}
