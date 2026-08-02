package com.vk.catalog2.common.dto.ui.actions;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenEditMarketAlbum;
import java.util.HashMap;
import java.util.Objects;
import xsna.epx;
import xsna.qjg;

/* compiled from: UIBlockActionMarketEditAlbum.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionMarketEditAlbum extends UIBlockAction {
    public static final Serializer.c<UIBlockActionMarketEditAlbum> CREATOR = new a();
    public final ActionOpenEditMarketAlbum A;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionMarketEditAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionMarketEditAlbum a(Serializer serializer) {
            return new UIBlockActionMarketEditAlbum(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionMarketEditAlbum[i];
        }
    }

    public UIBlockActionMarketEditAlbum(com.vk.catalog2.common.dto.api.ui.a aVar, String str, ActionOpenEditMarketAlbum actionOpenEditMarketAlbum) {
        super(aVar, null);
        this.z = str;
        this.A = actionOpenEditMarketAlbum;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.i0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionMarketEditAlbum zb() {
        ActionOpenEditMarketAlbum actionOpenEditMarketAlbum;
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        ActionOpenEditMarketAlbum actionOpenEditMarketAlbum2 = this.A;
        if (actionOpenEditMarketAlbum2 != null) {
            Parcel obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.g gVar = new Serializer.g(obtain);
                gVar.i0(actionOpenEditMarketAlbum2);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G = gVar.G(ActionOpenEditMarketAlbum.class.getClassLoader());
                obtain.recycle();
                actionOpenEditMarketAlbum = (ActionOpenEditMarketAlbum) G;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            actionOpenEditMarketAlbum = null;
        }
        return new UIBlockActionMarketEditAlbum(Ab, this.z, actionOpenEditMarketAlbum);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionMarketEditAlbum)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionMarketEditAlbum uIBlockActionMarketEditAlbum = (UIBlockActionMarketEditAlbum) obj;
        return epx.f(this.z, uIBlockActionMarketEditAlbum.z) && epx.f(this.A, uIBlockActionMarketEditAlbum.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<title=" + this.z + ", action=" + this.A + '>';
    }

    public UIBlockActionMarketEditAlbum(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.A = (ActionOpenEditMarketAlbum) serializer.G(ActionOpenEditMarketAlbum.class.getClassLoader());
    }
}
