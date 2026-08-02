package com.vk.profile.community.impl.ui.item.header.model;

import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.s4h;
import xsna.zrp;

/* compiled from: CommunityDescriptionItemModel.kt */
/* loaded from: classes5.dex */
public final class CommunityDescriptionItemModel extends s4h {
    public final String b;
    public final boolean c;
    public final String d;
    public final SectionsTooltip e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityDescriptionItemModel.kt */
    public static final class SectionsTooltip {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SectionsTooltip[] $VALUES;
        public static final SectionsTooltip Editor;
        public static final SectionsTooltip User;

        static {
            SectionsTooltip sectionsTooltip = new SectionsTooltip("Editor", 0);
            Editor = sectionsTooltip;
            SectionsTooltip sectionsTooltip2 = new SectionsTooltip("User", 1);
            User = sectionsTooltip2;
            SectionsTooltip[] sectionsTooltipArr = {sectionsTooltip, sectionsTooltip2};
            $VALUES = sectionsTooltipArr;
            $ENTRIES = new asp(sectionsTooltipArr);
        }

        public SectionsTooltip() {
            throw null;
        }

        public static SectionsTooltip valueOf(String str) {
            return (SectionsTooltip) Enum.valueOf(SectionsTooltip.class, str);
        }

        public static SectionsTooltip[] values() {
            return (SectionsTooltip[]) $VALUES.clone();
        }
    }

    public CommunityDescriptionItemModel(String str, boolean z, String str2, SectionsTooltip sectionsTooltip) {
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = sectionsTooltip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityDescriptionItemModel)) {
            return false;
        }
        CommunityDescriptionItemModel communityDescriptionItemModel = (CommunityDescriptionItemModel) obj;
        return epx.f(this.b, communityDescriptionItemModel.b) && this.c == communityDescriptionItemModel.c && epx.f(this.d, communityDescriptionItemModel.d) && this.e == communityDescriptionItemModel.e;
    }

    public final int hashCode() {
        String str = this.b;
        int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        SectionsTooltip sectionsTooltip = this.e;
        return hashCode + (sectionsTooltip != null ? sectionsTooltip.hashCode() : 0);
    }

    public final String toString() {
        return "CommunityDescriptionItemModel(about=" + this.b + ", forLiveCover=" + this.c + ", aboutExpandText=" + this.d + ", sectionsTooltip=" + this.e + ')';
    }
}
