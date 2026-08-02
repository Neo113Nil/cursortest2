package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickablePhotoAlbum.kt */
/* loaded from: classes18.dex */
public final class ClickablePhotoAlbum extends ClickableSticker {
    public static final Serializer.c<ClickablePhotoAlbum> CREATOR = new a();
    public final long e;
    public final int f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickablePhotoAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickablePhotoAlbum a(Serializer serializer) {
            return new ClickablePhotoAlbum(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickablePhotoAlbum[i];
        }
    }

    public /* synthetic */ ClickablePhotoAlbum(long j, List list, q500 q500Var, long j2, int i, String str, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, j2, i, str);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('_');
        sb.append(this.f);
        aVar.b("text_value", sb.toString());
        aVar.b(TtmlNode.TAG_STYLE, this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return WebStickerType.PHOTO_ALBUM;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.Y(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        return super.e5().put("album_owner_id", this.e).put("album_id", this.f).put(TtmlNode.TAG_STYLE, this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickablePhotoAlbum) || !super.equals(obj)) {
            return false;
        }
        ClickablePhotoAlbum clickablePhotoAlbum = (ClickablePhotoAlbum) obj;
        return this.e == clickablePhotoAlbum.e && this.f == clickablePhotoAlbum.f && epx.f(this.g, clickablePhotoAlbum.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int a2 = (bh10.a(super.hashCode() * 31, 31, this.e) + this.f) * 31;
        String str = this.g;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public ClickablePhotoAlbum(long j, List<WebClickablePoint> list, q500 q500Var, long j2, int i, String str) {
        super(j, list, q500Var);
        this.e = j2;
        this.f = i;
        this.g = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickablePhotoAlbum(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.w(), serializer.u(), serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
