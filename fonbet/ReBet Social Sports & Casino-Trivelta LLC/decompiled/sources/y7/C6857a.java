package y7;

import C7.C1056u;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6857a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6857a f68287a = new C6857a();

    public static final C1056u.a a(Context context, OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return C1056u.f1319M.i(context).T(new b(okHttpClient));
    }
}
