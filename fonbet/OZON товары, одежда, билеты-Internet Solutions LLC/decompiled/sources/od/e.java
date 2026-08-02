package od;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f78043a = new e();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String obj2;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj2 = Arrays.toString((boolean[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof char[]) {
            obj2 = Arrays.toString((char[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof byte[]) {
            obj2 = Arrays.toString((byte[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof short[]) {
            obj2 = Arrays.toString((short[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof int[]) {
            obj2 = Arrays.toString((int[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof float[]) {
            obj2 = Arrays.toString((float[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof long[]) {
            obj2 = Arrays.toString((long[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof double[]) {
            obj2 = Arrays.toString((double[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else if (value instanceof Object[]) {
            obj2 = Arrays.toString((Object[]) value);
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        } else {
            obj2 = value.toString();
        }
        return str + '=' + obj2;
    }
}
