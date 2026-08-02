package Sf;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Pf.a f10753a;

    public d(Pf.a triggersRepository) {
        Intrinsics.checkNotNullParameter(triggersRepository, "triggersRepository");
        this.f10753a = triggersRepository;
    }

    public final C5582a a(Rf.a actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return this.f10753a.f(actionType);
    }
}
