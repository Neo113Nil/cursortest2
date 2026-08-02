package wb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: wb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10468a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f103729a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f103730b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f103731c;

    public C10468a(@NotNull String packageName, @NotNull String pubKey, boolean z11) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        this.f103729a = packageName;
        this.f103730b = pubKey;
        this.f103731c = z11;
    }

    @NotNull
    public final String a() {
        return this.f103729a;
    }

    @NotNull
    public final String b() {
        return this.f103730b;
    }

    public final boolean c() {
        return this.f103731c;
    }
}
