package s90;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import s90.InterfaceC9636e;

/* renamed from: s90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9634c implements InterfaceC9636e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f98387a;

    public C9634c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98387a = context;
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final String a() {
        return "android.permission.CAMERA";
    }

    @Override // s90.InterfaceC9636e
    public final int b() {
        return R.string.fintech_camera_permission_description;
    }

    @Override // s90.InterfaceC9636e
    public final int c() {
        return R.string.fintech_request_permission_settings_description;
    }

    @Override // s90.InterfaceC9636e
    public final int d() {
        return R.string.fintech_camera_permission_title;
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
        return this.f98387a;
    }
}
