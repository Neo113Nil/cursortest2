package ru.ozon.app.android.session.userAdultModalMobile.presentation.models;

import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import Tl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.UserAdultModalDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b)\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u0017R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/UserAdultModalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;", "input", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "termsOfUse", "", "linkTextColor", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;ILjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;", "getInput", "()Lru/ozon/app/android/session/userAdultModalMobile/data/models/UserAdultModalDTO$Input;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTermsOfUse", "I", "getLinkTextColor", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAdultModalVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final long id;
    private final UserAdultModalDTO.Input input;
    private final int linkTextColor;

    @NotNull
    private final TextAtom subtitle;
    private final TextAtom termsOfUse;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public UserAdultModalVO(long j11, @NotNull TextAtom subtitle, UserAdultModalDTO.Input input, @NotNull ButtonV3Atom.LargeButton button, TextAtom textAtom, int i11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.subtitle = subtitle;
        this.input = input;
        this.button = button;
        this.termsOfUse = textAtom;
        this.linkTextColor = i11;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdultModalVO)) {
            return false;
        }
        UserAdultModalVO userAdultModalVO = (UserAdultModalVO) other;
        return this.id == userAdultModalVO.id && Intrinsics.d(this.subtitle, userAdultModalVO.subtitle) && Intrinsics.d(this.input, userAdultModalVO.input) && Intrinsics.d(this.button, userAdultModalVO.button) && Intrinsics.d(this.termsOfUse, userAdultModalVO.termsOfUse) && this.linkTextColor == userAdultModalVO.linkTextColor && Intrinsics.d(this.trackingInfo, userAdultModalVO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final UserAdultModalDTO.Input getInput() {
        return this.input;
    }

    public final int getLinkTextColor() {
        return this.linkTextColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTermsOfUse() {
        return this.termsOfUse;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.subtitle);
        UserAdultModalDTO.Input input = this.input;
        int a11 = b.a(this.button, (b11 + (input == null ? 0 : input.hashCode())) * 31, 31);
        TextAtom textAtom = this.termsOfUse;
        int a12 = C2454a.a(this.linkTextColor, (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.subtitle;
        UserAdultModalDTO.Input input = this.input;
        ButtonV3Atom.LargeButton largeButton = this.button;
        TextAtom textAtom2 = this.termsOfUse;
        int i11 = this.linkTextColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = C2639a.c("UserAdultModalVO(id=", j11, ", subtitle=", textAtom);
        c11.append(", input=");
        c11.append(input);
        c11.append(", button=");
        c11.append(largeButton);
        c11.append(", termsOfUse=");
        c11.append(textAtom2);
        c11.append(", linkTextColor=");
        c11.append(i11);
        return C2639a.b(c11, ", trackingInfo=", map, ")");
    }
}
