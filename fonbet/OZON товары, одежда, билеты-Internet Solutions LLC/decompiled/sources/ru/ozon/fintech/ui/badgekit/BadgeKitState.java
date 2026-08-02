package ru.ozon.fintech.ui.badgekit;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002$%B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/fintech/ui/badgekit/BadgeKitState;", "", "text", "", "size", "Lru/ozon/fintech/ui/badgekit/BadgeKitState$Size;", "color", "Lru/ozon/fintech/ui/badgekit/BadgeKitState$Color;", "chevron", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/ui/badgekit/BadgeKitState$Size;Lru/ozon/fintech/ui/badgekit/BadgeKitState$Color;ZLkotlin/jvm/functions/Function0;)V", "getText", "()Ljava/lang/String;", "getSize", "()Lru/ozon/fintech/ui/badgekit/BadgeKitState$Size;", "getColor", "()Lru/ozon/fintech/ui/badgekit/BadgeKitState$Color;", "getChevron", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Size", "Color", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BadgeKitState {
    private final boolean chevron;

    @NotNull
    private final Color color;
    private final Function0<Unit> onClick;

    @NotNull
    private final Size size;

    @NotNull
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/ui/badgekit/BadgeKitState$Color;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING_SECONDARY", "NEUTRAL_SECONDARY", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Color {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Color[] $VALUES;
        public static final Color WARNING_SECONDARY = new Color("WARNING_SECONDARY", 0);
        public static final Color NEUTRAL_SECONDARY = new Color("NEUTRAL_SECONDARY", 1);

        private static final /* synthetic */ Color[] $values() {
            return new Color[]{WARNING_SECONDARY, NEUTRAL_SECONDARY};
        }

        static {
            Color[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Color(String str, int i11) {
        }

        @NotNull
        public static a<Color> getEntries() {
            return $ENTRIES;
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/ui/badgekit/BadgeKitState$Size;", "", "<init>", "(Ljava/lang/String;I)V", "S_500", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size S_500 = new Size("S_500", 0);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{S_500};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        @NotNull
        public static a<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public BadgeKitState(@NotNull String text, @NotNull Size size, @NotNull Color color, boolean z11, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(color, "color");
        this.text = text;
        this.size = size;
        this.color = color;
        this.chevron = z11;
        this.onClick = function0;
    }

    public static /* synthetic */ BadgeKitState copy$default(BadgeKitState badgeKitState, String str, Size size, Color color, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = badgeKitState.text;
        }
        if ((i11 & 2) != 0) {
            size = badgeKitState.size;
        }
        if ((i11 & 4) != 0) {
            color = badgeKitState.color;
        }
        if ((i11 & 8) != 0) {
            z11 = badgeKitState.chevron;
        }
        if ((i11 & 16) != 0) {
            function0 = badgeKitState.onClick;
        }
        Function0 function02 = function0;
        Color color2 = color;
        return badgeKitState.copy(str, size, color2, z11, function02);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getChevron() {
        return this.chevron;
    }

    public final Function0<Unit> component5() {
        return this.onClick;
    }

    @NotNull
    public final BadgeKitState copy(@NotNull String text, @NotNull Size size, @NotNull Color color, boolean chevron, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(color, "color");
        return new BadgeKitState(text, size, color, chevron, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeKitState)) {
            return false;
        }
        BadgeKitState badgeKitState = (BadgeKitState) other;
        return Intrinsics.d(this.text, badgeKitState.text) && this.size == badgeKitState.size && this.color == badgeKitState.color && this.chevron == badgeKitState.chevron && Intrinsics.d(this.onClick, badgeKitState.onClick);
    }

    public final boolean getChevron() {
        return this.chevron;
    }

    @NotNull
    public final Color getColor() {
        return this.color;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = C3532b.a((this.color.hashCode() + ((this.size.hashCode() + (this.text.hashCode() * 31)) * 31)) * 31, 31, this.chevron);
        Function0<Unit> function0 = this.onClick;
        return a11 + (function0 == null ? 0 : function0.hashCode());
    }

    @NotNull
    public String toString() {
        return "BadgeKitState(text=" + this.text + ", size=" + this.size + ", color=" + this.color + ", chevron=" + this.chevron + ", onClick=" + this.onClick + ")";
    }
}
