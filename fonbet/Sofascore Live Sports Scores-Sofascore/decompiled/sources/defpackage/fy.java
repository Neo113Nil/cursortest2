package defpackage;

import android.content.ClipData;
import android.os.Build;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fy implements iy2 {
    public final gy a;

    public fy(gy gyVar) {
        this.a = gyVar;
    }

    public final Unit a(gy2 gy2Var) {
        gy gyVar = this.a;
        if (gy2Var != null) {
            gyVar.a().setPrimaryClip(gy2Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c90.c(gyVar.a());
        } else {
            gyVar.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return Unit.a;
    }
}
