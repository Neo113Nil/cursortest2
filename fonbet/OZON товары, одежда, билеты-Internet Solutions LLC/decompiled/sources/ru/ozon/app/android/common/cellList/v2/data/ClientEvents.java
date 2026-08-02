package ru.ozon.app.android.common.cellList.v2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/data/ClientEvents;", "", "eventKey", "", "eventAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getEventKey", "()Ljava/lang/String;", "getEventAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cell-list_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ClientEvents {

    @NotNull
    private final AtomActionDTO eventAction;

    @NotNull
    private final String eventKey;

    public ClientEvents(@NotNull String eventKey, @NotNull AtomActionDTO eventAction) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(eventAction, "eventAction");
        this.eventKey = eventKey;
        this.eventAction = eventAction;
    }

    public static /* synthetic */ ClientEvents copy$default(ClientEvents clientEvents, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clientEvents.eventKey;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = clientEvents.eventAction;
        }
        return clientEvents.copy(str, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventKey() {
        return this.eventKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getEventAction() {
        return this.eventAction;
    }

    @NotNull
    public final ClientEvents copy(@NotNull String eventKey, @NotNull AtomActionDTO eventAction) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(eventAction, "eventAction");
        return new ClientEvents(eventKey, eventAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientEvents)) {
            return false;
        }
        ClientEvents clientEvents = (ClientEvents) other;
        return Intrinsics.d(this.eventKey, clientEvents.eventKey) && Intrinsics.d(this.eventAction, clientEvents.eventAction);
    }

    @NotNull
    public final AtomActionDTO getEventAction() {
        return this.eventAction;
    }

    @NotNull
    public final String getEventKey() {
        return this.eventKey;
    }

    public int hashCode() {
        return this.eventAction.hashCode() + (this.eventKey.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ClientEvents(eventKey=" + this.eventKey + ", eventAction=" + this.eventAction + ")";
    }
}
