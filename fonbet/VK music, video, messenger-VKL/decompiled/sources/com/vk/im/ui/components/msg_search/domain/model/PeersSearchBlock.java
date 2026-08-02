package com.vk.im.ui.components.msg_search.domain.model;

import com.vk.im.ui.components.msg_search.domain.model.a;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.zrp;

/* compiled from: PeersSearchBlock.kt */
/* loaded from: classes2.dex */
public abstract class PeersSearchBlock {
    public final BlockType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PeersSearchBlock.kt */
    public static final class BlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockType[] $VALUES;
        public static final BlockType GLOBAL_SEARCH;
        public static final BlockType IMPORTANT;
        public static final BlockType RECENTS;
        public static final BlockType SEARCH_DIALOGS;
        public static final BlockType SEARCH_NO_VK_PHONEBOOK;

        static {
            BlockType blockType = new BlockType("IMPORTANT", 0);
            IMPORTANT = blockType;
            BlockType blockType2 = new BlockType("RECENTS", 1);
            RECENTS = blockType2;
            BlockType blockType3 = new BlockType("GLOBAL_SEARCH", 2);
            GLOBAL_SEARCH = blockType3;
            BlockType blockType4 = new BlockType("SEARCH_DIALOGS", 3);
            SEARCH_DIALOGS = blockType4;
            BlockType blockType5 = new BlockType("SEARCH_NO_VK_PHONEBOOK", 4);
            SEARCH_NO_VK_PHONEBOOK = blockType5;
            BlockType[] blockTypeArr = {blockType, blockType2, blockType3, blockType4, blockType5};
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

    /* compiled from: PeersSearchBlock.kt */
    public static final class a extends PeersSearchBlock {
        public final List<a.c> b;

        public a(List<a.c> list) {
            super(BlockType.GLOBAL_SEARCH);
            this.b = list;
        }

        @Override // com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock
        public final boolean a() {
            return this.b.isEmpty();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("GlobalSearchListBlock(globalPeers="), this.b);
        }
    }

    /* compiled from: PeersSearchBlock.kt */
    public static final class b extends PeersSearchBlock {
        public final List<a.d> b;

        public b(List<a.d> list) {
            super(BlockType.IMPORTANT);
            this.b = list;
        }

        @Override // com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock
        public final boolean a() {
            return this.b.isEmpty();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ImportantListBlock(importantPeers="), this.b);
        }
    }

    /* compiled from: PeersSearchBlock.kt */
    public static final class c extends PeersSearchBlock {
        public final List<a.b.C1154b> b;

        public c(List<a.b.C1154b> list) {
            super(BlockType.RECENTS);
            this.b = list;
        }

        @Override // com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock
        public final boolean a() {
            return this.b.isEmpty();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("RecentsListBlock(recentPeers="), this.b);
        }
    }

    /* compiled from: PeersSearchBlock.kt */
    public static final class d extends PeersSearchBlock {
        public final ArrayList b;

        public d(ArrayList arrayList) {
            super(BlockType.SEARCH_DIALOGS);
            this.b = arrayList;
        }

        @Override // com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock
        public final boolean a() {
            return this.b.isEmpty();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("SearchDialogsListBlock(dialogs="), this.b);
        }
    }

    /* compiled from: PeersSearchBlock.kt */
    public static final class e extends PeersSearchBlock {
        public final List<a.C1152a> b;

        public e(List<a.C1152a> list) {
            super(BlockType.SEARCH_NO_VK_PHONEBOOK);
            this.b = list;
        }

        @Override // com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock
        public final boolean a() {
            return this.b.isEmpty();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("SearchNoVkPhonebookListBlock(contacts="), this.b);
        }
    }

    public PeersSearchBlock(BlockType blockType) {
        this.a = blockType;
    }

    public abstract boolean a();
}
