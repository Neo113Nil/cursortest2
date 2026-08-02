package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gbm {
    public final List a;
    public final e b;

    public gbm(@NotNull List<rql> list, @NotNull e eVar) {
        list.getClass();
        eVar.getClass();
        this.a = list;
        this.b = eVar;
    }

    public static gbm copy$default(gbm gbmVar, List list, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gbmVar.a;
        }
        if ((i & 2) != 0) {
            eVar = gbmVar.b;
        }
        gbmVar.getClass();
        list.getClass();
        eVar.getClass();
        return new gbm(list, eVar);
    }

    public final rql a() {
        Object obj;
        Object obj2;
        List list = this.a;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (c.n(((rql) obj2).a, ".vtt", true)) {
                break;
            }
        }
        rql rqlVar = (rql) obj2;
        if (rqlVar != null) {
            return rqlVar;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (c.n(((rql) next).a, ".srt", true)) {
                obj = next;
                break;
            }
        }
        return (rql) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbm)) {
            return false;
        }
        gbm gbmVar = (gbm) obj;
        return Intrinsics.c(this.a, gbmVar.a) && Intrinsics.c(this.b, gbmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClosedCaptionsModel(files=" + this.a + ", language=" + this.b + ')';
    }
}
