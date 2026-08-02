package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;", "", "cells", "", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getCells", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoPushEnableDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final List<PromoPushEnableCellDTO> cells;

    public PromoPushEnableDTO(@NotNull List<PromoPushEnableCellDTO> cells, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(button, "button");
        this.cells = cells;
        this.button = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoPushEnableDTO copy$default(PromoPushEnableDTO promoPushEnableDTO, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = promoPushEnableDTO.cells;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = promoPushEnableDTO.button;
        }
        return promoPushEnableDTO.copy(list, buttonV3DTO);
    }

    @NotNull
    public final List<PromoPushEnableCellDTO> component1() {
        return this.cells;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final PromoPushEnableDTO copy(@NotNull List<PromoPushEnableCellDTO> cells, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(button, "button");
        return new PromoPushEnableDTO(cells, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoPushEnableDTO)) {
            return false;
        }
        PromoPushEnableDTO promoPushEnableDTO = (PromoPushEnableDTO) other;
        return Intrinsics.d(this.cells, promoPushEnableDTO.cells) && Intrinsics.d(this.button, promoPushEnableDTO.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<PromoPushEnableCellDTO> getCells() {
        return this.cells;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.cells.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PromoPushEnableDTO(cells=" + this.cells + ", button=" + this.button + ")";
    }
}
