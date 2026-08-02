package ru.ozon.app.android.atoms.data.button;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/button/LargeIconButtonStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_WHITE", "STYLE_TYPE_PRIMARY", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeIconButtonStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LargeIconButtonStyle[] $VALUES;

    @NotNull
    private final String key;

    @i(name = "STYLE_TYPE_WHITE")
    public static final LargeIconButtonStyle STYLE_TYPE_WHITE = new LargeIconButtonStyle("STYLE_TYPE_WHITE", 0, "STYLE_TYPE_WHITE");

    @i(name = "STYLE_TYPE_SECONDARY")
    public static final LargeIconButtonStyle STYLE_TYPE_PRIMARY = new LargeIconButtonStyle("STYLE_TYPE_PRIMARY", 1, "STYLE_TYPE_SECONDARY");

    private static final /* synthetic */ LargeIconButtonStyle[] $values() {
        return new LargeIconButtonStyle[]{STYLE_TYPE_WHITE, STYLE_TYPE_PRIMARY};
    }

    static {
        LargeIconButtonStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LargeIconButtonStyle(String str, int i11, String str2) {
        this.key = str2;
    }

    @NotNull
    public static a<LargeIconButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static LargeIconButtonStyle valueOf(String str) {
        return (LargeIconButtonStyle) Enum.valueOf(LargeIconButtonStyle.class, str);
    }

    public static LargeIconButtonStyle[] values() {
        return (LargeIconButtonStyle[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
