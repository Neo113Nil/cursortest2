package ru.sberdevices.salutevision.core.data;

import B3.D;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionBack;", "", "start", "", "end", "comments", "number_back", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComments", "()Ljava/lang/String;", "getEnd", "getNumber_back", "getStart", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DriverLicenseRecognitionBack {
    private final String comments;
    private final String end;
    private final String number_back;
    private final String start;

    public DriverLicenseRecognitionBack(String str, String str2, String str3, String str4) {
        this.start = str;
        this.end = str2;
        this.comments = str3;
        this.number_back = str4;
    }

    public static /* synthetic */ DriverLicenseRecognitionBack copy$default(DriverLicenseRecognitionBack driverLicenseRecognitionBack, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = driverLicenseRecognitionBack.start;
        }
        if ((i11 & 2) != 0) {
            str2 = driverLicenseRecognitionBack.end;
        }
        if ((i11 & 4) != 0) {
            str3 = driverLicenseRecognitionBack.comments;
        }
        if ((i11 & 8) != 0) {
            str4 = driverLicenseRecognitionBack.number_back;
        }
        return driverLicenseRecognitionBack.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* renamed from: component3, reason: from getter */
    public final String getComments() {
        return this.comments;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNumber_back() {
        return this.number_back;
    }

    @NotNull
    public final DriverLicenseRecognitionBack copy(String start, String end, String comments, String number_back) {
        return new DriverLicenseRecognitionBack(start, end, comments, number_back);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriverLicenseRecognitionBack)) {
            return false;
        }
        DriverLicenseRecognitionBack driverLicenseRecognitionBack = (DriverLicenseRecognitionBack) other;
        return Intrinsics.d(this.start, driverLicenseRecognitionBack.start) && Intrinsics.d(this.end, driverLicenseRecognitionBack.end) && Intrinsics.d(this.comments, driverLicenseRecognitionBack.comments) && Intrinsics.d(this.number_back, driverLicenseRecognitionBack.number_back);
    }

    public final String getComments() {
        return this.comments;
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getNumber_back() {
        return this.number_back;
    }

    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        String str = this.start;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.end;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comments;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.number_back;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DriverLicenseRecognitionBack(start=");
        sb2.append(this.start);
        sb2.append(", end=");
        sb2.append(this.end);
        sb2.append(", comments=");
        sb2.append(this.comments);
        sb2.append(", number_back=");
        return D.c(sb2, this.number_back, ')');
    }
}
