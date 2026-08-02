package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button.models;

import Tl.b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/models/NoUiNewFiltersPartVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "closeApplyButton", "", "originalUrl", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCloseApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/lang/String;", "getOriginalUrl", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NoUiNewFiltersPartVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton closeApplyButton;
    private final long id;

    @NotNull
    private final String originalUrl;

    public NoUiNewFiltersPartVO(long j11, @NotNull ButtonV3Atom.LargeButton closeApplyButton, @NotNull String originalUrl) {
        Intrinsics.checkNotNullParameter(closeApplyButton, "closeApplyButton");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.id = j11;
        this.closeApplyButton = closeApplyButton;
        this.originalUrl = originalUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoUiNewFiltersPartVO)) {
            return false;
        }
        NoUiNewFiltersPartVO noUiNewFiltersPartVO = (NoUiNewFiltersPartVO) other;
        return this.id == noUiNewFiltersPartVO.id && Intrinsics.d(this.closeApplyButton, noUiNewFiltersPartVO.closeApplyButton) && Intrinsics.d(this.originalUrl, noUiNewFiltersPartVO.originalUrl);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getCloseApplyButton() {
        return this.closeApplyButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.originalUrl.hashCode() + b.a(this.closeApplyButton, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        return C6594f.a(", originalUrl=", this.originalUrl, ")", Bi.b.h("NoUiNewFiltersPartVO(id=", this.id, ", closeApplyButton=", this.closeApplyButton));
    }
}
