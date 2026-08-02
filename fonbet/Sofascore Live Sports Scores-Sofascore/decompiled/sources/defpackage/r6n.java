package defpackage;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r6n extends map {
    public static final n6n b = new n6n();
    public final SimpleDateFormat a = new SimpleDateFormat("MMM d, yyyy");

    private r6n() {
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        Date date;
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
                    date = new Date(simpleDateFormat.parse(f0).getTime());
                } catch (ParseException e) {
                    String P0 = e7nVar.P0();
                    StringBuilder sb = new StringBuilder(String.valueOf(f0).length() + 39 + P0.length());
                    sb.append("Failed parsing '");
                    sb.append(f0);
                    sb.append("' as SQL Date; at path ");
                    sb.append(P0);
                    throw new o9p(16, sb.toString(), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            f7nVar.f0();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        f7nVar.H(format);
    }

    public /* synthetic */ r6n(int i) {
    }
}
