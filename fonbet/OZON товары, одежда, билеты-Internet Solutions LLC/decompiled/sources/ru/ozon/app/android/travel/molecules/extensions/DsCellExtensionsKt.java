package ru.ozon.app.android.travel.molecules.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"disableAutoToggle", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DsCellExtensionsKt {
    @NotNull
    public static final CellDTO disableAutoToggle(@NotNull CellDTO cellDTO) {
        Intrinsics.checkNotNullParameter(cellDTO, "<this>");
        CellDTO.Settings settings = cellDTO.getSettings();
        return CellDTO.copy$default(cellDTO, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : null, null, null, null, 29, null);
    }
}
