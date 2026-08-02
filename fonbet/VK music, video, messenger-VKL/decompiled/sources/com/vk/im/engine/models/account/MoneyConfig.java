package com.vk.im.engine.models.account;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: MoneyConfig.kt */
/* loaded from: classes2.dex */
public final class MoneyConfig extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MoneyConfig> CREATOR = new a();
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final int l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MoneyConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MoneyConfig a(Serializer serializer) {
            return new MoneyConfig(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyConfig[i];
        }
    }

    public MoneyConfig() {
        this(0, 0, null, false, false, false, false, false, null, null, 0, 2047, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.S(this.l);
    }

    public /* synthetic */ MoneyConfig(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, int i3, int i4, zcl zclVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? false : z5, (i4 & 256) != 0 ? "" : str2, (i4 & 512) != 0 ? "" : str3, (i4 & 1024) != 0 ? 0 : i3);
    }

    public MoneyConfig(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, int i3) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = str2;
        this.k = str3;
        this.l = i3;
    }

    public MoneyConfig(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.u(), serializer.H(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.H(), serializer.H(), serializer.u());
    }
}
