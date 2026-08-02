package U1;

import b1.C2334C;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends Q1.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f12001c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f12002a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f12003b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // Q1.c
    public C2334C b(Q1.b bVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new C2334C(new c(bArr, null, null));
        }
        Matcher matcher = f12001c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e10 = Ra.c.e(group);
                e10.getClass();
                if (e10.equals("streamurl")) {
                    str2 = group2;
                } else if (e10.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C2334C(new c(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        try {
            return this.f12002a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f12003b.decode(byteBuffer).toString();
                this.f12003b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f12003b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f12003b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f12002a.reset();
            byteBuffer.rewind();
        }
    }
}
