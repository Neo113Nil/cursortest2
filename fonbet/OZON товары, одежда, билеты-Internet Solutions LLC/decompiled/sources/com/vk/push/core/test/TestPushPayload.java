package com.vk.push.core.test;

import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/test/TestPushPayload;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TestPushPayload implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f60711a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f60712b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f60713c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f60714d;

    /* renamed from: com.vk.push.core.test.TestPushPayload$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<TestPushPayload> {
        @Override // android.os.Parcelable.Creator
        public final TestPushPayload createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                readString2 = "";
            }
            String readString3 = parcel.readString();
            if (readString3 == null) {
                readString3 = "";
            }
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                String readString4 = parcel.readString();
                if (readString4 == null) {
                    readString4 = "";
                }
                String readString5 = parcel.readString();
                if (readString5 == null) {
                    readString5 = "";
                }
                linkedHashMap.put(readString4, readString5);
            }
            return new TestPushPayload(readString, readString2, readString3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TestPushPayload[] newArray(int i11) {
            return new TestPushPayload[i11];
        }
    }

    public TestPushPayload(@NotNull String title, @NotNull String body, @NotNull String imgUrl, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f60711a = title;
        this.f60712b = body;
        this.f60713c = imgUrl;
        this.f60714d = data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestPushPayload)) {
            return false;
        }
        TestPushPayload testPushPayload = (TestPushPayload) obj;
        return Intrinsics.d(this.f60711a, testPushPayload.f60711a) && Intrinsics.d(this.f60712b, testPushPayload.f60712b) && Intrinsics.d(this.f60713c, testPushPayload.f60713c) && Intrinsics.d(this.f60714d, testPushPayload.f60714d);
    }

    public final int hashCode() {
        return this.f60714d.hashCode() + g.a(g.a(this.f60711a.hashCode() * 31, 31, this.f60712b), 31, this.f60713c);
    }

    @NotNull
    public final String toString() {
        return "TestPushPayload(title=" + this.f60711a + ", body=" + this.f60712b + ", imgUrl=" + this.f60713c + ", data=" + this.f60714d + ')';
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f60711a);
        parcel.writeString(this.f60712b);
        parcel.writeString(this.f60713c);
        ?? r42 = this.f60714d;
        parcel.writeInt(r42.size());
        for (Map.Entry entry : r42.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public TestPushPayload() {
        this("", "", "", U.c());
    }
}
