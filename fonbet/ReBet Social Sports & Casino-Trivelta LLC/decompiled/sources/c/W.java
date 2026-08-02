package c;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import com.google.android.gms.tasks.OnFailureListener;
import com.surt.guardian.utils.Logger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class W implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f26502a;

    public W(C1469p c1469p) {
        this.f26502a = c1469p;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Logger.f41582a.b("AttestationManager", "Integrity token request failed", e10);
        InterfaceC1465n interfaceC1465n = this.f26502a;
        Result.Companion companion = Result.INSTANCE;
        interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(e10)));
    }
}
