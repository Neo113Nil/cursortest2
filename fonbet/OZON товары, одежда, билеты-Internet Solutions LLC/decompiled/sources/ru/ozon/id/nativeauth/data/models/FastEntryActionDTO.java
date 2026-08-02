package ru.ozon.id.nativeauth.data.models;

import B0.A0;
import C.J;
import C.o0;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Pk0.c;
import T7.P;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSelectedKeyDto;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004-./0B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020 R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00061"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO;", "Lru/ozon/id/nativeauth/data/models/AuthActionDTO;", "Landroid/os/Parcelable;", "status", "Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;", "data", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;", "error", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;", "notification", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$EntryNotification;", "sharedStoreKeysInfo", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$SharedStoreKeysInfo;", "<init>", "(Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$EntryNotification;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$SharedStoreKeysInfo;)V", "getStatus", "()Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;", "getData", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;", "getError", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;", "getNotification", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$EntryNotification;", "getSharedStoreKeysInfo", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$SharedStoreKeysInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FastEntryDataDTO", "ErrorDTO", "EntryNotification", "SharedStoreKeysInfo", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FastEntryActionDTO implements AuthActionDTO, Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastEntryActionDTO> CREATOR = new a();
    private final FastEntryDataDTO data;
    private final ErrorDTO error;
    private final EntryNotification notification;
    private final SharedStoreKeysInfo sharedStoreKeysInfo;
    private final AuthActionDTO.StatusDTO status;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$EntryNotification;", "Landroid/os/Parcelable;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EntryNotification implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EntryNotification> CREATOR = new a();

        @NotNull
        private final String message;

        public static final class a implements Parcelable.Creator<EntryNotification> {
            @Override // android.os.Parcelable.Creator
            public final EntryNotification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EntryNotification(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EntryNotification[] newArray(int i11) {
                return new EntryNotification[i11];
            }
        }

        public EntryNotification(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ EntryNotification copy$default(EntryNotification entryNotification, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = entryNotification.message;
            }
            return entryNotification.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final EntryNotification copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new EntryNotification(message);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EntryNotification) && Intrinsics.d(this.message, ((EntryNotification) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("EntryNotification(message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.message);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u001a¨\u0006."}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$b;", "type", "", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$FieldDTO;", "fields", "", "message", "errorButtonAction", "<init>", "(Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$b;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$b;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$b;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$b;", "getType", "Ljava/util/List;", "getFields", "Ljava/lang/String;", "getMessage", "getErrorButtonAction", "b", "FieldDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ErrorDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ErrorDTO> CREATOR = new a();
        private final String errorButtonAction;
        private final List<FieldDTO> fields;
        private final String message;

        @NotNull
        private final b type;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$FieldDTO;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FieldDTO implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<FieldDTO> CREATOR = new a();

            @NotNull
            private final String message;

            @NotNull
            private final String name;

            public static final class a implements Parcelable.Creator<FieldDTO> {
                @Override // android.os.Parcelable.Creator
                public final FieldDTO createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FieldDTO(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final FieldDTO[] newArray(int i11) {
                    return new FieldDTO[i11];
                }
            }

            public FieldDTO(@NotNull String name, @NotNull String message) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(message, "message");
                this.name = name;
                this.message = message;
            }

            public static /* synthetic */ FieldDTO copy$default(FieldDTO fieldDTO, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = fieldDTO.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = fieldDTO.message;
                }
                return fieldDTO.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final FieldDTO copy(@NotNull String name, @NotNull String message) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(message, "message");
                return new FieldDTO(name, message);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FieldDTO)) {
                    return false;
                }
                FieldDTO fieldDTO = (FieldDTO) other;
                return Intrinsics.d(this.name, fieldDTO.name) && Intrinsics.d(this.message, fieldDTO.message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.message.hashCode() + (this.name.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("FieldDTO(name=", this.name, ", message=", this.message, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.name);
                dest.writeString(this.message);
            }
        }

        public static final class a implements Parcelable.Creator<ErrorDTO> {
            @Override // android.os.Parcelable.Creator
            public final ErrorDTO createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b valueOf = b.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Ak.b.b(FieldDTO.CREATOR, parcel, arrayList2, i11, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ErrorDTO(valueOf, arrayList, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorDTO[] newArray(int i11) {
                return new ErrorDTO[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$b;", "", "<init>", "(Ljava/lang/String;I)V", "VALIDATION", "RESTRICTION", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class b {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;

            @i(name = DeleteAccountApiResponse.Error.TYPE_VALIDATION)
            public static final b VALIDATION = new b("VALIDATION", 0);

            @i(name = DeleteAccountApiResponse.Error.TYPE_RESTRICTION)
            public static final b RESTRICTION = new b("RESTRICTION", 1);

            private static final /* synthetic */ b[] $values() {
                return new b[]{VALIDATION, RESTRICTION};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private b(String str, int i11) {
            }

            @NotNull
            public static Xc.a<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public ErrorDTO(@NotNull b type, List<FieldDTO> list, String str, String str2) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.fields = list;
            this.message = str;
            this.errorButtonAction = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ErrorDTO copy$default(ErrorDTO errorDTO, b bVar, List list, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = errorDTO.type;
            }
            if ((i11 & 2) != 0) {
                list = errorDTO.fields;
            }
            if ((i11 & 4) != 0) {
                str = errorDTO.message;
            }
            if ((i11 & 8) != 0) {
                str2 = errorDTO.errorButtonAction;
            }
            return errorDTO.copy(bVar, list, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final b getType() {
            return this.type;
        }

        public final List<FieldDTO> component2() {
            return this.fields;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final String getErrorButtonAction() {
            return this.errorButtonAction;
        }

        @NotNull
        public final ErrorDTO copy(@NotNull b type, List<FieldDTO> fields, String message, String errorButtonAction) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new ErrorDTO(type, fields, message, errorButtonAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorDTO)) {
                return false;
            }
            ErrorDTO errorDTO = (ErrorDTO) other;
            return this.type == errorDTO.type && Intrinsics.d(this.fields, errorDTO.fields) && Intrinsics.d(this.message, errorDTO.message) && Intrinsics.d(this.errorButtonAction, errorDTO.errorButtonAction);
        }

        public final String getErrorButtonAction() {
            return this.errorButtonAction;
        }

        public final List<FieldDTO> getFields() {
            return this.fields;
        }

        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final b getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            List<FieldDTO> list = this.fields;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.message;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.errorButtonAction;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            b bVar = this.type;
            List<FieldDTO> list = this.fields;
            String str = this.message;
            String str2 = this.errorButtonAction;
            StringBuilder sb2 = new StringBuilder("ErrorDTO(type=");
            sb2.append(bVar);
            sb2.append(", fields=");
            sb2.append(list);
            sb2.append(", message=");
            return C3173b.c(sb2, str, ", errorButtonAction=", str2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
            List<FieldDTO> list = this.fields;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    ((FieldDTO) c11.next()).writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.message);
            dest.writeString(this.errorButtonAction);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004@ABCBM\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b-\u0010\u001aJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b;\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010'¨\u0006D"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;", "Lru/ozon/id/nativeauth/data/models/AuthActionDTO$a;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "authToken", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;", "authMethod", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$MobileId;", "mobileId", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;", "mobileIdCurtain", "vkIdCurtain", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "biometry", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "agreementCurtain", "<init>", "(Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$MobileId;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "component2", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;", "component3", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$MobileId;", "component4", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;", "component5", "component6", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "component7", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "copy", "(Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$MobileId;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;)Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "getAuthToken", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;", "getAuthMethod", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$MobileId;", "getMobileId", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;", "getMobileIdCurtain", "getVkIdCurtain", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "getBiometry", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "getAgreementCurtain", "FastEntryAuthMethodDTO", "FastEntryBiometryDTO", "MobileId", "AuthCurtain", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class FastEntryDataDTO implements AuthActionDTO.a, Parcelable {

        @NotNull
        public static final Parcelable.Creator<FastEntryDataDTO> CREATOR = new a();
        private final OtpDTO.AgreementSheet agreementCurtain;
        private final FastEntryAuthMethodDTO authMethod;
        private final AuthTokenDTO authToken;
        private final FastEntryBiometryDTO biometry;
        private final MobileId mobileId;
        private final AuthCurtain mobileIdCurtain;
        private final AuthCurtain vkIdCurtain;

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain;", "Landroid/os/Parcelable;", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "button", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain$Button;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain$Button;)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getButton", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain$Button;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Button", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class AuthCurtain implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AuthCurtain> CREATOR = new a();

            @NotNull
            private final Button button;

            @NotNull
            private final String image;

            @NotNull
            private final OzonSpannableString subtitle;

            @NotNull
            private final OzonSpannableString title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$AuthCurtain$Button;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Button implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Button> CREATOR = new a();

                @NotNull
                private final String title;

                public static final class a implements Parcelable.Creator<Button> {
                    @Override // android.os.Parcelable.Creator
                    public final Button createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Button(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Button[] newArray(int i11) {
                        return new Button[i11];
                    }
                }

                public Button(@NotNull String title) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                }

                public static /* synthetic */ Button copy$default(Button button, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = button.title;
                    }
                    return button.copy(str);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final Button copy(@NotNull String title) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new Button(title);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Button) && Intrinsics.d(this.title, ((Button) other).title);
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.title.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("Button(title=", this.title, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.title);
                }
            }

            public static final class a implements Parcelable.Creator<AuthCurtain> {
                @Override // android.os.Parcelable.Creator
                public final AuthCurtain createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    Ac0.a aVar = Ac0.a.f750a;
                    return new AuthCurtain(readString, aVar.a(parcel), aVar.a(parcel), Button.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final AuthCurtain[] newArray(int i11) {
                    return new AuthCurtain[i11];
                }
            }

            public AuthCurtain(@NotNull String image, @NotNull OzonSpannableString title, @NotNull OzonSpannableString subtitle, @NotNull Button button) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(button, "button");
                this.image = image;
                this.title = title;
                this.subtitle = subtitle;
                this.button = button;
            }

            public static /* synthetic */ AuthCurtain copy$default(AuthCurtain authCurtain, String str, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, Button button, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = authCurtain.image;
                }
                if ((i11 & 2) != 0) {
                    ozonSpannableString = authCurtain.title;
                }
                if ((i11 & 4) != 0) {
                    ozonSpannableString2 = authCurtain.subtitle;
                }
                if ((i11 & 8) != 0) {
                    button = authCurtain.button;
                }
                return authCurtain.copy(str, ozonSpannableString, ozonSpannableString2, button);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final Button getButton() {
                return this.button;
            }

            @NotNull
            public final AuthCurtain copy(@NotNull String image, @NotNull OzonSpannableString title, @NotNull OzonSpannableString subtitle, @NotNull Button button) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(button, "button");
                return new AuthCurtain(image, title, subtitle, button);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AuthCurtain)) {
                    return false;
                }
                AuthCurtain authCurtain = (AuthCurtain) other;
                return Intrinsics.d(this.image, authCurtain.image) && Intrinsics.d(this.title, authCurtain.title) && Intrinsics.d(this.subtitle, authCurtain.subtitle) && Intrinsics.d(this.button, authCurtain.button);
            }

            @NotNull
            public final Button getButton() {
                return this.button;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.button.hashCode() + P.c(this.subtitle, P.c(this.title, this.image.hashCode() * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                OzonSpannableString ozonSpannableString = this.title;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                return "AuthCurtain(image=" + str + ", title=" + ((Object) ozonSpannableString) + ", subtitle=" + ((Object) ozonSpannableString2) + ", button=" + this.button + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.image);
                OzonSpannableString ozonSpannableString = this.title;
                Intrinsics.checkNotNullParameter(dest, "parcel");
                if (ozonSpannableString == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(Html.toHtml(ozonSpannableString, 1));
                }
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                Intrinsics.checkNotNullParameter(dest, "parcel");
                if (ozonSpannableString2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(Html.toHtml(ozonSpannableString2, 1));
                }
                this.button.writeToParcel(dest, flags);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO$b;", "type", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "biometry", "", "instantAuthAction", "<init>", "(Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO$b;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO$b;", "component2", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "component3", "()Ljava/lang/String;", "copy", "(Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO$b;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;Ljava/lang/String;)Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO$b;", "getType", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "getBiometry", "Ljava/lang/String;", "getInstantAuthAction", "b", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class FastEntryAuthMethodDTO implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<FastEntryAuthMethodDTO> CREATOR = new a();
            private final FastEntryBiometryDTO biometry;
            private final String instantAuthAction;

            @NotNull
            private final b type;

            public static final class a implements Parcelable.Creator<FastEntryAuthMethodDTO> {
                @Override // android.os.Parcelable.Creator
                public final FastEntryAuthMethodDTO createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FastEntryAuthMethodDTO(b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : FastEntryBiometryDTO.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final FastEntryAuthMethodDTO[] newArray(int i11) {
                    return new FastEntryAuthMethodDTO[i11];
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryAuthMethodDTO$b;", "", "<init>", "(Ljava/lang/String;I)V", "Biometry", "Instant", "Sequential", "AuthMethodSelector", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = false)
            public static final class b {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ b[] $VALUES;

                @i(name = "biometry")
                public static final b Biometry = new b("Biometry", 0);

                @i(name = "smartLock")
                public static final b Instant = new b("Instant", 1);

                @i(name = "sequential")
                public static final b Sequential = new b("Sequential", 2);

                @i(name = "selectorAuthMethod")
                public static final b AuthMethodSelector = new b("AuthMethodSelector", 3);

                private static final /* synthetic */ b[] $values() {
                    return new b[]{Biometry, Instant, Sequential, AuthMethodSelector};
                }

                static {
                    b[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private b(String str, int i11) {
                }

                @NotNull
                public static Xc.a<b> getEntries() {
                    return $ENTRIES;
                }

                public static b valueOf(String str) {
                    return (b) Enum.valueOf(b.class, str);
                }

                public static b[] values() {
                    return (b[]) $VALUES.clone();
                }
            }

            public FastEntryAuthMethodDTO(@NotNull b type, FastEntryBiometryDTO fastEntryBiometryDTO, @i(name = "action") String str) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.biometry = fastEntryBiometryDTO;
                this.instantAuthAction = str;
            }

            public static /* synthetic */ FastEntryAuthMethodDTO copy$default(FastEntryAuthMethodDTO fastEntryAuthMethodDTO, b bVar, FastEntryBiometryDTO fastEntryBiometryDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    bVar = fastEntryAuthMethodDTO.type;
                }
                if ((i11 & 2) != 0) {
                    fastEntryBiometryDTO = fastEntryAuthMethodDTO.biometry;
                }
                if ((i11 & 4) != 0) {
                    str = fastEntryAuthMethodDTO.instantAuthAction;
                }
                return fastEntryAuthMethodDTO.copy(bVar, fastEntryBiometryDTO, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final b getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final FastEntryBiometryDTO getBiometry() {
                return this.biometry;
            }

            /* renamed from: component3, reason: from getter */
            public final String getInstantAuthAction() {
                return this.instantAuthAction;
            }

            @NotNull
            public final FastEntryAuthMethodDTO copy(@NotNull b type, FastEntryBiometryDTO biometry, @i(name = "action") String instantAuthAction) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new FastEntryAuthMethodDTO(type, biometry, instantAuthAction);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FastEntryAuthMethodDTO)) {
                    return false;
                }
                FastEntryAuthMethodDTO fastEntryAuthMethodDTO = (FastEntryAuthMethodDTO) other;
                return this.type == fastEntryAuthMethodDTO.type && Intrinsics.d(this.biometry, fastEntryAuthMethodDTO.biometry) && Intrinsics.d(this.instantAuthAction, fastEntryAuthMethodDTO.instantAuthAction);
            }

            public final FastEntryBiometryDTO getBiometry() {
                return this.biometry;
            }

            public final String getInstantAuthAction() {
                return this.instantAuthAction;
            }

            @NotNull
            public final b getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                FastEntryBiometryDTO fastEntryBiometryDTO = this.biometry;
                int hashCode2 = (hashCode + (fastEntryBiometryDTO == null ? 0 : fastEntryBiometryDTO.hashCode())) * 31;
                String str = this.instantAuthAction;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                b bVar = this.type;
                FastEntryBiometryDTO fastEntryBiometryDTO = this.biometry;
                String str = this.instantAuthAction;
                StringBuilder sb2 = new StringBuilder("FastEntryAuthMethodDTO(type=");
                sb2.append(bVar);
                sb2.append(", biometry=");
                sb2.append(fastEntryBiometryDTO);
                sb2.append(", instantAuthAction=");
                return o0.c(sb2, str, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.type.name());
                FastEntryBiometryDTO fastEntryBiometryDTO = this.biometry;
                if (fastEntryBiometryDTO == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    fastEntryBiometryDTO.writeToParcel(dest, flags);
                }
                dest.writeString(this.instantAuthAction);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO;", "Landroid/os/Parcelable;", "permission", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO$PermissionDTO;", "analyticTag", "", "<init>", "(Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO$PermissionDTO;Ljava/lang/String;)V", "getPermission", "()Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO$PermissionDTO;", "getAnalyticTag", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PermissionDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class FastEntryBiometryDTO implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<FastEntryBiometryDTO> CREATOR = new a();

            @NotNull
            private final String analyticTag;

            @NotNull
            private final PermissionDTO permission;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$FastEntryBiometryDTO$PermissionDTO;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PermissionDTO implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PermissionDTO> CREATOR = new a();

                @NotNull
                private final String subtitle;

                @NotNull
                private final String title;

                public static final class a implements Parcelable.Creator<PermissionDTO> {
                    @Override // android.os.Parcelable.Creator
                    public final PermissionDTO createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PermissionDTO(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final PermissionDTO[] newArray(int i11) {
                        return new PermissionDTO[i11];
                    }
                }

                public PermissionDTO(@NotNull String title, @NotNull String subtitle) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    this.title = title;
                    this.subtitle = subtitle;
                }

                public static /* synthetic */ PermissionDTO copy$default(PermissionDTO permissionDTO, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = permissionDTO.title;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = permissionDTO.subtitle;
                    }
                    return permissionDTO.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final PermissionDTO copy(@NotNull String title, @NotNull String subtitle) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    return new PermissionDTO(title, subtitle);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PermissionDTO)) {
                        return false;
                    }
                    PermissionDTO permissionDTO = (PermissionDTO) other;
                    return Intrinsics.d(this.title, permissionDTO.title) && Intrinsics.d(this.subtitle, permissionDTO.subtitle);
                }

                @NotNull
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.subtitle.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("PermissionDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.title);
                    dest.writeString(this.subtitle);
                }
            }

            public static final class a implements Parcelable.Creator<FastEntryBiometryDTO> {
                @Override // android.os.Parcelable.Creator
                public final FastEntryBiometryDTO createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FastEntryBiometryDTO(PermissionDTO.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final FastEntryBiometryDTO[] newArray(int i11) {
                    return new FastEntryBiometryDTO[i11];
                }
            }

            public FastEntryBiometryDTO(@NotNull PermissionDTO permission, @NotNull String analyticTag) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
                this.permission = permission;
                this.analyticTag = analyticTag;
            }

            public static /* synthetic */ FastEntryBiometryDTO copy$default(FastEntryBiometryDTO fastEntryBiometryDTO, PermissionDTO permissionDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    permissionDTO = fastEntryBiometryDTO.permission;
                }
                if ((i11 & 2) != 0) {
                    str = fastEntryBiometryDTO.analyticTag;
                }
                return fastEntryBiometryDTO.copy(permissionDTO, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final PermissionDTO getPermission() {
                return this.permission;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getAnalyticTag() {
                return this.analyticTag;
            }

            @NotNull
            public final FastEntryBiometryDTO copy(@NotNull PermissionDTO permission, @NotNull String analyticTag) {
                Intrinsics.checkNotNullParameter(permission, "permission");
                Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
                return new FastEntryBiometryDTO(permission, analyticTag);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FastEntryBiometryDTO)) {
                    return false;
                }
                FastEntryBiometryDTO fastEntryBiometryDTO = (FastEntryBiometryDTO) other;
                return Intrinsics.d(this.permission, fastEntryBiometryDTO.permission) && Intrinsics.d(this.analyticTag, fastEntryBiometryDTO.analyticTag);
            }

            @NotNull
            public final String getAnalyticTag() {
                return this.analyticTag;
            }

            @NotNull
            public final PermissionDTO getPermission() {
                return this.permission;
            }

            public int hashCode() {
                return this.analyticTag.hashCode() + (this.permission.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "FastEntryBiometryDTO(permission=" + this.permission + ", analyticTag=" + this.analyticTag + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.permission.writeToParcel(dest, flags);
                dest.writeString(this.analyticTag);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO$MobileId;", "Landroid/os/Parcelable;", "mobileIdUrl", "", "continueAction", "continueTimeout", "", "trackingAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getMobileIdUrl", "()Ljava/lang/String;", "getContinueAction", "getContinueTimeout", "()J", "getTrackingAction", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MobileId implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<MobileId> CREATOR = new a();

            @NotNull
            private final String continueAction;
            private final long continueTimeout;

            @NotNull
            private final String mobileIdUrl;
            private final String trackingAction;

            public static final class a implements Parcelable.Creator<MobileId> {
                @Override // android.os.Parcelable.Creator
                public final MobileId createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MobileId(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MobileId[] newArray(int i11) {
                    return new MobileId[i11];
                }
            }

            public MobileId(@NotNull String mobileIdUrl, @NotNull String continueAction, long j11, String str) {
                Intrinsics.checkNotNullParameter(mobileIdUrl, "mobileIdUrl");
                Intrinsics.checkNotNullParameter(continueAction, "continueAction");
                this.mobileIdUrl = mobileIdUrl;
                this.continueAction = continueAction;
                this.continueTimeout = j11;
                this.trackingAction = str;
            }

            public static /* synthetic */ MobileId copy$default(MobileId mobileId, String str, String str2, long j11, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = mobileId.mobileIdUrl;
                }
                if ((i11 & 2) != 0) {
                    str2 = mobileId.continueAction;
                }
                if ((i11 & 4) != 0) {
                    j11 = mobileId.continueTimeout;
                }
                if ((i11 & 8) != 0) {
                    str3 = mobileId.trackingAction;
                }
                String str4 = str3;
                return mobileId.copy(str, str2, j11, str4);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getMobileIdUrl() {
                return this.mobileIdUrl;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getContinueAction() {
                return this.continueAction;
            }

            /* renamed from: component3, reason: from getter */
            public final long getContinueTimeout() {
                return this.continueTimeout;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTrackingAction() {
                return this.trackingAction;
            }

            @NotNull
            public final MobileId copy(@NotNull String mobileIdUrl, @NotNull String continueAction, long continueTimeout, String trackingAction) {
                Intrinsics.checkNotNullParameter(mobileIdUrl, "mobileIdUrl");
                Intrinsics.checkNotNullParameter(continueAction, "continueAction");
                return new MobileId(mobileIdUrl, continueAction, continueTimeout, trackingAction);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MobileId)) {
                    return false;
                }
                MobileId mobileId = (MobileId) other;
                return Intrinsics.d(this.mobileIdUrl, mobileId.mobileIdUrl) && Intrinsics.d(this.continueAction, mobileId.continueAction) && this.continueTimeout == mobileId.continueTimeout && Intrinsics.d(this.trackingAction, mobileId.trackingAction);
            }

            @NotNull
            public final String getContinueAction() {
                return this.continueAction;
            }

            public final long getContinueTimeout() {
                return this.continueTimeout;
            }

            @NotNull
            public final String getMobileIdUrl() {
                return this.mobileIdUrl;
            }

            public final String getTrackingAction() {
                return this.trackingAction;
            }

            public int hashCode() {
                int a11 = c.a(g.a(this.mobileIdUrl.hashCode() * 31, 31, this.continueAction), 31, this.continueTimeout);
                String str = this.trackingAction;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.mobileIdUrl;
                String str2 = this.continueAction;
                long j11 = this.continueTimeout;
                String str3 = this.trackingAction;
                StringBuilder d11 = C3660k.d("MobileId(mobileIdUrl=", str, ", continueAction=", str2, ", continueTimeout=");
                d11.append(j11);
                d11.append(", trackingAction=");
                d11.append(str3);
                d11.append(")");
                return d11.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mobileIdUrl);
                dest.writeString(this.continueAction);
                dest.writeLong(this.continueTimeout);
                dest.writeString(this.trackingAction);
            }
        }

        public static final class a implements Parcelable.Creator<FastEntryDataDTO> {
            @Override // android.os.Parcelable.Creator
            public final FastEntryDataDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FastEntryDataDTO(parcel.readInt() == 0 ? null : AuthTokenDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FastEntryAuthMethodDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MobileId.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthCurtain.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthCurtain.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FastEntryBiometryDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OtpDTO.AgreementSheet.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final FastEntryDataDTO[] newArray(int i11) {
                return new FastEntryDataDTO[i11];
            }
        }

        public FastEntryDataDTO(AuthTokenDTO authTokenDTO, FastEntryAuthMethodDTO fastEntryAuthMethodDTO, MobileId mobileId, AuthCurtain authCurtain, AuthCurtain authCurtain2, FastEntryBiometryDTO fastEntryBiometryDTO, OtpDTO.AgreementSheet agreementSheet) {
            this.authToken = authTokenDTO;
            this.authMethod = fastEntryAuthMethodDTO;
            this.mobileId = mobileId;
            this.mobileIdCurtain = authCurtain;
            this.vkIdCurtain = authCurtain2;
            this.biometry = fastEntryBiometryDTO;
            this.agreementCurtain = agreementSheet;
        }

        public static /* synthetic */ FastEntryDataDTO copy$default(FastEntryDataDTO fastEntryDataDTO, AuthTokenDTO authTokenDTO, FastEntryAuthMethodDTO fastEntryAuthMethodDTO, MobileId mobileId, AuthCurtain authCurtain, AuthCurtain authCurtain2, FastEntryBiometryDTO fastEntryBiometryDTO, OtpDTO.AgreementSheet agreementSheet, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                authTokenDTO = fastEntryDataDTO.authToken;
            }
            if ((i11 & 2) != 0) {
                fastEntryAuthMethodDTO = fastEntryDataDTO.authMethod;
            }
            if ((i11 & 4) != 0) {
                mobileId = fastEntryDataDTO.mobileId;
            }
            if ((i11 & 8) != 0) {
                authCurtain = fastEntryDataDTO.mobileIdCurtain;
            }
            if ((i11 & 16) != 0) {
                authCurtain2 = fastEntryDataDTO.vkIdCurtain;
            }
            if ((i11 & 32) != 0) {
                fastEntryBiometryDTO = fastEntryDataDTO.biometry;
            }
            if ((i11 & 64) != 0) {
                agreementSheet = fastEntryDataDTO.agreementCurtain;
            }
            FastEntryBiometryDTO fastEntryBiometryDTO2 = fastEntryBiometryDTO;
            OtpDTO.AgreementSheet agreementSheet2 = agreementSheet;
            AuthCurtain authCurtain3 = authCurtain2;
            MobileId mobileId2 = mobileId;
            return fastEntryDataDTO.copy(authTokenDTO, fastEntryAuthMethodDTO, mobileId2, authCurtain, authCurtain3, fastEntryBiometryDTO2, agreementSheet2);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthTokenDTO getAuthToken() {
            return this.authToken;
        }

        /* renamed from: component2, reason: from getter */
        public final FastEntryAuthMethodDTO getAuthMethod() {
            return this.authMethod;
        }

        /* renamed from: component3, reason: from getter */
        public final MobileId getMobileId() {
            return this.mobileId;
        }

        /* renamed from: component4, reason: from getter */
        public final AuthCurtain getMobileIdCurtain() {
            return this.mobileIdCurtain;
        }

        /* renamed from: component5, reason: from getter */
        public final AuthCurtain getVkIdCurtain() {
            return this.vkIdCurtain;
        }

        /* renamed from: component6, reason: from getter */
        public final FastEntryBiometryDTO getBiometry() {
            return this.biometry;
        }

        /* renamed from: component7, reason: from getter */
        public final OtpDTO.AgreementSheet getAgreementCurtain() {
            return this.agreementCurtain;
        }

        @NotNull
        public final FastEntryDataDTO copy(AuthTokenDTO authToken, FastEntryAuthMethodDTO authMethod, MobileId mobileId, AuthCurtain mobileIdCurtain, AuthCurtain vkIdCurtain, FastEntryBiometryDTO biometry, OtpDTO.AgreementSheet agreementCurtain) {
            return new FastEntryDataDTO(authToken, authMethod, mobileId, mobileIdCurtain, vkIdCurtain, biometry, agreementCurtain);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FastEntryDataDTO)) {
                return false;
            }
            FastEntryDataDTO fastEntryDataDTO = (FastEntryDataDTO) other;
            return Intrinsics.d(this.authToken, fastEntryDataDTO.authToken) && Intrinsics.d(this.authMethod, fastEntryDataDTO.authMethod) && Intrinsics.d(this.mobileId, fastEntryDataDTO.mobileId) && Intrinsics.d(this.mobileIdCurtain, fastEntryDataDTO.mobileIdCurtain) && Intrinsics.d(this.vkIdCurtain, fastEntryDataDTO.vkIdCurtain) && Intrinsics.d(this.biometry, fastEntryDataDTO.biometry) && Intrinsics.d(this.agreementCurtain, fastEntryDataDTO.agreementCurtain);
        }

        public final OtpDTO.AgreementSheet getAgreementCurtain() {
            return this.agreementCurtain;
        }

        public final FastEntryAuthMethodDTO getAuthMethod() {
            return this.authMethod;
        }

        @Override // ru.ozon.id.nativeauth.data.models.AuthActionDTO.a
        public AuthTokenDTO getAuthToken() {
            return this.authToken;
        }

        public final FastEntryBiometryDTO getBiometry() {
            return this.biometry;
        }

        public final MobileId getMobileId() {
            return this.mobileId;
        }

        public final AuthCurtain getMobileIdCurtain() {
            return this.mobileIdCurtain;
        }

        public final AuthCurtain getVkIdCurtain() {
            return this.vkIdCurtain;
        }

        public int hashCode() {
            AuthTokenDTO authTokenDTO = this.authToken;
            int hashCode = (authTokenDTO == null ? 0 : authTokenDTO.hashCode()) * 31;
            FastEntryAuthMethodDTO fastEntryAuthMethodDTO = this.authMethod;
            int hashCode2 = (hashCode + (fastEntryAuthMethodDTO == null ? 0 : fastEntryAuthMethodDTO.hashCode())) * 31;
            MobileId mobileId = this.mobileId;
            int hashCode3 = (hashCode2 + (mobileId == null ? 0 : mobileId.hashCode())) * 31;
            AuthCurtain authCurtain = this.mobileIdCurtain;
            int hashCode4 = (hashCode3 + (authCurtain == null ? 0 : authCurtain.hashCode())) * 31;
            AuthCurtain authCurtain2 = this.vkIdCurtain;
            int hashCode5 = (hashCode4 + (authCurtain2 == null ? 0 : authCurtain2.hashCode())) * 31;
            FastEntryBiometryDTO fastEntryBiometryDTO = this.biometry;
            int hashCode6 = (hashCode5 + (fastEntryBiometryDTO == null ? 0 : fastEntryBiometryDTO.hashCode())) * 31;
            OtpDTO.AgreementSheet agreementSheet = this.agreementCurtain;
            return hashCode6 + (agreementSheet != null ? agreementSheet.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FastEntryDataDTO(authToken=" + this.authToken + ", authMethod=" + this.authMethod + ", mobileId=" + this.mobileId + ", mobileIdCurtain=" + this.mobileIdCurtain + ", vkIdCurtain=" + this.vkIdCurtain + ", biometry=" + this.biometry + ", agreementCurtain=" + this.agreementCurtain + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AuthTokenDTO authTokenDTO = this.authToken;
            if (authTokenDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authTokenDTO.writeToParcel(dest, flags);
            }
            FastEntryAuthMethodDTO fastEntryAuthMethodDTO = this.authMethod;
            if (fastEntryAuthMethodDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fastEntryAuthMethodDTO.writeToParcel(dest, flags);
            }
            MobileId mobileId = this.mobileId;
            if (mobileId == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                mobileId.writeToParcel(dest, flags);
            }
            AuthCurtain authCurtain = this.mobileIdCurtain;
            if (authCurtain == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authCurtain.writeToParcel(dest, flags);
            }
            AuthCurtain authCurtain2 = this.vkIdCurtain;
            if (authCurtain2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authCurtain2.writeToParcel(dest, flags);
            }
            FastEntryBiometryDTO fastEntryBiometryDTO = this.biometry;
            if (fastEntryBiometryDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fastEntryBiometryDTO.writeToParcel(dest, flags);
            }
            OtpDTO.AgreementSheet agreementSheet = this.agreementCurtain;
            if (agreementSheet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                agreementSheet.writeToParcel(dest, flags);
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$SharedStoreKeysInfo;", "Landroid/os/Parcelable;", "selectedKeyInfo", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "unauthorizedKeys", "", "", "<init>", "(Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;Ljava/util/List;)V", "getSelectedKeyInfo", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "getUnauthorizedKeys", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SharedStoreKeysInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SharedStoreKeysInfo> CREATOR = new a();
        private final CrossAppSelectedKeyDto selectedKeyInfo;
        private final List<String> unauthorizedKeys;

        public static final class a implements Parcelable.Creator<SharedStoreKeysInfo> {
            @Override // android.os.Parcelable.Creator
            public final SharedStoreKeysInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SharedStoreKeysInfo(parcel.readInt() == 0 ? null : CrossAppSelectedKeyDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final SharedStoreKeysInfo[] newArray(int i11) {
                return new SharedStoreKeysInfo[i11];
            }
        }

        public SharedStoreKeysInfo(CrossAppSelectedKeyDto crossAppSelectedKeyDto, List<String> list) {
            this.selectedKeyInfo = crossAppSelectedKeyDto;
            this.unauthorizedKeys = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharedStoreKeysInfo copy$default(SharedStoreKeysInfo sharedStoreKeysInfo, CrossAppSelectedKeyDto crossAppSelectedKeyDto, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                crossAppSelectedKeyDto = sharedStoreKeysInfo.selectedKeyInfo;
            }
            if ((i11 & 2) != 0) {
                list = sharedStoreKeysInfo.unauthorizedKeys;
            }
            return sharedStoreKeysInfo.copy(crossAppSelectedKeyDto, list);
        }

        /* renamed from: component1, reason: from getter */
        public final CrossAppSelectedKeyDto getSelectedKeyInfo() {
            return this.selectedKeyInfo;
        }

        public final List<String> component2() {
            return this.unauthorizedKeys;
        }

        @NotNull
        public final SharedStoreKeysInfo copy(CrossAppSelectedKeyDto selectedKeyInfo, List<String> unauthorizedKeys) {
            return new SharedStoreKeysInfo(selectedKeyInfo, unauthorizedKeys);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SharedStoreKeysInfo)) {
                return false;
            }
            SharedStoreKeysInfo sharedStoreKeysInfo = (SharedStoreKeysInfo) other;
            return Intrinsics.d(this.selectedKeyInfo, sharedStoreKeysInfo.selectedKeyInfo) && Intrinsics.d(this.unauthorizedKeys, sharedStoreKeysInfo.unauthorizedKeys);
        }

        public final CrossAppSelectedKeyDto getSelectedKeyInfo() {
            return this.selectedKeyInfo;
        }

        public final List<String> getUnauthorizedKeys() {
            return this.unauthorizedKeys;
        }

        public int hashCode() {
            CrossAppSelectedKeyDto crossAppSelectedKeyDto = this.selectedKeyInfo;
            int hashCode = (crossAppSelectedKeyDto == null ? 0 : crossAppSelectedKeyDto.hashCode()) * 31;
            List<String> list = this.unauthorizedKeys;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SharedStoreKeysInfo(selectedKeyInfo=" + this.selectedKeyInfo + ", unauthorizedKeys=" + this.unauthorizedKeys + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CrossAppSelectedKeyDto crossAppSelectedKeyDto = this.selectedKeyInfo;
            if (crossAppSelectedKeyDto == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                crossAppSelectedKeyDto.writeToParcel(dest, flags);
            }
            dest.writeStringList(this.unauthorizedKeys);
        }
    }

    public static final class a implements Parcelable.Creator<FastEntryActionDTO> {
        @Override // android.os.Parcelable.Creator
        public final FastEntryActionDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FastEntryActionDTO(parcel.readInt() == 0 ? null : AuthActionDTO.StatusDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FastEntryDataDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ErrorDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EntryNotification.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SharedStoreKeysInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FastEntryActionDTO[] newArray(int i11) {
            return new FastEntryActionDTO[i11];
        }
    }

    public FastEntryActionDTO(AuthActionDTO.StatusDTO statusDTO, FastEntryDataDTO fastEntryDataDTO, ErrorDTO errorDTO, EntryNotification entryNotification, SharedStoreKeysInfo sharedStoreKeysInfo) {
        this.status = statusDTO;
        this.data = fastEntryDataDTO;
        this.error = errorDTO;
        this.notification = entryNotification;
        this.sharedStoreKeysInfo = sharedStoreKeysInfo;
    }

    public static /* synthetic */ FastEntryActionDTO copy$default(FastEntryActionDTO fastEntryActionDTO, AuthActionDTO.StatusDTO statusDTO, FastEntryDataDTO fastEntryDataDTO, ErrorDTO errorDTO, EntryNotification entryNotification, SharedStoreKeysInfo sharedStoreKeysInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            statusDTO = fastEntryActionDTO.status;
        }
        if ((i11 & 2) != 0) {
            fastEntryDataDTO = fastEntryActionDTO.data;
        }
        if ((i11 & 4) != 0) {
            errorDTO = fastEntryActionDTO.error;
        }
        if ((i11 & 8) != 0) {
            entryNotification = fastEntryActionDTO.notification;
        }
        if ((i11 & 16) != 0) {
            sharedStoreKeysInfo = fastEntryActionDTO.sharedStoreKeysInfo;
        }
        SharedStoreKeysInfo sharedStoreKeysInfo2 = sharedStoreKeysInfo;
        ErrorDTO errorDTO2 = errorDTO;
        return fastEntryActionDTO.copy(statusDTO, fastEntryDataDTO, errorDTO2, entryNotification, sharedStoreKeysInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final AuthActionDTO.StatusDTO getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final FastEntryDataDTO getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorDTO getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final EntryNotification getNotification() {
        return this.notification;
    }

    /* renamed from: component5, reason: from getter */
    public final SharedStoreKeysInfo getSharedStoreKeysInfo() {
        return this.sharedStoreKeysInfo;
    }

    @NotNull
    public final FastEntryActionDTO copy(AuthActionDTO.StatusDTO status, FastEntryDataDTO data, ErrorDTO error, EntryNotification notification, SharedStoreKeysInfo sharedStoreKeysInfo) {
        return new FastEntryActionDTO(status, data, error, notification, sharedStoreKeysInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastEntryActionDTO)) {
            return false;
        }
        FastEntryActionDTO fastEntryActionDTO = (FastEntryActionDTO) other;
        return Intrinsics.d(this.status, fastEntryActionDTO.status) && Intrinsics.d(this.data, fastEntryActionDTO.data) && Intrinsics.d(this.error, fastEntryActionDTO.error) && Intrinsics.d(this.notification, fastEntryActionDTO.notification) && Intrinsics.d(this.sharedStoreKeysInfo, fastEntryActionDTO.sharedStoreKeysInfo);
    }

    public final ErrorDTO getError() {
        return this.error;
    }

    public final EntryNotification getNotification() {
        return this.notification;
    }

    public final SharedStoreKeysInfo getSharedStoreKeysInfo() {
        return this.sharedStoreKeysInfo;
    }

    @Override // ru.ozon.id.nativeauth.data.models.AuthActionDTO
    public AuthActionDTO.StatusDTO getStatus() {
        return this.status;
    }

    public int hashCode() {
        AuthActionDTO.StatusDTO statusDTO = this.status;
        int hashCode = (statusDTO == null ? 0 : statusDTO.hashCode()) * 31;
        FastEntryDataDTO fastEntryDataDTO = this.data;
        int hashCode2 = (hashCode + (fastEntryDataDTO == null ? 0 : fastEntryDataDTO.hashCode())) * 31;
        ErrorDTO errorDTO = this.error;
        int hashCode3 = (hashCode2 + (errorDTO == null ? 0 : errorDTO.hashCode())) * 31;
        EntryNotification entryNotification = this.notification;
        int hashCode4 = (hashCode3 + (entryNotification == null ? 0 : entryNotification.hashCode())) * 31;
        SharedStoreKeysInfo sharedStoreKeysInfo = this.sharedStoreKeysInfo;
        return hashCode4 + (sharedStoreKeysInfo != null ? sharedStoreKeysInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FastEntryActionDTO(status=" + this.status + ", data=" + this.data + ", error=" + this.error + ", notification=" + this.notification + ", sharedStoreKeysInfo=" + this.sharedStoreKeysInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AuthActionDTO.StatusDTO statusDTO = this.status;
        if (statusDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            statusDTO.writeToParcel(dest, flags);
        }
        FastEntryDataDTO fastEntryDataDTO = this.data;
        if (fastEntryDataDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastEntryDataDTO.writeToParcel(dest, flags);
        }
        ErrorDTO errorDTO = this.error;
        if (errorDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            errorDTO.writeToParcel(dest, flags);
        }
        EntryNotification entryNotification = this.notification;
        if (entryNotification == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            entryNotification.writeToParcel(dest, flags);
        }
        SharedStoreKeysInfo sharedStoreKeysInfo = this.sharedStoreKeysInfo;
        if (sharedStoreKeysInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sharedStoreKeysInfo.writeToParcel(dest, flags);
        }
    }

    @Override // ru.ozon.id.nativeauth.data.models.AuthActionDTO
    public FastEntryDataDTO getData() {
        return this.data;
    }
}
