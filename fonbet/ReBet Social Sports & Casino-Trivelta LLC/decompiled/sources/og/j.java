package og;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import android.text.format.Formatter;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class j {
    public static final String a(long j10) {
        return c(j10, null, null, 3, null);
    }

    public static final String b(long j10, String _24HrsFormat, String _12HrsFormat) {
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(_24HrsFormat, "_24HrsFormat");
        Intrinsics.checkNotNullParameter(_12HrsFormat, "_12HrsFormat");
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        String string = (e10 == null || (contentResolver = e10.getContentResolver()) == null) ? null : Settings.System.getString(contentResolver, "time_12_24");
        if (string == null) {
            string = "12";
        }
        if (Intrinsics.areEqual(string, "12")) {
            _24HrsFormat = _12HrsFormat;
        }
        String languageOrNull = LiveChatUtil.getLanguageOrNull();
        if (!i.f(languageOrNull)) {
            languageOrNull = null;
        }
        String format = new SimpleDateFormat(_24HrsFormat, languageOrNull != null ? new Locale(languageOrNull) : Locale.getDefault()).format(Long.valueOf(j10));
        if (format == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = format.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ String c(long j10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "HH:mm";
        }
        if ((i10 & 2) != 0) {
            str2 = "hh:mm aa";
        }
        return b(j10, str, str2);
    }

    public static final String d(long j10) {
        String formatShortFileSize = Formatter.formatShortFileSize(MobilistenInitProvider.INSTANCE.e(), j10);
        Intrinsics.checkNotNullExpressionValue(formatShortFileSize, "formatShortFileSize(...)");
        String upperCase = formatShortFileSize.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
