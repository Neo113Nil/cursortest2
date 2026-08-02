package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import xsna.bu80;
import xsna.fs9;
import xsna.rr2;

/* compiled from: OptionsBundle.java */
/* loaded from: classes11.dex */
public class o implements Config {
    public static final bu80 t;
    public static final o u;
    public final TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> s;

    static {
        bu80 bu80Var = new bu80();
        t = bu80Var;
        u = new o(new TreeMap(bu80Var));
    }

    public o(TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> treeMap) {
        this.s = treeMap;
    }

    @NonNull
    public static o y(@NonNull Config config) {
        if (o.class.equals(config.getClass())) {
            return (o) config;
        }
        TreeMap treeMap = new TreeMap(t);
        for (Config.a<?> aVar : config.e()) {
            Set<Config.OptionPriority> a = config.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : a) {
                arrayMap.put(optionPriority, config.d(aVar, optionPriority));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new o(treeMap);
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public final Set<Config.OptionPriority> a(@NonNull Config.a<?> aVar) {
        Map<Config.OptionPriority, Object> map = this.s.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final void b(@NonNull rr2 rr2Var) {
        for (Map.Entry<Config.a<?>, Map<Config.OptionPriority, Object>> entry : this.s.tailMap(Config.a.a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (!entry.getKey().b().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            Config.a<?> key = entry.getKey();
            fs9.a aVar = (fs9.a) rr2Var.b;
            Config config = (Config) rr2Var.c;
            aVar.a.B(key, config.h(key), config.f(key));
        }
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean c(@NonNull Config.a<?> aVar) {
        return this.s.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public final <ValueT> ValueT d(@NonNull Config.a<ValueT> aVar, @NonNull Config.OptionPriority optionPriority) {
        Map<Config.OptionPriority, Object> map = this.s.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(optionPriority)) {
            return (ValueT) map.get(optionPriority);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public final Set<Config.a<?>> e() {
        return Collections.unmodifiableSet(this.s.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public final <ValueT> ValueT f(@NonNull Config.a<ValueT> aVar) {
        Map<Config.OptionPriority, Object> map = this.s.get(aVar);
        if (map != null) {
            return (ValueT) map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public final <ValueT> ValueT g(@NonNull Config.a<ValueT> aVar, @Nullable ValueT valuet) {
        try {
            return (ValueT) f(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public final Config.OptionPriority h(@NonNull Config.a<?> aVar) {
        Map<Config.OptionPriority, Object> map = this.s.get(aVar);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
