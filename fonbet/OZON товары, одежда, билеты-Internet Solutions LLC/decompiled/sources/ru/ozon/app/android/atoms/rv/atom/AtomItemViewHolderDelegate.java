package ru.ozon.app.android.atoms.rv.atom;

import android.content.Context;
import android.view.ViewGroup;
import ed.C6345a;
import hk0.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.atoms.rv.factory.AtomRecyclerFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BG\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R(\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R@\u0010)\u001a.\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030'0&j\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030'`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R@\u0010+\u001a.\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\n\u0012\u0004\u0012\u00020\u00120&j\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\n\u0012\u0004\u0012\u00020\u0012`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;", "Lhk0/e;", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lkotlin/Function1;", "", "initializerBlock", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "atomFactory", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "configs", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;Ljava/util/Map;)V", "Landroid/content/Context;", "context", "key", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "getDefaultConfig", "(Landroid/content/Context;Ljava/lang/Class;)Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "item", "onItemViewType", "(ILru/ozon/uni/atoms/data/AtomDTO;)V", "", "canBind", "(I)Z", "Lkotlin/jvm/functions/Function1;", "getInitializerBlock", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/reflect/d;", "Lkotlin/collections/HashMap;", "viewTypes", "Ljava/util/HashMap;", "paddingConfigurations", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomItemViewHolderDelegate extends e<AtomItemViewHolder, AtomDTO> {

    @NotNull
    private final AtomRecyclerFactory atomFactory;

    @NotNull
    private final Map<Class<? extends AtomDTO>, Atom.AtomConfiguration> configs;
    private final Function1<AtomItemViewHolder, Unit> initializerBlock;

    @NotNull
    private final HashMap<Class<? extends AtomDTO>, Atom.DefaultConfigurator> paddingConfigurations;

    @NotNull
    private final HashMap<Integer, d<? extends AtomDTO>> viewTypes;

    public /* synthetic */ AtomItemViewHolderDelegate(Function1 function1, AtomRecyclerFactory atomRecyclerFactory, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function1, (i11 & 2) != 0 ? BxAtomConfig.INSTANCE.getAtomRecyclerFactory() : atomRecyclerFactory, (i11 & 4) != 0 ? U.c() : map);
    }

    private final Atom.DefaultConfigurator getDefaultConfig(Context context, Class<? extends AtomDTO> key) {
        Atom.DefaultConfigurator defaultConfigurator = this.paddingConfigurations.get(key);
        if (defaultConfigurator != null) {
            return defaultConfigurator;
        }
        Atom.AtomConfiguration atomConfiguration = this.configs.get(key);
        if (atomConfiguration == null) {
            return null;
        }
        Atom.DefaultConfigurator defaultConfigurator2 = new Atom.DefaultConfigurator(ResourceExtKt.toPx(atomConfiguration.getPaddingStart(), context), ResourceExtKt.toPx(atomConfiguration.getPaddingEnd(), context), ResourceExtKt.toPx(atomConfiguration.getPaddingTop(), context), ResourceExtKt.toPx(atomConfiguration.getPaddingBottom(), context));
        atomConfiguration.setPaddingStart(0);
        atomConfiguration.setPaddingEnd(0);
        atomConfiguration.setPaddingTop(0);
        atomConfiguration.setPaddingBottom(0);
        this.paddingConfigurations.put(key, defaultConfigurator2);
        return defaultConfigurator2;
    }

    @Override // hk0.e
    public boolean canBind(int viewType) {
        return this.viewTypes.get(Integer.valueOf(viewType)) != null;
    }

    @Override // hk0.e
    public Function1<AtomItemViewHolder, Unit> getInitializerBlock() {
        return this.initializerBlock;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // hk0.e
    public AtomItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        d<? extends AtomDTO> dVar = this.viewTypes.get(Integer.valueOf(viewType));
        if (dVar == null) {
            return null;
        }
        AtomRecyclerFactory atomRecyclerFactory = this.atomFactory;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Atom createAtom$default = AtomRecyclerFactory.createAtom$default(atomRecyclerFactory, context, dVar, null, 4, null);
        if (createAtom$default == null) {
            createAtom$default = null;
        }
        if (createAtom$default == null) {
            return null;
        }
        Class<? extends AtomDTO> b11 = C6345a.b(dVar);
        Atom.AtomConfiguration atomConfiguration = this.configs.get(b11);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new AtomItemViewHolder(createAtom$default, atomConfiguration, getDefaultConfig(context2, b11));
    }

    @Override // hk0.e
    public void onItemViewType(int viewType, @NotNull AtomDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewTypes.put(Integer.valueOf(viewType), N.b(item.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtomItemViewHolderDelegate(Function1<? super AtomItemViewHolder, Unit> function1, @NotNull AtomRecyclerFactory atomFactory, @NotNull Map<Class<? extends AtomDTO>, ? extends Atom.AtomConfiguration> configs) {
        Intrinsics.checkNotNullParameter(atomFactory, "atomFactory");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.initializerBlock = function1;
        this.atomFactory = atomFactory;
        this.configs = configs;
        this.viewTypes = new HashMap<>();
        this.paddingConfigurations = new HashMap<>();
    }
}
