package ru.ozon.app.android.travel.utils.html;

import android.text.Editable;
import kotlin.Metadata;
import org.xml.sax.Attributes;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/utils/html/OzonTagsHandler;", "", "handleOpeningTag", "", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "handleClosingTag", "", "clear", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OzonTagsHandler {
    void clear();

    void handleClosingTag(String tag, Editable output);

    boolean handleOpeningTag(String tag, Editable output, Attributes attributes);
}
