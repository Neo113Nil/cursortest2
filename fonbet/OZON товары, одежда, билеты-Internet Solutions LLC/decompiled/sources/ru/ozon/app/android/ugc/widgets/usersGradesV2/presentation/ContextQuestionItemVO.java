package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import B0.C2454a;
import D3.h;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001<B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jv\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b\t\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103R\u0017\u00104\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%R\u001f\u00108\u001a\n\u0018\u000106j\u0004\u0018\u0001`78\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "foldedCell", "unfoldedCell", "", "isUnfolded", "", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO$ContextAnswerItem;", "contextAnswers", "", "itemBackgroundColor", "rootBackgroundColor", "", "bottomPadding", "", "rootCornerRadius", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;IF)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;IF)Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getFoldedCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getUnfoldedCell", "Z", "()Z", "Ljava/util/List;", "getContextAnswers", "()Ljava/util/List;", "Ljava/lang/String;", "getItemBackgroundColor", "getRootBackgroundColor", "I", "getBottomPadding", "F", "getRootCornerRadius", "()F", "cell", "getCell", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "cellTokenizedEvent", "LWZ/t;", "getCellTokenizedEvent", "()LWZ/t;", "ContextAnswerItem", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ContextQuestionItemVO implements c {
    private final int bottomPadding;

    @NotNull
    private final CellDTO cell;
    private final t cellTokenizedEvent;
    private final List<ContextAnswerItem> contextAnswers;

    @NotNull
    private final CellDTO foldedCell;
    private final long id;
    private final boolean isUnfolded;
    private final String itemBackgroundColor;
    private final String rootBackgroundColor;
    private final float rootCornerRadius;

    @NotNull
    private final CellDTO unfoldedCell;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO$ContextAnswerItem;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "textValue", "", "progressColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;FLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "F", "getValue", "()F", "getTextValue", "Ljava/lang/String;", "getProgressColor", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContextAnswerItem {
        private final String progressColor;

        @NotNull
        private final TextDTO textValue;

        @NotNull
        private final TextDTO title;
        private final float value;

        public ContextAnswerItem(@NotNull TextDTO title, float f7, @NotNull TextDTO textValue, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(textValue, "textValue");
            this.title = title;
            this.value = f7;
            this.textValue = textValue;
            this.progressColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContextAnswerItem)) {
                return false;
            }
            ContextAnswerItem contextAnswerItem = (ContextAnswerItem) other;
            return Intrinsics.d(this.title, contextAnswerItem.title) && Float.compare(this.value, contextAnswerItem.value) == 0 && Intrinsics.d(this.textValue, contextAnswerItem.textValue) && Intrinsics.d(this.progressColor, contextAnswerItem.progressColor);
        }

        public final String getProgressColor() {
            return this.progressColor;
        }

        @NotNull
        public final TextDTO getTextValue() {
            return this.textValue;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = b.a(this.textValue, Pk0.b.a(this.value, this.title.hashCode() * 31, 31), 31);
            String str = this.progressColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "ContextAnswerItem(title=" + this.title + ", value=" + this.value + ", textValue=" + this.textValue + ", progressColor=" + this.progressColor + ")";
        }
    }

    public ContextQuestionItemVO(long j11, @NotNull CellDTO foldedCell, @NotNull CellDTO unfoldedCell, boolean z11, List<ContextAnswerItem> list, String str, String str2, int i11, float f7) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(foldedCell, "foldedCell");
        Intrinsics.checkNotNullParameter(unfoldedCell, "unfoldedCell");
        this.id = j11;
        this.foldedCell = foldedCell;
        this.unfoldedCell = unfoldedCell;
        this.isUnfolded = z11;
        this.contextAnswers = list;
        this.itemBackgroundColor = str;
        this.rootBackgroundColor = str2;
        this.bottomPadding = i11;
        this.rootCornerRadius = f7;
        foldedCell = z11 ? unfoldedCell : foldedCell;
        this.cell = foldedCell;
        CommonControlSettings common = foldedCell.getCommon();
        t tVar = null;
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(getId()), null, 2, null);
        }
        this.cellTokenizedEvent = tVar;
    }

    public static /* synthetic */ ContextQuestionItemVO copy$default(ContextQuestionItemVO contextQuestionItemVO, long j11, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, List list, String str, String str2, int i11, float f7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = contextQuestionItemVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            cellDTO = contextQuestionItemVO.foldedCell;
        }
        CellDTO cellDTO3 = cellDTO;
        if ((i12 & 4) != 0) {
            cellDTO2 = contextQuestionItemVO.unfoldedCell;
        }
        return contextQuestionItemVO.copy(j12, cellDTO3, cellDTO2, (i12 & 8) != 0 ? contextQuestionItemVO.isUnfolded : z11, (i12 & 16) != 0 ? contextQuestionItemVO.contextAnswers : list, (i12 & 32) != 0 ? contextQuestionItemVO.itemBackgroundColor : str, (i12 & 64) != 0 ? contextQuestionItemVO.rootBackgroundColor : str2, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? contextQuestionItemVO.bottomPadding : i11, (i12 & 256) != 0 ? contextQuestionItemVO.rootCornerRadius : f7);
    }

    @NotNull
    public final ContextQuestionItemVO copy(long id2, @NotNull CellDTO foldedCell, @NotNull CellDTO unfoldedCell, boolean isUnfolded, List<ContextAnswerItem> contextAnswers, String itemBackgroundColor, String rootBackgroundColor, int bottomPadding, float rootCornerRadius) {
        Intrinsics.checkNotNullParameter(foldedCell, "foldedCell");
        Intrinsics.checkNotNullParameter(unfoldedCell, "unfoldedCell");
        return new ContextQuestionItemVO(id2, foldedCell, unfoldedCell, isUnfolded, contextAnswers, itemBackgroundColor, rootBackgroundColor, bottomPadding, rootCornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextQuestionItemVO)) {
            return false;
        }
        ContextQuestionItemVO contextQuestionItemVO = (ContextQuestionItemVO) other;
        return this.id == contextQuestionItemVO.id && Intrinsics.d(this.foldedCell, contextQuestionItemVO.foldedCell) && Intrinsics.d(this.unfoldedCell, contextQuestionItemVO.unfoldedCell) && this.isUnfolded == contextQuestionItemVO.isUnfolded && Intrinsics.d(this.contextAnswers, contextQuestionItemVO.contextAnswers) && Intrinsics.d(this.itemBackgroundColor, contextQuestionItemVO.itemBackgroundColor) && Intrinsics.d(this.rootBackgroundColor, contextQuestionItemVO.rootBackgroundColor) && this.bottomPadding == contextQuestionItemVO.bottomPadding && Float.compare(this.rootCornerRadius, contextQuestionItemVO.rootCornerRadius) == 0;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final t getCellTokenizedEvent() {
        return this.cellTokenizedEvent;
    }

    public final List<ContextAnswerItem> getContextAnswers() {
        return this.contextAnswers;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getItemBackgroundColor() {
        return this.itemBackgroundColor;
    }

    public final String getRootBackgroundColor() {
        return this.rootBackgroundColor;
    }

    public final float getRootCornerRadius() {
        return this.rootCornerRadius;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(Bi.b.c(this.unfoldedCell, Bi.b.c(this.foldedCell, Long.hashCode(this.id) * 31, 31), 31), 31, this.isUnfolded);
        List<ContextAnswerItem> list = this.contextAnswers;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.itemBackgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rootBackgroundColor;
        return Float.hashCode(this.rootCornerRadius) + C2454a.a(this.bottomPadding, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    /* renamed from: isUnfolded, reason: from getter */
    public final boolean getIsUnfolded() {
        return this.isUnfolded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.foldedCell;
        CellDTO cellDTO2 = this.unfoldedCell;
        boolean z11 = this.isUnfolded;
        List<ContextAnswerItem> list = this.contextAnswers;
        String str = this.itemBackgroundColor;
        String str2 = this.rootBackgroundColor;
        int i11 = this.bottomPadding;
        float f7 = this.rootCornerRadius;
        StringBuilder e11 = h.e("ContextQuestionItemVO(id=", j11, ", foldedCell=", cellDTO);
        e11.append(", unfoldedCell=");
        e11.append(cellDTO2);
        e11.append(", isUnfolded=");
        e11.append(z11);
        e11.append(", contextAnswers=");
        e11.append(list);
        e11.append(", itemBackgroundColor=");
        e11.append(str);
        e11.append(", rootBackgroundColor=");
        e11.append(str2);
        e11.append(", bottomPadding=");
        e11.append(i11);
        e11.append(", rootCornerRadius=");
        e11.append(f7);
        e11.append(")");
        return e11.toString();
    }
}
