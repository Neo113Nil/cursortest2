package com.braze.support;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f772a;
    public final Map b;

    public a() {
        this.f772a = null;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f772a, aVar.f772a) && Intrinsics.areEqual(this.b, aVar.b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f772a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.f772a + ", headers=" + this.b + ")";
    }

    public a(Bitmap bitmap, Map map) {
        this.f772a = bitmap;
        this.b = map;
    }
}
