package com.unity3d.ads.injection;

import com.ironsource.C4227o2;
import com.ironsource.C4435zd;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.joa;
import defpackage.lm5;
import defpackage.sub;
import defpackage.tub;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R!\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00168F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/injection/Registry;", "", "<init>", "()V", "T", "", "named", "Lkotlin/Function0;", C4227o2.p, "Lcom/unity3d/ads/injection/EntryKey;", C4435zd.d, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/unity3d/ads/injection/EntryKey;", "factory", U3.i.W, "Ljoa;", "", "add", "(Lcom/unity3d/ads/injection/EntryKey;Ljoa;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "Lf1d;", "", "_services", "Lf1d;", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Registry {

    @NotNull
    private final f1d _services;

    public Registry() {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this._services = gdi.a(lm5Var);
    }

    public static EntryKey factory$default(Registry registry, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        function0.getClass();
        Intrinsics.h();
        throw null;
    }

    public static Object get$default(Registry registry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        Intrinsics.h();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        Intrinsics.h();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        function0.getClass();
        Intrinsics.h();
        throw null;
    }

    public final <T> void add(@NotNull EntryKey key, @NotNull joa instance) {
        fdi fdiVar;
        Object value;
        key.getClass();
        instance.getClass();
        if (getServices().containsKey(key)) {
            a70.r("Cannot have identical entries.");
            return;
        }
        f1d f1dVar = this._services;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, tub.k((Map) value, sub.d(new Pair(key, instance)))));
    }

    public final <T> EntryKey factory(String named, Function0<? extends T> instance) {
        named.getClass();
        instance.getClass();
        Intrinsics.h();
        throw null;
    }

    public final <T> T get(String named) {
        named.getClass();
        Intrinsics.h();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        named.getClass();
        Intrinsics.h();
        throw null;
    }

    @NotNull
    public final Map<EntryKey, joa> getServices() {
        return (Map) ((fdi) this._services).getValue();
    }

    public final <T> EntryKey single(String named, Function0<? extends T> instance) {
        named.getClass();
        instance.getClass();
        Intrinsics.h();
        throw null;
    }
}
