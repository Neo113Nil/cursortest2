package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
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
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeInstallReferrer implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;

    @pmi0("installation_store")
    private final FilteredString filteredInstallationStore;

    @pmi0("referral_url")
    private final String referralUrl;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeInstallReferrer>, a9y<SchemeStat$TypeInstallReferrer> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$TypeInstallReferrer(fai.s(x9yVar, "installation_store"), fai.C(x9yVar, "referral_url"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeInstallReferrer schemeStat$TypeInstallReferrer = (SchemeStat$TypeInstallReferrer) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("installation_store", schemeStat$TypeInstallReferrer.a);
            x9yVar.o("referral_url", schemeStat$TypeInstallReferrer.a());
            return x9yVar;
        }
    }

    public SchemeStat$TypeInstallReferrer(String str, String str2) {
        this.a = str;
        this.referralUrl = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredInstallationStore = filteredString;
        filteredString.a(str);
    }

    public final String a() {
        return this.referralUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeInstallReferrer)) {
            return false;
        }
        SchemeStat$TypeInstallReferrer schemeStat$TypeInstallReferrer = (SchemeStat$TypeInstallReferrer) obj;
        return epx.f(this.a, schemeStat$TypeInstallReferrer.a) && epx.f(this.referralUrl, schemeStat$TypeInstallReferrer.referralUrl);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.referralUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInstallReferrer(installationStore=");
        sb.append(this.a);
        sb.append(", referralUrl=");
        return ho8.a(sb, this.referralUrl, ')');
    }

    public /* synthetic */ SchemeStat$TypeInstallReferrer(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
