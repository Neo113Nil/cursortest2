package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.color.ColorAtom;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"diffUtil", "ru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorsAdapterKt$diffUtil$1", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorsAdapterKt$diffUtil$1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CircleColorsAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.CircleColorsAdapterKt$diffUtil$1] */
    public static final CircleColorsAdapterKt$diffUtil$1 diffUtil() {
        return new i.d<ColorAtom>() { // from class: ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.CircleColorsAdapterKt$diffUtil$1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ColorAtom oldItem, ColorAtom newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ColorAtom oldItem, ColorAtom newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getHex(), newItem.getHex());
            }
        };
    }
}
