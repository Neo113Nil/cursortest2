package u60;

import U50.b;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.push.GetJwt;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.push.SetJwt;

/* renamed from: u60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9977a implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final GetJwt f100345a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SetJwt f100346b;

    public C9977a(@NotNull GetJwt getJwt, @NotNull SetJwt setJwt) {
        Intrinsics.checkNotNullParameter(getJwt, "getJwt");
        Intrinsics.checkNotNullParameter(setJwt, "setJwt");
        this.f100345a = getJwt;
        this.f100346b = setJwt;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return C7714v.b0(this.f100345a, this.f100346b);
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "push";
    }
}
