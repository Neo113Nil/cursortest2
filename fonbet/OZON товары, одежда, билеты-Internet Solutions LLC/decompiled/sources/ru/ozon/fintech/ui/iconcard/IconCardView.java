package ru.ozon.fintech.ui.iconcard;

import Ar.d;
import C.D;
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
import ru.ozon.fintech.ui.common.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/ui/iconcard/IconCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "icon", "Landroid/widget/ImageView;", "secondaryIcon", "text", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "root", "state", "Lru/ozon/fintech/ui/iconcard/IconCardState;", "bindState", "", "setRounded", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IconCardView extends ConstraintLayout {

    @NotNull
    private final ImageView icon;

    @NotNull
    private final ConstraintLayout root;

    @NotNull
    private final ImageView secondaryIcon;
    private IconCardState state;

    @NotNull
    private final TextAtomView text;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(IconCardView iconCardView, View view) {
        IconCardState iconCardState = iconCardView.state;
        Function2<String, Boolean, Unit> onClick = iconCardState != null ? iconCardState.getOnClick() : null;
        IconCardState iconCardState2 = iconCardView.state;
        String actionId = iconCardState2 != null ? iconCardState2.getActionId() : null;
        IconCardState iconCardState3 = iconCardView.state;
        g.b(new a(), onClick, actionId, iconCardState3 != null ? Boolean.valueOf(iconCardState3.getCloseOnClick()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(Function2 onClick, String actionId, boolean z11) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    private final void setRounded() {
        this.root.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.iconcard.IconCardView$setRounded$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IconCardState iconCardState;
                Integer radius;
                iconCardState = IconCardView.this.state;
                int d11 = D.d((iconCardState == null || (radius = iconCardState.getRadius()) == null) ? 0 : radius.intValue());
                if (view != null && outline != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                }
                if (view != null) {
                    view.setTag(new Pair("radius", Integer.valueOf(d11)));
                }
            }
        });
        this.icon.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.iconcard.IconCardView$setRounded$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IconCardState iconCardState;
                Integer iconRadius;
                iconCardState = IconCardView.this.state;
                int d11 = D.d((iconCardState == null || (iconRadius = iconCardState.getIconRadius()) == null) ? 0 : iconRadius.intValue());
                if (view != null && outline != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                }
                if (view != null) {
                    view.setTag(new Pair("radius", Integer.valueOf(d11)));
                }
            }
        });
        this.secondaryIcon.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.iconcard.IconCardView$setRounded$3
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int d11 = D.d(6);
                if (view != null && outline != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                }
                if (view != null) {
                    view.setTag(new Pair("radius", Integer.valueOf(d11)));
                }
            }
        });
    }

    public final void bindState(@NotNull IconCardState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        ViewGroup.LayoutParams layoutParams = this.root.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (state.getWidth() == null || state.getHeight() == null) {
            ((ViewGroup.MarginLayoutParams) bVar).width = -1;
            ((ViewGroup.MarginLayoutParams) bVar).height = -2;
            this.root.setLayoutParams(bVar);
        } else {
            ((ViewGroup.MarginLayoutParams) bVar).width = D.d(state.getWidth().intValue());
            ((ViewGroup.MarginLayoutParams) bVar).height = D.d(state.getHeight().intValue());
            this.root.setLayoutParams(bVar);
        }
        this.text.setVisibility(state.getTitle() != null ? 0 : 8);
        TextAtom title = state.getTitle();
        if (title != null) {
            TextAtomHolderKt.bind$default(this.text, title, null, 2, null);
        }
        ConstraintLayout constraintLayout = this.root;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        constraintLayout.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        ImageViewExtKt.finIcon(this.icon, state.getIcon(), state.getIconSrc(), state.getIconColor(), state.getIconBackgroundColor());
        if (state.getSecondaryIconSrc() == null && state.getSecondaryIcon() == null) {
            this.secondaryIcon.setVisibility(4);
        } else {
            this.secondaryIcon.setVisibility(0);
        }
        ImageViewExtKt.finIcon(this.secondaryIcon, state.getSecondaryIcon(), state.getSecondaryIconSrc(), state.getSecondaryIconColor(), state.getSecondaryIconBackgroundColor());
        setRounded();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconCardView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.fin_icon_card_view, this);
        setLayoutParams(new ConstraintLayout.b(-2, -2));
        ImageView imageView = (ImageView) findViewById(R.id.fin_icon_card_icon);
        this.icon = imageView;
        this.text = (TextAtomView) findViewById(R.id.fin_icon_card_text);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.fin_icon_card_root);
        this.root = constraintLayout;
        ImageView imageView2 = (ImageView) findViewById(R.id.fin_icon_card_secondary_icon);
        this.secondaryIcon = imageView2;
        setClickable(true);
        setFocusable(true);
        constraintLayout.setClipToOutline(true);
        imageView.setClipToOutline(true);
        imageView2.setClipToOutline(true);
        constraintLayout.setOnClickListener(new d(this, 13));
        setRounded();
    }
}
