package defpackage;

import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xuc implements yhj {

    @NotNull
    public static final xuc a = new xuc();
    public static final long b = System.nanoTime();

    public static long b() {
        return System.nanoTime() - b;
    }

    @Override // defpackage.yhj
    /* renamed from: a */
    public final y53 mo903a() {
        return new whj(b());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // defpackage.yhj
    public final TimeMark a() {
        return new whj(b());
    }
}
