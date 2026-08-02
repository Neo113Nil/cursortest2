package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qqa implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ qqa(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
        }
        return Integer.valueOf(cVar.a(((xqa) obj2).getKey())).compareTo(Integer.valueOf(cVar.a(((xqa) obj).getKey())));
    }
}
