package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.facebook.shimmer.ShimmerFrameLayout;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingScreen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"LoadingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "shimmerDrawable", "", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "LoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LoadingScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingScreen$lambda$3(Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        LoadingScreen(modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingScreenPreview$lambda$4(int i, Composer composer, int i2) {
        LoadingScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LoadingScreen(final Modifier modifier, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1767045234);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final long m13116getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1035114321);
            boolean changed = startRestartGroup.changed(m13116getPrimaryText0d7_KjU) | ((i4 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.LoadingScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ShimmerFrameLayout LoadingScreen$lambda$2$lambda$1;
                        LoadingScreen$lambda$2$lambda$1 = LoadingScreenKt.LoadingScreen$lambda$2$lambda$1(m13116getPrimaryText0d7_KjU, i, (Context) obj);
                        return LoadingScreen$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) rememberedValue, fillMaxSize$default, null, startRestartGroup, 0, 4);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.LoadingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LoadingScreen$lambda$3;
                    LoadingScreen$lambda$3 = LoadingScreenKt.LoadingScreen$lambda$3(Modifier.this, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return LoadingScreen$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmerFrameLayout LoadingScreen$lambda$2$lambda$1(long j, int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ShimmerFrameLayout buildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        buildLoadingContainer.addView(LoadingComponentKt.m12691buildLoadingContentbw27NRU(context, j, i));
        return buildLoadingContainer;
    }

    @IntercomPreviews
    public static final void LoadingScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1596356708);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LoadingScreenKt.INSTANCE.m12078getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.LoadingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LoadingScreenPreview$lambda$4;
                    LoadingScreenPreview$lambda$4 = LoadingScreenKt.LoadingScreenPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return LoadingScreenPreview$lambda$4;
                }
            });
        }
    }
}
