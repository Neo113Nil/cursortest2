package ru.ozon.app.android.storefront.widgets.megadraw.data;

import Co.a;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/data/CountItem;", "", "icon", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Ljava/lang/String;", "getValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CountItem {
    public static final int $stable = 0;

    @NotNull
    private final String icon;

    @NotNull
    private final TextDTO text;

    @NotNull
    private final TextDTO value;

    public CountItem(@NotNull String icon, @NotNull TextDTO value, @NotNull TextDTO text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(text, "text");
        this.icon = icon;
        this.value = value;
        this.text = text;
    }

    public static /* synthetic */ CountItem copy$default(CountItem countItem, String str, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countItem.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = countItem.value;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = countItem.text;
        }
        return countItem.copy(str, textDTO, textDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final CountItem copy(@NotNull String icon, @NotNull TextDTO value, @NotNull TextDTO text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(text, "text");
        return new CountItem(icon, value, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountItem)) {
            return false;
        }
        CountItem countItem = (CountItem) other;
        return Intrinsics.d(this.icon, countItem.icon) && Intrinsics.d(this.value, countItem.value) && Intrinsics.d(this.text, countItem.text);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final TextDTO getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.text.hashCode() + b.a(this.value, this.icon.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        TextDTO textDTO = this.value;
        return Tl.b.e(a.b("CountItem(icon=", textDTO, str, ", value=", ", text="), this.text, ")");
    }
}
