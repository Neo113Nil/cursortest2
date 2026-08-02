package ru.ozon.fintech.ui.input;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/input/TextAreaInfoActionIconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/fintech/ui/input/TextAreaAction;", "action", "getAction", "()Lru/ozon/fintech/ui/input/TextAreaAction;", "iconColorDefault", "infoIconImage", "Landroid/widget/ImageView;", "changeState", "", "setColorFilter", "color", "mode", "Landroid/graphics/PorterDuff$Mode;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAreaInfoActionIconView extends FrameLayout {

    @NotNull
    private TextAreaAction action;
    private final int iconColorDefault;

    @NotNull
    private ImageView infoIconImage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAreaAction.values().length];
            try {
                iArr[TextAreaAction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAreaInfoActionIconView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void changeState(@NotNull TextAreaAction value) {
        Integer iconRes;
        Intrinsics.checkNotNullParameter(value, "value");
        this.action = value;
        if (WhenMappings.$EnumSwitchMapping$0[value.ordinal()] != 1 && (iconRes = value.getIconRes()) != null) {
            this.infoIconImage.setImageResource(iconRes.intValue());
            this.infoIconImage.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
        }
        L80.a.a("InputView", "TextAreaInfoActionIcon changeState " + this.action);
    }

    @NotNull
    public final TextAreaAction getAction() {
        return this.action;
    }

    public final void setColorFilter(int color, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.infoIconImage.setColorFilter(color, mode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAreaInfoActionIconView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextAreaInfoActionIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAreaInfoActionIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.action = TextAreaAction.INFO;
        this.iconColorDefault = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_TERTIARY.getResId());
        this.infoIconImage = new ImageView(context);
        setId(R.id.finTextAreaInfoIcon);
        addView(this.infoIconImage, new FrameLayout.LayoutParams(-1, -1));
        changeState(TextAreaAction.NONE);
    }
}
