package com.vk.voip.ui.broadcast.views.config;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: BroadcastConfigViewParams.kt */
/* loaded from: classes7.dex */
public final class BroadcastConfigViewParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BroadcastConfigViewParams> CREATOR = new a();
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final boolean l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BroadcastConfigViewParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BroadcastConfigViewParams a(Serializer serializer) {
            return new BroadcastConfigViewParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BroadcastConfigViewParams[i];
        }
    }

    public BroadcastConfigViewParams() {
        this(null, null, null, null, null, null, null, null, null, false, false, 2047, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.V(this.c);
        serializer.V(this.d);
        serializer.V(this.e);
        serializer.V(this.f);
        serializer.V(this.g);
        serializer.V(this.h);
        serializer.V(this.i);
        serializer.V(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ BroadcastConfigViewParams(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z, boolean z2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? false : z2);
    }

    public BroadcastConfigViewParams(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z, boolean z2) {
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = num5;
        this.g = num6;
        this.h = num7;
        this.i = num8;
        this.j = num9;
        this.k = z;
        this.l = z2;
    }

    public BroadcastConfigViewParams(Serializer serializer) {
        this(serializer.v(), serializer.v(), serializer.v(), serializer.v(), serializer.v(), serializer.v(), serializer.v(), serializer.v(), serializer.v(), serializer.m(), false, 1024, null);
    }
}
