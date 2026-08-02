package io.sentry.android.core.anr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f50905a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50906b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50907c;

    public d(List list) {
        this.f50905a = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar != null) {
                this.f50905a.add(iVar);
            }
        }
        Collections.sort(this.f50905a);
        if (this.f50905a.isEmpty()) {
            this.f50906b = 0L;
            this.f50907c = 0L;
        } else {
            this.f50906b = ((i) this.f50905a.get(0)).f50915a;
            this.f50907c = ((i) this.f50905a.get(r5.size() - 1)).f50915a + 10000;
        }
    }
}
