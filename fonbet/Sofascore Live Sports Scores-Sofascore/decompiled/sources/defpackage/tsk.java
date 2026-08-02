package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tsk implements Sequence {
    final /* synthetic */ ViewGroup a;

    public tsk(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return wca.B(this.a);
    }
}
