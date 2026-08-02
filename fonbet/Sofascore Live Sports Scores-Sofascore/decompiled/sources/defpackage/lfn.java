package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class lfn implements Map.Entry, Comparable, Serializable {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lfn lfnVar = (lfn) obj;
        yen yenVar = new yen();
        yenVar.a(d(), lfnVar.d());
        yenVar.a(g(), lfnVar.g());
        return yenVar.a;
    }

    public abstract Object d();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Objects.equals(d(), entry.getKey()) && Objects.equals(g(), entry.getValue());
    }

    public abstract Object g();

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return d();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return g();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hashCode(g()) ^ Objects.hashCode(d());
    }

    public final String toString() {
        String valueOf = String.valueOf(d());
        String valueOf2 = String.valueOf(g());
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + 1);
        bf3.v(sb, "(", valueOf, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
