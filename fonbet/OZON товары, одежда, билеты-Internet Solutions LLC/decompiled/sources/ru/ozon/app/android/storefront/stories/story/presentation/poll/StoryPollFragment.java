package ru.ozon.app.android.storefront.stories.story.presentation.poll;

import Pc.a;
import Sc.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.atoms.data.authorBlock.AuthorBlock;
import ru.ozon.app.android.atoms.v3.holders.authorBlock.AuthorBlockHolderKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.authorBlock.AuthorBlockView;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.storefront.databinding.MoleculeStoryItemPollBinding;
import ru.ozon.app.android.storefront.stories.story.data.Direction;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMoleculeKt;
import ru.ozon.app.android.storefront.stories.story.data.StoryQuestion;
import ru.ozon.app.android.storefront.stories.story.data.StoryText;
import ru.ozon.app.android.storefront.stories.story.data.StoryType;
import ru.ozon.app.android.storefront.stories.story.data.StoryWithImage;
import ru.ozon.app.android.storefront.stories.story.data.StoryWithPoll;
import ru.ozon.app.android.storefront.stories.story.di.DaggerStoryMoleculeComponent;
import ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.NavigationType;
import ru.ozon.app.android.storefront.stories.story.presentation.PlaybackType;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemEvent;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.LayoutStrategy;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.MobileLayoutStrategy;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.TabletLayoutStrategy;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0004J%\u0010)\u001a\u00020\u00072\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00072\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u0010\u0004J\u001b\u00105\u001a\u00020\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0004J\u0017\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;JC\u0010A\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bC\u0010DJ!\u0010H\u001a\u00020\u00072\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010K\u001a\u00020\u00072\b\u0010J\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bK\u00106J)\u0010L\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010>2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00072\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bN\u0010;J\u000f\u0010O\u001a\u00020\u0007H\u0002¢\u0006\u0004\bO\u0010\u0004J\u000f\u0010P\u001a\u00020\u0007H\u0002¢\u0006\u0004\bP\u0010\u0004J\u000f\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bQ\u0010\u0004J\u0017\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u00020&H\u0002¢\u0006\u0004\bS\u00106R(\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020T8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020&0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollFragment;", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollViewModel;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindItem", "onResume", "onPause", "onDestroyView", "onTransitionStart", "attachClickableLayoutListener", "detachClickableLayoutListener", "setupCloseButton", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "provideLayoutStrategy", "()Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "updateImageSize", "onCloseStoryScreen", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "trackView", "(Ljava/util/Map;)V", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "answers", "setupStoryTimeline", "(Ljava/util/List;)V", "observeStateEvents", "observeNavigationEvents", "observePlaybackEvents", "onItemLoaded", "next", "onNext", "(Ljava/lang/String;)V", "onPrevious", "Lru/ozon/app/android/storefront/stories/story/data/StoryQuestion;", "question", "loadQuestion", "(Lru/ozon/app/android/storefront/stories/story/data/StoryQuestion;)V", "Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "storyText", "Lru/ozon/app/android/storefront/stories/story/data/Direction;", "direction", "buttons", "setupContent", "(Lru/ozon/app/android/storefront/stories/story/data/StoryText;Lru/ozon/app/android/storefront/stories/story/data/Direction;Ljava/util/List;Ljava/util/List;)V", "setupContentHeader", "(Lru/ozon/app/android/storefront/stories/story/data/StoryText;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "bindTitleTAV", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "backgroundColor", "setupHeaderBackground", "setupAnswers", "(Lru/ozon/app/android/storefront/stories/story/data/Direction;Ljava/util/List;)V", "onImageLoadSuccessful", "startPlayback", "pausePlayback", "restartPlayback", "errorString", "onError", "LPc/a;", "provider", "LPc/a;", "getProvider", "()LPc/a;", "setProvider", "(LPc/a;)V", "", "dp16", "I", "dp12", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "molecule", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "Lru/ozon/app/android/storefront/stories/story/data/StoryWithPoll;", "moleculeData", "Lru/ozon/app/android/storefront/stories/story/data/StoryWithPoll;", "Lkotlin/collections/k;", "itemIndexStack", "Lkotlin/collections/k;", "currentItemIndex", "Ljava/lang/String;", "", "contentWasLoaded", "Z", "tapsEnabled", "Lru/ozon/app/android/storefront/databinding/MoleculeStoryItemPollBinding;", "mBinding", "Lru/ozon/app/android/storefront/databinding/MoleculeStoryItemPollBinding;", "getBinding", "()Lru/ozon/app/android/storefront/databinding/MoleculeStoryItemPollBinding;", "binding", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryPollFragment extends BaseStoryFragment<StoryPollViewModel> {
    private boolean contentWasLoaded;
    private MoleculeStoryItemPollBinding mBinding;
    private StoryCommonMolecule molecule;
    private StoryWithPoll moleculeData;
    public a<StoryPollViewModel> provider;
    private boolean tapsEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final int dp16 = ResourceExtKt.toPx(16);
    private final int dp12 = ResourceExtKt.toPx(12);

    @NotNull
    private C7704k<String> itemIndexStack = new C7704k<>();

    @NotNull
    private String currentItemIndex = "1";

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollFragment$Companion;", "", "<init>", "()V", "PARAM_NEXT", "", "POLL_STORY_MOLECULE", "STORY_SPAN", "DEFAULT_SPAN", "", "DEFAULT_START_POSITION", "newInstance", "Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollFragment;", "molecule", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "span", "", "(Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollFragment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StoryPollFragment newInstance(@NotNull StoryCommonMolecule molecule, Integer span) {
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            Bundle bundle = new Bundle();
            bundle.putLong("STORY_SPAN", span != null ? span.intValue() : 6000L);
            bundle.putParcelable("POLL_STORY_MOLECULE", molecule);
            StoryPollFragment storyPollFragment = new StoryPollFragment();
            storyPollFragment.setArguments(bundle);
            return storyPollFragment;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.DIRECTION_HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DIRECTION_VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void bindTitleTAV(TextAtom title, TextAtom subtitle) {
        MoleculeStoryItemPollBinding binding = getBinding();
        TextAtomView titleTAV = binding.titleTAV;
        Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
        TextAtomHolderKt.bind$default(titleTAV, title, null, 2, null);
        int i11 = subtitle == null ? 0 : this.dp12;
        TextAtomView titleTAV2 = binding.titleTAV;
        Intrinsics.checkNotNullExpressionValue(titleTAV2, "titleTAV");
        ViewGroup.LayoutParams layoutParams = titleTAV2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i11);
        titleTAV2.setLayoutParams(marginLayoutParams);
    }

    private final MoleculeStoryItemPollBinding getBinding() {
        MoleculeStoryItemPollBinding moleculeStoryItemPollBinding = this.mBinding;
        Intrinsics.f(moleculeStoryItemPollBinding);
        return moleculeStoryItemPollBinding;
    }

    private final void loadQuestion(final StoryQuestion question) {
        Unit unit;
        Bitmap bitmapFromCache;
        final MoleculeStoryItemPollBinding binding = getBinding();
        ImageView storyItemIV = binding.storyItemIV;
        Intrinsics.checkNotNullExpressionValue(storyItemIV, "storyItemIV");
        if (storyItemIV.getVisibility() == 8) {
            ImageView storyItemIV2 = binding.storyItemIV;
            Intrinsics.checkNotNullExpressionValue(storyItemIV2, "storyItemIV");
            ViewExtKt.show(storyItemIV2);
        }
        setupStoryTimeline(question.getAnswers());
        List<ButtonV3Atom.LargeButton> answers = question.getAnswers();
        this.tapsEnabled = answers == null || answers.isEmpty();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Integer parseColor = styleParser.parseColor(requireContext, question.getBackgroundColor());
        binding.rootSICL.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        final StoryWithImage image = question.getImage();
        if (image != null) {
            ProgressBar loadingPB = binding.loadingPB;
            Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
            ViewExtKt.show(loadingPB);
            StoryPollViewModel viewModel = getViewModel();
            if (viewModel == null || (bitmapFromCache = viewModel.getBitmapFromCache(image.getImageUrl())) == null) {
                binding.timeLine.pause();
                ImageView storyItemIV3 = binding.storyItemIV;
                Intrinsics.checkNotNullExpressionValue(storyItemIV3, "storyItemIV");
                ImageViewExtKt.loadAsBitmapInscribedSize$default(storyItemIV3, image.getImageUrl(), getTransformations(image.getAlign()), new PikazonLoaderCallback<Bitmap>() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment$loadQuestion$1$1$2$1
                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadFailed(Exception e11) {
                        StoryPollViewModel viewModel2;
                        String str;
                        viewModel2 = StoryPollFragment.this.getViewModel();
                        if (viewModel2 != null) {
                            str = StoryPollFragment.this.currentItemIndex;
                            viewModel2.onLoadFailed(Integer.parseInt(str), StringProvider.getString(R$string.common_message_no_connection));
                        }
                    }

                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadSuccessful(Bitmap resource) {
                        StoryPollViewModel viewModel2;
                        StoryPollFragment.this.onImageLoadSuccessful(question);
                        if (resource != null) {
                            StoryPollFragment storyPollFragment = StoryPollFragment.this;
                            StoryWithImage storyWithImage = image;
                            viewModel2 = storyPollFragment.getViewModel();
                            if (viewModel2 != null) {
                                viewModel2.putStoryImageInCache(storyWithImage.getImageUrl(), resource);
                            }
                        }
                        ImageView imageView = binding.storyBackgroundIv;
                        if (imageView != null) {
                            StoryPollFragment.this.setBlurredBackground(imageView, resource);
                        }
                    }
                }, null, InscribedUrlProcessor.InscribedWidth.INSTANCE, 8, null);
            } else {
                binding.storyItemIV.setImageBitmap(bitmapFromCache);
                ImageView imageView = binding.storyBackgroundIv;
                if (imageView != null) {
                    setBlurredBackground(imageView, bitmapFromCache);
                }
                onImageLoadSuccessful(question);
            }
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            onImageLoadSuccessful(question);
        }
        TextView textView = getBinding().tagTitleTV;
        String tagTitle = question.getTagTitle();
        if (tagTitle != null) {
            textView.setText(tagTitle);
            ViewExtKt.show(textView);
        } else {
            Intrinsics.f(textView);
            ViewExtKt.gone(textView);
        }
    }

    private final void observeNavigationEvents() {
        SingleLiveEvent<NavigationType> storyNavigationEvent;
        StoryPollViewModel viewModel = getViewModel();
        if (viewModel == null || (storyNavigationEvent = viewModel.getStoryNavigationEvent()) == null) {
            return;
        }
        storyNavigationEvent.observe(this, new StoryPollFragment$sam$androidx_lifecycle_Observer$0(new StoryPollFragment$observeNavigationEvents$1(this)));
    }

    private final void observePlaybackEvents() {
        SingleLiveEvent<PlaybackType> storyPlaybackEvent;
        StoryPollViewModel viewModel = getViewModel();
        if (viewModel == null || (storyPlaybackEvent = viewModel.getStoryPlaybackEvent()) == null) {
            return;
        }
        storyPlaybackEvent.observe(this, new StoryPollFragment$sam$androidx_lifecycle_Observer$0(new StoryPollFragment$observePlaybackEvents$1(this)));
    }

    private final void observeStateEvents() {
        SingleLiveEvent<StoryItemEvent> storyStateEvent;
        StoryPollViewModel viewModel = getViewModel();
        if (viewModel == null || (storyStateEvent = viewModel.getStoryStateEvent()) == null) {
            return;
        }
        storyStateEvent.observe(this, new StoryPollFragment$sam$androidx_lifecycle_Observer$0(new StoryPollFragment$observeStateEvents$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(String errorString) {
        MoleculeStoryItemPollBinding binding = getBinding();
        binding.retryTv.setText(errorString);
        binding.retryTv.setOnClickListener(new Sx.a(5, binding, this));
        TextView retryTv = binding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.show(retryTv);
        ProgressBar loadingPB = binding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.gone(loadingPB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$50$lambda$49(MoleculeStoryItemPollBinding moleculeStoryItemPollBinding, StoryPollFragment storyPollFragment, View view) {
        TextView retryTv = moleculeStoryItemPollBinding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.gone(retryTv);
        ProgressBar loadingPB = moleculeStoryItemPollBinding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.show(loadingPB);
        StoryWithPoll storyWithPoll = storyPollFragment.moleculeData;
        if (storyWithPoll == null) {
            Intrinsics.n("moleculeData");
            throw null;
        }
        StoryQuestion storyQuestion = storyWithPoll.getQuestions().get(storyPollFragment.currentItemIndex);
        if (storyQuestion != null) {
            storyPollFragment.loadQuestion(storyQuestion);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageLoadSuccessful(StoryQuestion question) {
        MoleculeStoryItemPollBinding binding = getBinding();
        ProgressBar loadingPB = binding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.gone(loadingPB);
        this.contentWasLoaded = true;
        StoryPollViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.onImageLoadSuccessful(Integer.parseInt(this.currentItemIndex));
        }
        setupContent(question.getText(), question.getDirection(), question.getAnswers(), question.getButtons());
        if (isResumed()) {
            binding.timeLine.play();
        }
        TextView retryTv = binding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.gone(retryTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemLoaded() {
        ProgressBar loadingPB = getBinding().loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.gone(loadingPB);
        startPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNext(String next) {
        if (next == null) {
            StoryWithPoll storyWithPoll = this.moleculeData;
            if (storyWithPoll == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            StoryQuestion storyQuestion = storyWithPoll.getQuestions().get(this.currentItemIndex);
            next = storyQuestion != null ? storyQuestion.getNext() : null;
        }
        if (next != null) {
            StoryWithPoll storyWithPoll2 = this.moleculeData;
            if (storyWithPoll2 == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            StoryQuestion storyQuestion2 = storyWithPoll2.getQuestions().get(next);
            Pair pair = storyQuestion2 != null ? new Pair(next, storyQuestion2) : null;
            if (pair != null) {
                this.itemIndexStack.addLast(this.currentItemIndex);
                this.currentItemIndex = (String) pair.e();
                loadQuestion((StoryQuestion) pair.f());
                return;
            }
        }
        StoryCallback storyCallback = getStoryCallback();
        if (storyCallback != null) {
            storyCallback.onNextClicked();
        }
    }

    static /* synthetic */ void onNext$default(StoryPollFragment storyPollFragment, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        storyPollFragment.onNext(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrevious() {
        C7704k<String> c7704k = this.itemIndexStack;
        String removeLast = c7704k.isEmpty() ? null : c7704k.removeLast();
        if (removeLast != null) {
            StoryWithPoll storyWithPoll = this.moleculeData;
            if (storyWithPoll == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            StoryQuestion storyQuestion = storyWithPoll.getQuestions().get(removeLast);
            Pair pair = storyQuestion != null ? new Pair(removeLast, storyQuestion) : null;
            if (pair != null) {
                this.currentItemIndex = (String) pair.e();
                loadQuestion((StoryQuestion) pair.f());
                return;
            }
        }
        StoryCallback storyCallback = getStoryCallback();
        if (storyCallback != null) {
            storyCallback.onPreviousClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pausePlayback() {
        getBinding().timeLine.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartPlayback() {
        bindItem();
    }

    private final void setupAnswers(Direction direction, final List<ButtonV3Atom.LargeButton> answers) {
        if (direction != null) {
            AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
            atomsAdapter.setOnAction(new StoryPollFragment$setupAnswers$1$atomsAdapter$1$1(this));
            int i11 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
            Unit unit = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new o();
                }
                if (answers != null) {
                    VerticalAtomsLayout verticalAtomsLayout = getBinding().answersContainerVAL;
                    verticalAtomsLayout.setAdapter(atomsAdapter);
                    Context requireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    verticalAtomsLayout.setDecorator(new VerticalItemDecorator(requireContext));
                    Context requireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    atomsAdapter.bind(requireContext2, answers);
                    HorizontalFlexAtomsLayout answersContainerHFAL = getBinding().answersContainerHFAL;
                    Intrinsics.checkNotNullExpressionValue(answersContainerHFAL, "answersContainerHFAL");
                    ViewExtKt.gone(answersContainerHFAL);
                    ViewExtKt.show(verticalAtomsLayout);
                    unit = Unit.f71690a;
                }
            } else if (answers != null) {
                final HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = getBinding().answersContainerHFAL;
                horizontalFlexAtomsLayout.setAdapter(atomsAdapter);
                Context requireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                horizontalFlexAtomsLayout.setDecorator(new FlexboxItemDecorator(requireContext3));
                Context requireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                atomsAdapter.bind(requireContext4, answers);
                ViewExtKt.show(horizontalFlexAtomsLayout);
                VerticalAtomsLayout answersContainerVAL = getBinding().answersContainerVAL;
                Intrinsics.checkNotNullExpressionValue(answersContainerVAL, "answersContainerVAL");
                ViewExtKt.gone(answersContainerVAL);
                horizontalFlexAtomsLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment$setupAnswers$lambda$45$lambda$42$lambda$41$$inlined$doOnNextLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        int i12;
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        Intrinsics.f(HorizontalFlexAtomsLayout.this);
                        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout2 = HorizontalFlexAtomsLayout.this;
                        int childCount = horizontalFlexAtomsLayout2.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = horizontalFlexAtomsLayout2.getChildAt(i13);
                            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            int width = view.getWidth() / answers.size();
                            i12 = this.dp16;
                            layoutParams.width = width - (i12 / answers.size());
                            childAt.setLayoutParams(layoutParams);
                        }
                    }
                });
                unit = Unit.f71690a;
            }
            if (unit != null) {
                return;
            }
        }
        MoleculeStoryItemPollBinding binding = getBinding();
        HorizontalFlexAtomsLayout answersContainerHFAL2 = binding.answersContainerHFAL;
        Intrinsics.checkNotNullExpressionValue(answersContainerHFAL2, "answersContainerHFAL");
        ViewExtKt.gone(answersContainerHFAL2);
        VerticalAtomsLayout answersContainerVAL2 = binding.answersContainerVAL;
        Intrinsics.checkNotNullExpressionValue(answersContainerVAL2, "answersContainerVAL");
        ViewExtKt.gone(answersContainerVAL2);
    }

    private final void setupContent(StoryText storyText, Direction direction, List<ButtonV3Atom.LargeButton> answers, List<ButtonV3Atom.LargeButton> buttons) {
        setupContentHeader(storyText);
        setupAnswers(direction, answers);
        if (buttons == null) {
            VerticalAtomsLayout buttonsContainerVAL = getBinding().buttonsContainerVAL;
            Intrinsics.checkNotNullExpressionValue(buttonsContainerVAL, "buttonsContainerVAL");
            ViewExtKt.gone(buttonsContainerVAL);
            return;
        }
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(new StoryPollFragment$setupContent$1$atomsAdapter$1$1(this));
        VerticalAtomsLayout verticalAtomsLayout = getBinding().buttonsContainerVAL;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        verticalAtomsLayout.setDecorator(new VerticalItemDecorator(requireContext));
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        atomsAdapter.bind(requireContext2, buttons);
        ViewExtKt.show(verticalAtomsLayout);
    }

    private final void setupContentHeader(StoryText storyText) {
        MoleculeStoryItemPollBinding binding = getBinding();
        if (storyText == null) {
            TextAtomView titleTAV = binding.titleTAV;
            Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
            ViewExtKt.gone(titleTAV);
            TextAtomView subtitleTAV = binding.subtitleTAV;
            Intrinsics.checkNotNullExpressionValue(subtitleTAV, "subtitleTAV");
            ViewExtKt.gone(subtitleTAV);
            LinearLayoutCompat textContentLLC = binding.textContentLLC;
            Intrinsics.checkNotNullExpressionValue(textContentLLC, "textContentLLC");
            ViewExtKt.gone(textContentLLC);
            return;
        }
        setupHeaderBackground(storyText.getBackgroundColor());
        bindTitleTAV(storyText.getTitle(), storyText.getSubtitle());
        TextAtomView subtitleTAV2 = binding.subtitleTAV;
        Intrinsics.checkNotNullExpressionValue(subtitleTAV2, "subtitleTAV");
        TextAtomHolderKt.bindOrGone$default(subtitleTAV2, storyText.getSubtitle(), null, 2, null);
        binding.textContentLLC.setGravity(StoryCommonMoleculeKt.mapToGravity(storyText.getAlign()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Integer parseColor = styleParser.parseColor(requireContext, storyText.getBackgroundColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            binding.titleTAV.setBackgroundColor(intValue);
            binding.subtitleTAV.setBackgroundColor(intValue);
        } else {
            binding.titleTAV.setBackgroundColor(0);
            binding.subtitleTAV.setBackgroundColor(0);
        }
        LinearLayoutCompat textContentLLC2 = binding.textContentLLC;
        Intrinsics.checkNotNullExpressionValue(textContentLLC2, "textContentLLC");
        ViewExtKt.show(textContentLLC2);
    }

    private final void setupHeaderBackground(String backgroundColor) {
        if (backgroundColor == null) {
            MoleculeStoryItemPollBinding binding = getBinding();
            binding.titleTAV.setBackgroundColor(0);
            binding.subtitleTAV.setBackgroundColor(0);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int parseColor = styleParser.parseColor(requireContext, backgroundColor, UniColors.LAYER_FLOOR_0.getResId());
        MoleculeStoryItemPollBinding binding2 = getBinding();
        binding2.titleTAV.setBackgroundColor(parseColor);
        binding2.subtitleTAV.setBackgroundColor(parseColor);
    }

    private final void setupStoryTimeline(List<ButtonV3Atom.LargeButton> answers) {
        StoryTimeLine storyTimeLine = getBinding().timeLine;
        if (answers != null && !answers.isEmpty()) {
            storyTimeLine.setAnimationListener(null);
            ViewExtKt.invisible(storyTimeLine);
            return;
        }
        Bundle arguments = getArguments();
        long j11 = arguments != null ? arguments.getLong("STORY_SPAN") : 6000L;
        storyTimeLine.fullReset();
        storyTimeLine.init(1, 0, j11);
        storyTimeLine.setAnimationListener(new StoryTimeLine.AnimationListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment$setupStoryTimeline$1$1
            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine.AnimationListener
            public void onAnimationComplete() {
                StoryPollFragment.onNext$default(StoryPollFragment.this, null, 1, null);
            }
        });
        ViewExtKt.show(storyTimeLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPlayback() {
        if (this.contentWasLoaded && isResumed()) {
            StoryWithPoll storyWithPoll = this.moleculeData;
            if (storyWithPoll == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            StoryQuestion storyQuestion = storyWithPoll.getQuestions().get(this.currentItemIndex);
            trackView(storyQuestion != null ? storyQuestion.getTrackingInfo() : null);
            getBinding().timeLine.play();
        }
    }

    private final void trackView(Map<String, TokenizedTrackingInfo> trackingInfo) {
        StoryCallback storyCallback = getStoryCallback();
        if (storyCallback != null) {
            storyCallback.onAction(new AtomAction.ViewAction(trackingInfo, null, 2, null));
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void attachClickableLayoutListener() {
        final MoleculeStoryItemPollBinding binding = getBinding();
        binding.rootSICL.setTouchEventListener(new StoryItemClickableLayout.TouchEventListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment$attachClickableLayoutListener$1$1
            /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
            
                r0 = r1.this$0.getViewModel();
             */
            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onClickUp(StoryItemClickableLayout.AreaType areaType) {
                boolean z11;
                StoryPollViewModel viewModel;
                Intrinsics.checkNotNullParameter(areaType, "areaType");
                z11 = StoryPollFragment.this.tapsEnabled;
                if (!z11 || viewModel == null) {
                    return;
                }
                viewModel.onClickUp(areaType);
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            public void onLongClickDown() {
                binding.timeLine.pause();
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            public void onLongClickUp() {
                binding.timeLine.play();
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            public void onSwipeDown() {
                StoryCallback storyCallback;
                storyCallback = StoryPollFragment.this.getStoryCallback();
                if (storyCallback != null) {
                    storyCallback.onAction(new AtomAction.Dismiss(null, null, null, null, 13, null));
                }
            }
        });
    }

    public void bindItem() {
        StoryCommonMolecule storyCommonMolecule = this.molecule;
        if (storyCommonMolecule == null) {
            Intrinsics.n("molecule");
            throw null;
        }
        if (storyCommonMolecule.getData() instanceof StoryWithPoll) {
            this.itemIndexStack.clear();
            StoryWithPoll storyWithPoll = this.moleculeData;
            if (storyWithPoll == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            this.currentItemIndex = storyWithPoll.getRoot();
            StoryWithPoll storyWithPoll2 = this.moleculeData;
            if (storyWithPoll2 == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            Map<String, StoryQuestion> questions = storyWithPoll2.getQuestions();
            StoryWithPoll storyWithPoll3 = this.moleculeData;
            if (storyWithPoll3 == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            StoryQuestion storyQuestion = questions.get(storyWithPoll3.getRoot());
            if (storyQuestion != null) {
                loadQuestion(storyQuestion);
            }
            AuthorBlockView authorBlockView = getBinding().authorBlockV;
            StoryCommonMolecule storyCommonMolecule2 = this.molecule;
            if (storyCommonMolecule2 == null) {
                Intrinsics.n("molecule");
                throw null;
            }
            AuthorBlock authorBlock = storyCommonMolecule2.getAuthorBlock();
            if (authorBlock != null) {
                Intrinsics.f(authorBlockView);
                AuthorBlockHolderKt.bind(authorBlockView, authorBlock, new StoryPollFragment$bindItem$2$1$1(this));
            } else {
                Intrinsics.f(authorBlockView);
                ViewExtKt.gone(authorBlockView);
            }
            observeStateEvents();
            observeNavigationEvents();
            observePlaybackEvents();
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void detachClickableLayoutListener() {
        getBinding().rootSICL.setTouchEventListener(null);
    }

    @NotNull
    public final a<StoryPollViewModel> getProvider() {
        a<StoryPollViewModel> aVar = this.provider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("provider");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        StoryMoleculeComponent.Factory factory = DaggerStoryMoleculeComponent.factory();
        if (VideoComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component VideoComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, VideoComponentApi.class).getDependencyStorage();
        if (VideoComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component VideoComponentApi is not DiComponent");
        }
        VideoComponentApi videoComponentApi = (VideoComponentApi) dependencyStorage.b(VideoComponentApi.class);
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        factory.create(videoComponentApi, (ComposerComponentApi) dependencyStorage2.b(ComposerComponentApi.class)).inject(this);
        setViewModel((BaseStoryViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment$onAttach$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                StoryPollViewModel storyPollViewModel = StoryPollFragment.this.getProvider().get();
                Intrinsics.g(storyPollViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return storyPollViewModel;
            }
        }).a(StoryPollViewModel.class));
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void onCloseStoryScreen() {
        MoleculeStoryItemPollBinding binding = getBinding();
        SmallIconButtonView closeSIB = binding.closeSIB;
        Intrinsics.checkNotNullExpressionValue(closeSIB, "closeSIB");
        ViewExtKt.gone(closeSIB);
        AuthorBlockView authorBlockV = binding.authorBlockV;
        Intrinsics.checkNotNullExpressionValue(authorBlockV, "authorBlockV");
        ViewExtKt.gone(authorBlockV);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StoryCommonMolecule storyCommonMolecule = (StoryCommonMolecule) requireArguments().getParcelable("POLL_STORY_MOLECULE");
        if (storyCommonMolecule == null) {
            return;
        }
        this.molecule = storyCommonMolecule;
        StoryType data = storyCommonMolecule.getData();
        StoryWithPoll storyWithPoll = data instanceof StoryWithPoll ? (StoryWithPoll) data : null;
        if (storyWithPoll == null) {
            return;
        }
        this.moleculeData = storyWithPoll;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        StoryPollViewModel viewModel;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        attachTransitionListener();
        ComponentCallbacksC5392m parentFragment = getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null && (viewModel = getViewModel()) != null) {
            viewModel.putOverrideParams(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        this.mBinding = MoleculeStoryItemPollBinding.inflate(inflater, container, false);
        return getBinding().getConstraintLayout();
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        StoryTimeLine storyTimeLine = getBinding().timeLine;
        storyTimeLine.fullReset();
        storyTimeLine.setAnimationListener(null);
        detachTransitionListener();
        this.mBinding = null;
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        pausePlayback();
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        startPlayback();
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void onTransitionStart() {
        LinearLayoutCompat contentLLC = getBinding().contentLLC;
        Intrinsics.checkNotNullExpressionValue(contentLLC, "contentLLC");
        ViewExtKt.gone(contentLLC);
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConstraintLayout constraintLayout = getBinding().contentCl;
        if (constraintLayout != null) {
            constraintLayout.setClipToOutline(true);
        }
        bindItem();
        setupCloseButton();
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    @NotNull
    public LayoutStrategy provideLayoutStrategy() {
        StoryItemClickableLayout storyItemClickableLayout = getBinding().rootSICL;
        if (isTablet()) {
            Intrinsics.f(storyItemClickableLayout);
            return new TabletLayoutStrategy(storyItemClickableLayout);
        }
        Intrinsics.f(storyItemClickableLayout);
        return new MobileLayoutStrategy(storyItemClickableLayout);
    }

    public void setupCloseButton() {
        SmallIconButtonView closeSIB = getBinding().closeSIB;
        Intrinsics.checkNotNullExpressionValue(closeSIB, "closeSIB");
        StoryCommonMolecule storyCommonMolecule = this.molecule;
        if (storyCommonMolecule != null) {
            WrappedIconButtonHolderKt.bindOrGone(closeSIB, storyCommonMolecule.getCloseButton(), new StoryPollFragment$setupCloseButton$1(this));
        } else {
            Intrinsics.n("molecule");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void updateImageSize() {
        ImageView storyItemIV = getBinding().storyItemIV;
        Intrinsics.checkNotNullExpressionValue(storyItemIV, "storyItemIV");
        storyItemIV.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment$updateImageSize$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                StoryPollViewModel viewModel;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                viewModel = StoryPollFragment.this.getViewModel();
                if (viewModel != null) {
                    viewModel.putOverrideParams(view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
        });
    }
}
