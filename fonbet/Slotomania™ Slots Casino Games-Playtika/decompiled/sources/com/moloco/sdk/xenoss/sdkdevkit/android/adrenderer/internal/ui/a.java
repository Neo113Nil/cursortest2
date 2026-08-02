package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.R;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class a {
    public static final String a = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$a, reason: collision with other inner class name */
    public static final class C0323a implements Function3<Modifier, Composer, Integer, Unit> {
        public final /* synthetic */ Modifier a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function1<String, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0323a(Modifier modifier, String str, Function1<? super String, Unit> function1) {
            this.a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(Modifier trackableModifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(trackableModifier, "trackableModifier");
            if ((i & 6) == 0) {
                i |= composer.changed(trackableModifier) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1810395910, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableAdBadgeButton.<anonymous> (AdBadge.kt:153)");
            }
            a.a(this.a.then(trackableModifier), this.b, this.c, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class c implements Function4<BoxScope, Function1<? super a.AbstractC0383a.c, ? extends Unit>, Composer, Integer, Unit> {
        public final /* synthetic */ Modifier a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function1<String, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, String str, Function1<? super String, Unit> function1) {
            this.a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(BoxScope boxScope, Function1<? super a.AbstractC0383a.c, Unit> onButtonRendered, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if ((i & 48) == 0) {
                i |= composer.changedInstance(onButtonRendered) ? 32 : 16;
            }
            if ((i & 145) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652534615, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous> (AdBadge.kt:124)");
            }
            a.a(onButtonRendered, this.a, this.b, this.c, composer, (i >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Function1<? super a.AbstractC0383a.c, ? extends Unit> function1, Composer composer, Integer num) {
            a(boxScope, function1, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(Modifier modifier, String str, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, str, (Function1<? super String, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Function4<BoxScope, Function1<? super a.AbstractC0383a.c, Unit>, Composer, Integer, Unit> c(Modifier modifier, final String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1<? super String, Unit> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1806921710);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = a;
        }
        if ((i2 & 4) != 0) {
            rVar = a.h.a.f();
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-763795258);
            boolean z = ((((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && composer.changedInstance(rVar)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256) | ((((i & 112) ^ 48) > 32 && composer.changed(str)) || (i & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1806921710, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge (AdBadge.kt:123)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -652534615, true, new c(modifier, str, function1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Function5<BoxScope, Function1<? super a.AbstractC0383a.c, Unit>, StateFlow<? extends i.a>, Composer, Integer, Unit> b(Modifier modifier, final String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1<? super String, Unit> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1665380566);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = a;
        }
        if ((i2 & 4) != 0) {
            rVar = a.h.a.f();
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-819746537);
            boolean z = ((((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && composer.changedInstance(rVar)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256) | ((((i & 112) ^ 48) > 32 && composer.changed(str)) || (i & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665380566, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge (AdBadge.kt:80)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 781429248, true, new b(modifier, str, function1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Unit a(Function1 function1, Modifier modifier, String str, Function1 function12, int i, Composer composer, int i2) {
        a((Function1<? super a.AbstractC0383a.c, Unit>) function1, modifier, str, (Function1<? super String, Unit>) function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(Modifier modifier, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, str, rVar, (Function1<? super String, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void a(Modifier modifier, final String clickUrl, final Function1<? super String, Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1037954372);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(clickUrl) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037954372, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadge (AdBadge.kt:43)");
            }
            startRestartGroup.startReplaceableGroup(-363689698);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            final String str = "Ad Badge";
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a.a(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m626requiredSize3ABfNKs = SizeKt.m626requiredSize3ABfNKs(SemanticsModifierKt.semantics$default(modifier3, false, (Function1) rememberedValue, 1, null), Dp.m4440constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-363682862);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.a(Function1.this, clickUrl);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            IconKt.m1421Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.info_badge, startRestartGroup, 0), "Ad Badge", ClickableKt.m267clickableXHw0xAI$default(m626requiredSize3ABfNKs, false, null, null, (Function0) rememberedValue2, 7, null), Color.INSTANCE.m2148getUnspecified0d7_KjU(), startRestartGroup, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a.a(Modifier.this, clickUrl, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final class b implements Function5<BoxScope, Function1<? super a.AbstractC0383a.c, ? extends Unit>, StateFlow<? extends i.a>, Composer, Integer, Unit> {
        public final /* synthetic */ Modifier a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function1<String, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, String str, Function1<? super String, Unit> function1) {
            this.a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(BoxScope boxScope, Function1<? super a.AbstractC0383a.c, Unit> onButtonRendered, StateFlow<? extends i.a> stateFlow, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(781429248, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous> (AdBadge.kt:81)");
            }
            if (stateFlow != null) {
                Modifier modifier = this.a;
                String str = this.b;
                Function1<String, Unit> function1 = this.c;
                i.a a = a(SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1));
                if (a instanceof i.a.c) {
                    composer.startReplaceableGroup(-784874969);
                    a.a(onButtonRendered, modifier, str, function1, composer, (i >> 3) & 14);
                    composer.endReplaceableGroup();
                } else if (a instanceof i.a.C0352a) {
                    composer.startReplaceableGroup(-784629945);
                    a.a(onButtonRendered, modifier, str, function1, composer, (i >> 3) & 14);
                    composer.endReplaceableGroup();
                } else if (a instanceof i.a.b) {
                    composer.startReplaceableGroup(-784396608);
                    composer.endReplaceableGroup();
                } else if (a instanceof i.a.d) {
                    composer.startReplaceableGroup(-784339072);
                    composer.endReplaceableGroup();
                } else {
                    if (a != null) {
                        composer.startReplaceableGroup(-1687888204);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-784304352);
                    composer.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Function1<? super a.AbstractC0383a.c, ? extends Unit> function1, StateFlow<? extends i.a> stateFlow, Composer composer, Integer num) {
            a(boxScope, function1, stateFlow, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final i.a a(State<? extends i.a> state) {
            return state.getValue();
        }
    }

    public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return Unit.INSTANCE;
    }

    public static final Unit b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return Unit.INSTANCE;
    }

    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final Unit a(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final void a(Function1<? super a.AbstractC0383a.c, Unit> function1, final Modifier modifier, final String str, final Function1<? super String, Unit> function12, Composer composer, final int i) {
        int i2;
        Function1<? super a.AbstractC0383a.c, Unit> function13;
        Composer startRestartGroup = composer.startRestartGroup(-459026854);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function13 = function1;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-459026854, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableAdBadgeButton (AdBadge.kt:148)");
            }
            function13 = function1;
            z.a(null, a.AbstractC0383a.c.EnumC0385a.i, function13, ComposableLambdaKt.composableLambda(startRestartGroup, -1810395910, true, new C0323a(modifier, str, function12)), startRestartGroup, ((i2 << 6) & 896) | 3120, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1<? super a.AbstractC0383a.c, Unit> function14 = function13;
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a.a(Function1.this, modifier, str, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Modifier modifier, final String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2;
        Modifier modifier2;
        String str2;
        Function1<? super String, Unit> function12;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar3;
        final Modifier modifier3;
        final String str3;
        final Function1<? super String, Unit> function13;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1950835232);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            if ((i2 & 4) == 0) {
                if ((i & 512) == 0 ? startRestartGroup.changed(rVar) : startRestartGroup.changedInstance(rVar)) {
                    i4 = 256;
                    i3 |= i4;
                }
            }
            i4 = 128;
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changedInstance(function1)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            str3 = str;
            rVar3 = rVar;
            function13 = function1;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    str = a;
                }
                if ((i2 & 4) != 0) {
                    rVar2 = a.h.a.f();
                    i3 &= -897;
                } else {
                    rVar2 = rVar;
                }
                if ((i2 & 8) != 0) {
                    startRestartGroup.startReplaceableGroup(1664253345);
                    boolean z = ((((i3 & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && startRestartGroup.changedInstance(rVar2)) || (i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 256) | ((i3 & 112) == 32);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    i3 &= -7169;
                    modifier2 = modifier;
                    str2 = str;
                    function12 = (Function1) rememberedValue;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1950835232, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultNativeAdImageBadge (AdBadge.kt:172)");
                    }
                    a(modifier2, str2, function12, startRestartGroup, (i3 & 126) | ((i3 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    rVar3 = rVar2;
                    modifier3 = modifier2;
                    str3 = str2;
                    function13 = function12;
                } else {
                    modifier2 = modifier;
                    str2 = str;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                modifier2 = modifier;
                str2 = str;
                rVar2 = rVar;
            }
            function12 = function1;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            a(modifier2, str2, function12, startRestartGroup, (i3 & 126) | ((i3 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            rVar3 = rVar2;
            modifier3 = modifier2;
            str3 = str2;
            function13 = function12;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a.a(Modifier.this, str3, rVar3, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1309369895);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1309369895, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadgePreview (AdBadge.kt:182)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, l.a.a(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
