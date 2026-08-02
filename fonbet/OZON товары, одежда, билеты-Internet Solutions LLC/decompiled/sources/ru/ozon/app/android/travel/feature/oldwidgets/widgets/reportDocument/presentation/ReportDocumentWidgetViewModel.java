package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import De.s;
import J0.P;
import Kk.c;
import android.os.Bundle;
import androidx.lifecycle.V;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsApi;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsRequest;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsResponse;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.fragment.dateSelector.TravelDateSelectorDialogFragment;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.molecules.input.v1.mapper.CommonInputMapperKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 G2\u00060\u0001j\u0002`\u0002:\u0003GHIB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016¢\u0006\u0004\b \u0010\u0019J\u001b\u0010\"\u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\t¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u001c\u00104\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010DR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010FR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010FR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010F¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsApi;", "api", "<init>", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsApi;)V", "Landroid/os/Bundle;", "bundle", "", "prepareDateInputValue", "(Landroid/os/Bundle;)Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentsResponseVO;", "toVO", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentsResponseVO;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest;", "prepareValidateParams", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsRequest;", "", "onCleared", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$UpdatedInput;", "updateInput", "()Landroidx/lifecycle/P;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "submitInputsLiveData", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;", "operationLiveData", "", "progressLiveData", "inputs", "bindInputs", "(Ljava/util/List;)V", "", "inputId", "newValue", "onTextInputChanged", "(JLjava/lang/String;)V", "id", "showDateFragment", "(J)V", "onFragmentResult", "(Landroid/os/Bundle;)V", "link", "performAction", "(Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsApi;", "Lorg/joda/time/format/b;", "kotlin.jvm.PlatformType", "visibleDateTimeFormatter", "Lorg/joda/time/format/b;", "rawDateTimeFormatter", "", "requestedDateInputIndex", "Ljava/lang/Integer;", "Lxe/B0;", "validateJob", "Lxe/B0;", "Lxe/M;", "scope", "Lxe/M;", "", "cachedInputs", "Ljava/util/List;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Companion", "Operation", "UpdatedInput", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportDocumentWidgetViewModel implements InterfaceC6786a {

    @NotNull
    private final ReportDocumentsApi api;

    @NotNull
    private List<CommonInputVO> cachedInputs;

    @NotNull
    private final SingleLiveEvent<Operation> operationLiveData;

    @NotNull
    private final SingleLiveEvent<Boolean> progressLiveData;
    private final b rawDateTimeFormatter;
    private Integer requestedDateInputIndex;

    @NotNull
    private M scope;

    @NotNull
    private final V<List<CommonInputVO>> submitInputsLiveData;

    @NotNull
    private final SingleLiveEvent<UpdatedInput> updateInput;
    private B0 validateJob;
    private final b visibleDateTimeFormatter;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;", "", "Error", "ShowDateSelector", "ProcessAction", "ProcessNotification", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$Error;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ProcessAction;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ProcessNotification;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ShowDateSelector;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Operation {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$Error;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Operation {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -1991084207;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ProcessAction;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProcessAction implements Operation {

            @NotNull
            private final AtomAction action;

            public ProcessAction(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProcessAction) && Intrinsics.d(this.action, ((ProcessAction) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("ProcessAction(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ProcessNotification;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "notification", "<init>", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getNotification", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProcessNotification implements Operation {

            @NotNull
            private final Restriction notification;

            public ProcessNotification(@NotNull Restriction notification) {
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.notification = notification;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProcessNotification) && Intrinsics.d(this.notification, ((ProcessNotification) other).notification);
            }

            @NotNull
            public final Restriction getNotification() {
                return this.notification;
            }

            public int hashCode() {
                return this.notification.hashCode();
            }

            @NotNull
            public String toString() {
                return "ProcessNotification(notification=" + this.notification + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ShowDateSelector;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation;", "", "selectorTitle", "", "selectedDay", "selectedMonth", "selectedYear", "", "startDateMillis", "endDateMillis", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectorTitle", "Ljava/lang/Integer;", "getSelectedDay", "()Ljava/lang/Integer;", "getSelectedMonth", "getSelectedYear", "Ljava/lang/Long;", "getStartDateMillis", "()Ljava/lang/Long;", "getEndDateMillis", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowDateSelector implements Operation {
            private final Long endDateMillis;
            private final Integer selectedDay;
            private final Integer selectedMonth;
            private final Integer selectedYear;
            private final String selectorTitle;
            private final Long startDateMillis;

            public ShowDateSelector(String str, Integer num, Integer num2, Integer num3, Long l11, Long l12) {
                this.selectorTitle = str;
                this.selectedDay = num;
                this.selectedMonth = num2;
                this.selectedYear = num3;
                this.startDateMillis = l11;
                this.endDateMillis = l12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowDateSelector)) {
                    return false;
                }
                ShowDateSelector showDateSelector = (ShowDateSelector) other;
                return Intrinsics.d(this.selectorTitle, showDateSelector.selectorTitle) && Intrinsics.d(this.selectedDay, showDateSelector.selectedDay) && Intrinsics.d(this.selectedMonth, showDateSelector.selectedMonth) && Intrinsics.d(this.selectedYear, showDateSelector.selectedYear) && Intrinsics.d(this.startDateMillis, showDateSelector.startDateMillis) && Intrinsics.d(this.endDateMillis, showDateSelector.endDateMillis);
            }

            public final Long getEndDateMillis() {
                return this.endDateMillis;
            }

            public final Integer getSelectedDay() {
                return this.selectedDay;
            }

            public final Integer getSelectedMonth() {
                return this.selectedMonth;
            }

            public final Integer getSelectedYear() {
                return this.selectedYear;
            }

            public final String getSelectorTitle() {
                return this.selectorTitle;
            }

            public final Long getStartDateMillis() {
                return this.startDateMillis;
            }

            public int hashCode() {
                String str = this.selectorTitle;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.selectedDay;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.selectedMonth;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.selectedYear;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Long l11 = this.startDateMillis;
                int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.endDateMillis;
                return hashCode5 + (l12 != null ? l12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.selectorTitle;
                Integer num = this.selectedDay;
                Integer num2 = this.selectedMonth;
                Integer num3 = this.selectedYear;
                Long l11 = this.startDateMillis;
                Long l12 = this.endDateMillis;
                StringBuilder b11 = P.b("ShowDateSelector(selectorTitle=", str, num, ", selectedDay=", ", selectedMonth=");
                Ef0.c.e(b11, num2, ", selectedYear=", num3, ", startDateMillis=");
                b11.append(l11);
                b11.append(", endDateMillis=");
                b11.append(l12);
                b11.append(")");
                return b11.toString();
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$UpdatedInput;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "input", "Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "payload", "<init>", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "getPayload", "()Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdatedInput {

        @NotNull
        private final CommonInputVO input;

        @NotNull
        private final InputPayload payload;

        public UpdatedInput(@NotNull CommonInputVO input, @NotNull InputPayload payload) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.input = input;
            this.payload = payload;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatedInput)) {
                return false;
            }
            UpdatedInput updatedInput = (UpdatedInput) other;
            return Intrinsics.d(this.input, updatedInput.input) && this.payload == updatedInput.payload;
        }

        @NotNull
        public final CommonInputVO getInput() {
            return this.input;
        }

        @NotNull
        public final InputPayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode() + (this.input.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdatedInput(input=" + this.input + ", payload=" + this.payload + ")";
        }
    }

    public ReportDocumentWidgetViewModel(@NotNull ReportDocumentsApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.visibleDateTimeFormatter = a.b("dd.MM.yyyy");
        this.rawDateTimeFormatter = a.b("ddMMyyyy");
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(s.f6650a, (H0) b11));
        this.cachedInputs = new ArrayList();
        this.submitInputsLiveData = new V<>();
        this.operationLiveData = new SingleLiveEvent<>();
        this.progressLiveData = new SingleLiveEvent<>();
        this.updateInput = new SingleLiveEvent<>();
    }

    private final String prepareDateInputValue(Bundle bundle) {
        TravelDateSelectorDialogFragment.Companion companion = TravelDateSelectorDialogFragment.INSTANCE;
        int i11 = bundle.getInt("KEY_SELECTED_DAY");
        int i12 = bundle.getInt("KEY_SELECTED_MONTH");
        String h11 = this.visibleDateTimeFormatter.h(new LocalDate(bundle.getInt("KEY_SELECTED_YEAR"), i12 + 1, i11));
        Intrinsics.checkNotNullExpressionValue(h11, "print(...)");
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReportDocumentsRequest prepareValidateParams() {
        Object obj;
        Object obj2;
        Object obj3;
        ReportDocumentsRequest.InputValue inputValue;
        ReportDocumentsRequest.InputValue inputValue2;
        List<CommonInputVO> list = this.cachedInputs;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((CommonInputVO) obj).getName(), "fromDate")) {
                break;
            }
        }
        CommonInputVO commonInputVO = (CommonInputVO) obj;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.d(((CommonInputVO) obj2).getName(), "toDate")) {
                break;
            }
        }
        CommonInputVO commonInputVO2 = (CommonInputVO) obj2;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (Intrinsics.d(((CommonInputVO) obj3).getName(), Scopes.EMAIL)) {
                break;
            }
        }
        CommonInputVO commonInputVO3 = (CommonInputVO) obj3;
        if (commonInputVO != null) {
            String value = commonInputVO.getValue();
            StringBuilder sb2 = new StringBuilder();
            int length = value.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = value.charAt(i11);
                if (charAt != '.') {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            inputValue = new ReportDocumentsRequest.InputValue(sb3, false, 2, null);
        } else {
            inputValue = null;
        }
        if (commonInputVO2 != null) {
            String value2 = commonInputVO2.getValue();
            StringBuilder sb4 = new StringBuilder();
            int length2 = value2.length();
            for (int i12 = 0; i12 < length2; i12++) {
                char charAt2 = value2.charAt(i12);
                if (charAt2 != '.') {
                    sb4.append(charAt2);
                }
            }
            String sb5 = sb4.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
            inputValue2 = new ReportDocumentsRequest.InputValue(sb5, false, 2, null);
        } else {
            inputValue2 = null;
        }
        return new ReportDocumentsRequest(new ReportDocumentsRequest.ParamsInputs(inputValue, inputValue2, commonInputVO3 != null ? new ReportDocumentsRequest.InputValue(commonInputVO3.getValue(), false, 2, null) : null), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ReportDocumentsResponseVO toVO(ReportDocumentsResponse reportDocumentsResponse) {
        CommonInputDTO fromDate;
        CommonInputDTO toDate;
        String value;
        String value2;
        ReportDocumentsResponse.ResponseInputs inputs = reportDocumentsResponse.getInputs();
        CommonInputDTO fromDate2 = inputs.getFromDate();
        if (fromDate2 != null && (value2 = fromDate2.getValue()) != null) {
            fromDate = CommonInputDTO.copy$default(inputs.getFromDate(), null, this.visibleDateTimeFormatter.h(this.rawDateTimeFormatter.e(value2)), null, null, null, null, null, null, false, false, false, false, null, null, null, null, false, null, null, null, null, null, false, false, 16777213, null);
        }
        fromDate = inputs.getFromDate();
        CommonInputDTO commonInputDTO = fromDate;
        CommonInputDTO toDate2 = inputs.getToDate();
        if (toDate2 != null && (value = toDate2.getValue()) != null) {
            toDate = CommonInputDTO.copy$default(inputs.getToDate(), null, this.visibleDateTimeFormatter.h(this.rawDateTimeFormatter.e(value)), null, null, null, null, null, null, false, false, false, false, null, null, null, null, false, null, null, null, null, null, false, false, 16777213, null);
        }
        toDate = inputs.getToDate();
        CommonInputVO vO$default = commonInputDTO != null ? CommonInputMapperKt.toVO$default(commonInputDTO, null, null, 0, "fromDate", 3, null) : null;
        CommonInputVO vO$default2 = toDate != null ? CommonInputMapperKt.toVO$default(toDate, null, null, 1, "toDate", 3, null) : null;
        CommonInputDTO email = inputs.getEmail();
        CommonInputVO[] elements = {vO$default, vO$default2, email != null ? CommonInputMapperKt.toVO$default(email, null, null, 2, Scopes.EMAIL, 3, null) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        AtomActionDTO action = reportDocumentsResponse.getAction();
        return new ReportDocumentsResponseVO(B11, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, reportDocumentsResponse.getNotification());
    }

    public final void bindInputs(@NotNull List<? extends CommonInputVO> inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        ArrayList W02 = C7714v.W0(inputs);
        this.cachedInputs = W02;
        this.submitInputsLiveData.setValue(W02);
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.scope, null);
    }

    public final void onFragmentResult(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Integer num = this.requestedDateInputIndex;
        if (num == null || num == null) {
            return;
        }
        int intValue = num.intValue();
        CommonInputVO commonInputVO = this.cachedInputs.get(intValue);
        CommonInputVO.DateCommonInputVO dateCommonInputVO = commonInputVO instanceof CommonInputVO.DateCommonInputVO ? (CommonInputVO.DateCommonInputVO) commonInputVO : null;
        CommonInputVO.DateCommonInputVO copy = dateCommonInputVO != null ? dateCommonInputVO.copy((r29 & 1) != 0 ? dateCommonInputVO.id : 0L, (r29 & 2) != 0 ? dateCommonInputVO.name : null, (r29 & 4) != 0 ? dateCommonInputVO.value : prepareDateInputValue(bundle), (r29 & 8) != 0 ? dateCommonInputVO.isErrorVisible : false, (r29 & 16) != 0 ? dateCommonInputVO.error : null, (r29 & 32) != 0 ? dateCommonInputVO.scrollOnMount : false, (r29 & 64) != 0 ? dateCommonInputVO.placeholder : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dateCommonInputVO.isEnabled : false, (r29 & 256) != 0 ? dateCommonInputVO.dateRange : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? dateCommonInputVO.onSelectAction : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? dateCommonInputVO.defaultValue : null, (r29 & 2048) != 0 ? dateCommonInputVO.rightIcon : null, (r29 & 4096) != 0 ? dateCommonInputVO.leftIcon : null) : null;
        this.requestedDateInputIndex = null;
        if (copy == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.cachedInputs.set(intValue, copy);
        this.updateInput.setValue(new UpdatedInput(copy, InputPayload.CHANGE_VALUE));
    }

    public final void onTextInputChanged(long inputId, String newValue) {
        int i11;
        if (newValue == null) {
            return;
        }
        Iterator<CommonInputVO> it = this.cachedInputs.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (it.next().getId() == inputId) {
                break;
            } else {
                i12++;
            }
        }
        Integer valueOf = Integer.valueOf(i12);
        CommonInputVO.TextCommonInputVO textCommonInputVO = null;
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            CommonInputVO commonInputVO = this.cachedInputs.get(intValue);
            CommonInputVO.TextCommonInputVO textCommonInputVO2 = commonInputVO instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) commonInputVO : null;
            if (Intrinsics.d(textCommonInputVO2 != null ? textCommonInputVO2.getValue() : null, newValue)) {
                return;
            }
            if (textCommonInputVO2 != null) {
                i11 = intValue;
                textCommonInputVO = CommonInputVO.TextCommonInputVO.copy$default(textCommonInputVO2, 0L, null, newValue, false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 2097139, null);
            } else {
                i11 = intValue;
            }
            if (textCommonInputVO == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.cachedInputs.set(i11, textCommonInputVO);
            this.updateInput.setValue(new UpdatedInput(textCommonInputVO, InputPayload.ERROR));
        }
    }

    @NotNull
    public final androidx.lifecycle.P<Operation> operationLiveData() {
        return this.operationLiveData;
    }

    public final void performAction(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        B0 b02 = this.validateJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.validateJob = C10727i.c(this.scope, null, null, new ReportDocumentWidgetViewModel$performAction$1(this, link, null), 3);
    }

    @NotNull
    public final androidx.lifecycle.P<Boolean> progressLiveData() {
        return this.progressLiveData;
    }

    public final void showDateFragment(long id2) {
        Iterator<CommonInputVO> it = this.cachedInputs.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == id2) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            this.requestedDateInputIndex = valueOf;
            CommonInputVO commonInputVO = this.cachedInputs.get(intValue);
            CommonInputVO.DateCommonInputVO dateCommonInputVO = commonInputVO instanceof CommonInputVO.DateCommonInputVO ? (CommonInputVO.DateCommonInputVO) commonInputVO : null;
            if (dateCommonInputVO != null) {
                String value = dateCommonInputVO.getValue();
                if (h.K(value)) {
                    value = null;
                }
                LocalDate e11 = value != null ? this.visibleDateTimeFormatter.e(value) : null;
                SingleLiveEvent<Operation> singleLiveEvent = this.operationLiveData;
                String placeholder = dateCommonInputVO.getPlaceholder();
                Integer valueOf2 = e11 != null ? Integer.valueOf(e11.i()) : null;
                Integer valueOf3 = e11 != null ? Integer.valueOf(e11.n() - 1) : null;
                Integer valueOf4 = e11 != null ? Integer.valueOf(e11.s()) : null;
                CommonInputVO.DateCommonInputVO.DateRange dateRange = dateCommonInputVO.getDateRange();
                Long valueOf5 = dateRange != null ? Long.valueOf(dateRange.getDateStart()) : null;
                CommonInputVO.DateCommonInputVO.DateRange dateRange2 = dateCommonInputVO.getDateRange();
                singleLiveEvent.setValue(new Operation.ShowDateSelector(placeholder, valueOf2, valueOf3, valueOf4, valueOf5, dateRange2 != null ? Long.valueOf(dateRange2.getDateEnd()) : null));
            }
        }
    }

    @NotNull
    public final androidx.lifecycle.P<List<CommonInputVO>> submitInputsLiveData() {
        return this.submitInputsLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<UpdatedInput> updateInput() {
        return this.updateInput;
    }
}
