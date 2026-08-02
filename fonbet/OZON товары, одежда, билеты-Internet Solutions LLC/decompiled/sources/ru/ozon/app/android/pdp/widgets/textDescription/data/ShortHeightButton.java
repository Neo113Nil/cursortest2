package ru.ozon.app.android.pdp.widgets.textDescription.data;

import B90.C2619v;
import Lc.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "", "shortHeightLimit", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)V", "getShortHeightLimit", "()I", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShortHeightButton {
    public static final int $stable = 8;

    @NotNull
    private final Icon icon;
    private final int shortHeightLimit;

    @NotNull
    private final TextAtom text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ShortHeightButton(int i11, @NotNull TextAtom text, @NotNull Icon icon, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.shortHeightLimit = i11;
        this.text = text;
        this.icon = icon;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShortHeightButton copy$default(ShortHeightButton shortHeightButton, int i11, TextAtom textAtom, Icon icon, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = shortHeightButton.shortHeightLimit;
        }
        if ((i12 & 2) != 0) {
            textAtom = shortHeightButton.text;
        }
        if ((i12 & 4) != 0) {
            icon = shortHeightButton.icon;
        }
        if ((i12 & 8) != 0) {
            map = shortHeightButton.trackingInfo;
        }
        return shortHeightButton.copy(i11, textAtom, icon, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getShortHeightLimit() {
        return this.shortHeightLimit;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ShortHeightButton copy(int shortHeightLimit, @NotNull TextAtom text, @NotNull Icon icon, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new ShortHeightButton(shortHeightLimit, text, icon, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortHeightButton)) {
            return false;
        }
        ShortHeightButton shortHeightButton = (ShortHeightButton) other;
        return this.shortHeightLimit == shortHeightButton.shortHeightLimit && Intrinsics.d(this.text, shortHeightButton.text) && Intrinsics.d(this.icon, shortHeightButton.icon) && Intrinsics.d(this.trackingInfo, shortHeightButton.trackingInfo);
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    public final int getShortHeightLimit() {
        return this.shortHeightLimit;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = a.a(this.icon, C2619v.b(Integer.hashCode(this.shortHeightLimit) * 31, 31, this.text), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "ShortHeightButton(shortHeightLimit=" + this.shortHeightLimit + ", text=" + this.text + ", icon=" + this.icon + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
