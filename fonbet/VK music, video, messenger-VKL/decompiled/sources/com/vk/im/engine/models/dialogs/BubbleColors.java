package com.vk.im.engine.models.dialogs;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import xsna.dq;
import xsna.ky80;
import xsna.mq;
import xsna.n8g;
import xsna.vu5;
import xsna.zcl;

/* compiled from: DialogTheme.kt */
/* loaded from: classes2.dex */
public final class BubbleColors extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BubbleColors> CREATOR = new a();
    public final int A;
    public final int B;
    public final int C;
    public final int[] D;
    public final int E;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BubbleColors> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BubbleColors a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            int u3 = serializer.u();
            int u4 = serializer.u();
            int u5 = serializer.u();
            int u6 = serializer.u();
            int u7 = serializer.u();
            int u8 = serializer.u();
            int u9 = serializer.u();
            int u10 = serializer.u();
            int u11 = serializer.u();
            int u12 = serializer.u();
            int u13 = serializer.u();
            int u14 = serializer.u();
            int u15 = serializer.u();
            int u16 = serializer.u();
            int u17 = serializer.u();
            int u18 = serializer.u();
            int u19 = serializer.u();
            int u20 = serializer.u();
            int u21 = serializer.u();
            int u22 = serializer.u();
            int u23 = serializer.u();
            int u24 = serializer.u();
            int u25 = serializer.u();
            int u26 = serializer.u();
            int u27 = serializer.u();
            int[] c = serializer.c();
            if (c == null) {
                c = new int[0];
            }
            return new BubbleColors(u, u2, u3, u4, u5, u6, 0, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20, u21, u22, u23, u24, u25, u26, u27, c, serializer.u(), 64, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BubbleColors[i];
        }
    }

    public BubbleColors() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 1073741823, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.S(this.k);
        serializer.S(this.l);
        serializer.S(this.m);
        serializer.S(this.n);
        serializer.S(this.o);
        serializer.S(this.p);
        serializer.S(this.q);
        serializer.S(this.r);
        serializer.S(this.s);
        serializer.S(this.t);
        serializer.S(this.u);
        serializer.S(this.v);
        serializer.S(this.w);
        serializer.S(this.x);
        serializer.S(this.y);
        serializer.S(this.z);
        serializer.S(this.A);
        serializer.S(this.B);
        serializer.S(this.C);
        serializer.T(this.D);
        serializer.S(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BubbleColors.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        BubbleColors bubbleColors = (BubbleColors) obj;
        return this.b == bubbleColors.b && this.c == bubbleColors.c && this.d == bubbleColors.d && this.e == bubbleColors.e && this.f == bubbleColors.f && this.g == bubbleColors.g && this.h == bubbleColors.h && this.i == bubbleColors.i && this.j == bubbleColors.j && this.k == bubbleColors.k && this.l == bubbleColors.l && this.m == bubbleColors.m && this.n == bubbleColors.n && this.o == bubbleColors.o && this.p == bubbleColors.p && this.q == bubbleColors.q && this.r == bubbleColors.r && this.s == bubbleColors.s && this.t == bubbleColors.t && this.u == bubbleColors.u && this.v == bubbleColors.v && this.w == bubbleColors.w && this.x == bubbleColors.x && this.y == bubbleColors.y && this.z == bubbleColors.z && this.A == bubbleColors.A && this.B == bubbleColors.B && this.C == bubbleColors.C && Arrays.equals(this.D, bubbleColors.D) && this.E == bubbleColors.E;
    }

    public final int hashCode() {
        return dq.d(((((((((((((((((((((((((((((((((((((((((((((((((((((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31, 31, this.D) + this.E;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleColors(accent=");
        ky80.b(this.b, ", attach_tint=", sb);
        ky80.b(this.c, ", text_title=", sb);
        ky80.b(this.d, ", text_link=", sb);
        ky80.b(this.e, ", text_placeholder=", sb);
        ky80.b(this.f, ", text_primary=", sb);
        ky80.b(this.g, ", text_time=", sb);
        ky80.b(this.h, ", text_secondary=", sb);
        ky80.b(this.i, ", text_tertiary=", sb);
        ky80.b(this.j, ", text_name=", sb);
        ky80.b(this.k, ", bubble_gift_text=", sb);
        ky80.b(this.l, ", bubble_gift_text_secondary=", sb);
        ky80.b(this.m, ", forward_text_title=", sb);
        ky80.b(this.n, ", forward_line_tint=", sb);
        ky80.b(this.o, ", bubble_default=", sb);
        ky80.b(this.p, ", bubble_selected=", sb);
        ky80.b(this.q, ", bubble_accent=", sb);
        ky80.b(this.r, ", bubble_gift=", sb);
        ky80.b(this.s, ", bubble_gift_selected=", sb);
        ky80.b(this.t, ", bubble_gift_button=", sb);
        ky80.b(this.u, ", bubble_wallpaper=", sb);
        ky80.b(this.v, ", bubble_wallpaper_selected=", sb);
        ky80.b(this.w, ", bubble_border=", sb);
        ky80.b(this.x, ", bubble_expirable=", sb);
        ky80.b(this.y, ", bubble_expirable_selected=", sb);
        ky80.b(this.z, ", bubble_send_status_tint=", sb);
        ky80.b(this.A, ", bubble_button=", sb);
        ky80.b(this.B, ", bubble_wallpaper_button=", sb);
        ky80.b(this.C, ", bubble_gradient=", sb);
        mq.f(this.D, sb, ", bubble_gift_random_pack=");
        return vu5.b(sb, this.E, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BubbleColors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int[] iArr, int i29, int i30, zcl zclVar) {
        this(r1, r3, r4, r5, r6, r7, (i30 & 64) != 0 ? n8g.l(r7, 102) : i7, (i30 & 128) != 0 ? 0 : i8, (i30 & 256) != 0 ? 0 : i9, (i30 & 512) != 0 ? 0 : i10, (i30 & 1024) != 0 ? 0 : i11, (i30 & 2048) != 0 ? 0 : i12, (i30 & 4096) != 0 ? 0 : i13, (i30 & 8192) != 0 ? 0 : i14, (i30 & 16384) != 0 ? 0 : i15, (i30 & 32768) != 0 ? 0 : i16, (i30 & 65536) != 0 ? 0 : i17, (i30 & 131072) != 0 ? 0 : i18, (i30 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? 0 : i19, (i30 & 524288) != 0 ? 0 : i20, (i30 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0 : i21, (i30 & 2097152) != 0 ? 0 : i22, (i30 & 4194304) != 0 ? 0 : i23, (i30 & 8388608) != 0 ? 0 : i24, (i30 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0 : i25, (i30 & 33554432) != 0 ? 0 : i26, (i30 & 67108864) != 0 ? 0 : i27, (i30 & 134217728) != 0 ? 0 : i28, (i30 & 268435456) != 0 ? new int[0] : iArr, (i30 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? 0 : i29);
        int i31 = (i30 & 1) != 0 ? 0 : i;
        int i32 = (i30 & 2) != 0 ? 0 : i2;
        int i33 = (i30 & 4) != 0 ? 0 : i3;
        int i34 = (i30 & 8) != 0 ? 0 : i4;
        int i35 = (i30 & 16) != 0 ? 0 : i5;
        int i36 = (i30 & 32) != 0 ? 0 : i6;
    }

    public BubbleColors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int[] iArr, int i29) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
        this.m = i12;
        this.n = i13;
        this.o = i14;
        this.p = i15;
        this.q = i16;
        this.r = i17;
        this.s = i18;
        this.t = i19;
        this.u = i20;
        this.v = i21;
        this.w = i22;
        this.x = i23;
        this.y = i24;
        this.z = i25;
        this.A = i26;
        this.B = i27;
        this.C = i28;
        this.D = iArr;
        this.E = i29;
    }
}
