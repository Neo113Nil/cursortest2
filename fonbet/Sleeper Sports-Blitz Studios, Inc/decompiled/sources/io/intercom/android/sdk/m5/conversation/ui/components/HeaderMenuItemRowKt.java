package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderMenuItemRow.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001au\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aY\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"HeaderMenuItemRow", "", "modifier", "Landroidx/compose/ui/Modifier;", Constants.ScionAnalytics.PARAM_LABEL, "", "icon", "", "badgeText", "showBadge", "", "showUnreadDot", "isExpanded", ViewProps.ON_CLICK, "Lkotlin/Function0;", "enabled", "tint", "Landroidx/compose/ui/graphics/Color;", "HeaderMenuItemRow-6RhP_wg", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ILjava/lang/String;ZZZLkotlin/jvm/functions/Function0;ZJLandroidx/compose/runtime/Composer;II)V", "CollapsedHeaderMenuItemRow", "CollapsedHeaderMenuItemRow-88mDfTA", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ILjava/lang/String;ZZLkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V", "ExpandedHeaderMenuItemRow", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ILjava/lang/String;ZZLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "UnreadBadge", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "CollapsedHeaderMenuItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "CollapsedHeaderMenuItemDotPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HeaderMenuItemRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollapsedHeaderMenuItemDotPreview$lambda$9(int i, Composer composer, int i2) {
        CollapsedHeaderMenuItemDotPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollapsedHeaderMenuItemPreview$lambda$8(int i, Composer composer, int i2) {
        CollapsedHeaderMenuItemPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(Modifier modifier, String label, int i, String str, boolean z, boolean z2, Function0 onClick, long j, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(label, "$label");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        m12222CollapsedHeaderMenuItemRow88mDfTA(modifier, label, i, str, z, z2, onClick, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedHeaderMenuItemRow$lambda$6(Modifier modifier, String label, int i, String str, boolean z, boolean z2, Function0 onClick, boolean z3, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(label, "$label");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        ExpandedHeaderMenuItemRow(modifier, label, i, str, z, z2, onClick, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderMenuItemRow_6RhP_wg$lambda$1(Modifier modifier, String label, int i, String str, boolean z, boolean z2, boolean z3, Function0 function0, boolean z4, long j, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(label, "$label");
        m12223HeaderMenuItemRow6RhP_wg(modifier, label, i, str, z, z2, z3, function0, z4, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadBadge$lambda$7(Modifier modifier, String badgeText, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(badgeText, "$badgeText");
        UnreadBadge(modifier, badgeText, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a7  */
    /* renamed from: HeaderMenuItemRow-6RhP_wg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12223HeaderMenuItemRow6RhP_wg(Modifier modifier, final String label, final int i, String str, boolean z, boolean z2, boolean z3, Function0<Unit> function0, final boolean z4, final long j, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        String str2;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z7;
        String str3;
        Function0<Unit> function02;
        final Modifier modifier3;
        Composer composer2;
        final Function0<Unit> function03;
        final boolean z8;
        final boolean z9;
        final String str4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Composer startRestartGroup = composer.startRestartGroup(442747888);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 256 : 128;
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                str2 = str;
                i4 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    z5 = z;
                    i4 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((458752 & i2) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            i10 = 3670016;
                            z6 = z3;
                        } else {
                            i10 = 3670016;
                            z6 = z3;
                            if ((i2 & 3670016) == 0) {
                                i4 |= startRestartGroup.changed(z6) ? 1048576 : 524288;
                            }
                        }
                        i11 = i3 & 128;
                        if (i11 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 29360128) == 0) {
                            i12 = i11;
                            i4 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                            if ((i3 & 256) == 0) {
                                i4 |= 100663296;
                            } else if ((234881024 & i2) == 0) {
                                i4 |= startRestartGroup.changed(z4) ? 67108864 : 33554432;
                                if ((i3 & 512) != 0) {
                                    i4 |= 805306368;
                                } else if ((1879048192 & i2) == 0) {
                                    i13 = i8;
                                    i4 |= startRestartGroup.changed(j) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                    i14 = i13;
                                    if ((i4 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                                        Modifier.Companion companion = i15 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i6 != 0) {
                                            str2 = null;
                                        }
                                        if (i7 != 0) {
                                            z5 = true;
                                        }
                                        boolean z10 = i14 == 0 ? false : z2;
                                        if (i9 != 0) {
                                            z6 = false;
                                        }
                                        Function0<Unit> function04 = i12 == 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        } : function0;
                                        if (!z6) {
                                            startRestartGroup.startReplaceGroup(-1365549178);
                                            int i16 = 524286 & i4;
                                            int i17 = i4 >> 3;
                                            int i18 = i16 | (i17 & i10) | (i17 & 29360128);
                                            int i19 = i5;
                                            z7 = z5;
                                            str3 = str2;
                                            Function0<Unit> function05 = function04;
                                            ExpandedHeaderMenuItemRow(companion, label, i19, str3, z7, z10, function05, z4, startRestartGroup, i18, 0);
                                            startRestartGroup.endReplaceGroup();
                                            function02 = function05;
                                        } else {
                                            z7 = z5;
                                            startRestartGroup.startReplaceGroup(-1365233877);
                                            int i20 = (524286 & i4) | ((i4 >> 3) & i10) | ((i4 >> 6) & 29360128);
                                            str3 = str2;
                                            function02 = function04;
                                            m12222CollapsedHeaderMenuItemRow88mDfTA(companion, label, i, str3, z7, z10, function02, j, startRestartGroup, i20, 0);
                                            startRestartGroup = startRestartGroup;
                                            startRestartGroup.endReplaceGroup();
                                        }
                                        modifier3 = companion;
                                        composer2 = startRestartGroup;
                                        function03 = function02;
                                        z8 = z10;
                                        z9 = z7;
                                        str4 = str3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier2;
                                        str4 = str2;
                                        z9 = z5;
                                        z8 = z2;
                                        composer2 = startRestartGroup;
                                        function03 = function0;
                                    }
                                    final boolean z11 = z6;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit HeaderMenuItemRow_6RhP_wg$lambda$1;
                                                HeaderMenuItemRow_6RhP_wg$lambda$1 = HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(Modifier.this, label, i, str4, z9, z8, z11, function03, z4, j, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                return HeaderMenuItemRow_6RhP_wg$lambda$1;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i13 = i8;
                                i14 = i13;
                                if ((i4 & 1533916891) == 306783378) {
                                }
                                if (i15 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (!z6) {
                                }
                                modifier3 = companion;
                                composer2 = startRestartGroup;
                                function03 = function02;
                                z8 = z10;
                                z9 = z7;
                                str4 = str3;
                                final boolean z112 = z6;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            if ((i3 & 512) != 0) {
                            }
                            i13 = i8;
                            i14 = i13;
                            if ((i4 & 1533916891) == 306783378) {
                            }
                            if (i15 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (!z6) {
                            }
                            modifier3 = companion;
                            composer2 = startRestartGroup;
                            function03 = function02;
                            z8 = z10;
                            z9 = z7;
                            str4 = str3;
                            final boolean z1122 = z6;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i12 = i11;
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) != 0) {
                        }
                        i13 = i8;
                        i14 = i13;
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        if (i15 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (!z6) {
                        }
                        modifier3 = companion;
                        composer2 = startRestartGroup;
                        function03 = function02;
                        z8 = z10;
                        z9 = z7;
                        str4 = str3;
                        final boolean z11222 = z6;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    i13 = i8;
                    i14 = i13;
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    if (i15 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (!z6) {
                    }
                    modifier3 = companion;
                    composer2 = startRestartGroup;
                    function03 = function02;
                    z8 = z10;
                    z9 = z7;
                    str4 = str3;
                    final boolean z112222 = z6;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z5 = z;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                i13 = i8;
                i14 = i13;
                if ((i4 & 1533916891) == 306783378) {
                }
                if (i15 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i14 == 0) {
                }
                if (i9 != 0) {
                }
                if (i12 == 0) {
                }
                if (!z6) {
                }
                modifier3 = companion;
                composer2 = startRestartGroup;
                function03 = function02;
                z8 = z10;
                z9 = z7;
                str4 = str3;
                final boolean z1122222 = z6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str2 = str;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            z5 = z;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i11 = i3 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i13 = i8;
            i14 = i13;
            if ((i4 & 1533916891) == 306783378) {
            }
            if (i15 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i14 == 0) {
            }
            if (i9 != 0) {
            }
            if (i12 == 0) {
            }
            if (!z6) {
            }
            modifier3 = companion;
            composer2 = startRestartGroup;
            function03 = function02;
            z8 = z10;
            z9 = z7;
            str4 = str3;
            final boolean z11222222 = z6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z5 = z;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i11 = i3 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i13 = i8;
        i14 = i13;
        if ((i4 & 1533916891) == 306783378) {
        }
        if (i15 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i14 == 0) {
        }
        if (i9 != 0) {
        }
        if (i12 == 0) {
        }
        if (!z6) {
        }
        modifier3 = companion;
        composer2 = startRestartGroup;
        function03 = function02;
        z8 = z10;
        z9 = z7;
        str4 = str3;
        final boolean z112222222 = z6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0054  */
    /* renamed from: CollapsedHeaderMenuItemRow-88mDfTA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m12222CollapsedHeaderMenuItemRow88mDfTA(Modifier modifier, final String str, final int i, final String str2, final boolean z, final boolean z2, final Function0<Unit> function0, final long j, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i4;
        String str3;
        int i5;
        int i6;
        Function0<Unit> function02;
        long j2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(955883181);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            str3 = str;
            i4 |= startRestartGroup.changed(str3) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                i5 = i;
                i4 |= startRestartGroup.changed(i5) ? 256 : 128;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i4 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((458752 & i2) == 0) {
                        i6 = startRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        function02 = function0;
                        i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        if ((i3 & 128) != 0) {
                            i4 |= 12582912;
                            j2 = j;
                        } else {
                            j2 = j;
                            if ((29360128 & i2) == 0) {
                                i4 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
                            }
                        }
                        if ((23967451 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            final String str4 = str3;
                            final int i8 = i5;
                            final Function0<Unit> function03 = function02;
                            final long j3 = j2;
                            BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(-415284443, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                    invoke(boxScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                                    if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                                        if (z2) {
                                            composer2.startReplaceGroup(-1594599123);
                                            float f = 10;
                                            BadgeKt.m2681BadgeeopBjH0(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f), 0.0f, 9, null), ColorKt.Color(4292544041L), 0L, null, composer2, 48, 12);
                                            composer2.endReplaceGroup();
                                            return;
                                        }
                                        composer2.startReplaceGroup(-1594405776);
                                        if (str2 == null || !z) {
                                            composer2.endReplaceGroup();
                                            return;
                                        }
                                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(4), Dp.m8798constructorimpl(2), 0.0f, 9, null), str2, composer2, 0, 0);
                                        composer2.endReplaceGroup();
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), modifier3, ComposableLambdaKt.rememberComposableLambda(1598560935, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                    invoke(boxScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                                    if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                                        Function0<Unit> function04 = function03;
                                        final int i10 = i8;
                                        final String str5 = str4;
                                        final long j4 = j3;
                                        IconButtonKt.IconButton(function04, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(896985929, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i11) {
                                                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i10, composer3, 0), str5, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), j4, composer3, 392, 0);
                                                } else {
                                                    composer3.skipToGroupEnd();
                                                }
                                            }
                                        }, composer2, 54), composer2, 1572864, 62);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i4 << 3) & 112) | 390, 0);
                            modifier2 = modifier3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit CollapsedHeaderMenuItemRow_88mDfTA$lambda$2;
                                    CollapsedHeaderMenuItemRow_88mDfTA$lambda$2 = HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(Modifier.this, str, i, str2, z, z2, function0, j, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return CollapsedHeaderMenuItemRow_88mDfTA$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function02 = function0;
                    if ((i3 & 128) != 0) {
                    }
                    if ((23967451 & i4) == 4793490) {
                    }
                    Modifier modifier32 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    final String str42 = str3;
                    final int i82 = i5;
                    final Function0<Unit> function032 = function02;
                    final long j32 = j2;
                    BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(-415284443, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                            if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                                if (z2) {
                                    composer2.startReplaceGroup(-1594599123);
                                    float f = 10;
                                    BadgeKt.m2681BadgeeopBjH0(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f), 0.0f, 9, null), ColorKt.Color(4292544041L), 0L, null, composer2, 48, 12);
                                    composer2.endReplaceGroup();
                                    return;
                                }
                                composer2.startReplaceGroup(-1594405776);
                                if (str2 == null || !z) {
                                    composer2.endReplaceGroup();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(4), Dp.m8798constructorimpl(2), 0.0f, 9, null), str2, composer2, 0, 0);
                                composer2.endReplaceGroup();
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), modifier32, ComposableLambdaKt.rememberComposableLambda(1598560935, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                            if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                                Function0<Unit> function04 = function032;
                                final int i10 = i82;
                                final String str5 = str42;
                                final long j4 = j32;
                                IconButtonKt.IconButton(function04, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(896985929, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i10, composer3, 0), str5, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), j4, composer3, 392, 0);
                                        } else {
                                            composer3.skipToGroupEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 1572864, 62);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i4 << 3) & 112) | 390, 0);
                    modifier2 = modifier32;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i6;
                if ((i3 & 64) == 0) {
                }
                function02 = function0;
                if ((i3 & 128) != 0) {
                }
                if ((23967451 & i4) == 4793490) {
                }
                Modifier modifier322 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                final String str422 = str3;
                final int i822 = i5;
                final Function0<Unit> function0322 = function02;
                final long j322 = j2;
                BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(-415284443, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                            if (z2) {
                                composer2.startReplaceGroup(-1594599123);
                                float f = 10;
                                BadgeKt.m2681BadgeeopBjH0(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f), 0.0f, 9, null), ColorKt.Color(4292544041L), 0L, null, composer2, 48, 12);
                                composer2.endReplaceGroup();
                                return;
                            }
                            composer2.startReplaceGroup(-1594405776);
                            if (str2 == null || !z) {
                                composer2.endReplaceGroup();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(4), Dp.m8798constructorimpl(2), 0.0f, 9, null), str2, composer2, 0, 0);
                            composer2.endReplaceGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), modifier322, ComposableLambdaKt.rememberComposableLambda(1598560935, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                        if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                            Function0<Unit> function04 = function0322;
                            final int i10 = i822;
                            final String str5 = str422;
                            final long j4 = j322;
                            IconButtonKt.IconButton(function04, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(896985929, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11) {
                                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i10, composer3, 0), str5, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), j4, composer3, 392, 0);
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 1572864, 62);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i4 << 3) & 112) | 390, 0);
                modifier2 = modifier322;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i;
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i6;
            if ((i3 & 64) == 0) {
            }
            function02 = function0;
            if ((i3 & 128) != 0) {
            }
            if ((23967451 & i4) == 4793490) {
            }
            Modifier modifier3222 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            final String str4222 = str3;
            final int i8222 = i5;
            final Function0<Unit> function03222 = function02;
            final long j3222 = j2;
            BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(-415284443, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                        if (z2) {
                            composer2.startReplaceGroup(-1594599123);
                            float f = 10;
                            BadgeKt.m2681BadgeeopBjH0(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f), 0.0f, 9, null), ColorKt.Color(4292544041L), 0L, null, composer2, 48, 12);
                            composer2.endReplaceGroup();
                            return;
                        }
                        composer2.startReplaceGroup(-1594405776);
                        if (str2 == null || !z) {
                            composer2.endReplaceGroup();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(4), Dp.m8798constructorimpl(2), 0.0f, 9, null), str2, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), modifier3222, ComposableLambdaKt.rememberComposableLambda(1598560935, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                        Function0<Unit> function04 = function03222;
                        final int i10 = i8222;
                        final String str5 = str4222;
                        final long j4 = j3222;
                        IconButtonKt.IconButton(function04, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(896985929, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i10, composer3, 0), str5, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), j4, composer3, 392, 0);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 1572864, 62);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i4 << 3) & 112) | 390, 0);
            modifier2 = modifier3222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        if ((i3 & 4) == 0) {
        }
        i5 = i;
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i6;
        if ((i3 & 64) == 0) {
        }
        function02 = function0;
        if ((i3 & 128) != 0) {
        }
        if ((23967451 & i4) == 4793490) {
        }
        Modifier modifier32222 = i7 != 0 ? Modifier.INSTANCE : modifier2;
        final String str42222 = str3;
        final int i82222 = i5;
        final Function0<Unit> function032222 = function02;
        final long j32222 = j2;
        BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(-415284443, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                    if (z2) {
                        composer2.startReplaceGroup(-1594599123);
                        float f = 10;
                        BadgeKt.m2681BadgeeopBjH0(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f), 0.0f, 9, null), ColorKt.Color(4292544041L), 0L, null, composer2, 48, 12);
                        composer2.endReplaceGroup();
                        return;
                    }
                    composer2.startReplaceGroup(-1594405776);
                    if (str2 == null || !z) {
                        composer2.endReplaceGroup();
                        return;
                    }
                    HeaderMenuItemRowKt.UnreadBadge(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(4), Dp.m8798constructorimpl(2), 0.0f, 9, null), str2, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), modifier32222, ComposableLambdaKt.rememberComposableLambda(1598560935, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope BadgedBox, Composer composer2, int i9) {
                Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                    Function0<Unit> function04 = function032222;
                    final int i10 = i82222;
                    final String str5 = str42222;
                    final long j4 = j32222;
                    IconButtonKt.IconButton(function04, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(896985929, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i11) {
                            if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i10, composer3, 0), str5, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), j4, composer3, 392, 0);
                            } else {
                                composer3.skipToGroupEnd();
                            }
                        }
                    }, composer2, 54), composer2, 1572864, 62);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i4 << 3) & 112) | 390, 0);
        modifier2 = modifier32222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ExpandedHeaderMenuItemRow(Modifier modifier, final String str, final int i, final String str2, final boolean z, final boolean z2, final Function0<Unit> function0, final boolean z3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        boolean z4;
        Object rememberedValue;
        int hashCode;
        Composer m5333constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1007952458);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                i4 |= startRestartGroup.changed(i) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i4 |= startRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((458752 & i2) == 0) {
                    i5 = startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i3 & 64) == 0) {
                    i8 = (i2 & 3670016) == 0 ? startRestartGroup.changedInstance(function0) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 128) != 0) {
                        i7 = (29360128 & i2) == 0 ? startRestartGroup.changed(z3) ? 8388608 : 4194304 : 12582912;
                        i6 = i4;
                        if ((i6 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-1310322408);
                            z4 = (i6 & 3670016) == 1048576;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                                        ExpandedHeaderMenuItemRow$lambda$4$lambda$3 = HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$4$lambda$3(Function0.this);
                                        return ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier modifier4 = companion;
                            float f = 16;
                            Modifier m1157padding3ABfNKs = PaddingKt.m1157padding3ABfNKs(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default, z3, null, null, null, (Function0) rememberedValue, 14, null), Dp.m8798constructorimpl(f));
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1157padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(1463394796);
                            long m13116getPrimaryText0d7_KjU = z3 ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU() : Color.INSTANCE.m6071getLightGray0d7_KjU();
                            startRestartGroup.endReplaceGroup();
                            TextKt.m3901TextNvy7gAk(str, null, m13116getPrimaryText0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, (i6 >> 3) & 14, 0, 262138);
                            composer2 = startRestartGroup;
                            if (z2) {
                                composer2.startReplaceGroup(-1879265457);
                                ConversationItemKt.UnreadIndicator(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), composer2, 6, 0);
                                composer2.endReplaceGroup();
                            } else if (str2 == null || !z) {
                                composer2.startReplaceGroup(-1879114425);
                                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i, composer2, (i6 >> 6) & 14), str, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), m13116getPrimaryText0d7_KjU, composer2, (i6 & 112) | 392, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1878872966);
                                UnreadBadge(Modifier.INSTANCE, str2, composer2, 6 | ((i6 >> 6) & 112), 0);
                                composer2.endReplaceGroup();
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            modifier3 = modifier2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ExpandedHeaderMenuItemRow$lambda$6;
                                    ExpandedHeaderMenuItemRow$lambda$6 = HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(Modifier.this, str, i, str2, z, z2, function0, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return ExpandedHeaderMenuItemRow$lambda$6;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= i7;
                    i6 = i4;
                    if ((i6 & 23967451) == 4793490) {
                    }
                    if (i9 != 0) {
                    }
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-1310322408);
                    if ((i6 & 3670016) == 1048576) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                            ExpandedHeaderMenuItemRow$lambda$4$lambda$3 = HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$4$lambda$3(Function0.this);
                            return ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier modifier42 = companion;
                    float f2 = 16;
                    Modifier m1157padding3ABfNKs2 = PaddingKt.m1157padding3ABfNKs(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default2, z3, null, null, null, (Function0) rememberedValue, 14, null), Dp.m8798constructorimpl(f2));
                    Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1157padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting()) {
                    }
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(1463394796);
                    long m13116getPrimaryText0d7_KjU2 = z3 ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU() : Color.INSTANCE.m6071getLightGray0d7_KjU();
                    startRestartGroup.endReplaceGroup();
                    TextKt.m3901TextNvy7gAk(str, null, m13116getPrimaryText0d7_KjU2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, (i6 >> 3) & 14, 0, 262138);
                    composer2 = startRestartGroup;
                    if (z2) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    modifier3 = modifier42;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i8;
                if ((i3 & 128) != 0) {
                }
                i4 |= i7;
                i6 = i4;
                if ((i6 & 23967451) == 4793490) {
                }
                if (i9 != 0) {
                }
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1310322408);
                if ((i6 & 3670016) == 1048576) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                        ExpandedHeaderMenuItemRow$lambda$4$lambda$3 = HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$4$lambda$3(Function0.this);
                        return ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier modifier422 = companion;
                float f22 = 16;
                Modifier m1157padding3ABfNKs22 = PaddingKt.m1157padding3ABfNKs(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default22, z3, null, null, null, (Function0) rememberedValue, 14, null), Dp.m8798constructorimpl(f22));
                Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween22, centerVertically22, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1157padding3ABfNKs22);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting()) {
                }
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(1463394796);
                long m13116getPrimaryText0d7_KjU22 = z3 ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU() : Color.INSTANCE.m6071getLightGray0d7_KjU();
                startRestartGroup.endReplaceGroup();
                TextKt.m3901TextNvy7gAk(str, null, m13116getPrimaryText0d7_KjU22, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, (i6 >> 3) & 14, 0, 262138);
                composer2 = startRestartGroup;
                if (z2) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                modifier3 = modifier422;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 |= i5;
            if ((i3 & 64) == 0) {
            }
            i4 |= i8;
            if ((i3 & 128) != 0) {
            }
            i4 |= i7;
            i6 = i4;
            if ((i6 & 23967451) == 4793490) {
            }
            if (i9 != 0) {
            }
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1310322408);
            if ((i6 & 3670016) == 1048576) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                    ExpandedHeaderMenuItemRow$lambda$4$lambda$3 = HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$4$lambda$3(Function0.this);
                    return ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier modifier4222 = companion;
            float f222 = 16;
            Modifier m1157padding3ABfNKs222 = PaddingKt.m1157padding3ABfNKs(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default222, z3, null, null, null, (Function0) rememberedValue, 14, null), Dp.m8798constructorimpl(f222));
            Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween222, centerVertically222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1157padding3ABfNKs222);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash222);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(1463394796);
            long m13116getPrimaryText0d7_KjU222 = z3 ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU() : Color.INSTANCE.m6071getLightGray0d7_KjU();
            startRestartGroup.endReplaceGroup();
            TextKt.m3901TextNvy7gAk(str, null, m13116getPrimaryText0d7_KjU222, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, (i6 >> 3) & 14, 0, 262138);
            composer2 = startRestartGroup;
            if (z2) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            modifier3 = modifier4222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i5;
        if ((i3 & 64) == 0) {
        }
        i4 |= i8;
        if ((i3 & 128) != 0) {
        }
        i4 |= i7;
        i6 = i4;
        if ((i6 & 23967451) == 4793490) {
        }
        if (i9 != 0) {
        }
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1310322408);
        if ((i6 & 3670016) == 1048576) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
                ExpandedHeaderMenuItemRow$lambda$4$lambda$3 = HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$4$lambda$3(Function0.this);
                return ExpandedHeaderMenuItemRow$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier modifier42222 = companion;
        float f2222 = 16;
        Modifier m1157padding3ABfNKs2222 = PaddingKt.m1157padding3ABfNKs(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default2222, z3, null, null, null, (Function0) rememberedValue, 14, null), Dp.m8798constructorimpl(f2222));
        Arrangement.HorizontalOrVertical spaceBetween2222 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(spaceBetween2222, centerVertically2222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1157padding3ABfNKs2222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2222);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(1463394796);
        long m13116getPrimaryText0d7_KjU2222 = z3 ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU() : Color.INSTANCE.m6071getLightGray0d7_KjU();
        startRestartGroup.endReplaceGroup();
        TextKt.m3901TextNvy7gAk(str, null, m13116getPrimaryText0d7_KjU2222, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, (i6 >> 3) & 14, 0, 262138);
        composer2 = startRestartGroup;
        if (z2) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        modifier3 = modifier42222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedHeaderMenuItemRow$lambda$4$lambda$3(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnreadBadge(final Modifier modifier, final String str, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1917800334);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            long m13095getBadge0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13095getBadge0d7_KjU();
            final long m6065getBlack0d7_KjU = ColorExtensionsKt.m13187isLightColor8_81llA(m13095getBadge0d7_KjU) ? Color.INSTANCE.m6065getBlack0d7_KjU() : Color.INSTANCE.m6076getWhite0d7_KjU();
            BadgeKt.m2681BadgeeopBjH0(modifier2, m13095getBadge0d7_KjU, 0L, ComposableLambdaKt.rememberComposableLambda(-1370135743, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$UnreadBadge$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Badge, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(Badge, "$this$Badge");
                    if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        TextStyle type05 = IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType05();
                        int m8654getCentere0LSkKk = TextAlign.INSTANCE.m8654getCentere0LSkKk();
                        TextKt.m3901TextNvy7gAk(str, companion, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m8245copyp1EtxEg$default(type05, m6065getBlack0d7_KjU, TextUnitKt.getSp(10), FontWeight.INSTANCE.getW400(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, m8654getCentere0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744440, null), composer2, 48, 0, 131068);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072, 4);
            modifier = modifier2;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnreadBadge$lambda$7;
                    UnreadBadge$lambda$7 = HeaderMenuItemRowKt.UnreadBadge$lambda$7(Modifier.this, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UnreadBadge$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void CollapsedHeaderMenuItemPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1230888234);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m12187getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CollapsedHeaderMenuItemPreview$lambda$8;
                    CollapsedHeaderMenuItemPreview$lambda$8 = HeaderMenuItemRowKt.CollapsedHeaderMenuItemPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CollapsedHeaderMenuItemPreview$lambda$8;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void CollapsedHeaderMenuItemDotPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(591640881);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m12189getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CollapsedHeaderMenuItemDotPreview$lambda$9;
                    CollapsedHeaderMenuItemDotPreview$lambda$9 = HeaderMenuItemRowKt.CollapsedHeaderMenuItemDotPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CollapsedHeaderMenuItemDotPreview$lambda$9;
                }
            });
        }
    }
}
