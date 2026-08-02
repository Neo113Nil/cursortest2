package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.overlay;

import G.g;
import Lh.b;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/overlay/MilesForBuyersModalInfoButtonsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "", "backgroundColor", "<init>", "(JLjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MilesForBuyersModalInfoButtonsVO implements c {
    private final String backgroundColor;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final long id;

    public MilesForBuyersModalInfoButtonsVO(long j11, @NotNull List<ButtonV3DTO> buttons, String str) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.buttons = buttons;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilesForBuyersModalInfoButtonsVO)) {
            return false;
        }
        MilesForBuyersModalInfoButtonsVO milesForBuyersModalInfoButtonsVO = (MilesForBuyersModalInfoButtonsVO) other;
        return this.id == milesForBuyersModalInfoButtonsVO.id && Intrinsics.d(this.buttons, milesForBuyersModalInfoButtonsVO.buttons) && Intrinsics.d(this.backgroundColor, milesForBuyersModalInfoButtonsVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.buttons);
        String str = this.backgroundColor;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return C6594f.a(", backgroundColor=", this.backgroundColor, ")", b.b(this.id, "MilesForBuyersModalInfoButtonsVO(id=", ", buttons=", this.buttons));
    }
}
