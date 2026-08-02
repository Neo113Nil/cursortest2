package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO;", "", "theme", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO$Theme;", "ozonButton", "Lru/ozon/uni/atoms/data/AtomDTO;", "ozonSubtitle", "expressButton", "expressSubtitle", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO$Theme;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getTheme", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO$Theme;", "getOzonButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getOzonSubtitle", "getExpressButton", "getExpressSubtitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Theme", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MultiButtonDTO {
    public static final int $stable = AtomDTO.$stable;
    private final AtomDTO expressButton;
    private final AtomDTO expressSubtitle;
    private final AtomDTO ozonButton;
    private final AtomDTO ozonSubtitle;
    private final Theme theme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_HORIZONTAL", "THEME_TYPE_VERTICAL", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;
        public static final Theme THEME_TYPE_INVALID = new Theme("THEME_TYPE_INVALID", 0);
        public static final Theme THEME_TYPE_HORIZONTAL = new Theme("THEME_TYPE_HORIZONTAL", 1);
        public static final Theme THEME_TYPE_VERTICAL = new Theme("THEME_TYPE_VERTICAL", 2);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{THEME_TYPE_INVALID, THEME_TYPE_HORIZONTAL, THEME_TYPE_VERTICAL};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Theme(String str, int i11) {
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    public MultiButtonDTO(Theme theme, AtomDTO atomDTO, AtomDTO atomDTO2, AtomDTO atomDTO3, AtomDTO atomDTO4) {
        this.theme = theme;
        this.ozonButton = atomDTO;
        this.ozonSubtitle = atomDTO2;
        this.expressButton = atomDTO3;
        this.expressSubtitle = atomDTO4;
    }

    public static /* synthetic */ MultiButtonDTO copy$default(MultiButtonDTO multiButtonDTO, Theme theme, AtomDTO atomDTO, AtomDTO atomDTO2, AtomDTO atomDTO3, AtomDTO atomDTO4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            theme = multiButtonDTO.theme;
        }
        if ((i11 & 2) != 0) {
            atomDTO = multiButtonDTO.ozonButton;
        }
        if ((i11 & 4) != 0) {
            atomDTO2 = multiButtonDTO.ozonSubtitle;
        }
        if ((i11 & 8) != 0) {
            atomDTO3 = multiButtonDTO.expressButton;
        }
        if ((i11 & 16) != 0) {
            atomDTO4 = multiButtonDTO.expressSubtitle;
        }
        AtomDTO atomDTO5 = atomDTO4;
        AtomDTO atomDTO6 = atomDTO2;
        return multiButtonDTO.copy(theme, atomDTO, atomDTO6, atomDTO3, atomDTO5);
    }

    /* renamed from: component1, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomDTO getOzonButton() {
        return this.ozonButton;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomDTO getOzonSubtitle() {
        return this.ozonSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomDTO getExpressButton() {
        return this.expressButton;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomDTO getExpressSubtitle() {
        return this.expressSubtitle;
    }

    @NotNull
    public final MultiButtonDTO copy(Theme theme, AtomDTO ozonButton, AtomDTO ozonSubtitle, AtomDTO expressButton, AtomDTO expressSubtitle) {
        return new MultiButtonDTO(theme, ozonButton, ozonSubtitle, expressButton, expressSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiButtonDTO)) {
            return false;
        }
        MultiButtonDTO multiButtonDTO = (MultiButtonDTO) other;
        return this.theme == multiButtonDTO.theme && Intrinsics.d(this.ozonButton, multiButtonDTO.ozonButton) && Intrinsics.d(this.ozonSubtitle, multiButtonDTO.ozonSubtitle) && Intrinsics.d(this.expressButton, multiButtonDTO.expressButton) && Intrinsics.d(this.expressSubtitle, multiButtonDTO.expressSubtitle);
    }

    public final AtomDTO getExpressButton() {
        return this.expressButton;
    }

    public final AtomDTO getExpressSubtitle() {
        return this.expressSubtitle;
    }

    public final AtomDTO getOzonButton() {
        return this.ozonButton;
    }

    public final AtomDTO getOzonSubtitle() {
        return this.ozonSubtitle;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        Theme theme = this.theme;
        int hashCode = (theme == null ? 0 : theme.hashCode()) * 31;
        AtomDTO atomDTO = this.ozonButton;
        int hashCode2 = (hashCode + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        AtomDTO atomDTO2 = this.ozonSubtitle;
        int hashCode3 = (hashCode2 + (atomDTO2 == null ? 0 : atomDTO2.hashCode())) * 31;
        AtomDTO atomDTO3 = this.expressButton;
        int hashCode4 = (hashCode3 + (atomDTO3 == null ? 0 : atomDTO3.hashCode())) * 31;
        AtomDTO atomDTO4 = this.expressSubtitle;
        return hashCode4 + (atomDTO4 != null ? atomDTO4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MultiButtonDTO(theme=" + this.theme + ", ozonButton=" + this.ozonButton + ", ozonSubtitle=" + this.ozonSubtitle + ", expressButton=" + this.expressButton + ", expressSubtitle=" + this.expressSubtitle + ")";
    }

    public /* synthetic */ MultiButtonDTO(Theme theme, AtomDTO atomDTO, AtomDTO atomDTO2, AtomDTO atomDTO3, AtomDTO atomDTO4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Theme.THEME_TYPE_VERTICAL : theme, atomDTO, atomDTO2, atomDTO3, atomDTO4);
    }
}
