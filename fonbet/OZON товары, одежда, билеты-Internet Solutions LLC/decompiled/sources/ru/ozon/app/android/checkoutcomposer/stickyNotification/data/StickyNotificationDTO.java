package ru.ozon.app.android.checkoutcomposer.stickyNotification.data;

import HY.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyNotification/data/StickyNotificationDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "backgroundColor", "", "icon", "iconBackgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "getIconBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyNotificationDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final ButtonV3Atom.SmallButton button;
    private final String icon;
    private final String iconBackgroundColor;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public StickyNotificationDTO(@NotNull TextAtom title, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, String str, String str2, String str3, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textAtom;
        this.button = smallButton;
        this.backgroundColor = str;
        this.icon = str2;
        this.iconBackgroundColor = str3;
        this.trackingInfo = map;
    }

    public static /* synthetic */ StickyNotificationDTO copy$default(StickyNotificationDTO stickyNotificationDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallButton smallButton, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = stickyNotificationDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = stickyNotificationDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            smallButton = stickyNotificationDTO.button;
        }
        if ((i11 & 8) != 0) {
            str = stickyNotificationDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            str2 = stickyNotificationDTO.icon;
        }
        if ((i11 & 32) != 0) {
            str3 = stickyNotificationDTO.iconBackgroundColor;
        }
        if ((i11 & 64) != 0) {
            map = stickyNotificationDTO.trackingInfo;
        }
        String str4 = str3;
        Map map2 = map;
        String str5 = str2;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        return stickyNotificationDTO.copy(textAtom, textAtom2, smallButton2, str, str5, str4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final StickyNotificationDTO copy(@NotNull TextAtom title, TextAtom subtitle, ButtonV3Atom.SmallButton button, String backgroundColor, String icon, String iconBackgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new StickyNotificationDTO(title, subtitle, button, backgroundColor, icon, iconBackgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyNotificationDTO)) {
            return false;
        }
        StickyNotificationDTO stickyNotificationDTO = (StickyNotificationDTO) other;
        return Intrinsics.d(this.title, stickyNotificationDTO.title) && Intrinsics.d(this.subtitle, stickyNotificationDTO.subtitle) && Intrinsics.d(this.button, stickyNotificationDTO.button) && Intrinsics.d(this.backgroundColor, stickyNotificationDTO.backgroundColor) && Intrinsics.d(this.icon, stickyNotificationDTO.icon) && Intrinsics.d(this.iconBackgroundColor, stickyNotificationDTO.iconBackgroundColor) && Intrinsics.d(this.trackingInfo, stickyNotificationDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.subtitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode3 = (hashCode2 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconBackgroundColor;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallButton smallButton = this.button;
        String str = this.backgroundColor;
        String str2 = this.icon;
        String str3 = this.iconBackgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("StickyNotificationDTO(title=", textAtom, ", subtitle=", textAtom2, ", button=");
        a11.append(smallButton);
        a11.append(", backgroundColor=");
        a11.append(str);
        a11.append(", icon=");
        Nh.a.h(a11, str2, ", iconBackgroundColor=", str3, ", trackingInfo=");
        return P.f(a11, map, ")");
    }
}
