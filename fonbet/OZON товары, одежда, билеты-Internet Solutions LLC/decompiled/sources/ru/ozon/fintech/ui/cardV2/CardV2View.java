package ru.ozon.fintech.ui.cardV2;

import C.D;
import E30.g;
import Gw.ViewOnClickListenerC3131a;
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
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/ui/cardV2/CardV2View;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "image", "Landroid/widget/ImageView;", "root", "Landroidx/constraintlayout/widget/ConstraintLayout;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subTitle", "state", "Lru/ozon/fintech/ui/cardV2/CardV2State;", "bindState", "", "setRounded", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardV2View extends FrameLayout {

    @NotNull
    private final ImageView image;

    @NotNull
    private final ConstraintLayout root;
    private CardV2State state;

    @NotNull
    private final TextAtomView subTitle;

    @NotNull
    private final TextAtomView title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CardV2View cardV2View, View view) {
        CardV2State cardV2State = cardV2View.state;
        Function2<String, Boolean, Unit> onClick = cardV2State != null ? cardV2State.getOnClick() : null;
        CardV2State cardV2State2 = cardV2View.state;
        String actionId = cardV2State2 != null ? cardV2State2.getActionId() : null;
        CardV2State cardV2State3 = cardV2View.state;
        g.b(new a(), onClick, actionId, cardV2State3 != null ? Boolean.valueOf(cardV2State3.getCloseOnClick()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(Function2 onClick, String actionId, boolean z11) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    private final void setRounded() {
        this.root.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.cardV2.CardV2View$setRounded$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                CardV2State cardV2State;
                ConstraintLayout constraintLayout;
                Integer radius;
                cardV2State = CardV2View.this.state;
                int d11 = D.d((cardV2State == null || (radius = cardV2State.getRadius()) == null) ? 0 : radius.intValue());
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                constraintLayout = CardV2View.this.root;
                constraintLayout.setTag(new Pair("radius", Integer.valueOf(d11)));
            }
        });
    }

    public final void bindState(@NotNull CardV2State state) {
        int color;
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        this.title.setVisibility(state.getTitle() != null ? 0 : 8);
        this.subTitle.setVisibility(state.getSubTitle() != null ? 0 : 8);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        if (parseColor != null) {
            this.root.setBackgroundColor(parseColor.intValue());
        }
        TextAtom title = state.getTitle();
        if (title != null) {
            TextAtomHolderKt.bind$default(this.title, title, null, 2, null);
        }
        TextAtom subTitle = state.getSubTitle();
        if (subTitle != null) {
            TextAtomHolderKt.bind$default(this.subTitle, subTitle, null, 2, null);
        }
        setRounded();
        if (state.getSrc() != null) {
            this.image.setColorFilter((ColorFilter) null);
            this.image.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageViewExtKt.loadOriginal$default(this.image, state.getSrc(), null, null, null, false, null, 62, null);
            return;
        }
        if (state.getIcon() != null) {
            this.image.setScaleType(ImageView.ScaleType.CENTER);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer iconResByToken = TokensExtKt.getIconResByToken(context2, state.getIcon());
            if (iconResByToken != null) {
                int intValue = iconResByToken.intValue();
                if (state.getIconColor() != null) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    color = styleParser.parseColor(context3, state.getIconColor(), R.color.oz_semantic_text_action);
                } else {
                    color = androidx.core.content.a.getColor(getContext(), R.color.oz_semantic_text_action);
                }
                this.image.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                this.image.setImageResource(intValue);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardV2View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.fin_card_v2_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.image = (ImageView) findViewById(R.id.fin_card_image_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.fin_card_root);
        this.root = constraintLayout;
        this.title = (TextAtomView) findViewById(R.id.fin_card_title_view);
        this.subTitle = (TextAtomView) findViewById(R.id.fin_card_subtitle_view);
        constraintLayout.setClickable(true);
        constraintLayout.setFocusable(true);
        constraintLayout.setClipToOutline(true);
        setTag("CardV2View");
        constraintLayout.setOnClickListener(new ViewOnClickListenerC3131a(this, 10));
        constraintLayout.setForeground(androidx.core.content.a.getDrawable(context, R.drawable.fintech_ripple_rect_round_bluewave));
        setRounded();
    }
}
