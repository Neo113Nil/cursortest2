package kotlin.reflect;

import defpackage.ot8;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends ot8 implements Function1<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Type type) {
        String typeToString;
        type.getClass();
        typeToString = TypesJVMKt.typeToString(type);
        return typeToString;
    }
}
