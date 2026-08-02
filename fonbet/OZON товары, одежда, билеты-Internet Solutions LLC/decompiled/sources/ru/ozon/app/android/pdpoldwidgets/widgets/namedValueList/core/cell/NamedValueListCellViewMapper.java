package ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.cell;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.data.NamedValueListDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.NamedValueListDecoration;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.cell.NamedValueListCellVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.cell.NamedValueListCellViewHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/cell/NamedValueListCellViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/data/NamedValueListDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/cell/NamedValueListCellVO;", "<init>", "()V", "mapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/cell/NamedValueListCellMapper;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/cell/NamedValueListCellMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/cell/NamedValueListCellViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "canMap", "", "state", "", "getDecorators", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/NamedValueListDecoration;", "context", "Landroid/content/Context;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NamedValueListCellViewMapper extends WidgetViewMapper<NamedValueListDTO, NamedValueListCellVO> {

    @NotNull
    private final NamedValueListCellMapper mapper = new NamedValueListCellMapper();
    private final int layout = R$layout.widget_named_value_list_cell;

    @NotNull
    private final Function2<View, ComposerReferences, NamedValueListCellViewHolder> holderProducer = NamedValueListCellViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        List<NamedValueListDTO.NamedValue> namedValues;
        NamedValueListDTO namedValueListDTO = state instanceof NamedValueListDTO ? (NamedValueListDTO) state : null;
        return (namedValueListDTO == null || (namedValues = namedValueListDTO.getNamedValues()) == null || !(namedValues.isEmpty() ^ true)) ? false : true;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<NamedValueListDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new NamedValueListDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NamedValueListCellVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NamedValueListDTO, d, List<NamedValueListCellVO>> getMapper() {
        return this.mapper;
    }
}
