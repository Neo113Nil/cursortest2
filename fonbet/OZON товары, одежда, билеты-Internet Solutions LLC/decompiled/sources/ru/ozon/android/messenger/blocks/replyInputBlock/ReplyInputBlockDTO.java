package ru.ozon.android.messenger.blocks.replyInputBlock;

import El.C2971a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/android/messenger/blocks/replyInputBlock/ReplyInputBlockDTO;", "", "separator", "Lru/ozon/android/messenger/blocks/replyInputBlock/SeparatorDTO;", "leftIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "messageMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "titleAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitleAtom", "closeIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "localMessageBlock", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "<init>", "(Lru/ozon/android/messenger/blocks/replyInputBlock/SeparatorDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;)V", "getSeparator", "()Lru/ozon/android/messenger/blocks/replyInputBlock/SeparatorDTO;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getMessageMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitleAtom", "getCloseIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getLocalMessageBlock", "()Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ReplyInputBlockDTO {
    public static final int $stable = (IconButtonV3DTO.$stable | ProductMediaDTO.$stable) | IconDTO.$stable;

    @NotNull
    private final IconButtonV3DTO closeIconButton;

    @NotNull
    private final IconDTO leftIcon;
    private final BlockDTO localMessageBlock;
    private final ProductMediaDTO messageMedia;
    private final SeparatorDTO separator;

    @NotNull
    private final TextDTO subtitleAtom;

    @NotNull
    private final TextDTO titleAtom;

    public ReplyInputBlockDTO(SeparatorDTO separatorDTO, @NotNull IconDTO leftIcon, ProductMediaDTO productMediaDTO, @NotNull TextDTO titleAtom, @NotNull TextDTO subtitleAtom, @NotNull IconButtonV3DTO closeIconButton, BlockDTO blockDTO) {
        Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(subtitleAtom, "subtitleAtom");
        Intrinsics.checkNotNullParameter(closeIconButton, "closeIconButton");
        this.separator = separatorDTO;
        this.leftIcon = leftIcon;
        this.messageMedia = productMediaDTO;
        this.titleAtom = titleAtom;
        this.subtitleAtom = subtitleAtom;
        this.closeIconButton = closeIconButton;
        this.localMessageBlock = blockDTO;
    }

    public static /* synthetic */ ReplyInputBlockDTO copy$default(ReplyInputBlockDTO replyInputBlockDTO, SeparatorDTO separatorDTO, IconDTO iconDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, BlockDTO blockDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            separatorDTO = replyInputBlockDTO.separator;
        }
        if ((i11 & 2) != 0) {
            iconDTO = replyInputBlockDTO.leftIcon;
        }
        if ((i11 & 4) != 0) {
            productMediaDTO = replyInputBlockDTO.messageMedia;
        }
        if ((i11 & 8) != 0) {
            textDTO = replyInputBlockDTO.titleAtom;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = replyInputBlockDTO.subtitleAtom;
        }
        if ((i11 & 32) != 0) {
            iconButtonV3DTO = replyInputBlockDTO.closeIconButton;
        }
        if ((i11 & 64) != 0) {
            blockDTO = replyInputBlockDTO.localMessageBlock;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        BlockDTO blockDTO2 = blockDTO;
        TextDTO textDTO3 = textDTO2;
        ProductMediaDTO productMediaDTO2 = productMediaDTO;
        return replyInputBlockDTO.copy(separatorDTO, iconDTO, productMediaDTO2, textDTO, textDTO3, iconButtonV3DTO2, blockDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final SeparatorDTO getSeparator() {
        return this.separator;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconDTO getLeftIcon() {
        return this.leftIcon;
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

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitleAtom() {
        return this.subtitleAtom;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final IconButtonV3DTO getCloseIconButton() {
        return this.closeIconButton;
    }

    /* renamed from: component7, reason: from getter */
    public final BlockDTO getLocalMessageBlock() {
        return this.localMessageBlock;
    }

    @NotNull
    public final ReplyInputBlockDTO copy(SeparatorDTO separator, @NotNull IconDTO leftIcon, ProductMediaDTO messageMedia, @NotNull TextDTO titleAtom, @NotNull TextDTO subtitleAtom, @NotNull IconButtonV3DTO closeIconButton, BlockDTO localMessageBlock) {
        Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(subtitleAtom, "subtitleAtom");
        Intrinsics.checkNotNullParameter(closeIconButton, "closeIconButton");
        return new ReplyInputBlockDTO(separator, leftIcon, messageMedia, titleAtom, subtitleAtom, closeIconButton, localMessageBlock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyInputBlockDTO)) {
            return false;
        }
        ReplyInputBlockDTO replyInputBlockDTO = (ReplyInputBlockDTO) other;
        return Intrinsics.d(this.separator, replyInputBlockDTO.separator) && Intrinsics.d(this.leftIcon, replyInputBlockDTO.leftIcon) && Intrinsics.d(this.messageMedia, replyInputBlockDTO.messageMedia) && Intrinsics.d(this.titleAtom, replyInputBlockDTO.titleAtom) && Intrinsics.d(this.subtitleAtom, replyInputBlockDTO.subtitleAtom) && Intrinsics.d(this.closeIconButton, replyInputBlockDTO.closeIconButton) && Intrinsics.d(this.localMessageBlock, replyInputBlockDTO.localMessageBlock);
    }

    @NotNull
    public final IconButtonV3DTO getCloseIconButton() {
        return this.closeIconButton;
    }

    @NotNull
    public final IconDTO getLeftIcon() {
        return this.leftIcon;
    }

    public final BlockDTO getLocalMessageBlock() {
        return this.localMessageBlock;
    }

    public final ProductMediaDTO getMessageMedia() {
        return this.messageMedia;
    }

    public final SeparatorDTO getSeparator() {
        return this.separator;
    }

    @NotNull
    public final TextDTO getSubtitleAtom() {
        return this.subtitleAtom;
    }

    @NotNull
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public int hashCode() {
        SeparatorDTO separatorDTO = this.separator;
        int a11 = C2971a.a(this.leftIcon, (separatorDTO == null ? 0 : separatorDTO.hashCode()) * 31, 31);
        ProductMediaDTO productMediaDTO = this.messageMedia;
        int c11 = GR.b.c(this.closeIconButton, Ns.b.a(this.subtitleAtom, Ns.b.a(this.titleAtom, (a11 + (productMediaDTO == null ? 0 : productMediaDTO.hashCode())) * 31, 31), 31), 31);
        BlockDTO blockDTO = this.localMessageBlock;
        return c11 + (blockDTO != null ? blockDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReplyInputBlockDTO(separator=" + this.separator + ", leftIcon=" + this.leftIcon + ", messageMedia=" + this.messageMedia + ", titleAtom=" + this.titleAtom + ", subtitleAtom=" + this.subtitleAtom + ", closeIconButton=" + this.closeIconButton + ", localMessageBlock=" + this.localMessageBlock + ")";
    }
}
