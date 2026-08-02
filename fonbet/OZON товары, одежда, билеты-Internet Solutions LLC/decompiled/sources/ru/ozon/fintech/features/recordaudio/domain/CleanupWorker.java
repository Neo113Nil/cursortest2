package ru.ozon.fintech.features.recordaudio.domain;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.n;
import bd.h;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/features/recordaudio/domain/CleanupWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "record-audio_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleanupWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanupWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    @Override // androidx.work.Worker
    @NotNull
    public final n.a doWork() {
        String d11 = getInputData().d("issueId");
        if (d11 == null) {
            n.a.C0823a c0823a = new n.a.C0823a();
            Intrinsics.checkNotNullExpressionValue(c0823a, "failure(...)");
            return c0823a;
        }
        File file = new File(getApplicationContext().getCacheDir(), d11);
        try {
            if (file.exists()) {
                h.h(file);
            }
            return new n.a.c();
        } catch (Exception e11) {
            e11.printStackTrace();
            return new n.a.C0823a();
        }
    }
}
