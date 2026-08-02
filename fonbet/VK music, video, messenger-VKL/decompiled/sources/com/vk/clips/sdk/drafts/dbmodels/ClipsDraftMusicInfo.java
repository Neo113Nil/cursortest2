package com.vk.clips.sdk.drafts.dbmodels;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;
import xsna.xq;
import xsna.zcl;

/* compiled from: ClipsDraftMusicInfo.kt */
/* loaded from: classes17.dex */
public final class ClipsDraftMusicInfo implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipsDraftMusicInfo> CREATOR = new b();
    public static final a f = new a();
    public final ClipsEditorMusicInfo b;
    public final float c;
    public final AudioEffectType d;
    public final float e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsDraftMusicInfo> {
        @Override // xsna.aay
        public final ClipsDraftMusicInfo a(JSONObject jSONObject) {
            return new ClipsDraftMusicInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsDraftMusicInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDraftMusicInfo a(Serializer serializer) {
            ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) serializer.G(ClipsEditorMusicInfo.class.getClassLoader());
            float s = serializer.s();
            AudioEffectType.a aVar = AudioEffectType.Companion;
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            aVar.getClass();
            return new ClipsDraftMusicInfo(clipsEditorMusicInfo, s, AudioEffectType.a.a(H), serializer.s());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDraftMusicInfo[i];
        }
    }

    public ClipsDraftMusicInfo(ClipsEditorMusicInfo clipsEditorMusicInfo, float f2, AudioEffectType audioEffectType, float f3) {
        this.b = clipsEditorMusicInfo;
        this.c = f2;
        this.d = audioEffectType;
        this.e = f3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.P(this.c);
        serializer.j0(this.d.name());
        serializer.P(this.e);
    }

    public final ClipsEditorMusicInfo d() {
        return this.b;
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
        w9yVar.e(Float.valueOf(this.e), "speed");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsDraftMusicInfo)) {
            return false;
        }
        ClipsDraftMusicInfo clipsDraftMusicInfo = (ClipsDraftMusicInfo) obj;
        return epx.f(this.b, clipsDraftMusicInfo.b) && Float.compare(this.c, clipsDraftMusicInfo.c) == 0 && this.d == clipsDraftMusicInfo.d && Float.compare(this.e, clipsDraftMusicInfo.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftMusicInfo(music=");
        sb.append(this.b);
        sb.append(", volume=");
        sb.append(this.c);
        sb.append(", audioEffect=");
        sb.append(this.d);
        sb.append(", speed=");
        return xq.c(')', this.e, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ ClipsDraftMusicInfo(ClipsEditorMusicInfo clipsEditorMusicInfo, float f2, AudioEffectType audioEffectType, float f3, int i, zcl zclVar) {
        this(clipsEditorMusicInfo, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? AudioEffectType.DEFAULT : audioEffectType, (i & 8) != 0 ? 1.0f : f3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsDraftMusicInfo(JSONObject jSONObject) {
        this(r1, r0, AudioEffectType.a.a(r3), (float) (!jSONObject.has("speed") ? jSONObject.getDouble("speed") : 1.0d));
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        float f2 = (float) jSONObject.getDouble("volume");
        ClipsEditorMusicInfo.a aVar = ClipsEditorMusicInfo.m;
        if (jSONObject.has("music")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("music");
                aVar.getClass();
                clipsEditorMusicInfo = new ClipsEditorMusicInfo(jSONObject2);
            } catch (JSONException e) {
                L.i(e);
            }
            AudioEffectType.a aVar2 = AudioEffectType.Companion;
            String string = !jSONObject.has("audio_effect") ? jSONObject.getString("audio_effect") : "";
            aVar2.getClass();
        }
        clipsEditorMusicInfo = null;
        AudioEffectType.a aVar22 = AudioEffectType.Companion;
        if (!jSONObject.has("audio_effect")) {
        }
        aVar22.getClass();
    }
}
