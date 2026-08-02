package com.google.android.play.core.appupdate;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.n1;
import b6.p;
import com.google.android.gms.internal.measurement.h4;
import com.sports.insider.R;
import d4.r;
import gf.c0;
import gf.d0;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.ILogger;
import io.sentry.b5;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import p1.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static f f5994a;

    public static ConcurrentHashMap A(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static io.sentry.util.network.b B(String str, String str2, boolean z5, ILogger iLogger) {
        List singletonList;
        if (str.isEmpty()) {
            return null;
        }
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                try {
                    HashMap hashMap = new HashMap();
                    for (String str3 : str.split("&", -1)) {
                        int indexOf = str3.indexOf("=");
                        if (indexOf > 0) {
                            String decode = URLDecoder.decode(str3.substring(0, indexOf), "UTF-8");
                            String decode2 = indexOf < str3.length() + (-1) ? URLDecoder.decode(str3.substring(indexOf + 1), "UTF-8") : "";
                            if (hashMap.containsKey(decode)) {
                                Object obj = hashMap.get(decode);
                                if (obj instanceof List) {
                                    ((List) obj).add(decode2);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) obj);
                                    arrayList.add(decode2);
                                    hashMap.put(decode, arrayList);
                                }
                            } else {
                                hashMap.put(decode, decode2);
                            }
                        }
                    }
                    return new io.sentry.util.network.b(0, hashMap, z5 ? Collections.singletonList(io.sentry.util.network.a.TEXT_TRUNCATED) : null);
                } catch (UnsupportedEncodingException e7) {
                    if (iLogger != null) {
                        iLogger.h(b5.WARNING, "Failed to parse form data: " + e7.getMessage(), new Object[0]);
                    }
                    return new io.sentry.util.network.b(0, r1, Collections.singletonList(io.sentry.util.network.a.BODY_PARSE_ERROR));
                }
            }
            if (lowerCase.contains("application/json")) {
                try {
                    io.sentry.vendor.gson.stream.a aVar = new io.sentry.vendor.gson.stream.a(new StringReader(str));
                    try {
                        i2.d dVar = new i2.d((byte) 0, 11);
                        io.sentry.util.network.d dVar2 = (io.sentry.util.network.d) dVar.f10882b;
                        Serializable A = dVar.A(aVar, 0);
                        if (A == null && !z5 && !dVar2.f17180b && !dVar2.f17179a) {
                            io.sentry.util.network.b bVar = new io.sentry.util.network.b(0, r1, r1);
                            aVar.close();
                            return bVar;
                        }
                        if (!z5 && !dVar2.f17179a) {
                            singletonList = dVar2.f17180b ? Collections.singletonList(io.sentry.util.network.a.INVALID_JSON) : null;
                            io.sentry.util.network.b bVar2 = new io.sentry.util.network.b(0, A, singletonList);
                            aVar.close();
                            return bVar2;
                        }
                        singletonList = Collections.singletonList(io.sentry.util.network.a.JSON_TRUNCATED);
                        io.sentry.util.network.b bVar22 = new io.sentry.util.network.b(0, A, singletonList);
                        aVar.close();
                        return bVar22;
                    } finally {
                    }
                } catch (Exception e9) {
                    if (iLogger != null) {
                        iLogger.h(b5.WARNING, "Failed to parse JSON: " + e9.getMessage(), new Object[0]);
                    }
                    return new io.sentry.util.network.b(0, r1, Collections.singletonList(io.sentry.util.network.a.INVALID_JSON));
                }
            }
        }
        return new io.sentry.util.network.b(0, str, z5 ? Collections.singletonList(io.sentry.util.network.a.TEXT_TRUNCATED) : null);
    }

    public static final void C(Path path, hf.e eVar) {
        path.rewind();
        int a7 = eVar.a();
        boolean z5 = true;
        for (int i5 = 0; i5 < a7; i5++) {
            p1.c cVar = (p1.c) eVar.get(i5);
            if (z5) {
                float[] fArr = cVar.f21410a;
                path.moveTo(fArr[0], fArr[1]);
                z5 = false;
            }
            float[] fArr2 = cVar.f21410a;
            path.cubicTo(fArr2[2], fArr2[3], fArr2[4], fArr2[5], cVar.a(), cVar.b());
        }
        path.close();
    }

    public static final boolean D(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    public static void E(TextView textView, int i5) {
        rh.g.d(i5);
        if (Build.VERSION.SDK_INT >= 28) {
            androidx.core.view.k.q(textView, i5);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i5 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i5 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void F(TextView textView, int i5) {
        rh.g.d(i5);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i5 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i5 - i10);
        }
    }

    public static void G(TextView textView, int i5) {
        rh.g.d(i5);
        if (i5 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i5 - r0, 1.0f);
        }
    }

    public static final o H(o oVar, Matrix matrix) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        io.sentry.util.network.b f6 = new io.sentry.util.network.b(9, new float[2], matrix);
        oVar.getClass();
        Intrinsics.checkNotNullParameter(f6, "f");
        long c02 = ci.c.c0(s.g.a(oVar.f21440b, oVar.f21441c), f6);
        hf.e b10 = t.b();
        List list = oVar.f21439a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            b10.add(((p1.g) list.get(i5)).a(f6));
        }
        return new o(t.a(b10), ci.c.y(c02), ci.c.z(c02));
    }

    public static ActionMode.Callback I(ActionMode.Callback callback) {
        return (!(callback instanceof androidx.core.widget.j) || Build.VERSION.SDK_INT < 26) ? callback : ((androidx.core.widget.j) callback).f1474a;
    }

    public static ActionMode.Callback J(ActionMode.Callback callback, TextView textView) {
        int i5 = Build.VERSION.SDK_INT;
        return (i5 < 26 || i5 > 27 || (callback instanceof androidx.core.widget.j) || callback == null) ? callback : new androidx.core.widget.j(callback, textView);
    }

    public static kh.g a(File file) {
        File file2 = new File(file, "sessions");
        File file3 = new File(file, "trash");
        ci.c.q(file2);
        ci.c.q(file3);
        kh.g gVar = new kh.g(file2, file3);
        File file4 = (File) gVar.f19116c;
        if (p.f3077f == null) {
            ScheduledExecutorService a7 = aa.j.a("lr-trash-cleaner");
            p pVar = new p();
            pVar.f3079b = new ba.d("trash-cleaner");
            pVar.f3078a = 0;
            pVar.f3080c = file4;
            pVar.f3081d = new aa.g(a7, new aa.c(1, pVar), new aa.d(pVar), AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            p.f3077f = pVar;
        }
        p pVar2 = p.f3077f;
        ((ba.d) pVar2.f3079b).a("Starting cleaner.");
        ((aa.g) pVar2.f3081d).c();
        gVar.k(104857600L, 0.15d);
        return new kh.g(gVar);
    }

    public static y1.a b() {
        return new y1.a(R.id.action_global_allPredictionsFragment);
    }

    public static IOException c(File file, IOException iOException) {
        StringBuilder sb2 = new StringBuilder("Inoperable file:");
        try {
            sb2.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb2.append(" failed to attach additional metadata");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return new IOException(sb3, iOException);
    }

    public static IOException d(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? c(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? c(file, iOException) : c(file, iOException) : parentFile.canWrite() ? c(file, iOException) : c(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? c(file, iOException) : c(file, iOException) : parentFile.canWrite() ? c(file, iOException) : c(file, iOException) : c(file, iOException);
    }

    public static float e(float f6, float f10, float f11) {
        return f6 < f10 ? f10 : f6 > f11 ? f11 : f6;
    }

    public static int f(int i5, int i10, int i11) {
        return i5 < i10 ? i10 : i5 > i11 ? i11 : i5;
    }

    public static final void g(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                gf.d.a(th2, th3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final okio.Path h(FileSystem fileSystem) {
        okio.Path resolve;
        do {
            okio.Path path = FileSystem.SYSTEM_TEMPORARY_DIRECTORY;
            StringBuilder sb2 = new StringBuilder("tmp_");
            xf.d dVar = xf.e.f25465a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            dVar.getClass();
            long nextLong = xf.e.f25466b.a().nextLong();
            c0 c0Var = d0.f10017b;
            sb2.append((Object) io.sentry.config.a.D(10, nextLong));
            resolve = path.resolve(sb2.toString());
        } while (fileSystem.exists(resolve));
        fileSystem.sink(resolve, true).close();
        return resolve;
    }

    public static final void i(FileSystem fileSystem, okio.Path path) {
        try {
            IOException iOException = null;
            for (okio.Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        i(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (IOException e7) {
                    if (iOException == null) {
                        iOException = e7;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static String j(String str) {
        int hashCode = str.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && str.equals("tr")) ? "abonelik nasıl iptal edilir" : "how to cancel the subscription" : !str.equals("ru") ? "how to cancel the subscription" : "как отменить подписку" : !str.equals("pt") ? "how to cancel the subscription" : "como cancelar a subscrição" : !str.equals("fr") ? "how to cancel the subscription" : "comment annuler un abonnement" : !str.equals("es") ? "how to cancel the subscription" : "cómo cancelar la suscripción" : !str.equals("de") ? "how to cancel the subscription" : "wie man das Abonnement kündigt";
    }

    public static BigDecimal k(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static final nf.b l(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new nf.b(entries);
    }

    public static io.sentry.util.network.b m(byte[] bArr, String str, String str2, ILogger iLogger) {
        Object obj = null;
        if (bArr.length == 0) {
            return null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip")) {
                return new io.sentry.util.network.b(0, "[Binary data, " + bArr.length + " bytes, type: " + str + "]", obj);
            }
        }
        try {
            return B(new String(bArr, 0, Math.min(bArr.length, 153600), str2), str, bArr.length > 153600, iLogger);
        } catch (UnsupportedEncodingException e7) {
            iLogger.h(b5.WARNING, "Failed to decode bytes: " + e7.getMessage(), new Object[0]);
            return new io.sentry.util.network.b(0, r4.k.n(new StringBuilder("[Failed to decode bytes, "), bArr.length, " bytes]"), Collections.singletonList(io.sentry.util.network.a.BODY_PARSE_ERROR));
        }
    }

    public static Date n() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f17202a).getTime();
    }

    public static Date o(long j) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f17202a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    public static Date p(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(c1.m("timestamp is not ISO format ", str));
        }
    }

    public static Date q(String str) {
        try {
            return o(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(c1.m("timestamp is not millis format ", str));
        }
    }

    public static void r(g8.b bVar) {
        boolean z5 = false;
        if (!bVar.isDone()) {
            throw new IllegalStateException(w("Future was expected to be done: %s", bVar));
        }
        while (true) {
            try {
                bVar.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public static String s(View view) {
        int id2 = view.getId();
        if (id2 <= -1) {
            return "";
        }
        try {
            String[] split = view.getResources().getResourceName(id2).split(":id/");
            return split.length == 2 ? split[1] : "";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public static o0.c t(n1 n1Var) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            return new o0.c(androidx.core.view.k.n(n1Var));
        }
        TextPaint textPaint = new TextPaint(n1Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = n1Var.getBreakStrategy();
        int hyphenationFrequency = n1Var.getHyphenationFrequency();
        if (n1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i5 < 28 || (n1Var.getInputType() & 15) != 3) {
                boolean z5 = n1Var.getLayoutDirection() == 1;
                switch (n1Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z5) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(androidx.core.view.k.d(h4.e(n1Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new o0.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static String u(Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.f17202a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(23 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb2, gregorianCalendar.get(14), 3);
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i5 = offset / 60000;
            int abs = Math.abs(i5 / 60);
            int abs2 = Math.abs(i5 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb2, abs, 2);
            sb2.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public static final void v(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException(c1.n("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static String w(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i5 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e7) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb4);
                    logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e7);
                    String name2 = e7.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + String.valueOf(sb4).length() + 9);
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb6 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i5 < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb6.append((CharSequence) str, i11, indexOf);
            sb6.append(objArr[i5]);
            i11 = indexOf + 2;
            i5++;
        }
        sb6.append((CharSequence) str, i11, str.length());
        if (i5 < objArr.length) {
            sb6.append(" [");
            sb6.append(objArr[i5]);
            for (int i12 = i5 + 1; i12 < objArr.length; i12++) {
                sb6.append(", ");
                sb6.append(objArr[i12]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static Bundle x(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String k6;
        Intrinsics.checkNotNullParameter("Text", "txtKey");
        Intrinsics.checkNotNullParameter("cancelSubs", "cancelKey");
        Bundle bundle = new Bundle();
        String str8 = gc.d.f9945a;
        String c2 = d2.i.c();
        String j = j(c2);
        if (str == null) {
            str = "$";
        }
        int hashCode = c2.hashCode();
        if (hashCode == 3201) {
            if (c2.equals("de")) {
                str2 = ".\n• Nach der Bestätigung erhält der Benutzer Zugriff auf alle Live-Vorhersagen, die nach der Bestätigung veröffentlicht werden.\n• Das Abonnement kann jederzeit und auch vor Ablauf des kostenlosen Zeitraums gekündigt werden. Der Benutzer kann seine Abonnements in seinem Google Play-Konto im Abschnitt „Abonnements“ verwalten (";
                str3 = ").\n• Die Abonnementgebühr wird alle 30 Tage automatisch vom Konto des Benutzers abgebucht, sofern der Benutzer nicht kündigt (";
                str4 = "• Das Abonnement wird nach der Bestätigung dieses Abonnements wirksam.\n• Die Kosten des Abonnements betragen ";
                k6 = d9.e.l(r4.k.q(str4, str, str2, j, str3), j, ").");
            }
            str7 = "\n• Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (";
            str6 = ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels (";
            str5 = "• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ";
            k6 = d9.e.k(r4.k.q(str5, str, str7, j, str6), j, ')');
        } else if (hashCode == 3246) {
            if (c2.equals("es")) {
                str2 = ".\n• Una vez confirmada, el usuario tendrá acceso a todas las predicciones en vivo que se publiquen después de la confirmación.\n• La suscripción puede cancelarse en cualquier momento, incluso antes de que finalice el período gratuito. El usuario puede gestionar sus suscripciones en su cuenta personal de Google Play, en la sección \"Suscripciones\" (";
                str3 = ").\n• El pago de la suscripción se cargará automáticamente a la cuenta del usuario cada 30 días, a menos que el usuario la cancele (";
                str4 = "• La suscripción entra en vigor tras la confirmación de esta suscripción.\n• El costo de la suscripción es de ";
                k6 = d9.e.l(r4.k.q(str4, str, str2, j, str3), j, ").");
            }
            str7 = "\n• Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (";
            str6 = ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels (";
            str5 = "• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ";
            k6 = d9.e.k(r4.k.q(str5, str, str7, j, str6), j, ')');
        } else if (hashCode == 3276) {
            if (c2.equals("fr")) {
                str2 = ".\n• Une fois confirmé, l’utilisateur aura accès à toutes les prévisions live publiées après la confirmation.\n• L’abonnement peut être annulé à tout moment, y compris avant la fin de la période d’essai gratuite. L’utilisateur peut gérer ses abonnements dans son compte Google Play, section « Abonnements » (";
                str3 = ").\n• Les frais d’abonnement seront automatiquement prélevés sur le compte de l’utilisateur tous les 30 jours, sauf s’il annule l’abonnement (";
                str4 = "• L’abonnement prend effet après la confirmation de celui-ci.• Le coût de l’abonnement est de ";
                k6 = d9.e.l(r4.k.q(str4, str, str2, j, str3), j, ").");
            }
            str7 = "\n• Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (";
            str6 = ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels (";
            str5 = "• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ";
            k6 = d9.e.k(r4.k.q(str5, str, str7, j, str6), j, ')');
        } else if (hashCode != 3588) {
            if (hashCode != 3651) {
                if (hashCode == 3710 && c2.equals("tr")) {
                    str2 = "'dir.\n• Abonelik onaylandıktan sonra, kullanıcı onaydan sonra yayınlanacak tüm canlı tahminlere erişebilecektir.\n• Abonelik, ücretsiz dönem bitmeden önce veya herhangi bir zamanda iptal edilebilir. Kullanıcı, Google Play hesabındaki \"Abonelikler\" bölümünden aboneliklerini yönetebilir (";
                    str3 = ").\n• Abonelik ücreti, kullanıcı iptal etmediği sürece her 30 günde bir otomatik olarak hesaptan tahsil edilir (";
                    str4 = "• Abonelik, bu aboneliğin onaylanmasından sonra yürürlüğe girer.\n• Abonelik ücreti ";
                    k6 = d9.e.l(r4.k.q(str4, str, str2, j, str3), j, ").");
                }
            } else if (c2.equals("ru")) {
                str7 = "\n• После подтверждения подписки пользователю будут доступны все live-прогнозы, которые будут опубликованы после ее подтверждения\n• Подписку можно отменить в любое время, а также до истечения бесплатного периода. Управлять подписками пользователь может в личном аккаунте Google Play в разделе “Подписки” (";
                str6 = ")\n• Оплата по подписке будет автоматически списываться со счета пользователя в каждые 30 дней, если пользователь ее не отменит (";
                str5 = "• Подписка вступает в силу после подтверждения оформления данной подписки\n• Стоимость подписки составляет ";
                k6 = d9.e.k(r4.k.q(str5, str, str7, j, str6), j, ')');
            }
            str7 = "\n• Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (";
            str6 = ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels (";
            str5 = "• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ";
            k6 = d9.e.k(r4.k.q(str5, str, str7, j, str6), j, ')');
        } else {
            if (c2.equals("pt")) {
                str2 = ".\n• Após a confirmação, o utilizador terá acesso a todas as previsões em direto que forem publicadas depois da confirmação.\n• A subscrição pode ser cancelada a qualquer momento, mesmo antes do final do período gratuito. O utilizador pode gerir as suas subscrições na sua conta pessoal do Google Play, na secção \"Subscrições\" (";
                str3 = ").\n• O pagamento da subscrição será automaticamente debitado da conta do utilizador a cada 30 dias, a menos que o utilizador a cancele (";
                str4 = "• A subscrição entra em vigor após a confirmação desta subscrição.\n• O custo da subscrição é de ";
                k6 = d9.e.l(r4.k.q(str4, str, str2, j, str3), j, ").");
            }
            str7 = "\n• Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (";
            str6 = ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels (";
            str5 = "• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ";
            k6 = d9.e.k(r4.k.q(str5, str, str7, j, str6), j, ')');
        }
        bundle.putString("Text", k6);
        bundle.putString("cancelSubs", j);
        return bundle;
    }

    public static Bundle y(String str) {
        StringBuilder q;
        String str2;
        Intrinsics.checkNotNullParameter("Text", "txtKey");
        Intrinsics.checkNotNullParameter("cancelSubs", "cancelKey");
        Bundle bundle = new Bundle();
        String str3 = gc.d.f9945a;
        String c2 = d2.i.c();
        String j = j(c2);
        if (str == null) {
            str = "$";
        }
        int hashCode = c2.hashCode();
        if (hashCode == 3201) {
            if (c2.equals("de")) {
                q = r4.k.q("• Das Abonnement wird nach der Bestätigung des Abonnements wirksam. Nach der Bestätigung erhält der Benutzer Zugriff auf alle Live-Vorhersagen, die nach der Bestätigung veröffentlicht werden.\n• Die Kosten des Abonnements betragen ", str, ".\n• Alle neuen Benutzer der App erhalten 3 kostenlose Tage des Abonnements. Nach Ablauf des kostenlosen Zeitraums, wenn der Benutzer das Abonnement nicht gekündigt hat (", j, "), wird ein Betrag in Höhe der Kosten dieses Abonnements in Ihrer Region berechnet.\n• Der kostenlose Zeitraum kann nur einmal genutzt werden.\n• Wenn der Benutzer den kostenlosen Zeitraum bereits genutzt hat, wird der Abonnementpreis sofort bei der Anmeldung berechnet.\n• Das Abonnement kann jederzeit und auch vor Ablauf des kostenlosen Zeitraums gekündigt werden. Der Benutzer kann seine Abonnements in seinem Google Play-Konto im Abschnitt „Abonnements“ verwalten (");
                str2 = ").\n• Die Abonnementgebühr wird in jedem Zeitraum (7 Tage) automatisch vom Konto des Benutzers abgebucht, sofern der Benutzer nicht kündigt (";
            }
            q = r4.k.q("• The subscription becomes effective upon confirmation of the subscription. Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed.\n• The cost of a subscription is ", str, "\n• All new users of the application get 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the cost of this subscription in your region will be charged.\n• The free period can be used only once.\n• If the user has already used the free period, then when subscribing to the subscription, the cost of the subscription will be charged immediately.\n• Subscriptions can be cancelled at any time and before the free period expires. You can manage subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            str2 = ").\n• The subscription payment will be automatically deducted from the user's account each period (7 days) unless the user cancels the subscription (";
        } else if (hashCode == 3246) {
            if (c2.equals("es")) {
                q = r4.k.q("• La suscripción entra en vigor tras la confirmación de la suscripción. Una vez confirmada, el usuario tendrá acceso a todas las predicciones en vivo que se publiquen después de la confirmación.\n• El costo de la suscripción es de ", str, ".\n• Todos los nuevos usuarios de la aplicación reciben 3 días gratuitos de suscripción. Después del período gratuito, si el usuario no ha cancelado la suscripción (", j, "), se cobrará un monto igual al precio de esta suscripción en su región.\n• El período gratuito solo puede usarse una vez.\n• Si el usuario ya ha utilizado el período gratuito, el costo de la suscripción se cobrará inmediatamente al suscribirse.\n• La suscripción puede cancelarse en cualquier momento, incluso antes de que finalice el período gratuito. El usuario puede gestionar sus suscripciones en su cuenta personal de Google Play, en la sección \"Suscripciones\" (");
                str2 = ").\n• El pago de la suscripción se cargará automáticamente a la cuenta del usuario cada período (7 días), a menos que el usuario la cancele (";
            }
            q = r4.k.q("• The subscription becomes effective upon confirmation of the subscription. Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed.\n• The cost of a subscription is ", str, "\n• All new users of the application get 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the cost of this subscription in your region will be charged.\n• The free period can be used only once.\n• If the user has already used the free period, then when subscribing to the subscription, the cost of the subscription will be charged immediately.\n• Subscriptions can be cancelled at any time and before the free period expires. You can manage subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            str2 = ").\n• The subscription payment will be automatically deducted from the user's account each period (7 days) unless the user cancels the subscription (";
        } else if (hashCode == 3276) {
            if (c2.equals("fr")) {
                q = r4.k.q("• L’abonnement prend effet après confirmation. Une fois confirmé, l’utilisateur aura accès à toutes les prévisions live publiées après la confirmation.\n• Le coût de l’abonnement est de ", str, ".\n• Tous les nouveaux utilisateurs bénéficient de 3 jours gratuits. Après la période gratuite, si l’utilisateur n’a pas annulé l’abonnement (", j, "), un montant égal au prix de l’abonnement sera facturé.\n• La période gratuite ne peut être utilisée qu’une seule fois.\n• Si l’utilisateur a déjà profité de la période gratuite, le montant de l’abonnement sera immédiatement facturé lors de la souscription.\n• L’abonnement peut être annulé à tout moment, y compris avant la fin de la période gratuite. L’utilisateur peut gérer ses abonnements dans son compte Google Play, section « Abonnements » (");
                str2 = ").\n• Le paiement sera automatiquement prélevé sur le compte de l’utilisateur tous les 7 jours, sauf s’il annule l’abonnement (";
            }
            q = r4.k.q("• The subscription becomes effective upon confirmation of the subscription. Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed.\n• The cost of a subscription is ", str, "\n• All new users of the application get 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the cost of this subscription in your region will be charged.\n• The free period can be used only once.\n• If the user has already used the free period, then when subscribing to the subscription, the cost of the subscription will be charged immediately.\n• Subscriptions can be cancelled at any time and before the free period expires. You can manage subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            str2 = ").\n• The subscription payment will be automatically deducted from the user's account each period (7 days) unless the user cancels the subscription (";
        } else if (hashCode == 3588) {
            if (c2.equals("pt")) {
                q = r4.k.q("• A subscrição entra em vigor após a confirmação da subscrição. Após a confirmação, o utilizador terá acesso a todas as previsões em direto que forem publicadas depois da confirmação.\n• O custo da subscrição é de ", str, ".\n• Todos os novos utilizadores da aplicação recebem 3 dias gratuitos de subscrição. Após o término do período gratuito, se o utilizador não tiver cancelado a subscrição (", j, "), será cobrado um valor igual ao preço desta subscrição na sua região.\n• O período gratuito só pode ser utilizado uma vez.\n• Se o utilizador já tiver utilizado o período gratuito, o valor da subscrição será cobrado imediatamente ao confirmar a subscrição.\n• A subscrição pode ser cancelada a qualquer momento, mesmo antes do final do período gratuito. O utilizador pode gerir as suas subscrições na sua conta pessoal do Google Play, na secção \"Subscrições\" (");
                str2 = ").\n• O pagamento da subscrição será automaticamente debitado da conta do utilizador a cada período (7 dias), a menos que o utilizador a cancele (";
            }
            q = r4.k.q("• The subscription becomes effective upon confirmation of the subscription. Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed.\n• The cost of a subscription is ", str, "\n• All new users of the application get 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the cost of this subscription in your region will be charged.\n• The free period can be used only once.\n• If the user has already used the free period, then when subscribing to the subscription, the cost of the subscription will be charged immediately.\n• Subscriptions can be cancelled at any time and before the free period expires. You can manage subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            str2 = ").\n• The subscription payment will be automatically deducted from the user's account each period (7 days) unless the user cancels the subscription (";
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && c2.equals("tr")) {
                q = r4.k.q("• Abonelik, onaylandıktan sonra yürürlüğe girer. Abonelik onaylandıktan sonra, kullanıcı onaydan sonra yayınlanacak tüm canlı tahminlere erişebilecektir.\n• Abonelik ücreti ", str, "'dir.\n• Uygulamanın tüm yeni kullanıcılarına 3 günlük ücretsiz abonelik süresi verilir. Ücretsiz dönem sona erdikten sonra, kullanıcı aboneliği iptal etmezse (", j, "), bölgenizdeki abonelik fiyatına eşit bir tutar tahsil edilir.\n• Ücretsiz dönem yalnızca bir kez kullanılabilir.\n• Kullanıcı ücretsiz dönemden daha önce yararlanmışsa, aboneliği onayladığında ücret hemen tahsil edilir.\n• Abonelik, ücretsiz dönem bitmeden önce veya herhangi bir zamanda iptal edilebilir. Kullanıcı, Google Play hesabındaki \"Abonelikler\" bölümünden aboneliklerini yönetebilir (");
                str2 = ").\n• Abonelik ücreti, kullanıcı iptal etmediği sürece her 7 günde bir otomatik olarak hesaptan tahsil edilir (";
            }
            q = r4.k.q("• The subscription becomes effective upon confirmation of the subscription. Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed.\n• The cost of a subscription is ", str, "\n• All new users of the application get 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the cost of this subscription in your region will be charged.\n• The free period can be used only once.\n• If the user has already used the free period, then when subscribing to the subscription, the cost of the subscription will be charged immediately.\n• Subscriptions can be cancelled at any time and before the free period expires. You can manage subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            str2 = ").\n• The subscription payment will be automatically deducted from the user's account each period (7 days) unless the user cancels the subscription (";
        } else {
            if (c2.equals("ru")) {
                q = r4.k.q("• Подписка вступает в силу после подтверждения оформления данной подписки. После подтверждения подписки пользователю будут доступны все live-прогнозы, которые будут опубликованы после ее подтверждения.\n• Стоимость подписки составляет ", str, ".\n• Всем новым пользователям приложения предоставляется 3 бесплатных дня пользования подпиской. После окончания бесплатного периода, если пользователь не отметил подписку(", j, "), будет списана сумма равная стоимости данной подписки в вашем регионе.\n• Бесплатным периодом пользователь может воспользоваться только один раз\n• Если пользователь уже пользовался бесплатным периодом, то при оформлении подписки будет сразу списана стоимость данной подписки.\n• Подписку можно отменить в любое время, а также до истечения бесплатного периода. Управлять подписками пользователь может в личном аккаунте Google Play в разделе “Подписки” (");
                str2 = ").\n• Оплата по подписке будет автоматически списываться со счета пользователя в каждый период (7 дней), если пользователь не отменит подписку (";
            }
            q = r4.k.q("• The subscription becomes effective upon confirmation of the subscription. Once the subscription is confirmed, the user will have access to all live forecasts that will be published after the subscription is confirmed.\n• The cost of a subscription is ", str, "\n• All new users of the application get 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the cost of this subscription in your region will be charged.\n• The free period can be used only once.\n• If the user has already used the free period, then when subscribing to the subscription, the cost of the subscription will be charged immediately.\n• Subscriptions can be cancelled at any time and before the free period expires. You can manage subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            str2 = ").\n• The subscription payment will be automatically deducted from the user's account each period (7 days) unless the user cancels the subscription (";
        }
        bundle.putString("Text", d9.e.n(q, j, str2, j, ")."));
        bundle.putString("cancelSubs", j);
        return bundle;
    }

    public static final r z(r rVar, boolean z5) {
        if (!z5) {
            return rVar;
        }
        BufferedSource m02 = rVar.m0();
        return (m02.rangeEquals(0L, g4.f.f9755b) || m02.rangeEquals(0L, g4.f.f9754a)) ? ci.c.b(Okio.buffer(new h4.a(rVar.m0())), rVar.getFileSystem()) : rVar;
    }
}
