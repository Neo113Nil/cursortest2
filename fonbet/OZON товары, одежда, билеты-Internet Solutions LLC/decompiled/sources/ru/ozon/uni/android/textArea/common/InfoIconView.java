package ru.ozon.uni.android.textArea.common;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$id;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/android/textArea/common/InfoIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/android/textArea/common/InfoIconView$Action;", "action", "getAction", "()Lru/ozon/uni/android/textArea/common/InfoIconView$Action;", "setAction", "(Lru/ozon/uni/android/textArea/common/InfoIconView$Action;)V", "iconColorDefault", "iconSuccessColor", "Action", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoIconView extends AppCompatImageView {

    @NotNull
    private Action action;
    private final int iconColorDefault;
    private final int iconSuccessColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/textArea/common/InfoIconView$Action;", "", "iconRes", "", "<init>", "(Ljava/lang/String;II)V", "getIconRes", "()I", "COPY", "CLEAR", "INFO", "SUCCESS", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private final int iconRes;
        public static final Action COPY = new Action("COPY", 0, R$drawable.ic_m_copy_filled);
        public static final Action CLEAR = new Action("CLEAR", 1, R$drawable.ic_m_cross_compact);
        public static final Action INFO = new Action("INFO", 2, R$drawable.ic_m_info_filled);
        public static final Action SUCCESS = new Action("SUCCESS", 3, R$drawable.ic_m_check);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{COPY, CLEAR, INFO, SUCCESS};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Action(String str, int i11, int i12) {
            this.iconRes = i12;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        public final int getIconRes() {
            return this.iconRes;
        }
    }

    public /* synthetic */ InfoIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    public final void setAction(@NotNull Action value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.action = value;
        setImageResource(value.getIconRes());
        setColorFilter(this.action == Action.SUCCESS ? this.iconSuccessColor : this.iconColorDefault, PorterDuff.Mode.SRC_IN);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.action = Action.INFO;
        this.iconColorDefault = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_TERTIARY.getResId());
        this.iconSuccessColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_POSITIVE_PRIMARY.getResId());
        setId(R$id.inputInfoIcon);
    }
}
