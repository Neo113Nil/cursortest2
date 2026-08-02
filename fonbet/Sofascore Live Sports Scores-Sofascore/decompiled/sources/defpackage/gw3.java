package defpackage;

import java.io.File;
import java.util.function.Predicate;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw3 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Integer) obj).intValue() != 0;
            default:
                return ((File) obj).exists();
        }
    }
}
