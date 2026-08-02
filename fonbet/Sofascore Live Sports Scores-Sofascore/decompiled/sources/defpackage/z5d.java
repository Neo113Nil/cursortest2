package defpackage;

import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z5d {
    public b8d a;
    public boolean b;
    public Object c;
    public boolean d;
    public boolean e;

    public final a6d a() {
        b8d b8dVar = this.a;
        if (b8dVar == null) {
            Object obj = this.c;
            b8d b8dVar2 = obj instanceof Integer ? b8d.b : obj instanceof int[] ? b8d.d : obj instanceof Long ? b8d.f : obj instanceof long[] ? b8d.g : obj instanceof Float ? b8d.i : obj instanceof float[] ? b8d.j : obj instanceof Boolean ? b8d.l : obj instanceof boolean[] ? b8d.m : ((obj instanceof String) || obj == null) ? b8d.o : null;
            if (b8dVar2 == null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    b8dVar = b8d.p;
                } else {
                    obj.getClass();
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            componentType2.getClass();
                            b8dVar2 = new x7d(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        componentType3.getClass();
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            componentType4.getClass();
                            b8dVar2 = new z7d(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        b8dVar2 = new y7d(obj.getClass());
                    } else if (obj instanceof Enum) {
                        b8dVar2 = new w7d(obj.getClass());
                    } else {
                        if (!(obj instanceof Serializable)) {
                            sw9.t(obj.getClass().getName(), " is not supported for navigation arguments.", "Object of type ");
                            return null;
                        }
                        b8dVar2 = new a8d(obj.getClass());
                    }
                }
            }
            b8dVar = b8dVar2;
        }
        return new a6d(b8dVar, this.b, this.c, this.d, this.e);
    }
}
