package ru.ozon.app.android.partpayment.landing.limit.view;

import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010Jh\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "hint", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.NAME, "validationBtn", "validationURL", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "description", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;LWZ/t;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;LWZ/t;)Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getHint", "getValue", "getName", "getValidationBtn", "getValidationURL", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "", "id", "J", "getId", "()J", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FormPageLandingLimitVO implements c {

    @NotNull
    private final OzonSpannableString description;

    @NotNull
    private final String hint;
    private final long id;

    @NotNull
    private final String name;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    @NotNull
    private final String validationBtn;

    @NotNull
    private final String validationURL;

    @NotNull
    private final String value;

    public FormPageLandingLimitVO(@NotNull String title, @NotNull String hint, @NotNull String value, @NotNull String name, @NotNull String validationBtn, @NotNull String validationURL, @NotNull OzonSpannableString description, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(validationBtn, "validationBtn");
        Intrinsics.checkNotNullParameter(validationURL, "validationURL");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.hint = hint;
        this.value = value;
        this.name = name;
        this.validationBtn = validationBtn;
        this.validationURL = validationURL;
        this.description = description;
        this.tokenizedEvent = tVar;
        this.id = -2010338025;
    }

    public static /* synthetic */ FormPageLandingLimitVO copy$default(FormPageLandingLimitVO formPageLandingLimitVO, String str, String str2, String str3, String str4, String str5, String str6, OzonSpannableString ozonSpannableString, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = formPageLandingLimitVO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = formPageLandingLimitVO.hint;
        }
        if ((i11 & 4) != 0) {
            str3 = formPageLandingLimitVO.value;
        }
        if ((i11 & 8) != 0) {
            str4 = formPageLandingLimitVO.name;
        }
        if ((i11 & 16) != 0) {
            str5 = formPageLandingLimitVO.validationBtn;
        }
        if ((i11 & 32) != 0) {
            str6 = formPageLandingLimitVO.validationURL;
        }
        if ((i11 & 64) != 0) {
            ozonSpannableString = formPageLandingLimitVO.description;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            tVar = formPageLandingLimitVO.tokenizedEvent;
        }
        OzonSpannableString ozonSpannableString2 = ozonSpannableString;
        t tVar2 = tVar;
        String str7 = str5;
        String str8 = str6;
        return formPageLandingLimitVO.copy(str, str2, str3, str4, str7, str8, ozonSpannableString2, tVar2);
    }

    @NotNull
    public final FormPageLandingLimitVO copy(@NotNull String title, @NotNull String hint, @NotNull String value, @NotNull String name, @NotNull String validationBtn, @NotNull String validationURL, @NotNull OzonSpannableString description, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(validationBtn, "validationBtn");
        Intrinsics.checkNotNullParameter(validationURL, "validationURL");
        Intrinsics.checkNotNullParameter(description, "description");
        return new FormPageLandingLimitVO(title, hint, value, name, validationBtn, validationURL, description, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormPageLandingLimitVO)) {
            return false;
        }
        FormPageLandingLimitVO formPageLandingLimitVO = (FormPageLandingLimitVO) other;
        return Intrinsics.d(this.title, formPageLandingLimitVO.title) && Intrinsics.d(this.hint, formPageLandingLimitVO.hint) && Intrinsics.d(this.value, formPageLandingLimitVO.value) && Intrinsics.d(this.name, formPageLandingLimitVO.name) && Intrinsics.d(this.validationBtn, formPageLandingLimitVO.validationBtn) && Intrinsics.d(this.validationURL, formPageLandingLimitVO.validationURL) && Intrinsics.d(this.description, formPageLandingLimitVO.description) && Intrinsics.d(this.tokenizedEvent, formPageLandingLimitVO.tokenizedEvent);
    }

    @NotNull
    public final OzonSpannableString getDescription() {
        return this.description;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final String getValidationBtn() {
        return this.validationBtn;
    }

    @NotNull
    public final String getValidationURL() {
        return this.validationURL;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = P.c(this.description, g.a(g.a(g.a(g.a(g.a(this.title.hashCode() * 31, 31, this.hint), 31, this.value), 31, this.name), 31, this.validationBtn), 31, this.validationURL), 31);
        t tVar = this.tokenizedEvent;
        return c11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.hint;
        String str3 = this.value;
        String str4 = this.name;
        String str5 = this.validationBtn;
        String str6 = this.validationURL;
        OzonSpannableString ozonSpannableString = this.description;
        t tVar = this.tokenizedEvent;
        StringBuilder d11 = C3660k.d("FormPageLandingLimitVO(title=", str, ", hint=", str2, ", value=");
        a.h(d11, str3, ", name=", str4, ", validationBtn=");
        a.h(d11, str5, ", validationURL=", str6, ", description=");
        d11.append((Object) ozonSpannableString);
        d11.append(", tokenizedEvent=");
        d11.append(tVar);
        d11.append(")");
        return d11.toString();
    }
}
