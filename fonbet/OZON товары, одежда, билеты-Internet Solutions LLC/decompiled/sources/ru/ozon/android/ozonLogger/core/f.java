package ru.ozon.android.ozonLogger.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;

/* loaded from: classes6.dex */
public final class f implements id.f<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Lock f92057a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f92058b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e<LogEntry> f92059c;

    f(e<LogEntry> eVar) {
        this.f92059c = eVar;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        Lock readLock = reentrantReadWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readLock(...)");
        this.f92057a = readLock;
        Lock writeLock = reentrantReadWriteLock.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "writeLock(...)");
        this.f92058b = writeLock;
    }

    @Override // id.e
    public final Object getValue(Object obj, m<?> property) {
        Map map;
        Intrinsics.checkNotNullParameter(property, "property");
        e<LogEntry> eVar = this.f92059c;
        Lock lock = this.f92057a;
        lock.lock();
        try {
            map = ((e) eVar).f92042a;
            Object obj2 = ((LinkedHashMap) map).get(property.getName());
            if (obj2 == null) {
                obj2 = null;
            }
            return obj2;
        } finally {
            lock.unlock();
        }
    }

    @Override // id.f
    public final void setValue(Object obj, m<?> property, Object obj2) {
        Map map;
        Intrinsics.checkNotNullParameter(property, "property");
        e<LogEntry> eVar = this.f92059c;
        Lock lock = this.f92058b;
        lock.lock();
        try {
            map = ((e) eVar).f92042a;
            map.put(property.getName(), obj2);
            Unit unit = Unit.f71690a;
        } finally {
            lock.unlock();
        }
    }
}
