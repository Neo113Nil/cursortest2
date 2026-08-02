package od;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: od.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8694b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f78035a;

    public C8694b(Map map) {
        this.f78035a = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = 0;
        for (Map.Entry entry : this.f78035a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            i11 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return Integer.valueOf(i11);
    }
}
