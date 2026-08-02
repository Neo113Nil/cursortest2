package org.maplibre.android.style.layers;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f79985a;

    /* renamed from: b, reason: collision with root package name */
    public final T f79986b;

    public c(@NonNull String str, T t2) {
        this.f79985a = str;
        this.f79986b = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (!this.f79985a.equals(cVar.f79985a)) {
                return false;
            }
            T t2 = cVar.f79986b;
            T t11 = this.f79986b;
            if (t11 != null) {
                return t11 instanceof Object[] ? Arrays.deepEquals((Object[]) t11, (Object[]) t2) : t11.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f79985a.hashCode() * 31;
        T t2 = this.f79986b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        return String.format("%s: %s", this.f79985a, this.f79986b);
    }
}
