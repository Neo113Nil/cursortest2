package com.vk.newsfeed.posting.impl.domain.model.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.AttachmentType;
import defpackage.q0;
import xsna.epx;
import xsna.oq;
import xsna.shy;
import xsna.zcl;

/* compiled from: UploadDto.kt */
/* loaded from: classes4.dex */
public interface UploadDto extends Parcelable {
    public static final a b7 = a.a;

    /* compiled from: UploadDto.kt */
    public static final class UploadState implements Parcelable {
        public static final Parcelable.Creator<UploadState> CREATOR = new a();
        public final UploadStep b;
        public final String c;
        public final int d;
        public final int e;
        public final int f;
        public final AttachmentType g;
        public final Parcelable h;
        public final boolean i;

        /* compiled from: UploadDto.kt */
        public static final class a implements Parcelable.Creator<UploadState> {
            @Override // android.os.Parcelable.Creator
            public final UploadState createFromParcel(Parcel parcel) {
                return new UploadState((UploadStep) parcel.readParcelable(UploadState.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : AttachmentType.valueOf(parcel.readString()), parcel.readParcelable(UploadState.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final UploadState[] newArray(int i) {
                return new UploadState[i];
            }
        }

        public UploadState() {
            this(null, null, 0, 0, 0, null, null, false, 255, null);
        }

        public static UploadState a(UploadState uploadState, UploadStep uploadStep, int i, int i2, int i3, Parcelable parcelable, boolean z, int i4) {
            if ((i4 & 1) != 0) {
                uploadStep = uploadState.b;
            }
            UploadStep uploadStep2 = uploadStep;
            String str = uploadState.c;
            if ((i4 & 4) != 0) {
                i = uploadState.d;
            }
            int i5 = i;
            if ((i4 & 8) != 0) {
                i2 = uploadState.e;
            }
            int i6 = i2;
            if ((i4 & 16) != 0) {
                i3 = uploadState.f;
            }
            int i7 = i3;
            AttachmentType attachmentType = uploadState.g;
            Parcelable parcelable2 = (i4 & 64) != 0 ? uploadState.h : parcelable;
            boolean z2 = (i4 & 128) != 0 ? uploadState.i : z;
            uploadState.getClass();
            return new UploadState(uploadStep2, str, i5, i6, i7, attachmentType, parcelable2, z2);
        }

        public final boolean d() {
            UploadDto.b7.getClass();
            return (equals(a.b) || epx.f(this.b, UploadStep.Uploaded.b)) ? false : true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            UploadDto.b7.getClass();
            return !equals(a.b) && epx.f(this.b, UploadStep.Idle.b) && this.e == 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadState)) {
                return false;
            }
            UploadState uploadState = (UploadState) obj;
            return epx.f(this.b, uploadState.b) && epx.f(this.c, uploadState.c) && this.d == uploadState.d && this.e == uploadState.e && this.f == uploadState.f && this.g == uploadState.g && epx.f(this.h, uploadState.h) && this.i == uploadState.i;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int a2 = shy.a(this.f, shy.a(this.e, shy.a(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
            AttachmentType attachmentType = this.g;
            int hashCode2 = (a2 + (attachmentType == null ? 0 : attachmentType.hashCode())) * 31;
            Parcelable parcelable = this.h;
            return Boolean.hashCode(this.i) + ((hashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadState(uploadStep=");
            sb.append(this.b);
            sb.append(", uri=");
            sb.append(this.c);
            sb.append(", uploadId=");
            sb.append(this.d);
            sb.append(", progress=");
            sb.append(this.e);
            sb.append(", total=");
            sb.append(this.f);
            sb.append(", attachType=");
            sb.append(this.g);
            sb.append(", uploadResult=");
            sb.append(this.h);
            sb.append(", mustStart=");
            return q0.a(sb, this.i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            AttachmentType attachmentType = this.g;
            if (attachmentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(attachmentType.name());
            }
            parcel.writeParcelable(this.h, i);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public UploadState(UploadStep uploadStep, String str, int i, int i2, int i3, AttachmentType attachmentType, Parcelable parcelable, boolean z) {
            this.b = uploadStep;
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = attachmentType;
            this.h = parcelable;
            this.i = z;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ UploadState(com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto.UploadStep r3, java.lang.String r4, int r5, int r6, int r7, com.vk.dto.common.AttachmentType r8, android.os.Parcelable r9, boolean r10, int r11, xsna.zcl r12) {
            /*
                r2 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L6
                com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto$UploadStep$Idle r3 = com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto.UploadStep.Idle.b
            L6:
                r12 = r11 & 2
                r0 = 0
                if (r12 == 0) goto Lc
                r4 = r0
            Lc:
                r12 = r11 & 4
                r1 = 0
                if (r12 == 0) goto L12
                r5 = r1
            L12:
                r12 = r11 & 8
                if (r12 == 0) goto L17
                r6 = r1
            L17:
                r12 = r11 & 16
                if (r12 == 0) goto L1c
                r7 = r1
            L1c:
                r12 = r11 & 32
                if (r12 == 0) goto L21
                r8 = r0
            L21:
                r12 = r11 & 64
                if (r12 == 0) goto L26
                r9 = r0
            L26:
                r11 = r11 & 128(0x80, float:1.8E-43)
                if (r11 == 0) goto L34
                r12 = r1
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L3d
            L34:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L3d:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto.UploadState.<init>(com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto$UploadStep, java.lang.String, int, int, int, com.vk.dto.common.AttachmentType, android.os.Parcelable, boolean, int, xsna.zcl):void");
        }
    }

    /* compiled from: UploadDto.kt */
    public static abstract class UploadStep implements Parcelable {

        /* compiled from: UploadDto.kt */
        public static final class Failed extends UploadStep {
            public static final Parcelable.Creator<Failed> CREATOR = new a();
            public final Throwable b;

            /* compiled from: UploadDto.kt */
            public static final class a implements Parcelable.Creator<Failed> {
                @Override // android.os.Parcelable.Creator
                public final Failed createFromParcel(Parcel parcel) {
                    return new Failed((Throwable) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Failed[] newArray(int i) {
                    return new Failed[i];
                }
            }

            public Failed(Throwable th) {
                super(null);
                this.b = th;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && epx.f(this.b, ((Failed) obj).b);
            }

            public final int hashCode() {
                Throwable th = this.b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Failed(throwable="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeSerializable(this.b);
            }
        }

        /* compiled from: UploadDto.kt */
        public static final class Idle extends UploadStep {
            public static final Idle b = new Idle(null);
            public static final Parcelable.Creator<Idle> CREATOR = new a();

            /* compiled from: UploadDto.kt */
            public static final class a implements Parcelable.Creator<Idle> {
                @Override // android.os.Parcelable.Creator
                public final Idle createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Idle.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Idle[] newArray(int i) {
                    return new Idle[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public final int hashCode() {
                return -421016074;
            }

            public final String toString() {
                return "Idle";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: UploadDto.kt */
        public static final class Uploaded extends UploadStep {
            public static final Uploaded b = new Uploaded(null);
            public static final Parcelable.Creator<Uploaded> CREATOR = new a();

            /* compiled from: UploadDto.kt */
            public static final class a implements Parcelable.Creator<Uploaded> {
                @Override // android.os.Parcelable.Creator
                public final Uploaded createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Uploaded.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Uploaded[] newArray(int i) {
                    return new Uploaded[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Uploaded);
            }

            public final int hashCode() {
                return -875082878;
            }

            public final String toString() {
                return "Uploaded";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: UploadDto.kt */
        public static final class Uploading extends UploadStep {
            public static final Uploading b = new Uploading(null);
            public static final Parcelable.Creator<Uploading> CREATOR = new a();

            /* compiled from: UploadDto.kt */
            public static final class a implements Parcelable.Creator<Uploading> {
                @Override // android.os.Parcelable.Creator
                public final Uploading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Uploading.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Uploading[] newArray(int i) {
                    return new Uploading[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Uploading);
            }

            public final int hashCode() {
                return -1357761185;
            }

            public final String toString() {
                return "Uploading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ UploadStep(zcl zclVar) {
            this();
        }

        public UploadStep() {
        }
    }

    /* compiled from: UploadDto.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final UploadState b = new UploadState(null, null, 0, 0, 0, null, null, false, 255, null);
    }

    UploadState I4();

    long e9();

    default Object x2() {
        return null;
    }
}
