package Sf;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Pf.a f10757a;

    public h(Pf.a triggersRepository) {
        Intrinsics.checkNotNullParameter(triggersRepository, "triggersRepository");
        this.f10757a = triggersRepository;
    }

    public final C5582a a(Rf.a actionType, String encryptedVisitorInfo) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(encryptedVisitorInfo, "encryptedVisitorInfo");
        return this.f10757a.k(actionType, encryptedVisitorInfo);
    }
}
