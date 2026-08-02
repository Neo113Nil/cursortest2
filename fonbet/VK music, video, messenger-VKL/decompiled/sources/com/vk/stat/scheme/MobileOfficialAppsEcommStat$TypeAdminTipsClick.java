package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.hu20;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsEcommStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsEcommStat$TypeAdminTipsClick implements SchemeStat$TypeClick.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_admin_tips_checklist_click")
    private final MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem typeAdminTipsChecklistClick;

    @pmi0("type_admin_tips_checklist_main_click")
    private final hu20 typeAdminTipsChecklistMainClick;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsEcommStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_admin_tips_checklist_click")
        public static final Type TYPE_ADMIN_TIPS_CHECKLIST_CLICK;

        @pmi0("type_admin_tips_checklist_main_click")
        public static final Type TYPE_ADMIN_TIPS_CHECKLIST_MAIN_CLICK;

        static {
            Type type = new Type("TYPE_ADMIN_TIPS_CHECKLIST_CLICK", 0);
            TYPE_ADMIN_TIPS_CHECKLIST_CLICK = type;
            Type type2 = new Type("TYPE_ADMIN_TIPS_CHECKLIST_MAIN_CLICK", 1);
            TYPE_ADMIN_TIPS_CHECKLIST_MAIN_CLICK = type2;
            Type[] typeArr = {type, type2};
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

    private MobileOfficialAppsEcommStat$TypeAdminTipsClick(Type type, long j, MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem mobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem, hu20 hu20Var) {
        this.type = type;
        this.communityId = j;
        this.typeAdminTipsChecklistClick = mobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem;
        this.typeAdminTipsChecklistMainClick = hu20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsEcommStat$TypeAdminTipsClick)) {
            return false;
        }
        MobileOfficialAppsEcommStat$TypeAdminTipsClick mobileOfficialAppsEcommStat$TypeAdminTipsClick = (MobileOfficialAppsEcommStat$TypeAdminTipsClick) obj;
        return this.type == mobileOfficialAppsEcommStat$TypeAdminTipsClick.type && this.communityId == mobileOfficialAppsEcommStat$TypeAdminTipsClick.communityId && epx.f(this.typeAdminTipsChecklistClick, mobileOfficialAppsEcommStat$TypeAdminTipsClick.typeAdminTipsChecklistClick) && epx.f(this.typeAdminTipsChecklistMainClick, mobileOfficialAppsEcommStat$TypeAdminTipsClick.typeAdminTipsChecklistMainClick);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem mobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem = this.typeAdminTipsChecklistClick;
        int hashCode = (a + (mobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem == null ? 0 : mobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem.hashCode())) * 31;
        hu20 hu20Var = this.typeAdminTipsChecklistMainClick;
        return hashCode + (hu20Var != null ? hu20Var.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAdminTipsClick(type=" + this.type + ", communityId=" + this.communityId + ", typeAdminTipsChecklistClick=" + this.typeAdminTipsChecklistClick + ", typeAdminTipsChecklistMainClick=" + this.typeAdminTipsChecklistMainClick + ')';
    }

    public /* synthetic */ MobileOfficialAppsEcommStat$TypeAdminTipsClick(Type type, long j, MobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem mobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem, hu20 hu20Var, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : mobileOfficialAppsEcommStat$TypeAdminTipsChecklistClickItem, (i & 8) != 0 ? null : hu20Var);
    }
}
