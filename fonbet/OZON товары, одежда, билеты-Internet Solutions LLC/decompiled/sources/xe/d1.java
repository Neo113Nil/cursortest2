package xe;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient B0 f105447a;

    public d1(@NotNull String str, B0 b02) {
        super(str);
        this.f105447a = b02;
    }
}
