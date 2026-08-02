package c;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.surt.guardian.utils.Logger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class T extends Lambda implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f26497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C1469p c1469p) {
        super(1);
        this.f26497d = c1469p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IntegrityTokenResponse response = (IntegrityTokenResponse) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        String str = response.token();
        Logger.f41582a.d("AttestationManager", "Integrity token received (" + str.length() + " chars)");
        this.f26497d.resumeWith(Result.m147constructorimpl(str));
        return Unit.INSTANCE;
    }
}
