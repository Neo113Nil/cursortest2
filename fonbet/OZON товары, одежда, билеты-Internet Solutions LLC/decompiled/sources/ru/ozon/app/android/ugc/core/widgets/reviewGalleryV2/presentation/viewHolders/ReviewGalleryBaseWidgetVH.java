package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import Ae.C2408n0;
import B90.N;
import EM.a;
import GI.c;
import Sc.o;
import Ve.C4598rp;
import Vg.d;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.C;
import androidx.activity.J;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.bottomsheet.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pdp.utils.views.touchview.TouchImageView;
import ru.ozon.app.android.pdpvideomolecule.R$style;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeView;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeNamespace;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonHolderKt;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelMapperKt;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryHasAudioUpdateKey;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGallerySwitchActionUpdateKey;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryComposerAction;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.RightPanelButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.SocialSoundControlDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.PlayerEventCallback;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.RedesignedPhotoBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVisibilityDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.SubviewsDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0006£\u0001¦\u0001©\u0001\b\u0011\u0018\u0000 Â\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Â\u0001Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J'\u0010-\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b-\u00101J\u000f\u00102\u001a\u00020 H\u0016¢\u0006\u0004\b2\u0010$J\u000f\u00103\u001a\u00020 H\u0016¢\u0006\u0004\b3\u0010$J)\u00108\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010>\u001a\u00020 2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0014¢\u0006\u0004\b>\u0010?J-\u0010D\u001a\u00020 2\b\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010B\u001a\u00020<2\b\b\u0002\u0010C\u001a\u00020<H\u0014¢\u0006\u0004\bD\u0010EJ\u001b\u0010H\u001a\u00020 *\u00020F2\u0006\u0010G\u001a\u00020<H\u0004¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020 H\u0002¢\u0006\u0004\bM\u0010$J\u0017\u0010P\u001a\u00020<2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020R2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020 H\u0002¢\u0006\u0004\bU\u0010$J\u0019\u0010W\u001a\u00020 2\b\b\u0002\u0010V\u001a\u00020<H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020 H\u0002¢\u0006\u0004\bY\u0010$J\u000f\u0010Z\u001a\u00020 H\u0002¢\u0006\u0004\bZ\u0010$J\u000f\u0010[\u001a\u00020 H\u0002¢\u0006\u0004\b[\u0010$J\u000f\u0010\\\u001a\u00020 H\u0002¢\u0006\u0004\b\\\u0010$J\u000f\u0010]\u001a\u00020 H\u0002¢\u0006\u0004\b]\u0010$J\u000f\u0010^\u001a\u00020 H\u0002¢\u0006\u0004\b^\u0010$J\u000f\u0010_\u001a\u00020 H\u0002¢\u0006\u0004\b_\u0010$J\u000f\u0010`\u001a\u00020 H\u0002¢\u0006\u0004\b`\u0010$J+\u0010f\u001a\u00020 2\u0006\u0010b\u001a\u00020a2\b\u0010c\u001a\u0004\u0018\u00010<2\b\u0010e\u001a\u0004\u0018\u00010dH\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010k\u001a\u00020 *\u00020h2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ'\u0010p\u001a\b\u0012\u0004\u0012\u00020n0m*\b\u0012\u0004\u0012\u00020n0m2\u0006\u0010o\u001a\u00020iH\u0002¢\u0006\u0004\bp\u0010qJ\u001f\u0010s\u001a\u00020 2\u0006\u0010r\u001a\u00020i2\u0006\u0010o\u001a\u00020iH\u0002¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020 H\u0002¢\u0006\u0004\bu\u0010$J\u0017\u0010v\u001a\u00020 2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020 H\u0002¢\u0006\u0004\bx\u0010$J#\u0010|\u001a\u00020 2\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020z0yH\u0002¢\u0006\u0004\b|\u0010}J\u0014\u0010\u007f\u001a\u00020 *\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J+\u0010\u0086\u0001\u001a\u00020 2\r\u0010\u0083\u0001\u001a\b0\u0081\u0001j\u0003`\u0082\u00012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0088\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0089\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u008a\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008b\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u008c\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u008d\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u008e\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u008f\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0090\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0091\u0001R+\u0010\u0092\u0001\u001a\u0004\u0018\u00010F8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R$\u0010\u009f\u0001\u001a\u000f\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020 0\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010ª\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R$\u0010¬\u0001\u001a\u000f\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020 0\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010 \u0001R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001c\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001e\u0010´\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010m8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001a\u0010½\u0001\u001a\u0005\u0018\u00010º\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u001a\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001¨\u0006Ã\u0001"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;", "view", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/RedesignedPhotoBinder;", "redesignedPhotoBinder", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate;", "subviewsDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "playerDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "mainViewModel", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/RedesignedPhotoBinder;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LWZ/l;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "()V", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;Ll20/d;Ljava/lang/Object;)V", "onViewInVisibleBounds", "onRecycle", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "content", "", "isCompactControls", "buildVideo", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Z)V", "", "currentPosition", "isPlaybackAvailable", "needNewHolder", "managePlaying", "(Ljava/lang/Integer;ZZ)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "isSoundMuted", "setSoundState", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;Z)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate;", "getOrCreateVideoEventDelegate", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate;", "buildImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleDismissAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "buildVideoMoleculeView", "(Z)Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "buildProduct", "resetScroll", "buildProductsContainer", "(Z)V", "buildRating", "buildBadge", "buildCommentFooter", "buildSocialHeader", "buildSubviewsContainers", "buildSideButtonsHeader", "buildCloseButton", "buildRightPanel", "", "widgetId", "hasAudio", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "rightPanelDTO", "bindRightPanelButtons", "(JLjava/lang/Boolean;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;)V", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;", "", ImagesContract.URL, "loadImage", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;Ljava/lang/String;)V", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO;", "actionId", "updateStateForButtonWithAction", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "reviewUuid", "saveLikeState", "(Ljava/lang/String;Ljava/lang/String;)V", "updateActionStatesIfNeeded", "handleSwipeToNextItem", "(I)V", "invalidateSubscribeButton", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "sendSwipeAnalytics", "(Ljava/util/Map;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;", "processOnBackAction", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$OnBackConfigVO;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(La00/f;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/RedesignedPhotoBinder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "LWZ/l;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "videoHolder", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "getVideoHolder", "()Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "setVideoHolder", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeView;", "videoMoleculeView", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeView;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/VideoMoleculeRefsProvider;", "videoRefs", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/VideoMoleculeRefsProvider;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "videoEventDelegate", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate;", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH$playerEventCallback$1", "playerEventCallback", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH$playerEventCallback$1;", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH$fragmentLifecycleCallbacks$1", "fragmentLifecycleCallbacks", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH$fragmentLifecycleCallbacks$1;", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH$onBackPressedCallback$1;", "handleBackClick", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVisibilityDelegate;", "reviewGalleryVisibilityDelegate", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVisibilityDelegate;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2EventsDelegate;", "reviewGalleryEventsDelegate", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2EventsDelegate;", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "isSkippedFirst", "Z", "prevCurrentPosition", "Ljava/lang/Integer;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModelImpl;", "viewModel", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRecycler", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ReviewGalleryBaseWidgetVH extends k<ReviewGalleryVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReviewGalleryBaseWidgetVH$fragmentLifecycleCallbacks$1 fragmentLifecycleCallbacks;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final Function1<AtomAction, Unit> handleBackClick;
    private boolean isSkippedFirst;

    @NotNull
    private final ReviewGalleryV2MainViewModel mainViewModel;

    @NotNull
    private final ReviewGalleryBaseWidgetVH$onBackPressedCallback$1 onBackPressedCallback;

    @NotNull
    private final VideoMoleculePlayerDelegate playerDelegate;

    @NotNull
    private final ReviewGalleryBaseWidgetVH$playerEventCallback$1 playerEventCallback;
    private Integer prevCurrentPosition;

    @NotNull
    private final RedesignedPhotoBinder redesignedPhotoBinder;

    @NotNull
    private final ComposerReferences refs;
    private ReviewGalleryV2EventsDelegate reviewGalleryEventsDelegate;
    private ReviewGalleryVisibilityDelegate reviewGalleryVisibilityDelegate;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;

    @NotNull
    private final SubviewsDelegate subviewsDelegate;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel;
    private VideoEventDelegate videoEventDelegate;
    private VideoMoleculeViewHolder videoHolder;
    private VideoMoleculeView videoMoleculeView;

    @NotNull
    private final VideoMoleculeRefsProvider videoRefs;

    @NotNull
    private final ReviewGalleryView view;

    @NotNull
    protected static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "currentPosition", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            VideoMoleculeViewHolder videoHolder;
            VideoEventDelegate videoEventDelegate;
            if (ReviewGalleryBaseWidgetVH.this.getAdapterPosition() != -1) {
                int adapterPosition = ReviewGalleryBaseWidgetVH.this.getAdapterPosition();
                Integer lastItemPosition = ReviewGalleryBaseWidgetVH.this.mainViewModel.getLastItemPosition();
                if (lastItemPosition != null && adapterPosition == lastItemPosition.intValue() && i11 != ReviewGalleryBaseWidgetVH.this.getAdapterPosition() && (videoEventDelegate = ReviewGalleryBaseWidgetVH.this.videoEventDelegate) != null) {
                    videoEventDelegate.onItemChanged();
                }
            }
            if (ReviewGalleryBaseWidgetVH.this.getAdapterPosition() != -1 && i11 != ReviewGalleryBaseWidgetVH.this.getAdapterPosition() && (videoHolder = ReviewGalleryBaseWidgetVH.this.getVideoHolder()) != null) {
                videoHolder.seekTo(0L);
            }
            ReviewGalleryV2ViewModelImpl viewModel = ReviewGalleryBaseWidgetVH.this.getViewModel();
            if (viewModel != null) {
                viewModel.currentWidgetChanged(i11);
            }
            ReviewGalleryBaseWidgetVH.this.handleSwipeToNextItem(i11);
            ReviewGalleryBaseWidgetVH.managePlaying$default(ReviewGalleryBaseWidgetVH.this, Integer.valueOf(i11), false, false, 6, null);
            Integer num = ReviewGalleryBaseWidgetVH.this.prevCurrentPosition;
            boolean z11 = num == null || num.intValue() != i11;
            ReviewGalleryBaseWidgetVH.this.prevCurrentPosition = Integer.valueOf(i11);
            if (z11) {
                ReviewGalleryV2ViewModelImpl viewModel2 = ReviewGalleryBaseWidgetVH.this.getViewModel();
                if (viewModel2 != null) {
                    viewModel2.clearProductsContainerScrollState();
                }
                ReviewGalleryBaseWidgetVH.this.buildProductsContainer(true);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "playbackAvailable", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        
            if (r1.intValue() == 1) goto L13;
         */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Boolean bool) {
            RecyclerView composerRecycler = ReviewGalleryBaseWidgetVH.this.getComposerRecycler();
            if (composerRecycler != null) {
                boolean z11 = bool.booleanValue() && (r1 = ReviewGalleryBaseWidgetVH.this.mainViewModel.getOrientation().getValue()) != null;
                ScrollExtKt.scrollEnable(composerRecycler, z11);
            }
            if (bool.booleanValue()) {
                ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH = ReviewGalleryBaseWidgetVH.this;
                ReviewGalleryBaseWidgetVH.managePlaying$default(reviewGalleryBaseWidgetVH, reviewGalleryBaseWidgetVH.mainViewModel.getCurrentItemPosition().getValue(), true, false, 4, null);
            } else {
                VideoMoleculeViewHolder videoHolder = ReviewGalleryBaseWidgetVH.this.getVideoHolder();
                if (videoHolder != null) {
                    videoHolder.pauseVideo();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "scrolling", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            VideoMoleculeViewHolder videoHolder;
            if (!bool.booleanValue() || (videoHolder = ReviewGalleryBaseWidgetVH.this.getVideoHolder()) == null) {
                return;
            }
            videoHolder.pauseVideo();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "orientation", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            VideoMoleculeViewHolder videoHolder = ReviewGalleryBaseWidgetVH.this.getVideoHolder();
            if (videoHolder != null) {
                Intrinsics.f(num);
                videoHolder.notifyOrientationListeners(num.intValue());
            }
            ReviewGalleryV2ViewModelImpl viewModel = ReviewGalleryBaseWidgetVH.this.getViewModel();
            if (viewModel != null) {
                Intrinsics.f(num);
                viewModel.orientationChanged(num.intValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$7, reason: invalid class name */
    static final class AnonymousClass7 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            ReviewGalleryBaseWidgetVH.this.buildRightPanel();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH$Companion;", "", "<init>", "()V", "VIDEO_START_POSITION", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$playerEventCallback$1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$fragmentLifecycleCallbacks$1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$onBackPressedCallback$1] */
    public ReviewGalleryBaseWidgetVH(@NotNull ReviewGalleryView view, @NotNull RedesignedPhotoBinder redesignedPhotoBinder, @NotNull SubviewsDelegate subviewsDelegate, @NotNull VideoMoleculePlayerDelegate playerDelegate, @NotNull ComposerReferences refs, @NotNull ReviewGalleryV2MainViewModel mainViewModel, @NotNull FrameBinder frameBinder, @NotNull l tokenizedAnalytics, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage, @NotNull UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel, @NotNull HandlersInhibitor handlersInhibitor, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(redesignedPhotoBinder, "redesignedPhotoBinder");
        Intrinsics.checkNotNullParameter(subviewsDelegate, "subviewsDelegate");
        Intrinsics.checkNotNullParameter(playerDelegate, "playerDelegate");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        Intrinsics.checkNotNullParameter(ugcCachedActionsSharedViewModel, "ugcCachedActionsSharedViewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.redesignedPhotoBinder = redesignedPhotoBinder;
        this.subviewsDelegate = subviewsDelegate;
        this.playerDelegate = playerDelegate;
        this.refs = refs;
        this.mainViewModel = mainViewModel;
        this.frameBinder = frameBinder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.subscribeAuthorsIdStorage = subscribeAuthorsIdStorage;
        this.ugcCachedActionsSharedViewModel = ugcCachedActionsSharedViewModel;
        this.videoRefs = new VideoMoleculeRefsProvider(refs);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).onPreProcess(new ReviewGalleryBaseWidgetVH$actionHandler$1(this)).customActionHandlers(new ReviewGalleryBaseWidgetVH$actionHandler$2(customActionHandlersStoreFactory)).onComposerAction(new ReviewGalleryBaseWidgetVH$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.playerEventCallback = new PlayerEventCallback() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$playerEventCallback$1
            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.PlayerEventCallback
            public void onPause() {
                VideoEventDelegate videoEventDelegate;
                Integer value = ReviewGalleryBaseWidgetVH.this.mainViewModel.getCurrentItemPosition().getValue();
                int adapterPosition = ReviewGalleryBaseWidgetVH.this.getAdapterPosition();
                if (value == null || value.intValue() != adapterPosition || (videoEventDelegate = ReviewGalleryBaseWidgetVH.this.videoEventDelegate) == null) {
                    return;
                }
                videoEventDelegate.onPlayerPause();
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.PlayerEventCallback
            public void onReady(long duration) {
                VideoEventDelegate videoEventDelegate;
                Integer value = ReviewGalleryBaseWidgetVH.this.mainViewModel.getCurrentItemPosition().getValue();
                int adapterPosition = ReviewGalleryBaseWidgetVH.this.getAdapterPosition();
                if (value == null || value.intValue() != adapterPosition || (videoEventDelegate = ReviewGalleryBaseWidgetVH.this.videoEventDelegate) == null) {
                    return;
                }
                videoEventDelegate.onPlayerReady(duration);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.PlayerEventCallback
            public void onStart() {
                VideoEventDelegate videoEventDelegate;
                Integer value = ReviewGalleryBaseWidgetVH.this.mainViewModel.getCurrentItemPosition().getValue();
                int adapterPosition = ReviewGalleryBaseWidgetVH.this.getAdapterPosition();
                if (value == null || value.intValue() != adapterPosition || (videoEventDelegate = ReviewGalleryBaseWidgetVH.this.videoEventDelegate) == null) {
                    return;
                }
                videoEventDelegate.onPlayerStart();
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.PlayerEventCallback
            public void onStop() {
                VideoEventDelegate videoEventDelegate = ReviewGalleryBaseWidgetVH.this.videoEventDelegate;
                if (videoEventDelegate != null) {
                    videoEventDelegate.onPlayerStop();
                }
            }
        };
        this.fragmentLifecycleCallbacks = new G.m() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$fragmentLifecycleCallbacks$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentAttached(G fm, ComponentCallbacksC5392m fragment, Context context) {
                int i11;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(context, "context");
                List<ComponentCallbacksC5392m> r02 = fm.r0();
                Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                boolean z11 = false;
                if (C7714v.Z(r02) instanceof b) {
                    List<ComponentCallbacksC5392m> r03 = fm.r0();
                    Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
                    List<ComponentCallbacksC5392m> list = r03;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i11 = 0;
                    } else {
                        Iterator<T> it = list.iterator();
                        i11 = 0;
                        while (it.hasNext()) {
                            if ((((ComponentCallbacksC5392m) it.next()) instanceof b) && (i11 = i11 + 1) < 0) {
                                C7714v.N0();
                                throw null;
                            }
                        }
                    }
                    if (i11 == 1) {
                        z11 = true;
                    }
                }
                if (z11) {
                    VideoEventDelegate videoEventDelegate = ReviewGalleryBaseWidgetVH.this.videoEventDelegate;
                    if (videoEventDelegate != null) {
                        videoEventDelegate.onBottomSheetShown();
                    }
                    VideoMoleculeViewHolder videoHolder = ReviewGalleryBaseWidgetVH.this.getVideoHolder();
                    if (videoHolder != null) {
                        videoHolder.pauseVideo();
                    }
                }
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentDetached(G fm, ComponentCallbacksC5392m fragment) {
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                if (fragment instanceof b) {
                    List<ComponentCallbacksC5392m> r02 = fm.r0();
                    Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                    List<ComponentCallbacksC5392m> list = r02;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (((ComponentCallbacksC5392m) it.next()) instanceof b) {
                                break;
                            }
                        }
                    }
                    Integer value = ReviewGalleryBaseWidgetVH.this.mainViewModel.getCurrentItemPosition().getValue();
                    int adapterPosition = ReviewGalleryBaseWidgetVH.this.getAdapterPosition();
                    if (value != null && value.intValue() == adapterPosition) {
                        VideoEventDelegate videoEventDelegate = ReviewGalleryBaseWidgetVH.this.videoEventDelegate;
                        if (videoEventDelegate != null) {
                            videoEventDelegate.onBottomSheetDismissed();
                        }
                        VideoMoleculeViewHolder videoHolder = ReviewGalleryBaseWidgetVH.this.getVideoHolder();
                        if (videoHolder != null) {
                            videoHolder.playVideo();
                        }
                        ReviewGalleryBaseWidgetVH.this.updateActionStatesIfNeeded();
                    }
                }
                ReviewGalleryBaseWidgetVH.this.invalidateSubscribeButton();
            }
        };
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                ReviewGalleryView reviewGalleryView;
                ReviewGalleryVO.SideButtonsVO sideButtonsHeader;
                ReviewGalleryView reviewGalleryView2;
                ReviewGalleryVO boundData = ReviewGalleryBaseWidgetVH.this.getBoundData();
                IconButtonV3DTO iconButtonV3DTO = null;
                if ((boundData != null ? boundData.getCloseButton() : null) != null) {
                    reviewGalleryView2 = ReviewGalleryBaseWidgetVH.this.view;
                    reviewGalleryView2.getCloseButton().performClick();
                    return;
                }
                ReviewGalleryVO boundData2 = ReviewGalleryBaseWidgetVH.this.getBoundData();
                if (boundData2 != null && (sideButtonsHeader = boundData2.getSideButtonsHeader()) != null) {
                    iconButtonV3DTO = sideButtonsHeader.getLeftButton();
                }
                if (iconButtonV3DTO != null) {
                    reviewGalleryView = ReviewGalleryBaseWidgetVH.this.view;
                    reviewGalleryView.getSideButtonsHeader().getLeftButtonView().performClick();
                }
            }
        };
        this.handleBackClick = new ReviewGalleryBaseWidgetVH$handleBackClick$1(this);
        int i11 = 1;
        this.steps = C7714v.b0(new BindStep() { // from class: gV.a
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$0;
                steps$lambda$0 = ReviewGalleryBaseWidgetVH.steps$lambda$0(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$0;
            }
        }, new BindStep() { // from class: gV.g
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$1;
                steps$lambda$1 = ReviewGalleryBaseWidgetVH.steps$lambda$1(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$1;
            }
        }, new BindStep() { // from class: gV.h
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$2;
                steps$lambda$2 = ReviewGalleryBaseWidgetVH.steps$lambda$2(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$2;
            }
        }, new BindStep() { // from class: gV.i
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$3;
                steps$lambda$3 = ReviewGalleryBaseWidgetVH.steps$lambda$3(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$3;
            }
        }, new a(this, i11), new EM.b(this, i11), new BindStep() { // from class: gV.b
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$6;
                steps$lambda$6 = ReviewGalleryBaseWidgetVH.steps$lambda$6(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$6;
            }
        }, new BindStep() { // from class: gV.c
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$7;
                steps$lambda$7 = ReviewGalleryBaseWidgetVH.steps$lambda$7(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$7;
            }
        }, new BindStep() { // from class: gV.d
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$8;
                steps$lambda$8 = ReviewGalleryBaseWidgetVH.steps$lambda$8(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$8;
            }
        }, new BindStep() { // from class: gV.e
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$9;
                steps$lambda$9 = ReviewGalleryBaseWidgetVH.steps$lambda$9(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$9;
            }
        }, new BindStep() { // from class: gV.f
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$10;
                steps$lambda$10 = ReviewGalleryBaseWidgetVH.steps$lambda$10(ReviewGalleryBaseWidgetVH.this);
                return steps$lambda$10;
            }
        });
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        frameBinder.applyRecycler(getComposerRecycler());
        view.getRightPanel().init(tokenizedAnalytics, buildHandler, new ReviewGalleryBaseWidgetVH$1$1(mainViewModel));
        view.getProductBinding().productDescriptionTAV.setTextIsSelectable(false);
        view.getRatingText().setOnClickListener(new DN.b(this, 11));
        view.getProductBinding().productContainerCl.setOnClickListener(new c(this, 6));
        redesignedPhotoBinder.getPhotoView().setOnTouchImageViewListener(new N(this));
        mainViewModel.getCurrentItemPosition().observe(refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new AnonymousClass3()));
        mainViewModel.getPlaybackAvailable().observe(refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new AnonymousClass4()));
        mainViewModel.getActiveScroll().observe(refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new AnonymousClass5()));
        mainViewModel.getOrientation().observe(refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new AnonymousClass6()));
        mainViewModel.getSoundMutedState().observe(refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new AnonymousClass7()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$17(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH, View view, MotionEvent motionEvent, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(motionEvent, "<unused var>");
        RecyclerView composerRecycler = reviewGalleryBaseWidgetVH.getComposerRecycler();
        if (composerRecycler != null) {
            ScrollExtKt.scrollEnable(composerRecycler, !z11);
        }
    }

    private final void bindRightPanelButtons(long widgetId, Boolean hasAudio, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanelDTO) {
        ViewExtKt.showOrGone(this.view.getRightPanel(), Boolean.valueOf(rightPanelDTO != null));
        if (rightPanelDTO != null) {
            RightPanelWithMuteLayout rightPanel = this.view.getRightPanel();
            List<RightPanelButtonDTO> buttons = rightPanelDTO.getButtons();
            ArrayList arrayList = new ArrayList(C7714v.z(buttons, 10));
            Iterator<T> it = buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(RightPanelMapperKt.toVO(((RightPanelButtonDTO) it.next()).getCurrentItem(), widgetId));
            }
            SocialSoundControlDTO soundControl = rightPanelDTO.getSoundControl();
            rightPanel.bind(arrayList, hasAudio, soundControl != null ? SocialSoundControlDTO.copy$default(soundControl, Boolean.valueOf(this.mainViewModel.isMuted()), null, null, 6, null) : null, widgetId);
        }
    }

    private final void buildBadge() {
        SubviewsDelegate subviewsDelegate = this.subviewsDelegate;
        ReviewGalleryVO boundData = getBoundData();
        subviewsDelegate.setupBadge(boundData != null ? boundData.getBadge() : null);
    }

    private final void buildCloseButton() {
        SocialIconButtonDTO closeButton;
        ReviewGalleryVO boundData = getBoundData();
        if (boundData == null || (closeButton = boundData.getCloseButton()) == null) {
            return;
        }
        SocialIconButtonHolderKt.bind(this.view.getCloseButton(), closeButton, this.handleBackClick);
    }

    private final void buildCommentFooter() {
        SubviewsDelegate subviewsDelegate = this.subviewsDelegate;
        ReviewGalleryVO boundData = getBoundData();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooter = boundData != null ? boundData.getCommentFooter() : null;
        ReviewGalleryVO boundData2 = getBoundData();
        subviewsDelegate.setupCommentFooter(commentFooter, boundData2 != null ? boundData2.getCommentButtonFooter() : null);
    }

    private final void buildImage() {
        ReviewGalleryVO boundData;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper content;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewImage image;
        ReviewGalleryVO boundData2 = getBoundData();
        if (boundData2 == null || (boundData = getBoundData()) == null || (content = boundData.getContent()) == null || (image = content.getImage()) == null) {
            return;
        }
        Pair pair = new Pair(boundData2, image);
        ReviewGalleryVO reviewGalleryVO = (ReviewGalleryVO) pair.a();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewImage reviewImage = (ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewImage) pair.b();
        VideoMoleculeView videoMoleculeView = this.videoMoleculeView;
        if (videoMoleculeView != null) {
            ViewExtKt.invisible(videoMoleculeView);
        }
        RedesignedPhotoBinder redesignedPhotoBinder = this.redesignedPhotoBinder;
        redesignedPhotoBinder.setPhotoVisibility(true);
        redesignedPhotoBinder.getPhotoView().setScaleType(reviewGalleryVO.getIsFillMode() ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
        loadImage(redesignedPhotoBinder.getPhotoView(), reviewImage.getUrl());
    }

    private final void buildProduct() {
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null) {
            this.subviewsDelegate.setupProduct(boundData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildProductsContainer(boolean resetScroll) {
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null) {
            this.subviewsDelegate.setupProductsContainer(boundData, getTrackingData(), getViewItem(), resetScroll);
        }
    }

    static /* synthetic */ void buildProductsContainer$default(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildProductsContainer");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        reviewGalleryBaseWidgetVH.buildProductsContainer(z11);
    }

    private final void buildRating() {
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null) {
            this.subviewsDelegate.setupReviewRating(boundData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildRightPanel() {
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            Boolean valueOf = Boolean.valueOf(boundData.getHasAudio());
            ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel = boundData.getRightPanel();
            ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO = null;
            if (rightPanel != null) {
                SocialSoundControlDTO soundControl = boundData.getRightPanel().getSoundControl();
                reviewsRightPanelDTO = ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO.copy$default(rightPanel, null, soundControl != null ? SocialSoundControlDTO.copy$default(soundControl, Boolean.valueOf(this.mainViewModel.isMuted()), null, null, 6, null) : null, null, 5, null);
            }
            bindRightPanelButtons(id2, valueOf, reviewsRightPanelDTO);
            VideoMoleculeViewHolder videoMoleculeViewHolder = this.videoHolder;
            if (videoMoleculeViewHolder != null) {
                setSoundState(videoMoleculeViewHolder, this.mainViewModel.isMuted());
            }
        }
    }

    private final void buildSideButtonsHeader() {
        ReviewGalleryVO.SideButtonsVO sideButtonsHeader;
        ReviewGalleryVO boundData = getBoundData();
        if (boundData == null || (sideButtonsHeader = boundData.getSideButtonsHeader()) == null) {
            return;
        }
        this.view.getSideButtonsHeader().bind(sideButtonsHeader, this.handleBackClick, this.actionHandler);
    }

    private final void buildSocialHeader() {
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null) {
            this.subviewsDelegate.setupSocialHeader(boundData, this.actionHandler);
        }
    }

    private final void buildSubviewsContainers() {
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null) {
            this.subviewsDelegate.setupSubviewsContainers(boundData);
        }
    }

    private final VideoMoleculeApi buildVideoMoleculeView(boolean isCompactControls) {
        VideoMoleculeView videoMoleculeView = new VideoMoleculeView(isCompactControls ? new androidx.appcompat.view.d(getContext(), R$style.VideoMoleculeCompactControls) : getContext(), null, 0, 6, null);
        this.videoMoleculeView = videoMoleculeView;
        VideoMoleculeApi.DefaultImpls.setConfig$default(videoMoleculeView, true, false, 2, null);
        videoMoleculeView.setId(R$id.reviewGalleryV2View);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ReviewGalleryView reviewGalleryView = this.view;
        reviewGalleryView.getContentContainer().addView(videoMoleculeView, 0, layoutParams);
        videoMoleculeView.findViewById(ru.ozon.app.android.pdpvideomolecule.R$id.topGradient).setBackground(androidx.core.content.a.getDrawable(reviewGalleryView.getContext(), R$drawable.review_gallery_top_gradient));
        return videoMoleculeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getComposerRecycler() {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerView(view);
    }

    private final VideoEventDelegate getOrCreateVideoEventDelegate() {
        VideoEventDelegate videoEventDelegate = this.videoEventDelegate;
        if (videoEventDelegate != null) {
            return videoEventDelegate;
        }
        VideoEventDelegate videoEventDelegate2 = new VideoEventDelegate(this.tokenizedAnalytics, new ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$1(this), new ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$2(this), new ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$3(this), new ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$4(this));
        this.videoEventDelegate = videoEventDelegate2;
        return videoEventDelegate2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleDismissAction(AtomAction action) {
        VideoEventDelegate videoEventDelegate;
        if ((!(action instanceof AtomAction.Dismiss) && !(action instanceof AtomAction.Move)) || (videoEventDelegate = this.videoEventDelegate) == null) {
            return false;
        }
        videoEventDelegate.markPendingReturnFromScreen();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSwipeToNextItem(int currentPosition) {
        Integer lastItemPosition = this.mainViewModel.getLastItemPosition();
        if (lastItemPosition != null && currentPosition == lastItemPosition.intValue()) {
            return;
        }
        int adapterPosition = getAdapterPosition();
        if (lastItemPosition != null && adapterPosition == lastItemPosition.intValue()) {
            VideoEventDelegate videoEventDelegate = this.videoEventDelegate;
            if (videoEventDelegate != null) {
                videoEventDelegate.logNextIfManualSwipe();
            }
            ReviewGalleryVO boundData = getBoundData();
            if (boundData != null) {
                Map<String, TokenizedTrackingInfo> nextTrackingInfo = lastItemPosition.intValue() < currentPosition ? boundData.getNextTrackingInfo() : boundData.getPrevTrackingInfo();
                if (nextTrackingInfo != null) {
                    sendSwipeAnalytics(nextTrackingInfo);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateSubscribeButton() {
        CellDTO subscribe;
        CellDTO.RightBlock rightBlock;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        ReviewGalleryVO boundData = getBoundData();
        String str = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser = boundData != null ? boundData.getSocialUser() : null;
        if (socialUser != null && (subscribe = socialUser.getSubscribe()) != null && (rightBlock = subscribe.getRightBlock()) != null && (common = rightBlock.getCommon()) != null && (action = common.getAction()) != null && (params = action.getParams()) != null) {
            str = params.get("authorId");
        }
        String valueOf = String.valueOf(str);
        if (Intrinsics.d(this.subscribeAuthorsIdStorage.isAuthorSubscribed(valueOf), Boolean.TRUE) && socialUser != null && !socialUser.isSubscribed()) {
            this.refs.getController().update(new SubscribeAuthorUpdateKey(valueOf));
        } else if (Intrinsics.d(this.subscribeAuthorsIdStorage.isAuthorSubscribed(valueOf), Boolean.FALSE) && socialUser != null && socialUser.isSubscribed()) {
            this.refs.getController().update(new UnsubscribeAuthorUpdateKey(valueOf));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$16$lambda$12(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH, View view) {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO rating;
        AtomActionDTO action;
        AtomAction atomAction;
        ReviewGalleryVO boundData = reviewGalleryBaseWidgetVH.getBoundData();
        if (boundData == null || (rating = boundData.getRating()) == null || (action = rating.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, rating.getTrackingInfo())) == null) {
            return;
        }
        reviewGalleryBaseWidgetVH.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$16$lambda$15(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH, View view) {
        ReviewProductTileDTO product;
        AtomActionDTO action;
        AtomAction atomAction;
        ReviewGalleryVO boundData = reviewGalleryBaseWidgetVH.getBoundData();
        if (boundData == null || (product = boundData.getProduct()) == null || (action = product.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, product.getTrackingInfo())) == null) {
            return;
        }
        reviewGalleryBaseWidgetVH.actionHandler.invoke(atomAction);
    }

    private final void loadImage(TouchImageView touchImageView, String str) {
        ImageViewExtKt.loadOriginal$default(touchImageView, str, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH$loadImage$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                ReviewGalleryV2ViewModelImpl viewModel = ReviewGalleryBaseWidgetVH.this.getViewModel();
                if (viewModel != null) {
                    viewModel.contentIsLoaded();
                }
                PikazonLoaderCallback.DefaultImpls.onLoadSuccessful(this, resource);
            }
        }, null, false, null, 58, null);
        touchImageView.setBackgroundResource(ru.ozon.app.android.pdpvideomolecule.R$drawable.pdp_video_molecule_widget_bg_portrait);
        touchImageView.setClipToOutline(true);
    }

    public static /* synthetic */ void managePlaying$default(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH, Integer num, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: managePlaying");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        reviewGalleryBaseWidgetVH.managePlaying(num, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOnBackAction(ReviewGalleryVO.OnBackConfigVO onBackConfigVO) {
        String link;
        this.mainViewModel.onBackActionInvoked();
        AtomAction action = onBackConfigVO.getAction();
        AtomAction.Move move = action instanceof AtomAction.Move ? (AtomAction.Move) action : null;
        if (move != null && (link = move.getLink()) != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.refs.getNavigator(), link, null, 2, null);
        }
        t tokenizedEvent = onBackConfigVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveLikeState(String reviewUuid, String actionId) {
        boolean z11;
        if (Intrinsics.d(actionId, ReviewGalleryComposerAction.VOTE_MEDIA_LIKE.getId())) {
            z11 = true;
        } else if (!Intrinsics.d(actionId, ReviewGalleryComposerAction.VOTE_MEDIA_REMOVE.getId())) {
            return;
        } else {
            z11 = false;
        }
        this.ugcCachedActionsSharedViewModel.saveActionState(reviewUuid, z11, "like");
    }

    private final void sendSwipeAnalytics(Map<String, TokenizedTrackingInfo> trackingInfo) {
        l lVar = this.tokenizedAnalytics;
        ReviewGalleryVO boundData = getBoundData();
        TokenizedAnalyticsExtKt.processNonViewEvents(lVar, TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, boundData != null ? Long.valueOf(boundData.getId()) : null, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(C4911f container, NotificationDTO notification) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, container.g(), this.actionHandler).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildImage();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildSideButtonsHeader();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$10(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildSubviewsContainers();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$2(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildCloseButton();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$3(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildRightPanel();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$4(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildProduct();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$5(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        buildProductsContainer$default(reviewGalleryBaseWidgetVH, false, 1, null);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$6(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildRating();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$7(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildBadge();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$8(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildCommentFooter();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$9(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        reviewGalleryBaseWidgetVH.buildSocialHeader();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateActionStatesIfNeeded() {
        List<RightPanelButtonDTO> buttons;
        RightPanelButtonDTO.RightPanelState state;
        List<RightPanelButtonDTO> buttons2;
        RightPanelButtonDTO rightPanelButtonDTO;
        RightPanelItemDTO normal;
        AtomActionDTO action;
        ReviewGalleryVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        for (String str : C7714v.b0("like", "reportButtonEnabled")) {
            Boolean isActionSelected = this.ugcCachedActionsSharedViewModel.isActionSelected(boundData.getReviewUuid(), str);
            if (isActionSelected != null) {
                boolean booleanValue = isActionSelected.booleanValue();
                ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel = boundData.getRightPanel();
                Object obj = null;
                boolean d11 = Intrinsics.d((rightPanel == null || (buttons2 = rightPanel.getButtons()) == null || (rightPanelButtonDTO = (RightPanelButtonDTO) C7714v.K(buttons2)) == null || (normal = rightPanelButtonDTO.getNormal()) == null || (action = normal.getAction()) == null) ? null : action.getId(), "like");
                if (Intrinsics.d(str, "like") && !d11) {
                    str = ReviewGalleryComposerAction.VOTE_MEDIA_LIKE.getId();
                }
                ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel2 = boundData.getRightPanel();
                if (rightPanel2 == null || (buttons = rightPanel2.getButtons()) == null) {
                    return;
                }
                Iterator<T> it = buttons.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.d(((RightPanelButtonDTO) next).getNormal().getAction().getId(), str)) {
                        obj = next;
                        break;
                    }
                }
                RightPanelButtonDTO rightPanelButtonDTO2 = (RightPanelButtonDTO) obj;
                if (rightPanelButtonDTO2 == null || (state = rightPanelButtonDTO2.getState()) == null) {
                    return;
                }
                if (booleanValue != state.isSelected()) {
                    this.refs.getController().update(new ReviewGallerySwitchActionUpdateKey(boundData.getReviewUuid(), str, booleanValue));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RightPanelButtonDTO> updateStateForButtonWithAction(List<RightPanelButtonDTO> list, String str) {
        List<RightPanelButtonDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (RightPanelButtonDTO rightPanelButtonDTO : list2) {
            if (Intrinsics.d(str, rightPanelButtonDTO.getCurrentItem().getAction().getId())) {
                rightPanelButtonDTO = rightPanelButtonDTO.reverseState();
            }
            arrayList.add(rightPanelButtonDTO);
        }
        return arrayList;
    }

    protected void buildVideo(@NotNull VideoMolecule content, boolean isCompactControls) {
        ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate;
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.videoHolder == null) {
            VideoMoleculeView videoMoleculeView = this.videoMoleculeView;
            if (videoMoleculeView != null) {
                this.view.getContentContainer().removeView(videoMoleculeView);
            }
            this.videoHolder = new VideoMoleculeViewHolder(buildVideoMoleculeView(isCompactControls), this.playerDelegate, this.videoRefs, getLifecycle(), VideoMoleculeNamespace.Review.INSTANCE);
        }
        this.redesignedPhotoBinder.setPhotoVisibility(false);
        VideoMoleculeView videoMoleculeView2 = this.videoMoleculeView;
        if (videoMoleculeView2 != null) {
            ViewExtKt.show(videoMoleculeView2);
        }
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.videoHolder;
        if (videoMoleculeViewHolder != null) {
            ReviewGalleryV2ViewModelImpl viewModel = getViewModel();
            if (viewModel != null && (reviewGalleryV2EventsDelegate = this.reviewGalleryEventsDelegate) != null) {
                reviewGalleryV2EventsDelegate.setup(videoMoleculeViewHolder, viewModel, this.playerEventCallback);
            }
            Integer value = this.mainViewModel.getCurrentItemPosition().getValue();
            PlayerStateKt.updateIsPlaying(content, value != null && value.intValue() == getAdapterPosition());
            videoMoleculeViewHolder.bind(content, false, true);
        }
        this.playerDelegate.setVideoIndex(getAdapterPosition());
    }

    protected final VideoMoleculeViewHolder getVideoHolder() {
        return this.videoHolder;
    }

    protected final ReviewGalleryV2ViewModelImpl getViewModel() {
        return (ReviewGalleryV2ViewModelImpl) getWidgetViewModel();
    }

    protected void managePlaying(Integer currentPosition, boolean isPlaybackAvailable, boolean needNewHolder) {
        VideoMoleculeViewHolder videoMoleculeViewHolder;
        List<ComponentCallbacksC5392m> r02;
        int adapterPosition = getAdapterPosition();
        if (currentPosition == null || currentPosition.intValue() != adapterPosition) {
            VideoMoleculeViewHolder videoMoleculeViewHolder2 = this.videoHolder;
            if (videoMoleculeViewHolder2 != null) {
                videoMoleculeViewHolder2.pauseVideo();
                return;
            }
            return;
        }
        G d11 = this.refs.getContainer().d();
        if ((((d11 == null || (r02 = d11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02)) instanceof b) || (videoMoleculeViewHolder = this.videoHolder) == null) {
            return;
        }
        videoMoleculeViewHolder.playVideo();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        J onBackPressedDispatcher;
        super.onAttach();
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
        G d11 = this.refs.getContainer().d();
        if (d11 != null) {
            d11.Y0(this.fragmentLifecycleCallbacks, false);
        }
        invalidateSubscribeButton();
        r a11 = this.refs.getContainer().a();
        if (a11 == null || (onBackPressedDispatcher = a11.getOnBackPressedDispatcher()) == null) {
            return;
        }
        ReviewGalleryBaseWidgetVH$onBackPressedCallback$1 onBackPressedCallback = this.onBackPressedCallback;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        onBackPressedDispatcher.i(onBackPressedCallback);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull androidx.lifecycle.J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        ReviewGalleryV2ViewModelImpl viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.getActionResult().observe(this.refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new ReviewGalleryBaseWidgetVH$onAttachViewModel$1$1(this)));
            viewModel.getWidgetState().observe(this.refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new ReviewGalleryBaseWidgetVH$onAttachViewModel$1$2(this)));
            viewModel.getNextVideoEvent().observe(this.refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new ReviewGalleryBaseWidgetVH$onAttachViewModel$1$3(this)));
            viewModel.getOrientationChangeEvent().observe(this.refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new ReviewGalleryBaseWidgetVH$onAttachViewModel$1$4(this.refs.getController())));
            Parcelable scrollState = viewModel.getScrollState();
            if (scrollState != null) {
                this.subviewsDelegate.updateProductsRecyclerViewScroll(scrollState);
            }
            viewModel.getHasAudio().observe(this.refs.getContainer().g(), new ReviewGalleryBaseWidgetVH$sam$androidx_lifecycle_Observer$0(new ReviewGalleryBaseWidgetVH$onAttachViewModel$1$6(this)));
        }
        C4598rp.f(this.refs, new C2408n0(this.ugcCachedActionsSharedViewModel.getActionsChanged(), new ReviewGalleryBaseWidgetVH$onAttachViewModel$2(this, null)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        Parcelable productsRecyclerScrollState;
        ReviewGalleryV2ViewModelImpl viewModel;
        Integer value = this.mainViewModel.getCurrentItemPosition().getValue();
        int adapterPosition = getAdapterPosition();
        if (value != null && value.intValue() == adapterPosition && (productsRecyclerScrollState = this.subviewsDelegate.getProductsRecyclerScrollState()) != null && (viewModel = getViewModel()) != null) {
            viewModel.saveProductsContainerScrollState(productsRecyclerScrollState);
        }
        this.frameBinder.onDetach();
        G d11 = this.refs.getContainer().d();
        if (d11 != null) {
            d11.t1(this.fragmentLifecycleCallbacks);
        }
        VideoEventDelegate videoEventDelegate = this.videoEventDelegate;
        if (videoEventDelegate != null) {
            videoEventDelegate.onDetach();
        }
        remove();
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        this.prevCurrentPosition = null;
        this.subviewsDelegate.onRecycle();
        this.frameBinder.onRecycle();
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.videoHolder;
        if (videoMoleculeViewHolder != null) {
            VideoMoleculeViewHolder.onRemove$default(videoMoleculeViewHolder, false, 1, null);
        }
        this.videoHolder = null;
        VideoEventDelegate videoEventDelegate = this.videoEventDelegate;
        if (videoEventDelegate != null) {
            videoEventDelegate.reset();
        }
        ReviewGalleryVisibilityDelegate reviewGalleryVisibilityDelegate = this.reviewGalleryVisibilityDelegate;
        if (reviewGalleryVisibilityDelegate != null) {
            reviewGalleryVisibilityDelegate.clear();
        }
        this.reviewGalleryVisibilityDelegate = null;
        VideoMoleculeView videoMoleculeView = this.videoMoleculeView;
        if (videoMoleculeView != null) {
            this.view.getContentContainer().removeView(videoMoleculeView);
        }
        this.videoMoleculeView = null;
        this.view.getContentContainer().setBackground(null);
        ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate = this.reviewGalleryEventsDelegate;
        if (reviewGalleryV2EventsDelegate != null) {
            reviewGalleryV2EventsDelegate.clear();
        }
        this.reviewGalleryEventsDelegate = null;
        super.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO rating;
        SingleLiveEvent<Boolean> contentIsLoadedEvent;
        super.onViewInVisibleBounds();
        ReviewGalleryV2ViewModelImpl viewModel = getViewModel();
        if (viewModel != null && (contentIsLoadedEvent = viewModel.getContentIsLoadedEvent()) != null) {
            LiveDataOperatorsKt.observeOnce(contentIsLoadedEvent, new ReviewGalleryBaseWidgetVH$onViewInVisibleBounds$1(this));
        }
        ReviewGalleryVO boundData = getBoundData();
        if (boundData != null && (rating = boundData.getRating()) != null) {
            this.view.getRatingText().bind(rating);
        }
        updateActionStatesIfNeeded();
    }

    protected final void setSoundState(@NotNull VideoMoleculeViewHolder videoMoleculeViewHolder, boolean z11) {
        Intrinsics.checkNotNullParameter(videoMoleculeViewHolder, "<this>");
        if (Intrinsics.b(videoMoleculeViewHolder.getVolume(), 0.0f) ^ z11) {
            videoMoleculeViewHolder.setMute(z11);
        }
    }

    protected final void setVideoHolder(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        this.videoHolder = videoMoleculeViewHolder;
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ReviewGalleryVO item, @NotNull W10.c trackingData, f viewedPond) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t tokenizedEvent$default;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO footer;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ReviewGalleryBaseWidgetVH) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
        if (trackingInfo2 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(item.getId()), null, 2, null), null, 2, null);
        }
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooter = item.getCommentButtonFooter();
        if (commentButtonFooter == null || (footer = commentButtonFooter.getFooter()) == null || (trackingInfo = footer.getTrackingInfo()) == null) {
            ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooter = item.getCommentFooter();
            trackingInfo = commentFooter != null ? commentFooter.getTrackingInfo() : null;
        }
        if (trackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
        }
        this.subviewsDelegate.onParentVisibilityChanged(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewGalleryVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
    
        if (r2 > 0) goto L65;
     */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull ReviewGalleryVO item, @NotNull l20.d info, @NotNull Object payload) {
        Long l11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.prevCurrentPosition = this.mainViewModel.getCurrentItemPosition().getValue();
        ReviewGalleryV2ViewModelImpl viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.initState(getAdapterPosition(), item.getProduct() != null, item.getProductItemsContainer() != null, item.getBadge() != null, item.getCloseButton() != null);
        }
        if (item.getContent().getVideo() != null) {
            getOrCreateVideoEventDelegate().bind(Long.valueOf(item.getId()), getAdapterPosition());
        }
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            ReviewGalleryVisibilityDelegate reviewGalleryVisibilityDelegate = new ReviewGalleryVisibilityDelegate();
            this.reviewGalleryVisibilityDelegate = reviewGalleryVisibilityDelegate;
            reviewGalleryVisibilityDelegate.setup(this.view);
            this.reviewGalleryEventsDelegate = new ReviewGalleryV2EventsDelegate();
            this.subviewsDelegate.setupActionHandler(this.actionHandler);
            this.frameBinder.bind(this.steps, item.getViewItemKey());
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ReviewGalleryViewMapper.ReviewGalleryPayload) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ReviewGalleryViewMapper.ReviewGalleryPayload reviewGalleryPayload = (ReviewGalleryViewMapper.ReviewGalleryPayload) it.next();
                if (Intrinsics.d(reviewGalleryPayload, ReviewGalleryViewMapper.ReviewGalleryPayload.RestoreAudioState.INSTANCE)) {
                    this.refs.getController().update(new ReviewGalleryHasAudioUpdateKey(item.getId(), true));
                    bindRightPanelButtons(item.getId(), Boolean.TRUE, item.getRightPanel());
                } else if (Intrinsics.d(reviewGalleryPayload, ReviewGalleryViewMapper.ReviewGalleryPayload.Vote.INSTANCE)) {
                    long id2 = item.getId();
                    ReviewGalleryVO boundData = getBoundData();
                    bindRightPanelButtons(id2, boundData != null ? Boolean.valueOf(boundData.getHasAudio()) : null, item.getRightPanel());
                } else if (reviewGalleryPayload instanceof ReviewGalleryViewMapper.ReviewGalleryPayload.Subscribe) {
                    this.subviewsDelegate.updateSocialHeader(((ReviewGalleryViewMapper.ReviewGalleryPayload.Subscribe) reviewGalleryPayload).getSocialUser());
                } else if (reviewGalleryPayload instanceof ReviewGalleryViewMapper.ReviewGalleryPayload.Subviews) {
                    this.subviewsDelegate.setupSubviews(item, getTrackingData(), getViewItem());
                } else if (Intrinsics.d(reviewGalleryPayload, ReviewGalleryViewMapper.ReviewGalleryPayload.Controls.INSTANCE)) {
                    VideoMoleculeViewHolder videoMoleculeViewHolder = this.videoHolder;
                    if (videoMoleculeViewHolder != null) {
                        long currentVideoDuration = videoMoleculeViewHolder.getCurrentVideoDuration();
                        l11 = Long.valueOf(currentVideoDuration);
                    }
                    l11 = null;
                    this.videoHolder = null;
                    Integer value = this.mainViewModel.getCurrentItemPosition().getValue();
                    Boolean value2 = this.mainViewModel.getPlaybackAvailable().getValue();
                    managePlaying(value, value2 != null ? value2.booleanValue() : false, true);
                    if (l11 != null) {
                        long longValue = l11.longValue();
                        VideoMoleculeViewHolder videoMoleculeViewHolder2 = this.videoHolder;
                        if (videoMoleculeViewHolder2 != null) {
                            videoMoleculeViewHolder2.seekTo(longValue);
                        }
                    }
                } else {
                    throw new o();
                }
            }
        }
    }
}
