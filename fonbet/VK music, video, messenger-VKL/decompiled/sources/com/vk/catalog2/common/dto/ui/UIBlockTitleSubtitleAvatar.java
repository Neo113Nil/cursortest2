package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockTitleSubtitleAvatar.kt */
/* loaded from: classes16.dex */
public final class UIBlockTitleSubtitleAvatar extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockTitleSubtitleAvatar> CREATOR = new b();
    public final String A;
    public final Integer B;
    public final Image C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final String G;
    public final String y;
    public final String z;

    /* compiled from: UIBlockTitleSubtitleAvatar.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final Integer d;
        public final Image e;
        public final boolean f;
        public final String g;
        public final boolean h;
        public final String i;

        public a(String str, String str2, String str3, Integer num, Image image, boolean z, String str4, boolean z2, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = num;
            this.e = image;
            this.f = z;
            this.g = str4;
            this.h = z2;
            this.i = str5;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockTitleSubtitleAvatar> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockTitleSubtitleAvatar a(Serializer serializer) {
            return new UIBlockTitleSubtitleAvatar(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockTitleSubtitleAvatar[i];
        }
    }

    public UIBlockTitleSubtitleAvatar(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
        this.z = serializer.H();
        this.A = serializer.H();
        this.B = serializer.v();
        this.C = (Image) serializer.G(Image.class.getClassLoader());
        this.D = serializer.m();
        this.E = serializer.H();
        this.F = serializer.m();
        this.G = serializer.H();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.g.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.V(this.B);
        serializer.i0(this.C);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.j0(this.E);
        serializer.L(this.F ? (byte) 1 : (byte) 0);
        serializer.j0(this.G);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockTitleSubtitleAvatar) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockTitleSubtitleAvatar uIBlockTitleSubtitleAvatar = (UIBlockTitleSubtitleAvatar) obj;
        return epx.f(this.y, uIBlockTitleSubtitleAvatar.y) && epx.f(this.B, uIBlockTitleSubtitleAvatar.B) && epx.f(this.C, uIBlockTitleSubtitleAvatar.C) && this.D == uIBlockTitleSubtitleAvatar.D && epx.f(this.E, uIBlockTitleSubtitleAvatar.E) && this.F == uIBlockTitleSubtitleAvatar.F && epx.f(this.G, uIBlockTitleSubtitleAvatar.G);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B, this.C, Boolean.valueOf(this.D), this.E, Boolean.valueOf(this.F), this.G);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.G;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoOwner[Id: ");
        sb.append(this.g);
        sb.append("; Name: ");
        return ho8.a(sb, this.y, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        Image image = this.C;
        return new UIBlockTitleSubtitleAvatar(Ab, new a(this.y, this.z, this.A, this.B, image != null ? new Image(image.b) : null, this.D, this.E, this.F, this.G));
    }

    public UIBlockTitleSubtitleAvatar(com.vk.catalog2.common.dto.api.ui.a aVar, a aVar2) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, null, null, null, null, null, null, null, 32512, null);
        this.y = aVar2.a;
        this.z = aVar2.b;
        this.A = aVar2.c;
        this.B = aVar2.d;
        this.C = aVar2.e;
        this.D = aVar2.f;
        this.E = aVar2.g;
        this.F = aVar2.h;
        this.G = aVar2.i;
    }
}
