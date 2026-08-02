package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.PromoColor;
import xsna.epx;
import xsna.shy;
import xsna.zcl;

/* compiled from: StickersPromoModel.kt */
/* loaded from: classes18.dex */
public final class StickersPromoModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersPromoModel> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final PromoColor e;
    public final PromoColor f;
    public final VmojiConstructorOpenParamsModel g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersPromoModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersPromoModel a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            int u3 = serializer.u();
            PromoColor.a aVar = PromoColor.Companion;
            String H = serializer.H();
            aVar.getClass();
            return new StickersPromoModel(u, u2, u3, PromoColor.a.a(H), PromoColor.a.a(serializer.H()), (VmojiConstructorOpenParamsModel) serializer.G(VmojiConstructorOpenParamsModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersPromoModel[i];
        }
    }

    public StickersPromoModel() {
        this(0, 0, 0, null, null, null, 63, null);
    }

    public static StickersPromoModel zb(StickersPromoModel stickersPromoModel, int i) {
        int i2 = stickersPromoModel.b;
        int i3 = stickersPromoModel.c;
        int i4 = (i & 4) != 0 ? stickersPromoModel.d : 0;
        PromoColor promoColor = (i & 8) != 0 ? stickersPromoModel.e : null;
        VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel = stickersPromoModel.g;
        stickersPromoModel.getClass();
        return new StickersPromoModel(i2, i3, i4, promoColor, null, vmojiConstructorOpenParamsModel);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        PromoColor promoColor = this.e;
        serializer.j0(promoColor != null ? promoColor.i() : null);
        PromoColor promoColor2 = this.f;
        serializer.j0(promoColor2 != null ? promoColor2.i() : null);
        serializer.i0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPromoModel)) {
            return false;
        }
        StickersPromoModel stickersPromoModel = (StickersPromoModel) obj;
        return this.b == stickersPromoModel.b && this.c == stickersPromoModel.c && this.d == stickersPromoModel.d && this.e == stickersPromoModel.e && this.f == stickersPromoModel.f && epx.f(this.g, stickersPromoModel.g);
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
        PromoColor promoColor = this.e;
        int hashCode = (a2 + (promoColor == null ? 0 : promoColor.hashCode())) * 31;
        PromoColor promoColor2 = this.f;
        return this.g.hashCode() + ((hashCode + (promoColor2 != null ? promoColor2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StickersPromoModel(newStickersItems=" + this.b + ", globalPromotes=" + this.c + ", vmojiPromoCounter=" + this.d + ", vmojiPromoCounterColor=" + this.e + ", vmojiPromoDotColor=" + this.f + ", vmojiPromoOpenParams=" + this.g + ')';
    }

    public /* synthetic */ StickersPromoModel(int i, int i2, int i3, PromoColor promoColor, PromoColor promoColor2, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel, int i4, zcl zclVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : promoColor, (i4 & 16) != 0 ? null : promoColor2, (i4 & 32) != 0 ? new VmojiConstructorOpenParamsModel(null, null, null, 7, null) : vmojiConstructorOpenParamsModel);
    }

    public StickersPromoModel(int i, int i2, int i3, PromoColor promoColor, PromoColor promoColor2, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = promoColor;
        this.f = promoColor2;
        this.g = vmojiConstructorOpenParamsModel;
    }
}
