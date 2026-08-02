package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import Pk0.b;
import WZ.t;
import Z1.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b)\b\u0081\b\u0018\u00002\u00020\u0001:\u0003HIJBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u009c\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b:\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\b\u0017\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010C\u001a\u0004\b\u0018\u0010DR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI;", "", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge;", "badges", "Lru/ozon/uni/atoms/data/common/Paddings;", "badgesLeftPadding", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "LZ1/h;", "spacerAboveAspectHeight", "aspectText", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "rating", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "", "backgroundColor", "", "isLast", "isFirst", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "swipeActions", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/text/TextDTO;FLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;ZZLru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-zadm560", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/text/TextDTO;FLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;ZZLru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI;", "copy", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getBadgesLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "F", "getSpacerAboveAspectHeight-D9Ej5fM", "()F", "getAspectText", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Ljava/lang/String;", "getBackgroundColor", "Z", "()Z", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "getSwipeActions", "()Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "Badge", "SwipeActionsVI", "SwipeAction", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductVI {
    private final TextDTO aspectText;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<Badge> badges;

    @NotNull
    private final Paddings badgesLeftPadding;

    @NotNull
    private final CornerRadius cornerRadius;
    private final long id;
    private final ImageDTO image;
    private final boolean isFirst;
    private final boolean isLast;

    @NotNull
    private final RatingDTO rating;
    private final float spacerAboveAspectHeight;

    @NotNull
    private final SwipeActionsVI swipeActions;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge;", "", "<init>", "()V", "isFullWidth", "", "()Z", "BadgeContentVI", "TimerContentVI", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge$BadgeContentVI;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge$TimerContentVI;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Badge {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge$BadgeContentVI;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "isFullWidth", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BadgeContentVI extends Badge {

            @NotNull
            private final BadgeDTO badge;
            private final boolean isFullWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BadgeContentVI(@NotNull BadgeDTO badge, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
                this.isFullWidth = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BadgeContentVI)) {
                    return false;
                }
                BadgeContentVI badgeContentVI = (BadgeContentVI) other;
                return Intrinsics.d(this.badge, badgeContentVI.badge) && this.isFullWidth == badgeContentVI.isFullWidth;
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isFullWidth) + (this.badge.hashCode() * 31);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI.Badge
            /* renamed from: isFullWidth, reason: from getter */
            public boolean getIsFullWidth() {
                return this.isFullWidth;
            }

            @NotNull
            public String toString() {
                return "BadgeContentVI(badge=" + this.badge + ", isFullWidth=" + this.isFullWidth + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge$TimerContentVI;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge;", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "", "isFullWidth", "<init>", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimerContentVI extends Badge {
            private final boolean isFullWidth;

            @NotNull
            private final TimerVO timer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimerContentVI(@NotNull TimerVO timer, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(timer, "timer");
                this.timer = timer;
                this.isFullWidth = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimerContentVI)) {
                    return false;
                }
                TimerContentVI timerContentVI = (TimerContentVI) other;
                return Intrinsics.d(this.timer, timerContentVI.timer) && this.isFullWidth == timerContentVI.isFullWidth;
            }

            @NotNull
            public final TimerVO getTimer() {
                return this.timer;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isFullWidth) + (this.timer.hashCode() * 31);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI.Badge
            /* renamed from: isFullWidth, reason: from getter */
            public boolean getIsFullWidth() {
                return this.isFullWidth;
            }

            @NotNull
            public String toString() {
                return "TimerContentVI(timer=" + this.timer + ", isFullWidth=" + this.isFullWidth + ")";
            }
        }

        public /* synthetic */ Badge(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: isFullWidth */
        public abstract boolean getIsFullWidth();

        private Badge() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeAction;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "background", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getBackground", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwipeAction {
        public static final int $stable = AtomAction.$stable | IconDTO.$stable;
        private final AtomAction action;

        @NotNull
        private final String background;

        @NotNull
        private final IconDTO icon;
        private final TextDTO title;

        public SwipeAction(@NotNull IconDTO icon, @NotNull String background, AtomAction atomAction, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(background, "background");
            this.icon = icon;
            this.background = background;
            this.action = atomAction;
            this.title = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwipeAction)) {
                return false;
            }
            SwipeAction swipeAction = (SwipeAction) other;
            return Intrinsics.d(this.icon, swipeAction.icon) && Intrinsics.d(this.background, swipeAction.background) && Intrinsics.d(this.action, swipeAction.action) && Intrinsics.d(this.title, swipeAction.title);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackground() {
            return this.background;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.icon.hashCode() * 31, 31, this.background);
            AtomAction atomAction = this.action;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            TextDTO textDTO = this.title;
            return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SwipeAction(icon=" + this.icon + ", background=" + this.background + ", action=" + this.action + ", title=" + this.title + ")";
        }
    }

    public /* synthetic */ ProductVI(long j11, ImageDTO imageDTO, List list, Paddings paddings, TextDTO textDTO, float f7, TextDTO textDTO2, RatingDTO ratingDTO, CornerRadius cornerRadius, String str, boolean z11, boolean z12, SwipeActionsVI swipeActionsVI, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, imageDTO, list, paddings, textDTO, f7, textDTO2, ratingDTO, cornerRadius, str, z11, z12, swipeActionsVI);
    }

    @NotNull
    /* renamed from: copy-zadm560, reason: not valid java name */
    public final ProductVI m1491copyzadm560(long id2, ImageDTO image, @NotNull List<? extends Badge> badges, @NotNull Paddings badgesLeftPadding, @NotNull TextDTO title, float spacerAboveAspectHeight, TextDTO aspectText, @NotNull RatingDTO rating, @NotNull CornerRadius cornerRadius, @NotNull String backgroundColor, boolean isLast, boolean isFirst, @NotNull SwipeActionsVI swipeActions) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(badgesLeftPadding, "badgesLeftPadding");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(swipeActions, "swipeActions");
        return new ProductVI(id2, image, badges, badgesLeftPadding, title, spacerAboveAspectHeight, aspectText, rating, cornerRadius, backgroundColor, isLast, isFirst, swipeActions, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVI)) {
            return false;
        }
        ProductVI productVI = (ProductVI) other;
        return this.id == productVI.id && Intrinsics.d(this.image, productVI.image) && Intrinsics.d(this.badges, productVI.badges) && this.badgesLeftPadding == productVI.badgesLeftPadding && Intrinsics.d(this.title, productVI.title) && h.b(this.spacerAboveAspectHeight, productVI.spacerAboveAspectHeight) && Intrinsics.d(this.aspectText, productVI.aspectText) && Intrinsics.d(this.rating, productVI.rating) && this.cornerRadius == productVI.cornerRadius && Intrinsics.d(this.backgroundColor, productVI.backgroundColor) && this.isLast == productVI.isLast && this.isFirst == productVI.isFirst && Intrinsics.d(this.swipeActions, productVI.swipeActions);
    }

    public final TextDTO getAspectText() {
        return this.aspectText;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Badge> getBadges() {
        return this.badges;
    }

    @NotNull
    public final Paddings getBadgesLeftPadding() {
        return this.badgesLeftPadding;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final long getId() {
        return this.id;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    /* renamed from: getSpacerAboveAspectHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSpacerAboveAspectHeight() {
        return this.spacerAboveAspectHeight;
    }

    @NotNull
    public final SwipeActionsVI getSwipeActions() {
        return this.swipeActions;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ImageDTO imageDTO = this.image;
        int a11 = b.a(this.spacerAboveAspectHeight, Ns.b.a(this.title, GR.b.b(this.badgesLeftPadding, g.b((hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31, this.badges), 31), 31), 31);
        TextDTO textDTO = this.aspectText;
        return this.swipeActions.hashCode() + C3532b.a(C3532b.a(g.a(Tl.b.b(this.cornerRadius, (this.rating.hashCode() + ((a11 + (textDTO != null ? textDTO.hashCode() : 0)) * 31)) * 31, 31), 31, this.backgroundColor), 31, this.isLast), 31, this.isFirst);
    }

    /* renamed from: isFirst, reason: from getter */
    public final boolean getIsFirst() {
        return this.isFirst;
    }

    /* renamed from: isLast, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        List<Badge> list = this.badges;
        Paddings paddings = this.badgesLeftPadding;
        TextDTO textDTO = this.title;
        String c11 = h.c(this.spacerAboveAspectHeight);
        TextDTO textDTO2 = this.aspectText;
        RatingDTO ratingDTO = this.rating;
        CornerRadius cornerRadius = this.cornerRadius;
        String str = this.backgroundColor;
        boolean z11 = this.isLast;
        boolean z12 = this.isFirst;
        SwipeActionsVI swipeActionsVI = this.swipeActions;
        StringBuilder c12 = Nh.b.c("ProductVI(id=", j11, ", image=", imageDTO);
        c12.append(", badges=");
        c12.append(list);
        c12.append(", badgesLeftPadding=");
        c12.append(paddings);
        c12.append(", title=");
        c12.append(textDTO);
        c12.append(", spacerAboveAspectHeight=");
        c12.append(c11);
        c12.append(", aspectText=");
        c12.append(textDTO2);
        c12.append(", rating=");
        c12.append(ratingDTO);
        c12.append(", cornerRadius=");
        c12.append(cornerRadius);
        c12.append(", backgroundColor=");
        c12.append(str);
        C2436a.e(", isLast=", ", isFirst=", c12, z11, z12);
        c12.append(", swipeActions=");
        c12.append(swipeActionsVI);
        c12.append(")");
        return c12.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ProductVI(long j11, ImageDTO imageDTO, List<? extends Badge> badges, Paddings badgesLeftPadding, TextDTO title, float f7, TextDTO textDTO, RatingDTO rating, CornerRadius cornerRadius, String backgroundColor, boolean z11, boolean z12, SwipeActionsVI swipeActions) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(badgesLeftPadding, "badgesLeftPadding");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(swipeActions, "swipeActions");
        this.id = j11;
        this.image = imageDTO;
        this.badges = badges;
        this.badgesLeftPadding = badgesLeftPadding;
        this.title = title;
        this.spacerAboveAspectHeight = f7;
        this.aspectText = textDTO;
        this.rating = rating;
        this.cornerRadius = cornerRadius;
        this.backgroundColor = backgroundColor;
        this.isLast = z11;
        this.isFirst = z12;
        this.swipeActions = swipeActions;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeAction;", "actions", "LWZ/t;", "tokenizedEvent", "", "swipeBlockWidthFraction", "", "isExpanded", "<init>", "(Ljava/util/List;LWZ/t;FZ)V", "copy", "(Ljava/util/List;LWZ/t;FZ)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "F", "getSwipeBlockWidthFraction", "()F", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwipeActionsVI {

        @NotNull
        private final List<SwipeAction> actions;
        private final boolean isExpanded;
        private final float swipeBlockWidthFraction;
        private final t tokenizedEvent;

        public SwipeActionsVI(@NotNull List<SwipeAction> actions, t tVar, float f7, boolean z11) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.actions = actions;
            this.tokenizedEvent = tVar;
            this.swipeBlockWidthFraction = f7;
            this.isExpanded = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SwipeActionsVI copy$default(SwipeActionsVI swipeActionsVI, List list, t tVar, float f7, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = swipeActionsVI.actions;
            }
            if ((i11 & 2) != 0) {
                tVar = swipeActionsVI.tokenizedEvent;
            }
            if ((i11 & 4) != 0) {
                f7 = swipeActionsVI.swipeBlockWidthFraction;
            }
            if ((i11 & 8) != 0) {
                z11 = swipeActionsVI.isExpanded;
            }
            return swipeActionsVI.copy(list, tVar, f7, z11);
        }

        @NotNull
        public final SwipeActionsVI copy(@NotNull List<SwipeAction> actions, t tokenizedEvent, float swipeBlockWidthFraction, boolean isExpanded) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            return new SwipeActionsVI(actions, tokenizedEvent, swipeBlockWidthFraction, isExpanded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwipeActionsVI)) {
                return false;
            }
            SwipeActionsVI swipeActionsVI = (SwipeActionsVI) other;
            return Intrinsics.d(this.actions, swipeActionsVI.actions) && Intrinsics.d(this.tokenizedEvent, swipeActionsVI.tokenizedEvent) && Float.compare(this.swipeBlockWidthFraction, swipeActionsVI.swipeBlockWidthFraction) == 0 && this.isExpanded == swipeActionsVI.isExpanded;
        }

        @NotNull
        public final List<SwipeAction> getActions() {
            return this.actions;
        }

        public final float getSwipeBlockWidthFraction() {
            return this.swipeBlockWidthFraction;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.actions.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.isExpanded) + b.a(this.swipeBlockWidthFraction, (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
        }

        /* renamed from: isExpanded, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        @NotNull
        public String toString() {
            return "SwipeActionsVI(actions=" + this.actions + ", tokenizedEvent=" + this.tokenizedEvent + ", swipeBlockWidthFraction=" + this.swipeBlockWidthFraction + ", isExpanded=" + this.isExpanded + ")";
        }

        public /* synthetic */ SwipeActionsVI(List list, t tVar, float f7, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, tVar, f7, (i11 & 8) != 0 ? false : z11);
        }
    }
}
