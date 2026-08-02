package ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/hiddenQueryServicesManager/data/HiddenQueryServicesManagerDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "error", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HiddenQueryServicesManagerDTO {
    public static final int $stable = 0;
    private final AtomActionDTO action;
    private final String error;

    public HiddenQueryServicesManagerDTO(AtomActionDTO atomActionDTO, String str) {
        this.action = atomActionDTO;
        this.error = str;
    }

    public static /* synthetic */ HiddenQueryServicesManagerDTO copy$default(HiddenQueryServicesManagerDTO hiddenQueryServicesManagerDTO, AtomActionDTO atomActionDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = hiddenQueryServicesManagerDTO.action;
        }
        if ((i11 & 2) != 0) {
            str = hiddenQueryServicesManagerDTO.error;
        }
        return hiddenQueryServicesManagerDTO.copy(atomActionDTO, str);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final HiddenQueryServicesManagerDTO copy(AtomActionDTO action, String error) {
        return new HiddenQueryServicesManagerDTO(action, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HiddenQueryServicesManagerDTO)) {
            return false;
        }
        HiddenQueryServicesManagerDTO hiddenQueryServicesManagerDTO = (HiddenQueryServicesManagerDTO) other;
        return Intrinsics.d(this.action, hiddenQueryServicesManagerDTO.action) && Intrinsics.d(this.error, hiddenQueryServicesManagerDTO.error);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        String str = this.error;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HiddenQueryServicesManagerDTO(action=" + this.action + ", error=" + this.error + ")";
    }
}
