package ru.ozon.uni.atoms;

import J0.P;
import Kk.C3532b;
import Pk0.a;
import Pk0.b;
import Pk0.c;
import Pk0.d;
import Pk0.e;
import Pk0.f;
import Pk0.g;
import Pk0.h;
import Pk0.i;
import android.content.Context;
import gk0.q;
import gk0.x;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithDiscountView;
import ru.ozon.uni.android.uikit.view.atoms.rating.RatingView;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.generator.GeneratorIdFactory;
import ru.ozon.uni.atoms.generator.GeneratorIdFactoryImpl;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/AtomConfig;", "", "<init>", "()V", "Lru/ozon/uni/atoms/AtomConfig$Config;", "config", "", "initialize", "(Lru/ozon/uni/atoms/AtomConfig$Config;)V", "Lru/ozon/uni/atoms/AtomsFactory;", "provideAtomsFactory", "()Lru/ozon/uni/atoms/AtomsFactory;", "Lru/ozon/uni/atoms/AtomConfig$Config;", "Lru/ozon/uni/atoms/common/ImageLoader;", "getImageLoader", "()Lru/ozon/uni/atoms/common/ImageLoader;", "imageLoader", "Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "getGeneratorIdFactory", "()Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "generatorIdFactory", "Config", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomConfig {
    private static Config config;

    @NotNull
    public static final AtomConfig INSTANCE = new AtomConfig();
    public static final int $stable = 8;

    private AtomConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextAtomView initialize$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextAtomView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView initialize$lambda$1(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BadgeView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PriceView initialize$lambda$2(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new PriceView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartButtonView initialize$lambda$3(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AddToCartButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RatingView initialize$lambda$4(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new RatingView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallIconButtonView initialize$lambda$5(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SmallIconButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallBorderlessButtonView initialize$lambda$6(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SmallBorderlessButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallButtonView initialize$lambda$7(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SmallButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TagAtomView initialize$lambda$8(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TagAtomView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PriceWithDiscountView initialize$lambda$9(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new PriceWithDiscountView(it, null, 0, 0, 14, null);
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
    public final ImageLoader getImageLoader() {
        Config config2 = config;
        if (config2 != null) {
            return config2.getImageLoader();
        }
        Intrinsics.n("config");
        throw null;
    }

    public final void initialize(@NotNull Config config2) {
        Intrinsics.checkNotNullParameter(config2, "config");
        if (config != null) {
            return;
        }
        config = config2;
        if (config2.getFillDefaultRefillablePoolProviders()) {
            q.f64554a.k(C7714v.b0(new x(N.b(TextAtomView.class), 10, new a(0)), new x(N.b(BadgeView.class), 5, new b(0)), new x(N.b(PriceView.class), 8, new c(0)), new x(N.b(AddToCartButtonView.class), 5, new d(0)), new x(N.b(RatingView.class), 5, new e(0)), new x(N.b(SmallIconButtonView.class), 5, new f(0)), new x(N.b(SmallBorderlessButtonView.class), 3, new P(1)), new x(N.b(SmallButtonView.class), 3, new g(0)), new x(N.b(TagAtomView.class), 3, new h(0)), new x(N.b(PriceWithDiscountView.class), 3, new i(0))));
        }
    }

    public final AtomsFactory provideAtomsFactory() {
        Config config2 = config;
        if (config2 == null) {
            Intrinsics.n("config");
            throw null;
        }
        AtomsFactoryProvider atomsFactoryProvider = config2.getAtomsFactoryProvider();
        if (atomsFactoryProvider != null) {
            return atomsFactoryProvider.provideAtomsFactory();
        }
        return null;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/uni/atoms/AtomConfig$Config;", "", "Lru/ozon/uni/atoms/common/ImageLoader;", "imageLoader", "", "debugBounds", "fillDefaultRefillablePoolProviders", "Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "generatorIdFactory", "Lru/ozon/uni/atoms/AtomsFactoryProvider;", "atomsFactoryProvider", "<init>", "(Lru/ozon/uni/atoms/common/ImageLoader;ZZLru/ozon/uni/atoms/generator/GeneratorIdFactory;Lru/ozon/uni/atoms/AtomsFactoryProvider;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/common/ImageLoader;", "getImageLoader", "()Lru/ozon/uni/atoms/common/ImageLoader;", "Z", "getDebugBounds", "()Z", "getFillDefaultRefillablePoolProviders", "Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "getGeneratorIdFactory", "()Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "Lru/ozon/uni/atoms/AtomsFactoryProvider;", "getAtomsFactoryProvider", "()Lru/ozon/uni/atoms/AtomsFactoryProvider;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Config {
        private final AtomsFactoryProvider atomsFactoryProvider;
        private final boolean debugBounds;
        private final boolean fillDefaultRefillablePoolProviders;

        @NotNull
        private final GeneratorIdFactory generatorIdFactory;

        @NotNull
        private final ImageLoader imageLoader;

        public Config(@NotNull ImageLoader imageLoader, boolean z11, boolean z12, @NotNull GeneratorIdFactory generatorIdFactory, AtomsFactoryProvider atomsFactoryProvider) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(generatorIdFactory, "generatorIdFactory");
            this.imageLoader = imageLoader;
            this.debugBounds = z11;
            this.fillDefaultRefillablePoolProviders = z12;
            this.generatorIdFactory = generatorIdFactory;
            this.atomsFactoryProvider = atomsFactoryProvider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.d(this.imageLoader, config.imageLoader) && this.debugBounds == config.debugBounds && this.fillDefaultRefillablePoolProviders == config.fillDefaultRefillablePoolProviders && Intrinsics.d(this.generatorIdFactory, config.generatorIdFactory) && Intrinsics.d(this.atomsFactoryProvider, config.atomsFactoryProvider);
        }

        public final AtomsFactoryProvider getAtomsFactoryProvider() {
            return this.atomsFactoryProvider;
        }

        public final boolean getFillDefaultRefillablePoolProviders() {
            return this.fillDefaultRefillablePoolProviders;
        }

        @NotNull
        public final GeneratorIdFactory getGeneratorIdFactory() {
            return this.generatorIdFactory;
        }

        @NotNull
        public final ImageLoader getImageLoader() {
            return this.imageLoader;
        }

        public int hashCode() {
            int hashCode = (this.generatorIdFactory.hashCode() + C3532b.a(C3532b.a(this.imageLoader.hashCode() * 31, 31, this.debugBounds), 31, this.fillDefaultRefillablePoolProviders)) * 31;
            AtomsFactoryProvider atomsFactoryProvider = this.atomsFactoryProvider;
            return hashCode + (atomsFactoryProvider == null ? 0 : atomsFactoryProvider.hashCode());
        }

        @NotNull
        public String toString() {
            return "Config(imageLoader=" + this.imageLoader + ", debugBounds=" + this.debugBounds + ", fillDefaultRefillablePoolProviders=" + this.fillDefaultRefillablePoolProviders + ", generatorIdFactory=" + this.generatorIdFactory + ", atomsFactoryProvider=" + this.atomsFactoryProvider + ")";
        }

        public /* synthetic */ Config(ImageLoader imageLoader, boolean z11, boolean z12, GeneratorIdFactory generatorIdFactory, AtomsFactoryProvider atomsFactoryProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageLoader, z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? new GeneratorIdFactoryImpl(false) : generatorIdFactory, (i11 & 16) != 0 ? null : atomsFactoryProvider);
        }
    }
}
