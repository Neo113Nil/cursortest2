package ru.ozon.app.android.analytics.plugins.af;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.text.Charsets;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0006\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"salt", "", "", "[Ljava/lang/Byte;", "token", "getAppsFlyerToken", "", "analytics_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerSecretKt {

    @NotNull
    private static final Byte[] salt = {(byte) 106, (byte) 105, (byte) 104, (byte) 102, (byte) 73, (byte) 71, (byte) 70, (byte) 85, (byte) 106, (byte) 109, (byte) 100, (byte) 106, (byte) 109, (byte) 102};

    @NotNull
    private static final Byte[] token = {(byte) 33, (byte) 26, (byte) 6, (byte) 51, (byte) 49, (byte) 5, (byte) 117, (byte) 7, (byte) 28, (byte) 33, (byte) 61, (byte) 32, (byte) 43, (byte) 17, (byte) 33, (byte) 29, (byte) 46, (byte) 37, (byte) 36, (byte) 4, (byte) 10, (byte) 29};

    @NotNull
    public static final String getAppsFlyerToken() {
        Byte[] bArr = token;
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            byte byteValue = bArr[i11].byteValue();
            Byte[] bArr2 = salt;
            arrayList.add(Byte.valueOf((byte) (bArr2[i12 % bArr2.length].byteValue() ^ byteValue)));
            i11++;
            i12++;
        }
        return h.b0(new String(C7714v.Q0(arrayList), Charsets.UTF_8)).toString();
    }
}
