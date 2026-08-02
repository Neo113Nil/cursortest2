package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation;

import Ak.b;
import Bl.C2639a;
import C.C2702w;
import De.C2859b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0094\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b,\u0010)R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "reviewId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "initialButton", "inProgressButton", "finalButton", "bindButton", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "initialAtoms", "finalAtoms", "LWZ/t;", "tokenizedEvent", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "errorTrackingInfo", "<init>", "(JJLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/util/List;LWZ/t;Ljava/util/Map;)V", "copy", "(JJLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/util/List;LWZ/t;Ljava/util/Map;)Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getReviewId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInitialButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInProgressButton", "getFinalButton", "getBindButton", "Ljava/util/List;", "getInitialAtoms", "()Ljava/util/List;", "getFinalAtoms", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/Map;", "getErrorTrackingInfo", "()Ljava/util/Map;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TranslateButtonVO implements c {

    @NotNull
    private final ButtonV3DTO bindButton;
    private final Map<String, TokenizedTrackingInfo> errorTrackingInfo;
    private final List<SingleReviewDTO.BodySectionDTO> finalAtoms;

    @NotNull
    private final ButtonV3DTO finalButton;
    private final long id;

    @NotNull
    private final ButtonV3DTO inProgressButton;
    private final List<SingleReviewDTO.BodySectionDTO> initialAtoms;

    @NotNull
    private final ButtonV3DTO initialButton;
    private final long reviewId;
    private final t tokenizedEvent;

    public TranslateButtonVO(long j11, long j12, @NotNull ButtonV3DTO initialButton, @NotNull ButtonV3DTO inProgressButton, @NotNull ButtonV3DTO finalButton, @NotNull ButtonV3DTO bindButton, List<SingleReviewDTO.BodySectionDTO> list, List<SingleReviewDTO.BodySectionDTO> list2, t tVar, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(initialButton, "initialButton");
        Intrinsics.checkNotNullParameter(inProgressButton, "inProgressButton");
        Intrinsics.checkNotNullParameter(finalButton, "finalButton");
        Intrinsics.checkNotNullParameter(bindButton, "bindButton");
        this.id = j11;
        this.reviewId = j12;
        this.initialButton = initialButton;
        this.inProgressButton = inProgressButton;
        this.finalButton = finalButton;
        this.bindButton = bindButton;
        this.initialAtoms = list;
        this.finalAtoms = list2;
        this.tokenizedEvent = tVar;
        this.errorTrackingInfo = map;
    }

    public static /* synthetic */ TranslateButtonVO copy$default(TranslateButtonVO translateButtonVO, long j11, long j12, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, ButtonV3DTO buttonV3DTO4, List list, List list2, t tVar, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = translateButtonVO.id;
        }
        return translateButtonVO.copy(j11, (i11 & 2) != 0 ? translateButtonVO.reviewId : j12, (i11 & 4) != 0 ? translateButtonVO.initialButton : buttonV3DTO, (i11 & 8) != 0 ? translateButtonVO.inProgressButton : buttonV3DTO2, (i11 & 16) != 0 ? translateButtonVO.finalButton : buttonV3DTO3, (i11 & 32) != 0 ? translateButtonVO.bindButton : buttonV3DTO4, (i11 & 64) != 0 ? translateButtonVO.initialAtoms : list, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? translateButtonVO.finalAtoms : list2, (i11 & 256) != 0 ? translateButtonVO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? translateButtonVO.errorTrackingInfo : map);
    }

    @NotNull
    public final TranslateButtonVO copy(long id2, long reviewId, @NotNull ButtonV3DTO initialButton, @NotNull ButtonV3DTO inProgressButton, @NotNull ButtonV3DTO finalButton, @NotNull ButtonV3DTO bindButton, List<SingleReviewDTO.BodySectionDTO> initialAtoms, List<SingleReviewDTO.BodySectionDTO> finalAtoms, t tokenizedEvent, Map<String, TokenizedTrackingInfo> errorTrackingInfo) {
        Intrinsics.checkNotNullParameter(initialButton, "initialButton");
        Intrinsics.checkNotNullParameter(inProgressButton, "inProgressButton");
        Intrinsics.checkNotNullParameter(finalButton, "finalButton");
        Intrinsics.checkNotNullParameter(bindButton, "bindButton");
        return new TranslateButtonVO(id2, reviewId, initialButton, inProgressButton, finalButton, bindButton, initialAtoms, finalAtoms, tokenizedEvent, errorTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslateButtonVO)) {
            return false;
        }
        TranslateButtonVO translateButtonVO = (TranslateButtonVO) other;
        return this.id == translateButtonVO.id && this.reviewId == translateButtonVO.reviewId && Intrinsics.d(this.initialButton, translateButtonVO.initialButton) && Intrinsics.d(this.inProgressButton, translateButtonVO.inProgressButton) && Intrinsics.d(this.finalButton, translateButtonVO.finalButton) && Intrinsics.d(this.bindButton, translateButtonVO.bindButton) && Intrinsics.d(this.initialAtoms, translateButtonVO.initialAtoms) && Intrinsics.d(this.finalAtoms, translateButtonVO.finalAtoms) && Intrinsics.d(this.tokenizedEvent, translateButtonVO.tokenizedEvent) && Intrinsics.d(this.errorTrackingInfo, translateButtonVO.errorTrackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getBindButton() {
        return this.bindButton;
    }

    public final Map<String, TokenizedTrackingInfo> getErrorTrackingInfo() {
        return this.errorTrackingInfo;
    }

    public final List<SingleReviewDTO.BodySectionDTO> getFinalAtoms() {
        return this.finalAtoms;
    }

    @NotNull
    public final ButtonV3DTO getFinalButton() {
        return this.finalButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getInProgressButton() {
        return this.inProgressButton;
    }

    public final List<SingleReviewDTO.BodySectionDTO> getInitialAtoms() {
        return this.initialAtoms;
    }

    @NotNull
    public final ButtonV3DTO getInitialButton() {
        return this.initialButton;
    }

    public final long getReviewId() {
        return this.reviewId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.bindButton, C2859b.c(this.finalButton, C2859b.c(this.inProgressButton, C2859b.c(this.initialButton, Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.reviewId), 31), 31), 31), 31);
        List<SingleReviewDTO.BodySectionDTO> list = this.initialAtoms;
        int hashCode = (c11 + (list == null ? 0 : list.hashCode())) * 31;
        List<SingleReviewDTO.BodySectionDTO> list2 = this.finalAtoms;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.errorTrackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.reviewId;
        ButtonV3DTO buttonV3DTO = this.initialButton;
        ButtonV3DTO buttonV3DTO2 = this.inProgressButton;
        ButtonV3DTO buttonV3DTO3 = this.finalButton;
        ButtonV3DTO buttonV3DTO4 = this.bindButton;
        List<SingleReviewDTO.BodySectionDTO> list = this.initialAtoms;
        List<SingleReviewDTO.BodySectionDTO> list2 = this.finalAtoms;
        t tVar = this.tokenizedEvent;
        Map<String, TokenizedTrackingInfo> map = this.errorTrackingInfo;
        StringBuilder d11 = C2702w.d(j11, "TranslateButtonVO(id=", ", reviewId=");
        d11.append(j12);
        d11.append(", initialButton=");
        d11.append(buttonV3DTO);
        d11.append(", inProgressButton=");
        d11.append(buttonV3DTO2);
        d11.append(", finalButton=");
        d11.append(buttonV3DTO3);
        d11.append(", bindButton=");
        d11.append(buttonV3DTO4);
        d11.append(", initialAtoms=");
        d11.append(list);
        b.h(d11, ", finalAtoms=", list2, ", tokenizedEvent=", tVar);
        return C2639a.b(d11, ", errorTrackingInfo=", map, ")");
    }

    public /* synthetic */ TranslateButtonVO(long j11, long j12, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, ButtonV3DTO buttonV3DTO4, List list, List list2, t tVar, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, buttonV3DTO, buttonV3DTO2, buttonV3DTO3, (i11 & 32) != 0 ? buttonV3DTO : buttonV3DTO4, list, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list2, tVar, map);
    }
}
