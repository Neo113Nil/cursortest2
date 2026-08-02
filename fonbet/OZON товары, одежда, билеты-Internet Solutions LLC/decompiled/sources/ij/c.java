package ij;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;

/* loaded from: classes10.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f66500a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f66501b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull d downloadStore, @NotNull Function1<? super Boolean, Unit> onDownloadResult) {
        Intrinsics.checkNotNullParameter(downloadStore, "downloadStore");
        Intrinsics.checkNotNullParameter(onDownloadResult, "onDownloadResult");
        this.f66500a = downloadStore;
        this.f66501b = (AbstractC7737t) onDownloadResult;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        ?? r02 = this.f66501b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            try {
                int i11 = C8938a.f81237c;
                C8938a.b("DownloadResultBroadcastReceiver onReceive was called");
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                long b11 = this.f66500a.b();
                if (longExtra != -1 && longExtra != b11) {
                    C8938a.b("Received download ID (" + longExtra + ") != saved download ID (" + b11 + ")");
                    return;
                }
                int b12 = C7085b.b(C7085b.a(context), longExtra);
                if (b12 != 8) {
                    C8938a.b("Download is not successful. Status: " + b12);
                    r02.invoke(Boolean.FALSE);
                } else {
                    r02.invoke(Boolean.TRUE);
                }
                C8938a.b("Unregister download broadcast receiver");
                context.unregisterReceiver(this);
            } catch (Exception e11) {
                int i12 = C8938a.f81237c;
                C8938a.c("Error during handling \"download complete\" action", e11);
                r02.invoke(Boolean.FALSE);
                C8938a.b("Unregister download broadcast receiver");
                context.unregisterReceiver(this);
            }
        } catch (Throwable th2) {
            int i13 = C8938a.f81237c;
            C8938a.b("Unregister download broadcast receiver");
            context.unregisterReceiver(this);
            throw th2;
        }
    }
}
