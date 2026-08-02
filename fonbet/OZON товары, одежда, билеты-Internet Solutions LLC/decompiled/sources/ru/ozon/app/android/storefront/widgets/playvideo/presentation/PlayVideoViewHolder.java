package ru.ozon.app.android.storefront.widgets.playvideo.presentation;

import Sc.o;
import UZ.a;
import UZ.d;
import Vg.c;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.t;
import android.view.View;
import d20.AbstractC6065b;
import hd.C6915b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonHolderKt;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonView;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelListAdapterImpl;
import ru.ozon.app.android.storefront.databinding.PlayVideoWidgetBinding;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoViewHolder;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.models.PlayVideoVO;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute.PlayVideoMuteButtonDelegate;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoViewModel;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoWidgetActions;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoWidgetViewState;
import ru.ozon.app.android.videomolecule.presentation.rv.VideoMoleculeBottomContainerAdapter;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeViewHolderFactory;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0018018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoVO;", "Ll10/i;", "container", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "videoMoleculeViewHolder", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/PlayVideoMuteButtonDelegate;", "muteButtonDelegate", "Lru/ozon/app/android/storefront/databinding/PlayVideoWidgetBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;", "playVideoViewModel", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoVisibilityDelegate;", "visibilityDelegate", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoEventsDelegate;", "playVideoEventsDelegate", "<init>", "(Ll10/i;Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeViewHolder;Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/PlayVideoMuteButtonDelegate;Lru/ozon/app/android/storefront/databinding/PlayVideoWidgetBinding;Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoVisibilityDelegate;LVg/c;Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoEventsDelegate;)V", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetActions$OrientationChanged;", "action", "", "onOrientationChange", "(Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetActions$OrientationChanged;)V", "model", "rebindPortrait", "(Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoVO;)V", "rebindLandScape", "bindEmptyState", "()V", "trackCloseVideoAnalytics", "item", "bind", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/mute/PlayVideoMuteButtonDelegate;", "Lru/ozon/app/android/storefront/databinding/PlayVideoWidgetBinding;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoVisibilityDelegate;", "LVg/c;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/videomolecule/presentation/rv/VideoMoleculeBottomContainerAdapter;", "bottomContainerAdapter", "Lru/ozon/app/android/videomolecule/presentation/rv/VideoMoleculeBottomContainerAdapter;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayVideoViewHolder extends AbstractC6065b<PlayVideoVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PlayVideoWidgetBinding binding;

    @NotNull
    private final VideoMoleculeBottomContainerAdapter bottomContainerAdapter;

    @NotNull
    private final i container;

    @NotNull
    private final c customActionHandlersStore;
    private final View metricView;

    @NotNull
    private final PlayVideoMuteButtonDelegate muteButtonDelegate;

    @NotNull
    private final PlayVideoViewModel playVideoViewModel;

    @NotNull
    private final VideoMoleculeViewHolder videoMoleculeViewHolder;

    @NotNull
    private final PlayVideoVisibilityDelegate visibilityDelegate;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isMuted", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            PlayVideoViewHolder.this.videoMoleculeViewHolder.switchMute();
            PlayVideoViewHolder.this.playVideoViewModel.onMuteChanged(z11);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetActions;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetActions;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<PlayVideoWidgetActions, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PlayVideoWidgetActions playVideoWidgetActions) {
            invoke2(playVideoWidgetActions);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PlayVideoWidgetActions playVideoWidgetActions) {
            if (playVideoWidgetActions instanceof PlayVideoWidgetActions.HasAudioChanged) {
                PlayVideoViewHolder.this.muteButtonDelegate.onModelStateChanged(PlayVideoViewHolder.this.playVideoViewModel.getState());
                return;
            }
            if (playVideoWidgetActions instanceof PlayVideoWidgetActions.MuteChanged) {
                PlayVideoViewHolder.this.muteButtonDelegate.onModelStateChanged(PlayVideoViewHolder.this.playVideoViewModel.getState());
                return;
            }
            if (playVideoWidgetActions instanceof PlayVideoWidgetActions.OrientationChanged) {
                PlayVideoViewHolder.this.onOrientationChange((PlayVideoWidgetActions.OrientationChanged) playVideoWidgetActions);
                PlayVideoViewHolder.this.muteButtonDelegate.onModelStateChanged(PlayVideoViewHolder.this.playVideoViewModel.getState());
            } else {
                if (!(playVideoWidgetActions instanceof PlayVideoWidgetActions.VisibilityChanged)) {
                    throw new o();
                }
                PlayVideoViewHolder.this.visibilityDelegate.onVisibilityChanged((PlayVideoWidgetActions.VisibilityChanged) playVideoWidgetActions, PlayVideoViewHolder.this.playVideoViewModel.getState());
            }
        }
    }

    public PlayVideoViewHolder(@NotNull i container, @NotNull VideoMoleculeViewHolder videoMoleculeViewHolder, @NotNull PlayVideoMuteButtonDelegate muteButtonDelegate, @NotNull PlayVideoWidgetBinding binding, @NotNull PlayVideoViewModel playVideoViewModel, @NotNull PlayVideoVisibilityDelegate visibilityDelegate, @NotNull c customActionHandlersStore, @NotNull PlayVideoEventsDelegate playVideoEventsDelegate) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(videoMoleculeViewHolder, "videoMoleculeViewHolder");
        Intrinsics.checkNotNullParameter(muteButtonDelegate, "muteButtonDelegate");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(playVideoViewModel, "playVideoViewModel");
        Intrinsics.checkNotNullParameter(visibilityDelegate, "visibilityDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(playVideoEventsDelegate, "playVideoEventsDelegate");
        this.container = container;
        this.videoMoleculeViewHolder = videoMoleculeViewHolder;
        this.muteButtonDelegate = muteButtonDelegate;
        this.binding = binding;
        this.playVideoViewModel = playVideoViewModel;
        this.visibilityDelegate = visibilityDelegate;
        this.customActionHandlersStore = customActionHandlersStore;
        this.metricView = binding.getConstraintLayout();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new PlayVideoViewHolder$actionHandler$1(this)).onPreProcess(new PlayVideoViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        VideoMoleculeBottomContainerAdapter videoMoleculeBottomContainerAdapter = new VideoMoleculeBottomContainerAdapter(new VideoMoleculeViewHolderFactory(container.X()), buildHandler);
        this.bottomContainerAdapter = videoMoleculeBottomContainerAdapter;
        binding.rightPannel.init(new RightPanelListAdapterImpl(container.X(), buildHandler));
        binding.moleculeView.attachAdapter(videoMoleculeBottomContainerAdapter);
        playVideoEventsDelegate.setup(videoMoleculeViewHolder);
        muteButtonDelegate.setOnMuteListener(new AnonymousClass2());
        playVideoViewModel.initState(new PlayVideoWidgetViewState(binding.moleculeView.getContext().getResources().getConfiguration().orientation, true, muteButtonDelegate.getMuteModel()));
        playVideoViewModel.getWidgetActions().observe(container.Q().g(), new PlayVideoViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
        videoMoleculeViewHolder.setPlayerViewTag("cms.playVideo");
    }

    private final void bindEmptyState() {
        VideoMoleculeBottomContainerAdapter videoMoleculeBottomContainerAdapter = this.bottomContainerAdapter;
        K k11 = K.f71697a;
        videoMoleculeBottomContainerAdapter.submitList(k11);
        PlayVideoWidgetBinding playVideoWidgetBinding = this.binding;
        playVideoWidgetBinding.rightPannel.bind(k11);
        SocialIconButtonView playVideoCloseButton = playVideoWidgetBinding.playVideoCloseButton;
        Intrinsics.checkNotNullExpressionValue(playVideoCloseButton, "playVideoCloseButton");
        ViewExtKt.gone(playVideoCloseButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChange(PlayVideoWidgetActions.OrientationChanged action) {
        if (getBoundData() != null) {
            this.visibilityDelegate.onOrientationChange(this.playVideoViewModel.getState());
        }
        if (action.getOrientation() == 1) {
            rebindPortrait(getBoundData());
        } else {
            rebindLandScape(getBoundData());
        }
    }

    private final void rebindLandScape(PlayVideoVO model) {
        if (model == null) {
            bindEmptyState();
        } else {
            this.bottomContainerAdapter.submitList(model.getLandScapeBottomContent());
            this.binding.rightPannel.bind(K.f71697a);
        }
    }

    private final void rebindPortrait(PlayVideoVO model) {
        if (model == null) {
            bindEmptyState();
            return;
        }
        PlayVideoWidgetBinding playVideoWidgetBinding = this.binding;
        playVideoWidgetBinding.rightPannel.bind(model.getRightPanel().getItems());
        this.bottomContainerAdapter.submitList(model.getPortraitBottomContent());
        SocialIconButtonView playVideoCloseButton = playVideoWidgetBinding.playVideoCloseButton;
        Intrinsics.checkNotNullExpressionValue(playVideoCloseButton, "playVideoCloseButton");
        SocialIconButtonHolderKt.bindOrGone(playVideoCloseButton, model.getTopContent().getCloseButton(), this.actionHandler);
    }

    private final void trackCloseVideoAnalytics() {
        t closeTokenizedEvent;
        PlayVideoVO boundData = getBoundData();
        if (boundData == null || (closeTokenizedEvent = boundData.getCloseTokenizedEvent()) == null) {
            return;
        }
        final long currentVideoDuration = this.videoMoleculeViewHolder.getCurrentVideoDuration();
        TokenizedAnalyticsExtensionsKt.processViewEvents(this.container.X(), closeTokenizedEvent, new e() { // from class: DL.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g trackCloseVideoAnalytics$lambda$3;
                trackCloseVideoAnalytics$lambda$3 = PlayVideoViewHolder.trackCloseVideoAnalytics$lambda$3(currentVideoDuration, (d) aVar, gVar);
                return trackCloseVideoAnalytics$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g trackCloseVideoAnalytics$lambda$3(long j11, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        int b11 = C6915b.b(j11 / 1000.0d);
        Map<String, Object> b12 = params.b();
        Pair[] pairs = {new Pair("video_finish_at", Integer.valueOf(b11))};
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap a11 = h.a(b12);
        U.o(a11, pairs);
        return g.a(params, a11, null, 2);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        trackCloseVideoAnalytics();
        this.videoMoleculeViewHolder.onRemove();
        ComposerViewExtensionKt.composerContainer(this.container.Y()).removeView(this.binding.moleculeView);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PlayVideoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.videoMoleculeViewHolder.bind(item.getVideo());
        this.bottomContainerAdapter.submitList(item.getPortraitBottomContent());
        this.binding.rightPannel.bind(item.getRightPanel().getItems());
        SocialIconButtonView playVideoCloseButton = this.binding.playVideoCloseButton;
        Intrinsics.checkNotNullExpressionValue(playVideoCloseButton, "playVideoCloseButton");
        SocialIconButtonHolderKt.bindOrGone(playVideoCloseButton, item.getTopContent().getCloseButton(), this.actionHandler);
        this.videoMoleculeViewHolder.showContent(false);
    }
}
