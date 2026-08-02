package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlaySourceMeta;
import xsna.epx;
import xsna.iq;
import xsna.qoy;
import xsna.urd0;
import xsna.yba;
import xsna.zcl;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlayVkMixSource extends StartPlaySource implements yba {
    public static final Serializer.c<StartPlayVkMixSource> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final MixSettingsEntity h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Long l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlayVkMixSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlayVkMixSource a(Serializer serializer) {
            return new StartPlayVkMixSource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlayVkMixSource[i];
        }
    }

    public /* synthetic */ StartPlayVkMixSource(String str, String str2, String str3, boolean z, String str4, MixSettingsEntity mixSettingsEntity, String str5, String str6, Integer num, Long l, int i, zcl zclVar) {
        this(str, str2, str3, z, str4, (i & 32) != 0 ? null : mixSettingsEntity, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : l);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.b0(this.l);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.e0(this.h);
        serializer.j0(this.g);
        serializer.V(this.k);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayVkMixSource)) {
            return false;
        }
        StartPlayVkMixSource startPlayVkMixSource = (StartPlayVkMixSource) obj;
        return epx.f(this.c, startPlayVkMixSource.c) && epx.f(this.d, startPlayVkMixSource.d) && epx.f(this.e, startPlayVkMixSource.e) && this.f == startPlayVkMixSource.f && epx.f(this.g, startPlayVkMixSource.g) && epx.f(this.h, startPlayVkMixSource.h) && epx.f(this.i, startPlayVkMixSource.i) && epx.f(this.j, startPlayVkMixSource.j) && epx.f(this.k, startPlayVkMixSource.k) && epx.f(this.l, startPlayVkMixSource.l);
    }

    public final String getId() {
        return this.j;
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(urd0.a(urd0.a(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        MixSettingsEntity mixSettingsEntity = this.h;
        int hashCode = (a2 + (mixSettingsEntity == null ? 0 : mixSettingsEntity.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.k;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.l;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlayVkMixSource(blockId=");
        sb.append(this.c);
        sb.append(", sectionId=");
        sb.append(this.d);
        sb.append(", mixId=");
        sb.append(this.e);
        sb.append(", isTunable=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", entityId=");
        sb.append(this.i);
        sb.append(", id=");
        sb.append(this.j);
        sb.append(", sourceRes=");
        sb.append(this.k);
        sb.append(", mixOptionsId=");
        return iq.b(sb, this.l, ')');
    }

    @Override // xsna.yba
    public final String v0() {
        return this.d;
    }

    @Override // xsna.yba
    public final String w() {
        return this.c;
    }

    public StartPlayVkMixSource(String str, String str2, String str3, boolean z, String str4, MixSettingsEntity mixSettingsEntity, String str5, String str6, Integer num, Long l) {
        super(new PlaySourceMeta.VKMixPlaySourceMeta(str4, num, z, str3), null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = mixSettingsEntity;
        this.i = str5;
        this.j = str6;
        this.k = num;
        this.l = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartPlayVkMixSource(Serializer serializer) {
        this(r3, r4, r5, serializer.m(), r0 == null ? "" : r0, r8, r9, r10, serializer.v(), r12);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        Long x = serializer.x();
        String H4 = serializer.H();
        String H5 = serializer.H();
        MixSettingsEntity mixSettingsEntity = (MixSettingsEntity) serializer.A(MixSettingsEntity.class.getClassLoader());
        String H6 = serializer.H();
    }
}
