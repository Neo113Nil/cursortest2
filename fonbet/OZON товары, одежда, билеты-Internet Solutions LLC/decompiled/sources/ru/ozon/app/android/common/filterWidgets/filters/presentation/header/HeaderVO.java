package ru.ozon.app.android.common.filterWidgets.filters.presentation.header;

import Ak.C2436a;
import G.g;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/header/HeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "rightButton", "originalUrl", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getOriginalUrl", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HeaderVO implements c {
    private final long id;
    private final ButtonV3Atom.LargeButton largeButton;

    @NotNull
    private final String originalUrl;
    private final ButtonV3Atom.LargeBorderlessButton rightButton;

    @NotNull
    private final String title;

    public HeaderVO(long j11, @NotNull String title, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @NotNull String originalUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.id = j11;
        this.title = title;
        this.largeButton = largeButton;
        this.rightButton = largeBorderlessButton;
        this.originalUrl = originalUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderVO)) {
            return false;
        }
        HeaderVO headerVO = (HeaderVO) other;
        return this.id == headerVO.id && Intrinsics.d(this.title, headerVO.title) && Intrinsics.d(this.largeButton, headerVO.largeButton) && Intrinsics.d(this.rightButton, headerVO.rightButton) && Intrinsics.d(this.originalUrl, headerVO.originalUrl);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
        return this.rightButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        int hashCode = (a11 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
        return this.originalUrl.hashCode() + ((hashCode + (largeBorderlessButton != null ? largeBorderlessButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
        String str2 = this.originalUrl;
        StringBuilder c11 = C2436a.c(j11, "HeaderVO(id=", ", title=", str);
        c11.append(", largeButton=");
        c11.append(largeButton);
        c11.append(", rightButton=");
        c11.append(largeBorderlessButton);
        return C6594f.a(", originalUrl=", str2, ")", c11);
    }
}
