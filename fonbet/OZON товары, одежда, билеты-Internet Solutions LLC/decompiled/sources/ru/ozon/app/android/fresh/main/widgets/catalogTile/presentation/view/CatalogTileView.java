package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view;

import WZ.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.binder.CatalogTileBinder;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LWZ/l;", "tokenizedAnalytics", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(LWZ/l;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;", "catalogTileVO", "", "setPaddings", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "handler", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;Lkotlin/jvm/functions/Function1;)V", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/binder/CatalogTileBinder;", "catalogTileBinder", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/binder/CatalogTileBinder;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileView extends ConstraintLayout {

    @NotNull
    private final CatalogTileBinder catalogTileBinder;

    @NotNull
    private final l tokenizedAnalytics;

    public /* synthetic */ CatalogTileView(l lVar, Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, context, (i12 & 4) != 0 ? null : attributeSet, (i12 & 8) != 0 ? 0 : i11);
    }

    private final void setPaddings(CatalogTileVO catalogTileVO) {
        CatalogTileVO.PaddingsVO spacers = catalogTileVO.getSpacers();
        setPadding(spacers.getLeft(), spacers.getTop(), spacers.getRight(), spacers.getBottom());
    }

    public final void bind(@NotNull CatalogTileVO catalogTileVO, @NotNull Function1<? super AtomAction, Unit> handler) {
        Intrinsics.checkNotNullParameter(catalogTileVO, "catalogTileVO");
        Intrinsics.checkNotNullParameter(handler, "handler");
        removeAllViews();
        setPaddings(catalogTileVO);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, catalogTileVO.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        this.catalogTileBinder.bindCatalogTile(this, catalogTileVO, handler);
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogTileView(@NotNull l tokenizedAnalytics, @NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.catalogTileBinder = new CatalogTileBinder();
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }
}
