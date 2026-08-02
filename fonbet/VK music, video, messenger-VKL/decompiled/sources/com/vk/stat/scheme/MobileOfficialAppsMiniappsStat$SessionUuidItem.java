package com.vk.stat.scheme;

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

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsMiniappsStat$SessionUuidItem {
    public final transient String a;

    @pmi0("uuid")
    private final FilteredString filteredUuid;

    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsMiniappsStat$SessionUuidItem>, a9y<MobileOfficialAppsMiniappsStat$SessionUuidItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new MobileOfficialAppsMiniappsStat$SessionUuidItem(fai.s((x9y) b9yVar, "uuid"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("uuid", ((MobileOfficialAppsMiniappsStat$SessionUuidItem) obj).a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsMiniappsStat$SessionUuidItem(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(36));
        this.filteredUuid = filteredString;
        filteredString.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMiniappsStat$SessionUuidItem) && epx.f(this.a, ((MobileOfficialAppsMiniappsStat$SessionUuidItem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SessionUuidItem(uuid="), this.a, ')');
    }
}
