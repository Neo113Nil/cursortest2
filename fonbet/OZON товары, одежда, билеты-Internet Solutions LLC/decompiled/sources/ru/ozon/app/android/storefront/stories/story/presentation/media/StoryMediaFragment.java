package ru.ozon.app.android.storefront.stories.story.presentation.media;

import B0.C2454a;
import B90.M;
import B90.O;
import B90.P;
import B90.Q;
import B90.S;
import Pc.a;
import QD.b;
import Sc.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.core.impl.Y;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.media3.ui.PlayerView;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.atoms.data.authorBlock.AuthorBlock;
import ru.ozon.app.android.atoms.v3.holders.authorBlock.AuthorBlockHolderKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.authorBlock.AuthorBlockView;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$1;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$2;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.storefront.databinding.MoleculeStoryItemMediaBinding;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMoleculeKt;
import ru.ozon.app.android.storefront.stories.story.data.StoryItem;
import ru.ozon.app.android.storefront.stories.story.data.StoryItemAsset;
import ru.ozon.app.android.storefront.stories.story.data.StoryMedia;
import ru.ozon.app.android.storefront.stories.story.data.StorySoundControlDTO;
import ru.ozon.app.android.storefront.stories.story.data.StoryText;
import ru.ozon.app.android.storefront.stories.story.data.StoryType;
import ru.ozon.app.android.storefront.stories.story.data.StoryWithImage;
import ru.ozon.app.android.storefront.stories.story.data.StoryWithVideo;
import ru.ozon.app.android.storefront.stories.story.di.DaggerStoryMoleculeComponent;
import ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.NavigationType;
import ru.ozon.app.android.storefront.stories.story.presentation.PlaybackType;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemEvent;
import ru.ozon.app.android.storefront.stories.story.presentation.StorySoundControlHolder;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.LayoutStrategy;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.MobileLayoutStrategy;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.TabletLayoutStrategy;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.download.DownloadListener;
import ru.ozon.app.android.video.download.DownloadListenersStorage;
import ru.ozon.app.android.video.manager.ExoManagerWithCache;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u0099\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0099\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0004J%\u0010,\u001a\u00020\u00072\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0018\u00010(H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010\u0004J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u00020.H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u000208H\u0002¢\u0006\u0004\b<\u0010=J+\u0010B\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u00020\u00072\u0006\u00103\u001a\u00020D2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\u00020\u00072\u0006\u00103\u001a\u00020D2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010\u0004J\u0017\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bP\u0010QJ!\u0010U\u001a\u00020\u00072\u0006\u0010S\u001a\u00020R2\b\u0010T\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0007H\u0002¢\u0006\u0004\bW\u0010\u0004J\u000f\u0010X\u001a\u00020\u0007H\u0002¢\u0006\u0004\bX\u0010\u0004J\u000f\u0010Y\u001a\u00020\u0007H\u0002¢\u0006\u0004\bY\u0010\u0004J\u000f\u0010Z\u001a\u00020\u0007H\u0002¢\u0006\u0004\bZ\u0010\u0004J\u0017\u0010\\\u001a\u00020\u00072\u0006\u0010[\u001a\u00020)H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0007H\u0002¢\u0006\u0004\b^\u0010\u0004J\u000f\u0010_\u001a\u00020\u0007H\u0002¢\u0006\u0004\b_\u0010\u0004J\u000f\u0010`\u001a\u00020\u0007H\u0002¢\u0006\u0004\b`\u0010\u0004J\u000f\u0010a\u001a\u000208H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u0007H\u0002¢\u0006\u0004\bc\u0010\u0004J\u000f\u0010d\u001a\u00020\u0007H\u0002¢\u0006\u0004\bd\u0010\u0004J\u000f\u0010e\u001a\u00020\u0007H\u0002¢\u0006\u0004\be\u0010\u0004J\u0017\u0010g\u001a\u00020\u00072\u0006\u0010f\u001a\u00020IH\u0002¢\u0006\u0004\bg\u0010LR(\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010p\u001a\u00020o8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u0080\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u008f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009a\u0001"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaFragment;", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaViewModel;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "onTransitionStart", "bindItem", "attachClickableLayoutListener", "detachClickableLayoutListener", "setupCloseButton", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "provideLayoutStrategy", "()Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "updateImageSize", "onCloseStoryScreen", "onStorySwiped", "trackVideoWatched", "bindSoundControl", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "trackView", "(Ljava/util/Map;)V", "", "framesCount", "setupStoryTimeline", "(I)V", "Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;", "asset", "preloadImage", "(Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;)V", "preloadNextAsset", "index", "Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "getItem", "(I)Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "storyItem", "loadData", "(Lru/ozon/app/android/storefront/stories/story/data/StoryItem;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "storyText", "loadImage", "(Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/storefront/stories/story/data/StoryText;)V", "Lru/ozon/app/android/storefront/stories/story/data/StoryWithVideo;", "loadVideo", "(Lru/ozon/app/android/storefront/stories/story/data/StoryWithVideo;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "showVideo", "observeSoundMutedState", "", "isSoundMuted", "updateSoundControl", "(Z)V", DynamicElementDTO.LARGE_BUTTON, "setupLargeButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "setupTextContent", "(Lru/ozon/app/android/storefront/stories/story/data/StoryText;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "bindTitleTAV", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "observeNavigationEvents", "observePlaybackEvents", "observeStateEvents", "onItemLoaded", "errorString", "onError", "(Ljava/lang/String;)V", "onStoryCompleted", "onNext", "onPrevious", "getCurrentStoryItem", "()Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "startPlayback", "restartPlayback", "pausePlayback", "hasAudio", "bindMuteButton", "LPc/a;", "provider", "LPc/a;", "getProvider", "()LPc/a;", "setProvider", "(LPc/a;)V", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "setVideoController", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "Lru/ozon/app/android/video/download/DownloadListenersStorage;", "listenersStorage", "Lru/ozon/app/android/video/download/DownloadListenersStorage;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "molecule", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "Lru/ozon/app/android/storefront/stories/story/data/StoryMedia;", "moleculeData", "Lru/ozon/app/android/storefront/stories/story/data/StoryMedia;", "dp12", "I", "currentItemIndex", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "previousVideoUrl", "Ljava/lang/String;", "contentWasLoaded", "Z", "Lru/ozon/app/android/storefront/stories/story/presentation/StorySoundControlHolder;", "soundControlHolder", "Lru/ozon/app/android/storefront/stories/story/presentation/StorySoundControlHolder;", "Lru/ozon/app/android/storefront/databinding/MoleculeStoryItemMediaBinding;", "mBinding", "Lru/ozon/app/android/storefront/databinding/MoleculeStoryItemMediaBinding;", "Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "getExoManager", "()Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "exoManager", "getBinding", "()Lru/ozon/app/android/storefront/databinding/MoleculeStoryItemMediaBinding;", "binding", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryMediaFragment extends BaseStoryFragment<StoryMediaViewModel> {
    private boolean contentWasLoaded;
    private int currentItemIndex;
    private MoleculeStoryItemMediaBinding mBinding;
    private StoryCommonMolecule molecule;
    private StoryMedia moleculeData;
    private SingleInstancePlayerController playerController;
    private String previousVideoUrl;
    public a<StoryMediaViewModel> provider;
    private StorySoundControlHolder soundControlHolder;
    public VideoController videoController;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final DownloadListenersStorage listenersStorage = new DownloadListenersStorage();

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final int dp12 = ResourceExtKt.toPx(12);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaFragment$Companion;", "", "<init>", "()V", "MEDIA_STORY_MOLECULE", "", "STORY_SPAN", "DEFAULT_SPAN", "", "DEFAULT_START_POSITION", "", "NUMBER", "SECONDS_DIV", "newInstance", "Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaFragment;", "molecule", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "span", "(Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaFragment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StoryMediaFragment newInstance(@NotNull StoryCommonMolecule molecule, Integer span) {
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            Bundle bundle = new Bundle();
            bundle.putLong("STORY_SPAN", span != null ? span.intValue() : 6000L);
            bundle.putParcelable("MEDIA_STORY_MOLECULE", molecule);
            StoryMediaFragment storyMediaFragment = new StoryMediaFragment();
            storyMediaFragment.setArguments(bundle);
            return storyMediaFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindMuteButton(boolean hasAudio) {
        SmallIconButtonView soundControlView = getBinding().soundControlView;
        Intrinsics.checkNotNullExpressionValue(soundControlView, "soundControlView");
        ViewExtKt.showOrInvisible(soundControlView, hasAudio);
    }

    private final void bindSoundControl() {
        StorySoundControlHolder storySoundControlHolder;
        StorySoundControlDTO soundControl = getItem(this.currentItemIndex).getSoundControl();
        if (soundControl == null || (storySoundControlHolder = this.soundControlHolder) == null) {
            return;
        }
        StoryMediaViewModel viewModel = getViewModel();
        boolean z11 = false;
        if (viewModel != null && !viewModel.isSoundMuted()) {
            z11 = true;
        }
        StorySoundControlHolder.bind$default(storySoundControlHolder, soundControl, Boolean.valueOf(!z11), null, 4, null);
    }

    private final void bindTitleTAV(TextAtom title, TextAtom subtitle) {
        TextAtomView textAtomView = getBinding().titleTAV;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind$default(textAtomView, title, null, 2, null);
        int i11 = subtitle == null ? 0 : this.dp12;
        ViewGroup.LayoutParams layoutParams = textAtomView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i11);
        textAtomView.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MoleculeStoryItemMediaBinding getBinding() {
        MoleculeStoryItemMediaBinding moleculeStoryItemMediaBinding = this.mBinding;
        Intrinsics.f(moleculeStoryItemMediaBinding);
        return moleculeStoryItemMediaBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StoryItem getCurrentStoryItem() {
        StoryMedia storyMedia = this.moleculeData;
        if (storyMedia != null) {
            return storyMedia.getItems().get(this.currentItemIndex);
        }
        Intrinsics.n("moleculeData");
        throw null;
    }

    private final ExoManagerWithCache getExoManager() {
        return getVideoController().getDownloadableExoManager();
    }

    private final StoryItem getItem(int index) {
        StoryMedia storyMedia = this.moleculeData;
        if (storyMedia != null) {
            return storyMedia.getItems().get(index);
        }
        Intrinsics.n("moleculeData");
        throw null;
    }

    private final void loadData(StoryItem storyItem) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int parseColor = styleParser.parseColor(requireContext, storyItem.getBackgroundColor(), R$color.layer_floor_0);
        MoleculeStoryItemMediaBinding binding = getBinding();
        String tagTitle = storyItem.getTagTitle();
        if (tagTitle != null) {
            binding.tagTitleTV.setText(tagTitle);
            TextView tagTitleTV = binding.tagTitleTV;
            Intrinsics.checkNotNullExpressionValue(tagTitleTV, "tagTitleTV");
            ViewExtKt.show(tagTitleTV);
        } else {
            TextView tagTitleTV2 = binding.tagTitleTV;
            Intrinsics.checkNotNullExpressionValue(tagTitleTV2, "tagTitleTV");
            ViewExtKt.gone(tagTitleTV2);
        }
        StoryItemAsset asset = storyItem.getAsset();
        if (asset instanceof StoryWithImage) {
            binding.storyItemIV.setBackgroundColor(parseColor);
            loadImage((StoryWithImage) asset, storyItem.getButton(), storyItem.getText());
        } else {
            if (!(asset instanceof StoryWithVideo)) {
                throw new o();
            }
            binding.storyItemVideoPV.setBackgroundColor(parseColor);
            loadVideo((StoryWithVideo) asset, storyItem.getButton());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void loadImage(final StoryWithImage asset, ButtonV3Atom.LargeButton button, StoryText storyText) {
        Bitmap bitmapFromCache;
        SingleInstanceMediaPlayController mediaPlayController;
        final MoleculeStoryItemMediaBinding binding = getBinding();
        PlayerView storyItemVideoPV = binding.storyItemVideoPV;
        Intrinsics.checkNotNullExpressionValue(storyItemVideoPV, "storyItemVideoPV");
        ViewExtKt.gone(storyItemVideoPV);
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
            mediaPlayController.release(StoryMediaFragment$loadImage$1$1.INSTANCE);
        }
        Unit unit = null;
        this.playerController = null;
        ImageView storyItemIV = binding.storyItemIV;
        Intrinsics.checkNotNullExpressionValue(storyItemIV, "storyItemIV");
        ViewExtKt.show(storyItemIV);
        bindMuteButton(false);
        this.contentWasLoaded = false;
        StoryMediaViewModel viewModel = getViewModel();
        if (viewModel != null && (bitmapFromCache = viewModel.getBitmapFromCache(asset.getImageUrl())) != null) {
            binding.storyItemIV.setImageBitmap(bitmapFromCache);
            ImageView imageView = binding.storyBackgroundIv;
            if (imageView != null) {
                setBlurredBackground(imageView, bitmapFromCache);
            }
            StoryMediaViewModel viewModel2 = getViewModel();
            if (viewModel2 != null) {
                viewModel2.onImageLoadSuccessful(this.currentItemIndex);
                unit = Unit.f71690a;
            }
        }
        ProgressBar loadingPB = binding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.show(loadingPB);
        ImageView storyItemIV2 = binding.storyItemIV;
        Intrinsics.checkNotNullExpressionValue(storyItemIV2, "storyItemIV");
        ImageViewExtKt.loadAsBitmapInscribedSize$default(storyItemIV2, asset.getImageUrl(), getTransformations(asset.getAlign()), new PikazonLoaderCallback<Bitmap>() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment$loadImage$1$3$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                StoryMediaViewModel viewModel3;
                int i11;
                viewModel3 = StoryMediaFragment.this.getViewModel();
                if (viewModel3 != null) {
                    i11 = StoryMediaFragment.this.currentItemIndex;
                    viewModel3.onLoadFailed(i11, StringProvider.getString(R$string.common_message_no_connection));
                }
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Bitmap resource) {
                StoryMediaViewModel viewModel3;
                StoryMediaViewModel viewModel4;
                int i11;
                viewModel3 = StoryMediaFragment.this.getViewModel();
                if (viewModel3 != null) {
                    i11 = StoryMediaFragment.this.currentItemIndex;
                    viewModel3.onImageLoadSuccessful(i11);
                }
                if (resource != null) {
                    StoryMediaFragment storyMediaFragment = StoryMediaFragment.this;
                    StoryWithImage storyWithImage = asset;
                    viewModel4 = storyMediaFragment.getViewModel();
                    if (viewModel4 != null) {
                        viewModel4.putStoryImageInCache(storyWithImage.getImageUrl(), resource);
                    }
                }
                ImageView imageView2 = binding.storyBackgroundIv;
                if (imageView2 != null) {
                    StoryMediaFragment.this.setBlurredBackground(imageView2, resource);
                }
            }
        }, null, InscribedUrlProcessor.InscribedWidth.INSTANCE, 8, null);
        setupTextContent(storyText);
        setupLargeButton(button);
        preloadNextAsset();
    }

    private final void loadVideo(final StoryWithVideo asset, final ButtonV3Atom.LargeButton button) {
        List<DownloadListener> list;
        MoleculeStoryItemMediaBinding binding = getBinding();
        ProgressBar loadingPB = binding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.show(loadingPB);
        ImageView storyItemIV = binding.storyItemIV;
        Intrinsics.checkNotNullExpressionValue(storyItemIV, "storyItemIV");
        ViewExtKt.invisible(storyItemIV);
        String str = this.previousVideoUrl;
        if (str != null && (list = this.listenersStorage.getListeners().get(str)) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getExoManager().removeListener(str, (DownloadListener) it.next());
            }
        }
        DownloadListener downloadListener = new DownloadListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment$loadVideo$downloadListener$1
            @Override // ru.ozon.app.android.video.download.DownloadListener
            public void onError(Exception e11) {
                StoryMediaViewModel viewModel;
                int i11;
                Intrinsics.checkNotNullParameter(e11, "e");
                viewModel = StoryMediaFragment.this.getViewModel();
                if (viewModel != null) {
                    i11 = StoryMediaFragment.this.currentItemIndex;
                    viewModel.onLoadFailed(i11, StringProvider.getString(R$string.common_message_no_connection));
                }
            }

            @Override // ru.ozon.app.android.video.download.DownloadListener
            public void onSuccess() {
                StoryMediaFragment.this.showVideo(asset, button);
            }
        };
        this.previousVideoUrl = asset.getPlaylist();
        this.listenersStorage.addListener(asset.getPlaylist(), downloadListener);
        getExoManager().downloadVideo(asset.getPlaylist(), downloadListener);
    }

    private final void observeNavigationEvents() {
        SingleLiveEvent<NavigationType> storyNavigationEvent;
        StoryMediaViewModel viewModel = getViewModel();
        if (viewModel == null || (storyNavigationEvent = viewModel.getStoryNavigationEvent()) == null) {
            return;
        }
        storyNavigationEvent.observe(this, new StoryMediaFragment$sam$androidx_lifecycle_Observer$0(new StoryMediaFragment$observeNavigationEvents$1(this)));
    }

    private final void observePlaybackEvents() {
        SingleLiveEvent<PlaybackType> storyPlaybackEvent;
        StoryMediaViewModel viewModel = getViewModel();
        if (viewModel == null || (storyPlaybackEvent = viewModel.getStoryPlaybackEvent()) == null) {
            return;
        }
        storyPlaybackEvent.observe(this, new StoryMediaFragment$sam$androidx_lifecycle_Observer$0(new StoryMediaFragment$observePlaybackEvents$1(this)));
    }

    private final void observeSoundMutedState() {
        SingleLiveEvent<Boolean> soundMutedState;
        StoryMediaViewModel viewModel = getViewModel();
        if (viewModel == null || (soundMutedState = viewModel.getSoundMutedState()) == null) {
            return;
        }
        soundMutedState.observe(getViewLifecycleOwner(), new StoryMediaFragment$sam$androidx_lifecycle_Observer$0(new StoryMediaFragment$observeSoundMutedState$1(this)));
    }

    private final void observeStateEvents() {
        SingleLiveEvent<StoryItemEvent> storyStateEvent;
        StoryMediaViewModel viewModel = getViewModel();
        if (viewModel == null || (storyStateEvent = viewModel.getStoryStateEvent()) == null) {
            return;
        }
        storyStateEvent.observe(this, new StoryMediaFragment$sam$androidx_lifecycle_Observer$0(new StoryMediaFragment$observeStateEvents$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(String errorString) {
        MoleculeStoryItemMediaBinding binding = getBinding();
        binding.retryTv.setText(errorString);
        binding.retryTv.setOnClickListener(new b(3, binding, this));
        TextView retryTv = binding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.show(retryTv);
        ProgressBar loadingPB = binding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.gone(loadingPB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$41$lambda$40(MoleculeStoryItemMediaBinding moleculeStoryItemMediaBinding, StoryMediaFragment storyMediaFragment, View view) {
        TextView retryTv = moleculeStoryItemMediaBinding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.gone(retryTv);
        ProgressBar loadingPB = moleculeStoryItemMediaBinding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.show(loadingPB);
        storyMediaFragment.loadData(storyMediaFragment.getCurrentStoryItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemLoaded() {
        this.contentWasLoaded = true;
        MoleculeStoryItemMediaBinding binding = getBinding();
        ProgressBar loadingPB = binding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.gone(loadingPB);
        startPlayback();
        TextView retryTv = binding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.gone(retryTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNext() {
        int i11 = this.currentItemIndex + 1;
        StoryMedia storyMedia = this.moleculeData;
        if (storyMedia == null) {
            Intrinsics.n("moleculeData");
            throw null;
        }
        if (i11 == storyMedia.getItems().size()) {
            onStoryCompleted();
            return;
        }
        this.currentItemIndex++;
        getBinding().timeLine.next();
        loadData(getItem(this.currentItemIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrevious() {
        int i11 = this.currentItemIndex;
        if (i11 > 0) {
            this.currentItemIndex = i11 - 1;
            getBinding().timeLine.previous();
            loadData(getItem(this.currentItemIndex));
        } else {
            StoryCallback storyCallback = getStoryCallback();
            if (storyCallback != null) {
                storyCallback.onPreviousClicked();
            }
        }
    }

    private final void onStoryCompleted() {
        StoryCallback storyCallback = getStoryCallback();
        if (storyCallback != null) {
            storyCallback.onStoryComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pausePlayback() {
        getBinding().timeLine.pause();
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || !singleInstancePlayerController.mediaPlayController().isPlaying()) {
            return;
        }
        singleInstancePlayerController.mediaPlayController().pause();
    }

    private final void preloadImage(StoryWithImage asset) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String imageUrl = asset.getImageUrl();
        StoryMediaViewModel viewModel = getViewModel();
        ContextExtKt.loadAsBitmapInscribedSize(requireContext, imageUrl, (r14 & 2) != 0 ? K.f71697a : getTransformations(asset.getAlign()), (r14 & 4) != 0 ? null : viewModel != null ? viewModel.getOverrideParams() : null, (r14 & 8) != 0 ? LoadPriority.NORMAL : null, (r14 & 16) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : InscribedUrlProcessor.InscribedWidth.INSTANCE, (r14 & 32) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$1.INSTANCE : null, (r14 & 64) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$2.INSTANCE : new StoryMediaFragment$preloadImage$1(this, asset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadNextAsset() {
        StoryMediaViewModel viewModel;
        int i11 = this.currentItemIndex + 1;
        StoryMedia storyMedia = this.moleculeData;
        if (storyMedia == null) {
            Intrinsics.n("moleculeData");
            throw null;
        }
        if (i11 < storyMedia.getItems().size()) {
            StoryItemAsset asset = getItem(i11).getAsset();
            if (!(asset instanceof StoryWithImage) || (viewModel = getViewModel()) == null || viewModel.getOverrideParams() == null) {
                return;
            }
            StoryMediaViewModel viewModel2 = getViewModel();
            if ((viewModel2 != null ? viewModel2.getBitmapFromCache(((StoryWithImage) asset).getImageUrl()) : null) == null) {
                preloadImage((StoryWithImage) asset);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartPlayback() {
        BasePlayerPositionController positionController;
        if (this.contentWasLoaded && isResumed()) {
            getBinding().timeLine.replay();
            SingleInstancePlayerController singleInstancePlayerController = this.playerController;
            if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null) {
                return;
            }
            positionController.seekToStartAndReplay();
        }
    }

    private final void setupLargeButton(ButtonV3Atom.LargeButton largeButton) {
        LargeButtonView buttonLBV = getBinding().buttonLBV;
        Intrinsics.checkNotNullExpressionValue(buttonLBV, "buttonLBV");
        LargeButtonHolderKt.bindOrGone(buttonLBV, largeButton, new StoryMediaFragment$setupLargeButton$1(this));
    }

    private final void setupStoryTimeline(int framesCount) {
        Bundle arguments = getArguments();
        long j11 = arguments != null ? arguments.getLong("STORY_SPAN") : 6000L;
        StoryTimeLine storyTimeLine = getBinding().timeLine;
        storyTimeLine.init(framesCount, 0, j11);
        storyTimeLine.setAnimationListener(new StoryTimeLine.AnimationListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment$setupStoryTimeline$1$1
            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine.AnimationListener
            public void onAnimationComplete() {
                StoryMediaViewModel viewModel;
                viewModel = StoryMediaFragment.this.getViewModel();
                if (viewModel != null) {
                    viewModel.onTimeLineAnimationComplete();
                }
            }
        });
    }

    private final void setupTextContent(StoryText storyText) {
        MoleculeStoryItemMediaBinding binding = getBinding();
        if (storyText != null) {
            bindTitleTAV(storyText.getTitle(), storyText.getSubtitle());
            TextAtomView subtitleTAV = binding.subtitleTAV;
            Intrinsics.checkNotNullExpressionValue(subtitleTAV, "subtitleTAV");
            TextAtomHolderKt.bindOrGone$default(subtitleTAV, storyText.getSubtitle(), null, 2, null);
            binding.textContentLLC.setGravity(StoryCommonMoleculeKt.mapToGravity(storyText.getAlign()));
            StyleParser styleParser = StyleParser.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Integer parseColor = styleParser.parseColor(requireContext, storyText.getBackgroundColor());
            if (parseColor == null) {
                binding.titleTAV.setBackgroundColor(0);
                binding.subtitleTAV.setBackgroundColor(0);
            } else {
                int intValue = parseColor.intValue();
                binding.titleTAV.setBackgroundColor(intValue);
                binding.subtitleTAV.setBackgroundColor(intValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showVideo(StoryWithVideo asset, final ButtonV3Atom.LargeButton button) {
        int i11 = 5;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null) {
            SingleInstanceMediaPlayController mediaPlayController = singleInstancePlayerController.mediaPlayController();
            if (mediaPlayController != null) {
                mediaPlayController.release(StoryMediaFragment$showVideo$1.INSTANCE);
            }
            this.playerController = null;
        }
        final SingleInstancePlayerController singleInstancePlayerController$default = VideoController.DefaultImpls.getSingleInstancePlayerController$default(getVideoController(), null, 1, null);
        BasePlayerViewController playerViewController = singleInstancePlayerController$default.playerViewController();
        PlayerView storyItemVideoPV = getBinding().storyItemVideoPV;
        Intrinsics.checkNotNullExpressionValue(storyItemVideoPV, "storyItemVideoPV");
        BasePlayerViewController.DefaultImpls.bindPlayerView$default(playerViewController, storyItemVideoPV, null, 2, null);
        SingleInstanceMediaPlayController mediaPlayController2 = singleInstancePlayerController$default.mediaPlayController();
        String playlist = asset.getPlaylist();
        ExoManagerWithCache exoManager = getExoManager();
        StoryMediaViewModel viewModel = getViewModel();
        boolean z11 = false;
        if (viewModel != null && !viewModel.isSoundMuted()) {
            z11 = true;
        }
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.hasAudio(new M(this, i11));
        builder.onStart(new OnStartPlayerControllerListener() { // from class: pK.a
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
            public final void onStart(PlayerState playerState) {
                StoryMediaFragment.showVideo$lambda$32$lambda$31$lambda$24(StoryMediaFragment.this, singleInstancePlayerController$default, button, playerState);
            }
        });
        builder.onBuffer(new O(this));
        builder.onError(new P(this));
        builder.onReady(new Q(this, i11));
        builder.onRenderedFirstFrame(new S(this));
        Unit unit = Unit.f71690a;
        mediaPlayController2.prepareMediaToPlay(playlist, exoManager, true, false, !z11, builder.build(), null, null);
        this.playerController = singleInstancePlayerController$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$32$lambda$31$lambda$24(StoryMediaFragment storyMediaFragment, SingleInstancePlayerController singleInstancePlayerController, ButtonV3Atom.LargeButton largeButton, PlayerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!storyMediaFragment.isResumed()) {
            singleInstancePlayerController.mediaPlayController().pause();
        }
        PlayerView playerView = storyMediaFragment.getBinding().storyItemVideoPV;
        Intrinsics.f(playerView);
        if (playerView.getVisibility() == 8) {
            ViewExtKt.show(playerView);
        }
        storyMediaFragment.setupLargeButton(largeButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$32$lambda$31$lambda$25(StoryMediaFragment storyMediaFragment) {
        StoryMediaViewModel viewModel = storyMediaFragment.getViewModel();
        if (viewModel != null) {
            viewModel.onBuffer(storyMediaFragment.currentItemIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$32$lambda$31$lambda$26(StoryMediaFragment storyMediaFragment, String message, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        storyMediaFragment.getBinding().timeLine.pause();
        StoryMediaViewModel viewModel = storyMediaFragment.getViewModel();
        if (viewModel != null) {
            viewModel.onLoadFailed(storyMediaFragment.currentItemIndex, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$32$lambda$31$lambda$27(StoryMediaFragment storyMediaFragment, PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        storyMediaFragment.getBinding().timeLine.setDuration(playerState.getDuration());
        storyMediaFragment.onItemLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$32$lambda$31$lambda$30(StoryMediaFragment storyMediaFragment) {
        storyMediaFragment.handler.post(new Y(storyMediaFragment, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$32$lambda$31$lambda$30$lambda$29(StoryMediaFragment storyMediaFragment) {
        MoleculeStoryItemMediaBinding binding = storyMediaFragment.getBinding();
        ImageView imageView = binding.storyBackgroundIv;
        if (imageView != null) {
            View t2 = binding.storyItemVideoPV.t();
            TextureView textureView = t2 instanceof TextureView ? (TextureView) t2 : null;
            storyMediaFragment.setBlurredBackground(imageView, textureView != null ? textureView.getBitmap() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPlayback() {
        if (this.contentWasLoaded && isResumed()) {
            trackView(getCurrentStoryItem().getTrackingInfo());
            getBinding().timeLine.play();
            SingleInstancePlayerController singleInstancePlayerController = this.playerController;
            if (singleInstancePlayerController == null || !singleInstancePlayerController.mediaPlayController().isReadyToPlayAndPaused()) {
                return;
            }
            singleInstancePlayerController.mediaPlayController().resume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void trackView(Map<String, TokenizedTrackingInfo> trackingInfo) {
        StoryCallback storyCallback = getStoryCallback();
        if (storyCallback != null) {
            storyCallback.onAction(new AtomAction.ViewAction(trackingInfo, null, 2, 0 == true ? 1 : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSoundControl(boolean isSoundMuted) {
        BasePlayerSoundController soundController;
        bindSoundControl();
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (soundController = singleInstancePlayerController.soundController()) == null) {
            return;
        }
        soundController.setMute(isSoundMuted);
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void attachClickableLayoutListener() {
        getBinding().rootSICL.setTouchEventListener(new StoryItemClickableLayout.TouchEventListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment$attachClickableLayoutListener$1
            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            public void onClickUp(StoryItemClickableLayout.AreaType areaType) {
                StoryItem currentStoryItem;
                StoryMediaViewModel viewModel;
                StoryCallback storyCallback;
                Intrinsics.checkNotNullParameter(areaType, "areaType");
                currentStoryItem = StoryMediaFragment.this.getCurrentStoryItem();
                if (currentStoryItem.getAction() == null) {
                    viewModel = StoryMediaFragment.this.getViewModel();
                    if (viewModel != null) {
                        viewModel.onClickUp(areaType);
                        return;
                    }
                    return;
                }
                AtomAction atomAction = AtomActionMapperKt.toAtomAction(currentStoryItem.getAction(), currentStoryItem.getTrackingInfo());
                storyCallback = StoryMediaFragment.this.getStoryCallback();
                if (storyCallback != null) {
                    storyCallback.onAction(atomAction);
                }
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            public void onLongClickDown() {
                StoryMediaFragment.this.pausePlayback();
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            public void onLongClickUp() {
                StoryMediaFragment.this.startPlayback();
            }

            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout.TouchEventListener
            public void onSwipeDown() {
                StoryCallback storyCallback;
                storyCallback = StoryMediaFragment.this.getStoryCallback();
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
        if (storyCommonMolecule.getData() instanceof StoryMedia) {
            this.currentItemIndex = 0;
            loadData(getItem(0));
            observeStateEvents();
            observeNavigationEvents();
            observePlaybackEvents();
            StoryMedia storyMedia = this.moleculeData;
            if (storyMedia == null) {
                Intrinsics.n("moleculeData");
                throw null;
            }
            setupStoryTimeline(storyMedia.getItems().size());
            AuthorBlockView authorBlockView = getBinding().authorBlockV;
            StoryCommonMolecule storyCommonMolecule2 = this.molecule;
            if (storyCommonMolecule2 == null) {
                Intrinsics.n("molecule");
                throw null;
            }
            AuthorBlock authorBlock = storyCommonMolecule2.getAuthorBlock();
            if (authorBlock != null) {
                Intrinsics.f(authorBlockView);
                AuthorBlockHolderKt.bind(authorBlockView, authorBlock, new StoryMediaFragment$bindItem$1$1$1(this));
            } else {
                Intrinsics.f(authorBlockView);
                ViewExtKt.gone(authorBlockView);
            }
            bindSoundControl();
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void detachClickableLayoutListener() {
        getBinding().rootSICL.setTouchEventListener(null);
    }

    @NotNull
    public final a<StoryMediaViewModel> getProvider() {
        a<StoryMediaViewModel> aVar = this.provider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("provider");
        throw null;
    }

    @NotNull
    public final VideoController getVideoController() {
        VideoController videoController = this.videoController;
        if (videoController != null) {
            return videoController;
        }
        Intrinsics.n("videoController");
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
        setViewModel((BaseStoryViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment$onAttach$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                StoryMediaViewModel storyMediaViewModel = StoryMediaFragment.this.getProvider().get();
                Intrinsics.g(storyMediaViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return storyMediaViewModel;
            }
        }).a(StoryMediaViewModel.class));
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void onCloseStoryScreen() {
        trackVideoWatched();
        MoleculeStoryItemMediaBinding binding = getBinding();
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
        StoryCommonMolecule storyCommonMolecule = (StoryCommonMolecule) requireArguments().getParcelable("MEDIA_STORY_MOLECULE");
        if (storyCommonMolecule == null) {
            return;
        }
        this.molecule = storyCommonMolecule;
        StoryType data = storyCommonMolecule.getData();
        StoryMedia storyMedia = data instanceof StoryMedia ? (StoryMedia) data : null;
        if (storyMedia == null) {
            return;
        }
        this.moleculeData = storyMedia;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        attachTransitionListener();
        this.mBinding = MoleculeStoryItemMediaBinding.inflate(inflater, container, false);
        return getBinding().getConstraintLayout();
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        SingleInstanceMediaPlayController mediaPlayController;
        super.onDestroyView();
        detachTransitionListener();
        StoryTimeLine storyTimeLine = getBinding().timeLine;
        storyTimeLine.fullReset();
        storyTimeLine.setAnimationListener(null);
        this.soundControlHolder = null;
        this.handler.removeCallbacksAndMessages(null);
        for (Map.Entry<String, List<DownloadListener>> entry : this.listenersStorage.getListeners().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                getExoManager().removeListener(key, (DownloadListener) it.next());
            }
        }
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
            mediaPlayController.release(StoryMediaFragment$onDestroyView$3.INSTANCE);
        }
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
    public void onStorySwiped() {
        trackVideoWatched();
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void onTransitionStart() {
        LargeButtonView buttonLBV = getBinding().buttonLBV;
        Intrinsics.checkNotNullExpressionValue(buttonLBV, "buttonLBV");
        ViewExtKt.gone(buttonLBV);
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MoleculeStoryItemMediaBinding binding = getBinding();
        ConstraintLayout constraintLayout = binding.contentCl;
        if (constraintLayout != null) {
            constraintLayout.setClipToOutline(true);
        }
        SmallIconButtonView soundControlView = binding.soundControlView;
        Intrinsics.checkNotNullExpressionValue(soundControlView, "soundControlView");
        this.soundControlHolder = new StorySoundControlHolder(soundControlView, null, new StoryMediaFragment$onViewCreated$1$1(this), new StoryMediaFragment$onViewCreated$1$2(this), 2, null);
        binding.storyItemVideoPV.setTag(R.id.tag_key_widget_name, "cms.playStories");
        bindItem();
        setupCloseButton();
        observeSoundMutedState();
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    @NotNull
    public LayoutStrategy provideLayoutStrategy() {
        MoleculeStoryItemMediaBinding binding = getBinding();
        if (isTablet()) {
            StoryItemClickableLayout rootSICL = binding.rootSICL;
            Intrinsics.checkNotNullExpressionValue(rootSICL, "rootSICL");
            return new TabletLayoutStrategy(rootSICL);
        }
        StoryItemClickableLayout rootSICL2 = binding.rootSICL;
        Intrinsics.checkNotNullExpressionValue(rootSICL2, "rootSICL");
        return new MobileLayoutStrategy(rootSICL2);
    }

    public void setupCloseButton() {
        SmallIconButtonView closeSIB = getBinding().closeSIB;
        Intrinsics.checkNotNullExpressionValue(closeSIB, "closeSIB");
        StoryCommonMolecule storyCommonMolecule = this.molecule;
        if (storyCommonMolecule != null) {
            WrappedIconButtonHolderKt.bindOrGone(closeSIB, storyCommonMolecule.getCloseButton(), new StoryMediaFragment$setupCloseButton$1(this));
        } else {
            Intrinsics.n("molecule");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void trackVideoWatched() {
        BasePlayerPositionController positionController;
        String l11;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null || (l11 = Long.valueOf(positionController.getCurrentPosition() / 1000).toString()) == null) {
            return;
        }
        Map b11 = C2454a.b("number", l11);
        StoryMedia storyMedia = this.moleculeData;
        if (storyMedia == null) {
            Intrinsics.n("moleculeData");
            throw null;
        }
        StoryItemAsset asset = storyMedia.getItems().get(this.currentItemIndex).getAsset();
        StoryWithVideo storyWithVideo = asset instanceof StoryWithVideo ? (StoryWithVideo) asset : null;
        AtomAction.ComposerAction composerAction = new AtomAction.ComposerAction(null, "view", b11, storyWithVideo != null ? storyWithVideo.getTrackingInfo() : null, null, 17, null);
        StoryCallback storyCallback = getStoryCallback();
        if (storyCallback != null) {
            storyCallback.onAction(composerAction);
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment
    public void updateImageSize() {
        ImageView storyItemIV = getBinding().storyItemIV;
        Intrinsics.checkNotNullExpressionValue(storyItemIV, "storyItemIV");
        storyItemIV.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment$updateImageSize$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                StoryMediaViewModel viewModel;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                viewModel = StoryMediaFragment.this.getViewModel();
                if (viewModel != null) {
                    viewModel.putOverrideParams(view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                StoryMediaFragment.this.preloadNextAsset();
            }
        });
    }
}
