package defpackage;

import com.ironsource.C4427z5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ep5 implements Map.Entry, hia {
    public final Object a;
    public Object b;

    public ep5(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.c(entry.getKey(), this.a) && Intrinsics.c(entry.getValue(), this.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.a;
        obj.getClass();
        int hashCode = obj.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        Object obj2 = this.b;
        obj2.getClass();
        return obj2.hashCode() + hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.b = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(C4427z5.U);
        sb.append(this.b);
        return sb.toString();
    }
}
