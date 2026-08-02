package ru.ozon.app.android.commonwidgets.widgets.restrictions.core;

import A00.a;
import Bl.b;
import Sc.o;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.RestrictionsDTO;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsAppStore;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsScreenStore;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsStore;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation.CartFlashbarActionHandler;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation.RestrictionsVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010)\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsNoUIViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsMapper;", "mapper", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsAppStore;", "appStore", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsScreenStore;", "screenStore", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsMapper;Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsAppStore;Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsScreenStore;)V", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;", "first", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "vo", "", "showRestrictions", "(Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsMapper;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsAppStore;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsScreenStore;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsNoUIViewMapper$ShowedRestriction;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "LA00/a$J$a;", "updateConsumer", "Lkotlin/jvm/functions/Function2;", "getUpdateConsumer", "()Lkotlin/jvm/functions/Function2;", "ShowedRestriction", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestrictionsNoUIViewMapper extends SingleNoUiViewMapper<RestrictionsDTO, RestrictionsVO> {

    @NotNull
    private final RestrictionsAppStore appStore;

    @NotNull
    private final RestrictionsMapper mapper;

    @NotNull
    private final RestrictionsScreenStore screenStore;

    @NotNull
    private final List<Class<ShowedRestriction>> supportedUpdates;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, RestrictionsVO, RestrictionsVO> updateConsumer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/core/RestrictionsNoUIViewMapper$ShowedRestriction;", "LA00/a$J$a;", "<init>", "()V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowedRestriction implements a.J.InterfaceC0007a {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictionsVO.ShowOnceStrategy.Lifetime.values().length];
            try {
                iArr[RestrictionsVO.ShowOnceStrategy.Lifetime.PER_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionsVO.ShowOnceStrategy.Lifetime.PER_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RestrictionsNoUIViewMapper(@NotNull RestrictionsMapper mapper, @NotNull RestrictionsAppStore appStore, @NotNull RestrictionsScreenStore screenStore) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(appStore, "appStore");
        Intrinsics.checkNotNullParameter(screenStore, "screenStore");
        this.mapper = mapper;
        this.appStore = appStore;
        this.screenStore = screenStore;
        this.supportedUpdates = C7714v.a0(ShowedRestriction.class);
        this.updateConsumer = RestrictionsNoUIViewMapper$updateConsumer$1.INSTANCE;
    }

    private final void showRestrictions(RestrictionsVO.RestrictionVO first, ComposerReferences references, RestrictionsVO vo) {
        ViewGroup b11 = b.b(references);
        if (b11 != null) {
            RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, b11, C7714v.m0(getMapper().mapToRestriction(first)), references.getContainer().g(), new CartFlashbarActionHandler(references, first), null, new RestrictionsNoUIViewMapper$showRestrictions$1$1(first, references), new RestrictionsNoUIViewMapper$showRestrictions$1$2(vo, references), null, 144, null);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        RestrictionsStore restrictionsStore;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation.RestrictionsVO");
        RestrictionsVO restrictionsVO = (RestrictionsVO) d11;
        RestrictionsVO.RestrictionVO restrictionVO = (RestrictionsVO.RestrictionVO) C7714v.M(restrictionsVO.getRestrictions());
        if (restrictionVO == null) {
            references.getController().m(restrictionsVO.getId());
            return;
        }
        RestrictionsVO.ShowOnceStrategy strategy = restrictionsVO.getStrategy();
        if (strategy == null) {
            showRestrictions(restrictionVO, references, restrictionsVO);
            return;
        }
        String token = strategy.getToken();
        int hashCode = restrictionVO.hashCode();
        int i11 = WhenMappings.$EnumSwitchMapping$0[strategy.getLifetime().ordinal()];
        if (i11 == 1) {
            restrictionsStore = this.appStore;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            restrictionsStore = this.screenStore;
        }
        if (restrictionsStore.isTokenExist(token, hashCode)) {
            references.getController().update(new ShowedRestriction());
        } else {
            restrictionsStore.put(token, hashCode);
            showRestrictions(restrictionVO, references, restrictionsVO);
        }
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<ShowedRestriction>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, RestrictionsVO, RestrictionsVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public RestrictionsMapper getMapper() {
        return this.mapper;
    }
}
