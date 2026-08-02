package k5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes8.dex */
final class o3 extends AbstractC7520h0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f70817a;

    o3(@NonNull Context context, String str) {
        this.f70817a = context.getSharedPreferences(str, 0);
    }

    @Override // k5.AbstractC7520h0
    protected final <T extends Serializable> H2<T> b(@NonNull Mm0.e eVar) {
        Serializable valueOf;
        Class<?> e11 = eVar.e();
        String b11 = eVar.b();
        SharedPreferences sharedPreferences = this.f70817a;
        if (!sharedPreferences.contains(b11)) {
            return null;
        }
        if (e11 == String.class) {
            valueOf = sharedPreferences.getString(eVar.b(), null);
        } else if (e11 == Integer.class) {
            valueOf = Integer.valueOf(sharedPreferences.getInt(eVar.b(), -1));
        } else if (e11 == Long.class) {
            valueOf = Long.valueOf(sharedPreferences.getLong(eVar.b(), -1L));
        } else if (e11 == Boolean.class) {
            valueOf = Boolean.valueOf(sharedPreferences.getBoolean(eVar.b(), false));
        } else {
            if (e11 != Float.class) {
                throw new Mm0.a("unknown value class for SharedPreferencesCacheStore: " + e11.getCanonicalName());
            }
            valueOf = Float.valueOf(sharedPreferences.getFloat(eVar.b(), -1.0f));
        }
        long j11 = sharedPreferences.getLong(eVar.b() + "_time", 0L);
        Objects.requireNonNull(valueOf);
        return new H2<>(valueOf, j11);
    }

    @Override // k5.AbstractC7520h0
    protected final <T extends Serializable> void d(@NonNull Mm0.e eVar, H2<T> h22) {
        SharedPreferences sharedPreferences = this.f70817a;
        if (h22 == null) {
            sharedPreferences.edit().remove(eVar.b()).apply();
            return;
        }
        Class<?> e11 = eVar.e();
        if (e11 == String.class) {
            sharedPreferences.edit().putString(eVar.b(), (String) h22.a()).apply();
        } else if (e11 == Integer.class) {
            sharedPreferences.edit().putInt(eVar.b(), ((Integer) h22.a()).intValue()).apply();
        } else if (e11 == Long.class) {
            sharedPreferences.edit().putLong(eVar.b(), ((Long) h22.a()).longValue()).apply();
        } else if (e11 == Boolean.class) {
            sharedPreferences.edit().putBoolean(eVar.b(), ((Boolean) h22.a()).booleanValue()).apply();
        } else if (e11 == Float.class) {
            sharedPreferences.edit().putFloat(eVar.b(), ((Float) h22.a()).floatValue()).apply();
        }
        sharedPreferences.edit().putLong(eVar.b() + "_time", h22.b()).apply();
    }
}
