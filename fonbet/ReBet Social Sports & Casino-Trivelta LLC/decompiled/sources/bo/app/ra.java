package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class ra implements ReadWriteProperty {

    /* renamed from: a, reason: collision with root package name */
    public Object f25987a;

    public static final String a(Object obj, KProperty kProperty) {
        return "Cannot assign " + obj + " to only-set-once property " + kProperty.getName();
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f25987a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object thisRef, final KProperty property, final Object obj) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj2 = this.f25987a;
        if (obj2 == null) {
            this.f25987a = obj;
        } else {
            if (Intrinsics.areEqual(obj2, obj)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.sa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ra.a(obj, property);
                }
            }, 7, (Object) null);
        }
    }
}
