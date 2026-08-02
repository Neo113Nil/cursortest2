package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.henninghall.date_picker.props.TextColorProp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.BoxedTextLayoutKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.objectweb.asm.Opcodes;

/* compiled from: FIleAttachmentList.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0081\u0001\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"FileAttachmentList", "", "modifier", "Landroidx/compose/ui/Modifier;", "files", "", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "getFileType", "Lio/intercom/android/sdk/models/FileType;", "mimeType", "", "FileAttachment", "fileName", "fileType", ViewProps.BORDER_COLOR, "Landroidx/compose/ui/graphics/Color;", TextColorProp.name, "trialingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "FileAttachment-vRFhKjU", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FailedFileAttached", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;Landroidx/compose/runtime/Composer;II)V", "FileAttachmentListPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FIleAttachmentListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedFileAttached$lambda$5(Modifier modifier, String fileName, FileType fileType, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(fileType, "$fileType");
        FailedFileAttached(modifier, fileName, fileType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$3(Modifier modifier, List files, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(files, "$files");
        FileAttachmentList(modifier, files, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentListPreview$lambda$6(int i, Composer composer, int i2) {
        FileAttachmentListPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachment_vRFhKjU$lambda$4(Modifier modifier, String fileName, FileType fileType, long j, long j2, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(fileType, "$fileType");
        m12831FileAttachmentvRFhKjU(modifier, fileName, fileType, j, j2, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void FileAttachmentList(Modifier modifier, final List<Ticket.TicketAttribute.FilesAttribute.File> files, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(files, "files");
        Composer startRestartGroup = composer.startRestartGroup(580044030);
        final Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(6));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1441890306);
        for (final Ticket.TicketAttribute.FilesAttribute.File file : files) {
            m12831FileAttachmentvRFhKjU(ClickableKt.m623clickableoSLSa3U$default(Modifier.INSTANCE, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit FileAttachmentList$lambda$2$lambda$1$lambda$0;
                    FileAttachmentList$lambda$2$lambda$1$lambda$0 = FIleAttachmentListKt.FileAttachmentList$lambda$2$lambda$1$lambda$0(Ticket.TicketAttribute.FilesAttribute.File.this, context);
                    return FileAttachmentList$lambda$2$lambda$1$lambda$0;
                }
            }, 15, null), file.getName(), file.getFileType(), 0L, 0L, null, null, startRestartGroup, 0, 120);
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileAttachmentList$lambda$3;
                    FileAttachmentList$lambda$3 = FIleAttachmentListKt.FileAttachmentList$lambda$3(Modifier.this, files, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FileAttachmentList$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileAttachmentList$lambda$2$lambda$1$lambda$0(Ticket.TicketAttribute.FilesAttribute.File file, Context context) {
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(context, "$context");
        LinkOpener.handleUrl(file.getUrl(), context, Injector.get().getApi());
        return Unit.INSTANCE;
    }

    public static final FileType getFileType(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        String str = mimeType;
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "image", false, 2, (Object) null) ? FileType.IMAGE : StringsKt.contains$default((CharSequence) str, (CharSequence) "video", false, 2, (Object) null) ? FileType.VIDEO : FileType.ATTACHMENT;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* renamed from: FileAttachment-vRFhKjU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12831FileAttachmentvRFhKjU(Modifier modifier, final String fileName, final FileType fileType, long j, long j2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final long j3;
        final long j4;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        int i4;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        Modifier.Companion companion;
        long j5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function35;
        int i5;
        long j6;
        long j7;
        final Modifier modifier3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function36;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Composer startRestartGroup = composer.startRestartGroup(1921960973);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(fileName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(fileType) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                j3 = j;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            j3 = j;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                j4 = j2;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            j4 = j2;
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & Opcodes.ASM7) == 0) {
            function33 = function3;
            i3 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                function34 = function32;
                i3 |= startRestartGroup.changedInstance(function34) ? 1048576 : 524288;
                if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            j3 = Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU();
                            i3 &= -57345;
                        }
                        if (i9 != 0) {
                            function33 = null;
                        }
                        j5 = j4;
                        if (i4 != 0) {
                            function35 = null;
                            i5 = i3;
                            j6 = j3;
                            j7 = j5;
                            startRestartGroup.endDefaults();
                            int i10 = (i5 & 14) | 24576 | (i5 & 112);
                            int i11 = i5 >> 3;
                            BoxedTextLayoutKt.m12889BoxedTextLayoutY0xEhic(companion, fileName, j6, j7, ComposableLambdaKt.rememberComposableLambda(-344274505, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                                /* compiled from: FIleAttachmentList.kt */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[FileType.values().length];
                                        try {
                                            iArr[FileType.IMAGE.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[FileType.VIDEO.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope BoxedTextLayout, Composer composer2, int i12) {
                                    int i13;
                                    Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                                    if ((i12 & 14) == 0) {
                                        i12 |= composer2.changed(BoxedTextLayout) ? 4 : 2;
                                    }
                                    if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                                        if (function33 != null) {
                                            composer2.startReplaceGroup(1377519035);
                                            function33.invoke(BoxedTextLayout, composer2, Integer.valueOf(i12 & 14));
                                            composer2.endReplaceGroup();
                                            return;
                                        }
                                        composer2.startReplaceGroup(1377585003);
                                        int i14 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                                        if (i14 == 1) {
                                            i13 = R.drawable.intercom_ic_image;
                                        } else if (i14 == 2) {
                                            i13 = R.drawable.intercom_ic_video;
                                        } else {
                                            i13 = R.drawable.intercom_ic_attachment;
                                        }
                                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i13, composer2, 0), "Image Icon", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), 0L, composer2, 440, 8);
                                        composer2.endReplaceGroup();
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), function35, startRestartGroup, (i11 & Opcodes.ASM7) | i10 | (i11 & 896) | (i11 & 7168), 0);
                            modifier3 = companion;
                            function36 = function35;
                            j4 = j7;
                            j3 = j6;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier2;
                        j5 = j4;
                    }
                    i5 = i3;
                    j6 = j3;
                    j7 = j5;
                    function35 = function34;
                    startRestartGroup.endDefaults();
                    int i102 = (i5 & 14) | 24576 | (i5 & 112);
                    int i112 = i5 >> 3;
                    BoxedTextLayoutKt.m12889BoxedTextLayoutY0xEhic(companion, fileName, j6, j7, ComposableLambdaKt.rememberComposableLambda(-344274505, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                        /* compiled from: FIleAttachmentList.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[FileType.values().length];
                                try {
                                    iArr[FileType.IMAGE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[FileType.VIDEO.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope BoxedTextLayout, Composer composer2, int i12) {
                            int i13;
                            Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                            if ((i12 & 14) == 0) {
                                i12 |= composer2.changed(BoxedTextLayout) ? 4 : 2;
                            }
                            if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                                if (function33 != null) {
                                    composer2.startReplaceGroup(1377519035);
                                    function33.invoke(BoxedTextLayout, composer2, Integer.valueOf(i12 & 14));
                                    composer2.endReplaceGroup();
                                    return;
                                }
                                composer2.startReplaceGroup(1377585003);
                                int i14 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                                if (i14 == 1) {
                                    i13 = R.drawable.intercom_ic_image;
                                } else if (i14 == 2) {
                                    i13 = R.drawable.intercom_ic_video;
                                } else {
                                    i13 = R.drawable.intercom_ic_attachment;
                                }
                                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i13, composer2, 0), "Image Icon", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), 0L, composer2, 440, 8);
                                composer2.endReplaceGroup();
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), function35, startRestartGroup, (i112 & Opcodes.ASM7) | i102 | (i112 & 896) | (i112 & 7168), 0);
                    modifier3 = companion;
                    function36 = function35;
                    j4 = j7;
                    j3 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function36 = function34;
                }
                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function37 = function33;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FileAttachment_vRFhKjU$lambda$4;
                            FileAttachment_vRFhKjU$lambda$4 = FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$4(Modifier.this, fileName, fileType, j3, j4, function37, function36, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return FileAttachment_vRFhKjU$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            function34 = function32;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i9 != 0) {
            }
            j5 = j4;
            if (i4 != 0) {
            }
            i5 = i3;
            j6 = j3;
            j7 = j5;
            function35 = function34;
            startRestartGroup.endDefaults();
            int i1022 = (i5 & 14) | 24576 | (i5 & 112);
            int i1122 = i5 >> 3;
            BoxedTextLayoutKt.m12889BoxedTextLayoutY0xEhic(companion, fileName, j6, j7, ComposableLambdaKt.rememberComposableLambda(-344274505, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                /* compiled from: FIleAttachmentList.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FileType.values().length];
                        try {
                            iArr[FileType.IMAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FileType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope BoxedTextLayout, Composer composer2, int i12) {
                    int i13;
                    Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                    if ((i12 & 14) == 0) {
                        i12 |= composer2.changed(BoxedTextLayout) ? 4 : 2;
                    }
                    if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                        if (function33 != null) {
                            composer2.startReplaceGroup(1377519035);
                            function33.invoke(BoxedTextLayout, composer2, Integer.valueOf(i12 & 14));
                            composer2.endReplaceGroup();
                            return;
                        }
                        composer2.startReplaceGroup(1377585003);
                        int i14 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i14 == 1) {
                            i13 = R.drawable.intercom_ic_image;
                        } else if (i14 == 2) {
                            i13 = R.drawable.intercom_ic_video;
                        } else {
                            i13 = R.drawable.intercom_ic_attachment;
                        }
                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i13, composer2, 0), "Image Icon", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), 0L, composer2, 440, 8);
                        composer2.endReplaceGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), function35, startRestartGroup, (i1122 & Opcodes.ASM7) | i1022 | (i1122 & 896) | (i1122 & 7168), 0);
            modifier3 = companion;
            function36 = function35;
            j4 = j7;
            j3 = j6;
            final Function3 function372 = function33;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function33 = function3;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        function34 = function32;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i9 != 0) {
        }
        j5 = j4;
        if (i4 != 0) {
        }
        i5 = i3;
        j6 = j3;
        j7 = j5;
        function35 = function34;
        startRestartGroup.endDefaults();
        int i10222 = (i5 & 14) | 24576 | (i5 & 112);
        int i11222 = i5 >> 3;
        BoxedTextLayoutKt.m12889BoxedTextLayoutY0xEhic(companion, fileName, j6, j7, ComposableLambdaKt.rememberComposableLambda(-344274505, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

            /* compiled from: FIleAttachmentList.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FileType.values().length];
                    try {
                        iArr[FileType.IMAGE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FileType.VIDEO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope BoxedTextLayout, Composer composer2, int i12) {
                int i13;
                Intrinsics.checkNotNullParameter(BoxedTextLayout, "$this$BoxedTextLayout");
                if ((i12 & 14) == 0) {
                    i12 |= composer2.changed(BoxedTextLayout) ? 4 : 2;
                }
                if ((i12 & 91) != 18 || !composer2.getSkipping()) {
                    if (function33 != null) {
                        composer2.startReplaceGroup(1377519035);
                        function33.invoke(BoxedTextLayout, composer2, Integer.valueOf(i12 & 14));
                        composer2.endReplaceGroup();
                        return;
                    }
                    composer2.startReplaceGroup(1377585003);
                    int i14 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                    if (i14 == 1) {
                        i13 = R.drawable.intercom_ic_image;
                    } else if (i14 == 2) {
                        i13 = R.drawable.intercom_ic_video;
                    } else {
                        i13 = R.drawable.intercom_ic_attachment;
                    }
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i13, composer2, 0), "Image Icon", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), 0L, composer2, 440, 8);
                    composer2.endReplaceGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), function35, startRestartGroup, (i11222 & Opcodes.ASM7) | i10222 | (i11222 & 896) | (i11222 & 7168), 0);
        modifier3 = companion;
        function36 = function35;
        j4 = j7;
        j3 = j6;
        final Function3 function3722 = function33;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void FailedFileAttached(Modifier modifier, final String fileName, final FileType fileType, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Composer startRestartGroup = composer.startRestartGroup(912363521);
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
            i3 |= startRestartGroup.changed(fileName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(fileType) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            m12831FileAttachmentvRFhKjU(modifier3, fileName, fileType, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13104getError0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13104getError0d7_KjU(), ComposableSingletons$FIleAttachmentListKt.INSTANCE.m12810getLambda1$intercom_sdk_base_release(), null, startRestartGroup, 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896), 64);
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FailedFileAttached$lambda$5;
                    FailedFileAttached$lambda$5 = FIleAttachmentListKt.FailedFileAttached$lambda$5(Modifier.this, fileName, fileType, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FailedFileAttached$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-414644973);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FIleAttachmentListKt.INSTANCE.m12811getLambda2$intercom_sdk_base_release(), startRestartGroup, 12582912, 127);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FileAttachmentListPreview$lambda$6;
                    FileAttachmentListPreview$lambda$6 = FIleAttachmentListKt.FileAttachmentListPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FileAttachmentListPreview$lambda$6;
                }
            });
        }
    }
}
