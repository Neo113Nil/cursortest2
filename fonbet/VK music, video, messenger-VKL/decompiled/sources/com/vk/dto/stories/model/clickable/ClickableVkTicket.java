package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ClickableVkTicket.kt */
/* loaded from: classes18.dex */
public final class ClickableVkTicket extends ClickableSticker {
    public static final Serializer.c<ClickableVkTicket> CREATOR = new a();
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final SeanceInfo i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableVkTicket> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableVkTicket a(Serializer serializer) {
            return new ClickableVkTicket(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableVkTicket[i];
        }
    }

    public /* synthetic */ ClickableVkTicket(long j, List list, q500 q500Var, String str, String str2, String str3, String str4, SeanceInfo seanceInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, str, str2, str3, (i & 64) != 0 ? null : str4, seanceInfo);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        w9y w9yVar = new w9y();
        w9yVar.e(this.e, "id");
        SeanceInfo seanceInfo = this.i;
        w9yVar.e(seanceInfo != null ? seanceInfo.b : null, "seance_id");
        s3q0 s3q0Var = s3q0.a;
        aVar.b("text_value", w9yVar.a.toString());
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return WebStickerType.TICKET;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.m0(this.e);
        serializer.m0(this.f);
        serializer.m0(this.g);
        serializer.m0(this.h);
        SeanceInfo seanceInfo = this.i;
        if (seanceInfo == null) {
            serializer.L((byte) 0);
        } else {
            serializer.L((byte) 1);
            serializer.i0(seanceInfo);
        }
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject;
        JSONObject putOpt = super.e5().putOpt("id", this.e).putOpt("title", this.f).putOpt("image", this.g).putOpt("url", this.h);
        SeanceInfo seanceInfo = this.i;
        if (seanceInfo != null) {
            jSONObject = new JSONObject();
            jSONObject.putOpt("id", seanceInfo.b);
            jSONObject.putOpt("city_alias", seanceInfo.c);
            jSONObject.putOpt("city", seanceInfo.d);
            jSONObject.putOpt("date", seanceInfo.e);
        } else {
            jSONObject = null;
        }
        return putOpt.put("seance", jSONObject);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableVkTicket) || !super.equals(obj)) {
            return false;
        }
        ClickableVkTicket clickableVkTicket = (ClickableVkTicket) obj;
        return epx.f(this.e, clickableVkTicket.e) && epx.f(this.f, clickableVkTicket.f) && epx.f(this.g, clickableVkTicket.g) && epx.f(this.h, clickableVkTicket.h) && epx.f(this.i, clickableVkTicket.i);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        SeanceInfo seanceInfo = this.i;
        return hashCode5 + (seanceInfo != null ? seanceInfo.hashCode() : 0);
    }

    public ClickableVkTicket(long j, List<WebClickablePoint> list, q500 q500Var, String str, String str2, String str3, String str4, SeanceInfo seanceInfo) {
        super(j, list, q500Var);
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = seanceInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableVkTicket(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.I(), serializer.I(), serializer.I(), serializer.I(), serializer.m() ? (SeanceInfo) serializer.G(SeanceInfo.class.getClassLoader()) : null);
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
