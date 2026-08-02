package rf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l extends k {
    public static String a(File file) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(y4.a.m(new FileInputStream(file), file), charset);
        try {
            Intrinsics.checkNotNullParameter(inputStreamReader, "<this>");
            StringWriter out = new StringWriter();
            Intrinsics.checkNotNullParameter(inputStreamReader, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            char[] cArr = new char[Segment.SIZE];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                out.write(cArr, 0, read);
            }
            String stringWriter = out.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter, "toString(...)");
            inputStreamReader.close();
            return stringWriter;
        } finally {
        }
    }

    public static void b(File file, String text) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream i5 = a.a.i(new FileOutputStream(file), file);
        try {
            c(i5, text, charset);
            Unit unit = Unit.f19194a;
            i5.close();
        } finally {
        }
    }

    public static final void c(FileOutputStream fileOutputStream, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder encoder = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(Segment.SIZE);
        Intrinsics.checkNotNull(encoder);
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer allocate2 = ByteBuffer.allocate(Segment.SIZE * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(allocate2, "allocate(...)");
        int i5 = 0;
        int i10 = 0;
        while (i5 < text.length()) {
            int min = Math.min(8192 - i10, text.length() - i5);
            int i11 = i5 + min;
            char[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            text.getChars(i5, i11, array, i10);
            allocate.limit(min + i10);
            i10 = 1;
            if (!encoder.encode(allocate, allocate2, i11 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i10 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i5 = i11;
        }
    }
}
