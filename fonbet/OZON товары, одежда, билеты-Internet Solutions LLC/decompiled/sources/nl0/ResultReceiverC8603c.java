package nl0;

import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.activitylauncher.a;

/* renamed from: nl0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ResultReceiverC8603c extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC8605e f77377a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC8603c(@NotNull InterfaceC8605e callback) {
        super(null);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f77377a = callback;
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i11, Bundle bundle) {
        super.onReceiveResult(i11, bundle);
        this.f77377a.c(i11 != -1 ? i11 != 0 ? i11 != 2 ? i11 != 9901 ? i11 != 9902 ? new a.d(i11) : a.f.f97953b : a.e.f97952b : a.C2157a.f97948b : a.b.f97949b : a.c.f97950b);
    }
}
