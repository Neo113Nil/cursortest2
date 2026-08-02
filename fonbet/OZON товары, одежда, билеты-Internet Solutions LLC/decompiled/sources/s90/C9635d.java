package s90;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import s90.InterfaceC9636e;

/* renamed from: s90.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9635d implements InterfaceC9636e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f98388a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f98389b;

    /* renamed from: c, reason: collision with root package name */
    private final int f98390c;

    /* renamed from: d, reason: collision with root package name */
    private final int f98391d;

    /* renamed from: e, reason: collision with root package name */
    private final int f98392e;

    public C9635d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98388a = context;
        this.f98389b = Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 33;
        this.f98390c = R.string.fintech_post_notifications_request_permission_title;
        this.f98391d = R.string.fintech_post_notifications_request_permission_description;
        this.f98392e = R.string.fintech_post_notifications_request_permission_settings_description;
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final String a() {
        return "android.permission.POST_NOTIFICATIONS";
    }

    @Override // s90.InterfaceC9636e
    public final int b() {
        return this.f98391d;
    }

    @Override // s90.InterfaceC9636e
    public final int c() {
        return this.f98392e;
    }

    @Override // s90.InterfaceC9636e
    public final int d() {
        return this.f98390c;
    }

    @Override // s90.InterfaceC9636e
    public final boolean e() {
        return this.f98389b;
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final Intent f() {
        return InterfaceC9636e.a.a(this);
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final Context getContext() {
        return this.f98388a;
    }
}
