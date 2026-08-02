package ru.ozon.uni.android.atom.notification.view.deprecated;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.android.atom.timer.TimerView;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.databinding.NotificationViewUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/uni/android/atom/notification/view/deprecated/NotificationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", DynamicElementDTO.TIMER, "Lru/ozon/uni/android/atom/timer/TimerView;", "getTimer", "()Lru/ozon/uni/android/atom/timer/TimerView;", "button", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "getButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "binding", "Lru/ozon/uni/databinding/NotificationViewUniBinding;", "setTitle", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setSubtitle", "subtitle", "showDisclosure", "show", "", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationView extends ConstraintLayout implements AtomView {

    @NotNull
    private final NotificationViewUniBinding binding;
    public static final int $stable = 8;

    public /* synthetic */ NotificationView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final SmallButtonView getButton() {
        SmallButtonView btn = this.binding.btn;
        Intrinsics.checkNotNullExpressionValue(btn, "btn");
        return btn;
    }

    @NotNull
    public final TimerView getTimer() {
        TimerView timerV = this.binding.timerV;
        Intrinsics.checkNotNullExpressionValue(timerV, "timerV");
        return timerV;
    }

    public final void setSubtitle(String subtitle) {
        AppCompatTextView subtitleTv = this.binding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, subtitle);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.binding.titleTv.setText(title);
    }

    public final void showDisclosure(boolean show) {
        ImageView disclosureIv = this.binding.disclosureIv;
        Intrinsics.checkNotNullExpressionValue(disclosureIv, "disclosureIv");
        ViewExtKt.showOrGone(disclosureIv, Boolean.valueOf(show));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = NotificationViewUniBinding.bind(View.inflate(context, R$layout.notification_view_uni, this));
        setBackgroundResource(R$drawable.bg_notification_ripple);
        setElevation(UiExtKt.toPxF(5));
        setContentDescription("notificationTimer");
    }
}
