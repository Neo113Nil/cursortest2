package ru.ozon.app.android.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.c;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.a;
import org.joda.time.format.b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/utils/CurrentDateTime;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "get", "()Ljava/lang/String;", "Lorg/joda/time/DateTimeZone;", "moscowTimeZone", "Lorg/joda/time/DateTimeZone;", "Lorg/joda/time/format/b;", "dateTimeFormat", "Lorg/joda/time/format/b;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CurrentDateTime {

    @NotNull
    public static final CurrentDateTime INSTANCE = new CurrentDateTime();
    private static final DateTimeZone moscowTimeZone = DateTimeZone.d("Europe/Moscow");
    private static final b dateTimeFormat = a.b("dd.MM.yyyy HH:mm:ss");

    private CurrentDateTime() {
    }

    public final String get() {
        b bVar = dateTimeFormat;
        DateTimeZone dateTimeZone = moscowTimeZone;
        int i11 = c.f79052b;
        return bVar.g(new DateTime(System.currentTimeMillis(), ISOChronology.h0(dateTimeZone)));
    }
}
