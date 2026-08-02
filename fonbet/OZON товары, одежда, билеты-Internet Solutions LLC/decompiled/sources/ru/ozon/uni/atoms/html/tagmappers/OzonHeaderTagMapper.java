package ru.ozon.uni.atoms.html.tagmappers;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Layout;
import androidx.core.content.res.g;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.html.OzonTagHelper;
import ru.ozon.uni.atoms.html.OzonTagMapper;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0016\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonHeaderTagMapper;", "Lru/ozon/uni/atoms/html/OzonTagMapper;", "htmlFlag", "", "<init>", "(I)V", "regex", "Lkotlin/text/Regex;", "headingSizes", "", "", "typeface", "Landroid/graphics/Typeface;", "mapOpeningTag", "", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "mapClosingTag", "", "appendNewLines", "minNewLine", "NewLine", "Heading", "Alignment", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonHeaderTagMapper implements OzonTagMapper {
    private final int htmlFlag;

    @NotNull
    private final Regex regex = new Regex("(?:\\s+|\\A)text-align\\s*:\\s*(\\S*)\\b");

    @NotNull
    private final List<Float> headingSizes = C7714v.b0(Float.valueOf(1.5f), Float.valueOf(1.4f), Float.valueOf(1.3f), Float.valueOf(1.2f), Float.valueOf(1.1f), Float.valueOf(1.0f));
    private final Typeface typeface = g.e(R$font.onest_semibold, StyleParser.INSTANCE.getApplication());

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonHeaderTagMapper$Alignment;", "", "alignment", "Landroid/text/Layout$Alignment;", "<init>", "(Landroid/text/Layout$Alignment;)V", "getAlignment", "()Landroid/text/Layout$Alignment;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class Alignment {

        @NotNull
        private final Layout.Alignment alignment;

        public Alignment(@NotNull Layout.Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
        }

        @NotNull
        public final Layout.Alignment getAlignment() {
            return this.alignment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonHeaderTagMapper$Heading;", "", "level", "", "<init>", "(I)V", "getLevel", "()I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class Heading {
        private final int level;

        public Heading(int i11) {
            this.level = i11;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/html/tagmappers/OzonHeaderTagMapper$NewLine;", "", "lineCount", "", "<init>", "(I)V", "getLineCount", "()I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class NewLine {
        private final int lineCount;

        public NewLine(int i11) {
            this.lineCount = i11;
        }

        public final int getLineCount() {
            return this.lineCount;
        }
    }

    public OzonHeaderTagMapper(int i11) {
        this.htmlFlag = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendNewLines(Editable editable, int i11) {
        if (editable != null) {
            Integer valueOf = Integer.valueOf(h.G(editable));
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int i12 = 0;
                for (int intValue = valueOf.intValue(); intValue >= 0; intValue--) {
                    Character H11 = h.H(intValue, editable);
                    if (H11 == null || H11.charValue() != '\n') {
                        break;
                    }
                    i12++;
                }
                int i13 = i11 - i12;
                for (int i14 = 0; i14 < i13; i14++) {
                    editable.append("\n");
                }
            }
        }
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public void mapClosingTag(String tag, Editable output) {
        OzonTagHelper ozonTagHelper = OzonTagHelper.INSTANCE;
        ozonTagHelper.replaceOpeningMarksWithSpans(output, Heading.class, new OzonHeaderTagMapper$mapClosingTag$1(this));
        ozonTagHelper.replaceOpeningMarksWithSpans(output, NewLine.class, new OzonHeaderTagMapper$mapClosingTag$2(this, output));
        ozonTagHelper.replaceOpeningMarksWithSpans(output, Alignment.class, OzonHeaderTagMapper$mapClosingTag$3.INSTANCE);
    }

    @Override // ru.ozon.uni.atoms.html.OzonTagMapper
    public boolean mapOpeningTag(String tag, Editable output, Attributes attributes) {
        Character O11;
        String value;
        Layout.Alignment alignment;
        int i11 = (this.htmlFlag & 2) != 0 ? 1 : 2;
        appendNewLines(output, i11);
        OzonTagHelper ozonTagHelper = OzonTagHelper.INSTANCE;
        ozonTagHelper.markOpeningTag(output, new NewLine(i11));
        if (attributes != null && (value = attributes.getValue("", "style")) != null) {
            MatchResult e11 = this.regex.e(value);
            String str = null;
            String str2 = e11 != null ? (String) C7714v.Q(1, e11.c()) : null;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1364013995) {
                    if (hashCode != 100571) {
                        if (hashCode == 109757538 && str.equals("start")) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            ozonTagHelper.markOpeningTag(output, new Alignment(alignment));
                        }
                    } else if (str.equals("end")) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        ozonTagHelper.markOpeningTag(output, new Alignment(alignment));
                    }
                } else if (str.equals(RichContentDTO.ALIGN_CENTER)) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    ozonTagHelper.markOpeningTag(output, new Alignment(alignment));
                }
            }
            return true;
        }
        if (tag == null || (O11 = h.O(tag)) == null) {
            return false;
        }
        ozonTagHelper.markOpeningTag(output, new Heading(O11.charValue()));
        return true;
    }
}
