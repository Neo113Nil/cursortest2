package io.seon.androidsdk.service;

import android.content.Context;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class e7 extends AbstractC4950j {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f53293f = {"region_country", "region_language", "region_timezone", "timezone_identifier"};

    /* renamed from: e, reason: collision with root package name */
    public Context f53294e;

    static {
        Lh.a.d(e7.class);
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53294e = c4878a.a();
        this.f53368b = c4878a;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        return null;
    }

    public final String f() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception unused) {
            return null;
        }
    }

    public final String g() {
        return this.f53294e.getResources().getConfiguration().locale.getCountry();
    }

    public final String h() {
        return Locale.getDefault().getLanguage();
    }

    public final String i() {
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis());
        String format = String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(Math.abs(offset / 3600000)), Integer.valueOf(Math.abs((offset / 60000) % 60)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(offset >= 0 ? "+" : "-");
        sb2.append(format);
        return sb2.toString();
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("region_country", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.R6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return e7.this.g();
            }
        }));
        hashMap.put("region_language", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.S6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return e7.this.h();
            }
        }));
        hashMap.put("region_timezone", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.T6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return e7.this.i();
            }
        }));
        hashMap.put("timezone_identifier", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.U6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return e7.this.f();
            }
        }));
        return hashMap;
    }
}
