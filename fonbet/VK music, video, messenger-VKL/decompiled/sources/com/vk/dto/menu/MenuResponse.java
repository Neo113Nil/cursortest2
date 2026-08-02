package com.vk.dto.menu;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;

/* compiled from: MenuResponse.kt */
/* loaded from: classes18.dex */
public final class MenuResponse extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MenuResponse> CREATOR = new a();
    public final List<MenuInfo> b;
    public final List<MenuInfo> c;
    public final List<MenuInfo> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MenuResponse> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MenuResponse a(Serializer serializer) {
            Serializer.c<MenuInfo> cVar = MenuInfo.CREATOR;
            return new MenuResponse(serializer.j(cVar), serializer.j(cVar), serializer.j(cVar));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MenuResponse[i];
        }
    }

    public MenuResponse(List<MenuInfo> list, List<MenuInfo> list2, List<MenuInfo> list3) {
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.o0(this.c);
        serializer.o0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuResponse)) {
            return false;
        }
        MenuResponse menuResponse = (MenuResponse) obj;
        return epx.f(this.b, menuResponse.b) && epx.f(this.c, menuResponse.c) && epx.f(this.d, menuResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuResponse(main=");
        sb.append(this.b);
        sb.append(", other=");
        sb.append(this.c);
        sb.append(", special=");
        return ms9.a(')', sb, this.d);
    }
}
