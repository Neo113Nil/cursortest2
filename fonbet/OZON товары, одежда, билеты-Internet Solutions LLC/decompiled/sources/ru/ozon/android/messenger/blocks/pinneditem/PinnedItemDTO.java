package ru.ozon.android.messenger.blocks.pinneditem;

import B90.C2618u;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/blocks/pinneditem/PinnedItemDTO;", "", "block", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "messageId", "", "rightButtons", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;Ljava/lang/String;Ljava/util/List;)V", "getBlock", "()Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "getMessageId", "()Ljava/lang/String;", "getRightButtons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PinnedItemDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final BlockDTO block;
    private final String messageId;
    private final List<IconButtonV3DTO> rightButtons;

    public PinnedItemDTO(@NotNull BlockDTO block, String str, List<IconButtonV3DTO> list) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
        this.messageId = str;
        this.rightButtons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PinnedItemDTO copy$default(PinnedItemDTO pinnedItemDTO, BlockDTO blockDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            blockDTO = pinnedItemDTO.block;
        }
        if ((i11 & 2) != 0) {
            str = pinnedItemDTO.messageId;
        }
        if ((i11 & 4) != 0) {
            list = pinnedItemDTO.rightButtons;
        }
        return pinnedItemDTO.copy(blockDTO, str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlockDTO getBlock() {
        return this.block;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public final List<IconButtonV3DTO> component3() {
        return this.rightButtons;
    }

    @NotNull
    public final PinnedItemDTO copy(@NotNull BlockDTO block, String messageId, List<IconButtonV3DTO> rightButtons) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new PinnedItemDTO(block, messageId, rightButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedItemDTO)) {
            return false;
        }
        PinnedItemDTO pinnedItemDTO = (PinnedItemDTO) other;
        return Intrinsics.d(this.block, pinnedItemDTO.block) && Intrinsics.d(this.messageId, pinnedItemDTO.messageId) && Intrinsics.d(this.rightButtons, pinnedItemDTO.rightButtons);
    }

    @NotNull
    public final BlockDTO getBlock() {
        return this.block;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final List<IconButtonV3DTO> getRightButtons() {
        return this.rightButtons;
    }

    public int hashCode() {
        int hashCode = this.block.hashCode() * 31;
        String str = this.messageId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<IconButtonV3DTO> list = this.rightButtons;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BlockDTO blockDTO = this.block;
        String str = this.messageId;
        List<IconButtonV3DTO> list = this.rightButtons;
        StringBuilder sb2 = new StringBuilder("PinnedItemDTO(block=");
        sb2.append(blockDTO);
        sb2.append(", messageId=");
        sb2.append(str);
        sb2.append(", rightButtons=");
        return C2618u.h(sb2, list, ")");
    }
}
