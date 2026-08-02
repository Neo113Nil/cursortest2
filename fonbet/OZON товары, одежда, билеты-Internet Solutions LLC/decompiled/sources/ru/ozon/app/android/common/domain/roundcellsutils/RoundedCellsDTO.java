package ru.ozon.app.android.common.domain.roundcellsutils;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsDTO;", "", "widgetBackgroundColor", "", "cellsBackgroundColor", "cells", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getWidgetBackgroundColor", "()Ljava/lang/String;", "getCellsBackgroundColor", "getCells", "()Ljava/util/List;", "round-cells-utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoundedCellsDTO {

    @NotNull
    private final List<AtomDTO> cells;
    private final String cellsBackgroundColor;
    private final String widgetBackgroundColor;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedCellsDTO(String str, String str2, @NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.widgetBackgroundColor = str;
        this.cellsBackgroundColor = str2;
        this.cells = cells;
    }

    @NotNull
    public final List<AtomDTO> getCells() {
        return this.cells;
    }

    public final String getCellsBackgroundColor() {
        return this.cellsBackgroundColor;
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }
}
