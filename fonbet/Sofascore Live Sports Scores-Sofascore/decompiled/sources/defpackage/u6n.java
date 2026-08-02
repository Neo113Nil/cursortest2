package defpackage;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u6n extends map {
    public static final t6n b = new t6n();
    public final SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss a");

    private u6n() {
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        Time time;
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        String f0 = e7nVar.f0();
        synchronized (this) {
            SimpleDateFormat simpleDateFormat = this.a;
            TimeZone timeZone = simpleDateFormat.getTimeZone();
            try {
                try {
                    time = new Time(simpleDateFormat.parse(f0).getTime());
                } catch (ParseException e) {
                    String P0 = e7nVar.P0();
                    StringBuilder sb = new StringBuilder(String.valueOf(f0).length() + 39 + P0.length());
                    sb.append("Failed parsing '");
                    sb.append(f0);
                    sb.append("' as SQL Time; at path ");
                    sb.append(P0);
                    throw new o9p(16, sb.toString(), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            f7nVar.f0();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        f7nVar.H(format);
    }

    public /* synthetic */ u6n(int i) {
    }
}
