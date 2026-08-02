package com.plaid.link;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/plaid/link/SubmissionData;", "", "phoneNumber", "", "dateOfBirth", "params", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDateOfBirth", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "getPhoneNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubmissionData {

    @Nullable
    private final String dateOfBirth;

    @Nullable
    private final Map<String, String> params;

    @Nullable
    private final String phoneNumber;

    public SubmissionData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmissionData copy$default(SubmissionData submissionData, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submissionData.phoneNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = submissionData.dateOfBirth;
        }
        if ((i10 & 4) != 0) {
            map = submissionData.params;
        }
        return submissionData.copy(str, str2, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.params;
    }

    @NotNull
    public final SubmissionData copy(@Nullable String phoneNumber, @Nullable String dateOfBirth, @Nullable Map<String, String> params) {
        return new SubmissionData(phoneNumber, dateOfBirth, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmissionData)) {
            return false;
        }
        SubmissionData submissionData = (SubmissionData) other;
        return Intrinsics.areEqual(this.phoneNumber, submissionData.phoneNumber) && Intrinsics.areEqual(this.dateOfBirth, submissionData.dateOfBirth) && Intrinsics.areEqual(this.params, submissionData.params);
    }

    @Nullable
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public final Map<String, String> getParams() {
        return this.params;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dateOfBirth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.params;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubmissionData(phoneNumber=" + this.phoneNumber + ", dateOfBirth=" + this.dateOfBirth + ", params=" + this.params + ")";
    }

    public SubmissionData(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        this.phoneNumber = str;
        this.dateOfBirth = str2;
        this.params = map;
    }

    public /* synthetic */ SubmissionData(String str, String str2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : map);
    }
}
