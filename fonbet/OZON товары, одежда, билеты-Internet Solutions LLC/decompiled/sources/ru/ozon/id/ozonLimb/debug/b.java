package ru.ozon.id.ozonLimb.debug;

import Ae.InterfaceC2397i;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class b<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ OzonIdDebugActivity f97526a;

    b(OzonIdDebugActivity ozonIdDebugActivity) {
        this.f97526a = ozonIdDebugActivity;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, d dVar) {
        String message = (String) obj;
        OzonIdDebugActivity ozonIdDebugActivity = this.f97526a;
        Intrinsics.checkNotNullParameter(message, "message");
        Toast.makeText(ozonIdDebugActivity, message, 0).show();
        OzonIdDebugActivity.L(ozonIdDebugActivity);
        return Unit.f71690a;
    }
}
