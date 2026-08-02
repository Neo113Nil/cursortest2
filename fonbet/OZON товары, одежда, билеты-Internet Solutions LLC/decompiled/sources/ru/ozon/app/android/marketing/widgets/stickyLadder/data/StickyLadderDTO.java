package ru.ozon.app.android.marketing.widgets.stickyLadder.data;

import Bl.C2639a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderVO;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J3\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lru/ozon/app/android/marketing/widgets/stickyLadder/data/StickyLadderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconRight", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "progressLadder", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconRight", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getProgressLadder", "()Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "mapToVo", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "widgetId", "", "asyncData", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StickyLadderDTO {
    public static final int $stable = 8;

    @NotNull
    private final CommonControlSettings common;
    private final IconDTO iconRight;

    @NotNull
    private final ProgressLadderDTO progressLadder;

    @NotNull
    private final TextDTO title;

    public StickyLadderDTO(@NotNull TextDTO title, IconDTO iconDTO, @NotNull ProgressLadderDTO progressLadder, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progressLadder, "progressLadder");
        Intrinsics.checkNotNullParameter(common, "common");
        this.title = title;
        this.iconRight = iconDTO;
        this.progressLadder = progressLadder;
        this.common = common;
    }

    public static /* synthetic */ StickyLadderDTO copy$default(StickyLadderDTO stickyLadderDTO, TextDTO textDTO, IconDTO iconDTO, ProgressLadderDTO progressLadderDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = stickyLadderDTO.title;
        }
        if ((i11 & 2) != 0) {
            iconDTO = stickyLadderDTO.iconRight;
        }
        if ((i11 & 4) != 0) {
            progressLadderDTO = stickyLadderDTO.progressLadder;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = stickyLadderDTO.common;
        }
        return stickyLadderDTO.copy(textDTO, iconDTO, progressLadderDTO, commonControlSettings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getIconRight() {
        return this.iconRight;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ProgressLadderDTO getProgressLadder() {
        return this.progressLadder;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final StickyLadderDTO copy(@NotNull TextDTO title, IconDTO iconRight, @NotNull ProgressLadderDTO progressLadder, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progressLadder, "progressLadder");
        Intrinsics.checkNotNullParameter(common, "common");
        return new StickyLadderDTO(title, iconRight, progressLadder, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyLadderDTO)) {
            return false;
        }
        StickyLadderDTO stickyLadderDTO = (StickyLadderDTO) other;
        return Intrinsics.d(this.title, stickyLadderDTO.title) && Intrinsics.d(this.iconRight, stickyLadderDTO.iconRight) && Intrinsics.d(this.progressLadder, stickyLadderDTO.progressLadder) && Intrinsics.d(this.common, stickyLadderDTO.common);
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIconRight() {
        return this.iconRight;
    }

    @NotNull
    public final ProgressLadderDTO getProgressLadder() {
        return this.progressLadder;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        IconDTO iconDTO = this.iconRight;
        return this.common.hashCode() + ((this.progressLadder.hashCode() + ((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31)) * 31);
    }

    @NotNull
    public final StickyLadderVO mapToVo(long widgetId, String asyncData) {
        return new StickyLadderVO(widgetId, asyncData, this.title, this.iconRight, this.progressLadder, this.common);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.iconRight;
        ProgressLadderDTO progressLadderDTO = this.progressLadder;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder d11 = C2639a.d("StickyLadderDTO(title=", ", iconRight=", ", progressLadder=", iconDTO, textDTO);
        d11.append(progressLadderDTO);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(")");
        return d11.toString();
    }
}
