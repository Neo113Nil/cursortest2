package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("object_url")
    private final FilteredString filteredObjectUrl;

    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick>, a9y<MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick(fai.s((x9y) b9yVar, "object_url"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("object_url", ((MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick) obj).a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredObjectUrl = filteredString;
        filteredString.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick) && epx.f(this.a, ((MobileOfficialAppsVideoStat$TypeVideoAppleTopShelfClick) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeVideoAppleTopShelfClick(objectUrl="), this.a, ')');
    }
}
