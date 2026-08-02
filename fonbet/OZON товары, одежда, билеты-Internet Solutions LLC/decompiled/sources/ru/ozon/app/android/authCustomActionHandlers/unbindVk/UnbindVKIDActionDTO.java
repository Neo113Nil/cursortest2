package ru.ozon.app.android.authCustomActionHandlers.unbindVk;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.authCustomActionHandlers.email.ActionDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/authCustomActionHandlers/unbindVk/UnbindVKIDActionDTO;", "", "message", "Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getMessage", "()Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UnbindVKIDActionDTO {
    private final AtomActionDTO action;
    private final ActionDTO.MessageDTO message;

    public UnbindVKIDActionDTO(ActionDTO.MessageDTO messageDTO, AtomActionDTO atomActionDTO) {
        this.message = messageDTO;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ UnbindVKIDActionDTO copy$default(UnbindVKIDActionDTO unbindVKIDActionDTO, ActionDTO.MessageDTO messageDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messageDTO = unbindVKIDActionDTO.message;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = unbindVKIDActionDTO.action;
        }
        return unbindVKIDActionDTO.copy(messageDTO, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionDTO.MessageDTO getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final UnbindVKIDActionDTO copy(ActionDTO.MessageDTO message, AtomActionDTO action) {
        return new UnbindVKIDActionDTO(message, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnbindVKIDActionDTO)) {
            return false;
        }
        UnbindVKIDActionDTO unbindVKIDActionDTO = (UnbindVKIDActionDTO) other;
        return Intrinsics.d(this.message, unbindVKIDActionDTO.message) && Intrinsics.d(this.action, unbindVKIDActionDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final ActionDTO.MessageDTO getMessage() {
        return this.message;
    }

    public int hashCode() {
        ActionDTO.MessageDTO messageDTO = this.message;
        int hashCode = (messageDTO == null ? 0 : messageDTO.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnbindVKIDActionDTO(message=" + this.message + ", action=" + this.action + ")";
    }
}
