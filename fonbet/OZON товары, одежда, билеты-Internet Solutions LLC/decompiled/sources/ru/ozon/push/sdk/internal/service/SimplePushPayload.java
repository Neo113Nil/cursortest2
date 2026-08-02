package ru.ozon.push.sdk.internal.service;

import B0.C2454a;
import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/push/sdk/internal/service/SimplePushPayload;", "Lru/ozon/push/sdk/internal/service/PushPayload;", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimplePushPayload extends PushPayload {

    @NotNull
    public static final Parcelable.Creator<SimplePushPayload> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f97696a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f97697b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f97698c;

    /* renamed from: d, reason: collision with root package name */
    private final String f97699d;

    /* renamed from: e, reason: collision with root package name */
    private final String f97700e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final RemoteMessage f97701f;

    /* renamed from: g, reason: collision with root package name */
    private final String f97702g;

    /* renamed from: h, reason: collision with root package name */
    private final int f97703h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f97704i;

    public static final class a implements Parcelable.Creator<SimplePushPayload> {
        @Override // android.os.Parcelable.Creator
        public final SimplePushPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimplePushPayload(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), RemoteMessage.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SimplePushPayload[] newArray(int i11) {
            return new SimplePushPayload[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplePushPayload(int i11, @NotNull String title, @NotNull String message, String str, String str2, @NotNull RemoteMessage originalMessage, String str3, int i12, boolean z11) {
        super(0);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(originalMessage, "originalMessage");
        this.f97696a = i11;
        this.f97697b = title;
        this.f97698c = message;
        this.f97699d = str;
        this.f97700e = str2;
        this.f97701f = originalMessage;
        this.f97702g = str3;
        this.f97703h = i12;
        this.f97704i = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePushPayload)) {
            return false;
        }
        SimplePushPayload simplePushPayload = (SimplePushPayload) obj;
        return this.f97696a == simplePushPayload.f97696a && Intrinsics.d(this.f97697b, simplePushPayload.f97697b) && Intrinsics.d(this.f97698c, simplePushPayload.f97698c) && Intrinsics.d(this.f97699d, simplePushPayload.f97699d) && Intrinsics.d(this.f97700e, simplePushPayload.f97700e) && Intrinsics.d(this.f97701f, simplePushPayload.f97701f) && Intrinsics.d(this.f97702g, simplePushPayload.f97702g) && this.f97703h == simplePushPayload.f97703h && this.f97704i == simplePushPayload.f97704i;
    }

    public final int hashCode() {
        int a11 = g.a(g.a(Integer.hashCode(this.f97696a) * 31, 31, this.f97697b), 31, this.f97698c);
        String str = this.f97699d;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97700e;
        int hashCode2 = (this.f97701f.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f97702g;
        return Boolean.hashCode(this.f97704i) + C2454a.a(this.f97703h, (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimplePushPayload(notificationId=");
        sb2.append(this.f97696a);
        sb2.append(", title=");
        sb2.append(this.f97697b);
        sb2.append(", message=");
        sb2.append(this.f97698c);
        sb2.append(", image=");
        sb2.append(this.f97699d);
        sb2.append(", url=");
        sb2.append(this.f97700e);
        sb2.append(", originalMessage=");
        sb2.append(this.f97701f);
        sb2.append(", threadId=");
        sb2.append(this.f97702g);
        sb2.append(", badge=");
        sb2.append(this.f97703h);
        sb2.append(", silent=");
        return Pk0.a.a(")", sb2, this.f97704i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f97696a);
        dest.writeString(this.f97697b);
        dest.writeString(this.f97698c);
        dest.writeString(this.f97699d);
        dest.writeString(this.f97700e);
        this.f97701f.writeToParcel(dest, i11);
        dest.writeString(this.f97702g);
        dest.writeInt(this.f97703h);
        dest.writeInt(this.f97704i ? 1 : 0);
    }
}
