package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import He.b;
import Sc.r;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.RejectReconciliationActRequestDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 I2\u00020\u0001:\u0001IB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u00162\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\"\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R%\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019058\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020=058\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u00109R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00102R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f058\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00102R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\b058\u0006¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u00109R\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;", "fileHelper", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerRepository;)V", "", "postData", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "getDocumentId", "(Ljava/lang/String;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "validateFields", "()Z", "documentId", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActRequestDTO;", "getRejectReconciliationActRequest", "(Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActRequestDTO;", "", "flashbarMessageShowed", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "attachField", "initAttachField", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;)V", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;", "fields", "initDefaultFields", "(Ljava/util/List;)V", "input", "", "position", "updateInput", "(Ljava/lang/String;Ljava/lang/Integer;)V", "actionName", "submitDecline", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "uploadFile", "(Landroid/net/Uri;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerRepository;", "LAe/x0;", "_inputReason", "LAe/x0;", "_inputEmail", "_inputFields", "LAe/M0;", "inputFields", "LAe/M0;", "getInputFields", "()LAe/M0;", "_fileField", "fileField", "getFileField", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/FlashBarErrorWrapper;", "_flashbarErrorMessage", "flashbarErrorMessage", "getFlashbarErrorMessage", "_showGeneralLoader", "showGeneralLoader", "getShowGeneralLoader", "_deepLinkAction", "deepLinkAction", "getDeepLinkAction", "fileKey", "Ljava/lang/String;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReconciliationActsDeclinerViewModel extends w0 {

    @NotNull
    private final x0<String> _deepLinkAction;

    @NotNull
    private final x0<ReconciliationActsDeclinerVO.AttachField> _fileField;

    @NotNull
    private final x0<FlashBarErrorWrapper> _flashbarErrorMessage;

    @NotNull
    private final x0<ReconciliationActsDeclinerVO.TextField> _inputEmail;

    @NotNull
    private final x0<List<ReconciliationActsDeclinerVO.TextField>> _inputFields;

    @NotNull
    private final x0<ReconciliationActsDeclinerVO.TextField> _inputReason;

    @NotNull
    private final x0<Boolean> _showGeneralLoader;

    @NotNull
    private final M0<String> deepLinkAction;

    @NotNull
    private final M0<ReconciliationActsDeclinerVO.AttachField> fileField;

    @NotNull
    private final FileHelper fileHelper;

    @NotNull
    private String fileKey;

    @NotNull
    private final M0<FlashBarErrorWrapper> flashbarErrorMessage;

    @NotNull
    private final M0<List<ReconciliationActsDeclinerVO.TextField>> inputFields;

    @NotNull
    private final ReconciliationActsDeclinerRepository repository;

    @NotNull
    private final M0<Boolean> showGeneralLoader;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerViewModel$Companion;", "", "<init>", "()V", "REASON_POSITION", "", "EMAIL_POSITION", "DOCUMENT_ID_PARAM_NAME", "", "UPLOAD_ERROR", "FILE_NAME", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReconciliationActsDeclinerViewModel(@NotNull FileHelper fileHelper, @NotNull ReconciliationActsDeclinerRepository repository) {
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.fileHelper = fileHelper;
        this.repository = repository;
        this._inputReason = O0.a(null);
        this._inputEmail = O0.a(null);
        x0<List<ReconciliationActsDeclinerVO.TextField>> a11 = O0.a(K.f71697a);
        this._inputFields = a11;
        this.inputFields = C2399j.b(a11);
        x0<ReconciliationActsDeclinerVO.AttachField> a12 = O0.a(null);
        this._fileField = a12;
        this.fileField = C2399j.b(a12);
        x0<FlashBarErrorWrapper> a13 = O0.a(new FlashBarErrorWrapper(""));
        this._flashbarErrorMessage = a13;
        this.flashbarErrorMessage = C2399j.b(a13);
        x0<Boolean> a14 = O0.a(Boolean.FALSE);
        this._showGeneralLoader = a14;
        this.showGeneralLoader = C2399j.b(a14);
        x0<String> a15 = O0.a("");
        this._deepLinkAction = a15;
        this.deepLinkAction = C2399j.b(a15);
        this.fileKey = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:17)(2:14|15)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        r7 = Sc.r.INSTANCE;
        r8 = Sc.s.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDocumentId(String str, JsonParser jsonParser, d<? super String> dVar) {
        ReconciliationActsDeclinerViewModel$getDocumentId$1 reconciliationActsDeclinerViewModel$getDocumentId$1;
        int i11;
        Object a11;
        if (dVar instanceof ReconciliationActsDeclinerViewModel$getDocumentId$1) {
            reconciliationActsDeclinerViewModel$getDocumentId$1 = (ReconciliationActsDeclinerViewModel$getDocumentId$1) dVar;
            int i12 = reconciliationActsDeclinerViewModel$getDocumentId$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                reconciliationActsDeclinerViewModel$getDocumentId$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = reconciliationActsDeclinerViewModel$getDocumentId$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = reconciliationActsDeclinerViewModel$getDocumentId$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    ReconciliationActsDeclinerViewModel$getDocumentId$result$1$1 reconciliationActsDeclinerViewModel$getDocumentId$result$1$1 = new ReconciliationActsDeclinerViewModel$getDocumentId$result$1$1(jsonParser, str, null);
                    reconciliationActsDeclinerViewModel$getDocumentId$1.label = 1;
                    obj = C10727i.f(bVar, reconciliationActsDeclinerViewModel$getDocumentId$result$1$1, reconciliationActsDeclinerViewModel$getDocumentId$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                a11 = (String) obj;
                r.Companion companion2 = r.INSTANCE;
                if (a11 instanceof r.b) {
                    return a11;
                }
                return null;
            }
        }
        reconciliationActsDeclinerViewModel$getDocumentId$1 = new ReconciliationActsDeclinerViewModel$getDocumentId$1(this, dVar);
        Object obj2 = reconciliationActsDeclinerViewModel$getDocumentId$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = reconciliationActsDeclinerViewModel$getDocumentId$1.label;
        if (i11 != 0) {
        }
        a11 = (String) obj2;
        r.Companion companion22 = r.INSTANCE;
        if (a11 instanceof r.b) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RejectReconciliationActRequestDTO getRejectReconciliationActRequest(String documentId) {
        String str;
        String value;
        ReconciliationActsDeclinerVO.TextField value2 = this._inputEmail.getValue();
        String str2 = "";
        if (value2 == null || (str = value2.getValue()) == null) {
            str = "";
        }
        ReconciliationActsDeclinerVO.TextField value3 = this._inputReason.getValue();
        if (value3 != null && (value = value3.getValue()) != null) {
            str2 = value;
        }
        return new RejectReconciliationActRequestDTO(documentId, this.fileKey, str, str2);
    }

    private final boolean validateFields() {
        ReconciliationActsDeclinerVO.TextField textField;
        ReconciliationActsDeclinerVO.TextField textField2;
        ReconciliationActsDeclinerVO.AttachField attachField;
        String value;
        String value2;
        x0<ReconciliationActsDeclinerVO.TextField> x0Var = this._inputReason;
        ReconciliationActsDeclinerVO.TextField value3 = x0Var.getValue();
        if (value3 != null) {
            ReconciliationActsDeclinerVO.TextField value4 = this._inputReason.getValue();
            textField = ReconciliationActsDeclinerVO.TextField.copy$default(value3, null, null, null, null, null, (value4 == null || (value2 = value4.getValue()) == null || value2.length() != 0) ? false : true, 31, null);
        } else {
            textField = null;
        }
        x0Var.setValue(textField);
        x0<ReconciliationActsDeclinerVO.TextField> x0Var2 = this._inputEmail;
        ReconciliationActsDeclinerVO.TextField value5 = x0Var2.getValue();
        if (value5 != null) {
            ReconciliationActsDeclinerVO.TextField value6 = this._inputEmail.getValue();
            textField2 = ReconciliationActsDeclinerVO.TextField.copy$default(value5, null, null, null, null, null, (value6 == null || (value = value6.getValue()) == null || value.length() != 0) ? false : true, 31, null);
        } else {
            textField2 = null;
        }
        x0Var2.setValue(textField2);
        this._inputFields.setValue(C7714v.b0(this._inputReason.getValue(), this._inputEmail.getValue()));
        ReconciliationActsDeclinerVO.AttachField value7 = this._fileField.getValue();
        if (!((value7 != null ? value7.getStatus() : null) instanceof ReconciliationActsDeclinerVO.Status.Success)) {
            x0<ReconciliationActsDeclinerVO.AttachField> x0Var3 = this._fileField;
            ReconciliationActsDeclinerVO.AttachField value8 = x0Var3.getValue();
            if (value8 != null) {
                ReconciliationActsDeclinerVO.AttachField value9 = this._fileField.getValue();
                Intrinsics.f(value9);
                attachField = ReconciliationActsDeclinerVO.AttachField.copy$default(value8, null, null, null, 0, null, new ReconciliationActsDeclinerVO.Status.UnknownError(value9.getLexemes().get("errorRequiredText")), null, 95, null);
            } else {
                attachField = null;
            }
            x0Var3.setValue(attachField);
        }
        List<ReconciliationActsDeclinerVO.TextField> value10 = this._inputFields.getValue();
        if (!(value10 instanceof Collection) || !value10.isEmpty()) {
            for (ReconciliationActsDeclinerVO.TextField textField3 : value10) {
                if (textField3 == null || textField3.getHasError()) {
                    break;
                }
            }
        }
        ReconciliationActsDeclinerVO.AttachField value11 = this._fileField.getValue();
        return (value11 != null ? value11.getStatus() : null) instanceof ReconciliationActsDeclinerVO.Status.Success;
    }

    public final void flashbarMessageShowed() {
        this._flashbarErrorMessage.setValue(new FlashBarErrorWrapper(""));
    }

    @NotNull
    public final M0<String> getDeepLinkAction() {
        return this.deepLinkAction;
    }

    @NotNull
    public final M0<ReconciliationActsDeclinerVO.AttachField> getFileField() {
        return this.fileField;
    }

    @NotNull
    public final M0<FlashBarErrorWrapper> getFlashbarErrorMessage() {
        return this.flashbarErrorMessage;
    }

    @NotNull
    public final M0<List<ReconciliationActsDeclinerVO.TextField>> getInputFields() {
        return this.inputFields;
    }

    @NotNull
    public final M0<Boolean> getShowGeneralLoader() {
        return this.showGeneralLoader;
    }

    public final void initAttachField(@NotNull ReconciliationActsDeclinerVO.AttachField attachField) {
        Intrinsics.checkNotNullParameter(attachField, "attachField");
        this._fileField.setValue(attachField);
    }

    public final void initDefaultFields(@NotNull List<ReconciliationActsDeclinerVO.TextField> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this._inputFields.setValue(fields);
        this._inputReason.setValue(fields.get(0));
        this._inputEmail.setValue(fields.get(1));
    }

    public final void submitDecline(@NotNull JsonParser jsonDeserializer, @NotNull String actionName, @NotNull String postData) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(postData, "postData");
        if (validateFields()) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ReconciliationActsDeclinerViewModel$submitDecline$1(this, postData, jsonDeserializer, actionName, null), 3);
        }
    }

    public final void updateInput(@NotNull String input, Integer position) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (position != null && position.intValue() == 0) {
            x0<ReconciliationActsDeclinerVO.TextField> x0Var = this._inputReason;
            ReconciliationActsDeclinerVO.TextField value = x0Var.getValue();
            x0Var.setValue(value != null ? ReconciliationActsDeclinerVO.TextField.copy$default(value, null, null, null, null, input, false, 47, null) : null);
        } else if (position != null && position.intValue() == 1) {
            x0<ReconciliationActsDeclinerVO.TextField> x0Var2 = this._inputEmail;
            ReconciliationActsDeclinerVO.TextField value2 = x0Var2.getValue();
            x0Var2.setValue(value2 != null ? ReconciliationActsDeclinerVO.TextField.copy$default(value2, null, null, null, null, input, false, 47, null) : null);
        }
    }

    public final void uploadFile(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ReconciliationActsDeclinerVO.AttachField value = this._fileField.getValue();
        this._fileField.setValue(value != null ? this.fileHelper.validateFile(uri, value, new ReconciliationActsDeclinerViewModel$uploadFile$newFile$1$1(this, uri)) : null);
    }
}
