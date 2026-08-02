package ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction;

import Pk0.a;
import Ql.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;", "", "message", "", "nextAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "success", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Z)V", "getMessage", "()Ljava/lang/String;", "getNextAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProcessReturnActionResponseDto {
    public static final int $stable = 0;
    private final String message;
    private final AtomActionDTO nextAction;
    private final boolean success;

    public ProcessReturnActionResponseDto(@i(name = "message") String str, @i(name = "nextAction") AtomActionDTO atomActionDTO, @i(name = "success") boolean z11) {
        this.message = str;
        this.nextAction = atomActionDTO;
        this.success = z11;
    }

    public static /* synthetic */ ProcessReturnActionResponseDto copy$default(ProcessReturnActionResponseDto processReturnActionResponseDto, String str, AtomActionDTO atomActionDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = processReturnActionResponseDto.message;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = processReturnActionResponseDto.nextAction;
        }
        if ((i11 & 4) != 0) {
            z11 = processReturnActionResponseDto.success;
        }
        return processReturnActionResponseDto.copy(str, atomActionDTO, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final ProcessReturnActionResponseDto copy(@i(name = "message") String message, @i(name = "nextAction") AtomActionDTO nextAction, @i(name = "success") boolean success) {
        return new ProcessReturnActionResponseDto(message, nextAction, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessReturnActionResponseDto)) {
            return false;
        }
        ProcessReturnActionResponseDto processReturnActionResponseDto = (ProcessReturnActionResponseDto) other;
        return Intrinsics.d(this.message, processReturnActionResponseDto.message) && Intrinsics.d(this.nextAction, processReturnActionResponseDto.nextAction) && this.success == processReturnActionResponseDto.success;
    }

    public final String getMessage() {
        return this.message;
    }

    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.nextAction;
        return Boolean.hashCode(this.success) + ((hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.message;
        AtomActionDTO atomActionDTO = this.nextAction;
        return a.a(")", c.c("ProcessReturnActionResponseDto(message=", str, ", nextAction=", atomActionDTO, ", success="), this.success);
    }

    public /* synthetic */ ProcessReturnActionResponseDto(String str, AtomActionDTO atomActionDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, atomActionDTO, (i11 & 4) != 0 ? false : z11);
    }
}
