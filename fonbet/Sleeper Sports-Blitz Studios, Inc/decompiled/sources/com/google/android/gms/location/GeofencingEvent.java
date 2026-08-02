package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.identity.zzek;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* loaded from: classes7.dex */
public class GeofencingEvent {
    private final int zza;
    private final int zzb;
    private final List zzc;
    private final Location zzd;

    private GeofencingEvent(int i, int i2, List list, Location location) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = list;
        this.zzd = location;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static GeofencingEvent fromIntent(Intent intent) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (intent != null) {
            int intExtra = intent.getIntExtra(Constants.KEY_GMS_ERROR_CODE, -1);
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
                    for (int i = 0; i < size; i++) {
                        byte[] bArr = (byte[]) arrayList.get(i);
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(bArr, 0, bArr.length);
                        obtain.setDataPosition(0);
                        zzek createFromParcel = zzek.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        arrayList2.add(createFromParcel);
                    }
                }
                Location location = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
                if (arrayList2 == null || intExtra != -1) {
                    return new GeofencingEvent(intExtra, intExtra2, arrayList2, location);
                }
            }
            intExtra2 = -1;
            arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList != null) {
            }
            Location location2 = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if (arrayList2 == null) {
            }
            return new GeofencingEvent(intExtra, intExtra2, arrayList2, location2);
        }
        return null;
    }

    public int getErrorCode() {
        return this.zza;
    }

    public int getGeofenceTransition() {
        return this.zzb;
    }

    public List<Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}
