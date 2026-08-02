package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector;

import Dc0.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.databinding.ItemNotificationsSettingsSelectorViewBinding;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorVO;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVariantView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "invokeClick", "()V", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;", "item", "Lkotlin/Function1;", "", "onClickListener", "bind", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;Lkotlin/jvm/functions/Function1;)V", "dp44", "I", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO$Variant;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/databinding/ItemNotificationsSettingsSelectorViewBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/ItemNotificationsSettingsSelectorViewBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsSelectorVariantView extends ConstraintLayout {

    @NotNull
    private final ItemNotificationsSettingsSelectorViewBinding binding;
    private final int dp44;
    private NotificationsSettingsSelectorVO.Variant item;
    private Function1<? super Long, Unit> onClickListener;

    public /* synthetic */ NotificationsSettingsSelectorVariantView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeClick() {
        Function1<? super Long, Unit> function1;
        NotificationsSettingsSelectorVO.Variant variant = this.item;
        if (variant == null || (function1 = this.onClickListener) == null) {
            return;
        }
        function1.invoke(Long.valueOf(variant.getValue()));
    }

    public final void bind(@NotNull NotificationsSettingsSelectorVO.Variant item, @NotNull Function1<? super Long, Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        ItemNotificationsSettingsSelectorViewBinding itemNotificationsSettingsSelectorViewBinding = this.binding;
        this.item = item;
        this.onClickListener = onClickListener;
        itemNotificationsSettingsSelectorViewBinding.variantTitleTv.setText(item.getTitle());
        TextView variantSubtitleTv = itemNotificationsSettingsSelectorViewBinding.variantSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(variantSubtitleTv, "variantSubtitleTv");
        TextViewExtKt.setTextOrGone(variantSubtitleTv, item.getSubtitle());
        itemNotificationsSettingsSelectorViewBinding.variantStateRb.setChecked(item.getIsSelected());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsSettingsSelectorVariantView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(44);
        this.dp44 = px;
        ItemNotificationsSettingsSelectorViewBinding inflate = ItemNotificationsSettingsSelectorViewBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        setBackground(a.getDrawable(context, R$drawable.ripple_rect_bluewave));
        setMinHeight(px);
        setOnClickListener(new n(this, 6));
        inflate.variantStateRb.setClickable(false);
    }
}
