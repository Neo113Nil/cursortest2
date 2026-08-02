package ru.ozon.app.android.uikit.screenstate;

import Bi.b;
import Kk.C3532b;
import Kk.c;
import V.e;
import Ve.C4636t5;
import Xc.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState;", "", "<init>", "()V", "Loading", "NoConnection", "SecurityIssue", "AntibotAlert", "ServerIssue", "NoScreen", "Custom", "CustomDefault", "Lru/ozon/app/android/uikit/screenstate/ScreenState$AntibotAlert;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$Custom;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$CustomDefault;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$Loading;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$NoConnection;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$NoScreen;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$SecurityIssue;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ScreenState {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$AntibotAlert;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "incidentId", "", "<init>", "(Ljava/lang/String;)V", "getIncidentId", "()Ljava/lang/String;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AntibotAlert extends ScreenState {
        private final String incidentId;

        public AntibotAlert(String str) {
            super(null);
            this.incidentId = str;
        }

        public final String getIncidentId() {
            return this.incidentId;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$CustomDefault;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SelectionItemFormDTO.TITLE_FIELD_NAME, "Ljava/lang/String;", "getTitle", "description", "getDescription", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomDefault extends ScreenState {
        private final String description;
        private final String title;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomDefault)) {
                return false;
            }
            CustomDefault customDefault = (CustomDefault) other;
            return Intrinsics.d(this.title, customDefault.title) && Intrinsics.d(this.description, customDefault.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("CustomDefault(title=", this.title, ", description=", this.description, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$Loading;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends ScreenState {
        public Loading() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$NoConnection;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoConnection extends ScreenState {
        public NoConnection() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$NoScreen;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoScreen extends ScreenState {
        public NoScreen() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$SecurityIssue;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "<init>", "()V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SecurityIssue extends ScreenState {
        public SecurityIssue() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002*+BK\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "Landroid/os/Parcelable;", "", "traceId", "", "isResponseEmpty", "isTestUser", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo;", "composerInfo", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$HttpInfo;", "httpInfo", "timeStamp", "<init>", "(Ljava/lang/String;ZZLru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo;Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$HttpInfo;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTraceId", "Z", "()Z", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo;", "getComposerInfo", "()Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$HttpInfo;", "getHttpInfo", "()Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$HttpInfo;", "getTimeStamp", "ComposerInfo", "HttpInfo", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerIssue extends ScreenState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ServerIssue> CREATOR = new Creator();
        private final ComposerInfo composerInfo;
        private final HttpInfo httpInfo;
        private final boolean isResponseEmpty;
        private final boolean isTestUser;
        private final String timeStamp;
        private final String traceId;

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo;", "Landroid/os/Parcelable;", "", "layoutId", "layoutVersion", "", ImagesContract.URL, "", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget;", "invalidWidgets", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getLayoutId", "()Ljava/lang/Integer;", "getLayoutVersion", "Ljava/lang/String;", "getUrl", "Ljava/util/List;", "getInvalidWidgets", "()Ljava/util/List;", "InvalidWidget", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ComposerInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ComposerInfo> CREATOR = new Creator();

            @NotNull
            private final List<InvalidWidget> invalidWidgets;
            private final Integer layoutId;
            private final Integer layoutVersion;
            private final String url;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ComposerInfo> {
                @Override // android.os.Parcelable.Creator
                public final ComposerInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = b.a(ComposerInfo.class, parcel, arrayList, i11, 1);
                    }
                    return new ComposerInfo(valueOf, valueOf2, readString, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final ComposerInfo[] newArray(int i11) {
                    return new ComposerInfo[i11];
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget;", "Landroid/os/Parcelable;", "<init>", "()V", "UnSupportedWidget", "PrepareWidget", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$PrepareWidget;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$UnSupportedWidget;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class InvalidWidget implements Parcelable {

                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$PrepareWidget;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget;", "Landroid/os/Parcelable;", "", "widgetKey", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$PrepareWidget$Step;", "step", "", "throwable", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$PrepareWidget$Step;Ljava/lang/Throwable;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWidgetKey", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$PrepareWidget$Step;", "getStep", "()Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$PrepareWidget$Step;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Step", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class PrepareWidget extends InvalidWidget implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<PrepareWidget> CREATOR = new Creator();

                    @NotNull
                    private final Step step;
                    private final Throwable throwable;
                    private final String widgetKey;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<PrepareWidget> {
                        @Override // android.os.Parcelable.Creator
                        public final PrepareWidget createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new PrepareWidget(parcel.readString(), Step.valueOf(parcel.readString()), (Throwable) parcel.readSerializable());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final PrepareWidget[] newArray(int i11) {
                            return new PrepareWidget[i11];
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$PrepareWidget$Step;", "", "<init>", "(Ljava/lang/String;I)V", "PARSE", "MAP", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final class Step {
                        private static final /* synthetic */ a $ENTRIES;
                        private static final /* synthetic */ Step[] $VALUES;
                        public static final Step PARSE = new Step("PARSE", 0);
                        public static final Step MAP = new Step("MAP", 1);

                        private static final /* synthetic */ Step[] $values() {
                            return new Step[]{PARSE, MAP};
                        }

                        static {
                            Step[] $values = $values();
                            $VALUES = $values;
                            $ENTRIES = Xc.b.a($values);
                        }

                        private Step(String str, int i11) {
                        }

                        public static Step valueOf(String str) {
                            return (Step) Enum.valueOf(Step.class, str);
                        }

                        public static Step[] values() {
                            return (Step[]) $VALUES.clone();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public PrepareWidget(String str, @NotNull Step step, Throwable th2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(step, "step");
                        this.widgetKey = str;
                        this.step = step;
                        this.throwable = th2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof PrepareWidget)) {
                            return false;
                        }
                        PrepareWidget prepareWidget = (PrepareWidget) other;
                        return Intrinsics.d(this.widgetKey, prepareWidget.widgetKey) && this.step == prepareWidget.step && Intrinsics.d(this.throwable, prepareWidget.throwable);
                    }

                    @NotNull
                    public final Step getStep() {
                        return this.step;
                    }

                    public final Throwable getThrowable() {
                        return this.throwable;
                    }

                    public String getWidgetKey() {
                        return this.widgetKey;
                    }

                    public int hashCode() {
                        String str = this.widgetKey;
                        int hashCode = (this.step.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                        Throwable th2 = this.throwable;
                        return hashCode + (th2 != null ? th2.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "PrepareWidget(widgetKey=" + this.widgetKey + ", step=" + this.step + ", throwable=" + this.throwable + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.widgetKey);
                        dest.writeString(this.step.name());
                        dest.writeSerializable(this.throwable);
                    }
                }

                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget$UnSupportedWidget;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget;", "Landroid/os/Parcelable;", "", "widgetKey", "", "isWidgetSupported", "<init>", "(Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWidgetKey", "Z", "()Z", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class UnSupportedWidget extends InvalidWidget implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<UnSupportedWidget> CREATOR = new Creator();
                    private final boolean isWidgetSupported;
                    private final String widgetKey;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<UnSupportedWidget> {
                        @Override // android.os.Parcelable.Creator
                        public final UnSupportedWidget createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new UnSupportedWidget(parcel.readString(), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final UnSupportedWidget[] newArray(int i11) {
                            return new UnSupportedWidget[i11];
                        }
                    }

                    public UnSupportedWidget(String str, boolean z11) {
                        super(null);
                        this.widgetKey = str;
                        this.isWidgetSupported = z11;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof UnSupportedWidget)) {
                            return false;
                        }
                        UnSupportedWidget unSupportedWidget = (UnSupportedWidget) other;
                        return Intrinsics.d(this.widgetKey, unSupportedWidget.widgetKey) && this.isWidgetSupported == unSupportedWidget.isWidgetSupported;
                    }

                    public String getWidgetKey() {
                        return this.widgetKey;
                    }

                    public int hashCode() {
                        String str = this.widgetKey;
                        return Boolean.hashCode(this.isWidgetSupported) + ((str == null ? 0 : str.hashCode()) * 31);
                    }

                    /* renamed from: isWidgetSupported, reason: from getter */
                    public final boolean getIsWidgetSupported() {
                        return this.isWidgetSupported;
                    }

                    @NotNull
                    public String toString() {
                        return Ak.b.f("UnSupportedWidget(widgetKey=", this.widgetKey, ", isWidgetSupported=", ")", this.isWidgetSupported);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.widgetKey);
                        dest.writeInt(this.isWidgetSupported ? 1 : 0);
                    }
                }

                public /* synthetic */ InvalidWidget(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private InvalidWidget() {
                }
            }

            public ComposerInfo() {
                this(null, null, null, null, 15, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ComposerInfo)) {
                    return false;
                }
                ComposerInfo composerInfo = (ComposerInfo) other;
                return Intrinsics.d(this.layoutId, composerInfo.layoutId) && Intrinsics.d(this.layoutVersion, composerInfo.layoutVersion) && Intrinsics.d(this.url, composerInfo.url) && Intrinsics.d(this.invalidWidgets, composerInfo.invalidWidgets);
            }

            @NotNull
            public final List<InvalidWidget> getInvalidWidgets() {
                return this.invalidWidgets;
            }

            public final Integer getLayoutId() {
                return this.layoutId;
            }

            public final Integer getLayoutVersion() {
                return this.layoutVersion;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                Integer num = this.layoutId;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.layoutVersion;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str = this.url;
                return this.invalidWidgets.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                Integer num = this.layoutId;
                Integer num2 = this.layoutVersion;
                String str = this.url;
                List<InvalidWidget> list = this.invalidWidgets;
                StringBuilder f7 = c.f("ComposerInfo(layoutId=", ", layoutVersion=", num, num2, ", url=");
                f7.append(str);
                f7.append(", invalidWidgets=");
                f7.append(list);
                f7.append(")");
                return f7.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.layoutId;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                Integer num2 = this.layoutVersion;
                if (num2 == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num2);
                }
                dest.writeString(this.url);
                Iterator c11 = Bi.a.c(this.invalidWidgets, dest);
                while (c11.hasNext()) {
                    dest.writeParcelable((Parcelable) c11.next(), flags);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ComposerInfo(Integer num, Integer num2, String str, @NotNull List<? extends InvalidWidget> invalidWidgets) {
                Intrinsics.checkNotNullParameter(invalidWidgets, "invalidWidgets");
                this.layoutId = num;
                this.layoutVersion = num2;
                this.url = str;
                this.invalidWidgets = invalidWidgets;
            }

            public ComposerInfo(Integer num, Integer num2, String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? K.f71697a : list);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ServerIssue> {
            @Override // android.os.Parcelable.Creator
            public final ServerIssue createFromParcel(Parcel parcel) {
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                boolean z12 = false;
                if (parcel.readInt() != 0) {
                    z11 = false;
                    z12 = true;
                } else {
                    z11 = false;
                }
                return new ServerIssue(readString, z12, parcel.readInt() == 0 ? z11 : true, parcel.readInt() == 0 ? null : ComposerInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HttpInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServerIssue[] newArray(int i11) {
                return new ServerIssue[i11];
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$HttpInfo;", "Landroid/os/Parcelable;", "", "code", "", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMessage", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HttpInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<HttpInfo> CREATOR = new Creator();
            private final Integer code;
            private final String message;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HttpInfo> {
                @Override // android.os.Parcelable.Creator
                public final HttpInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new HttpInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final HttpInfo[] newArray(int i11) {
                    return new HttpInfo[i11];
                }
            }

            public HttpInfo(Integer num, String str) {
                this.code = num;
                this.message = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HttpInfo)) {
                    return false;
                }
                HttpInfo httpInfo = (HttpInfo) other;
                return Intrinsics.d(this.code, httpInfo.code) && Intrinsics.d(this.message, httpInfo.message);
            }

            public final Integer getCode() {
                return this.code;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                Integer num = this.code;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.message;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "HttpInfo(code=" + this.code + ", message=" + this.message + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.code;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeString(this.message);
            }
        }

        public ServerIssue() {
            this(null, false, false, null, null, null, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerIssue)) {
                return false;
            }
            ServerIssue serverIssue = (ServerIssue) other;
            return Intrinsics.d(this.traceId, serverIssue.traceId) && this.isResponseEmpty == serverIssue.isResponseEmpty && this.isTestUser == serverIssue.isTestUser && Intrinsics.d(this.composerInfo, serverIssue.composerInfo) && Intrinsics.d(this.httpInfo, serverIssue.httpInfo) && Intrinsics.d(this.timeStamp, serverIssue.timeStamp);
        }

        public final ComposerInfo getComposerInfo() {
            return this.composerInfo;
        }

        public final HttpInfo getHttpInfo() {
            return this.httpInfo;
        }

        public final String getTimeStamp() {
            return this.timeStamp;
        }

        public final String getTraceId() {
            return this.traceId;
        }

        public int hashCode() {
            String str = this.traceId;
            int a11 = C3532b.a(C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isResponseEmpty), 31, this.isTestUser);
            ComposerInfo composerInfo = this.composerInfo;
            int hashCode = (a11 + (composerInfo == null ? 0 : composerInfo.hashCode())) * 31;
            HttpInfo httpInfo = this.httpInfo;
            int hashCode2 = (hashCode + (httpInfo == null ? 0 : httpInfo.hashCode())) * 31;
            String str2 = this.timeStamp;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: isResponseEmpty, reason: from getter */
        public final boolean getIsResponseEmpty() {
            return this.isResponseEmpty;
        }

        /* renamed from: isTestUser, reason: from getter */
        public final boolean getIsTestUser() {
            return this.isTestUser;
        }

        @NotNull
        public String toString() {
            String str = this.traceId;
            boolean z11 = this.isResponseEmpty;
            boolean z12 = this.isTestUser;
            ComposerInfo composerInfo = this.composerInfo;
            HttpInfo httpInfo = this.httpInfo;
            String str2 = this.timeStamp;
            StringBuilder b11 = C4636t5.b("ServerIssue(traceId=", str, ", isResponseEmpty=", ", isTestUser=", z11);
            b11.append(z12);
            b11.append(", composerInfo=");
            b11.append(composerInfo);
            b11.append(", httpInfo=");
            b11.append(httpInfo);
            b11.append(", timeStamp=");
            b11.append(str2);
            b11.append(")");
            return b11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.traceId);
            dest.writeInt(this.isResponseEmpty ? 1 : 0);
            dest.writeInt(this.isTestUser ? 1 : 0);
            ComposerInfo composerInfo = this.composerInfo;
            if (composerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                composerInfo.writeToParcel(dest, flags);
            }
            HttpInfo httpInfo = this.httpInfo;
            if (httpInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                httpInfo.writeToParcel(dest, flags);
            }
            dest.writeString(this.timeStamp);
        }

        public /* synthetic */ ServerIssue(String str, boolean z11, boolean z12, ComposerInfo composerInfo, HttpInfo httpInfo, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? null : composerInfo, (i11 & 16) != 0 ? null : httpInfo, (i11 & 32) != 0 ? null : str2);
        }

        public ServerIssue(String str, boolean z11, boolean z12, ComposerInfo composerInfo, HttpInfo httpInfo, String str2) {
            super(null);
            this.traceId = str;
            this.isResponseEmpty = z11;
            this.isTestUser = z12;
            this.composerInfo = composerInfo;
            this.httpInfo = httpInfo;
            this.timeStamp = str2;
        }
    }

    public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ScreenState() {
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenState$Custom;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "buttonText", "buttons", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "buttonsActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionButtonClickListener", "Lkotlin/Function0;", "onDescriptionClickAction", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButtonText", "getButtons", "()Ljava/util/List;", "getButtonsActionHandler", "()Lkotlin/jvm/functions/Function1;", "getActionButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "getOnDescriptionClickAction", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Custom extends ScreenState {
        private final Function0<Unit> actionButtonClickListener;
        private final String buttonText;

        @NotNull
        private final List<ButtonV3Atom.SmallButton> buttons;
        private final Function1<AtomAction, Unit> buttonsActionHandler;
        private final String description;
        private final Integer icon;
        private final Function0<Unit> onDescriptionClickAction;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Custom(Integer num, String str, String str2, String str3, @NotNull List<ButtonV3Atom.SmallButton> buttons, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
            super(null);
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.icon = num;
            this.title = str;
            this.description = str2;
            this.buttonText = str3;
            this.buttons = buttons;
            this.buttonsActionHandler = function1;
            this.actionButtonClickListener = function0;
            this.onDescriptionClickAction = function02;
        }

        public final Function0<Unit> getActionButtonClickListener() {
            return this.actionButtonClickListener;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        @NotNull
        public final List<ButtonV3Atom.SmallButton> getButtons() {
            return this.buttons;
        }

        public final Function1<AtomAction, Unit> getButtonsActionHandler() {
            return this.buttonsActionHandler;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final Function0<Unit> getOnDescriptionClickAction() {
            return this.onDescriptionClickAction;
        }

        public final String getTitle() {
            return this.title;
        }

        public Custom(Integer num, String str, String str2, String str3, List list, Function1 function1, Function0 function0, Function0 function02, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? K.f71697a : list, (i11 & 32) != 0 ? null : function1, (i11 & 64) != 0 ? null : function0, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : function02);
        }
    }
}
