package com.vk.clips.viewer.impl.domain.filters;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.brm0;
import xsna.epx;
import xsna.ho8;
import xsna.i5s;
import xsna.zcl;

/* compiled from: TopClipsFilter.kt */
/* loaded from: classes17.dex */
public abstract class TopClipsFilter implements Parcelable {

    /* compiled from: TopClipsFilter.kt */
    public static final class AudioIdFilter extends TopClipsFilter {
        public static final Parcelable.Creator<AudioIdFilter> CREATOR = new a();
        public final String b;

        /* compiled from: TopClipsFilter.kt */
        public static final class a implements Parcelable.Creator<AudioIdFilter> {
            @Override // android.os.Parcelable.Creator
            public final AudioIdFilter createFromParcel(Parcel parcel) {
                return new AudioIdFilter(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AudioIdFilter[] newArray(int i) {
                return new AudioIdFilter[i];
            }
        }

        public AudioIdFilter(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.clips.viewer.impl.domain.filters.TopClipsFilter
        public final String d() {
            return i5s.a(new StringBuilder("{\"audioId\":\""), this.b, "\"}");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioIdFilter) && epx.f(this.b, ((AudioIdFilter) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AudioIdFilter(audioId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: TopClipsFilter.kt */
    public static final class CompilationFilter extends TopClipsFilter {
        public static final Parcelable.Creator<CompilationFilter> CREATOR = new a();
        public final String b;

        /* compiled from: TopClipsFilter.kt */
        public static final class a implements Parcelable.Creator<CompilationFilter> {
            @Override // android.os.Parcelable.Creator
            public final CompilationFilter createFromParcel(Parcel parcel) {
                return new CompilationFilter(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CompilationFilter[] newArray(int i) {
                return new CompilationFilter[i];
            }
        }

        public CompilationFilter(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.clips.viewer.impl.domain.filters.TopClipsFilter
        public final String d() {
            return i5s.a(new StringBuilder("{\"compilationId\":\""), this.b, "\"}");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CompilationFilter) && epx.f(this.b, ((CompilationFilter) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CompilationFilter(compilationId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: TopClipsFilter.kt */
    public static final class HashtagFilter extends TopClipsFilter {
        public static final Parcelable.Creator<HashtagFilter> CREATOR = new a();
        public final String b;

        /* compiled from: TopClipsFilter.kt */
        public static final class a implements Parcelable.Creator<HashtagFilter> {
            @Override // android.os.Parcelable.Creator
            public final HashtagFilter createFromParcel(Parcel parcel) {
                return new HashtagFilter(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HashtagFilter[] newArray(int i) {
                return new HashtagFilter[i];
            }
        }

        public HashtagFilter(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.clips.viewer.impl.domain.filters.TopClipsFilter
        public final String d() {
            StringBuilder sb = new StringBuilder("{\"tag\":\"");
            String str = this.b;
            if (!brm0.B(str, "#", false)) {
                str = "#".concat(str);
            }
            return i5s.a(sb, str, "\"}");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HashtagFilter) && epx.f(this.b, ((HashtagFilter) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("HashtagFilter(hashtag="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: TopClipsFilter.kt */
    public static final class MaskFilter extends TopClipsFilter {
        public static final Parcelable.Creator<MaskFilter> CREATOR = new a();
        public final String b;

        /* compiled from: TopClipsFilter.kt */
        public static final class a implements Parcelable.Creator<MaskFilter> {
            @Override // android.os.Parcelable.Creator
            public final MaskFilter createFromParcel(Parcel parcel) {
                return new MaskFilter(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MaskFilter[] newArray(int i) {
                return new MaskFilter[i];
            }
        }

        public MaskFilter(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.clips.viewer.impl.domain.filters.TopClipsFilter
        public final String d() {
            return i5s.a(new StringBuilder("{\"maskId\":\""), this.b, "\"}");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MaskFilter) && epx.f(this.b, ((MaskFilter) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MaskFilter(maskId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: TopClipsFilter.kt */
    public static final class PlaceFilter extends TopClipsFilter {
        public static final Parcelable.Creator<PlaceFilter> CREATOR = new a();
        public final String b;

        /* compiled from: TopClipsFilter.kt */
        public static final class a implements Parcelable.Creator<PlaceFilter> {
            @Override // android.os.Parcelable.Creator
            public final PlaceFilter createFromParcel(Parcel parcel) {
                return new PlaceFilter(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PlaceFilter[] newArray(int i) {
                return new PlaceFilter[i];
            }
        }

        public PlaceFilter(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.clips.viewer.impl.domain.filters.TopClipsFilter
        public final String d() {
            return i5s.a(new StringBuilder("{\"placeId\":\""), this.b, "\"}");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlaceFilter) && epx.f(this.b, ((PlaceFilter) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PlaceFilter(placeId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    public TopClipsFilter(zcl zclVar) {
    }

    public abstract String d();
}
