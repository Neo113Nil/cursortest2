package androidx.compose.material;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJñ\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$Jñ\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes8.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    @ExperimentalMaterialApi
    public final void TrailingIcon(final boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        Composer startRestartGroup = composer.startRestartGroup(876077373);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrailingIcon)294@11256L394:ExposedDropdownMenu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            function02 = i4 != 0 ? new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0;
            IconButtonKt.IconButton(function02, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver clearAndSetSemantics) {
                    Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, 726122713, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C295@11350L290:ExposedDropdownMenu.kt#jmzs0o");
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        IconKt.m1422Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.INSTANCE, z ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }), startRestartGroup, ((i3 >> 3) & 14) | 24576, 12);
        } else {
            startRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                ExposedDropdownMenuDefaults.this.TrailingIcon(z, function02, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1395textFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        composer.startReplaceableGroup(1208167904);
        ComposerKt.sourceInformation(composer, "C(textFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)353@14329L7,353@14360L7,354@14433L8,356@14503L6,357@14614L6,358@14678L6,360@14757L6,360@14798L4,362@14872L6,365@15072L8,366@15134L6,368@15208L6,369@15355L8,372@15484L6,374@15614L6,374@15655L4,375@15749L8,376@15814L6,378@15889L6,378@15930L4,379@15988L6,379@16023L6,380@16106L8,381@16164L6,382@16226L6,382@16261L6,383@16347L8:ExposedDropdownMenu.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m2122unboximpl = ((Color) consume).m2122unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j23 = Color.m2111copywmQWz5c$default(m2122unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j;
        }
        long m2111copywmQWz5c$default = (i4 & 2) != 0 ? Color.m2111copywmQWz5c$default(j23, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2111copywmQWz5c$default2 = (i4 & 4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1324getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU() : j4;
        long m1318getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j5;
        long m2111copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m2111copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j32 = m2111copywmQWz5c$default4;
            j24 = j32;
            j25 = Color.m2111copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = m2111copywmQWz5c$default4;
            j25 = j8;
        }
        long m1318getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j9;
        long m2111copywmQWz5c$default5 = (i4 & 512) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j33 = m2111copywmQWz5c$default5;
            j27 = Color.m2111copywmQWz5c$default(j33, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j33;
        } else {
            j26 = m2111copywmQWz5c$default5;
            j27 = j11;
        }
        long j34 = (i4 & 2048) != 0 ? j26 : j12;
        long m2111copywmQWz5c$default6 = (i4 & 4096) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m2111copywmQWz5c$default7 = (i4 & 8192) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i4 & 16384) != 0) {
            long j35 = m2111copywmQWz5c$default6;
            j29 = Color.m2111copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j28 = j35;
        } else {
            j28 = m2111copywmQWz5c$default6;
            j29 = j15;
        }
        long m1318getError0d7_KjU3 = (32768 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j16;
        long m2111copywmQWz5c$default8 = (65536 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m2111copywmQWz5c$default9 = (131072 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if ((262144 & i4) != 0) {
            long j36 = m2111copywmQWz5c$default9;
            j31 = Color.m2111copywmQWz5c$default(j36, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j30 = j36;
        } else {
            j30 = m2111copywmQWz5c$default9;
            j31 = j19;
        }
        long m1318getError0d7_KjU4 = (524288 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j20;
        long m2111copywmQWz5c$default10 = (1048576 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(j23, m2111copywmQWz5c$default, m1324getPrimary0d7_KjU, m1318getError0d7_KjU, m2111copywmQWz5c$default3, j24, m1318getError0d7_KjU2, j25, j26, j27, j34, j28, m2111copywmQWz5c$default7, j29, m1318getError0d7_KjU3, m2111copywmQWz5c$default2, m2111copywmQWz5c$default8, j30, j31, m1318getError0d7_KjU4, m2111copywmQWz5c$default10, (i4 & 2097152) != 0 ? Color.m2111copywmQWz5c$default(m2111copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    /* renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1394outlinedTextFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        composer.startReplaceableGroup(1162641182);
        ComposerKt.sourceInformation(composer, "C(outlinedTextFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)456@20314L7,456@20345L7,457@20418L8,459@20524L6,460@20588L6,462@20664L6,462@20705L4,464@20776L6,464@20819L8,465@20914L8,466@20973L6,468@21047L6,469@21194L8,472@21323L6,474@21453L6,474@21494L4,475@21588L8,476@21653L6,478@21728L6,478@21769L4,479@21827L6,479@21862L6,480@21945L8,481@22003L6,482@22065L6,482@22100L6,483@22186L8:ExposedDropdownMenu.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m2122unboximpl = ((Color) consume).m2122unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j23 = Color.m2111copywmQWz5c$default(m2122unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j;
        }
        long m2111copywmQWz5c$default = (i4 & 2) != 0 ? Color.m2111copywmQWz5c$default(j23, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2147getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m2147getTransparent0d7_KjU() : j3;
        long m1324getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU() : j4;
        long m1318getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j5;
        long m2111copywmQWz5c$default2 = (i4 & 32) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m2111copywmQWz5c$default3 = (i4 & 64) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j32 = m2111copywmQWz5c$default3;
            j24 = j32;
            j25 = Color.m2111copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = m2111copywmQWz5c$default3;
            j25 = j8;
        }
        long m1318getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j9;
        long m2111copywmQWz5c$default4 = (i4 & 512) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j33 = m2111copywmQWz5c$default4;
            j27 = Color.m2111copywmQWz5c$default(j33, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j33;
        } else {
            j26 = m2111copywmQWz5c$default4;
            j27 = j11;
        }
        long j34 = (i4 & 2048) != 0 ? j26 : j12;
        long m2111copywmQWz5c$default5 = (i4 & 4096) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m2111copywmQWz5c$default6 = (i4 & 8192) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i4 & 16384) != 0) {
            long j35 = m2111copywmQWz5c$default5;
            j29 = Color.m2111copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j28 = j35;
        } else {
            j28 = m2111copywmQWz5c$default5;
            j29 = j15;
        }
        long m1318getError0d7_KjU3 = (32768 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j16;
        long m2111copywmQWz5c$default7 = (65536 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m2111copywmQWz5c$default8 = (131072 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if ((262144 & i4) != 0) {
            long j36 = m2111copywmQWz5c$default8;
            j31 = Color.m2111copywmQWz5c$default(j36, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j30 = j36;
        } else {
            j30 = m2111copywmQWz5c$default8;
            j31 = j19;
        }
        long m1318getError0d7_KjU4 = (524288 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j20;
        long m2111copywmQWz5c$default9 = (1048576 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(j23, m2111copywmQWz5c$default, m1324getPrimary0d7_KjU, m1318getError0d7_KjU, m2111copywmQWz5c$default2, j24, m1318getError0d7_KjU2, j25, j26, j27, j34, j28, m2111copywmQWz5c$default6, j29, m1318getError0d7_KjU3, m2147getTransparent0d7_KjU, m2111copywmQWz5c$default7, j30, j31, m1318getError0d7_KjU4, m2111copywmQWz5c$default9, (i4 & 2097152) != 0 ? Color.m2111copywmQWz5c$default(m2111copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
