package ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat;

import B0.C2454a;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b \u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b$\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "", "", "id", "backgroundColor", "", "isSelectable", "", "topCornerRadius", "bottomCornerRadius", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "seatBackrestColor", "number", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZIILru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZIILru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getBackgroundColor", "Z", "()Z", "I", "getTopCornerRadius", "getBottomCornerRadius", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSeatBackrestColor", "getNumber", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AirplaneSeatVO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final String backgroundColor;
    private final int bottomCornerRadius;

    @NotNull
    private final String id;
    private final boolean isSelectable;
    private final String number;
    private final String seatBackrestColor;
    private final TextAtom text;
    private final int topCornerRadius;

    public AirplaneSeatVO(@NotNull String id2, @NotNull String backgroundColor, boolean z11, int i11, int i12, TextAtom textAtom, String str, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = id2;
        this.backgroundColor = backgroundColor;
        this.isSelectable = z11;
        this.topCornerRadius = i11;
        this.bottomCornerRadius = i12;
        this.text = textAtom;
        this.seatBackrestColor = str;
        this.number = str2;
    }

    public static /* synthetic */ AirplaneSeatVO copy$default(AirplaneSeatVO airplaneSeatVO, String str, String str2, boolean z11, int i11, int i12, TextAtom textAtom, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = airplaneSeatVO.id;
        }
        if ((i13 & 2) != 0) {
            str2 = airplaneSeatVO.backgroundColor;
        }
        if ((i13 & 4) != 0) {
            z11 = airplaneSeatVO.isSelectable;
        }
        if ((i13 & 8) != 0) {
            i11 = airplaneSeatVO.topCornerRadius;
        }
        if ((i13 & 16) != 0) {
            i12 = airplaneSeatVO.bottomCornerRadius;
        }
        if ((i13 & 32) != 0) {
            textAtom = airplaneSeatVO.text;
        }
        if ((i13 & 64) != 0) {
            str3 = airplaneSeatVO.seatBackrestColor;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str4 = airplaneSeatVO.number;
        }
        String str5 = str3;
        String str6 = str4;
        int i14 = i12;
        TextAtom textAtom2 = textAtom;
        return airplaneSeatVO.copy(str, str2, z11, i11, i14, textAtom2, str5, str6);
    }

    @NotNull
    public final AirplaneSeatVO copy(@NotNull String id2, @NotNull String backgroundColor, boolean isSelectable, int topCornerRadius, int bottomCornerRadius, TextAtom text, String seatBackrestColor, String number) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new AirplaneSeatVO(id2, backgroundColor, isSelectable, topCornerRadius, bottomCornerRadius, text, seatBackrestColor, number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirplaneSeatVO)) {
            return false;
        }
        AirplaneSeatVO airplaneSeatVO = (AirplaneSeatVO) other;
        return Intrinsics.d(this.id, airplaneSeatVO.id) && Intrinsics.d(this.backgroundColor, airplaneSeatVO.backgroundColor) && this.isSelectable == airplaneSeatVO.isSelectable && this.topCornerRadius == airplaneSeatVO.topCornerRadius && this.bottomCornerRadius == airplaneSeatVO.bottomCornerRadius && Intrinsics.d(this.text, airplaneSeatVO.text) && Intrinsics.d(this.seatBackrestColor, airplaneSeatVO.seatBackrestColor) && Intrinsics.d(this.number, airplaneSeatVO.number);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBottomCornerRadius() {
        return this.bottomCornerRadius;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getSeatBackrestColor() {
        return this.seatBackrestColor;
    }

    public final TextAtom getText() {
        return this.text;
    }

    public final int getTopCornerRadius() {
        return this.topCornerRadius;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.bottomCornerRadius, C2454a.a(this.topCornerRadius, C3532b.a(g.a(this.id.hashCode() * 31, 31, this.backgroundColor), 31, this.isSelectable), 31), 31);
        TextAtom textAtom = this.text;
        int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.seatBackrestColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.number;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: isSelectable, reason: from getter */
    public final boolean getIsSelectable() {
        return this.isSelectable;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.backgroundColor;
        boolean z11 = this.isSelectable;
        int i11 = this.topCornerRadius;
        int i12 = this.bottomCornerRadius;
        TextAtom textAtom = this.text;
        String str3 = this.seatBackrestColor;
        String str4 = this.number;
        StringBuilder d11 = C3660k.d("AirplaneSeatVO(id=", str, ", backgroundColor=", str2, ", isSelectable=");
        d11.append(z11);
        d11.append(", topCornerRadius=");
        d11.append(i11);
        d11.append(", bottomCornerRadius=");
        d11.append(i12);
        d11.append(", text=");
        d11.append(textAtom);
        d11.append(", seatBackrestColor=");
        return C3173b.c(d11, str3, ", number=", str4, ")");
    }
}
