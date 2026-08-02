package com.vk.im.engine.models.account;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.zcl;

/* compiled from: CommonConfig.kt */
/* loaded from: classes2.dex */
public final class CommonConfig extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CommonConfig> CREATOR = new a();
    public final boolean A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final long x;
    public final long y;
    public final long z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommonConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommonConfig a(Serializer serializer) {
            return new CommonConfig(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommonConfig[i];
        }
    }

    public CommonConfig() {
        this(false, false, false, false, 0L, false, false, false, false, false, false, false, 0L, false, false, 0, false, false, false, false, false, false, 0L, 0L, 0L, false, 0, false, false, 536870911, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.Y(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.Y(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.S(this.q);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.Y(this.x);
        serializer.Y(this.y);
        serializer.Y(this.z);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
        serializer.S(this.B);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ CommonConfig(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, long j2, boolean z12, boolean z13, int i, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, long j3, long j4, long j5, boolean z20, int i2, boolean z21, boolean z22, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? false : z5, (i3 & 64) != 0 ? false : z6, (i3 & 128) != 0 ? false : z7, (i3 & 256) != 0 ? false : z8, (i3 & 512) != 0 ? false : z9, (i3 & 1024) != 0 ? false : z10, (i3 & 2048) != 0 ? false : z11, (i3 & 4096) != 0 ? 0L : j2, (i3 & 8192) != 0 ? false : z12, (i3 & 16384) != 0 ? false : z13, (i3 & 32768) != 0 ? 0 : i, (i3 & 65536) != 0 ? false : z14, (i3 & 131072) != 0 ? false : z15, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z16, (i3 & 524288) != 0 ? false : z17, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z18, (i3 & 2097152) != 0 ? false : z19, (i3 & 4194304) != 0 ? 0L : j3, (i3 & 8388608) != 0 ? 0L : j4, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0L : j5, (i3 & 33554432) != 0 ? false : z20, (i3 & 67108864) != 0 ? 0 : i2, (i3 & 134217728) != 0 ? true : z21, (i3 & 268435456) != 0 ? false : z22);
    }

    public CommonConfig(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, long j2, boolean z12, boolean z13, int i, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, long j3, long j4, long j5, boolean z20, int i2, boolean z21, boolean z22) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
        this.n = j2;
        this.o = z12;
        this.p = z13;
        this.q = i;
        this.r = z14;
        this.s = z15;
        this.t = z16;
        this.u = z17;
        this.v = z18;
        this.w = z19;
        this.x = j3;
        this.y = j4;
        this.z = j5;
        this.A = z20;
        this.B = i2;
        this.C = z21;
        this.D = z22;
    }

    public CommonConfig(Serializer serializer, zcl zclVar) {
        this(serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.w(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.w(), serializer.m(), serializer.m(), serializer.u(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.w(), serializer.w(), serializer.w(), serializer.m(), serializer.u(), serializer.m(), serializer.m());
    }
}
