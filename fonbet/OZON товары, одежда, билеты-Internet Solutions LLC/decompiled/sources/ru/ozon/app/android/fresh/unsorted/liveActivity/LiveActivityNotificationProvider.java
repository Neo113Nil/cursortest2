package ru.ozon.app.android.fresh.unsorted.liveActivity;

import android.app.Notification;
import ch0.C5835a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;", "", "Lch0/a;", "state", "", "channelId", "Landroid/app/Notification;", "provideNotification", "(Lch0/a;Ljava/lang/String;)Landroid/app/Notification;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LiveActivityNotificationProvider {
    @NotNull
    Notification provideNotification(@NotNull C5835a state, @NotNull String channelId);
}
