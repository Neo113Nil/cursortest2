package ru.ozon.app.android.monetization.widgets.overlayButton.presentation;

import F3.G;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper;", "buttonWrapper", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper;", "getButtonWrapper", "()Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "ButtonWrapper", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OverlayButtonVO implements c {

    @NotNull
    private final ButtonWrapper buttonWrapper;
    private final long id;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper;", "", "<init>", "()V", "SingleButton", "DoubleButton", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper$DoubleButton;", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper$SingleButton;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ButtonWrapper {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper$DoubleButton;", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "firstButton", "secondButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getFirstButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondButton", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DoubleButton extends ButtonWrapper {

            @NotNull
            private final ButtonV3DTO firstButton;

            @NotNull
            private final ButtonV3DTO secondButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoubleButton(@NotNull ButtonV3DTO firstButton, @NotNull ButtonV3DTO secondButton) {
                super(null);
                Intrinsics.checkNotNullParameter(firstButton, "firstButton");
                Intrinsics.checkNotNullParameter(secondButton, "secondButton");
                this.firstButton = firstButton;
                this.secondButton = secondButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DoubleButton)) {
                    return false;
                }
                DoubleButton doubleButton = (DoubleButton) other;
                return Intrinsics.d(this.firstButton, doubleButton.firstButton) && Intrinsics.d(this.secondButton, doubleButton.secondButton);
            }

            @NotNull
            public final ButtonV3DTO getFirstButton() {
                return this.firstButton;
            }

            @NotNull
            public final ButtonV3DTO getSecondButton() {
                return this.secondButton;
            }

            public int hashCode() {
                return this.secondButton.hashCode() + (this.firstButton.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "DoubleButton(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper$SingleButton;", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO$ButtonWrapper;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "singleButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSingleButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SingleButton extends ButtonWrapper {

            @NotNull
            private final ButtonV3DTO singleButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleButton(@NotNull ButtonV3DTO singleButton) {
                super(null);
                Intrinsics.checkNotNullParameter(singleButton, "singleButton");
                this.singleButton = singleButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleButton) && Intrinsics.d(this.singleButton, ((SingleButton) other).singleButton);
            }

            @NotNull
            public final ButtonV3DTO getSingleButton() {
                return this.singleButton;
            }

            public int hashCode() {
                return this.singleButton.hashCode();
            }

            @NotNull
            public String toString() {
                return G.b(this.singleButton, "SingleButton(singleButton=", ")");
            }
        }

        public /* synthetic */ ButtonWrapper(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ButtonWrapper() {
        }
    }

    public OverlayButtonVO(long j11, @NotNull ButtonWrapper buttonWrapper, t tVar, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(buttonWrapper, "buttonWrapper");
        this.id = j11;
        this.buttonWrapper = buttonWrapper;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayButtonVO)) {
            return false;
        }
        OverlayButtonVO overlayButtonVO = (OverlayButtonVO) other;
        return this.id == overlayButtonVO.id && Intrinsics.d(this.buttonWrapper, overlayButtonVO.buttonWrapper) && Intrinsics.d(this.tokenizedEvent, overlayButtonVO.tokenizedEvent) && Intrinsics.d(this.testInfo, overlayButtonVO.testInfo);
    }

    @NotNull
    public final ButtonWrapper getButtonWrapper() {
        return this.buttonWrapper;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.buttonWrapper.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OverlayButtonVO(id=" + this.id + ", buttonWrapper=" + this.buttonWrapper + ", tokenizedEvent=" + this.tokenizedEvent + ", testInfo=" + this.testInfo + ")";
    }
}
