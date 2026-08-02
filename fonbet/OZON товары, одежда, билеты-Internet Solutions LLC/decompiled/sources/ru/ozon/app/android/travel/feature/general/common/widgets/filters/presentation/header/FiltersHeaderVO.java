package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header;

import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015Jv\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b\u000f\u00102R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b3\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b7\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/HasAsyncAction;", "", "id", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "asyncAction", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "leftButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButton", "", "isSingleSection", "hasBottomSeparator", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "asyncErrorMessage", "asyncServerErrorMessage", "<init>", "(JLru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZLru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;)V", "copy", "(JLru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZLru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "getAsyncAction", "()Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLeftButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Z", "()Z", "getHasBottomSeparator", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "getAsyncErrorMessage", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "getAsyncServerErrorMessage", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FiltersHeaderVO implements c, HasAsyncAction {
    private final AsyncActionVO asyncAction;
    private final EmptyStateV2WidgetDTO asyncErrorMessage;
    private final EmptyStateV2WidgetDTO asyncServerErrorMessage;
    private final boolean hasBottomSeparator;
    private final long id;
    private final boolean isSingleSection;
    private final ButtonV3DTO leftButton;
    private final IconButtonV3DTO rightButton;
    private final TextDTO title;

    public FiltersHeaderVO(long j11, AsyncActionVO asyncActionVO, ButtonV3DTO buttonV3DTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, boolean z11, boolean z12, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2) {
        this.id = j11;
        this.asyncAction = asyncActionVO;
        this.leftButton = buttonV3DTO;
        this.title = textDTO;
        this.rightButton = iconButtonV3DTO;
        this.isSingleSection = z11;
        this.hasBottomSeparator = z12;
        this.asyncErrorMessage = emptyStateV2WidgetDTO;
        this.asyncServerErrorMessage = emptyStateV2WidgetDTO2;
    }

    public static /* synthetic */ FiltersHeaderVO copy$default(FiltersHeaderVO filtersHeaderVO, long j11, AsyncActionVO asyncActionVO, ButtonV3DTO buttonV3DTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, boolean z11, boolean z12, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO, EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = filtersHeaderVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            asyncActionVO = filtersHeaderVO.asyncAction;
        }
        AsyncActionVO asyncActionVO2 = asyncActionVO;
        if ((i11 & 4) != 0) {
            buttonV3DTO = filtersHeaderVO.leftButton;
        }
        return filtersHeaderVO.copy(j12, asyncActionVO2, buttonV3DTO, (i11 & 8) != 0 ? filtersHeaderVO.title : textDTO, (i11 & 16) != 0 ? filtersHeaderVO.rightButton : iconButtonV3DTO, (i11 & 32) != 0 ? filtersHeaderVO.isSingleSection : z11, (i11 & 64) != 0 ? filtersHeaderVO.hasBottomSeparator : z12, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? filtersHeaderVO.asyncErrorMessage : emptyStateV2WidgetDTO, (i11 & 256) != 0 ? filtersHeaderVO.asyncServerErrorMessage : emptyStateV2WidgetDTO2);
    }

    @NotNull
    public final FiltersHeaderVO copy(long id2, AsyncActionVO asyncAction, ButtonV3DTO leftButton, TextDTO title, IconButtonV3DTO rightButton, boolean isSingleSection, boolean hasBottomSeparator, EmptyStateV2WidgetDTO asyncErrorMessage, EmptyStateV2WidgetDTO asyncServerErrorMessage) {
        return new FiltersHeaderVO(id2, asyncAction, leftButton, title, rightButton, isSingleSection, hasBottomSeparator, asyncErrorMessage, asyncServerErrorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersHeaderVO)) {
            return false;
        }
        FiltersHeaderVO filtersHeaderVO = (FiltersHeaderVO) other;
        return this.id == filtersHeaderVO.id && Intrinsics.d(this.asyncAction, filtersHeaderVO.asyncAction) && Intrinsics.d(this.leftButton, filtersHeaderVO.leftButton) && Intrinsics.d(this.title, filtersHeaderVO.title) && Intrinsics.d(this.rightButton, filtersHeaderVO.rightButton) && this.isSingleSection == filtersHeaderVO.isSingleSection && this.hasBottomSeparator == filtersHeaderVO.hasBottomSeparator && Intrinsics.d(this.asyncErrorMessage, filtersHeaderVO.asyncErrorMessage) && Intrinsics.d(this.asyncServerErrorMessage, filtersHeaderVO.asyncServerErrorMessage);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction
    public AsyncActionVO getAsyncAction() {
        return this.asyncAction;
    }

    public final EmptyStateV2WidgetDTO getAsyncErrorMessage() {
        return this.asyncErrorMessage;
    }

    public final EmptyStateV2WidgetDTO getAsyncServerErrorMessage() {
        return this.asyncServerErrorMessage;
    }

    public final boolean getHasBottomSeparator() {
        return this.hasBottomSeparator;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3DTO getLeftButton() {
        return this.leftButton;
    }

    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        AsyncActionVO asyncActionVO = this.asyncAction;
        int hashCode2 = (hashCode + (asyncActionVO == null ? 0 : asyncActionVO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.leftButton;
        int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        int a11 = C3532b.a(C3532b.a((hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.isSingleSection), 31, this.hasBottomSeparator);
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO = this.asyncErrorMessage;
        int hashCode5 = (a11 + (emptyStateV2WidgetDTO == null ? 0 : emptyStateV2WidgetDTO.hashCode())) * 31;
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO2 = this.asyncServerErrorMessage;
        return hashCode5 + (emptyStateV2WidgetDTO2 != null ? emptyStateV2WidgetDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiltersHeaderVO(id=" + this.id + ", asyncAction=" + this.asyncAction + ", leftButton=" + this.leftButton + ", title=" + this.title + ", rightButton=" + this.rightButton + ", isSingleSection=" + this.isSingleSection + ", hasBottomSeparator=" + this.hasBottomSeparator + ", asyncErrorMessage=" + this.asyncErrorMessage + ", asyncServerErrorMessage=" + this.asyncServerErrorMessage + ")";
    }
}
