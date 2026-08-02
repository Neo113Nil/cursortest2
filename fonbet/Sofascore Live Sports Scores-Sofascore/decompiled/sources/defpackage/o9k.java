package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o9k implements r9k {
    public final int a;
    public final tee b;

    public o9k(int i, tee teeVar) {
        teeVar.getClass();
        this.a = i;
        this.b = teeVar;
    }

    public final String c(Context context) {
        context.getClass();
        int i = this.a;
        String string = context.getString(i);
        string.getClass();
        try {
            String format = new MessageFormat(string, Locale.getDefault()).format(this.b);
            format.getClass();
            return format;
        } catch (Exception e) {
            s38.a().c(e instanceof Resources.NotFoundException ? new fb3(i, "Resource Not Found", e) : new fb3(i, dmi.q("Formatting Failed: ", e.getMessage()), e));
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9k)) {
            return false;
        }
        o9k o9kVar = (o9k) obj;
        return this.a == o9kVar.a && Intrinsics.c(this.b, o9kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "IcuResource(id=" + this.a + ", args=" + this.b + ")";
    }
}
