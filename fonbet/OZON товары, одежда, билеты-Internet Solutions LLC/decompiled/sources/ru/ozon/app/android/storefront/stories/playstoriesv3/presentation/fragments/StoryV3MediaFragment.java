package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import An.b;
import B90.B;
import B90.D;
import B90.E;
import HL.c;
import Pc.a;
import Sc.o;
import Z.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$1;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$2;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView;
import ru.ozon.app.android.storefront.databinding.StoryV3ItemMediaBinding;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Content;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Item;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3ItemAsset;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Media;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Type;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithImage;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3WithVideo;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.PlaybackType;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.StoryItemEvent;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3;
import ru.ozon.app.android.storefront.stories.story.data.StorySoundControlDTO;
import ru.ozon.app.android.storefront.stories.story.di.DaggerStoryMoleculeComponent;
import ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent;
import ru.ozon.app.android.storefront.stories.story.presentation.StorySoundControlHolder;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3.LayoutV3Strategy;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3.MobileV3LayoutStrategy;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3.MobileV3LayoutStrategySmall;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3.TabletV3LayoutStrategy;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.download.DownloadListener;
import ru.ozon.app.android.video.download.DownloadListenersStorage;
import ru.ozon.app.android.video.manager.ExoManagerWithCache;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u009d\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u009d\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u0004J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u0010\u0004J%\u00107\u001a\u00020\u00072\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205\u0018\u000103H\u0002¢\u0006\u0004\b7\u00108J!\u0010<\u001a\u00020\u00072\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010,\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010\u0004J\u0017\u0010C\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00072\u0006\u0010,\u001a\u00020?2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020\u00072\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010M\u001a\u00020\u00072\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020-H\u0002¢\u0006\u0004\bP\u0010DJ\u0019\u0010S\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u00072\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020'H\u0002¢\u0006\u0004\bZ\u0010*J\u000f\u0010[\u001a\u00020\u0007H\u0002¢\u0006\u0004\b[\u0010\u0004J\u000f\u0010\\\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010\u0004J\u000f\u0010]\u001a\u00020\u0007H\u0002¢\u0006\u0004\b]\u0010\u0004J\u000f\u0010^\u001a\u00020\u0007H\u0002¢\u0006\u0004\b^\u0010\u0004J\u000f\u0010_\u001a\u00020\u0007H\u0002¢\u0006\u0004\b_\u0010\u0004J\u0017\u0010a\u001a\u00020\u00072\u0006\u0010`\u001a\u000204H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u00072\u0006\u0010O\u001a\u00020-H\u0002¢\u0006\u0004\bc\u0010DJ\u0017\u0010d\u001a\u00020\u00072\u0006\u0010O\u001a\u00020-H\u0002¢\u0006\u0004\bd\u0010DJ\u000f\u0010e\u001a\u00020\u0007H\u0002¢\u0006\u0004\be\u0010\u0004J\u000f\u0010f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bf\u0010\u0004J\u000f\u0010g\u001a\u00020\u0007H\u0002¢\u0006\u0004\bg\u0010\u0004J\u000f\u0010h\u001a\u00020\u0007H\u0002¢\u0006\u0004\bh\u0010\u0004J\u0017\u0010j\u001a\u00020\u00072\u0006\u0010i\u001a\u00020'H\u0002¢\u0006\u0004\bj\u0010*R(\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR(\u0010s\u001a\b\u0012\u0004\u0012\u00020r0k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\"\u0010w\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R%\u0010}\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0099\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaFragment;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/BaseStoryV3Fragment;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaViewModel;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "attachClickableLayoutListener", "detachClickableLayoutListener", "trackVideoWatched", "setupCloseButton", "setupItem", "setupContentLayout", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "provideLayoutStrategy", "()Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "setupButtonContainer", "updateImageSize", "observeSoundMutedState", "", "isSoundMuted", "updateSoundControl", "(Z)V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithVideo;", "asset", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "storyItem", "loadVideo", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithVideo;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;)V", "showVideo", "updateLayout", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "trackView", "(Ljava/util/Map;)V", "", "framesCount", "startPosition", "setupStoryTimeline", "(ILjava/lang/Integer;)V", "bindSoundControl", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;", "preloadImage", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;)V", "preloadNextAsset", "loadData", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;)V", "loadImage", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3WithImage;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "button", "setupButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "productsList", "setupProductsList", "(Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;)V", "item", "setupUi", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;", "content", "setupContent", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "shareButton", "setupShareButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "showBottomShadowForContent", "setupBottomShadow", "observePlaybackEvents", "observeStoryEvents", "resetPlayback", "observeStateEvents", "onItemLoaded", "errorString", "onError", "(Ljava/lang/String;)V", "onNextFrame", "onPreviousFrame", "startPlayback", "restartPlayback", "pausePlayback", "onCloseStory", "hasAudio", "bindMuteButton", "LPc/a;", "provider", "LPc/a;", "getProvider", "()LPc/a;", "setProvider", "(LPc/a;)V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "pViewModel", "getPViewModel", "setPViewModel", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "getVideoController", "()Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "setVideoController", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "playStoriesV3ViewModel", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "getPlayStoriesV3ViewModel", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "setPlayStoriesV3ViewModel", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;)V", "Lru/ozon/app/android/video/download/DownloadListenersStorage;", "listenersStorage", "Lru/ozon/app/android/video/download/DownloadListenersStorage;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "previousVideoUrl", "Ljava/lang/String;", "Lru/ozon/app/android/storefront/stories/story/presentation/StorySoundControlHolder;", "soundControlHolder", "Lru/ozon/app/android/storefront/stories/story/presentation/StorySoundControlHolder;", "Lru/ozon/app/android/storefront/databinding/StoryV3ItemMediaBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/StoryV3ItemMediaBinding;", "contentWasLoaded", "Z", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "contentAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "getExoManager", "()Lru/ozon/app/android/video/manager/ExoManagerWithCache;", "exoManager", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryV3MediaFragment extends BaseStoryV3Fragment<StoryV3MediaViewModel> {
    private StoryV3ItemMediaBinding binding;
    private AtomsAdapter contentAtomsAdapter;
    private boolean contentWasLoaded;
    public a<PlayStoriesV3ViewModel> pViewModel;
    public PlayStoriesV3ViewModel playStoriesV3ViewModel;
    private SingleInstancePlayerController playerController;
    private String previousVideoUrl;
    public a<StoryV3MediaViewModel> provider;
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaFragment$Companion;", "", "<init>", "()V", "MEDIA_STORY", "", "STORY_SPAN", "DEFAULT_SPAN", "", "SECONDS_DIV", "", "newInstance", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaFragment;", "story", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "span", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaFragment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StoryV3MediaFragment newInstance(@NotNull StoryV3 story, Integer span) {
            Intrinsics.checkNotNullParameter(story, "story");
            Bundle b11 = d.b(new Pair("STORY_SPAN", Long.valueOf(span != null ? span.intValue() : 5000L)), new Pair("MEDIA_STORY", story));
            StoryV3MediaFragment storyV3MediaFragment = new StoryV3MediaFragment();
            storyV3MediaFragment.setArguments(b11);
            return storyV3MediaFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindMuteButton(boolean hasAudio) {
        SmallIconButtonView smallIconButtonView;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (smallIconButtonView = storyV3ItemMediaBinding.soundControlView) == null) {
            return;
        }
        ViewExtKt.showOrInvisible(smallIconButtonView, hasAudio);
    }

    private final void bindSoundControl() {
        StorySoundControlHolder storySoundControlHolder;
        StoryV3Item currentItem;
        StoryV3MediaViewModel viewModel = getViewModel();
        StorySoundControlDTO soundControl = (viewModel == null || (currentItem = viewModel.getCurrentItem()) == null) ? null : currentItem.getSoundControl();
        if (soundControl == null || (storySoundControlHolder = this.soundControlHolder) == null) {
            return;
        }
        StoryV3MediaViewModel viewModel2 = getViewModel();
        boolean z11 = false;
        if (viewModel2 != null && !viewModel2.isSoundMuted()) {
            z11 = true;
        }
        StorySoundControlHolder.bind$default(storySoundControlHolder, soundControl, Boolean.valueOf(!z11), null, 4, null);
    }

    private final ExoManagerWithCache getExoManager() {
        return getVideoController().getDownloadableExoManager();
    }

    private final void loadData(StoryV3Item storyItem) {
        StoryV3ItemAsset asset = storyItem.getAsset();
        if (asset instanceof StoryV3WithImage) {
            loadImage((StoryV3WithImage) asset, storyItem);
        } else {
            if (!(asset instanceof StoryV3WithVideo)) {
                throw new o();
            }
            loadVideo((StoryV3WithVideo) asset, storyItem);
        }
    }

    private final void loadImage(final StoryV3WithImage asset, StoryV3Item storyItem) {
        Bitmap bitmapFromCache;
        SingleInstanceMediaPlayController mediaPlayController;
        final StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null) {
            PlayerView storyItemVideoPV = storyV3ItemMediaBinding.storyItemVideoPV;
            Intrinsics.checkNotNullExpressionValue(storyItemVideoPV, "storyItemVideoPV");
            ViewExtKt.gone(storyItemVideoPV);
            AppCompatImageView storyItemIV = storyV3ItemMediaBinding.storyItemIV;
            Intrinsics.checkNotNullExpressionValue(storyItemIV, "storyItemIV");
            ViewExtKt.show(storyItemIV);
            SingleInstancePlayerController singleInstancePlayerController = this.playerController;
            if (singleInstancePlayerController != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
                mediaPlayController.release(StoryV3MediaFragment$loadImage$1$1.INSTANCE);
            }
            this.playerController = null;
            bindMuteButton(false);
            this.contentWasLoaded = false;
            StoryV3MediaViewModel viewModel = getViewModel();
            if (viewModel == null || (bitmapFromCache = viewModel.getBitmapFromCache(asset.getImage())) == null) {
                LoaderView loadingPB = storyV3ItemMediaBinding.loadingPB;
                Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
                ViewExtKt.show(loadingPB);
                AppCompatImageView storyItemIV2 = storyV3ItemMediaBinding.storyItemIV;
                Intrinsics.checkNotNullExpressionValue(storyItemIV2, "storyItemIV");
                ImageViewExtKt.loadAsBitmapInscribedSize$default(storyItemIV2, asset.getImage(), getTransformation(), new PikazonLoaderCallback<Bitmap>() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$loadImage$1$3$1
                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadFailed(Exception e11) {
                        StoryV3MediaViewModel viewModel2 = StoryV3MediaFragment.this.getViewModel();
                        if (viewModel2 != null) {
                            viewModel2.onLoadFailed(StringProvider.getString(R$string.common_message_no_connection));
                        }
                    }

                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadSuccessful(Bitmap resource) {
                        StoryV3MediaViewModel viewModel2 = StoryV3MediaFragment.this.getViewModel();
                        if (viewModel2 != null) {
                            viewModel2.onImageLoadSuccessful();
                        }
                        if (resource != null) {
                            StoryV3MediaFragment storyV3MediaFragment = StoryV3MediaFragment.this;
                            StoryV3WithImage storyV3WithImage = asset;
                            StoryV3MediaViewModel viewModel3 = storyV3MediaFragment.getViewModel();
                            if (viewModel3 != null) {
                                viewModel3.putStoryImageInCache(storyV3WithImage.getImage(), resource);
                            }
                        }
                        AppCompatImageView appCompatImageView = storyV3ItemMediaBinding.storyBackgroundIv;
                        if (appCompatImageView != null) {
                            StoryV3MediaFragment.this.setBlurredBackground(appCompatImageView, resource);
                        }
                    }
                }, null, null, 24, null);
            } else {
                storyV3ItemMediaBinding.storyItemIV.setImageBitmap(bitmapFromCache);
                AppCompatImageView appCompatImageView = storyV3ItemMediaBinding.storyBackgroundIv;
                if (appCompatImageView != null) {
                    setBlurredBackground(appCompatImageView, bitmapFromCache);
                }
                StoryV3MediaViewModel viewModel2 = getViewModel();
                if (viewModel2 != null) {
                    viewModel2.onImageLoadSuccessful();
                }
            }
        }
        setupUi(storyItem);
        preloadNextAsset();
    }

    private final void loadVideo(final StoryV3WithVideo asset, final StoryV3Item storyItem) {
        List<DownloadListener> list;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null) {
            LoaderView loadingPB = storyV3ItemMediaBinding.loadingPB;
            Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
            ViewExtKt.show(loadingPB);
            AppCompatImageView storyItemIV = storyV3ItemMediaBinding.storyItemIV;
            Intrinsics.checkNotNullExpressionValue(storyItemIV, "storyItemIV");
            ViewExtKt.invisible(storyItemIV);
        }
        String str = this.previousVideoUrl;
        if (str != null && (list = this.listenersStorage.getListeners().get(str)) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getExoManager().removeListener(str, (DownloadListener) it.next());
            }
        }
        DownloadListener downloadListener = new DownloadListener() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$loadVideo$downloadListener$1
            @Override // ru.ozon.app.android.video.download.DownloadListener
            public void onError(Exception e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                StoryV3MediaViewModel viewModel = StoryV3MediaFragment.this.getViewModel();
                if (viewModel != null) {
                    viewModel.onLoadFailed(StringProvider.getString(R$string.common_message_no_connection));
                }
            }

            @Override // ru.ozon.app.android.video.download.DownloadListener
            public void onSuccess() {
                StoryV3MediaFragment.this.showVideo(asset, storyItem);
            }
        };
        this.previousVideoUrl = asset.getLink();
        this.listenersStorage.addListener(asset.getLink(), downloadListener);
        getExoManager().downloadVideo(asset.getLink(), downloadListener);
    }

    private final void observePlaybackEvents() {
        SingleLiveEvent<PlaybackType> storyPlaybackEvent;
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel == null || (storyPlaybackEvent = viewModel.getStoryPlaybackEvent()) == null) {
            return;
        }
        storyPlaybackEvent.observe(this, new StoryV3MediaFragment$sam$androidx_lifecycle_Observer$0(new StoryV3MediaFragment$observePlaybackEvents$1(this)));
    }

    private final void observeSoundMutedState() {
        SingleLiveEvent<Boolean> soundMutedState;
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel == null || (soundMutedState = viewModel.getSoundMutedState()) == null) {
            return;
        }
        soundMutedState.observe(getViewLifecycleOwner(), new StoryV3MediaFragment$sam$androidx_lifecycle_Observer$0(new StoryV3MediaFragment$observeSoundMutedState$1(this)));
    }

    private final void observeStateEvents() {
        SingleLiveEvent<StoryItemEvent> storyStateEvent;
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel == null || (storyStateEvent = viewModel.getStoryStateEvent()) == null) {
            return;
        }
        storyStateEvent.observe(this, new StoryV3MediaFragment$sam$androidx_lifecycle_Observer$0(new StoryV3MediaFragment$observeStateEvents$1(this)));
    }

    private final void observeStoryEvents() {
        SingleLiveEvent<Event> storyEvents;
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel == null || (storyEvents = viewModel.getStoryEvents()) == null) {
            return;
        }
        storyEvents.observe(this, new StoryV3MediaFragment$sam$androidx_lifecycle_Observer$0(new StoryV3MediaFragment$observeStoryEvents$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCloseStory() {
        trackVideoWatched();
        getPlayStoriesV3ViewModel().onCloseStories();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(String errorString) {
        final StoryV3Item currentItem;
        final StoryV3ItemMediaBinding storyV3ItemMediaBinding;
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel == null || (currentItem = viewModel.getCurrentItem()) == null || (storyV3ItemMediaBinding = this.binding) == null) {
            return;
        }
        storyV3ItemMediaBinding.retryTv.setText(errorString);
        storyV3ItemMediaBinding.retryTv.setOnClickListener(new View.OnClickListener() { // from class: hK.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryV3MediaFragment.onError$lambda$25$lambda$24(StoryV3ItemMediaBinding.this, this, currentItem, view);
            }
        });
        TextView retryTv = storyV3ItemMediaBinding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.show(retryTv);
        LoaderView loadingPB = storyV3ItemMediaBinding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.gone(loadingPB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$25$lambda$24(StoryV3ItemMediaBinding storyV3ItemMediaBinding, StoryV3MediaFragment storyV3MediaFragment, StoryV3Item storyV3Item, View view) {
        TextView retryTv = storyV3ItemMediaBinding.retryTv;
        Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
        ViewExtKt.gone(retryTv);
        LoaderView loadingPB = storyV3ItemMediaBinding.loadingPB;
        Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
        ViewExtKt.show(loadingPB);
        storyV3MediaFragment.loadData(storyV3Item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemLoaded() {
        this.contentWasLoaded = true;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null) {
            LoaderView loadingPB = storyV3ItemMediaBinding.loadingPB;
            Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
            ViewExtKt.gone(loadingPB);
            startPlayback();
            TextView retryTv = storyV3ItemMediaBinding.retryTv;
            Intrinsics.checkNotNullExpressionValue(retryTv, "retryTv");
            ViewExtKt.gone(retryTv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextFrame(StoryV3Item item) {
        StoryTimeLine storyTimeLine;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
            storyTimeLine.next();
        }
        loadData(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPreviousFrame(StoryV3Item item) {
        StoryTimeLine storyTimeLine;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
            storyTimeLine.previous();
        }
        loadData(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pausePlayback() {
        StoryTimeLine storyTimeLine;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
            storyTimeLine.pause();
        }
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || !singleInstancePlayerController.mediaPlayController().isPlaying()) {
            return;
        }
        singleInstancePlayerController.mediaPlayController().pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadImage(StoryV3WithImage asset) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String image = asset.getImage();
        StoryV3MediaViewModel viewModel = getViewModel();
        ContextExtKt.loadAsBitmapInscribedSize(requireContext, image, (r14 & 2) != 0 ? K.f71697a : getTransformation(), (r14 & 4) != 0 ? null : viewModel != null ? viewModel.getOverrideParams() : null, (r14 & 8) != 0 ? LoadPriority.NORMAL : null, (r14 & 16) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : null, (r14 & 32) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$1.INSTANCE : null, (r14 & 64) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$2.INSTANCE : new StoryV3MediaFragment$preloadImage$1(this, asset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadNextAsset() {
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.preloadNextAsset();
        }
    }

    private final LayoutV3Strategy provideLayoutStrategy() {
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        ConstraintLayout constraintLayout = storyV3ItemMediaBinding != null ? storyV3ItemMediaBinding.rootCl : null;
        return isTablet() ? new TabletV3LayoutStrategy(constraintLayout) : isSmallPhone() ? new MobileV3LayoutStrategySmall(constraintLayout) : new MobileV3LayoutStrategy(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetPlayback() {
        SingleInstanceMediaPlayController mediaPlayController;
        BasePlayerPositionController positionController;
        StoryTimeLine storyTimeLine;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
            storyTimeLine.stopAndReset();
        }
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (positionController = singleInstancePlayerController.positionController()) != null) {
            positionController.seekToStartAndReplay();
        }
        SingleInstancePlayerController singleInstancePlayerController2 = this.playerController;
        if (singleInstancePlayerController2 == null || (mediaPlayController = singleInstancePlayerController2.mediaPlayController()) == null) {
            return;
        }
        mediaPlayController.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartPlayback() {
        BasePlayerPositionController positionController;
        StoryTimeLine storyTimeLine;
        if (this.contentWasLoaded && isResumed()) {
            StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
            if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
                storyTimeLine.replay();
            }
            SingleInstancePlayerController singleInstancePlayerController = this.playerController;
            if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null) {
                return;
            }
            positionController.seekToStartAndReplay();
        }
    }

    private final void setupBottomShadow(boolean showBottomShadowForContent) {
        AppCompatImageView appCompatImageView;
        boolean z11 = true;
        boolean z12 = isTablet() || isSmallPhone();
        if (!showBottomShadowForContent && !z12) {
            z11 = false;
        }
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (appCompatImageView = storyV3ItemMediaBinding.bottomShadowIv) == null) {
            return;
        }
        ViewExtKt.showOrGone(appCompatImageView, Boolean.valueOf(z11));
    }

    private final void setupButton(ButtonDTO button) {
        ButtonView buttonView;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (buttonView = storyV3ItemMediaBinding.button) == null) {
            return;
        }
        ButtonHolderKt.bindOrGone(buttonView, button, new StoryV3MediaFragment$setupButton$1(this));
    }

    private final void setupButtonContainer() {
        StoryV3ItemMediaBinding storyV3ItemMediaBinding;
        LinearLayoutCompat linearLayoutCompat;
        if ((!isSmallPhone() && !isTablet()) || (storyV3ItemMediaBinding = this.binding) == null || (linearLayoutCompat = storyV3ItemMediaBinding.smallButtonContainerLLC) == null) {
            return;
        }
        linearLayoutCompat.setBackground(null);
    }

    private final void setupCloseButton() {
        SmallIconButtonView smallIconButtonView;
        StoryV3 story;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (smallIconButtonView = storyV3ItemMediaBinding.closeSIB) == null) {
            return;
        }
        StoryV3MediaViewModel viewModel = getViewModel();
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, (viewModel == null || (story = viewModel.getStory()) == null) ? null : story.getCloseButton(), new StoryV3MediaFragment$setupCloseButton$1(this));
    }

    private final void setupContent(StoryV3Content content) {
        AtomsAdapter atomsAdapter = this.contentAtomsAdapter;
        if (atomsAdapter != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            List<AtomDTO> contentList = content != null ? content.getContentList() : null;
            if (contentList == null) {
                contentList = K.f71697a;
            }
            atomsAdapter.bind(requireContext, contentList);
        }
    }

    private final void setupContentLayout() {
        VerticalAtomsLayout verticalAtomsLayout;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (verticalAtomsLayout = storyV3ItemMediaBinding.atomsContent) == null) {
            return;
        }
        verticalAtomsLayout.setAdapter(this.contentAtomsAdapter);
    }

    private final void setupItem() {
        StoryV3MediaViewModel viewModel;
        Integer storySize;
        StoryV3Item currentItem;
        IconTitleSubtitleCellView iconTitleSubtitleCellView;
        StoryV3 story;
        StoryV3 story2;
        StoryV3MediaViewModel viewModel2 = getViewModel();
        IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO = null;
        if (!(((viewModel2 == null || (story2 = viewModel2.getStory()) == null) ? null : story2.getData()) instanceof StoryV3Media) || (viewModel = getViewModel()) == null || (storySize = viewModel.getStorySize()) == null) {
            return;
        }
        int intValue = storySize.intValue();
        StoryV3MediaViewModel viewModel3 = getViewModel();
        if (viewModel3 == null || (currentItem = viewModel3.getCurrentItem()) == null) {
            return;
        }
        StoryV3MediaViewModel viewModel4 = getViewModel();
        int currentItemIndex = viewModel4 != null ? viewModel4.getCurrentItemIndex() : 0;
        loadData(currentItem);
        observeStateEvents();
        observePlaybackEvents();
        observeStoryEvents();
        setupStoryTimeline(intValue, Integer.valueOf(currentItemIndex));
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null && (iconTitleSubtitleCellView = storyV3ItemMediaBinding.authorBlock) != null) {
            StoryV3MediaViewModel viewModel5 = getViewModel();
            if (viewModel5 != null && (story = viewModel5.getStory()) != null) {
                iconTitleSubtitleCellDTO = story.getAuthorBlock();
            }
            IconTitleSubtitleCellHolderKt.bindOrGone(iconTitleSubtitleCellView, iconTitleSubtitleCellDTO, new StoryV3MediaFragment$setupItem$1(this));
        }
        bindSoundControl();
    }

    private final void setupProductsList(SocialProductListDTO productsList) {
        SocialProductListView socialProductListView;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (socialProductListView = storyV3ItemMediaBinding.socialProductsList) == null) {
            return;
        }
        if (productsList == null) {
            ViewExtKt.gone(socialProductListView);
            return;
        }
        socialProductListView.setup(productsList, new StoryV3MediaFragment$setupProductsList$1$1(this));
        socialProductListView.setOnAction(new StoryV3MediaFragment$setupProductsList$1$2(this));
        ViewExtKt.show(socialProductListView);
    }

    private final void setupShareButton(ButtonV3Atom.SmallIconButton shareButton) {
        SmallIconButtonView smallIconButtonView;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (smallIconButtonView = storyV3ItemMediaBinding.shareSIVC) == null) {
            return;
        }
        WrappedIconButtonHolderKt.bind(smallIconButtonView, shareButton, new StoryV3MediaFragment$setupShareButton$1(this));
    }

    private final void setupStoryTimeline(int framesCount, Integer startPosition) {
        StoryTimeLine storyTimeLine;
        Bundle arguments = getArguments();
        long j11 = arguments != null ? arguments.getLong("STORY_SPAN") : 5000L;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (storyTimeLine = storyV3ItemMediaBinding.timeLine) == null) {
            return;
        }
        storyTimeLine.init(framesCount, startPosition != null ? startPosition.intValue() : 0, j11);
        storyTimeLine.setAnimationListener(new StoryTimeLine.AnimationListener() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$setupStoryTimeline$1$1
            @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine.AnimationListener
            public void onAnimationComplete() {
                StoryV3MediaViewModel viewModel = StoryV3MediaFragment.this.getViewModel();
                if (viewModel != null) {
                    viewModel.onTimeLineAnimationComplete();
                }
            }
        });
    }

    private final void setupUi(StoryV3Item item) {
        LayoutV3Strategy layoutStrategy = getLayoutStrategy();
        if (layoutStrategy != null) {
            StoryV3Content content = item.getContent();
            layoutStrategy.updateContentAlignment(content != null ? content.getAlign() : null);
        }
        setupButton(item.getButton());
        setupProductsList(item.getProductsList());
        setupContent(item.getContent());
        setupShareButton(item.getTabBar().getShareButton());
        setupBottomShadow(item.getShouldShowBottomShadow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showVideo(StoryV3WithVideo asset, StoryV3Item storyItem) {
        PlayerView playerView;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null) {
            SingleInstanceMediaPlayController mediaPlayController = singleInstancePlayerController.mediaPlayController();
            if (mediaPlayController != null) {
                mediaPlayController.release(StoryV3MediaFragment$showVideo$1.INSTANCE);
            }
            this.playerController = null;
        }
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (playerView = storyV3ItemMediaBinding.storyItemVideoPV) == null) {
            return;
        }
        bindSoundControl();
        SingleInstancePlayerController singleInstancePlayerController$default = VideoController.DefaultImpls.getSingleInstancePlayerController$default(getVideoController(), null, 1, null);
        BasePlayerViewController.DefaultImpls.bindPlayerView$default(singleInstancePlayerController$default.playerViewController(), playerView, null, 2, null);
        SingleInstanceMediaPlayController mediaPlayController2 = singleInstancePlayerController$default.mediaPlayController();
        String link = asset.getLink();
        ExoManagerWithCache exoManager = getExoManager();
        StoryV3MediaViewModel viewModel = getViewModel();
        boolean z11 = false;
        if (viewModel != null && !viewModel.isSoundMuted()) {
            z11 = true;
        }
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.hasAudio(new B(this));
        builder.onStart(new c(this, singleInstancePlayerController$default, playerView, storyItem));
        builder.onBuffer(new D(this));
        builder.onError(new b(this));
        builder.onReady(new E(this, 4));
        builder.onRenderedFirstFrame(new E.D(this, playerView));
        Unit unit = Unit.f71690a;
        mediaPlayController2.prepareMediaToPlay(link, exoManager, true, false, !z11, builder.build(), null, null);
        this.playerController = singleInstancePlayerController$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$17$lambda$16$lambda$10(StoryV3MediaFragment storyV3MediaFragment, SingleInstancePlayerController singleInstancePlayerController, PlayerView playerView, StoryV3Item storyV3Item, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!storyV3MediaFragment.isResumed()) {
            singleInstancePlayerController.mediaPlayController().pause();
        }
        if (playerView.getVisibility() == 8) {
            ViewExtKt.show(playerView);
        }
        storyV3MediaFragment.setupUi(storyV3Item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$17$lambda$16$lambda$11(StoryV3MediaFragment storyV3MediaFragment) {
        StoryV3MediaViewModel viewModel = storyV3MediaFragment.getViewModel();
        if (viewModel != null) {
            viewModel.onBuffer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$17$lambda$16$lambda$12(StoryV3MediaFragment storyV3MediaFragment, String message, Exception exc, Boolean bool) {
        StoryTimeLine storyTimeLine;
        Intrinsics.checkNotNullParameter(message, "message");
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = storyV3MediaFragment.binding;
        if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
            storyTimeLine.pause();
        }
        StoryV3MediaViewModel viewModel = storyV3MediaFragment.getViewModel();
        if (viewModel != null) {
            viewModel.onLoadFailed(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$17$lambda$16$lambda$13(StoryV3MediaFragment storyV3MediaFragment, PlayerState playerState) {
        StoryTimeLine storyTimeLine;
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = storyV3MediaFragment.binding;
        if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
            storyTimeLine.setDuration(playerState.getDuration());
        }
        storyV3MediaFragment.onItemLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$17$lambda$16$lambda$15(StoryV3MediaFragment storyV3MediaFragment, PlayerView playerView) {
        storyV3MediaFragment.handler.post(new f(2, storyV3MediaFragment, playerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showVideo$lambda$17$lambda$16$lambda$15$lambda$14(StoryV3MediaFragment storyV3MediaFragment, PlayerView playerView) {
        AppCompatImageView appCompatImageView;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = storyV3MediaFragment.binding;
        if (storyV3ItemMediaBinding == null || (appCompatImageView = storyV3ItemMediaBinding.storyBackgroundIv) == null) {
            return;
        }
        View t2 = playerView.t();
        TextureView textureView = t2 instanceof TextureView ? (TextureView) t2 : null;
        storyV3MediaFragment.setBlurredBackground(appCompatImageView, textureView != null ? textureView.getBitmap() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPlayback() {
        StoryTimeLine storyTimeLine;
        StoryV3Item currentItem;
        if (this.contentWasLoaded && isResumed()) {
            StoryV3MediaViewModel viewModel = getViewModel();
            trackView((viewModel == null || (currentItem = viewModel.getCurrentItem()) == null) ? null : currentItem.getTrackingInfo());
            StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
            if (storyV3ItemMediaBinding != null && (storyTimeLine = storyV3ItemMediaBinding.timeLine) != null) {
                storyTimeLine.play();
            }
            SingleInstancePlayerController singleInstancePlayerController = this.playerController;
            if (singleInstancePlayerController == null || !singleInstancePlayerController.mediaPlayController().isReadyToPlayAndPaused()) {
                return;
            }
            singleInstancePlayerController.mediaPlayController().resume();
        }
    }

    private final void trackView(Map<String, TokenizedTrackingInfo> trackingInfo) {
        getPlayStoriesV3ViewModel().onTrackView(trackingInfo);
    }

    private final void updateImageSize() {
        AppCompatImageView appCompatImageView;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (appCompatImageView = storyV3ItemMediaBinding.storyItemIV) == null) {
            return;
        }
        appCompatImageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$updateImageSize$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                StoryV3MediaViewModel viewModel = StoryV3MediaFragment.this.getViewModel();
                if (viewModel != null) {
                    viewModel.putOverrideParams(view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                StoryV3MediaFragment.this.preloadNextAsset();
            }
        });
    }

    private final void updateLayout() {
        LayoutV3Strategy layoutStrategy = getLayoutStrategy();
        if (layoutStrategy != null) {
            layoutStrategy.updateLayout(getPlayStoriesV3ViewModel().getSystemElementsSetting().getStatusBarHeight(), getPlayStoriesV3ViewModel().getSystemElementsSetting().getBottomNavBarHeight(), getOrientation());
        }
        updateImageSize();
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

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment
    public void attachClickableLayoutListener() {
        StoryItemClickableLayoutV3 storyItemClickableLayoutV3;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (storyItemClickableLayoutV3 = storyV3ItemMediaBinding.gestureView) == null) {
            return;
        }
        storyItemClickableLayoutV3.setTouchEventListener(new StoryItemClickableLayoutV3.TouchEventListener() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$attachClickableLayoutListener$1
            @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3.TouchEventListener
            public void onClickUp(StoryItemClickableLayoutV3.AreaType areaType) {
                Intrinsics.checkNotNullParameter(areaType, "areaType");
                StoryV3MediaViewModel viewModel = StoryV3MediaFragment.this.getViewModel();
                if (viewModel != null) {
                    viewModel.onContainerClicked(areaType);
                }
            }

            @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3.TouchEventListener
            public void onLongClickDown() {
                StoryV3MediaFragment.this.pausePlayback();
            }

            @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3.TouchEventListener
            public void onLongClickUp() {
                StoryV3MediaFragment.this.startPlayback();
            }

            @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3.TouchEventListener
            public void onSwipeDown() {
                StoryV3MediaFragment.this.trackVideoWatched();
                StoryV3MediaFragment.this.getPlayStoriesV3ViewModel().onSwipeDown();
            }
        });
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment
    public void detachClickableLayoutListener() {
        StoryItemClickableLayoutV3 storyItemClickableLayoutV3;
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding == null || (storyItemClickableLayoutV3 = storyV3ItemMediaBinding.gestureView) == null) {
            return;
        }
        storyItemClickableLayoutV3.setTouchEventListener(null);
    }

    @NotNull
    public final a<PlayStoriesV3ViewModel> getPViewModel() {
        a<PlayStoriesV3ViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @NotNull
    public final PlayStoriesV3ViewModel getPlayStoriesV3ViewModel() {
        PlayStoriesV3ViewModel playStoriesV3ViewModel = this.playStoriesV3ViewModel;
        if (playStoriesV3ViewModel != null) {
            return playStoriesV3ViewModel;
        }
        Intrinsics.n("playStoriesV3ViewModel");
        throw null;
    }

    @NotNull
    public final a<StoryV3MediaViewModel> getProvider() {
        a<StoryV3MediaViewModel> aVar = this.provider;
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
        super.onAttach(context);
        setViewModel((BaseStoryV3ViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$onAttach$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                StoryV3MediaViewModel storyV3MediaViewModel = StoryV3MediaFragment.this.getProvider().get();
                Intrinsics.g(storyV3MediaViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return storyV3MediaViewModel;
            }
        }).a(StoryV3MediaViewModel.class));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parcelable parcelable = requireArguments().getParcelable("MEDIA_STORY");
        StoryV3 storyV3 = parcelable instanceof StoryV3 ? (StoryV3) parcelable : null;
        if (storyV3 == null) {
            return;
        }
        StoryV3Type data = storyV3.getData();
        StoryV3Media storyV3Media = data instanceof StoryV3Media ? (StoryV3Media) data : null;
        if (storyV3Media == null) {
            return;
        }
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.setup(storyV3, storyV3Media);
        }
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        setPlayStoriesV3ViewModel((PlayStoriesV3ViewModel) new z0(requireActivity, new z0.c() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PlayStoriesV3ViewModel playStoriesV3ViewModel = StoryV3MediaFragment.this.getPViewModel().get();
                Intrinsics.g(playStoriesV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return playStoriesV3ViewModel;
            }
        }).a(PlayStoriesV3ViewModel.class));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        StoryV3ItemMediaBinding inflate = StoryV3ItemMediaBinding.inflate(inflater, container, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        SingleInstanceMediaPlayController mediaPlayController;
        super.onDestroyView();
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null) {
            storyV3ItemMediaBinding.timeLine.fullReset();
            storyV3ItemMediaBinding.timeLine.setAnimationListener(null);
            storyV3ItemMediaBinding.socialProductsList.setOnAction(null);
            this.handler.removeCallbacksAndMessages(null);
            SingleInstancePlayerController singleInstancePlayerController = this.playerController;
            if (singleInstancePlayerController != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
                mediaPlayController.release(StoryV3MediaFragment$onDestroyView$1$1.INSTANCE);
            }
            AtomsAdapter atomsAdapter = this.contentAtomsAdapter;
            if (atomsAdapter != null) {
                atomsAdapter.onRecycle();
            }
            this.contentAtomsAdapter = null;
        }
        this.playerController = null;
        this.soundControlHolder = null;
        this.binding = null;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        pausePlayback();
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        StoryV3 story;
        super.onResume();
        startPlayback();
        StoryV3MediaViewModel viewModel = getViewModel();
        if (viewModel == null || (story = viewModel.getStory()) == null) {
            return;
        }
        getPlayStoriesV3ViewModel().onStoryViewed(story.getStoryId());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.contentAtomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        StoryV3ItemMediaBinding storyV3ItemMediaBinding = this.binding;
        if (storyV3ItemMediaBinding != null) {
            ConstraintLayout constraintLayout = storyV3ItemMediaBinding.contentCl;
            if (constraintLayout != null) {
                constraintLayout.setClipToOutline(true);
            }
            SmallIconButtonView soundControlView = storyV3ItemMediaBinding.soundControlView;
            Intrinsics.checkNotNullExpressionValue(soundControlView, "soundControlView");
            this.soundControlHolder = new StorySoundControlHolder(soundControlView, null, new StoryV3MediaFragment$onViewCreated$1$1(this), new StoryV3MediaFragment$onViewCreated$1$2(this), 2, null);
            storyV3ItemMediaBinding.storyItemVideoPV.setTag(R.id.tag_key_widget_name, "cms.playStories");
            setLayoutStrategy(provideLayoutStrategy());
            updateLayout();
            setupContentLayout();
            setupCloseButton();
            setupButtonContainer();
            observeSoundMutedState();
            storyV3ItemMediaBinding.socialProductsList.addOnItemTouchListener(new RecyclerView.s() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment$onViewCreated$1$3
                @Override // androidx.recyclerview.widget.RecyclerView.s
                public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                    Intrinsics.checkNotNullParameter(rv, "rv");
                    Intrinsics.checkNotNullParameter(e11, "e");
                    int action = e11.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            ViewParent parent = rv.getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                            return false;
                        }
                        if (action != 2) {
                            return true;
                        }
                    }
                    ViewParent parent2 = rv.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    return false;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.s
                public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
                }

                @Override // androidx.recyclerview.widget.RecyclerView.s
                public void onTouchEvent(RecyclerView rv, MotionEvent e11) {
                    Intrinsics.checkNotNullParameter(rv, "rv");
                    Intrinsics.checkNotNullParameter(e11, "e");
                }
            });
            setupItem();
        }
    }

    public final void setPlayStoriesV3ViewModel(@NotNull PlayStoriesV3ViewModel playStoriesV3ViewModel) {
        Intrinsics.checkNotNullParameter(playStoriesV3ViewModel, "<set-?>");
        this.playStoriesV3ViewModel = playStoriesV3ViewModel;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment
    public void trackVideoWatched() {
        BasePlayerPositionController positionController;
        String l11;
        StoryV3Item currentItem;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null || (l11 = Long.valueOf(positionController.getCurrentPosition() / 1000).toString()) == null) {
            return;
        }
        PlayStoriesV3ViewModel playStoriesV3ViewModel = getPlayStoriesV3ViewModel();
        StoryV3MediaViewModel viewModel = getViewModel();
        playStoriesV3ViewModel.trackVideoWatched(l11, (viewModel == null || (currentItem = viewModel.getCurrentItem()) == null) ? null : currentItem.getAsset());
    }
}
