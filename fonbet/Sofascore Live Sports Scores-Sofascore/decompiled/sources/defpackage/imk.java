package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class imk extends kmk implements Iterable, eia {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;

    public imk(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof imk)) {
            return false;
        }
        imk imkVar = (imk) obj;
        return Intrinsics.c(this.a, imkVar.a) && this.b == imkVar.b && this.c == imkVar.c && this.d == imkVar.d && this.e == imkVar.e && this.f == imkVar.f && this.g == imkVar.g && this.h == imkVar.h && Intrinsics.c(this.i, imkVar.i) && this.j.equals(imkVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dmi.d(fc6.a(this.h, fc6.a(this.g, fc6.a(this.f, fc6.a(this.e, fc6.a(this.d, fc6.a(this.c, fc6.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y4(this);
    }
}
