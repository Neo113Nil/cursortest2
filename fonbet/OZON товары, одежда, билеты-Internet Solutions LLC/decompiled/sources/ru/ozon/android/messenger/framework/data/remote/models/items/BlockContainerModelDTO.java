package ru.ozon.android.messenger.framework.data.remote.models.items;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/BlockContainerModelDTO;", "Lru/ozon/android/messenger/framework/data/remote/models/items/a;", "", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "blocks", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lru/ozon/android/messenger/framework/data/remote/models/items/BlockContainerModelDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBlocks", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BlockContainerModelDTO implements a {
    public static final int $stable = 0;
    private final List<BlockDTO> blocks;

    public BlockContainerModelDTO(List<BlockDTO> list) {
        this.blocks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockContainerModelDTO copy$default(BlockContainerModelDTO blockContainerModelDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = blockContainerModelDTO.blocks;
        }
        return blockContainerModelDTO.copy(list);
    }

    public final List<BlockDTO> component1() {
        return this.blocks;
    }

    @NotNull
    public final BlockContainerModelDTO copy(List<BlockDTO> blocks) {
        return new BlockContainerModelDTO(blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlockContainerModelDTO) && Intrinsics.d(this.blocks, ((BlockContainerModelDTO) other).blocks);
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.models.items.a
    public List<BlockDTO> getBlocks() {
        return this.blocks;
    }

    public int hashCode() {
        List<BlockDTO> list = this.blocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("BlockContainerModelDTO(blocks=", ")", this.blocks);
    }
}
