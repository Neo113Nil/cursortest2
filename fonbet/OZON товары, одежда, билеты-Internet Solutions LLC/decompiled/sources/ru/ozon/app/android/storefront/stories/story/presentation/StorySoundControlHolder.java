package ru.ozon.app.android.storefront.stories.story.presentation;

import WZ.l;
import WZ.t;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.stories.story.data.StorySoundControlDTO;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u001e\u0010%\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010'\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StorySoundControlHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "onMuteClicked", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "action", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "soundTrackingInfo", "sendAnalytic", "(LWZ/t;)V", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "item", "isSoundMuted", "", "widgetId", "bind", "(Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;Ljava/lang/Boolean;Ljava/lang/Long;)V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "", "muteActionId", "Ljava/lang/String;", "unmuteActionId", "muteTokenizedEvent", "LWZ/t;", "unmuteTokenizedEvent", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StorySoundControlHolder extends j {

    @NotNull
    private final SmallIconButtonView containerView;

    @NotNull
    private String muteActionId;
    private t muteTokenizedEvent;
    private final Function1<AtomAction, Unit> onAction;
    private final Function1<Boolean, Unit> onMuteClicked;
    private final ComposerReferences refs;

    @NotNull
    private String unmuteActionId;
    private t unmuteTokenizedEvent;

    public /* synthetic */ StorySoundControlHolder(SmallIconButtonView smallIconButtonView, ComposerReferences composerReferences, Function1 function1, Function1 function12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(smallIconButtonView, (i11 & 2) != 0 ? null : composerReferences, function1, (i11 & 8) != 0 ? null : function12);
    }

    public static /* synthetic */ void bind$default(StorySoundControlHolder storySoundControlHolder, StorySoundControlDTO storySoundControlDTO, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        storySoundControlHolder.bind(storySoundControlDTO, bool, l11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction action) {
        String id2 = action.getId();
        if (Intrinsics.d(id2, this.muteActionId)) {
            sendAnalytic(this.muteTokenizedEvent);
            Function1<Boolean, Unit> function1 = this.onMuteClicked;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (!Intrinsics.d(id2, this.unmuteActionId)) {
            Function1<AtomAction, Unit> function12 = this.onAction;
            if (function12 != null) {
                function12.invoke(action);
                return;
            }
            return;
        }
        sendAnalytic(this.unmuteTokenizedEvent);
        Function1<Boolean, Unit> function13 = this.onMuteClicked;
        if (function13 != null) {
            function13.invoke(Boolean.FALSE);
        }
    }

    private final void sendAnalytic(t soundTrackingInfo) {
        ComposerReferences composerReferences;
        l tokenizedAnalytics;
        if (soundTrackingInfo == null || (composerReferences = this.refs) == null || (tokenizedAnalytics = composerReferences.getTokenizedAnalytics()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(tokenizedAnalytics, soundTrackingInfo, null, 2, null);
    }

    public final void bind(@NotNull StorySoundControlDTO item, Boolean isSoundMuted, Long widgetId) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomActionDTO action = item.getMuteButton().getAction();
        String id2 = action != null ? action.getId() : null;
        if (id2 == null) {
            id2 = "";
        }
        this.muteActionId = id2;
        AtomActionDTO action2 = item.getUnmuteButton().getAction();
        String id3 = action2 != null ? action2.getId() : null;
        this.unmuteActionId = id3 != null ? id3 : "";
        if (widgetId != null) {
            Map<String, TokenizedTrackingInfo> trackingInfo = item.getMuteButton().getTrackingInfo();
            this.muteTokenizedEvent = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, widgetId, null, 2, null) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getUnmuteButton().getTrackingInfo();
            this.unmuteTokenizedEvent = trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, widgetId, null, 2, null) : null;
        }
        if (Intrinsics.d(isSoundMuted, Boolean.FALSE)) {
            SmallIconButtonView smallIconButtonView = this.containerView;
            WrappedIconButtonHolderKt.bind(smallIconButtonView, item.getMuteButton(), new StorySoundControlHolder$bind$2$1(this));
            smallIconButtonView.setContentDescription(item.getMuteButton().getIcon());
        } else {
            SmallIconButtonView smallIconButtonView2 = this.containerView;
            WrappedIconButtonHolderKt.bind(smallIconButtonView2, item.getUnmuteButton(), new StorySoundControlHolder$bind$1$1(this));
            smallIconButtonView2.setContentDescription(item.getUnmuteButton().getIcon());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StorySoundControlHolder(@NotNull SmallIconButtonView containerView, ComposerReferences composerReferences, Function1<? super AtomAction, Unit> function1, Function1<? super Boolean, Unit> function12) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.refs = composerReferences;
        this.onAction = function1;
        this.onMuteClicked = function12;
        this.muteActionId = "";
        this.unmuteActionId = "";
    }
}
