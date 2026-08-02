package com.vk.catalog2.common.dto.api.music;

import com.google.gson.Gson;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.audio.dto.AudioStreamMixSettingsDto;
import com.vk.api.generated.audio.dto.AudioStreamMixTitlesDto;
import com.vk.core.serialize.Serializer;
import com.vk.music.mixsettings.MixSettingsEntity;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.p4v0;
import xsna.qoy;
import xsna.tru;
import xsna.urd0;

/* compiled from: CatalogAudioStreamMix.kt */
/* loaded from: classes16.dex */
public final class CatalogAudioStreamMix extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogAudioStreamMix> CREATOR = new b();
    public static final a j = new a();
    public final String b;
    public final String c;
    public final String d;
    public final MixSettingsEntity e;
    public final AudioStreamMixTitles f;
    public final String g;
    public final boolean h;
    public final AudioStreamMix i;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogAudioStreamMix> {
        @Override // xsna.aay
        public final CatalogAudioStreamMix a(JSONObject jSONObject) {
            return new CatalogAudioStreamMix(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogAudioStreamMix> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogAudioStreamMix a(Serializer serializer) {
            return new CatalogAudioStreamMix(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogAudioStreamMix[i];
        }
    }

    static {
        new CatalogAudioStreamMix("", "", "", null, null, "", false, null);
    }

    public CatalogAudioStreamMix(String str, String str2, String str3, MixSettingsEntity mixSettingsEntity, AudioStreamMixTitles audioStreamMixTitles, String str4, boolean z, AudioStreamMix audioStreamMix) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mixSettingsEntity;
        this.f = audioStreamMixTitles;
        this.g = str4;
        this.h = z;
        this.i = audioStreamMix;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.j0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.e0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogAudioStreamMix)) {
            return false;
        }
        CatalogAudioStreamMix catalogAudioStreamMix = (CatalogAudioStreamMix) obj;
        return epx.f(this.b, catalogAudioStreamMix.b) && epx.f(this.c, catalogAudioStreamMix.c) && epx.f(this.d, catalogAudioStreamMix.d) && epx.f(this.e, catalogAudioStreamMix.e) && epx.f(this.f, catalogAudioStreamMix.f) && epx.f(this.g, catalogAudioStreamMix.g) && this.h == catalogAudioStreamMix.h && epx.f(this.i, catalogAudioStreamMix.i);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        MixSettingsEntity mixSettingsEntity = this.e;
        int hashCode = (a2 + (mixSettingsEntity == null ? 0 : mixSettingsEntity.hashCode())) * 31;
        AudioStreamMixTitles audioStreamMixTitles = this.f;
        int b2 = qoy.b(urd0.a((hashCode + (audioStreamMixTitles == null ? 0 : audioStreamMixTitles.hashCode())) * 31, 31, this.g), 31, this.h);
        AudioStreamMix audioStreamMix = this.i;
        return b2 + (audioStreamMix != null ? audioStreamMix.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogAudioStreamMix(id=" + this.b + ",name=" + this.f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogAudioStreamMix(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, r8, r11 != null ? (AudioStreamMix) AudioStreamMix.d.a(r11) : null);
        AudioStreamMixTitles audioStreamMixTitles;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("background_animation_url");
        String optString3 = jSONObject.optString(CampaignEx.JSON_KEY_IMAGE_URL);
        JSONObject optJSONObject = jSONObject.optJSONObject("titles");
        if (optJSONObject != null) {
            AudioStreamMixTitlesDto audioStreamMixTitlesDto = (AudioStreamMixTitlesDto) ((Gson) tru.a.getValue()).fromJson(optJSONObject.toString(), AudioStreamMixTitlesDto.class);
            audioStreamMixTitles = new AudioStreamMixTitles(audioStreamMixTitlesDto.d(), audioStreamMixTitlesDto.e());
        } else {
            audioStreamMixTitles = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("settings");
        MixSettingsEntity a2 = optJSONObject2 != null ? p4v0.a((AudioStreamMixSettingsDto) ((Gson) tru.a.getValue()).fromJson(optJSONObject2.toString(), AudioStreamMixSettingsDto.class)) : null;
        String optString4 = jSONObject.optString("description");
        boolean optBoolean = jSONObject.optBoolean("is_tunable");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("stream_mix");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogAudioStreamMix(Serializer serializer) {
        this(r3, r4, r5, r6, r7, r0 == null ? "" : r0, serializer.m(), (AudioStreamMix) serializer.A(AudioStreamMix.class.getClassLoader()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        MixSettingsEntity mixSettingsEntity = (MixSettingsEntity) serializer.A(MixSettingsEntity.class.getClassLoader());
        AudioStreamMixTitles audioStreamMixTitles = (AudioStreamMixTitles) serializer.A(AudioStreamMixTitles.class.getClassLoader());
        String H4 = serializer.H();
    }
}
