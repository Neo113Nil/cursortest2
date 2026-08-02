package com.vk.dto.stickers;

import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.popup.PopupLayerFitType;
import com.vk.dto.stickers.popup.PopupLayerGradientPositionType;
import com.vk.dto.stickers.popup.PopupLayerPositionXType;
import com.vk.dto.stickers.popup.PopupLayerPositionYType;
import com.vk.dto.stickers.popup.PopupLayerRepeatType;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.stickers.popup.PopupStickerAnimationLayer;
import com.vk.dto.stickers.ugc.UgcStatus;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.n1l0;
import xsna.qoy;
import xsna.rl3;
import xsna.s3q0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: StickerItem.kt */
/* loaded from: classes18.dex */
public final class StickerItem extends Serializer.StreamParcelableAdapter implements n1l0 {
    public static final Serializer.c<StickerItem> CREATOR;
    public static final StickerItem l;
    public final int b;
    public final int c;
    public final ImageList d;
    public final ImageList e;
    public final ImageConfigId f;
    public final StickerAnimation g;
    public final boolean h;
    public final StickerRender i;
    public final String j;
    public final PopupStickerAnimation k;

    /* compiled from: StickerItem.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v2, types: [com.vk.dto.stickers.StickerRender] */
        /* JADX WARN: Type inference failed for: r21v0, types: [com.vk.dto.stickers.popup.PopupStickerAnimationLayer$PopupStickerFixedAnimationLayer] */
        /* JADX WARN: Type inference failed for: r21v2, types: [com.vk.dto.stickers.popup.PopupStickerAnimationLayer$PopupStickerFullscreenAnimationLayer] */
        public static StickerItem a(JSONObject jSONObject) {
            ImageConfigId imageConfigId;
            boolean z;
            StickerAnimation stickerAnimation;
            String str;
            Object obj;
            Object obj2;
            int i;
            int i2;
            ImageList imageList;
            PopupStickerAnimation popupStickerAnimation;
            ArrayList arrayList;
            Object obj3;
            int i3;
            PopupStickerAnimationLayer.Type type;
            int i4;
            ImageList imageList2;
            PopupStickerAnimationLayer.PopupStickerGradientLayer popupStickerGradientLayer;
            PopupStickerAnimationLayer.PopupStickerGradientLayer popupStickerGradientLayer2;
            int optInt = jSONObject.optInt("sticker_id");
            int optInt2 = jSONObject.optInt("product_id", -1);
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            ImageList d = ImageList.a.d(optJSONArray);
            ImageList d2 = ImageList.a.d(jSONObject.optJSONArray("images_with_background"));
            JSONObject optJSONObject = jSONObject.optJSONObject("image_config_context");
            int i5 = 0;
            if (optJSONObject != null) {
                Serializer.c<ImageConfigId> cVar2 = ImageConfigId.CREATOR;
                imageConfigId = new ImageConfigId(optJSONObject.optInt("version", 0), optJSONObject.optInt("config_id", -1));
            } else {
                imageConfigId = null;
            }
            boolean optBoolean = jSONObject.optBoolean("is_allowed", true);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("animations");
            if (optJSONArray2 != null) {
                Serializer.c<StickerAnimation> cVar3 = StickerAnimation.CREATOR;
                int length = optJSONArray2.length();
                s3q0[] s3q0VarArr = new s3q0[length];
                String str2 = "";
                String str3 = str2;
                while (i5 < length) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i5);
                    boolean z2 = optBoolean;
                    String optString = jSONObject2.optString("type");
                    s3q0[] s3q0VarArr2 = s3q0VarArr;
                    if (epx.f(optString, "light")) {
                        String optString2 = jSONObject2.optString("url");
                        str3 = optString2 == null ? "" : optString2;
                    } else if (epx.f(optString, "dark")) {
                        String optString3 = jSONObject2.optString("url");
                        str2 = optString3 == null ? "" : optString3;
                    }
                    s3q0VarArr2[i5] = s3q0.a;
                    i5++;
                    optBoolean = z2;
                    s3q0VarArr = s3q0VarArr2;
                }
                z = optBoolean;
                rl3.u0(s3q0VarArr);
                stickerAnimation = new StickerAnimation(str3, str2);
                str = null;
            } else {
                z = optBoolean;
                str = null;
                stickerAnimation = new StickerAnimation(false ? 1 : 0, false ? 1 : 0, 3, false ? 1 : 0);
            }
            StickerAnimation stickerAnimation2 = stickerAnimation;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("render");
            if (optJSONObject2 != null) {
                Serializer.c<StickerRender> cVar4 = StickerRender.CREATOR;
                obj = StickerRender.a.a(optJSONObject2);
            } else {
                obj = str;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("vmoji");
            String optString4 = optJSONObject3 != null ? optJSONObject3.optString("character_id") : str;
            JSONObject optJSONObject4 = jSONObject.optJSONObject("popup");
            if (optJSONObject4 != null) {
                Serializer.c<PopupStickerAnimation> cVar5 = PopupStickerAnimation.CREATOR;
                boolean z3 = optJSONObject4.getBoolean("autoplay");
                JSONArray optJSONArray3 = optJSONObject4.optJSONArray("layers");
                if (optJSONArray3 != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray3.length());
                    int length2 = optJSONArray3.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        arrayList2.add(optJSONArray3.getJSONObject(i6));
                    }
                    arrayList = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    Object obj4 = obj;
                    while (it.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it.next();
                        String optString5 = jSONObject3.optString("type");
                        if (optString5 == null) {
                            obj3 = obj4;
                            i3 = optInt;
                        } else {
                            PopupStickerAnimationLayer.Type[] values = PopupStickerAnimationLayer.Type.values();
                            obj3 = obj4;
                            int length3 = values.length;
                            i3 = optInt;
                            int i7 = 0;
                            while (i7 < length3) {
                                type = values[i7];
                                int i8 = length3;
                                if (optString5.equals(type.h())) {
                                    break;
                                }
                                i7++;
                                length3 = i8;
                            }
                        }
                        type = null;
                        int i9 = type == null ? -1 : com.vk.dto.stickers.popup.a.$EnumSwitchMapping$0[type.ordinal()];
                        if (i9 != 1) {
                            i4 = optInt2;
                            imageList2 = d;
                            if (i9 == 2) {
                                Serializer.c<PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer> cVar6 = PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer.CREATOR;
                                PopupLayerPositionXType.a aVar = PopupLayerPositionXType.Companion;
                                String optString6 = jSONObject3.optString("position_x");
                                aVar.getClass();
                                PopupLayerPositionXType a = PopupLayerPositionXType.a.a(optString6);
                                PopupLayerPositionYType.a aVar2 = PopupLayerPositionYType.Companion;
                                String optString7 = jSONObject3.optString("position_y");
                                aVar2.getClass();
                                PopupLayerPositionYType a2 = PopupLayerPositionYType.a.a(optString7);
                                String optString8 = jSONObject3.optString("url");
                                int optInt3 = jSONObject3.optInt("loops_limit");
                                Float u = f370.u("scale_ratio", jSONObject3);
                                popupStickerGradientLayer2 = new PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer(a, a2, optString8, optInt3, u != null ? u.floatValue() : 1.0f);
                            } else {
                                if (i9 != 3) {
                                    throw new IllegalStateException("Unsupported layer type");
                                }
                                Serializer.c<PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer> cVar7 = PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer.CREATOR;
                                PopupLayerPositionXType.a aVar3 = PopupLayerPositionXType.Companion;
                                String optString9 = jSONObject3.optString("position_x");
                                aVar3.getClass();
                                PopupLayerPositionXType a3 = PopupLayerPositionXType.a.a(optString9);
                                PopupLayerPositionYType.a aVar4 = PopupLayerPositionYType.Companion;
                                String optString10 = jSONObject3.optString("position_y");
                                aVar4.getClass();
                                PopupLayerPositionYType a4 = PopupLayerPositionYType.a.a(optString10);
                                String optString11 = jSONObject3.optString("url");
                                int optInt4 = jSONObject3.optInt("loops_limit");
                                PopupLayerRepeatType.a aVar5 = PopupLayerRepeatType.Companion;
                                String optString12 = jSONObject3.optString("repeat");
                                aVar5.getClass();
                                PopupLayerRepeatType a5 = PopupLayerRepeatType.a.a(optString12);
                                PopupLayerFitType.a aVar6 = PopupLayerFitType.Companion;
                                String optString13 = jSONObject3.optString("fit");
                                aVar6.getClass();
                                PopupLayerFitType a6 = PopupLayerFitType.a.a(optString13);
                                Float u2 = f370.u("scale_ratio", jSONObject3);
                                popupStickerGradientLayer2 = new PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer(a3, a4, optString11, optInt4, a5, a6, u2 != null ? u2.floatValue() : 1.0f);
                            }
                            popupStickerGradientLayer = popupStickerGradientLayer2;
                        } else {
                            i4 = optInt2;
                            imageList2 = d;
                            Serializer.c<PopupStickerAnimationLayer.PopupStickerGradientLayer> cVar8 = PopupStickerAnimationLayer.PopupStickerGradientLayer.CREATOR;
                            PopupLayerGradientPositionType.a aVar7 = PopupLayerGradientPositionType.Companion;
                            String optString14 = jSONObject3.optString(X3.i.L);
                            aVar7.getClass();
                            PopupLayerGradientPositionType a7 = PopupLayerGradientPositionType.a.a(optString14);
                            Float u3 = f370.u("scale_ratio", jSONObject3);
                            popupStickerGradientLayer = new PopupStickerAnimationLayer.PopupStickerGradientLayer(a7, u3 != null ? u3.floatValue() : 1.0f);
                        }
                        arrayList.add(popupStickerGradientLayer);
                        obj4 = obj3;
                        optInt = i3;
                        optInt2 = i4;
                        d = imageList2;
                    }
                    obj2 = obj4;
                    i = optInt;
                    i2 = optInt2;
                    imageList = d;
                } else {
                    obj2 = obj;
                    i = optInt;
                    i2 = optInt2;
                    imageList = d;
                    arrayList = new ArrayList();
                }
                popupStickerAnimation = new PopupStickerAnimation(z3, arrayList);
            } else {
                obj2 = obj;
                i = optInt;
                i2 = optInt2;
                imageList = d;
                popupStickerAnimation = null;
            }
            return new StickerItem(i, i2, imageList, d2, imageConfigId, stickerAnimation2, z, obj2, optString4, popupStickerAnimation);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickerItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerItem a(Serializer serializer) {
            return new StickerItem(serializer.u(), serializer.u(), (ImageList) serializer.G(ImageList.class.getClassLoader()), (ImageList) serializer.G(ImageList.class.getClassLoader()), (ImageConfigId) serializer.G(ImageConfigId.class.getClassLoader()), (StickerAnimation) serializer.G(StickerAnimation.class.getClassLoader()), serializer.m(), (StickerRender) serializer.G(StickerRender.class.getClassLoader()), serializer.H(), (PopupStickerAnimation) serializer.G(PopupStickerAnimation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 1;
        ImageList imageList = new ImageList(null, i, 0 == true ? 1 : 0);
        ImageList imageList2 = new ImageList(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        int i2 = 0;
        int i3 = 3;
        l = new StickerItem(-1, -1, imageList, imageList2, new ImageConfigId(i2, i2, i3, 0 == true ? 1 : 0), new StickerAnimation(0 == true ? 1 : 0, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0), false, null, null, null, 896, null);
        CREATOR = new b();
    }

    public StickerItem() {
        this(0, 0, null, null, null, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public static final StickerItem Bb(JSONObject jSONObject) {
        return a.a(jSONObject);
    }

    public static StickerItem zb(StickerItem stickerItem, int i, boolean z, int i2) {
        int i3 = stickerItem.b;
        if ((i2 & 2) != 0) {
            i = stickerItem.c;
        }
        int i4 = i;
        ImageList imageList = stickerItem.d;
        ImageList imageList2 = stickerItem.e;
        ImageConfigId imageConfigId = stickerItem.f;
        StickerAnimation stickerAnimation = stickerItem.g;
        if ((i2 & 64) != 0) {
            z = stickerItem.h;
        }
        StickerRender stickerRender = stickerItem.i;
        String str = stickerItem.j;
        PopupStickerAnimation popupStickerAnimation = stickerItem.k;
        stickerItem.getClass();
        return new StickerItem(i3, i4, imageList, imageList2, imageConfigId, stickerAnimation, z, stickerRender, str, popupStickerAnimation);
    }

    public final String Ab() {
        return this.j;
    }

    @Override // xsna.n1l0
    public final boolean B() {
        return false;
    }

    @Override // xsna.n1l0
    public final UgcStatus O() {
        return UgcStatus.OK;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.i0(this.i);
        serializer.j0(this.j);
        serializer.i0(this.k);
    }

    @Override // xsna.n1l0, xsna.zk2
    public final boolean V0() {
        return this.g.V0();
    }

    @Override // xsna.n1l0
    public final ImageList Z() {
        return this.d;
    }

    @Override // xsna.n1l0, xsna.zk2
    public final String a(boolean z) {
        StickerAnimation stickerAnimation = this.g;
        return z ? stickerAnimation.Cb() : stickerAnimation.Ab();
    }

    @Override // xsna.n1l0, xsna.zk2
    public final String b(boolean z) {
        return String.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StickerItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        StickerItem stickerItem = (StickerItem) obj;
        return this.b == stickerItem.b && epx.f(this.j, stickerItem.j);
    }

    @Override // xsna.n1l0
    public final long getProductId() {
        return this.c;
    }

    public final int hashCode() {
        int b2 = qoy.b((this.g.hashCode() + fw3.a(fw3.a(Integer.hashCode(this.b) * 31, 31, this.d.b), 31, this.e.b)) * 31, 31, this.h);
        String str = this.j;
        return b2 + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.n1l0
    public final int o2() {
        return this.b;
    }

    public final String toString() {
        return vu5.b(new StringBuilder("StickerItem(id="), this.b, ')');
    }

    @Override // xsna.n1l0
    public final boolean z9() {
        return this.k != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StickerItem(int i, int i2, ImageList imageList, ImageList imageList2, ImageConfigId imageConfigId, StickerAnimation stickerAnimation, boolean z, StickerRender stickerRender, String str, PopupStickerAnimation popupStickerAnimation, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? new ImageList(null, r1, 0 == true ? 1 : 0) : imageList, (i3 & 8) != 0 ? new ImageList(0 == true ? 1 : 0, r1, 0 == true ? 1 : 0) : imageList2, (i3 & 16) != 0 ? null : imageConfigId, (i3 & 32) != 0 ? new StickerAnimation(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : stickerAnimation, (i3 & 64) != 0 ? true : z, (i3 & 128) != 0 ? null : stickerRender, (i3 & 256) != 0 ? null : str, (i3 & 512) != 0 ? null : popupStickerAnimation);
        int i4 = 1;
    }

    public StickerItem(int i, int i2, ImageList imageList, ImageList imageList2, ImageConfigId imageConfigId, StickerAnimation stickerAnimation, boolean z, StickerRender stickerRender, String str, PopupStickerAnimation popupStickerAnimation) {
        this.b = i;
        this.c = i2;
        this.d = imageList;
        this.e = imageList2;
        this.f = imageConfigId;
        this.g = stickerAnimation;
        this.h = z;
        this.i = stickerRender;
        this.j = str;
        this.k = popupStickerAnimation;
    }
}
