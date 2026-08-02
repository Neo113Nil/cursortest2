package c;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import com.google.android.gms.tasks.OnCanceledListener;
import com.surt.guardian.utils.Logger;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: c.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2431a0 implements OnCanceledListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f26515a;

    public C2431a0(C1469p c1469p) {
        this.f26515a = c1469p;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        Logger.f41582a.f("AttestationManager", "Integrity token request canceled");
        InterfaceC1465n interfaceC1465n = this.f26515a;
        Result.Companion companion = Result.INSTANCE;
        interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(new Exception("Request canceled"))));
    }
}
