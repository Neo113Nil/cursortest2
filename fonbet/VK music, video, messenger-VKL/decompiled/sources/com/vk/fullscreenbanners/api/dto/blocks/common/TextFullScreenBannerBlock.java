package com.vk.fullscreenbanners.api.dto.blocks.common;

import android.graphics.Color;
import com.vk.core.serialize.Serializer;
import com.vk.fullscreenbanners.BlockType;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import org.json.JSONObject;
import xsna.aay;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: TextFullScreenBannerBlock.kt */
/* loaded from: classes16.dex */
public final class TextFullScreenBannerBlock extends FullScreenBannerBlock {
    public static final Serializer.c<TextFullScreenBannerBlock> CREATOR = new b();
    public final String d;
    public final int e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<TextFullScreenBannerBlock> {
        @Override // xsna.aay
        public final TextFullScreenBannerBlock a(JSONObject jSONObject) {
            return new TextFullScreenBannerBlock(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<TextFullScreenBannerBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TextFullScreenBannerBlock a(Serializer serializer) {
            return new TextFullScreenBannerBlock(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextFullScreenBannerBlock[i];
        }
    }

    static {
        new a();
    }

    public TextFullScreenBannerBlock(String str, int i) {
        super(BlockType.TEXT);
        this.d = str;
        this.e = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.d);
        serializer.S(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.d, "text");
        w9yVar.c(Integer.valueOf(this.e), "color");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextFullScreenBannerBlock(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.u());
        String H = serializer.H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextFullScreenBannerBlock(JSONObject jSONObject) {
        this(r0, r4);
        int i;
        String optString = jSONObject.optString("text");
        try {
            i = Color.parseColor(jSONObject.optString("color", "#ffffff"));
        } catch (Exception unused) {
            i = -1;
        }
    }
}
