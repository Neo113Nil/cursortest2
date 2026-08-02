package ru.ozon.app.android.commonwidgets.widgets.resultheader.core;

import Pc.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderRepository;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.model.ResultsHeaderDTO;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ResultsHeaderVO;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ResultsHeaderViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/model/ResultsHeaderDTO;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderVO;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderMapper;", "mapper", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;", "repository", "LPc/a;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "shoppingListsViewModel", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderMapper;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;LPc/a;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultsHeaderViewMapper extends WidgetViewMapper<ResultsHeaderDTO, ResultsHeaderVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ResultsHeaderViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final ResultsHeaderMapper mapper;

    public ResultsHeaderViewMapper(@NotNull ResultsHeaderMapper mapper, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull ResultsHeaderRepository repository, @NotNull a<ShoppingListsViewModel> shoppingListsViewModel, @NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(shoppingListsViewModel, "shoppingListsViewModel");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.mapper = mapper;
        this.layout = R$layout.widget_results_header;
        this.holderProducer = new ResultsHeaderViewMapper$holderProducer$1(actionSheetEventHandler, repository, adultHandler, shoppingListsViewModel);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ResultsHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ResultsHeaderDTO, d, List<ResultsHeaderVO>> getMapper() {
        return this.mapper;
    }
}
