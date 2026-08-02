package com.vk.dto.stories.model.clickable;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.q500;
import xsna.shy;
import xsna.zcl;

/* compiled from: ClickablePhoto.kt */
/* loaded from: classes18.dex */
public final class ClickablePhoto extends ClickableSticker {
    public static final Serializer.c<ClickablePhoto> CREATOR = new a();
    public final String e;
    public final long f;
    public final int g;
    public final String h;
    public final VerifyInfo i;
    public final WebStickerType j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickablePhoto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickablePhoto a(Serializer serializer) {
            return new ClickablePhoto(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickablePhoto[i];
        }
    }

    public /* synthetic */ ClickablePhoto(long j, List list, q500 q500Var, String str, long j2, int i, String str2, VerifyInfo verifyInfo, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, list, (i2 & 4) != 0 ? null : q500Var, str, j2, i, str2, verifyInfo);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        long j = this.f;
        Long valueOf = Long.valueOf(j);
        if (aVar.c == null) {
            aVar.c = new ArrayList<>();
        }
        ArrayList<Pair<String, Long>> arrayList = aVar.c;
        if (arrayList != null) {
            arrayList.add(new Pair<>("photo_owner_id", valueOf));
        }
        int i = this.g;
        aVar.a(Integer.valueOf(i), "photo_id");
        aVar.b(TtmlNode.TAG_STYLE, this.h);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        aVar.b("text_value", sb.toString());
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
        serializer.j0(this.e);
        serializer.Y(this.f);
        serializer.S(this.g);
        serializer.m0(this.h);
        serializer.i0(this.i);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        return super.e5().put("photo_owner_id", this.f).put("photo_id", this.g).put(TtmlNode.TAG_STYLE, this.h);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickablePhoto) || !super.equals(obj)) {
            return false;
        }
        ClickablePhoto clickablePhoto = (ClickablePhoto) obj;
        return epx.f(this.e, clickablePhoto.e) && this.f == clickablePhoto.f && this.g == clickablePhoto.g && epx.f(this.h, clickablePhoto.h) && epx.f(this.i, clickablePhoto.i);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.e;
        int a2 = shy.a(this.g, bh10.a((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f), 31);
        String str2 = this.h;
        int hashCode2 = (a2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        VerifyInfo verifyInfo = this.i;
        return hashCode2 + (verifyInfo != null ? verifyInfo.hashCode() : 0);
    }

    public ClickablePhoto(long j, List<WebClickablePoint> list, q500 q500Var, String str, long j2, int i, String str2, VerifyInfo verifyInfo) {
        super(j, list, q500Var);
        this.e = str;
        this.f = j2;
        this.g = i;
        this.h = str2;
        this.i = verifyInfo;
        this.j = WebStickerType.PHOTO;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickablePhoto(Serializer serializer) {
        this(r1, r3, r4, r0 == null ? "" : r0, serializer.w(), serializer.u(), serializer.I(), (VerifyInfo) serializer.G(VerifyInfo.class.getClassLoader()));
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
        ArrayList arrayList = k == null ? new ArrayList() : k;
        q500 y = serializer.y();
        String H = serializer.H();
    }
}
