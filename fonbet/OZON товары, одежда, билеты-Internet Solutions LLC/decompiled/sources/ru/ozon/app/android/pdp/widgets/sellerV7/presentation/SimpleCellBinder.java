package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import Sc.InterfaceC4008j;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.IconViewImageLoader;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00150!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010*\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SimpleCellBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "Lru/ozon/app/android/pdp/utils/IconViewImageLoader;", "Lru/ozon/uni/android/cell/CellView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;Lru/ozon/composer/ui/widget/k;)V", "item", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "", "onFinish", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView$delegate", "LSc/j;", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SimpleCellBinder extends BaseWidgetPlaceholderBinder<SellerV7VO> implements IconViewImageLoader {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconView;

    @NotNull
    private final CellView view;

    @NotNull
    private final k<SellerV7VO> viewHolderOwner;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    public SimpleCellBinder(@NotNull CellView view, @NotNull ComposerReferences refs, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull k<SellerV7VO> viewHolderOwner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        this.view = view;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.viewHolderOwner = viewHolderOwner;
        this.actionHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).buildHandler();
        this.iconView = DelegatesKt.lazyUnsafe(new SimpleCellBinder$iconView$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getIconView() {
        return (IconView) this.iconView.getValue();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(SellerV7VO sellerV7VO, d dVar, Object obj, Function0 function0) {
        bind2(sellerV7VO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<SellerV7VO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void loadIcon(@NotNull IconView iconView, IconDTO iconDTO, String str, Function0<Unit> function0) {
        IconViewImageLoader.DefaultImpls.loadIcon(this, iconView, iconDTO, str, function0);
    }

    public void onVisibleAreaChanged(@NotNull q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        this.widgetImagePlaceholderAdapter.cacheViewIfNeeded(this.view, "SellerV7SimpleCellWidget", (String) pair.b(), info, (String) pair.a(), new SimpleCellBinder$onVisibleAreaChanged$1(this));
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull SellerV7VO item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((SimpleCellBinder) item, info, payload, onFinish);
        CellHolderKt.bind(this.view, item.getSellerCell(), this.actionHandler);
        IconView iconView = getIconView();
        if (iconView != null) {
            CellDTO.LeftBlock leftBlock = item.getSellerCell().getLeftBlock();
            loadIcon(iconView, leftBlock != null ? leftBlock.getIcon() : null, item.getBackgroundIconImage(), onFinish);
        }
    }
}
