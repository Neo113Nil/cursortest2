package ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import Fm.C3051a;
import G.g;
import HY.a;
import Kk.C3532b;
import Ve.C4598rp;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "state", "<init>", "(JLru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;)V", "copy", "(JLru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "State", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalServiceCardVO implements c {
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "", "PlaceholderState", "EmptyState", "AdditionalServiceCardState", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$AdditionalServiceCardState;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$EmptyState;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$PlaceholderState;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b.\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b6\u0010\u001aR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$AdditionalServiceCardState;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "areDetailsVisible", "", "details", "Lru/ozon/uni/atoms/data/price/Price;", "price", "priceDescription", "", "imageUrl", "", "backgroundImageColor", "Lru/ozon/uni/atoms/af/AtomAction;", "serviceAction", "disclosureIcon", "disclosureIconTint", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/util/List;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ILru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Z", "getAreDetailsVisible", "()Z", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPriceDescription", "Ljava/lang/String;", "getImageUrl", "I", "getBackgroundImageColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getServiceAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDisclosureIcon", "Ljava/lang/Integer;", "getDisclosureIconTint", "()Ljava/lang/Integer;", "Ljava/util/Map;", "getViewEvent", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AdditionalServiceCardState implements State {
            private final boolean areDetailsVisible;
            private final int backgroundImageColor;

            @NotNull
            private final List<TextAtom> details;

            @NotNull
            private final String disclosureIcon;
            private final Integer disclosureIconTint;

            @NotNull
            private final String imageUrl;

            @NotNull
            private final Price price;

            @NotNull
            private final TextAtom priceDescription;

            @NotNull
            private final AtomAction serviceAction;
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;
            private final Map<String, TokenizedTrackingInfo> viewEvent;

            public AdditionalServiceCardState(@NotNull TextAtom title, TextAtom textAtom, boolean z11, @NotNull List<TextAtom> details, @NotNull Price price, @NotNull TextAtom priceDescription, @NotNull String imageUrl, int i11, @NotNull AtomAction serviceAction, @NotNull String disclosureIcon, Integer num, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(details, "details");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(serviceAction, "serviceAction");
                Intrinsics.checkNotNullParameter(disclosureIcon, "disclosureIcon");
                this.title = title;
                this.subtitle = textAtom;
                this.areDetailsVisible = z11;
                this.details = details;
                this.price = price;
                this.priceDescription = priceDescription;
                this.imageUrl = imageUrl;
                this.backgroundImageColor = i11;
                this.serviceAction = serviceAction;
                this.disclosureIcon = disclosureIcon;
                this.disclosureIconTint = num;
                this.viewEvent = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdditionalServiceCardState)) {
                    return false;
                }
                AdditionalServiceCardState additionalServiceCardState = (AdditionalServiceCardState) other;
                return Intrinsics.d(this.title, additionalServiceCardState.title) && Intrinsics.d(this.subtitle, additionalServiceCardState.subtitle) && this.areDetailsVisible == additionalServiceCardState.areDetailsVisible && Intrinsics.d(this.details, additionalServiceCardState.details) && Intrinsics.d(this.price, additionalServiceCardState.price) && Intrinsics.d(this.priceDescription, additionalServiceCardState.priceDescription) && Intrinsics.d(this.imageUrl, additionalServiceCardState.imageUrl) && this.backgroundImageColor == additionalServiceCardState.backgroundImageColor && Intrinsics.d(this.serviceAction, additionalServiceCardState.serviceAction) && Intrinsics.d(this.disclosureIcon, additionalServiceCardState.disclosureIcon) && Intrinsics.d(this.disclosureIconTint, additionalServiceCardState.disclosureIconTint) && Intrinsics.d(this.viewEvent, additionalServiceCardState.viewEvent);
            }

            public final boolean getAreDetailsVisible() {
                return this.areDetailsVisible;
            }

            public final int getBackgroundImageColor() {
                return this.backgroundImageColor;
            }

            @NotNull
            public final List<TextAtom> getDetails() {
                return this.details;
            }

            @NotNull
            public final String getDisclosureIcon() {
                return this.disclosureIcon;
            }

            public final Integer getDisclosureIconTint() {
                return this.disclosureIconTint;
            }

            @NotNull
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            public final Price getPrice() {
                return this.price;
            }

            @NotNull
            public final TextAtom getPriceDescription() {
                return this.priceDescription;
            }

            @NotNull
            public final AtomAction getServiceAction() {
                return this.serviceAction;
            }

            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getViewEvent() {
                return this.viewEvent;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextAtom textAtom = this.subtitle;
                int a11 = g.a(C4598rp.a(this.serviceAction, C2454a.a(this.backgroundImageColor, g.a(C2619v.b(C3051a.a(this.price, g.b(C3532b.a((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.areDetailsVisible), 31, this.details), 31), 31, this.priceDescription), 31, this.imageUrl), 31), 31), 31, this.disclosureIcon);
                Integer num = this.disclosureIconTint;
                int hashCode2 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                TextAtom textAtom2 = this.subtitle;
                boolean z11 = this.areDetailsVisible;
                List<TextAtom> list = this.details;
                Price price = this.price;
                TextAtom textAtom3 = this.priceDescription;
                String str = this.imageUrl;
                int i11 = this.backgroundImageColor;
                AtomAction atomAction = this.serviceAction;
                String str2 = this.disclosureIcon;
                Integer num = this.disclosureIconTint;
                Map<String, TokenizedTrackingInfo> map = this.viewEvent;
                StringBuilder a11 = a.a("AdditionalServiceCardState(title=", textAtom, ", subtitle=", textAtom2, ", areDetailsVisible=");
                a11.append(z11);
                a11.append(", details=");
                a11.append(list);
                a11.append(", price=");
                a11.append(price);
                a11.append(", priceDescription=");
                a11.append(textAtom3);
                a11.append(", imageUrl=");
                Pk0.g.d(i11, str, ", backgroundImageColor=", ", serviceAction=", a11);
                a11.append(atomAction);
                a11.append(", disclosureIcon=");
                a11.append(str2);
                a11.append(", disclosureIconTint=");
                a11.append(num);
                a11.append(", viewEvent=");
                a11.append(map);
                a11.append(")");
                return a11.toString();
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$EmptyState;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "emptyState", "<init>", "(Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EmptyState implements State {
            public static final int $stable = EmptyStateVO.$stable;

            @NotNull
            private final EmptyStateVO emptyState;

            public EmptyState(@NotNull EmptyStateVO emptyState) {
                Intrinsics.checkNotNullParameter(emptyState, "emptyState");
                this.emptyState = emptyState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmptyState) && Intrinsics.d(this.emptyState, ((EmptyState) other).emptyState);
            }

            @NotNull
            public final EmptyStateVO getEmptyState() {
                return this.emptyState;
            }

            public int hashCode() {
                return this.emptyState.hashCode();
            }

            @NotNull
            public String toString() {
                return "EmptyState(emptyState=" + this.emptyState + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State$PlaceholderState;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "", "asyncData", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PlaceholderState implements State {

            @NotNull
            private final String asyncData;

            public PlaceholderState(@NotNull String asyncData) {
                Intrinsics.checkNotNullParameter(asyncData, "asyncData");
                this.asyncData = asyncData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaceholderState) && Intrinsics.d(this.asyncData, ((PlaceholderState) other).asyncData);
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
                return A0.b("PlaceholderState(asyncData=", this.asyncData, ")");
            }
        }
    }

    public AdditionalServiceCardVO(long j11, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
    }

    public static /* synthetic */ AdditionalServiceCardVO copy$default(AdditionalServiceCardVO additionalServiceCardVO, long j11, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = additionalServiceCardVO.id;
        }
        if ((i11 & 2) != 0) {
            state = additionalServiceCardVO.state;
        }
        return additionalServiceCardVO.copy(j11, state);
    }

    @NotNull
    public final AdditionalServiceCardVO copy(long id2, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new AdditionalServiceCardVO(id2, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServiceCardVO)) {
            return false;
        }
        AdditionalServiceCardVO additionalServiceCardVO = (AdditionalServiceCardVO) other;
        return this.id == additionalServiceCardVO.id && Intrinsics.d(this.state, additionalServiceCardVO.state);
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
        return "AdditionalServiceCardVO(id=" + this.id + ", state=" + this.state + ")";
    }
}
