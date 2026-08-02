package dc0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: dc0.D, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6140D extends AbstractC7737t implements Function0<ExecutorService> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6140D f61470b = new C6140D(0);

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return Executors.newSingleThreadExecutor();
    }
}
