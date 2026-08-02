package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class l5k implements KTypeParameter {

    @NotNull
    public static final k5k f = new k5k(null);
    public final Object a;
    public final joa b;
    public final String c;
    public final KVariance d;
    public volatile List e;

    public l5k(Object obj, KVariance kVariance) {
        obj.getClass();
        kVariance.getClass();
        obj.getClass();
        this.a = obj;
        this.b = ypa.a(ysa.b, new sr8(this, 14));
        this.c = "PluginConfigT";
        this.d = kVariance;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l5k)) {
            return false;
        }
        l5k l5kVar = (l5k) obj;
        return Intrinsics.c(this.c, l5kVar.c) && Intrinsics.c(this.a, l5kVar.a);
    }

    @Override // kotlin.reflect.KTypeParameter
    public final String getName() {
        return this.c;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final List getUpperBounds() {
        List list = this.e;
        if (list != null) {
            return list;
        }
        fuf fufVar = duf.a;
        List c = a.c(fufVar.typeOf(fufVar.getOrCreateKotlinClass(Object.class), Collections.EMPTY_LIST, true));
        this.e = c;
        return c;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final KVariance getVariance() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    public final boolean isReified() {
        return false;
    }

    public final String toString() {
        f.getClass();
        return k5k.a(this);
    }
}
