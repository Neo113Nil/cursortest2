package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.plaid.internal.C3556a6;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f39455a = new a();

    public static final class a {
        @Nullable
        public final synchronized String a(@NotNull Application application) {
            String string;
            try {
                Intrinsics.checkNotNullParameter(application, "application");
                SharedPreferences sharedPreferences = application.getSharedPreferences("link_persistent_uuid", 0);
                string = sharedPreferences.getString("link_persistent_uuid", "");
                if (string != null && string.length() != 0) {
                    C3556a6.a.a(C3556a6.f39823a, "Reusing existing persistent link id: " + string);
                }
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sharedPreferences.edit().putString("link_persistent_uuid", string).apply();
                C3556a6.a.a(C3556a6.f39823a, "Creating new persistent link id: " + string);
            } catch (Throwable th2) {
                throw th2;
            }
            return string;
        }
    }
}
