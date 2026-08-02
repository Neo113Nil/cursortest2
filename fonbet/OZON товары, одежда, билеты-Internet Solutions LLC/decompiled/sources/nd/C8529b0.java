package nd;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* renamed from: nd.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8529b0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f76951a = C8527a0.f76949a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Number) this.f76951a.invoke(obj, obj2)).intValue();
    }
}
