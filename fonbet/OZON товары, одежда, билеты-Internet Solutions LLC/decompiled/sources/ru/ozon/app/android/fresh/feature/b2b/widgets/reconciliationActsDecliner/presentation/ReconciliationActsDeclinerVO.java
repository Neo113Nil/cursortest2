package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import B0.C2454a;
import Co.a;
import De.C2859b;
import G.g;
import Lh.b;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003*+,B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;", "textFields", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "attachField", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "policyField", "<init>", "(JLjava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTextFields", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "getAttachField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPolicyField", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "AttachField", "TextField", "Status", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReconciliationActsDeclinerVO implements c {

    @NotNull
    private final AttachField attachField;
    private final long id;

    @NotNull
    private final TextDTO policyField;

    @NotNull
    private final ButtonV3DTO submitButton;

    @NotNull
    private final List<TextField> textFields;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "", "Default", "UploadFileSizeError", "UploadErrorFileType", "UnknownError", "Loading", "Success", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$Default;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$UnknownError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$UploadErrorFileType;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$UploadFileSizeError;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Status {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$Default;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Default implements Status {

            @NotNull
            public static final Default INSTANCE = new Default();

            private Default() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Default);
            }

            public int hashCode() {
                return -1041189348;
            }

            @NotNull
            public String toString() {
                return "Default";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "Landroid/net/Uri;", "uri", "", "fullFileName", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getFullFileName", "()Ljava/lang/String;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "Landroid/net/Uri;", "uri", "", "fullFileName", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getFullFileName", "()Ljava/lang/String;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$UnknownError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnknownError implements Status {
            private final String errorMessage;

            public UnknownError(String str) {
                this.errorMessage = str;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$UploadErrorFileType;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UploadErrorFileType implements Status {

            @NotNull
            public static final UploadErrorFileType INSTANCE = new UploadErrorFileType();

            private UploadErrorFileType() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UploadErrorFileType);
            }

            public int hashCode() {
                return -1835654184;
            }

            @NotNull
            public String toString() {
                return "UploadErrorFileType";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status$UploadFileSizeError;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UploadFileSizeError implements Status {

            @NotNull
            public static final UploadFileSizeError INSTANCE = new UploadFileSizeError();

            private UploadFileSizeError() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UploadFileSizeError);
            }

            public int hashCode() {
                return -389936315;
            }

            @NotNull
            public String toString() {
                return "UploadFileSizeError";
            }
        }
    }

    public ReconciliationActsDeclinerVO(long j11, @NotNull List<TextField> textFields, @NotNull AttachField attachField, @NotNull ButtonV3DTO submitButton, @NotNull TextDTO policyField) {
        Intrinsics.checkNotNullParameter(textFields, "textFields");
        Intrinsics.checkNotNullParameter(attachField, "attachField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(policyField, "policyField");
        this.id = j11;
        this.textFields = textFields;
        this.attachField = attachField;
        this.submitButton = submitButton;
        this.policyField = policyField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReconciliationActsDeclinerVO)) {
            return false;
        }
        ReconciliationActsDeclinerVO reconciliationActsDeclinerVO = (ReconciliationActsDeclinerVO) other;
        return this.id == reconciliationActsDeclinerVO.id && Intrinsics.d(this.textFields, reconciliationActsDeclinerVO.textFields) && Intrinsics.d(this.attachField, reconciliationActsDeclinerVO.attachField) && Intrinsics.d(this.submitButton, reconciliationActsDeclinerVO.submitButton) && Intrinsics.d(this.policyField, reconciliationActsDeclinerVO.policyField);
    }

    @NotNull
    public final AttachField getAttachField() {
        return this.attachField;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getPolicyField() {
        return this.policyField;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final List<TextField> getTextFields() {
        return this.textFields;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.policyField.hashCode() + C2859b.c(this.submitButton, (this.attachField.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.textFields)) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TextField> list = this.textFields;
        AttachField attachField = this.attachField;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        TextDTO textDTO = this.policyField;
        StringBuilder b11 = b.b(j11, "ReconciliationActsDeclinerVO(id=", ", textFields=", list);
        b11.append(", attachField=");
        b11.append(attachField);
        b11.append(", submitButton=");
        b11.append(buttonV3DTO);
        b11.append(", policyField=");
        b11.append(textDTO);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, HammersV3BodyDTO.PLACEHOLDER, "errorRequiredText", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "hasError", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "getErrorRequiredText", "getValue", "Z", "getHasError", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextField {

        @NotNull
        private final String errorRequiredText;
        private final boolean hasError;
        private final String name;

        @NotNull
        private final String placeholder;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final String value;

        public TextField(String str, @NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText, @NotNull String value, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = str;
            this.title = title;
            this.placeholder = placeholder;
            this.errorRequiredText = errorRequiredText;
            this.value = value;
            this.hasError = z11;
        }

        public static /* synthetic */ TextField copy$default(TextField textField, String str, TextDTO textDTO, String str2, String str3, String str4, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textField.name;
            }
            if ((i11 & 2) != 0) {
                textDTO = textField.title;
            }
            if ((i11 & 4) != 0) {
                str2 = textField.placeholder;
            }
            if ((i11 & 8) != 0) {
                str3 = textField.errorRequiredText;
            }
            if ((i11 & 16) != 0) {
                str4 = textField.value;
            }
            if ((i11 & 32) != 0) {
                z11 = textField.hasError;
            }
            String str5 = str4;
            boolean z12 = z11;
            return textField.copy(str, textDTO, str2, str3, str5, z12);
        }

        @NotNull
        public final TextField copy(String name, @NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText, @NotNull String value, boolean hasError) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            Intrinsics.checkNotNullParameter(value, "value");
            return new TextField(name, title, placeholder, errorRequiredText, value, hasError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) other;
            return Intrinsics.d(this.name, textField.name) && Intrinsics.d(this.title, textField.title) && Intrinsics.d(this.placeholder, textField.placeholder) && Intrinsics.d(this.errorRequiredText, textField.errorRequiredText) && Intrinsics.d(this.value, textField.value) && this.hasError == textField.hasError;
        }

        @NotNull
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        public final boolean getHasError() {
            return this.hasError;
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
            String str = this.name;
            return Boolean.hashCode(this.hasError) + g.a(g.a(g.a(Ns.b.a(this.title, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.placeholder), 31, this.errorRequiredText), 31, this.value);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            TextDTO textDTO = this.title;
            String str2 = this.placeholder;
            String str3 = this.errorRequiredText;
            String str4 = this.value;
            boolean z11 = this.hasError;
            StringBuilder b11 = a.b("TextField(name=", textDTO, str, ", title=", ", placeholder=");
            Nh.a.h(b11, str2, ", errorRequiredText=", str3, ", value=");
            b11.append(str4);
            b11.append(", hasError=");
            b11.append(z11);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ TextField(String str, TextDTO textDTO, String str2, String str3, String str4, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, textDTO, str2, str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jj\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0017R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "", "formats", "", "maxSize", "", "lexemes", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "status", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "buttonsStates", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILjava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILjava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$AttachField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getFormats", "()Ljava/util/List;", "I", "getMaxSize", "Ljava/util/Map;", "getLexemes", "()Ljava/util/Map;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "getStatus", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$Status;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "getButtonsStates", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttachField {

        @NotNull
        private final ReconciliationActsDeclinerDTO.ButtonStates buttonsStates;

        @NotNull
        private final List<String> formats;
        private final TextDTO label;

        @NotNull
        private final Map<String, String> lexemes;
        private final int maxSize;

        @NotNull
        private final String name;

        @NotNull
        private final Status status;

        public AttachField(@NotNull String name, TextDTO textDTO, @NotNull List<String> formats, int i11, @NotNull Map<String, String> lexemes, @NotNull Status status, @NotNull ReconciliationActsDeclinerDTO.ButtonStates buttonsStates) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(buttonsStates, "buttonsStates");
            this.name = name;
            this.label = textDTO;
            this.formats = formats;
            this.maxSize = i11;
            this.lexemes = lexemes;
            this.status = status;
            this.buttonsStates = buttonsStates;
        }

        public static /* synthetic */ AttachField copy$default(AttachField attachField, String str, TextDTO textDTO, List list, int i11, Map map, Status status, ReconciliationActsDeclinerDTO.ButtonStates buttonStates, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = attachField.name;
            }
            if ((i12 & 2) != 0) {
                textDTO = attachField.label;
            }
            if ((i12 & 4) != 0) {
                list = attachField.formats;
            }
            if ((i12 & 8) != 0) {
                i11 = attachField.maxSize;
            }
            if ((i12 & 16) != 0) {
                map = attachField.lexemes;
            }
            if ((i12 & 32) != 0) {
                status = attachField.status;
            }
            if ((i12 & 64) != 0) {
                buttonStates = attachField.buttonsStates;
            }
            Status status2 = status;
            ReconciliationActsDeclinerDTO.ButtonStates buttonStates2 = buttonStates;
            Map map2 = map;
            List list2 = list;
            return attachField.copy(str, textDTO, list2, i11, map2, status2, buttonStates2);
        }

        @NotNull
        public final AttachField copy(@NotNull String name, TextDTO label, @NotNull List<String> formats, int maxSize, @NotNull Map<String, String> lexemes, @NotNull Status status, @NotNull ReconciliationActsDeclinerDTO.ButtonStates buttonsStates) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(buttonsStates, "buttonsStates");
            return new AttachField(name, label, formats, maxSize, lexemes, status, buttonsStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachField)) {
                return false;
            }
            AttachField attachField = (AttachField) other;
            return Intrinsics.d(this.name, attachField.name) && Intrinsics.d(this.label, attachField.label) && Intrinsics.d(this.formats, attachField.formats) && this.maxSize == attachField.maxSize && Intrinsics.d(this.lexemes, attachField.lexemes) && Intrinsics.d(this.status, attachField.status) && Intrinsics.d(this.buttonsStates, attachField.buttonsStates);
        }

        @NotNull
        public final ReconciliationActsDeclinerDTO.ButtonStates getButtonsStates() {
            return this.buttonsStates;
        }

        @NotNull
        public final List<String> getFormats() {
            return this.formats;
        }

        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        public final Map<String, String> getLexemes() {
            return this.lexemes;
        }

        public final int getMaxSize() {
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
            int hashCode = this.name.hashCode() * 31;
            TextDTO textDTO = this.label;
            return this.buttonsStates.hashCode() + ((this.status.hashCode() + D40.c.a(this.lexemes, C2454a.a(this.maxSize, g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.formats), 31), 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            TextDTO textDTO = this.label;
            List<String> list = this.formats;
            int i11 = this.maxSize;
            Map<String, String> map = this.lexemes;
            Status status = this.status;
            ReconciliationActsDeclinerDTO.ButtonStates buttonStates = this.buttonsStates;
            StringBuilder b11 = a.b("AttachField(name=", textDTO, str, ", label=", ", formats=");
            b11.append(list);
            b11.append(", maxSize=");
            b11.append(i11);
            b11.append(", lexemes=");
            b11.append(map);
            b11.append(", status=");
            b11.append(status);
            b11.append(", buttonsStates=");
            b11.append(buttonStates);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ AttachField(String str, TextDTO textDTO, List list, int i11, Map map, Status status, ReconciliationActsDeclinerDTO.ButtonStates buttonStates, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, textDTO, list, i11, map, (i12 & 32) != 0 ? Status.Default.INSTANCE : status, buttonStates);
        }
    }
}
