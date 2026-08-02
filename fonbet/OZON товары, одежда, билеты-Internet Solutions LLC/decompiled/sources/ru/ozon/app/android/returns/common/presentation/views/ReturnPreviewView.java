package ru.ozon.app.android.returns.common.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$id;
import ru.ozon.app.android.returns.list.presentation.views.ReturnHeaderView;
import ru.ozon.app.android.returns.list.presentation.views.ReturnTotalView;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/views/ReturnPreviewView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "buttonMargin", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/returns/list/presentation/views/ReturnHeaderView;", "getHeader", "()Lru/ozon/app/android/returns/list/presentation/views/ReturnHeaderView;", "status", "Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "getStatus", "()Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "total", "Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "getTotal", "()Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnPreviewView extends LinearLayout {

    @NotNull
    private final ButtonV3View button;
    private final int buttonMargin;

    @NotNull
    private final ReturnHeaderView header;

    @NotNull
    private final ReturnStatusView status;

    @NotNull
    private final ReturnTotalView total;

    public /* synthetic */ ReturnPreviewView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final ButtonV3View getButton() {
        return this.button;
    }

    @NotNull
    public final ReturnHeaderView getHeader() {
        return this.header;
    }

    @NotNull
    public final ReturnStatusView getStatus() {
        return this.status;
    }

    @NotNull
    public final ReturnTotalView getTotal() {
        return this.total;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnPreviewView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.buttonMargin = px;
        int i13 = 0;
        AttributeSet attributeSet2 = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ReturnHeaderView returnHeaderView = new ReturnHeaderView(context, attributeSet2, i13, 0, 14, defaultConstructorMarker);
        returnHeaderView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.header = returnHeaderView;
        ReturnStatusView returnStatusView = new ReturnStatusView(context, attributeSet2, i13, 6, null);
        returnStatusView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.status = returnStatusView;
        int i14 = 0;
        int i15 = 14;
        ReturnTotalView returnTotalView = new ReturnTotalView(context, attributeSet2, i13, i14, i15, defaultConstructorMarker);
        returnTotalView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.total = returnTotalView;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, i13, i14, i15, defaultConstructorMarker);
        buttonV3View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, px, px);
        buttonV3View.setLayoutParams(layoutParams);
        this.button = buttonV3View;
        setId(R$id.returnPreviewContainerCl);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setOrientation(1);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(returnHeaderView);
        addView(returnStatusView);
        addView(returnTotalView);
        addView(buttonV3View);
    }
}
