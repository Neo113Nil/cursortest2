package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AccountInfoProfilerSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoProfilerSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoProfilerSettingsDto> CREATOR = new a();

    @pmi0("api_requests")
    private final boolean apiRequests;

    @pmi0("download_patterns")
    private final List<AccountInfoDownloadProfilerSettingsDto> downloadPatterns;

    /* compiled from: AccountInfoProfilerSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoProfilerSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoProfilerSettingsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountInfoDownloadProfilerSettingsDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AccountInfoProfilerSettingsDto(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoProfilerSettingsDto[] newArray(int i) {
            return new AccountInfoProfilerSettingsDto[i];
        }
    }

    public AccountInfoProfilerSettingsDto(List<AccountInfoDownloadProfilerSettingsDto> list, boolean z) {
        this.downloadPatterns = list;
        this.apiRequests = z;
    }

    public final boolean d() {
        return this.apiRequests;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AccountInfoDownloadProfilerSettingsDto> e() {
        return this.downloadPatterns;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoProfilerSettingsDto)) {
            return false;
        }
        AccountInfoProfilerSettingsDto accountInfoProfilerSettingsDto = (AccountInfoProfilerSettingsDto) obj;
        return epx.f(this.downloadPatterns, accountInfoProfilerSettingsDto.downloadPatterns) && this.apiRequests == accountInfoProfilerSettingsDto.apiRequests;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.apiRequests) + (this.downloadPatterns.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoProfilerSettingsDto(downloadPatterns=");
        sb.append(this.downloadPatterns);
        sb.append(", apiRequests=");
        return q0.a(sb, this.apiRequests, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.downloadPatterns);
        while (a2.hasNext()) {
            ((AccountInfoDownloadProfilerSettingsDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.apiRequests ? 1 : 0);
    }
}
