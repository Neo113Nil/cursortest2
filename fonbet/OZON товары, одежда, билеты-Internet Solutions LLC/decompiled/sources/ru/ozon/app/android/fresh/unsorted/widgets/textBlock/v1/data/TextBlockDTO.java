package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "widgetScrollKey", "", "alignment", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getWidgetScrollKey", "()Ljava/lang/String;", "getAlignment", "()Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AlignmentPosition", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TextBlockDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final AlignmentPosition alignment;

    @NotNull
    private final TextAtom text;
    private final String widgetScrollKey;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlignmentPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AlignmentPosition[] $VALUES;

        @i(name = "LEFT")
        public static final AlignmentPosition LEFT = new AlignmentPosition("LEFT", 0);

        @i(name = "RIGHT")
        public static final AlignmentPosition RIGHT = new AlignmentPosition("RIGHT", 1);

        @i(name = "CENTER")
        public static final AlignmentPosition CENTER = new AlignmentPosition("CENTER", 2);

        private static final /* synthetic */ AlignmentPosition[] $values() {
            return new AlignmentPosition[]{LEFT, RIGHT, CENTER};
        }

        static {
            AlignmentPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AlignmentPosition(String str, int i11) {
        }

        public static AlignmentPosition valueOf(String str) {
            return (AlignmentPosition) Enum.valueOf(AlignmentPosition.class, str);
        }

        public static AlignmentPosition[] values() {
            return (AlignmentPosition[]) $VALUES.clone();
        }
    }

    public TextBlockDTO(@NotNull TextAtom text, String str, @NotNull AlignmentPosition alignment) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.text = text;
        this.widgetScrollKey = str;
        this.alignment = alignment;
    }

    public static /* synthetic */ TextBlockDTO copy$default(TextBlockDTO textBlockDTO, TextAtom textAtom, String str, AlignmentPosition alignmentPosition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = textBlockDTO.text;
        }
        if ((i11 & 2) != 0) {
            str = textBlockDTO.widgetScrollKey;
        }
        if ((i11 & 4) != 0) {
            alignmentPosition = textBlockDTO.alignment;
        }
        return textBlockDTO.copy(textAtom, str, alignmentPosition);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWidgetScrollKey() {
        return this.widgetScrollKey;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AlignmentPosition getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final TextBlockDTO copy(@NotNull TextAtom text, String widgetScrollKey, @NotNull AlignmentPosition alignment) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new TextBlockDTO(text, widgetScrollKey, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockDTO)) {
            return false;
        }
        TextBlockDTO textBlockDTO = (TextBlockDTO) other;
        return Intrinsics.d(this.text, textBlockDTO.text) && Intrinsics.d(this.widgetScrollKey, textBlockDTO.widgetScrollKey) && this.alignment == textBlockDTO.alignment;
    }

    @NotNull
    public final AlignmentPosition getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public final String getWidgetScrollKey() {
        return this.widgetScrollKey;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.widgetScrollKey;
        return this.alignment.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.text;
        String str = this.widgetScrollKey;
        AlignmentPosition alignmentPosition = this.alignment;
        StringBuilder d11 = Bl.b.d("TextBlockDTO(text=", ", widgetScrollKey=", str, ", alignment=", textAtom);
        d11.append(alignmentPosition);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ TextBlockDTO(TextAtom textAtom, String str, AlignmentPosition alignmentPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, str, (i11 & 4) != 0 ? AlignmentPosition.LEFT : alignmentPosition);
    }
}
