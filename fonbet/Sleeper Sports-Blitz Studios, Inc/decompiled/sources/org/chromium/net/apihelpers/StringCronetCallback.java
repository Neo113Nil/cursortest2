package org.chromium.net.apihelpers;

import java.nio.charset.Charset;
import java.util.Iterator;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.apihelpers.ContentTypeParametersParser;

/* loaded from: classes10.dex */
public abstract class StringCronetCallback extends InMemoryTransformCronetCallback<String> {
    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";

    StringCronetCallback() {
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public StringCronetCallback addCompletionListener(CronetRequestCompletionListener<? super String> listener) {
        super.addCompletionListener((CronetRequestCompletionListener) listener);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public String transformBodyBytes(UrlResponseInfo info, byte[] bodyBytes) {
        return new String(bodyBytes, getCharsetFromHeaders(info));
    }

    private Charset getCharsetFromHeaders(UrlResponseInfo info) {
        Iterator<String> it = info.getAllHeaders().get("Content-Type").iterator();
        String str = null;
        while (it.hasNext()) {
            ContentTypeParametersParser contentTypeParametersParser = new ContentTypeParametersParser(it.next());
            while (contentTypeParametersParser.hasMore()) {
                try {
                    String value = contentTypeParametersParser.getNextParameter().getValue();
                    if (str != null && !value.equalsIgnoreCase(str)) {
                        throw new IllegalArgumentException("Multiple charsets provided: " + value + " and " + str);
                    }
                    str = value;
                } catch (ContentTypeParametersParser.ContentTypeParametersParserException unused) {
                    continue;
                }
            }
        }
        if (str != null) {
            return Charset.forName(str);
        }
        return Charset.defaultCharset();
    }
}
