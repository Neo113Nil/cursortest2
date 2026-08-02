package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3ReturnPolicyDisclaimerViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "container", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "<init>", "(Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "dpf12", "", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "defaultColor", "", "backgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "bind", "", "item", "payloads", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3ReturnPolicyDisclaimerViewHolder extends BaseViewHolder<AviaDetailedInfoV3ListItemVO> {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final ShapeDrawable backgroundDrawable;
    private final Context context;
    private final int defaultColor;
    private final float dpf12;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3ReturnPolicyDisclaimerViewHolder(@NotNull VerticalAtomsLayout container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpf12 = pxF;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.defaultColor = themeColor;
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(themeColor, pxF);
        this.backgroundDrawable = produce;
        container.setAdapter(atomsAdapter);
        container.setBackground(produce);
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailedInfoV3ListItemVO aviaDetailedInfoV3ListItemVO, List list) {
        bind2(aviaDetailedInfoV3ListItemVO, (List<? extends Object>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailedInfoV3ListItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        AviaDetailedInfoV3VO.ReturnPolicyContentVO.DisclaimerVO disclaimerVO = item instanceof AviaDetailedInfoV3VO.ReturnPolicyContentVO.DisclaimerVO ? (AviaDetailedInfoV3VO.ReturnPolicyContentVO.DisclaimerVO) item : null;
        if (disclaimerVO != null) {
            AtomsAdapter atomsAdapter = this.atomsAdapter;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            atomsAdapter.bind(context, disclaimerVO.getTexts());
            Paint paint = this.backgroundDrawable.getPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            Integer parseColor = styleParser.parseColor(context2, disclaimerVO.getBackgroundColor());
            paint.setColor(parseColor != null ? parseColor.intValue() : this.defaultColor);
        }
    }
}
