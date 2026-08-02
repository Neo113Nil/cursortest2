package com.vk.core.compose.component.datetime;

import com.vk.core.compose.component.datetime.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import xsna.ayk;
import xsna.e43;
import xsna.i44;
import xsna.k9x;
import xsna.wxk;
import xsna.xxk;

/* compiled from: DatePickerDefaults.kt */
/* loaded from: classes17.dex */
public final class c {
    public static final List<b.a> a;
    public static final b.C0739b b;
    public static final char c;
    public static final k9x d;

    static {
        List<b.a> l = e43.l(new b.a.C0737a(2, new wxk(0)), new b.a.C0738b("."), new b.a.C0737a(2, new xxk(0)), new b.a.C0738b("."), new b.a.C0737a(4, new i44(1)));
        a = l;
        b = new b.C0739b(l);
        c = '_';
        d = ayk.b;
    }

    public static Date a(long j) {
        return new Date(j - TimeZone.getDefault().getRawOffset());
    }

    public static SimpleDateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static long c(Date date) {
        return date.getTime() + TimeZone.getDefault().getRawOffset();
    }
}
