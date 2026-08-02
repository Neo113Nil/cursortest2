package ru.ozon.app.android.ugc.widgets.listanswers.presentation.header;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.databinding.WidgetAnswerHeaderBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/presentation/header/HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/header/HeaderVO;", "Lru/ozon/app/android/ugc/databinding/WidgetAnswerHeaderBinding;", "binding", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetAnswerHeaderBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/listanswers/presentation/header/HeaderVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/databinding/WidgetAnswerHeaderBinding;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderViewHolder extends k<HeaderVO> {

    @NotNull
    private final WidgetAnswerHeaderBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HeaderViewHolder(@NotNull WidgetAnswerHeaderBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAnswerHeaderBinding widgetAnswerHeaderBinding = this.binding;
        widgetAnswerHeaderBinding.headerTitleTv.setText(item.getTitle());
        TextView headerCountTv = widgetAnswerHeaderBinding.headerCountTv;
        Intrinsics.checkNotNullExpressionValue(headerCountTv, "headerCountTv");
        TextViewExtKt.setTextOrGone(headerCountTv, item.getCount());
    }
}
