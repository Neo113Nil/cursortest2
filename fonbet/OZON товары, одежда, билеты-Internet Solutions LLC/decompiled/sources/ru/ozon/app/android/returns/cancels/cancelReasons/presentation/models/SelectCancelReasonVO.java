package ru.ozon.app.android.returns.cancels.cancelReasons.presentation.models;

import D3.h;
import De.C2859b;
import G.g;
import Lh.b;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.cancels.cancelReasons.data.SelectCancelReasonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO;", "Ll20/c;", "", "getState", "()Ljava/lang/String;", "state", "SelectCancelReasonsVO", "StickyVO", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$SelectCancelReasonsVO;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$StickyVO;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SelectCancelReasonVO extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull SelectCancelReasonVO selectCancelReasonVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull SelectCancelReasonVO selectCancelReasonVO) {
            return selectCancelReasonVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$SelectCancelReasonsVO;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO;", "", "id", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cancelReasons", "Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;", "input", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "", "state", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "", "scrollWidgetKey", "<init>", "(JLjava/util/List;Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCancelReasons", "()Ljava/util/List;", "Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;", "getInput", "()Lru/ozon/app/android/returns/cancels/cancelReasons/data/SelectCancelReasonDTO$InputDTO;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Ljava/lang/String;", "getState", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "I", "getScrollWidgetKey", "()Ljava/lang/Integer;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectCancelReasonsVO implements SelectCancelReasonVO {

        @NotNull
        private final List<CellDTO> cancelReasons;
        private final DisclaimerDTO disclaimer;
        private final long id;
        private final SelectCancelReasonDTO.InputDTO input;
        private final int scrollWidgetKey;
        private final String state;
        private final TestInfo testInfo;

        public SelectCancelReasonsVO(long j11, @NotNull List<CellDTO> cancelReasons, SelectCancelReasonDTO.InputDTO inputDTO, DisclaimerDTO disclaimerDTO, String str, TestInfo testInfo, int i11) {
            Intrinsics.checkNotNullParameter(cancelReasons, "cancelReasons");
            this.id = j11;
            this.cancelReasons = cancelReasons;
            this.input = inputDTO;
            this.disclaimer = disclaimerDTO;
            this.state = str;
            this.testInfo = testInfo;
            this.scrollWidgetKey = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectCancelReasonsVO)) {
                return false;
            }
            SelectCancelReasonsVO selectCancelReasonsVO = (SelectCancelReasonsVO) other;
            return this.id == selectCancelReasonsVO.id && Intrinsics.d(this.cancelReasons, selectCancelReasonsVO.cancelReasons) && Intrinsics.d(this.input, selectCancelReasonsVO.input) && Intrinsics.d(this.disclaimer, selectCancelReasonsVO.disclaimer) && Intrinsics.d(this.state, selectCancelReasonsVO.state) && Intrinsics.d(this.testInfo, selectCancelReasonsVO.testInfo) && this.scrollWidgetKey == selectCancelReasonsVO.scrollWidgetKey;
        }

        @NotNull
        public final List<CellDTO> getCancelReasons() {
            return this.cancelReasons;
        }

        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final SelectCancelReasonDTO.InputDTO getInput() {
            return this.input;
        }

        @Override // l20.c
        @NotNull
        public Integer getScrollWidgetKey() {
            return Integer.valueOf(this.scrollWidgetKey);
        }

        @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.models.SelectCancelReasonVO
        public String getState() {
            return this.state;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.cancelReasons);
            SelectCancelReasonDTO.InputDTO inputDTO = this.input;
            int hashCode = (b11 + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            int hashCode2 = (hashCode + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
            String str = this.state;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return Integer.hashCode(this.scrollWidgetKey) + ((hashCode3 + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            List<CellDTO> list = this.cancelReasons;
            SelectCancelReasonDTO.InputDTO inputDTO = this.input;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            String str = this.state;
            TestInfo testInfo = this.testInfo;
            int i11 = this.scrollWidgetKey;
            StringBuilder b11 = b.b(j11, "SelectCancelReasonsVO(id=", ", cancelReasons=", list);
            b11.append(", input=");
            b11.append(inputDTO);
            b11.append(", disclaimer=");
            b11.append(disclaimerDTO);
            b11.append(", state=");
            b11.append(str);
            b11.append(", testInfo=");
            b11.append(testInfo);
            return h.b(b11, ", scrollWidgetKey=", i11, ")");
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$StickyVO;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/text/TextDTO;", "caption", "", "state", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getState", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyVO implements SelectCancelReasonVO {

        @NotNull
        private final ButtonV3DTO button;
        private final TextDTO caption;
        private final CellDTO cell;
        private final long id;
        private final String state;

        public StickyVO(long j11, CellDTO cellDTO, @NotNull ButtonV3DTO button, TextDTO textDTO, String str) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.id = j11;
            this.cell = cellDTO;
            this.button = button;
            this.caption = textDTO;
            this.state = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyVO)) {
                return false;
            }
            StickyVO stickyVO = (StickyVO) other;
            return this.id == stickyVO.id && Intrinsics.d(this.cell, stickyVO.cell) && Intrinsics.d(this.button, stickyVO.button) && Intrinsics.d(this.caption, stickyVO.caption) && Intrinsics.d(this.state, stickyVO.state);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final TextDTO getCaption() {
            return this.caption;
        }

        public final CellDTO getCell() {
            return this.cell;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.models.SelectCancelReasonVO
        public String getState() {
            return this.state;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            CellDTO cellDTO = this.cell;
            int c11 = C2859b.c(this.button, (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.caption;
            int hashCode2 = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.state;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            CellDTO cellDTO = this.cell;
            ButtonV3DTO buttonV3DTO = this.button;
            TextDTO textDTO = this.caption;
            String str = this.state;
            StringBuilder e11 = h.e("StickyVO(id=", j11, ", cell=", cellDTO);
            e11.append(", button=");
            e11.append(buttonV3DTO);
            e11.append(", caption=");
            e11.append(textDTO);
            return C6594f.a(", state=", str, ")", e11);
        }
    }

    String getState();
}
