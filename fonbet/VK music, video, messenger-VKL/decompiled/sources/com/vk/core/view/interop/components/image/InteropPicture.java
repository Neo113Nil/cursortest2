package com.vk.core.view.interop.components.image;

import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.snx;
import xsna.zrp;

/* compiled from: InteropPicture.kt */
/* loaded from: classes17.dex */
public final class InteropPicture {
    public final snx.b a;
    public final List<snx.a> b;
    public final snx.c c;
    public final Radius d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InteropPicture.kt */
    public static final class Radius {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Radius[] $VALUES;
        public static final Radius Large;
        public static final Radius Medium;
        public static final Radius Small;

        static {
            Radius radius = new Radius("Small", 0);
            Small = radius;
            Radius radius2 = new Radius("Medium", 1);
            Medium = radius2;
            Radius radius3 = new Radius("Large", 2);
            Large = radius3;
            Radius[] radiusArr = {radius, radius2, radius3};
            $VALUES = radiusArr;
            $ENTRIES = new asp(radiusArr);
        }

        public Radius() {
            throw null;
        }

        public static Radius valueOf(String str) {
            return (Radius) Enum.valueOf(Radius.class, str);
        }

        public static Radius[] values() {
            return (Radius[]) $VALUES.clone();
        }
    }

    public InteropPicture() {
        throw null;
    }

    public InteropPicture(snx.b bVar, snx.c.a aVar, Radius radius, int i) {
        EmptyList emptyList = EmptyList.b;
        aVar = (i & 4) != 0 ? null : aVar;
        radius = (i & 8) != 0 ? Radius.Medium : radius;
        this.a = bVar;
        this.b = emptyList;
        this.c = aVar;
        this.d = radius;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteropPicture)) {
            return false;
        }
        InteropPicture interopPicture = (InteropPicture) obj;
        return epx.f(this.a, interopPicture.a) && epx.f(this.b, interopPicture.b) && epx.f(this.c, interopPicture.c) && this.d == interopPicture.d;
    }

    public final int hashCode() {
        int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
        snx.c cVar = this.c;
        return this.d.hashCode() + ((a + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public final String toString() {
        return "InteropPicture(content=" + this.a + ", badges=" + this.b + ", overlay=" + this.c + ", radius=" + this.d + ')';
    }
}
