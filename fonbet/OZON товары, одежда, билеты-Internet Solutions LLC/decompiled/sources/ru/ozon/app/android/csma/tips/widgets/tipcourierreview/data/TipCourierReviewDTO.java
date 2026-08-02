package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data;

import G.g;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.core.ChangePayment;
import ru.ozon.app.android.csma.tips.core.TipItem;
import ru.ozon.app.android.csma.tips.core.TipsInput;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO;", "", "tips", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "actionButton", "Lru/ozon/uni/atoms/data/AtomDTO;", "cancelButton", "<init>", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getTips", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "getActionButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getCancelButton", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TipsReview", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipCourierReviewDTO {
    private final AtomDTO actionButton;
    private final AtomDTO cancelButton;
    private final TipsReview tips;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "tipsVariants", "", "Lru/ozon/app/android/csma/tips/core/TipItem;", "changePayment", "Lru/ozon/app/android/csma/tips/core/ChangePayment;", "tipsInput", "Lru/ozon/app/android/csma/tips/core/TipsInput;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/csma/tips/core/ChangePayment;Lru/ozon/app/android/csma/tips/core/TipsInput;)V", "getTitle", "()Ljava/lang/String;", "getTipsVariants", "()Ljava/util/List;", "getChangePayment", "()Lru/ozon/app/android/csma/tips/core/ChangePayment;", "getTipsInput", "()Lru/ozon/app/android/csma/tips/core/TipsInput;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TipsReview {
        private final ChangePayment changePayment;
        private final TipsInput tipsInput;

        @NotNull
        private final List<TipItem> tipsVariants;

        @NotNull
        private final String title;

        public TipsReview(@NotNull String title, @NotNull List<TipItem> tipsVariants, ChangePayment changePayment, TipsInput tipsInput) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tipsVariants, "tipsVariants");
            this.title = title;
            this.tipsVariants = tipsVariants;
            this.changePayment = changePayment;
            this.tipsInput = tipsInput;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TipsReview copy$default(TipsReview tipsReview, String str, List list, ChangePayment changePayment, TipsInput tipsInput, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tipsReview.title;
            }
            if ((i11 & 2) != 0) {
                list = tipsReview.tipsVariants;
            }
            if ((i11 & 4) != 0) {
                changePayment = tipsReview.changePayment;
            }
            if ((i11 & 8) != 0) {
                tipsInput = tipsReview.tipsInput;
            }
            return tipsReview.copy(str, list, changePayment, tipsInput);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<TipItem> component2() {
            return this.tipsVariants;
        }

        /* renamed from: component3, reason: from getter */
        public final ChangePayment getChangePayment() {
            return this.changePayment;
        }

        /* renamed from: component4, reason: from getter */
        public final TipsInput getTipsInput() {
            return this.tipsInput;
        }

        @NotNull
        public final TipsReview copy(@NotNull String title, @NotNull List<TipItem> tipsVariants, ChangePayment changePayment, TipsInput tipsInput) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tipsVariants, "tipsVariants");
            return new TipsReview(title, tipsVariants, changePayment, tipsInput);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TipsReview)) {
                return false;
            }
            TipsReview tipsReview = (TipsReview) other;
            return Intrinsics.d(this.title, tipsReview.title) && Intrinsics.d(this.tipsVariants, tipsReview.tipsVariants) && Intrinsics.d(this.changePayment, tipsReview.changePayment) && Intrinsics.d(this.tipsInput, tipsReview.tipsInput);
        }

        public final ChangePayment getChangePayment() {
            return this.changePayment;
        }

        public final TipsInput getTipsInput() {
            return this.tipsInput;
        }

        @NotNull
        public final List<TipItem> getTipsVariants() {
            return this.tipsVariants;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = g.b(this.title.hashCode() * 31, 31, this.tipsVariants);
            ChangePayment changePayment = this.changePayment;
            int hashCode = (b11 + (changePayment == null ? 0 : changePayment.hashCode())) * 31;
            TipsInput tipsInput = this.tipsInput;
            return hashCode + (tipsInput != null ? tipsInput.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            List<TipItem> list = this.tipsVariants;
            ChangePayment changePayment = this.changePayment;
            TipsInput tipsInput = this.tipsInput;
            StringBuilder f7 = b.f("TipsReview(title=", str, ", tipsVariants=", ", changePayment=", list);
            f7.append(changePayment);
            f7.append(", tipsInput=");
            f7.append(tipsInput);
            f7.append(")");
            return f7.toString();
        }
    }

    public TipCourierReviewDTO(TipsReview tipsReview, AtomDTO atomDTO, AtomDTO atomDTO2) {
        this.tips = tipsReview;
        this.actionButton = atomDTO;
        this.cancelButton = atomDTO2;
    }

    public static /* synthetic */ TipCourierReviewDTO copy$default(TipCourierReviewDTO tipCourierReviewDTO, TipsReview tipsReview, AtomDTO atomDTO, AtomDTO atomDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tipsReview = tipCourierReviewDTO.tips;
        }
        if ((i11 & 2) != 0) {
            atomDTO = tipCourierReviewDTO.actionButton;
        }
        if ((i11 & 4) != 0) {
            atomDTO2 = tipCourierReviewDTO.cancelButton;
        }
        return tipCourierReviewDTO.copy(tipsReview, atomDTO, atomDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final TipsReview getTips() {
        return this.tips;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomDTO getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomDTO getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final TipCourierReviewDTO copy(TipsReview tips, AtomDTO actionButton, AtomDTO cancelButton) {
        return new TipCourierReviewDTO(tips, actionButton, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCourierReviewDTO)) {
            return false;
        }
        TipCourierReviewDTO tipCourierReviewDTO = (TipCourierReviewDTO) other;
        return Intrinsics.d(this.tips, tipCourierReviewDTO.tips) && Intrinsics.d(this.actionButton, tipCourierReviewDTO.actionButton) && Intrinsics.d(this.cancelButton, tipCourierReviewDTO.cancelButton);
    }

    public final AtomDTO getActionButton() {
        return this.actionButton;
    }

    public final AtomDTO getCancelButton() {
        return this.cancelButton;
    }

    public final TipsReview getTips() {
        return this.tips;
    }

    public int hashCode() {
        TipsReview tipsReview = this.tips;
        int hashCode = (tipsReview == null ? 0 : tipsReview.hashCode()) * 31;
        AtomDTO atomDTO = this.actionButton;
        int hashCode2 = (hashCode + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        AtomDTO atomDTO2 = this.cancelButton;
        return hashCode2 + (atomDTO2 != null ? atomDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TipCourierReviewDTO(tips=" + this.tips + ", actionButton=" + this.actionButton + ", cancelButton=" + this.cancelButton + ")";
    }
}
