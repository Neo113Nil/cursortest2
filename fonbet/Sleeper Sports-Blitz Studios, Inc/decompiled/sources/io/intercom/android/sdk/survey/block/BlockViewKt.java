package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.facebook.react.uimanager.ViewProps;
import com.henninghall.date_picker.props.TextColorProp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.CarouselImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockView.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a·\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00010\u00122\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0012H\u0001¢\u0006\u0002\u0010\u001a\u001a3\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"BlockView", "", "modifier", "Landroidx/compose/ui/Modifier;", "blockRenderData", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "isAttachmentFromAdmin", "", "suffixText", "Lio/intercom/android/sdk/survey/block/SuffixText;", "enabled", "conversationId", "", "imageRenderType", "Lio/intercom/android/sdk/survey/block/ImageRenderType;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "onCreateTicket", "Lkotlin/Function1;", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "inlineSourcesVisible", "onInlineSourcesClick", "", "Lio/intercom/android/sdk/models/InlineSource;", "onLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/block/BlockRenderData;ZLio/intercom/android/sdk/survey/block/SuffixText;ZLjava/lang/String;Lio/intercom/android/sdk/survey/block/ImageRenderType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "RenderLegacyBlocks", "block", "Lio/intercom/android/sdk/blocks/lib/models/Block;", TextColorProp.name, "Landroidx/compose/ui/graphics/Color;", "RenderLegacyBlocks-sW7UJKQ", "(Lio/intercom/android/sdk/blocks/lib/models/Block;JLandroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BlockViewKt {

    /* compiled from: BlockView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.HEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockType.CREATETICKETCARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlockType.MESSENGERCARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlockType.CODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlockType.ATTACHMENTLIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlockType.LOCAL_ATTACHMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlockType.CONVERSATIONRATING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlockType.LINKLIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlockType.VIDEOFILE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$5(Modifier modifier, BlockRenderData blockRenderData, boolean z, SuffixText suffixText, boolean z2, String str, ImageRenderType imageRenderType, Function0 function0, Function1 function1, boolean z3, Function1 function12, Function1 function13, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        BlockView(modifier, blockRenderData, z, suffixText, z2, str, imageRenderType, function0, function1, z3, function12, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenderLegacyBlocks_sW7UJKQ$lambda$8(Block block, long j, Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(block, "$block");
        m12659RenderLegacyBlockssW7UJKQ(block, j, modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$1(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlockView(Modifier modifier, final BlockRenderData blockRenderData, boolean z, SuffixText suffixText, boolean z2, String str, ImageRenderType imageRenderType, Function0<Unit> function0, Function1<? super TicketType, Unit> function1, boolean z3, Function1<? super List<InlineSource>, Unit> function12, Function1<? super TextLayoutResult, Unit> function13, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        final SuffixText suffixText2;
        Function1<? super TextLayoutResult, Unit> function14;
        boolean z4;
        boolean z5;
        final Modifier modifier3;
        final ImageRenderType imageRenderType2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        Composer startRestartGroup = composer.startRestartGroup(-373546060);
        Modifier.Companion companion = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        boolean z6 = (i3 & 4) != 0 ? false : z;
        SuffixText no_suffix = (i3 & 8) != 0 ? SuffixText.INSTANCE.getNO_SUFFIX() : suffixText;
        boolean z7 = (i3 & 16) != 0 ? true : z2;
        String str2 = (i3 & 32) != 0 ? "" : str;
        ImageRenderType imageRenderType3 = (i3 & 64) != 0 ? ImageRenderType.CROPPED : imageRenderType;
        final Function0<Unit> function02 = (i3 & 128) != 0 ? null : function0;
        final Function1<? super TicketType, Unit> function15 = (i3 & 256) != 0 ? null : function1;
        boolean z8 = (i3 & 512) != 0 ? false : z3;
        final Function1<? super List<InlineSource>, Unit> function16 = (i3 & 1024) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BlockView$lambda$0;
                BlockView$lambda$0 = BlockViewKt.BlockView$lambda$0((List) obj);
                return BlockView$lambda$0;
            }
        } : function12;
        Function1<? super TextLayoutResult, Unit> function17 = (i3 & 2048) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BlockView$lambda$1;
                BlockView$lambda$1 = BlockViewKt.BlockView$lambda$1((TextLayoutResult) obj);
                return BlockView$lambda$1;
            }
        } : function13;
        Color m12642getTextColorQN2ZGVo = blockRenderData.m12642getTextColorQN2ZGVo();
        long m6049unboximpl = m12642getTextColorQN2ZGVo != null ? m12642getTextColorQN2ZGVo.m6049unboximpl() : Color.INSTANCE.m6065getBlack0d7_KjU();
        final Block block = blockRenderData.getBlock();
        if (Injector.isNotInitialised()) {
            modifier2 = companion;
        } else {
            modifier2 = companion;
            if (Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.BLOCK_RENDERING_FALLBACK)) {
                startRestartGroup.startReplaceGroup(1198822707);
                m12659RenderLegacyBlockssW7UJKQ(block, m6049unboximpl, modifier2, null, startRestartGroup, ((i << 6) & 896) | 8, 8);
                modifier3 = modifier2;
                startRestartGroup.endReplaceGroup();
                SuffixText suffixText3 = no_suffix;
                function14 = function17;
                suffixText2 = suffixText3;
                z5 = z6;
                imageRenderType2 = imageRenderType3;
                z4 = z8;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    final Function1<? super TicketType, Unit> function18 = function15;
                    final boolean z9 = z5;
                    final Function1<? super TextLayoutResult, Unit> function19 = function14;
                    final boolean z10 = z7;
                    final String str3 = str2;
                    final Function0<Unit> function03 = function02;
                    final boolean z11 = z4;
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BlockView$lambda$5;
                            BlockView$lambda$5 = BlockViewKt.BlockView$lambda$5(Modifier.this, blockRenderData, z9, suffixText2, z10, str3, imageRenderType2, function03, function18, z11, function16, function19, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return BlockView$lambda$5;
                        }
                    });
                    return;
                }
                return;
            }
        }
        startRestartGroup.startReplaceGroup(1198993083);
        final Function1<? super TextLayoutResult, Unit> function110 = function17;
        final SuffixText suffixText4 = no_suffix;
        final Function1<? super List<InlineSource>, Unit> function111 = function16;
        final boolean z12 = z8;
        suffixText2 = suffixText4;
        function14 = function110;
        z4 = z12;
        z5 = z6;
        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1514621528, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$BlockView$textBlock$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i4) {
                if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                    TextBlockKt.TextBlock(Modifier.INSTANCE, BlockRenderData.this, suffixText4, function110, z12, function111, composer3, 70, 0);
                } else {
                    composer3.skipToGroupEnd();
                }
            }
        }, startRestartGroup, 54);
        BlockType type = block.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                startRestartGroup.startReplaceGroup(-1208237443);
                ImageRenderType imageRenderType4 = imageRenderType3;
                Modifier modifier4 = modifier2;
                ImageBlockKt.ImageBlock(block, modifier4, null, false, imageRenderType4, startRestartGroup, ((i << 3) & 112) | 8 | ((i >> 6) & 57344), 12);
                modifier3 = modifier4;
                imageRenderType2 = imageRenderType4;
                startRestartGroup.endReplaceGroup();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                startRestartGroup.startReplaceGroup(-1208229124);
                rememberComposableLambda.invoke(startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
                imageRenderType2 = imageRenderType3;
                modifier3 = modifier2;
                break;
            case 7:
                startRestartGroup.startReplaceGroup(1199675021);
                final boolean z13 = z7 && !block.getTicketType().getArchived();
                CreateTicketCardKt.CreateTicketCard(Modifier.INSTANCE, blockRenderData, z13, new Function0() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BlockView$lambda$2;
                        BlockView$lambda$2 = BlockViewKt.BlockView$lambda$2(z13, function15, block, function02);
                        return BlockView$lambda$2;
                    }
                }, startRestartGroup, 70, 0);
                startRestartGroup = startRestartGroup;
                startRestartGroup.endReplaceGroup();
                imageRenderType2 = imageRenderType3;
                modifier3 = modifier2;
                break;
            case 8:
                startRestartGroup.startReplaceGroup(1200284853);
                String fallbackUrl = block.getFallbackUrl();
                Intrinsics.checkNotNullExpressionValue(fallbackUrl, "getFallbackUrl(...)");
                if (fallbackUrl.length() > 0) {
                    startRestartGroup.startReplaceGroup(1200334546);
                    String fallbackUrl2 = block.getFallbackUrl();
                    Intrinsics.checkNotNullExpressionValue(fallbackUrl2, "getFallbackUrl(...)");
                    composer2 = startRestartGroup;
                    LegacyMessengerAppCardKt.LegacyMessengerAppCard(fallbackUrl2, IntercomCardStyle.INSTANCE.m12917conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, startRestartGroup, IntercomCardStyle.$stable << 15, 31), false, composer2, (IntercomCardStyle.Style.$stable << 3) | 384);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1200587134);
                    rememberComposableLambda.invoke(composer2, 6);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                startRestartGroup = composer2;
                imageRenderType2 = imageRenderType3;
                modifier3 = modifier2;
                break;
            case 9:
                Modifier modifier5 = modifier2;
                startRestartGroup.startReplaceGroup(-1208194301);
                CodeBlockKt.CodeBlock(block, modifier5, function14, startRestartGroup, ((i << 3) & 112) | 8 | ((i2 << 3) & 896), 0);
                modifier2 = modifier5;
                startRestartGroup.endReplaceGroup();
                imageRenderType2 = imageRenderType3;
                modifier3 = modifier2;
                break;
            case 10:
                modifier3 = modifier2;
                startRestartGroup.startReplaceGroup(-1208191374);
                AttachmentBlockKt.AttachmentBlock(modifier3, blockRenderData, z5, startRestartGroup, (i & 14) | 64 | (i & 896), 0);
                z5 = z5;
                startRestartGroup.endReplaceGroup();
                imageRenderType2 = imageRenderType3;
                break;
            case 11:
                modifier3 = modifier2;
                startRestartGroup.startReplaceGroup(-1208187918);
                AttachmentBlockKt.AttachmentBlock(modifier3, blockRenderData, z5, startRestartGroup, (i & 14) | 64 | (i & 896), 0);
                startRestartGroup.endReplaceGroup();
                z5 = z5;
                imageRenderType2 = imageRenderType3;
                break;
            case 12:
                modifier3 = modifier2;
                startRestartGroup.startReplaceGroup(-1208184286);
                ConversationRatingBlockKt.m12669ConversationRatingBlockcf5BqRc(null, blockRenderData, m6049unboximpl, str2, startRestartGroup, ((i >> 6) & 7168) | 64, 1);
                startRestartGroup.endReplaceGroup();
                imageRenderType2 = imageRenderType3;
                break;
            case 13:
                modifier3 = modifier2;
                startRestartGroup.startReplaceGroup(-1208177500);
                LinkListBlockKt.m12671LinkListBlockcf5BqRc(null, block, m6049unboximpl, str2, startRestartGroup, ((i >> 6) & 7168) | 64, 1);
                startRestartGroup.endReplaceGroup();
                imageRenderType2 = imageRenderType3;
                break;
            case 14:
                startRestartGroup.startReplaceGroup(-1208171550);
                String url = block.getUrl();
                if (url.length() == 0) {
                    url = block.getLocalUri().toString();
                }
                Intrinsics.checkNotNullExpressionValue(url, "ifEmpty(...)");
                String str4 = url;
                String thumbnailUrl = block.getThumbnailUrl();
                Intrinsics.checkNotNull(thumbnailUrl);
                if (thumbnailUrl.length() <= 0) {
                    thumbnailUrl = null;
                }
                Modifier modifier6 = modifier2;
                VideoFileBlockKt.VideoFileBlock(modifier6, str4, thumbnailUrl, startRestartGroup, i & 14, 0);
                modifier3 = modifier6;
                startRestartGroup.endReplaceGroup();
                imageRenderType2 = imageRenderType3;
                break;
            default:
                imageRenderType2 = imageRenderType3;
                modifier3 = modifier2;
                startRestartGroup.startReplaceGroup(1202013971);
                if (!Injector.isNotInitialised()) {
                    m12659RenderLegacyBlockssW7UJKQ(block, m6049unboximpl, modifier3, null, startRestartGroup, ((i << 6) & 896) | 8, 8);
                }
                startRestartGroup.endReplaceGroup();
                break;
        }
        startRestartGroup.endReplaceGroup();
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockView$lambda$2(boolean z, Function1 function1, Block block, Function0 function0) {
        Intrinsics.checkNotNullParameter(block, "$block");
        if (z) {
            if (function1 != null) {
                TicketType ticketType = block.getTicketType();
                Intrinsics.checkNotNullExpressionValue(ticketType, "getTicketType(...)");
                function1.invoke(ticketType);
            }
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: RenderLegacyBlocks-sW7UJKQ, reason: not valid java name */
    public static final void m12659RenderLegacyBlockssW7UJKQ(final Block block, final long j, Modifier modifier, String str, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(block, "block");
        Composer startRestartGroup = composer.startRestartGroup(-119170784);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        String str2 = (i2 & 8) != 0 ? "" : str;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Blocks blocks = new Blocks((Context) consume, LumberMill.getBlocksTwig());
        UploadingImageCache uploadingImageCache = new UploadingImageCache();
        Api api = Injector.get().getApi();
        Provider<AppConfig> appConfigProvider = Injector.get().getAppConfigProvider();
        Api api2 = Injector.get().getApi();
        Intrinsics.checkNotNullExpressionValue(api2, "getApi(...)");
        final ViewHolderGenerator viewHolderGenerator = new ViewHolderGenerator(uploadingImageCache, api, appConfigProvider, str2, new CarouselImageClickListener(api2), new LinkOpeningButtonClickListener(Injector.get().getApi()), Injector.get().getGson(), Injector.get().getMetricTracker());
        final Modifier modifier3 = modifier2;
        AndroidView_androidKt.AndroidView(new Function1() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LinearLayout RenderLegacyBlocks_sW7UJKQ$lambda$7;
                RenderLegacyBlocks_sW7UJKQ$lambda$7 = BlockViewKt.RenderLegacyBlocks_sW7UJKQ$lambda$7(Blocks.this, block, viewHolderGenerator, j, (Context) obj);
                return RenderLegacyBlocks_sW7UJKQ$lambda$7;
            }
        }, modifier3, null, startRestartGroup, (i >> 3) & 112, 4);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final String str3 = str2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RenderLegacyBlocks_sW7UJKQ$lambda$8;
                    RenderLegacyBlocks_sW7UJKQ$lambda$8 = BlockViewKt.RenderLegacyBlocks_sW7UJKQ$lambda$8(Block.this, j, modifier3, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return RenderLegacyBlocks_sW7UJKQ$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout RenderLegacyBlocks_sW7UJKQ$lambda$7(Blocks blocks, Block block, ViewHolderGenerator generator, long j, Context it) {
        Intrinsics.checkNotNullParameter(blocks, "$blocks");
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(generator, "$generator");
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout createBlocks = blocks.createBlocks(CollectionsKt.listOf(block), generator.getPostHolder());
        Intrinsics.checkNotNull(createBlocks);
        LinearLayout linearLayout = createBlocks;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if ((childAt instanceof TextView) && !(childAt instanceof Button)) {
                ((TextView) childAt).setTextColor(android.graphics.Color.rgb((ColorKt.m6093toArgb8_81llA(j) >> 16) & 255, (ColorKt.m6093toArgb8_81llA(j) >> 8) & 255, ColorKt.m6093toArgb8_81llA(j) & 255));
            }
        }
        createBlocks.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return createBlocks;
    }
}
