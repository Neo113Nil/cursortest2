package ru.ozon.android.messenger.framework.data;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f87650a = Sc.k.b(a.f87653b);

    /* renamed from: b, reason: collision with root package name */
    private static ru.ozon.android.messenger.framework.core.initialization.di.c f87651b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f87652c = 0;

    static final class a extends AbstractC7737t implements Function0<SharedPreferences> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f87653b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            ru.ozon.android.messenger.framework.core.initialization.di.c a11 = q.a();
            Context h11 = a11 != null ? a11.h() : null;
            SharedPreferences sharedPreferences = h11 != null ? h11.getSharedPreferences("SHARED_PREFS_TEST_NAME", 0) : null;
            if (sharedPreferences == null) {
                Lm0.a.f17149a.w("Messenger component is null", new Object[0]);
            }
            return sharedPreferences;
        }
    }

    public static ru.ozon.android.messenger.framework.core.initialization.di.c a() {
        return f87651b;
    }

    @NotNull
    public static p b() {
        p valueOf;
        SharedPreferences sharedPreferences = (SharedPreferences) f87650a.getValue();
        String string = sharedPreferences != null ? sharedPreferences.getString("SHARED_PREFS_SOCKET_MODE_KEY", null) : null;
        return (string == null || (valueOf = p.valueOf(string)) == null) ? p.ORIGINAL : valueOf;
    }

    public static void c(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
        f87651b = cVar;
    }

    public static void d(@NotNull p value) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences sharedPreferences = (SharedPreferences) f87650a.getValue();
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString("SHARED_PREFS_SOCKET_MODE_KEY", value.name())) == null) {
            return;
        }
        putString.apply();
    }
}
