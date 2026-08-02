package ru.ozon.fintech.ui.button.large;

import Dc0.m;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/button/large/FinLargeButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bxButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "state", "Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "getState", "()Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "setState", "(Lru/ozon/fintech/ui/button/large/FinLargeButtonState;)V", "bindState", "", "getColorHex", "", "colorRes", "(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinLargeButtonView extends ConstraintLayout {

    @NotNull
    private final ButtonV3View bxButton;
    private FinLargeButtonState state;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinLargeButtonState.Type.values().length];
            try {
                iArr[FinLargeButtonState.Type.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinLargeButtonState.Type.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinLargeButtonState.Type.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinLargeButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$3(FinLargeButtonView finLargeButtonView, View view) {
        FinLargeButtonState finLargeButtonState = finLargeButtonView.state;
        if (finLargeButtonState != null) {
            Function0<Unit> onClick = finLargeButtonState.getOnClick();
            if (onClick != null) {
                onClick.invoke();
            }
            Function1<String, Unit> onClickId = finLargeButtonState.getOnClickId();
            if (onClickId != null) {
                onClickId.invoke(finLargeButtonState.getId());
            }
        }
    }

    private final String getColorHex(Context context, Integer colorRes) {
        if (colorRes == null) {
            return null;
        }
        String format = String.format(Locale.getDefault(), "#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(a.getColor(context, colorRes.intValue()))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final void bindState(@NotNull FinLargeButtonState state) {
        ButtonV3DTO.StyleTypes styleTypes;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getType().ordinal()];
        if (i11 == 1) {
            styleTypes = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
        } else if (i11 == 2) {
            styleTypes = ButtonV3DTO.StyleTypes.ACTION_SECONDARY;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            styleTypes = ButtonV3DTO.StyleTypes.CUSTOM;
        }
        ButtonV3DTO.StyleTypes styleTypes2 = styleTypes;
        ButtonV3View buttonV3View = this.bxButton;
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_600;
        String title = state.getTitle();
        String subTitle = state.getSubTitle();
        String icon = state.getIcon();
        Integer titleColor = state.getTitleColor();
        if (titleColor != null) {
            int intValue = titleColor.intValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            str = getColorHex(context, Integer.valueOf(intValue));
        } else {
            str = null;
        }
        Integer backgroundColor = state.getBackgroundColor();
        if (backgroundColor != null) {
            int intValue2 = backgroundColor.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            str2 = getColorHex(context2, Integer.valueOf(intValue2));
        } else {
            str2 = null;
        }
        ButtonV3HolderKt.bind$default(buttonV3View, new ButtonV3DTO(styleTypes2, sizes, title, subTitle, icon, null, null, str, null, null, null, null, str2, null, null, null, null, null, 257888, null), null, 2, null);
        this.bxButton.setOnClickListener(new m(this, 8));
    }

    public final FinLargeButtonState getState() {
        return this.state;
    }

    public final void setState(FinLargeButtonState finLargeButtonState) {
        this.state = finLargeButtonState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinLargeButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinLargeButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinLargeButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        this.bxButton = buttonV3View;
        buttonV3View.setLayoutParams(new ConstraintLayout.b(-1, -1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setTag("FinLargeButtonView");
        addView(buttonV3View);
        setClickable(true);
        setFocusable(true);
    }
}
