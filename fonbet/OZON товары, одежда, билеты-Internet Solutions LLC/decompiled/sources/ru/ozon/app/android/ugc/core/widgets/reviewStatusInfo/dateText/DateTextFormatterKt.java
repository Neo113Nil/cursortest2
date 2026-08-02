package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import Sc.r;
import Sc.s;
import android.text.SpannableStringBuilder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"", "timestamp", "dateFormat", "", "is24Hour", "Ljava/util/Locale;", "locale", "formatTimestamp", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Locale;)Ljava/lang/String;", "cleanForFormatting", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "formatted", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "replaceTimestamp", "(Ljava/lang/CharSequence;Ljava/lang/String;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "toDeviceClock", "(Ljava/lang/String;Z)Ljava/lang/String;", "Lkotlin/text/Regex;", "HOUR_TOKEN", "Lkotlin/text/Regex;", "AM_PM_TOKEN", "TIME_GROUP", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateTextFormatterKt {

    @NotNull
    private static final Regex HOUR_TOKEN = new Regex("[hHkK]+");

    @NotNull
    private static final Regex AM_PM_TOKEN = new Regex("\\s*a+\\s*");

    @NotNull
    private static final Regex TIME_GROUP = new Regex("h[hms:.\\s]*");

    private static final Locale cleanForFormatting(Locale locale) {
        Locale.Builder language = new Locale.Builder().setLanguage(locale.getLanguage());
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            language.setScript(locale.getScript());
        }
        Locale build = language.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r2 == null) goto L10;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String formatTimestamp(@NotNull String timestamp, String str, boolean z11, @NotNull Locale locale) {
        Object a11;
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            r.Companion companion = r.INSTANCE;
            if (str != null) {
                if (h.K(str)) {
                    str = null;
                }
            }
            str = "d MMMM, HH:mm";
            a11 = Instant.parse(timestamp).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(toDeviceClock(str, z11), cleanForFormatting(locale)));
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = "";
        }
        return (String) a11;
    }

    @NotNull
    public static final OzonSpannableString replaceTimestamp(CharSequence charSequence, @NotNull String formatted) {
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        if (charSequence == null) {
            return new OzonSpannableString();
        }
        int J11 = h.J(charSequence, "%timestamp%", 0, false, 6);
        if (J11 < 0) {
            return OzonSpannableStringKt.toOzonSpannableString(charSequence);
        }
        SpannableStringBuilder replace = new SpannableStringBuilder(charSequence).replace(J11, J11 + 11, (CharSequence) formatted);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return OzonSpannableStringKt.toOzonSpannableString(replace);
    }

    private static final String toDeviceClock(String str, boolean z11) {
        if (z11) {
            return h.z0(AM_PM_TOKEN.replace(HOUR_TOKEN.replace(str, "HH"), "")).toString();
        }
        if (h.u(str, 'a')) {
            return HOUR_TOKEN.replace(str, "h");
        }
        return TIME_GROUP.g(HOUR_TOKEN.replace(str, "h"), DateTextFormatterKt$toDeviceClock$1.INSTANCE);
    }
}
