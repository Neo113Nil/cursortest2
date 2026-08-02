package com.vk.dto.common.clips;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ozl;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ClipsDraftMusicOld.kt */
@ozl
/* loaded from: classes18.dex */
public final class ClipsDraftMusicOld implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipsDraftMusicOld> CREATOR = new b();
    public static final a e = new a();
    public final StoryMusicInfo b;
    public final float c;
    public final AudioEffectType d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsDraftMusicOld> {
        @Override // xsna.aay
        public final ClipsDraftMusicOld a(JSONObject jSONObject) {
            return new ClipsDraftMusicOld(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsDraftMusicOld> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDraftMusicOld a(Serializer serializer) {
            StoryMusicInfo storyMusicInfo = (StoryMusicInfo) serializer.G(StoryMusicInfo.class.getClassLoader());
            float s = serializer.s();
            AudioEffectType.a aVar = AudioEffectType.Companion;
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            aVar.getClass();
            return new ClipsDraftMusicOld(storyMusicInfo, s, AudioEffectType.a.a(H));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDraftMusicOld[i];
        }
    }

    public ClipsDraftMusicOld(StoryMusicInfo storyMusicInfo, float f, AudioEffectType audioEffectType) {
        this.b = storyMusicInfo;
        this.c = f;
        this.d = audioEffectType;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.P(this.c);
        serializer.j0(this.d.name());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g("music", this.b);
        w9yVar.e(Float.valueOf(this.c), "volume");
        w9yVar.e(this.d.name(), "audio_effect");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsDraftMusicOld)) {
            return false;
        }
        ClipsDraftMusicOld clipsDraftMusicOld = (ClipsDraftMusicOld) obj;
        return epx.f(this.b, clipsDraftMusicOld.b) && Float.compare(this.c, clipsDraftMusicOld.c) == 0 && this.d == clipsDraftMusicOld.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ClipsDraftMusicOld(music=" + this.b + ", volume=" + this.c + ", audioEffect=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ ClipsDraftMusicOld(StoryMusicInfo storyMusicInfo, float f, AudioEffectType audioEffectType, int i, zcl zclVar) {
        this(storyMusicInfo, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? AudioEffectType.DEFAULT : audioEffectType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsDraftMusicOld(JSONObject jSONObject) {
        this(r1, r0, AudioEffectType.a.a(r6));
        StoryMusicInfo storyMusicInfo;
        float f = (float) jSONObject.getDouble("volume");
        StoryMusicInfo.a aVar = StoryMusicInfo.o;
        if (jSONObject.has("music")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("music");
                aVar.getClass();
                storyMusicInfo = new StoryMusicInfo(jSONObject2);
            } catch (JSONException e2) {
                L.i(e2);
            }
            AudioEffectType.a aVar2 = AudioEffectType.Companion;
            String string = !jSONObject.has("audio_effect") ? jSONObject.getString("audio_effect") : "";
            aVar2.getClass();
        }
        storyMusicInfo = null;
        AudioEffectType.a aVar22 = AudioEffectType.Companion;
        if (!jSONObject.has("audio_effect")) {
        }
        aVar22.getClass();
    }
}
