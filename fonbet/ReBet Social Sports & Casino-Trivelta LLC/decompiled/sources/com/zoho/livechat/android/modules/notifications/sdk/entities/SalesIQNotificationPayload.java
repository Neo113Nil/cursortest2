package com.zoho.livechat.android.modules.notifications.sdk.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload;", "Landroid/os/Parcelable;", "()V", "Call", "Chat", "EndChatDetails", "VisitorHistory", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call;", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Chat;", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$EndChatDetails;", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$VisitorHistory;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SalesIQNotificationPayload implements Parcelable {

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fBI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006 "}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call;", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload;", "content", "", "userId", "userName", "chatId", "title", "operation", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Operation;", "department", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Department;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Operation;Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Department;)V", "getChatId", "()Ljava/lang/String;", "getContent", "getDepartment", "()Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Department;", "getOperation", "()Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Operation;", "getTitle", "getUserId", "getUserName", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Department", "Operation", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Call extends SalesIQNotificationPayload {

        @NotNull
        public static final Parcelable.Creator<Call> CREATOR = new a();

        @Nullable
        private final String chatId;

        @Nullable
        private final String content;

        @Nullable
        private final Department department;

        @NotNull
        private final Operation operation;

        @Nullable
        private final String title;

        @Nullable
        private final String userId;

        @Nullable
        private final String userName;

        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Department;", "Landroid/os/Parcelable;", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Department implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Department> CREATOR = new a();

            @Nullable
            private final String id;

            @Nullable
            private final String name;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Department createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Department(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Department[] newArray(int i10) {
                    return new Department[i10];
                }
            }

            public Department(@Nullable String str, @Nullable String str2) {
                this.id = str;
                this.name = str2;
            }

            public static /* synthetic */ Department copy$default(Department department, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = department.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = department.name;
                }
                return department.copy(str, str2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final Department copy(@Nullable String id2, @Nullable String name) {
                return new Department(id2, name);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Department)) {
                    return false;
                }
                Department department = (Department) other;
                return Intrinsics.areEqual(this.id, department.id) && Intrinsics.areEqual(this.name, department.name);
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.name;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Department(id=" + this.id + ", name=" + this.name + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.id);
                parcel.writeString(this.name);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Keep
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Call$Operation;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "INCOMING", "MISS", "CANCEL", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Operation implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Operation[] $VALUES;

            @NotNull
            public static final Parcelable.Creator<Operation> CREATOR;
            public static final Operation INCOMING = new Operation("INCOMING", 0);
            public static final Operation MISS = new Operation("MISS", 1);
            public static final Operation CANCEL = new Operation("CANCEL", 2);

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Operation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return Operation.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Operation[] newArray(int i10) {
                    return new Operation[i10];
                }
            }

            private static final /* synthetic */ Operation[] $values() {
                return new Operation[]{INCOMING, MISS, CANCEL};
            }

            static {
                Operation[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
                CREATOR = new a();
            }

            private Operation(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<Operation> getEntries() {
                return $ENTRIES;
            }

            public static Operation valueOf(String str) {
                return (Operation) Enum.valueOf(Operation.class, str);
            }

            public static Operation[] values() {
                return (Operation[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Call createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Call(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Operation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Department.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Call[] newArray(int i10) {
                return new Call[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Call(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull Operation operation, @Nullable Department department) {
            super(null);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.content = str;
            this.userId = str2;
            this.userName = str3;
            this.chatId = str4;
            this.title = str5;
            this.operation = operation;
            this.department = department;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String getChatId() {
            return this.chatId;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final Department getDepartment() {
            return this.department;
        }

        @NotNull
        public final Operation getOperation() {
            return this.operation;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        public final String getUserName() {
            return this.userName;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.content);
            parcel.writeString(this.userId);
            parcel.writeString(this.userName);
            parcel.writeString(this.chatId);
            parcel.writeString(this.title);
            this.operation.writeToParcel(parcel, flags);
            Department department = this.department;
            if (department == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                department.writeToParcel(parcel, flags);
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006!"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Chat;", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload;", "message", "", "userId", "chatId", "senderName", "previousMessageUID", "messageUID", "sender", "title", "department", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Chat$Department;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Chat$Department;)V", "getChatId", "()Ljava/lang/String;", "getDepartment", "()Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Chat$Department;", "getMessage", "getMessageUID", "getPreviousMessageUID", "getSender", "getSenderName", "getTitle", "getUserId", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Department", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Chat extends SalesIQNotificationPayload {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        @Nullable
        private final String chatId;

        @Nullable
        private final Department department;

        @Nullable
        private final String message;

        @Nullable
        private final String messageUID;

        @Nullable
        private final String previousMessageUID;

        @Nullable
        private final String sender;

        @Nullable
        private final String senderName;

        @Nullable
        private final String title;

        @Nullable
        private final String userId;

        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$Chat$Department;", "Landroid/os/Parcelable;", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Department implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Department> CREATOR = new a();

            @Nullable
            private final String id;

            @Nullable
            private final String name;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Department createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Department(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Department[] newArray(int i10) {
                    return new Department[i10];
                }
            }

            public Department(@Nullable String str, @Nullable String str2) {
                this.id = str;
                this.name = str2;
            }

            public static /* synthetic */ Department copy$default(Department department, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = department.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = department.name;
                }
                return department.copy(str, str2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final Department copy(@Nullable String id2, @Nullable String name) {
                return new Department(id2, name);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Department)) {
                    return false;
                }
                Department department = (Department) other;
                return Intrinsics.areEqual(this.id, department.id) && Intrinsics.areEqual(this.name, department.name);
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.name;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Department(id=" + this.id + ", name=" + this.name + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.id);
                parcel.writeString(this.name);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Chat createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Department.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Chat[] newArray(int i10) {
                return new Chat[i10];
            }
        }

        public Chat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Department department) {
            super(null);
            this.message = str;
            this.userId = str2;
            this.chatId = str3;
            this.senderName = str4;
            this.previousMessageUID = str5;
            this.messageUID = str6;
            this.sender = str7;
            this.title = str8;
            this.department = department;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String getChatId() {
            return this.chatId;
        }

        @Nullable
        public final Department getDepartment() {
            return this.department;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getMessageUID() {
            return this.messageUID;
        }

        @Nullable
        public final String getPreviousMessageUID() {
            return this.previousMessageUID;
        }

        @Nullable
        public final String getSender() {
            return this.sender;
        }

        @Nullable
        public final String getSenderName() {
            return this.senderName;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.message);
            parcel.writeString(this.userId);
            parcel.writeString(this.chatId);
            parcel.writeString(this.senderName);
            parcel.writeString(this.previousMessageUID);
            parcel.writeString(this.messageUID);
            parcel.writeString(this.sender);
            parcel.writeString(this.title);
            Department department = this.department;
            if (department == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                department.writeToParcel(parcel, flags);
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$EndChatDetails;", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload;", "message", "", "userId", "chatId", "title", "department", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$EndChatDetails$Department;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$EndChatDetails$Department;)V", "getChatId", "()Ljava/lang/String;", "getDepartment", "()Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$EndChatDetails$Department;", "getMessage", "getTitle", "getUserId", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Department", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EndChatDetails extends SalesIQNotificationPayload {

        @NotNull
        public static final Parcelable.Creator<EndChatDetails> CREATOR = new a();

        @Nullable
        private final String chatId;

        @Nullable
        private final Department department;

        @Nullable
        private final String message;

        @Nullable
        private final String title;

        @Nullable
        private final String userId;

        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$EndChatDetails$Department;", "Landroid/os/Parcelable;", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Department implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Department> CREATOR = new a();

            @Nullable
            private final String id;

            @Nullable
            private final String name;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Department createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Department(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Department[] newArray(int i10) {
                    return new Department[i10];
                }
            }

            public Department(@Nullable String str, @Nullable String str2) {
                this.id = str;
                this.name = str2;
            }

            public static /* synthetic */ Department copy$default(Department department, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = department.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = department.name;
                }
                return department.copy(str, str2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final Department copy(@Nullable String id2, @Nullable String name) {
                return new Department(id2, name);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Department)) {
                    return false;
                }
                Department department = (Department) other;
                return Intrinsics.areEqual(this.id, department.id) && Intrinsics.areEqual(this.name, department.name);
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.name;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Department(id=" + this.id + ", name=" + this.name + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.id);
                parcel.writeString(this.name);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EndChatDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EndChatDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Department.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EndChatDetails[] newArray(int i10) {
                return new EndChatDetails[i10];
            }
        }

        public EndChatDetails(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Department department) {
            super(null);
            this.message = str;
            this.userId = str2;
            this.chatId = str3;
            this.title = str4;
            this.department = department;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String getChatId() {
            return this.chatId;
        }

        @Nullable
        public final Department getDepartment() {
            return this.department;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.message);
            parcel.writeString(this.userId);
            parcel.writeString(this.chatId);
            parcel.writeString(this.title);
            Department department = this.department;
            if (department == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                department.writeToParcel(parcel, flags);
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload$VisitorHistory;", "Lcom/zoho/livechat/android/modules/notifications/sdk/entities/SalesIQNotificationPayload;", "imagePath", "", "targetLink", "title", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "getMessage", "getTargetLink", "getTitle", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VisitorHistory extends SalesIQNotificationPayload {

        @NotNull
        public static final Parcelable.Creator<VisitorHistory> CREATOR = new a();

        @Nullable
        private final String imagePath;

        @Nullable
        private final String message;

        @Nullable
        private final String targetLink;

        @Nullable
        private final String title;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VisitorHistory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VisitorHistory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final VisitorHistory[] newArray(int i10) {
                return new VisitorHistory[i10];
            }
        }

        public VisitorHistory(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(null);
            this.imagePath = str;
            this.targetLink = str2;
            this.title = str3;
            this.message = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String getImagePath() {
            return this.imagePath;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getTargetLink() {
            return this.targetLink;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.imagePath);
            parcel.writeString(this.targetLink);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
        }
    }

    public /* synthetic */ SalesIQNotificationPayload(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SalesIQNotificationPayload() {
    }
}
