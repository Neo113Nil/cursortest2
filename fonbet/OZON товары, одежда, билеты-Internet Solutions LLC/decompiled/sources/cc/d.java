package cc;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import bc.AbstractC5634j;
import bc.AbstractC5641q;
import cc.AbstractC5799b;
import cc.AbstractC5800c;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class d extends AbstractC5641q {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5800c f56895a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5799b f56896b;

    d(@NonNull AbstractC5800c abstractC5800c, @NonNull AbstractC5799b abstractC5799b) {
        this.f56895a = abstractC5800c;
        this.f56896b = abstractC5799b;
    }

    @NonNull
    public static d b() {
        return new d(new AbstractC5800c.a(), new AbstractC5799b.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r0.length() == 0) goto L31;
     */
    @Override // bc.AbstractC5641q
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5634j.a a(@NonNull String str) {
        boolean z11;
        String str2;
        String str3;
        C5798a c5798a;
        String[] split;
        int length;
        if (!str.startsWith("data:")) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        String substring = str.substring(5);
        ((AbstractC5800c.a) this.f56895a).getClass();
        int indexOf = substring.indexOf(44);
        if (indexOf < 0) {
            c5798a = null;
        } else {
            if (indexOf <= 0 || (length = (split = substring.substring(0, indexOf).split(";")).length) <= 0) {
                z11 = false;
                str2 = null;
            } else if (length == 1) {
                str2 = split[0];
                if ("base64".equals(str2)) {
                    str2 = null;
                    z11 = true;
                } else {
                    if (str2.indexOf(47) <= -1) {
                        str2 = null;
                    }
                    z11 = false;
                }
            } else {
                String str4 = split[0].indexOf(47) > -1 ? split[0] : null;
                z11 = "base64".equals(split[length - 1]);
                str2 = str4;
            }
            if (indexOf < substring.length()) {
                str3 = substring.substring(indexOf + 1, substring.length()).replaceAll("\n", "");
            }
            str3 = null;
            c5798a = new C5798a(str2, z11, str3);
        }
        if (c5798a == null) {
            throw new IllegalStateException("Invalid data-uri: ".concat(str));
        }
        try {
            ((AbstractC5799b.a) this.f56896b).getClass();
            String c11 = c5798a.c();
            byte[] decode = TextUtils.isEmpty(c11) ? null : c5798a.a() ? Base64.decode(c11.getBytes("UTF-8"), 0) : c11.getBytes("UTF-8");
            if (decode != null) {
                return AbstractC5634j.a(new ByteArrayInputStream(decode), c5798a.b());
            }
            throw new IllegalStateException("Decoding data-uri failed: ".concat(str));
        } catch (Throwable th2) {
            throw new IllegalStateException("Cannot decode data-uri: ".concat(str), th2);
        }
    }
}
