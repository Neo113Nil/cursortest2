package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton;

import El.C2971a;
import F3.G;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/sendButton/FeedbackSendButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "isShow", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "skipTokenizedEvent", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "customAnalytics", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZLWZ/t;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "copy", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZLWZ/t;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/sendButton/FeedbackSendButtonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "()Z", "LWZ/t;", "getSkipTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCustomAnalytics", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackSendButtonVO implements c {
    private final ButtonV3DTO button;
    private final CommonControlSettings customAnalytics;
    private final long id;
    private final boolean isShow;
    private final t skipTokenizedEvent;

    public FeedbackSendButtonVO(long j11, ButtonV3DTO buttonV3DTO, boolean z11, t tVar, CommonControlSettings commonControlSettings) {
        this.id = j11;
        this.button = buttonV3DTO;
        this.isShow = z11;
        this.skipTokenizedEvent = tVar;
        this.customAnalytics = commonControlSettings;
    }

    public static /* synthetic */ FeedbackSendButtonVO copy$default(FeedbackSendButtonVO feedbackSendButtonVO, long j11, ButtonV3DTO buttonV3DTO, boolean z11, t tVar, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = feedbackSendButtonVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            buttonV3DTO = feedbackSendButtonVO.button;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 4) != 0) {
            z11 = feedbackSendButtonVO.isShow;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            tVar = feedbackSendButtonVO.skipTokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 16) != 0) {
            commonControlSettings = feedbackSendButtonVO.customAnalytics;
        }
        return feedbackSendButtonVO.copy(j12, buttonV3DTO2, z12, tVar2, commonControlSettings);
    }

    @NotNull
    public final FeedbackSendButtonVO copy(long id2, ButtonV3DTO button, boolean isShow, t skipTokenizedEvent, CommonControlSettings customAnalytics) {
        return new FeedbackSendButtonVO(id2, button, isShow, skipTokenizedEvent, customAnalytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackSendButtonVO)) {
            return false;
        }
        FeedbackSendButtonVO feedbackSendButtonVO = (FeedbackSendButtonVO) other;
        return this.id == feedbackSendButtonVO.id && Intrinsics.d(this.button, feedbackSendButtonVO.button) && this.isShow == feedbackSendButtonVO.isShow && Intrinsics.d(this.skipTokenizedEvent, feedbackSendButtonVO.skipTokenizedEvent) && Intrinsics.d(this.customAnalytics, feedbackSendButtonVO.customAnalytics);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CommonControlSettings getCustomAnalytics() {
        return this.customAnalytics;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getSkipTokenizedEvent() {
        return this.skipTokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int a11 = C3532b.a((hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31, this.isShow);
        t tVar = this.skipTokenizedEvent;
        int hashCode2 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.customAnalytics;
        return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.button;
        boolean z11 = this.isShow;
        t tVar = this.skipTokenizedEvent;
        CommonControlSettings commonControlSettings = this.customAnalytics;
        StringBuilder c11 = G.c("FeedbackSendButtonVO(id=", j11, ", button=", buttonV3DTO);
        C2971a.d(c11, ", isShow=", z11, ", skipTokenizedEvent=", tVar);
        c11.append(", customAnalytics=");
        c11.append(commonControlSettings);
        c11.append(")");
        return c11.toString();
    }
}
