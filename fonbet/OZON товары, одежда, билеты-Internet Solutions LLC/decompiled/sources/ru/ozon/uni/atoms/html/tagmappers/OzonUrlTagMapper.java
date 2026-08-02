package ru.ozon.uni.atoms.html.tagmappers;

import android.text.Editable;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import ru.ozon.uni.atoms.html.OzonTagHelper;
import ru.ozon.uni.atoms.html.OzonTagMapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonUrlTagMapper;", "Lru/ozon/uni/atoms/html/OzonTagMapper;", "<init>", "()V", "mapOpeningTag", "", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "mapClosingTag", "", "Href", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonUrlTagMapper implements OzonTagMapper {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonUrlTagMapper$Href;", "", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class Href {

        @NotNull
        private final String url;

        public Href(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public void mapClosingTag(String tag, Editable output) {
        OzonTagHelper.INSTANCE.replaceOpeningMarksWithSpan(output, Href.class, OzonUrlTagMapper$mapClosingTag$1.INSTANCE);
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public boolean mapOpeningTag(String tag, Editable output, Attributes attributes) {
        String value;
        if (attributes == null || (value = attributes.getValue("", "href")) == null) {
            return false;
        }
        return OzonTagHelper.INSTANCE.markOpeningTag(output, new Href(value));
    }
}
