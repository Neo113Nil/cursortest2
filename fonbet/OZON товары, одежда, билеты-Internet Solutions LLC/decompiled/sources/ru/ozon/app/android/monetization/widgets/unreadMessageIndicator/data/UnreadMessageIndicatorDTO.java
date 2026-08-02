package ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.data;

import GR.b;
import Ih.a;
import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/data/UnreadMessageIndicatorDTO;", "", "defaultStateButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "unreadStateButton", "hasUnreadMessages", "", "fetchAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getDefaultStateButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getUnreadStateButton", "getHasUnreadMessages", "()Z", "getFetchAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnreadMessageIndicatorDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconButtonV3DTO defaultStateButton;

    @NotNull
    private final AtomActionDTO fetchAction;
    private final boolean hasUnreadMessages;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final IconButtonV3DTO unreadStateButton;

    public UnreadMessageIndicatorDTO(@NotNull IconButtonV3DTO defaultStateButton, @NotNull IconButtonV3DTO unreadStateButton, boolean z11, @NotNull AtomActionDTO fetchAction, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(defaultStateButton, "defaultStateButton");
        Intrinsics.checkNotNullParameter(unreadStateButton, "unreadStateButton");
        Intrinsics.checkNotNullParameter(fetchAction, "fetchAction");
        this.defaultStateButton = defaultStateButton;
        this.unreadStateButton = unreadStateButton;
        this.hasUnreadMessages = z11;
        this.fetchAction = fetchAction;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ UnreadMessageIndicatorDTO copy$default(UnreadMessageIndicatorDTO unreadMessageIndicatorDTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, boolean z11, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = unreadMessageIndicatorDTO.defaultStateButton;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO2 = unreadMessageIndicatorDTO.unreadStateButton;
        }
        if ((i11 & 4) != 0) {
            z11 = unreadMessageIndicatorDTO.hasUnreadMessages;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = unreadMessageIndicatorDTO.fetchAction;
        }
        if ((i11 & 16) != 0) {
            map = unreadMessageIndicatorDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            testInfo = unreadMessageIndicatorDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        return unreadMessageIndicatorDTO.copy(iconButtonV3DTO, iconButtonV3DTO2, z11, atomActionDTO, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getDefaultStateButton() {
        return this.defaultStateButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getUnreadStateButton() {
        return this.unreadStateButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasUnreadMessages() {
        return this.hasUnreadMessages;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getFetchAction() {
        return this.fetchAction;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final UnreadMessageIndicatorDTO copy(@NotNull IconButtonV3DTO defaultStateButton, @NotNull IconButtonV3DTO unreadStateButton, boolean hasUnreadMessages, @NotNull AtomActionDTO fetchAction, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(defaultStateButton, "defaultStateButton");
        Intrinsics.checkNotNullParameter(unreadStateButton, "unreadStateButton");
        Intrinsics.checkNotNullParameter(fetchAction, "fetchAction");
        return new UnreadMessageIndicatorDTO(defaultStateButton, unreadStateButton, hasUnreadMessages, fetchAction, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadMessageIndicatorDTO)) {
            return false;
        }
        UnreadMessageIndicatorDTO unreadMessageIndicatorDTO = (UnreadMessageIndicatorDTO) other;
        return Intrinsics.d(this.defaultStateButton, unreadMessageIndicatorDTO.defaultStateButton) && Intrinsics.d(this.unreadStateButton, unreadMessageIndicatorDTO.unreadStateButton) && this.hasUnreadMessages == unreadMessageIndicatorDTO.hasUnreadMessages && Intrinsics.d(this.fetchAction, unreadMessageIndicatorDTO.fetchAction) && Intrinsics.d(this.trackingInfo, unreadMessageIndicatorDTO.trackingInfo) && Intrinsics.d(this.testInfo, unreadMessageIndicatorDTO.testInfo);
    }

    @NotNull
    public final IconButtonV3DTO getDefaultStateButton() {
        return this.defaultStateButton;
    }

    @NotNull
    public final AtomActionDTO getFetchAction() {
        return this.fetchAction;
    }

    public final boolean getHasUnreadMessages() {
        return this.hasUnreadMessages;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final IconButtonV3DTO getUnreadStateButton() {
        return this.unreadStateButton;
    }

    public int hashCode() {
        int b11 = a.b(this.fetchAction, C3532b.a(b.c(this.unreadStateButton, this.defaultStateButton.hashCode() * 31, 31), 31, this.hasUnreadMessages), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconButtonV3DTO iconButtonV3DTO = this.defaultStateButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.unreadStateButton;
        boolean z11 = this.hasUnreadMessages;
        AtomActionDTO atomActionDTO = this.fetchAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("UnreadMessageIndicatorDTO(defaultStateButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", unreadStateButton=");
        sb2.append(iconButtonV3DTO2);
        sb2.append(", hasUnreadMessages=");
        sb2.append(z11);
        sb2.append(", fetchAction=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return Ns.b.b(", testInfo=", ")", sb2, map, testInfo);
    }
}
