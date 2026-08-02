package com.vk.profile.design.compose.user;

import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.s8u0;
import xsna.zrp;

/* compiled from: VkProfileFriendsAndFollowersInfo.kt */
/* loaded from: classes5.dex */
public final class FriendsAndFollowersBlockData {
    public final s8u0 a;
    public final s8u0 b;
    public final a c;
    public final BlockType d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkProfileFriendsAndFollowersInfo.kt */
    public static final class BlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockType[] $VALUES;
        public static final BlockType ALL_FRIENDS;
        public static final BlockType FOLLOWERS;
        public static final BlockType MUTUAL_FRIENDS;

        static {
            BlockType blockType = new BlockType("ALL_FRIENDS", 0);
            ALL_FRIENDS = blockType;
            BlockType blockType2 = new BlockType("MUTUAL_FRIENDS", 1);
            MUTUAL_FRIENDS = blockType2;
            BlockType blockType3 = new BlockType("FOLLOWERS", 2);
            FOLLOWERS = blockType3;
            BlockType[] blockTypeArr = {blockType, blockType2, blockType3};
            $VALUES = blockTypeArr;
            $ENTRIES = new asp(blockTypeArr);
        }

        public BlockType() {
            throw null;
        }

        public static BlockType valueOf(String str) {
            return (BlockType) Enum.valueOf(BlockType.class, str);
        }

        public static BlockType[] values() {
            return (BlockType[]) $VALUES.clone();
        }
    }

    /* compiled from: VkProfileFriendsAndFollowersInfo.kt */
    public static final class a {
        public final List<String> a;
        public final List<String> b;
        public final List<String> c;

        public a(List<String> list, List<String> list2, List<String> list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotoStackUrls(smallBlock=");
            sb.append(this.a);
            sb.append(", mediumBlock=");
            sb.append(this.b);
            sb.append(", largeBlock=");
            return ms9.a(')', sb, this.c);
        }
    }

    public FriendsAndFollowersBlockData(s8u0 s8u0Var, s8u0 s8u0Var2, a aVar, BlockType blockType, boolean z) {
        this.a = s8u0Var;
        this.b = s8u0Var2;
        this.c = aVar;
        this.d = blockType;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsAndFollowersBlockData)) {
            return false;
        }
        FriendsAndFollowersBlockData friendsAndFollowersBlockData = (FriendsAndFollowersBlockData) obj;
        return epx.f(this.a, friendsAndFollowersBlockData.a) && epx.f(this.b, friendsAndFollowersBlockData.b) && epx.f(this.c, friendsAndFollowersBlockData.c) && this.d == friendsAndFollowersBlockData.d && this.e == friendsAndFollowersBlockData.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s8u0 s8u0Var = this.b;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (s8u0Var == null ? 0 : s8u0Var.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsAndFollowersBlockData(firstLineText=");
        sb.append(this.a);
        sb.append(", secondLineText=");
        sb.append(this.b);
        sb.append(", photoStackUrls=");
        sb.append(this.c);
        sb.append(", blockType=");
        sb.append(this.d);
        sb.append(", isClickable=");
        return q0.a(sb, this.e, ')');
    }
}
