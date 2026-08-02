package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipCoownersItem implements SchemeStat$TypeAction.b {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("click_set_up_invitations_button")
        public static final Type CLICK_SET_UP_INVITATIONS_BUTTON;

        @pmi0("open_modal_coowners")
        public static final Type OPEN_MODAL_COOWNERS;

        @pmi0("view_authors")
        public static final Type VIEW_AUTHORS;

        static {
            Type type = new Type("OPEN_MODAL_COOWNERS", 0);
            OPEN_MODAL_COOWNERS = type;
            Type type2 = new Type("CLICK_SET_UP_INVITATIONS_BUTTON", 1);
            CLICK_SET_UP_INVITATIONS_BUTTON = type2;
            Type type3 = new Type("VIEW_AUTHORS", 2);
            VIEW_AUTHORS = type3;
            Type[] typeArr = {type, type2, type3};
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

    public MobileOfficialAppsClipsStat$TypeClipCoownersItem(Type type, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.type = type;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final MobileOfficialAppsClipsStat$TypeClipsClipItem a() {
        return this.clipItem;
    }

    public final Type b() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipCoownersItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipCoownersItem mobileOfficialAppsClipsStat$TypeClipCoownersItem = (MobileOfficialAppsClipsStat$TypeClipCoownersItem) obj;
        return this.type == mobileOfficialAppsClipsStat$TypeClipCoownersItem.type && epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipCoownersItem.clipItem);
    }

    public final int hashCode() {
        return this.clipItem.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "TypeClipCoownersItem(type=" + this.type + ", clipItem=" + this.clipItem + ')';
    }
}
