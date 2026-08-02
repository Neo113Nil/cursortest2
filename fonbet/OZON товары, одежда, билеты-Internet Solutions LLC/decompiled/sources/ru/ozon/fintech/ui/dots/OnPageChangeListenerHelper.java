package ru.ozon.fintech.ui.dots;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Q;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ%\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH ¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H ¢\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/dots/OnPageChangeListenerHelper;", "", "<init>", "()V", "lastLeftPosition", "", "lastRightPosition", "pageCount", "getPageCount$fintech_ui_prodRelease", "()I", "onPageScrolled", "", "position", "positionOffset", "", "selectedPosition", "nextPosition", "onPageScrolled$fintech_ui_prodRelease", "resetPosition", "resetPosition$fintech_ui_prodRelease", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OnPageChangeListenerHelper {
    private int lastLeftPosition = -1;
    private int lastRightPosition = -1;

    public abstract int getPageCount$fintech_ui_prodRelease();

    public final void onPageScrolled(int position, float positionOffset) {
        float f7 = position + positionOffset;
        float pageCount$fintech_ui_prodRelease = getPageCount$fintech_ui_prodRelease() - 1;
        if (f7 == pageCount$fintech_ui_prodRelease) {
            f7 = pageCount$fintech_ui_prodRelease - 1.0E-4f;
        }
        int i11 = (int) f7;
        int i12 = i11 + 1;
        if (i12 > pageCount$fintech_ui_prodRelease || i11 < 0) {
            return;
        }
        onPageScrolled$fintech_ui_prodRelease(i11, i12, f7 % 1);
        int i13 = this.lastLeftPosition;
        if (i13 != -1) {
            if (i11 > i13) {
                Iterator<Integer> it = h.o(i13, i11).iterator();
                while (it.hasNext()) {
                    resetPosition$fintech_ui_prodRelease(((Q) it).b());
                }
            }
            int i14 = this.lastRightPosition;
            if (i12 < i14) {
                resetPosition$fintech_ui_prodRelease(i14);
                Iterator<Integer> it2 = new IntRange(i11 + 2, this.lastRightPosition, 1).iterator();
                while (it2.hasNext()) {
                    resetPosition$fintech_ui_prodRelease(((Q) it2).b());
                }
            }
        }
        this.lastLeftPosition = i11;
        this.lastRightPosition = i12;
    }

    public abstract void onPageScrolled$fintech_ui_prodRelease(int selectedPosition, int nextPosition, float positionOffset);

    public abstract void resetPosition$fintech_ui_prodRelease(int position);
}
