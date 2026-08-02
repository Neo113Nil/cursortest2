package com.vk.catalog2.common.dto.ui.actions;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.HashMap;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;

/* compiled from: UIBlockActionOpenSection.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionOpenSection extends UIBlockAction implements dfp0 {
    public static final Serializer.c<UIBlockActionOpenSection> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final Image F;
    public final String G;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionOpenSection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionOpenSection a(Serializer serializer) {
            return new UIBlockActionOpenSection(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionOpenSection[i];
        }
    }

    public UIBlockActionOpenSection(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, Image image, String str8) {
        super(aVar, str);
        this.z = str2;
        this.B = str3;
        this.C = str4;
        this.G = str5;
        this.D = str6;
        this.E = str7;
        this.F = image;
        this.A = str8;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.G);
        serializer.j0(this.D);
        serializer.j0(this.E);
        serializer.i0(this.F);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return Rb(this.e);
    }

    public final UIBlockActionOpenSection Rb(CatalogDataType catalogDataType) {
        Image image;
        com.vk.catalog2.common.dto.api.ui.a a2 = com.vk.catalog2.common.dto.api.ui.a.a(Ab(), null, null, null, catalogDataType, null, null, 8183);
        Image image2 = this.F;
        if (image2 != null) {
            Parcel obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.g gVar = new Serializer.g(obtain);
                gVar.i0(image2);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G = gVar.G(Image.class.getClassLoader());
                obtain.recycle();
                image = (Image) G;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            image = null;
        }
        return new UIBlockActionOpenSection(a2, this.y, this.z, this.B, this.C, this.G, this.D, this.E, image, this.A);
    }

    public final String Sb() {
        return this.D;
    }

    public final Image Tb() {
        return this.F;
    }

    public final String Ub() {
        return this.E;
    }

    public final String Vb() {
        return this.C;
    }

    public final String Wb() {
        return this.A;
    }

    public final String Xb() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionOpenSection)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) obj;
        return epx.f(this.z, uIBlockActionOpenSection.z) && epx.f(this.B, uIBlockActionOpenSection.B) && epx.f(this.C, uIBlockActionOpenSection.C) && epx.f(this.G, uIBlockActionOpenSection.G) && epx.f(this.D, uIBlockActionOpenSection.D) && epx.f(this.E, uIBlockActionOpenSection.E) && epx.f(this.F, uIBlockActionOpenSection.F) && epx.f(this.A, uIBlockActionOpenSection.A);
    }

    public final String getTitle() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.B, this.G, this.D, this.E, this.F, this.A);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.G;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "ACTION[" + this.d + "]: " + this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return Rb(this.e);
    }

    public UIBlockActionOpenSection(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.B = H2 != null ? H2 : "";
        this.C = serializer.H();
        this.G = serializer.H();
        this.D = serializer.H();
        this.E = serializer.H();
        this.F = (Image) serializer.G(Image.class.getClassLoader());
        this.A = serializer.H();
    }
}
