package net.time4j.tz.model;

import java.util.Comparator;

/* loaded from: classes5.dex */
public enum k implements Comparator {
    INSTANCE;

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(d dVar, d dVar2) {
        int compareTo = dVar.b(2000).compareTo(dVar2.b(2000));
        return compareTo == 0 ? dVar.f().A(dVar2.f()) : compareTo;
    }
}
