package ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.presentation;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "leftButtons", "rightButtons", "", "backgroundColor", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "Ljava/lang/String;", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RoundedNavBarVO implements c {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final List<IconButtonV3DTO> leftButtons;

    @NotNull
    private final List<IconButtonV3DTO> rightButtons;

    public RoundedNavBarVO(long j11, @NotNull List<IconButtonV3DTO> leftButtons, @NotNull List<IconButtonV3DTO> rightButtons, String str) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        this.id = j11;
        this.leftButtons = leftButtons;
        this.rightButtons = rightButtons;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedNavBarVO)) {
            return false;
        }
        RoundedNavBarVO roundedNavBarVO = (RoundedNavBarVO) other;
        return this.id == roundedNavBarVO.id && Intrinsics.d(this.leftButtons, roundedNavBarVO.leftButtons) && Intrinsics.d(this.rightButtons, roundedNavBarVO.rightButtons) && Intrinsics.d(this.backgroundColor, roundedNavBarVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<IconButtonV3DTO> getLeftButtons() {
        return this.leftButtons;
    }

    @NotNull
    public final List<IconButtonV3DTO> getRightButtons() {
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
        int b11 = g.b(g.b(Long.hashCode(this.id) * 31, 31, this.leftButtons), 31, this.rightButtons);
        String str = this.backgroundColor;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<IconButtonV3DTO> list = this.leftButtons;
        List<IconButtonV3DTO> list2 = this.rightButtons;
        String str = this.backgroundColor;
        StringBuilder b11 = b.b(j11, "RoundedNavBarVO(id=", ", leftButtons=", list);
        b11.append(", rightButtons=");
        b11.append(list2);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}
