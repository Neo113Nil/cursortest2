package ru.ozon.uni.atoms.data.common;

import Sc.o;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/common/Rounds;", "", "<init>", "(Ljava/lang/String;I)V", "ROUND_DEFAULT", "ROUND_ROUNDED", "roundCorners", "", "getRoundCorners", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Rounds {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Rounds[] $VALUES;
    public static final Rounds ROUND_DEFAULT = new Rounds("ROUND_DEFAULT", 0);
    public static final Rounds ROUND_ROUNDED = new Rounds("ROUND_ROUNDED", 1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rounds.values().length];
            try {
                iArr[Rounds.ROUND_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rounds.ROUND_ROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ Rounds[] $values() {
        return new Rounds[]{ROUND_DEFAULT, ROUND_ROUNDED};
    }

    static {
        Rounds[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Rounds(String str, int i11) {
    }

    @NotNull
    public static a<Rounds> getEntries() {
        return $ENTRIES;
    }

    public static Rounds valueOf(String str) {
        return (Rounds) Enum.valueOf(Rounds.class, str);
    }

    public static Rounds[] values() {
        return (Rounds[]) $VALUES.clone();
    }

    public final boolean getRoundCorners() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        throw new o();
    }
}
