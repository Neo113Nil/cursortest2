package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import GZ.g;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickViewHolder;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.CharacteristicsPickDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R2\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R2\u0010(\u001a\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030'0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonCharacteristicsPickViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO;", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(LGZ/g;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO;", "", "stateId", "toViewObject", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO;Ljava/lang/String;)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header;", "dto", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header;", "headerToViewObject", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO$CellData$Header;)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "cellDto", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "CharacteristicPickWidgetDecoration", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComparisonCharacteristicsPickViewMapper extends WidgetViewMapper<ComparisonDTO, CharacteristicsPickVO> {
    private CellAtom.CellAtomWithSubtitle cellDto;

    @NotNull
    private final Function2<View, ComposerReferences, k<CharacteristicsPickVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<ComparisonDTO, d, List<CharacteristicsPickVO>> mapper;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonCharacteristicsPickViewMapper$CharacteristicPickWidgetDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonCharacteristicsPickViewMapper;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "offset", "I", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public final class CharacteristicPickWidgetDecoration extends RecyclerView.n {
        private final int offset = ResourceExtKt.toPx(12);

        public CharacteristicPickWidgetDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if ((ComparisonCharacteristicsPickViewMapper.this.cellDto instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter) || !(parent.getChildViewHolder(view) instanceof CharacteristicsPickViewHolder)) {
                return;
            }
            outRect.bottom = this.offset;
        }
    }

    public ComparisonCharacteristicsPickViewMapper(@NotNull g ozonRouter, @NotNull HandlersInhibitor handlersInhibitor) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.mapper = new ComparisonCharacteristicsPickViewMapper$mapper$1(this);
        this.layout = R$layout.pdp_widget_comparison_charateristics_pick;
        this.holderProducer = new ComparisonCharacteristicsPickViewMapper$holderProducer$1(ozonRouter, handlersInhibitor);
    }

    private final CharacteristicsPickVO.CellData.Header headerToViewObject(CharacteristicsPickDTO.CellData.Header dto) {
        return new CharacteristicsPickVO.CellData.Header(dto.getTitle(), new CharacteristicsPickVO.CellData.Header.HeaderSearch(dto.getSearch().getPlaceholder()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharacteristicsPickVO toViewObject(CharacteristicsPickDTO characteristicsPickDTO, String str) {
        ArrayList arrayList;
        long hashCode = str.hashCode();
        if (!(characteristicsPickDTO.getCell() instanceof CellAtom.CellAtomWithSubtitle)) {
            return null;
        }
        CellAtom.CellAtomWithSubtitle cellAtomWithSubtitle = (CellAtom.CellAtomWithSubtitle) characteristicsPickDTO.getCell();
        CharacteristicsPickVO.CellData.Header headerToViewObject = headerToViewObject(characteristicsPickDTO.getCellData().getHeader());
        List<CharacteristicsPickDTO.CellData.CellDataValue> values = characteristicsPickDTO.getCellData().getValues();
        if (values != null) {
            List<CharacteristicsPickDTO.CellData.CellDataValue> list = values;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (CharacteristicsPickDTO.CellData.CellDataValue cellDataValue : list) {
                String id2 = cellDataValue.getId();
                CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio = new CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio(cellDataValue.isSelected(), false, false, OzonSpannableStringKt.toOzonSpannableString(cellDataValue.getTitle()), null, null, null, null, null, null, false, false, null, null, cellDataValue.getTrackingInfo(), 16374, null);
                Map<String, TokenizedTrackingInfo> trackingInfo = cellDataValue.getTrackingInfo();
                t mapToTokenizedEvent = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(hashCode), ActionType.SELECT.INSTANCE.getType()) : null;
                Map<String, TokenizedTrackingInfo> trackingInfo2 = cellDataValue.getTrackingInfo();
                arrayList.add(new CharacteristicsPickVO.CellData.CellDataValue(id2, cellWithSubtitleCheckboxRadio, mapToTokenizedEvent, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo2, Long.valueOf(hashCode), ActionType.UNSELECT.INSTANCE.getType()) : null));
            }
        } else {
            arrayList = null;
        }
        ButtonV3Atom.LargeButton button = characteristicsPickDTO.getCellData().getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo3 = characteristicsPickDTO.getCellData().getTrackingInfo();
        return new CharacteristicsPickVO(hashCode, cellAtomWithSubtitle, new CharacteristicsPickVO.CellData(headerToViewObject, arrayList, button, trackingInfo3 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(hashCode), null, 2, null) : null));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new CharacteristicPickWidgetDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CharacteristicsPickVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ComparisonDTO, d, List<CharacteristicsPickVO>> getMapper() {
        return this.mapper;
    }
}
