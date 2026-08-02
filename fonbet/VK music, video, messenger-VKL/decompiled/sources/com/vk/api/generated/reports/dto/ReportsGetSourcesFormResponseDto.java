package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ReportsGetSourcesFormResponseDto.kt */
/* loaded from: classes15.dex */
public final class ReportsGetSourcesFormResponseDto implements Parcelable {
    public static final Parcelable.Creator<ReportsGetSourcesFormResponseDto> CREATOR = new a();

    @pmi0("header")
    private final String header;

    @pmi0("more")
    private final String more;

    @pmi0("report_sources_main")
    private final List<ReportsReportSourcesDto> reportSourcesMain;

    @pmi0("report_sources_other")
    private final List<ReportsReportSourcesDto> reportSourcesOther;

    @pmi0("snippet")
    private final ReportsFormSnippetDto snippet;

    /* compiled from: ReportsGetSourcesFormResponseDto.kt */
    public static final class a implements Parcelable.Creator<ReportsGetSourcesFormResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsGetSourcesFormResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ReportsReportSourcesDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i2 != readInt2) {
                i2 = en.a(ReportsReportSourcesDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            return new ReportsGetSourcesFormResponseDto(readString, readString2, arrayList, arrayList2, ReportsFormSnippetDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsGetSourcesFormResponseDto[] newArray(int i) {
            return new ReportsGetSourcesFormResponseDto[i];
        }
    }

    public ReportsGetSourcesFormResponseDto(String str, String str2, List<ReportsReportSourcesDto> list, List<ReportsReportSourcesDto> list2, ReportsFormSnippetDto reportsFormSnippetDto) {
        this.header = str;
        this.more = str2;
        this.reportSourcesMain = list;
        this.reportSourcesOther = list2;
        this.snippet = reportsFormSnippetDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsGetSourcesFormResponseDto)) {
            return false;
        }
        ReportsGetSourcesFormResponseDto reportsGetSourcesFormResponseDto = (ReportsGetSourcesFormResponseDto) obj;
        return epx.f(this.header, reportsGetSourcesFormResponseDto.header) && epx.f(this.more, reportsGetSourcesFormResponseDto.more) && epx.f(this.reportSourcesMain, reportsGetSourcesFormResponseDto.reportSourcesMain) && epx.f(this.reportSourcesOther, reportsGetSourcesFormResponseDto.reportSourcesOther) && epx.f(this.snippet, reportsGetSourcesFormResponseDto.snippet);
    }

    public final int hashCode() {
        return this.snippet.hashCode() + fw3.a(fw3.a(urd0.a(this.header.hashCode() * 31, 31, this.more), 31, this.reportSourcesMain), 31, this.reportSourcesOther);
    }

    public final String toString() {
        return "ReportsGetSourcesFormResponseDto(header=" + this.header + ", more=" + this.more + ", reportSourcesMain=" + this.reportSourcesMain + ", reportSourcesOther=" + this.reportSourcesOther + ", snippet=" + this.snippet + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.header);
        parcel.writeString(this.more);
        Iterator a2 = ao.a(parcel, this.reportSourcesMain);
        while (a2.hasNext()) {
            ((ReportsReportSourcesDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.reportSourcesOther);
        while (a3.hasNext()) {
            ((ReportsReportSourcesDto) a3.next()).writeToParcel(parcel, i);
        }
        this.snippet.writeToParcel(parcel, i);
    }
}
