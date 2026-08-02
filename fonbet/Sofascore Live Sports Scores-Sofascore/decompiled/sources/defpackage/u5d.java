package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u5d extends u4d {
    public final String h;
    public final String i;
    public x4d j;
    public bo3 k;
    public final AtomicLong l;
    public final Function m;

    public u5d(String str, String str2, p4d p4dVar, x4d x4dVar) {
        super(p4dVar);
        this.h = str2;
        this.i = str;
        this.j = x4dVar;
        this.l = new AtomicLong(-1L);
        if (this.j == null) {
            this.k = new bo3();
        }
        this.m = new mn0(5);
    }

    @Override // defpackage.u4d
    public final bo3 a() {
        return this.k;
    }
}
