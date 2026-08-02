package th;

import hh.e;
import kotlin.text.Charsets;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f23973a = new c();

    public static final String a(ByteString byteString, ByteString[] byteStringArr, int i5) {
        int i10;
        boolean z5;
        int i11;
        int i12;
        ByteString byteString2 = PublicSuffixDatabase.f21365b;
        int size = byteString.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = (i13 + size) / 2;
            while (i14 > -1 && byteString.getByte(i14) != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (byteString.getByte(i10) == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i5;
            boolean z7 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z7) {
                    i11 = 46;
                    z5 = false;
                } else {
                    byte b10 = byteStringArr[i18].getByte(i19);
                    byte[] bArr = e.f10821a;
                    int i21 = b10 & 255;
                    z5 = z7;
                    i11 = i21;
                }
                byte b11 = byteString.getByte(i15 + i20);
                byte[] bArr2 = e.f10821a;
                i12 = i11 - (b11 & 255);
                if (i12 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                }
                if (byteStringArr[i18].size() != i19) {
                    z7 = z5;
                } else {
                    if (i18 == byteStringArr.length - 1) {
                        break;
                    }
                    i18++;
                    i19 = -1;
                    z7 = true;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i22 = i17 - i20;
                    int size2 = byteStringArr[i18].size() - i19;
                    int length = byteStringArr.length;
                    for (int i23 = i18 + 1; i23 < length; i23++) {
                        size2 += byteStringArr[i23].size();
                    }
                    if (size2 >= i22) {
                        if (size2 <= i22) {
                            return byteString.substring(i15, i17 + i15).string(Charsets.UTF_8);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            size = i14;
        }
        return null;
    }
}
