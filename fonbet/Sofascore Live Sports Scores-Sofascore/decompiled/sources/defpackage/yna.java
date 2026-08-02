package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yna {
    public final Object a;
    public final LinkedHashMap b = new LinkedHashMap();

    public yna(Object obj) {
        this.a = obj;
    }

    public Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yna) && Intrinsics.c(a(), ((yna) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
