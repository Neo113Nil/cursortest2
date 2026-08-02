package com.vk.libvideo.upload.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoUploadEvents.kt */
/* loaded from: classes3.dex */
public final class VideoUpload extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoUpload> CREATOR = new a();
    public static final VideoUpload s = new VideoUpload(-1, "", UserId.d, 0, "", false, false, false, false, false, null, null, 0, null, null, null, 64960, null);
    public final int b;
    public final String c;
    public final UserId d;
    public final long e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Integer l;
    public final VideoFile m;
    public final long n;
    public final String o;
    public final Long p;
    public final String q;
    public final String r;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoUpload> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoUpload a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            long w = serializer.w();
            String H2 = serializer.H();
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            boolean m3 = serializer.m();
            boolean m4 = serializer.m();
            Integer v = serializer.v();
            VideoFile videoFile = (VideoFile) serializer.A(VideoFile.class.getClassLoader());
            long w2 = serializer.w();
            String H3 = serializer.H();
            Long x = serializer.x();
            String I = serializer.I();
            Boolean n = serializer.n();
            return new VideoUpload(u, H, userId, w, H2, n != null ? n.booleanValue() : false, m, m2, m3, m4, v, videoFile, w2, H3, x, I);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoUpload[i];
        }
    }

    public /* synthetic */ VideoUpload(int i, String str, UserId userId, long j, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, VideoFile videoFile, long j2, String str3, Long l, String str4, int i2, zcl zclVar) {
        this(i, str, userId, j, str2, z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? true : z5, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : videoFile, (i2 & 4096) != 0 ? 0L : j2, (i2 & 8192) != 0 ? null : str3, (i2 & 16384) != 0 ? null : l, (i2 & 32768) != 0 ? null : str4);
    }

    public static VideoUpload zb(VideoUpload videoUpload, UserId userId, String str, boolean z, boolean z2, boolean z3, Integer num, VideoFile videoFile, int i) {
        int i2 = videoUpload.b;
        String str2 = videoUpload.c;
        UserId userId2 = (i & 4) != 0 ? videoUpload.d : userId;
        long j = videoUpload.e;
        String str3 = (i & 16) != 0 ? videoUpload.f : str;
        boolean z4 = videoUpload.g;
        boolean z5 = (i & 64) != 0 ? videoUpload.h : z;
        boolean z6 = (i & 128) != 0 ? videoUpload.i : z2;
        boolean z7 = (i & 256) != 0 ? videoUpload.j : true;
        boolean z8 = (i & 512) != 0 ? videoUpload.k : z3;
        Integer num2 = (i & 1024) != 0 ? videoUpload.l : num;
        VideoFile videoFile2 = (i & 2048) != 0 ? videoUpload.m : videoFile;
        long j2 = videoUpload.n;
        VideoFile videoFile3 = videoFile2;
        String str4 = videoUpload.o;
        Long l = videoUpload.p;
        String str5 = videoUpload.q;
        videoUpload.getClass();
        return new VideoUpload(i2, str2, userId2, j, str3, z4, z5, z6, z7, z8, num2, videoFile3, j2, str4, l, str5);
    }

    public final VideoFile A() {
        return this.m;
    }

    public final String Ab() {
        return this.c;
    }

    public final long Bb() {
        return this.e;
    }

    public final boolean Cb() {
        return this.g;
    }

    public final long Db() {
        return this.n;
    }

    public final int Eb() {
        return this.b;
    }

    public final String Fb() {
        return this.r;
    }

    public final Integer Gb() {
        return this.l;
    }

    public final boolean Hb() {
        return this.i;
    }

    public final boolean Ib() {
        return this.j;
    }

    public final boolean Jb() {
        return this.h;
    }

    public final boolean Kb() {
        return this.k;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.e0(this.d);
        serializer.Y(this.e);
        serializer.j0(this.f);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.V(this.l);
        serializer.e0(this.m);
        serializer.Y(this.n);
        serializer.j0(this.o);
        serializer.b0(this.p);
        serializer.m0(this.q);
        serializer.J(Boolean.valueOf(this.g));
    }

    public final String P() {
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUpload)) {
            return false;
        }
        VideoUpload videoUpload = (VideoUpload) obj;
        return this.b == videoUpload.b && epx.f(this.c, videoUpload.c) && epx.f(this.d, videoUpload.d) && this.e == videoUpload.e && epx.f(this.f, videoUpload.f) && this.g == videoUpload.g && this.h == videoUpload.h && this.i == videoUpload.i && this.j == videoUpload.j && this.k == videoUpload.k && epx.f(this.l, videoUpload.l) && epx.f(this.m, videoUpload.m) && this.n == videoUpload.n && epx.f(this.o, videoUpload.o) && epx.f(this.p, videoUpload.p) && epx.f(this.q, videoUpload.q);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(bh10.a(bh10.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d.b), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Integer num = this.l;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        VideoFile videoFile = this.m;
        int a2 = bh10.a((hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31, 31, this.n);
        String str = this.o;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.p;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.q;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUpload(uploadTaskId=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", fileSize=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", hasNewOrd=");
        sb.append(this.g);
        sb.append(", isFailed=");
        sb.append(this.h);
        sb.append(", isCancelled=");
        sb.append(this.i);
        sb.append(", isDone=");
        sb.append(this.j);
        sb.append(", isNotificationListener=");
        sb.append(this.k);
        sb.append(", videoId=");
        sb.append(this.l);
        sb.append(", videoFile=");
        sb.append(this.m);
        sb.append(", publicationDate=");
        sb.append(this.n);
        sb.append(", coverPath=");
        sb.append(this.o);
        sb.append(", durationMs=");
        sb.append(this.p);
        sb.append(", ownerName=");
        return ho8.a(sb, this.q, ')');
    }

    public VideoUpload(int i, String str, UserId userId, long j, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, VideoFile videoFile, long j2, String str3, Long l, String str4) {
        String str5;
        this.b = i;
        this.c = str;
        this.d = userId;
        this.e = j;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = num;
        this.m = videoFile;
        this.n = j2;
        this.o = str3;
        this.p = l;
        this.q = str4;
        if (videoFile == null || (str5 = videoFile.r1()) == null) {
            if (num != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                sb.append('_');
                sb.append(num);
                str5 = sb.toString();
            } else {
                str5 = null;
            }
        }
        this.r = str5;
    }
}
