package com.vk.dto.masks;

import com.vk.core.serialize.Serializer;
import xsna.epx;

/* compiled from: MaskDisableReason.kt */
/* loaded from: classes18.dex */
public final class MaskDisableReason extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MaskDisableReason> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MaskDisableReason> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MaskDisableReason a(Serializer serializer) {
            return new MaskDisableReason(serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaskDisableReason[i];
        }
    }

    public MaskDisableReason(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!epx.f(obj != null ? obj.getClass() : null, MaskDisableReason.class)) {
            return false;
        }
        MaskDisableReason maskDisableReason = (MaskDisableReason) obj;
        return epx.f(this.b, maskDisableReason.b) && epx.f(this.c, maskDisableReason.c) && epx.f(this.d, maskDisableReason.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
