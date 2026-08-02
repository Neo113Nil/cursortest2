package e;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6229d extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6229d f61687b = new C6229d(0);

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
