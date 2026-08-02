package ru.ozon.app.android.fresh.unsorted.utils;

import android.content.Context;
import androidx.core.app.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/utils/NotificationHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "areSystemNotificationsTurnedOn", "(Landroid/content/Context;)Z", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationHelper {

    @NotNull
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    private NotificationHelper() {
    }

    public final boolean areSystemNotificationsTurnedOn(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n.e(context).a();
    }
}
