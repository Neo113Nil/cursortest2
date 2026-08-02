package ru.ozon.fintech.ui.smalllabel;

import E30.f;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.smalllabel.SmallLabelState;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/ui/smalllabel/SmallLabelView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/smalllabel/SmallLabelState;", "getState", "()Lru/ozon/fintech/ui/smalllabel/SmallLabelState;", "setState", "(Lru/ozon/fintech/ui/smalllabel/SmallLabelState;)V", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmallLabelView extends AppCompatTextView {
    private SmallLabelState state;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SmallLabelState.Type.values().length];
            try {
                iArr[SmallLabelState.Type.POSITIVE_PALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallLabelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull SmallLabelState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        SmallLabelState.Type type = state.getType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        if (iArr[type.ordinal()] != 1) {
            throw new o();
        }
        setBackground(a.getDrawable(getContext(), R.drawable.background_rounded_ctrl_positive_pale_8));
        if (iArr[state.getType().ordinal()] != 1) {
            throw new o();
        }
        setTextColor(a.getColor(getContext(), R.color.oz_accent_secondary));
        setText(state.getTitle());
    }

    public final SmallLabelState getState() {
        return this.state;
    }

    public final void setState(SmallLabelState smallLabelState) {
        this.state = smallLabelState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallLabelView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SmallLabelView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallLabelView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setPadding(f.i(), f.g(), f.i(), f.g());
        setTextAppearance(R.style.TextStyle_Body_M);
        setBackground(a.getDrawable(context, R.drawable.background_rounded_ctrl_positive_pale_8));
        setTextColor(a.getColor(context, R.color.oz_accent_secondary));
    }
}
