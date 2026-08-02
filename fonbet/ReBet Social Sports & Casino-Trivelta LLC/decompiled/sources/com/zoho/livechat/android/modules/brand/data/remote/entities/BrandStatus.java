package com.zoho.livechat.android.modules.brand.data.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus;", "", "call", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component;", "chat", "(Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component;Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component;)V", "getCall", "()Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component;", "getChat", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Component", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BrandStatus {

    @c("call")
    @Nullable
    private final Component call;

    @c("chat")
    @Nullable
    private final Component chat;

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u000f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component;", "", "departments", "", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department;", "online", "", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getDepartments", "()Ljava/util/List;", "getOnline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component;", "equals", "other", "hashCode", "", "toString", "", "Department", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Component {

        @c("departments")
        @Nullable
        private final List<Department> departments;

        @c("online")
        @Nullable
        private final Boolean online;

        @Keep
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0013\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000eHÆ\u0003J\u0082\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R \u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015¨\u0006/"}, d2 = {"Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department;", "", "bots", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department$Bots;", "displayName", "", "engaged", "", StackTraceHelper.ID_KEY, "name", "online", "status", "onlyBotAvailable", "operators", "", "(Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department$Bots;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getBots", "()Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department$Bots;", "getDisplayName", "()Ljava/lang/String;", "getEngaged", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "getName", "getOnline", "getOnlyBotAvailable", "getOperators", "()Ljava/util/List;", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department$Bots;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department;", "equals", "other", "hashCode", "", "toString", "Bots", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Department {

            @c("bots")
            @Nullable
            private final Bots bots;

            @c("display_name")
            @Nullable
            private final String displayName;

            @c("engaged")
            @Nullable
            private final Boolean engaged;

            @c(StackTraceHelper.ID_KEY)
            @Nullable
            private final String id;

            @c("name")
            @Nullable
            private final String name;

            @c("online")
            @Nullable
            private final Boolean online;

            @c("only_bot_available")
            @Nullable
            private final Boolean onlyBotAvailable;

            @c("operators")
            @Nullable
            private final List<String> operators;

            @c("status")
            @Nullable
            private final Boolean status;

            @Keep
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/zoho/livechat/android/modules/brand/data/remote/entities/BrandStatus$Component$Department$Bots;", "", "ids", "", "", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Bots {

                @c("ids")
                @Nullable
                private final List<String> ids;

                public Bots(@Nullable List<String> list) {
                    this.ids = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Bots copy$default(Bots bots, List list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        list = bots.ids;
                    }
                    return bots.copy(list);
                }

                @Nullable
                public final List<String> component1() {
                    return this.ids;
                }

                @NotNull
                public final Bots copy(@Nullable List<String> ids) {
                    return new Bots(ids);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Bots) && Intrinsics.areEqual(this.ids, ((Bots) other).ids);
                }

                @Nullable
                public final List<String> getIds() {
                    return this.ids;
                }

                public int hashCode() {
                    List<String> list = this.ids;
                    if (list == null) {
                        return 0;
                    }
                    return list.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Bots(ids=" + this.ids + ')';
                }
            }

            public Department(@Nullable Bots bots, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable List<String> list) {
                this.bots = bots;
                this.displayName = str;
                this.engaged = bool;
                this.id = str2;
                this.name = str3;
                this.online = bool2;
                this.status = bool3;
                this.onlyBotAvailable = bool4;
                this.operators = list;
            }

            public static /* synthetic */ Department copy$default(Department department, Bots bots, String str, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bots = department.bots;
                }
                if ((i10 & 2) != 0) {
                    str = department.displayName;
                }
                if ((i10 & 4) != 0) {
                    bool = department.engaged;
                }
                if ((i10 & 8) != 0) {
                    str2 = department.id;
                }
                if ((i10 & 16) != 0) {
                    str3 = department.name;
                }
                if ((i10 & 32) != 0) {
                    bool2 = department.online;
                }
                if ((i10 & 64) != 0) {
                    bool3 = department.status;
                }
                if ((i10 & 128) != 0) {
                    bool4 = department.onlyBotAvailable;
                }
                if ((i10 & 256) != 0) {
                    list = department.operators;
                }
                Boolean bool5 = bool4;
                List list2 = list;
                Boolean bool6 = bool2;
                Boolean bool7 = bool3;
                String str4 = str3;
                Boolean bool8 = bool;
                return department.copy(bots, str, bool8, str2, str4, bool6, bool7, bool5, list2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Bots getBots() {
                return this.bots;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final Boolean getEngaged() {
                return this.engaged;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component5, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @Nullable
            /* renamed from: component6, reason: from getter */
            public final Boolean getOnline() {
                return this.online;
            }

            @Nullable
            /* renamed from: component7, reason: from getter */
            public final Boolean getStatus() {
                return this.status;
            }

            @Nullable
            /* renamed from: component8, reason: from getter */
            public final Boolean getOnlyBotAvailable() {
                return this.onlyBotAvailable;
            }

            @Nullable
            public final List<String> component9() {
                return this.operators;
            }

            @NotNull
            public final Department copy(@Nullable Bots bots, @Nullable String displayName, @Nullable Boolean engaged, @Nullable String id2, @Nullable String name, @Nullable Boolean online, @Nullable Boolean status, @Nullable Boolean onlyBotAvailable, @Nullable List<String> operators) {
                return new Department(bots, displayName, engaged, id2, name, online, status, onlyBotAvailable, operators);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Department)) {
                    return false;
                }
                Department department = (Department) other;
                return Intrinsics.areEqual(this.bots, department.bots) && Intrinsics.areEqual(this.displayName, department.displayName) && Intrinsics.areEqual(this.engaged, department.engaged) && Intrinsics.areEqual(this.id, department.id) && Intrinsics.areEqual(this.name, department.name) && Intrinsics.areEqual(this.online, department.online) && Intrinsics.areEqual(this.status, department.status) && Intrinsics.areEqual(this.onlyBotAvailable, department.onlyBotAvailable) && Intrinsics.areEqual(this.operators, department.operators);
            }

            @Nullable
            public final Bots getBots() {
                return this.bots;
            }

            @Nullable
            public final String getDisplayName() {
                return this.displayName;
            }

            @Nullable
            public final Boolean getEngaged() {
                return this.engaged;
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            @Nullable
            public final Boolean getOnline() {
                return this.online;
            }

            @Nullable
            public final Boolean getOnlyBotAvailable() {
                return this.onlyBotAvailable;
            }

            @Nullable
            public final List<String> getOperators() {
                return this.operators;
            }

            @Nullable
            public final Boolean getStatus() {
                return this.status;
            }

            public int hashCode() {
                Bots bots = this.bots;
                int hashCode = (bots == null ? 0 : bots.hashCode()) * 31;
                String str = this.displayName;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.engaged;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.id;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.name;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool2 = this.online;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.status;
                int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Boolean bool4 = this.onlyBotAvailable;
                int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                List<String> list = this.operators;
                return hashCode8 + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Department(bots=" + this.bots + ", displayName=" + this.displayName + ", engaged=" + this.engaged + ", id=" + this.id + ", name=" + this.name + ", online=" + this.online + ", status=" + this.status + ", onlyBotAvailable=" + this.onlyBotAvailable + ", operators=" + this.operators + ')';
            }
        }

        public Component(@Nullable List<Department> list, @Nullable Boolean bool) {
            this.departments = list;
            this.online = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Component copy$default(Component component, List list, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = component.departments;
            }
            if ((i10 & 2) != 0) {
                bool = component.online;
            }
            return component.copy(list, bool);
        }

        @Nullable
        public final List<Department> component1() {
            return this.departments;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getOnline() {
            return this.online;
        }

        @NotNull
        public final Component copy(@Nullable List<Department> departments, @Nullable Boolean online) {
            return new Component(departments, online);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Component)) {
                return false;
            }
            Component component = (Component) other;
            return Intrinsics.areEqual(this.departments, component.departments) && Intrinsics.areEqual(this.online, component.online);
        }

        @Nullable
        public final List<Department> getDepartments() {
            return this.departments;
        }

        @Nullable
        public final Boolean getOnline() {
            return this.online;
        }

        public int hashCode() {
            List<Department> list = this.departments;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.online;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Component(departments=" + this.departments + ", online=" + this.online + ')';
        }
    }

    public BrandStatus(@Nullable Component component, @Nullable Component component2) {
        this.call = component;
        this.chat = component2;
    }

    public static /* synthetic */ BrandStatus copy$default(BrandStatus brandStatus, Component component, Component component2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            component = brandStatus.call;
        }
        if ((i10 & 2) != 0) {
            component2 = brandStatus.chat;
        }
        return brandStatus.copy(component, component2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Component getCall() {
        return this.call;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Component getChat() {
        return this.chat;
    }

    @NotNull
    public final BrandStatus copy(@Nullable Component call, @Nullable Component chat) {
        return new BrandStatus(call, chat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandStatus)) {
            return false;
        }
        BrandStatus brandStatus = (BrandStatus) other;
        return Intrinsics.areEqual(this.call, brandStatus.call) && Intrinsics.areEqual(this.chat, brandStatus.chat);
    }

    @Nullable
    public final Component getCall() {
        return this.call;
    }

    @Nullable
    public final Component getChat() {
        return this.chat;
    }

    public int hashCode() {
        Component component = this.call;
        int hashCode = (component == null ? 0 : component.hashCode()) * 31;
        Component component2 = this.chat;
        return hashCode + (component2 != null ? component2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BrandStatus(call=" + this.call + ", chat=" + this.chat + ')';
    }
}
