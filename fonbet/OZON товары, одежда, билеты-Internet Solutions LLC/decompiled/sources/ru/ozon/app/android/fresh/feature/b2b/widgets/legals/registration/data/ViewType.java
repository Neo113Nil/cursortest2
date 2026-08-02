package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "TEXT_AREA", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ViewType[] $VALUES;
    public static final ViewType INPUT = new ViewType("INPUT", 0);
    public static final ViewType TEXT_AREA = new ViewType("TEXT_AREA", 1);

    private static final /* synthetic */ ViewType[] $values() {
        return new ViewType[]{INPUT, TEXT_AREA};
    }

    static {
        ViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ViewType(String str, int i11) {
    }

    public static ViewType valueOf(String str) {
        return (ViewType) Enum.valueOf(ViewType.class, str);
    }

    public static ViewType[] values() {
        return (ViewType[]) $VALUES.clone();
    }
}
