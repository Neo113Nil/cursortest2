package ru.ozon.android.messenger.blocks.floatbutton.ai;

import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JT\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/android/messenger/blocks/floatbutton/ai/AiFloatingButtonDTO;", "", "centerButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "rightIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "needsShadow", "", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/Boolean;Ljava/util/Map;)V", "getCenterButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getNeedsShadow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/floatbutton/ai/AiFloatingButtonDTO;", "equals", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiFloatingButtonDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO centerButton;
    private final Boolean needsShadow;

    @NotNull
    private final IconButtonV3DTO rightIconButton;
    private final TestInfo testInfo;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public AiFloatingButtonDTO(ButtonV3DTO buttonV3DTO, @NotNull IconButtonV3DTO rightIconButton, TestInfo testInfo, Boolean bool, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(rightIconButton, "rightIconButton");
        this.centerButton = buttonV3DTO;
        this.rightIconButton = rightIconButton;
        this.testInfo = testInfo;
        this.needsShadow = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AiFloatingButtonDTO copy$default(AiFloatingButtonDTO aiFloatingButtonDTO, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, TestInfo testInfo, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = aiFloatingButtonDTO.centerButton;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = aiFloatingButtonDTO.rightIconButton;
        }
        if ((i11 & 4) != 0) {
            testInfo = aiFloatingButtonDTO.testInfo;
        }
        if ((i11 & 8) != 0) {
            bool = aiFloatingButtonDTO.needsShadow;
        }
        if ((i11 & 16) != 0) {
            map = aiFloatingButtonDTO.trackingInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        return aiFloatingButtonDTO.copy(buttonV3DTO, iconButtonV3DTO, testInfo2, bool, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getCenterButton() {
        return this.centerButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getRightIconButton() {
        return this.rightIconButton;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getNeedsShadow() {
        return this.needsShadow;
    }

    public final Map<String, MessengerTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final AiFloatingButtonDTO copy(ButtonV3DTO centerButton, @NotNull IconButtonV3DTO rightIconButton, TestInfo testInfo, Boolean needsShadow, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(rightIconButton, "rightIconButton");
        return new AiFloatingButtonDTO(centerButton, rightIconButton, testInfo, needsShadow, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiFloatingButtonDTO)) {
            return false;
        }
        AiFloatingButtonDTO aiFloatingButtonDTO = (AiFloatingButtonDTO) other;
        return Intrinsics.d(this.centerButton, aiFloatingButtonDTO.centerButton) && Intrinsics.d(this.rightIconButton, aiFloatingButtonDTO.rightIconButton) && Intrinsics.d(this.testInfo, aiFloatingButtonDTO.testInfo) && Intrinsics.d(this.needsShadow, aiFloatingButtonDTO.needsShadow) && Intrinsics.d(this.trackingInfo, aiFloatingButtonDTO.trackingInfo);
    }

    public final ButtonV3DTO getCenterButton() {
        return this.centerButton;
    }

    public final Boolean getNeedsShadow() {
        return this.needsShadow;
    }

    @NotNull
    public final IconButtonV3DTO getRightIconButton() {
        return this.rightIconButton;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        ButtonV3DTO buttonV3DTO = this.centerButton;
        int c11 = GR.b.c(this.rightIconButton, (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31, 31);
        TestInfo testInfo = this.testInfo;
        int hashCode = (c11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Boolean bool = this.needsShadow;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.centerButton;
        IconButtonV3DTO iconButtonV3DTO = this.rightIconButton;
        TestInfo testInfo = this.testInfo;
        Boolean bool = this.needsShadow;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AiFloatingButtonDTO(centerButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", rightIconButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", needsShadow=");
        sb2.append(bool);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
