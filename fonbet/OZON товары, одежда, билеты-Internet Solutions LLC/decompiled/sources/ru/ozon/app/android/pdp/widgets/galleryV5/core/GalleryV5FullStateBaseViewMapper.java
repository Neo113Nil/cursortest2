package ru.ozon.app.android.pdp.widgets.galleryV5.core;

import A00.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5DTO;
import ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5FullStateView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b!\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0010j\b\u0012\u0004\u0012\u00020\u0002`\u00112\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH$¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R2\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8$X¤\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u0002058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b?\u00109¨\u0006A"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5FullStateBaseViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/galleryV5/di/GalleryV5WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;", "Lru/ozon/app/android/pdp/widgets/galleryV5/utils/GalleryV5Utils;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "createViewHolder", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/reflect/KFunction2;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5Mapper;", "mapper", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "galleryConfig", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "getGalleryConfig", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "setGalleryConfig", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;)V", "", "isSingleButton", "()Z", "getDefaultPreCreationConfig", "defaultPreCreationConfig", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GalleryV5FullStateBaseViewMapper extends WidgetViewMapper2<GalleryV5WidgetComponent, GalleryV5DTO, GalleryV5VO> implements GalleryV5Utils {
    private GalleryV5PreCreationConfig galleryConfig;
    private final Integer layout;

    @NotNull
    private final h<k<GalleryV5VO>> holderProducer = new GalleryV5FullStateBaseViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(GalleryV5UpdateKey.class, GalleryV5PositionUpdateKey.class);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = LazyUtilsKt.unsafeLazy(new GalleryV5FullStateBaseViewMapper$mapper$2(this));

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.utils.GalleryV5Utils
    public int calculateHeight(Double d11, @NotNull Context context, double d12) {
        return GalleryV5Utils.DefaultImpls.calculateHeight(this, d11, context, d12);
    }

    @NotNull
    public GalleryV5PreCreationConfig createDefaultPreCreationConfig(@NotNull Context context) {
        return GalleryV5Utils.DefaultImpls.createDefaultPreCreationConfig(this, context);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GalleryV5PreCreationConfig galleryV5PreCreationConfig = this.galleryConfig;
        if (galleryV5PreCreationConfig == null) {
            galleryV5PreCreationConfig = getDefaultPreCreationConfig();
        }
        return new GalleryV5FullStateView(context, galleryV5PreCreationConfig);
    }

    @NotNull
    protected abstract k<GalleryV5VO> createViewHolder(@NotNull View view, @NotNull ComposerReferences references);

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getDefaultGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getDefaultGalleryRatio(this);
    }

    @NotNull
    protected final GalleryV5PreCreationConfig getDefaultPreCreationConfig() {
        return createDefaultPreCreationConfig(component().getContext());
    }

    protected final GalleryV5PreCreationConfig getGalleryConfig() {
        return this.galleryConfig;
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

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMaxVerticalStateRatio() {
        return GalleryV5Utils.DefaultImpls.getMaxVerticalStateRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinContainerRatio() {
        return GalleryV5Utils.DefaultImpls.getMinContainerRatio(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public double getMinGalleryRatio() {
        return GalleryV5Utils.DefaultImpls.getMinGalleryRatio(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const
    public float getWavesAmount() {
        return GalleryV5Utils.DefaultImpls.getWavesAmount(this);
    }

    /* renamed from: isSingleButton */
    protected abstract boolean getIsSingleButton();

    protected final void setGalleryConfig(GalleryV5PreCreationConfig galleryV5PreCreationConfig) {
        this.galleryConfig = galleryV5PreCreationConfig;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<GalleryV5WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return GalleryV5WidgetComponent.INSTANCE.create(storage);
    }

    @NotNull
    public h<k<GalleryV5VO>> getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public GalleryV5Mapper getMapper() {
        return (GalleryV5Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public GalleryV5VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull GalleryV5VO oldItem) {
        GalleryV5VO copy$default;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof GalleryV5UpdateKey) {
            GalleryV5VO galleryV5VO = (GalleryV5VO) C7714v.M(getMapper().invokeUpdate());
            if (galleryV5VO != null && (copy$default = GalleryV5VO.copy$default(galleryV5VO, 0L, null, null, null, null, null, null, oldItem.getPosition(), null, 383, null)) != null) {
                return copy$default;
            }
        } else if (update instanceof GalleryV5PositionUpdateKey) {
            return GalleryV5VO.copy$default(oldItem, 0L, null, null, null, null, null, null, Integer.valueOf(((GalleryV5PositionUpdateKey) update).getPosition()), null, 383, null);
        }
        return oldItem;
    }
}
