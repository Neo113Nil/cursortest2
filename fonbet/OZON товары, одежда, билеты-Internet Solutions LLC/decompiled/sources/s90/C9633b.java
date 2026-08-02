package s90;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import s90.InterfaceC9636e;

/* renamed from: s90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9633b implements InterfaceC9636e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f98386a;

    public C9633b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98386a = context;
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final String a() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    @Override // s90.InterfaceC9636e
    public final int b() {
        return R.string.fintech_webbank_permission_location_description;
    }

    @Override // s90.InterfaceC9636e
    public final int c() {
        return R.string.fintech_request_permission_settings_description;
    }

    @Override // s90.InterfaceC9636e
    public final int d() {
        return R.string.fintech_webbank_permission_location_title;
    }

    @Override // s90.InterfaceC9636e
    public final boolean e() {
        return true;
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final Intent f() {
        return InterfaceC9636e.a.a(this);
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final Context getContext() {
        return this.f98386a;
    }
}
