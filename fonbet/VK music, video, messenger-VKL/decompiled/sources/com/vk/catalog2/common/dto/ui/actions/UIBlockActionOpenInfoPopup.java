package com.vk.catalog2.common.dto.ui.actions;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockActionOpenInfoPopup.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionOpenInfoPopup extends UIBlockAction {
    public static final Serializer.c<UIBlockActionOpenInfoPopup> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final Image D;
    public final String E;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionOpenInfoPopup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionOpenInfoPopup a(Serializer serializer) {
            return new UIBlockActionOpenInfoPopup(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionOpenInfoPopup[i];
        }
    }

    public UIBlockActionOpenInfoPopup(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.A = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.B = H3 != null ? H3 : "";
        this.C = serializer.H();
        this.D = (Image) serializer.G(Image.class.getClassLoader());
        this.E = serializer.H();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.m0(this.z);
        serializer.m0(this.A);
        serializer.m0(this.B);
        serializer.m0(this.C);
        serializer.i0(this.D);
        serializer.m0(this.E);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionOpenInfoPopup zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        Image image = null;
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        CatalogOnboardingInfo catalogOnboardingInfo = this.n;
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(this.b, this.c, this.d, this.e, this.f, a2, a3, hashSet, zb, copy, this.m, catalogOnboardingInfo != null ? CatalogOnboardingInfo.zb(catalogOnboardingInfo) : null, this.p);
        Image image2 = this.D;
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
        }
        return new UIBlockActionOpenInfoPopup(aVar, this.z, this.A, this.B, this.C, image, this.E);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionOpenInfoPopup)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionOpenInfoPopup uIBlockActionOpenInfoPopup = (UIBlockActionOpenInfoPopup) obj;
        return epx.f(this.z, uIBlockActionOpenInfoPopup.z) && epx.f(this.A, uIBlockActionOpenInfoPopup.A) && epx.f(this.B, uIBlockActionOpenInfoPopup.B) && epx.f(this.C, uIBlockActionOpenInfoPopup.C) && epx.f(this.D, uIBlockActionOpenInfoPopup.D) && epx.f(this.E, uIBlockActionOpenInfoPopup.E);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B, this.C, this.D, this.E);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.B, '>');
    }

    public UIBlockActionOpenInfoPopup(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, Image image, String str5) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, null, aVar.b, aVar.j, aVar.m);
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.D = image;
        this.E = str5;
    }
}
