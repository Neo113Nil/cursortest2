package z8;

import com.facebook.soloader.E;
import com.facebook.soloader.InterfaceC3110b;
import com.facebook.soloader.m;
import com.facebook.soloader.p;

/* loaded from: classes2.dex */
public class l implements h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z8.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        for (m mVar : eArr) {
            if (mVar instanceof InterfaceC3110b) {
                p.b("SoLoader", "Waiting on SoSource " + mVar.c());
                mVar.a();
            }
        }
        return true;
    }
}
