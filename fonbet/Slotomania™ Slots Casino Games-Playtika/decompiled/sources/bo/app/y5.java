package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lbo/app/y5;", "", "", "key", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class y5 {
    public static final y5 a = new y5();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception while trying to read BrazeLogger tag from system properties.";
        }
    }

    private y5() {
    }

    @JvmStatic
    public static final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", key}).getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "getRuntime()\n           …             .inputStream");
            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            String readLine = (inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192)).readLine();
            Intrinsics.checkNotNullExpressionValue(readLine, "{\n            Runtime.ge…er().readLine()\n        }");
            return readLine;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, a.b);
            return "";
        }
    }
}
