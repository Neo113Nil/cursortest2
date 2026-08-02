package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickableSituationalTheme.kt */
/* loaded from: classes18.dex */
public final class ClickableSituationalTheme extends ClickableSticker {
    public static final Serializer.c<ClickableSituationalTheme> CREATOR = new a();
    public final Integer e;
    public final String f;
    public final WebStickerType g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableSituationalTheme> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableSituationalTheme a(Serializer serializer) {
            return new ClickableSituationalTheme(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableSituationalTheme[i];
        }
    }

    public /* synthetic */ ClickableSituationalTheme(long j, List list, q500 q500Var, Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? -1L : j, list, (i & 4) != 0 ? null : q500Var, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.g;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.V(this.e);
        serializer.j0(this.f);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("situational_theme_id", this.e);
        e5.put("situational_app_url", "situational_app_url");
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSituationalTheme) || !super.equals(obj)) {
            return false;
        }
        ClickableSituationalTheme clickableSituationalTheme = (ClickableSituationalTheme) obj;
        return epx.f(this.e, clickableSituationalTheme.e) && epx.f(this.f, clickableSituationalTheme.f) && this.g == clickableSituationalTheme.g;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Integer num = this.e;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        String str = this.f;
        return this.g.hashCode() + ((intValue + (str != null ? str.hashCode() : 0)) * 31);
    }

    public ClickableSituationalTheme(long j, List<WebClickablePoint> list, q500 q500Var, Integer num, String str) {
        super(j, list, q500Var);
        this.e = num;
        this.f = str;
        this.g = WebStickerType.SITUATIONAL_THEME;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableSituationalTheme(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), serializer.v(), serializer.H());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
