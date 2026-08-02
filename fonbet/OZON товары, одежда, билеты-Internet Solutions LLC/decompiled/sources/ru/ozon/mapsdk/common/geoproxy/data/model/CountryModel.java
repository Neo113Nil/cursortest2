package ru.ozon.mapsdk.common.geoproxy.data.model;

import C.o0;
import J8.b;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/CountryModel;", "", "uid", "", "nameRu", "nameEn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "getNameRu", "getNameEn", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CountryModel {

    @b("nameEn")
    private final String nameEn;

    @b("nameRu")
    private final String nameRu;

    @b("uid")
    private final String uid;

    public CountryModel(String str, String str2, String str3) {
        this.uid = str;
        this.nameRu = str2;
        this.nameEn = str3;
    }

    public static /* synthetic */ CountryModel copy$default(CountryModel countryModel, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countryModel.uid;
        }
        if ((i11 & 2) != 0) {
            str2 = countryModel.nameRu;
        }
        if ((i11 & 4) != 0) {
            str3 = countryModel.nameEn;
        }
        return countryModel.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNameRu() {
        return this.nameRu;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNameEn() {
        return this.nameEn;
    }

    @NotNull
    public final CountryModel copy(String uid, String nameRu, String nameEn) {
        return new CountryModel(uid, nameRu, nameEn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryModel)) {
            return false;
        }
        CountryModel countryModel = (CountryModel) other;
        return Intrinsics.d(this.uid, countryModel.uid) && Intrinsics.d(this.nameRu, countryModel.nameRu) && Intrinsics.d(this.nameEn, countryModel.nameEn);
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public final String getNameRu() {
        return this.nameRu;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameRu;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameEn;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uid;
        String str2 = this.nameRu;
        return o0.c(C3660k.d("CountryModel(uid=", str, ", nameRu=", str2, ", nameEn="), this.nameEn, ")");
    }
}
