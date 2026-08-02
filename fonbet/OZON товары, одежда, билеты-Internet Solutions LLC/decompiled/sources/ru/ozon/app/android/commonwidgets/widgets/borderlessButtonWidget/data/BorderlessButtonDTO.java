package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "align", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO$Align;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO$Align;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getAlign", "()Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO$Align;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Align", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BorderlessButtonDTO {

    @NotNull
    private final Align align;

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton button;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO$Align;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class Align {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;

        @i(name = "BUTTON_ALIGN_LEFT")
        public static final Align LEFT = new Align("LEFT", 0);

        @i(name = "BUTTON_ALIGN_CENTER")
        public static final Align CENTER = new Align("CENTER", 1);

        @i(name = "BUTTON_ALIGN_RIGHT")
        public static final Align RIGHT = new Align("RIGHT", 2);

        private static final /* synthetic */ Align[] $values() {
            return new Align[]{LEFT, CENTER, RIGHT};
        }

        static {
            Align[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Align(String str, int i11) {
        }

        @NotNull
        public static a<Align> getEntries() {
            return $ENTRIES;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    public BorderlessButtonDTO(@NotNull ButtonV3Atom.LargeBorderlessButton button, @NotNull Align align) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(align, "align");
        this.button = button;
        this.align = align;
    }

    public static /* synthetic */ BorderlessButtonDTO copy$default(BorderlessButtonDTO borderlessButtonDTO, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Align align, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeBorderlessButton = borderlessButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            align = borderlessButtonDTO.align;
        }
        return borderlessButtonDTO.copy(largeBorderlessButton, align);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Align getAlign() {
        return this.align;
    }

    @NotNull
    public final BorderlessButtonDTO copy(@NotNull ButtonV3Atom.LargeBorderlessButton button, @NotNull Align align) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(align, "align");
        return new BorderlessButtonDTO(button, align);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderlessButtonDTO)) {
            return false;
        }
        BorderlessButtonDTO borderlessButtonDTO = (BorderlessButtonDTO) other;
        return Intrinsics.d(this.button, borderlessButtonDTO.button) && this.align == borderlessButtonDTO.align;
    }

    @NotNull
    public final Align getAlign() {
        return this.align;
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getButton() {
        return this.button;
    }

    public int hashCode() {
        return this.align.hashCode() + (this.button.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BorderlessButtonDTO(button=" + this.button + ", align=" + this.align + ")";
    }

    public /* synthetic */ BorderlessButtonDTO(ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Align align, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(largeBorderlessButton, (i11 & 2) != 0 ? Align.LEFT : align);
    }
}
