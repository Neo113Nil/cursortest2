package Sf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Pf.a f10754a;

    public e(Pf.a triggersRepository) {
        Intrinsics.checkNotNullParameter(triggersRepository, "triggersRepository");
        this.f10754a = triggersRepository;
    }

    public static /* synthetic */ Object b(e eVar, Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Continuation continuation, int i10, Object obj) {
        boolean z15;
        e eVar2;
        Rf.a aVar2;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z16;
        Continuation continuation2;
        String str10 = (i10 & 4) != 0 ? null : str2;
        boolean z17 = (i10 & 128) != 0 ? false : z11;
        boolean z18 = (i10 & 256) != 0 ? false : z12;
        boolean z19 = (i10 & 512) != 0 ? false : z13;
        if ((i10 & 1024) != 0) {
            z15 = false;
            aVar2 = aVar;
            str6 = str;
            str7 = str3;
            str8 = str4;
            str9 = str5;
            z16 = z10;
            continuation2 = continuation;
            eVar2 = eVar;
        } else {
            z15 = z14;
            eVar2 = eVar;
            aVar2 = aVar;
            str6 = str;
            str7 = str3;
            str8 = str4;
            str9 = str5;
            z16 = z10;
            continuation2 = continuation;
        }
        return eVar2.a(aVar2, str6, str10, str7, str8, str9, z16, z17, z18, z19, z15, continuation2);
    }

    public final Object a(Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Continuation continuation) {
        return Pf.a.j(this.f10754a, aVar, str, str2, str3, str4, str5, z10, z11, z12, z14, z13, false, continuation, 2048, null);
    }
}
