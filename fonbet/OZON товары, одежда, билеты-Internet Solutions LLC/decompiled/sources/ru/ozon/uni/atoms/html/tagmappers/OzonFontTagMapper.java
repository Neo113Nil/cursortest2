package ru.ozon.uni.atoms.html.tagmappers;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import ru.ozon.uni.atoms.html.OzonTagHelper;
import ru.ozon.uni.atoms.html.OzonTagMapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper;", "Lru/ozon/uni/atoms/html/OzonTagMapper;", "<init>", "()V", "mapOpeningTag", "", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "mapClosingTag", "", "FontSpanMark", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonFontTagMapper implements OzonTagMapper {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper$FontSpanMark;", "", "<init>", "()V", "Foreground", "Font", "Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper$FontSpanMark$Font;", "Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper$FontSpanMark$Foreground;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static abstract class FontSpanMark {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper$FontSpanMark$Font;", "Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper$FontSpanMark;", "faceName", "", "<init>", "(Ljava/lang/String;)V", "getFaceName", "()Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Font extends FontSpanMark {

            @NotNull
            private final String faceName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Font(@NotNull String faceName) {
                super(null);
                Intrinsics.checkNotNullParameter(faceName, "faceName");
                this.faceName = faceName;
            }

            @NotNull
            public final String getFaceName() {
                return this.faceName;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper$FontSpanMark$Foreground;", "Lru/ozon/uni/atoms/html/tagmappers/OzonFontTagMapper$FontSpanMark;", "colorName", "", "<init>", "(Ljava/lang/String;)V", "getColorName", "()Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Foreground extends FontSpanMark {

            @NotNull
            private final String colorName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Foreground(@NotNull String colorName) {
                super(null);
                Intrinsics.checkNotNullParameter(colorName, "colorName");
                this.colorName = colorName;
            }

            @NotNull
            public final String getColorName() {
                return this.colorName;
            }
        }

        public /* synthetic */ FontSpanMark(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FontSpanMark() {
        }
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public void mapClosingTag(String tag, Editable output) {
        OzonTagHelper ozonTagHelper = OzonTagHelper.INSTANCE;
        ozonTagHelper.replaceOpeningMarksWithSpan(output, FontSpanMark.Foreground.class, OzonFontTagMapper$mapClosingTag$1.INSTANCE);
        ozonTagHelper.replaceOpeningMarksWithSpan(output, FontSpanMark.Font.class, OzonFontTagMapper$mapClosingTag$2.INSTANCE);
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public boolean mapOpeningTag(String tag, Editable output, Attributes attributes) {
        String value;
        String value2;
        FontSpanMark.Font font = null;
        FontSpanMark.Foreground foreground = (attributes == null || (value2 = attributes.getValue("", "color")) == null) ? null : new FontSpanMark.Foreground(value2);
        if (attributes != null && (value = attributes.getValue("", "face")) != null) {
            font = new FontSpanMark.Font(value);
        }
        return OzonTagHelper.INSTANCE.markOpeningTag(output, foreground, font);
    }
}
