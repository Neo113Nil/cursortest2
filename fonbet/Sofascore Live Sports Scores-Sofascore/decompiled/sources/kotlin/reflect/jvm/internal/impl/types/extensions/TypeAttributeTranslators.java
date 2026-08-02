package kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeAttributeTranslators {

    @NotNull
    private final List<TypeAttributeTranslator> translators;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeAttributeTranslators(@NotNull List<? extends TypeAttributeTranslator> list) {
        list.getClass();
        this.translators = list;
    }

    @NotNull
    public final List<TypeAttributeTranslator> getTranslators() {
        return this.translators;
    }
}
