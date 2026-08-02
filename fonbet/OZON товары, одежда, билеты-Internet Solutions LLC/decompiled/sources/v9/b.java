package v9;

import Pk0.g;
import android.content.Intent;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f102567a;

    /* renamed from: b, reason: collision with root package name */
    private final String f102568b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f102569c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f102570d;

    /* renamed from: e, reason: collision with root package name */
    private final String f102571e;

    /* renamed from: f, reason: collision with root package name */
    private final String f102572f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f102573g;

    b(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f102567a = str;
        this.f102568b = str2;
        this.f102569c = bArr;
        this.f102570d = num;
        this.f102571e = str3;
        this.f102572f = str4;
        this.f102573g = intent;
    }

    public final String a() {
        return this.f102567a;
    }

    public final String toString() {
        byte[] bArr = this.f102569c;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder sb2 = new StringBuilder("Format: ");
        sb2.append(this.f102568b);
        sb2.append("\nContents: ");
        g.d(length, this.f102567a, "\nRaw bytes: (", " bytes)\nOrientation: ", sb2);
        sb2.append(this.f102570d);
        sb2.append("\nEC level: ");
        sb2.append(this.f102571e);
        sb2.append("\nBarcode image: ");
        sb2.append(this.f102572f);
        sb2.append("\nOriginal intent: ");
        sb2.append(this.f102573g);
        sb2.append('\n');
        return sb2.toString();
    }
}
