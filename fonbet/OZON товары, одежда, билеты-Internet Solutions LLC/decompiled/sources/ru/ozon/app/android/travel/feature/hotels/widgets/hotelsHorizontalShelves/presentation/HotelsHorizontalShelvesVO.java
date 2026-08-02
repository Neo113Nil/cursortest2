package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation;

import B0.A0;
import B0.C2454a;
import G.g;
import Nh.a;
import Pk0.b;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardOptionsVO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u001c\u001d\u001eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "state", "<init>", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;)V", "copy", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "State", "Loaded", "AsyncPlaceholder", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsHorizontalShelvesVO implements c {
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$AsyncPlaceholder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "", "asyncData", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AsyncPlaceholder implements State {

        @NotNull
        private final String asyncData;

        public AsyncPlaceholder(@NotNull String asyncData) {
            Intrinsics.checkNotNullParameter(asyncData, "asyncData");
            this.asyncData = asyncData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AsyncPlaceholder) && Intrinsics.d(this.asyncData, ((AsyncPlaceholder) other).asyncData);
        }

        @NotNull
        public final String getAsyncData() {
            return this.asyncData;
        }

        public int hashCode() {
            return this.asyncData.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("AsyncPlaceholder(asyncData=", this.asyncData, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$AsyncPlaceholder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {
    }

    public HotelsHorizontalShelvesVO(long j11, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
    }

    public static /* synthetic */ HotelsHorizontalShelvesVO copy$default(HotelsHorizontalShelvesVO hotelsHorizontalShelvesVO, long j11, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsHorizontalShelvesVO.id;
        }
        if ((i11 & 2) != 0) {
            state = hotelsHorizontalShelvesVO.state;
        }
        return hotelsHorizontalShelvesVO.copy(j11, state);
    }

    @NotNull
    public final HotelsHorizontalShelvesVO copy(long id2, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new HotelsHorizontalShelvesVO(id2, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsHorizontalShelvesVO)) {
            return false;
        }
        HotelsHorizontalShelvesVO hotelsHorizontalShelvesVO = (HotelsHorizontalShelvesVO) other;
        return this.id == hotelsHorizontalShelvesVO.id && Intrinsics.d(this.state, hotelsHorizontalShelvesVO.state);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.state.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "HotelsHorizontalShelvesVO(id=" + this.id + ", state=" + this.state + ")";
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b;\u00104R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010AR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundImage", "backgroundToken", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "backgroundGradient", "", "cardsTopMargin", "", "cardsOnScreen", "", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "cards", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "cardOptions", "cornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Landroid/os/Parcelable;", "cardsSavedState", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/uikitsdk/Color$Gradient;IFLjava/util/List;Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;FLru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Landroid/os/Parcelable;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBackgroundImage", "getBackgroundToken", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getBackgroundGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "I", "getCardsTopMargin", "F", "getCardsOnScreen", "()F", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "getCardOptions", "()Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "getCornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Landroid/os/Parcelable;", "getCardsSavedState", "()Landroid/os/Parcelable;", "setCardsSavedState", "(Landroid/os/Parcelable;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded implements State {
        private final AtomAction atomAction;
        private final Color.Gradient backgroundGradient;
        private final String backgroundImage;
        private final String backgroundToken;

        @NotNull
        private final ShelfCardOptionsVO cardOptions;

        @NotNull
        private final List<ShelfCardVO> cards;
        private final float cardsOnScreen;
        private Parcelable cardsSavedState;
        private final int cardsTopMargin;
        private final float cornerRadius;
        private final TextDTO subtitle;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Loaded(TextDTO textDTO, TextDTO textDTO2, String str, String str2, Color.Gradient gradient, int i11, float f7, @NotNull List<ShelfCardVO> cards, @NotNull ShelfCardOptionsVO cardOptions, float f11, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            Intrinsics.checkNotNullParameter(cardOptions, "cardOptions");
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.backgroundImage = str;
            this.backgroundToken = str2;
            this.backgroundGradient = gradient;
            this.cardsTopMargin = i11;
            this.cardsOnScreen = f7;
            this.cards = cards;
            this.cardOptions = cardOptions;
            this.cornerRadius = f11;
            this.atomAction = atomAction;
            this.trackingInfo = map;
            this.cardsSavedState = parcelable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.d(this.title, loaded.title) && Intrinsics.d(this.subtitle, loaded.subtitle) && Intrinsics.d(this.backgroundImage, loaded.backgroundImage) && Intrinsics.d(this.backgroundToken, loaded.backgroundToken) && Intrinsics.d(this.backgroundGradient, loaded.backgroundGradient) && this.cardsTopMargin == loaded.cardsTopMargin && Float.compare(this.cardsOnScreen, loaded.cardsOnScreen) == 0 && Intrinsics.d(this.cards, loaded.cards) && Intrinsics.d(this.cardOptions, loaded.cardOptions) && Float.compare(this.cornerRadius, loaded.cornerRadius) == 0 && Intrinsics.d(this.atomAction, loaded.atomAction) && Intrinsics.d(this.trackingInfo, loaded.trackingInfo) && Intrinsics.d(this.cardsSavedState, loaded.cardsSavedState);
        }

        public final AtomAction getAtomAction() {
            return this.atomAction;
        }

        public final Color.Gradient getBackgroundGradient() {
            return this.backgroundGradient;
        }

        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        public final String getBackgroundToken() {
            return this.backgroundToken;
        }

        @NotNull
        public final ShelfCardOptionsVO getCardOptions() {
            return this.cardOptions;
        }

        @NotNull
        public final List<ShelfCardVO> getCards() {
            return this.cards;
        }

        public final float getCardsOnScreen() {
            return this.cardsOnScreen;
        }

        public final Parcelable getCardsSavedState() {
            return this.cardsSavedState;
        }

        public final int getCardsTopMargin() {
            return this.cardsTopMargin;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            String str = this.backgroundImage;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundToken;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Color.Gradient gradient = this.backgroundGradient;
            int a11 = b.a(this.cornerRadius, (this.cardOptions.hashCode() + g.b(b.a(this.cardsOnScreen, C2454a.a(this.cardsTopMargin, (hashCode4 + (gradient == null ? 0 : gradient.hashCode())) * 31, 31), 31), 31, this.cards)) * 31, 31);
            AtomAction atomAction = this.atomAction;
            int hashCode5 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            Parcelable parcelable = this.cardsSavedState;
            return hashCode6 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        public final void setCardsSavedState(Parcelable parcelable) {
            this.cardsSavedState = parcelable;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.backgroundImage;
            String str2 = this.backgroundToken;
            Color.Gradient gradient = this.backgroundGradient;
            int i11 = this.cardsTopMargin;
            float f7 = this.cardsOnScreen;
            List<ShelfCardVO> list = this.cards;
            ShelfCardOptionsVO shelfCardOptionsVO = this.cardOptions;
            float f11 = this.cornerRadius;
            AtomAction atomAction = this.atomAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Parcelable parcelable = this.cardsSavedState;
            StringBuilder g10 = D3.g.g("Loaded(title=", textDTO, ", subtitle=", textDTO2, ", backgroundImage=");
            a.h(g10, str, ", backgroundToken=", str2, ", backgroundGradient=");
            g10.append(gradient);
            g10.append(", cardsTopMargin=");
            g10.append(i11);
            g10.append(", cardsOnScreen=");
            g10.append(f7);
            g10.append(", cards=");
            g10.append(list);
            g10.append(", cardOptions=");
            g10.append(shelfCardOptionsVO);
            g10.append(", cornerRadius=");
            g10.append(f11);
            g10.append(", atomAction=");
            g10.append(atomAction);
            g10.append(", trackingInfo=");
            g10.append(map);
            g10.append(", cardsSavedState=");
            g10.append(parcelable);
            g10.append(")");
            return g10.toString();
        }

        public /* synthetic */ Loaded(TextDTO textDTO, TextDTO textDTO2, String str, String str2, Color.Gradient gradient, int i11, float f7, List list, ShelfCardOptionsVO shelfCardOptionsVO, float f11, AtomAction atomAction, Map map, Parcelable parcelable, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, str, str2, gradient, i11, f7, list, shelfCardOptionsVO, f11, atomAction, map, (i12 & 4096) != 0 ? null : parcelable);
        }
    }
}
