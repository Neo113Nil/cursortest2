package ru.ozon.app.android.orderdetails.cheques.data;

import G.g;
import Nh.a;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/orderdetails/cheques/data/ChequesItemDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "price", "", "subtitle", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getPrice", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getTitle", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ChequesItemDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.SmallButton button;
    private final String deeplink;

    @NotNull
    private final String price;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ChequesItemDTO(@NotNull ButtonV3Atom.SmallButton button, @NotNull String price, @NotNull String subtitle, String str, @NotNull String title, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        this.button = button;
        this.price = price;
        this.subtitle = subtitle;
        this.deeplink = str;
        this.title = title;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ChequesItemDTO copy$default(ChequesItemDTO chequesItemDTO, ButtonV3Atom.SmallButton smallButton, String str, String str2, String str3, String str4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallButton = chequesItemDTO.button;
        }
        if ((i11 & 2) != 0) {
            str = chequesItemDTO.price;
        }
        if ((i11 & 4) != 0) {
            str2 = chequesItemDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            str3 = chequesItemDTO.deeplink;
        }
        if ((i11 & 16) != 0) {
            str4 = chequesItemDTO.title;
        }
        if ((i11 & 32) != 0) {
            map = chequesItemDTO.trackingInfo;
        }
        String str5 = str4;
        Map map2 = map;
        return chequesItemDTO.copy(smallButton, str, str2, str3, str5, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ChequesItemDTO copy(@NotNull ButtonV3Atom.SmallButton button, @NotNull String price, @NotNull String subtitle, String deeplink, @NotNull String title, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ChequesItemDTO(button, price, subtitle, deeplink, title, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChequesItemDTO)) {
            return false;
        }
        ChequesItemDTO chequesItemDTO = (ChequesItemDTO) other;
        return Intrinsics.d(this.button, chequesItemDTO.button) && Intrinsics.d(this.price, chequesItemDTO.price) && Intrinsics.d(this.subtitle, chequesItemDTO.subtitle) && Intrinsics.d(this.deeplink, chequesItemDTO.deeplink) && Intrinsics.d(this.title, chequesItemDTO.title) && Intrinsics.d(this.trackingInfo, chequesItemDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.button.hashCode() * 31, 31, this.price), 31, this.subtitle);
        String str = this.deeplink;
        int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.SmallButton smallButton = this.button;
        String str = this.price;
        String str2 = this.subtitle;
        String str3 = this.deeplink;
        String str4 = this.title;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ChequesItemDTO(button=");
        sb2.append(smallButton);
        sb2.append(", price=");
        sb2.append(str);
        sb2.append(", subtitle=");
        a.h(sb2, str2, ", deeplink=", str3, ", title=");
        return C4070a.a(sb2, str4, ", trackingInfo=", map, ")");
    }
}
