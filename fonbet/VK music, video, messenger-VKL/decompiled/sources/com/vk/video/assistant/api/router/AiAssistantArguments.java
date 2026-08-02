package com.vk.video.assistant.api.router;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: AiAssistantArguments.kt */
/* loaded from: classes5.dex */
public final class AiAssistantArguments implements Parcelable {
    public static final Parcelable.Creator<AiAssistantArguments> CREATOR = new a();
    public final EntryPoint b;
    public final String c;

    /* compiled from: AiAssistantArguments.kt */
    public static abstract class EntryPoint implements Parcelable {

        /* compiled from: AiAssistantArguments.kt */
        public static final class SearchBanner extends EntryPoint {
            public static final Parcelable.Creator<SearchBanner> CREATOR = new a();
            public final String b;
            public final String c;

            /* compiled from: AiAssistantArguments.kt */
            public static final class a implements Parcelable.Creator<SearchBanner> {
                @Override // android.os.Parcelable.Creator
                public final SearchBanner createFromParcel(Parcel parcel) {
                    return new SearchBanner(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SearchBanner[] newArray(int i) {
                    return new SearchBanner[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public SearchBanner() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchBanner)) {
                    return false;
                }
                SearchBanner searchBanner = (SearchBanner) obj;
                return epx.f(this.b, searchBanner.b) && epx.f(this.c, searchBanner.c);
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.c;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SearchBanner(chatId=");
                sb.append(this.b);
                sb.append(", prompt=");
                return ho8.a(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeString(this.c);
            }

            public /* synthetic */ SearchBanner(String str, String str2, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public SearchBanner(String str, String str2) {
                super(null);
                this.b = str;
                this.c = str2;
            }
        }

        public /* synthetic */ EntryPoint(zcl zclVar) {
            this();
        }

        public EntryPoint() {
        }
    }

    /* compiled from: AiAssistantArguments.kt */
    public static final class a implements Parcelable.Creator<AiAssistantArguments> {
        @Override // android.os.Parcelable.Creator
        public final AiAssistantArguments createFromParcel(Parcel parcel) {
            return new AiAssistantArguments((EntryPoint) parcel.readParcelable(AiAssistantArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AiAssistantArguments[] newArray(int i) {
            return new AiAssistantArguments[i];
        }
    }

    public AiAssistantArguments(EntryPoint entryPoint, String str) {
        this.b = entryPoint;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiAssistantArguments)) {
            return false;
        }
        AiAssistantArguments aiAssistantArguments = (AiAssistantArguments) obj;
        return epx.f(this.b, aiAssistantArguments.b) && epx.f(this.c, aiAssistantArguments.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiAssistantArguments(entryPoint=");
        sb.append(this.b);
        sb.append(", queryId=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
