package p7;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f21524a;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f21525b;

    static {
        Locale locale = Locale.ROOT;
        f21524a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f21525b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
