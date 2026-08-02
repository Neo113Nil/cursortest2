package ru.ozon.app.android.pdp.widgets.aspectsV2.core.pack;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.AspectsCompactV2BaseViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectsV2BaseViewHolder;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR,\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/core/pack/AspectsV2PackViewMapper;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/AspectsCompactV2BaseViewMapper;", "<init>", "()V", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectsV2BaseViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "", "supportedTypes", "Ljava/util/List;", "getSupportedTypes", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "Ll20/d;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "getMapper", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectsV2PackViewMapper extends AspectsCompactV2BaseViewMapper {
    private final int layout = R$layout.widget_aspects_v2_layout;

    @NotNull
    private final Function2<View, ComposerReferences, AspectsV2BaseViewHolder> holderProducer = AspectsV2PackViewMapper$holderProducer$1.INSTANCE;

    @NotNull
    private final List<String> supportedTypes = C7714v.b0("PACK", "MARKDOWN");

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AspectsV2BaseViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AspectsV2DTO.AspectV2, d, List<AspectsCompactV2VO>> getMapper() {
        return component().getPackManager();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.AspectsCompactV2BaseViewMapper
    @NotNull
    public List<String> getSupportedTypes() {
        return this.supportedTypes;
    }
}
