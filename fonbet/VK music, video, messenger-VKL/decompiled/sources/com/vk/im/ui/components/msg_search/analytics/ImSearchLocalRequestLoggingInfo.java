package com.vk.im.ui.components.msg_search.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.im.engine.models.search.SearchEntrypoint;
import defpackage.q0;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ImSearchLoggingInfo.kt */
/* loaded from: classes2.dex */
public final class ImSearchLocalRequestLoggingInfo implements Parcelable {
    public static final Parcelable.Creator<ImSearchLocalRequestLoggingInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final SearchEntrypoint f;
    public final SearchBlock g;
    public final int h;
    public final boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImSearchLoggingInfo.kt */
    public static final class SearchBlock {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchBlock[] $VALUES;
        public static final SearchBlock CACHE_RECOMMENDATIONS_IMPORTANT;
        public static final SearchBlock CACHE_RECOMMENDATIONS_RECENT;
        public static final SearchBlock LOCAL_CONTACTS_NO_VK;
        public static final SearchBlock LOCAL_DIALOGS;
        public static final SearchBlock UNKNOWN;

        static {
            SearchBlock searchBlock = new SearchBlock("CACHE_RECOMMENDATIONS_IMPORTANT", 0);
            CACHE_RECOMMENDATIONS_IMPORTANT = searchBlock;
            SearchBlock searchBlock2 = new SearchBlock("CACHE_RECOMMENDATIONS_RECENT", 1);
            CACHE_RECOMMENDATIONS_RECENT = searchBlock2;
            SearchBlock searchBlock3 = new SearchBlock("LOCAL_DIALOGS", 2);
            LOCAL_DIALOGS = searchBlock3;
            SearchBlock searchBlock4 = new SearchBlock("LOCAL_CONTACTS_NO_VK", 3);
            LOCAL_CONTACTS_NO_VK = searchBlock4;
            SearchBlock searchBlock5 = new SearchBlock(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
            UNKNOWN = searchBlock5;
            SearchBlock[] searchBlockArr = {searchBlock, searchBlock2, searchBlock3, searchBlock4, searchBlock5};
            $VALUES = searchBlockArr;
            $ENTRIES = new asp(searchBlockArr);
        }

        public SearchBlock() {
            throw null;
        }

        public static SearchBlock valueOf(String str) {
            return (SearchBlock) Enum.valueOf(SearchBlock.class, str);
        }

        public static SearchBlock[] values() {
            return (SearchBlock[]) $VALUES.clone();
        }
    }

    /* compiled from: ImSearchLoggingInfo.kt */
    public static final class a implements Parcelable.Creator<ImSearchLocalRequestLoggingInfo> {
        @Override // android.os.Parcelable.Creator
        public final ImSearchLocalRequestLoggingInfo createFromParcel(Parcel parcel) {
            return new ImSearchLocalRequestLoggingInfo(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), SearchEntrypoint.valueOf(parcel.readString()), SearchBlock.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImSearchLocalRequestLoggingInfo[] newArray(int i) {
            return new ImSearchLocalRequestLoggingInfo[i];
        }
    }

    public ImSearchLocalRequestLoggingInfo() {
        this(null, null, 0L, 0, null, null, 0, false, 255, null);
    }

    public static ImSearchLocalRequestLoggingInfo a(ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo, int i, SearchBlock searchBlock, int i2, int i3) {
        String str = imSearchLocalRequestLoggingInfo.b;
        String str2 = imSearchLocalRequestLoggingInfo.c;
        long j = imSearchLocalRequestLoggingInfo.d;
        if ((i3 & 8) != 0) {
            i = imSearchLocalRequestLoggingInfo.e;
        }
        SearchEntrypoint searchEntrypoint = imSearchLocalRequestLoggingInfo.f;
        boolean z = imSearchLocalRequestLoggingInfo.i;
        imSearchLocalRequestLoggingInfo.getClass();
        return new ImSearchLocalRequestLoggingInfo(str, str2, j, i, searchEntrypoint, searchBlock, i2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImSearchLocalRequestLoggingInfo)) {
            return false;
        }
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = (ImSearchLocalRequestLoggingInfo) obj;
        return epx.f(this.b, imSearchLocalRequestLoggingInfo.b) && epx.f(this.c, imSearchLocalRequestLoggingInfo.c) && this.d == imSearchLocalRequestLoggingInfo.d && this.e == imSearchLocalRequestLoggingInfo.e && this.f == imSearchLocalRequestLoggingInfo.f && this.g == imSearchLocalRequestLoggingInfo.g && this.h == imSearchLocalRequestLoggingInfo.h && this.i == imSearchLocalRequestLoggingInfo.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + shy.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + shy.a(this.e, bh10.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImSearchLocalRequestLoggingInfo(queryText=");
        sb.append(this.b);
        sb.append(", searchQuid=");
        sb.append(this.c);
        sb.append(", queryDurationMillis=");
        sb.append(this.d);
        sb.append(", totalResults=");
        sb.append(this.e);
        sb.append(", service=");
        sb.append(this.f);
        sb.append(", block=");
        sb.append(this.g);
        sb.append(", blockPosition=");
        sb.append(this.h);
        sb.append(", useNetworkForProfiles=");
        return q0.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f.name());
        parcel.writeString(this.g.name());
        parcel.writeInt(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public ImSearchLocalRequestLoggingInfo(String str, String str2, long j, int i, SearchEntrypoint searchEntrypoint, SearchBlock searchBlock, int i2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = i;
        this.f = searchEntrypoint;
        this.g = searchBlock;
        this.h = i2;
        this.i = z;
    }

    public /* synthetic */ ImSearchLocalRequestLoggingInfo(String str, String str2, long j, int i, SearchEntrypoint searchEntrypoint, SearchBlock searchBlock, int i2, boolean z, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? -1L : j, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? SearchEntrypoint.UNKNOWN : searchEntrypoint, (i3 & 32) != 0 ? SearchBlock.UNKNOWN : searchBlock, (i3 & 64) != 0 ? -1 : i2, (i3 & 128) != 0 ? false : z);
    }
}
