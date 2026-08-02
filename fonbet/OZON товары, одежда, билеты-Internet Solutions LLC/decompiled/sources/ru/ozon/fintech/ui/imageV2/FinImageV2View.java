package ru.ozon.fintech.ui.imageV2;

import C.D;
import E30.g;
import GI.c;
import H30.z;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
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
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/ui/imageV2/FinImageV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "image", "Landroid/widget/ImageView;", "state", "Lru/ozon/fintech/ui/imageV2/FinImageV2State;", "clickListener", "Landroid/view/View$OnClickListener;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinImageV2View extends ConstraintLayout {

    @NotNull
    private final View.OnClickListener clickListener;

    @NotNull
    private final ImageView image;
    private FinImageV2State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinImageV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$1(FinImageV2View finImageV2View, View view) {
        FinImageV2State finImageV2State = finImageV2View.state;
        Function2<String, Boolean, Unit> onClick = finImageV2State != null ? finImageV2State.getOnClick() : null;
        FinImageV2State finImageV2State2 = finImageV2View.state;
        g.a(new a(), onClick, finImageV2State2 != null ? finImageV2State2.getActionId() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clickListener$lambda$1$lambda$0(Function2 onClick, String actionId) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.FALSE);
        return Unit.f71690a;
    }

    public final void bindState(@NotNull FinImageV2State state) {
        int color;
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        if (state.getWidth() != null && state.getHeight() != null) {
            ViewGroup.LayoutParams layoutParams = this.image.getLayoutParams();
            layoutParams.height = D.d(state.getHeight().intValue());
            layoutParams.width = D.d(state.getWidth().intValue());
            this.image.setLayoutParams(layoutParams);
        } else if (state.getRatioW() != null && state.getRatioH() != null) {
            ViewGroup.LayoutParams layoutParams2 = this.image.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
            bVar.f41600G = "H," + state.getRatioW() + ProductContainerDTO.RATIO_DELIMITER + state.getRatioH();
            Float percentW = state.getPercentW();
            bVar.f41611R = percentW != null ? percentW.floatValue() : 1.0f;
        }
        if (state.getIconSrc() != null) {
            this.image.setColorFilter((ColorFilter) null);
            this.image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ImageViewExtKt.loadOriginal$default(this.image, state.getIconSrc(), null, null, null, false, null, 62, null);
        } else if (state.getIcon() != null) {
            this.image.setScaleType(ImageView.ScaleType.CENTER);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer iconResByToken = TokensExtKt.getIconResByToken(context, state.getIcon());
            if (iconResByToken != null) {
                int intValue = iconResByToken.intValue();
                if (state.getIconColor() != null) {
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    color = styleParser.parseColor(context2, state.getIconColor(), R.color.oz_semantic_text_action);
                } else {
                    color = androidx.core.content.a.getColor(getContext(), R.color.oz_semantic_text_action);
                }
                this.image.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                this.image.setImageResource(intValue);
            }
        }
        ImageView imageView = this.image;
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        imageView.setBackgroundColor(styleParser2.parseColor(context3, state.getBackColor(), android.R.color.transparent));
        if (state.getActionId() != null) {
            setOnClickListener(this.clickListener);
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinImageV2View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinImageV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinImageV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clickListener = new c(this, 10);
        View.inflate(context, R.layout.fin_image_v2_view, this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        ImageView imageView = (ImageView) findViewById(R.id.fin_image_view_v2);
        this.image = imageView;
        setTag("FinImageV2View");
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.imageV2.FinImageV2View.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Integer radius;
                FinImageV2State finImageV2State = FinImageV2View.this.state;
                int d11 = D.d((finImageV2State == null || (radius = finImageV2State.getRadius()) == null) ? 0 : radius.intValue());
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                FinImageV2View.this.image.setTag(new Pair("radius", Integer.valueOf(d11)));
            }
        });
    }
}
