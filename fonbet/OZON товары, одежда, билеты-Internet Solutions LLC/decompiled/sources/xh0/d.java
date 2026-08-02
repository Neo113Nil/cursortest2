package xh0;

import androidx.recyclerview.widget.m;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final IntRange f105571a = new IntRange(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 299, 1);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final IntRange f105572b = new IntRange(400, 499, 1);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLIENT_ERROR;
        public static final a SUCCESS;
        public static final a UNPROCESSED;

        static {
            a aVar = new a("SUCCESS", 0);
            SUCCESS = aVar;
            a aVar2 = new a("CLIENT_ERROR", 1);
            CLIENT_ERROR = aVar2;
            a aVar3 = new a("UNPROCESSED", 2);
            UNPROCESSED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    @NotNull
    public static a a(int i11) {
        IntRange intRange = f105571a;
        int f71842a = intRange.getF71842a();
        if (i11 <= intRange.getF71843b() && f71842a <= i11) {
            return a.SUCCESS;
        }
        IntRange intRange2 = f105572b;
        return (i11 > intRange2.getF71843b() || intRange2.getF71842a() > i11) ? a.UNPROCESSED : a.CLIENT_ERROR;
    }
}
