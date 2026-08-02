package ru.ozon.fintech.ui.actionV2;

import Aa.C2375b;
import E30.g;
import EI.a;
import H30.z;
import Sc.o;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2State;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2View;
import ru.ozon.fintech.ui.databinding.FinActionTextItemV2ViewBinding;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/ui/actionV2/ActionTextItemV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/FinActionTextItemV2ViewBinding;", "bindState", "", "state", "Lru/ozon/fintech/ui/actionV2/ActionTextItemV2State;", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionTextItemV2View extends ConstraintLayout {
    private static final float CENTER_BIAS = 0.5f;
    private static final int DEFAULT_ICON_COLOR = R.color.oz_semantic_text_action;
    private static final float END_BIAS = 1.0f;
    private static final float START_BIAS = 0.0f;

    @NotNull
    private FinActionTextItemV2ViewBinding binding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gravity.values().length];
            try {
                iArr[Gravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gravity.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gravity.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionTextItemV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$1$lambda$0(ActionTextItemV2State actionTextItemV2State, d updateConstraints) {
        float f7;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        Gravity gravity = actionTextItemV2State.getGravity();
        int i11 = gravity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gravity.ordinal()];
        if (i11 == 1) {
            f7 = 0.0f;
        } else if (i11 == 2) {
            f7 = 1.0f;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            f7 = CENTER_BIAS;
        }
        updateConstraints.c0(f7, R.id.fin_text_view);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$3(final ActionTextItemV2State actionTextItemV2State, View view) {
        g.a(new Function2() { // from class: W90.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit bindState$lambda$3$lambda$2;
                bindState$lambda$3$lambda$2 = ActionTextItemV2View.bindState$lambda$3$lambda$2(ActionTextItemV2State.this, (Function2) obj, (String) obj2);
                return bindState$lambda$3$lambda$2;
            }
        }, actionTextItemV2State.getOnClick(), actionTextItemV2State.getActionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$3$lambda$2(ActionTextItemV2State actionTextItemV2State, Function2 click, String id2) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(id2, "id");
        click.invoke(id2, Boolean.valueOf(actionTextItemV2State.getCloseOnClick()));
        return Unit.f71690a;
    }

    public final void bindState(@NotNull ActionTextItemV2State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        z.a(this, state.getPaddings());
        TextAtom text = state.getText();
        Integer num = null;
        if (text != null) {
            TextAtomHolderKt.bind$default(this.binding.finTextView, text, null, 2, null);
        }
        if (state.getGravity() != null) {
            ConstraintLayoutExtKt.updateConstraints(this, new C2375b(state, 2));
        }
        this.binding.getConstraintLayout().setOnClickListener(new a(state, 6));
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
                num = Integer.valueOf(styleParser.parseColor(context2, state.getIconColor(), DEFAULT_ICON_COLOR));
            }
            if (num != null) {
                imageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
            imageView.setImageResource(intValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionTextItemV2View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ActionTextItemV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionTextItemV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = FinActionTextItemV2ViewBinding.inflate(LayoutInflater.from(context), this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setTag("ActionTextItemV2View");
    }
}
