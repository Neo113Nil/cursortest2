package ru.ozon.app.android.commonwidgets.widgets.closeButton.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Theme;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "APPLY", "CANCEL", "REMOVE", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Theme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;

    @i(name = "APPLY")
    public static final Theme APPLY = new Theme("APPLY", 0, "APPLY");

    @i(name = "CANCEL")
    public static final Theme CANCEL = new Theme("CANCEL", 1, "CANCEL");

    @i(name = "REMOVE")
    public static final Theme REMOVE = new Theme("REMOVE", 2, "REMOVE");

    @NotNull
    private final String key;

    private static final /* synthetic */ Theme[] $values() {
        return new Theme[]{APPLY, CANCEL, REMOVE};
    }

    static {
        Theme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Theme(String str, int i11, String str2) {
        this.key = str2;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
