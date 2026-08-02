package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: StickerSuggestion.kt */
/* loaded from: classes18.dex */
public final class StickerSuggestion extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerSuggestion> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerSuggestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerSuggestion a(Serializer serializer) {
            return new StickerSuggestion(serializer.H(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerSuggestion[i];
        }
    }

    public /* synthetic */ StickerSuggestion(String str, boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this(str, z, z2, (i & 8) != 0 ? false : z3);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSuggestion)) {
            return false;
        }
        StickerSuggestion stickerSuggestion = (StickerSuggestion) obj;
        return epx.f(this.b, stickerSuggestion.b) && this.c == stickerSuggestion.c && this.d == stickerSuggestion.d && this.e == stickerSuggestion.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSuggestion(word=");
        sb.append(this.b);
        sb.append(", isPrimary=");
        sb.append(this.c);
        sb.append(", isUser=");
        sb.append(this.d);
        sb.append(", isRemovePending=");
        return q0.a(sb, this.e, ')');
    }

    public StickerSuggestion(String str, boolean z, boolean z2, boolean z3) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
