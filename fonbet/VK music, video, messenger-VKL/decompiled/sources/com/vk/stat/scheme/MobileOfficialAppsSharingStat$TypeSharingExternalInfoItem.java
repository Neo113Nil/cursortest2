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

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem {
    public final transient String a;

    @pmi0("external_app_package_name")
    private final FilteredString filteredExternalAppPackageName;

    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem>, a9y<MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem(fai.s((x9y) b9yVar, "external_app_package_name"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("external_app_package_name", ((MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem) obj).a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredExternalAppPackageName = filteredString;
        filteredString.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem) && epx.f(this.a, ((MobileOfficialAppsSharingStat$TypeSharingExternalInfoItem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeSharingExternalInfoItem(externalAppPackageName="), this.a, ')');
    }
}
