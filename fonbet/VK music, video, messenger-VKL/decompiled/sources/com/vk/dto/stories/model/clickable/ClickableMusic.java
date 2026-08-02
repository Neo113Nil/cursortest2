package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickableMusic.kt */
/* loaded from: classes18.dex */
public final class ClickableMusic extends ClickableSticker {
    public static final Serializer.c<ClickableMusic> CREATOR = new a();
    public final MusicTrack e;
    public final MusicDynamicRestriction f;
    public final int g;
    public final String h;
    public final boolean i;
    public final WebStickerType j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableMusic> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableMusic a(Serializer serializer) {
            return new ClickableMusic(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableMusic[i];
        }
    }

    public /* synthetic */ ClickableMusic(long j, List list, q500 q500Var, MusicTrack musicTrack, MusicDynamicRestriction musicDynamicRestriction, int i, String str, boolean z, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, musicTrack, (i2 & 16) != 0 ? null : musicDynamicRestriction, i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? false : z);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        MusicTrack musicTrack = this.e;
        aVar.b("text_value", musicTrack != null ? musicTrack.Fb() : null);
        aVar.b(TtmlNode.TAG_STYLE, this.h);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.S(this.g);
        serializer.m0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        MusicTrack musicTrack = this.e;
        e5.put("audio_id", musicTrack != null ? Integer.valueOf(musicTrack.b) : null);
        e5.put("audio_owner_id", musicTrack != null ? musicTrack.c : null);
        e5.put("audio_start_time", this.g);
        e5.put("audio_access_key", musicTrack != null ? musicTrack.r : null);
        e5.put(TtmlNode.TAG_STYLE, this.h);
        e5.put("is_cover", this.i);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableMusic) || !super.equals(obj)) {
            return false;
        }
        ClickableMusic clickableMusic = (ClickableMusic) obj;
        return epx.f(this.e, clickableMusic.e) && epx.f(this.f, clickableMusic.f) && this.g == clickableMusic.g && this.j == clickableMusic.j && epx.f(this.h, clickableMusic.h) && this.i == clickableMusic.i;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        MusicTrack musicTrack = this.e;
        int hashCode2 = (hashCode + (musicTrack != null ? musicTrack.hashCode() : 0)) * 31;
        MusicDynamicRestriction musicDynamicRestriction = this.f;
        int hashCode3 = (this.j.hashCode() + ((((hashCode2 + (musicDynamicRestriction != null ? musicDynamicRestriction.hashCode() : 0)) * 31) + this.g) * 31)) * 31;
        String str = this.h;
        return Boolean.hashCode(this.i) + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public ClickableMusic(long j, List<WebClickablePoint> list, q500 q500Var, MusicTrack musicTrack, MusicDynamicRestriction musicDynamicRestriction, int i, String str, boolean z) {
        super(j, list, q500Var);
        this.e = musicTrack;
        this.f = musicDynamicRestriction;
        this.g = i;
        this.h = str;
        this.i = z;
        this.j = WebStickerType.MUSIC;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableMusic(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), (MusicTrack) serializer.G(MusicTrack.class.getClassLoader()), (MusicDynamicRestriction) serializer.G(MusicDynamicRestriction.class.getClassLoader()), serializer.u(), serializer.I(), serializer.m());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
