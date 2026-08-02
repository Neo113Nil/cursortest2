package com.google.accompanist.permissions;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MutablePermissionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"rememberMutablePermissionState", "Lcom/google/accompanist/permissions/MutablePermissionState;", "permission", "", "onPermissionResult", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MutablePermissionState;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutablePermissionStateKt {
    public static final MutablePermissionState rememberMutablePermissionState(String permission, final Function1<? super Boolean, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        composer.startReplaceableGroup(1424240517);
        if ((i2 & 2) != 0) {
            function1 = new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$1
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1424240517, i, -1, "com.google.accompanist.permissions.rememberMutablePermissionState (MutablePermissionState.kt:47)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        composer.startReplaceableGroup(-1903070007);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(permission)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new MutablePermissionState(permission, context, PermissionsUtilKt.findActivity(context));
            composer.updateRememberedValue(rememberedValue);
        }
        final MutablePermissionState mutablePermissionState = (MutablePermissionState) rememberedValue;
        composer.endReplaceableGroup();
        PermissionsUtilKt.PermissionLifecycleCheckerEffect(mutablePermissionState, null, composer, 0, 2);
        ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
        composer.startReplaceableGroup(-1903069605);
        boolean changed = composer.changed(mutablePermissionState);
        if ((((i & 112) ^ 48) <= 32 || !composer.changedInstance(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = changed | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z4) {
                    MutablePermissionState.this.refreshPermissionStatus$permissions_release();
                    function1.invoke(Boolean.valueOf(z4));
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue2, composer, 8);
        EffectsKt.DisposableEffect(mutablePermissionState, rememberLauncherForActivityResult, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                MutablePermissionState.this.setLauncher$permissions_release(rememberLauncherForActivityResult);
                final MutablePermissionState mutablePermissionState2 = MutablePermissionState.this;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        MutablePermissionState.this.setLauncher$permissions_release(null);
                    }
                };
            }
        }, composer, ManagedActivityResultLauncher.$stable << 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutablePermissionState;
    }
}
