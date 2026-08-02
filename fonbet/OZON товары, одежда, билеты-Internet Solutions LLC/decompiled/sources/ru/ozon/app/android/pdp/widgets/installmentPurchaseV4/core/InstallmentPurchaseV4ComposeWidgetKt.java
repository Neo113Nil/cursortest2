package ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core;

import android.graphics.Color;
import d00.C6020f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.data.InstallmentPurchaseV4DTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation.InstallmentPurchaseV4VI;
import ru.ozon.composer.compose.widget.k;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "installmentPurchaseV4Widget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$GradientBadge;", "", "widgetId", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;", "toVI", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$GradientBadge;J)Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;", "", "", "colors", "Ll1/Z;", "mapHexToColor", "(Ljava/util/List;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstallmentPurchaseV4ComposeWidgetKt {
    @NotNull
    public static final i installmentPurchaseV4Widget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.a("pdp", "installmentPurchase", k.a(4), new InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1(jsonDeserializer));
    }

    private static final List<C7807Z> mapHexToColor(List<String> list) {
        long j11;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            try {
                j11 = C7811b0.b(Color.parseColor((String) it.next()));
            } catch (IllegalArgumentException unused) {
                j11 = C7807Z.f72258l;
            }
            arrayList.add(C7807Z.m(j11));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallmentPurchaseV4VI.GradientBadge toVI(InstallmentPurchaseV4DTO.GradientBadge gradientBadge, long j11) {
        InstallmentPurchaseV4VI.Gradient gradient;
        List<C7807Z> list;
        TextDTO text = gradientBadge.getText();
        String backgroundColor = gradientBadge.getBackgroundColor();
        InstallmentPurchaseV4DTO.Gradient gradient2 = gradientBadge.getGradient();
        if (gradient2 != null) {
            List<C7807Z> mapHexToColor = mapHexToColor(gradient2.getLightValues());
            List<String> darkValues = gradient2.getDarkValues();
            if (darkValues == null || (list = mapHexToColor(darkValues)) == null) {
                list = mapHexToColor;
            }
            gradient = new InstallmentPurchaseV4VI.Gradient(mapHexToColor, list);
        } else {
            gradient = null;
        }
        Integer animationTimer = gradientBadge.getAnimationTimer();
        Map<String, TokenizedTrackingInfo> trackingInfo = gradientBadge.getTrackingInfo();
        return new InstallmentPurchaseV4VI.GradientBadge(text, backgroundColor, gradient, animationTimer, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
