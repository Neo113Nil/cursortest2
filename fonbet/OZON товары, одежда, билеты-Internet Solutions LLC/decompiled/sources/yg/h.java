package yg;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface h {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f106612p0 = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f106613a = new a();

        public static C10897a a(String contentType, String content) {
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = content.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new C10897a(contentType, bytes);
        }
    }

    @NotNull
    String c();

    long d();

    void writeTo(@NotNull OutputStream outputStream) throws IOException;
}
