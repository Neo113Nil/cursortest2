package ru.ozon.app.android.uikit.view.atoms.cells;

import Sc.InterfaceC3999a;
import Sc.o;
import Xc.a;
import Xc.b;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/CheckboxRadioCell;", "", "Landroid/view/View;", "getSelectorView", "()Landroid/view/View;", "selectorView", "SelectorStyle", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CheckboxRadioCell {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setSelectorStyle(@NotNull CheckboxRadioCell checkboxRadioCell, @NotNull SelectorStyle style) {
            int i11;
            Intrinsics.checkNotNullParameter(style, "style");
            View selectorView = checkboxRadioCell.getSelectorView();
            int i12 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            if (i12 == 1) {
                i11 = R$drawable.selector_checkbox;
            } else {
                if (i12 != 2) {
                    throw new o();
                }
                i11 = R$drawable.selector_cell_radio;
            }
            selectorView.setBackgroundResource(i11);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/CheckboxRadioCell$SelectorStyle;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKBOX", "RADIO", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SelectorStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SelectorStyle[] $VALUES;
        public static final SelectorStyle CHECKBOX = new SelectorStyle("CHECKBOX", 0);
        public static final SelectorStyle RADIO = new SelectorStyle("RADIO", 1);

        private static final /* synthetic */ SelectorStyle[] $values() {
            return new SelectorStyle[]{CHECKBOX, RADIO};
        }

        static {
            SelectorStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SelectorStyle(String str, int i11) {
        }

        public static SelectorStyle valueOf(String str) {
            return (SelectorStyle) Enum.valueOf(SelectorStyle.class, str);
        }

        public static SelectorStyle[] values() {
            return (SelectorStyle[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectorStyle.values().length];
            try {
                iArr[SelectorStyle.CHECKBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectorStyle.RADIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    View getSelectorView();
}
