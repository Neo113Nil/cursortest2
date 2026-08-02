package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nyc extends sq3 {
    public j2d r;
    public FileInputStream s;
    public FileLock t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ oyc w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyc(oyc oycVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = oycVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.b(null, this);
    }
}
