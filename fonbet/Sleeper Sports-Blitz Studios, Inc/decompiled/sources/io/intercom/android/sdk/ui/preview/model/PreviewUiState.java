package io.intercom.android.sdk.ui.preview.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreviewUiState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jq\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÇ\u0001J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020\u0006H×\u0001J\t\u0010,\u001a\u00020\u000bH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u0006-"}, d2 = {"Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;", "", "files", "", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "currentPage", "", "showDeleteAction", "", "showSendAction", "confirmationText", "", "showDownloadAction", "fileSavingText", "fileSavedText", "saveFailedText", "<init>", "(Ljava/util/List;IZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiles", "()Ljava/util/List;", "getCurrentPage", "()I", "getShowDeleteAction", "()Z", "getShowSendAction", "getConfirmationText", "()Ljava/lang/String;", "getShowDownloadAction", "getFileSavingText", "getFileSavedText", "getSaveFailedText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PreviewUiState {
    public static final int $stable = 8;
    private final String confirmationText;
    private final int currentPage;
    private final String fileSavedText;
    private final String fileSavingText;
    private final List<IntercomPreviewFile> files;
    private final String saveFailedText;
    private final boolean showDeleteAction;
    private final boolean showDownloadAction;
    private final boolean showSendAction;

    public PreviewUiState() {
        this(null, 0, false, false, null, false, null, null, null, 511, null);
    }

    public static /* synthetic */ PreviewUiState copy$default(PreviewUiState previewUiState, List list, int i, boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = previewUiState.files;
        }
        if ((i2 & 2) != 0) {
            i = previewUiState.currentPage;
        }
        if ((i2 & 4) != 0) {
            z = previewUiState.showDeleteAction;
        }
        if ((i2 & 8) != 0) {
            z2 = previewUiState.showSendAction;
        }
        if ((i2 & 16) != 0) {
            str = previewUiState.confirmationText;
        }
        if ((i2 & 32) != 0) {
            z3 = previewUiState.showDownloadAction;
        }
        if ((i2 & 64) != 0) {
            str2 = previewUiState.fileSavingText;
        }
        if ((i2 & 128) != 0) {
            str3 = previewUiState.fileSavedText;
        }
        if ((i2 & 256) != 0) {
            str4 = previewUiState.saveFailedText;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z4 = z3;
        String str7 = str2;
        String str8 = str;
        boolean z5 = z;
        return previewUiState.copy(list, i, z5, z2, str8, z4, str7, str5, str6);
    }

    public final List<IntercomPreviewFile> component1() {
        return this.files;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowDeleteAction() {
        return this.showDeleteAction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSendAction() {
        return this.showSendAction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConfirmationText() {
        return this.confirmationText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final PreviewUiState copy(List<? extends IntercomPreviewFile> files, int currentPage, boolean showDeleteAction, boolean showSendAction, String confirmationText, boolean showDownloadAction, String fileSavingText, String fileSavedText, String saveFailedText) {
        Intrinsics.checkNotNullParameter(files, "files");
        return new PreviewUiState(files, currentPage, showDeleteAction, showSendAction, confirmationText, showDownloadAction, fileSavingText, fileSavedText, saveFailedText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewUiState)) {
            return false;
        }
        PreviewUiState previewUiState = (PreviewUiState) other;
        return Intrinsics.areEqual(this.files, previewUiState.files) && this.currentPage == previewUiState.currentPage && this.showDeleteAction == previewUiState.showDeleteAction && this.showSendAction == previewUiState.showSendAction && Intrinsics.areEqual(this.confirmationText, previewUiState.confirmationText) && this.showDownloadAction == previewUiState.showDownloadAction && Intrinsics.areEqual(this.fileSavingText, previewUiState.fileSavingText) && Intrinsics.areEqual(this.fileSavedText, previewUiState.fileSavedText) && Intrinsics.areEqual(this.saveFailedText, previewUiState.saveFailedText);
    }

    public int hashCode() {
        int hashCode = ((((((this.files.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.showDeleteAction)) * 31) + Boolean.hashCode(this.showSendAction)) * 31;
        String str = this.confirmationText;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showDownloadAction)) * 31;
        String str2 = this.fileSavingText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileSavedText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.saveFailedText;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "PreviewUiState(files=" + this.files + ", currentPage=" + this.currentPage + ", showDeleteAction=" + this.showDeleteAction + ", showSendAction=" + this.showSendAction + ", confirmationText=" + this.confirmationText + ", showDownloadAction=" + this.showDownloadAction + ", fileSavingText=" + this.fileSavingText + ", fileSavedText=" + this.fileSavedText + ", saveFailedText=" + this.saveFailedText + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewUiState(List<? extends IntercomPreviewFile> files, int i, boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.files = files;
        this.currentPage = i;
        this.showDeleteAction = z;
        this.showSendAction = z2;
        this.confirmationText = str;
        this.showDownloadAction = z3;
        this.fileSavingText = str2;
        this.fileSavedText = str3;
        this.saveFailedText = str4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PreviewUiState(java.util.List r3, int r4, boolean r5, boolean r6, java.lang.String r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r2 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L8
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Le
            r4 = r0
        Le:
            r13 = r12 & 4
            if (r13 == 0) goto L13
            r5 = r0
        L13:
            r13 = r12 & 8
            if (r13 == 0) goto L18
            r6 = r0
        L18:
            r13 = r12 & 16
            r1 = 0
            if (r13 == 0) goto L1e
            r7 = r1
        L1e:
            r13 = r12 & 32
            if (r13 == 0) goto L23
            r8 = r0
        L23:
            r13 = r12 & 64
            if (r13 == 0) goto L28
            r9 = r1
        L28:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L2d
            r10 = r1
        L2d:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L3c
            r13 = r1
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L46
        L3c:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L46:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.model.PreviewUiState.<init>(java.util.List, int, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<IntercomPreviewFile> getFiles() {
        return this.files;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getShowDeleteAction() {
        return this.showDeleteAction;
    }

    public final boolean getShowSendAction() {
        return this.showSendAction;
    }

    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }
}
