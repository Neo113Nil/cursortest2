package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HomeHeaderBackdrop.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-5$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$HomeHeaderBackdropKt$lambda5$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda5$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda5$1();

    ComposableSingletons$HomeHeaderBackdropKt$lambda5$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        float m8798constructorimpl = Dp.m8798constructorimpl(200);
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid solid = new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(ColorKt.Color(ColorUtils.parseColor("#326D7D")), true, null);
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"#8B0000", "#4B0000"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10));
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add(Color.m6029boximpl(ColorKt.Color(ColorUtils.parseColor((String) it.next()))));
        }
        HomeHeaderBackdropKt.m12523HomeHeaderBackdropAjpBEmI(m8798constructorimpl, solid, new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(arrayList, true), new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-5$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, composer, 3590, 0);
    }
}
