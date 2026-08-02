package ru.ozon.fintech.ui.image;

import B0.A0;
import B80.d;
import C.D;
import DN.b;
import E30.g;
import H30.z;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/image/FinImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "image", "Landroid/widget/ImageView;", "state", "Lru/ozon/fintech/ui/image/FinImageState;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinImageView extends ConstraintLayout {

    @NotNull
    private final ImageView image;
    private FinImageState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FinImageView finImageView, View view) {
        FinImageState finImageState = finImageView.state;
        Function2<String, Boolean, Unit> onClick = finImageState != null ? finImageState.getOnClick() : null;
        FinImageState finImageState2 = finImageView.state;
        g.a(new d(1), onClick, finImageState2 != null ? finImageState2.getActionId() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(Function2 onClick, String actionId) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.TRUE);
        return Unit.f71690a;
    }

    public final void bindState(@NotNull FinImageState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        ViewGroup.LayoutParams layoutParams = this.image.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41600G = A0.a(state.getRatioW(), state.getRatioH(), "H,", ProductContainerDTO.RATIO_DELIMITER);
        Float percentW = state.getPercentW();
        bVar.f41611R = percentW != null ? percentW.floatValue() : 1.0f;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        if (parseColor != null) {
            this.image.setBackgroundColor(parseColor.intValue());
        }
        ImageViewExtKt.loadOriginal$default(this.image, state.getSrc(), null, null, null, false, null, 62, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.fin_image_view, this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        ImageView imageView = (ImageView) findViewById(R.id.fin_image_view);
        this.image = imageView;
        setClickable(true);
        setFocusable(true);
        setTag("FinImageView");
        imageView.setClipToOutline(true);
        imageView.setOnClickListener(new b(this, 17));
        imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.image.FinImageView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Integer radius;
                FinImageState finImageState = FinImageView.this.state;
                int d11 = D.d((finImageState == null || (radius = finImageState.getRadius()) == null) ? 0 : radius.intValue());
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                FinImageView.this.image.setTag(new Pair("radius", Integer.valueOf(d11)));
            }
        });
    }
}
