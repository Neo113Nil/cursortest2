package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.data;

import Cm.e;
import G.g;
import Ih.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "skuList", "", "", "backgroundColor", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSkuList", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FloatCartButtonDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final AtomActionDTO clickAction;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final List<Long> skuList;

    @NotNull
    private final TextDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public FloatCartButtonDTO(@NotNull IconDTO icon, @NotNull TextDTO text, @NotNull List<Long> skuList, String str, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(skuList, "skuList");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        this.icon = icon;
        this.text = text;
        this.skuList = skuList;
        this.backgroundColor = str;
        this.clickAction = clickAction;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FloatCartButtonDTO copy$default(FloatCartButtonDTO floatCartButtonDTO, IconDTO iconDTO, TextDTO textDTO, List list, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = floatCartButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = floatCartButtonDTO.text;
        }
        if ((i11 & 4) != 0) {
            list = floatCartButtonDTO.skuList;
        }
        if ((i11 & 8) != 0) {
            str = floatCartButtonDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = floatCartButtonDTO.clickAction;
        }
        if ((i11 & 32) != 0) {
            map = floatCartButtonDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return floatCartButtonDTO.copy(iconDTO, textDTO, list, str, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final List<Long> component3() {
        return this.skuList;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final FloatCartButtonDTO copy(@NotNull IconDTO icon, @NotNull TextDTO text, @NotNull List<Long> skuList, String backgroundColor, @NotNull AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(skuList, "skuList");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        return new FloatCartButtonDTO(icon, text, skuList, backgroundColor, clickAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloatCartButtonDTO)) {
            return false;
        }
        FloatCartButtonDTO floatCartButtonDTO = (FloatCartButtonDTO) other;
        return Intrinsics.d(this.icon, floatCartButtonDTO.icon) && Intrinsics.d(this.text, floatCartButtonDTO.text) && Intrinsics.d(this.skuList, floatCartButtonDTO.skuList) && Intrinsics.d(this.backgroundColor, floatCartButtonDTO.backgroundColor) && Intrinsics.d(this.clickAction, floatCartButtonDTO.clickAction) && Intrinsics.d(this.trackingInfo, floatCartButtonDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<Long> getSkuList() {
        return this.skuList;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.text, this.icon.hashCode() * 31, 31), 31, this.skuList);
        String str = this.backgroundColor;
        int b12 = a.b(this.clickAction, (b11 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.text;
        List<Long> list = this.skuList;
        String str = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.clickAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder i11 = Bi.b.i("FloatCartButtonDTO(icon=", ", text=", ", skuList=", iconDTO, textDTO);
        e.i(", backgroundColor=", str, ", clickAction=", i11, list);
        return D40.a.d(i11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
