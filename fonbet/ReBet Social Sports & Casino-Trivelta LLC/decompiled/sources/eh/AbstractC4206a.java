package eh;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4206a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f46030a = TimeZone.getTimeZone("GMT");

    public static final C4207b a(Long l10) {
        Calendar calendar = Calendar.getInstance(f46030a, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        return c(calendar, l10);
    }

    public static /* synthetic */ C4207b b(Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return a(l10);
    }

    public static final C4207b c(Calendar calendar, Long l10) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return new C4207b(calendar.get(13), calendar.get(12), calendar.get(11), EnumC4209d.f46056b.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), EnumC4208c.f46042b.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + calendar.get(15) + calendar.get(16));
    }
}
