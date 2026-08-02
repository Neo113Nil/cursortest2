package com.vk.dto.menu;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;

/* compiled from: MenuInfo.kt */
/* loaded from: classes18.dex */
public final class MenuInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MenuInfo> CREATOR = new a();
    public final String b;
    public final boolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MenuInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MenuInfo a(Serializer serializer) {
            return new MenuInfo(serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MenuInfo[i];
        }
    }

    public MenuInfo(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuInfo)) {
            return false;
        }
        MenuInfo menuInfo = (MenuInfo) obj;
        return epx.f(this.b, menuInfo.b) && this.c == menuInfo.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuInfo(key=");
        sb.append(this.b);
        sb.append(", new=");
        return q0.a(sb, this.c, ')');
    }
}
