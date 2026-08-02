package ru.ozon.app.android.deliveryreview.deliveryReviewForm.data;

import B0.C2454a;
import B90.C2618u;
import Cm.e;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Tl.b;
import Ve.C4636t5;
import Xc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0081\b\u0018\u00002\u00020\u0001:\u0001-BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;", "", "disabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "showRating", "selectedRating", "", "changeRatingAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", DynamicElementDTO.FORM, "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getShowRating", "getSelectedRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChangeRatingAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getForm", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;", "equals", "other", "hashCode", "toString", "Form", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryReviewFormDTO {
    private final ButtonV3Atom.LargeButton button;
    private final AtomActionDTO changeRatingAction;
    private final Boolean disabled;
    private final Form form;
    private final Integer selectedRating;
    private final Boolean showRating;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003#$%B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;", "", "ratingTitle", "", "required", "", "annotations", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Annotations;", "groups", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;", "trailingGroup", "<init>", "(Ljava/lang/String;ZLru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Annotations;Ljava/util/List;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;)V", "getRatingTitle", "()Ljava/lang/String;", "getRequired", "()Z", "getAnnotations", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Annotations;", "getGroups", "()Ljava/util/List;", "getTrailingGroup", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Annotations", "Group", "Component", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Form {
        private final Annotations annotations;
        private final List<Group> groups;
        private final String ratingTitle;
        private final boolean required;
        private final Group trailingGroup;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Annotations;", "", "default", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "emptyError", "emptyWithCheckboxError", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "getDefault", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getEmptyError", "getEmptyWithCheckboxError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Annotations {
            private final DisclaimerAtom default;
            private final DisclaimerAtom emptyError;
            private final DisclaimerAtom emptyWithCheckboxError;

            public Annotations(DisclaimerAtom disclaimerAtom, DisclaimerAtom disclaimerAtom2, DisclaimerAtom disclaimerAtom3) {
                this.default = disclaimerAtom;
                this.emptyError = disclaimerAtom2;
                this.emptyWithCheckboxError = disclaimerAtom3;
            }

            public static /* synthetic */ Annotations copy$default(Annotations annotations, DisclaimerAtom disclaimerAtom, DisclaimerAtom disclaimerAtom2, DisclaimerAtom disclaimerAtom3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    disclaimerAtom = annotations.default;
                }
                if ((i11 & 2) != 0) {
                    disclaimerAtom2 = annotations.emptyError;
                }
                if ((i11 & 4) != 0) {
                    disclaimerAtom3 = annotations.emptyWithCheckboxError;
                }
                return annotations.copy(disclaimerAtom, disclaimerAtom2, disclaimerAtom3);
            }

            /* renamed from: component1, reason: from getter */
            public final DisclaimerAtom getDefault() {
                return this.default;
            }

            /* renamed from: component2, reason: from getter */
            public final DisclaimerAtom getEmptyError() {
                return this.emptyError;
            }

            /* renamed from: component3, reason: from getter */
            public final DisclaimerAtom getEmptyWithCheckboxError() {
                return this.emptyWithCheckboxError;
            }

            @NotNull
            public final Annotations copy(DisclaimerAtom r22, DisclaimerAtom emptyError, DisclaimerAtom emptyWithCheckboxError) {
                return new Annotations(r22, emptyError, emptyWithCheckboxError);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Annotations)) {
                    return false;
                }
                Annotations annotations = (Annotations) other;
                return Intrinsics.d(this.default, annotations.default) && Intrinsics.d(this.emptyError, annotations.emptyError) && Intrinsics.d(this.emptyWithCheckboxError, annotations.emptyWithCheckboxError);
            }

            public final DisclaimerAtom getDefault() {
                return this.default;
            }

            public final DisclaimerAtom getEmptyError() {
                return this.emptyError;
            }

            public final DisclaimerAtom getEmptyWithCheckboxError() {
                return this.emptyWithCheckboxError;
            }

            public int hashCode() {
                DisclaimerAtom disclaimerAtom = this.default;
                int hashCode = (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode()) * 31;
                DisclaimerAtom disclaimerAtom2 = this.emptyError;
                int hashCode2 = (hashCode + (disclaimerAtom2 == null ? 0 : disclaimerAtom2.hashCode())) * 31;
                DisclaimerAtom disclaimerAtom3 = this.emptyWithCheckboxError;
                return hashCode2 + (disclaimerAtom3 != null ? disclaimerAtom3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Annotations(default=" + this.default + ", emptyError=" + this.emptyError + ", emptyWithCheckboxError=" + this.emptyWithCheckboxError + ")";
            }
        }

        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\bSTUVWXYZB\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003JÀ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006["}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component;", "", "id", "", "type", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentType;", "validate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentValidation;", FormPageDTO.Field.FIELD_TYPE_HIDDEN, "", "controllingComponentId", "selectControllingComponentId", "checkbox", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Checkbox;", FormPageDTO.Field.FIELD_TYPE_RADIO, "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Radio;", "gallery", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "carousel", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel;", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "list", "Lru/ozon/app/android/atoms/data/list/BulletListAtom;", "textarea", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Textarea;", "toggle", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Toggle;", "uploadPhotos", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$UploadPhotos;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentType;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentValidation;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Checkbox;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Radio;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/list/BulletListAtom;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Textarea;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Toggle;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$UploadPhotos;)V", "getId", "()Ljava/lang/String;", "getType", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentType;", "getValidate", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentValidation;", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getControllingComponentId", "getSelectControllingComponentId", "getCheckbox", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Checkbox;", "getRadio", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Radio;", "getGallery", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getCarousel", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getList", "()Lru/ozon/app/android/atoms/data/list/BulletListAtom;", "getTextarea", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Textarea;", "getToggle", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Toggle;", "getUploadPhotos", "()Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$UploadPhotos;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentType;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentValidation;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Checkbox;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Radio;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/list/BulletListAtom;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Textarea;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Toggle;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$UploadPhotos;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component;", "equals", "other", "hashCode", "", "toString", "Checkbox", "Radio", "Carousel", "Textarea", "Toggle", "UploadPhotos", "ComponentValidation", "ComponentType", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Component {
            private final Carousel carousel;
            private final Checkbox checkbox;
            private final String controllingComponentId;
            private final ButtonV3Atom.LargeBorderlessButton gallery;
            private final Boolean hidden;

            @NotNull
            private final String id;
            private final BulletListAtom list;
            private final Radio radio;
            private final String selectControllingComponentId;
            private final TextAtom text;
            private final Textarea textarea;
            private final Toggle toggle;
            private final ComponentType type;
            private final UploadPhotos uploadPhotos;
            private final ComponentValidation validate;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J6\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "list", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel$Item;", "multiple", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getMultiple", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel;", "equals", "other", "hashCode", "", "toString", "Item", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class Carousel {

                @NotNull
                private final List<Item> list;
                private final Boolean multiple;
                private final String title;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel$Item;", "", "id", "", "image", "text", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getImage", "getText", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Carousel$Item;", "equals", "other", "hashCode", "", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Item {
                    private final String id;
                    private final String image;
                    private final Boolean isSelected;
                    private final String text;

                    public Item(String str, String str2, String str3, Boolean bool) {
                        this.id = str;
                        this.image = str2;
                        this.text = str3;
                        this.isSelected = bool;
                    }

                    public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, Boolean bool, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = item.id;
                        }
                        if ((i11 & 2) != 0) {
                            str2 = item.image;
                        }
                        if ((i11 & 4) != 0) {
                            str3 = item.text;
                        }
                        if ((i11 & 8) != 0) {
                            bool = item.isSelected;
                        }
                        return item.copy(str, str2, str3, bool);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getId() {
                        return this.id;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getImage() {
                        return this.image;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getText() {
                        return this.text;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final Boolean getIsSelected() {
                        return this.isSelected;
                    }

                    @NotNull
                    public final Item copy(String id2, String image, String text, Boolean isSelected) {
                        return new Item(id2, image, text, isSelected);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Item)) {
                            return false;
                        }
                        Item item = (Item) other;
                        return Intrinsics.d(this.id, item.id) && Intrinsics.d(this.image, item.image) && Intrinsics.d(this.text, item.text) && Intrinsics.d(this.isSelected, item.isSelected);
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final String getImage() {
                        return this.image;
                    }

                    public final String getText() {
                        return this.text;
                    }

                    public int hashCode() {
                        String str = this.id;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.image;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.text;
                        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        Boolean bool = this.isSelected;
                        return hashCode3 + (bool != null ? bool.hashCode() : 0);
                    }

                    public final Boolean isSelected() {
                        return this.isSelected;
                    }

                    @NotNull
                    public String toString() {
                        String str = this.id;
                        String str2 = this.image;
                        String str3 = this.text;
                        Boolean bool = this.isSelected;
                        StringBuilder d11 = C3660k.d("Item(id=", str, ", image=", str2, ", text=");
                        d11.append(str3);
                        d11.append(", isSelected=");
                        d11.append(bool);
                        d11.append(")");
                        return d11.toString();
                    }
                }

                public Carousel(String str, @NotNull List<Item> list, Boolean bool) {
                    Intrinsics.checkNotNullParameter(list, "list");
                    this.title = str;
                    this.list = list;
                    this.multiple = bool;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, List list, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = carousel.title;
                    }
                    if ((i11 & 2) != 0) {
                        list = carousel.list;
                    }
                    if ((i11 & 4) != 0) {
                        bool = carousel.multiple;
                    }
                    return carousel.copy(str, list, bool);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final List<Item> component2() {
                    return this.list;
                }

                /* renamed from: component3, reason: from getter */
                public final Boolean getMultiple() {
                    return this.multiple;
                }

                @NotNull
                public final Carousel copy(String title, @NotNull List<Item> list, Boolean multiple) {
                    Intrinsics.checkNotNullParameter(list, "list");
                    return new Carousel(title, list, multiple);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Carousel)) {
                        return false;
                    }
                    Carousel carousel = (Carousel) other;
                    return Intrinsics.d(this.title, carousel.title) && Intrinsics.d(this.list, carousel.list) && Intrinsics.d(this.multiple, carousel.multiple);
                }

                @NotNull
                public final List<Item> getList() {
                    return this.list;
                }

                public final Boolean getMultiple() {
                    return this.multiple;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    String str = this.title;
                    int b11 = g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.list);
                    Boolean bool = this.multiple;
                    return b11 + (bool != null ? bool.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    List<Item> list = this.list;
                    return D3.g.d(b.f("Carousel(title=", str, ", list=", ", multiple=", list), this.multiple, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Checkbox;", "", "text", "", "isSelected", "", "informers", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInformers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Checkbox;", "equals", "other", "hashCode", "", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Checkbox {
                private final List<TextDTO> informers;
                private final Boolean isSelected;

                @NotNull
                private final String text;

                public Checkbox(@NotNull String text, Boolean bool, List<TextDTO> list) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.isSelected = bool;
                    this.informers = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, String str, Boolean bool, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = checkbox.text;
                    }
                    if ((i11 & 2) != 0) {
                        bool = checkbox.isSelected;
                    }
                    if ((i11 & 4) != 0) {
                        list = checkbox.informers;
                    }
                    return checkbox.copy(str, bool, list);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final Boolean getIsSelected() {
                    return this.isSelected;
                }

                public final List<TextDTO> component3() {
                    return this.informers;
                }

                @NotNull
                public final Checkbox copy(@NotNull String text, Boolean isSelected, List<TextDTO> informers) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Checkbox(text, isSelected, informers);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Checkbox)) {
                        return false;
                    }
                    Checkbox checkbox = (Checkbox) other;
                    return Intrinsics.d(this.text, checkbox.text) && Intrinsics.d(this.isSelected, checkbox.isSelected) && Intrinsics.d(this.informers, checkbox.informers);
                }

                public final List<TextDTO> getInformers() {
                    return this.informers;
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    Boolean bool = this.isSelected;
                    int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                    List<TextDTO> list = this.informers;
                    return hashCode2 + (list != null ? list.hashCode() : 0);
                }

                public final Boolean isSelected() {
                    return this.isSelected;
                }

                @NotNull
                public String toString() {
                    String str = this.text;
                    Boolean bool = this.isSelected;
                    List<TextDTO> list = this.informers;
                    StringBuilder sb2 = new StringBuilder("Checkbox(text=");
                    sb2.append(str);
                    sb2.append(", isSelected=");
                    sb2.append(bool);
                    sb2.append(", informers=");
                    return C2618u.h(sb2, list, ")");
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentType;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKBOX", "RADIO", "UPLOAD_PHOTOS", "GALLERY", "CAROUSEL", "TEXT", "LIST", "TEXTAREA", "TOGGLE", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ComponentType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ ComponentType[] $VALUES;

                @i(name = "CHECKBOX")
                public static final ComponentType CHECKBOX = new ComponentType("CHECKBOX", 0);

                @i(name = "RADIO")
                public static final ComponentType RADIO = new ComponentType("RADIO", 1);

                @i(name = "UPLOAD_PHOTOS")
                public static final ComponentType UPLOAD_PHOTOS = new ComponentType("UPLOAD_PHOTOS", 2);

                @i(name = "GALLERY")
                public static final ComponentType GALLERY = new ComponentType("GALLERY", 3);

                @i(name = "CAROUSEL")
                public static final ComponentType CAROUSEL = new ComponentType("CAROUSEL", 4);

                @i(name = "TEXT")
                public static final ComponentType TEXT = new ComponentType("TEXT", 5);

                @i(name = "LIST")
                public static final ComponentType LIST = new ComponentType("LIST", 6);

                @i(name = "TEXTAREA")
                public static final ComponentType TEXTAREA = new ComponentType("TEXTAREA", 7);

                @i(name = "TOGGLE")
                public static final ComponentType TOGGLE = new ComponentType("TOGGLE", 8);

                private static final /* synthetic */ ComponentType[] $values() {
                    return new ComponentType[]{CHECKBOX, RADIO, UPLOAD_PHOTOS, GALLERY, CAROUSEL, TEXT, LIST, TEXTAREA, TOGGLE};
                }

                static {
                    ComponentType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private ComponentType(String str, int i11) {
                }

                public static ComponentType valueOf(String str) {
                    return (ComponentType) Enum.valueOf(ComponentType.class, str);
                }

                public static ComponentType[] values() {
                    return (ComponentType[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentValidation;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRE", "EXCLUDE", "REQUIRE_WHEN_VISIBLE", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ComponentValidation {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ ComponentValidation[] $VALUES;

                @i(name = "REQUIRE")
                public static final ComponentValidation REQUIRE = new ComponentValidation("REQUIRE", 0);

                @i(name = "EXCLUDE")
                public static final ComponentValidation EXCLUDE = new ComponentValidation("EXCLUDE", 1);

                @i(name = "REQUIRE_WHEN_VISIBLE")
                public static final ComponentValidation REQUIRE_WHEN_VISIBLE = new ComponentValidation("REQUIRE_WHEN_VISIBLE", 2);

                private static final /* synthetic */ ComponentValidation[] $values() {
                    return new ComponentValidation[]{REQUIRE, EXCLUDE, REQUIRE_WHEN_VISIBLE};
                }

                static {
                    ComponentValidation[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private ComponentValidation(String str, int i11) {
                }

                public static ComponentValidation valueOf(String str) {
                    return (ComponentValidation) Enum.valueOf(ComponentValidation.class, str);
                }

                public static ComponentValidation[] values() {
                    return (ComponentValidation[]) $VALUES.clone();
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Radio;", "", "text", "", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getText", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Radio;", "equals", "other", "hashCode", "", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Radio {
                private final Boolean isSelected;

                @NotNull
                private final String text;

                public Radio(@NotNull String text, Boolean bool) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.isSelected = bool;
                }

                public static /* synthetic */ Radio copy$default(Radio radio, String str, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = radio.text;
                    }
                    if ((i11 & 2) != 0) {
                        bool = radio.isSelected;
                    }
                    return radio.copy(str, bool);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final Boolean getIsSelected() {
                    return this.isSelected;
                }

                @NotNull
                public final Radio copy(@NotNull String text, Boolean isSelected) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Radio(text, isSelected);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Radio)) {
                        return false;
                    }
                    Radio radio = (Radio) other;
                    return Intrinsics.d(this.text, radio.text) && Intrinsics.d(this.isSelected, radio.isSelected);
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    Boolean bool = this.isSelected;
                    return hashCode + (bool == null ? 0 : bool.hashCode());
                }

                public final Boolean isSelected() {
                    return this.isSelected;
                }

                @NotNull
                public String toString() {
                    return "Radio(text=" + this.text + ", isSelected=" + this.isSelected + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Textarea;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "hint", AppMeasurementSdk.ConditionalUserProperty.VALUE, CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Ljava/lang/String;", "getHint", "getValue", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Textarea {
                private final TextDTO header;

                @NotNull
                private final String hint;
                private final String title;
                private final String value;

                public Textarea(String str, @NotNull String hint, String str2, TextDTO textDTO) {
                    Intrinsics.checkNotNullParameter(hint, "hint");
                    this.title = str;
                    this.hint = hint;
                    this.value = str2;
                    this.header = textDTO;
                }

                public static /* synthetic */ Textarea copy$default(Textarea textarea, String str, String str2, String str3, TextDTO textDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = textarea.title;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = textarea.hint;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = textarea.value;
                    }
                    if ((i11 & 8) != 0) {
                        textDTO = textarea.header;
                    }
                    return textarea.copy(str, str2, str3, textDTO);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getHint() {
                    return this.hint;
                }

                /* renamed from: component3, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                /* renamed from: component4, reason: from getter */
                public final TextDTO getHeader() {
                    return this.header;
                }

                @NotNull
                public final Textarea copy(String title, @NotNull String hint, String value, TextDTO header) {
                    Intrinsics.checkNotNullParameter(hint, "hint");
                    return new Textarea(title, hint, value, header);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Textarea)) {
                        return false;
                    }
                    Textarea textarea = (Textarea) other;
                    return Intrinsics.d(this.title, textarea.title) && Intrinsics.d(this.hint, textarea.hint) && Intrinsics.d(this.value, textarea.value) && Intrinsics.d(this.header, textarea.header);
                }

                public final TextDTO getHeader() {
                    return this.header;
                }

                @NotNull
                public final String getHint() {
                    return this.hint;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    String str = this.title;
                    int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.hint);
                    String str2 = this.value;
                    int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    TextDTO textDTO = this.header;
                    return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    String str2 = this.hint;
                    String str3 = this.value;
                    TextDTO textDTO = this.header;
                    StringBuilder d11 = C3660k.d("Textarea(title=", str, ", hint=", str2, ", value=");
                    d11.append(str3);
                    d11.append(", header=");
                    d11.append(textDTO);
                    d11.append(")");
                    return d11.toString();
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Toggle;", "", "text", "", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getText", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$Toggle;", "equals", "other", "hashCode", "", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Toggle {
                private final Boolean isSelected;

                @NotNull
                private final String text;

                public Toggle(@NotNull String text, Boolean bool) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.isSelected = bool;
                }

                public static /* synthetic */ Toggle copy$default(Toggle toggle, String str, Boolean bool, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = toggle.text;
                    }
                    if ((i11 & 2) != 0) {
                        bool = toggle.isSelected;
                    }
                    return toggle.copy(str, bool);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final Boolean getIsSelected() {
                    return this.isSelected;
                }

                @NotNull
                public final Toggle copy(@NotNull String text, Boolean isSelected) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Toggle(text, isSelected);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Toggle)) {
                        return false;
                    }
                    Toggle toggle = (Toggle) other;
                    return Intrinsics.d(this.text, toggle.text) && Intrinsics.d(this.isSelected, toggle.isSelected);
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    Boolean bool = this.isSelected;
                    return hashCode + (bool == null ? 0 : bool.hashCode());
                }

                public final Boolean isSelected() {
                    return this.isSelected;
                }

                @NotNull
                public String toString() {
                    return "Toggle(text=" + this.text + ", isSelected=" + this.isSelected + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$UploadPhotos;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "limit", "", "values", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getLimit", "()I", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UploadPhotos {
                private final int limit;
                private final String title;
                private final List<String> values;

                public UploadPhotos(String str, int i11, List<String> list) {
                    this.title = str;
                    this.limit = i11;
                    this.values = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ UploadPhotos copy$default(UploadPhotos uploadPhotos, String str, int i11, List list, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = uploadPhotos.title;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = uploadPhotos.limit;
                    }
                    if ((i12 & 4) != 0) {
                        list = uploadPhotos.values;
                    }
                    return uploadPhotos.copy(str, i11, list);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final int getLimit() {
                    return this.limit;
                }

                public final List<String> component3() {
                    return this.values;
                }

                @NotNull
                public final UploadPhotos copy(String title, int limit, List<String> values) {
                    return new UploadPhotos(title, limit, values);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UploadPhotos)) {
                        return false;
                    }
                    UploadPhotos uploadPhotos = (UploadPhotos) other;
                    return Intrinsics.d(this.title, uploadPhotos.title) && this.limit == uploadPhotos.limit && Intrinsics.d(this.values, uploadPhotos.values);
                }

                public final int getLimit() {
                    return this.limit;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final List<String> getValues() {
                    return this.values;
                }

                public int hashCode() {
                    String str = this.title;
                    int a11 = C2454a.a(this.limit, (str == null ? 0 : str.hashCode()) * 31, 31);
                    List<String> list = this.values;
                    return a11 + (list != null ? list.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    int i11 = this.limit;
                    return C2618u.h(C3660k.c(i11, "UploadPhotos(title=", str, ", limit=", ", values="), this.values, ")");
                }
            }

            public Component(@NotNull String id2, ComponentType componentType, ComponentValidation componentValidation, Boolean bool, String str, String str2, Checkbox checkbox, Radio radio, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Carousel carousel, TextAtom textAtom, BulletListAtom bulletListAtom, Textarea textarea, Toggle toggle, UploadPhotos uploadPhotos) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.type = componentType;
                this.validate = componentValidation;
                this.hidden = bool;
                this.controllingComponentId = str;
                this.selectControllingComponentId = str2;
                this.checkbox = checkbox;
                this.radio = radio;
                this.gallery = largeBorderlessButton;
                this.carousel = carousel;
                this.text = textAtom;
                this.list = bulletListAtom;
                this.textarea = textarea;
                this.toggle = toggle;
                this.uploadPhotos = uploadPhotos;
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component10, reason: from getter */
            public final Carousel getCarousel() {
                return this.carousel;
            }

            /* renamed from: component11, reason: from getter */
            public final TextAtom getText() {
                return this.text;
            }

            /* renamed from: component12, reason: from getter */
            public final BulletListAtom getList() {
                return this.list;
            }

            /* renamed from: component13, reason: from getter */
            public final Textarea getTextarea() {
                return this.textarea;
            }

            /* renamed from: component14, reason: from getter */
            public final Toggle getToggle() {
                return this.toggle;
            }

            /* renamed from: component15, reason: from getter */
            public final UploadPhotos getUploadPhotos() {
                return this.uploadPhotos;
            }

            /* renamed from: component2, reason: from getter */
            public final ComponentType getType() {
                return this.type;
            }

            /* renamed from: component3, reason: from getter */
            public final ComponentValidation getValidate() {
                return this.validate;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getHidden() {
                return this.hidden;
            }

            /* renamed from: component5, reason: from getter */
            public final String getControllingComponentId() {
                return this.controllingComponentId;
            }

            /* renamed from: component6, reason: from getter */
            public final String getSelectControllingComponentId() {
                return this.selectControllingComponentId;
            }

            /* renamed from: component7, reason: from getter */
            public final Checkbox getCheckbox() {
                return this.checkbox;
            }

            /* renamed from: component8, reason: from getter */
            public final Radio getRadio() {
                return this.radio;
            }

            /* renamed from: component9, reason: from getter */
            public final ButtonV3Atom.LargeBorderlessButton getGallery() {
                return this.gallery;
            }

            @NotNull
            public final Component copy(@NotNull String id2, ComponentType type, ComponentValidation validate, Boolean hidden, String controllingComponentId, String selectControllingComponentId, Checkbox checkbox, Radio radio, ButtonV3Atom.LargeBorderlessButton gallery, Carousel carousel, TextAtom text, BulletListAtom list, Textarea textarea, Toggle toggle, UploadPhotos uploadPhotos) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new Component(id2, type, validate, hidden, controllingComponentId, selectControllingComponentId, checkbox, radio, gallery, carousel, text, list, textarea, toggle, uploadPhotos);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Component)) {
                    return false;
                }
                Component component = (Component) other;
                return Intrinsics.d(this.id, component.id) && this.type == component.type && this.validate == component.validate && Intrinsics.d(this.hidden, component.hidden) && Intrinsics.d(this.controllingComponentId, component.controllingComponentId) && Intrinsics.d(this.selectControllingComponentId, component.selectControllingComponentId) && Intrinsics.d(this.checkbox, component.checkbox) && Intrinsics.d(this.radio, component.radio) && Intrinsics.d(this.gallery, component.gallery) && Intrinsics.d(this.carousel, component.carousel) && Intrinsics.d(this.text, component.text) && Intrinsics.d(this.list, component.list) && Intrinsics.d(this.textarea, component.textarea) && Intrinsics.d(this.toggle, component.toggle) && Intrinsics.d(this.uploadPhotos, component.uploadPhotos);
            }

            public final Carousel getCarousel() {
                return this.carousel;
            }

            public final Checkbox getCheckbox() {
                return this.checkbox;
            }

            public final String getControllingComponentId() {
                return this.controllingComponentId;
            }

            public final ButtonV3Atom.LargeBorderlessButton getGallery() {
                return this.gallery;
            }

            public final Boolean getHidden() {
                return this.hidden;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final BulletListAtom getList() {
                return this.list;
            }

            public final Radio getRadio() {
                return this.radio;
            }

            public final String getSelectControllingComponentId() {
                return this.selectControllingComponentId;
            }

            public final TextAtom getText() {
                return this.text;
            }

            public final Textarea getTextarea() {
                return this.textarea;
            }

            public final Toggle getToggle() {
                return this.toggle;
            }

            public final ComponentType getType() {
                return this.type;
            }

            public final UploadPhotos getUploadPhotos() {
                return this.uploadPhotos;
            }

            public final ComponentValidation getValidate() {
                return this.validate;
            }

            public int hashCode() {
                int hashCode = this.id.hashCode() * 31;
                ComponentType componentType = this.type;
                int hashCode2 = (hashCode + (componentType == null ? 0 : componentType.hashCode())) * 31;
                ComponentValidation componentValidation = this.validate;
                int hashCode3 = (hashCode2 + (componentValidation == null ? 0 : componentValidation.hashCode())) * 31;
                Boolean bool = this.hidden;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.controllingComponentId;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.selectControllingComponentId;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Checkbox checkbox = this.checkbox;
                int hashCode7 = (hashCode6 + (checkbox == null ? 0 : checkbox.hashCode())) * 31;
                Radio radio = this.radio;
                int hashCode8 = (hashCode7 + (radio == null ? 0 : radio.hashCode())) * 31;
                ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.gallery;
                int hashCode9 = (hashCode8 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
                Carousel carousel = this.carousel;
                int hashCode10 = (hashCode9 + (carousel == null ? 0 : carousel.hashCode())) * 31;
                TextAtom textAtom = this.text;
                int hashCode11 = (hashCode10 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                BulletListAtom bulletListAtom = this.list;
                int hashCode12 = (hashCode11 + (bulletListAtom == null ? 0 : bulletListAtom.hashCode())) * 31;
                Textarea textarea = this.textarea;
                int hashCode13 = (hashCode12 + (textarea == null ? 0 : textarea.hashCode())) * 31;
                Toggle toggle = this.toggle;
                int hashCode14 = (hashCode13 + (toggle == null ? 0 : toggle.hashCode())) * 31;
                UploadPhotos uploadPhotos = this.uploadPhotos;
                return hashCode14 + (uploadPhotos != null ? uploadPhotos.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                ComponentType componentType = this.type;
                ComponentValidation componentValidation = this.validate;
                Boolean bool = this.hidden;
                String str2 = this.controllingComponentId;
                String str3 = this.selectControllingComponentId;
                Checkbox checkbox = this.checkbox;
                Radio radio = this.radio;
                ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.gallery;
                Carousel carousel = this.carousel;
                TextAtom textAtom = this.text;
                BulletListAtom bulletListAtom = this.list;
                Textarea textarea = this.textarea;
                Toggle toggle = this.toggle;
                UploadPhotos uploadPhotos = this.uploadPhotos;
                StringBuilder sb2 = new StringBuilder("Component(id=");
                sb2.append(str);
                sb2.append(", type=");
                sb2.append(componentType);
                sb2.append(", validate=");
                sb2.append(componentValidation);
                sb2.append(", hidden=");
                sb2.append(bool);
                sb2.append(", controllingComponentId=");
                Nh.a.h(sb2, str2, ", selectControllingComponentId=", str3, ", checkbox=");
                sb2.append(checkbox);
                sb2.append(", radio=");
                sb2.append(radio);
                sb2.append(", gallery=");
                sb2.append(largeBorderlessButton);
                sb2.append(", carousel=");
                sb2.append(carousel);
                sb2.append(", text=");
                sb2.append(textAtom);
                sb2.append(", list=");
                sb2.append(bulletListAtom);
                sb2.append(", textarea=");
                sb2.append(textarea);
                sb2.append(", toggle=");
                sb2.append(toggle);
                sb2.append(", uploadPhotos=");
                sb2.append(uploadPhotos);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "components", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component;", "alwaysOpen", "", "required", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getComponents", "()Ljava/util/List;", "getAlwaysOpen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRequired", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;", "equals", "other", "hashCode", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Group {
            private final Boolean alwaysOpen;
            private final List<Component> components;
            private final int id;
            private final Boolean required;
            private final String title;

            public Group(int i11, String str, List<Component> list, Boolean bool, Boolean bool2) {
                this.id = i11;
                this.title = str;
                this.components = list;
                this.alwaysOpen = bool;
                this.required = bool2;
            }

            public static /* synthetic */ Group copy$default(Group group, int i11, String str, List list, Boolean bool, Boolean bool2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = group.id;
                }
                if ((i12 & 2) != 0) {
                    str = group.title;
                }
                if ((i12 & 4) != 0) {
                    list = group.components;
                }
                if ((i12 & 8) != 0) {
                    bool = group.alwaysOpen;
                }
                if ((i12 & 16) != 0) {
                    bool2 = group.required;
                }
                Boolean bool3 = bool2;
                List list2 = list;
                return group.copy(i11, str, list2, bool, bool3);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Component> component3() {
                return this.components;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getAlwaysOpen() {
                return this.alwaysOpen;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getRequired() {
                return this.required;
            }

            @NotNull
            public final Group copy(int id2, String title, List<Component> components, Boolean alwaysOpen, Boolean required) {
                return new Group(id2, title, components, alwaysOpen, required);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Group)) {
                    return false;
                }
                Group group = (Group) other;
                return this.id == group.id && Intrinsics.d(this.title, group.title) && Intrinsics.d(this.components, group.components) && Intrinsics.d(this.alwaysOpen, group.alwaysOpen) && Intrinsics.d(this.required, group.required);
            }

            public final Boolean getAlwaysOpen() {
                return this.alwaysOpen;
            }

            public final List<Component> getComponents() {
                return this.components;
            }

            public final int getId() {
                return this.id;
            }

            public final Boolean getRequired() {
                return this.required;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.id) * 31;
                String str = this.title;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                List<Component> list = this.components;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                Boolean bool = this.alwaysOpen;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.required;
                return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                String str = this.title;
                List<Component> list = this.components;
                Boolean bool = this.alwaysOpen;
                Boolean bool2 = this.required;
                StringBuilder g10 = e.g(i11, "Group(id=", ", title=", str, ", components=");
                g10.append(list);
                g10.append(", alwaysOpen=");
                g10.append(bool);
                g10.append(", required=");
                return D3.g.d(g10, bool2, ")");
            }
        }

        public Form(String str, boolean z11, Annotations annotations, List<Group> list, Group group) {
            this.ratingTitle = str;
            this.required = z11;
            this.annotations = annotations;
            this.groups = list;
            this.trailingGroup = group;
        }

        public static /* synthetic */ Form copy$default(Form form, String str, boolean z11, Annotations annotations, List list, Group group, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = form.ratingTitle;
            }
            if ((i11 & 2) != 0) {
                z11 = form.required;
            }
            if ((i11 & 4) != 0) {
                annotations = form.annotations;
            }
            if ((i11 & 8) != 0) {
                list = form.groups;
            }
            if ((i11 & 16) != 0) {
                group = form.trailingGroup;
            }
            Group group2 = group;
            Annotations annotations2 = annotations;
            return form.copy(str, z11, annotations2, list, group2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRatingTitle() {
            return this.ratingTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRequired() {
            return this.required;
        }

        /* renamed from: component3, reason: from getter */
        public final Annotations getAnnotations() {
            return this.annotations;
        }

        public final List<Group> component4() {
            return this.groups;
        }

        /* renamed from: component5, reason: from getter */
        public final Group getTrailingGroup() {
            return this.trailingGroup;
        }

        @NotNull
        public final Form copy(String ratingTitle, boolean required, Annotations annotations, List<Group> groups, Group trailingGroup) {
            return new Form(ratingTitle, required, annotations, groups, trailingGroup);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Form)) {
                return false;
            }
            Form form = (Form) other;
            return Intrinsics.d(this.ratingTitle, form.ratingTitle) && this.required == form.required && Intrinsics.d(this.annotations, form.annotations) && Intrinsics.d(this.groups, form.groups) && Intrinsics.d(this.trailingGroup, form.trailingGroup);
        }

        public final Annotations getAnnotations() {
            return this.annotations;
        }

        public final List<Group> getGroups() {
            return this.groups;
        }

        public final String getRatingTitle() {
            return this.ratingTitle;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public final Group getTrailingGroup() {
            return this.trailingGroup;
        }

        public int hashCode() {
            String str = this.ratingTitle;
            int a11 = C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.required);
            Annotations annotations = this.annotations;
            int hashCode = (a11 + (annotations == null ? 0 : annotations.hashCode())) * 31;
            List<Group> list = this.groups;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Group group = this.trailingGroup;
            return hashCode2 + (group != null ? group.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.ratingTitle;
            boolean z11 = this.required;
            Annotations annotations = this.annotations;
            List<Group> list = this.groups;
            Group group = this.trailingGroup;
            StringBuilder b11 = C4636t5.b("Form(ratingTitle=", str, ", required=", ", annotations=", z11);
            b11.append(annotations);
            b11.append(", groups=");
            b11.append(list);
            b11.append(", trailingGroup=");
            b11.append(group);
            b11.append(")");
            return b11.toString();
        }
    }

    public DeliveryReviewFormDTO(Boolean bool, @NotNull String title, Boolean bool2, Integer num, AtomActionDTO atomActionDTO, Form form, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.disabled = bool;
        this.title = title;
        this.showRating = bool2;
        this.selectedRating = num;
        this.changeRatingAction = atomActionDTO;
        this.form = form;
        this.button = largeButton;
    }

    public static /* synthetic */ DeliveryReviewFormDTO copy$default(DeliveryReviewFormDTO deliveryReviewFormDTO, Boolean bool, String str, Boolean bool2, Integer num, AtomActionDTO atomActionDTO, Form form, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = deliveryReviewFormDTO.disabled;
        }
        if ((i11 & 2) != 0) {
            str = deliveryReviewFormDTO.title;
        }
        if ((i11 & 4) != 0) {
            bool2 = deliveryReviewFormDTO.showRating;
        }
        if ((i11 & 8) != 0) {
            num = deliveryReviewFormDTO.selectedRating;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = deliveryReviewFormDTO.changeRatingAction;
        }
        if ((i11 & 32) != 0) {
            form = deliveryReviewFormDTO.form;
        }
        if ((i11 & 64) != 0) {
            largeButton = deliveryReviewFormDTO.button;
        }
        Form form2 = form;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Boolean bool3 = bool2;
        return deliveryReviewFormDTO.copy(bool, str, bool3, num, atomActionDTO2, form2, largeButton2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getShowRating() {
        return this.showRating;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSelectedRating() {
        return this.selectedRating;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getChangeRatingAction() {
        return this.changeRatingAction;
    }

    /* renamed from: component6, reason: from getter */
    public final Form getForm() {
        return this.form;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    public final DeliveryReviewFormDTO copy(Boolean disabled, @NotNull String title, Boolean showRating, Integer selectedRating, AtomActionDTO changeRatingAction, Form form, ButtonV3Atom.LargeButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DeliveryReviewFormDTO(disabled, title, showRating, selectedRating, changeRatingAction, form, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReviewFormDTO)) {
            return false;
        }
        DeliveryReviewFormDTO deliveryReviewFormDTO = (DeliveryReviewFormDTO) other;
        return Intrinsics.d(this.disabled, deliveryReviewFormDTO.disabled) && Intrinsics.d(this.title, deliveryReviewFormDTO.title) && Intrinsics.d(this.showRating, deliveryReviewFormDTO.showRating) && Intrinsics.d(this.selectedRating, deliveryReviewFormDTO.selectedRating) && Intrinsics.d(this.changeRatingAction, deliveryReviewFormDTO.changeRatingAction) && Intrinsics.d(this.form, deliveryReviewFormDTO.form) && Intrinsics.d(this.button, deliveryReviewFormDTO.button);
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final AtomActionDTO getChangeRatingAction() {
        return this.changeRatingAction;
    }

    public final Boolean getDisabled() {
        return this.disabled;
    }

    public final Form getForm() {
        return this.form;
    }

    public final Integer getSelectedRating() {
        return this.selectedRating;
    }

    public final Boolean getShowRating() {
        return this.showRating;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.disabled;
        int a11 = g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.title);
        Boolean bool2 = this.showRating;
        int hashCode = (a11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.selectedRating;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.changeRatingAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Form form = this.form;
        int hashCode4 = (hashCode3 + (form == null ? 0 : form.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.button;
        return hashCode4 + (largeButton != null ? largeButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.disabled;
        String str = this.title;
        Boolean bool2 = this.showRating;
        Integer num = this.selectedRating;
        AtomActionDTO atomActionDTO = this.changeRatingAction;
        Form form = this.form;
        ButtonV3Atom.LargeButton largeButton = this.button;
        StringBuilder e11 = D3.g.e("DeliveryReviewFormDTO(disabled=", bool, ", title=", str, ", showRating=");
        GZ.e.d(bool2, num, ", selectedRating=", ", changeRatingAction=", e11);
        e11.append(atomActionDTO);
        e11.append(", form=");
        e11.append(form);
        e11.append(", button=");
        e11.append(largeButton);
        e11.append(")");
        return e11.toString();
    }
}
