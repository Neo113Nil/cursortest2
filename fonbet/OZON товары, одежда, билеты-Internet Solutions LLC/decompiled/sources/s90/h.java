package s90;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import s90.InterfaceC9636e;

/* loaded from: classes3.dex */
public final class h implements InterfaceC9636e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f98395a;

    public h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98395a = context;
    }

    @Override // s90.InterfaceC9636e
    @NotNull
    public final String a() {
        return "android.permission.RECORD_AUDIO";
    }

    @Override // s90.InterfaceC9636e
    public final int b() {
        return R.string.fintech_permission_record_audio_state_description;
    }

    @Override // s90.InterfaceC9636e
    public final int c() {
        return R.string.fintech_request_permission_settings_description;
    }

    @Override // s90.InterfaceC9636e
    public final int d() {
        return R.string.fintech_permission_record_audio_state_title;
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
        return this.f98395a;
    }
}
