package ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.data;

import Lc.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/data/DeliveryProblemsDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryProblemsDTO {
    public static final int $stable = 8;

    @NotNull
    private final Icon icon;

    @NotNull
    private final TextAtom text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public DeliveryProblemsDTO(@NotNull TextAtom text, @NotNull Icon icon, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.text = text;
        this.icon = icon;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryProblemsDTO copy$default(DeliveryProblemsDTO deliveryProblemsDTO, TextAtom textAtom, Icon icon, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = deliveryProblemsDTO.text;
        }
        if ((i11 & 2) != 0) {
            icon = deliveryProblemsDTO.icon;
        }
        if ((i11 & 4) != 0) {
            map = deliveryProblemsDTO.trackingInfo;
        }
        return deliveryProblemsDTO.copy(textAtom, icon, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final DeliveryProblemsDTO copy(@NotNull TextAtom text, @NotNull Icon icon, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new DeliveryProblemsDTO(text, icon, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryProblemsDTO)) {
            return false;
        }
        DeliveryProblemsDTO deliveryProblemsDTO = (DeliveryProblemsDTO) other;
        return Intrinsics.d(this.text, deliveryProblemsDTO.text) && Intrinsics.d(this.icon, deliveryProblemsDTO.icon) && Intrinsics.d(this.trackingInfo, deliveryProblemsDTO.trackingInfo);
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = a.a(this.icon, this.text.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.text;
        Icon icon = this.icon;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("DeliveryProblemsDTO(text=");
        sb2.append(textAtom);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
