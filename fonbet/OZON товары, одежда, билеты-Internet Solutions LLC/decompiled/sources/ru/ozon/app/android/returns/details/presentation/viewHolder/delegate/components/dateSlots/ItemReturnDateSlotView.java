package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.dateSlots;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$drawable;
import ru.ozon.app.android.returns.common.presentation.untils.TextAppearanceHelper;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/ItemReturnDateSlotView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "verticalPadding", "horizontalPadding", "dateSlotTitleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getDateSlotTitleTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "dateSlotSubtitleTv", "getDateSlotSubtitleTv", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemReturnDateSlotView extends LinearLayout {

    @NotNull
    private final AppCompatTextView dateSlotSubtitleTv;

    @NotNull
    private final AppCompatTextView dateSlotTitleTv;
    private final int horizontalPadding;
    private final int verticalPadding;

    public /* synthetic */ ItemReturnDateSlotView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final AppCompatTextView getDateSlotSubtitleTv() {
        return this.dateSlotSubtitleTv;
    }

    @NotNull
    public final AppCompatTextView getDateSlotTitleTv() {
        return this.dateSlotTitleTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemReturnDateSlotView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.verticalPadding = px;
        int px2 = UiExtKt.toPx(12, context);
        this.horizontalPadding = px2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        appCompatTextView.setLayoutParams(layoutParams);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setMaxLines(1);
        TextAppearanceHelper textAppearanceHelper = TextAppearanceHelper.INSTANCE;
        textAppearanceHelper.setTextAppearanceStyle(appCompatTextView, R$style.TextStyle_Body_L);
        this.dateSlotTitleTv = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        appCompatTextView2.setLayoutParams(layoutParams2);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setMaxLines(1);
        textAppearanceHelper.setTextAppearanceStyle(appCompatTextView2, R$style.TextStyle_Caption_Gray60);
        this.dateSlotSubtitleTv = appCompatTextView2;
        setId(View.generateViewId());
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        setPadding(px2, px, px2, px);
        setLayoutParams(layoutParams3);
        setBackgroundResource(R$drawable.bg_date_slot);
        addView(appCompatTextView);
        addView(appCompatTextView2);
    }
}
