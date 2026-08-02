package ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter.holders;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/adapter/holders/AtomType;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_SUPPORTED", "TEXT", "BUTTON", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AtomType[] $VALUES;
    public static final AtomType NOT_SUPPORTED = new AtomType("NOT_SUPPORTED", 0);
    public static final AtomType TEXT = new AtomType("TEXT", 1);
    public static final AtomType BUTTON = new AtomType("BUTTON", 2);

    private static final /* synthetic */ AtomType[] $values() {
        return new AtomType[]{NOT_SUPPORTED, TEXT, BUTTON};
    }

    static {
        AtomType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AtomType(String str, int i11) {
    }

    public static AtomType valueOf(String str) {
        return (AtomType) Enum.valueOf(AtomType.class, str);
    }

    public static AtomType[] values() {
        return (AtomType[]) $VALUES.clone();
    }
}
