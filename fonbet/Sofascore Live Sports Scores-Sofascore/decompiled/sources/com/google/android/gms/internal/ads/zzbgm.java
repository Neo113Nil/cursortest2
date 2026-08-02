package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.lang.Character;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgm {
    public static int a(String str) {
        int i;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = length & (-4);
            if (i2 >= i) {
                break;
            }
            int i4 = ((bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bytes[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bytes[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bytes[i2 + 3] << 24)) * (-862048943);
            int i5 = i3 ^ (((i4 >>> 17) | (i4 << 15)) * 461845907);
            i3 = (((i5 >>> 19) | (i5 << 13)) * 5) - 430675100;
            i2 += 4;
        }
        int i6 = length & 3;
        if (i6 != 1) {
            if (i6 != 2) {
                r1 = i6 == 3 ? (bytes[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16 : 0;
                int i7 = i3 ^ length;
                int i8 = (i7 ^ (i7 >>> 16)) * (-2048144789);
                int i9 = (i8 ^ (i8 >>> 13)) * (-1028477387);
                return i9 ^ (i9 >>> 16);
            }
            r1 |= (bytes[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        }
        int i10 = ((bytes[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | r1) * (-862048943);
        i3 ^= ((i10 >>> 17) | (i10 << 15)) * 461845907;
        int i72 = i3 ^ length;
        int i82 = (i72 ^ (i72 >>> 16)) * (-2048144789);
        int i92 = (i82 ^ (i82 >>> 13)) * (-1028477387);
        return i92 ^ (i92 >>> 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z2) {
                        arrayList.add(new String(charArray, i2, i - i2));
                    }
                    arrayList.add(new String(charArray, i, charCount));
                    z2 = false;
                    i += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z2) {
                        arrayList.add(new String(charArray, i2, i - i2));
                    }
                    z2 = false;
                }
            }
            i += charCount;
        }
        if (z2) {
            arrayList.add(new String(charArray, i2, i - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
