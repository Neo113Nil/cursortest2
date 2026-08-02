package ru.ozon.app.android.marketing.ui.trustfactors.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/ui/trustfactors/data/Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "trust-factors_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Alignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Alignment[] $VALUES;
    public static final Alignment CENTER = new Alignment("CENTER", 0);
    public static final Alignment LEFT = new Alignment("LEFT", 1);

    private static final /* synthetic */ Alignment[] $values() {
        return new Alignment[]{CENTER, LEFT};
    }

    static {
        Alignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Alignment(String str, int i11) {
    }

    @NotNull
    public static a<Alignment> getEntries() {
        return $ENTRIES;
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
