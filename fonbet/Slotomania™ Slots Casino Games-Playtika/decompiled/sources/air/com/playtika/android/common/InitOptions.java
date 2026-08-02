package air.com.playtika.android.common;

import com.ironsource.X3;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes6.dex */
public class InitOptions {
    public final int apiLevel;
    public final String cachePath;
    public final String defaultUserAgent;
    public final String filesPath;
    public final String osArch;
    public final String osName;
    public final String platform;
    public final String userAgent;

    public InitOptions(String str, String str2, String str3, String str4, String str5, int i) {
        this.osName = str;
        this.osArch = str2;
        this.defaultUserAgent = str3;
        this.userAgent = (str3 == null || str3.isEmpty()) ? "Embedded V8 (Android)" : str3;
        this.platform = (str == null || str2 == null) ? X3.d : str + ServerSentEventKt.SPACE + str2;
        this.filesPath = str4;
        this.cachePath = str5;
        this.apiLevel = i;
    }
}
