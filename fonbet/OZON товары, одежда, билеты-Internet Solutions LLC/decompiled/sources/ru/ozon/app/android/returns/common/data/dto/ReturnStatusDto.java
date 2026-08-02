package ru.ozon.app.android.returns.common.data.dto;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "caption", "message", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getCaption", "getMessage", "()Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnStatusDto {
    public static final int $stable;
    private final ButtonV3DTO actionButton;

    @NotNull
    private final Badge badge;
    private final TextAtom caption;
    private final TextAtom description;
    private final ReturnStatusMessage message;
    private final TestInfo testInfo;

    static {
        int i11 = TextAtom.$stable;
        $stable = i11 | TestInfo.$stable | i11 | Badge.$stable;
    }

    public ReturnStatusDto(@i(name = "badge") @NotNull Badge badge, @i(name = "description") TextAtom textAtom, @i(name = "testInfo") TestInfo testInfo, @i(name = "caption") TextAtom textAtom2, @i(name = "message") ReturnStatusMessage returnStatusMessage, @i(name = "actionButton") ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.badge = badge;
        this.description = textAtom;
        this.testInfo = testInfo;
        this.caption = textAtom2;
        this.message = returnStatusMessage;
        this.actionButton = buttonV3DTO;
    }

    public static /* synthetic */ ReturnStatusDto copy$default(ReturnStatusDto returnStatusDto, Badge badge, TextAtom textAtom, TestInfo testInfo, TextAtom textAtom2, ReturnStatusMessage returnStatusMessage, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badge = returnStatusDto.badge;
        }
        if ((i11 & 2) != 0) {
            textAtom = returnStatusDto.description;
        }
        if ((i11 & 4) != 0) {
            testInfo = returnStatusDto.testInfo;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = returnStatusDto.caption;
        }
        if ((i11 & 16) != 0) {
            returnStatusMessage = returnStatusDto.message;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = returnStatusDto.actionButton;
        }
        ReturnStatusMessage returnStatusMessage2 = returnStatusMessage;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return returnStatusDto.copy(badge, textAtom, testInfo, textAtom2, returnStatusMessage2, buttonV3DTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getCaption() {
        return this.caption;
    }

    /* renamed from: component5, reason: from getter */
    public final ReturnStatusMessage getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final ReturnStatusDto copy(@i(name = "badge") @NotNull Badge badge, @i(name = "description") TextAtom description, @i(name = "testInfo") TestInfo testInfo, @i(name = "caption") TextAtom caption, @i(name = "message") ReturnStatusMessage message, @i(name = "actionButton") ButtonV3DTO actionButton) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        return new ReturnStatusDto(badge, description, testInfo, caption, message, actionButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnStatusDto)) {
            return false;
        }
        ReturnStatusDto returnStatusDto = (ReturnStatusDto) other;
        return Intrinsics.d(this.badge, returnStatusDto.badge) && Intrinsics.d(this.description, returnStatusDto.description) && Intrinsics.d(this.testInfo, returnStatusDto.testInfo) && Intrinsics.d(this.caption, returnStatusDto.caption) && Intrinsics.d(this.message, returnStatusDto.message) && Intrinsics.d(this.actionButton, returnStatusDto.actionButton);
    }

    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final Badge getBadge() {
        return this.badge;
    }

    public final TextAtom getCaption() {
        return this.caption;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    public final ReturnStatusMessage getMessage() {
        return this.message;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public int hashCode() {
        int hashCode = this.badge.hashCode() * 31;
        TextAtom textAtom = this.description;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        TextAtom textAtom2 = this.caption;
        int hashCode4 = (hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        ReturnStatusMessage returnStatusMessage = this.message;
        int hashCode5 = (hashCode4 + (returnStatusMessage == null ? 0 : returnStatusMessage.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        return hashCode5 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReturnStatusDto(badge=" + this.badge + ", description=" + this.description + ", testInfo=" + this.testInfo + ", caption=" + this.caption + ", message=" + this.message + ", actionButton=" + this.actionButton + ")";
    }
}
