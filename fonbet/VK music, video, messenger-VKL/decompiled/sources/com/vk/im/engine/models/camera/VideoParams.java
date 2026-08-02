package com.vk.im.engine.models.camera;

import com.vk.core.serialize.Serializer;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import xsna.epx;
import xsna.mq;
import xsna.xq;

/* compiled from: VideoParams.kt */
/* loaded from: classes2.dex */
public final class VideoParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoParams> CREATOR = new a();
    public final File b;
    public final int[] c;
    public final File d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final float[] i;
    public final long j;
    public final long k;
    public final File l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final float q;
    public final float r;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoParams a(Serializer serializer) {
            return new VideoParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoParams[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ VideoParams(java.io.File r20, int[] r21, java.io.File r22, boolean r23, boolean r24, int r25, int r26, float[] r27, long r28, long r30, java.io.File r32, int r33, int r34, int r35, int r36, float r37, float r38, int r39, xsna.zcl r40) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.im.engine.models.camera.VideoParams.<init>(java.io.File, int[], java.io.File, boolean, boolean, int, int, float[], long, long, java.io.File, int, int, int, int, float, float, int, xsna.zcl):void");
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.T(this.c);
        serializer.g0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.S(this.g);
        serializer.S(this.h);
        float[] fArr = this.i;
        if (fArr == null) {
            serializer.S(-1);
        } else {
            serializer.S(fArr.length);
            for (float f : fArr) {
                serializer.P(f);
            }
        }
        serializer.Y(this.j);
        serializer.Y(this.k);
        serializer.g0(this.l);
        serializer.S(this.m);
        serializer.S(this.n);
        serializer.S(this.o);
        serializer.S(this.p);
        serializer.P(this.q);
        serializer.P(this.r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoParams)) {
            return false;
        }
        VideoParams videoParams = (VideoParams) obj;
        if (!epx.f(this.b, videoParams.b)) {
            return false;
        }
        int[] iArr = this.c;
        if (iArr != null) {
            int[] iArr2 = videoParams.c;
            if (iArr2 == null || !Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (videoParams.c != null) {
            return false;
        }
        if (!epx.f(this.d, videoParams.d) || this.e != videoParams.e || this.f != videoParams.f || this.g != videoParams.g || this.h != videoParams.h) {
            return false;
        }
        float[] fArr = this.i;
        if (fArr != null) {
            float[] fArr2 = videoParams.i;
            if (fArr2 == null || !Arrays.equals(fArr, fArr2)) {
                return false;
            }
        } else if (videoParams.i != null) {
            return false;
        }
        return this.j == videoParams.j && this.k == videoParams.k && epx.f(this.l, videoParams.l) && this.m == videoParams.m && this.n == videoParams.n && this.o == videoParams.o && this.p == videoParams.p && this.q == videoParams.q && this.r == videoParams.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return Arrays.deepHashCode(new Serializable[]{this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Long.valueOf(this.j), Long.valueOf(this.k), this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Float.valueOf(this.r)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoParams(localFile=");
        sb.append(this.b);
        sb.append(", layerIndices=");
        mq.f(this.c, sb, ", previewFile=");
        sb.append(this.d);
        sb.append(", mirror=");
        sb.append(this.e);
        sb.append(", disableAudio=");
        sb.append(this.f);
        sb.append(", videoWidth=");
        sb.append(this.g);
        sb.append(", videoHeight=");
        sb.append(this.h);
        sb.append(", matrix=");
        sb.append(Arrays.toString(this.i));
        sb.append(", startTimeMs=");
        sb.append(this.j);
        sb.append(", endTimeMs=");
        sb.append(this.k);
        sb.append(", audioFile=");
        sb.append(this.l);
        sb.append(", audioStartMs=");
        sb.append(this.m);
        sb.append(", audioFinishMs=");
        sb.append(this.n);
        sb.append(", audioDelayMs=");
        sb.append(this.o);
        sb.append(", frameRadius=");
        sb.append(this.p);
        sb.append(", soundVolume=");
        sb.append(this.q);
        sb.append(", musicVolume=");
        return xq.c(')', this.r, sb);
    }

    public VideoParams(File file, int[] iArr, File file2, boolean z, boolean z2, int i, int i2, float[] fArr, long j, long j2, File file3, int i3, int i4, int i5, int i6, float f, float f2) {
        this.b = file;
        this.c = iArr;
        this.d = file2;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = i2;
        this.i = fArr;
        this.j = j;
        this.k = j2;
        this.l = file3;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = i6;
        this.q = f;
        this.r = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoParams(Serializer serializer) {
        this(r2, r3, r4, r5, serializer.p() != 0 ? r0 : false, serializer.u(), serializer.u(), serializer.b(), serializer.w(), serializer.w(), (File) serializer.C(), serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.s(), serializer.s());
        boolean z;
        File file = (File) serializer.C();
        int[] c = serializer.c();
        File file2 = (File) serializer.C();
        boolean z2 = true;
        if (serializer.p() != 0) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
    }
}
