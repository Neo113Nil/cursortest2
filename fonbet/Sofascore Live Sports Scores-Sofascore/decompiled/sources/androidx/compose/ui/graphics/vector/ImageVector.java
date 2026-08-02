package androidx.compose.ui.graphics.vector;

import defpackage.d8k;
import defpackage.e8k;
import defpackage.fc6;
import defpackage.imk;
import defpackage.kpg;
import defpackage.ljg;
import defpackage.p75;
import defpackage.r13;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ImageVector {
    public static int k;
    public static final kpg l = new kpg(25);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final imk f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public ImageVector(String str, float f, float f2, float f3, float f4, imk imkVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = imkVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        if (!Intrinsics.c(this.a, imageVector.a) || !p75.b(this.b, imageVector.b) || !p75.b(this.c, imageVector.c) || this.d != imageVector.d || this.e != imageVector.e || !this.f.equals(imageVector.f)) {
            return false;
        }
        long j = imageVector.g;
        int i = r13.j;
        return e8k.a(this.g, j) && this.h == imageVector.h && this.i == imageVector.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + fc6.a(this.e, fc6.a(this.d, fc6.a(this.c, fc6.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Boolean.hashCode(this.i) + wv8.a(this.h, ljg.c(hashCode, 31, this.g), 31);
    }
}
