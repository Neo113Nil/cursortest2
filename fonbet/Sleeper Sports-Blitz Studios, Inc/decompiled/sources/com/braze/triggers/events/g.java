package com.braze.triggers.events;

import com.braze.models.k;

/* loaded from: classes6.dex */
public final class g extends i {
    public final String e;

    public g(String str, k kVar) {
        this.c = kVar;
        this.e = i.a(str);
    }

    @Override // com.braze.triggers.events.b
    public final String a() {
        return "push_click";
    }
}
