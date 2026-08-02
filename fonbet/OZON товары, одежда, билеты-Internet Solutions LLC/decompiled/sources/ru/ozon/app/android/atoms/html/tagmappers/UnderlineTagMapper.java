package ru.ozon.app.android.atoms.html.tagmappers;

import android.text.Editable;
import kotlin.Metadata;
import org.xml.sax.Attributes;
import ru.ozon.app.android.atoms.html.OzonTagHelper;
import ru.ozon.app.android.atoms.html.OzonTagMapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/html/tagmappers/UnderlineTagMapper;", "Lru/ozon/app/android/atoms/html/OzonTagMapper;", "<init>", "()V", "mapOpeningTag", "", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "mapClosingTag", "", "Underline", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UnderlineTagMapper implements OzonTagMapper {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/atoms/html/tagmappers/UnderlineTagMapper$Underline;", "", "<init>", "()V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Underline {
    }

    @Override // ru.ozon.app.android.atoms.html.OzonTagMapper
    public void mapClosingTag(String tag, Editable output) {
        OzonTagHelper.INSTANCE.replaceOpeningMarksWithSpan(output, Underline.class, UnderlineTagMapper$mapClosingTag$1.INSTANCE);
    }

    @Override // ru.ozon.app.android.atoms.html.OzonTagMapper
    public boolean mapOpeningTag(String tag, Editable output, Attributes attributes) {
        return OzonTagHelper.INSTANCE.markOpeningTag(output, new Underline());
    }
}
