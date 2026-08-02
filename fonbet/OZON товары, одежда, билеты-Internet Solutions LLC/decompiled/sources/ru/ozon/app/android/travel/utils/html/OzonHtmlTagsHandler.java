package ru.ozon.app.android.travel.utils.html;

import android.text.Editable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import ru.ozon.app.android.travel.utils.html.tagmappers.BoldTagMapper;
import ru.ozon.app.android.travel.utils.html.tagmappers.LineTagMapper;
import ru.ozon.app.android.travel.utils.html.tagmappers.ListTagMapper;
import ru.ozon.app.android.travel.utils.html.tagmappers.OzonFontTagMapper;
import ru.ozon.app.android.travel.utils.html.tagmappers.OzonHeaderTagMapper;
import ru.ozon.app.android.travel.utils.html.tagmappers.OzonUrlTagMapper;
import ru.ozon.app.android.travel.utils.html.tagmappers.QuotesTagMapper;
import ru.ozon.app.android.travel.utils.html.tagmappers.UnderlineTagMapper;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/utils/html/OzonHtmlTagsHandler;", "Lru/ozon/app/android/travel/utils/html/OzonTagsHandler;", "htmlFlag", "", "<init>", "(I)V", "boldTagMapper", "Lru/ozon/app/android/travel/utils/html/tagmappers/BoldTagMapper;", "headerTagMapper", "Lru/ozon/app/android/travel/utils/html/tagmappers/OzonHeaderTagMapper;", "listTagMapper", "Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper;", "tagsToMappers", "", "", "Lru/ozon/app/android/travel/utils/html/OzonTagMapper;", "openTagMappers", "", "handleOpeningTag", "", "tag", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "handleClosingTag", "", "clear", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OzonHtmlTagsHandler implements OzonTagsHandler {

    @NotNull
    private final BoldTagMapper boldTagMapper;

    @NotNull
    private final OzonHeaderTagMapper headerTagMapper;

    @NotNull
    private final ListTagMapper listTagMapper;

    @NotNull
    private final List<OzonTagMapper> openTagMappers;

    @NotNull
    private final Map<String, OzonTagMapper> tagsToMappers;

    public OzonHtmlTagsHandler(int i11) {
        BoldTagMapper boldTagMapper = new BoldTagMapper();
        this.boldTagMapper = boldTagMapper;
        OzonHeaderTagMapper ozonHeaderTagMapper = new OzonHeaderTagMapper(i11);
        this.headerTagMapper = ozonHeaderTagMapper;
        ListTagMapper listTagMapper = new ListTagMapper();
        this.listTagMapper = listTagMapper;
        this.tagsToMappers = U.j(new Pair("font", new OzonFontTagMapper()), new Pair("a", new OzonUrlTagMapper()), new Pair("b", boldTagMapper), new Pair("strong", boldTagMapper), new Pair("h1", ozonHeaderTagMapper), new Pair("h2", ozonHeaderTagMapper), new Pair("h3", ozonHeaderTagMapper), new Pair("h4", ozonHeaderTagMapper), new Pair("h5", ozonHeaderTagMapper), new Pair("h6", ozonHeaderTagMapper), new Pair("q", new QuotesTagMapper()), new Pair("ins", new UnderlineTagMapper()), new Pair("hr", new LineTagMapper()), new Pair("ul", listTagMapper), new Pair("ol", listTagMapper), new Pair("li", listTagMapper));
        this.openTagMappers = new ArrayList();
    }

    @Override // ru.ozon.app.android.travel.utils.html.OzonTagsHandler
    public void clear() {
        this.listTagMapper.clearStack();
    }

    @Override // ru.ozon.app.android.travel.utils.html.OzonTagsHandler
    public void handleClosingTag(String tag, Editable output) {
        OzonTagMapper ozonTagMapper = (OzonTagMapper) C7714v.x0(this.openTagMappers);
        if (ozonTagMapper != null) {
            ozonTagMapper.mapClosingTag(tag, output);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.html.OzonTagsHandler
    public boolean handleOpeningTag(String tag, Editable output, Attributes attributes) {
        OzonTagMapper ozonTagMapper = this.tagsToMappers.get(tag);
        if (ozonTagMapper == null || !ozonTagMapper.mapOpeningTag(tag, output, attributes)) {
            this.openTagMappers.add(null);
            return false;
        }
        this.openTagMappers.add(this.tagsToMappers.get(tag));
        return true;
    }
}
