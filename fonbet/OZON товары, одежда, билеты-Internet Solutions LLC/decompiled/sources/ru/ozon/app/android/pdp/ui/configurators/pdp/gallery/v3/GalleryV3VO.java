package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import Tl.b;
import Ve.C4636t5;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.video.TokenizedVideoEvents;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000523456BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "items", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Buttons;", "buttons", "", "ratio", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;", "classifiedDetails", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Analytics;", "analytics", "<init>", "(JLjava/util/List;Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Buttons;Ljava/lang/Float;Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Analytics;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getBadges", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Buttons;", "getButtons", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Buttons;", "Ljava/lang/Float;", "getRatio", "()Ljava/lang/Float;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;", "getClassifiedDetails", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Analytics;", "getAnalytics", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Analytics;", "Buttons", "VideoButtons", "Item", "ClassifiedDetails", "Analytics", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV3VO implements c {

    @NotNull
    private final Analytics analytics;

    @NotNull
    private final List<BadgeDTO> badges;
    private final Buttons buttons;
    private final ClassifiedDetails classifiedDetails;
    private final long id;

    @NotNull
    private final List<Item> items;
    private final Float ratio;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Analytics;", "", "LWZ/t;", "gallery", "popUp", "popupClose", "<init>", "(LWZ/t;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getGallery", "()LWZ/t;", "getPopUp", "getPopupClose", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Analytics {
        private final t gallery;
        private final t popUp;
        private final t popupClose;

        public Analytics(t tVar, t tVar2, t tVar3) {
            this.gallery = tVar;
            this.popUp = tVar2;
            this.popupClose = tVar3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) other;
            return Intrinsics.d(this.gallery, analytics.gallery) && Intrinsics.d(this.popUp, analytics.popUp) && Intrinsics.d(this.popupClose, analytics.popupClose);
        }

        public final t getGallery() {
            return this.gallery;
        }

        public final t getPopUp() {
            return this.popUp;
        }

        public final t getPopupClose() {
            return this.popupClose;
        }

        public int hashCode() {
            t tVar = this.gallery;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            t tVar2 = this.popUp;
            int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            t tVar3 = this.popupClose;
            return hashCode2 + (tVar3 != null ? tVar3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            t tVar = this.gallery;
            t tVar2 = this.popUp;
            t tVar3 = this.popupClose;
            StringBuilder sb2 = new StringBuilder("Analytics(gallery=");
            sb2.append(tVar);
            sb2.append(", popUp=");
            sb2.append(tVar2);
            sb2.append(", popupClose=");
            return b.d(sb2, tVar3, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Buttons;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$VideoButtons;", "videoButtons", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryButtonsVO;", "otherButtons", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$VideoButtons;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$VideoButtons;", "getVideoButtons", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$VideoButtons;", "Ljava/util/List;", "getOtherButtons", "()Ljava/util/List;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Buttons {
        private final List<GalleryButtonsVO> otherButtons;

        @NotNull
        private final VideoButtons videoButtons;

        /* JADX WARN: Multi-variable type inference failed */
        public Buttons(@NotNull VideoButtons videoButtons, List<? extends GalleryButtonsVO> list) {
            Intrinsics.checkNotNullParameter(videoButtons, "videoButtons");
            this.videoButtons = videoButtons;
            this.otherButtons = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Buttons)) {
                return false;
            }
            Buttons buttons = (Buttons) other;
            return Intrinsics.d(this.videoButtons, buttons.videoButtons) && Intrinsics.d(this.otherButtons, buttons.otherButtons);
        }

        public final List<GalleryButtonsVO> getOtherButtons() {
            return this.otherButtons;
        }

        @NotNull
        public final VideoButtons getVideoButtons() {
            return this.videoButtons;
        }

        public int hashCode() {
            int hashCode = this.videoButtons.hashCode() * 31;
            List<GalleryButtonsVO> list = this.otherButtons;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Buttons(videoButtons=" + this.videoButtons + ", otherButtons=" + this.otherButtons + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;", "", "", "isClassified", "Lru/ozon/uni/atoms/data/text/TextDTO;", "classifiedText", "", "backgroundColor", "", "backgroundAlpha", "<init>", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getClassifiedText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "F", "getBackgroundAlpha", "()F", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClassifiedDetails {
        private final float backgroundAlpha;
        private final String backgroundColor;
        private final TextDTO classifiedText;
        private final boolean isClassified;

        public ClassifiedDetails(boolean z11, TextDTO textDTO, String str, float f7) {
            this.isClassified = z11;
            this.classifiedText = textDTO;
            this.backgroundColor = str;
            this.backgroundAlpha = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClassifiedDetails)) {
                return false;
            }
            ClassifiedDetails classifiedDetails = (ClassifiedDetails) other;
            return this.isClassified == classifiedDetails.isClassified && Intrinsics.d(this.classifiedText, classifiedDetails.classifiedText) && Intrinsics.d(this.backgroundColor, classifiedDetails.backgroundColor) && Float.compare(this.backgroundAlpha, classifiedDetails.backgroundAlpha) == 0;
        }

        public final float getBackgroundAlpha() {
            return this.backgroundAlpha;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextDTO getClassifiedText() {
            return this.classifiedText;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isClassified) * 31;
            TextDTO textDTO = this.classifiedText;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            return Float.hashCode(this.backgroundAlpha) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        /* renamed from: isClassified, reason: from getter */
        public final boolean getIsClassified() {
            return this.isClassified;
        }

        @NotNull
        public String toString() {
            return "ClassifiedDetails(isClassified=" + this.isClassified + ", classifiedText=" + this.classifiedText + ", backgroundColor=" + this.backgroundColor + ", backgroundAlpha=" + this.backgroundAlpha + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "", "<init>", "()V", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "Photo", "Photo360", "OzonVideo", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$Photo;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$Photo360;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Item {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\f\u0010\u001e¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "video", "", "previewImageUrl", "", "isAutoPlay", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "galleryTokenizedVideoEvents", "LWZ/t;", "tokenizedEvent", "isApparel", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;ZLru/ozon/app/android/video/TokenizedVideoEvents;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Ljava/lang/String;", "getPreviewImageUrl", "Z", "()Z", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getGalleryTokenizedVideoEvents", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OzonVideo extends Item {
            private final TokenizedVideoEvents galleryTokenizedVideoEvents;
            private final boolean isApparel;
            private final boolean isAutoPlay;

            @NotNull
            private final String previewImageUrl;
            private final t tokenizedEvent;

            @NotNull
            private final VideoMolecule video;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OzonVideo(@NotNull VideoMolecule video, @NotNull String previewImageUrl, boolean z11, TokenizedVideoEvents tokenizedVideoEvents, t tVar, boolean z12) {
                super(null);
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
                this.video = video;
                this.previewImageUrl = previewImageUrl;
                this.isAutoPlay = z11;
                this.galleryTokenizedVideoEvents = tokenizedVideoEvents;
                this.tokenizedEvent = tVar;
                this.isApparel = z12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OzonVideo)) {
                    return false;
                }
                OzonVideo ozonVideo = (OzonVideo) other;
                return Intrinsics.d(this.video, ozonVideo.video) && Intrinsics.d(this.previewImageUrl, ozonVideo.previewImageUrl) && this.isAutoPlay == ozonVideo.isAutoPlay && Intrinsics.d(this.galleryTokenizedVideoEvents, ozonVideo.galleryTokenizedVideoEvents) && Intrinsics.d(this.tokenizedEvent, ozonVideo.tokenizedEvent) && this.isApparel == ozonVideo.isApparel;
            }

            public final TokenizedVideoEvents getGalleryTokenizedVideoEvents() {
                return this.galleryTokenizedVideoEvents;
            }

            @NotNull
            public final String getPreviewImageUrl() {
                return this.previewImageUrl;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO.Item
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            @NotNull
            public final VideoMolecule getVideo() {
                return this.video;
            }

            public int hashCode() {
                int a11 = C3532b.a(g.a(this.video.hashCode() * 31, 31, this.previewImageUrl), 31, this.isAutoPlay);
                TokenizedVideoEvents tokenizedVideoEvents = this.galleryTokenizedVideoEvents;
                int hashCode = (a11 + (tokenizedVideoEvents == null ? 0 : tokenizedVideoEvents.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return Boolean.hashCode(this.isApparel) + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
            }

            /* renamed from: isApparel, reason: from getter */
            public boolean getIsApparel() {
                return this.isApparel;
            }

            /* renamed from: isAutoPlay, reason: from getter */
            public final boolean getIsAutoPlay() {
                return this.isAutoPlay;
            }

            @NotNull
            public String toString() {
                return "OzonVideo(video=" + this.video + ", previewImageUrl=" + this.previewImageUrl + ", isAutoPlay=" + this.isAutoPlay + ", galleryTokenizedVideoEvents=" + this.galleryTokenizedVideoEvents + ", tokenizedEvent=" + this.tokenizedEvent + ", isApparel=" + this.isApparel + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u000b\u0010\u001a¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$Photo;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "", ImagesContract.URL, "", "isBorderless", "", "alpha", "hasParandja", "LWZ/t;", "tokenizedEvent", "isApparel", "<init>", "(Ljava/lang/String;ZFZLWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Z", "()Z", "F", "getAlpha", "()F", "getHasParandja", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Photo extends Item {
            private final float alpha;
            private final boolean hasParandja;
            private final boolean isApparel;
            private final boolean isBorderless;
            private final t tokenizedEvent;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Photo(@NotNull String url, boolean z11, float f7, boolean z12, t tVar, boolean z13) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.isBorderless = z11;
                this.alpha = f7;
                this.hasParandja = z12;
                this.tokenizedEvent = tVar;
                this.isApparel = z13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Photo)) {
                    return false;
                }
                Photo photo = (Photo) other;
                return Intrinsics.d(this.url, photo.url) && this.isBorderless == photo.isBorderless && Float.compare(this.alpha, photo.alpha) == 0 && this.hasParandja == photo.hasParandja && Intrinsics.d(this.tokenizedEvent, photo.tokenizedEvent) && this.isApparel == photo.isApparel;
            }

            public final float getAlpha() {
                return this.alpha;
            }

            public final boolean getHasParandja() {
                return this.hasParandja;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO.Item
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int a11 = C3532b.a(Pk0.b.a(this.alpha, C3532b.a(this.url.hashCode() * 31, 31, this.isBorderless), 31), 31, this.hasParandja);
                t tVar = this.tokenizedEvent;
                return Boolean.hashCode(this.isApparel) + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
            }

            /* renamed from: isApparel, reason: from getter */
            public boolean getIsApparel() {
                return this.isApparel;
            }

            /* renamed from: isBorderless, reason: from getter */
            public final boolean getIsBorderless() {
                return this.isBorderless;
            }

            @NotNull
            public String toString() {
                String str = this.url;
                boolean z11 = this.isBorderless;
                float f7 = this.alpha;
                boolean z12 = this.hasParandja;
                t tVar = this.tokenizedEvent;
                boolean z13 = this.isApparel;
                StringBuilder b11 = C4636t5.b("Photo(url=", str, ", isBorderless=", ", alpha=", z11);
                b11.append(f7);
                b11.append(", hasParandja=");
                b11.append(z12);
                b11.append(", tokenizedEvent=");
                b11.append(tVar);
                b11.append(", isApparel=");
                b11.append(z13);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$Photo360;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "", "coverImage", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "LWZ/t;", "tokenizedEvent", "", "isApparel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCoverImage", "getDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Photo360 extends Item {
            private final ButtonV3Atom.SmallButton button;

            @NotNull
            private final String coverImage;

            @NotNull
            private final String description;
            private final boolean isApparel;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Photo360(@NotNull String coverImage, @NotNull String description, ButtonV3Atom.SmallButton smallButton, t tVar, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(coverImage, "coverImage");
                Intrinsics.checkNotNullParameter(description, "description");
                this.coverImage = coverImage;
                this.description = description;
                this.button = smallButton;
                this.tokenizedEvent = tVar;
                this.isApparel = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Photo360)) {
                    return false;
                }
                Photo360 photo360 = (Photo360) other;
                return Intrinsics.d(this.coverImage, photo360.coverImage) && Intrinsics.d(this.description, photo360.description) && Intrinsics.d(this.button, photo360.button) && Intrinsics.d(this.tokenizedEvent, photo360.tokenizedEvent) && this.isApparel == photo360.isApparel;
            }

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

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO.Item
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(this.coverImage.hashCode() * 31, 31, this.description);
                ButtonV3Atom.SmallButton smallButton = this.button;
                int hashCode = (a11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return Boolean.hashCode(this.isApparel) + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
            }

            /* renamed from: isApparel, reason: from getter */
            public boolean getIsApparel() {
                return this.isApparel;
            }

            @NotNull
            public String toString() {
                String str = this.coverImage;
                String str2 = this.description;
                ButtonV3Atom.SmallButton smallButton = this.button;
                t tVar = this.tokenizedEvent;
                boolean z11 = this.isApparel;
                StringBuilder d11 = C3660k.d("Photo360(coverImage=", str, ", description=", str2, ", button=");
                d11.append(smallButton);
                d11.append(", tokenizedEvent=");
                d11.append(tVar);
                d11.append(", isApparel=");
                return a.a(")", d11, z11);
            }
        }

        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract t getTokenizedEvent();

        private Item() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$VideoButtons;", "", "", "soundButtonPosition", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryButtonsVO;", "buttons", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSoundButtonPosition", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoButtons {
        private final List<GalleryButtonsVO> buttons;
        private final int soundButtonPosition;

        /* JADX WARN: Multi-variable type inference failed */
        public VideoButtons(int i11, List<? extends GalleryButtonsVO> list) {
            this.soundButtonPosition = i11;
            this.buttons = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoButtons)) {
                return false;
            }
            VideoButtons videoButtons = (VideoButtons) other;
            return this.soundButtonPosition == videoButtons.soundButtonPosition && Intrinsics.d(this.buttons, videoButtons.buttons);
        }

        public final List<GalleryButtonsVO> getButtons() {
            return this.buttons;
        }

        public final int getSoundButtonPosition() {
            return this.soundButtonPosition;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.soundButtonPosition) * 31;
            List<GalleryButtonsVO> list = this.buttons;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "VideoButtons(soundButtonPosition=" + this.soundButtonPosition + ", buttons=" + this.buttons + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV3VO(long j11, @NotNull List<? extends Item> items, @NotNull List<BadgeDTO> badges, Buttons buttons, Float f7, ClassifiedDetails classifiedDetails, @NotNull Analytics analytics) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.id = j11;
        this.items = items;
        this.badges = badges;
        this.buttons = buttons;
        this.ratio = f7;
        this.classifiedDetails = classifiedDetails;
        this.analytics = analytics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV3VO)) {
            return false;
        }
        GalleryV3VO galleryV3VO = (GalleryV3VO) other;
        return this.id == galleryV3VO.id && Intrinsics.d(this.items, galleryV3VO.items) && Intrinsics.d(this.badges, galleryV3VO.badges) && Intrinsics.d(this.buttons, galleryV3VO.buttons) && Intrinsics.d(this.ratio, galleryV3VO.ratio) && Intrinsics.d(this.classifiedDetails, galleryV3VO.classifiedDetails) && Intrinsics.d(this.analytics, galleryV3VO.analytics);
    }

    @NotNull
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final Buttons getButtons() {
        return this.buttons;
    }

    public final ClassifiedDetails getClassifiedDetails() {
        return this.classifiedDetails;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public final Float getRatio() {
        return this.ratio;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.badges);
        Buttons buttons = this.buttons;
        int hashCode = (b11 + (buttons == null ? 0 : buttons.hashCode())) * 31;
        Float f7 = this.ratio;
        int hashCode2 = (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31;
        ClassifiedDetails classifiedDetails = this.classifiedDetails;
        return this.analytics.hashCode() + ((hashCode2 + (classifiedDetails != null ? classifiedDetails.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Item> list = this.items;
        List<BadgeDTO> list2 = this.badges;
        Buttons buttons = this.buttons;
        Float f7 = this.ratio;
        ClassifiedDetails classifiedDetails = this.classifiedDetails;
        Analytics analytics = this.analytics;
        StringBuilder b11 = Lh.b.b(j11, "GalleryV3VO(id=", ", items=", list);
        b11.append(", badges=");
        b11.append(list2);
        b11.append(", buttons=");
        b11.append(buttons);
        b11.append(", ratio=");
        b11.append(f7);
        b11.append(", classifiedDetails=");
        b11.append(classifiedDetails);
        b11.append(", analytics=");
        b11.append(analytics);
        b11.append(")");
        return b11.toString();
    }
}
