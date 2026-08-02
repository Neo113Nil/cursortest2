package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jih extends CancellationException {
    public final bka a;

    public jih(bka bkaVar) {
        super("Cancelled isolated runner");
        this.a = bkaVar;
    }
}
