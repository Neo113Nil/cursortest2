package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClickableGeo.kt */
/* loaded from: classes18.dex */
public final class ClickableGeo extends ClickableSticker {
    public static final Serializer.c<ClickableGeo> CREATOR = new a();
    public final int e;
    public final String f;
    public final GeoPlace g;
    public final String h;
    public final Integer i;
    public final WebStickerType j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableGeo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableGeo a(Serializer serializer) {
            return new ClickableGeo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableGeo[i];
        }
    }

    public /* synthetic */ ClickableGeo(long j, List list, q500 q500Var, int i, String str, GeoPlace geoPlace, String str2, Integer num, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, i, str, (i2 & 32) != 0 ? null : geoPlace, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : num);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b("text_value", this.h);
        aVar.b(TtmlNode.TAG_STYLE, this.f);
        aVar.a(Integer.valueOf(this.e), "id_value");
        aVar.a(this.i, "category_id");
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
        serializer.S(this.e);
        serializer.j0(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
        serializer.V(this.i);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("place_id", this.e);
        e5.put(TtmlNode.TAG_STYLE, this.f);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableGeo) || !super.equals(obj)) {
            return false;
        }
        ClickableGeo clickableGeo = (ClickableGeo) obj;
        return this.e == clickableGeo.e && epx.f(this.f, clickableGeo.f) && epx.f(this.g, clickableGeo.g) && epx.f(this.h, clickableGeo.h) && epx.f(this.i, clickableGeo.i) && this.j == clickableGeo.j;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int a2 = urd0.a(((super.hashCode() * 31) + this.e) * 31, 31, this.f);
        GeoPlace geoPlace = this.g;
        int hashCode = (a2 + (geoPlace != null ? geoPlace.hashCode() : 0)) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.i;
        return this.j.hashCode() + ((hashCode2 + (num != null ? num.intValue() : 0)) * 31);
    }

    public ClickableGeo(long j, List<WebClickablePoint> list, q500 q500Var, int i, String str, GeoPlace geoPlace, String str2, Integer num) {
        super(j, list, q500Var);
        this.e = i;
        this.f = str;
        this.g = geoPlace;
        this.h = str2;
        this.i = num;
        this.j = WebStickerType.GEO;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableGeo(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.u(), serializer.H(), (GeoPlace) serializer.A(GeoPlace.class.getClassLoader()), serializer.H(), serializer.v());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
