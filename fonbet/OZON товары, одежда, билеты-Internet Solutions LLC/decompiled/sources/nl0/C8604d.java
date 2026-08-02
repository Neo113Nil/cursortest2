package nl0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.activitylauncher.RuStoreActivityLauncher;

/* renamed from: nl0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8604d {
    public static final void a(@NotNull Context context, @NotNull Intent confirmationIntent, @NotNull InterfaceC8605e callback) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(confirmationIntent, "intent");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i11 = RuStoreActivityLauncher.f97944c;
        ResultReceiverC8603c resultReceiver = new ResultReceiverC8603c(callback);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(confirmationIntent, "confirmationIntent");
        Intent intent = new Intent(context, (Class<?>) RuStoreActivityLauncher.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        intent.putExtra("RESULT_RECEIVER", resultReceiver);
        intent.putExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.getActivity(context, 0, confirmationIntent, 1140850688));
        context.startActivity(intent);
    }
}
