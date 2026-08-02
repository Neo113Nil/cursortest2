package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.UUID;
import n8.C8451a;

@KeepForSdk
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final C8451a<?> f60047b;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f60048a;

    static {
        C8451a.C1292a a11 = C8451a.a(m.class);
        a11.b(n8.n.i(h.class));
        a11.b(n8.n.i(Context.class));
        a11.f(new S8.d(1));
        f60047b = a11.d();
    }

    public m(@NonNull Context context) {
        this.f60048a = context;
    }

    @NonNull
    @KeepForSdk
    public final synchronized String a() {
        String string = this.f60048a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f60048a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    @KeepForSdk
    public final synchronized long b() {
        return this.f60048a.getSharedPreferences("com.google.mlkit.internal", 0).getLong("downloading_begin_time_" + U8.b.a(), 0L);
    }

    @KeepForSdk
    public final synchronized long c() {
        return this.f60048a.getSharedPreferences("com.google.mlkit.internal", 0).getLong("model_first_use_time_" + U8.b.a(), 0L);
    }

    @KeepForSdk
    public final synchronized void d(long j11) {
        this.f60048a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putLong("model_first_use_time_" + U8.b.a(), j11).apply();
    }
}
