package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gpi extends al5 {
    public final WeakReference a;

    public gpi(SwitchCompat switchCompat) {
        this.a = new WeakReference(switchCompat);
    }

    @Override // defpackage.al5
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // defpackage.al5
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
