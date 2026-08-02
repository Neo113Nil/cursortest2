package com.vk.push.core.test;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.urd0;
import xsna.zcl;

/* compiled from: TestPushPayload.kt */
/* loaded from: classes5.dex */
public final class TestPushPayload implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, String> e;

    /* compiled from: TestPushPayload.kt */
    public static final class CREATOR implements Parcelable.Creator<TestPushPayload> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TestPushPayload createFromParcel(Parcel parcel) {
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
            for (int i = 0; i < readInt; i++) {
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TestPushPayload[] newArray(int i) {
            return new TestPushPayload[i];
        }
    }

    public TestPushPayload() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestPushPayload copy$default(TestPushPayload testPushPayload, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testPushPayload.b;
        }
        if ((i & 2) != 0) {
            str2 = testPushPayload.c;
        }
        if ((i & 4) != 0) {
            str3 = testPushPayload.d;
        }
        if ((i & 8) != 0) {
            map = testPushPayload.e;
        }
        return testPushPayload.copy(str, str2, str3, map);
    }

    public final String component1() {
        return this.b;
    }

    public final String component2() {
        return this.c;
    }

    public final String component3() {
        return this.d;
    }

    public final Map<String, String> component4() {
        return this.e;
    }

    public final TestPushPayload copy(String str, String str2, String str3, Map<String, String> map) {
        return new TestPushPayload(str, str2, str3, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestPushPayload)) {
            return false;
        }
        TestPushPayload testPushPayload = (TestPushPayload) obj;
        return epx.f(this.b, testPushPayload.b) && epx.f(this.c, testPushPayload.c) && epx.f(this.d, testPushPayload.d) && epx.f(this.e, testPushPayload.e);
    }

    public final String getBody() {
        return this.c;
    }

    public final Map<String, String> getData() {
        return this.e;
    }

    public final String getImgUrl() {
        return this.d;
    }

    public final String getTitle() {
        return this.b;
    }

    public int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TestPushPayload(title=");
        sb.append(this.b);
        sb.append(", body=");
        sb.append(this.c);
        sb.append(", imgUrl=");
        sb.append(this.d);
        sb.append(", data=");
        return cjl0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Map<String, String> map = this.e;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public TestPushPayload(String str, String str2, String str3, Map<String, String> map) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = map;
    }

    public /* synthetic */ TestPushPayload(String str, String str2, String str3, Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? jgp.b : map);
    }
}
