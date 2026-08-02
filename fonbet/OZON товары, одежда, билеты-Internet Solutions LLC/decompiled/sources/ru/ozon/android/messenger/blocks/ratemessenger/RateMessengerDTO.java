package ru.ozon.android.messenger.blocks.ratemessenger;

import N3.C3660k;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jg\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/android/messenger/blocks/ratemessenger/RateMessengerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "rates", "", "Lru/ozon/android/messenger/blocks/ratemessenger/RateDTO;", "message", "Lru/ozon/android/messenger/blocks/ratemessenger/MessageDTO;", "sendButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "cancelAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/android/messenger/blocks/ratemessenger/MessageDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getRates", "()Ljava/util/List;", "getMessage", "()Lru/ozon/android/messenger/blocks/ratemessenger/MessageDTO;", "getSendButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCancelAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RateMessengerDTO {
    public static final int $stable = 8;
    private final AtomActionDTO cancelAction;

    @NotNull
    private final String description;
    private final MessageDTO message;

    @NotNull
    private final List<RateDTO> rates;

    @NotNull
    private final ButtonV3Atom.LargeButton sendButton;

    @NotNull
    private final String title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public RateMessengerDTO(@NotNull String title, @NotNull String description, @NotNull List<RateDTO> rates, MessageDTO messageDTO, @NotNull ButtonV3Atom.LargeButton sendButton, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        this.title = title;
        this.description = description;
        this.rates = rates;
        this.message = messageDTO;
        this.sendButton = sendButton;
        this.cancelAction = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ RateMessengerDTO copy$default(RateMessengerDTO rateMessengerDTO, String str, String str2, List list, MessageDTO messageDTO, ButtonV3Atom.LargeButton largeButton, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rateMessengerDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = rateMessengerDTO.description;
        }
        if ((i11 & 4) != 0) {
            list = rateMessengerDTO.rates;
        }
        if ((i11 & 8) != 0) {
            messageDTO = rateMessengerDTO.message;
        }
        if ((i11 & 16) != 0) {
            largeButton = rateMessengerDTO.sendButton;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = rateMessengerDTO.cancelAction;
        }
        if ((i11 & 64) != 0) {
            map = rateMessengerDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        List list2 = list;
        return rateMessengerDTO.copy(str, str2, list2, messageDTO, largeButton2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<RateDTO> component3() {
        return this.rates;
    }

    /* renamed from: component4, reason: from getter */
    public final MessageDTO getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getSendButton() {
        return this.sendButton;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getCancelAction() {
        return this.cancelAction;
    }

    public final Map<String, MessengerTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final RateMessengerDTO copy(@NotNull String title, @NotNull String description, @NotNull List<RateDTO> rates, MessageDTO message, @NotNull ButtonV3Atom.LargeButton sendButton, AtomActionDTO cancelAction, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        return new RateMessengerDTO(title, description, rates, message, sendButton, cancelAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateMessengerDTO)) {
            return false;
        }
        RateMessengerDTO rateMessengerDTO = (RateMessengerDTO) other;
        return Intrinsics.d(this.title, rateMessengerDTO.title) && Intrinsics.d(this.description, rateMessengerDTO.description) && Intrinsics.d(this.rates, rateMessengerDTO.rates) && Intrinsics.d(this.message, rateMessengerDTO.message) && Intrinsics.d(this.sendButton, rateMessengerDTO.sendButton) && Intrinsics.d(this.cancelAction, rateMessengerDTO.cancelAction) && Intrinsics.d(this.trackingInfo, rateMessengerDTO.trackingInfo);
    }

    public final AtomActionDTO getCancelAction() {
        return this.cancelAction;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final MessageDTO getMessage() {
        return this.message;
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
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = G.g.b(G.g.a(this.title.hashCode() * 31, 31, this.description), 31, this.rates);
        MessageDTO messageDTO = this.message;
        int a11 = Tl.b.a(this.sendButton, (b11 + (messageDTO == null ? 0 : messageDTO.hashCode())) * 31, 31);
        AtomActionDTO atomActionDTO = this.cancelAction;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        List<RateDTO> list = this.rates;
        MessageDTO messageDTO = this.message;
        ButtonV3Atom.LargeButton largeButton = this.sendButton;
        AtomActionDTO atomActionDTO = this.cancelAction;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("RateMessengerDTO(title=", str, ", description=", str2, ", rates=");
        d11.append(list);
        d11.append(", message=");
        d11.append(messageDTO);
        d11.append(", sendButton=");
        d11.append(largeButton);
        d11.append(", cancelAction=");
        d11.append(atomActionDTO);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
