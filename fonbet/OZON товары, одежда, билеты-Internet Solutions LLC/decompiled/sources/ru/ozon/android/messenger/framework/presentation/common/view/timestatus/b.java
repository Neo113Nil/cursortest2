package ru.ozon.android.messenger.framework.presentation.common.view.timestatus;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.z;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91288a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91289b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final z f91290c;

    /* renamed from: d, reason: collision with root package name */
    private final int f91291d;

    /* renamed from: e, reason: collision with root package name */
    private final int f91292e;

    /* renamed from: f, reason: collision with root package name */
    private final int f91293f;

    public b(@NotNull String time, String str, @NotNull z status, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f91288a = time;
        this.f91289b = str;
        this.f91290c = status;
        this.f91291d = i11;
        this.f91292e = i12;
        this.f91293f = i13;
    }

    public final void a(@NotNull a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.c(this.f91288a, this.f91289b);
        view.a(this.f91291d);
        view.b(this.f91290c, this.f91292e);
        view.d(this.f91293f);
    }
}
