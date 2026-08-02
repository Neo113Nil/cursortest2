package ru.ozon.app.android.marketing.widgets.balanceStars.data;

import El.C2971a;
import N3.C3660k;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/balanceStars/data/BalanceStarsDTO;", "", "backgroundColor", "", "blockBackgroundColor", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBlockBackgroundColor", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BalanceStarsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final String blockBackgroundColor;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BalanceStarsDTO(String str, String str2, @NotNull IconDTO icon, @NotNull TextDTO title, @NotNull TextDTO subtitle, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.backgroundColor = str;
        this.blockBackgroundColor = str2;
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.trackingInfo = map;
    }

    public static /* synthetic */ BalanceStarsDTO copy$default(BalanceStarsDTO balanceStarsDTO, String str, String str2, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = balanceStarsDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = balanceStarsDTO.blockBackgroundColor;
        }
        if ((i11 & 4) != 0) {
            iconDTO = balanceStarsDTO.icon;
        }
        if ((i11 & 8) != 0) {
            textDTO = balanceStarsDTO.title;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = balanceStarsDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            map = balanceStarsDTO.trackingInfo;
        }
        TextDTO textDTO3 = textDTO2;
        Map map2 = map;
        return balanceStarsDTO.copy(str, str2, iconDTO, textDTO, textDTO3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBlockBackgroundColor() {
        return this.blockBackgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final BalanceStarsDTO copy(String backgroundColor, String blockBackgroundColor, @NotNull IconDTO icon, @NotNull TextDTO title, @NotNull TextDTO subtitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new BalanceStarsDTO(backgroundColor, blockBackgroundColor, icon, title, subtitle, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceStarsDTO)) {
            return false;
        }
        BalanceStarsDTO balanceStarsDTO = (BalanceStarsDTO) other;
        return Intrinsics.d(this.backgroundColor, balanceStarsDTO.backgroundColor) && Intrinsics.d(this.blockBackgroundColor, balanceStarsDTO.blockBackgroundColor) && Intrinsics.d(this.icon, balanceStarsDTO.icon) && Intrinsics.d(this.title, balanceStarsDTO.title) && Intrinsics.d(this.subtitle, balanceStarsDTO.subtitle) && Intrinsics.d(this.trackingInfo, balanceStarsDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBlockBackgroundColor() {
        return this.blockBackgroundColor;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blockBackgroundColor;
        int a11 = b.a(this.subtitle, b.a(this.title, C2971a.a(this.icon, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.blockBackgroundColor;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("BalanceStarsDTO(backgroundColor=", str, ", blockBackgroundColor=", str2, ", icon=");
        d11.append(iconDTO);
        d11.append(", title=");
        d11.append(textDTO);
        d11.append(", subtitle=");
        d11.append(textDTO2);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
