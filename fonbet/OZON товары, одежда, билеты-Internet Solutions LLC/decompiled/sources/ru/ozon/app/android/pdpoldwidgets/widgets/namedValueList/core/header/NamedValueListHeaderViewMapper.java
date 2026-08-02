package ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.header;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.data.NamedValueListDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.header.NamedValueListHeaderVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.header.NamedValueListHeaderViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/header/NamedValueListHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/data/NamedValueListDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/header/NamedValueListHeaderVO;", "<init>", "()V", "mapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/header/NamedValueListHeaderMapper;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/header/NamedValueListHeaderMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/header/NamedValueListHeaderViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "canMap", "", "state", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NamedValueListHeaderViewMapper extends WidgetViewMapper<NamedValueListDTO, NamedValueListHeaderVO> {

    @NotNull
    private final NamedValueListHeaderMapper mapper = new NamedValueListHeaderMapper();
    private final int layout = R$layout.widget_named_value_list_header;

    @NotNull
    private final Function2<View, ComposerReferences, NamedValueListHeaderViewHolder> holderProducer = NamedValueListHeaderViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        List<TextAtom> subtitles;
        NamedValueListDTO namedValueListDTO = state instanceof NamedValueListDTO ? (NamedValueListDTO) state : null;
        if (namedValueListDTO != null) {
            return namedValueListDTO.getTitle() != null || ((subtitles = namedValueListDTO.getSubtitles()) != null && (subtitles.isEmpty() ^ true));
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NamedValueListHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NamedValueListDTO, d, List<NamedValueListHeaderVO>> getMapper() {
        return this.mapper;
    }
}
