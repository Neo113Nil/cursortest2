package com.vk.superapp.api.dto.story.actions;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: WebActionSituationalTemplate.kt */
/* loaded from: classes6.dex */
public final class WebActionSituationalTemplate extends StickerAction {
    public static final Serializer.c<WebActionSituationalTemplate> CREATOR = new a();
    public final int b;
    public final List<String> c;
    public final WebStickerType d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionSituationalTemplate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionSituationalTemplate a(Serializer serializer) {
            return new WebActionSituationalTemplate(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionSituationalTemplate[i];
        }
    }

    public WebActionSituationalTemplate() {
        this(0, null, 3, null);
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("KEY_COUNT", this.b);
        jSONObject.put("KEY_USERS", this.c);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.l0(this.c);
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.d;
    }

    public WebActionSituationalTemplate(int i, List<String> list) {
        this.b = i;
        this.c = list;
        this.d = WebStickerType.SITUATIONAL_TEMPLATE;
    }

    public WebActionSituationalTemplate(Serializer serializer) {
        this(serializer.u(), com.vk.core.serialize.a.a(serializer));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebActionSituationalTemplate(JSONObject jSONObject) {
        this(r1, r0);
        int i = jSONObject.getJSONObject("action").getInt("count");
        JSONArray jSONArray = jSONObject.getJSONObject("action").getJSONArray("avatars");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
    }

    public WebActionSituationalTemplate(int i, List list, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? EmptyList.b : list);
    }
}
