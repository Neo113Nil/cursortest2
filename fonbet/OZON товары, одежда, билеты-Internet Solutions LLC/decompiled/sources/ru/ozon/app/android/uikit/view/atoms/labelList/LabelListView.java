package ru.ozon.app.android.uikit.view.atoms.labelList;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/labelList/LabelListView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "extraSpacingBetweenRows", "", "labelsMaxLines", "textStyleId", "Ljava/lang/Integer;", "setMaxLines", "", "maxLines", "setTextAppearance", "resId", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LabelListView extends AppCompatTextView implements AtomView {
    private final float extraSpacingBetweenRows;
    private int labelsMaxLines;
    private Integer textStyleId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        if (maxLines != this.labelsMaxLines) {
            this.labelsMaxLines = maxLines;
            super.setMaxLines(maxLines);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int resId) {
        Integer num = this.textStyleId;
        if (num != null && resId == num.intValue()) {
            return;
        }
        this.textStyleId = Integer.valueOf(resId);
        super.setTextAppearance(resId);
    }

    public /* synthetic */ LabelListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(2);
        this.extraSpacingBetweenRows = pxF;
        this.labelsMaxLines = Integer.MAX_VALUE;
        setEllipsize(TextUtils.TruncateAt.END);
        setLineSpacing(pxF, getLineSpacingMultiplier());
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
