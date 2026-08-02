package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.SocialSoundControlDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "", "<init>", "()V", "IconItem", "TextItem", "MuteItem", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$IconItem;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$MuteItem;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$TextItem;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RightPanelWithMuteItemOptimized {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$IconItem;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "item", "", "hasText", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "getItem", "()Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "Z", "getHasText", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconItem extends RightPanelWithMuteItemOptimized {
        private final boolean hasText;

        @NotNull
        private final RightPanelItemVO item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconItem(@NotNull RightPanelItemVO item, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.hasText = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconItem)) {
                return false;
            }
            IconItem iconItem = (IconItem) other;
            return Intrinsics.d(this.item, iconItem.item) && this.hasText == iconItem.hasText;
        }

        public final boolean getHasText() {
            return this.hasText;
        }

        @NotNull
        public final RightPanelItemVO getItem() {
            return this.item;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasText) + (this.item.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "IconItem(item=" + this.item + ", hasText=" + this.hasText + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$MuteItem;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "item", "", "hasAudio", "hasDivider", "", "widgetId", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;Ljava/lang/Boolean;ZJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "getItem", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "Ljava/lang/Boolean;", "getHasAudio", "()Ljava/lang/Boolean;", "Z", "getHasDivider", "()Z", "J", "getWidgetId", "()J", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MuteItem extends RightPanelWithMuteItemOptimized {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;
        private final Boolean hasAudio;
        private final boolean hasDivider;

        @NotNull
        private final SocialSoundControlDTO item;
        private final long widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MuteItem(@NotNull SocialSoundControlDTO item, Boolean bool, boolean z11, long j11) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.hasAudio = bool;
            this.hasDivider = z11;
            this.widgetId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MuteItem)) {
                return false;
            }
            MuteItem muteItem = (MuteItem) other;
            return Intrinsics.d(this.item, muteItem.item) && Intrinsics.d(this.hasAudio, muteItem.hasAudio) && this.hasDivider == muteItem.hasDivider && this.widgetId == muteItem.widgetId;
        }

        public final Boolean getHasAudio() {
            return this.hasAudio;
        }

        public final boolean getHasDivider() {
            return this.hasDivider;
        }

        @NotNull
        public final SocialSoundControlDTO getItem() {
            return this.item;
        }

        public final long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            int hashCode = this.item.hashCode() * 31;
            Boolean bool = this.hasAudio;
            return Long.hashCode(this.widgetId) + C3532b.a((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.hasDivider);
        }

        @NotNull
        public String toString() {
            return "MuteItem(item=" + this.item + ", hasAudio=" + this.hasAudio + ", hasDivider=" + this.hasDivider + ", widgetId=" + this.widgetId + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$TextItem;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "item", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "getItem", "()Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextItem extends RightPanelWithMuteItemOptimized {

        @NotNull
        private final RightPanelItemVO item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextItem(@NotNull RightPanelItemVO item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextItem) && Intrinsics.d(this.item, ((TextItem) other).item);
        }

        @NotNull
        public final RightPanelItemVO getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "TextItem(item=" + this.item + ")";
        }
    }

    public /* synthetic */ RightPanelWithMuteItemOptimized(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RightPanelWithMuteItemOptimized() {
    }
}
