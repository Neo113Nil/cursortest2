package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import xsna.rgp0;

/* loaded from: classes12.dex */
public abstract class TagPayloadReader {
    public final rgp0 a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(1, str, null, false);
        }
    }

    public TagPayloadReader(rgp0 rgp0Var) {
        this.a = rgp0Var;
    }
}
