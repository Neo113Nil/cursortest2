package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation;

import B0.C2454a;
import B3.p;
import B90.C2618u;
import Kk.C3532b;
import Lh.a;
import N3.C3660k;
import Ns.b;
import Pk0.g;
import WZ.t;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000201BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012Jp\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b*\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b/\u0010-¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "items", "", "galleryId", "", "miniItemsRatio", "backgroundColor", "LWZ/t;", "event", "closeButtonEvent", "swipeDownCloseTrackingInfo", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;LWZ/t;LWZ/t;LWZ/t;)V", "copy", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;LWZ/t;LWZ/t;LWZ/t;)Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/String;", "getGalleryId", "Ljava/lang/Double;", "getMiniItemsRatio", "()Ljava/lang/Double;", "getBackgroundColor", "LWZ/t;", "getEvent", "()LWZ/t;", "getCloseButtonEvent", "getSwipeDownCloseTrackingInfo", "GalleryItemVO", "VideoTrackingInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryFullViewVO implements c {
    private final String backgroundColor;
    private final t closeButtonEvent;
    private final t event;

    @NotNull
    private final String galleryId;
    private final long id;

    @NotNull
    private final List<GalleryItemVO> items;
    private final Double miniItemsRatio;
    private final t swipeDownCloseTrackingInfo;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "", "<init>", "()V", "Image", "Ugc", "Video", "Photo360", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Image;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Photo360;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Video;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class GalleryItemVO {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Image;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "", ImagesContract.URL, "galleryId", "", "height", "", "containerRatio", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDLWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getGalleryId", "I", "getHeight", "D", "getContainerRatio", "()Ljava/lang/Double;", "LWZ/t;", "getEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends GalleryItemVO {
            private final double containerRatio;
            private final t event;

            @NotNull
            private final String galleryId;
            private final int height;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String url, @NotNull String galleryId, int i11, double d11, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(galleryId, "galleryId");
                this.url = url;
                this.galleryId = galleryId;
                this.height = i11;
                this.containerRatio = d11;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.galleryId, image.galleryId) && this.height == image.height && Double.compare(this.containerRatio, image.containerRatio) == 0 && Intrinsics.d(this.event, image.event);
            }

            @NotNull
            public Double getContainerRatio() {
                return Double.valueOf(this.containerRatio);
            }

            public t getEvent() {
                return this.event;
            }

            @NotNull
            public final String getGalleryId() {
                return this.galleryId;
            }

            public final int getHeight() {
                return this.height;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int a11 = g.a(C2454a.a(this.height, G.g.a(this.url.hashCode() * 31, 31, this.galleryId), 31), 31, this.containerRatio);
                t tVar = this.event;
                return a11 + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.url;
                String str2 = this.galleryId;
                int i11 = this.height;
                double d11 = this.containerRatio;
                t tVar = this.event;
                StringBuilder d12 = C3660k.d("Image(url=", str, ", galleryId=", str2, ", height=");
                d12.append(i11);
                d12.append(", containerRatio=");
                d12.append(d11);
                return a.b(d12, ", event=", tVar, ")");
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Photo360;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "", "previewUrl", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "backgroundColor", "Lru/ozon/uni/atoms/data/button/Icon;", "miniIcon", "", "containerRatio", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/Double;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPreviewUrl", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/button/Icon;", "getMiniIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/Double;", "getContainerRatio", "()Ljava/lang/Double;", "LWZ/t;", "getEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Photo360 extends GalleryItemVO {
            private final String backgroundColor;

            @NotNull
            private final ButtonV3Atom.SmallButton button;
            private final Double containerRatio;
            private final t event;
            private final Icon miniIcon;

            @NotNull
            private final String previewUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Photo360(@NotNull String previewUrl, @NotNull ButtonV3Atom.SmallButton button, String str, Icon icon, Double d11, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(button, "button");
                this.previewUrl = previewUrl;
                this.button = button;
                this.backgroundColor = str;
                this.miniIcon = icon;
                this.containerRatio = d11;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Photo360)) {
                    return false;
                }
                Photo360 photo360 = (Photo360) other;
                return Intrinsics.d(this.previewUrl, photo360.previewUrl) && Intrinsics.d(this.button, photo360.button) && Intrinsics.d(this.backgroundColor, photo360.backgroundColor) && Intrinsics.d(this.miniIcon, photo360.miniIcon) && Intrinsics.d(this.containerRatio, photo360.containerRatio) && Intrinsics.d(this.event, photo360.event);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final ButtonV3Atom.SmallButton getButton() {
                return this.button;
            }

            public final Icon getMiniIcon() {
                return this.miniIcon;
            }

            @NotNull
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            public int hashCode() {
                int c11 = C2618u.c(this.button, this.previewUrl.hashCode() * 31, 31);
                String str = this.backgroundColor;
                int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                Icon icon = this.miniIcon;
                int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                Double d11 = this.containerRatio;
                int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
                t tVar = this.event;
                return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Photo360(previewUrl=" + this.previewUrl + ", button=" + this.button + ", backgroundColor=" + this.backgroundColor + ", miniIcon=" + this.miniIcon + ", containerRatio=" + this.containerRatio + ", event=" + this.event + ")";
            }
        }

        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010(R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b\u0012\u00108R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b<\u0010\u001cR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b=\u0010+R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcVo;", "", "previewUrl", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "previewIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleIcon", "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "containerRatio", "LWZ/t;", "event", "", "isVerticalState", "Landroid/util/Size;", "size", "backgroundColor", "miniText", "Lru/ozon/uni/atoms/data/button/Icon;", "miniIcon", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Double;LWZ/t;ZLandroid/util/Size;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPreviewUrl", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "getPreviewIcon", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleIcon", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/Double;", "getContainerRatio", "()Ljava/lang/Double;", "LWZ/t;", "getEvent", "()LWZ/t;", "Z", "()Z", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "getBackgroundColor", "getMiniText", "Lru/ozon/uni/atoms/data/button/Icon;", "getMiniIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ugc extends GalleryItemVO implements GalleryV4UgcVo {
            private final AtomAction action;
            private final String backgroundColor;
            private final Double containerRatio;
            private final t event;
            private final boolean isVerticalState;
            private final Icon miniIcon;
            private final TextDTO miniText;
            private final GalleryV4VO.GalleryIcon previewIcon;

            @NotNull
            private final String previewUrl;

            @NotNull
            private final Size size;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            @NotNull
            private final GalleryV4VO.GalleryIcon titleIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ugc(@NotNull String previewUrl, GalleryV4VO.GalleryIcon galleryIcon, @NotNull TextDTO title, @NotNull GalleryV4VO.GalleryIcon titleIcon, @NotNull TextDTO subtitle, AtomAction atomAction, Double d11, t tVar, boolean z11, @NotNull Size size, String str, TextDTO textDTO, Icon icon) {
                super(null);
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(size, "size");
                this.previewUrl = previewUrl;
                this.previewIcon = galleryIcon;
                this.title = title;
                this.titleIcon = titleIcon;
                this.subtitle = subtitle;
                this.action = atomAction;
                this.containerRatio = d11;
                this.event = tVar;
                this.isVerticalState = z11;
                this.size = size;
                this.backgroundColor = str;
                this.miniText = textDTO;
                this.miniIcon = icon;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ugc)) {
                    return false;
                }
                Ugc ugc = (Ugc) other;
                return Intrinsics.d(this.previewUrl, ugc.previewUrl) && Intrinsics.d(this.previewIcon, ugc.previewIcon) && Intrinsics.d(this.title, ugc.title) && Intrinsics.d(this.titleIcon, ugc.titleIcon) && Intrinsics.d(this.subtitle, ugc.subtitle) && Intrinsics.d(this.action, ugc.action) && Intrinsics.d(this.containerRatio, ugc.containerRatio) && Intrinsics.d(this.event, ugc.event) && this.isVerticalState == ugc.isVerticalState && Intrinsics.d(this.size, ugc.size) && Intrinsics.d(this.backgroundColor, ugc.backgroundColor) && Intrinsics.d(this.miniText, ugc.miniText) && Intrinsics.d(this.miniIcon, ugc.miniIcon);
            }

            public AtomAction getAction() {
                return this.action;
            }

            public t getEvent() {
                return this.event;
            }

            public final Icon getMiniIcon() {
                return this.miniIcon;
            }

            public final TextDTO getMiniText() {
                return this.miniText;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            public GalleryV4VO.GalleryIcon getPreviewIcon() {
                return this.previewIcon;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public String getPreviewUrl() {
                return this.previewUrl;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public Size getSize() {
                return this.size;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public TextDTO getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            @NotNull
            public GalleryV4VO.GalleryIcon getTitleIcon() {
                return this.titleIcon;
            }

            public int hashCode() {
                int hashCode = this.previewUrl.hashCode() * 31;
                GalleryV4VO.GalleryIcon galleryIcon = this.previewIcon;
                int a11 = b.a(this.subtitle, (this.titleIcon.hashCode() + b.a(this.title, (hashCode + (galleryIcon == null ? 0 : galleryIcon.hashCode())) * 31, 31)) * 31, 31);
                AtomAction atomAction = this.action;
                int hashCode2 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                Double d11 = this.containerRatio;
                int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
                t tVar = this.event;
                int hashCode4 = (this.size.hashCode() + C3532b.a((hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isVerticalState)) * 31;
                String str = this.backgroundColor;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                TextDTO textDTO = this.miniText;
                int hashCode6 = (hashCode5 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                Icon icon = this.miniIcon;
                return hashCode6 + (icon != null ? icon.hashCode() : 0);
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVo
            /* renamed from: isVerticalState, reason: from getter */
            public boolean getIsVerticalState() {
                return this.isVerticalState;
            }

            @NotNull
            public String toString() {
                return "Ugc(previewUrl=" + this.previewUrl + ", previewIcon=" + this.previewIcon + ", title=" + this.title + ", titleIcon=" + this.titleIcon + ", subtitle=" + this.subtitle + ", action=" + this.action + ", containerRatio=" + this.containerRatio + ", event=" + this.event + ", isVerticalState=" + this.isVerticalState + ", size=" + this.size + ", backgroundColor=" + this.backgroundColor + ", miniText=" + this.miniText + ", miniIcon=" + this.miniIcon + ")";
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Video;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO;", "", "galleryId", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "video", "previewUrl", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;", "videoTrackingInfo", "", "containerRatio", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;Ljava/lang/Double;LWZ/t;)V", "copy", "(Ljava/lang/String;Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;Ljava/lang/Double;LWZ/t;)Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Video;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGalleryId", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getPreviewUrl", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;", "getVideoTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;", "Ljava/lang/Double;", "getContainerRatio", "()Ljava/lang/Double;", "LWZ/t;", "getEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video extends GalleryItemVO {
            private final Double containerRatio;
            private final t event;

            @NotNull
            private final String galleryId;

            @NotNull
            private final String previewUrl;

            @NotNull
            private final VideoMolecule video;
            private final VideoTrackingInfo videoTrackingInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Video(@NotNull String galleryId, @NotNull VideoMolecule video, @NotNull String previewUrl, VideoTrackingInfo videoTrackingInfo, Double d11, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(galleryId, "galleryId");
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                this.galleryId = galleryId;
                this.video = video;
                this.previewUrl = previewUrl;
                this.videoTrackingInfo = videoTrackingInfo;
                this.containerRatio = d11;
                this.event = tVar;
            }

            public static /* synthetic */ Video copy$default(Video video, String str, VideoMolecule videoMolecule, String str2, VideoTrackingInfo videoTrackingInfo, Double d11, t tVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = video.galleryId;
                }
                if ((i11 & 2) != 0) {
                    videoMolecule = video.video;
                }
                if ((i11 & 4) != 0) {
                    str2 = video.previewUrl;
                }
                if ((i11 & 8) != 0) {
                    videoTrackingInfo = video.videoTrackingInfo;
                }
                if ((i11 & 16) != 0) {
                    d11 = video.containerRatio;
                }
                if ((i11 & 32) != 0) {
                    tVar = video.event;
                }
                Double d12 = d11;
                t tVar2 = tVar;
                return video.copy(str, videoMolecule, str2, videoTrackingInfo, d12, tVar2);
            }

            @NotNull
            public final Video copy(@NotNull String galleryId, @NotNull VideoMolecule video, @NotNull String previewUrl, VideoTrackingInfo videoTrackingInfo, Double containerRatio, t event) {
                Intrinsics.checkNotNullParameter(galleryId, "galleryId");
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                return new Video(galleryId, video, previewUrl, videoTrackingInfo, containerRatio, event);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.d(this.galleryId, video.galleryId) && Intrinsics.d(this.video, video.video) && Intrinsics.d(this.previewUrl, video.previewUrl) && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo) && Intrinsics.d(this.containerRatio, video.containerRatio) && Intrinsics.d(this.event, video.event);
            }

            public t getEvent() {
                return this.event;
            }

            @NotNull
            public final String getGalleryId() {
                return this.galleryId;
            }

            @NotNull
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            @NotNull
            public final VideoMolecule getVideo() {
                return this.video;
            }

            public int hashCode() {
                int a11 = G.g.a((this.video.hashCode() + (this.galleryId.hashCode() * 31)) * 31, 31, this.previewUrl);
                VideoTrackingInfo videoTrackingInfo = this.videoTrackingInfo;
                int hashCode = (a11 + (videoTrackingInfo == null ? 0 : videoTrackingInfo.hashCode())) * 31;
                Double d11 = this.containerRatio;
                int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
                t tVar = this.event;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Video(galleryId=" + this.galleryId + ", video=" + this.video + ", previewUrl=" + this.previewUrl + ", videoTrackingInfo=" + this.videoTrackingInfo + ", containerRatio=" + this.containerRatio + ", event=" + this.event + ")";
            }
        }

        public /* synthetic */ GalleryItemVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private GalleryItemVO() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$VideoTrackingInfo;", "", "LWZ/t;", "startVideo", "endVideo", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getStartVideo", "()LWZ/t;", "getEndVideo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoTrackingInfo {
        private final t endVideo;
        private final t startVideo;

        public VideoTrackingInfo(t tVar, t tVar2) {
            this.startVideo = tVar;
            this.endVideo = tVar2;
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

        public int hashCode() {
            t tVar = this.startVideo;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            t tVar2 = this.endVideo;
            return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VideoTrackingInfo(startVideo=" + this.startVideo + ", endVideo=" + this.endVideo + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryFullViewVO(long j11, @NotNull List<? extends GalleryItemVO> items, @NotNull String galleryId, Double d11, String str, t tVar, t tVar2, t tVar3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        this.id = j11;
        this.items = items;
        this.galleryId = galleryId;
        this.miniItemsRatio = d11;
        this.backgroundColor = str;
        this.event = tVar;
        this.closeButtonEvent = tVar2;
        this.swipeDownCloseTrackingInfo = tVar3;
    }

    public static /* synthetic */ GalleryFullViewVO copy$default(GalleryFullViewVO galleryFullViewVO, long j11, List list, String str, Double d11, String str2, t tVar, t tVar2, t tVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = galleryFullViewVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = galleryFullViewVO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            str = galleryFullViewVO.galleryId;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            d11 = galleryFullViewVO.miniItemsRatio;
        }
        return galleryFullViewVO.copy(j12, list2, str3, d11, (i11 & 16) != 0 ? galleryFullViewVO.backgroundColor : str2, (i11 & 32) != 0 ? galleryFullViewVO.event : tVar, (i11 & 64) != 0 ? galleryFullViewVO.closeButtonEvent : tVar2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? galleryFullViewVO.swipeDownCloseTrackingInfo : tVar3);
    }

    @NotNull
    public final GalleryFullViewVO copy(long id2, @NotNull List<? extends GalleryItemVO> items, @NotNull String galleryId, Double miniItemsRatio, String backgroundColor, t event, t closeButtonEvent, t swipeDownCloseTrackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        return new GalleryFullViewVO(id2, items, galleryId, miniItemsRatio, backgroundColor, event, closeButtonEvent, swipeDownCloseTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryFullViewVO)) {
            return false;
        }
        GalleryFullViewVO galleryFullViewVO = (GalleryFullViewVO) other;
        return this.id == galleryFullViewVO.id && Intrinsics.d(this.items, galleryFullViewVO.items) && Intrinsics.d(this.galleryId, galleryFullViewVO.galleryId) && Intrinsics.d(this.miniItemsRatio, galleryFullViewVO.miniItemsRatio) && Intrinsics.d(this.backgroundColor, galleryFullViewVO.backgroundColor) && Intrinsics.d(this.event, galleryFullViewVO.event) && Intrinsics.d(this.closeButtonEvent, galleryFullViewVO.closeButtonEvent) && Intrinsics.d(this.swipeDownCloseTrackingInfo, galleryFullViewVO.swipeDownCloseTrackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final t getCloseButtonEvent() {
        return this.closeButtonEvent;
    }

    public final t getEvent() {
        return this.event;
    }

    @NotNull
    public final String getGalleryId() {
        return this.galleryId;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<GalleryItemVO> getItems() {
        return this.items;
    }

    public final Double getMiniItemsRatio() {
        return this.miniItemsRatio;
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
        int a11 = G.g.a(G.g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.galleryId);
        Double d11 = this.miniItemsRatio;
        int hashCode = (a11 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.event;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.closeButtonEvent;
        int hashCode4 = (hashCode3 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.swipeDownCloseTrackingInfo;
        return hashCode4 + (tVar3 != null ? tVar3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<GalleryItemVO> list = this.items;
        String str = this.galleryId;
        Double d11 = this.miniItemsRatio;
        String str2 = this.backgroundColor;
        t tVar = this.event;
        t tVar2 = this.closeButtonEvent;
        t tVar3 = this.swipeDownCloseTrackingInfo;
        StringBuilder b11 = Lh.b.b(j11, "GalleryFullViewVO(id=", ", items=", list);
        b11.append(", galleryId=");
        b11.append(str);
        b11.append(", miniItemsRatio=");
        b11.append(d11);
        Bi.a.f(b11, ", backgroundColor=", str2, ", event=", tVar);
        p.d(b11, ", closeButtonEvent=", tVar2, ", swipeDownCloseTrackingInfo=", tVar3);
        b11.append(")");
        return b11.toString();
    }
}
