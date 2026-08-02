package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeBackgroundItem implements SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("is_in_background")
    private final boolean isInBackground;

    @pmi0("type")
    private final Type type;

    @pmi0("type_video_background_listening_item")
    private final SchemeStat$TypeVideoBackgroundListeningItem typeVideoBackgroundListeningItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_video_background_listening_item")
        public static final Type TYPE_VIDEO_BACKGROUND_LISTENING_ITEM;

        static {
            Type type = new Type("TYPE_VIDEO_BACKGROUND_LISTENING_ITEM", 0);
            TYPE_VIDEO_BACKGROUND_LISTENING_ITEM = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class a {
        public static SchemeStat$TypeBackgroundItem a(boolean z, b bVar) {
            if (bVar instanceof SchemeStat$TypeVideoBackgroundListeningItem) {
                return new SchemeStat$TypeBackgroundItem(z, Type.TYPE_VIDEO_BACKGROUND_LISTENING_ITEM, (SchemeStat$TypeVideoBackgroundListeningItem) bVar, null);
            }
            throw new IllegalArgumentException("payload must be one of(TypeVideoBackgroundListeningItem)");
        }
    }

    /* compiled from: SchemeStat.kt */
    public interface b {
    }

    public /* synthetic */ SchemeStat$TypeBackgroundItem(boolean z, Type type, SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem, zcl zclVar) {
        this(z, type, schemeStat$TypeVideoBackgroundListeningItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeBackgroundItem)) {
            return false;
        }
        SchemeStat$TypeBackgroundItem schemeStat$TypeBackgroundItem = (SchemeStat$TypeBackgroundItem) obj;
        return this.isInBackground == schemeStat$TypeBackgroundItem.isInBackground && this.type == schemeStat$TypeBackgroundItem.type && epx.f(this.typeVideoBackgroundListeningItem, schemeStat$TypeBackgroundItem.typeVideoBackgroundListeningItem);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (Boolean.hashCode(this.isInBackground) * 31)) * 31;
        SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem = this.typeVideoBackgroundListeningItem;
        return hashCode + (schemeStat$TypeVideoBackgroundListeningItem == null ? 0 : schemeStat$TypeVideoBackgroundListeningItem.hashCode());
    }

    public final String toString() {
        return "TypeBackgroundItem(isInBackground=" + this.isInBackground + ", type=" + this.type + ", typeVideoBackgroundListeningItem=" + this.typeVideoBackgroundListeningItem + ')';
    }

    private SchemeStat$TypeBackgroundItem(boolean z, Type type, SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem) {
        this.isInBackground = z;
        this.type = type;
        this.typeVideoBackgroundListeningItem = schemeStat$TypeVideoBackgroundListeningItem;
    }

    public /* synthetic */ SchemeStat$TypeBackgroundItem(boolean z, Type type, SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem, int i, zcl zclVar) {
        this(z, type, (i & 4) != 0 ? null : schemeStat$TypeVideoBackgroundListeningItem);
    }
}
