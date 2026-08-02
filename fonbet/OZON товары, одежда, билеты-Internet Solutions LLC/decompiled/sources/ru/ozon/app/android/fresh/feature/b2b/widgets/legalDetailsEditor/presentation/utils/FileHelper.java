package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils;

import We.D;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0011\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00132\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;", "", "Landroid/net/Uri;", "uri", "", "getFileName", "(Landroid/net/Uri;)Ljava/lang/String;", "getFileExtension", AppMeasurementSdk.ConditionalUserProperty.NAME, "LWe/D$c;", "createMultipartBodyPart", "(Ljava/lang/String;Landroid/net/Uri;)LWe/D$c;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "field", "Lkotlin/Function0;", "", "loadDocumentAction", "validateFile", "(Landroid/net/Uri;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "(Landroid/net/Uri;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FileHelper {
    @NotNull
    D.c createMultipartBodyPart(@NotNull String name, @NotNull Uri uri);

    @NotNull
    String getFileExtension(@NotNull Uri uri);

    String getFileName(@NotNull Uri uri);

    LegalDetailsEditorVO.FileFieldVO validateFile(@NotNull Uri uri, @NotNull LegalDetailsEditorVO.FileFieldVO field, Function0<Unit> loadDocumentAction);

    ReconciliationActsDeclinerVO.AttachField validateFile(@NotNull Uri uri, @NotNull ReconciliationActsDeclinerVO.AttachField field, Function0<Unit> loadDocumentAction);
}
