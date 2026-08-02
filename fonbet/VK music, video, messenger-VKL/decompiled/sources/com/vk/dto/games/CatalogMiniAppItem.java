package com.vk.dto.games;

import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: CatalogMiniAppItem.kt */
/* loaded from: classes18.dex */
public final class CatalogMiniAppItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMiniAppItem> CREATOR = new a();
    public final long b;
    public final String c;
    public final AppType d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogMiniAppItem.kt */
    public static final class AppType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppType[] $VALUES;
        public static final a Companion;
        public static final AppType GAME;
        public static final AppType MINI_APP;

        /* compiled from: CatalogMiniAppItem.kt */
        public static final class a {
        }

        static {
            AppType appType = new AppType("GAME", 0);
            GAME = appType;
            AppType appType2 = new AppType("MINI_APP", 1);
            MINI_APP = appType2;
            AppType[] appTypeArr = {appType, appType2};
            $VALUES = appTypeArr;
            $ENTRIES = new asp(appTypeArr);
            Companion = new a();
        }

        public AppType() {
            throw null;
        }

        public static AppType valueOf(String str) {
            return (AppType) Enum.valueOf(AppType.class, str);
        }

        public static AppType[] values() {
            return (AppType[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogMiniAppItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMiniAppItem a(Serializer serializer) {
            long w = serializer.w();
            String H = serializer.H();
            AppType.a aVar = AppType.Companion;
            int u = serializer.u();
            aVar.getClass();
            return new CatalogMiniAppItem(w, H, AppType.values()[u]);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMiniAppItem[i];
        }
    }

    public CatalogMiniAppItem(long j, String str, AppType appType) {
        this.b = j;
        this.c = str;
        this.d = appType;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.S(this.d.ordinal());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMiniAppItem)) {
            return false;
        }
        CatalogMiniAppItem catalogMiniAppItem = (CatalogMiniAppItem) obj;
        return this.b == catalogMiniAppItem.b && epx.f(this.c, catalogMiniAppItem.c) && this.d == catalogMiniAppItem.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CatalogMiniAppItem(id=" + this.b + ", trackCode=" + this.c + ", appType=" + this.d + ')';
    }
}
