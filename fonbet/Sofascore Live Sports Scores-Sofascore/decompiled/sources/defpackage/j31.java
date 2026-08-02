package defpackage;

import android.app.Application;
import com.sofascore.model.Sports;
import java.text.Collator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class j31 extends q8 {
    public final gzh e;
    public final String f;
    public final fdi g;
    public final jof h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(Application application, gzh gzhVar) {
        super(application);
        gzhVar.getClass();
        this.e = gzhVar;
        this.f = dv3.c();
        fdi a = gdi.a(km5.a);
        this.g = a;
        this.h = un0.u(a);
    }

    public static boolean k(String str, String str2) {
        str2.getClass();
        if ((str2.length() > 0 ? str2 : null) == null) {
            return true;
        }
        if (Sports.INSTANCE.getEntries().contains(str2)) {
            return Intrinsics.c(str, str2);
        }
        return false;
    }

    public final List l(List list) {
        list.getClass();
        int i = 0;
        try {
            Locale locale = Locale.getDefault();
            locale.getClass();
            locale.getClass();
            return CollectionsKt.H0(list, new i31(i, Collator.getInstance(locale), this));
        } catch (IllegalArgumentException unused) {
            Locale locale2 = Locale.US;
            locale2.getClass();
            locale2.getClass();
            return CollectionsKt.H0(list, new i31(i, Collator.getInstance(locale2), this));
        }
    }
}
