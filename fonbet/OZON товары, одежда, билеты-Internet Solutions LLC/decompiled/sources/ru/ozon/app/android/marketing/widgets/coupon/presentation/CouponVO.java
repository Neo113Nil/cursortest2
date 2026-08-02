package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import V.e;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00018B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jx\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO$Gradient;", "gradient", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "code", "applyText", "subtitle", "", "appliedColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "currentMiniWidget", "<init>", "(JLru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO$Gradient;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)V", "copy", "(JLru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO$Gradient;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO$Gradient;", "getGradient", "()Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO$Gradient;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCode", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getApplyText", "getSubtitle", "Ljava/lang/String;", "getAppliedColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "Gradient", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CouponVO implements c {
    private final AtomAction action;

    @NotNull
    private final String appliedColor;

    @NotNull
    private final TextAtom applyText;

    @NotNull
    private final TextAtom code;
    private final HighlightsCurrentMiniWidget currentMiniWidget;

    @NotNull
    private final Gradient gradient;
    private final long id;
    private final TextAtom subtitle;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO$Gradient;", "", "", "startColor", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartColor", "getEndColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gradient {

        @NotNull
        private final String endColor;

        @NotNull
        private final String startColor;

        public Gradient(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            this.startColor = startColor;
            this.endColor = endColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.startColor, gradient.startColor) && Intrinsics.d(this.endColor, gradient.endColor);
        }

        @NotNull
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final String getStartColor() {
            return this.startColor;
        }

        public int hashCode() {
            return this.endColor.hashCode() + (this.startColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Gradient(startColor=", this.startColor, ", endColor=", this.endColor, ")");
        }
    }

    public CouponVO(long j11, @NotNull Gradient gradient, @NotNull TextAtom code, @NotNull TextAtom applyText, TextAtom textAtom, @NotNull String appliedColor, AtomAction atomAction, t tVar, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(applyText, "applyText");
        Intrinsics.checkNotNullParameter(appliedColor, "appliedColor");
        this.id = j11;
        this.gradient = gradient;
        this.code = code;
        this.applyText = applyText;
        this.subtitle = textAtom;
        this.appliedColor = appliedColor;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.currentMiniWidget = highlightsCurrentMiniWidget;
    }

    public static /* synthetic */ CouponVO copy$default(CouponVO couponVO, long j11, Gradient gradient, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, String str, AtomAction atomAction, t tVar, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = couponVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            gradient = couponVO.gradient;
        }
        Gradient gradient2 = gradient;
        if ((i11 & 4) != 0) {
            textAtom = couponVO.code;
        }
        return couponVO.copy(j12, gradient2, textAtom, (i11 & 8) != 0 ? couponVO.applyText : textAtom2, (i11 & 16) != 0 ? couponVO.subtitle : textAtom3, (i11 & 32) != 0 ? couponVO.appliedColor : str, (i11 & 64) != 0 ? couponVO.action : atomAction, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? couponVO.tokenizedEvent : tVar, (i11 & 256) != 0 ? couponVO.currentMiniWidget : highlightsCurrentMiniWidget);
    }

    @NotNull
    public final CouponVO copy(long id2, @NotNull Gradient gradient, @NotNull TextAtom code, @NotNull TextAtom applyText, TextAtom subtitle, @NotNull String appliedColor, AtomAction action, t tokenizedEvent, HighlightsCurrentMiniWidget currentMiniWidget) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(applyText, "applyText");
        Intrinsics.checkNotNullParameter(appliedColor, "appliedColor");
        return new CouponVO(id2, gradient, code, applyText, subtitle, appliedColor, action, tokenizedEvent, currentMiniWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponVO)) {
            return false;
        }
        CouponVO couponVO = (CouponVO) other;
        return this.id == couponVO.id && Intrinsics.d(this.gradient, couponVO.gradient) && Intrinsics.d(this.code, couponVO.code) && Intrinsics.d(this.applyText, couponVO.applyText) && Intrinsics.d(this.subtitle, couponVO.subtitle) && Intrinsics.d(this.appliedColor, couponVO.appliedColor) && Intrinsics.d(this.action, couponVO.action) && Intrinsics.d(this.tokenizedEvent, couponVO.tokenizedEvent) && this.currentMiniWidget == couponVO.currentMiniWidget;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getAppliedColor() {
        return this.appliedColor;
    }

    @NotNull
    public final TextAtom getApplyText() {
        return this.applyText;
    }

    @NotNull
    public final TextAtom getCode() {
        return this.code;
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    @NotNull
    public final Gradient getGradient() {
        return this.gradient;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b((this.gradient.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.code), 31, this.applyText);
        TextAtom textAtom = this.subtitle;
        int a11 = g.a((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.appliedColor);
        AtomAction atomAction = this.action;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        return hashCode2 + (highlightsCurrentMiniWidget != null ? highlightsCurrentMiniWidget.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Gradient gradient = this.gradient;
        TextAtom textAtom = this.code;
        TextAtom textAtom2 = this.applyText;
        TextAtom textAtom3 = this.subtitle;
        String str = this.appliedColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        StringBuilder sb2 = new StringBuilder("CouponVO(id=");
        sb2.append(j11);
        sb2.append(", gradient=");
        sb2.append(gradient);
        C2639a.e(", code=", ", applyText=", sb2, textAtom, textAtom2);
        sb2.append(", subtitle=");
        sb2.append(textAtom3);
        sb2.append(", appliedColor=");
        sb2.append(str);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", sb2, atomAction);
        sb2.append(", currentMiniWidget=");
        sb2.append(highlightsCurrentMiniWidget);
        sb2.append(")");
        return sb2.toString();
    }
}
