package com.vk.video.ui.upload.impl.coverchoose.presentation.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: CoverChooseArguments.kt */
/* loaded from: classes7.dex */
public interface CoverChooseResult extends Parcelable {

    /* compiled from: CoverChooseArguments.kt */
    public static final class Error implements CoverChooseResult {
        public static final Parcelable.Creator<Error> CREATOR = new a();
        public final ErrorType b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CoverChooseArguments.kt */
        public static final class ErrorType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ErrorType[] $VALUES;
            public static final ErrorType DRAW_ON_CANVAS;
            public static final ErrorType LOAD;
            public static final ErrorType SAVE;

            static {
                ErrorType errorType = new ErrorType("LOAD", 0);
                LOAD = errorType;
                ErrorType errorType2 = new ErrorType("DRAW_ON_CANVAS", 1);
                DRAW_ON_CANVAS = errorType2;
                ErrorType errorType3 = new ErrorType("SAVE", 2);
                SAVE = errorType3;
                ErrorType[] errorTypeArr = {errorType, errorType2, errorType3};
                $VALUES = errorTypeArr;
                $ENTRIES = new asp(errorTypeArr);
            }

            public ErrorType() {
                throw null;
            }

            public static ErrorType valueOf(String str) {
                return (ErrorType) Enum.valueOf(ErrorType.class, str);
            }

            public static ErrorType[] values() {
                return (ErrorType[]) $VALUES.clone();
            }
        }

        /* compiled from: CoverChooseArguments.kt */
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(ErrorType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(ErrorType errorType) {
            this.b = errorType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.b == ((Error) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(type=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
        }
    }

    /* compiled from: CoverChooseArguments.kt */
    public static final class Saved implements CoverChooseResult {
        public static final Parcelable.Creator<Saved> CREATOR = new a();
        public final String b;

        /* compiled from: CoverChooseArguments.kt */
        public static final class a implements Parcelable.Creator<Saved> {
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                return new Saved(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i) {
                return new Saved[i];
            }
        }

        public Saved(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Saved) && epx.f(this.b, ((Saved) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Saved(path="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
