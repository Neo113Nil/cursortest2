package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Marker;

/* compiled from: TextAttributeCollector.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0002\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0016H\u0002\u001a\u0011\u0010\u001a\u001a\u00020\u001b*\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001c\u001a\f\u0010\u001d\u001a\u00020\u0007*\u00020\u0005H\u0002\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010\"\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010#\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010$\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f¨\u0006%²\u0006\n\u0010&\u001a\u00020\nX\u008a\u008e\u0002²\u0006\u0012\u0010'\u001a\n (*\u0004\u0018\u00010\n0\nX\u008a\u008e\u0002"}, d2 = {"TextAttributeCollector", "", "modifier", "Landroidx/compose/ui/Modifier;", "attributeData", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "loading", "", "onValidationError", "Lkotlin/Function1;", "", "onSubmitAttribute", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/conversation/states/AttributeData;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TextAttributeTrailingComponent", "disabled", MetricTracker.Action.SUBMITTED, "shape", "Landroidx/compose/foundation/shape/CornerBasedShape;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(ZZZLandroidx/compose/foundation/shape/CornerBasedShape;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getCountryAreaCodeFromText", "Lio/intercom/android/sdk/models/CountryAreaCode;", "text", "getHint", "countryAreaCode", "getKeyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "(Lio/intercom/android/sdk/m5/conversation/states/AttributeData;)I", "isPhoneType", "FilledTextAttributePreview", "(Landroidx/compose/runtime/Composer;I)V", "EmptyTextAttributePreview", "SubmittedTextAttributePreview", "DisabledTextAttributePreview", "SubmittedAndDisabledTextAttributePreview", "PhoneAttributePreview", "intercom-sdk-base_release", "value", "countryFlag", "kotlin.jvm.PlatformType"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextAttributeCollectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledTextAttributePreview$lambda$15(int i, Composer composer, int i2) {
        DisabledTextAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyTextAttributePreview$lambda$13(int i, Composer composer, int i2) {
        EmptyTextAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTextAttributePreview$lambda$12(int i, Composer composer, int i2) {
        FilledTextAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneAttributePreview$lambda$17(int i, Composer composer, int i2) {
        PhoneAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedAndDisabledTextAttributePreview$lambda$16(int i, Composer composer, int i2) {
        SubmittedAndDisabledTextAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedTextAttributePreview$lambda$14(int i, Composer composer, int i2) {
        SubmittedTextAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$9(Modifier modifier, AttributeData attributeData, boolean z, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        TextAttributeCollector(modifier, attributeData, z, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeTrailingComponent$lambda$11(boolean z, boolean z2, boolean z3, CornerBasedShape shape, Function0 onClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(shape, "$shape");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        TextAttributeTrailingComponent(z, z2, z3, shape, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$1(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void TextAttributeCollector(Modifier modifier, final AttributeData attributeData, boolean z, Function1<? super String, Unit> function1, Function1<? super AttributeData, Unit> function12, Composer composer, final int i, final int i2) {
        final CountryAreaCode countryAreaCode;
        Modifier m1195height3ABfNKs;
        Function1<? super String, Unit> function13;
        int i3;
        boolean z2;
        ComposableLambda composableLambda;
        Intrinsics.checkNotNullParameter(attributeData, "attributeData");
        Composer startRestartGroup = composer.startRestartGroup(-1938202913);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        boolean z3 = (i2 & 4) != 0 ? false : z;
        Function1<? super String, Unit> function14 = (i2 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TextAttributeCollector$lambda$0;
                TextAttributeCollector$lambda$0 = TextAttributeCollectorKt.TextAttributeCollector$lambda$0((String) obj);
                return TextAttributeCollector$lambda$0;
            }
        } : function1;
        Function1<? super AttributeData, Unit> function15 = (i2 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TextAttributeCollector$lambda$1;
                TextAttributeCollector$lambda$1 = TextAttributeCollectorKt.TextAttributeCollector$lambda$1((AttributeData) obj);
                return TextAttributeCollector$lambda$1;
            }
        } : function12;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        Resources resources = context.getResources();
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        CornerBasedShape small = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
        if (isPhoneType(attributeData)) {
            PhoneNumberValidator.loadCountryAreaCodes(context);
            countryAreaCode = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
        } else {
            countryAreaCode = CountryAreaCode.UNKNOWN;
        }
        boolean isFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        boolean areEqual = Intrinsics.areEqual((Object) attributeData.getAttribute().getMultiline(), (Object) true);
        final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState TextAttributeCollector$lambda$2;
                TextAttributeCollector$lambda$2 = TextAttributeCollectorKt.TextAttributeCollector$lambda$2(AttributeData.this);
                return TextAttributeCollector$lambda$2;
            }
        }, startRestartGroup, 8);
        final MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState TextAttributeCollector$lambda$5;
                TextAttributeCollector$lambda$5 = TextAttributeCollectorKt.TextAttributeCollector$lambda$5(AttributeData.this, countryAreaCode);
                return TextAttributeCollector$lambda$5;
            }
        }, startRestartGroup, 8);
        if (areEqual) {
            m1195height3ABfNKs = IntrinsicKt.height(modifier2, IntrinsicSize.Max);
        } else {
            m1195height3ABfNKs = SizeKt.m1195height3ABfNKs(modifier2, Dp.m8798constructorimpl(40));
        }
        String TextAttributeCollector$lambda$3 = TextAttributeCollector$lambda$3(mutableState);
        boolean z4 = !isFormDisabled;
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, getKeyboardType(attributeData), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
        boolean z5 = !areEqual;
        int i4 = areEqual ? 2 : 1;
        final boolean z6 = z3;
        startRestartGroup.startReplaceGroup(1971829893);
        final Modifier modifier3 = modifier2;
        if (isPhoneType(attributeData)) {
            function13 = function14;
            i3 = i4;
            z2 = true;
            composableLambda = ComposableLambdaKt.rememberComposableLambda(1052011697, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$TextAttributeCollector$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    String TextAttributeCollector$lambda$6;
                    if ((i5 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    TextAttributeCollector$lambda$6 = TextAttributeCollectorKt.TextAttributeCollector$lambda$6(mutableState2);
                    Intrinsics.checkNotNullExpressionValue(TextAttributeCollector$lambda$6, "access$TextAttributeCollector$lambda$6(...)");
                    TextKt.m3901TextNvy7gAk(TextAttributeCollector$lambda$6, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                }
            }, startRestartGroup, 54);
        } else {
            function13 = function14;
            i3 = i4;
            z2 = true;
            composableLambda = null;
        }
        startRestartGroup.endReplaceGroup();
        final Function1<? super String, Unit> function16 = function13;
        final Function1<? super AttributeData, Unit> function17 = function15;
        IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(TextAttributeCollector$lambda$3, new Function1() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TextAttributeCollector$lambda$8;
                TextAttributeCollector$lambda$8 = TextAttributeCollectorKt.TextAttributeCollector$lambda$8(AttributeData.this, mutableState, mutableState2, (String) obj);
                return TextAttributeCollector$lambda$8;
            }
        }, m1195height3ABfNKs, z4, submitted, null, null, ComposableLambdaKt.rememberComposableLambda(-1290485581, z2, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$TextAttributeCollector$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                String hint;
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    AttributeData attributeData2 = AttributeData.this;
                    CountryAreaCode countryAreaCode2 = countryAreaCode;
                    Intrinsics.checkNotNull(countryAreaCode2);
                    hint = TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode2);
                    TextKt.m3901TextNvy7gAk(hint, null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13107getHintText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262138);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), composableLambda, ComposableLambdaKt.rememberComposableLambda(930248561, z2, new TextAttributeCollectorKt$TextAttributeCollector$6(isFormDisabled, submitted, z6, small, function16, resources, attributeData, function15, mutableState), startRestartGroup, 54), false, null, keyboardOptions, null, z5, 3, i3, null, small, null, null, startRestartGroup, 817889280, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 1715296);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextAttributeCollector$lambda$9;
                    TextAttributeCollector$lambda$9 = TextAttributeCollectorKt.TextAttributeCollector$lambda$9(Modifier.this, attributeData, z6, function16, function17, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TextAttributeCollector$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TextAttributeCollector$lambda$2(AttributeData attributeData) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TextAttributeCollector$lambda$5(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(isPhoneType(attributeData) ? countryAreaCode.getEmoji() : "", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCollector$lambda$8(AttributeData attributeData, MutableState value$delegate, MutableState countryFlag$delegate, String it) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
        Intrinsics.checkNotNullParameter(countryFlag$delegate, "$countryFlag$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        value$delegate.setValue(it);
        if (isPhoneType(attributeData)) {
            countryFlag$delegate.setValue(getCountryAreaCodeFromText(it).getEmoji());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextAttributeTrailingComponent(final boolean z, final boolean z2, final boolean z3, final CornerBasedShape cornerBasedShape, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        long m13089getAction0d7_KjU;
        long m13110getOnAction0d7_KjU;
        Composer startRestartGroup = composer.startRestartGroup(1872215775);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(cornerBasedShape) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 46811) != 9362 || !startRestartGroup.getSkipping()) {
            if (z2) {
                startRestartGroup.startReplaceGroup(803987533);
                startRestartGroup.endReplaceGroup();
                m13089getAction0d7_KjU = Color.INSTANCE.m6074getTransparent0d7_KjU();
            } else if (z) {
                startRestartGroup.startReplaceGroup(803989226);
                m13089getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13102getDisabled0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(803990696);
                m13089getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU();
                startRestartGroup.endReplaceGroup();
            }
            float f = 0;
            Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(SizeKt.m1214width3ABfNKs(SizeKt.fillMaxHeight$default(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m1514CornerSize0680j_4(Dp.m8798constructorimpl(f)), null, null, CornerSizeKt.m1514CornerSize0680j_4(Dp.m8798constructorimpl(f)), 6, null)), m13089getAction0d7_KjU, null, 2, null), 0.0f, 1, null), Dp.m8798constructorimpl(40)), (z2 || z3 || z) ? false : true, null, null, null, function0, 14, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m623clickableoSLSa3U$default);
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
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z2) {
                startRestartGroup.startReplaceGroup(1118235440);
                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, startRestartGroup, 0), (String) null, (Modifier) null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13091getActive0d7_KjU(), startRestartGroup, 56, 4);
                startRestartGroup.endReplaceGroup();
            } else if (z3) {
                startRestartGroup.startReplaceGroup(305789581);
                ProgressIndicatorKt.m3476CircularProgressIndicator4lLiAd8(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(20)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13110getOnAction0d7_KjU(), Dp.m8798constructorimpl(3), 0L, 0, 0.0f, startRestartGroup, 390, 56);
                startRestartGroup = startRestartGroup;
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1118249365);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.intercom_chevron, startRestartGroup, 0);
                if (z) {
                    startRestartGroup.startReplaceGroup(1118255019);
                    m13110getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13112getOnDisabled0d7_KjU();
                } else {
                    startRestartGroup.startReplaceGroup(1118256201);
                    m13110getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13110getOnAction0d7_KjU();
                }
                startRestartGroup.endReplaceGroup();
                IconKt.m3194Iconww6aTOc(painterResource, (String) null, (Modifier) null, m13110getOnAction0d7_KjU, startRestartGroup, 56, 4);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextAttributeTrailingComponent$lambda$11;
                    TextAttributeTrailingComponent$lambda$11 = TextAttributeCollectorKt.TextAttributeTrailingComponent$lambda$11(z, z2, z3, cornerBasedShape, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextAttributeTrailingComponent$lambda$11;
                }
            });
        }
    }

    private static final CountryAreaCode getCountryAreaCodeFromText(String str) {
        CountryAreaCode countryAreaCodeFromNumber = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(PhoneNumberValidator.normalizeNumber(str)));
        Intrinsics.checkNotNullExpressionValue(countryAreaCodeFromNumber, "getCountryAreaCodeFromNumber(...)");
        return countryAreaCodeFromNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHint(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        String str;
        String renderType = attributeData.getAttribute().getRenderType();
        if (Intrinsics.areEqual(renderType, "email")) {
            return "email@domain.com";
        }
        if (Intrinsics.areEqual(renderType, "phone")) {
            if (Intrinsics.areEqual(countryAreaCode, CountryAreaCode.UNKNOWN)) {
                str = "+1";
            } else {
                str = Marker.ANY_NON_NULL_MARKER + countryAreaCode.getDialCode();
            }
            return str + " 123 456 7890";
        }
        return "";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private static final int getKeyboardType(AttributeData attributeData) {
        String renderType = attributeData.getAttribute().getRenderType();
        switch (renderType.hashCode()) {
            case -1034364087:
                if (renderType.equals("number")) {
                    return KeyboardType.INSTANCE.m8471getNumberPjHm6EE();
                }
                break;
            case 96619420:
                if (renderType.equals("email")) {
                    return KeyboardType.INSTANCE.m8470getEmailPjHm6EE();
                }
                break;
            case 97526364:
                if (renderType.equals("float")) {
                    return KeyboardType.INSTANCE.m8469getDecimalPjHm6EE();
                }
                break;
            case 106642798:
                if (renderType.equals("phone")) {
                    return KeyboardType.INSTANCE.m8474getPhonePjHm6EE();
                }
                break;
        }
        return KeyboardType.INSTANCE.m8475getTextPjHm6EE();
    }

    private static final boolean isPhoneType(AttributeData attributeData) {
        return Intrinsics.areEqual(attributeData.getAttribute().getRenderType(), "phone");
    }

    @IntercomPreviews
    public static final void FilledTextAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1421911931);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m13224getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FilledTextAttributePreview$lambda$12;
                    FilledTextAttributePreview$lambda$12 = TextAttributeCollectorKt.FilledTextAttributePreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FilledTextAttributePreview$lambda$12;
                }
            });
        }
    }

    public static final void EmptyTextAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(990171980);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m13226getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyTextAttributePreview$lambda$13;
                    EmptyTextAttributePreview$lambda$13 = TextAttributeCollectorKt.EmptyTextAttributePreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyTextAttributePreview$lambda$13;
                }
            });
        }
    }

    public static final void SubmittedTextAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(914016734);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m13228getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubmittedTextAttributePreview$lambda$14;
                    SubmittedTextAttributePreview$lambda$14 = TextAttributeCollectorKt.SubmittedTextAttributePreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubmittedTextAttributePreview$lambda$14;
                }
            });
        }
    }

    public static final void DisabledTextAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1615951967);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m13230getLambda8$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisabledTextAttributePreview$lambda$15;
                    DisabledTextAttributePreview$lambda$15 = TextAttributeCollectorKt.DisabledTextAttributePreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DisabledTextAttributePreview$lambda$15;
                }
            });
        }
    }

    public static final void SubmittedAndDisabledTextAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1140989915);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m13221getLambda10$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubmittedAndDisabledTextAttributePreview$lambda$16;
                    SubmittedAndDisabledTextAttributePreview$lambda$16 = TextAttributeCollectorKt.SubmittedAndDisabledTextAttributePreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubmittedAndDisabledTextAttributePreview$lambda$16;
                }
            });
        }
    }

    public static final void PhoneAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2075517560);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m13223getLambda12$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PhoneAttributePreview$lambda$17;
                    PhoneAttributePreview$lambda$17 = TextAttributeCollectorKt.PhoneAttributePreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PhoneAttributePreview$lambda$17;
                }
            });
        }
    }
}
