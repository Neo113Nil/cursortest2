package ru.ozon.app.android.marketing.widgets.highlightsWrapper.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText$HighlightIcon;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText$HighlightIcon;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText$HighlightIcon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HighlightIcon", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HighlightsWrapperProgressText {
    public static final int $stable = TextAtom.$stable;
    private final HighlightIcon icon;

    @NotNull
    private final TextAtom text;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText$HighlightIcon;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTintColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HighlightIcon {
        public static final int $stable = 0;

        @NotNull
        private final String name;

        @NotNull
        private final String tintColor;

        public HighlightIcon(@NotNull String name, @NotNull String tintColor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            this.name = name;
            this.tintColor = tintColor;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getTintColor() {
            return this.tintColor;
        }
    }

    public HighlightsWrapperProgressText(@NotNull TextAtom text, HighlightIcon highlightIcon) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = highlightIcon;
    }

    public static /* synthetic */ HighlightsWrapperProgressText copy$default(HighlightsWrapperProgressText highlightsWrapperProgressText, TextAtom textAtom, HighlightIcon highlightIcon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = highlightsWrapperProgressText.text;
        }
        if ((i11 & 2) != 0) {
            highlightIcon = highlightsWrapperProgressText.icon;
        }
        return highlightsWrapperProgressText.copy(textAtom, highlightIcon);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final HighlightIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final HighlightsWrapperProgressText copy(@NotNull TextAtom text, HighlightIcon icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new HighlightsWrapperProgressText(text, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightsWrapperProgressText)) {
            return false;
        }
        HighlightsWrapperProgressText highlightsWrapperProgressText = (HighlightsWrapperProgressText) other;
        return Intrinsics.d(this.text, highlightsWrapperProgressText.text) && Intrinsics.d(this.icon, highlightsWrapperProgressText.icon);
    }

    public final HighlightIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        HighlightIcon highlightIcon = this.icon;
        return hashCode + (highlightIcon == null ? 0 : highlightIcon.hashCode());
    }

    @NotNull
    public String toString() {
        return "HighlightsWrapperProgressText(text=" + this.text + ", icon=" + this.icon + ")";
    }
}
