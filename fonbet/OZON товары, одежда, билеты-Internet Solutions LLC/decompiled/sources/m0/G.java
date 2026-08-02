package m0;

import J0.C3354v2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C8025y f73530a = new C8025y(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8025y f73531b = new C8025y(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C3354v2 f73532c;

    static {
        new C8025y(0.4f, 0.0f, 1.0f, 1.0f);
        f73532c = new C3354v2();
    }

    @NotNull
    public static final C8025y a() {
        return f73530a;
    }

    @NotNull
    public static final C3354v2 b() {
        return f73532c;
    }

    @NotNull
    public static final C8025y c() {
        return f73531b;
    }
}
