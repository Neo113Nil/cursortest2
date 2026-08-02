package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockMusicArtistNew.kt */
/* loaded from: classes16.dex */
public final class MusicArtistChip extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicArtistChip> CREATOR = new a();
    public final String b;
    public final String c;
    public final UIBlockAction d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicArtistChip> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicArtistChip a(Serializer serializer) {
            return new MusicArtistChip(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicArtistChip[i];
        }
    }

    public MusicArtistChip(String str, String str2, UIBlockAction uIBlockAction, String str3, String str4, String str5, String str6, String str7) {
        this.b = str;
        this.c = str2;
        this.d = uIBlockAction;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicArtistChip)) {
            return false;
        }
        MusicArtistChip musicArtistChip = (MusicArtistChip) obj;
        return epx.f(this.b, musicArtistChip.b) && epx.f(this.c, musicArtistChip.c) && epx.f(this.d, musicArtistChip.d) && epx.f(this.e, musicArtistChip.e) && epx.f(this.f, musicArtistChip.f) && epx.f(this.g, musicArtistChip.g) && epx.f(this.h, musicArtistChip.h) && epx.f(this.i, musicArtistChip.i);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UIBlockAction uIBlockAction = this.d;
        int hashCode3 = (hashCode2 + (uIBlockAction == null ? 0 : uIBlockAction.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicArtistChip(title=");
        sb.append(this.b);
        sb.append(", iconName=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", mixId=");
        sb.append(this.f);
        sb.append(", entityId=");
        sb.append(this.g);
        sb.append(", blockId=");
        sb.append(this.h);
        sb.append(", type=");
        return ho8.a(sb, this.i, ')');
    }

    public MusicArtistChip(Serializer serializer) {
        this(serializer.H(), serializer.H(), (UIBlockAction) serializer.G(UIBlockAction.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
