package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import A00.a;
import BZ.f;
import Vg.d;
import WZ.l;
import a00.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.RightPanelButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryRedesignedPhotoBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.SubviewsDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryPlayerPoolWidgetVH;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView;
import ru.ozon.composer.ui.widget.b;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001QB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010-J%\u00103\u001a\f\u0012\u0004\u0012\u00020\u000201j\u0002`22\n\u00100\u001a\u00060.j\u0002`/H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u00109J%\u0010<\u001a\b\u0012\u0004\u0012\u00020;0*2\u0006\u00107\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010=R,\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR(\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002050C0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001c\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020M0L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/di/ReviewGalleryComponent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "<init>", "()V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "", "actionId", "", "isSelected", "switchActionState", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;Ljava/lang/String;Z)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH;", "getReviewGalleryViewHolder", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryBaseWidgetVH;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "getAuthorIdFromCell", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Ljava/lang/String;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "newItem", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload;", "getPayload", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;)Ljava/util/List;", "Lkotlin/reflect/KFunction2;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryMapper;", "mapper", "LPc/a;", "Lh20/a;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "ReviewGalleryPayload", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@b
/* loaded from: classes7.dex */
public final class ReviewGalleryViewMapper extends WidgetViewMapper2<ReviewGalleryComponent, ReviewGalleryV2DTO, ReviewGalleryVO> {

    @NotNull
    private final h<ReviewGalleryBaseWidgetVH> holderProducer = new ReviewGalleryViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ReviewGalleryLikeUpdateKey.class, ReviewGallerySwitchActionUpdateKey.class, SubscribeAuthorUpdateKey.class, UnsubscribeAuthorUpdateKey.class, ReviewGalleryHasAudioUpdateKey.class);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload;", "", "<init>", "()V", "Vote", "Subviews", "Controls", "RestoreAudioState", "Subscribe", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Controls;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$RestoreAudioState;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Subscribe;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Subviews;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Vote;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class ReviewGalleryPayload {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Controls;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Controls extends ReviewGalleryPayload {

            @NotNull
            public static final Controls INSTANCE = new Controls();

            private Controls() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Controls);
            }

            public int hashCode() {
                return 1190962231;
            }

            @NotNull
            public String toString() {
                return "Controls";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$RestoreAudioState;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RestoreAudioState extends ReviewGalleryPayload {

            @NotNull
            public static final RestoreAudioState INSTANCE = new RestoreAudioState();

            private RestoreAudioState() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RestoreAudioState);
            }

            public int hashCode() {
                return 1461503784;
            }

            @NotNull
            public String toString() {
                return "RestoreAudioState";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Subscribe;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.SOCIAL_USER_FIELD_NAME, "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "getSocialUser", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Subscribe extends ReviewGalleryPayload {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Subscribe(@NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser) {
                super(null);
                Intrinsics.checkNotNullParameter(socialUser, "socialUser");
                this.socialUser = socialUser;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Subscribe) && Intrinsics.d(this.socialUser, ((Subscribe) other).socialUser);
            }

            @NotNull
            public final ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser getSocialUser() {
                return this.socialUser;
            }

            public int hashCode() {
                return this.socialUser.hashCode();
            }

            @NotNull
            public String toString() {
                return "Subscribe(socialUser=" + this.socialUser + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Subviews;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Subviews extends ReviewGalleryPayload {

            @NotNull
            public static final Subviews INSTANCE = new Subviews();

            private Subviews() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Subviews);
            }

            public int hashCode() {
                return -300768849;
            }

            @NotNull
            public String toString() {
                return "Subviews";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload$Vote;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryViewMapper$ReviewGalleryPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Vote extends ReviewGalleryPayload {

            @NotNull
            public static final Vote INSTANCE = new Vote();

            private Vote() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Vote);
            }

            public int hashCode() {
                return -1803314965;
            }

            @NotNull
            public String toString() {
                return "Vote";
            }
        }

        public /* synthetic */ ReviewGalleryPayload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ReviewGalleryPayload() {
        }
    }

    private final String getAuthorIdFromCell(CellDTO cell) {
        CellDTO.RightBlock rightBlock;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        return (cell == null || (rightBlock = cell.getRightBlock()) == null || (common = rightBlock.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("authorId")) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewGalleryBaseWidgetVH getReviewGalleryViewHolder(View view, ComposerReferences refs) {
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView");
        ReviewGalleryView reviewGalleryView = (ReviewGalleryView) view;
        ReviewGalleryV2ProductButtonBinder reviewGalleryV2ProductButtonBinder = component().getCartButtonBinder().get();
        Intrinsics.checkNotNullExpressionValue(reviewGalleryV2ProductButtonBinder, "get(...)");
        ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder = component().getCartButtonContainerBinder().get();
        Intrinsics.checkNotNullExpressionValue(reviewGalleryV2ProductContainerButtonBinder, "get(...)");
        SubviewsDelegate subviewsDelegate = new SubviewsDelegate(reviewGalleryView, reviewGalleryV2ProductButtonBinder, reviewGalleryV2ProductContainerButtonBinder, component().getTokenizedAnalytics(), new ReviewGalleryViewMapper$getReviewGalleryViewHolder$subviewsDelegate$1(this, refs), Intrinsics.d(f.a(component().getMiniAppConfigHolder()), "supermarket"));
        ReviewGalleryRedesignedPhotoBinder reviewGalleryRedesignedPhotoBinder = new ReviewGalleryRedesignedPhotoBinder(reviewGalleryView.getContentContainer());
        VideoMoleculePlayerDelegate videoMoleculePlayerDelegate = new VideoMoleculePlayerDelegate(component().getVideoController(), true, component().getPlayerPreloader());
        w0 a11 = new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryViewMapper$getReviewGalleryViewHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewGalleryV2MainViewModelImpl reviewGalleryV2MainViewModelImpl = ReviewGalleryViewMapper.this.component().getMainViewModel().get();
                Intrinsics.g(reviewGalleryV2MainViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return reviewGalleryV2MainViewModelImpl;
            }
        }).a(ReviewGalleryV2MainViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        ReviewGalleryV2MainViewModelImpl reviewGalleryV2MainViewModelImpl = (ReviewGalleryV2MainViewModelImpl) a11;
        ReviewGalleryV2PlayerPoolViewModelImpl reviewGalleryV2PlayerPoolViewModelImpl = (ReviewGalleryV2PlayerPoolViewModelImpl) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryViewMapper$getReviewGalleryViewHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewGalleryV2PlayerPoolViewModelImpl playerPoolViewModel = ReviewGalleryViewMapper.this.component().getPlayerPoolViewModel();
                Intrinsics.g(playerPoolViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return playerPoolViewModel;
            }
        }).a(ReviewGalleryV2PlayerPoolViewModelImpl.class);
        HandlersInhibitor handlersInhibitor = component().getHandlersInhibitor();
        d customActionHandlersStoreFactory = component().getCustomActionHandlersStoreFactory();
        FrameBinder frameBinder = component().getFrameBinder();
        l tokenizedAnalytics = component().getTokenizedAnalytics();
        SubscribeAuthorsIdStorage subscribeAuthorsIdStorage = component().getSubscribeAuthorsIdStorage();
        a00.h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        w0 w0Var = (w0) j.a(viewModelOwnerProvider.b(), N.b(UgcCachedActionsSharedViewModel.class), new ReviewGalleryViewMapper$getReviewGalleryViewHolder$3(this)).getValue();
        Intrinsics.checkNotNullExpressionValue(w0Var, "sharedViewModel(...)");
        return new ReviewGalleryPlayerPoolWidgetVH(videoMoleculePlayerDelegate, refs, reviewGalleryV2MainViewModelImpl, reviewGalleryV2PlayerPoolViewModelImpl, reviewGalleryView, reviewGalleryRedesignedPhotoBinder, subviewsDelegate, frameBinder, tokenizedAnalytics, handlersInhibitor, customActionHandlersStoreFactory, subscribeAuthorsIdStorage, (UgcCachedActionsSharedViewModel) w0Var);
    }

    private final ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO switchActionState(ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO, String str, boolean z11) {
        List<RightPanelButtonDTO> buttons = reviewsRightPanelDTO.getButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(buttons, 10));
        for (RightPanelButtonDTO rightPanelButtonDTO : buttons) {
            if (Intrinsics.d(rightPanelButtonDTO.getNormal().getAction().getId(), str)) {
                rightPanelButtonDTO = RightPanelButtonDTO.copy$default(rightPanelButtonDTO, z11 ? RightPanelButtonDTO.RightPanelState.SELECTED : RightPanelButtonDTO.RightPanelState.NORMAL, null, null, 6, null);
            }
            arrayList.add(rightPanelButtonDTO);
        }
        return ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO.copy$default(reviewsRightPanelDTO, arrayList, null, null, 6, null);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewGalleryV2DTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull ru.ozon.composer.ui.widget.l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        super.constructLayout(container, viewItem);
        container.Y().setBackground(null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ReviewGalleryView(context, Intrinsics.d(f.a(component().getMiniAppConfigHolder()), "supermarket"));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ReviewGalleryItemDecorator(ResourceExtKt.getStatusBarHeight(context), ResourceExtKt.getNavigationBarHeight(context)));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getReviewGalleryV2ViewModel();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewGalleryComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewGalleryComponent.INSTANCE.create(storage);
    }

    @NotNull
    public h<ReviewGalleryBaseWidgetVH> getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ReviewGalleryMapper getMapper() {
        return component().getReviewGalleryMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<ReviewGalleryPayload> getPayload(@NotNull ReviewGalleryVO oldItem, @NotNull ReviewGalleryVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        boolean z11 = oldItem.getId() == newItem.getId();
        boolean z12 = oldItem.getHasAudio() && !newItem.getHasAudio();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel = oldItem.getRightPanel();
        List<RightPanelButtonDTO> buttons = rightPanel != null ? rightPanel.getButtons() : null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel2 = newItem.getRightPanel();
        boolean z13 = (Intrinsics.d(buttons, rightPanel2 != null ? rightPanel2.getButtons() : null) && oldItem.getHasAudio() == newItem.getHasAudio()) ? false : true;
        if (z11 && z12) {
            arrayList.add(ReviewGalleryPayload.RestoreAudioState.INSTANCE);
        }
        if (z11 && z13 && !z12) {
            arrayList.add(ReviewGalleryPayload.Vote.INSTANCE);
        }
        boolean z14 = (Intrinsics.d(oldItem.getBottomItems(), newItem.getBottomItems()) && Intrinsics.d(oldItem.getBottomMediaItems(), newItem.getBottomMediaItems()) && Intrinsics.d(oldItem.getTopMediaItems(), newItem.getTopMediaItems())) ? false : true;
        if (z11 && z14) {
            arrayList.add(ReviewGalleryPayload.Subviews.INSTANCE);
        }
        boolean z15 = oldItem.getIsCompactControls() != newItem.getIsCompactControls();
        if (z11 && z15) {
            arrayList.add(ReviewGalleryPayload.Controls.INSTANCE);
        }
        ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser = oldItem.getSocialUser();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser2 = newItem.getSocialUser();
        boolean d11 = Intrinsics.d(socialUser != null ? Boolean.valueOf(socialUser.isSubscribed()) : null, socialUser2 != null ? Boolean.valueOf(socialUser2.isSubscribed()) : null);
        boolean d12 = Intrinsics.d(socialUser != null ? socialUser.getSubscribe() : null, socialUser2 != null ? socialUser2.getSubscribe() : null);
        if (z11 && ((!d11 || !d12) && socialUser2 != null)) {
            arrayList.add(new ReviewGalleryPayload.Subscribe(socialUser2));
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public ReviewGalleryVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ReviewGalleryVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ReviewGallerySwitchActionUpdateKey) {
            ReviewGallerySwitchActionUpdateKey reviewGallerySwitchActionUpdateKey = (ReviewGallerySwitchActionUpdateKey) update;
            if (Intrinsics.d(oldItem.getReviewUuid(), reviewGallerySwitchActionUpdateKey.getReviewUuid())) {
                ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel = oldItem.getRightPanel();
                return ReviewGalleryVO.copy$default(oldItem, 0L, null, null, null, null, rightPanel != null ? switchActionState(rightPanel, reviewGallerySwitchActionUpdateKey.getActionId(), reviewGallerySwitchActionUpdateKey.getIsSelected()) : null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, 134217695, null);
            }
        } else {
            if (update instanceof ReviewGalleryLikeUpdateKey) {
                ReviewGalleryLikeUpdateKey reviewGalleryLikeUpdateKey = (ReviewGalleryLikeUpdateKey) update;
                if (Intrinsics.d(oldItem.getReviewUuid(), reviewGalleryLikeUpdateKey.getReviewUuid())) {
                    ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel2 = oldItem.getRightPanel();
                    return ReviewGalleryVO.copy$default(oldItem, 0L, null, null, null, null, rightPanel2 != null ? ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO.copy$default(rightPanel2, reviewGalleryLikeUpdateKey.getRightPanelButtonsState(), null, null, 6, null) : null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, 134217695, null);
                }
            }
            if (update instanceof SubscribeAuthorUpdateKey) {
                ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser = oldItem.getSocialUser();
                if (Intrinsics.d(getAuthorIdFromCell(socialUser != null ? socialUser.getSubscribe() : null), ((SubscribeAuthorUpdateKey) update).getAuthorId())) {
                    ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser2 = oldItem.getSocialUser();
                    return ReviewGalleryVO.copy$default(oldItem, 0L, null, null, null, null, null, false, null, socialUser2 != null ? ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser.copy$default(socialUser2, null, null, true, 3, null) : null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, 134217471, null);
                }
            }
            if (update instanceof UnsubscribeAuthorUpdateKey) {
                ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser3 = oldItem.getSocialUser();
                if (Intrinsics.d(getAuthorIdFromCell(socialUser3 != null ? socialUser3.getSubscribed() : null), ((UnsubscribeAuthorUpdateKey) update).getAuthorId())) {
                    ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser4 = oldItem.getSocialUser();
                    return ReviewGalleryVO.copy$default(oldItem, 0L, null, null, null, null, null, false, null, socialUser4 != null ? ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser.copy$default(socialUser4, null, null, false, 3, null) : null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, 134217471, null);
                }
            }
            if (update instanceof ReviewGalleryHasAudioUpdateKey) {
                ReviewGalleryHasAudioUpdateKey reviewGalleryHasAudioUpdateKey = (ReviewGalleryHasAudioUpdateKey) update;
                if (oldItem.getId() == reviewGalleryHasAudioUpdateKey.getId() && oldItem.getHasAudio() != reviewGalleryHasAudioUpdateKey.getHasAudio()) {
                    return ReviewGalleryVO.copy$default(oldItem, 0L, null, null, null, null, null, reviewGalleryHasAudioUpdateKey.getHasAudio(), null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, 134217663, null);
                }
            }
        }
        return oldItem;
    }
}
