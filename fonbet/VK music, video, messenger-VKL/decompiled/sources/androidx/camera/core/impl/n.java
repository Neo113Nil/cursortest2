package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: MutableOptionsBundle.java */
/* loaded from: classes11.dex */
public final class n extends o implements m {

    @NonNull
    public static final Config.OptionPriority v = Config.OptionPriority.OPTIONAL;

    @NonNull
    public static n A(@NonNull Config config) {
        TreeMap treeMap = new TreeMap(o.t);
        for (Config.a<?> aVar : config.e()) {
            Set<Config.OptionPriority> a = config.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : a) {
                arrayMap.put(optionPriority, config.d(aVar, optionPriority));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new n(treeMap);
    }

    @NonNull
    public static n z() {
        return new n(new TreeMap(o.t));
    }

    public final <ValueT> void B(@NonNull Config.a<ValueT> aVar, @NonNull Config.OptionPriority optionPriority, @Nullable ValueT valuet) {
        Config.OptionPriority optionPriority2;
        Config.OptionPriority optionPriority3;
        TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> treeMap = this.s;
        Map<Config.OptionPriority, Object> map = treeMap.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(aVar, arrayMap);
            arrayMap.put(optionPriority, valuet);
            return;
        }
        Config.OptionPriority optionPriority4 = (Config.OptionPriority) Collections.min(map.keySet());
        if (map.get(optionPriority4).equals(valuet) || !((optionPriority4 == (optionPriority2 = Config.OptionPriority.ALWAYS_OVERRIDE) && optionPriority == optionPriority2) || (optionPriority4 == (optionPriority3 = Config.OptionPriority.REQUIRED) && optionPriority == optionPriority3))) {
            map.put(optionPriority, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.b() + ", existing value (" + optionPriority4 + ")=" + map.get(optionPriority4) + ", conflicting (" + optionPriority + ")=" + valuet);
    }

    public final <ValueT> void C(@NonNull Config.a<ValueT> aVar, @Nullable ValueT valuet) {
        B(aVar, v, valuet);
    }
}
