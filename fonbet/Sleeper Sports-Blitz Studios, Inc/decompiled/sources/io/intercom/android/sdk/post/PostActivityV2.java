package io.intercom.android.sdk.post;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.os.BundleCompat;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostActivityV2.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u001eH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR?\u0010\u000b\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/post/PostActivityV2;", "Lio/intercom/android/sdk/activities/IntercomBaseActivity;", "<init>", "()V", "injector", "Lio/intercom/android/sdk/Injector;", "kotlin.jvm.PlatformType", "getInjector", "()Lio/intercom/android/sdk/Injector;", "injector$delegate", "Lkotlin/Lazy;", "appConfigProvider", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/identity/AppConfig;", "getAppConfigProvider", "()Lio/intercom/android/sdk/Provider;", "appConfigProvider$delegate", "timeFormatter", "Lio/intercom/android/sdk/utilities/TimeFormatter;", "getTimeFormatter", "()Lio/intercom/android/sdk/utilities/TimeFormatter;", "timeFormatter$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "openConversation", "getPart", "Lio/intercom/android/sdk/models/Part;", "getUserStatus", "", "sendPostAsRead", "isComposerVisible", "", "isPreview", "getConversationId", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PostActivityV2 extends IntercomBaseActivity {
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private static final String POST_PREVIEW = "is_post_preview";
    public static final int $stable = 8;

    /* renamed from: injector$delegate, reason: from kotlin metadata */
    private final Lazy injector = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.post.PostActivityV2$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Injector injector;
            injector = Injector.get();
            return injector;
        }
    });

    /* renamed from: appConfigProvider$delegate, reason: from kotlin metadata */
    private final Lazy appConfigProvider = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.post.PostActivityV2$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Provider appConfigProvider_delegate$lambda$1;
            appConfigProvider_delegate$lambda$1 = PostActivityV2.appConfigProvider_delegate$lambda$1(PostActivityV2.this);
            return appConfigProvider_delegate$lambda$1;
        }
    });

    /* renamed from: timeFormatter$delegate, reason: from kotlin metadata */
    private final Lazy timeFormatter = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.post.PostActivityV2$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TimeFormatter timeFormatter_delegate$lambda$2;
            timeFormatter_delegate$lambda$2 = PostActivityV2.timeFormatter_delegate$lambda$2(PostActivityV2.this);
            return timeFormatter_delegate$lambda$2;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        return (Injector) this.injector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Provider<AppConfig> getAppConfigProvider() {
        return (Provider) this.appConfigProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Provider appConfigProvider_delegate$lambda$1(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getInjector().getAppConfigProvider();
    }

    private final TimeFormatter getTimeFormatter() {
        return (TimeFormatter) this.timeFormatter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeFormatter timeFormatter_delegate$lambda$2(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new TimeFormatter(this$0, this$0.getInjector().getTimeProvider());
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1329969746, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2$onCreate$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    final ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
                    final PostActivityV2 postActivityV2 = PostActivityV2.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(1349674692, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2$onCreate$1.1

                        /* compiled from: PostActivityV2.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1", f = "PostActivityV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C01071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            int label;
                            final /* synthetic */ PostActivityV2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01071(PostActivityV2 postActivityV2, Continuation<? super C01071> continuation) {
                                super(2, continuation);
                                this.this$0 = postActivityV2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C01071(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C01071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                this.this$0.sendPostAsRead();
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            final Part part;
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                EffectsKt.LaunchedEffect("", new C01071(PostActivityV2.this, null), composer2, 70);
                                part = PostActivityV2.this.getPart();
                                long m6065getBlack0d7_KjU = Color.INSTANCE.m6065getBlack0d7_KjU();
                                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1416328832, true, new AnonymousClass2(part, PostActivityV2.this), composer2, 54);
                                final PostActivityV2 postActivityV22 = PostActivityV2.this;
                                ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(294322015, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i3) {
                                        boolean isPreview;
                                        if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                            isPreview = PostActivityV2.this.isPreview();
                                            if (isPreview) {
                                                Part part2 = part;
                                                PostActivityV2 postActivityV23 = PostActivityV2.this;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                                Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                                }
                                                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                DividerKt.m3048HorizontalDivider9IZ8Weo(null, Dp.m8798constructorimpl((float) 0.65d), ColorKt.Color(2594086558L), composer3, 432, 1);
                                                PostActivityV2Kt.BottomBarContent(Modifier.INSTANCE, ComposableLambdaKt.rememberComposableLambda(-391111001, true, new PostActivityV2$onCreate$1$1$3$1$1(part2, postActivityV23), composer3, 54), composer3, 54);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                composer3.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54);
                                final ScrollState scrollState = rememberScrollState;
                                ScaffoldKt.m3518ScaffoldTvnljyQ(null, rememberComposableLambda, rememberComposableLambda2, null, null, 0, m6065getBlack0d7_KjU, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1777074859, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1.4
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues contentPadding, Composer composer3, int i3) {
                                        List<Block> list;
                                        int i4;
                                        int i5;
                                        float m8798constructorimpl;
                                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                        if ((((i3 & 14) == 0 ? i3 | (composer3.changed(contentPadding) ? 4 : 2) : i3) & 91) != 18 || !composer3.getSkipping()) {
                                            int i6 = 16;
                                            float f = 16;
                                            Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(PaddingKt.padding(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollState.this, true, null, false, 12, null), contentPadding), Dp.m8798constructorimpl(f), 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f), 2, null);
                                            Part part2 = part;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                            int i7 = 0;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1161paddingqDBjuR0$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                            }
                                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), composer3, 6);
                                            List<Block> blocks = part2.getBlocks();
                                            if (blocks == null) {
                                                blocks = CollectionsKt.emptyList();
                                            }
                                            composer3.startReplaceGroup(-1177115769);
                                            int i8 = 0;
                                            for (Object obj : blocks) {
                                                int i9 = i8 + 1;
                                                if (i8 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Block block = (Block) obj;
                                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                Intrinsics.checkNotNull(block);
                                                List<Block> list2 = blocks;
                                                int i10 = i8;
                                                int i11 = i6;
                                                float f2 = f;
                                                BlockViewKt.BlockView(fillMaxWidth$default, new BlockRenderData(block, Color.m6029boximpl(Color.INSTANCE.m6076getWhite0d7_KjU()), new BlockRenderTextStyle(TextUnitKt.getSp(24), FontWeight.INSTANCE.getBold(), TextUnitKt.getSp(36), Color.m6029boximpl(Color.INSTANCE.m6076getWhite0d7_KjU()), null, null, 48, null), new BlockRenderTextStyle(TextUnitKt.getSp(i6), FontWeight.INSTANCE.getNormal(), TextUnitKt.getSp(36), Color.m6029boximpl(Color.INSTANCE.m6076getWhite0d7_KjU()), null, null, 48, null), new BlockRenderTextStyle(TextUnitKt.getSp(i6), FontWeight.INSTANCE.getNormal(), TextUnitKt.getSp(24), Color.m6029boximpl(Color.INSTANCE.m6076getWhite0d7_KjU()), null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8656getJustifye0LSkKk()), 16, null), null), false, null, false, null, ImageRenderType.FULL, null, null, false, null, null, composer3, 1572934, 0, 4028);
                                                if (i10 != CollectionsKt.getLastIndex(list2)) {
                                                    list = list2;
                                                    i4 = i9;
                                                    if (block.getType() == BlockType.PARAGRAPH) {
                                                        Block block2 = (Block) CollectionsKt.getOrNull(list, i4);
                                                        i5 = 0;
                                                        if ((block2 != null ? block2.getType() : null) == BlockType.PARAGRAPH) {
                                                            m8798constructorimpl = Dp.m8798constructorimpl(0);
                                                        }
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    m8798constructorimpl = Dp.m8798constructorimpl(f2);
                                                } else {
                                                    m8798constructorimpl = Dp.m8798constructorimpl(56);
                                                    list = list2;
                                                    i4 = i9;
                                                    i5 = 0;
                                                }
                                                SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, m8798constructorimpl), composer3, i5);
                                                i7 = i5;
                                                blocks = list;
                                                i8 = i4;
                                                f = f2;
                                                i6 = i11;
                                            }
                                            composer3.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, 806879664, 441);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* compiled from: PostActivityV2.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Part $part;
                            final /* synthetic */ PostActivityV2 this$0;

                            AnonymousClass2(Part part, PostActivityV2 postActivityV2) {
                                this.$part = part;
                                this.this$0 = postActivityV2;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                Provider appConfigProvider;
                                String userStatus;
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = composer.consume(localContext);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    Phrase put = Phrase.from((Context) consume, R.string.intercom_teammate_from_company).put("name", this.$part.getParticipant().getForename());
                                    appConfigProvider = this.this$0.getAppConfigProvider();
                                    CharSequence format = put.put("company", ((AppConfig) appConfigProvider.get()).getName()).format();
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Avatar avatar = this.$part.getParticipant().getAvatar();
                                    Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                                    String obj = format.toString();
                                    userStatus = this.this$0.getUserStatus();
                                    final PostActivityV2 postActivityV2 = this.this$0;
                                    PostActivityV2Kt.TopBar(companion, avatar, obj, userStatus, 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0083: INVOKE 
                                          (r1v4 'companion' androidx.compose.ui.Modifier$Companion)
                                          (r2v0 'avatar' io.intercom.android.sdk.models.Avatar)
                                          (r3v0 'obj' java.lang.String)
                                          (r4v0 'userStatus' java.lang.String)
                                          (wrap:kotlin.jvm.functions.Function0:0x007d: CONSTRUCTOR (r10v11 'postActivityV2' io.intercom.android.sdk.post.PostActivityV2 A[DONT_INLINE]) A[MD:(io.intercom.android.sdk.post.PostActivityV2):void (m), WRAPPED] call: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$2$$ExternalSyntheticLambda0.<init>(io.intercom.android.sdk.post.PostActivityV2):void type: CONSTRUCTOR)
                                          (r9v0 'composer' androidx.compose.runtime.Composer)
                                          (70 int)
                                         STATIC call: io.intercom.android.sdk.post.PostActivityV2Kt.TopBar(androidx.compose.ui.Modifier, io.intercom.android.sdk.models.Avatar, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void A[MD:(androidx.compose.ui.Modifier, io.intercom.android.sdk.models.Avatar, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, int):void (m)] (LINE:1) in method: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1.2.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 23 more
                                        */
                                    /*
                                        this = this;
                                        r10 = r10 & 11
                                        r0 = 2
                                        if (r10 != r0) goto L10
                                        boolean r10 = r9.getSkipping()
                                        if (r10 != 0) goto Lc
                                        goto L10
                                    Lc:
                                        r9.skipToGroupEnd()
                                        return
                                    L10:
                                        androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
                                        androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
                                        r0 = 2023513938(0x789c5f52, float:2.5372864E34)
                                        java.lang.String r1 = "CC(<get-current>):CompositionLocal.kt#9igjgp"
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r0, r1)
                                        java.lang.Object r10 = r9.consume(r10)
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
                                        android.content.Context r10 = (android.content.Context) r10
                                        int r0 = io.intercom.android.sdk.R.string.intercom_teammate_from_company
                                        io.intercom.android.sdk.utilities.Phrase r10 = io.intercom.android.sdk.utilities.Phrase.from(r10, r0)
                                        io.intercom.android.sdk.models.Part r0 = r8.$part
                                        io.intercom.android.sdk.models.Participant r0 = r0.getParticipant()
                                        java.lang.String r0 = r0.getForename()
                                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                                        java.lang.String r1 = "name"
                                        io.intercom.android.sdk.utilities.Phrase r10 = r10.put(r1, r0)
                                        io.intercom.android.sdk.post.PostActivityV2 r0 = r8.this$0
                                        io.intercom.android.sdk.Provider r0 = io.intercom.android.sdk.post.PostActivityV2.access$getAppConfigProvider(r0)
                                        java.lang.Object r0 = r0.get()
                                        io.intercom.android.sdk.identity.AppConfig r0 = (io.intercom.android.sdk.identity.AppConfig) r0
                                        java.lang.String r0 = r0.getName()
                                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                                        java.lang.String r1 = "company"
                                        io.intercom.android.sdk.utilities.Phrase r10 = r10.put(r1, r0)
                                        java.lang.CharSequence r10 = r10.format()
                                        androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.INSTANCE
                                        r1 = r0
                                        androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
                                        io.intercom.android.sdk.models.Part r0 = r8.$part
                                        io.intercom.android.sdk.models.Participant r0 = r0.getParticipant()
                                        io.intercom.android.sdk.models.Avatar r2 = r0.getAvatar()
                                        java.lang.String r0 = "getAvatar(...)"
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                                        java.lang.String r3 = r10.toString()
                                        io.intercom.android.sdk.post.PostActivityV2 r10 = r8.this$0
                                        java.lang.String r4 = io.intercom.android.sdk.post.PostActivityV2.access$getUserStatus(r10)
                                        io.intercom.android.sdk.post.PostActivityV2 r10 = r8.this$0
                                        io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$2$$ExternalSyntheticLambda0 r5 = new io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$2$$ExternalSyntheticLambda0
                                        r5.<init>(r10)
                                        r7 = 70
                                        r6 = r9
                                        io.intercom.android.sdk.post.PostActivityV2Kt.access$TopBar(r1, r2, r3, r4, r5, r6, r7)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.post.PostActivityV2$onCreate$1.AnonymousClass1.AnonymousClass2.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$0(PostActivityV2 this$0) {
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.finish();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer, 54), composer, 3072, 7);
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void openConversation() {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            String string = extras.getString(PARCEL_CONVERSATION_ID, "");
            getInjector().getMetricTracker().openedConversationFromFull(string, getPart().getId());
            startActivity(ConversationScreenOpenerKt.getConversationIntent(this, string));
            finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Part getPart() {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                extras.setClassLoader(Part.class.getClassLoader());
                if (extras.containsKey(PARCEL_PART)) {
                    Part part = (Part) BundleCompat.getParcelable(extras, PARCEL_PART, Part.class);
                    if (part != null) {
                        return part;
                    }
                    Part NULL = Part.NULL;
                    Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
                    return NULL;
                }
            }
            Part NULL2 = Part.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL2, "NULL");
            return NULL2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getUserStatus() {
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.containsKey(LAST_PARTICIPANT)) {
                LastParticipatingAdmin lastParticipatingAdmin = (LastParticipatingAdmin) BundleCompat.getParcelable(extras, LAST_PARTICIPANT, LastParticipatingAdmin.class);
                if (!LastParticipatingAdmin.isNull(lastParticipatingAdmin)) {
                    TimeFormatter timeFormatter = getTimeFormatter();
                    Intrinsics.checkNotNull(lastParticipatingAdmin);
                    timeFormatter.getAdminActiveStatus(lastParticipatingAdmin, getAppConfigProvider());
                    return "";
                }
                return "";
            }
            return "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void sendPostAsRead() {
            Bundle extras = getIntent().getExtras();
            if (extras == null || !extras.containsKey(PARCEL_CONVERSATION_ID)) {
                return;
            }
            String string = extras.getString(PARCEL_CONVERSATION_ID, "");
            IntercomDataLayer dataLayer = getInjector().getDataLayer();
            Intrinsics.checkNotNull(string);
            dataLayer.markConversationAsRead(string);
            getInjector().getApi().markConversationAsRead(string);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isComposerVisible() {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                return extras.getBoolean(COMPOSER_IS_VISIBLE, true);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPreview() {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            return extras.getBoolean(POST_PREVIEW, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getConversationId() {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            String string = extras.getString(PARCEL_CONVERSATION_ID, "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }
