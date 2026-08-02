package c;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import com.surt.guardian.utils.Logger;
import kotlin.Result;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f26501a;

    public V(C1469p c1469p) {
        this.f26501a = c1469p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26501a.isActive()) {
            Logger.f41582a.f("VerisoulModule", "Verisoul getSessionId timed out after 5s");
            this.f26501a.resumeWith(Result.m147constructorimpl(null));
        }
    }
}
