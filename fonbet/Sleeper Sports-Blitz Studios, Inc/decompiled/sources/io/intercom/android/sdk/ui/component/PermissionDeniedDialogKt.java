package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PermissionDeniedDialog.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"PermissionDeniedDialog", "", "modifier", "Landroidx/compose/ui/Modifier;", "message", "", "confirmText", "dismissText", "iconId", "", "onDismiss", "Lkotlin/Function0;", "onConfirm", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PermissionDeniedDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PermissionDeniedDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionDeniedDialog$lambda$2(Modifier modifier, String message, String confirmText, String dismissText, Integer num, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(confirmText, "$confirmText");
        Intrinsics.checkNotNullParameter(dismissText, "$dismissText");
        PermissionDeniedDialog(modifier, message, confirmText, dismissText, num, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionDeniedDialogPreview$lambda$3(int i, Composer composer, int i2) {
        PermissionDeniedDialogPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PermissionDeniedDialog(Modifier modifier, final String message, final String confirmText, final String dismissText, Integer num, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Integer num2;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function0<Unit> function04;
        final Integer num3;
        final Function0<Unit> function05;
        Composer composer2;
        final Function0<Unit> function06;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(dismissText, "dismissText");
        Composer startRestartGroup = composer.startRestartGroup(-537034576);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(message) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(confirmText) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(dismissText) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            num2 = num;
            i3 |= startRestartGroup.changed(num2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                    if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        num3 = i7 == 0 ? null : num2;
                        final Function0<Unit> function07 = i4 == 0 ? new Function0() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        } : function03;
                        function05 = i5 == 0 ? new Function0() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        } : function04;
                        Modifier modifier4 = companion;
                        composer2 = startRestartGroup;
                        AndroidAlertDialog_androidKt.m2619AlertDialogOix01E0(function07, ComposableLambdaKt.rememberComposableLambda(-1474258584, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                                invoke(composer3, num4.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    Function0<Unit> function08 = function05;
                                    final String str = confirmText;
                                    ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2118877259, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                                            invoke(rowScope, composer4, num4.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                            if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                                TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                                TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), modifier4, ComposableLambdaKt.rememberComposableLambda(-868483802, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                                invoke(composer3, num4.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    Function0<Unit> function08 = function07;
                                    final String str = dismissText;
                                    ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1570315255, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                                            invoke(rowScope, composer4, num4.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                            if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                                TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                                TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-565596411, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                                invoke(composer3, num4.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    Integer num4 = num3;
                                    if (num4 == null) {
                                        return;
                                    }
                                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(num4.intValue(), composer3, 0), "", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, 6).m13115getPrimaryIcon0d7_KjU(), composer3, 440, 0);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(40178371, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                                invoke(composer3, num4.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer3, 6).getType04();
                                    TextKt.m3901TextNvy7gAk(message, null, IntercomTheme.INSTANCE.getColors(composer3, 6).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, composer3, 0, 0, 131066);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), null, IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m13094getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null), composer2, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                        function06 = function07;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        num3 = num2;
                        function06 = function03;
                        function05 = function04;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit PermissionDeniedDialog$lambda$2;
                                PermissionDeniedDialog$lambda$2 = PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$2(Modifier.this, message, confirmText, dismissText, num3, function06, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return PermissionDeniedDialog$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                function04 = function02;
                if ((2995931 & i3) == 599186) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                Modifier modifier42 = companion;
                composer2 = startRestartGroup;
                AndroidAlertDialog_androidKt.m2619AlertDialogOix01E0(function07, ComposableLambdaKt.rememberComposableLambda(-1474258584, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                        invoke(composer3, num4.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                            Function0<Unit> function08 = function05;
                            final String str = confirmText;
                            ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2118877259, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                                    invoke(rowScope, composer4, num4.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                        TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                        TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), modifier42, ComposableLambdaKt.rememberComposableLambda(-868483802, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                        invoke(composer3, num4.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                            Function0<Unit> function08 = function07;
                            final String str = dismissText;
                            ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1570315255, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                                    invoke(rowScope, composer4, num4.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                        TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                        TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-565596411, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                        invoke(composer3, num4.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(num4.intValue(), composer3, 0), "", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, 6).m13115getPrimaryIcon0d7_KjU(), composer3, 440, 0);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(40178371, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                        invoke(composer3, num4.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                            TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer3, 6).getType04();
                            TextKt.m3901TextNvy7gAk(message, null, IntercomTheme.INSTANCE.getColors(composer3, 6).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, composer3, 0, 0, 131066);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), null, IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m13094getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null), composer2, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                function06 = function07;
                modifier3 = modifier42;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function04 = function02;
            if ((2995931 & i3) == 599186) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            Modifier modifier422 = companion;
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m2619AlertDialogOix01E0(function07, ComposableLambdaKt.rememberComposableLambda(-1474258584, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                    invoke(composer3, num4.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                        Function0<Unit> function08 = function05;
                        final String str = confirmText;
                        ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2118877259, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                                invoke(rowScope, composer4, num4.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                    TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                    TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), modifier422, ComposableLambdaKt.rememberComposableLambda(-868483802, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                    invoke(composer3, num4.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                        Function0<Unit> function08 = function07;
                        final String str = dismissText;
                        ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1570315255, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                                invoke(rowScope, composer4, num4.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                    TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                    TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-565596411, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                    invoke(composer3, num4.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(num4.intValue(), composer3, 0), "", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, 6).m13115getPrimaryIcon0d7_KjU(), composer3, 440, 0);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(40178371, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                    invoke(composer3, num4.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                        TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer3, 6).getType04();
                        TextKt.m3901TextNvy7gAk(message, null, IntercomTheme.INSTANCE.getColors(composer3, 6).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, composer3, 0, 0, 131066);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), null, IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m13094getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null), composer2, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
            function06 = function07;
            modifier3 = modifier422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        num2 = num;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function04 = function02;
        if ((2995931 & i3) == 599186) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        Modifier modifier4222 = companion;
        composer2 = startRestartGroup;
        AndroidAlertDialog_androidKt.m2619AlertDialogOix01E0(function07, ComposableLambdaKt.rememberComposableLambda(-1474258584, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                invoke(composer3, num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i8) {
                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                    Function0<Unit> function08 = function05;
                    final String str = confirmText;
                    ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2118877259, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                            invoke(rowScope, composer4, num4.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), modifier4222, ComposableLambdaKt.rememberComposableLambda(-868483802, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                invoke(composer3, num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i8) {
                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                    Function0<Unit> function08 = function07;
                    final String str = dismissText;
                    ButtonKt.TextButton(function08, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1570315255, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num4) {
                            invoke(rowScope, composer4, num4.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope TextButton, Composer composer4, int i9) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(composer4, 6).getType04SemiBold();
                                TextKt.m3901TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer4, 6).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04SemiBold, composer4, 0, 0, 131066);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }, composer3, 54), composer3, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-565596411, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                invoke(composer3, num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i8) {
                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(num4.intValue(), composer3, 0), "", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, 6).m13115getPrimaryIcon0d7_KjU(), composer3, 440, 0);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(40178371, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                invoke(composer3, num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i8) {
                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                    TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer3, 6).getType04();
                    TextKt.m3901TextNvy7gAk(message, null, IntercomTheme.INSTANCE.getColors(composer3, 6).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, composer3, 0, 0, 131066);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), null, IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m13094getBackground0d7_KjU(), 0L, 0L, 0L, 0.0f, new DialogProperties(false, false, false, 5, (DefaultConstructorMarker) null), composer2, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
        function06 = function07;
        modifier3 = modifier4222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void PermissionDeniedDialogPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-501567607);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PermissionDeniedDialogKt.INSTANCE.m12903getLambda1$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PermissionDeniedDialogPreview$lambda$3;
                    PermissionDeniedDialogPreview$lambda$3 = PermissionDeniedDialogKt.PermissionDeniedDialogPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PermissionDeniedDialogPreview$lambda$3;
                }
            });
        }
    }
}
