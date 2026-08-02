package ld0;

import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: ld0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7930E extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7929D f73195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7930E(C7929D c7929d) {
        super(1);
        this.f73195b = c7929d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        Toast.makeText(this.f73195b.requireContext(), "Action triggered: " + action.getId(), 0).show();
        return Unit.f71690a;
    }
}
