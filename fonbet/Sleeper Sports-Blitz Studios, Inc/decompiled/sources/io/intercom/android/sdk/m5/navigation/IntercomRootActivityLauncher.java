package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomRootActivityLauncher.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityLauncher;", "", "<init>", "()V", "startHome", "", "context", "Landroid/content/Context;", "startMessages", "startTickets", "startTicketDetails", "ticketId", "", "from", "startHelpCenterCollections", "collectionIds", "", "metricPlace", "startHelpCenterCollection", "collectionId", "place", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomRootActivityLauncher {
    public static final int $stable = 0;
    public static final IntercomRootActivityLauncher INSTANCE = new IntercomRootActivityLauncher();

    private IntercomRootActivityLauncher() {
    }

    public final void startHome(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.HomeScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startMessages(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startTickets(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.TicketsScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startTicketDetails(Context context, String ticketId, String from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(from, "from");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.TicketDetailsScreenArgs(ticketId, from), null, null, 12, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startHelpCenterCollections$default(IntercomRootActivityLauncher intercomRootActivityLauncher, Context context, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        intercomRootActivityLauncher.startHelpCenterCollections(context, list, str);
    }

    public final void startHelpCenterCollections(Context context, List<String> collectionIds, String metricPlace) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionsArgs(collectionIds, metricPlace), null, null, 12, null));
    }

    public final void startHelpCenterCollection(Context context, String collectionId, String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(place, "place");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionArgs(collectionId, place), null, null, 12, null));
    }
}
