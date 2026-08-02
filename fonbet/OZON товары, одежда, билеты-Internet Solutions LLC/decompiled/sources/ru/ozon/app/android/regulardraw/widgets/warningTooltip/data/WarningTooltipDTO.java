package ru.ozon.app.android.regulardraw.widgets.warningTooltip.data;

import G.g;
import GR.b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/warningTooltip/data/WarningTooltipDTO;", "", "text", "", "image", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Ljava/lang/String;", "getImage", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WarningTooltipDTO {
    public static final int $stable = TestInfo.$stable | IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO iconButton;

    @NotNull
    private final String image;
    private final TestInfo testInfo;

    @NotNull
    private final String text;

    public WarningTooltipDTO(@NotNull String text, @NotNull String image, @NotNull IconButtonV3DTO iconButton, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.text = text;
        this.image = image;
        this.iconButton = iconButton;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ WarningTooltipDTO copy$default(WarningTooltipDTO warningTooltipDTO, String str, String str2, IconButtonV3DTO iconButtonV3DTO, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = warningTooltipDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = warningTooltipDTO.image;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = warningTooltipDTO.iconButton;
        }
        if ((i11 & 8) != 0) {
            testInfo = warningTooltipDTO.testInfo;
        }
        return warningTooltipDTO.copy(str, str2, iconButtonV3DTO, testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    /* renamed from: component4, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final WarningTooltipDTO copy(@NotNull String text, @NotNull String image, @NotNull IconButtonV3DTO iconButton, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new WarningTooltipDTO(text, image, iconButton, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarningTooltipDTO)) {
            return false;
        }
        WarningTooltipDTO warningTooltipDTO = (WarningTooltipDTO) other;
        return Intrinsics.d(this.text, warningTooltipDTO.text) && Intrinsics.d(this.image, warningTooltipDTO.image) && Intrinsics.d(this.iconButton, warningTooltipDTO.iconButton) && Intrinsics.d(this.testInfo, warningTooltipDTO.testInfo);
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int c11 = b.c(this.iconButton, g.a(this.text.hashCode() * 31, 31, this.image), 31);
        TestInfo testInfo = this.testInfo;
        return c11 + (testInfo == null ? 0 : testInfo.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.image;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        TestInfo testInfo = this.testInfo;
        StringBuilder d11 = C3660k.d("WarningTooltipDTO(text=", str, ", image=", str2, ", iconButton=");
        d11.append(iconButtonV3DTO);
        d11.append(", testInfo=");
        d11.append(testInfo);
        d11.append(")");
        return d11.toString();
    }
}
