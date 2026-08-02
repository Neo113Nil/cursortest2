package com.vk.superapp.api.dto.story.actions;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;

/* compiled from: WebActionAudioTrack.kt */
/* loaded from: classes6.dex */
public final class WebActionAudioTrack extends StickerAction {
    public static final Serializer.c<WebActionAudioTrack> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final WebStickerType h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionAudioTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionAudioTrack a(Serializer serializer) {
            return new WebActionAudioTrack(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionAudioTrack[i];
        }
    }

    public WebActionAudioTrack(String str, String str2, String str3, String str4, String str5, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = WebStickerType.AUDIO_TRACK;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("audio_track_id", this.b);
        jSONObject.put("audio_track_performer", this.c);
        jSONObject.putOpt("audio_track_album", this.e);
        jSONObject.put("audio_track_title", this.d);
        jSONObject.put("audio_track_thumb", this.f);
        jSONObject.put("start_from", this.g);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.m0(this.e);
        serializer.j0(this.f);
        serializer.S(this.g);
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.h;
    }

    public WebActionAudioTrack(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.I(), serializer.H(), serializer.u());
    }
}
