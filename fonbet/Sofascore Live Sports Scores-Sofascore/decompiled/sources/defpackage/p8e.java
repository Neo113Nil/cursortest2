package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class p8e extends yaa {
    public final Method h;
    public final int i;
    public final String j;
    public final boolean k;

    public p8e(Method method, int i, String str, boolean z) {
        this.h = method;
        this.i = i;
        Objects.requireNonNull(str, "name == null");
        this.j = str;
        this.k = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    @Override // defpackage.yaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(b0g b0gVar, Object obj) {
        String str;
        String replace;
        String str2 = this.j;
        if (obj == null) {
            throw kik.M(this.h, this.i, lnb.o("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
        String obj2 = obj.toString();
        if (b0gVar.c == null) {
            ogj.b();
            return;
        }
        int length = obj2.length();
        int i = 0;
        while (i < length) {
            int codePointAt = obj2.codePointAt(i);
            boolean z = this.k;
            int i2 = 47;
            int i3 = -1;
            int i4 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
            int i5 = 32;
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                x52 x52Var = new x52();
                x52Var.f1(0, i, obj2);
                x52 x52Var2 = null;
                while (i < length) {
                    int codePointAt2 = obj2.codePointAt(i);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < i5 || codePointAt2 >= i4 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i3 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                            if (x52Var2 == null) {
                                x52Var2 = new x52();
                            }
                            x52Var2.h1(codePointAt2);
                            long j = x52Var2.b;
                            long j2 = 0;
                            while (j2 < j) {
                                byte t = x52Var2.t(j2);
                                x52 x52Var3 = x52Var2;
                                int i6 = t & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                x52Var.Y0(37);
                                char[] cArr = b0g.l;
                                x52Var.Y0(cArr[(i6 >> 4) & 15]);
                                x52Var.Y0(cArr[t & 15]);
                                j2++;
                                x52Var2 = x52Var3;
                            }
                            x52Var2.k();
                        } else {
                            x52Var.h1(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                    i2 = 47;
                    i3 = -1;
                    i4 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                    i5 = 32;
                }
                str = x52Var.E0();
                replace = b0gVar.c.replace("{" + str2 + "}", str);
                if (b0g.m.matcher(replace).matches()) {
                    b0gVar.c = replace;
                    return;
                } else {
                    a70.p("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                    return;
                }
            }
            i += Character.charCount(codePointAt);
        }
        str = obj2;
        replace = b0gVar.c.replace("{" + str2 + "}", str);
        if (b0g.m.matcher(replace).matches()) {
        }
    }
}
