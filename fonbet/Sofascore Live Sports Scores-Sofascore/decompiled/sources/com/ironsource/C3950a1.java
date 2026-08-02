package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3950a1 implements Parcelable {
    public static final Parcelable.Creator<C3950a1> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private ArrayList<String> f;
    private ArrayList<String> g;
    private ArrayList<String> h;
    private ArrayList<String> i;
    private String j;
    private String k;
    private Map<String, String> l;

    private C3950a1(Parcel parcel) {
        i();
        try {
            this.d = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = a(parcel.readString());
        } catch (Throwable th) {
            C4157k4.d().a(th);
            i();
        }
    }

    private Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
        return hashMap;
    }

    private void i() {
        this.d = false;
        this.e = -1;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.k = "";
        this.j = "";
        this.l = new HashMap();
    }

    public void b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<String> arrayList = this.i;
        if (!z) {
            arrayList.remove(str);
        } else if (arrayList.indexOf(str) == -1) {
            this.i.add(str);
        }
    }

    public void c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<String> arrayList = this.f;
        if (!z) {
            arrayList.remove(str);
        } else if (arrayList.indexOf(str) == -1) {
            this.f.add(str);
        }
    }

    public void d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<String> arrayList = this.h;
        if (!z) {
            arrayList.remove(str);
        } else if (arrayList.indexOf(str) == -1) {
            this.h.add(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.h.indexOf(str) > -1;
    }

    public String f() {
        return this.k;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.k = str;
    }

    public boolean j() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.l);
            sb.append(", ");
        } catch (Throwable th) {
            C4157k4.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.e);
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(new JSONObject(this.l).toString());
        } catch (Throwable th) {
            C4157k4.d().a(th);
        }
    }

    public void f(String str) {
        this.c = str;
    }

    public String g() {
        return this.a;
    }

    public String h() {
        return this.b;
    }

    public void j(String str) {
        this.b = str;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a1$a */
    public class a implements Parcelable.Creator<C3950a1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3950a1 createFromParcel(Parcel parcel) {
            return new C3950a1(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3950a1[] newArray(int i) {
            return new C3950a1[i];
        }
    }

    public Map<String, String> e() {
        return this.l;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f.indexOf(str) > -1;
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.i.indexOf(str) > -1;
    }

    public String d() {
        return this.j;
    }

    public void i(String str) {
        this.a = str;
    }

    public void a(Map<String, String> map) {
        this.l = map;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a() {
        this.e = -1;
    }

    public C3950a1() {
        i();
    }

    public void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<String> arrayList = this.g;
        if (z) {
            if (arrayList.indexOf(str) == -1) {
                this.g.add(str);
                return;
            }
            return;
        }
        arrayList.remove(str);
    }

    public /* synthetic */ C3950a1(Parcel parcel, int i) {
        this(parcel);
    }
}
