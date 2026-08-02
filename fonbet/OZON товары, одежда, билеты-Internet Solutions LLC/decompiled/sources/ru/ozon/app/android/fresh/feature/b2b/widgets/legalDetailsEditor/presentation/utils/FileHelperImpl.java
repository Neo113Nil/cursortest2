package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils;

import Sc.r;
import Sc.s;
import We.D;
import We.J;
import We.K;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001d\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelperImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "", "getContentFileName", "(Landroid/net/Uri;Landroid/content/Context;)Ljava/lang/String;", "uri", "getFileName", "(Landroid/net/Uri;)Ljava/lang/String;", "", "getFileSize", "(Landroid/net/Uri;)J", "contentURI", "", "createByteArrayByUri", "(Landroid/net/Uri;)[B", AppMeasurementSdk.ConditionalUserProperty.NAME, "LWe/D$c;", "createMultipartBodyPart", "(Ljava/lang/String;Landroid/net/Uri;)LWe/D$c;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "field", "Lkotlin/Function0;", "", "loadDocumentAction", "validateFile", "(Landroid/net/Uri;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "(Landroid/net/Uri;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "getFileExtension", "Landroid/content/Context;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FileHelperImpl implements FileHelper {

    @NotNull
    private final Context context;
    public static final int $stable = 8;

    public FileHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final String getContentFileName(Uri uri, Context context) {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    query.moveToFirst();
                    a11 = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    query.close();
                    query.close();
                } finally {
                }
            } else {
                a11 = null;
            }
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return (String) (a11 instanceof r.b ? null : a11);
    }

    public byte[] createByteArrayByUri(@NotNull Uri contentURI) {
        Intrinsics.checkNotNullParameter(contentURI, "contentURI");
        InputStream openInputStream = this.context.getContentResolver().openInputStream(contentURI);
        if (openInputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read <= 0) {
                    byteArrayOutputStream.close();
                    openInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    openInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
        }
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper
    @NotNull
    public D.c createMultipartBodyPart(@NotNull String name, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uri, "uri");
        byte[] createByteArrayByUri = createByteArrayByUri(uri);
        if (createByteArrayByUri == null) {
            createByteArrayByUri = new byte[0];
        }
        String fileName = getFileName(uri);
        if (fileName == null) {
            fileName = "";
        }
        D.c.a aVar = D.c.f33553c;
        J d11 = K.Companion.d(K.INSTANCE, createByteArrayByUri, null, 0, 7);
        aVar.getClass();
        return D.c.a.b(fileName, name, d11);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper
    @NotNull
    public String getFileExtension(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(this.context.getContentResolver().getType(uri));
        return extensionFromMimeType == null ? "unknown" : extensionFromMimeType;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper
    public String getFileName(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.d(uri.getScheme(), "content")) {
            return getContentFileName(uri, this.context);
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path).getName();
        }
        return null;
    }

    public long getFileSize(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor query = this.context.getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return -1L;
        }
        try {
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j11 = query.getLong(columnIndex);
            query.close();
            query.close();
            return j11;
        } finally {
        }
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper
    public LegalDetailsEditorVO.FileFieldVO validateFile(@NotNull Uri uri, @NotNull LegalDetailsEditorVO.FileFieldVO field, Function0<Unit> loadDocumentAction) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(field, "field");
        Pair pair = new Pair(Long.valueOf(getFileSize(uri)), getFileExtension(uri));
        long longValue = ((Number) pair.a()).longValue();
        String str = (String) pair.b();
        if (longValue == -1 || Intrinsics.d(str, "unknown")) {
            return LegalDetailsEditorVO.FileFieldVO.copy$default(field, null, null, null, 0L, null, null, new LegalDetailsEditorVO.Status.UnknownError(null), 63, null);
        }
        if (longValue > field.getMaxSize()) {
            return LegalDetailsEditorVO.FileFieldVO.copy$default(field, null, null, null, 0L, null, null, LegalDetailsEditorVO.Status.UploadFileSizeError.INSTANCE, 63, null);
        }
        if (!field.getFormats().contains(str)) {
            return LegalDetailsEditorVO.FileFieldVO.copy$default(field, null, null, null, 0L, null, null, LegalDetailsEditorVO.Status.UploadErrorFileType.INSTANCE, 63, null);
        }
        if (loadDocumentAction != null) {
            loadDocumentAction.invoke();
        }
        return LegalDetailsEditorVO.FileFieldVO.copy$default(field, null, null, null, 0L, null, null, new LegalDetailsEditorVO.Status.Loading(uri, getFileName(uri)), 63, null);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper
    @NotNull
    public ReconciliationActsDeclinerVO.AttachField validateFile(@NotNull Uri uri, @NotNull ReconciliationActsDeclinerVO.AttachField field, Function0<Unit> loadDocumentAction) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(field, "field");
        Pair pair = new Pair(Long.valueOf(getFileSize(uri)), getFileExtension(uri));
        long longValue = ((Number) pair.a()).longValue();
        String str = (String) pair.b();
        if (longValue == -1 || Intrinsics.d(str, "unknown")) {
            return ReconciliationActsDeclinerVO.AttachField.copy$default(field, null, null, null, 0, null, new ReconciliationActsDeclinerVO.Status.UnknownError(null), null, 95, null);
        }
        if (longValue > field.getMaxSize()) {
            return ReconciliationActsDeclinerVO.AttachField.copy$default(field, null, null, null, 0, null, ReconciliationActsDeclinerVO.Status.UploadFileSizeError.INSTANCE, null, 95, null);
        }
        if (!field.getFormats().contains(str)) {
            return ReconciliationActsDeclinerVO.AttachField.copy$default(field, null, null, null, 0, null, ReconciliationActsDeclinerVO.Status.UploadErrorFileType.INSTANCE, null, 95, null);
        }
        if (loadDocumentAction != null) {
            loadDocumentAction.invoke();
        }
        return ReconciliationActsDeclinerVO.AttachField.copy$default(field, null, null, null, 0, null, new ReconciliationActsDeclinerVO.Status.Loading(uri, getFileName(uri)), null, 95, null);
    }
}
