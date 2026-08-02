package ru.ozon.app.android.search.widgets.feedbackForm.common.model;

import Ak.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/common/model/SendButtonModel;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "skipTrackingInfo", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "customAnalytics", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/Map;", "getSkipTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCustomAnalytics", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SendButtonModel {
    private final ButtonV3DTO button;
    private final CommonControlSettings customAnalytics;
    private final Map<String, TokenizedTrackingInfo> skipTrackingInfo;

    public SendButtonModel(ButtonV3DTO buttonV3DTO, Map<String, TokenizedTrackingInfo> map, CommonControlSettings commonControlSettings) {
        this.button = buttonV3DTO;
        this.skipTrackingInfo = map;
        this.customAnalytics = commonControlSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendButtonModel)) {
            return false;
        }
        SendButtonModel sendButtonModel = (SendButtonModel) other;
        return Intrinsics.d(this.button, sendButtonModel.button) && Intrinsics.d(this.skipTrackingInfo, sendButtonModel.skipTrackingInfo) && Intrinsics.d(this.customAnalytics, sendButtonModel.customAnalytics);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CommonControlSettings getCustomAnalytics() {
        return this.customAnalytics;
    }

    public final Map<String, TokenizedTrackingInfo> getSkipTrackingInfo() {
        return this.skipTrackingInfo;
    }

    public int hashCode() {
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.skipTrackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.customAnalytics;
        return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.skipTrackingInfo;
        CommonControlSettings commonControlSettings = this.customAnalytics;
        StringBuilder sb2 = new StringBuilder("SendButtonModel(button=");
        sb2.append(buttonV3DTO);
        sb2.append(", skipTrackingInfo=");
        sb2.append(map);
        sb2.append(", customAnalytics=");
        return b.g(sb2, commonControlSettings, ")");
    }
}
