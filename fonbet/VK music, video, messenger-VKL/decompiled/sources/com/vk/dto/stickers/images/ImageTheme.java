package com.vk.dto.stickers.images;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ImageTheme.kt */
/* loaded from: classes18.dex */
public final class ImageTheme extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ImageTheme> CREATOR = new a();

    @pmi0("modifier")
    private final String modifier;

    @pmi0("theme")
    private final ThemeType theme;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ImageTheme> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageTheme a(Serializer serializer) {
            return new ImageTheme(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageTheme[i];
        }
    }

    public /* synthetic */ ImageTheme(Serializer serializer, zcl zclVar) {
        this(serializer);
    }

    public final ThemeType Ab() {
        return this.theme;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.theme);
        serializer.j0(this.modifier);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageTheme)) {
            return false;
        }
        ImageTheme imageTheme = (ImageTheme) obj;
        return this.theme == imageTheme.theme && epx.f(this.modifier, imageTheme.modifier);
    }

    public final int hashCode() {
        return this.modifier.hashCode() + (this.theme.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageTheme(theme=");
        sb.append(this.theme);
        sb.append(", modifier=");
        return ho8.a(sb, this.modifier, ')');
    }

    public final String zb() {
        return this.modifier;
    }

    public /* synthetic */ ImageTheme(ThemeType themeType, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? ThemeType.LIGHT : themeType, (i & 2) != 0 ? "" : str);
    }

    public ImageTheme(ThemeType themeType, String str) {
        this.theme = themeType;
        this.modifier = str;
    }

    public ImageTheme() {
        this(ThemeType.LIGHT, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ImageTheme(Serializer serializer) {
        this(r0 == null ? ThemeType.LIGHT : r0, serializer.H());
        ThemeType themeType = (ThemeType) serializer.C();
    }
}
