package ru.ozon.app.android.pdp.widgets.galleryV5.data;

import B0.A0;
import B4.V;
import B90.C2619v;
import C.o0;
import G.g;
import I0.C3173b;
import I1.w;
import Ih.a;
import Kk.C3532b;
import Tz.C4055a;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 42\u00020\u0001:\u00044567Bi\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001bJ\u0006\u0010#\u001a\u00020\u000bJ\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J~\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;", "", "items", "", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;", "fullViewDeeplink", "", "galleryId", "buttons", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button;", "galleryRatio", "", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "zoom", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Zoom;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Zoom;)V", "getItems", "()Ljava/util/List;", "getFullViewDeeplink", "()Ljava/lang/String;", "getGalleryId", "getButtons", "getGalleryRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "getZoom", "()Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Zoom;", "getContainerRatioOrDefault", "getGalleryRatioOrDefault", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Zoom;)Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;", "equals", "", "other", "hashCode", "", "toString", "Companion", "GalleryItem", "Button", "Zoom", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV5DTO {
    public static final double DEFAULT_GALLERY_RATIO = 0.75d;
    public static final double SQUARE_GALLERY_RATIO = 1.0d;

    @NotNull
    private final String backgroundColor;
    private final List<Button> buttons;

    @NotNull
    private final String fullViewDeeplink;

    @NotNull
    private final String galleryId;
    private final Double galleryRatio;

    @NotNull
    private final List<GalleryItem> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Zoom zoom;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00011Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003Jx\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001a¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onboarding", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "notHidableOnboarding", "", "templateLink", "placeholderValue", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOnboarding", "()Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getNotHidableOnboarding", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTemplateLink", "getPlaceholderValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button;", "equals", "other", "hashCode", "", "toString", "OnBoarding", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Button {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final Icon icon;
        private final Boolean notHidableOnboarding;
        private final OnBoarding onboarding;
        private final String placeholderValue;
        private final String templateLink;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "daysToShowAgain", "", "onboardingId", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDaysToShowAgain", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnboardingId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button$OnBoarding;", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnBoarding {
            public static final int $stable = TextAtom.$stable;
            private final Integer daysToShowAgain;

            @NotNull
            private final String onboardingId;

            @NotNull
            private final TextAtom text;

            public OnBoarding(@NotNull TextAtom text, Integer num, @NotNull String onboardingId) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(onboardingId, "onboardingId");
                this.text = text;
                this.daysToShowAgain = num;
                this.onboardingId = onboardingId;
            }

            public static /* synthetic */ OnBoarding copy$default(OnBoarding onBoarding, TextAtom textAtom, Integer num, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = onBoarding.text;
                }
                if ((i11 & 2) != 0) {
                    num = onBoarding.daysToShowAgain;
                }
                if ((i11 & 4) != 0) {
                    str = onBoarding.onboardingId;
                }
                return onBoarding.copy(textAtom, num, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getDaysToShowAgain() {
                return this.daysToShowAgain;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getOnboardingId() {
                return this.onboardingId;
            }

            @NotNull
            public final OnBoarding copy(@NotNull TextAtom text, Integer daysToShowAgain, @NotNull String onboardingId) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(onboardingId, "onboardingId");
                return new OnBoarding(text, daysToShowAgain, onboardingId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnBoarding)) {
                    return false;
                }
                OnBoarding onBoarding = (OnBoarding) other;
                return Intrinsics.d(this.text, onBoarding.text) && Intrinsics.d(this.daysToShowAgain, onBoarding.daysToShowAgain) && Intrinsics.d(this.onboardingId, onBoarding.onboardingId);
            }

            public final Integer getDaysToShowAgain() {
                return this.daysToShowAgain;
            }

            @NotNull
            public final String getOnboardingId() {
                return this.onboardingId;
            }

            @NotNull
            public final TextAtom getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                Integer num = this.daysToShowAgain;
                return this.onboardingId.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.text;
                Integer num = this.daysToShowAgain;
                String str = this.onboardingId;
                StringBuilder sb2 = new StringBuilder("OnBoarding(text=");
                sb2.append(textAtom);
                sb2.append(", daysToShowAgain=");
                sb2.append(num);
                sb2.append(", onboardingId=");
                return o0.c(sb2, str, ")");
            }
        }

        public Button(Icon icon, @NotNull AtomActionDTO action, OnBoarding onBoarding, String str, Map<String, TokenizedTrackingInfo> map, Boolean bool, String str2, String str3) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.action = action;
            this.onboarding = onBoarding;
            this.backgroundColor = str;
            this.trackingInfo = map;
            this.notHidableOnboarding = bool;
            this.templateLink = str2;
            this.placeholderValue = str3;
        }

        public static /* synthetic */ Button copy$default(Button button, Icon icon, AtomActionDTO atomActionDTO, OnBoarding onBoarding, String str, Map map, Boolean bool, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = button.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = button.action;
            }
            if ((i11 & 4) != 0) {
                onBoarding = button.onboarding;
            }
            if ((i11 & 8) != 0) {
                str = button.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                map = button.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                bool = button.notHidableOnboarding;
            }
            if ((i11 & 64) != 0) {
                str2 = button.templateLink;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str3 = button.placeholderValue;
            }
            String str4 = str2;
            String str5 = str3;
            Map map2 = map;
            Boolean bool2 = bool;
            return button.copy(icon, atomActionDTO, onBoarding, str, map2, bool2, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final OnBoarding getOnboarding() {
            return this.onboarding;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getNotHidableOnboarding() {
            return this.notHidableOnboarding;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTemplateLink() {
            return this.templateLink;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPlaceholderValue() {
            return this.placeholderValue;
        }

        @NotNull
        public final Button copy(Icon icon, @NotNull AtomActionDTO action, OnBoarding onboarding, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean notHidableOnboarding, String templateLink, String placeholderValue) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(icon, action, onboarding, backgroundColor, trackingInfo, notHidableOnboarding, templateLink, placeholderValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.icon, button.icon) && Intrinsics.d(this.action, button.action) && Intrinsics.d(this.onboarding, button.onboarding) && Intrinsics.d(this.backgroundColor, button.backgroundColor) && Intrinsics.d(this.trackingInfo, button.trackingInfo) && Intrinsics.d(this.notHidableOnboarding, button.notHidableOnboarding) && Intrinsics.d(this.templateLink, button.templateLink) && Intrinsics.d(this.placeholderValue, button.placeholderValue);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final Boolean getNotHidableOnboarding() {
            return this.notHidableOnboarding;
        }

        public final OnBoarding getOnboarding() {
            return this.onboarding;
        }

        public final String getPlaceholderValue() {
            return this.placeholderValue;
        }

        public final String getTemplateLink() {
            return this.templateLink;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Icon icon = this.icon;
            int b11 = a.b(this.action, (icon == null ? 0 : icon.hashCode()) * 31, 31);
            OnBoarding onBoarding = this.onboarding;
            int hashCode = (b11 + (onBoarding == null ? 0 : onBoarding.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Boolean bool = this.notHidableOnboarding;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.templateLink;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placeholderValue;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Icon icon = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            OnBoarding onBoarding = this.onboarding;
            String str = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Boolean bool = this.notHidableOnboarding;
            String str2 = this.templateLink;
            String str3 = this.placeholderValue;
            StringBuilder sb2 = new StringBuilder("Button(icon=");
            sb2.append(icon);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", onboarding=");
            sb2.append(onBoarding);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", notHidableOnboarding=");
            sb2.append(bool);
            sb2.append(", templateLink=");
            return C3173b.c(sb2, str2, ", placeholderValue=", str3, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Zoom;", "", "onboardingTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getOnboardingTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Zoom {
        public static final int $stable = 0;
        private final TextDTO onboardingTitle;

        public Zoom(TextDTO textDTO) {
            this.onboardingTitle = textDTO;
        }

        public static /* synthetic */ Zoom copy$default(Zoom zoom, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = zoom.onboardingTitle;
            }
            return zoom.copy(textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getOnboardingTitle() {
            return this.onboardingTitle;
        }

        @NotNull
        public final Zoom copy(TextDTO onboardingTitle) {
            return new Zoom(onboardingTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Zoom) && Intrinsics.d(this.onboardingTitle, ((Zoom) other).onboardingTitle);
        }

        public final TextDTO getOnboardingTitle() {
            return this.onboardingTitle;
        }

        public int hashCode() {
            TextDTO textDTO = this.onboardingTitle;
            if (textDTO == null) {
                return 0;
            }
            return textDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return "Zoom(onboardingTitle=" + this.onboardingTitle + ")";
        }
    }

    public GalleryV5DTO(@NotNull List<GalleryItem> items, @NotNull String fullViewDeeplink, @NotNull String galleryId, List<Button> list, Double d11, @NotNull String backgroundColor, Map<String, TokenizedTrackingInfo> map, Zoom zoom) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(fullViewDeeplink, "fullViewDeeplink");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.items = items;
        this.fullViewDeeplink = fullViewDeeplink;
        this.galleryId = galleryId;
        this.buttons = list;
        this.galleryRatio = d11;
        this.backgroundColor = backgroundColor;
        this.trackingInfo = map;
        this.zoom = zoom;
    }

    public static /* synthetic */ GalleryV5DTO copy$default(GalleryV5DTO galleryV5DTO, List list, String str, String str2, List list2, Double d11, String str3, Map map, Zoom zoom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = galleryV5DTO.items;
        }
        if ((i11 & 2) != 0) {
            str = galleryV5DTO.fullViewDeeplink;
        }
        if ((i11 & 4) != 0) {
            str2 = galleryV5DTO.galleryId;
        }
        if ((i11 & 8) != 0) {
            list2 = galleryV5DTO.buttons;
        }
        if ((i11 & 16) != 0) {
            d11 = galleryV5DTO.galleryRatio;
        }
        if ((i11 & 32) != 0) {
            str3 = galleryV5DTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            map = galleryV5DTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            zoom = galleryV5DTO.zoom;
        }
        Map map2 = map;
        Zoom zoom2 = zoom;
        Double d12 = d11;
        String str4 = str3;
        return galleryV5DTO.copy(list, str, str2, list2, d12, str4, map2, zoom2);
    }

    @NotNull
    public final List<GalleryItem> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFullViewDeeplink() {
        return this.fullViewDeeplink;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getGalleryId() {
        return this.galleryId;
    }

    public final List<Button> component4() {
        return this.buttons;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getGalleryRatio() {
        return this.galleryRatio;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final Zoom getZoom() {
        return this.zoom;
    }

    @NotNull
    public final GalleryV5DTO copy(@NotNull List<GalleryItem> items, @NotNull String fullViewDeeplink, @NotNull String galleryId, List<Button> buttons, Double galleryRatio, @NotNull String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, Zoom zoom) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(fullViewDeeplink, "fullViewDeeplink");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new GalleryV5DTO(items, fullViewDeeplink, galleryId, buttons, galleryRatio, backgroundColor, trackingInfo, zoom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV5DTO)) {
            return false;
        }
        GalleryV5DTO galleryV5DTO = (GalleryV5DTO) other;
        return Intrinsics.d(this.items, galleryV5DTO.items) && Intrinsics.d(this.fullViewDeeplink, galleryV5DTO.fullViewDeeplink) && Intrinsics.d(this.galleryId, galleryV5DTO.galleryId) && Intrinsics.d(this.buttons, galleryV5DTO.buttons) && Intrinsics.d(this.galleryRatio, galleryV5DTO.galleryRatio) && Intrinsics.d(this.backgroundColor, galleryV5DTO.backgroundColor) && Intrinsics.d(this.trackingInfo, galleryV5DTO.trackingInfo) && Intrinsics.d(this.zoom, galleryV5DTO.zoom);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final Double getContainerRatioOrDefault() {
        GalleryItem galleryItem = (GalleryItem) C7714v.M(this.items);
        if (galleryItem != null) {
            return galleryItem.getContainerRatio();
        }
        return null;
    }

    @NotNull
    public final String getFullViewDeeplink() {
        return this.fullViewDeeplink;
    }

    @NotNull
    public final String getGalleryId() {
        return this.galleryId;
    }

    public final Double getGalleryRatio() {
        return this.galleryRatio;
    }

    public final double getGalleryRatioOrDefault() {
        Double d11 = this.galleryRatio;
        if (d11 != null) {
            return d11.doubleValue();
        }
        return 0.75d;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Zoom getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.items.hashCode() * 31, 31, this.fullViewDeeplink), 31, this.galleryId);
        List<Button> list = this.buttons;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        Double d11 = this.galleryRatio;
        int a12 = g.a((hashCode + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.backgroundColor);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        Zoom zoom = this.zoom;
        return hashCode2 + (zoom != null ? zoom.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<GalleryItem> list = this.items;
        String str = this.fullViewDeeplink;
        String str2 = this.galleryId;
        List<Button> list2 = this.buttons;
        Double d11 = this.galleryRatio;
        String str3 = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Zoom zoom = this.zoom;
        StringBuilder a11 = C4055a.a("GalleryV5DTO(items=", ", fullViewDeeplink=", str, ", galleryId=", list);
        w.d(str2, ", buttons=", ", galleryRatio=", a11, list2);
        a11.append(d11);
        a11.append(", backgroundColor=");
        a11.append(str3);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(", zoom=");
        a11.append(zoom);
        a11.append(")");
        return a11.toString();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003Jj\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;", "", "content", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;", "containerRatio", "", "hasWaves", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "zoomTrackingInfo", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;Ljava/lang/Double;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)V", "getContent", "()Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;", "getContainerRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHasWaves", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getZoomTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;Ljava/lang/Double;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;", "equals", "other", "hashCode", "", "toString", "ContentWrapper", "VideoTrackingInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class GalleryItem {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final Double containerRatio;

        @NotNull
        private final ContentWrapper content;
        private final boolean hasWaves;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final Map<String, TokenizedTrackingInfo> zoomTrackingInfo;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;", "", "<init>", "()V", "Image", "Video", "Ugc", "Info", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Info;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Video;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class ContentWrapper {
            public static final int $stable = 0;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Image extends ContentWrapper {
                public static final int $stable = 0;

                @NotNull
                private final String url;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Image(@NotNull String url) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.url = url;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = image.url;
                    }
                    return image.copy(str);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @NotNull
                public final Image copy(@NotNull String url) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Image(url);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Image) && Intrinsics.d(this.url, ((Image) other).url);
                }

                @NotNull
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.url.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("Image(url=", this.url, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Video;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;", "video", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "previewUrl", "", "isAutoPlay", "", "videoTrackingInfo", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$VideoTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$VideoTrackingInfo;)V", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getPreviewUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVideoTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$VideoTrackingInfo;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$VideoTrackingInfo;)Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Video;", "equals", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Video extends ContentWrapper {
                public static final int $stable = 8;
                private final Boolean isAutoPlay;

                @NotNull
                private final String previewUrl;

                @NotNull
                private final VideoMolecule video;
                private final VideoTrackingInfo videoTrackingInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Video(@NotNull VideoMolecule video, @NotNull String previewUrl, Boolean bool, VideoTrackingInfo videoTrackingInfo) {
                    super(null);
                    Intrinsics.checkNotNullParameter(video, "video");
                    Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                    this.video = video;
                    this.previewUrl = previewUrl;
                    this.isAutoPlay = bool;
                    this.videoTrackingInfo = videoTrackingInfo;
                }

                public static /* synthetic */ Video copy$default(Video video, VideoMolecule videoMolecule, String str, Boolean bool, VideoTrackingInfo videoTrackingInfo, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        videoMolecule = video.video;
                    }
                    if ((i11 & 2) != 0) {
                        str = video.previewUrl;
                    }
                    if ((i11 & 4) != 0) {
                        bool = video.isAutoPlay;
                    }
                    if ((i11 & 8) != 0) {
                        videoTrackingInfo = video.videoTrackingInfo;
                    }
                    return video.copy(videoMolecule, str, bool, videoTrackingInfo);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final VideoMolecule getVideo() {
                    return this.video;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getPreviewUrl() {
                    return this.previewUrl;
                }

                /* renamed from: component3, reason: from getter */
                public final Boolean getIsAutoPlay() {
                    return this.isAutoPlay;
                }

                /* renamed from: component4, reason: from getter */
                public final VideoTrackingInfo getVideoTrackingInfo() {
                    return this.videoTrackingInfo;
                }

                @NotNull
                public final Video copy(@NotNull VideoMolecule video, @NotNull String previewUrl, Boolean isAutoPlay, VideoTrackingInfo videoTrackingInfo) {
                    Intrinsics.checkNotNullParameter(video, "video");
                    Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                    return new Video(video, previewUrl, isAutoPlay, videoTrackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Video)) {
                        return false;
                    }
                    Video video = (Video) other;
                    return Intrinsics.d(this.video, video.video) && Intrinsics.d(this.previewUrl, video.previewUrl) && Intrinsics.d(this.isAutoPlay, video.isAutoPlay) && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo);
                }

                @NotNull
                public final String getPreviewUrl() {
                    return this.previewUrl;
                }

                @NotNull
                public final VideoMolecule getVideo() {
                    return this.video;
                }

                public final VideoTrackingInfo getVideoTrackingInfo() {
                    return this.videoTrackingInfo;
                }

                public int hashCode() {
                    int a11 = g.a(this.video.hashCode() * 31, 31, this.previewUrl);
                    Boolean bool = this.isAutoPlay;
                    int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
                    VideoTrackingInfo videoTrackingInfo = this.videoTrackingInfo;
                    return hashCode + (videoTrackingInfo != null ? videoTrackingInfo.hashCode() : 0);
                }

                public final Boolean isAutoPlay() {
                    return this.isAutoPlay;
                }

                @NotNull
                public String toString() {
                    return "Video(video=" + this.video + ", previewUrl=" + this.previewUrl + ", isAutoPlay=" + this.isAutoPlay + ", videoTrackingInfo=" + this.videoTrackingInfo + ")";
                }
            }

            public /* synthetic */ ContentWrapper(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Info;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Info extends ContentWrapper {
                public static final int $stable = Icon.$stable | TextAtom.$stable;

                @NotNull
                private final String backgroundColor;
                private final Icon icon;

                @NotNull
                private final TextAtom title;

                public /* synthetic */ Info(TextAtom textAtom, Icon icon, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(textAtom, icon, (i11 & 4) != 0 ? UniColors.LAYER_FLOOR_0.getToken() : str);
                }

                public static /* synthetic */ Info copy$default(Info info, TextAtom textAtom, Icon icon, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textAtom = info.title;
                    }
                    if ((i11 & 2) != 0) {
                        icon = info.icon;
                    }
                    if ((i11 & 4) != 0) {
                        str = info.backgroundColor;
                    }
                    return info.copy(textAtom, icon, str);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextAtom getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final Icon getIcon() {
                    return this.icon;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @NotNull
                public final Info copy(@NotNull TextAtom title, Icon icon, @NotNull String backgroundColor) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    return new Info(title, icon, backgroundColor);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Info)) {
                        return false;
                    }
                    Info info = (Info) other;
                    return Intrinsics.d(this.title, info.title) && Intrinsics.d(this.icon, info.icon) && Intrinsics.d(this.backgroundColor, info.backgroundColor);
                }

                @NotNull
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final Icon getIcon() {
                    return this.icon;
                }

                @NotNull
                public final TextAtom getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    Icon icon = this.icon;
                    return this.backgroundColor.hashCode() + ((hashCode + (icon == null ? 0 : icon.hashCode())) * 31);
                }

                @NotNull
                public String toString() {
                    TextAtom textAtom = this.title;
                    Icon icon = this.icon;
                    String str = this.backgroundColor;
                    StringBuilder sb2 = new StringBuilder("Info(title=");
                    sb2.append(textAtom);
                    sb2.append(", icon=");
                    sb2.append(icon);
                    sb2.append(", backgroundColor=");
                    return o0.c(sb2, str, ")");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Info(@NotNull TextAtom title, Icon icon, @NotNull String backgroundColor) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    this.title = title;
                    this.icon = icon;
                    this.backgroundColor = backgroundColor;
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$ContentWrapper;", "previewUrl", "", "previewIcon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleIcon", "subtitle", "backgroundColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getPreviewUrl", "()Ljava/lang/String;", "getPreviewIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleIcon", "getSubtitle", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Ugc extends ContentWrapper {
                public static final int $stable;

                @NotNull
                private final String backgroundColor;
                private final Icon previewIcon;

                @NotNull
                private final String previewUrl;

                @NotNull
                private final TextAtom subtitle;

                @NotNull
                private final TextAtom title;

                @NotNull
                private final Icon titleIcon;

                static {
                    int i11 = TextAtom.$stable;
                    int i12 = Icon.$stable;
                    $stable = i11 | i11 | i12 | i12;
                }

                public /* synthetic */ Ugc(String str, Icon icon, TextAtom textAtom, Icon icon2, TextAtom textAtom2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, icon, textAtom, icon2, textAtom2, (i11 & 32) != 0 ? UniColors.LAYER_FLOOR_0.getToken() : str2);
                }

                public static /* synthetic */ Ugc copy$default(Ugc ugc, String str, Icon icon, TextAtom textAtom, Icon icon2, TextAtom textAtom2, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = ugc.previewUrl;
                    }
                    if ((i11 & 2) != 0) {
                        icon = ugc.previewIcon;
                    }
                    if ((i11 & 4) != 0) {
                        textAtom = ugc.title;
                    }
                    if ((i11 & 8) != 0) {
                        icon2 = ugc.titleIcon;
                    }
                    if ((i11 & 16) != 0) {
                        textAtom2 = ugc.subtitle;
                    }
                    if ((i11 & 32) != 0) {
                        str2 = ugc.backgroundColor;
                    }
                    TextAtom textAtom3 = textAtom2;
                    String str3 = str2;
                    return ugc.copy(str, icon, textAtom, icon2, textAtom3, str3);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getPreviewUrl() {
                    return this.previewUrl;
                }

                /* renamed from: component2, reason: from getter */
                public final Icon getPreviewIcon() {
                    return this.previewIcon;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final TextAtom getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final Icon getTitleIcon() {
                    return this.titleIcon;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final TextAtom getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                /* renamed from: component6, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @NotNull
                public final Ugc copy(@NotNull String previewUrl, Icon previewIcon, @NotNull TextAtom title, @NotNull Icon titleIcon, @NotNull TextAtom subtitle, @NotNull String backgroundColor) {
                    Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    return new Ugc(previewUrl, previewIcon, title, titleIcon, subtitle, backgroundColor);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Ugc)) {
                        return false;
                    }
                    Ugc ugc = (Ugc) other;
                    return Intrinsics.d(this.previewUrl, ugc.previewUrl) && Intrinsics.d(this.previewIcon, ugc.previewIcon) && Intrinsics.d(this.title, ugc.title) && Intrinsics.d(this.titleIcon, ugc.titleIcon) && Intrinsics.d(this.subtitle, ugc.subtitle) && Intrinsics.d(this.backgroundColor, ugc.backgroundColor);
                }

                @NotNull
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final Icon getPreviewIcon() {
                    return this.previewIcon;
                }

                @NotNull
                public final String getPreviewUrl() {
                    return this.previewUrl;
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
                public final Icon getTitleIcon() {
                    return this.titleIcon;
                }

                public int hashCode() {
                    int hashCode = this.previewUrl.hashCode() * 31;
                    Icon icon = this.previewIcon;
                    return this.backgroundColor.hashCode() + C2619v.b(Lc.a.a(this.titleIcon, C2619v.b((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.title), 31), 31, this.subtitle);
                }

                @NotNull
                public String toString() {
                    return "Ugc(previewUrl=" + this.previewUrl + ", previewIcon=" + this.previewIcon + ", title=" + this.title + ", titleIcon=" + this.titleIcon + ", subtitle=" + this.subtitle + ", backgroundColor=" + this.backgroundColor + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ugc(@NotNull String previewUrl, Icon icon, @NotNull TextAtom title, @NotNull Icon titleIcon, @NotNull TextAtom subtitle, @NotNull String backgroundColor) {
                    super(null);
                    Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    this.previewUrl = previewUrl;
                    this.previewIcon = icon;
                    this.title = title;
                    this.titleIcon = titleIcon;
                    this.subtitle = subtitle;
                    this.backgroundColor = backgroundColor;
                }
            }

            private ContentWrapper() {
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem$VideoTrackingInfo;", "", "startVideo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "endVideo", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getStartVideo", "()Ljava/util/Map;", "getEndVideo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VideoTrackingInfo {
            public static final int $stable = 8;
            private final Map<String, TokenizedTrackingInfo> endVideo;
            private final Map<String, TokenizedTrackingInfo> startVideo;

            public VideoTrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
                this.startVideo = map;
                this.endVideo = map2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VideoTrackingInfo copy$default(VideoTrackingInfo videoTrackingInfo, Map map, Map map2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    map = videoTrackingInfo.startVideo;
                }
                if ((i11 & 2) != 0) {
                    map2 = videoTrackingInfo.endVideo;
                }
                return videoTrackingInfo.copy(map, map2);
            }

            public final Map<String, TokenizedTrackingInfo> component1() {
                return this.startVideo;
            }

            public final Map<String, TokenizedTrackingInfo> component2() {
                return this.endVideo;
            }

            @NotNull
            public final VideoTrackingInfo copy(Map<String, TokenizedTrackingInfo> startVideo, Map<String, TokenizedTrackingInfo> endVideo) {
                return new VideoTrackingInfo(startVideo, endVideo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoTrackingInfo)) {
                    return false;
                }
                VideoTrackingInfo videoTrackingInfo = (VideoTrackingInfo) other;
                return Intrinsics.d(this.startVideo, videoTrackingInfo.startVideo) && Intrinsics.d(this.endVideo, videoTrackingInfo.endVideo);
            }

            public final Map<String, TokenizedTrackingInfo> getEndVideo() {
                return this.endVideo;
            }

            public final Map<String, TokenizedTrackingInfo> getStartVideo() {
                return this.startVideo;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.startVideo;
                int hashCode = (map == null ? 0 : map.hashCode()) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.endVideo;
                return hashCode + (map2 != null ? map2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "VideoTrackingInfo(startVideo=" + this.startVideo + ", endVideo=" + this.endVideo + ")";
            }
        }

        public GalleryItem(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ContentWrapper.Image.class), @ProtoOneOfSignature(name = "video", type = ContentWrapper.Video.class), @ProtoOneOfSignature(name = "ugc", type = ContentWrapper.Ugc.class), @ProtoOneOfSignature(name = "info", type = ContentWrapper.Info.class)}) @NotNull @ProtoOneOf(label = "type") ContentWrapper content, Double d11, boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.containerRatio = d11;
            this.hasWaves = z11;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.zoomTrackingInfo = map2;
        }

        public static /* synthetic */ GalleryItem copy$default(GalleryItem galleryItem, ContentWrapper contentWrapper, Double d11, boolean z11, AtomActionDTO atomActionDTO, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                contentWrapper = galleryItem.content;
            }
            if ((i11 & 2) != 0) {
                d11 = galleryItem.containerRatio;
            }
            if ((i11 & 4) != 0) {
                z11 = galleryItem.hasWaves;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = galleryItem.action;
            }
            if ((i11 & 16) != 0) {
                map = galleryItem.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                map2 = galleryItem.zoomTrackingInfo;
            }
            Map map3 = map;
            Map map4 = map2;
            return galleryItem.copy(contentWrapper, d11, z11, atomActionDTO, map3, map4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ContentWrapper getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final Double getContainerRatio() {
            return this.containerRatio;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasWaves() {
            return this.hasWaves;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.zoomTrackingInfo;
        }

        @NotNull
        public final GalleryItem copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ContentWrapper.Image.class), @ProtoOneOfSignature(name = "video", type = ContentWrapper.Video.class), @ProtoOneOfSignature(name = "ugc", type = ContentWrapper.Ugc.class), @ProtoOneOfSignature(name = "info", type = ContentWrapper.Info.class)}) @NotNull @ProtoOneOf(label = "type") ContentWrapper content, Double containerRatio, boolean hasWaves, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> zoomTrackingInfo) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new GalleryItem(content, containerRatio, hasWaves, action, trackingInfo, zoomTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryItem)) {
                return false;
            }
            GalleryItem galleryItem = (GalleryItem) other;
            return Intrinsics.d(this.content, galleryItem.content) && Intrinsics.d(this.containerRatio, galleryItem.containerRatio) && this.hasWaves == galleryItem.hasWaves && Intrinsics.d(this.action, galleryItem.action) && Intrinsics.d(this.trackingInfo, galleryItem.trackingInfo) && Intrinsics.d(this.zoomTrackingInfo, galleryItem.zoomTrackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Double getContainerRatio() {
            return this.containerRatio;
        }

        @NotNull
        public final ContentWrapper getContent() {
            return this.content;
        }

        public final boolean getHasWaves() {
            return this.hasWaves;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getZoomTrackingInfo() {
            return this.zoomTrackingInfo;
        }

        public int hashCode() {
            int hashCode = this.content.hashCode() * 31;
            Double d11 = this.containerRatio;
            int a11 = C3532b.a((hashCode + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.hasWaves);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.zoomTrackingInfo;
            return hashCode3 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ContentWrapper contentWrapper = this.content;
            Double d11 = this.containerRatio;
            boolean z11 = this.hasWaves;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.zoomTrackingInfo;
            StringBuilder sb2 = new StringBuilder("GalleryItem(content=");
            sb2.append(contentWrapper);
            sb2.append(", containerRatio=");
            sb2.append(d11);
            sb2.append(", hasWaves=");
            sb2.append(z11);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return V.c(sb2, map, ", zoomTrackingInfo=", map2, ")");
        }

        public /* synthetic */ GalleryItem(ContentWrapper contentWrapper, Double d11, boolean z11, AtomActionDTO atomActionDTO, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(contentWrapper, d11, (i11 & 4) != 0 ? false : z11, atomActionDTO, map, map2);
        }
    }

    public /* synthetic */ GalleryV5DTO(List list, String str, String str2, List list2, Double d11, String str3, Map map, Zoom zoom, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, list2, d11, (i11 & 32) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str3, map, zoom);
    }
}
