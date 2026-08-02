package ru.ozon.fintech.settings.models;

import S90.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/settings/models/Pins;", "", "", "Lru/ozon/fintech/settings/models/Pin;", "pins", "LS90/e;", "piningState", "<init>", "(Ljava/util/List;LS90/e;)V", "component1", "()Ljava/util/List;", "component2", "()LS90/e;", "copy", "(Ljava/util/List;LS90/e;)Lru/ozon/fintech/settings/models/Pins;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPins", "LS90/e;", "getPiningState", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Pins {

    @i(name = "piningstate")
    private final e piningState;

    @i(name = "pins")
    @NotNull
    private final List<Pin> pins;

    public Pins() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pins copy$default(Pins pins, List list, e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pins.pins;
        }
        if ((i11 & 2) != 0) {
            eVar = pins.piningState;
        }
        return pins.copy(list, eVar);
    }

    @NotNull
    public final List<Pin> component1() {
        return this.pins;
    }

    /* renamed from: component2, reason: from getter */
    public final e getPiningState() {
        return this.piningState;
    }

    @NotNull
    public final Pins copy(@NotNull List<Pin> pins, e piningState) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        return new Pins(pins, piningState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pins)) {
            return false;
        }
        Pins pins = (Pins) other;
        return Intrinsics.d(this.pins, pins.pins) && this.piningState == pins.piningState;
    }

    public final e getPiningState() {
        return this.piningState;
    }

    @NotNull
    public final List<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = this.pins.hashCode() * 31;
        e eVar = this.piningState;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "Pins(pins=" + this.pins + ", piningState=" + this.piningState + ")";
    }

    public Pins(@NotNull List<Pin> pins, e eVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.piningState = eVar;
    }

    public Pins(List list, e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? null : eVar);
    }
}
