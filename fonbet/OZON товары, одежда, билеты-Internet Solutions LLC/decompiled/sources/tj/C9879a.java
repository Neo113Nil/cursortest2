package tj;

import Ej.p;
import android.widget.CompoundButton;
import vj.C10325b;

/* renamed from: tj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C9879a implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        C10325b c10325b = C10325b.f103003h;
        if (c10325b == null) {
            throw new IllegalStateException("Error OzonHarLogger is not initialized, you need to call OzonHarLogger.init()");
        }
        C10325b.i(c10325b, z11);
        p.b("Har logger set enabled: " + z11);
    }
}
