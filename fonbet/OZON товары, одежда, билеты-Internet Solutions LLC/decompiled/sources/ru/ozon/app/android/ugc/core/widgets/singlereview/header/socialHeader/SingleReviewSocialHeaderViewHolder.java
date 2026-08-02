package ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader;

import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.CellExtKt;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderViewMapper;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0016\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R'\u00103\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00100-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;", "Lru/ozon/uni/android/cell/CellView;", "headerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;LVg/d;)V", "", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "LVg/d;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewHolder$SocialHeaderType;", "socialHeaderType", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewHolder$SocialHeaderType;", "getSocialHeaderType", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewHolder$SocialHeaderType;", "setSocialHeaderType", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewHolder$SocialHeaderType;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Ll10/b;", "getController", "()Ll10/b;", "controller", "SocialHeaderType", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewSocialHeaderViewHolder extends k<SingleReviewSocialHeaderVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final CellView headerView;

    @NotNull
    private SocialHeaderType socialHeaderType;

    @NotNull
    private final SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewHolder$SocialHeaderType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "TOP_AUTHOR", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SocialHeaderType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SocialHeaderType[] $VALUES;
        public static final SocialHeaderType DEFAULT = new SocialHeaderType("DEFAULT", 0);
        public static final SocialHeaderType TOP_AUTHOR = new SocialHeaderType("TOP_AUTHOR", 1);

        private static final /* synthetic */ SocialHeaderType[] $values() {
            return new SocialHeaderType[]{DEFAULT, TOP_AUTHOR};
        }

        static {
            SocialHeaderType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SocialHeaderType(String str, int i11) {
        }

        public static SocialHeaderType valueOf(String str) {
            return (SocialHeaderType) Enum.valueOf(SocialHeaderType.class, str);
        }

        public static SocialHeaderType[] values() {
            return (SocialHeaderType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewSocialHeaderViewHolder(@NotNull CellView headerView, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage, @NotNull d customActionHandlersStoreFactory) {
        super(headerView);
        Intrinsics.checkNotNullParameter(headerView, "headerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.headerView = headerView;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.subscribeAuthorsIdStorage = subscribeAuthorsIdStorage;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.socialHeaderType = SocialHeaderType.DEFAULT;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new SingleReviewSocialHeaderViewHolder$actionHandler$2(this));
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final InterfaceC7851b getController() {
        return this.composerReferences.getController();
    }

    @NotNull
    public final SocialHeaderType getSocialHeaderType() {
        return this.socialHeaderType;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        String rightBlockParam;
        Boolean isAuthorSubscribed;
        super.onAttach();
        SingleReviewSocialHeaderVO boundData = getBoundData();
        if (boundData == null || (isAuthorSubscribed = this.subscribeAuthorsIdStorage.isAuthorSubscribed((rightBlockParam = CellExtKt.getRightBlockParam(boundData.getSubscribe(), "authorId")))) == null) {
            return;
        }
        boolean booleanValue = isAuthorSubscribed.booleanValue();
        if (booleanValue && boundData.getIsSubscribed()) {
            getController().update(new SubscribeAuthorUpdateKey(rightBlockParam));
        } else {
            if (booleanValue || boundData.getIsSubscribed()) {
                return;
            }
            getController().update(new UnsubscribeAuthorUpdateKey(rightBlockParam));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SingleReviewSocialHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SingleReviewSocialHeaderViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        t tileReviewTokenizedEvent = item.getTileReviewTokenizedEvent();
        if (tileReviewTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tileReviewTokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleReviewSocialHeaderVO item, @NotNull l20.d info) {
        SocialHeaderType socialHeaderType;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getIsTopAuthor()) {
            socialHeaderType = SocialHeaderType.TOP_AUTHOR;
        } else {
            socialHeaderType = SocialHeaderType.DEFAULT;
        }
        this.socialHeaderType = socialHeaderType;
        String rightBlockParam = CellExtKt.getRightBlockParam(item.getSubscribe(), "authorId");
        Boolean isAuthorSubscribed = this.subscribeAuthorsIdStorage.isAuthorSubscribed(rightBlockParam);
        if (isAuthorSubscribed != null ? isAuthorSubscribed.booleanValue() : item.getIsSubscribed()) {
            getController().update(new SubscribeAuthorUpdateKey(rightBlockParam));
            CellHolderKt.bind(this.headerView, item.getSubscribed(), getActionHandler());
        } else {
            getController().update(new UnsubscribeAuthorUpdateKey(rightBlockParam));
            CellHolderKt.bind(this.headerView, item.getSubscribe(), getActionHandler());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleReviewSocialHeaderVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        super.bind((SingleReviewSocialHeaderViewHolder) item, info, payload);
        if (payload == SingleReviewSocialHeaderViewMapper.SingleReviewSocialHeaderPayload.UPDATED) {
            bind(item, info);
        }
    }
}
