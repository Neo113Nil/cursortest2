package com.vk.im.engine.internal.api_commands.friends;

import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.a;
import xsna.asp;
import xsna.bz2;
import xsna.epx;
import xsna.l7r0;
import xsna.nts;
import xsna.nx2;
import xsna.ots;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: FriendsAddApiCmd.kt */
/* loaded from: classes2.dex */
public final class FriendsAddApiCmd extends nx2<Integer> {
    public final Peer b;
    public final String c = "";
    public final boolean d;
    public final Source e;
    public final BlockType f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsAddApiCmd.kt */
    public static final class BlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockType[] $VALUES;
        public static final BlockType NONE;
        public static final BlockType PRIVATE_USER_BUTTON;
        private final String type;

        static {
            BlockType blockType = new BlockType("PRIVATE_USER_BUTTON", 0, "private_user_button");
            PRIVATE_USER_BUTTON = blockType;
            BlockType blockType2 = new BlockType("NONE", 1, "");
            NONE = blockType2;
            BlockType[] blockTypeArr = {blockType, blockType2};
            $VALUES = blockTypeArr;
            $ENTRIES = new asp(blockTypeArr);
        }

        public BlockType(String str, int i, String str2) {
            this.type = str2;
        }

        public static BlockType valueOf(String str) {
            return (BlockType) Enum.valueOf(BlockType.class, str);
        }

        public static BlockType[] values() {
            return (BlockType[]) $VALUES.clone();
        }

        public final String h() {
            if (this == NONE) {
                return null;
            }
            return this.type;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsAddApiCmd.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source IM;
        public static final Source NONE;
        private final String value;

        static {
            Source source = new Source("IM", 0, "im");
            IM = source;
            Source source2 = new Source("NONE", 1, "");
            NONE = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source(String str, int i, String str2) {
            this.value = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }

        public final String h() {
            if (this == NONE) {
                return null;
            }
            return this.value;
        }
    }

    public FriendsAddApiCmd(Peer peer, boolean z, Source source, BlockType blockType) {
        this.b = peer;
        this.d = z;
        this.e = source;
        this.f = blockType;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalStateException("Expect only users as a peer");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsAddApiCmd)) {
            return false;
        }
        FriendsAddApiCmd friendsAddApiCmd = (FriendsAddApiCmd) obj;
        return epx.f(this.b, friendsAddApiCmd.b) && epx.f(this.c, friendsAddApiCmd.c) && this.d == friendsAddApiCmd.d && this.e == friendsAddApiCmd.e && this.f == friendsAddApiCmd.f;
    }

    @Override // xsna.nx2
    public final Integer f(l7r0 l7r0Var) {
        return Integer.valueOf(((FriendsAddResponseDto) bz2.l(nts.d(new ots(), a.b(this.b), null, null, this.e.h(), this.f.h(), null, null, 102), this.d)).i());
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + qoy.b(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        return "FriendsAddApiCmd(peer=" + this.b + ", text=" + this.c + ", isAwaitNetwork=" + this.d + ", source=" + this.e + ", blockType=" + this.f + ')';
    }
}
