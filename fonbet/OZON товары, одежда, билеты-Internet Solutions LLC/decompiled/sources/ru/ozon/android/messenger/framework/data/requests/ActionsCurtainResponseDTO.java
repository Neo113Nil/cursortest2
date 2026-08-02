package ru.ozon.android.messenger.framework.data.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.ActionCurtainDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/ActionsCurtainResponseDTO;", "", "data", "Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;)V", "getData", "()Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActionsCurtainResponseDTO {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final ActionCurtainDTO data;

    public ActionsCurtainResponseDTO(@NotNull ActionCurtainDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ ActionsCurtainResponseDTO copy$default(ActionsCurtainResponseDTO actionsCurtainResponseDTO, ActionCurtainDTO actionCurtainDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actionCurtainDTO = actionsCurtainResponseDTO.data;
        }
        return actionsCurtainResponseDTO.copy(actionCurtainDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActionCurtainDTO getData() {
        return this.data;
    }

    @NotNull
    public final ActionsCurtainResponseDTO copy(@NotNull ActionCurtainDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ActionsCurtainResponseDTO(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionsCurtainResponseDTO) && Intrinsics.d(this.data, ((ActionsCurtainResponseDTO) other).data);
    }

    @NotNull
    public final ActionCurtainDTO getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActionsCurtainResponseDTO(data=" + this.data + ")";
    }
}
