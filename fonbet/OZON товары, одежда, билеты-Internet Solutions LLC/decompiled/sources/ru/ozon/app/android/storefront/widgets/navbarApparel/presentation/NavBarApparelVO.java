package ru.ozon.app.android.storefront.widgets.navbarApparel.presentation;

import E00.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010\u0010R\"\u0010#\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LE00/b;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "backButton", "", "", "rightButtons", "", "prefetchDeeplink", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBackButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/util/List;", "getRightButtons", "()Ljava/util/List;", "Ljava/lang/String;", "getPrefetchDeeplink", "currentScrollY", "I", "getCurrentScrollY", "setCurrentScrollY", "(I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavBarApparelVO implements c, b {
    private final IconButtonV3DTO backButton;
    private int currentScrollY;
    private final long id;
    private final String prefetchDeeplink;
    private final List<Object> rightButtons;

    public NavBarApparelVO(long j11, IconButtonV3DTO iconButtonV3DTO, List<? extends Object> list, String str) {
        this.id = j11;
        this.backButton = iconButtonV3DTO;
        this.rightButtons = list;
        this.prefetchDeeplink = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarApparelVO)) {
            return false;
        }
        NavBarApparelVO navBarApparelVO = (NavBarApparelVO) other;
        return this.id == navBarApparelVO.id && Intrinsics.d(this.backButton, navBarApparelVO.backButton) && Intrinsics.d(this.rightButtons, navBarApparelVO.rightButtons) && Intrinsics.d(this.prefetchDeeplink, navBarApparelVO.prefetchDeeplink);
    }

    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    public final int getCurrentScrollY() {
        return this.currentScrollY;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getPrefetchDeeplink() {
        return this.prefetchDeeplink;
    }

    public final List<Object> getRightButtons() {
        return this.rightButtons;
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
        int hashCode = Long.hashCode(this.id) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.backButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        List<Object> list = this.rightButtons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.prefetchDeeplink;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setCurrentScrollY(int i11) {
        this.currentScrollY = i11;
    }

    @NotNull
    public String toString() {
        return "NavBarApparelVO(id=" + this.id + ", backButton=" + this.backButton + ", rightButtons=" + this.rightButtons + ", prefetchDeeplink=" + this.prefetchDeeplink + ")";
    }
}
