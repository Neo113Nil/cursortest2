package Re;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10217a;

    public i(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10217a = conversationsRepository;
    }

    public static /* synthetic */ Object b(i iVar, String str, String str2, String str3, String str4, String str5, Pe.a aVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            aVar = Pe.a.Chat;
        }
        return iVar.a(str, str2, str3, str4, str5, aVar, continuation);
    }

    public final Object a(String str, String str2, String str3, String str4, String str5, Pe.a aVar, Continuation continuation) {
        return this.f10217a.m(str, str2, str3, str4, str5, aVar, continuation);
    }
}
