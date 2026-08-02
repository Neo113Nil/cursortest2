package ru.ozon.app.android.widgets.debug.transparenttopwidget;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO;", "", "height", "", "position", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO$Position;", "<init>", "(ILru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO$Position;)V", "getHeight", "()I", "getPosition", "()Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO$Position;", "Position", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransparentPlaceholderDTO {
    public static final int $stable = 0;
    private final int height;

    @NotNull
    private final Position position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO$Position;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Position {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position TOP = new Position("TOP", 0);
        public static final Position BOTTOM = new Position("BOTTOM", 1);

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{TOP, BOTTOM};
        }

        static {
            Position[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Position(String str, int i11) {
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    public TransparentPlaceholderDTO(int i11, @NotNull Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.height = i11;
        this.position = position;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final Position getPosition() {
        return this.position;
    }
}
