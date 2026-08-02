package ru.ozon.uni.atoms.html.tagmappers;

import android.graphics.Typeface;
import android.text.Editable;
import androidx.core.content.res.g;
import kotlin.Metadata;
import org.xml.sax.Attributes;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.html.OzonTagHelper;
import ru.ozon.uni.atoms.html.OzonTagMapper;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/BoldTagMapper;", "Lru/ozon/uni/atoms/html/OzonTagMapper;", "<init>", "()V", "typeface", "Landroid/graphics/Typeface;", "mapOpeningTag", "", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "mapClosingTag", "", "Bold", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BoldTagMapper implements OzonTagMapper {
    private final Typeface typeface = g.e(R$font.onest_semibold, StyleParser.INSTANCE.getApplication());

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/BoldTagMapper$Bold;", "", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class Bold {
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public void mapClosingTag(String tag, Editable output) {
        OzonTagHelper.INSTANCE.replaceOpeningMarksWithSpan(output, Bold.class, new BoldTagMapper$mapClosingTag$1(this));
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public boolean mapOpeningTag(String tag, Editable output, Attributes attributes) {
        return OzonTagHelper.INSTANCE.markOpeningTag(output, new Bold());
    }
}
