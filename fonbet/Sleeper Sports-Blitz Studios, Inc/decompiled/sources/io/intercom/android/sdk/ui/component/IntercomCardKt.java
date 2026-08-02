package io.intercom.android.sdk.ui.component;

import android.os.Build;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomCard.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aa\u0010\u0000\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"IntercomCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", ViewProps.ON_CLICK, "Lkotlin/Function0;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomCard$lambda$0(Modifier modifier, IntercomCardStyle.Style style, Function3 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(content, "$content");
        IntercomCard(modifier, style, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomCard$lambda$2(Function0 onClick, Modifier modifier, boolean z, IntercomCardStyle.Style style, MutableInteractionSource mutableInteractionSource, Function3 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(content, "$content");
        IntercomCard(onClick, modifier, z, style, mutableInteractionSource, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void IntercomCard(Modifier modifier, IntercomCardStyle.Style style, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        IntercomCardStyle.Style style2;
        Composer composer2;
        Modifier modifier3;
        IntercomCardStyle.Style style3;
        Composer composer3;
        final Modifier modifier4;
        final IntercomCardStyle.Style style4;
        int i4;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1083788517);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                style2 = style;
                if (startRestartGroup.changed(style2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                style2 = style;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            style2 = style;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composer2 = startRestartGroup;
                    i3 &= -113;
                    modifier3 = companion;
                    style3 = IntercomCardStyle.INSTANCE.m12918defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, startRestartGroup, 1572864, 63);
                } else {
                    composer2 = startRestartGroup;
                    modifier3 = companion;
                    style3 = style2;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier3 = modifier2;
                style3 = style2;
                composer2 = startRestartGroup;
            }
            composer2.endDefaults();
            float m12927getElevationD9Ej5fM = Build.VERSION.SDK_INT >= 28 ? style3.m12927getElevationD9Ej5fM() : Dp.m8798constructorimpl(2);
            Shape shape = style3.getShape();
            Color m12928getShadowColorQN2ZGVo = style3.m12928getShadowColorQN2ZGVo();
            Composer composer4 = composer2;
            composer3 = composer4;
            CardKt.Card(ShadowKt.m5618shadows4CzXII$default(modifier3, m12927getElevationD9Ej5fM, shape, false, 0L, m12928getShadowColorQN2ZGVo != null ? m12928getShadowColorQN2ZGVo.m6049unboximpl() : Color.INSTANCE.m6065getBlack0d7_KjU(), 12, null), style3.getShape(), CardDefaults.INSTANCE.m2729cardColorsro_MJ88(style3.m12925getBackgroundColor0d7_KjU(), style3.m12926getContentColor0d7_KjU(), 0L, 0L, composer4, CardDefaults.$stable << 12, 12), CardDefaults.INSTANCE.m2730cardElevationaqJV_2Y(Dp.m8798constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, (CardDefaults.$stable << 18) | 6, 62), style3.getBorder(), content, composer3, 458752 & (i3 << 9), 0);
            modifier4 = modifier3;
            style4 = style3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            style4 = style2;
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomCard$lambda$0;
                    IntercomCard$lambda$0 = IntercomCardKt.IntercomCard$lambda$0(Modifier.this, style4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomCard$lambda$0;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IntercomCard(final Function0<Unit> onClick, Modifier modifier, boolean z, IntercomCardStyle.Style style, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IntercomCardStyle.Style style2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        IntercomCardStyle.Style style3;
        int i7;
        Modifier modifier3;
        boolean z3;
        IntercomCardStyle.Style style4;
        MutableInteractionSource mutableInteractionSource3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource4;
        final IntercomCardStyle.Style style5;
        final Modifier modifier4;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(254499300);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        style2 = style;
                        if (startRestartGroup.changed(style2)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        style2 = style;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    style2 = style;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i2 & 32) != 0) {
                        if ((458752 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                        }
                        if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i4 != 0 ? true : z2;
                                if ((i2 & 8) != 0) {
                                    style3 = IntercomCardStyle.INSTANCE.m12918defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, startRestartGroup, 1572864, 63);
                                    i3 &= -7169;
                                } else {
                                    style3 = style2;
                                }
                                if (i5 != 0) {
                                    startRestartGroup.startReplaceGroup(-2091443309);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    boolean z6 = z5;
                                    i7 = i3;
                                    modifier3 = companion;
                                    z3 = z6;
                                    style4 = style3;
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                    startRestartGroup.endDefaults();
                                    Shape shape = style4.getShape();
                                    CardColors m2729cardColorsro_MJ88 = CardDefaults.INSTANCE.m2729cardColorsro_MJ88(style4.m12925getBackgroundColor0d7_KjU(), style4.m12926getContentColor0d7_KjU(), 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 12);
                                    CardElevation m2730cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2730cardElevationaqJV_2Y(style4.m12927getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, CardDefaults.$stable << 18, 62);
                                    BorderStroke border = style4.getBorder();
                                    int i10 = i7 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED;
                                    int i11 = i7 << 9;
                                    CardKt.Card(onClick, modifier3, z3, shape, m2729cardColorsro_MJ88, m2730cardElevationaqJV_2Y, border, mutableInteractionSource3, content, startRestartGroup, (i11 & 234881024) | i10 | (29360128 & i11), 0);
                                    z4 = z3;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    style5 = style4;
                                    modifier4 = modifier3;
                                } else {
                                    boolean z7 = z5;
                                    i7 = i3;
                                    modifier3 = companion;
                                    z3 = z7;
                                    style4 = style3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                Modifier modifier5 = modifier2;
                                i7 = i3;
                                modifier3 = modifier5;
                                z3 = z2;
                                style4 = style2;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            startRestartGroup.endDefaults();
                            Shape shape2 = style4.getShape();
                            CardColors m2729cardColorsro_MJ882 = CardDefaults.INSTANCE.m2729cardColorsro_MJ88(style4.m12925getBackgroundColor0d7_KjU(), style4.m12926getContentColor0d7_KjU(), 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 12);
                            CardElevation m2730cardElevationaqJV_2Y2 = CardDefaults.INSTANCE.m2730cardElevationaqJV_2Y(style4.m12927getElevationD9Ej5fM(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, CardDefaults.$stable << 18, 62);
                            BorderStroke border2 = style4.getBorder();
                            int i102 = i7 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED;
                            int i112 = i7 << 9;
                            CardKt.Card(onClick, modifier3, z3, shape2, m2729cardColorsro_MJ882, m2730cardElevationaqJV_2Y2, border2, mutableInteractionSource3, content, startRestartGroup, (i112 & 234881024) | i102 | (29360128 & i112), 0);
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            style5 = style4;
                            modifier4 = modifier3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            z4 = z2;
                            style5 = style2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomCardKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit IntercomCard$lambda$2;
                                    IntercomCard$lambda$2 = IntercomCardKt.IntercomCard$lambda$2(Function0.this, modifier4, z4, style5, mutableInteractionSource4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return IntercomCard$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i6;
                    if ((374491 & i3) == 74898) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) != 0) {
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i5 != 0) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) != 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i5 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) != 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i5 != 0) {
        }
    }
}
