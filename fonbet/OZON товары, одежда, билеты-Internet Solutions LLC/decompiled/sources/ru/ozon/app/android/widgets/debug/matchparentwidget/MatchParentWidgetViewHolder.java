package ru.ozon.app.android.widgets.debug.matchparentwidget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.widgets.R$id;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetVO;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetVO;Ll20/d;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MatchParentWidgetViewHolder extends k<MatchParentWidgetVO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchParentWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        View findViewById = containerView.findViewById(R$id.textAtomView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.textView = (TextAtomV2View) findViewById;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MatchParentWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.textView.setText(item.getText());
    }
}
