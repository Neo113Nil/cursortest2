package kotlin.reflect.jvm.internal.calls;

import defpackage.xka;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 extends xka implements Function0<String> {
    final /* synthetic */ Class<T> $annotationClass;
    final /* synthetic */ Map<String, Object> $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(Class<T> cls, Map<String, ? extends Object> map) {
        super(0);
        this.$annotationClass = cls;
        this.$values = map;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        Class<T> cls = this.$annotationClass;
        Map<String, Object> map = this.$values;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        CollectionsKt.e0(map.entrySet(), sb, ", ", "(", ")", AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1.INSTANCE, 48);
        return sb.toString();
    }
}
