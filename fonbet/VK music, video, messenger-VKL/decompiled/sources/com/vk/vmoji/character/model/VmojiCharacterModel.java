package com.vk.vmoji.character.model;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.ImageListModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VmojiCharacterModel.kt */
/* loaded from: classes7.dex */
public final class VmojiCharacterModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiCharacterModel> CREATOR = new b();
    public final VmojiAvatar b;
    public final String c;
    public final CharacterContext d;
    public final boolean e;
    public final boolean f;
    public final ImageListModel g;
    public final ImageListModel h;
    public final int i;
    public final int j;
    public final Integer k;
    public final List<VmojiProductModel> l;
    public final int m;
    public final PromoColor n;

    /* compiled from: VmojiCharacterModel.kt */
    public static final class a {
        public static ImageListModel a(List list, BaseImageDto.ThemeDto themeDto) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return new ImageListModel(null, 1, null);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BaseImageDto) obj).d() == themeDto) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BaseImageDto baseImageDto = (BaseImageDto) it.next();
                arrayList2.add(new ImageListModel.ImageModel(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), epx.f(baseImageDto.e(), Boolean.TRUE)));
            }
            return new ImageListModel(arrayList2);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VmojiCharacterModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiCharacterModel a(Serializer serializer) {
            CharacterContext characterContext;
            VmojiAvatar vmojiAvatar = (VmojiAvatar) serializer.A(VmojiAvatar.class.getClassLoader());
            String H = serializer.H();
            CharacterContext.a aVar = CharacterContext.Companion;
            String H2 = serializer.H();
            aVar.getClass();
            CharacterContext[] values = CharacterContext.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    characterContext = null;
                    break;
                }
                characterContext = values[i];
                if (epx.f(characterContext.h(), H2)) {
                    break;
                }
                i++;
            }
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            ImageListModel imageListModel = (ImageListModel) serializer.A(ImageListModel.class.getClassLoader());
            ImageListModel imageListModel2 = (ImageListModel) serializer.A(ImageListModel.class.getClassLoader());
            CharacterContext characterContext2 = characterContext;
            int u = serializer.u();
            int u2 = serializer.u();
            ArrayList B = serializer.B(VmojiProductModel.class.getClassLoader());
            int u3 = serializer.u();
            PromoColor.a aVar2 = PromoColor.Companion;
            String H3 = serializer.H();
            aVar2.getClass();
            return new VmojiCharacterModel(vmojiAvatar, H, characterContext2, m, m2, imageListModel, imageListModel2, u, u2, null, B, u3, PromoColor.a.a(H3), 512, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiCharacterModel[i];
        }
    }

    public /* synthetic */ VmojiCharacterModel(VmojiAvatar vmojiAvatar, String str, CharacterContext characterContext, boolean z, boolean z2, ImageListModel imageListModel, ImageListModel imageListModel2, int i, int i2, Integer num, List list, int i3, PromoColor promoColor, int i4, zcl zclVar) {
        this(vmojiAvatar, str, characterContext, z, z2, imageListModel, imageListModel2, i, i2, (i4 & 512) != 0 ? null : num, list, i3, promoColor);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d.h());
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.e0(this.g);
        serializer.e0(this.h);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.f0(this.l);
        serializer.S(this.m);
        PromoColor promoColor = this.n;
        serializer.j0(promoColor != null ? promoColor.i() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiCharacterModel)) {
            return false;
        }
        VmojiCharacterModel vmojiCharacterModel = (VmojiCharacterModel) obj;
        return epx.f(this.b, vmojiCharacterModel.b) && epx.f(this.c, vmojiCharacterModel.c) && this.d == vmojiCharacterModel.d && this.e == vmojiCharacterModel.e && this.f == vmojiCharacterModel.f && epx.f(this.g, vmojiCharacterModel.g) && epx.f(this.h, vmojiCharacterModel.h) && this.i == vmojiCharacterModel.i && this.j == vmojiCharacterModel.j && epx.f(this.k, vmojiCharacterModel.k) && epx.f(this.l, vmojiCharacterModel.l) && this.m == vmojiCharacterModel.m && this.n == vmojiCharacterModel.n;
    }

    public final int hashCode() {
        int b2 = qoy.b(qoy.b((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
        ImageListModel imageListModel = this.g;
        int hashCode = (b2 + (imageListModel == null ? 0 : imageListModel.b.hashCode())) * 31;
        ImageListModel imageListModel2 = this.h;
        int a2 = shy.a(this.j, shy.a(this.i, (hashCode + (imageListModel2 == null ? 0 : imageListModel2.b.hashCode())) * 31, 31), 31);
        Integer num = this.k;
        int a3 = shy.a(this.m, fw3.a((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.l), 31);
        PromoColor promoColor = this.n;
        return a3 + (promoColor != null ? promoColor.hashCode() : 0);
    }

    public final String toString() {
        return "VmojiCharacterModel(avatar=" + this.b + ", firstNameGen=" + this.c + ", characterContext=" + this.d + ", isVmojiAlreadyCreated=" + this.e + ", isHideFromKeyboard=" + this.f + ", avatarIcon=" + this.g + ", avatarIconDark=" + this.h + ", avatarColor=" + this.i + ", avatarColorDark=" + this.j + ", contextStickerPackId=" + this.k + ", vmojiProducts=" + this.l + ", promoCounter=" + this.m + ", promoCounterColor=" + this.n + ')';
    }

    public VmojiCharacterModel(VmojiAvatar vmojiAvatar, String str, CharacterContext characterContext, boolean z, boolean z2, ImageListModel imageListModel, ImageListModel imageListModel2, int i, int i2, Integer num, List<VmojiProductModel> list, int i3, PromoColor promoColor) {
        this.b = vmojiAvatar;
        this.c = str;
        this.d = characterContext;
        this.e = z;
        this.f = z2;
        this.g = imageListModel;
        this.h = imageListModel2;
        this.i = i;
        this.j = i2;
        this.k = num;
        this.l = list;
        this.m = i3;
        this.n = promoColor;
    }
}
