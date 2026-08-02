package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import android.net.Uri;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FlashBarErrorWrapper;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u000e2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u0015¢\u0006\u0004\b\u001d\u0010\u0018J#\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010 0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R%\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010 028\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020:028\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00190/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00101R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0019028\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR$\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;", "fileHelper", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorRepository;)V", "Landroid/net/Uri;", "uri", "", "fileName", "", "position", "", "loadDocument", "(Landroid/net/Uri;Ljava/lang/String;I)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "newValue", "updateFileFieldByPosition", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;I)V", "Lkotlin/Function1;", "transform", "postFieldsUpdate", "(Lkotlin/jvm/functions/Function1;)V", "", "validateFields", "()Z", "action", "setDeeplinkActionHandler", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "textField", "", "list", "initFields", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;Ljava/util/List;)V", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "updateAddress", "(Ljava/lang/String;)V", "updateFileFieldsByFilePicker", "(Landroid/net/Uri;I)V", "sendRequest", "()V", "flashbarMessageShowed", "discardWidgetData", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FileHelper;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorRepository;", "LAe/x0;", "_addressQuery", "LAe/x0;", "LAe/M0;", "addressQuery", "LAe/M0;", "getAddressQuery", "()LAe/M0;", "_fileFields", "fileFields", "getFileFields", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FlashBarErrorWrapper;", "_flashbarErrorMessage", "flashbarErrorMessage", "getFlashbarErrorMessage", "_showGeneralLoader", "showGeneralLoader", "getShowGeneralLoader", "", "Lxe/B0;", "fileLoadJobsMap", "Ljava/util/Map;", "fileNameToKeyMap", "deeplinkActionHandler", "Lkotlin/jvm/functions/Function1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDetailsEditorViewModel extends w0 {

    @NotNull
    private final x0<LegalDetailsEditorVO.TextFieldVO> _addressQuery;

    @NotNull
    private final x0<List<LegalDetailsEditorVO.FileFieldVO>> _fileFields;

    @NotNull
    private final x0<FlashBarErrorWrapper> _flashbarErrorMessage;

    @NotNull
    private final x0<Boolean> _showGeneralLoader;

    @NotNull
    private final M0<LegalDetailsEditorVO.TextFieldVO> addressQuery;
    private Function1<? super String, Unit> deeplinkActionHandler;

    @NotNull
    private final M0<List<LegalDetailsEditorVO.FileFieldVO>> fileFields;

    @NotNull
    private final FileHelper fileHelper;

    @NotNull
    private final Map<Integer, B0> fileLoadJobsMap;

    @NotNull
    private final Map<String, String> fileNameToKeyMap;

    @NotNull
    private final M0<FlashBarErrorWrapper> flashbarErrorMessage;

    @NotNull
    private final LegalDetailsEditorRepository repository;

    @NotNull
    private final M0<Boolean> showGeneralLoader;

    public LegalDetailsEditorViewModel(@NotNull FileHelper fileHelper, @NotNull LegalDetailsEditorRepository repository) {
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.fileHelper = fileHelper;
        this.repository = repository;
        x0<LegalDetailsEditorVO.TextFieldVO> a11 = O0.a(null);
        this._addressQuery = a11;
        this.addressQuery = C2399j.b(a11);
        x0<List<LegalDetailsEditorVO.FileFieldVO>> a12 = O0.a(null);
        this._fileFields = a12;
        this.fileFields = C2399j.b(a12);
        x0<FlashBarErrorWrapper> a13 = O0.a(new FlashBarErrorWrapper(""));
        this._flashbarErrorMessage = a13;
        this.flashbarErrorMessage = C2399j.b(a13);
        x0<Boolean> a14 = O0.a(Boolean.FALSE);
        this._showGeneralLoader = a14;
        this.showGeneralLoader = C2399j.b(a14);
        this.fileLoadJobsMap = new LinkedHashMap();
        this.fileNameToKeyMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDocument(Uri uri, String fileName, int position) {
        B0 c11 = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new LegalDetailsEditorViewModel$loadDocument$loadJob$1(this, fileName, uri, position, null), 3);
        B0 b02 = this.fileLoadJobsMap.get(Integer.valueOf(position));
        if (b02 != null) {
            b02.j(null);
        }
        this.fileLoadJobsMap.put(Integer.valueOf(position), c11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void postFieldsUpdate(Function1<? super LegalDetailsEditorVO.FileFieldVO, LegalDetailsEditorVO.FileFieldVO> transform) {
        List<LegalDetailsEditorVO.FileFieldVO> value = this.fileFields.getValue();
        if (value == null) {
            return;
        }
        x0<List<LegalDetailsEditorVO.FileFieldVO>> x0Var = this._fileFields;
        List<LegalDetailsEditorVO.FileFieldVO> list = value;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        x0Var.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFileFieldByPosition(LegalDetailsEditorVO.FileFieldVO newValue, int position) {
        List<LegalDetailsEditorVO.FileFieldVO> value = this.fileFields.getValue();
        if (newValue == null || value == null) {
            return;
        }
        ArrayList W02 = C7714v.W0(value);
        W02.set(position, newValue);
        this._fileFields.setValue(W02);
    }

    private final boolean validateFields() {
        I i11 = new I();
        i11.f71783a = true;
        LegalDetailsEditorVO.TextFieldVO value = this._addressQuery.getValue();
        String value2 = value != null ? value.getValue() : null;
        if (value2 == null || value2.length() == 0) {
            x0<LegalDetailsEditorVO.TextFieldVO> x0Var = this._addressQuery;
            LegalDetailsEditorVO.TextFieldVO value3 = x0Var.getValue();
            x0Var.setValue(value3 != null ? LegalDetailsEditorVO.TextFieldVO.copy$default(value3, null, null, null, null, true, 15, null) : null);
            i11.f71783a = false;
        }
        postFieldsUpdate(new LegalDetailsEditorViewModel$validateFields$1(i11));
        return i11.f71783a;
    }

    public final void discardWidgetData() {
        this._fileFields.setValue(null);
        this._addressQuery.setValue(null);
    }

    public final void flashbarMessageShowed() {
        this._flashbarErrorMessage.setValue(new FlashBarErrorWrapper(""));
    }

    @NotNull
    public final M0<LegalDetailsEditorVO.TextFieldVO> getAddressQuery() {
        return this.addressQuery;
    }

    @NotNull
    public final M0<List<LegalDetailsEditorVO.FileFieldVO>> getFileFields() {
        return this.fileFields;
    }

    @NotNull
    public final M0<FlashBarErrorWrapper> getFlashbarErrorMessage() {
        return this.flashbarErrorMessage;
    }

    @NotNull
    public final M0<Boolean> getShowGeneralLoader() {
        return this.showGeneralLoader;
    }

    public final void initFields(@NotNull LegalDetailsEditorVO.TextFieldVO textField, @NotNull List<LegalDetailsEditorVO.FileFieldVO> list) {
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(list, "list");
        if (this._addressQuery.getValue() == null) {
            this._addressQuery.setValue(textField);
        }
        if (this._fileFields.getValue() == null) {
            this._fileFields.setValue(list);
        }
    }

    public final void sendRequest() {
        if (validateFields()) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new LegalDetailsEditorViewModel$sendRequest$1(this, null), 3);
        }
    }

    public final void setDeeplinkActionHandler(@NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.deeplinkActionHandler = action;
    }

    public final void updateAddress(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        x0<LegalDetailsEditorVO.TextFieldVO> x0Var = this._addressQuery;
        LegalDetailsEditorVO.TextFieldVO value = x0Var.getValue();
        x0Var.setValue(value != null ? LegalDetailsEditorVO.TextFieldVO.copy$default(value, null, null, null, address, false, 7, null) : null);
    }

    public final void updateFileFieldsByFilePicker(@NotNull Uri uri, int position) {
        LegalDetailsEditorVO.FileFieldVO fileFieldVO;
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<LegalDetailsEditorVO.FileFieldVO> value = this.fileFields.getValue();
        updateFileFieldByPosition((value == null || (fileFieldVO = value.get(position)) == null) ? null : this.fileHelper.validateFile(uri, fileFieldVO, new LegalDetailsEditorViewModel$updateFileFieldsByFilePicker$newValue$1$1(fileFieldVO, this, uri, position)), position);
    }
}
