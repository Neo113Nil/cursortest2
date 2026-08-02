package com.vk.clips.upload.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: ClipUploadData.kt */
/* loaded from: classes17.dex */
public final class ClipUploadData extends Serializer.StreamParcelableAdapter {
    public final ClipUploadParams b;
    public final ClipsEncoderParameters c;
    public int d;
    public final String e;
    public static int f = (int) (System.currentTimeMillis() / 1000);
    public static final Serializer.c<ClipUploadData> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipUploadData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipUploadData a(Serializer serializer) {
            return new ClipUploadData((ClipUploadParams) serializer.A(ClipUploadParams.class.getClassLoader()), (ClipsEncoderParameters) serializer.A(ClipsEncoderParameters.class.getClassLoader()), serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipUploadData[i];
        }
    }

    public /* synthetic */ ClipUploadData(ClipUploadParams clipUploadParams, ClipsEncoderParameters clipsEncoderParameters, int i, String str, int i2, zcl zclVar) {
        this(clipUploadParams, clipsEncoderParameters, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? null : str);
    }

    public final ClipUploadParams Ab() {
        return this.b;
    }

    public final int Bb() {
        int i = f + 1;
        f = i;
        return i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
    }

    public final int S() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipUploadData)) {
            return false;
        }
        ClipUploadData clipUploadData = (ClipUploadData) obj;
        return epx.f(this.b, clipUploadData.b) && epx.f(this.c, clipUploadData.c) && this.d == clipUploadData.d && epx.f(this.e, clipUploadData.e);
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, (this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadData(uploadParams=");
        sb.append(this.b);
        sb.append(", encoderParams=");
        sb.append(this.c);
        sb.append(", uploadId=");
        sb.append(this.d);
        sb.append(", draftId=");
        return ho8.a(sb, this.e, ')');
    }

    public final ClipsEncoderParameters zb() {
        return this.c;
    }

    public ClipUploadData(ClipUploadParams clipUploadParams, ClipsEncoderParameters clipsEncoderParameters, int i, String str) {
        this.b = clipUploadParams;
        this.c = clipsEncoderParameters;
        this.d = i;
        this.e = str;
    }
}
