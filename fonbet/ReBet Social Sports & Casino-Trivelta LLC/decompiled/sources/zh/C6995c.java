package zh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* renamed from: zh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6995c extends HashMap implements oh.g {
    private static final long serialVersionUID = -5072696312123632376L;

    /* renamed from: a, reason: collision with root package name */
    public final long f69187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69188b;

    /* renamed from: c, reason: collision with root package name */
    public int f69189c = 0;

    public C6995c(long j10, int i10) {
        this.f69187a = j10;
        this.f69188b = i10;
    }

    public static C6995c d(long j10, int i10) {
        return new C6995c(j10, i10);
    }

    @Override // oh.g
    public Object a(oh.e eVar) {
        return super.get(eVar);
    }

    @Override // oh.g
    public Map asMap() {
        return Collections.unmodifiableMap(this);
    }

    public int e() {
        return this.f69189c;
    }

    public oh.g f() {
        return oh.g.builder().b(this).build();
    }

    @Override // java.util.HashMap, java.util.Map, oh.g
    public void forEach(BiConsumer biConsumer) {
        super.forEach(biConsumer);
    }

    public void g(oh.e eVar, Object obj) {
        this.f69189c++;
        if (size() < this.f69187a || containsKey(eVar)) {
            super.put(eVar, AbstractC6994b.a(obj, this.f69188b));
        }
    }

    @Override // oh.g
    public oh.h toBuilder() {
        return oh.g.builder().b(this);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "AttributesMap{data=" + super.toString() + ", capacity=" + this.f69187a + ", totalAddedValues=" + this.f69189c + '}';
    }
}
