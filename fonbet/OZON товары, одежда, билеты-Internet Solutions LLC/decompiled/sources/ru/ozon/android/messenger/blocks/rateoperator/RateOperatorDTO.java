package ru.ozon.android.messenger.blocks.rateoperator;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/android/messenger/blocks/rateoperator/RateOperatorDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "rates", "", "Lru/ozon/android/messenger/blocks/rateoperator/RateDTO;", "rateMessage", "sendButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "successState", "Lru/ozon/android/messenger/blocks/rateoperator/SuccessStateDTO;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/android/messenger/blocks/rateoperator/SuccessStateDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getRates", "()Ljava/util/List;", "getRateMessage", "getSendButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSuccessState", "()Lru/ozon/android/messenger/blocks/rateoperator/SuccessStateDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RateOperatorDTO {
    public static final int $stable = 8;
    private final String rateMessage;

    @NotNull
    private final List<RateDTO> rates;

    @NotNull
    private final ButtonV3Atom.LargeButton sendButton;

    @NotNull
    private final SuccessStateDTO successState;

    @NotNull
    private final String title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public RateOperatorDTO(@NotNull String title, @NotNull List<RateDTO> rates, String str, @NotNull ButtonV3Atom.LargeButton sendButton, @NotNull SuccessStateDTO successState, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(successState, "successState");
        this.title = title;
        this.rates = rates;
        this.rateMessage = str;
        this.sendButton = sendButton;
        this.successState = successState;
        this.trackingInfo = map;
    }

    public static /* synthetic */ RateOperatorDTO copy$default(RateOperatorDTO rateOperatorDTO, String str, List list, String str2, ButtonV3Atom.LargeButton largeButton, SuccessStateDTO successStateDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rateOperatorDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = rateOperatorDTO.rates;
        }
        if ((i11 & 4) != 0) {
            str2 = rateOperatorDTO.rateMessage;
        }
        if ((i11 & 8) != 0) {
            largeButton = rateOperatorDTO.sendButton;
        }
        if ((i11 & 16) != 0) {
            successStateDTO = rateOperatorDTO.successState;
        }
        if ((i11 & 32) != 0) {
            map = rateOperatorDTO.trackingInfo;
        }
        SuccessStateDTO successStateDTO2 = successStateDTO;
        Map map2 = map;
        return rateOperatorDTO.copy(str, list, str2, largeButton, successStateDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<RateDTO> component2() {
        return this.rates;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRateMessage() {
        return this.rateMessage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final SuccessStateDTO getSuccessState() {
        return this.successState;
    }

    public final Map<String, MessengerTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final RateOperatorDTO copy(@NotNull String title, @NotNull List<RateDTO> rates, String rateMessage, @NotNull ButtonV3Atom.LargeButton sendButton, @NotNull SuccessStateDTO successState, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(successState, "successState");
        return new RateOperatorDTO(title, rates, rateMessage, sendButton, successState, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateOperatorDTO)) {
            return false;
        }
        RateOperatorDTO rateOperatorDTO = (RateOperatorDTO) other;
        return Intrinsics.d(this.title, rateOperatorDTO.title) && Intrinsics.d(this.rates, rateOperatorDTO.rates) && Intrinsics.d(this.rateMessage, rateOperatorDTO.rateMessage) && Intrinsics.d(this.sendButton, rateOperatorDTO.sendButton) && Intrinsics.d(this.successState, rateOperatorDTO.successState) && Intrinsics.d(this.trackingInfo, rateOperatorDTO.trackingInfo);
    }

    public final String getRateMessage() {
        return this.rateMessage;
    }

    @NotNull
    public final List<RateDTO> getRates() {
        return this.rates;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    @NotNull
    public final SuccessStateDTO getSuccessState() {
        return this.successState;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.rates);
        String str = this.rateMessage;
        int hashCode = (this.successState.hashCode() + Tl.b.a(this.sendButton, (b11 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<RateDTO> list = this.rates;
        String str2 = this.rateMessage;
        ButtonV3Atom.LargeButton largeButton = this.sendButton;
        SuccessStateDTO successStateDTO = this.successState;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = Tl.b.f("RateOperatorDTO(title=", str, ", rates=", ", rateMessage=", list);
        f7.append(str2);
        f7.append(", sendButton=");
        f7.append(largeButton);
        f7.append(", successState=");
        f7.append(successStateDTO);
        f7.append(", trackingInfo=");
        f7.append(map);
        f7.append(")");
        return f7.toString();
    }
}
