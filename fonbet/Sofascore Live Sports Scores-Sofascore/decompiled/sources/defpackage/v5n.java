package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v5n extends map {
    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ Object read(e7n e7nVar) {
        return new AtomicBoolean(e7nVar.g0());
    }

    @Override // defpackage.map
    public final /* synthetic */ void write(f7n f7nVar, Object obj) {
        f7nVar.M(((AtomicBoolean) obj).get());
    }
}
