package y1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 extends p0 {

    /* renamed from: s, reason: collision with root package name */
    public final Class f25590s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Class type) {
        super(0, type);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isEnum()) {
            this.f25590s = type;
            return;
        }
        throw new IllegalArgumentException((type + " is not an Enum type.").toString());
    }

    @Override // y1.p0, y1.q0
    public final String b() {
        String name = this.f25590s.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // y1.p0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String value) {
        Object obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Class cls = this.f25590s;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i5];
            if (kotlin.text.z.j(((Enum) obj).name(), value, true)) {
                break;
            }
            i5++;
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder p10 = d9.e.p("Enum value ", value, " not found for type ");
        p10.append(cls.getName());
        p10.append('.');
        throw new IllegalArgumentException(p10.toString());
    }
}
