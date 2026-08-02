package I8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {
    public static final String a(Date date, String dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat, Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    public static /* synthetic */ String b(Date date, String str, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            timeZone = TimeZone.getTimeZone("UTC");
            Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        }
        return a(date, str, timeZone);
    }
}
