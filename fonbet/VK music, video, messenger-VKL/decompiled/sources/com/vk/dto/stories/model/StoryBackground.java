package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import java.io.File;
import kotlin.Result;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: StoryBackground.kt */
/* loaded from: classes18.dex */
public final class StoryBackground extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryBackground> CREATOR = new a();
    public final StoryBackgroundType b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Integer i;
    public final File j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryBackground> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryBackground a(Serializer serializer) {
            Object failure;
            Integer v = serializer.v();
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            String H4 = serializer.H();
            Serializer.c<StoryBackground> cVar = StoryBackground.CREATOR;
            try {
                failure = StoryBackgroundType.values()[serializer.u()];
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            StoryBackgroundType storyBackgroundType = (StoryBackgroundType) failure;
            if (storyBackgroundType == null) {
                storyBackgroundType = StoryBackgroundType.BLUR;
            }
            StoryBackgroundType storyBackgroundType2 = storyBackgroundType;
            File file = (File) serializer.C();
            Boolean n = serializer.n();
            return new StoryBackground(storyBackgroundType2, v, H, H2, H3, H4, n != null ? n.booleanValue() : false, serializer.v(), file);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryBackground[i];
        }
    }

    public /* synthetic */ StoryBackground(StoryBackgroundType storyBackgroundType, Integer num, String str, String str2, String str3, String str4, boolean z, Integer num2, File file, int i, zcl zclVar) {
        this(storyBackgroundType, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : file);
    }

    public static StoryBackground zb(StoryBackground storyBackground, String str, File file, int i) {
        StoryBackgroundType storyBackgroundType = storyBackground.b;
        Integer num = storyBackground.c;
        String str2 = storyBackground.d;
        String str3 = storyBackground.e;
        if ((i & 16) != 0) {
            str = storyBackground.f;
        }
        String str4 = str;
        String str5 = storyBackground.g;
        boolean z = storyBackground.h;
        Integer num2 = storyBackground.i;
        if ((i & 256) != 0) {
            file = storyBackground.j;
        }
        storyBackground.getClass();
        return new StoryBackground(storyBackgroundType, num, str2, str3, str4, str5, z, num2, file);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.S(this.b.ordinal());
        serializer.g0(this.j);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.V(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryBackground)) {
            return false;
        }
        StoryBackground storyBackground = (StoryBackground) obj;
        return this.b == storyBackground.b && epx.f(this.c, storyBackground.c) && epx.f(this.d, storyBackground.d) && epx.f(this.e, storyBackground.e) && epx.f(this.f, storyBackground.f) && epx.f(this.g, storyBackground.g) && this.h == storyBackground.h && epx.f(this.i, storyBackground.i) && epx.f(this.j, storyBackground.j);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int b = qoy.b((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h);
        Integer num2 = this.i;
        int hashCode6 = (b + (num2 == null ? 0 : num2.hashCode())) * 31;
        File file = this.j;
        return hashCode6 + (file != null ? file.hashCode() : 0);
    }

    public final String toString() {
        return "StoryBackground(type=" + this.b + ", id=" + this.c + ", url=" + this.d + ", preview=" + this.e + ", background=" + this.f + ", backgroundName=" + this.g + ", isPipette=" + this.h + ", backgroundNameRes=" + this.i + ", localVideoFile=" + this.j + ')';
    }

    public StoryBackground(StoryBackgroundType storyBackgroundType, Integer num, String str, String str2, String str3, String str4, boolean z, Integer num2, File file) {
        this.b = storyBackgroundType;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = num2;
        this.j = file;
    }
}
