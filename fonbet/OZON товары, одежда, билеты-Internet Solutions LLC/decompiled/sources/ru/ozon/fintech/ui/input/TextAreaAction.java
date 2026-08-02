package ru.ozon.fintech.ui.input;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/fintech/ui/input/TextAreaAction;", "", "iconRes", "", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "CLEAR", "INFO", "COPY", "NONE", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAreaAction {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ TextAreaAction[] $VALUES;
    private final Integer iconRes;
    public static final TextAreaAction CLEAR = new TextAreaAction("CLEAR", 0, Integer.valueOf(R.drawable.ic_m_cross_compact));
    public static final TextAreaAction INFO = new TextAreaAction("INFO", 1, Integer.valueOf(R.drawable.ic_m_info_filled));
    public static final TextAreaAction COPY = new TextAreaAction("COPY", 2, Integer.valueOf(R.drawable.ic_m_copy_filled));
    public static final TextAreaAction NONE = new TextAreaAction("NONE", 3, null);

    private static final /* synthetic */ TextAreaAction[] $values() {
        return new TextAreaAction[]{CLEAR, INFO, COPY, NONE};
    }

    static {
        TextAreaAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private TextAreaAction(String str, int i11, Integer num) {
        this.iconRes = num;
    }

    @NotNull
    public static Xc.a<TextAreaAction> getEntries() {
        return $ENTRIES;
    }

    public static TextAreaAction valueOf(String str) {
        return (TextAreaAction) Enum.valueOf(TextAreaAction.class, str);
    }

    public static TextAreaAction[] values() {
        return (TextAreaAction[]) $VALUES.clone();
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }
}
