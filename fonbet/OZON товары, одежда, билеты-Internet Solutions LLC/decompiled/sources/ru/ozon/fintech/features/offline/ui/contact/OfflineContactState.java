package ru.ozon.fintech.features.offline.ui.contact;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ve.C4636t5;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jp\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lru/ozon/fintech/features/offline/ui/contact/OfflineContactState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "chevron", "", "avatarUri", "avatarRes", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "initials", "number", "onClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "getChevron", "()Z", "getAvatarUri", "getAvatarRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getInitials", "getNumber", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lru/ozon/fintech/features/offline/ui/contact/OfflineContactState;", "equals", "other", "", "hashCode", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfflineContactState implements RecyclerItem {
    private final Integer avatarRes;
    private final String avatarUri;
    private final boolean chevron;

    @NotNull
    private final String id;
    private final String initials;

    @NotNull
    private final String name;

    @NotNull
    private final String number;

    @NotNull
    private final Function1<String, Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineContactState(@NotNull String id2, boolean z11, String str, Integer num, @NotNull String name, String str2, @NotNull String number, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id2;
        this.chevron = z11;
        this.avatarUri = str;
        this.avatarRes = num;
        this.name = name;
        this.initials = str2;
        this.number = number;
        this.onClick = onClick;
    }

    public static /* synthetic */ OfflineContactState copy$default(OfflineContactState offlineContactState, String str, boolean z11, String str2, Integer num, String str3, String str4, String str5, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = offlineContactState.id;
        }
        if ((i11 & 2) != 0) {
            z11 = offlineContactState.chevron;
        }
        if ((i11 & 4) != 0) {
            str2 = offlineContactState.avatarUri;
        }
        if ((i11 & 8) != 0) {
            num = offlineContactState.avatarRes;
        }
        if ((i11 & 16) != 0) {
            str3 = offlineContactState.name;
        }
        if ((i11 & 32) != 0) {
            str4 = offlineContactState.initials;
        }
        if ((i11 & 64) != 0) {
            str5 = offlineContactState.number;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            function1 = offlineContactState.onClick;
        }
        String str6 = str5;
        Function1 function12 = function1;
        String str7 = str3;
        String str8 = str4;
        return offlineContactState.copy(str, z11, str2, num, str7, str8, str6, function12);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getChevron() {
        return this.chevron;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUri() {
        return this.avatarUri;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getAvatarRes() {
        return this.avatarRes;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final Function1<String, Unit> component8() {
        return this.onClick;
    }

    @NotNull
    public final OfflineContactState copy(@NotNull String id2, boolean chevron, String avatarUri, Integer avatarRes, @NotNull String name, String initials, @NotNull String number, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new OfflineContactState(id2, chevron, avatarUri, avatarRes, name, initials, number, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineContactState)) {
            return false;
        }
        OfflineContactState offlineContactState = (OfflineContactState) other;
        return Intrinsics.d(this.id, offlineContactState.id) && this.chevron == offlineContactState.chevron && Intrinsics.d(this.avatarUri, offlineContactState.avatarUri) && Intrinsics.d(this.avatarRes, offlineContactState.avatarRes) && Intrinsics.d(this.name, offlineContactState.name) && Intrinsics.d(this.initials, offlineContactState.initials) && Intrinsics.d(this.number, offlineContactState.number) && Intrinsics.d(this.onClick, offlineContactState.onClick);
    }

    public final Integer getAvatarRes() {
        return this.avatarRes;
    }

    public final String getAvatarUri() {
        return this.avatarUri;
    }

    public final boolean getChevron() {
        return this.chevron;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getInitials() {
        return this.initials;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final Function1<String, Unit> getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.id.hashCode() * 31, 31, this.chevron);
        String str = this.avatarUri;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.avatarRes;
        int a12 = g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.name);
        String str2 = this.initials;
        return this.onClick.hashCode() + g.a((a12 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.number);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z11 = this.chevron;
        String str2 = this.avatarUri;
        Integer num = this.avatarRes;
        String str3 = this.name;
        String str4 = this.initials;
        String str5 = this.number;
        Function1<String, Unit> function1 = this.onClick;
        StringBuilder b11 = C4636t5.b("OfflineContactState(id=", str, ", chevron=", ", avatarUri=", z11);
        C2454a.f(num, str2, ", avatarRes=", ", name=", b11);
        a.h(b11, str3, ", initials=", str4, ", number=");
        b11.append(str5);
        b11.append(", onClick=");
        b11.append(function1);
        b11.append(")");
        return b11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
