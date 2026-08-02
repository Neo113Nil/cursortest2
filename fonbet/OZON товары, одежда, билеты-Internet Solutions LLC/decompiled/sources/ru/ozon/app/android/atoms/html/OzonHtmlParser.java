package ru.ozon.app.android.atoms.html;

import Nk.a;
import android.text.Editable;
import android.text.Html;
import androidx.core.text.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;
import ru.ozon.app.android.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\n\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J0\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\u001c\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010'\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0016J\"\u0010,\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0016J\u001c\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lru/ozon/app/android/atoms/html/OzonHtmlParser;", "Landroid/text/Html$TagHandler;", "Lorg/xml/sax/ContentHandler;", "htmlFlag", "", "<init>", "(I)V", "isInitialized", "", "ozonTagsHandler", "Lru/ozon/app/android/atoms/html/OzonTagsHandler;", "originHandler", "text", "Landroid/text/Editable;", "tagHandlingStatuses", "", "handleTag", "", "opening", "tag", "", "output", "xmlReader", "Lorg/xml/sax/XMLReader;", "startElement", "uri", "localName", "qName", "atts", "Lorg/xml/sax/Attributes;", "endElement", "setDocumentLocator", "locator", "Lorg/xml/sax/Locator;", "startDocument", "endDocument", "startPrefixMapping", "prefix", "endPrefixMapping", "characters", "ch", "", "start", "length", "ignorableWhitespace", "processingInstruction", "target", "data", "skippedEntity", AppMeasurementSdk.ConditionalUserProperty.NAME, "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonHtmlParser implements Html.TagHandler, ContentHandler {
    private boolean isInitialized;
    private ContentHandler originHandler;

    @NotNull
    private final OzonTagsHandler ozonTagsHandler;

    @NotNull
    private final List<Boolean> tagHandlingStatuses;
    private Editable text;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\f\u0010\f\u001a\u00020\r*\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/atoms/html/OzonHtmlParser$Companion;", "", "<init>", "()V", "INITIALIZING_TAG", "", "parseHtml", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "html", "flags", "", "prepareHtml", "hasUnicodeOrHtmlSpecialSymbols", "", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean hasUnicodeOrHtmlSpecialSymbols(String str) {
            return h.u(str, '&');
        }

        public static /* synthetic */ OzonSpannableString parseHtml$default(Companion companion, String str, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return companion.parseHtml(str, i11);
        }

        private final String prepareHtml(String html) {
            return a.b("<ozontag/>", h.X(html, "\n", "<br>", false));
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
        
            if (r0 != false) goto L7;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final OzonSpannableString parseHtml(@NotNull String html, int flags) {
            CharSequence charSequence;
            Intrinsics.checkNotNullParameter(html, "html");
            try {
                if (!h.u(html, '<')) {
                    boolean hasUnicodeOrHtmlSpecialSymbols = hasUnicodeOrHtmlSpecialSymbols(html);
                    charSequence = html;
                }
                CharSequence b11 = b.b(prepareHtml(html), flags, new OzonHtmlParser(flags, null));
                Intrinsics.f(b11);
                charSequence = b11;
            } catch (Throwable unused) {
                charSequence = "";
            }
            return OzonSpannableStringKt.toOzonSpannableString(charSequence);
        }

        private Companion() {
        }
    }

    public /* synthetic */ OzonHtmlParser(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] ch2, int start, int length) {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.characters(ch2, start, length);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.endDocument();
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String uri, String localName, String qName) {
        ContentHandler contentHandler;
        this.ozonTagsHandler.handleClosingTag(localName, this.text);
        if (Intrinsics.d(C7714v.x0(this.tagHandlingStatuses), Boolean.TRUE) || (contentHandler = this.originHandler) == null) {
            return;
        }
        contentHandler.endElement(uri, localName, qName);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String prefix) {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.endPrefixMapping(prefix);
        }
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.originHandler = xmlReader != null ? xmlReader.getContentHandler() : null;
        this.text = output;
        if (xmlReader != null) {
            xmlReader.setContentHandler(this);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] ch2, int start, int length) {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.ignorableWhitespace(ch2, start, length);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String target, String data) {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.processingInstruction(target, data);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.setDocumentLocator(locator);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String name) {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.skippedEntity(name);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.startDocument();
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String uri, String localName, String qName, Attributes atts) {
        ContentHandler contentHandler;
        boolean handleOpeningTag = this.ozonTagsHandler.handleOpeningTag(localName, this.text, atts);
        this.tagHandlingStatuses.add(Boolean.valueOf(handleOpeningTag));
        if (handleOpeningTag || (contentHandler = this.originHandler) == null) {
            return;
        }
        contentHandler.startElement(uri, localName, qName, atts);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String prefix, String uri) {
        ContentHandler contentHandler = this.originHandler;
        if (contentHandler != null) {
            contentHandler.startPrefixMapping(prefix, uri);
        }
    }

    private OzonHtmlParser(int i11) {
        this.ozonTagsHandler = new OzonHtmlTagsHandler(i11);
        this.tagHandlingStatuses = new ArrayList();
    }
}
