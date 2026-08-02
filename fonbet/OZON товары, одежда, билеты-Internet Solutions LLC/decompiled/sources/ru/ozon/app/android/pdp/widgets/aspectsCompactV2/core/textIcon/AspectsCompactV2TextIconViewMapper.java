package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.textIcon;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.AspectsCompactV2BaseViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2BaseViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/textIcon/AspectsCompactV2TextIconViewMapper;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/AspectsCompactV2BaseViewMapper;", "<init>", "()V", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2BaseViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "", "supportedTypes", "Ljava/util/List;", "getSupportedTypes", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "Ll20/d;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "getMapper", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectsCompactV2TextIconViewMapper extends AspectsCompactV2BaseViewMapper {

    @NotNull
    private final Function2<View, ComposerReferences, AspectsCompactV2BaseViewHolder> holderProducer = AspectsCompactV2TextIconViewMapper$holderProducer$1.INSTANCE;

    @NotNull
    private final List<String> supportedTypes = C7714v.a0("TEXT_ICON");

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AspectsCompactV2BaseViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AspectsV2DTO.AspectV2, d, List<AspectsCompactV2VO>> getMapper() {
        return component().getTextIconMapper();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.AspectsCompactV2BaseViewMapper
    @NotNull
    public List<String> getSupportedTypes() {
        return this.supportedTypes;
    }
}
