package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rq9 extends v7a {
    public static final Pattern j = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder h = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder i = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.v7a
    public final ric l(wic wicVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.i;
        CharsetDecoder charsetDecoder2 = this.h;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new ric(new tq9(null, null, bArr));
        }
        Matcher matcher = j.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String W = rz8.W(group);
                W.getClass();
                if (W.equals("streamurl")) {
                    str3 = group2;
                } else if (W.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new ric(new tq9(str2, str3, bArr));
    }
}
