package x0;

import b1.InterfaceC5518u;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10587P extends AbstractC7737t implements Function2<InterfaceC5518u, C10586O, Map<String, ? extends List<? extends Object>>> {

    /* renamed from: b, reason: collision with root package name */
    public static final C10587P f104693b = new C10587P(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, ? extends List<? extends Object>> invoke(InterfaceC5518u interfaceC5518u, C10586O c10586o) {
        Map<String, List<Object>> d11 = c10586o.d();
        if (d11.isEmpty()) {
            return null;
        }
        return d11;
    }
}
