package ru.ozon.android.messenger.blocks.floatbutton.ai;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class g implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85174a;

    /* renamed from: b, reason: collision with root package name */
    private final ButtonV3DTO f85175b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final IconButtonV3DTO f85176c;

    /* renamed from: d, reason: collision with root package name */
    private final TestInfo f85177d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f85178e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f85179f;

    public g(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, ButtonV3DTO buttonV3DTO, @NotNull IconButtonV3DTO rightIconButton, TestInfo testInfo, Boolean bool, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(rightIconButton, "rightIconButton");
        this.f85174a = blockId;
        this.f85175b = buttonV3DTO;
        this.f85176c = rightIconButton;
        this.f85177d = testInfo;
        this.f85178e = bool;
        this.f85179f = map;
    }

    public final ButtonV3DTO a() {
        return this.f85175b;
    }

    public final Boolean b() {
        return this.f85178e;
    }

    @NotNull
    public final IconButtonV3DTO c() {
        return this.f85176c;
    }

    public final Map<String, MessengerTrackingInfo> d() {
        return this.f85179f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f85174a, gVar.f85174a) && Intrinsics.d(this.f85175b, gVar.f85175b) && Intrinsics.d(this.f85176c, gVar.f85176c) && Intrinsics.d(this.f85177d, gVar.f85177d) && Intrinsics.d(this.f85178e, gVar.f85178e) && Intrinsics.d(this.f85179f, gVar.f85179f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85174a;
    }

    public final int hashCode() {
        int hashCode = this.f85174a.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.f85175b;
        int c11 = GR.b.c(this.f85176c, (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
        TestInfo testInfo = this.f85177d;
        int hashCode2 = (c11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Boolean bool = this.f85178e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f85179f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AiFloatingButtonVO(blockId=" + this.f85174a + ", centerButton=" + this.f85175b + ", rightIconButton=" + this.f85176c + ", testInfo=" + this.f85177d + ", needsShadow=" + this.f85178e + ", trackingInfo=" + this.f85179f + ")";
    }
}
