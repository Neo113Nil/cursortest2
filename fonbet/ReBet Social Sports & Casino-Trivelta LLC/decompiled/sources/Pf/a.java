package Pf;

import Sf.c;
import kotlin.coroutines.Continuation;
import me.C5582a;

/* loaded from: classes4.dex */
public interface a {
    static /* synthetic */ C5582a b(a aVar, Rf.a aVar2, String str, Long l10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTriggerAlarm");
        }
        if ((i10 & 4) != 0) {
            l10 = null;
        }
        return aVar.i(aVar2, str, l10);
    }

    static /* synthetic */ Object j(a aVar, Rf.a aVar2, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Continuation continuation, int i10, Object obj) {
        if (obj == null) {
            return aVar.h(aVar2, str, str2, str3, str4, str5, z10, z11, z12, z13, (i10 & 1024) != 0 ? false : z14, (i10 & 2048) != 0 ? false : z15, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initiateTrigger");
    }

    C5582a a(Rf.a aVar);

    C5582a c();

    C5582a d(Rf.a aVar, String str, c.a aVar2);

    C5582a e();

    C5582a f(Rf.a aVar);

    Object g(String str, String str2, boolean z10, boolean z11, Continuation continuation);

    Object h(Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Continuation continuation);

    C5582a i(Rf.a aVar, String str, Long l10);

    C5582a k(Rf.a aVar, String str);
}
