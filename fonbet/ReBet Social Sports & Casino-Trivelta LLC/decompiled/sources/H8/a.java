package H8;

import I8.b;
import I8.c;
import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0102a f4872b = new C0102a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4873a;

    /* renamed from: H8.a$a, reason: collision with other inner class name */
    public static final class C0102a {
        public /* synthetic */ C0102a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0102a() {
        }
    }

    public a(String cachePrefix) {
        Intrinsics.checkNotNullParameter(cachePrefix, "cachePrefix");
        this.f4873a = cachePrefix;
    }

    public final String a(String str) {
        return E8.a.f3012a.f().getString(this.f4873a + str, null);
    }

    public final String b() {
        String a10 = a("KEY_SESSION_UUID");
        if (a10 == null || a10.length() == 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            a10 = uuid.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(a10, "toUpperCase(...)");
            d("KEY_SESSION_UUID", a10);
        }
        Date date = Calendar.getInstance().getTime();
        Intrinsics.checkNotNullExpressionValue(date, "date");
        String b10 = b.b(date, "dd.MM.yyyy", null, 2, null);
        String lowerCase = c.f5493a.b(b10 + a10).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String c() {
        return StringsKt.take(b(), 32);
    }

    public final void d(String str, String str2) {
        SharedPreferences.Editor edit = E8.a.f3012a.f().edit();
        if (edit != null) {
            SharedPreferences.Editor putString = edit.putString(this.f4873a + str, str2);
            if (putString != null) {
                putString.apply();
            }
        }
    }
}
