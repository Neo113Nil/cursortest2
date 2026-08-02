package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.a70;
import defpackage.xka;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class BuiltInsLoader$Companion$Instance$2 extends xka implements Function0<BuiltInsLoader> {
    public static final BuiltInsLoader$Companion$Instance$2 INSTANCE = new BuiltInsLoader$Companion$Instance$2();

    public BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final BuiltInsLoader invoke() {
        ServiceLoader load = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
        load.getClass();
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.Z(load);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        a70.r("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        return null;
    }
}
