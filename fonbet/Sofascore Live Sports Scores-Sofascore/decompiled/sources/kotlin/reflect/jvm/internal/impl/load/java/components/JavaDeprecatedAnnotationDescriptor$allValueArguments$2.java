package kotlin.reflect.jvm.internal.impl.load.java.components;

import defpackage.sub;
import defpackage.xka;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JavaDeprecatedAnnotationDescriptor$allValueArguments$2 extends xka implements Function0<Map<Name, ? extends StringValue>> {
    public static final JavaDeprecatedAnnotationDescriptor$allValueArguments$2 INSTANCE = new JavaDeprecatedAnnotationDescriptor$allValueArguments$2();

    public JavaDeprecatedAnnotationDescriptor$allValueArguments$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<Name, StringValue> invoke() {
        return sub.d(new Pair(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
    }
}
