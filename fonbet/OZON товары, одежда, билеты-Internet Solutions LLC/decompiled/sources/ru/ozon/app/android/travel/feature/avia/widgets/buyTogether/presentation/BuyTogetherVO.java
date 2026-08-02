package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.presentation;

import Am.C2438a;
import B0.A0;
import B0.C2454a;
import B90.C2619v;
import G.g;
import J0.C3349u1;
import Nh.a;
import Ul.C4070a;
import Ve.C4636t5;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u001c\u001d\u001eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "state", "<init>", "(JLru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;)V", "copy", "(JLru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;)Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "State", "Loading", "Loaded", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BuyTogetherVO implements c {
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "allServicesButton", "Lru/ozon/uni/atoms/af/AtomAction;", "allServicesAction", "", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded$ServiceVO;", ResultDTO.CONTENT_TYPE_SERVICES, "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getAllServicesButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAllServicesAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/List;", "getServices", "()Ljava/util/List;", "ServiceVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded implements State {
        private final AtomAction allServicesAction;

        @NotNull
        private final ButtonV3Atom.SmallBorderlessButton allServicesButton;

        @NotNull
        private final List<ServiceVO> services;

        @NotNull
        private final TextAtom title;

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b-\u0010\u0016R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded$ServiceVO;", "", "", "id", "width", "", "imageUrl", "imageBackgroundColor", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "description", "Lru/ozon/uni/atoms/af/AtomAction;", "addServiceAction", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "addServiceButton", "borderColor", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getWidth", "Ljava/lang/String;", "getImageUrl", "getImageBackgroundColor", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "Lru/ozon/uni/atoms/af/AtomAction;", "getAddServiceAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getAddServiceButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBorderColor", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ServiceVO {
            private final AtomAction addServiceAction;

            @NotNull
            private final ButtonV3Atom.SmallIconButton addServiceButton;

            @NotNull
            private final String borderColor;
            private final TextAtom description;
            private final int id;
            private final String imageBackgroundColor;

            @NotNull
            private final String imageUrl;

            @NotNull
            private final TextAtom price;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;
            private final int width;

            public ServiceVO(int i11, int i12, @NotNull String imageUrl, String str, @NotNull TextAtom price, TextAtom textAtom, AtomAction atomAction, @NotNull ButtonV3Atom.SmallIconButton addServiceButton, @NotNull String borderColor, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(addServiceButton, "addServiceButton");
                Intrinsics.checkNotNullParameter(borderColor, "borderColor");
                this.id = i11;
                this.width = i12;
                this.imageUrl = imageUrl;
                this.imageBackgroundColor = str;
                this.price = price;
                this.description = textAtom;
                this.addServiceAction = atomAction;
                this.addServiceButton = addServiceButton;
                this.borderColor = borderColor;
                this.trackingInfo = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServiceVO)) {
                    return false;
                }
                ServiceVO serviceVO = (ServiceVO) other;
                return this.id == serviceVO.id && this.width == serviceVO.width && Intrinsics.d(this.imageUrl, serviceVO.imageUrl) && Intrinsics.d(this.imageBackgroundColor, serviceVO.imageBackgroundColor) && Intrinsics.d(this.price, serviceVO.price) && Intrinsics.d(this.description, serviceVO.description) && Intrinsics.d(this.addServiceAction, serviceVO.addServiceAction) && Intrinsics.d(this.addServiceButton, serviceVO.addServiceButton) && Intrinsics.d(this.borderColor, serviceVO.borderColor) && Intrinsics.d(this.trackingInfo, serviceVO.trackingInfo);
            }

            public final AtomAction getAddServiceAction() {
                return this.addServiceAction;
            }

            @NotNull
            public final ButtonV3Atom.SmallIconButton getAddServiceButton() {
                return this.addServiceButton;
            }

            @NotNull
            public final String getBorderColor() {
                return this.borderColor;
            }

            public final TextAtom getDescription() {
                return this.description;
            }

            public final int getId() {
                return this.id;
            }

            public final String getImageBackgroundColor() {
                return this.imageBackgroundColor;
            }

            @NotNull
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            public final TextAtom getPrice() {
                return this.price;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int a11 = g.a(C2454a.a(this.width, Integer.hashCode(this.id) * 31, 31), 31, this.imageUrl);
                String str = this.imageBackgroundColor;
                int b11 = C2619v.b((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.price);
                TextAtom textAtom = this.description;
                int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                AtomAction atomAction = this.addServiceAction;
                int a12 = g.a(C3349u1.d(this.addServiceButton, (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31), 31, this.borderColor);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return a12 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                int i12 = this.width;
                String str = this.imageUrl;
                String str2 = this.imageBackgroundColor;
                TextAtom textAtom = this.price;
                TextAtom textAtom2 = this.description;
                AtomAction atomAction = this.addServiceAction;
                ButtonV3Atom.SmallIconButton smallIconButton = this.addServiceButton;
                String str3 = this.borderColor;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder a11 = C2438a.a("ServiceVO(id=", i11, ", width=", ", imageUrl=", i12);
                a.h(a11, str, ", imageBackgroundColor=", str2, ", price=");
                C4636t5.c(", description=", ", addServiceAction=", a11, textAtom, textAtom2);
                a11.append(atomAction);
                a11.append(", addServiceButton=");
                a11.append(smallIconButton);
                a11.append(", borderColor=");
                return C4070a.a(a11, str3, ", trackingInfo=", map, ")");
            }
        }

        public Loaded(@NotNull TextAtom title, @NotNull ButtonV3Atom.SmallBorderlessButton allServicesButton, AtomAction atomAction, @NotNull List<ServiceVO> services) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(allServicesButton, "allServicesButton");
            Intrinsics.checkNotNullParameter(services, "services");
            this.title = title;
            this.allServicesButton = allServicesButton;
            this.allServicesAction = atomAction;
            this.services = services;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.d(this.title, loaded.title) && Intrinsics.d(this.allServicesButton, loaded.allServicesButton) && Intrinsics.d(this.allServicesAction, loaded.allServicesAction) && Intrinsics.d(this.services, loaded.services);
        }

        public final AtomAction getAllServicesAction() {
            return this.allServicesAction;
        }

        @NotNull
        public final ButtonV3Atom.SmallBorderlessButton getAllServicesButton() {
            return this.allServicesButton;
        }

        @NotNull
        public final List<ServiceVO> getServices() {
            return this.services;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.allServicesButton.hashCode() + (this.title.hashCode() * 31)) * 31;
            AtomAction atomAction = this.allServicesAction;
            return this.services.hashCode() + ((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Loaded(title=" + this.title + ", allServicesButton=" + this.allServicesButton + ", allServicesAction=" + this.allServicesAction + ", services=" + this.services + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loading;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "", "asyncData", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading implements State {

        @NotNull
        private final String asyncData;

        public Loading(@NotNull String asyncData) {
            Intrinsics.checkNotNullParameter(asyncData, "asyncData");
            this.asyncData = asyncData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.d(this.asyncData, ((Loading) other).asyncData);
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
            return A0.b("Loading(asyncData=", this.asyncData, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loading;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {
    }

    public BuyTogetherVO(long j11, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
    }

    public static /* synthetic */ BuyTogetherVO copy$default(BuyTogetherVO buyTogetherVO, long j11, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = buyTogetherVO.id;
        }
        if ((i11 & 2) != 0) {
            state = buyTogetherVO.state;
        }
        return buyTogetherVO.copy(j11, state);
    }

    @NotNull
    public final BuyTogetherVO copy(long id2, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new BuyTogetherVO(id2, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyTogetherVO)) {
            return false;
        }
        BuyTogetherVO buyTogetherVO = (BuyTogetherVO) other;
        return this.id == buyTogetherVO.id && Intrinsics.d(this.state, buyTogetherVO.state);
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
        return "BuyTogetherVO(id=" + this.id + ", state=" + this.state + ")";
    }
}
