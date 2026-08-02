package com.vk.auth.ui.tertiarybutton;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: TertiaryButtonConfig.kt */
/* loaded from: classes15.dex */
public final class TertiaryButtonConfig extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<TertiaryButtonConfig> CREATOR = new a();
    public final boolean b;
    public final Integer c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TertiaryButtonConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TertiaryButtonConfig a(Serializer serializer) {
            return new TertiaryButtonConfig(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TertiaryButtonConfig[i];
        }
    }

    static {
        new TertiaryButtonConfig(false, (Integer) null);
    }

    public TertiaryButtonConfig(boolean z, Integer num) {
        this.b = z;
        this.c = num;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.V(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TertiaryButtonConfig)) {
            return false;
        }
        TertiaryButtonConfig tertiaryButtonConfig = (TertiaryButtonConfig) obj;
        return this.b == tertiaryButtonConfig.b && epx.f(this.c, tertiaryButtonConfig.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TertiaryButtonConfig(show=");
        sb.append(this.b);
        sb.append(", text=");
        return uqi.b(sb, this.c, ')');
    }

    public TertiaryButtonConfig(Serializer serializer, zcl zclVar) {
        this(serializer.m(), serializer.v());
    }
}
