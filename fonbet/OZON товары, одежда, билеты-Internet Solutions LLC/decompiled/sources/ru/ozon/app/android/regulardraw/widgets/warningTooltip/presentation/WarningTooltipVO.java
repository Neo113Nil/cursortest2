package ru.ozon.app.android.regulardraw.widgets.warningTooltip.presentation;

import Ak.C2436a;
import G.g;
import GR.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipVO;", "Ll20/c;", "", "id", "", "text", "image", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getText", "getImage", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WarningTooltipVO implements c {
    public static final int $stable = TestInfo.$stable | IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final long id;

    @NotNull
    private final String image;
    private final TestInfo testInfo;

    @NotNull
    private final String text;

    public WarningTooltipVO(long j11, @NotNull String text, @NotNull String image, @NotNull IconButtonV3DTO iconButton, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.id = j11;
        this.text = text;
        this.image = image;
        this.iconButton = iconButton;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarningTooltipVO)) {
            return false;
        }
        WarningTooltipVO warningTooltipVO = (WarningTooltipVO) other;
        return this.id == warningTooltipVO.id && Intrinsics.d(this.text, warningTooltipVO.text) && Intrinsics.d(this.image, warningTooltipVO.image) && Intrinsics.d(this.iconButton, warningTooltipVO.iconButton) && Intrinsics.d(this.testInfo, warningTooltipVO.testInfo);
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.iconButton, g.a(g.a(Long.hashCode(this.id) * 31, 31, this.text), 31, this.image), 31);
        TestInfo testInfo = this.testInfo;
        return c11 + (testInfo == null ? 0 : testInfo.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.text;
        String str2 = this.image;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        TestInfo testInfo = this.testInfo;
        StringBuilder c11 = C2436a.c(j11, "WarningTooltipVO(id=", ", text=", str);
        c11.append(", image=");
        c11.append(str2);
        c11.append(", iconButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", testInfo=");
        c11.append(testInfo);
        c11.append(")");
        return c11.toString();
    }
}
