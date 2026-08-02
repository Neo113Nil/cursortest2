package ru.ozon.app.android.session.editCredential.newCredentials.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.newCredentials.data.TranslationLexemes;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b-\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b.\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b0\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b2\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b3\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b4\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b5\u0010\u0019R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;", "inputType", "hint", AppMeasurementSdk.ConditionalUserProperty.NAME, "caption", "confirmButtonText", "secondaryButtonText", "confirmButtonAction", "secondaryButtonDeeplink", "hintButtonText", "hintButtonDeeplink", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes;", "translationLexemes", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;", "getInputType", "()Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;", "getHint", "getName", "getCaption", "getConfirmButtonText", "getSecondaryButtonText", "getConfirmButtonAction", "getSecondaryButtonDeeplink", "getHintButtonText", "getHintButtonDeeplink", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes;", "getTranslationLexemes", "()Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewCredentialsVO implements c {
    public static final int $stable = OzonSpannableString.$stable;
    private final String caption;
    private final String confirmButtonAction;
    private final String confirmButtonText;
    private final String hint;
    private final String hintButtonDeeplink;
    private final String hintButtonText;
    private final long id;
    private final InputType inputType;
    private final String name;
    private final String secondaryButtonDeeplink;
    private final String secondaryButtonText;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final TranslationLexemes translationLexemes;

    public NewCredentialsVO(long j11, @NotNull String title, OzonSpannableString ozonSpannableString, InputType inputType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull TranslationLexemes translationLexemes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(translationLexemes, "translationLexemes");
        this.id = j11;
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.inputType = inputType;
        this.hint = str;
        this.name = str2;
        this.caption = str3;
        this.confirmButtonText = str4;
        this.secondaryButtonText = str5;
        this.confirmButtonAction = str6;
        this.secondaryButtonDeeplink = str7;
        this.hintButtonText = str8;
        this.hintButtonDeeplink = str9;
        this.translationLexemes = translationLexemes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCredentialsVO)) {
            return false;
        }
        NewCredentialsVO newCredentialsVO = (NewCredentialsVO) other;
        return this.id == newCredentialsVO.id && Intrinsics.d(this.title, newCredentialsVO.title) && Intrinsics.d(this.subtitle, newCredentialsVO.subtitle) && this.inputType == newCredentialsVO.inputType && Intrinsics.d(this.hint, newCredentialsVO.hint) && Intrinsics.d(this.name, newCredentialsVO.name) && Intrinsics.d(this.caption, newCredentialsVO.caption) && Intrinsics.d(this.confirmButtonText, newCredentialsVO.confirmButtonText) && Intrinsics.d(this.secondaryButtonText, newCredentialsVO.secondaryButtonText) && Intrinsics.d(this.confirmButtonAction, newCredentialsVO.confirmButtonAction) && Intrinsics.d(this.secondaryButtonDeeplink, newCredentialsVO.secondaryButtonDeeplink) && Intrinsics.d(this.hintButtonText, newCredentialsVO.hintButtonText) && Intrinsics.d(this.hintButtonDeeplink, newCredentialsVO.hintButtonDeeplink) && Intrinsics.d(this.translationLexemes, newCredentialsVO.translationLexemes);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getConfirmButtonAction() {
        return this.confirmButtonAction;
    }

    public final String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getHintButtonDeeplink() {
        return this.hintButtonDeeplink;
    }

    public final String getHintButtonText() {
        return this.hintButtonText;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final InputType getInputType() {
        return this.inputType;
    }

    public final String getName() {
        return this.name;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSecondaryButtonDeeplink() {
        return this.secondaryButtonDeeplink;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final TranslationLexemes getTranslationLexemes() {
        return this.translationLexemes;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode = (a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        InputType inputType = this.inputType;
        int hashCode2 = (hashCode + (inputType == null ? 0 : inputType.hashCode())) * 31;
        String str = this.hint;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.caption;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.confirmButtonText;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondaryButtonText;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.confirmButtonAction;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.secondaryButtonDeeplink;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.hintButtonText;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.hintButtonDeeplink;
        return this.translationLexemes.hashCode() + ((hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        InputType inputType = this.inputType;
        String str2 = this.hint;
        String str3 = this.name;
        String str4 = this.caption;
        String str5 = this.confirmButtonText;
        String str6 = this.secondaryButtonText;
        String str7 = this.confirmButtonAction;
        String str8 = this.secondaryButtonDeeplink;
        String str9 = this.hintButtonText;
        String str10 = this.hintButtonDeeplink;
        TranslationLexemes translationLexemes = this.translationLexemes;
        StringBuilder c11 = C2436a.c(j11, "NewCredentialsVO(id=", ", title=", str);
        c11.append(", subtitle=");
        c11.append((Object) ozonSpannableString);
        c11.append(", inputType=");
        c11.append(inputType);
        a.h(c11, ", hint=", str2, ", name=", str3);
        a.h(c11, ", caption=", str4, ", confirmButtonText=", str5);
        a.h(c11, ", secondaryButtonText=", str6, ", confirmButtonAction=", str7);
        a.h(c11, ", secondaryButtonDeeplink=", str8, ", hintButtonText=", str9);
        c11.append(", hintButtonDeeplink=");
        c11.append(str10);
        c11.append(", translationLexemes=");
        c11.append(translationLexemes);
        c11.append(")");
        return c11.toString();
    }
}
