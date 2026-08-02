package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: HelpCenterSearchTopBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ Function1<String, Unit> $onSearchAction;
    final /* synthetic */ MutableState<String> $searchText$delegate;
    final /* synthetic */ MutableStateFlow<String> $textFlow;

    /* JADX WARN: Multi-variable type inference failed */
    HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4(FocusRequester focusRequester, MutableState<String> mutableState, Function1<? super String, Unit> function1, FocusManager focusManager, MutableStateFlow<String> mutableStateFlow) {
        this.$focusRequester = focusRequester;
        this.$searchText$delegate = mutableState;
        this.$onSearchAction = function1;
        this.$focusManager = focusManager;
        this.$textFlow = mutableStateFlow;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String HelpCenterSearchTopBar$lambda$2;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            HelpCenterSearchTopBar$lambda$2 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate);
            Modifier focusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(56)), this.$focusRequester);
            TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m8475getTextPjHm6EE(), ImeAction.INSTANCE.m8420getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            final Function1<String, Unit> function1 = this.$onSearchAction;
            final FocusManager focusManager = this.$focusManager;
            final MutableState<String> mutableState = this.$searchText$delegate;
            KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4.invoke$lambda$0(Function1.this, focusManager, mutableState, (KeyboardActionScope) obj);
                    return invoke$lambda$0;
                }
            }, null, 47, null);
            TextFieldColors m3872colors0hiis_0 = TextFieldDefaults.INSTANCE.m3872colors0hiis_0(IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, Color.INSTANCE.m6074getTransparent0d7_KjU(), Color.INSTANCE.m6074getTransparent0d7_KjU(), Color.INSTANCE.m6074getTransparent0d7_KjU(), 0L, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, null, Color.INSTANCE.m6074getTransparent0d7_KjU(), Color.INSTANCE.m6074getTransparent0d7_KjU(), Color.INSTANCE.m6074getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 1794048, 3504, 0, 0, 3072, 2147468936, 4095);
            final MutableStateFlow<String> mutableStateFlow = this.$textFlow;
            final MutableState<String> mutableState2 = this.$searchText$delegate;
            TextFieldKt.TextField(HelpCenterSearchTopBar$lambda$2, (Function1<? super String, Unit>) new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4.invoke$lambda$1(MutableStateFlow.this, mutableState2, (String) obj);
                    return invoke$lambda$1;
                }
            }, focusRequester, false, false, type04, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m12014getLambda1$intercom_sdk_base_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1908343233, true, new AnonymousClass3(this.$searchText$delegate, this.$textFlow), composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, keyboardActions, true, 0, 0, (MutableInteractionSource) null, (Shape) null, m3872colors0hiis_0, composer, 817889280, 12779520, 0, 3964248);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(MutableStateFlow textFlow, MutableState searchText$delegate, String newText) {
        Intrinsics.checkNotNullParameter(textFlow, "$textFlow");
        Intrinsics.checkNotNullParameter(searchText$delegate, "$searchText$delegate");
        Intrinsics.checkNotNullParameter(newText, "newText");
        searchText$delegate.setValue(newText);
        textFlow.setValue(newText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 onSearchAction, FocusManager focusManager, MutableState searchText$delegate, KeyboardActionScope KeyboardActions) {
        String HelpCenterSearchTopBar$lambda$2;
        String HelpCenterSearchTopBar$lambda$22;
        Intrinsics.checkNotNullParameter(onSearchAction, "$onSearchAction");
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(searchText$delegate, "$searchText$delegate");
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        HelpCenterSearchTopBar$lambda$2 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(searchText$delegate);
        if (HelpCenterSearchTopBar$lambda$2.length() > 0) {
            HelpCenterSearchTopBar$lambda$22 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(searchText$delegate);
            onSearchAction.invoke(HelpCenterSearchTopBar$lambda$22);
            FocusManager.clearFocus$default(focusManager, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HelpCenterSearchTopBar.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4$3, reason: invalid class name */
    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<String> $searchText$delegate;
        final /* synthetic */ MutableStateFlow<String> $textFlow;

        AnonymousClass3(MutableState<String> mutableState, MutableStateFlow<String> mutableStateFlow) {
            this.$searchText$delegate = mutableState;
            this.$textFlow = mutableStateFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            String HelpCenterSearchTopBar$lambda$2;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HelpCenterSearchTopBar$lambda$2 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate);
                if (HelpCenterSearchTopBar$lambda$2.length() > 0) {
                    final MutableStateFlow<String> mutableStateFlow = this.$textFlow;
                    final MutableState<String> mutableState = this.$searchText$delegate;
                    IconButtonKt.IconButton(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$0;
                            invoke$lambda$0 = HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4.AnonymousClass3.invoke$lambda$0(MutableStateFlow.this, mutableState);
                            return invoke$lambda$0;
                        }
                    }, null, false, null, null, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m12015getLambda2$intercom_sdk_base_release(), composer, 1572864, 62);
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(MutableStateFlow textFlow, MutableState searchText$delegate) {
            Intrinsics.checkNotNullParameter(textFlow, "$textFlow");
            Intrinsics.checkNotNullParameter(searchText$delegate, "$searchText$delegate");
            searchText$delegate.setValue("");
            textFlow.setValue("");
            return Unit.INSTANCE;
        }
    }
}
