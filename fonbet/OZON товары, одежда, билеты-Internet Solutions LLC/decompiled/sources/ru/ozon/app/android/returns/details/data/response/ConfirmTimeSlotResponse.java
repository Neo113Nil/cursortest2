package ru.ozon.app.android.returns.details.data.response;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/details/data/response/ConfirmTimeSlotResponse;", "", "nextAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "message", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getNextAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getMessage", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ConfirmTimeSlotResponse {
    public static final int $stable = OzonSpannableString.$stable;

    @NotNull
    private final OzonSpannableString message;
    private final AtomActionDTO nextAction;

    public ConfirmTimeSlotResponse(AtomActionDTO atomActionDTO, @NotNull OzonSpannableString message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.nextAction = atomActionDTO;
        this.message = message;
    }

    public static /* synthetic */ ConfirmTimeSlotResponse copy$default(ConfirmTimeSlotResponse confirmTimeSlotResponse, AtomActionDTO atomActionDTO, OzonSpannableString ozonSpannableString, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = confirmTimeSlotResponse.nextAction;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = confirmTimeSlotResponse.message;
        }
        return confirmTimeSlotResponse.copy(atomActionDTO, ozonSpannableString);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getMessage() {
        return this.message;
    }

    @NotNull
    public final ConfirmTimeSlotResponse copy(AtomActionDTO nextAction, @NotNull OzonSpannableString message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ConfirmTimeSlotResponse(nextAction, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmTimeSlotResponse)) {
            return false;
        }
        ConfirmTimeSlotResponse confirmTimeSlotResponse = (ConfirmTimeSlotResponse) other;
        return Intrinsics.d(this.nextAction, confirmTimeSlotResponse.nextAction) && Intrinsics.d(this.message, confirmTimeSlotResponse.message);
    }

    @NotNull
    public final OzonSpannableString getMessage() {
        return this.message;
    }

    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.nextAction;
        return this.message.hashCode() + ((atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "ConfirmTimeSlotResponse(nextAction=" + this.nextAction + ", message=" + ((Object) this.message) + ")";
    }
}
