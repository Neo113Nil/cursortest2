package t20;

import Sc.r;
import Sc.s;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.collections.K;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {
    private static List a(String str) {
        Object a11;
        ClassLoader classLoader = f.class.getClassLoader();
        try {
            r.Companion companion = r.INSTANCE;
            Class<?> loadClass = classLoader != null ? classLoader.loadClass("ru.ozon.export.dependencies.OzonExportDependencies") : null;
            a11 = loadClass != null ? loadClass.getDeclaredField(str) : null;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        Field field = (Field) a11;
        if (field == null) {
            return K.f71697a;
        }
        field.setAccessible(true);
        Object obj = field.get(null);
        List list = obj instanceof List ? (List) obj : null;
        return list == null ? K.f71697a : list;
    }

    @NotNull
    public static List b() {
        return a(DevicePublicKeyStringDef.DIRECT);
    }

    @NotNull
    public static List c() {
        return a("transitive");
    }
}
