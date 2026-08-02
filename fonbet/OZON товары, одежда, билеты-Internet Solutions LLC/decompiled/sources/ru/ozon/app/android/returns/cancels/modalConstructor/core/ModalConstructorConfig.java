package ru.ozon.app.android.returns.cancels.modalConstructor.core;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.cscore.padding.VerticalPadding;
import ru.ozon.app.android.returns.cancels.modalConstructor.data.ModalConstructorDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0015B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/core/ModalConstructorConfig;", "Lj20/a;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "mapItems", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$CellListDTO;", "model", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "mapCellListDto", "(Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$CellListDTO;)Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModalConstructorConfig implements InterfaceC7243a<List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public ModalConstructorConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final CellListV2DTO mapCellListDto(ModalConstructorDTO.CellListDTO model) {
        List<CellDTO> cellList = model.getCellList();
        UniColors uniColors = UniColors.CLEAR_LIGHT_KEY_0;
        String token = uniColors.getToken();
        String token2 = uniColors.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        ModalConstructorDTO.PaddingDTO padding = model.getPadding();
        CommonCellSettings.LayoutPadding top = padding != null ? padding.getTop() : null;
        ModalConstructorDTO.PaddingDTO padding2 = model.getPadding();
        CommonCellSettings.LayoutPadding bottom = padding2 != null ? padding2.getBottom() : null;
        ModalConstructorDTO.PaddingDTO padding3 = model.getPadding();
        CommonCellSettings.LayoutPadding left = padding3 != null ? padding3.getLeft() : null;
        ModalConstructorDTO.PaddingDTO padding4 = model.getPadding();
        return new CellListV2DTO(null, null, null, token2, token, layoutPadding, layoutPadding, top, bottom, left, padding4 != null ? padding4.getRight() : null, null, true, null, null, cellList, 26631, null);
    }

    private final List<Object> mapItems(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof ModalConstructorDTO.CellListDTO) {
                obj = mapCellListDto((ModalConstructorDTO.CellListDTO) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        CommonCellSettings.LayoutPadding bottom;
        CommonCellSettings.LayoutPadding top;
        Intrinsics.checkNotNullParameter(state, "state");
        ModalConstructorDTO modalConstructorDTO = (ModalConstructorDTO) this.jsonDeserializer.fromJson(state.b(), ModalConstructorDTO.class);
        ArrayList arrayList = new ArrayList();
        VerticalPadding verticalPadding = modalConstructorDTO.getVerticalPadding();
        if (verticalPadding != null && (top = verticalPadding.getTop()) != null) {
            arrayList.add(new ModalConstructorDTO.Separator(top));
        }
        arrayList.addAll(mapItems(modalConstructorDTO.getItems()));
        VerticalPadding verticalPadding2 = modalConstructorDTO.getVerticalPadding();
        if (verticalPadding2 != null && (bottom = verticalPadding2.getBottom()) != null) {
            arrayList.add(new ModalConstructorDTO.Separator(bottom));
        }
        return arrayList;
    }
}
