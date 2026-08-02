package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle;

import Du.C2881a;
import Sc.InterfaceC4008j;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.widgets.suggestions.data.model.SuggestionsTitleSubtitleList;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R<\u0010\u001d\u001a$\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001bj\b\u0012\u0004\u0012\u00020\u0004`\u001c0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R7\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060!j\u0002`\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010 ¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/suggestions/di/SuggestionsWidgetComponent;", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleList;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper$delegate", "LSc/j;", "getMapper", "mapper", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuggestionsTitleSubtitleViewMapper extends WidgetViewMapper2<SuggestionsWidgetComponent, SuggestionsTitleSubtitleList, SuggestionsTitleSubtitleVO> {
    private final int layout = R$layout.item_suggestions_title_subtitle_cell;

    @NotNull
    private final Function2<View, ComposerReferences, k<SuggestionsTitleSubtitleVO>> holderProducer = new SuggestionsTitleSubtitleViewMapper$holderProducer$1(this);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = LazyUtilsKt.unsafeLazy(SuggestionsTitleSubtitleViewMapper$mapper$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final SuggestionsWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return SuggestionsWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SuggestionsTitleSubtitleList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SuggestionsTitleSubtitleVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SuggestionsTitleSubtitleList, d, List<SuggestionsTitleSubtitleVO>> getMapper() {
        return (Function2) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SuggestionsWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SuggestionsWidgetComponent.class), new C2881a(storage, 7));
    }
}
