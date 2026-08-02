package ru.ozon.fintech.ui.badgekit;

import C.D;
import H30.z;
import L30.c;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.badgekit.BadgeKitState;
import ru.ozon.fintech.ui.databinding.BadgeKitViewBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/badgekit/BadgeKitView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/BadgeKitViewBinding;", "state", "Lru/ozon/fintech/ui/badgekit/BadgeKitState;", "cl", "Landroid/view/View$OnClickListener;", "getCl", "()Landroid/view/View$OnClickListener;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeKitView extends LinearLayout {

    @NotNull
    private final BadgeKitViewBinding binding;

    @NotNull
    private final View.OnClickListener cl;
    private BadgeKitState state;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BadgeKitState.Size.values().length];
            try {
                iArr[BadgeKitState.Size.S_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BadgeKitState.Color.values().length];
            try {
                iArr2[BadgeKitState.Color.NEUTRAL_SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BadgeKitState.Color.WARNING_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeKitView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cl$lambda$0(BadgeKitView badgeKitView, View view) {
        Function0<Unit> onClick;
        BadgeKitState badgeKitState = badgeKitView.state;
        if (badgeKitState == null || (onClick = badgeKitState.getOnClick()) == null) {
            return;
        }
        onClick.invoke();
    }

    public final void bindState(@NotNull BadgeKitState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.binding.text.setText(state.getText());
        ImageView iconRight = this.binding.iconRight;
        Intrinsics.checkNotNullExpressionValue(iconRight, "iconRight");
        iconRight.setVisibility(state.getChevron() ? 0 : 8);
        if (state.getOnClick() != null) {
            setOnClickListener(this.cl);
        } else {
            setOnClickListener(null);
        }
        if (WhenMappings.$EnumSwitchMapping$0[state.getSize().ordinal()] != 1) {
            throw new o();
        }
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle("tsBodyControl400Small");
        Intrinsics.f(parseTextStyle);
        this.binding.text.setTextAppearance(parseTextStyle.intValue());
        setMinimumHeight(ResourceExtKt.toPx(24));
        setPadding(D.d(8), D.d(2), state.getChevron() ? D.d(4) : D.d(8), D.d(2));
        setOutlineProvider(new c(8));
        setClipToOutline(true);
        int i11 = WhenMappings.$EnumSwitchMapping$1[state.getColor().ordinal()];
        if (i11 == 1) {
            if (state.getOnClick() != null) {
                z.d(this, R.color.bg_secondary, null, 124);
            } else {
                setBackgroundResource(R.color.bg_secondary);
            }
            this.binding.text.setTextColor(a.getColor(getContext(), R.color.text_secondary));
            ImageView iconRight2 = this.binding.iconRight;
            Intrinsics.checkNotNullExpressionValue(iconRight2, "iconRight");
            ThemeExtKt.tint(iconRight2, Integer.valueOf(a.getColor(getContext(), R.color.text_secondary)));
            return;
        }
        if (i11 != 2) {
            throw new o();
        }
        if (state.getOnClick() != null) {
            z.d(this, R.color.bg_warning_secondary, null, 124);
        } else {
            setBackgroundResource(R.color.bg_warning_secondary);
        }
        this.binding.text.setTextColor(a.getColor(getContext(), R.color.text_warning));
        ImageView iconRight3 = this.binding.iconRight;
        Intrinsics.checkNotNullExpressionValue(iconRight3, "iconRight");
        ThemeExtKt.tint(iconRight3, Integer.valueOf(a.getColor(getContext(), R.color.text_warning)));
    }

    @NotNull
    public final View.OnClickListener getCl() {
        return this.cl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeKitView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BadgeKitView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKitView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        BadgeKitViewBinding inflate = BadgeKitViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.cl = new DN.a(this, 6);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
