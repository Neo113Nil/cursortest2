package androidx.compose.ui.semantics;

import Z.h;
import androidx.compose.ui.platform.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class SemanticsConfiguration implements Iterable, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17703a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f17704b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17705c;

    public final boolean a(h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f17703a.containsKey(key);
    }

    public final Object b(h key, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.f17703a.get(key);
        return obj == null ? defaultValue.invoke() : obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.areEqual(this.f17703a, semanticsConfiguration.f17703a) && this.f17704b == semanticsConfiguration.f17704b && this.f17705c == semanticsConfiguration.f17705c;
    }

    public int hashCode() {
        return (((this.f17703a.hashCode() * 31) + Boolean.hashCode(this.f17704b)) * 31) + Boolean.hashCode(this.f17705c);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f17703a.entrySet().iterator();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f17704b) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f17705c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f17703a.entrySet()) {
            h hVar = (h) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(hVar.a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return i.a(this, null) + "{ " + ((Object) sb2) + " }";
    }
}
