package ru.ozon.app.android.initializers.atoms;

import G.g;
import Gl.C3124a;
import I0.C3173b;
import J0.P;
import Pk0.a;
import Pk0.c;
import Pk0.d;
import Pk0.e;
import Pk0.f;
import Pk0.h;
import Pk0.i;
import Tc.b;
import android.content.Context;
import android.content.SharedPreferences;
import gk0.q;
import gk0.x;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.AtomImageLoader;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.atoms.common.navigation.AtomNavigator;
import ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory;
import ru.ozon.app.android.domain.flags.SendNotNullAtomViewActionFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.app.android.universalwidgets.flags.PrecreateViewsTileGrid2Flag;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithDiscountView;
import ru.ozon.uni.android.uikit.view.atoms.rating.RatingView;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.AtomFeatures;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.AtomsFactoryProvider;
import ru.ozon.uni.atoms.generator.GeneratorIdFactoryImpl;
import ru.ozon.uni.atoms.parsing.AtomParserModel;
import ru.ozon.uni.atoms.parsing.ParserStateHolder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/initializers/atoms/AtomActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Lru/ozon/app/android/atoms/common/navigation/AtomNavigator;", "navigators", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/uni/atoms/parsing/AtomParserModel;", "legacyAtomParserModels", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;Lru/ozon/app/android/storage/user/UserStatusStorage;Lru/ozon/app/android/network/abtool/FeatureChecker;Ljava/util/Set;)V", "", "init", "()V", "Landroid/content/SharedPreferences;", "Ljava/util/Set;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AtomActionInitializer implements ActionInitializer {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Set<AtomParserModel> legacyAtomParserModels;

    @NotNull
    private final Set<AtomNavigator> navigators;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final UserStatusStorage userStatusStorage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/initializers/atoms/AtomActionInitializer$Companion;", "", "<init>", "()V", "updateFeatures", "", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void updateFeatures(@NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            AtomFeatures.INSTANCE.setSendViewActionIfNotNull(featureService.getBooleanKey(SendNotNullAtomViewActionFlag.INSTANCE));
        }

        private Companion() {
        }
    }

    public AtomActionInitializer(@NotNull SharedPreferences sharedPreferences, @NotNull Set<AtomNavigator> navigators, @NotNull UserStatusStorage userStatusStorage, @NotNull FeatureChecker featureChecker, @NotNull Set<AtomParserModel> legacyAtomParserModels) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(navigators, "navigators");
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(legacyAtomParserModels, "legacyAtomParserModels");
        this.sharedPreferences = sharedPreferences;
        this.navigators = navigators;
        this.userStatusStorage = userStatusStorage;
        this.featureChecker = featureChecker;
        this.legacyAtomParserModels = legacyAtomParserModels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextAtomView init$lambda$14$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextAtomView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView init$lambda$14$lambda$1(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BadgeView(it, null, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView init$lambda$14$lambda$10(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextAtomV2View init$lambda$14$lambda$11(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextAtomV2View(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AspectView init$lambda$14$lambda$12(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AspectView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StockBarView init$lambda$14$lambda$13(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new StockBarView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PriceView init$lambda$14$lambda$2(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new PriceView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartButtonView init$lambda$14$lambda$3(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AddToCartButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RatingView init$lambda$14$lambda$4(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new RatingView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallIconButtonView init$lambda$14$lambda$5(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SmallIconButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallBorderlessButtonView init$lambda$14$lambda$6(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SmallBorderlessButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SmallButtonView init$lambda$14$lambda$7(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SmallButtonView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TagAtomView init$lambda$14$lambda$8(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TagAtomView(it, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PriceWithDiscountView init$lambda$14$lambda$9(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new PriceWithDiscountView(it, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        GeneratorIdFactoryImpl generatorIdFactoryImpl = new GeneratorIdFactoryImpl(this.userStatusStorage.getIsAutoTestUser());
        AtomConfig.INSTANCE.initialize(new AtomConfig.Config(new AtomImageLoader(), this.sharedPreferences.getBoolean("PREF_DEBUG_SHOW_ATOM_BOUNDS", false), false, generatorIdFactoryImpl, new AtomsFactoryProvider() { // from class: ru.ozon.app.android.initializers.atoms.AtomActionInitializer$init$config$1
            @Override // ru.ozon.uni.atoms.AtomsFactoryProvider
            public AtomsFactory provideAtomsFactory() {
                return new DefaultAtomsFactory();
            }
        }));
        q qVar = q.f64554a;
        b builder = C7714v.B();
        builder.addAll(C7714v.b0(new x(N.b(TextAtomView.class), 10, new a(1)), new x(N.b(BadgeView.class), 5, new i(1)), new x(N.b(PriceView.class), 8, new g()), new x(N.b(AddToCartButtonView.class), 5, new H00.a()), new x(N.b(RatingView.class), 5, new C3173b()), new x(N.b(SmallIconButtonView.class), 5, new C3124a()), new x(N.b(SmallBorderlessButtonView.class), 3, new Pk0.b(1)), new x(N.b(SmallButtonView.class), 3, new c(1)), new x(N.b(TagAtomView.class), 3, new d(1)), new x(N.b(PriceWithDiscountView.class), 3, new e(1)), new x(N.b(ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView.class), 5, new f(1)), new x(N.b(TextAtomV2View.class), 10, new P(2)), new x(N.b(AspectView.class), 7, new Pk0.g(1))));
        if (this.featureChecker.isEnabled(PrecreateViewsTileGrid2Flag.INSTANCE)) {
            builder.add(new x(N.b(StockBarView.class), 5, new h(1)));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        qVar.k(builder.B());
        BxAtomConfig.INSTANCE.initialize(this.navigators, generatorIdFactoryImpl);
        ParserStateHolder.INSTANCE.initialize(this.legacyAtomParserModels);
    }
}
