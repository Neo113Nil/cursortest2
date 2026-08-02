package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import G.g;
import Nh.a;
import Ns.b;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004)*+,B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "textField", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$AttachFieldVO;", "attachField", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "submitButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "policyField", "<init>", "(JLru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$AttachFieldVO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "getTextField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$AttachFieldVO;", "getAttachField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$AttachFieldVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPolicyField", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "TextFieldVO", "AttachFieldVO", "FileFieldVO", "Status", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LegalDetailsEditorVO implements c {

    @NotNull
    private final AttachFieldVO attachField;
    private final long id;
    private final TextDTO policyField;

    @NotNull
    private final ButtonDTO submitButton;

    @NotNull
    private final TextFieldVO textField;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$AttachFieldVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "fileFields", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getFileFields", "()Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttachFieldVO {

        @NotNull
        private final List<FileFieldVO> fileFields;

        @NotNull
        private final TextDTO title;

        public AttachFieldVO(@NotNull TextDTO title, @NotNull List<FileFieldVO> fileFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(fileFields, "fileFields");
            this.title = title;
            this.fileFields = fileFields;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachFieldVO)) {
                return false;
            }
            AttachFieldVO attachFieldVO = (AttachFieldVO) other;
            return Intrinsics.d(this.title, attachFieldVO.title) && Intrinsics.d(this.fileFields, attachFieldVO.fileFields);
        }

        @NotNull
        public final List<FileFieldVO> getFileFields() {
            return this.fileFields;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.fileFields.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AttachFieldVO(title=" + this.title + ", fileFields=" + this.fileFields + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "", "Default", "ErrorRequired", "UploadFileSizeError", "UploadErrorFileType", "UnknownError", "Loading", "Success", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$Default;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$ErrorRequired;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$UnknownError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$UploadErrorFileType;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$UploadFileSizeError;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Status {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$Default;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Default implements Status {

            @NotNull
            public static final Default INSTANCE = new Default();

            private Default() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$ErrorRequired;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ErrorRequired implements Status {

            @NotNull
            public static final ErrorRequired INSTANCE = new ErrorRequired();

            private ErrorRequired() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "Landroid/net/Uri;", "uri", "", "fullFileName", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getFullFileName", "()Ljava/lang/String;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Loading implements Status {
            private final String fullFileName;

            @NotNull
            private final Uri uri;

            public Loading(@NotNull Uri uri, String str) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.uri = uri;
                this.fullFileName = str;
            }

            public final String getFullFileName() {
                return this.fullFileName;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "Landroid/net/Uri;", "uri", "", "fullFileName", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getFullFileName", "()Ljava/lang/String;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success implements Status {
            private final String fullFileName;

            @NotNull
            private final Uri uri;

            public Success(@NotNull Uri uri, String str) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.uri = uri;
                this.fullFileName = str;
            }

            public final String getFullFileName() {
                return this.fullFileName;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$UnknownError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnknownError implements Status {
            private final String errorMessage;

            public UnknownError(String str) {
                this.errorMessage = str;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$UploadErrorFileType;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UploadErrorFileType implements Status {

            @NotNull
            public static final UploadErrorFileType INSTANCE = new UploadErrorFileType();

            private UploadErrorFileType() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status$UploadFileSizeError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UploadFileSizeError implements Status {

            @NotNull
            public static final UploadFileSizeError INSTANCE = new UploadFileSizeError();

            private UploadFileSizeError() {
            }
        }
    }

    public LegalDetailsEditorVO(long j11, @NotNull TextFieldVO textField, @NotNull AttachFieldVO attachField, @NotNull ButtonDTO submitButton, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(attachField, "attachField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.textField = textField;
        this.attachField = attachField;
        this.submitButton = submitButton;
        this.policyField = textDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDetailsEditorVO)) {
            return false;
        }
        LegalDetailsEditorVO legalDetailsEditorVO = (LegalDetailsEditorVO) other;
        return this.id == legalDetailsEditorVO.id && Intrinsics.d(this.textField, legalDetailsEditorVO.textField) && Intrinsics.d(this.attachField, legalDetailsEditorVO.attachField) && Intrinsics.d(this.submitButton, legalDetailsEditorVO.submitButton) && Intrinsics.d(this.policyField, legalDetailsEditorVO.policyField);
    }

    @NotNull
    public final AttachFieldVO getAttachField() {
        return this.attachField;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getPolicyField() {
        return this.policyField;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextFieldVO getTextField() {
        return this.textField;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.submitButton.hashCode() + ((this.attachField.hashCode() + ((this.textField.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31;
        TextDTO textDTO = this.policyField;
        return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "LegalDetailsEditorVO(id=" + this.id + ", textField=" + this.textField + ", attachField=" + this.attachField + ", submitButton=" + this.submitButton + ", policyField=" + this.policyField + ")";
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", HammersV3BodyDTO.PLACEHOLDER, "errorRequiredText", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isShowErrorMessage", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getPlaceholder", "getErrorRequiredText", "getValue", "Z", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldVO {

        @NotNull
        private final String errorRequiredText;
        private final boolean isShowErrorMessage;

        @NotNull
        private final String placeholder;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final String value;

        public TextFieldVO(@NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText, @NotNull String value, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            Intrinsics.checkNotNullParameter(value, "value");
            this.title = title;
            this.placeholder = placeholder;
            this.errorRequiredText = errorRequiredText;
            this.value = value;
            this.isShowErrorMessage = z11;
        }

        public static /* synthetic */ TextFieldVO copy$default(TextFieldVO textFieldVO, TextDTO textDTO, String str, String str2, String str3, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = textFieldVO.title;
            }
            if ((i11 & 2) != 0) {
                str = textFieldVO.placeholder;
            }
            if ((i11 & 4) != 0) {
                str2 = textFieldVO.errorRequiredText;
            }
            if ((i11 & 8) != 0) {
                str3 = textFieldVO.value;
            }
            if ((i11 & 16) != 0) {
                z11 = textFieldVO.isShowErrorMessage;
            }
            boolean z12 = z11;
            String str4 = str2;
            return textFieldVO.copy(textDTO, str, str4, str3, z12);
        }

        @NotNull
        public final TextFieldVO copy(@NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText, @NotNull String value, boolean isShowErrorMessage) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            Intrinsics.checkNotNullParameter(value, "value");
            return new TextFieldVO(title, placeholder, errorRequiredText, value, isShowErrorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFieldVO)) {
                return false;
            }
            TextFieldVO textFieldVO = (TextFieldVO) other;
            return Intrinsics.d(this.title, textFieldVO.title) && Intrinsics.d(this.placeholder, textFieldVO.placeholder) && Intrinsics.d(this.errorRequiredText, textFieldVO.errorRequiredText) && Intrinsics.d(this.value, textFieldVO.value) && this.isShowErrorMessage == textFieldVO.isShowErrorMessage;
        }

        @NotNull
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isShowErrorMessage) + g.a(g.a(g.a(this.title.hashCode() * 31, 31, this.placeholder), 31, this.errorRequiredText), 31, this.value);
        }

        /* renamed from: isShowErrorMessage, reason: from getter */
        public final boolean getIsShowErrorMessage() {
            return this.isShowErrorMessage;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.placeholder;
            String str2 = this.errorRequiredText;
            String str3 = this.value;
            boolean z11 = this.isShowErrorMessage;
            StringBuilder f7 = D3.g.f("TextFieldVO(title=", textDTO, ", placeholder=", str, ", errorRequiredText=");
            a.h(f7, str2, ", value=", str3, ", isShowErrorMessage=");
            return Pk0.a.a(")", f7, z11);
        }

        public /* synthetic */ TextFieldVO(TextDTO textDTO, String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, str, str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "", "formats", "", "maxSize", "", "lexemes", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "buttonStates", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "status", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;JLjava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;JLjava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getFormats", "()Ljava/util/List;", "J", "getMaxSize", "()J", "Ljava/util/Map;", "getLexemes", "()Ljava/util/Map;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "getButtonStates", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "getStatus", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$Status;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FileFieldVO {

        @NotNull
        private final LegalDetailsEditorDTO.ButtonStates buttonStates;

        @NotNull
        private final List<String> formats;

        @NotNull
        private final TextDTO label;

        @NotNull
        private final Map<String, String> lexemes;
        private final long maxSize;

        @NotNull
        private final String name;

        @NotNull
        private final Status status;

        public FileFieldVO(@NotNull String name, @NotNull TextDTO label, @NotNull List<String> formats, long j11, @NotNull Map<String, String> lexemes, @NotNull LegalDetailsEditorDTO.ButtonStates buttonStates, @NotNull Status status) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(buttonStates, "buttonStates");
            Intrinsics.checkNotNullParameter(status, "status");
            this.name = name;
            this.label = label;
            this.formats = formats;
            this.maxSize = j11;
            this.lexemes = lexemes;
            this.buttonStates = buttonStates;
            this.status = status;
        }

        public static /* synthetic */ FileFieldVO copy$default(FileFieldVO fileFieldVO, String str, TextDTO textDTO, List list, long j11, Map map, LegalDetailsEditorDTO.ButtonStates buttonStates, Status status, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fileFieldVO.name;
            }
            if ((i11 & 2) != 0) {
                textDTO = fileFieldVO.label;
            }
            if ((i11 & 4) != 0) {
                list = fileFieldVO.formats;
            }
            if ((i11 & 8) != 0) {
                j11 = fileFieldVO.maxSize;
            }
            if ((i11 & 16) != 0) {
                map = fileFieldVO.lexemes;
            }
            if ((i11 & 32) != 0) {
                buttonStates = fileFieldVO.buttonStates;
            }
            if ((i11 & 64) != 0) {
                status = fileFieldVO.status;
            }
            Status status2 = status;
            Map map2 = map;
            long j12 = j11;
            List list2 = list;
            return fileFieldVO.copy(str, textDTO, list2, j12, map2, buttonStates, status2);
        }

        @NotNull
        public final FileFieldVO copy(@NotNull String name, @NotNull TextDTO label, @NotNull List<String> formats, long maxSize, @NotNull Map<String, String> lexemes, @NotNull LegalDetailsEditorDTO.ButtonStates buttonStates, @NotNull Status status) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(buttonStates, "buttonStates");
            Intrinsics.checkNotNullParameter(status, "status");
            return new FileFieldVO(name, label, formats, maxSize, lexemes, buttonStates, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileFieldVO)) {
                return false;
            }
            FileFieldVO fileFieldVO = (FileFieldVO) other;
            return Intrinsics.d(this.name, fileFieldVO.name) && Intrinsics.d(this.label, fileFieldVO.label) && Intrinsics.d(this.formats, fileFieldVO.formats) && this.maxSize == fileFieldVO.maxSize && Intrinsics.d(this.lexemes, fileFieldVO.lexemes) && Intrinsics.d(this.buttonStates, fileFieldVO.buttonStates) && Intrinsics.d(this.status, fileFieldVO.status);
        }

        @NotNull
        public final LegalDetailsEditorDTO.ButtonStates getButtonStates() {
            return this.buttonStates;
        }

        @NotNull
        public final List<String> getFormats() {
            return this.formats;
        }

        @NotNull
        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        public final Map<String, String> getLexemes() {
            return this.lexemes;
        }

        public final long getMaxSize() {
            return this.maxSize;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode() + ((this.buttonStates.hashCode() + D40.c.a(this.lexemes, Pk0.c.a(g.b(b.a(this.label, this.name.hashCode() * 31, 31), 31, this.formats), 31, this.maxSize), 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            TextDTO textDTO = this.label;
            List<String> list = this.formats;
            long j11 = this.maxSize;
            Map<String, String> map = this.lexemes;
            LegalDetailsEditorDTO.ButtonStates buttonStates = this.buttonStates;
            Status status = this.status;
            StringBuilder b11 = Co.a.b("FileFieldVO(name=", textDTO, str, ", label=", ", formats=");
            b11.append(list);
            b11.append(", maxSize=");
            b11.append(j11);
            b11.append(", lexemes=");
            b11.append(map);
            b11.append(", buttonStates=");
            b11.append(buttonStates);
            b11.append(", status=");
            b11.append(status);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ FileFieldVO(String str, TextDTO textDTO, List list, long j11, Map map, LegalDetailsEditorDTO.ButtonStates buttonStates, Status status, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, textDTO, list, j11, map, buttonStates, (i11 & 64) != 0 ? Status.Default.INSTANCE : status);
        }
    }
}
