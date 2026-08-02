package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ed0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        Object obj = Boolean.FALSE;
        try {
            obj = fd0.d("getHorizontallyScrolling").invoke(textView, null);
        } catch (Exception unused) {
        }
        return ((Boolean) obj).booleanValue();
    }
}
