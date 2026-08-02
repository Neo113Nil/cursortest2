package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader;

import B3.p;
import Bi.b;
import T7.P;
import Ve.C4598rp;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000234BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u0010\u0015¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "backButton", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "productCell", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "submitOnBackConfig", "LWZ/t;", "closeReviewFormEvent", "viewEvent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "placeholdersSheetConfig", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;LWZ/t;LWZ/t;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBackButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getProductCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "getSubmitOnBackConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "LWZ/t;", "getCloseReviewFormEvent", "()LWZ/t;", "getViewEvent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "getPlaceholdersSheetConfig", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "Ljava/lang/String;", "getBackgroundColor", "SubmitOnBackConfigVO", "PlaceholdersSheetConfigVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormHeaderVO implements c {

    @NotNull
    private final IconButtonV3DTO backButton;
    private final String backgroundColor;
    private final t closeReviewFormEvent;
    private final long id;
    private final PlaceholdersSheetConfigVO placeholdersSheetConfig;

    @NotNull
    private final CellDTO productCell;
    private final SubmitOnBackConfigVO submitOnBackConfig;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "minRating", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getMinRating", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlaceholdersSheetConfigVO {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction action;
        private final int minRating;

        public PlaceholdersSheetConfigVO(@NotNull AtomAction action, int i11) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.minRating = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaceholdersSheetConfigVO)) {
                return false;
            }
            PlaceholdersSheetConfigVO placeholdersSheetConfigVO = (PlaceholdersSheetConfigVO) other;
            return Intrinsics.d(this.action, placeholdersSheetConfigVO.action) && this.minRating == placeholdersSheetConfigVO.minRating;
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final int getMinRating() {
            return this.minRating;
        }

        public int hashCode() {
            return Integer.hashCode(this.minRating) + (this.action.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PlaceholdersSheetConfigVO(action=" + this.action + ", minRating=" + this.minRating + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "", "", "minRating", "Lru/ozon/uni/atoms/af/AtomAction;", "submitAction", "backAction", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "submitNotification", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "submitActionTrackingInfo", "<init>", "(ILru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinRating", "Lru/ozon/uni/atoms/af/AtomAction;", "getSubmitAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getBackAction", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getSubmitNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Ljava/util/Map;", "getSubmitActionTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitOnBackConfigVO {

        @NotNull
        private final AtomAction backAction;
        private final int minRating;

        @NotNull
        private final AtomAction submitAction;
        private final Map<String, TokenizedTrackingInfo> submitActionTrackingInfo;
        private final NotificationDTO submitNotification;

        public SubmitOnBackConfigVO(int i11, @NotNull AtomAction submitAction, @NotNull AtomAction backAction, NotificationDTO notificationDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(submitAction, "submitAction");
            Intrinsics.checkNotNullParameter(backAction, "backAction");
            this.minRating = i11;
            this.submitAction = submitAction;
            this.backAction = backAction;
            this.submitNotification = notificationDTO;
            this.submitActionTrackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitOnBackConfigVO)) {
                return false;
            }
            SubmitOnBackConfigVO submitOnBackConfigVO = (SubmitOnBackConfigVO) other;
            return this.minRating == submitOnBackConfigVO.minRating && Intrinsics.d(this.submitAction, submitOnBackConfigVO.submitAction) && Intrinsics.d(this.backAction, submitOnBackConfigVO.backAction) && Intrinsics.d(this.submitNotification, submitOnBackConfigVO.submitNotification) && Intrinsics.d(this.submitActionTrackingInfo, submitOnBackConfigVO.submitActionTrackingInfo);
        }

        @NotNull
        public final AtomAction getBackAction() {
            return this.backAction;
        }

        public final int getMinRating() {
            return this.minRating;
        }

        @NotNull
        public final AtomAction getSubmitAction() {
            return this.submitAction;
        }

        public final Map<String, TokenizedTrackingInfo> getSubmitActionTrackingInfo() {
            return this.submitActionTrackingInfo;
        }

        public final NotificationDTO getSubmitNotification() {
            return this.submitNotification;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.backAction, C4598rp.a(this.submitAction, Integer.hashCode(this.minRating) * 31, 31), 31);
            NotificationDTO notificationDTO = this.submitNotification;
            int hashCode = (a11 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.submitActionTrackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.minRating;
            AtomAction atomAction = this.submitAction;
            AtomAction atomAction2 = this.backAction;
            NotificationDTO notificationDTO = this.submitNotification;
            Map<String, TokenizedTrackingInfo> map = this.submitActionTrackingInfo;
            StringBuilder sb2 = new StringBuilder("SubmitOnBackConfigVO(minRating=");
            sb2.append(i11);
            sb2.append(", submitAction=");
            sb2.append(atomAction);
            sb2.append(", backAction=");
            sb2.append(atomAction2);
            sb2.append(", submitNotification=");
            sb2.append(notificationDTO);
            sb2.append(", submitActionTrackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public ReviewFormHeaderVO(long j11, @NotNull IconButtonV3DTO backButton, @NotNull CellDTO productCell, SubmitOnBackConfigVO submitOnBackConfigVO, t tVar, t tVar2, PlaceholdersSheetConfigVO placeholdersSheetConfigVO, String str) {
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        this.id = j11;
        this.backButton = backButton;
        this.productCell = productCell;
        this.submitOnBackConfig = submitOnBackConfigVO;
        this.closeReviewFormEvent = tVar;
        this.viewEvent = tVar2;
        this.placeholdersSheetConfig = placeholdersSheetConfigVO;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormHeaderVO)) {
            return false;
        }
        ReviewFormHeaderVO reviewFormHeaderVO = (ReviewFormHeaderVO) other;
        return this.id == reviewFormHeaderVO.id && Intrinsics.d(this.backButton, reviewFormHeaderVO.backButton) && Intrinsics.d(this.productCell, reviewFormHeaderVO.productCell) && Intrinsics.d(this.submitOnBackConfig, reviewFormHeaderVO.submitOnBackConfig) && Intrinsics.d(this.closeReviewFormEvent, reviewFormHeaderVO.closeReviewFormEvent) && Intrinsics.d(this.viewEvent, reviewFormHeaderVO.viewEvent) && Intrinsics.d(this.placeholdersSheetConfig, reviewFormHeaderVO.placeholdersSheetConfig) && Intrinsics.d(this.backgroundColor, reviewFormHeaderVO.backgroundColor);
    }

    @NotNull
    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CellDTO getProductCell() {
        return this.productCell;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SubmitOnBackConfigVO getSubmitOnBackConfig() {
        return this.submitOnBackConfig;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.productCell, GR.b.c(this.backButton, Long.hashCode(this.id) * 31, 31), 31);
        SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
        int hashCode = (c11 + (submitOnBackConfigVO == null ? 0 : submitOnBackConfigVO.hashCode())) * 31;
        t tVar = this.closeReviewFormEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.viewEvent;
        int hashCode3 = (hashCode2 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        PlaceholdersSheetConfigVO placeholdersSheetConfigVO = this.placeholdersSheetConfig;
        int hashCode4 = (hashCode3 + (placeholdersSheetConfigVO == null ? 0 : placeholdersSheetConfigVO.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconButtonV3DTO iconButtonV3DTO = this.backButton;
        CellDTO cellDTO = this.productCell;
        SubmitOnBackConfigVO submitOnBackConfigVO = this.submitOnBackConfig;
        t tVar = this.closeReviewFormEvent;
        t tVar2 = this.viewEvent;
        PlaceholdersSheetConfigVO placeholdersSheetConfigVO = this.placeholdersSheetConfig;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("ReviewFormHeaderVO(id=");
        sb2.append(j11);
        sb2.append(", backButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", productCell=");
        sb2.append(cellDTO);
        sb2.append(", submitOnBackConfig=");
        sb2.append(submitOnBackConfigVO);
        p.d(sb2, ", closeReviewFormEvent=", tVar, ", viewEvent=", tVar2);
        sb2.append(", placeholdersSheetConfig=");
        sb2.append(placeholdersSheetConfigVO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }
}
