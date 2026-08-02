package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudioRestrictionPopup implements SchemeStat$TypeView.b {
    public final transient String a;

    @pmi0("section_id")
    private final FilteredString filteredSectionId;

    @pmi0("has_subscription")
    private final boolean hasSubscription;

    @pmi0("restriction")
    private final long restriction;

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioRestrictionPopup>, a9y<CommonAudioStat$TypeAudioRestrictionPopup> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonAudioStat$TypeAudioRestrictionPopup(fai.q(x9yVar, "restriction"), fai.m(x9yVar, "has_subscription"), fai.C(x9yVar, "section_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioRestrictionPopup commonAudioStat$TypeAudioRestrictionPopup = (CommonAudioStat$TypeAudioRestrictionPopup) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("restriction", Long.valueOf(commonAudioStat$TypeAudioRestrictionPopup.b()));
            x9yVar.m(Boolean.valueOf(commonAudioStat$TypeAudioRestrictionPopup.a()), "has_subscription");
            x9yVar.o("section_id", commonAudioStat$TypeAudioRestrictionPopup.a);
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioRestrictionPopup(long j, boolean z, String str) {
        this.restriction = j;
        this.hasSubscription = z;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredSectionId = filteredString;
        filteredString.a(str);
    }

    public final boolean a() {
        return this.hasSubscription;
    }

    public final long b() {
        return this.restriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioRestrictionPopup)) {
            return false;
        }
        CommonAudioStat$TypeAudioRestrictionPopup commonAudioStat$TypeAudioRestrictionPopup = (CommonAudioStat$TypeAudioRestrictionPopup) obj;
        return this.restriction == commonAudioStat$TypeAudioRestrictionPopup.restriction && this.hasSubscription == commonAudioStat$TypeAudioRestrictionPopup.hasSubscription && epx.f(this.a, commonAudioStat$TypeAudioRestrictionPopup.a);
    }

    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.restriction) * 31, 31, this.hasSubscription);
        String str = this.a;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioRestrictionPopup(restriction=");
        sb.append(this.restriction);
        sb.append(", hasSubscription=");
        sb.append(this.hasSubscription);
        sb.append(", sectionId=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioRestrictionPopup(long j, boolean z, String str, int i, zcl zclVar) {
        this(j, z, (i & 4) != 0 ? null : str);
    }
}
