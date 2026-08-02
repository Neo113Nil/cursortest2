package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.data;

import Bl.b;
import Fj.c;
import G.g;
import N3.C3660k;
import Pk0.a;
import T7.P;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004GHIJB±\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012 \u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J#\u00109\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u0010HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003JÐ\u0001\u0010@\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\"\b\u0002\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\r\u0010%R+\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0013\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0016\u0010%R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010\u001a\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u00100\"\u0004\b1\u00102¨\u0006K"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "", "images", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ImageDTO;", "badges", "Lru/ozon/uni/atoms/data/badge/Badge;", "photo360", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Photo360;", "buttons", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "ratio", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Ratio;", "isBorderless", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isClassified", "classifiedInfo", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;", "isParandjaEnabled", "imageAlpha", "", "backgroundColor", "isEmptyGallery", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Photo360;Ljava/util/List;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Ratio;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;Z)V", "getImages", "()Ljava/util/List;", "getBadges", "getPhoto360", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Photo360;", "getButtons", "getRatio", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Ratio;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "getClassifiedInfo", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;", "getImageAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBackgroundColor", "()Ljava/lang/String;", "()Z", "setEmptyGallery", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Photo360;Ljava/util/List;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Ratio;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;Z)Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "equals", "other", "hashCode", "", "toString", "Photo360", "ImageDTO", "Ratio", "ClassifiedInfo", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV2DTO {
    private final String backgroundColor;
    private final List<Badge> badges;
    private final List<ButtonV3Atom.LargeIconButton> buttons;
    private final ClassifiedInfo classifiedInfo;
    private final Float imageAlpha;

    @NotNull
    private final List<ImageDTO> images;
    private final Boolean isBorderless;
    private final Boolean isClassified;
    private transient boolean isEmptyGallery;
    private final Boolean isParandjaEnabled;
    private final Photo360 photo360;
    private final Ratio ratio;
    private final Map<String, Map<String, TokenizedTrackingInfo>> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;", "", "classifiedText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "backgroundAlpha", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/Float;)V", "getClassifiedText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClassifiedInfo {
        private final Float backgroundAlpha;
        private final String backgroundColor;
        private final TextAtom classifiedText;

        public ClassifiedInfo(TextAtom textAtom, String str, Float f7) {
            this.classifiedText = textAtom;
            this.backgroundColor = str;
            this.backgroundAlpha = f7;
        }

        public static /* synthetic */ ClassifiedInfo copy$default(ClassifiedInfo classifiedInfo, TextAtom textAtom, String str, Float f7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = classifiedInfo.classifiedText;
            }
            if ((i11 & 2) != 0) {
                str = classifiedInfo.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                f7 = classifiedInfo.backgroundAlpha;
            }
            return classifiedInfo.copy(textAtom, str, f7);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getClassifiedText() {
            return this.classifiedText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Float getBackgroundAlpha() {
            return this.backgroundAlpha;
        }

        @NotNull
        public final ClassifiedInfo copy(TextAtom classifiedText, String backgroundColor, Float backgroundAlpha) {
            return new ClassifiedInfo(classifiedText, backgroundColor, backgroundAlpha);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClassifiedInfo)) {
                return false;
            }
            ClassifiedInfo classifiedInfo = (ClassifiedInfo) other;
            return Intrinsics.d(this.classifiedText, classifiedInfo.classifiedText) && Intrinsics.d(this.backgroundColor, classifiedInfo.backgroundColor) && Intrinsics.d(this.backgroundAlpha, classifiedInfo.backgroundAlpha);
        }

        public final Float getBackgroundAlpha() {
            return this.backgroundAlpha;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextAtom getClassifiedText() {
            return this.classifiedText;
        }

        public int hashCode() {
            TextAtom textAtom = this.classifiedText;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Float f7 = this.backgroundAlpha;
            return hashCode2 + (f7 != null ? f7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.classifiedText;
            String str = this.backgroundColor;
            Float f7 = this.backgroundAlpha;
            StringBuilder d11 = b.d("ClassifiedInfo(classifiedText=", ", backgroundColor=", str, ", backgroundAlpha=", textAtom);
            d11.append(f7);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ImageDTO;", "", ImagesContract.URL, "", "message", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "getMessage", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageDTO {
        private final String message;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String url;

        public ImageDTO(@NotNull String url, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.message = str;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageDTO.url;
            }
            if ((i11 & 2) != 0) {
                str2 = imageDTO.message;
            }
            if ((i11 & 4) != 0) {
                map = imageDTO.trackingInfo;
            }
            return imageDTO.copy(str, str2, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final ImageDTO copy(@NotNull String url, String message, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new ImageDTO(url, message, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageDTO)) {
                return false;
            }
            ImageDTO imageDTO = (ImageDTO) other;
            return Intrinsics.d(this.url, imageDTO.url) && Intrinsics.d(this.message, imageDTO.message) && Intrinsics.d(this.trackingInfo, imageDTO.trackingInfo);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            String str2 = this.message;
            return P.f(C3660k.d("ImageDTO(url=", str, ", message=", str2, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Photo360;", "", "coverImage", "", "description", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getCoverImage", "()Ljava/lang/String;", "getDescription", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo360 {

        @NotNull
        private final ButtonV3Atom.SmallButton button;

        @NotNull
        private final String coverImage;

        @NotNull
        private final String description;

        public Photo360(@NotNull String coverImage, @NotNull String description, @NotNull ButtonV3Atom.SmallButton button) {
            Intrinsics.checkNotNullParameter(coverImage, "coverImage");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(button, "button");
            this.coverImage = coverImage;
            this.description = description;
            this.button = button;
        }

        public static /* synthetic */ Photo360 copy$default(Photo360 photo360, String str, String str2, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = photo360.coverImage;
            }
            if ((i11 & 2) != 0) {
                str2 = photo360.description;
            }
            if ((i11 & 4) != 0) {
                smallButton = photo360.button;
            }
            return photo360.copy(str, str2, smallButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCoverImage() {
            return this.coverImage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @NotNull
        public final Photo360 copy(@NotNull String coverImage, @NotNull String description, @NotNull ButtonV3Atom.SmallButton button) {
            Intrinsics.checkNotNullParameter(coverImage, "coverImage");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(button, "button");
            return new Photo360(coverImage, description, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo360)) {
                return false;
            }
            Photo360 photo360 = (Photo360) other;
            return Intrinsics.d(this.coverImage, photo360.coverImage) && Intrinsics.d(this.description, photo360.description) && Intrinsics.d(this.button, photo360.button);
        }

        @NotNull
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @NotNull
        public final String getCoverImage() {
            return this.coverImage;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return this.button.hashCode() + g.a(this.coverImage.hashCode() * 31, 31, this.description);
        }

        @NotNull
        public String toString() {
            String str = this.coverImage;
            String str2 = this.description;
            ButtonV3Atom.SmallButton smallButton = this.button;
            StringBuilder d11 = C3660k.d("Photo360(coverImage=", str, ", description=", str2, ", button=");
            d11.append(smallButton);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Ratio;", "", "width", "", "height", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeight", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Ratio;", "equals", "", "other", "hashCode", "", "toString", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ratio {
        private final Float height;
        private final Float width;

        public Ratio(Float f7, Float f11) {
            this.width = f7;
            this.height = f11;
        }

        public static /* synthetic */ Ratio copy$default(Ratio ratio, Float f7, Float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f7 = ratio.width;
            }
            if ((i11 & 2) != 0) {
                f11 = ratio.height;
            }
            return ratio.copy(f7, f11);
        }

        /* renamed from: component1, reason: from getter */
        public final Float getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getHeight() {
            return this.height;
        }

        @NotNull
        public final Ratio copy(Float width, Float height) {
            return new Ratio(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ratio)) {
                return false;
            }
            Ratio ratio = (Ratio) other;
            return Intrinsics.d(this.width, ratio.width) && Intrinsics.d(this.height, ratio.height);
        }

        public final Float getHeight() {
            return this.height;
        }

        public final Float getWidth() {
            return this.width;
        }

        public int hashCode() {
            Float f7 = this.width;
            int hashCode = (f7 == null ? 0 : f7.hashCode()) * 31;
            Float f11 = this.height;
            return hashCode + (f11 != null ? f11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Ratio(width=" + this.width + ", height=" + this.height + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV2DTO(@NotNull List<ImageDTO> images, List<Badge> list, Photo360 photo360, List<ButtonV3Atom.LargeIconButton> list2, Ratio ratio, Boolean bool, Map<String, ? extends Map<String, TokenizedTrackingInfo>> map, Boolean bool2, ClassifiedInfo classifiedInfo, Boolean bool3, Float f7, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.images = images;
        this.badges = list;
        this.photo360 = photo360;
        this.buttons = list2;
        this.ratio = ratio;
        this.isBorderless = bool;
        this.trackingInfo = map;
        this.isClassified = bool2;
        this.classifiedInfo = classifiedInfo;
        this.isParandjaEnabled = bool3;
        this.imageAlpha = f7;
        this.backgroundColor = str;
        this.isEmptyGallery = z11;
    }

    public static /* synthetic */ GalleryV2DTO copy$default(GalleryV2DTO galleryV2DTO, List list, List list2, Photo360 photo360, List list3, Ratio ratio, Boolean bool, Map map, Boolean bool2, ClassifiedInfo classifiedInfo, Boolean bool3, Float f7, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = galleryV2DTO.images;
        }
        return galleryV2DTO.copy(list, (i11 & 2) != 0 ? galleryV2DTO.badges : list2, (i11 & 4) != 0 ? galleryV2DTO.photo360 : photo360, (i11 & 8) != 0 ? galleryV2DTO.buttons : list3, (i11 & 16) != 0 ? galleryV2DTO.ratio : ratio, (i11 & 32) != 0 ? galleryV2DTO.isBorderless : bool, (i11 & 64) != 0 ? galleryV2DTO.trackingInfo : map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryV2DTO.isClassified : bool2, (i11 & 256) != 0 ? galleryV2DTO.classifiedInfo : classifiedInfo, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? galleryV2DTO.isParandjaEnabled : bool3, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? galleryV2DTO.imageAlpha : f7, (i11 & 2048) != 0 ? galleryV2DTO.backgroundColor : str, (i11 & 4096) != 0 ? galleryV2DTO.isEmptyGallery : z11);
    }

    @NotNull
    public final List<ImageDTO> component1() {
        return this.images;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsParandjaEnabled() {
        return this.isParandjaEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final Float getImageAlpha() {
        return this.imageAlpha;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsEmptyGallery() {
        return this.isEmptyGallery;
    }

    public final List<Badge> component2() {
        return this.badges;
    }

    /* renamed from: component3, reason: from getter */
    public final Photo360 getPhoto360() {
        return this.photo360;
    }

    public final List<ButtonV3Atom.LargeIconButton> component4() {
        return this.buttons;
    }

    /* renamed from: component5, reason: from getter */
    public final Ratio getRatio() {
        return this.ratio;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsBorderless() {
        return this.isBorderless;
    }

    public final Map<String, Map<String, TokenizedTrackingInfo>> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsClassified() {
        return this.isClassified;
    }

    /* renamed from: component9, reason: from getter */
    public final ClassifiedInfo getClassifiedInfo() {
        return this.classifiedInfo;
    }

    @NotNull
    public final GalleryV2DTO copy(@NotNull List<ImageDTO> images, List<Badge> badges, Photo360 photo360, List<ButtonV3Atom.LargeIconButton> buttons, Ratio ratio, Boolean isBorderless, Map<String, ? extends Map<String, TokenizedTrackingInfo>> trackingInfo, Boolean isClassified, ClassifiedInfo classifiedInfo, Boolean isParandjaEnabled, Float imageAlpha, String backgroundColor, boolean isEmptyGallery) {
        Intrinsics.checkNotNullParameter(images, "images");
        return new GalleryV2DTO(images, badges, photo360, buttons, ratio, isBorderless, trackingInfo, isClassified, classifiedInfo, isParandjaEnabled, imageAlpha, backgroundColor, isEmptyGallery);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV2DTO)) {
            return false;
        }
        GalleryV2DTO galleryV2DTO = (GalleryV2DTO) other;
        return Intrinsics.d(this.images, galleryV2DTO.images) && Intrinsics.d(this.badges, galleryV2DTO.badges) && Intrinsics.d(this.photo360, galleryV2DTO.photo360) && Intrinsics.d(this.buttons, galleryV2DTO.buttons) && Intrinsics.d(this.ratio, galleryV2DTO.ratio) && Intrinsics.d(this.isBorderless, galleryV2DTO.isBorderless) && Intrinsics.d(this.trackingInfo, galleryV2DTO.trackingInfo) && Intrinsics.d(this.isClassified, galleryV2DTO.isClassified) && Intrinsics.d(this.classifiedInfo, galleryV2DTO.classifiedInfo) && Intrinsics.d(this.isParandjaEnabled, galleryV2DTO.isParandjaEnabled) && Intrinsics.d(this.imageAlpha, galleryV2DTO.imageAlpha) && Intrinsics.d(this.backgroundColor, galleryV2DTO.backgroundColor) && this.isEmptyGallery == galleryV2DTO.isEmptyGallery;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final List<ButtonV3Atom.LargeIconButton> getButtons() {
        return this.buttons;
    }

    public final ClassifiedInfo getClassifiedInfo() {
        return this.classifiedInfo;
    }

    public final Float getImageAlpha() {
        return this.imageAlpha;
    }

    @NotNull
    public final List<ImageDTO> getImages() {
        return this.images;
    }

    public final Photo360 getPhoto360() {
        return this.photo360;
    }

    public final Ratio getRatio() {
        return this.ratio;
    }

    public final Map<String, Map<String, TokenizedTrackingInfo>> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.images.hashCode() * 31;
        List<Badge> list = this.badges;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Photo360 photo360 = this.photo360;
        int hashCode3 = (hashCode2 + (photo360 == null ? 0 : photo360.hashCode())) * 31;
        List<ButtonV3Atom.LargeIconButton> list2 = this.buttons;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Ratio ratio = this.ratio;
        int hashCode5 = (hashCode4 + (ratio == null ? 0 : ratio.hashCode())) * 31;
        Boolean bool = this.isBorderless;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Map<String, TokenizedTrackingInfo>> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool2 = this.isClassified;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ClassifiedInfo classifiedInfo = this.classifiedInfo;
        int hashCode9 = (hashCode8 + (classifiedInfo == null ? 0 : classifiedInfo.hashCode())) * 31;
        Boolean bool3 = this.isParandjaEnabled;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f7 = this.imageAlpha;
        int hashCode11 = (hashCode10 + (f7 == null ? 0 : f7.hashCode())) * 31;
        String str = this.backgroundColor;
        return Boolean.hashCode(this.isEmptyGallery) + ((hashCode11 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final Boolean isBorderless() {
        return this.isBorderless;
    }

    public final Boolean isClassified() {
        return this.isClassified;
    }

    public final boolean isEmptyGallery() {
        return this.isEmptyGallery;
    }

    public final Boolean isParandjaEnabled() {
        return this.isParandjaEnabled;
    }

    public final void setEmptyGallery(boolean z11) {
        this.isEmptyGallery = z11;
    }

    @NotNull
    public String toString() {
        List<ImageDTO> list = this.images;
        List<Badge> list2 = this.badges;
        Photo360 photo360 = this.photo360;
        List<ButtonV3Atom.LargeIconButton> list3 = this.buttons;
        Ratio ratio = this.ratio;
        Boolean bool = this.isBorderless;
        Map<String, Map<String, TokenizedTrackingInfo>> map = this.trackingInfo;
        Boolean bool2 = this.isClassified;
        ClassifiedInfo classifiedInfo = this.classifiedInfo;
        Boolean bool3 = this.isParandjaEnabled;
        Float f7 = this.imageAlpha;
        String str = this.backgroundColor;
        boolean z11 = this.isEmptyGallery;
        StringBuilder d11 = c.d("GalleryV2DTO(images=", list, ", badges=", ", photo360=", list2);
        d11.append(photo360);
        d11.append(", buttons=");
        d11.append(list3);
        d11.append(", ratio=");
        d11.append(ratio);
        d11.append(", isBorderless=");
        d11.append(bool);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(", isClassified=");
        d11.append(bool2);
        d11.append(", classifiedInfo=");
        d11.append(classifiedInfo);
        d11.append(", isParandjaEnabled=");
        d11.append(bool3);
        d11.append(", imageAlpha=");
        d11.append(f7);
        d11.append(", backgroundColor=");
        d11.append(str);
        d11.append(", isEmptyGallery=");
        return a.a(")", d11, z11);
    }

    public /* synthetic */ GalleryV2DTO(List list, List list2, Photo360 photo360, List list3, Ratio ratio, Boolean bool, Map map, Boolean bool2, ClassifiedInfo classifiedInfo, Boolean bool3, Float f7, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, photo360, list3, ratio, bool, map, bool2, classifiedInfo, bool3, f7, str, (i11 & 4096) != 0 ? false : z11);
    }
}
