package ru.ozon.app.android.atoms.v3.flashsale;

import Sc.InterfaceC3999a;
import android.content.Context;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/v3/flashsale/StockBarHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindProgressBackgroundColor", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StockBarHolder extends AtomV3<StockBar, StockBarView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockBarHolder(@NotNull StockBarView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void bindProgressBackgroundColor(StockBar item) {
        getContainerView().setProgressBackgroundColor(item.getHasBorder(), c.f(StyleParser.INSTANCE.parseColor(getContext(), item.getStockBarBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT), (int) (item.getStockBarBackgroundAlpha() * 255)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StockBarHolder(@NotNull Context context, String str) {
        this(new StockBarView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull StockBar item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((StockBarHolder) item);
        StockBarView containerView = getContainerView();
        containerView.setFullWidth(item.isFullWidth());
        containerView.setProgress(item.getPercent());
        containerView.setProgressColor(item.getStockBarColor());
        bindProgressBackgroundColor(item);
        containerView.setText(item.getText(), item.getTextColor(), item.getTheme() == StockBar.StockBarTheme.THEME_TYPE_SMALL ? R$style.TextStyle_Caption : R$style.TextStyle_Body_M);
    }
}
