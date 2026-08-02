package com.vk.push.common.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/common/messaging/NotificationParams;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NotificationParams implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    private final String f60694a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60695b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60696c;

    /* renamed from: d, reason: collision with root package name */
    private final String f60697d;

    /* renamed from: e, reason: collision with root package name */
    private final String f60698e;

    /* renamed from: f, reason: collision with root package name */
    private final String f60699f;

    /* renamed from: g, reason: collision with root package name */
    private final String f60700g;

    /* renamed from: com.vk.push.common.messaging.NotificationParams$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<NotificationParams> {
        @Override // android.os.Parcelable.Creator
        public final NotificationParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationParams[] newArray(int i11) {
            return new NotificationParams[i11];
        }
    }

    public NotificationParams(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        this.f60694a = readString;
        this.f60695b = readString2;
        this.f60696c = readString3;
        this.f60697d = readString4;
        this.f60698e = readString5;
        this.f60699f = readString6;
        this.f60700g = readString7;
    }

    /* renamed from: a, reason: from getter */
    public final String getF60695b() {
        return this.f60695b;
    }

    /* renamed from: b, reason: from getter */
    public final String getF60699f() {
        return this.f60699f;
    }

    /* renamed from: c, reason: from getter */
    public final String getF60700g() {
        return this.f60700g;
    }

    /* renamed from: d, reason: from getter */
    public final String getF60698e() {
        return this.f60698e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final String getF60697d() {
        return this.f60697d;
    }

    /* renamed from: f, reason: from getter */
    public final String getF60696c() {
        return this.f60696c;
    }

    /* renamed from: getTitle, reason: from getter */
    public final String getF60694a() {
        return this.f60694a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f60694a);
        parcel.writeString(this.f60695b);
        parcel.writeString(this.f60696c);
        parcel.writeString(this.f60697d);
        parcel.writeString(this.f60698e);
        parcel.writeString(this.f60699f);
        parcel.writeString(this.f60700g);
    }
}
