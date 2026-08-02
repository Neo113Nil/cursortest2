package com.socure.docv.capturesdk.di.scanner;

import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.di.fragment.FragmentComponent;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScannerFragmentComponent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", "Lcom/socure/docv/capturesdk/di/fragment/FragmentComponent;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "getScanType", "()Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "scannerShim", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;", "getScannerShim", "()Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ScannerFragmentComponent extends FragmentComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    ScanType getScanType();

    ScannerShim getScannerShim();

    /* compiled from: ScannerFragmentComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent$Companion;", "", "()V", "build", "Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", "fragmentComponent", "Lcom/socure/docv/capturesdk/di/fragment/FragmentComponent;", "scannerShim", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ScannerFragmentComponent build(final FragmentComponent fragmentComponent, final ScannerShim scannerShim, final ScanType scanType) {
            Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
            Intrinsics.checkNotNullParameter(scannerShim, "scannerShim");
            Intrinsics.checkNotNullParameter(scanType, "scanType");
            return new ScannerFragmentComponentImpl(scannerShim, scanType, fragmentComponent) { // from class: com.socure.docv.capturesdk.di.scanner.ScannerFragmentComponent$Companion$build$1
                private final ScanType scanType;
                private final ScannerShim scannerShim;

                {
                    super(fragmentComponent);
                    this.scannerShim = scannerShim;
                    this.scanType = scanType;
                }

                @Override // com.socure.docv.capturesdk.di.scanner.ScannerFragmentComponent
                public ScannerShim getScannerShim() {
                    return this.scannerShim;
                }

                @Override // com.socure.docv.capturesdk.di.scanner.ScannerFragmentComponent
                public ScanType getScanType() {
                    return this.scanType;
                }
            };
        }
    }
}
