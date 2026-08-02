package com.vk.fullscreenbanners.api.dto;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: FullScreenBanner.kt */
/* loaded from: classes16.dex */
public final class FullScreenBanner extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<FullScreenBanner> CREATOR = new b();
    public final int b;
    public final String c;
    public final boolean d;
    public final List<FullScreenBannerButtonBlock> e;
    public final Image f;
    public final List<FullScreenBannerBlock> g;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<FullScreenBanner> {
        @Override // xsna.aay
        public final FullScreenBanner a(JSONObject jSONObject) {
            return new FullScreenBanner(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<FullScreenBanner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FullScreenBanner a(Serializer serializer) {
            return new FullScreenBanner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullScreenBanner[i];
        }
    }

    static {
        new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FullScreenBanner(int i, String str, boolean z, List<? extends FullScreenBannerButtonBlock> list, Image image, List<? extends FullScreenBannerBlock> list2) {
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = list;
        this.f = image;
        this.g = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.f0(this.e);
        serializer.i0(this.f);
        serializer.f0(this.g);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "id");
        w9yVar.e(this.c, "track_code");
        w9yVar.b(Boolean.valueOf(this.d), "close_button");
        w9yVar.e(this.e, "buttons");
        w9yVar.g(L2.g, this.f);
        w9yVar.e(this.g, "blocks");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FullScreenBanner(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r9 == null ? EmptyList.b : r9);
        int optInt = jSONObject.optInt("id");
        String optString = jSONObject.optString("track_code");
        boolean optBoolean = jSONObject.optBoolean("close_button");
        List a2 = aay.a.a(jSONObject, "buttons", FullScreenBannerButtonBlock.d);
        List list = a2 == null ? EmptyList.b : a2;
        Image image = new Image(jSONObject.optJSONArray(L2.g), null, 2, null);
        List a3 = aay.a.a(jSONObject, "blocks", FullScreenBannerBlock.c);
    }

    public FullScreenBanner(Serializer serializer) {
        this(serializer.u(), serializer.H(), serializer.m(), serializer.B(FullScreenBannerButtonBlock.class.getClassLoader()), (Image) serializer.A(Image.class.getClassLoader()), serializer.B(FullScreenBannerBlock.class.getClassLoader()));
    }
}
