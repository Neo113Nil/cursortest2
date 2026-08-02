package ru.ozon.fintech.features.installedapps.models;

import I1.w;
import Kk.C3532b;
import Ve.C4636t5;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015JX\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\n\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/fintech/features/installedapps/models/ReceiverInfoCompact;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "exported", "", "permission", "actions", "", "hasDeviceAdmin", "isDeviceAdminEnabled", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getExported", "()Z", "getPermission", "getActions", "()Ljava/util/List;", "getHasDeviceAdmin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/fintech/features/installedapps/models/ReceiverInfoCompact;", "equals", "other", "hashCode", "", "toString", "installed-apps_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReceiverInfoCompact {
    private final List<String> actions;
    private final boolean exported;
    private final Boolean hasDeviceAdmin;
    private final Boolean isDeviceAdminEnabled;

    @NotNull
    private final String name;
    private final String permission;

    public ReceiverInfoCompact(@NotNull String name, boolean z11, String str, List<String> list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.exported = z11;
        this.permission = str;
        this.actions = list;
        this.hasDeviceAdmin = bool;
        this.isDeviceAdminEnabled = bool2;
    }

    public static /* synthetic */ ReceiverInfoCompact copy$default(ReceiverInfoCompact receiverInfoCompact, String str, boolean z11, String str2, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = receiverInfoCompact.name;
        }
        if ((i11 & 2) != 0) {
            z11 = receiverInfoCompact.exported;
        }
        if ((i11 & 4) != 0) {
            str2 = receiverInfoCompact.permission;
        }
        if ((i11 & 8) != 0) {
            list = receiverInfoCompact.actions;
        }
        if ((i11 & 16) != 0) {
            bool = receiverInfoCompact.hasDeviceAdmin;
        }
        if ((i11 & 32) != 0) {
            bool2 = receiverInfoCompact.isDeviceAdminEnabled;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return receiverInfoCompact.copy(str, z11, str2, list, bool3, bool4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getExported() {
        return this.exported;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    public final List<String> component4() {
        return this.actions;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasDeviceAdmin() {
        return this.hasDeviceAdmin;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsDeviceAdminEnabled() {
        return this.isDeviceAdminEnabled;
    }

    @NotNull
    public final ReceiverInfoCompact copy(@NotNull String name, boolean exported, String permission, List<String> actions, Boolean hasDeviceAdmin, Boolean isDeviceAdminEnabled) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ReceiverInfoCompact(name, exported, permission, actions, hasDeviceAdmin, isDeviceAdminEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiverInfoCompact)) {
            return false;
        }
        ReceiverInfoCompact receiverInfoCompact = (ReceiverInfoCompact) other;
        return Intrinsics.d(this.name, receiverInfoCompact.name) && this.exported == receiverInfoCompact.exported && Intrinsics.d(this.permission, receiverInfoCompact.permission) && Intrinsics.d(this.actions, receiverInfoCompact.actions) && Intrinsics.d(this.hasDeviceAdmin, receiverInfoCompact.hasDeviceAdmin) && Intrinsics.d(this.isDeviceAdminEnabled, receiverInfoCompact.isDeviceAdminEnabled);
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final boolean getExported() {
        return this.exported;
    }

    public final Boolean getHasDeviceAdmin() {
        return this.hasDeviceAdmin;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getPermission() {
        return this.permission;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.name.hashCode() * 31, 31, this.exported);
        String str = this.permission;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.actions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasDeviceAdmin;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDeviceAdminEnabled;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isDeviceAdminEnabled() {
        return this.isDeviceAdminEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        boolean z11 = this.exported;
        String str2 = this.permission;
        List<String> list = this.actions;
        Boolean bool = this.hasDeviceAdmin;
        Boolean bool2 = this.isDeviceAdminEnabled;
        StringBuilder b11 = C4636t5.b("ReceiverInfoCompact(name=", str, ", exported=", ", permission=", z11);
        w.d(str2, ", actions=", ", hasDeviceAdmin=", b11, list);
        b11.append(bool);
        b11.append(", isDeviceAdminEnabled=");
        b11.append(bool2);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ ReceiverInfoCompact(String str, boolean z11, String str2, List list, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, str2, list, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : bool2);
    }
}
