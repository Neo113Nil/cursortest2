package com.vk.clips.editor.state.model;

import com.vk.clips.editor.state.model.e;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import defpackage.q0;
import xsna.asp;
import xsna.bzd;
import xsna.epx;
import xsna.kyd;
import xsna.zrp;

/* compiled from: ClipsEditorAudioItem.kt */
/* loaded from: classes16.dex */
public final class ClipsEditorAudioItem implements kyd {
    public final ClipsEditorMusicInfo a;
    public final float b;
    public final float c;
    public final AudioEffectType d;
    public final boolean e;
    public final String f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsEditorAudioItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type EXTRACTED;
        public static final Type LICENSED;
        public static final Type VOICEOVER;

        static {
            Type type = new Type("LICENSED", 0);
            LICENSED = type;
            Type type2 = new Type("EXTRACTED", 1);
            EXTRACTED = type2;
            Type type3 = new Type("VOICEOVER", 2);
            VOICEOVER = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ClipsEditorAudioItem(ClipsEditorMusicInfo clipsEditorMusicInfo, float f, float f2, AudioEffectType audioEffectType, boolean z) {
        this.a = clipsEditorMusicInfo;
        this.b = f;
        this.c = f2;
        this.d = audioEffectType;
        this.e = z;
        this.f = String.valueOf(clipsEditorMusicInfo.b.b);
    }

    public static ClipsEditorAudioItem a(ClipsEditorAudioItem clipsEditorAudioItem, ClipsEditorMusicInfo clipsEditorMusicInfo, float f, float f2, AudioEffectType audioEffectType, int i) {
        if ((i & 1) != 0) {
            clipsEditorMusicInfo = clipsEditorAudioItem.a;
        }
        ClipsEditorMusicInfo clipsEditorMusicInfo2 = clipsEditorMusicInfo;
        if ((i & 2) != 0) {
            f = clipsEditorAudioItem.b;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            f2 = clipsEditorAudioItem.c;
        }
        float f4 = f2;
        if ((i & 8) != 0) {
            audioEffectType = clipsEditorAudioItem.d;
        }
        AudioEffectType audioEffectType2 = audioEffectType;
        boolean z = (i & 16) != 0 ? clipsEditorAudioItem.e : false;
        clipsEditorAudioItem.getClass();
        return new ClipsEditorAudioItem(clipsEditorMusicInfo2, f3, f4, audioEffectType2, z);
    }

    public final long b() {
        int i = bzd.x;
        ClipsEditorMusicInfo clipsEditorMusicInfo = this.a;
        return (clipsEditorMusicInfo.j || clipsEditorMusicInfo.l) ? bzd.x : bzd.y;
    }

    @Override // xsna.kyd
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e.b getOffset() {
        return new e.b(this.a.f);
    }

    public final Type d() {
        ClipsEditorMusicInfo clipsEditorMusicInfo = this.a;
        return clipsEditorMusicInfo.j ? Type.EXTRACTED : clipsEditorMusicInfo.l ? Type.VOICEOVER : Type.LICENSED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorAudioItem)) {
            return false;
        }
        ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) obj;
        return epx.f(this.a, clipsEditorAudioItem.a) && Float.compare(this.b, clipsEditorAudioItem.b) == 0 && Float.compare(this.c, clipsEditorAudioItem.c) == 0 && this.d == clipsEditorAudioItem.d && this.e == clipsEditorAudioItem.e;
    }

    @Override // xsna.kyd
    public final long getDurationMs() {
        long j = this.a.e;
        return j != 0 ? j - r0.d : (long) (r0.b.e / this.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    @Override // xsna.kyd
    public final String m() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorAudioItem(audio=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", audioEffect=");
        sb.append(this.d);
        sb.append(", isVoiceOverStub=");
        return q0.a(sb, this.e, ')');
    }

    public /* synthetic */ ClipsEditorAudioItem(ClipsEditorMusicInfo clipsEditorMusicInfo, float f, float f2, AudioEffectType audioEffectType, boolean z, int i) {
        this(clipsEditorMusicInfo, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? 1.0f : f2, (i & 8) != 0 ? AudioEffectType.DEFAULT : audioEffectType, (i & 16) != 0 ? false : z);
    }
}
