package com.vk.catalog2.common.dto.ui.actions;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.ksx0;
import xsna.qjg;

/* compiled from: UIBlockActionOpenUrl.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionOpenUrl extends UIBlockAction implements ksx0, dfp0 {
    public static final Serializer.c<UIBlockActionOpenUrl> CREATOR = new a();
    public final ActionOpenUrl A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionOpenUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionOpenUrl a(Serializer serializer) {
            return new UIBlockActionOpenUrl(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionOpenUrl[i];
        }
    }

    public UIBlockActionOpenUrl(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, ActionOpenUrl actionOpenUrl, String str4, String str5, String str6) {
        super(aVar, str);
        this.z = str3;
        this.A = actionOpenUrl;
        this.B = str2;
        this.C = str4;
        this.D = str5;
        this.E = str6;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // xsna.ksx0
    public final String I2() {
        return this.D;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.i0(this.A);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.j0(this.E);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionOpenUrl zb() {
        return Sb(this.e, null);
    }

    public final UIBlockActionOpenUrl Sb(CatalogDataType catalogDataType, CatalogViewType catalogViewType) {
        CatalogViewType catalogViewType2 = catalogViewType == null ? this.d : catalogViewType;
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        ActionOpenUrl actionOpenUrl = null;
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        CatalogOnboardingInfo catalogOnboardingInfo = this.n;
        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(this.b, this.c, catalogViewType2, catalogDataType, this.f, a2, a3, hashSet, zb, copy, this.m, catalogOnboardingInfo != null ? CatalogOnboardingInfo.zb(catalogOnboardingInfo) : null, this.p);
        ActionOpenUrl actionOpenUrl2 = this.A;
        if (actionOpenUrl2 != null) {
            Parcel obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.g gVar = new Serializer.g(obtain);
                gVar.i0(actionOpenUrl2);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G = gVar.G(ActionOpenUrl.class.getClassLoader());
                obtain.recycle();
                actionOpenUrl = (ActionOpenUrl) G;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return new UIBlockActionOpenUrl(aVar, this.y, this.B, this.z, actionOpenUrl, this.C, this.D, this.E);
    }

    public final ActionOpenUrl Tb() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionOpenUrl)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) obj;
        return epx.f(this.z, uIBlockActionOpenUrl.z) && epx.f(this.A, uIBlockActionOpenUrl.A) && epx.f(this.C, uIBlockActionOpenUrl.C) && epx.f(this.D, uIBlockActionOpenUrl.D) && epx.f(this.E, uIBlockActionOpenUrl.E);
    }

    public final String getTitle() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.C, this.D, this.E);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.E;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.z, '>');
    }

    public UIBlockActionOpenUrl(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.A = (ActionOpenUrl) serializer.G(ActionOpenUrl.class.getClassLoader());
        this.B = serializer.H();
        this.C = serializer.H();
        this.D = serializer.H();
        this.E = serializer.H();
    }
}
