package ru.ozon.app.android.storefront.screens.about;

import C.o0;
import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/screens/about/AboutInfo;", "", "", "companyName", "personalDataUrl", "companyYears", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCompanyName", "getPersonalDataUrl", "getCompanyYears", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AboutInfo {

    @NotNull
    private final String companyName;

    @NotNull
    private final String companyYears;

    @NotNull
    private final String personalDataUrl;

    public AboutInfo(@NotNull String companyName, @NotNull String personalDataUrl, @NotNull String companyYears) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(personalDataUrl, "personalDataUrl");
        Intrinsics.checkNotNullParameter(companyYears, "companyYears");
        this.companyName = companyName;
        this.personalDataUrl = personalDataUrl;
        this.companyYears = companyYears;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AboutInfo)) {
            return false;
        }
        AboutInfo aboutInfo = (AboutInfo) other;
        return Intrinsics.d(this.companyName, aboutInfo.companyName) && Intrinsics.d(this.personalDataUrl, aboutInfo.personalDataUrl) && Intrinsics.d(this.companyYears, aboutInfo.companyYears);
    }

    @NotNull
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final String getCompanyYears() {
        return this.companyYears;
    }

    @NotNull
    public final String getPersonalDataUrl() {
        return this.personalDataUrl;
    }

    public int hashCode() {
        return this.companyYears.hashCode() + g.a(this.companyName.hashCode() * 31, 31, this.personalDataUrl);
    }

    @NotNull
    public String toString() {
        String str = this.companyName;
        String str2 = this.personalDataUrl;
        return o0.c(C3660k.d("AboutInfo(companyName=", str, ", personalDataUrl=", str2, ", companyYears="), this.companyYears, ")");
    }
}
