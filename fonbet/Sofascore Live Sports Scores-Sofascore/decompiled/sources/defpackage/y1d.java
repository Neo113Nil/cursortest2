package defpackage;

import com.sofascore.results.R;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y1d {
    public static final y1d d;
    public static final y1d e;
    public static final y1d f;
    public static final /* synthetic */ y1d[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final q9k b;
    public final String c;

    static {
        y1d y1dVar = new y1d("TwoHours", 0, R.drawable.ic_hour_two, new q9k(R.string.block_notif_2), "mute_2h");
        d = y1dVar;
        y1d y1dVar2 = new y1d("FourHours", 1, R.drawable.ic_hour_four, new q9k(R.string.block_notif_4), "mute_4h");
        e = y1dVar2;
        LocalDateTime withMinute = LocalDateTime.now(ZoneId.systemDefault()).withHour(8).withMinute(0);
        withMinute.getClass();
        y1d y1dVar3 = new y1d("UntilEight", 2, R.drawable.ic_hour_eight, new q9k(R.string.mute_until, l6g.K(new DateTimeFormatterBuilder().appendLocalized(null, FormatStyle.SHORT).toFormatter(Locale.getDefault()).format(withMinute))), "mute_until_specific_hour");
        f = y1dVar3;
        y1d[] y1dVarArr = {y1dVar, y1dVar2, y1dVar3};
        g = y1dVarArr;
        h = new kp5(y1dVarArr);
    }

    public y1d(String str, int i, int i2, q9k q9kVar, String str2) {
        this.a = i2;
        this.b = q9kVar;
        this.c = str2;
    }

    public static y1d valueOf(String str) {
        return (y1d) Enum.valueOf(y1d.class, str);
    }

    public static y1d[] values() {
        return (y1d[]) g.clone();
    }
}
