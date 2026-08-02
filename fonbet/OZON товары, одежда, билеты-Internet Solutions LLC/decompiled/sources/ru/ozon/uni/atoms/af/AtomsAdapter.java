package ru.ozon.uni.atoms.af;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.DefaultRecycledAtomPool;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;
import ru.ozon.uni.atoms.utils.OzTrace;
import ru.ozon.uni.atoms.v3.DefaultViewTypePool;
import ru.ozon.uni.atoms.v3.ViewTypePool;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J?\u0010&\u001a\u0004\u0018\u00010\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u001e\u001a\u00020\u00142\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\r¢\u0006\u0004\b,\u0010\u000fJ3\u0010/\u001a\u00020\r2$\u0010.\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u001a0(\u0012\u0004\u0012\u00020\r0-¢\u0006\u0004\b/\u00100J3\u00101\u001a\u00020\r2$\u0010.\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u001a0(\u0012\u0004\u0012\u00020\r0-¢\u0006\u0004\b1\u00100J+\u00105\u001a\u0004\u0018\u0001032\u000e\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00162\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R.\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u00100R$\u0010R\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR(\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u001a0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR8\u0010X\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u001a0(\u0012\u0004\u0012\u00020\r0-0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "configs", "nestedConfigs", "Lru/ozon/uni/atoms/af/AtomDecorator;", "nestedDecorators", "Lru/ozon/uni/atoms/AtomsFactory;", "factory", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/AtomsFactory;)V", "", "recycleAtoms", "()V", "Landroid/content/Context;", "context", "initAtomPool", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomDto", "Ljava/lang/Class;", "getViewType", "(Lru/ozon/uni/atoms/data/AtomDTO;)Ljava/lang/Class;", "data", "Lru/ozon/uni/atoms/af/Atom;", "takeAtom", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/uni/atoms/af/Atom;", "atom", "dto", "buildAtom", "(Lru/ozon/uni/atoms/af/Atom;Lru/ozon/uni/atoms/data/AtomDTO;)V", "createAtom", "Lru/ozon/uni/atoms/af/AtomAction;", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "defaultConfigs", "findConfig", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;)Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "items", "bind", "(Landroid/content/Context;Ljava/util/List;)V", "onRecycle", "Lkotlin/Function1;", "observer", "addObserver", "(Lkotlin/jvm/functions/Function1;)V", "removeObserver", "type", "", "id", "getAtomTextValue", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Map;", "Lru/ozon/uni/atoms/AtomsFactory;", "getFactory", "()Lru/ozon/uni/atoms/AtomsFactory;", "setFactory", "(Lru/ozon/uni/atoms/AtomsFactory;)V", "Lru/ozon/uni/atoms/v3/ViewTypePool;", "viewTypePool", "Lru/ozon/uni/atoms/v3/ViewTypePool;", "getViewTypePool$uni_release", "()Lru/ozon/uni/atoms/v3/ViewTypePool;", "setViewTypePool$uni_release", "(Lru/ozon/uni/atoms/v3/ViewTypePool;)V", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generator", "Lru/ozon/uni/atoms/generator/GeneratorId;", "getGenerator", "()Lru/ozon/uni/atoms/generator/GeneratorId;", "setGenerator", "(Lru/ozon/uni/atoms/generator/GeneratorId;)V", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isRebindRequired", "Z", "()Z", "atoms", "Ljava/util/List;", "", "onChangeObservers", "Ljava/util/Set;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "recycledAtomPool", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomsAdapter {
    public static final int $stable = 8;

    @NotNull
    private List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> atoms;

    @NotNull
    private final Map<Atom.ConfCondition, Atom.AtomConfiguration> configs;
    private AtomsFactory factory;
    private GeneratorId generator;
    private boolean isRebindRequired;
    private final Map<Atom.ConfCondition, Map<Atom.ConfCondition, Atom.AtomConfiguration>> nestedConfigs;
    private final Map<Atom.ConfCondition, AtomDecorator> nestedDecorators;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final Set<Function1<List<? extends Atom<AtomDTO, Atom.AtomConfiguration>>, Unit>> onChangeObservers;
    private RecycledAtomPool recycledAtomPool;

    @NotNull
    private ViewTypePool viewTypePool;

    public AtomsAdapter() {
        this(null, null, null, null, 15, null);
    }

    private final void buildAtom(Atom<AtomDTO, Atom.AtomConfiguration> atom, AtomDTO dto) {
        if (atom.getDefaultConfigurations().isEmpty()) {
            throw new IllegalStateException("Must be at least one default configuration");
        }
        String context = dto.getContext();
        Atom.AtomConfiguration findConfig = findConfig(this.configs, dto, atom.getDefaultConfigurations());
        if (findConfig == null) {
            findConfig = new Atom.DefaultConfigurator(0, 0, 0, 0, 15, null);
        }
        atom.build(context, findConfig, this.nestedConfigs, this.nestedDecorators);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Atom<AtomDTO, Atom.AtomConfiguration> createAtom(Context context, AtomDTO data) {
        OzTrace.beginTrace(null, new Pair[]{new Pair("atom", data)});
        AtomsFactory atomsFactory = this.factory;
        Atom createAtom = atomsFactory != null ? atomsFactory.createAtom(context, data, new AtomsAdapter$createAtom$1$1(this)) : null;
        OzTrace.endTrace();
        return createAtom;
    }

    private final Atom.AtomConfiguration findConfig(Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration> map, AtomDTO atomDTO, Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration> map2) {
        Atom.AtomConfiguration atomConfiguration = map.get(new Atom.ConfCondition(atomDTO.getClass(), atomDTO.getContext()));
        if (atomConfiguration != null) {
            return atomConfiguration;
        }
        Atom.AtomConfiguration atomConfiguration2 = (atomDTO.getContext() != null ? map : null) != null ? map.get(new Atom.ConfCondition(atomDTO.getClass(), null)) : null;
        if (atomConfiguration2 != null) {
            return atomConfiguration2;
        }
        if (map2 != null) {
            return findConfig(map2, atomDTO, null);
        }
        return null;
    }

    public static /* synthetic */ String getAtomTextValue$default(AtomsAdapter atomsAdapter, Class cls, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return atomsAdapter.getAtomTextValue(cls, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getViewType(AtomDTO atomDto) {
        Class<?> viewType = this.viewTypePool.getViewType(atomDto);
        return viewType == null ? atomDto.getClass() : viewType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction data) {
        Function1<? super AtomAction, Unit> function1 = this.onAction;
        if (function1 != null) {
            function1.invoke(data);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAtomPool(Context context) {
        RecycledAtomPool defaultRecycledAtomPool;
        OzTrace.beginTrace(null, new Pair[0]);
        if (this.recycledAtomPool == null) {
            CacheHolder cacheHolder = context instanceof CacheHolder ? (CacheHolder) context : null;
            if (cacheHolder == null || (defaultRecycledAtomPool = cacheHolder.getAtomPool()) == null) {
                defaultRecycledAtomPool = new DefaultRecycledAtomPool();
            }
            this.recycledAtomPool = defaultRecycledAtomPool;
        }
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    private final void recycleAtoms() {
        OzTrace.beginTrace(null, new Pair[0]);
        for (Atom<AtomDTO, Atom.AtomConfiguration> atom : this.atoms) {
            atom.onRecycle();
            Class<?> viewType = getViewType(atom.getData());
            RecycledAtomPool recycledAtomPool = this.recycledAtomPool;
            if (recycledAtomPool == null) {
                Intrinsics.n("recycledAtomPool");
                throw null;
            }
            recycledAtomPool.putRecycledAtom(viewType, atom);
        }
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    private final Atom<AtomDTO, Atom.AtomConfiguration> takeAtom(Context context, AtomDTO data) {
        Atom<AtomDTO, Atom.AtomConfiguration> atom = null;
        OzTrace.beginTrace(null, new Pair[]{new Pair("atom", data)});
        Class<?> viewType = getViewType(data);
        RecycledAtomPool recycledAtomPool = this.recycledAtomPool;
        if (recycledAtomPool == null) {
            Intrinsics.n("recycledAtomPool");
            throw null;
        }
        Atom<AtomDTO, Atom.AtomConfiguration> recycledAtom = recycledAtomPool.getRecycledAtom(viewType, data.getContext(), context);
        if (recycledAtom != null) {
            recycledAtom.setOnAtomAction(new AtomsAdapter$takeAtom$1$poolItem$1$1(this));
            buildAtom(recycledAtom, data);
        } else {
            recycledAtom = null;
        }
        if (recycledAtom == null) {
            Atom<AtomDTO, Atom.AtomConfiguration> createAtom = createAtom(context, data);
            if (createAtom != null) {
                buildAtom(createAtom, data);
                atom = createAtom;
            }
        } else {
            atom = recycledAtom;
        }
        OzTrace.endTrace();
        return atom;
    }

    public final void addObserver(@NotNull Function1<? super List<? extends Atom<AtomDTO, Atom.AtomConfiguration>>, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.onChangeObservers.add(observer);
    }

    public final void bind(@NotNull Context context, @NotNull List<? extends AtomDTO> items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        OzTrace.beginTrace("bind atoms", new Pair[0]);
        initAtomPool(context);
        recycleAtoms();
        GeneratorId generatorId = this.generator;
        if (generatorId != null) {
            generatorId.findParent();
        }
        ArrayList arrayList = new ArrayList();
        for (AtomDTO atomDTO : items) {
            Atom<AtomDTO, Atom.AtomConfiguration> takeAtom = takeAtom(context, atomDTO);
            if (takeAtom != null) {
                takeAtom.bind(atomDTO);
            } else {
                takeAtom = null;
            }
            if (takeAtom != null) {
                arrayList.add(takeAtom);
            }
        }
        this.atoms = arrayList;
        OzTrace.beginTrace("update observers", new Pair[0]);
        Iterator<T> it = this.onChangeObservers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(arrayList);
        }
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
        this.isRebindRequired = false;
        OzTrace.endTrace();
    }

    public final String getAtomTextValue(@NotNull Class<? extends AtomDTO> type, String id2) {
        Object obj;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it = l.h(C7714v.w(this.atoms), new AtomsAdapter$getAtomTextValue$1(type, this)).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar.next();
            Object obj2 = (Atom) obj;
            if ((obj2 instanceof AtomGetter$GetTextValue) && ((AtomGetter$GetTextValue) obj2).getterCondition(id2)) {
                break;
            }
        }
        Object obj3 = (Atom) obj;
        if (obj3 != null) {
            return ((AtomGetter$GetTextValue) obj3).getAtomTextValue();
        }
        return null;
    }

    /* renamed from: isRebindRequired, reason: from getter */
    public final boolean getIsRebindRequired() {
        return this.isRebindRequired;
    }

    public final void onRecycle() {
        recycleAtoms();
        this.atoms = K.f71697a;
        this.isRebindRequired = true;
    }

    public final void removeObserver(@NotNull Function1<? super List<? extends Atom<AtomDTO, Atom.AtomConfiguration>>, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.onChangeObservers.remove(observer);
    }

    public final void setFactory(AtomsFactory atomsFactory) {
        this.factory = atomsFactory;
    }

    public final void setGenerator(GeneratorId generatorId) {
        this.generator = generatorId;
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtomsAdapter(@NotNull Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration> configs, Map<Atom.ConfCondition, ? extends Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration>> map, Map<Atom.ConfCondition, ? extends AtomDecorator> map2, AtomsFactory atomsFactory) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.configs = configs;
        this.nestedConfigs = map;
        this.nestedDecorators = map2;
        this.factory = atomsFactory == null ? AtomConfig.INSTANCE.provideAtomsFactory() : atomsFactory;
        this.viewTypePool = new DefaultViewTypePool();
        this.atoms = K.f71697a;
        this.onChangeObservers = new LinkedHashSet();
    }

    public /* synthetic */ AtomsAdapter(Map map, Map map2, Map map3, AtomsFactory atomsFactory, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? U.c() : map, (i11 & 2) != 0 ? null : map2, (i11 & 4) != 0 ? null : map3, (i11 & 8) != 0 ? null : atomsFactory);
    }
}
