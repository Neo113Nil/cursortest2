package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mp5 implements Serializable {

    @NotNull
    private static final lp5 b = new lp5(null);
    public final Class a;

    public mp5(Enum[] enumArr) {
        enumArr.getClass();
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        enumConstants.getClass();
        return new kp5((Enum[]) enumConstants);
    }
}
