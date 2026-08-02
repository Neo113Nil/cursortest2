package N9;

import N9.b;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class d extends b.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7968a;

    public d(Object obj) {
        this.f7968a = obj;
    }

    public static Object g(b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).f7968a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            int length = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 53);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        AbstractC3191o.m(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    public static b i(Object obj) {
        return new d(obj);
    }
}
