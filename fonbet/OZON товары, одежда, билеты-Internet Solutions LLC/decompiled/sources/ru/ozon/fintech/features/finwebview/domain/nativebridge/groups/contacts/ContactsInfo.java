package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts;

import V.e;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/contacts/ContactsInfo;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContactsInfo {

    @NotNull
    private final String name;

    @NotNull
    private final String phone;

    public ContactsInfo(@i(name = "name") @NotNull String name, @i(name = "phone_number") @NotNull String phone) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.name = name;
        this.phone = phone;
    }

    public static /* synthetic */ ContactsInfo copy$default(ContactsInfo contactsInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactsInfo.name;
        }
        if ((i11 & 2) != 0) {
            str2 = contactsInfo.phone;
        }
        return contactsInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final ContactsInfo copy(@i(name = "name") @NotNull String name, @i(name = "phone_number") @NotNull String phone) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new ContactsInfo(name, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactsInfo)) {
            return false;
        }
        ContactsInfo contactsInfo = (ContactsInfo) other;
        return Intrinsics.d(this.name, contactsInfo.name) && Intrinsics.d(this.phone, contactsInfo.phone);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return this.phone.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("ContactsInfo(name=", this.name, ", phone=", this.phone, ")");
    }
}
