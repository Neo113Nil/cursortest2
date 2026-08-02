package ru.ozon.app.android.checkoutcomposer.rfbsSplitHeader.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/data/RfbsSplitHeaderDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "stickyGroupTag", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getStickyGroupTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RfbsSplitHeaderDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final TextAtom header;
    private final String stickyGroupTag;

    public RfbsSplitHeaderDTO(@NotNull TextAtom header, String str) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        this.stickyGroupTag = str;
    }

    public static /* synthetic */ RfbsSplitHeaderDTO copy$default(RfbsSplitHeaderDTO rfbsSplitHeaderDTO, TextAtom textAtom, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = rfbsSplitHeaderDTO.header;
        }
        if ((i11 & 2) != 0) {
            str = rfbsSplitHeaderDTO.stickyGroupTag;
        }
        return rfbsSplitHeaderDTO.copy(textAtom, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStickyGroupTag() {
        return this.stickyGroupTag;
    }

    @NotNull
    public final RfbsSplitHeaderDTO copy(@NotNull TextAtom header, String stickyGroupTag) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new RfbsSplitHeaderDTO(header, stickyGroupTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RfbsSplitHeaderDTO)) {
            return false;
        }
        RfbsSplitHeaderDTO rfbsSplitHeaderDTO = (RfbsSplitHeaderDTO) other;
        return Intrinsics.d(this.header, rfbsSplitHeaderDTO.header) && Intrinsics.d(this.stickyGroupTag, rfbsSplitHeaderDTO.stickyGroupTag);
    }

    @NotNull
    public final TextAtom getHeader() {
        return this.header;
    }

    public final String getStickyGroupTag() {
        return this.stickyGroupTag;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        String str = this.stickyGroupTag;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "RfbsSplitHeaderDTO(header=" + this.header + ", stickyGroupTag=" + this.stickyGroupTag + ")";
    }

    public /* synthetic */ RfbsSplitHeaderDTO(TextAtom textAtom, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, (i11 & 2) != 0 ? null : str);
    }
}
