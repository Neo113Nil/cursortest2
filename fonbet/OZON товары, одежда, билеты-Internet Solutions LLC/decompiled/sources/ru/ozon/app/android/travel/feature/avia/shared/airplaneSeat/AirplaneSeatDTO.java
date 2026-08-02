package ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat;

import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "", "id", "", "backgroundColor", "isSelectable", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "seatBackrestColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getBackgroundColor", "()Z", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSeatBackrestColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AirplaneSeatDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String id;
    private final boolean isSelectable;
    private final String seatBackrestColor;
    private final TextAtom text;

    public AirplaneSeatDTO(@NotNull String id2, @NotNull String backgroundColor, boolean z11, TextAtom textAtom, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = id2;
        this.backgroundColor = backgroundColor;
        this.isSelectable = z11;
        this.text = textAtom;
        this.seatBackrestColor = str;
    }

    public static /* synthetic */ AirplaneSeatDTO copy$default(AirplaneSeatDTO airplaneSeatDTO, String str, String str2, boolean z11, TextAtom textAtom, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = airplaneSeatDTO.id;
        }
        if ((i11 & 2) != 0) {
            str2 = airplaneSeatDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            z11 = airplaneSeatDTO.isSelectable;
        }
        if ((i11 & 8) != 0) {
            textAtom = airplaneSeatDTO.text;
        }
        if ((i11 & 16) != 0) {
            str3 = airplaneSeatDTO.seatBackrestColor;
        }
        String str4 = str3;
        boolean z12 = z11;
        return airplaneSeatDTO.copy(str, str2, z12, textAtom, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelectable() {
        return this.isSelectable;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSeatBackrestColor() {
        return this.seatBackrestColor;
    }

    @NotNull
    public final AirplaneSeatDTO copy(@NotNull String id2, @NotNull String backgroundColor, boolean isSelectable, TextAtom text, String seatBackrestColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new AirplaneSeatDTO(id2, backgroundColor, isSelectable, text, seatBackrestColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirplaneSeatDTO)) {
            return false;
        }
        AirplaneSeatDTO airplaneSeatDTO = (AirplaneSeatDTO) other;
        return Intrinsics.d(this.id, airplaneSeatDTO.id) && Intrinsics.d(this.backgroundColor, airplaneSeatDTO.backgroundColor) && this.isSelectable == airplaneSeatDTO.isSelectable && Intrinsics.d(this.text, airplaneSeatDTO.text) && Intrinsics.d(this.seatBackrestColor, airplaneSeatDTO.seatBackrestColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getSeatBackrestColor() {
        return this.seatBackrestColor;
    }

    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(this.id.hashCode() * 31, 31, this.backgroundColor), 31, this.isSelectable);
        TextAtom textAtom = this.text;
        int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.seatBackrestColor;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isSelectable() {
        return this.isSelectable;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.backgroundColor;
        boolean z11 = this.isSelectable;
        TextAtom textAtom = this.text;
        String str3 = this.seatBackrestColor;
        StringBuilder d11 = C3660k.d("AirplaneSeatDTO(id=", str, ", backgroundColor=", str2, ", isSelectable=");
        d11.append(z11);
        d11.append(", text=");
        d11.append(textAtom);
        d11.append(", seatBackrestColor=");
        return o0.c(d11, str3, ")");
    }
}
