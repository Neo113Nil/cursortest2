package com.vk.catalog2.common.dto.ui;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.group.GroupCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import xsna.epx;

/* compiled from: UIBlockGroupsCollection.kt */
/* loaded from: classes16.dex */
public final class UIBlockGroupsCollection extends UIBlock {
    public static final Serializer.c<UIBlockGroupsCollection> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final Image D;
    public final Image E;
    public final List<UIBlockGroup> F;
    public final String G;
    public final int H;
    public final int I;
    public final Image J;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockGroupsCollection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockGroupsCollection a(Serializer serializer) {
            return new UIBlockGroupsCollection(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockGroupsCollection[i];
        }
    }

    public UIBlockGroupsCollection(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
        this.z = serializer.H();
        this.A = serializer.H();
        this.B = serializer.H();
        this.C = serializer.H();
        this.D = (Image) serializer.G(Image.class.getClassLoader());
        this.E = (Image) serializer.G(Image.class.getClassLoader());
        List<UIBlockGroup> k = serializer.k(UIBlockGroup.class);
        this.F = k == null ? EmptyList.b : k;
        this.G = serializer.H();
        this.H = serializer.u();
        this.I = serializer.u();
        this.J = (Image) serializer.G(Image.class.getClassLoader());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.i0(this.D);
        serializer.i0(this.E);
        serializer.W(this.F);
        serializer.j0(this.G);
        serializer.S(this.H);
        serializer.S(this.I);
        serializer.i0(this.J);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockGroupsCollection) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockGroupsCollection uIBlockGroupsCollection = (UIBlockGroupsCollection) obj;
        return epx.f(this.y, uIBlockGroupsCollection.y) && epx.f(this.z, uIBlockGroupsCollection.z) && epx.f(this.A, uIBlockGroupsCollection.A) && epx.f(this.B, uIBlockGroupsCollection.B) && epx.f(this.C, uIBlockGroupsCollection.C) && epx.f(this.D, uIBlockGroupsCollection.D) && epx.f(this.E, uIBlockGroupsCollection.E) && epx.f(this.F, uIBlockGroupsCollection.F) && epx.f(this.G, uIBlockGroupsCollection.G) && this.H == uIBlockGroupsCollection.H && this.I == uIBlockGroupsCollection.I && epx.f(this.J, uIBlockGroupsCollection.J);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, Integer.valueOf(this.H), Integer.valueOf(this.I), this.J);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "GroupsCollection(id = " + this.y + ", title = " + this.z + ", groupsCount = " + this.F.size();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        Image image;
        Image image2;
        Parcel obtain;
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        Image image3 = null;
        Image image4 = this.D;
        if (image4 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.g gVar = new Serializer.g(obtain);
                gVar.i0(image4);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G = gVar.G(Image.class.getClassLoader());
                obtain.recycle();
                image = (Image) G;
            } finally {
            }
        } else {
            image = null;
        }
        Image image5 = this.E;
        if (image5 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                Serializer.g gVar2 = new Serializer.g(obtain);
                gVar2.i0(image5);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G2 = gVar2.G(Image.class.getClassLoader());
                obtain.recycle();
                image2 = (Image) G2;
            } finally {
            }
        } else {
            image2 = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIBlockGroup> it = this.F.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().zb());
        }
        Image image6 = this.J;
        if (image6 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                Serializer.g gVar3 = new Serializer.g(obtain);
                gVar3.i0(image6);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G3 = gVar3.G(Image.class.getClassLoader());
                obtain.recycle();
                image3 = (Image) G3;
            } finally {
            }
        }
        return new UIBlockGroupsCollection(Ab, this.y, this.z, this.A, this.B, this.C, image, image2, arrayList, this.G, this.H, this.I, image3);
    }

    public UIBlockGroupsCollection(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, String str5, Image image, Image image2, List<UIBlockGroup> list, String str6, int i, int i2, Image image3) {
        super(aVar);
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = image;
        this.E = image2;
        this.F = list;
        this.G = str6;
        this.H = i;
        this.I = i2;
        this.J = image3;
    }

    public UIBlockGroupsCollection(com.vk.catalog2.common.dto.api.ui.a aVar, GroupCollection groupCollection, List<UIBlockGroup> list) {
        super(aVar);
        this.y = groupCollection.b;
        this.z = groupCollection.c;
        this.A = groupCollection.d;
        this.B = groupCollection.e;
        this.C = groupCollection.f;
        this.D = groupCollection.g;
        this.E = groupCollection.h;
        this.F = list;
        this.G = groupCollection.j;
        this.H = groupCollection.k;
        this.I = groupCollection.l;
        this.J = groupCollection.m;
    }
}
