package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wlh extends yg0 {
    public final /* synthetic */ tlh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlh(tlh tlhVar) {
        super(tlhVar, 1);
        this.c = tlhVar;
    }

    @Override // defpackage.yg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vlh(this.c);
    }
}
