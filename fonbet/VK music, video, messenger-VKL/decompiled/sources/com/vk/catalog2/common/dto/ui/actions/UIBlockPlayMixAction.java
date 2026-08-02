package com.vk.catalog2.common.dto.ui.actions;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.HashMap;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockPlayMixAction.kt */
/* loaded from: classes16.dex */
public final class UIBlockPlayMixAction extends UIBlockAction {
    public static final Serializer.c<UIBlockPlayMixAction> CREATOR = new b();
    public final String A;
    public final String B;
    public final a C;
    public final String D;
    public final String E;
    public final String z;

    /* compiled from: UIBlockPlayMixAction.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final Image c;
        public final Image d;
        public final String e;

        public a(String str, String str2, Image image, Image image2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = image;
            this.d = image2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.c;
            int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.d;
            int hashCode4 = (hashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
            String str2 = this.e;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayMixContent(title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", images=");
            sb.append(this.c);
            sb.append(", foregroundImages=");
            sb.append(this.d);
            sb.append(", icon=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockPlayMixAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockPlayMixAction a(Serializer serializer) {
            return new UIBlockPlayMixAction(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockPlayMixAction[i];
        }
    }

    public UIBlockPlayMixAction(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, String str5, a aVar2, String str6) {
        super(aVar, str5);
        this.z = str;
        this.E = str2;
        this.A = str3;
        this.B = str4;
        this.C = aVar2;
        this.D = str6;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.E);
        serializer.j0(this.A);
        serializer.j0(this.B);
        a aVar = this.C;
        serializer.j0(aVar.a);
        serializer.j0(aVar.b);
        serializer.i0(aVar.c);
        serializer.i0(aVar.d);
        serializer.j0(aVar.e);
        serializer.j0(this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockPlayMixAction zb() {
        Image image;
        Parcel obtain;
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        a aVar = this.C;
        String str = aVar.a;
        String str2 = aVar.b;
        Image image2 = aVar.c;
        Image image3 = null;
        if (image2 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.g gVar = new Serializer.g(obtain);
                gVar.i0(image2);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G = gVar.G(Image.class.getClassLoader());
                obtain.recycle();
                image = (Image) G;
            } finally {
            }
        } else {
            image = null;
        }
        Image image4 = aVar.d;
        if (image4 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                Serializer.g gVar2 = new Serializer.g(obtain);
                gVar2.i0(image4);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G2 = gVar2.G(Image.class.getClassLoader());
                obtain.recycle();
                image3 = (Image) G2;
            } finally {
            }
        }
        return new UIBlockPlayMixAction(Ab, this.z, this.E, this.A, this.B, this.y, new a(str, str2, image, image3, aVar.e), this.D);
    }

    public final String Sb() {
        return this.z;
    }

    public final Image Tb() {
        return this.C.d;
    }

    public final Image Ub() {
        return this.C.c;
    }

    public final String Vb() {
        return this.A;
    }

    public final String Wb() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockPlayMixAction)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y);
    }

    public final String getDescription() {
        return this.C.b;
    }

    public final String getId() {
        return this.E;
    }

    public final String getTitle() {
        return this.C.a;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<[" + this.d + "]>";
    }

    public UIBlockPlayMixAction(Serializer serializer) {
        super(serializer);
        this.z = serializer.H();
        this.E = serializer.H();
        String H = serializer.H();
        this.A = H == null ? "" : H;
        String H2 = serializer.H();
        this.B = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.C = new a(H3 == null ? "" : H3, serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), serializer.H());
        this.D = serializer.H();
    }
}
