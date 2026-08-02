package ru.ozon.app.android.cml.delivery.widgets.cellList.data;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.CmlCellListDTO;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.buttons.ButtonsDTO;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.cellList.CellListDTO;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.header.HeaderDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000eB\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/data/CmlCellListConfig;", "Lj20/a;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlCellListConfig implements InterfaceC7243a<List<? extends Object>> {

    @NotNull
    private final JsonParser deserializer;

    public CmlCellListConfig(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
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
        Intrinsics.checkNotNullParameter(state, "state");
        CmlCellListDTO cmlCellListDTO = (CmlCellListDTO) this.deserializer.fromJson(state.b(), CmlCellListDTO.class);
        CmlCellListDTO.SeparatorConfig islandSeparator = cmlCellListDTO.getIslandSeparator();
        IslandSeparatorDTO islandSeparatorDTO = islandSeparator != null ? new IslandSeparatorDTO(Integer.valueOf(islandSeparator.getHeight()), islandSeparator.getBackgroundColor(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null) : null;
        CmlCellListMoleculeDTO headerCellList = cmlCellListDTO.getHeaderCellList();
        HeaderDTO headerDTO = headerCellList != null ? new HeaderDTO(headerCellList) : null;
        CmlCellListMoleculeDTO cellList = cmlCellListDTO.getCellList();
        Map<String, TokenizedTrackingInfo> trackingInfo = cmlCellListDTO.getTrackingInfo();
        String c11 = state.c().c();
        CellListDTO cellListDTO = new CellListDTO(cellList, trackingInfo, c11 != null ? c11.hashCode() : 0);
        List<ButtonV3DTO> buttons = cmlCellListDTO.getButtons();
        ButtonsDTO buttonsDTO = buttons != null ? new ButtonsDTO(buttons, cmlCellListDTO.getButtonTopMargin()) : null;
        String backgroundColor = cmlCellListDTO.getCellList().getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        Object[] elements = {islandSeparatorDTO, headerDTO, cellListDTO, buttonsDTO, new SeparatorDTO(null, 16, backgroundColor)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }
}
