package ru.ozon.uni.atoms.af.pool;

import E0.C2942q;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import fk0.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u000f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dRD\u0010\u001f\u001a2\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012$\u0012\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b0\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/uni/atoms/af/pool/DefaultRecycledAtomPool;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "<init>", "()V", "Ljava/lang/Class;", "type", "", "context", "Lfk0/b;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "getOrCreateScrapDataForType", "(Ljava/lang/Class;Ljava/lang/String;)Lfk0/b;", "atom", "", "resetAtom", "(Lru/ozon/uni/atoms/af/Atom;)V", "putRecycledAtom", "(Ljava/lang/Class;Lru/ozon/uni/atoms/af/Atom;)V", "Landroid/content/Context;", "androidContext", "getRecycledAtom", "(Ljava/lang/Class;Ljava/lang/String;Landroid/content/Context;)Lru/ozon/uni/atoms/af/Atom;", "", "max", "setMaxRecycledAtoms", "(Ljava/lang/Class;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "", "cache", "Ljava/util/Map;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public class DefaultRecycledAtomPool implements RecycledAtomPool {

    @NotNull
    private final Map<Class<?>, Map<String, b<Atom<AtomDTO, Atom.AtomConfiguration>>>> cache = new LinkedHashMap();

    private final b<Atom<AtomDTO, Atom.AtomConfiguration>> getOrCreateScrapDataForType(Class<?> type, String context) {
        Map<Class<?>, Map<String, b<Atom<AtomDTO, Atom.AtomConfiguration>>>> map = this.cache;
        Map<String, b<Atom<AtomDTO, Atom.AtomConfiguration>>> map2 = map.get(type);
        if (map2 == null) {
            map2 = new LinkedHashMap<>();
            map.put(type, map2);
        }
        Map<String, b<Atom<AtomDTO, Atom.AtomConfiguration>>> map3 = map2;
        b<Atom<AtomDTO, Atom.AtomConfiguration>> bVar = map3.get(context);
        if (bVar == null) {
            bVar = new b<>(null);
            map3.put(context, bVar);
        }
        return bVar;
    }

    private final void resetAtom(Atom<AtomDTO, Atom.AtomConfiguration> atom) {
        ViewParent parent = atom.getContainerView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(atom.getContainerView());
        }
    }

    @Override // ru.ozon.uni.atoms.af.pool.RecycledAtomPool
    public Atom<AtomDTO, Atom.AtomConfiguration> getRecycledAtom(@NotNull Class<?> type, String context, Context androidContext) {
        b<Atom<AtomDTO, Atom.AtomConfiguration>> bVar;
        Intrinsics.checkNotNullParameter(type, "type");
        Map<String, b<Atom<AtomDTO, Atom.AtomConfiguration>>> map = this.cache.get(type);
        if (map == null || (bVar = map.get(context)) == null) {
            return null;
        }
        return bVar.c();
    }

    @Override // ru.ozon.uni.atoms.af.pool.RecycledAtomPool
    public void putRecycledAtom(@NotNull Class<?> type, @NotNull Atom<AtomDTO, Atom.AtomConfiguration> atom) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(atom, "atom");
        b<Atom<AtomDTO, Atom.AtomConfiguration>> orCreateScrapDataForType = getOrCreateScrapDataForType(type, atom.getAtomContext());
        resetAtom(atom);
        orCreateScrapDataForType.a(atom);
    }

    @Override // ru.ozon.uni.atoms.af.pool.RecycledAtomPool
    public void setMaxRecycledAtoms(@NotNull Class<?> type, String context, int max) {
        Intrinsics.checkNotNullParameter(type, "type");
        getOrCreateScrapDataForType(type, context).f(max);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("====atom pool dump====\n");
        Iterator<T> it = this.cache.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            Map map = (Map) entry.getValue();
            sb2.append("for type " + cls + "\n");
            for (Map.Entry entry2 : map.entrySet()) {
                sb2.append("for context " + ((String) entry2.getKey()) + " data " + ((b) entry2.getValue()) + "\n");
            }
        }
        return C2942q.c(sb2, "====atom pool dump====", "toString(...)");
    }
}
