package ru.ozon.app.android.ugc.widgets.usersGradesV2.data;

import B4.V;
import Kk.C3532b;
import Nh.a;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002'(BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JZ\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO;", "", "items", "", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "separatorHeight", "", "color", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getSeparatorHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO;", "equals", "", "other", "hashCode", "toString", "ContextQuestionItemDTO", "ContextAnswerItem", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UsersGradesV2DTO {
    public static final int $stable = 8;
    private final String color;
    private final CornerRadius cornerRadius;

    @NotNull
    private final List<ContextQuestionItemDTO> items;
    private final Integer separatorHeight;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextAnswerItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "textValue", "progressColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;FLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getValue", "()F", "getTextValue", "getProgressColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContextAnswerItem {
        public static final int $stable = 0;
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

        public static /* synthetic */ ContextAnswerItem copy$default(ContextAnswerItem contextAnswerItem, TextDTO textDTO, float f7, TextDTO textDTO2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = contextAnswerItem.title;
            }
            if ((i11 & 2) != 0) {
                f7 = contextAnswerItem.value;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = contextAnswerItem.textValue;
            }
            if ((i11 & 8) != 0) {
                str = contextAnswerItem.progressColor;
            }
            return contextAnswerItem.copy(textDTO, f7, textDTO2, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getTextValue() {
            return this.textValue;
        }

        /* renamed from: component4, reason: from getter */
        public final String getProgressColor() {
            return this.progressColor;
        }

        @NotNull
        public final ContextAnswerItem copy(@NotNull TextDTO title, float value, @NotNull TextDTO textValue, String progressColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(textValue, "textValue");
            return new ContextAnswerItem(title, value, textValue, progressColor);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 Jn\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;", "", "foldedCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "unfoldedCell", "isUnfolded", "", "contextAnswers", "", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextAnswerItem;", "color", "", "rootBackgroundColor", "bottomPadding", "", "rootCornerRadius", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)V", "getFoldedCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getUnfoldedCell", "()Z", "getContextAnswers", "()Ljava/util/List;", "getColor", "()Ljava/lang/String;", "getRootBackgroundColor", "getBottomPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRootCornerRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)Lru/ozon/app/android/ugc/widgets/usersGradesV2/data/UsersGradesV2DTO$ContextQuestionItemDTO;", "equals", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContextQuestionItemDTO {
        public static final int $stable = 8;
        private final Integer bottomPadding;
        private final String color;
        private final List<ContextAnswerItem> contextAnswers;

        @NotNull
        private final CellDTO foldedCell;
        private final boolean isUnfolded;
        private final String rootBackgroundColor;
        private final Float rootCornerRadius;

        @NotNull
        private final CellDTO unfoldedCell;

        public ContextQuestionItemDTO(@NotNull CellDTO foldedCell, @NotNull CellDTO unfoldedCell, boolean z11, List<ContextAnswerItem> list, String str, String str2, Integer num, Float f7) {
            Intrinsics.checkNotNullParameter(foldedCell, "foldedCell");
            Intrinsics.checkNotNullParameter(unfoldedCell, "unfoldedCell");
            this.foldedCell = foldedCell;
            this.unfoldedCell = unfoldedCell;
            this.isUnfolded = z11;
            this.contextAnswers = list;
            this.color = str;
            this.rootBackgroundColor = str2;
            this.bottomPadding = num;
            this.rootCornerRadius = f7;
        }

        public static /* synthetic */ ContextQuestionItemDTO copy$default(ContextQuestionItemDTO contextQuestionItemDTO, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, List list, String str, String str2, Integer num, Float f7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = contextQuestionItemDTO.foldedCell;
            }
            if ((i11 & 2) != 0) {
                cellDTO2 = contextQuestionItemDTO.unfoldedCell;
            }
            if ((i11 & 4) != 0) {
                z11 = contextQuestionItemDTO.isUnfolded;
            }
            if ((i11 & 8) != 0) {
                list = contextQuestionItemDTO.contextAnswers;
            }
            if ((i11 & 16) != 0) {
                str = contextQuestionItemDTO.color;
            }
            if ((i11 & 32) != 0) {
                str2 = contextQuestionItemDTO.rootBackgroundColor;
            }
            if ((i11 & 64) != 0) {
                num = contextQuestionItemDTO.bottomPadding;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                f7 = contextQuestionItemDTO.rootCornerRadius;
            }
            Integer num2 = num;
            Float f11 = f7;
            String str3 = str;
            String str4 = str2;
            return contextQuestionItemDTO.copy(cellDTO, cellDTO2, z11, list, str3, str4, num2, f11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getFoldedCell() {
            return this.foldedCell;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getUnfoldedCell() {
            return this.unfoldedCell;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsUnfolded() {
            return this.isUnfolded;
        }

        public final List<ContextAnswerItem> component4() {
            return this.contextAnswers;
        }

        /* renamed from: component5, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRootBackgroundColor() {
            return this.rootBackgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component8, reason: from getter */
        public final Float getRootCornerRadius() {
            return this.rootCornerRadius;
        }

        @NotNull
        public final ContextQuestionItemDTO copy(@NotNull CellDTO foldedCell, @NotNull CellDTO unfoldedCell, boolean isUnfolded, List<ContextAnswerItem> contextAnswers, String color, String rootBackgroundColor, Integer bottomPadding, Float rootCornerRadius) {
            Intrinsics.checkNotNullParameter(foldedCell, "foldedCell");
            Intrinsics.checkNotNullParameter(unfoldedCell, "unfoldedCell");
            return new ContextQuestionItemDTO(foldedCell, unfoldedCell, isUnfolded, contextAnswers, color, rootBackgroundColor, bottomPadding, rootCornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContextQuestionItemDTO)) {
                return false;
            }
            ContextQuestionItemDTO contextQuestionItemDTO = (ContextQuestionItemDTO) other;
            return Intrinsics.d(this.foldedCell, contextQuestionItemDTO.foldedCell) && Intrinsics.d(this.unfoldedCell, contextQuestionItemDTO.unfoldedCell) && this.isUnfolded == contextQuestionItemDTO.isUnfolded && Intrinsics.d(this.contextAnswers, contextQuestionItemDTO.contextAnswers) && Intrinsics.d(this.color, contextQuestionItemDTO.color) && Intrinsics.d(this.rootBackgroundColor, contextQuestionItemDTO.rootBackgroundColor) && Intrinsics.d(this.bottomPadding, contextQuestionItemDTO.bottomPadding) && Intrinsics.d(this.rootCornerRadius, contextQuestionItemDTO.rootCornerRadius);
        }

        public final Integer getBottomPadding() {
            return this.bottomPadding;
        }

        public final String getColor() {
            return this.color;
        }

        public final List<ContextAnswerItem> getContextAnswers() {
            return this.contextAnswers;
        }

        @NotNull
        public final CellDTO getFoldedCell() {
            return this.foldedCell;
        }

        public final String getRootBackgroundColor() {
            return this.rootBackgroundColor;
        }

        public final Float getRootCornerRadius() {
            return this.rootCornerRadius;
        }

        @NotNull
        public final CellDTO getUnfoldedCell() {
            return this.unfoldedCell;
        }

        public int hashCode() {
            int a11 = C3532b.a(Bi.b.c(this.unfoldedCell, this.foldedCell.hashCode() * 31, 31), 31, this.isUnfolded);
            List<ContextAnswerItem> list = this.contextAnswers;
            int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rootBackgroundColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.bottomPadding;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Float f7 = this.rootCornerRadius;
            return hashCode4 + (f7 != null ? f7.hashCode() : 0);
        }

        public final boolean isUnfolded() {
            return this.isUnfolded;
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.foldedCell;
            CellDTO cellDTO2 = this.unfoldedCell;
            boolean z11 = this.isUnfolded;
            List<ContextAnswerItem> list = this.contextAnswers;
            String str = this.color;
            String str2 = this.rootBackgroundColor;
            Integer num = this.bottomPadding;
            Float f7 = this.rootCornerRadius;
            StringBuilder sb2 = new StringBuilder("ContextQuestionItemDTO(foldedCell=");
            sb2.append(cellDTO);
            sb2.append(", unfoldedCell=");
            sb2.append(cellDTO2);
            sb2.append(", isUnfolded=");
            sb2.append(z11);
            sb2.append(", contextAnswers=");
            sb2.append(list);
            sb2.append(", color=");
            a.h(sb2, str, ", rootBackgroundColor=", str2, ", bottomPadding=");
            sb2.append(num);
            sb2.append(", rootCornerRadius=");
            sb2.append(f7);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public UsersGradesV2DTO(@NotNull List<ContextQuestionItemDTO> items, CornerRadius cornerRadius, Integer num, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.cornerRadius = cornerRadius;
        this.separatorHeight = num;
        this.color = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ UsersGradesV2DTO copy$default(UsersGradesV2DTO usersGradesV2DTO, List list, CornerRadius cornerRadius, Integer num, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = usersGradesV2DTO.items;
        }
        if ((i11 & 2) != 0) {
            cornerRadius = usersGradesV2DTO.cornerRadius;
        }
        if ((i11 & 4) != 0) {
            num = usersGradesV2DTO.separatorHeight;
        }
        if ((i11 & 8) != 0) {
            str = usersGradesV2DTO.color;
        }
        if ((i11 & 16) != 0) {
            map = usersGradesV2DTO.trackingInfo;
        }
        Map map2 = map;
        Integer num2 = num;
        return usersGradesV2DTO.copy(list, cornerRadius, num2, str, map2);
    }

    @NotNull
    public final List<ContextQuestionItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSeparatorHeight() {
        return this.separatorHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final UsersGradesV2DTO copy(@NotNull List<ContextQuestionItemDTO> items, CornerRadius cornerRadius, Integer separatorHeight, String color, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new UsersGradesV2DTO(items, cornerRadius, separatorHeight, color, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsersGradesV2DTO)) {
            return false;
        }
        UsersGradesV2DTO usersGradesV2DTO = (UsersGradesV2DTO) other;
        return Intrinsics.d(this.items, usersGradesV2DTO.items) && this.cornerRadius == usersGradesV2DTO.cornerRadius && Intrinsics.d(this.separatorHeight, usersGradesV2DTO.separatorHeight) && Intrinsics.d(this.color, usersGradesV2DTO.color) && Intrinsics.d(this.trackingInfo, usersGradesV2DTO.trackingInfo);
    }

    public final String getColor() {
        return this.color;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final List<ContextQuestionItemDTO> getItems() {
        return this.items;
    }

    public final Integer getSeparatorHeight() {
        return this.separatorHeight;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Integer num = this.separatorHeight;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.color;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ContextQuestionItemDTO> list = this.items;
        CornerRadius cornerRadius = this.cornerRadius;
        Integer num = this.separatorHeight;
        String str = this.color;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("UsersGradesV2DTO(items=");
        sb2.append(list);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", separatorHeight=");
        V.f(num, ", color=", str, ", trackingInfo=", sb2);
        return P.f(sb2, map, ")");
    }
}
