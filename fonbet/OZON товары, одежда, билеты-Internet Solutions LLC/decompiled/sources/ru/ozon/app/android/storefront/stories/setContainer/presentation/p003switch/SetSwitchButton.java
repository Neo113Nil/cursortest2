package ru.ozon.app.android.storefront.stories.setContainer.presentation.p003switch;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$color;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleView", "Landroidx/appcompat/widget/AppCompatTextView;", "subtitleView", "setTitle", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setSubtitle", "subtitle", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetSwitchButton extends LinearLayout {

    @NotNull
    private final AppCompatTextView subtitleView;

    @NotNull
    private final AppCompatTextView titleView;

    public /* synthetic */ SetSwitchButton(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void setSubtitle(String subtitle) {
        TextViewExtKt.setTextOrGone(this.subtitleView, subtitle);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.titleView.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetSwitchButton(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextAppearance(context, R$style.TextStyle_Body_M);
        appCompatTextView.setTextColor(a.getColorStateList(context, R$color.switch_set_title_color));
        appCompatTextView.setDuplicateParentStateEnabled(true);
        addView(appCompatTextView);
        this.titleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(ResourceExtKt.toPx(12, context));
        appCompatTextView2.setLayoutParams(layoutParams);
        appCompatTextView2.setSingleLine();
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextAppearance(context, R$style.TextStyle_Body_M);
        appCompatTextView2.setTextColor(a.getColorStateList(context, R$color.switch_set_subtitle_color));
        appCompatTextView2.setDuplicateParentStateEnabled(true);
        addView(appCompatTextView2);
        this.subtitleView = appCompatTextView2;
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(R$drawable.switch_set_rounded_bg);
        int px = ResourceExtKt.toPx(12, context);
        int px2 = ResourceExtKt.toPx(8, context);
        setPadding(px, px2, px, px2);
        setClickable(true);
        setFocusable(true);
    }
}
