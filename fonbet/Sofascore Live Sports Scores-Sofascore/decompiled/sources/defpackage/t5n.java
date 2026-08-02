package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t5n extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        try {
            return new AtomicInteger(e7nVar.u0());
        } catch (NumberFormatException e) {
            throw new o9p(16, e);
        }
    }

    @Override // defpackage.map
    public final /* synthetic */ void write(f7n f7nVar, Object obj) {
        f7nVar.a0(((AtomicInteger) obj).get());
    }
}
