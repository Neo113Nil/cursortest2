package ru.ozon.fintech.ui.action;

import Ca.j;
import Cz.ViewOnClickListenerC2788a;
import E30.g;
import H30.z;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.fintech.ui.databinding.FinActionTextItemViewBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/ui/action/ActionTextItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/FinActionTextItemViewBinding;", "bindState", "", "state", "Lru/ozon/fintech/ui/action/ActionTextItemState;", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionTextItemView extends ConstraintLayout {
    private static final int DEFAULT_ICON_COLOR = R.color.oz_semantic_text_action;

    @NotNull
    private FinActionTextItemViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionTextItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$1(ActionTextItemState actionTextItemState, View view) {
        g.a(new j(actionTextItemState, 1), actionTextItemState.getOnClick(), actionTextItemState.getActionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$1$lambda$0(ActionTextItemState actionTextItemState, Function2 click, String id2) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(id2, "id");
        click.invoke(id2, Boolean.valueOf(actionTextItemState.getCloseOnClick()));
        return Unit.f71690a;
    }

    public final void bindState(@NotNull ActionTextItemState state) {
        int color;
        Intrinsics.checkNotNullParameter(state, "state");
        z.a(this, state.getPaddings());
        TextAtom text = state.getText();
        if (text != null) {
            TextAtomHolderKt.bind$default(this.binding.finTextView, text, null, 2, null);
        }
        this.binding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC2788a(state, 3));
        ImageView imageView = this.binding.finRightImage;
        if (state.getSrc() != null) {
            imageView.setColorFilter((ColorFilter) null);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageViewExtKt.loadOriginal$default(imageView, state.getSrc(), null, null, null, false, null, 62, null);
            return;
        }
        if (state.getIcon() == null) {
            imageView.setImageDrawable(null);
            return;
        }
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, state.getIcon());
        if (iconResByToken != null) {
            int intValue = iconResByToken.intValue();
            if (state.getIconColor() != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context2 = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                color = styleParser.parseColor(context2, state.getIconColor(), DEFAULT_ICON_COLOR);
            } else {
                TextAtom text2 = state.getText();
                if ((text2 != null ? text2.getTextColor() : null) != null) {
                    StyleParser styleParser2 = StyleParser.INSTANCE;
                    Context context3 = imageView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    color = styleParser2.parseColor(context3, state.getText().getTextColor(), DEFAULT_ICON_COLOR);
                } else {
                    color = a.getColor(imageView.getContext(), DEFAULT_ICON_COLOR);
                }
            }
            imageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            imageView.setImageResource(intValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionTextItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ActionTextItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionTextItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = FinActionTextItemViewBinding.inflate(LayoutInflater.from(context), this);
        setTag("ActionTextItemView");
    }
}
