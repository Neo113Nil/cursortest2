package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import xsna.ho8;
import xsna.lbk0;

/* loaded from: classes12.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<lbk0> sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, com.google.common.collect.g gVar) {
        super(1, str, null, false);
        this.uri = uri;
        this.sniffFailures = ImmutableList.m(gVar);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        if (this.sniffFailures.isEmpty()) {
            return message;
        }
        StringBuilder b = ho8.b(message, "\nsniff failures: ");
        b.append(this.sniffFailures);
        return b.toString();
    }
}
