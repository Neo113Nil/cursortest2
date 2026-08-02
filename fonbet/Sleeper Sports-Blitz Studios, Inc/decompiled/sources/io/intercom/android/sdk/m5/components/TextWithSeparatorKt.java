package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextWithSeparator.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0018"}, d2 = {"TextWithSeparator", "", "firstText", "", "secondText", "modifier", "Landroidx/compose/ui/Modifier;", "separator", "style", "Landroidx/compose/ui/text/TextStyle;", "color", "Landroidx/compose/ui/graphics/Color;", ViewProps.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "TextWithSeparator-wV1YYcM", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JIILandroidx/compose/ui/text/style/TextAlign;Landroidx/compose/runtime/Composer;II)V", "TextWithSeparatorPreview", "(Landroidx/compose/runtime/Composer;I)V", "TextWithSeparatorSecondEmptyPreview", "TextWithSeparatorFirstEmptyPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextWithSeparatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparatorFirstEmptyPreview$lambda$5(int i, Composer composer, int i2) {
        TextWithSeparatorFirstEmptyPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparatorPreview$lambda$3(int i, Composer composer, int i2) {
        TextWithSeparatorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparatorSecondEmptyPreview$lambda$4(int i, Composer composer, int i2) {
        TextWithSeparatorSecondEmptyPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparator_wV1YYcM$lambda$2(String firstText, String secondText, Modifier modifier, String str, TextStyle textStyle, long j, int i, int i2, TextAlign textAlign, int i3, int i4, Composer composer, int i5) {
        Intrinsics.checkNotNullParameter(firstText, "$firstText");
        Intrinsics.checkNotNullParameter(secondText, "$secondText");
        m12128TextWithSeparatorwV1YYcM(firstText, secondText, modifier, str, textStyle, j, i, i2, textAlign, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    /* renamed from: TextWithSeparator-wV1YYcM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12128TextWithSeparatorwV1YYcM(final String firstText, final String secondText, Modifier modifier, String str, TextStyle textStyle, long j, int i, int i2, TextAlign textAlign, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        String str2;
        TextStyle textStyle2;
        int i7;
        int i8;
        long j2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final Modifier.Companion companion;
        String str3;
        TextStyle textStyle3;
        TextAlign textAlign2;
        int i14;
        TextStyle textStyle4;
        long j3;
        int i15;
        String str4;
        boolean z;
        Object rememberedValue;
        Composer composer2;
        final String str5;
        final long j4;
        final TextAlign textAlign3;
        final int i16;
        final int i17;
        final TextStyle textStyle5;
        ScopeUpdateScope endRestartGroup;
        int i18;
        Intrinsics.checkNotNullParameter(firstText, "firstText");
        Intrinsics.checkNotNullParameter(secondText, "secondText");
        Composer startRestartGroup = composer.startRestartGroup(46249171);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(firstText) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(secondText) ? 32 : 16;
        }
        int i19 = i4 & 4;
        if (i19 != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 7168) == 0) {
                str2 = str;
                i5 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                if ((i3 & 57344) == 0) {
                    if ((i4 & 16) == 0) {
                        textStyle2 = textStyle;
                        if (startRestartGroup.changed(textStyle2)) {
                            i18 = 16384;
                            i5 |= i18;
                        }
                    } else {
                        textStyle2 = textStyle;
                    }
                    i18 = 8192;
                    i5 |= i18;
                } else {
                    textStyle2 = textStyle;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i8 = 57344;
                    j2 = j;
                } else {
                    i8 = 57344;
                    j2 = j;
                    if ((458752 & i3) == 0) {
                        i5 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                    }
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i11 = i5 | (startRestartGroup.changed(i2) ? 8388608 : 4194304);
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i11 |= 100663296;
                    } else if ((i3 & 234881024) == 0) {
                        i13 = i12;
                        i11 |= startRestartGroup.changed(textAlign) ? 67108864 : 33554432;
                        if ((i11 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                                str3 = i6 != 0 ? "•" : str2;
                                if ((i4 & 16) != 0) {
                                    textStyle3 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04();
                                    i11 &= -57345;
                                } else {
                                    textStyle3 = textStyle2;
                                }
                                long m6075getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m6075getUnspecified0d7_KjU() : j2;
                                int m8705getClipgIe3tQ8 = i9 != 0 ? TextOverflow.INSTANCE.m8705getClipgIe3tQ8() : i;
                                int i20 = i10 != 0 ? Integer.MAX_VALUE : i2;
                                textAlign2 = i13 != 0 ? null : textAlign;
                                i14 = i20;
                                textStyle4 = textStyle3;
                                j3 = m6075getUnspecified0d7_KjU;
                                i15 = m8705getClipgIe3tQ8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 16) != 0) {
                                    i11 &= -57345;
                                }
                                i15 = i;
                                i14 = i2;
                                textAlign2 = textAlign;
                                companion = modifier2;
                                str3 = str2;
                                j3 = j2;
                                textStyle4 = textStyle2;
                            }
                            startRestartGroup.endDefaults();
                            if (!StringsKt.isBlank(firstText) || StringsKt.isBlank(secondText)) {
                                str4 = "";
                            } else {
                                str4 = " " + str3 + ' ';
                            }
                            String str6 = firstText + str4 + secondText;
                            startRestartGroup.startReplaceGroup(598373073);
                            z = ((i11 & 14) == 4) | ((i11 & 112) == 32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                                        TextWithSeparator_wV1YYcM$lambda$1$lambda$0 = TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (SemanticsPropertyReceiver) obj);
                                        return TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i21 = i11 >> 9;
                            composer2 = startRestartGroup;
                            TextKt.m3901TextNvy7gAk(str6, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), j3, null, 0L, null, null, null, 0L, null, textAlign2, 0L, i15, false, i14, 0, null, textStyle4, composer2, i21 & 896, (i21 & i8) | ((i11 >> 24) & 14) | ((i11 >> 12) & 896) | ((i11 << 9) & 29360128), 109560);
                            str5 = str3;
                            j4 = j3;
                            textAlign3 = textAlign2;
                            i16 = i15;
                            i17 = i14;
                            textStyle5 = textStyle4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i16 = i;
                            composer2 = startRestartGroup;
                            companion = modifier2;
                            str5 = str2;
                            j4 = j2;
                            textStyle5 = textStyle2;
                            i17 = i2;
                            textAlign3 = textAlign;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TextWithSeparator_wV1YYcM$lambda$2;
                                    TextWithSeparator_wV1YYcM$lambda$2 = TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(firstText, secondText, companion, str5, textStyle5, j4, i16, i17, textAlign3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                    return TextWithSeparator_wV1YYcM$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i13 = i12;
                    if ((i11 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i4 & 16) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    i14 = i20;
                    textStyle4 = textStyle3;
                    j3 = m6075getUnspecified0d7_KjU;
                    i15 = m8705getClipgIe3tQ8;
                    startRestartGroup.endDefaults();
                    if (StringsKt.isBlank(firstText)) {
                    }
                    str4 = "";
                    String str62 = firstText + str4 + secondText;
                    startRestartGroup.startReplaceGroup(598373073);
                    z = ((i11 & 14) == 4) | ((i11 & 112) == 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                            TextWithSeparator_wV1YYcM$lambda$1$lambda$0 = TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (SemanticsPropertyReceiver) obj);
                            return TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    int i212 = i11 >> 9;
                    composer2 = startRestartGroup;
                    TextKt.m3901TextNvy7gAk(str62, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), j3, null, 0L, null, null, null, 0L, null, textAlign2, 0L, i15, false, i14, 0, null, textStyle4, composer2, i212 & 896, (i212 & i8) | ((i11 >> 24) & 14) | ((i11 >> 12) & 896) | ((i11 << 9) & 29360128), 109560);
                    str5 = str3;
                    j4 = j3;
                    textAlign3 = textAlign2;
                    i16 = i15;
                    i17 = i14;
                    textStyle5 = textStyle4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i11 = i5;
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i11 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i4 & 16) != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i13 != 0) {
                }
                i14 = i20;
                textStyle4 = textStyle3;
                j3 = m6075getUnspecified0d7_KjU;
                i15 = m8705getClipgIe3tQ8;
                startRestartGroup.endDefaults();
                if (StringsKt.isBlank(firstText)) {
                }
                str4 = "";
                String str622 = firstText + str4 + secondText;
                startRestartGroup.startReplaceGroup(598373073);
                z = ((i11 & 14) == 4) | ((i11 & 112) == 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                        TextWithSeparator_wV1YYcM$lambda$1$lambda$0 = TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (SemanticsPropertyReceiver) obj);
                        return TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                int i2122 = i11 >> 9;
                composer2 = startRestartGroup;
                TextKt.m3901TextNvy7gAk(str622, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), j3, null, 0L, null, null, null, 0L, null, textAlign2, 0L, i15, false, i14, 0, null, textStyle4, composer2, i2122 & 896, (i2122 & i8) | ((i11 >> 24) & 14) | ((i11 >> 12) & 896) | ((i11 << 9) & 29360128), 109560);
                str5 = str3;
                j4 = j3;
                textAlign3 = textAlign2;
                i16 = i15;
                i17 = i14;
                textStyle5 = textStyle4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str2 = str;
            if ((i3 & 57344) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i5;
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i11 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i4 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i13 != 0) {
            }
            i14 = i20;
            textStyle4 = textStyle3;
            j3 = m6075getUnspecified0d7_KjU;
            i15 = m8705getClipgIe3tQ8;
            startRestartGroup.endDefaults();
            if (StringsKt.isBlank(firstText)) {
            }
            str4 = "";
            String str6222 = firstText + str4 + secondText;
            startRestartGroup.startReplaceGroup(598373073);
            z = ((i11 & 14) == 4) | ((i11 & 112) == 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                    TextWithSeparator_wV1YYcM$lambda$1$lambda$0 = TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (SemanticsPropertyReceiver) obj);
                    return TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            int i21222 = i11 >> 9;
            composer2 = startRestartGroup;
            TextKt.m3901TextNvy7gAk(str6222, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), j3, null, 0L, null, null, null, 0L, null, textAlign2, 0L, i15, false, i14, 0, null, textStyle4, composer2, i21222 & 896, (i21222 & i8) | ((i11 >> 24) & 14) | ((i11 >> 12) & 896) | ((i11 << 9) & 29360128), 109560);
            str5 = str3;
            j4 = j3;
            textAlign3 = textAlign2;
            i16 = i15;
            i17 = i14;
            textStyle5 = textStyle4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i3 & 57344) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i5;
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i11 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i13 != 0) {
        }
        i14 = i20;
        textStyle4 = textStyle3;
        j3 = m6075getUnspecified0d7_KjU;
        i15 = m8705getClipgIe3tQ8;
        startRestartGroup.endDefaults();
        if (StringsKt.isBlank(firstText)) {
        }
        str4 = "";
        String str62222 = firstText + str4 + secondText;
        startRestartGroup.startReplaceGroup(598373073);
        z = ((i11 & 14) == 4) | ((i11 & 112) == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
                TextWithSeparator_wV1YYcM$lambda$1$lambda$0 = TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(firstText, secondText, (SemanticsPropertyReceiver) obj);
                return TextWithSeparator_wV1YYcM$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i212222 = i11 >> 9;
        composer2 = startRestartGroup;
        TextKt.m3901TextNvy7gAk(str62222, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), j3, null, 0L, null, null, null, 0L, null, textAlign2, 0L, i15, false, i14, 0, null, textStyle4, composer2, i212222 & 896, (i212222 & i8) | ((i11 >> 24) & 14) | ((i11 >> 12) & 896) | ((i11 << 9) & 29360128), 109560);
        str5 = str3;
        j4 = j3;
        textAlign3 = textAlign2;
        i16 = i15;
        i17 = i14;
        textStyle5 = textStyle4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0(String firstText, String secondText, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(firstText, "$firstText");
        Intrinsics.checkNotNullParameter(secondText, "$secondText");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, firstText + ' ' + secondText);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void TextWithSeparatorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1364601736);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m12089getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextWithSeparatorPreview$lambda$3;
                    TextWithSeparatorPreview$lambda$3 = TextWithSeparatorKt.TextWithSeparatorPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextWithSeparatorPreview$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void TextWithSeparatorSecondEmptyPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1899699287);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m12090getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextWithSeparatorSecondEmptyPreview$lambda$4;
                    TextWithSeparatorSecondEmptyPreview$lambda$4 = TextWithSeparatorKt.TextWithSeparatorSecondEmptyPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextWithSeparatorSecondEmptyPreview$lambda$4;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void TextWithSeparatorFirstEmptyPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1116705163);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m12091getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TextWithSeparatorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextWithSeparatorFirstEmptyPreview$lambda$5;
                    TextWithSeparatorFirstEmptyPreview$lambda$5 = TextWithSeparatorKt.TextWithSeparatorFirstEmptyPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextWithSeparatorFirstEmptyPreview$lambda$5;
                }
            });
        }
    }
}
