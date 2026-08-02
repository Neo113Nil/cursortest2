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
import xsna.zcl;

/* compiled from: ClickablePackSticker.kt */
/* loaded from: classes18.dex */
public final class ClickablePackSticker extends ClickableSticker {
    public static final Serializer.c<ClickablePackSticker> CREATOR = new a();
    public final int e;
    public final int f;
    public final String g;
    public final WebStickerType h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickablePackSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickablePackSticker a(Serializer serializer) {
            return new ClickablePackSticker(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickablePackSticker[i];
        }
    }

    public /* synthetic */ ClickablePackSticker(long j, List list, q500 q500Var, int i, int i2, String str, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? 0L : j, list, (i3 & 4) != 0 ? null : q500Var, i, i2, (i3 & 32) != 0 ? null : str);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.a(Integer.valueOf(this.e), "id_value");
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.h;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("sticker_id", this.e);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickablePackSticker) || !super.equals(obj)) {
            return false;
        }
        ClickablePackSticker clickablePackSticker = (ClickablePackSticker) obj;
        return this.e == clickablePackSticker.e && this.f == clickablePackSticker.f && epx.f(this.g, clickablePackSticker.g) && this.h == clickablePackSticker.h;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.e) * 31) + this.f) * 31;
        String str = this.g;
        return this.h.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public ClickablePackSticker(long j, List<WebClickablePoint> list, q500 q500Var, int i, int i2, String str) {
        super(j, list, q500Var);
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = WebStickerType.STICKER;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickablePackSticker(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.u(), serializer.u(), serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
