package ru.ozon.app.android.search.widgets.aiHelper.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/MarkupType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "PLAIN", "MARKDOWN", "HTML", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarkupType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MarkupType[] $VALUES;

    @i(name = "invalid")
    public static final MarkupType INVALID = new MarkupType("INVALID", 0);

    @i(name = "plain")
    public static final MarkupType PLAIN = new MarkupType("PLAIN", 1);

    @i(name = "markdown")
    public static final MarkupType MARKDOWN = new MarkupType("MARKDOWN", 2);

    @i(name = "html")
    public static final MarkupType HTML = new MarkupType("HTML", 3);

    private static final /* synthetic */ MarkupType[] $values() {
        return new MarkupType[]{INVALID, PLAIN, MARKDOWN, HTML};
    }

    static {
        MarkupType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private MarkupType(String str, int i11) {
    }

    public static MarkupType valueOf(String str) {
        return (MarkupType) Enum.valueOf(MarkupType.class, str);
    }

    public static MarkupType[] values() {
        return (MarkupType[]) $VALUES.clone();
    }
}
