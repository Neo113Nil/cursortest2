package ru.ozon.fintech.ui.promo;

import C.D;
import Dc0.n;
import E30.g;
import H30.z;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/ui/promo/PromoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "image", "Landroid/widget/ImageView;", "root", "Landroidx/constraintlayout/widget/ConstraintLayout;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subTitle", "state", "Lru/ozon/fintech/ui/promo/PromoState;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromoView extends FrameLayout {

    @NotNull
    private final ImageView image;

    @NotNull
    private final ConstraintLayout root;
    private PromoState state;

    @NotNull
    private final TextAtomView subTitle;

    @NotNull
    private final TextAtomView title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PromoView promoView, View view) {
        PromoState promoState = promoView.state;
        Function2<String, Boolean, Unit> onClick = promoState != null ? promoState.getOnClick() : null;
        PromoState promoState2 = promoView.state;
        g.a(new a(), onClick, promoState2 != null ? promoState2.getActionId() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(Function2 onClick, String actionId) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.TRUE);
        return Unit.f71690a;
    }

    public final void bindState(@NotNull PromoState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        TextAtom title = state.getTitle();
        if (title != null) {
            TextAtomHolderKt.bind$default(this.title, title, null, 2, null);
        }
        TextAtom subTitle = state.getSubTitle();
        if (subTitle != null) {
            TextAtomHolderKt.bind$default(this.subTitle, subTitle, null, 2, null);
        }
        this.title.setVisibility(state.getTitle() != null ? 0 : 8);
        this.subTitle.setVisibility(state.getSubTitle() != null ? 0 : 8);
        if (state.getSrc() != null) {
            this.image.setColorFilter((ColorFilter) null);
            this.image.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageViewExtKt.loadOriginal$default(this.image, state.getSrc(), null, null, null, false, null, 62, null);
        } else {
            if (state.getIcon() == null) {
                this.image.setImageDrawable(null);
                return;
            }
            this.image.setScaleType(ImageView.ScaleType.CENTER);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer iconResByToken = TokensExtKt.getIconResByToken(context, state.getIcon());
            if (iconResByToken != null) {
                int intValue = iconResByToken.intValue();
                this.image.setColorFilter(androidx.core.content.a.getColor(getContext(), R.color.oz_semantic_text_action), PorterDuff.Mode.SRC_IN);
                this.image.setImageResource(intValue);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PromoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.fin_promo_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = (ImageView) findViewById(R.id.fin_promo_image_view);
        this.image = imageView;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.fin_promo_root);
        this.root = constraintLayout;
        this.title = (TextAtomView) findViewById(R.id.fin_promo_title);
        this.subTitle = (TextAtomView) findViewById(R.id.fin_promo_subtitle);
        constraintLayout.setClickable(true);
        constraintLayout.setFocusable(true);
        imageView.setClipToOutline(true);
        setTag("PromoView");
        constraintLayout.setOnClickListener(new n(this, 20));
        constraintLayout.setBackground(androidx.core.content.a.getDrawable(context, R.drawable.fintech_ripple_rect_round_bluewave));
        imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.promo.PromoView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.d(12));
            }
        });
    }
}
