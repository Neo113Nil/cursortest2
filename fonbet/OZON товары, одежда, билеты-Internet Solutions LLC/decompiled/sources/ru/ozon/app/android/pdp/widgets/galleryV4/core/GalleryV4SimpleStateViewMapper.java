package ru.ozon.app.android.pdp.widgets.galleryV4.core;

import A00.a;
import Sc.InterfaceC4008j;
import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.common.flags.FreshTextureViewInPDPCurtainEnabled;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryV4.data.GalleryV4DTO;
import ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4SimpleStateView;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4SimpleStateViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.player.soundservice.SoundScope;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R2\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4SimpleStateViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/galleryV4/di/GalleryV4WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;", "Lru/ozon/app/android/pdp/widgets/galleryV4/utils/GalleryV4Utils;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "createViewHolder", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/reflect/KFunction2;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Mapper;", "mapper", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "defaultPreCreationConfig$delegate", "getDefaultPreCreationConfig", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "defaultPreCreationConfig", "galleryConfig", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV4SimpleStateViewMapper extends WidgetViewMapper2<GalleryV4WidgetComponent, GalleryV4DTO, GalleryV4VO> implements GalleryV4Utils {
    private GalleryV4PreCreationConfig galleryConfig;
    private final Integer layout;

    @NotNull
    private final h<k<GalleryV4VO>> holderProducer = new GalleryV4SimpleStateViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(GalleryV4UpdateKey.class, GalleryV4PositionUpdateKey.class);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = LazyUtilsKt.unsafeLazy(new GalleryV4SimpleStateViewMapper$mapper$2(this));

    /* renamed from: defaultPreCreationConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultPreCreationConfig = LazyUtilsKt.unsafeLazy(new GalleryV4SimpleStateViewMapper$defaultPreCreationConfig$2(this));

    /* JADX INFO: Access modifiers changed from: private */
    public final k<GalleryV4VO> createViewHolder(View view, ComposerReferences references) {
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4SimpleStateView");
        GalleryV4SimpleStateView galleryV4SimpleStateView = (GalleryV4SimpleStateView) view;
        l tokenizedAnalytics = component().getTokenizedAnalytics();
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = this.galleryConfig;
        if (galleryV4PreCreationConfig == null) {
            galleryV4PreCreationConfig = getDefaultPreCreationConfig();
        }
        return new GalleryV4SimpleStateViewHolder(galleryV4SimpleStateView, references, tokenizedAnalytics, galleryV4PreCreationConfig, new GalleryV4SimpleStateViewMapper$createViewHolder$1(this), component().getSoundService().getSoundController(SoundScope.COMMON), (GallerySyncViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4SimpleStateViewMapper$createViewHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                GallerySyncViewModelImpl gallerySyncVMP = GalleryV4SimpleStateViewMapper.this.component().getGallerySyncVMP();
                Intrinsics.g(gallerySyncVMP, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return gallerySyncVMP;
            }
        }).a(GallerySyncViewModelImpl.class), MiniAppExtKt.isExpress(galleryV4SimpleStateView.getContext()) && component().getFeatureChecker().isEnabled(FreshTextureViewInPDPCurtainEnabled.INSTANCE));
    }

    private final GalleryV4PreCreationConfig getDefaultPreCreationConfig() {
        return (GalleryV4PreCreationConfig) this.defaultPreCreationConfig.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.utils.GalleryV4Utils
    public int calculateHeight(double d11, @NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.calculateHeight(this, d11, context);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        GalleryV4DTO galleryV4DTO = state instanceof GalleryV4DTO ? (GalleryV4DTO) state : null;
        return galleryV4DTO != null && galleryV4DTO.getButtons() == null;
    }

    @NotNull
    public GalleryV4PreCreationConfig createDefaultPreCreationConfig(@NotNull Context context) {
        return GalleryV4Utils.DefaultImpls.createDefaultPreCreationConfig(this, context);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GalleryV4PreCreationConfig galleryV4PreCreationConfig = this.galleryConfig;
        if (galleryV4PreCreationConfig == null) {
            galleryV4PreCreationConfig = getDefaultPreCreationConfig();
        }
        GalleryV4SimpleStateView galleryV4SimpleStateView = new GalleryV4SimpleStateView(context, galleryV4PreCreationConfig);
        galleryV4SimpleStateView.setNestedScrollingEnabled(false);
        return galleryV4SimpleStateView;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getDefaultGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Utils.DefaultImpls.getGalleryPadding(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMaxVerticalStateRatio() {
        return GalleryV4Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinContainerRatio() {
        return GalleryV4Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public double getMinGalleryRatio() {
        return GalleryV4Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public float getWavesAmount() {
        return GalleryV4Utils.DefaultImpls.getWavesAmount(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<GalleryV4WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return GalleryV4WidgetComponent.INSTANCE.create(storage);
    }

    @NotNull
    public h<k<GalleryV4VO>> getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public GalleryV4Mapper getMapper() {
        return (GalleryV4Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public GalleryV4VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull GalleryV4VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof GalleryV4UpdateKey) {
            GalleryV4VO galleryV4VO = (GalleryV4VO) C7714v.M(getMapper().invokeUpdate());
            if (galleryV4VO != null) {
                return galleryV4VO;
            }
        } else if (update instanceof GalleryV4PositionUpdateKey) {
            return GalleryV4VO.copy$default(oldItem, 0L, null, null, null, null, null, null, Integer.valueOf(((GalleryV4PositionUpdateKey) update).getPosition()), 127, null);
        }
        return oldItem;
    }
}
