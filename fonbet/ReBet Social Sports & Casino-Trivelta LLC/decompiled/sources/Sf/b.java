package Sf;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Pf.a f10751a;

    public b(Pf.a triggersRepository) {
        Intrinsics.checkNotNullParameter(triggersRepository, "triggersRepository");
        this.f10751a = triggersRepository;
    }

    public final C5582a a(Rf.a actionType, String str, Long l10) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return this.f10751a.i(actionType, str, l10);
    }
}
