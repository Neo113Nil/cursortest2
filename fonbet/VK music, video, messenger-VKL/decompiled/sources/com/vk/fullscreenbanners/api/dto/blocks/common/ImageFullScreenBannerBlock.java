package com.vk.fullscreenbanners.api.dto.blocks.common;

import com.vk.core.serialize.Serializer;
import com.vk.fullscreenbanners.BlockType;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import org.json.JSONObject;
import xsna.aay;
import xsna.d370;
import xsna.s3q0;
import xsna.uoh;
import xsna.w9y;

/* compiled from: ImageFullScreenBannerBlock.kt */
/* loaded from: classes16.dex */
public final class ImageFullScreenBannerBlock extends FullScreenBannerBlock {
    public static final Serializer.c<ImageFullScreenBannerBlock> CREATOR = new b();
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ImageFullScreenBannerBlock> {
        @Override // xsna.aay
        public final ImageFullScreenBannerBlock a(JSONObject jSONObject) {
            return new ImageFullScreenBannerBlock(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ImageFullScreenBannerBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageFullScreenBannerBlock a(Serializer serializer) {
            return new ImageFullScreenBannerBlock(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageFullScreenBannerBlock[i];
        }
    }

    static {
        new a();
    }

    public ImageFullScreenBannerBlock(String str) {
        super(BlockType.IMAGE);
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(d370.C(new uoh(this, 27)), "image");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageFullScreenBannerBlock(Serializer serializer) {
        this(r1 == null ? "" : r1);
        String H = serializer.H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageFullScreenBannerBlock(JSONObject jSONObject) {
        this((r2 == null || (r2 = r2.optString("url")) == null) ? "" : r2);
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("image");
    }
}
