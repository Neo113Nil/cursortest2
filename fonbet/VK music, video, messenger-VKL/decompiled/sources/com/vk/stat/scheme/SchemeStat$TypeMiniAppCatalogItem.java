package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMiniAppCatalogItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("last_viewed_section_index")
    private final Integer lastViewedSectionIndex;

    @pmi0("section_index")
    private final int sectionIndex;

    @pmi0("section_inner_index")
    private final Integer sectionInnerIndex;

    @pmi0("sections")
    private final List<SchemeStat$MiniAppCatalogSectionItem> sections;

    public SchemeStat$TypeMiniAppCatalogItem(List<SchemeStat$MiniAppCatalogSectionItem> list, int i, Integer num, Integer num2) {
        this.sections = list;
        this.sectionIndex = i;
        this.sectionInnerIndex = num;
        this.lastViewedSectionIndex = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMiniAppCatalogItem)) {
            return false;
        }
        SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem = (SchemeStat$TypeMiniAppCatalogItem) obj;
        return epx.f(this.sections, schemeStat$TypeMiniAppCatalogItem.sections) && this.sectionIndex == schemeStat$TypeMiniAppCatalogItem.sectionIndex && epx.f(this.sectionInnerIndex, schemeStat$TypeMiniAppCatalogItem.sectionInnerIndex) && epx.f(this.lastViewedSectionIndex, schemeStat$TypeMiniAppCatalogItem.lastViewedSectionIndex);
    }

    public final int hashCode() {
        int a = shy.a(this.sectionIndex, this.sections.hashCode() * 31, 31);
        Integer num = this.sectionInnerIndex;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastViewedSectionIndex;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppCatalogItem(sections=");
        sb.append(this.sections);
        sb.append(", sectionIndex=");
        sb.append(this.sectionIndex);
        sb.append(", sectionInnerIndex=");
        sb.append(this.sectionInnerIndex);
        sb.append(", lastViewedSectionIndex=");
        return uqi.b(sb, this.lastViewedSectionIndex, ')');
    }

    public /* synthetic */ SchemeStat$TypeMiniAppCatalogItem(List list, int i, Integer num, Integer num2, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }
}
