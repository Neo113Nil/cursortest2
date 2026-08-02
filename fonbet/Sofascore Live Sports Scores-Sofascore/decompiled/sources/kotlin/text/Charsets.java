package kotlin.text;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Charsets {

    @NotNull
    public static final Charset UTF_8;

    @NotNull
    public static final Charsets a = new Charsets();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static volatile Charset f;
    public static volatile Charset g;

    static {
        Charset forName = Charset.forName(C.UTF8_NAME);
        forName.getClass();
        UTF_8 = forName;
        Charset.forName(C.UTF16_NAME).getClass();
        Charset forName2 = Charset.forName("UTF-16BE");
        forName2.getClass();
        b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        forName3.getClass();
        c = forName3;
        Charset forName4 = Charset.forName(C.ASCII_NAME);
        forName4.getClass();
        d = forName4;
        Charset forName5 = Charset.forName("ISO-8859-1");
        forName5.getClass();
        e = forName5;
    }
}
