package ru.ozon.app.android.monetization.widgets.overlayButton.data;

import Pk0.h;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO;", "", "content", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/Object;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getContent", "()Ljava/lang/Object;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "DoubleButton", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OverlayButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final Object content;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO$DoubleButton;", "", "firstButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "secondButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getFirstButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DoubleButton {
        public static final int $stable = 0;

        @NotNull
        private final ButtonV3DTO firstButton;

        @NotNull
        private final ButtonV3DTO secondButton;

        public DoubleButton(@NotNull ButtonV3DTO firstButton, @NotNull ButtonV3DTO secondButton) {
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(secondButton, "secondButton");
            this.firstButton = firstButton;
            this.secondButton = secondButton;
        }

        public static /* synthetic */ DoubleButton copy$default(DoubleButton doubleButton, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = doubleButton.firstButton;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO2 = doubleButton.secondButton;
            }
            return doubleButton.copy(buttonV3DTO, buttonV3DTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getFirstButton() {
            return this.firstButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getSecondButton() {
            return this.secondButton;
        }

        @NotNull
        public final DoubleButton copy(@NotNull ButtonV3DTO firstButton, @NotNull ButtonV3DTO secondButton) {
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(secondButton, "secondButton");
            return new DoubleButton(firstButton, secondButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DoubleButton)) {
                return false;
            }
            DoubleButton doubleButton = (DoubleButton) other;
            return Intrinsics.d(this.firstButton, doubleButton.firstButton) && Intrinsics.d(this.secondButton, doubleButton.secondButton);
        }

        @NotNull
        public final ButtonV3DTO getFirstButton() {
            return this.firstButton;
        }

        @NotNull
        public final ButtonV3DTO getSecondButton() {
            return this.secondButton;
        }

        public int hashCode() {
            return this.secondButton.hashCode() + (this.firstButton.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DoubleButton(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ")";
        }
    }

    public OverlayButtonDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "CONTENT_TYPE_BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "doubleButton", name = "CONTENT_TYPE_DOUBLE_BUTTON", type = DoubleButton.class)}) @NotNull @ProtoOneOf(label = "type") Object content, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverlayButtonDTO copy$default(OverlayButtonDTO overlayButtonDTO, Object obj, Map map, TestInfo testInfo, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = overlayButtonDTO.content;
        }
        if ((i11 & 2) != 0) {
            map = overlayButtonDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            testInfo = overlayButtonDTO.testInfo;
        }
        return overlayButtonDTO.copy(obj, map, testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getContent() {
        return this.content;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OverlayButtonDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "button", name = "CONTENT_TYPE_BUTTON", type = ButtonV3DTO.class), @ProtoOneOfSignature(fieldName = "doubleButton", name = "CONTENT_TYPE_DOUBLE_BUTTON", type = DoubleButton.class)}) @NotNull @ProtoOneOf(label = "type") Object content, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new OverlayButtonDTO(content, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayButtonDTO)) {
            return false;
        }
        OverlayButtonDTO overlayButtonDTO = (OverlayButtonDTO) other;
        return Intrinsics.d(this.content, overlayButtonDTO.content) && Intrinsics.d(this.trackingInfo, overlayButtonDTO.trackingInfo) && Intrinsics.d(this.testInfo, overlayButtonDTO.testInfo);
    }

    @NotNull
    public final Object getContent() {
        return this.content;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Object obj = this.content;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("OverlayButtonDTO(content=");
        sb2.append(obj);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }
}
