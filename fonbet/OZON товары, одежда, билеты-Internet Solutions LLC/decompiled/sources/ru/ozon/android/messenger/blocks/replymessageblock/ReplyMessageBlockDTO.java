package ru.ozon.android.messenger.blocks.replymessageblock;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/blocks/replymessageblock/ReplyMessageBlockDTO;", "", "replyMessageId", "", "verticalLineStyle", "Lru/ozon/android/messenger/blocks/replymessageblock/VerticalLineStyleDTO;", "messageMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "titleAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitleAtom", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/blocks/replymessageblock/VerticalLineStyleDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getReplyMessageId", "()Ljava/lang/String;", "getVerticalLineStyle", "()Lru/ozon/android/messenger/blocks/replymessageblock/VerticalLineStyleDTO;", "getMessageMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitleAtom", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ReplyMessageBlockDTO {
    public static final int $stable = ProductMediaDTO.$stable;
    private final ProductMediaDTO messageMedia;
    private final String replyMessageId;
    private final TextDTO subtitleAtom;

    @NotNull
    private final TextDTO titleAtom;
    private final VerticalLineStyleDTO verticalLineStyle;

    public ReplyMessageBlockDTO(String str, VerticalLineStyleDTO verticalLineStyleDTO, ProductMediaDTO productMediaDTO, @NotNull TextDTO titleAtom, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        this.replyMessageId = str;
        this.verticalLineStyle = verticalLineStyleDTO;
        this.messageMedia = productMediaDTO;
        this.titleAtom = titleAtom;
        this.subtitleAtom = textDTO;
    }

    public static /* synthetic */ ReplyMessageBlockDTO copy$default(ReplyMessageBlockDTO replyMessageBlockDTO, String str, VerticalLineStyleDTO verticalLineStyleDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = replyMessageBlockDTO.replyMessageId;
        }
        if ((i11 & 2) != 0) {
            verticalLineStyleDTO = replyMessageBlockDTO.verticalLineStyle;
        }
        if ((i11 & 4) != 0) {
            productMediaDTO = replyMessageBlockDTO.messageMedia;
        }
        if ((i11 & 8) != 0) {
            textDTO = replyMessageBlockDTO.titleAtom;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = replyMessageBlockDTO.subtitleAtom;
        }
        TextDTO textDTO3 = textDTO2;
        ProductMediaDTO productMediaDTO2 = productMediaDTO;
        return replyMessageBlockDTO.copy(str, verticalLineStyleDTO, productMediaDTO2, textDTO, textDTO3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReplyMessageId() {
        return this.replyMessageId;
    }

    /* renamed from: component2, reason: from getter */
    public final VerticalLineStyleDTO getVerticalLineStyle() {
        return this.verticalLineStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final ProductMediaDTO getMessageMedia() {
        return this.messageMedia;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitleAtom() {
        return this.subtitleAtom;
    }

    @NotNull
    public final ReplyMessageBlockDTO copy(String replyMessageId, VerticalLineStyleDTO verticalLineStyle, ProductMediaDTO messageMedia, @NotNull TextDTO titleAtom, TextDTO subtitleAtom) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        return new ReplyMessageBlockDTO(replyMessageId, verticalLineStyle, messageMedia, titleAtom, subtitleAtom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyMessageBlockDTO)) {
            return false;
        }
        ReplyMessageBlockDTO replyMessageBlockDTO = (ReplyMessageBlockDTO) other;
        return Intrinsics.d(this.replyMessageId, replyMessageBlockDTO.replyMessageId) && Intrinsics.d(this.verticalLineStyle, replyMessageBlockDTO.verticalLineStyle) && Intrinsics.d(this.messageMedia, replyMessageBlockDTO.messageMedia) && Intrinsics.d(this.titleAtom, replyMessageBlockDTO.titleAtom) && Intrinsics.d(this.subtitleAtom, replyMessageBlockDTO.subtitleAtom);
    }

    public final ProductMediaDTO getMessageMedia() {
        return this.messageMedia;
    }

    public final String getReplyMessageId() {
        return this.replyMessageId;
    }

    public final TextDTO getSubtitleAtom() {
        return this.subtitleAtom;
    }

    @NotNull
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public final VerticalLineStyleDTO getVerticalLineStyle() {
        return this.verticalLineStyle;
    }

    public int hashCode() {
        String str = this.replyMessageId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        VerticalLineStyleDTO verticalLineStyleDTO = this.verticalLineStyle;
        int hashCode2 = (hashCode + (verticalLineStyleDTO == null ? 0 : verticalLineStyleDTO.hashCode())) * 31;
        ProductMediaDTO productMediaDTO = this.messageMedia;
        int a11 = Ns.b.a(this.titleAtom, (hashCode2 + (productMediaDTO == null ? 0 : productMediaDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitleAtom;
        return a11 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.replyMessageId;
        VerticalLineStyleDTO verticalLineStyleDTO = this.verticalLineStyle;
        ProductMediaDTO productMediaDTO = this.messageMedia;
        TextDTO textDTO = this.titleAtom;
        TextDTO textDTO2 = this.subtitleAtom;
        StringBuilder sb2 = new StringBuilder("ReplyMessageBlockDTO(replyMessageId=");
        sb2.append(str);
        sb2.append(", verticalLineStyle=");
        sb2.append(verticalLineStyleDTO);
        sb2.append(", messageMedia=");
        sb2.append(productMediaDTO);
        sb2.append(", titleAtom=");
        sb2.append(textDTO);
        sb2.append(", subtitleAtom=");
        return Tl.b.e(sb2, textDTO2, ")");
    }
}
