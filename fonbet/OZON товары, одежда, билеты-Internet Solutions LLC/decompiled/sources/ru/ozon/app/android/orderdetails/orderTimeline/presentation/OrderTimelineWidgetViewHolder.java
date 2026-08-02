package ru.ozon.app.android.orderdetails.orderTimeline.presentation;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.orderdetails.databinding.WidgetOrderTimelineLayoutBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTimeline/presentation/OrderTimelineWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderTimeline/presentation/OrderTimelineVO;", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTimelineLayoutBinding;", "binding", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTimelineLayoutBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/orderTimeline/presentation/OrderTimelineVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTimelineLayoutBinding;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTimelineWidgetViewHolder extends k<OrderTimelineVO> {

    @NotNull
    private final WidgetOrderTimelineLayoutBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderTimelineWidgetViewHolder(@NotNull WidgetOrderTimelineLayoutBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        binding.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderTimelineVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetOrderTimelineLayoutBinding widgetOrderTimelineLayoutBinding = this.binding;
        TextAtomView statusTitleTv = widgetOrderTimelineLayoutBinding.statusTitleTv;
        Intrinsics.checkNotNullExpressionValue(statusTitleTv, "statusTitleTv");
        TextAtomHolderKt.bind$default(statusTitleTv, item.getTitle(), null, 2, null);
        AppCompatTextView statusSubtitleTv = widgetOrderTimelineLayoutBinding.statusSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(statusSubtitleTv, "statusSubtitleTv");
        TextViewExtKt.setTextOrGone(statusSubtitleTv, item.getSubtitle());
        AppCompatTextView addressTv = widgetOrderTimelineLayoutBinding.addressTv;
        Intrinsics.checkNotNullExpressionValue(addressTv, "addressTv");
        TextViewExtKt.setTextOrGone(addressTv, item.getAddress());
        widgetOrderTimelineLayoutBinding.statusDotV.setBackgroundResource(item.getDotRes());
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getLineColor().getToken());
        if (parseColor != null) {
            widgetOrderTimelineLayoutBinding.statusLineV.setBackgroundColor(parseColor.intValue());
        }
    }
}
