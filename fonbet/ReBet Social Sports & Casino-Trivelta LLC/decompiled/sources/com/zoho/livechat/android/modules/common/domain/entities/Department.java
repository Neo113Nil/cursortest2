package com.zoho.livechat.android.modules.common.domain.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003Je\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006'"}, d2 = {"Lcom/zoho/livechat/android/modules/common/domain/entities/Department;", "", "botUsers", "", "displayName", "", StackTraceHelper.ID_KEY, "", "isEngaged", "", "isOnlyBotAvailable", "name", "status", "users", "(Ljava/util/List;Ljava/lang/String;JZZLjava/lang/String;ZLjava/util/List;)V", "getBotUsers", "()Ljava/util/List;", "getDisplayName", "()Ljava/lang/String;", "getId", "()J", "()Z", "getName", "getStatus", "getUsers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Department {

    @c("bot_users")
    @NotNull
    private final List<Object> botUsers;

    @c("dname")
    @NotNull
    private final String displayName;

    @c(StackTraceHelper.ID_KEY)
    private final long id;

    @c("is_engaged")
    private final boolean isEngaged;

    @c("is_only_bot_available")
    private final boolean isOnlyBotAvailable;

    @c("name")
    @NotNull
    private final String name;

    @c("status")
    private final boolean status;

    @c("users")
    @NotNull
    private final List<Long> users;

    public Department(@NotNull List<? extends Object> botUsers, @NotNull String displayName, long j10, boolean z10, boolean z11, @NotNull String name, boolean z12, @NotNull List<Long> users) {
        Intrinsics.checkNotNullParameter(botUsers, "botUsers");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(users, "users");
        this.botUsers = botUsers;
        this.displayName = displayName;
        this.id = j10;
        this.isEngaged = z10;
        this.isOnlyBotAvailable = z11;
        this.name = name;
        this.status = z12;
        this.users = users;
    }

    public static /* synthetic */ Department copy$default(Department department, List list, String str, long j10, boolean z10, boolean z11, String str2, boolean z12, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = department.botUsers;
        }
        if ((i10 & 2) != 0) {
            str = department.displayName;
        }
        if ((i10 & 4) != 0) {
            j10 = department.id;
        }
        if ((i10 & 8) != 0) {
            z10 = department.isEngaged;
        }
        if ((i10 & 16) != 0) {
            z11 = department.isOnlyBotAvailable;
        }
        if ((i10 & 32) != 0) {
            str2 = department.name;
        }
        if ((i10 & 64) != 0) {
            z12 = department.status;
        }
        if ((i10 & 128) != 0) {
            list2 = department.users;
        }
        List list3 = list2;
        String str3 = str2;
        boolean z13 = z10;
        long j11 = j10;
        return department.copy(list, str, j11, z13, z11, str3, z12, list3);
    }

    @NotNull
    public final List<Object> component1() {
        return this.botUsers;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEngaged() {
        return this.isEngaged;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOnlyBotAvailable() {
        return this.isOnlyBotAvailable;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    @NotNull
    public final List<Long> component8() {
        return this.users;
    }

    @NotNull
    public final Department copy(@NotNull List<? extends Object> botUsers, @NotNull String displayName, long id2, boolean isEngaged, boolean isOnlyBotAvailable, @NotNull String name, boolean status, @NotNull List<Long> users) {
        Intrinsics.checkNotNullParameter(botUsers, "botUsers");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(users, "users");
        return new Department(botUsers, displayName, id2, isEngaged, isOnlyBotAvailable, name, status, users);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Department)) {
            return false;
        }
        Department department = (Department) other;
        return Intrinsics.areEqual(this.botUsers, department.botUsers) && Intrinsics.areEqual(this.displayName, department.displayName) && this.id == department.id && this.isEngaged == department.isEngaged && this.isOnlyBotAvailable == department.isOnlyBotAvailable && Intrinsics.areEqual(this.name, department.name) && this.status == department.status && Intrinsics.areEqual(this.users, department.users);
    }

    @NotNull
    public final List<Object> getBotUsers() {
        return this.botUsers;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getStatus() {
        return this.status;
    }

    @NotNull
    public final List<Long> getUsers() {
        return this.users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.botUsers.hashCode() * 31) + this.displayName.hashCode()) * 31) + Long.hashCode(this.id)) * 31;
        boolean z10 = this.isEngaged;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isOnlyBotAvailable;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode2 = (((i11 + i12) * 31) + this.name.hashCode()) * 31;
        boolean z12 = this.status;
        return ((hashCode2 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.users.hashCode();
    }

    public final boolean isEngaged() {
        return this.isEngaged;
    }

    public final boolean isOnlyBotAvailable() {
        return this.isOnlyBotAvailable;
    }

    @NotNull
    public String toString() {
        return "Department(botUsers=" + this.botUsers + ", displayName=" + this.displayName + ", id=" + this.id + ", isEngaged=" + this.isEngaged + ", isOnlyBotAvailable=" + this.isOnlyBotAvailable + ", name=" + this.name + ", status=" + this.status + ", users=" + this.users + ')';
    }
}
