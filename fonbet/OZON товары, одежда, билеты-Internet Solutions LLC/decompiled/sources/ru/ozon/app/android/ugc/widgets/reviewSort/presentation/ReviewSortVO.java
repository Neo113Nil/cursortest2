package ru.ozon.app.android.ugc.widgets.reviewSort.presentation;

import B0.C2454a;
import De.C2859b;
import G.g;
import TY.a;
import Tl.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017Jx\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b9\u0010\u001b¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "applyButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "selectItemIndex", "initialFilterId", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;ILjava/lang/String;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;ILjava/lang/String;)Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getApplyButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getSelectItemIndex", "getInitialFilterId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewSortVO implements c {

    @NotNull
    private final ButtonV3DTO applyButton;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<CellDTO> cells;

    @NotNull
    private final CornerRadius cornerRadius;
    private final long id;

    @NotNull
    private final String initialFilterId;
    private final int selectItemIndex;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    public ReviewSortVO(long j11, @NotNull TextDTO title, @NotNull List<CellDTO> cells, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull ButtonV3DTO applyButton, t tVar, int i11, @NotNull String initialFilterId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(initialFilterId, "initialFilterId");
        this.id = j11;
        this.title = title;
        this.cells = cells;
        this.backgroundColor = backgroundColor;
        this.cornerRadius = cornerRadius;
        this.applyButton = applyButton;
        this.tokenizedEvent = tVar;
        this.selectItemIndex = i11;
        this.initialFilterId = initialFilterId;
    }

    public static /* synthetic */ ReviewSortVO copy$default(ReviewSortVO reviewSortVO, long j11, TextDTO textDTO, List list, String str, CornerRadius cornerRadius, ButtonV3DTO buttonV3DTO, t tVar, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = reviewSortVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            textDTO = reviewSortVO.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i12 & 4) != 0) {
            list = reviewSortVO.cells;
        }
        return reviewSortVO.copy(j12, textDTO2, list, (i12 & 8) != 0 ? reviewSortVO.backgroundColor : str, (i12 & 16) != 0 ? reviewSortVO.cornerRadius : cornerRadius, (i12 & 32) != 0 ? reviewSortVO.applyButton : buttonV3DTO, (i12 & 64) != 0 ? reviewSortVO.tokenizedEvent : tVar, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewSortVO.selectItemIndex : i11, (i12 & 256) != 0 ? reviewSortVO.initialFilterId : str2);
    }

    @NotNull
    public final ReviewSortVO copy(long id2, @NotNull TextDTO title, @NotNull List<CellDTO> cells, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull ButtonV3DTO applyButton, t tokenizedEvent, int selectItemIndex, @NotNull String initialFilterId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(initialFilterId, "initialFilterId");
        return new ReviewSortVO(id2, title, cells, backgroundColor, cornerRadius, applyButton, tokenizedEvent, selectItemIndex, initialFilterId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewSortVO)) {
            return false;
        }
        ReviewSortVO reviewSortVO = (ReviewSortVO) other;
        return this.id == reviewSortVO.id && Intrinsics.d(this.title, reviewSortVO.title) && Intrinsics.d(this.cells, reviewSortVO.cells) && Intrinsics.d(this.backgroundColor, reviewSortVO.backgroundColor) && this.cornerRadius == reviewSortVO.cornerRadius && Intrinsics.d(this.applyButton, reviewSortVO.applyButton) && Intrinsics.d(this.tokenizedEvent, reviewSortVO.tokenizedEvent) && this.selectItemIndex == reviewSortVO.selectItemIndex && Intrinsics.d(this.initialFilterId, reviewSortVO.initialFilterId);
    }

    @NotNull
    public final ButtonV3DTO getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getInitialFilterId() {
        return this.initialFilterId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectItemIndex() {
        return this.selectItemIndex;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.applyButton, b.b(this.cornerRadius, g.a(g.b(Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.cells), 31, this.backgroundColor), 31), 31);
        t tVar = this.tokenizedEvent;
        return this.initialFilterId.hashCode() + C2454a.a(this.selectItemIndex, (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<CellDTO> list = this.cells;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        ButtonV3DTO buttonV3DTO = this.applyButton;
        t tVar = this.tokenizedEvent;
        int i11 = this.selectItemIndex;
        String str2 = this.initialFilterId;
        StringBuilder b11 = a.b("ReviewSortVO(id=", j11, ", title=", textDTO);
        b11.append(", cells=");
        b11.append(list);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", cornerRadius=");
        b11.append(cornerRadius);
        b11.append(", applyButton=");
        b11.append(buttonV3DTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", selectItemIndex=");
        b11.append(i11);
        return C6594f.a(", initialFilterId=", str2, ")", b11);
    }
}
