package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a§\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialog_6oU6zVQ$lambda$0(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Shape shape, long j, long j2, DialogProperties dialogProperties, int i, int i2, Composer composer, int i3) {
        m2176AlertDialog6oU6zVQ(function0, function2, modifier, function22, function23, function24, shape, j, j2, dialogProperties, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialog_wqdebIU$lambda$1(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Shape shape, long j, long j2, DialogProperties dialogProperties, int i, int i2, Composer composer, int i3) {
        m2177AlertDialogwqdebIU(function0, function2, modifier, function22, function23, shape, j, j2, dialogProperties, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2176AlertDialog6oU6zVQ(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Shape shape3;
        final long j3;
        final long j4;
        final DialogProperties dialogProperties2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        long j5;
        long j6;
        DialogProperties dialogProperties3;
        long j7;
        Function2<? super Composer, ? super Integer, Unit> function211;
        int i13;
        long j8;
        Modifier modifier4;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Shape shape4;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(1967984963);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)N(onDismissRequest,confirmButton,modifier,dismissButton,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,properties)41@1490L354:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function25 = function22;
                i3 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function26 = function23;
                    i3 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function27 = function24;
                        i3 |= startRestartGroup.changedInstance(function27) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                shape2 = shape;
                                if (startRestartGroup.changed(shape2)) {
                                    i16 = 1048576;
                                    i3 |= i16;
                                }
                            } else {
                                shape2 = shape;
                            }
                            i16 = 524288;
                            i3 |= i16;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0) {
                                i14 = i3;
                                i8 = i17;
                                if (startRestartGroup.changed(j)) {
                                    i15 = 8388608;
                                    i7 = i14 | i15;
                                }
                            } else {
                                i14 = i3;
                                i8 = i17;
                            }
                            i15 = 4194304;
                            i7 = i14 | i15;
                        } else {
                            i7 = i3;
                            i8 = i17;
                        }
                        if ((i & 100663296) == 0) {
                            i7 |= ((i2 & 256) == 0 && startRestartGroup.changed(j2)) ? 67108864 : 33554432;
                        }
                        i9 = i7;
                        i10 = i2 & 512;
                        if (i10 != 0) {
                            i9 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i9 |= startRestartGroup.changed(dialogProperties) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "77@4252L6,77@4310L6,77@4352L32");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i8 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function25 = null;
                                    }
                                    if (i5 != 0) {
                                        function26 = null;
                                    }
                                    if (i6 != 0) {
                                        function27 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                        shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                    }
                                    if ((i2 & 128) != 0) {
                                        i9 &= -29360129;
                                        i12 = -234881025;
                                        j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2277getSurface0d7_KjU();
                                    } else {
                                        i12 = -234881025;
                                        j5 = j;
                                    }
                                    if ((i2 & 256) != 0) {
                                        j6 = ColorsKt.m2291contentColorForek8zF_U(j5, startRestartGroup, (i9 >> 21) & 14);
                                        i9 &= i12;
                                    } else {
                                        j6 = j2;
                                    }
                                    dialogProperties3 = i11 != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties;
                                    j7 = j5;
                                    function211 = function26;
                                    i13 = i9;
                                    j8 = j6;
                                    modifier4 = modifier2;
                                    function212 = function27;
                                    shape4 = shape2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i9 &= -29360129;
                                    }
                                    if ((i2 & 256) != 0) {
                                        i9 &= -234881025;
                                    }
                                    j7 = j;
                                    j8 = j2;
                                    dialogProperties3 = dialogProperties;
                                    function211 = function26;
                                    function212 = function27;
                                    shape4 = shape2;
                                    i13 = i9;
                                    modifier4 = modifier2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1967984963, i13, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:41)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1483448977, "CC(AlertDialogImpl)N(onDismissRequest,confirmButton,modifier,dismissButton,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,properties)149@6875L386,147@6799L678:AlertDialog.kt#jmzs0o");
                                int i18 = (2147483646 & i13) >> 3;
                                composer2 = startRestartGroup;
                                m2177AlertDialogwqdebIU(function02, ComposableLambdaKt.rememberComposableLambda(-309297447, true, new AlertDialogKt$AlertDialogImpl$1(function25, function2), startRestartGroup, 54), modifier4, function211, function212, shape4, j7, j8, dialogProperties3, composer2, (i13 & 896) | (i13 & 14) | 48 | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (i18 & 234881024), 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function28 = function25;
                                modifier3 = modifier4;
                                function29 = function211;
                                function210 = function212;
                                shape3 = shape4;
                                j3 = j7;
                                j4 = j8;
                                dialogProperties2 = dialogProperties3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                function28 = function25;
                                function29 = function26;
                                function210 = function27;
                                shape3 = shape2;
                                j3 = j;
                                j4 = j2;
                                dialogProperties2 = dialogProperties;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit AlertDialog_6oU6zVQ$lambda$0;
                                        AlertDialog_6oU6zVQ$lambda$0 = AndroidAlertDialog_androidKt.AlertDialog_6oU6zVQ$lambda$0(Function0.this, function2, modifier3, function28, function29, function210, shape3, j3, j4, dialogProperties2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return AlertDialog_6oU6zVQ$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function27 = function24;
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    i9 = i7;
                    i10 = i2 & 512;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function26 = function23;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function27 = function24;
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i9 = i7;
                i10 = i2 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function25 = function22;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function26 = function23;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function27 = function24;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i9 = i7;
            i10 = i2 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function25 = function22;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function26 = function23;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function27 = function24;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i9 = i7;
        i10 = i2 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2177AlertDialogwqdebIU(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape2;
        long j3;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape3;
        final long j4;
        final DialogProperties dialogProperties2;
        ScopeUpdateScope endRestartGroup;
        long j5;
        DialogProperties dialogProperties3;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1409209698);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)N(onDismissRequest,buttons,modifier,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,properties)66@2171L303:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function24 = function2;
            i3 |= startRestartGroup.changedInstance(function24) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function22;
                    i3 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function26 = function23;
                        i3 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                shape2 = shape;
                                if (startRestartGroup.changed(shape2)) {
                                    i12 = 131072;
                                    i3 |= i12;
                                }
                            } else {
                                shape2 = shape;
                            }
                            i12 = 65536;
                            i3 |= i12;
                        } else {
                            shape2 = shape;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                j3 = j;
                                if (startRestartGroup.changed(j3)) {
                                    i11 = 1048576;
                                    i3 |= i11;
                                }
                            } else {
                                j3 = j;
                            }
                            i11 = 524288;
                            i3 |= i11;
                        } else {
                            j3 = j;
                        }
                        if ((i & 12582912) == 0) {
                            i7 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304);
                        } else {
                            i7 = i3;
                        }
                        int i13 = i7;
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i10 = i13 | 100663296;
                            i9 = i8;
                        } else if ((i & 100663296) == 0) {
                            i9 = i8;
                            i10 = i13 | (startRestartGroup.changed(dialogProperties) ? 67108864 : 33554432);
                        } else {
                            i9 = i8;
                            i10 = i13;
                        }
                        if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "77@6141L6,77@6199L6,77@6241L32");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    function25 = null;
                                }
                                if (i6 != 0) {
                                    function26 = null;
                                }
                                if ((i2 & 32) != 0) {
                                    i10 &= -458753;
                                    shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                }
                                if ((i2 & 64) != 0) {
                                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2277getSurface0d7_KjU();
                                    i10 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    j5 = ColorsKt.m2291contentColorForek8zF_U(j3, startRestartGroup, (i10 >> 18) & 14);
                                    i10 &= -29360129;
                                } else {
                                    j5 = j2;
                                }
                                if (i9 != 0) {
                                    dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                                    int i14 = i10;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1409209698, i14, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:66)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -214309806, "CC(AlertDialogImpl)N(onDismissRequest,buttons,modifier,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,properties)180@7953L276,180@7884L345:AlertDialog.kt#jmzs0o");
                                    DialogProperties dialogProperties4 = dialogProperties3;
                                    AndroidDialog_androidKt.Dialog(function0, dialogProperties4, ComposableLambdaKt.rememberComposableLambda(-488319269, true, new AlertDialogKt$AlertDialogImpl$2(function24, modifier2, function25, function26, shape2, j3, j5), startRestartGroup, 54), startRestartGroup, (i14 & 14) | 384 | (((268435454 & i14) >> 21) & 112), 0);
                                    composer2 = startRestartGroup;
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier2;
                                    function27 = function26;
                                    shape3 = shape2;
                                    j4 = j5;
                                    dialogProperties2 = dialogProperties4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i10 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                }
                                j5 = j2;
                            }
                            dialogProperties3 = dialogProperties;
                            int i142 = i10;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -214309806, "CC(AlertDialogImpl)N(onDismissRequest,buttons,modifier,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,properties)180@7953L276,180@7884L345:AlertDialog.kt#jmzs0o");
                            DialogProperties dialogProperties42 = dialogProperties3;
                            AndroidDialog_androidKt.Dialog(function0, dialogProperties42, ComposableLambdaKt.rememberComposableLambda(-488319269, true, new AlertDialogKt$AlertDialogImpl$2(function24, modifier2, function25, function26, shape2, j3, j5), startRestartGroup, 54), startRestartGroup, (i142 & 14) | 384 | (((268435454 & i142) >> 21) & 112), 0);
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            function27 = function26;
                            shape3 = shape2;
                            j4 = j5;
                            dialogProperties2 = dialogProperties42;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            function27 = function26;
                            shape3 = shape2;
                            j4 = j2;
                            dialogProperties2 = dialogProperties;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
                        final long j6 = j3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit AlertDialog_wqdebIU$lambda$1;
                                    AlertDialog_wqdebIU$lambda$1 = AndroidAlertDialog_androidKt.AlertDialog_wqdebIU$lambda$1(Function0.this, function2, modifier3, function28, function27, shape3, j6, j4, dialogProperties2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return AlertDialog_wqdebIU$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function26 = function23;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    int i132 = i7;
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
                    }
                    final Function2 function282 = function25;
                    final long j62 = j3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function25 = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function26 = function23;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                int i1322 = i7;
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
                }
                final Function2 function2822 = function25;
                final long j622 = j3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function25 = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function26 = function23;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            int i13222 = i7;
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
            }
            final Function2 function28222 = function25;
            final long j6222 = j3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function24 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function25 = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function26 = function23;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        int i132222 = i7;
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
        }
        final Function2 function282222 = function25;
        final long j62222 = j3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
