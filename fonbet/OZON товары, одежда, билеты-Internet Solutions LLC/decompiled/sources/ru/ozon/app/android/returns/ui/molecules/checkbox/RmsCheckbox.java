package ru.ozon.app.android.returns.ui.molecules.checkbox;

import D3.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "checked", "", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getChecked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisabled", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "equals", "other", "hashCode", "", "toString", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RmsCheckbox {
    private final Boolean checked;
    private final Boolean disabled;

    @NotNull
    private final String name;

    public RmsCheckbox(@NotNull String name, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.checked = bool;
        this.disabled = bool2;
    }

    public static /* synthetic */ RmsCheckbox copy$default(RmsCheckbox rmsCheckbox, String str, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rmsCheckbox.name;
        }
        if ((i11 & 2) != 0) {
            bool = rmsCheckbox.checked;
        }
        if ((i11 & 4) != 0) {
            bool2 = rmsCheckbox.disabled;
        }
        return rmsCheckbox.copy(str, bool, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getChecked() {
        return this.checked;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    public final RmsCheckbox copy(@NotNull String name, Boolean checked, Boolean disabled) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new RmsCheckbox(name, checked, disabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RmsCheckbox)) {
            return false;
        }
        RmsCheckbox rmsCheckbox = (RmsCheckbox) other;
        return Intrinsics.d(this.name, rmsCheckbox.name) && Intrinsics.d(this.checked, rmsCheckbox.checked) && Intrinsics.d(this.disabled, rmsCheckbox.disabled);
    }

    public final Boolean getChecked() {
        return this.checked;
    }

    public final Boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Boolean bool = this.checked;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disabled;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        Boolean bool = this.checked;
        Boolean bool2 = this.disabled;
        StringBuilder sb2 = new StringBuilder("RmsCheckbox(name=");
        sb2.append(str);
        sb2.append(", checked=");
        sb2.append(bool);
        sb2.append(", disabled=");
        return g.d(sb2, bool2, ")");
    }
}
