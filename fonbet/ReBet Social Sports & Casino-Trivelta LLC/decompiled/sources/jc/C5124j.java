package jc;

import android.os.Bundle;
import com.twilio.voice.EventKeys;
import java.util.Calendar;

/* renamed from: jc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5124j {

    /* renamed from: a, reason: collision with root package name */
    public Calendar f53913a = Calendar.getInstance();

    public C5124j(Bundle bundle) {
        if (bundle != null && bundle.containsKey(EventKeys.VALUE_KEY)) {
            this.f53913a.setTimeInMillis(bundle.getLong(EventKeys.VALUE_KEY));
        }
        this.f53913a.setTimeZone(AbstractC5118d.m(bundle));
    }

    public int a() {
        return this.f53913a.get(5);
    }

    public int b() {
        return this.f53913a.get(11);
    }

    public int c() {
        return this.f53913a.get(12);
    }

    public int d() {
        return this.f53913a.get(2);
    }

    public Long e() {
        return Long.valueOf(this.f53913a.getTimeInMillis());
    }

    public int f() {
        return this.f53913a.get(1);
    }
}
