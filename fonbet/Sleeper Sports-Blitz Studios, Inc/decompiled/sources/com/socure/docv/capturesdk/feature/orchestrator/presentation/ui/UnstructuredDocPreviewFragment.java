package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MimeTypes;
import androidx.media3.datasource.cache.CacheDataSink;
import com.braze.models.BrazeGeofence;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.core.storage.Cache;
import com.socure.docv.capturesdk.databinding.FragmentUnstructuredDocPreviewSocureBinding;
import com.socure.docv.capturesdk.di.ComponentProvider;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.models.PrimaryModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: UnstructuredDocPreviewFragment.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\bH\u0002J\u0010\u0010.\u001a\u00020*2\u0006\u0010$\u001a\u00020\bH\u0002J\u0010\u0010/\u001a\u0002002\u0006\u0010$\u001a\u00020\bH\u0002J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u001cH\u0002J\b\u00105\u001a\u00020\"H\u0016J\u001a\u00106\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u00020\"H\u0002J\u0010\u0010<\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010$\u001a\u00020\bH\u0002J\u0014\u0010?\u001a\u00020\"*\u00020@2\u0006\u0010\r\u001a\u00020(H\u0002J\u0014\u0010A\u001a\u00020\"*\u00020B2\u0006\u0010C\u001a\u00020DH\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010¨\u0006F"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocPreviewFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "component", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "getComponent", "()Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "fileUri", "Landroid/net/Uri;", "getFileUri", "()Landroid/net/Uri;", "setFileUri", "(Landroid/net/Uri;)V", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "getModel", "()Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "setModel", "(Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;)V", "progressDialog", "Landroidx/appcompat/app/AlertDialog;", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionModel", "()Lcom/socure/docv/capturesdk/models/StartSessionModel;", "unstructuredModel", "getUnstructuredModel", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "cancelAndGoBack", "", "compressImage", "uri", "createMultipartBodyPart", "Lokhttp3/MultipartBody$Part;", "createPreviewModel", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocPreviewModel;", "formatSize", "", RRWebVideoEvent.JsonKeys.SIZE, "", "getFileNameFromUri", "getFileSize", "isImage", "", "loadScaledBitmap", "Landroid/graphics/Bitmap;", "imageUri", "maxDimension", "onDestroy", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showProgressDialog", "submitDocument", "toFile", "Ljava/io/File;", "bindModel", "Lcom/socure/docv/capturesdk/databinding/FragmentUnstructuredDocPreviewSocureBinding;", "roundCorners", "Landroid/widget/ImageView;", BrazeGeofence.RADIUS_METERS, "", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocPreviewFragment extends BottomSheetDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Uri fileUri;
    private UnstructuredModuleModel model;
    private AlertDialog progressDialog;

    public UnstructuredDocPreviewFragment() {
        super(R.layout.fragment_unstructured_doc_preview_socure);
    }

    private final OrchestratorActivityComponent getComponent() {
        KeyEventDispatcher.Component requireActivity = requireActivity();
        ComponentProvider componentProvider = requireActivity instanceof ComponentProvider ? (ComponentProvider) requireActivity : null;
        if (componentProvider != null) {
            return (OrchestratorActivityComponent) componentProvider.getComponent();
        }
        return null;
    }

    /* renamed from: getUnstructuredModel, reason: from getter */
    private final UnstructuredModuleModel getModel() {
        return this.model;
    }

    private final StartSessionModel getStartSessionModel() {
        Cache<StartSessionModel> startSessionCache;
        OrchestratorActivityComponent component = getComponent();
        if (component == null || (startSessionCache = component.getStartSessionCache()) == null) {
            return null;
        }
        return startSessionCache.get();
    }

    public final Uri getFileUri() {
        return this.fileUri;
    }

    public final void setFileUri(Uri uri) {
        this.fileUri = uri;
    }

    public final UnstructuredModuleModel getModel() {
        return this.model;
    }

    public final void setModel(UnstructuredModuleModel unstructuredModuleModel) {
        this.model = unstructuredModuleModel;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentUnstructuredDocPreviewSocureBinding onViewCreated$lambda$0 = FragmentUnstructuredDocPreviewSocureBinding.bind(view);
        Uri uri = this.fileUri;
        if (uri != null) {
            Intrinsics.checkNotNull(uri);
            if (uri.getPath() != null && getModel() != null) {
                Uri uri2 = this.fileUri;
                Intrinsics.checkNotNull(uri2);
                if (!isImage(uri2)) {
                    Uri uri3 = this.fileUri;
                    Intrinsics.checkNotNull(uri3);
                    if (toFile(uri3).length() >= CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
                        Fragment parentFragment = getParentFragment();
                        UnstructuredDocContainerFragment unstructuredDocContainerFragment = parentFragment instanceof UnstructuredDocContainerFragment ? (UnstructuredDocContainerFragment) parentFragment : null;
                        if (unstructuredDocContainerFragment != null) {
                            unstructuredDocContainerFragment.showErrorDialog();
                            return;
                        }
                        return;
                    }
                }
                Uri uri4 = this.fileUri;
                Intrinsics.checkNotNull(uri4);
                UnstructuredDocPreviewModel createPreviewModel = createPreviewModel(uri4);
                Intrinsics.checkNotNullExpressionValue(onViewCreated$lambda$0, "onViewCreated$lambda$0");
                bindModel(onViewCreated$lambda$0, createPreviewModel);
                return;
            }
        }
        FragmentActivity requireActivity = requireActivity();
        OrchestratorActivity orchestratorActivity = requireActivity instanceof OrchestratorActivity ? (OrchestratorActivity) requireActivity : null;
        if (orchestratorActivity != null) {
            orchestratorActivity.backToCallerUnknown();
        }
    }

    private final UnstructuredDocPreviewModel createPreviewModel(Uri fileUri) {
        String str;
        UnstructuredModuleModel model = getModel();
        String currentDocument = model != null ? model.getCurrentDocument() : null;
        if (currentDocument == null) {
            currentDocument = "";
        }
        String fileNameFromUri = getFileNameFromUri(fileUri);
        if (fileNameFromUri == null) {
            fileNameFromUri = "";
            str = fileNameFromUri;
        } else {
            str = "";
        }
        String fileSize = getFileSize(fileUri);
        UnstructuredModuleModel model2 = getModel();
        String submitButton = model2 != null ? model2.getSubmitButton() : null;
        if (submitButton == null) {
            submitButton = str;
        }
        UnstructuredModuleModel model3 = getModel();
        String retryButton = model3 != null ? model3.getRetryButton() : null;
        if (retryButton == null) {
            retryButton = str;
        }
        return new UnstructuredDocPreviewModel(currentDocument, fileNameFromUri, fileSize, fileUri, submitButton, retryButton, !isImage(fileUri));
    }

    private final String getFileNameFromUri(Uri uri) {
        int columnIndex;
        Cursor query = requireContext().getContentResolver().query(uri, null, null, null, null);
        String str = null;
        if (query != null) {
            Cursor cursor = query;
            try {
                Cursor cursor2 = cursor;
                String string = (!cursor2.moveToFirst() || (columnIndex = cursor2.getColumnIndex("_display_name")) == -1) ? null : cursor2.getString(columnIndex);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
                str = string;
            } finally {
            }
        }
        return str == null ? uri.getLastPathSegment() : str;
    }

    private final void bindModel(FragmentUnstructuredDocPreviewSocureBinding fragmentUnstructuredDocPreviewSocureBinding, final UnstructuredDocPreviewModel unstructuredDocPreviewModel) {
        UnstructuredModuleModel.MobileLabels mobile;
        fragmentUnstructuredDocPreviewSocureBinding.tvDocument.setText(unstructuredDocPreviewModel.getDocumentName());
        TextView textView = fragmentUnstructuredDocPreviewSocureBinding.tvFileName;
        UnstructuredModuleModel model = getModel();
        String nextDocument = (model == null || (mobile = model.getMobile()) == null) ? null : mobile.getNextDocument();
        if (nextDocument == null) {
            nextDocument = "";
        }
        textView.setText(nextDocument);
        fragmentUnstructuredDocPreviewSocureBinding.fileItem.tvFileName.setText(unstructuredDocPreviewModel.getFileName());
        fragmentUnstructuredDocPreviewSocureBinding.fileItem.tvFileSize.setText(unstructuredDocPreviewModel.getFileSize());
        if (unstructuredDocPreviewModel.isDocument()) {
            fragmentUnstructuredDocPreviewSocureBinding.fileItem.ivFilePreview.setImageResource(R.drawable.ic_document);
            ImageView imageView = fragmentUnstructuredDocPreviewSocureBinding.fileItem.ivFilePreview;
            Intrinsics.checkNotNullExpressionValue(imageView, "fileItem.ivFilePreview");
            roundCorners(imageView, 20.0f);
            fragmentUnstructuredDocPreviewSocureBinding.fileItem.ivFilePreview.setVisibility(0);
            fragmentUnstructuredDocPreviewSocureBinding.fileItem.ivPhotoPreview.setVisibility(4);
        } else {
            fragmentUnstructuredDocPreviewSocureBinding.fileItem.ivFilePreview.setVisibility(4);
            fragmentUnstructuredDocPreviewSocureBinding.fileItem.ivPhotoPreview.setVisibility(0);
            ImageView imageView2 = fragmentUnstructuredDocPreviewSocureBinding.fileItem.ivPhotoPreview;
            Intrinsics.checkNotNullExpressionValue(imageView2, "fileItem.ivPhotoPreview");
            roundCorners(imageView2, 20.0f);
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new UnstructuredDocPreviewFragment$bindModel$1(this, unstructuredDocPreviewModel, fragmentUnstructuredDocPreviewSocureBinding, null), 3, null);
        }
        fragmentUnstructuredDocPreviewSocureBinding.btnUpload.setText(unstructuredDocPreviewModel.getSubmitButtonText());
        try {
            Result.Companion companion = Result.INSTANCE;
            StartSessionModel startSessionModel = getStartSessionModel();
            Intrinsics.checkNotNull(startSessionModel);
            PrimaryModel primary = startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary();
            AppCompatButton btnUpload = fragmentUnstructuredDocPreviewSocureBinding.btnUpload;
            Intrinsics.checkNotNullExpressionValue(btnUpload, "btnUpload");
            ExtensionsKt.setCorner(btnUpload, primary.getButton().getPrimary().getBackgroundColor(), primary.getButton().getPrimary().getBorderColor());
            AppCompatButton btnUpload2 = fragmentUnstructuredDocPreviewSocureBinding.btnUpload;
            Intrinsics.checkNotNullExpressionValue(btnUpload2, "btnUpload");
            ExtensionsKt.setupText$default(btnUpload2, unstructuredDocPreviewModel.getSubmitButtonText(), primary.getButton().getPrimary().getColor(), null, 4, null);
            Result.m13470constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        fragmentUnstructuredDocPreviewSocureBinding.btnScanCancel.setText(unstructuredDocPreviewModel.getCancelButtonText());
        try {
            Result.Companion companion3 = Result.INSTANCE;
            StartSessionModel startSessionModel2 = getStartSessionModel();
            Intrinsics.checkNotNull(startSessionModel2);
            PrimaryModel primary2 = startSessionModel2.getGlobalConfig().getCustomization().getTheme().getPrimary();
            AppCompatButton btnScanCancel = fragmentUnstructuredDocPreviewSocureBinding.btnScanCancel;
            Intrinsics.checkNotNullExpressionValue(btnScanCancel, "btnScanCancel");
            ExtensionsKt.setCorner(btnScanCancel, primary2.getButton().getSecondary().getBackgroundColor(), primary2.getButton().getSecondary().getBorderColor());
            AppCompatButton btnScanCancel2 = fragmentUnstructuredDocPreviewSocureBinding.btnScanCancel;
            Intrinsics.checkNotNullExpressionValue(btnScanCancel2, "btnScanCancel");
            ExtensionsKt.setupText$default(btnScanCancel2, unstructuredDocPreviewModel.getCancelButtonText(), primary2.getButton().getSecondary().getColor(), null, 4, null);
            Result.m13470constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m13470constructorimpl(ResultKt.createFailure(th2));
        }
        fragmentUnstructuredDocPreviewSocureBinding.btnUpload.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnstructuredDocPreviewFragment.bindModel$lambda$6(UnstructuredDocPreviewFragment.this, unstructuredDocPreviewModel, view);
            }
        });
        fragmentUnstructuredDocPreviewSocureBinding.btnScanCancel.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnstructuredDocPreviewFragment.bindModel$lambda$7(UnstructuredDocPreviewFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindModel$lambda$6(UnstructuredDocPreviewFragment this$0, UnstructuredDocPreviewModel model, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        this$0.submitDocument(model.getFileThumbnail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindModel$lambda$7(UnstructuredDocPreviewFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancelAndGoBack();
    }

    private final void roundCorners(ImageView imageView, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f);
        imageView.setBackground(gradientDrawable);
        imageView.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isImage(Uri uri) {
        ContentResolver contentResolver = requireContext().getContentResolver();
        String type = contentResolver.getType(uri);
        if (type != null) {
            return StringsKt.startsWith$default(type, "image/", false, 2, (Object) null);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        if (fileExtensionFromUrl != null) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
            return mimeTypeFromExtension != null && StringsKt.startsWith$default(mimeTypeFromExtension, "image/", false, 2, (Object) null);
        }
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap loadScaledBitmap(Uri imageUri, int maxDimension) {
        InputStream inputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream openInputStream = requireContext().getContentResolver().openInputStream(imageUri);
        if (openInputStream != null) {
            inputStream = openInputStream;
            try {
                BitmapFactory.decodeStream(inputStream, null, options);
                CloseableKt.closeFinally(inputStream, null);
            } finally {
            }
        }
        int calculateInSampleSize = calculateInSampleSize(options, maxDimension, maxDimension);
        options.inJustDecodeBounds = false;
        options.inSampleSize = calculateInSampleSize;
        InputStream openInputStream2 = requireContext().getContentResolver().openInputStream(imageUri);
        if (openInputStream2 == null) {
            return null;
        }
        inputStream = openInputStream2;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            CloseableKt.closeFinally(inputStream, null);
            return decodeStream;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        int i = 1;
        if (intValue <= reqHeight && intValue2 <= reqWidth) {
            return 1;
        }
        int i2 = intValue / 2;
        int i3 = intValue2 / 2;
        while (i2 / i >= reqHeight && i3 / i >= reqWidth) {
            i *= 2;
        }
        return i;
    }

    private final String getFileSize(Uri uri) {
        long j;
        int columnIndex;
        Cursor query = requireContext().getContentResolver().query(uri, null, null, null, null);
        if (query != null) {
            Cursor cursor = query;
            try {
                Cursor cursor2 = cursor;
                long j2 = (!cursor2.moveToFirst() || (columnIndex = cursor2.getColumnIndex("_size")) == -1) ? 0L : cursor2.getLong(columnIndex);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
                j = j2;
            } finally {
            }
        } else {
            j = 0;
        }
        if (j == 0) {
            try {
                InputStream openInputStream = requireContext().getContentResolver().openInputStream(uri);
                j = openInputStream != null ? openInputStream.available() : 0L;
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (j == 0 && Intrinsics.areEqual(uri.getScheme(), "file")) {
            String path = uri.getPath();
            Intrinsics.checkNotNull(path);
            j = new File(path).length();
        }
        return formatSize(j);
    }

    private final String formatSize(long size) {
        if (size <= 0) {
            return "0 B";
        }
        double d = size;
        int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1024.0d, log10)), new String[]{"B", "KB", "MB", "GB", "TB"}[log10]}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final void showProgressDialog() {
        UnstructuredModuleModel.SubmitButtonMessages submitButtonMessages;
        ProgressBar progressBar = new ProgressBar(requireContext());
        progressBar.setIndeterminate(true);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.addView(progressBar);
        frameLayout.setPadding(0, 0, 0, frameLayout.getResources().getDimensionPixelSize(R.dimen.dialog_margin));
        MaterialAlertDialogBuilder view = new MaterialAlertDialogBuilder(requireContext()).setView((View) frameLayout);
        UnstructuredModuleModel model = getModel();
        String str = null;
        MaterialAlertDialogBuilder title = view.setTitle((CharSequence) (model != null ? model.getUploading() : null));
        UnstructuredModuleModel model2 = getModel();
        if (model2 != null && (submitButtonMessages = model2.getSubmitButtonMessages()) != null) {
            str = submitButtonMessages.getProcessing();
        }
        AlertDialog create = title.setMessage((CharSequence) str).setCancelable(false).create();
        this.progressDialog = create;
        if (create != null) {
            create.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.progressDialog = null;
        super.onDestroy();
    }

    private final void submitDocument(Uri fileUri) {
        showProgressDialog();
        OrchestratorActivityComponent component = getComponent();
        if (component != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new UnstructuredDocPreviewFragment$submitDocument$1(this, fileUri, component, null), 2, null);
        } else {
            FragmentActivity requireActivity = requireActivity();
            OrchestratorActivity orchestratorActivity = requireActivity instanceof OrchestratorActivity ? (OrchestratorActivity) requireActivity : null;
            if (orchestratorActivity != null) {
                orchestratorActivity.backToCallerUnknown();
            }
        }
    }

    private final File toFile(Uri uri) {
        InputStream openInputStream = requireContext().getContentResolver().openInputStream(uri);
        File file = new File(requireContext().getCacheDir(), "original_" + System.currentTimeMillis());
        if (openInputStream == null) {
            return file;
        }
        FileOutputStream fileOutputStream = openInputStream;
        try {
            InputStream inputStream = fileOutputStream;
            fileOutputStream = new FileOutputStream(file);
            try {
                long copyTo$default = ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                Long.valueOf(copyTo$default);
                CloseableKt.closeFinally(fileOutputStream, null);
                return file;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri compressImage(Uri uri) {
        Bitmap.CompressFormat compressFormat;
        File file = toFile(uri);
        if (file.length() <= CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
            return uri;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        String type = requireContext().getContentResolver().getType(uri);
        if (type != null && type.hashCode() == -879258763 && type.equals(MimeTypes.IMAGE_PNG)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        File file2 = new File(requireContext().getCacheDir(), "compressed_" + System.currentTimeMillis());
        for (int i = 100; i > 5; i -= 5) {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                if (decodeFile != null) {
                    Boolean.valueOf(decodeFile.compress(compressFormat, i, fileOutputStream2));
                }
                CloseableKt.closeFinally(fileOutputStream, null);
                if (file2.length() <= CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
                    if (decodeFile != null) {
                        decodeFile.recycle();
                    }
                    file.delete();
                    return Uri.fromFile(file2);
                }
            } finally {
            }
        }
        if (decodeFile != null) {
            decodeFile.recycle();
        }
        file2.delete();
        file.delete();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultipartBody.Part createMultipartBodyPart(Uri fileUri) {
        byte[] readBytes;
        InputStream openInputStream = requireContext().getContentResolver().openInputStream(fileUri);
        RequestBody create$default = (openInputStream == null || (readBytes = ByteStreamsKt.readBytes(openInputStream)) == null) ? null : RequestBody.Companion.create$default(RequestBody.INSTANCE, readBytes, MediaType.INSTANCE.parse(ShareTarget.ENCODING_TYPE_MULTIPART), 0, 0, 6, (Object) null);
        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
        Intrinsics.checkNotNull(create$default);
        return companion.createFormData(ApiConstant.DOCUMENT_UNSTRUCTURED, ApiConstant.DOCUMENT_UNSTRUCTURED, create$default);
    }

    private final void cancelAndGoBack() {
        dismiss();
    }

    /* compiled from: UnstructuredDocPreviewFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocPreviewFragment$Companion;", "", "()V", "newInstance", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocPreviewFragment;", "uri", "Landroid/net/Uri;", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnstructuredDocPreviewFragment newInstance(Uri uri, UnstructuredModuleModel model) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(model, "model");
            UnstructuredDocPreviewFragment unstructuredDocPreviewFragment = new UnstructuredDocPreviewFragment();
            unstructuredDocPreviewFragment.setFileUri(uri);
            unstructuredDocPreviewFragment.setModel(model);
            return unstructuredDocPreviewFragment;
        }
    }
}
