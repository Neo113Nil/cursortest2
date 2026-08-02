package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import Ql.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;", "", "image", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO$Image;", "subtitle", "", "notifyButton", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO$Image;Ljava/lang/String;Lru/ozon/app/android/atoms/data/button/SwitchingButton;Ljava/util/Map;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getImage", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO$Image;", "getSubtitle", "()Ljava/lang/String;", "getNotifyButton", "()Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "getTrackingInfo", "()Ljava/util/Map;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Image", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HammersV3HeaderDTO {
    public static final int $stable = 8;
    private final Image image;
    private final ButtonV3Atom.SmallIconButton infoButton;
    private final SwitchingButton notifyButton;
    private final String subtitle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO$Image;", "", "link", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getLink", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String link;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Image(@NotNull String link, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Image copy$default(Image image, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.link;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = image.action;
            }
            if ((i11 & 4) != 0) {
                map = image.trackingInfo;
            }
            return image.copy(str, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final Image copy(@NotNull String link, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new Image(link, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.link, image.link) && Intrinsics.d(this.action, image.action) && Intrinsics.d(this.trackingInfo, image.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.link.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            AtomActionDTO atomActionDTO = this.action;
            return P.f(c.c("Image(link=", str, ", action=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    public HammersV3HeaderDTO(Image image, String str, SwitchingButton switchingButton, Map<String, TokenizedTrackingInfo> map, ButtonV3Atom.SmallIconButton smallIconButton) {
        this.image = image;
        this.subtitle = str;
        this.notifyButton = switchingButton;
        this.trackingInfo = map;
        this.infoButton = smallIconButton;
    }

    public static /* synthetic */ HammersV3HeaderDTO copy$default(HammersV3HeaderDTO hammersV3HeaderDTO, Image image, String str, SwitchingButton switchingButton, Map map, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            image = hammersV3HeaderDTO.image;
        }
        if ((i11 & 2) != 0) {
            str = hammersV3HeaderDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            switchingButton = hammersV3HeaderDTO.notifyButton;
        }
        if ((i11 & 8) != 0) {
            map = hammersV3HeaderDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            smallIconButton = hammersV3HeaderDTO.infoButton;
        }
        ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
        SwitchingButton switchingButton2 = switchingButton;
        return hammersV3HeaderDTO.copy(image, str, switchingButton2, map, smallIconButton2);
    }

    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final SwitchingButton getNotifyButton() {
        return this.notifyButton;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final HammersV3HeaderDTO copy(Image image, String subtitle, SwitchingButton notifyButton, Map<String, TokenizedTrackingInfo> trackingInfo, ButtonV3Atom.SmallIconButton infoButton) {
        return new HammersV3HeaderDTO(image, subtitle, notifyButton, trackingInfo, infoButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammersV3HeaderDTO)) {
            return false;
        }
        HammersV3HeaderDTO hammersV3HeaderDTO = (HammersV3HeaderDTO) other;
        return Intrinsics.d(this.image, hammersV3HeaderDTO.image) && Intrinsics.d(this.subtitle, hammersV3HeaderDTO.subtitle) && Intrinsics.d(this.notifyButton, hammersV3HeaderDTO.notifyButton) && Intrinsics.d(this.trackingInfo, hammersV3HeaderDTO.trackingInfo) && Intrinsics.d(this.infoButton, hammersV3HeaderDTO.infoButton);
    }

    public final Image getImage() {
        return this.image;
    }

    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    public final SwitchingButton getNotifyButton() {
        return this.notifyButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SwitchingButton switchingButton = this.notifyButton;
        int hashCode3 = (hashCode2 + (switchingButton == null ? 0 : switchingButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        return hashCode4 + (smallIconButton != null ? smallIconButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HammersV3HeaderDTO(image=" + this.image + ", subtitle=" + this.subtitle + ", notifyButton=" + this.notifyButton + ", trackingInfo=" + this.trackingInfo + ", infoButton=" + this.infoButton + ")";
    }
}
