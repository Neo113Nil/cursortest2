package defpackage;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oto extends Cast.Listener {
    public final /* synthetic */ ExpandedControllerActivity a;

    public oto(ExpandedControllerActivity expandedControllerActivity) {
        this.a = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void e() {
        this.a.s();
    }
}
