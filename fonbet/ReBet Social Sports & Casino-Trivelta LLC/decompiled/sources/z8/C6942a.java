package z8;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.p;
import java.io.File;

/* renamed from: z8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6942a {

    /* renamed from: a, reason: collision with root package name */
    public int f68628a;
    private final String[] mPaths;

    public C6942a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.mPaths = new String[i10];
        this.f68628a = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.mPaths) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        b(sb2);
        p.g("SoLoader", sb2.toString());
        String[] strArr = this.mPaths;
        int i10 = this.f68628a;
        strArr[i10 % strArr.length] = str;
        this.f68628a = i10 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f68628a);
            sb2.append(" base apk paths.");
            if (this.f68628a > 0) {
                sb2.append(" Most recent ones:");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.mPaths;
                if (i10 < strArr.length) {
                    int i11 = (this.f68628a - i10) - 1;
                    if (i11 >= 0) {
                        String str = strArr[i11 % strArr.length];
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int c() {
        return this.f68628a;
    }
}
