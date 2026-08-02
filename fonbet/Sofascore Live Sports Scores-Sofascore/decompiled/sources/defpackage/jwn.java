package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.internal.wearable.zzc;
import com.google.android.gms.internal.wearable.zzr;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.internal.zzdd;
import com.google.android.gms.wearable.internal.zzdg;
import com.google.android.gms.wearable.internal.zzgq;
import com.google.android.gms.wearable.internal.zzil;
import com.google.android.gms.wearable.internal.zzkf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jwn extends l6p {
    public final /* synthetic */ PutDataRequest q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwn(zzdg zzdgVar, zabq zabqVar, PutDataRequest putDataRequest) {
        super(Wearable.a, zabqVar);
        this.q = putDataRequest;
        Objects.requireNonNull(zzdgVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result e(Status status) {
        return new zzdd(status, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[SYNTHETIC] */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Api.AnyClient anyClient) {
        Throwable th;
        File file;
        zzkf zzkfVar = (zzkf) anyClient;
        zzkfVar.getClass();
        PutDataRequest putDataRequest = this.q;
        Map Y0 = putDataRequest.Y0();
        Uri uri = putDataRequest.a;
        Iterator it = Y0.entrySet().iterator();
        while (it.hasNext()) {
            Asset asset = (Asset) ((Map.Entry) it.next()).getValue();
            if (asset.a == null && asset.b == null && asset.c == null && asset.d == null) {
                String valueOf = String.valueOf(uri);
                String valueOf2 = String.valueOf(asset);
                a70.p(fc6.o(new StringBuilder(valueOf.length() + 33 + valueOf2.length()), "Put for ", valueOf, " contains invalid asset: ", valueOf2));
                return;
            }
        }
        if (uri == null) {
            yhk.s("uri must not be null");
            return;
        }
        PutDataRequest putDataRequest2 = new PutDataRequest(uri, new Bundle(), null, PutDataRequest.e);
        putDataRequest2.c = putDataRequest.c;
        if (putDataRequest.d == 0) {
            putDataRequest2.d = 0L;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : putDataRequest.Y0().entrySet()) {
            Asset asset2 = (Asset) entry.getValue();
            byte[] bArr = asset2.a;
            ParcelFileDescriptor parcelFileDescriptor = asset2.c;
            Uri uri2 = asset2.d;
            File file2 = null;
            if (bArr != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        new StringBuilder(mz1.d(String.valueOf(asset2).length() + 54, 7, String.valueOf(createPipe[0])) + String.valueOf(createPipe[1]).length());
                    }
                    String str = (String) entry.getKey();
                    ParcelFileDescriptor parcelFileDescriptor2 = createPipe[0];
                    parcelFileDescriptor2.getClass();
                    putDataRequest2.Z0(str, new Asset(null, null, parcelFileDescriptor2, null));
                    FutureTask futureTask = new FutureTask(new een(zzkfVar, createPipe[1], asset2.a));
                    arrayList.add(futureTask);
                    zzkfVar.I.submit(futureTask);
                } catch (IOException e) {
                    sw9.m("Unable to create ParcelFileDescriptor for asset in request: ".concat(String.valueOf(putDataRequest)), e);
                    return;
                }
            } else if (uri2 != null) {
                try {
                    ParcelFileDescriptor openFileDescriptor = zzkfVar.getContext().getContentResolver().openFileDescriptor(uri2, "r");
                    openFileDescriptor.getClass();
                    putDataRequest2.Z0((String) entry.getKey(), new Asset(null, null, openFileDescriptor, null));
                } catch (FileNotFoundException unused) {
                    new eto(this, arrayList).N1(new zzil(4005, null));
                    "Couldn't resolve asset URI: ".concat(String.valueOf(uri2));
                    return;
                }
            } else if (parcelFileDescriptor != null) {
                try {
                    file = zzr.a(parcelFileDescriptor, (File) zzkfVar.U.zza());
                    try {
                        try {
                            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                            open.getClass();
                            putDataRequest2.Z0((String) entry.getKey(), new Asset(null, null, open, null));
                            if (file != null) {
                                file.delete();
                            }
                        } catch (IOException unused2) {
                            new eto(this, arrayList).N1(new zzil(4005, null));
                            new StringBuilder(String.valueOf(parcelFileDescriptor).length() + 39);
                            if (file != null) {
                                file.delete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        file2 = file;
                        if (file2 != null) {
                            throw th;
                        }
                        file2.delete();
                        throw th;
                    }
                } catch (IOException unused3) {
                    file = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (file2 != null) {
                    }
                }
            } else {
                putDataRequest2.Z0((String) entry.getKey(), asset2);
            }
        }
        zzgq zzgqVar = (zzgq) zzkfVar.getService();
        eto etoVar = new eto(this, arrayList);
        Parcel S1 = zzgqVar.S1();
        zzc.b(S1, etoVar);
        S1.writeInt(1);
        putDataRequest2.writeToParcel(S1, 0);
        zzgqVar.J(S1, 6);
    }
}
