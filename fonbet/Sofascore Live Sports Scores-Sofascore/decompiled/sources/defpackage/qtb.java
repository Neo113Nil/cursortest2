package defpackage;

import com.ironsource.C4427z5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class qtb implements Map.Entry, eia {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qtb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && Intrinsics.c(entry.getKey(), obj2) && Intrinsics.c(entry.getValue(), getValue());
            case 1:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && Intrinsics.c(entry.getKey(), obj2) && Intrinsics.c(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            case 1:
                int hashCode2 = obj != null ? obj.hashCode() : 0;
                Object value2 = getValue();
                return hashCode2 ^ (value2 != null ? value2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(C4427z5.U);
                sb.append(getValue());
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(C4427z5.U);
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
