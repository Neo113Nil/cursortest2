package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0018a8;
import io.appmetrica.analytics.impl.C0471s4;
import io.appmetrica.analytics.impl.C0498t6;
import io.appmetrica.analytics.impl.C0638yl;
import io.appmetrica.analytics.impl.InterfaceC0137eo;
import io.appmetrica.analytics.impl.J2;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Z7;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0498t6 f15263a = new C0498t6("appmetrica_birth_date", new C0018a8(), new C0638yl());

    public final UserProfileUpdate a(Calendar calendar, String str, J2 j22) {
        return new UserProfileUpdate(new Ym(this.f15263a.f14668c, new SimpleDateFormat(str).format(calendar.getTime()), new Z7(), new C0018a8(), j22));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withAge(int i5) {
        int i10 = Calendar.getInstance(Locale.US).get(1) - i5;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new C0471s4(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withAgeIfUndefined(int i5) {
        int i10 = Calendar.getInstance(Locale.US).get(1) - i5;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new Xk(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0471s4(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Xk(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withValueReset() {
        return new UserProfileUpdate<>(new Bi(0, this.f15263a.f14668c, new C0018a8(), new C0638yl()));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDate(int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        return a(gregorianCalendar, "yyyy", new C0471s4(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDateIfUndefined(int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        return a(gregorianCalendar, "yyyy", new Xk(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDate(int i5, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0471s4(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDateIfUndefined(int i5, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Xk(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDate(int i5, int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i11);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0471s4(this.f15263a.f14667b));
    }

    public UserProfileUpdate<? extends InterfaceC0137eo> withBirthDateIfUndefined(int i5, int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i11);
        return a(gregorianCalendar, "yyyy-MM-dd", new Xk(this.f15263a.f14667b));
    }
}
