package dk0;

import ck0.C5841a;
import id.f;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.network.serializing.date.DateTimeWithMs;

/* loaded from: classes7.dex */
final class b implements f<Object, DateTime> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f61664a;

    /* renamed from: b, reason: collision with root package name */
    private org.joda.time.format.b f61665b;

    public b(@NotNull LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f61664a = map;
    }

    private final org.joda.time.format.b a(m<?> mVar) {
        Object obj;
        org.joda.time.format.b bVar = this.f61665b;
        if (bVar != null) {
            return bVar;
        }
        Iterator<T> it = mVar.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Annotation) obj) instanceof DateTimeWithMs) {
                break;
            }
        }
        org.joda.time.format.b b11 = ((DateTimeWithMs) obj) != null ? C5841a.b() : C5841a.a();
        this.f61665b = b11;
        return b11;
    }

    @Override // id.e
    public final Object getValue(Object thisRef, m property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj = this.f61664a.get(property.getName());
        if (obj != null) {
            DateTime d11 = a(property).d((String) obj);
            Intrinsics.checkNotNullExpressionValue(d11, "parse(...)");
            return d11;
        }
        throw new NoSuchElementException("Property " + property + " is missing in the map.");
    }

    @Override // id.f
    public final void setValue(Object thisRef, m property, DateTime dateTime) {
        String g10;
        DateTime value = dateTime;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        org.joda.time.format.b a11 = a(property);
        String name = property.getName();
        if (a11 == null) {
            g10 = value.toString();
        } else {
            value.getClass();
            g10 = a11.g(value);
        }
        this.f61664a.put(name, g10);
    }
}
