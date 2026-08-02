package org.chromium.net;

import internal.org.jni_zero.JNINamespace;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;
import java.util.Locale;

@JNINamespace("net::android")
/* loaded from: classes10.dex */
public class NetStringUtil {
    private static String convertToUnicode(ByteBuffer text, String charsetName) {
        try {
            return Charset.forName(charsetName).newDecoder().decode(text).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String convertToUnicodeAndNormalize(ByteBuffer text, String charsetName) {
        String convertToUnicode = convertToUnicode(text, charsetName);
        if (convertToUnicode == null) {
            return null;
        }
        return Normalizer.normalize(convertToUnicode, Normalizer.Form.NFC);
    }

    private static String convertToUnicodeWithSubstitutions(ByteBuffer text, String charsetName) {
        try {
            CharsetDecoder newDecoder = Charset.forName(charsetName).newDecoder();
            newDecoder.onMalformedInput(CodingErrorAction.REPLACE);
            newDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            newDecoder.replaceWith("�");
            return newDecoder.decode(text).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String toUpperCase(String str) {
        try {
            return str.toUpperCase(Locale.getDefault());
        } catch (Exception unused) {
            return null;
        }
    }
}
