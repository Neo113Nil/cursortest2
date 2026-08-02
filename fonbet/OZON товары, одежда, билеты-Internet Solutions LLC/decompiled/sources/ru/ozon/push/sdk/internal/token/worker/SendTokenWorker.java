package ru.ozon.push.sdk.internal.token.worker;

import Nh0.d;
import Sc.InterfaceC4008j;
import Sc.k;
import Yg0.a;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.n;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.updater.PushTokenUpdateResultsConverter;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/push/sdk/internal/token/worker/SendTokenWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendTokenWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WorkerParameters f97713a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97714b;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<PushTokenUpdateResultsConverter> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97715b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final PushTokenUpdateResultsConverter invoke() {
            Yg0.a.f35038y.getClass();
            return a.C0652a.b().u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendTokenWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f97713a = workerParams;
        this.f97714b = k.b(a.f97715b);
    }

    @Override // androidx.work.Worker
    @NotNull
    public final n.a doWork() {
        PushTokenUpdateResultsConverter pushTokenUpdateResultsConverter = (PushTokenUpdateResultsConverter) this.f97714b.getValue();
        e d11 = this.f97713a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getInputData(...)");
        ArrayList a11 = pushTokenUpdateResultsConverter.a(d11);
        Yg0.a.f35038y.getClass();
        Yg0.a b11 = a.C0652a.b();
        try {
            d dVar = (d) b11.v();
            if (!dVar.g(a11, b11.y()).isSuccessful()) {
                return n.a.a();
            }
            dVar.o(a11);
            return n.a.b();
        } catch (IOException unused) {
            return n.a.a();
        }
    }
}
