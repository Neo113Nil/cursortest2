package ru.ozon.app.android.widgets.debug.transparenttopwidget;

import B0.C2454a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001dB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "height", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO$Position;", "position", "<init>", "(JILru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO$Position;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getHeight", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO$Position;", "getPosition", "()Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO$Position;", "Position", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransparentPlaceholderVO implements c {
    private final int height;
    private final long id;

    @NotNull
    private final Position position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO$Position;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public TransparentPlaceholderVO(long j11, int i11, @NotNull Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.id = j11;
        this.height = i11;
        this.position = position;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransparentPlaceholderVO)) {
            return false;
        }
        TransparentPlaceholderVO transparentPlaceholderVO = (TransparentPlaceholderVO) other;
        return this.id == transparentPlaceholderVO.id && this.height == transparentPlaceholderVO.height && this.position == transparentPlaceholderVO.position;
    }

    public final int getHeight() {
        return this.height;
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
        return this.position.hashCode() + C2454a.a(this.height, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.height;
        Position position = this.position;
        StringBuilder b11 = Ql.c.b(j11, "TransparentPlaceholderVO(id=", i11, ", height=");
        b11.append(", position=");
        b11.append(position);
        b11.append(")");
        return b11.toString();
    }
}
