package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrackLastReceivedPartsUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;", "", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "userIdentity", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/UserIdentity;", "<init>", "(Lio/intercom/android/sdk/metrics/MetricTracker;Lkotlin/jvm/functions/Function0;)V", "currentConversation", "Lio/intercom/android/sdk/models/Conversation;", "invoke", "", "newConversation", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackLastReceivedPartsUseCase {
    public static final int $stable = 8;
    private Conversation currentConversation;
    private final MetricTracker metricTracker;
    private final Function0<UserIdentity> userIdentity;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase(MetricTracker metricTracker, Function0<? extends UserIdentity> userIdentity) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.currentConversation = new Conversation(null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public /* synthetic */ TrackLastReceivedPartsUseCase(MetricTracker metricTracker, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i & 2) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UserIdentity _init_$lambda$0;
                _init_$lambda$0 = TrackLastReceivedPartsUseCase._init_$lambda$0();
                return _init_$lambda$0;
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$0() {
        return Injector.get().getUserIdentity();
    }

    public final synchronized void invoke(Conversation newConversation) {
        List<Part> emptyList;
        Intrinsics.checkNotNullParameter(newConversation, "newConversation");
        int size = this.currentConversation.parts().size();
        int size2 = newConversation.parts().size();
        if (size == 0 && this.currentConversation.getTicket() == null) {
            if (!newConversation.isRead() && newConversation.lastPart().isReply()) {
                emptyList = CollectionsKt.listOf(newConversation.lastPart());
            } else {
                emptyList = CollectionsKt.emptyList();
            }
        } else if (size2 > size) {
            emptyList = newConversation.parts().subList(size, size2);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        ArrayList<Part> arrayList = new ArrayList();
        for (Object obj : emptyList) {
            Part part = (Part) obj;
            if (part.isAdmin() || (!part.getParticipant().isUserWithId(this.userIdentity.invoke().getIntercomId()) && !Intrinsics.areEqual(part, Part.NULL))) {
                arrayList.add(obj);
            }
        }
        for (Part part2 : arrayList) {
            this.metricTracker.receivedReply(part2.hasAttachments(), PartExtensionsKt.isLinkCard(part2), part2.getId(), newConversation.getId());
            if (Intrinsics.areEqual(part2.getId(), ((Part) CollectionsKt.last((List) emptyList)).getId())) {
                List<ReplyOption> replyOptions = part2.getReplyOptions();
                Intrinsics.checkNotNullExpressionValue(replyOptions, "getReplyOptions(...)");
                Iterator<T> it = replyOptions.iterator();
                while (it.hasNext()) {
                    this.metricTracker.receivedQuickReply(((ReplyOption) it.next()).getUuid(), newConversation.getId(), part2.getId());
                }
            }
        }
        this.currentConversation = newConversation;
    }
}
