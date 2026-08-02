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

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConPostingStat$PhotoSizes {
    public final transient String a;
    public final transient String b;

    @pmi0("after_crop")
    private final FilteredString filteredAfterCrop;

    @pmi0("before_crop")
    private final FilteredString filteredBeforeCrop;

    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsConPostingStat$PhotoSizes>, a9y<MobileOfficialAppsConPostingStat$PhotoSizes> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsConPostingStat$PhotoSizes(fai.s(x9yVar, "before_crop"), fai.s(x9yVar, "after_crop"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes = (MobileOfficialAppsConPostingStat$PhotoSizes) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("before_crop", mobileOfficialAppsConPostingStat$PhotoSizes.a);
            x9yVar.o("after_crop", mobileOfficialAppsConPostingStat$PhotoSizes.b);
            return x9yVar;
        }
    }

    public MobileOfficialAppsConPostingStat$PhotoSizes(String str, String str2) {
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(36));
        this.filteredBeforeCrop = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(36));
        this.filteredAfterCrop = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$PhotoSizes)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes = (MobileOfficialAppsConPostingStat$PhotoSizes) obj;
        return epx.f(this.a, mobileOfficialAppsConPostingStat$PhotoSizes.a) && epx.f(this.b, mobileOfficialAppsConPostingStat$PhotoSizes.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoSizes(beforeCrop=");
        sb.append(this.a);
        sb.append(", afterCrop=");
        return ho8.a(sb, this.b, ')');
    }
}
