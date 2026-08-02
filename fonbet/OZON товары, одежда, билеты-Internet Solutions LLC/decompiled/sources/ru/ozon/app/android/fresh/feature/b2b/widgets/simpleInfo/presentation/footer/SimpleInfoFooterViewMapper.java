package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.footer;

import JS.a;
import android.content.Context;
import android.view.View;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetSimpleInfoBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.SimpleInfoVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.SimpleInfoViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00032\n\u0010\u001a\u001a\u00060\u0013j\u0002`\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b\"\u0010#R,\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050&0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/footer/SimpleInfoFooterViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/di/SimpleInfoComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/SimpleInfoViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/SimpleInfoVO;", "<init>", "()V", "Landroid/view/View;", "Landroid/content/Context;", "context", "", "setupBackground", "(Landroid/view/View;Landroid/content/Context;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/SimpleInfoViewHolder;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/SimpleInfoViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleInfoFooterViewMapper extends BottomContainerViewMapper2<SimpleInfoComponent, SimpleInfoViewHolder, SimpleInfoDTO, SimpleInfoVO> {
    private final void setupBackground(View view, Context context) {
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleInfoComponent widgetComponent$lambda$0(C7475g c7475g) {
        return SimpleInfoComponent.INSTANCE.createComponent(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ SimpleInfoViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<SimpleInfoDTO, d, List<SimpleInfoVO>> getMapper() {
        return ((SimpleInfoComponent) component()).getSimpleInfoFooterMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SimpleInfoComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SimpleInfoComponent.class), new a(storage, 13));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull SimpleInfoViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        SimpleInfoVO simpleInfoVO = d11 instanceof SimpleInfoVO ? (SimpleInfoVO) d11 : null;
        if (simpleInfoVO == null) {
            return;
        }
        k.bindItem$default(holder, simpleInfoVO, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public SimpleInfoViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        View inflate = composerInflater.inflate(R$layout.widget_simple_info);
        setupBackground(inflate, composerInflater.getContext());
        Vg.d customActionHandlersStoreFactory = ((SimpleInfoComponent) component()).getCustomActionHandlersStoreFactory();
        WidgetSimpleInfoBinding bind = WidgetSimpleInfoBinding.bind(inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new SimpleInfoViewHolder(customActionHandlersStoreFactory, bind, references);
    }
}
