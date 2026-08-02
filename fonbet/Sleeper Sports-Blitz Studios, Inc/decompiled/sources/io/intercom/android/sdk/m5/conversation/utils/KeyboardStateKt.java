package io.intercom.android.sdk.m5.conversation.utils;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyboardState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004²\u0006\f\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u008a\u008e\u0002"}, d2 = {"keyboardAsState", "Landroidx/compose/runtime/State;", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "intercom-sdk-base_release", "oldState"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KeyboardStateKt {
    private static final KeyboardState keyboardAsState$lambda$1(MutableState<KeyboardState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (((keyboardAsState$lambda$1(r12) != null ? r1.getBottomDiff() : 0) - r6) >= r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final State<KeyboardState> keyboardAsState(Composer composer, int i) {
        boolean z;
        composer.startReplaceGroup(-1867236611);
        composer.startReplaceGroup(-137398301);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        int bottom = WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, composer, 8).getBottom(density);
        int bottom2 = WindowInsetsKt.exclude(WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, composer, 8), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 8)).getBottom(density);
        boolean z2 = bottom > 0;
        boolean areEqual = Intrinsics.areEqual(WindowInsets_androidKt.getImeAnimationSource(WindowInsets.INSTANCE, composer, 8), WindowInsets_androidKt.getImeAnimationTarget(WindowInsets.INSTANCE, composer, 8));
        boolean z3 = !areEqual;
        float mo744toPx0680j_4 = density.mo744toPx0680j_4(Dp.m8798constructorimpl(2));
        if (z2) {
            if (!areEqual) {
            }
            z = false;
            KeyboardState keyboardState = new KeyboardState(z3, bottom, z2, z, bottom2);
            mutableState.setValue(keyboardState);
            State<KeyboardState> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(keyboardState, composer, 0);
            composer.endReplaceGroup();
            return rememberUpdatedState;
        }
        z = true;
        KeyboardState keyboardState2 = new KeyboardState(z3, bottom, z2, z, bottom2);
        mutableState.setValue(keyboardState2);
        State<KeyboardState> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(keyboardState2, composer, 0);
        composer.endReplaceGroup();
        return rememberUpdatedState2;
    }
}
