package k5;

import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: k5.i2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7526i2 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    private static final SimpleDateFormat f70754e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);

    C7526i2() {
        super(Mm0.e.TIMESTAMP);
        f70754e.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        return f70754e.format(new Date());
    }
}
