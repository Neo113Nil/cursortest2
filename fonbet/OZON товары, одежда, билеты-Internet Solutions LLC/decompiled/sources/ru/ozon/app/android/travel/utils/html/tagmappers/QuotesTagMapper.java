package ru.ozon.app.android.travel.utils.html.tagmappers;

import android.text.Editable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import ru.ozon.app.android.travel.utils.html.OzonTagMapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/utils/html/tagmappers/QuotesTagMapper;", "Lru/ozon/app/android/travel/utils/html/OzonTagMapper;", "<init>", "()V", "quote", "", "mapOpeningTag", "", "tag", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "mapClosingTag", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuotesTagMapper implements OzonTagMapper {

    @NotNull
    private final String quote = "\"";

    @Override // ru.ozon.app.android.travel.utils.html.OzonTagMapper
    public void mapClosingTag(String tag, Editable output) {
        if (output != null) {
            output.append((CharSequence) this.quote);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.html.OzonTagMapper
    public boolean mapOpeningTag(String tag, Editable output, Attributes attributes) {
        return (output == null || output.append((CharSequence) this.quote) == null) ? false : true;
    }
}
