package ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.sticky;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockDTO;
import ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockMappersKt;
import ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockVO;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.main.TextBlockVH;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b*\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0013j\u0002`\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR6\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001fj\u0002` \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/sticky/TextBlockNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/BottomContainerViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/main/TextBlockVH;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockDTO;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "stateId", "", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockDTO;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "inflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/main/TextBlockVH;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/main/TextBlockVH;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "dp16", "I", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockNoUiViewMapper extends BottomContainerViewMapper<TextBlockVH, TextBlockDTO, TextBlockVO> {
    private final int dp16;

    @NotNull
    private final Function2<TextBlockDTO, d, List<TextBlockVO>> mapper;

    public TextBlockNoUiViewMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mapper = new TextBlockNoUiViewMapper$mapper$1(this);
        this.dp16 = ResourceExtKt.toPx(16, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TextBlockVO> toVO(TextBlockDTO textBlockDTO, String str) {
        TextBlockVO mapToVO;
        List<TextBlockVO> list = null;
        if (!Intrinsics.d(textBlockDTO.isSticky(), Boolean.TRUE)) {
            textBlockDTO = null;
        }
        if (textBlockDTO != null && (mapToVO = TextBlockMappersKt.mapToVO(textBlockDTO, str)) != null) {
            list = C7714v.a0(mapToVO);
        }
        return list == null ? K.f71697a : list;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    public /* bridge */ /* synthetic */ TextBlockVH createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<TextBlockDTO, d, List<TextBlockVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    public void bind(@NotNull TextBlockVH holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockVO");
        k.bindItem$default(holder, (TextBlockVO) d11, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    @NotNull
    public TextBlockVH createHolder(@NotNull ComposerInflater inflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        View inflate = inflater.inflate(R$layout.widget_text_block);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = this.dp16;
        }
        return new TextBlockVH(inflate, references);
    }
}
