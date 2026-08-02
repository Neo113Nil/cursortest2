package ru.ozon.app.android.storefront.widgets.feedback.result.data;

import B90.C2619v;
import H00.a;
import Tl.b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0005()*+,BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JS\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO;", "", "navbar", "Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$NavBar;", "body", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "toHomeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$NavBar;Ljava/lang/Object;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getNavbar", "()Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$NavBar;", "getBody", "()Ljava/lang/Object;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getToHomeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "NavBar", "ImageBody", "ServiceBody", "Service", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ResultDTO {

    @Deprecated
    @NotNull
    public static final String CONTENT_TYPE_IMAGE_BODY = "imageBody";

    @Deprecated
    @NotNull
    public static final String CONTENT_TYPE_SERVICES = "services";

    @NotNull
    private final Object body;

    @NotNull
    private final NavBar navbar;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final ButtonV3Atom.LargeButton toHomeButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$Companion;", "", "<init>", "()V", "CONTENT_TYPE_IMAGE_BODY", "", "CONTENT_TYPE_SERVICES", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$ImageBody;", "", "imageUrl", "", "<init>", "(Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageBody {
        public static final int $stable = 0;

        @NotNull
        private final String imageUrl;

        public ImageBody(@NotNull String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$NavBar;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "closeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCloseButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBar {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable | TextAtom.$stable;

        @NotNull
        private final ButtonV3Atom.SmallIconButton closeButton;

        @NotNull
        private final TextAtom title;

        public NavBar(@NotNull TextAtom title, @NotNull ButtonV3Atom.SmallIconButton closeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(closeButton, "closeButton");
            this.title = title;
            this.closeButton = closeButton;
        }

        public static /* synthetic */ NavBar copy$default(NavBar navBar, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = navBar.title;
            }
            if ((i11 & 2) != 0) {
                smallIconButton = navBar.closeButton;
            }
            return navBar.copy(textAtom, smallIconButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final NavBar copy(@NotNull TextAtom title, @NotNull ButtonV3Atom.SmallIconButton closeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(closeButton, "closeButton");
            return new NavBar(title, closeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBar)) {
                return false;
            }
            NavBar navBar = (NavBar) other;
            return Intrinsics.d(this.title, navBar.title) && Intrinsics.d(this.closeButton, navBar.closeButton);
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.closeButton.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "NavBar(title=" + this.title + ", closeButton=" + this.closeButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$Service;", "", "imageUrl", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getImageUrl", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Service {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String imageUrl;

        public Service(@NotNull String imageUrl, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(action, "action");
            this.imageUrl = imageUrl;
            this.action = action;
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$ServiceBody;", "", ResultDTO.CONTENT_TYPE_SERVICES, "", "Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO$Service;", "<init>", "(Ljava/util/List;)V", "getServices", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ServiceBody {
        public static final int $stable = 8;

        @NotNull
        private final List<Service> services;

        public ServiceBody(@NotNull List<Service> services) {
            Intrinsics.checkNotNullParameter(services, "services");
            this.services = services;
        }

        @NotNull
        public final List<Service> getServices() {
            return this.services;
        }
    }

    public ResultDTO(@NotNull NavBar navbar, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "imageBody", type = ImageBody.class), @ProtoOneOfSignature(name = "services", type = ServiceBody.class)}) @NotNull @ProtoOneOf(label = "type") Object body, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.LargeButton toHomeButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(toHomeButton, "toHomeButton");
        this.navbar = navbar;
        this.body = body;
        this.title = title;
        this.subtitle = subtitle;
        this.toHomeButton = toHomeButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ResultDTO copy$default(ResultDTO resultDTO, NavBar navBar, Object obj, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            navBar = resultDTO.navbar;
        }
        if ((i11 & 2) != 0) {
            obj = resultDTO.body;
        }
        if ((i11 & 4) != 0) {
            textAtom = resultDTO.title;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = resultDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            largeButton = resultDTO.toHomeButton;
        }
        if ((i11 & 32) != 0) {
            map = resultDTO.trackingInfo;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        Map map2 = map;
        return resultDTO.copy(navBar, obj, textAtom, textAtom2, largeButton2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavBar getNavbar() {
        return this.navbar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getToHomeButton() {
        return this.toHomeButton;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ResultDTO copy(@NotNull NavBar navbar, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "imageBody", type = ImageBody.class), @ProtoOneOfSignature(name = "services", type = ServiceBody.class)}) @NotNull @ProtoOneOf(label = "type") Object body, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.LargeButton toHomeButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(toHomeButton, "toHomeButton");
        return new ResultDTO(navbar, body, title, subtitle, toHomeButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultDTO)) {
            return false;
        }
        ResultDTO resultDTO = (ResultDTO) other;
        return Intrinsics.d(this.navbar, resultDTO.navbar) && Intrinsics.d(this.body, resultDTO.body) && Intrinsics.d(this.title, resultDTO.title) && Intrinsics.d(this.subtitle, resultDTO.subtitle) && Intrinsics.d(this.toHomeButton, resultDTO.toHomeButton) && Intrinsics.d(this.trackingInfo, resultDTO.trackingInfo);
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final NavBar getNavbar() {
        return this.navbar;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getToHomeButton() {
        return this.toHomeButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.toHomeButton, C2619v.b(C2619v.b(a.c(this.navbar.hashCode() * 31, 31, this.body), 31, this.title), 31, this.subtitle), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        NavBar navBar = this.navbar;
        Object obj = this.body;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.LargeButton largeButton = this.toHomeButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ResultDTO(navbar=");
        sb2.append(navBar);
        sb2.append(", body=");
        sb2.append(obj);
        sb2.append(", title=");
        C4636t5.c(", subtitle=", ", toHomeButton=", sb2, textAtom, textAtom2);
        sb2.append(largeButton);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
