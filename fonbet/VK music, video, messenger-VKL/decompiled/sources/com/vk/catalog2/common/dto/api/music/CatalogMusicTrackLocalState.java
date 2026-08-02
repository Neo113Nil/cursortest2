package com.vk.catalog2.common.dto.api.music;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: CatalogMusicTrackLocalState.kt */
/* loaded from: classes16.dex */
public final class CatalogMusicTrackLocalState extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMusicTrackLocalState> CREATOR = new a();
    public final boolean b;
    public boolean c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogMusicTrackLocalState> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMusicTrackLocalState a(Serializer serializer) {
            return new CatalogMusicTrackLocalState(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMusicTrackLocalState[i];
        }
    }

    public CatalogMusicTrackLocalState() {
        this(false, false, false, 7, null);
    }

    public static CatalogMusicTrackLocalState zb(CatalogMusicTrackLocalState catalogMusicTrackLocalState, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = catalogMusicTrackLocalState.b;
        }
        boolean z3 = catalogMusicTrackLocalState.c;
        if ((i & 4) != 0) {
            z2 = catalogMusicTrackLocalState.d;
        }
        catalogMusicTrackLocalState.getClass();
        return new CatalogMusicTrackLocalState(z, z3, z2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMusicTrackLocalState)) {
            return false;
        }
        CatalogMusicTrackLocalState catalogMusicTrackLocalState = (CatalogMusicTrackLocalState) obj;
        return this.b == catalogMusicTrackLocalState.b && this.c == catalogMusicTrackLocalState.c && this.d == catalogMusicTrackLocalState.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMusicTrackLocalState(isMagicWandRequired=");
        sb.append(this.b);
        sb.append(", wasMagicWandTooltipShown=");
        sb.append(this.c);
        sb.append(", addRemoveToggle=");
        return q0.a(sb, this.d, ')');
    }

    public /* synthetic */ CatalogMusicTrackLocalState(boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public CatalogMusicTrackLocalState(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public CatalogMusicTrackLocalState(Serializer serializer) {
        this(serializer.m(), serializer.m(), serializer.m());
    }
}
