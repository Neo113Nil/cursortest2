package com.vk.clips.uploader.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import xsna.epx;
import xsna.ho8;
import xsna.oq;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ClipUploadStatus.kt */
/* loaded from: classes17.dex */
public interface ClipUploadStatus extends Parcelable {

    /* compiled from: ClipUploadStatus.kt */
    public static final class Canceled implements ClipUploadStatus {
        public static final Parcelable.Creator<Canceled> CREATOR = new a();
        public final int b;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<Canceled> {
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                return new Canceled(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public Canceled(int i) {
            this.b = i;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Canceled) && this.b == ((Canceled) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Canceled(uploadId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: ClipUploadStatus.kt */
    public static final class ClientProcessingDone implements ClipUploadStatus {
        public static final Parcelable.Creator<ClientProcessingDone> CREATOR = new a();
        public final int b;
        public final File c;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<ClientProcessingDone> {
            @Override // android.os.Parcelable.Creator
            public final ClientProcessingDone createFromParcel(Parcel parcel) {
                return new ClientProcessingDone(parcel.readInt(), (File) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final ClientProcessingDone[] newArray(int i) {
                return new ClientProcessingDone[i];
            }
        }

        public ClientProcessingDone(int i, File file) {
            this.b = i;
            this.c = file;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientProcessingDone)) {
                return false;
            }
            ClientProcessingDone clientProcessingDone = (ClientProcessingDone) obj;
            return this.b == clientProcessingDone.b && epx.f(this.c, clientProcessingDone.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "ClientProcessingDone(uploadId=" + this.b + ", output=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeSerializable(this.c);
        }
    }

    /* compiled from: ClipUploadStatus.kt */
    public static final class ClientProcessingProgress implements ClipUploadStatus {
        public static final Parcelable.Creator<ClientProcessingProgress> CREATOR = new a();
        public final int b;
        public final int c;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<ClientProcessingProgress> {
            @Override // android.os.Parcelable.Creator
            public final ClientProcessingProgress createFromParcel(Parcel parcel) {
                return new ClientProcessingProgress(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ClientProcessingProgress[] newArray(int i) {
                return new ClientProcessingProgress[i];
            }
        }

        public ClientProcessingProgress(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientProcessingProgress)) {
                return false;
            }
            ClientProcessingProgress clientProcessingProgress = (ClientProcessingProgress) obj;
            return this.b == clientProcessingProgress.b && this.c == clientProcessingProgress.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClientProcessingProgress(uploadId=");
            sb.append(this.b);
            sb.append(", progress=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    /* compiled from: ClipUploadStatus.kt */
    public static final class Done implements ClipUploadStatus {
        public static final Parcelable.Creator<Done> CREATOR = new a();
        public final int b;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<Done> {
            @Override // android.os.Parcelable.Creator
            public final Done createFromParcel(Parcel parcel) {
                return new Done(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Done[] newArray(int i) {
                return new Done[i];
            }
        }

        public Done(int i) {
            this.b = i;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && this.b == ((Done) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Done(uploadId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: ClipUploadStatus.kt */
    public static final class ShortVideoCreateExecuted implements ClipUploadStatus {
        public static final Parcelable.Creator<ShortVideoCreateExecuted> CREATOR = new a();
        public final int b;
        public final int c;
        public final String d;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<ShortVideoCreateExecuted> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoCreateExecuted createFromParcel(Parcel parcel) {
                return new ShortVideoCreateExecuted(parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoCreateExecuted[] newArray(int i) {
                return new ShortVideoCreateExecuted[i];
            }
        }

        public ShortVideoCreateExecuted(int i, int i2, String str) {
            this.b = i;
            this.c = i2;
            this.d = str;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoCreateExecuted)) {
                return false;
            }
            ShortVideoCreateExecuted shortVideoCreateExecuted = (ShortVideoCreateExecuted) obj;
            return this.b == shortVideoCreateExecuted.b && this.c == shortVideoCreateExecuted.c && epx.f(this.d, shortVideoCreateExecuted.d);
        }

        public final int hashCode() {
            int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            String str = this.d;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortVideoCreateExecuted(uploadId=");
            sb.append(this.b);
            sb.append(", videoId=");
            sb.append(this.c);
            sb.append(", uploadLinkId=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: ClipUploadStatus.kt */
    public static final class Started implements ClipUploadStatus {
        public static final Parcelable.Creator<Started> CREATOR = new a();
        public final int b;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<Started> {
            @Override // android.os.Parcelable.Creator
            public final Started createFromParcel(Parcel parcel) {
                return new Started(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Started[] newArray(int i) {
                return new Started[i];
            }
        }

        public Started(int i) {
            this.b = i;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Started) && this.b == ((Started) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Started(uploadId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: ClipUploadStatus.kt */
    public static final class UploadingProgress implements ClipUploadStatus {
        public static final Parcelable.Creator<UploadingProgress> CREATOR = new a();
        public final int b;
        public final int c;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<UploadingProgress> {
            @Override // android.os.Parcelable.Creator
            public final UploadingProgress createFromParcel(Parcel parcel) {
                return new UploadingProgress(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final UploadingProgress[] newArray(int i) {
                return new UploadingProgress[i];
            }
        }

        public UploadingProgress(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadingProgress)) {
                return false;
            }
            UploadingProgress uploadingProgress = (UploadingProgress) obj;
            return this.b == uploadingProgress.b && this.c == uploadingProgress.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadingProgress(uploadId=");
            sb.append(this.b);
            sb.append(", progress=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    int S();

    /* compiled from: ClipUploadStatus.kt */
    public static final class Error implements ClipUploadStatus {
        public static final Parcelable.Creator<Error> CREATOR = new a();
        public final int b;
        public final Throwable c;

        /* compiled from: ClipUploadStatus.kt */
        public static final class a implements Parcelable.Creator<Error> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readInt(), null, 2, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(int i, Throwable th) {
            this.b = i;
            this.c = th;
        }

        @Override // com.vk.clips.uploader.api.model.ClipUploadStatus
        public final int S() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.b == error.b && epx.f(this.c, error.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            Throwable th = this.c;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(uploadId=");
            sb.append(this.b);
            sb.append(", error=");
            return oq.c(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }

        public /* synthetic */ Error(int i, Throwable th, int i2, zcl zclVar) {
            this(i, (i2 & 2) != 0 ? null : th);
        }
    }
}
