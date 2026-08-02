package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ironsource.U3;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class JvmDescriptorTypeWriter<T> {

    @Nullable
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;

    @NotNull
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(@NotNull T t) {
        t.getClass();
        writeJvmTypeAsIs(t);
    }

    public final void writeJvmTypeAsIs(@NotNull T t) {
        t.getClass();
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                t = this.jvmTypeFactory.createFromString(c.q(this.jvmCurrentTypeArrayLevel, U3.j.d) + this.jvmTypeFactory.toString(t));
            }
            this.jvmCurrentType = t;
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T t) {
        name.getClass();
        t.getClass();
        writeJvmTypeAsIs(t);
    }

    public void writeArrayEnd() {
    }
}
