package ru.ozon.app.android.pdp.widgets.brand.presentation;

import De.C2859b;
import WZ.t;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0011¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/ButtonBrandVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;", "", "id", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "", "json", "<init>", "(JLWZ/t;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnBoarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/lang/String;", "getJson", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonBrandVO implements c, WidgetPlaceholderViewObject {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final String json;
    private final OnBoardingDTO onBoarding;
    private final t tokenizedEvent;

    public ButtonBrandVO(long j11, t tVar, @NotNull ButtonV3DTO button, OnBoardingDTO onBoardingDTO, @NotNull String json) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.tokenizedEvent = tVar;
        this.button = button;
        this.onBoarding = onBoardingDTO;
        this.json = json;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBrandVO)) {
            return false;
        }
        ButtonBrandVO buttonBrandVO = (ButtonBrandVO) other;
        return this.id == buttonBrandVO.id && Intrinsics.d(this.tokenizedEvent, buttonBrandVO.tokenizedEvent) && Intrinsics.d(this.button, buttonBrandVO.button) && Intrinsics.d(this.onBoarding, buttonBrandVO.onBoarding) && Intrinsics.d(this.json, buttonBrandVO.json);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject
    @NotNull
    public String getJson() {
        return this.json;
    }

    public final OnBoardingDTO getOnBoarding() {
        return this.onBoarding;
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
        int hashCode = Long.hashCode(this.id) * 31;
        t tVar = this.tokenizedEvent;
        int c11 = C2859b.c(this.button, (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
        OnBoardingDTO onBoardingDTO = this.onBoarding;
        return this.json.hashCode() + ((c11 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        t tVar = this.tokenizedEvent;
        ButtonV3DTO buttonV3DTO = this.button;
        OnBoardingDTO onBoardingDTO = this.onBoarding;
        String str = this.json;
        StringBuilder sb2 = new StringBuilder("ButtonBrandVO(id=");
        sb2.append(j11);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", onBoarding=");
        sb2.append(onBoardingDTO);
        return C6594f.a(", json=", str, ")", sb2);
    }
}
