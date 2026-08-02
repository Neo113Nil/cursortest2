package defpackage;

import android.widget.NumberPicker;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p4k implements NumberPicker.Formatter {
    public final StringBuilder a;
    public final Formatter b;

    public p4k() {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        this.b = new Formatter(sb, Locale.getDefault());
    }

    @Override // android.widget.NumberPicker.Formatter
    public final String format(int i) {
        StringBuilder sb = this.a;
        sb.delete(0, sb.length());
        Object[] objArr = {Integer.valueOf(i)};
        Formatter formatter = this.b;
        formatter.format("%02d", objArr);
        String formatter2 = formatter.toString();
        formatter2.getClass();
        return formatter2;
    }
}
