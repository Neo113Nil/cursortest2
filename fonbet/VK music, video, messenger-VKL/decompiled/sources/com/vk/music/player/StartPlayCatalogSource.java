package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.music.player.PlaySourceMeta;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.yba;
import xsna.zcl;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlayCatalogSource extends StartPlaySource implements yba {
    public static final Serializer.c<StartPlayCatalogSource> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final PlaySourceMeta h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlayCatalogSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlayCatalogSource a(Serializer serializer) {
            return new StartPlayCatalogSource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlayCatalogSource[i];
        }
    }

    public /* synthetic */ StartPlayCatalogSource(String str, String str2, String str3, String str4, boolean z, PlaySourceMeta playSourceMeta, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? PlaySourceMeta.Default.b : playSourceMeta);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayCatalogSource)) {
            return false;
        }
        StartPlayCatalogSource startPlayCatalogSource = (StartPlayCatalogSource) obj;
        return epx.f(this.c, startPlayCatalogSource.c) && epx.f(this.d, startPlayCatalogSource.d) && epx.f(this.e, startPlayCatalogSource.e) && epx.f(this.f, startPlayCatalogSource.f) && this.g == startPlayCatalogSource.g && epx.f(this.h, startPlayCatalogSource.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.h.hashCode() + qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        return "StartPlayCatalogSource(blockId=" + this.c + ", sectionId=" + this.d + ", nextFrom=" + this.e + ", audioId=" + this.f + ", isOfflineMusic=" + this.g + ", meta=" + this.h + ')';
    }

    @Override // xsna.yba
    public final String v0() {
        return this.d;
    }

    @Override // xsna.yba
    public final String w() {
        return this.c;
    }

    @Override // com.vk.music.player.StartPlaySource
    public final PlaySourceMeta zb() {
        return this.h;
    }

    public StartPlayCatalogSource(String str, String str2, String str3, String str4, boolean z, PlaySourceMeta playSourceMeta) {
        super(playSourceMeta, null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = playSourceMeta;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartPlayCatalogSource(Serializer serializer) {
        this(r3, r0 == null ? "" : r0, serializer.H(), serializer.H(), serializer.m(), null, 32, null);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
