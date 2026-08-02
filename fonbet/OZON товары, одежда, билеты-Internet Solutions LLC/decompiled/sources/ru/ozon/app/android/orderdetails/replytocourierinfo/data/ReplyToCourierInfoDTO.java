package ru.ozon.app.android.orderdetails.replytocourierinfo.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/replytocourierinfo/data/ReplyToCourierInfoDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/AtomDTO;", "description", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getHeader", "()Ljava/util/List;", "getDescription", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReplyToCourierInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomDTO description;

    @NotNull
    private final List<AtomDTO> header;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyToCourierInfoDTO(@NotNull List<? extends AtomDTO> header, @NotNull AtomDTO description) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(description, "description");
        this.header = header;
        this.description = description;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReplyToCourierInfoDTO copy$default(ReplyToCourierInfoDTO replyToCourierInfoDTO, List list, AtomDTO atomDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = replyToCourierInfoDTO.header;
        }
        if ((i11 & 2) != 0) {
            atomDTO = replyToCourierInfoDTO.description;
        }
        return replyToCourierInfoDTO.copy(list, atomDTO);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final ReplyToCourierInfoDTO copy(@NotNull List<? extends AtomDTO> header, @NotNull AtomDTO description) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ReplyToCourierInfoDTO(header, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyToCourierInfoDTO)) {
            return false;
        }
        ReplyToCourierInfoDTO replyToCourierInfoDTO = (ReplyToCourierInfoDTO) other;
        return Intrinsics.d(this.header, replyToCourierInfoDTO.header) && Intrinsics.d(this.description, replyToCourierInfoDTO.description);
    }

    @NotNull
    public final AtomDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final List<AtomDTO> getHeader() {
        return this.header;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.header.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ReplyToCourierInfoDTO(header=" + this.header + ", description=" + this.description + ")";
    }
}
