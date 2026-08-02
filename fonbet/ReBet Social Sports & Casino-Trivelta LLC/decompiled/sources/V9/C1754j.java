package V9;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzdh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: V9.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1754j {

    /* renamed from: a, reason: collision with root package name */
    public final int f12842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12843b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12844c;

    /* renamed from: d, reason: collision with root package name */
    public final Location f12845d;

    public C1754j(int i10, int i11, List list, Location location) {
        this.f12842a = i10;
        this.f12843b = i11;
        this.f12844c = list;
        this.f12845d = location;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1754j a(Intent intent) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 != 1 && intExtra2 != 2) {
                if (intExtra2 == 4) {
                    intExtra2 = 4;
                }
            }
            arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList != null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    byte[] bArr = (byte[]) arrayList.get(i10);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    zzdh createFromParcel = zzdh.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                    arrayList2.add(createFromParcel);
                }
            }
            Location location = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if (arrayList2 == null || intExtra != -1) {
                return new C1754j(intExtra, intExtra2, arrayList2, location);
            }
            return null;
        }
        intExtra2 = -1;
        arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList != null) {
        }
        Location location2 = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
        if (arrayList2 == null) {
        }
        return new C1754j(intExtra, intExtra2, arrayList2, location2);
    }

    public int b() {
        return this.f12842a;
    }

    public int c() {
        return this.f12843b;
    }

    public List d() {
        return this.f12844c;
    }

    public Location e() {
        return this.f12845d;
    }

    public boolean f() {
        return this.f12842a != -1;
    }
}
