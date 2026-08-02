package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.bxx;
import xsna.drm0;
import xsna.pmi0;
import xsna.pn00;

/* compiled from: MsgFooterBannerConfig.kt */
/* loaded from: classes18.dex */
public final class MsgFooterBannerConfig extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MsgFooterBannerConfig> CREATOR = new b();

    @pmi0("msgFooterBannerImage")
    private final Image msgFooterBannerImage;

    @pmi0("msgFooterBannerImageDark")
    private final Image msgFooterBannerImageDark;

    @pmi0("msgFooterBannerImagePlaceholder")
    private final Image msgFooterBannerImagePlaceholder;

    @pmi0("msgFooterBannerImagePlaceholderDark")
    private final Image msgFooterBannerImagePlaceholderDark;

    @pmi0("msgFooterBannerType")
    private final String msgFooterBannerType;

    /* compiled from: MsgFooterBannerConfig.kt */
    public static final class a {
        public static MsgFooterBannerConfig a(JSONObject jSONObject) {
            return new MsgFooterBannerConfig(jSONObject.getString("msgFooterBannerType"), new Image(jSONObject.optJSONArray("msgFooterBannerImage"), null, 2, null), new Image(jSONObject.optJSONArray("msgFooterBannerImageDark"), null, 2, null), new Image(jSONObject.optJSONArray("msgFooterBannerImagePlaceholder"), null, 2, null), new Image(jSONObject.optJSONArray("msgFooterBannerImagePlaceholderDark"), null, 2, null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MsgFooterBannerConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgFooterBannerConfig a(Serializer serializer) {
            return new MsgFooterBannerConfig(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgFooterBannerConfig[i];
        }
    }

    public MsgFooterBannerConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public final Image Ab() {
        return this.msgFooterBannerImageDark;
    }

    public final Image Bb() {
        return this.msgFooterBannerImagePlaceholder;
    }

    public final Image Cb() {
        return this.msgFooterBannerImagePlaceholderDark;
    }

    public final String Db() {
        return this.msgFooterBannerType;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.msgFooterBannerType);
        serializer.i0(this.msgFooterBannerImage);
        serializer.i0(this.msgFooterBannerImageDark);
        serializer.i0(this.msgFooterBannerImagePlaceholder);
        serializer.i0(this.msgFooterBannerImagePlaceholderDark);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        Pair pair = new Pair("msgFooterBannerType", this.msgFooterBannerType);
        Image image = this.msgFooterBannerImage;
        Pair pair2 = new Pair("msgFooterBannerImage", image != null ? image.Gb() : null);
        Image image2 = this.msgFooterBannerImageDark;
        Pair pair3 = new Pair("msgFooterBannerImageDark", image2 != null ? image2.Gb() : null);
        Image image3 = this.msgFooterBannerImagePlaceholder;
        Pair pair4 = new Pair("msgFooterBannerImagePlaceholder", image3 != null ? image3.Gb() : null);
        Image image4 = this.msgFooterBannerImagePlaceholderDark;
        return new JSONObject(pn00.k(pair, pair2, pair3, pair4, new Pair("msgFooterBannerImagePlaceholderDark", image4 != null ? image4.Gb() : null)));
    }

    public final boolean isEmpty() {
        return this.msgFooterBannerType.length() == 0 || drm0.N(this.msgFooterBannerType) || this.msgFooterBannerImage == null;
    }

    public final Image zb() {
        return this.msgFooterBannerImage;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MsgFooterBannerConfig(java.lang.String r2, com.vk.dto.common.Image r3, com.vk.dto.common.Image r4, com.vk.dto.common.Image r5, com.vk.dto.common.Image r6, int r7, xsna.zcl r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.stickers.MsgFooterBannerConfig.<init>(java.lang.String, com.vk.dto.common.Image, com.vk.dto.common.Image, com.vk.dto.common.Image, com.vk.dto.common.Image, int, xsna.zcl):void");
    }

    public MsgFooterBannerConfig(String str, Image image, Image image2, Image image3, Image image4) {
        this.msgFooterBannerType = str;
        this.msgFooterBannerImage = image;
        this.msgFooterBannerImageDark = image2;
        this.msgFooterBannerImagePlaceholder = image3;
        this.msgFooterBannerImagePlaceholderDark = image4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MsgFooterBannerConfig(Serializer serializer) {
        this(r0 == null ? "" : r0, (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()));
        String H = serializer.H();
    }
}
