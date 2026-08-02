package ru.ozon.app.android.data.markdown;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tools.MarkupType;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"toTextType", "Lru/ozon/app/android/tools/MarkupType;", "markupType", "", "markdown_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarkWonToTextTypeExtKt {
    @NotNull
    public static final MarkupType toTextType(String str) {
        if (str == null) {
            return MarkupType.PLAIN_TEXT;
        }
        MarkupType byType = MarkupType.INSTANCE.getByType(str);
        return byType == null ? MarkupType.UNKNOWN : byType;
    }
}
