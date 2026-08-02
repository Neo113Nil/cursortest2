package com.unity3d.ads.injection;

import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import xsna.epx;
import xsna.gzs;
import xsna.jgp;
import xsna.on00;
import xsna.pn00;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: Registry.kt */
/* loaded from: classes14.dex */
public final class Registry {
    private final xh50<Map<EntryKey, Lazy<?>>> _services = vtk0.a(jgp.b);

    public static EntryKey factory$default(Registry registry, String str, gzs gzsVar, int i, Object obj) {
        epx.k();
        throw null;
    }

    public static Object get$default(Registry registry, String str, int i, Object obj) {
        epx.k();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String str, int i, Object obj) {
        epx.k();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String str, gzs gzsVar, int i, Object obj) {
        epx.k();
        throw null;
    }

    public final <T> void add(EntryKey entryKey, Lazy<? extends T> lazy) {
        Map<EntryKey, Lazy<?>> value;
        if (getServices().containsKey(entryKey)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        xh50<Map<EntryKey, Lazy<?>>> xh50Var = this._services;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, pn00.n(value, on00.f(new Pair(entryKey, lazy)))));
    }

    public final <T> EntryKey factory(String str, gzs<? extends T> gzsVar) {
        epx.k();
        throw null;
    }

    public final <T> T get(String str) {
        epx.k();
        throw null;
    }

    public final <T> T getOrNull(String str) {
        epx.k();
        throw null;
    }

    public final Map<EntryKey, Lazy<?>> getServices() {
        return this._services.getValue();
    }

    public final <T> EntryKey single(String str, gzs<? extends T> gzsVar) {
        epx.k();
        throw null;
    }
}
