package ru.ozon.app.android.messenger.widgets.chatList.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/messenger/widgets/chatList/data/ChatListDTO;", "", "blocks", "", "<init>", "(Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChatListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> blocks;

    public ChatListDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "islandSeparatorBlock", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "cellListBlock", type = CellListV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatListDTO copy$default(ChatListDTO chatListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = chatListDTO.blocks;
        }
        return chatListDTO.copy(list);
    }

    @NotNull
    public final List<Object> component1() {
        return this.blocks;
    }

    @NotNull
    public final ChatListDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "islandSeparatorBlock", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "cellListBlock", type = CellListV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new ChatListDTO(blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChatListDTO) && Intrinsics.d(this.blocks, ((ChatListDTO) other).blocks);
    }

    @NotNull
    public final List<Object> getBlocks() {
        return this.blocks;
    }

    public int hashCode() {
        return this.blocks.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ChatListDTO(blocks=", ")", this.blocks);
    }
}
