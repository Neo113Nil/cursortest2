package ru.ozon.app.android.atoms;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.common.navigation.AtomNavigator;
import ru.ozon.app.android.atoms.common.navigation.AtomRouter;
import ru.ozon.app.android.atoms.rv.factory.AtomRecyclerFactory;
import ru.ozon.uni.atoms.generator.GeneratorIdFactory;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/BxAtomConfig;", "", "<init>", "()V", "config", "Lru/ozon/app/android/atoms/BxAtomConfig$Config;", "router", "Lru/ozon/app/android/atoms/common/navigation/AtomRouter;", "getRouter$atoms_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/atoms/common/navigation/AtomRouter;", "generatorIdFactory", "Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "getGeneratorIdFactory", "()Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "atomRecyclerFactory", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "getAtomRecyclerFactory", "()Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "initialize", "", "navigators", "", "Lru/ozon/app/android/atoms/common/navigation/AtomNavigator;", "Config", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BxAtomConfig {

    @NotNull
    public static final BxAtomConfig INSTANCE = new BxAtomConfig();
    private static Config config;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/BxAtomConfig$Config;", "", "Lru/ozon/app/android/atoms/common/navigation/AtomRouter;", "atomRouter", "Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "generatorIdFactory", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "atomRecyclerFactoryImpl", "<init>", "(Lru/ozon/app/android/atoms/common/navigation/AtomRouter;Lru/ozon/uni/atoms/generator/GeneratorIdFactory;Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/common/navigation/AtomRouter;", "getAtomRouter", "()Lru/ozon/app/android/atoms/common/navigation/AtomRouter;", "Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "getGeneratorIdFactory", "()Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "getAtomRecyclerFactoryImpl", "()Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class Config {

        @NotNull
        private final AtomRecyclerFactory atomRecyclerFactoryImpl;

        @NotNull
        private final AtomRouter atomRouter;

        @NotNull
        private final GeneratorIdFactory generatorIdFactory;

        public Config(@NotNull AtomRouter atomRouter, @NotNull GeneratorIdFactory generatorIdFactory, @NotNull AtomRecyclerFactory atomRecyclerFactoryImpl) {
            Intrinsics.checkNotNullParameter(atomRouter, "atomRouter");
            Intrinsics.checkNotNullParameter(generatorIdFactory, "generatorIdFactory");
            Intrinsics.checkNotNullParameter(atomRecyclerFactoryImpl, "atomRecyclerFactoryImpl");
            this.atomRouter = atomRouter;
            this.generatorIdFactory = generatorIdFactory;
            this.atomRecyclerFactoryImpl = atomRecyclerFactoryImpl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.d(this.atomRouter, config.atomRouter) && Intrinsics.d(this.generatorIdFactory, config.generatorIdFactory) && Intrinsics.d(this.atomRecyclerFactoryImpl, config.atomRecyclerFactoryImpl);
        }

        @NotNull
        public final AtomRecyclerFactory getAtomRecyclerFactoryImpl() {
            return this.atomRecyclerFactoryImpl;
        }

        @NotNull
        public final AtomRouter getAtomRouter() {
            return this.atomRouter;
        }

        @NotNull
        public final GeneratorIdFactory getGeneratorIdFactory() {
            return this.generatorIdFactory;
        }

        public int hashCode() {
            return this.atomRecyclerFactoryImpl.hashCode() + ((this.generatorIdFactory.hashCode() + (this.atomRouter.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Config(atomRouter=" + this.atomRouter + ", generatorIdFactory=" + this.generatorIdFactory + ", atomRecyclerFactoryImpl=" + this.atomRecyclerFactoryImpl + ")";
        }
    }

    private BxAtomConfig() {
    }

    @NotNull
    public final AtomRecyclerFactory getAtomRecyclerFactory() {
        Config config2 = config;
        if (config2 != null) {
            return config2.getAtomRecyclerFactoryImpl();
        }
        Intrinsics.n("config");
        throw null;
    }

    @NotNull
    public final GeneratorIdFactory getGeneratorIdFactory() {
        Config config2 = config;
        if (config2 != null) {
            return config2.getGeneratorIdFactory();
        }
        Intrinsics.n("config");
        throw null;
    }

    @NotNull
    public final AtomRouter getRouter$atoms_prodGoogleAllVendorsRelease() {
        Config config2 = config;
        if (config2 != null) {
            return config2.getAtomRouter();
        }
        Intrinsics.n("config");
        throw null;
    }

    public final void initialize(@NotNull Set<? extends AtomNavigator> navigators, @NotNull GeneratorIdFactory generatorIdFactory) {
        Intrinsics.checkNotNullParameter(navigators, "navigators");
        Intrinsics.checkNotNullParameter(generatorIdFactory, "generatorIdFactory");
        config = new Config(new AtomRouter(navigators), generatorIdFactory, new AtomRecyclerFactory());
    }
}
