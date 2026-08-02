package ru.ozon.fintech.ui.input;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/fintech/ui/input/InfoAction;", "", "iconRes", "", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "CLEAR", "SUCCESS", "ERROR", "READ_ONLY", "LOADING", "NONE", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoAction {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ InfoAction[] $VALUES;
    private final Integer iconRes;
    public static final InfoAction CLEAR = new InfoAction("CLEAR", 0, Integer.valueOf(R.drawable.ic_m_cross_compact));
    public static final InfoAction SUCCESS = new InfoAction("SUCCESS", 1, Integer.valueOf(R.drawable.ic_m_check));
    public static final InfoAction ERROR = new InfoAction("ERROR", 2, Integer.valueOf(R.drawable.ic_m_danger_filled));
    public static final InfoAction READ_ONLY = new InfoAction("READ_ONLY", 3, Integer.valueOf(R.drawable.ic_m_lock_closed_filled_compact));
    public static final InfoAction LOADING = new InfoAction("LOADING", 4, null);
    public static final InfoAction NONE = new InfoAction("NONE", 5, null);

    private static final /* synthetic */ InfoAction[] $values() {
        return new InfoAction[]{CLEAR, SUCCESS, ERROR, READ_ONLY, LOADING, NONE};
    }

    static {
        InfoAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private InfoAction(String str, int i11, Integer num) {
        this.iconRes = num;
    }

    @NotNull
    public static Xc.a<InfoAction> getEntries() {
        return $ENTRIES;
    }

    public static InfoAction valueOf(String str) {
        return (InfoAction) Enum.valueOf(InfoAction.class, str);
    }

    public static InfoAction[] values() {
        return (InfoAction[]) $VALUES.clone();
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }
}
