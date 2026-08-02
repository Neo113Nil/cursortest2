package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.os.BundleCompat;
import androidx.core.view.WindowCompat;
import com.braze.ui.actions.brazeactions.steps.StepData;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomPreviewActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/IntercomPreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "getViewModel", "()Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getPreviewData", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "finishWithResult", "resultCode", "", "uris", "", "Landroid/net/Uri;", "Companion", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomPreviewActivity extends ComponentActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            PreviewViewModel viewModel_delegate$lambda$0;
            viewModel_delegate$lambda$0 = IntercomPreviewActivity.viewModel_delegate$lambda$0(IntercomPreviewActivity.this);
            return viewModel_delegate$lambda$0;
        }
    });

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public final PreviewViewModel getViewModel() {
        return (PreviewViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewViewModel viewModel_delegate$lambda$0(IntercomPreviewActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return PreviewViewModel.INSTANCE.create$intercom_sdk_ui_release(this$0, this$0.getPreviewData());
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntercomPreviewActivity intercomPreviewActivity = this;
        EdgeToEdge.enable$default(intercomPreviewActivity, null, null, 3, null);
        WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView()).setAppearanceLightStatusBars(false);
        ComponentActivityKt.setContent$default(intercomPreviewActivity, null, ComposableLambdaKt.composableLambdaInstance(-2110849940, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                PreviewViewModel viewModel;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    viewModel = IntercomPreviewActivity.this.getViewModel();
                    if (((PreviewUiState) SnapshotStateKt.collectAsState(viewModel.getState$intercom_sdk_ui_release(), null, composer, 8, 1).getValue()).getFiles().isEmpty()) {
                        IntercomPreviewActivity.this.finishWithResult(0, CollectionsKt.emptyList());
                    }
                    IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(1935728022, true, new AnonymousClass1(IntercomPreviewActivity.this), composer, 54), composer, 3072, 7);
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* compiled from: IntercomPreviewActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ IntercomPreviewActivity this$0;

                AnonymousClass1(IntercomPreviewActivity intercomPreviewActivity) {
                    this.this$0 = intercomPreviewActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    IntercomPreviewArgs previewData;
                    PreviewViewModel viewModel;
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        previewData = this.this$0.getPreviewData();
                        viewModel = this.this$0.getViewModel();
                        final IntercomPreviewActivity intercomPreviewActivity = this.this$0;
                        Function0 function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: CONSTRUCTOR (r3v0 'function0' kotlin.jvm.functions.Function0) = (r11v4 'intercomPreviewActivity' io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity A[DONT_INLINE]) A[DECLARE_VAR, MD:(io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity):void (m)] call: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda0.<init>(io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity):void type: CONSTRUCTOR in method: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 23 more
                            */
                        /*
                            this = this;
                            r11 = r11 & 11
                            r0 = 2
                            if (r11 != r0) goto L10
                            boolean r11 = r10.getSkipping()
                            if (r11 != 0) goto Lc
                            goto L10
                        Lc:
                            r10.skipToGroupEnd()
                            return
                        L10:
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity r11 = r9.this$0
                            io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs r1 = io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity.access$getPreviewData(r11)
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity r11 = r9.this$0
                            io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel r2 = io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity.access$getViewModel(r11)
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity r11 = r9.this$0
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda0 r3 = new io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda0
                            r3.<init>(r11)
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity r11 = r9.this$0
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda1 r4 = new io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda1
                            r4.<init>(r11)
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity r11 = r9.this$0
                            io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda2 r5 = new io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1$$ExternalSyntheticLambda2
                            r5.<init>(r11)
                            r7 = 576(0x240, float:8.07E-43)
                            r8 = 1
                            r0 = 0
                            r6 = r10
                            io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt.PreviewRootScreen(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$0(IntercomPreviewActivity this$0) {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finishWithResult(0, CollectionsKt.emptyList());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1(IntercomPreviewActivity this$0, IntercomPreviewFile it) {
                        PreviewViewModel viewModel;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        viewModel = this$0.getViewModel();
                        viewModel.onDeleteClicked$intercom_sdk_ui_release(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2(IntercomPreviewActivity this$0, List it) {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.finishWithResult(-1, it);
                        return Unit.INSTANCE;
                    }
                }
            }), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IntercomPreviewArgs getPreviewData() {
            IntercomPreviewArgs intercomPreviewArgs;
            Bundle extras = getIntent().getExtras();
            return (extras == null || (intercomPreviewArgs = (IntercomPreviewArgs) BundleCompat.getParcelable(extras, "INTERCOM_PREVIEW_ARGS", IntercomPreviewArgs.class)) == null) ? new IntercomPreviewArgs(null, null, null, false, null, 31, null) : intercomPreviewArgs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void finishWithResult(int resultCode, List<? extends Uri> uris) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("MEDIA_RESULT_URIS", new ArrayList<>(uris));
            setResult(resultCode, intent);
            finish();
        }

        /* compiled from: IntercomPreviewActivity.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/ui/preview/ui/IntercomPreviewActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", StepData.ARGS, "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Intent createIntent(Context context, IntercomPreviewArgs args) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(args, "args");
                Intent intent = new Intent(context, (Class<?>) IntercomPreviewActivity.class);
                intent.putExtra("INTERCOM_PREVIEW_ARGS", args);
                return intent;
            }
        }
    }
