package ru.ozon.app.android.cabinet.tabSelector.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.R$layout;
import ru.ozon.app.android.cabinet.tabSelector.data.TabSelectorDTO;
import ru.ozon.app.android.cabinet.tabSelector.data.TabSelectorMapper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR6\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R<\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0016j\b\u0012\u0004\u0012\u00020\u0003`\u00170\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO;", "Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO;", "Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorMapper;", "mapper", "<init>", "(Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorMapper;)V", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabSelectorViewMapper extends WidgetViewMapper<TabSelectorDTO, TabSelectorVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<TabSelectorVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<TabSelectorDTO, d, List<TabSelectorVO>> mapper;

    public TabSelectorViewMapper(@NotNull TabSelectorMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.layout = R$layout.widget_tabs;
        this.mapper = mapper;
        this.holderProducer = TabSelectorViewMapper$holderProducer$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TabSelectorVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TabSelectorDTO, d, List<TabSelectorVO>> getMapper() {
        return this.mapper;
    }
}
