package defpackage;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import com.google.android.gms.cast.framework.media.zzbk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbyv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class enn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ enn(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i2) {
            case 0:
                TracksChooserDialogFragment tracksChooserDialogFragment = (TracksChooserDialogFragment) obj3;
                zzbk zzbkVar = (zzbk) obj2;
                zzbk zzbkVar2 = (zzbk) obj;
                if (tracksChooserDialogFragment.q) {
                    RemoteMediaClient remoteMediaClient = tracksChooserDialogFragment.v;
                    Preconditions.i(remoteMediaClient);
                    if (remoteMediaClient.k()) {
                        ArrayList arrayList = new ArrayList();
                        int i3 = zzbkVar.b;
                        MediaTrack mediaTrack = (i3 < 0 || i3 >= zzbkVar.getCount()) ? null : (MediaTrack) zzbkVar.getItem(zzbkVar.b);
                        if (mediaTrack != null) {
                            long j = mediaTrack.a;
                            if (j != -1) {
                                arrayList.add(Long.valueOf(j));
                            }
                        }
                        int i4 = zzbkVar2.b;
                        MediaTrack mediaTrack2 = (i4 < 0 || i4 >= zzbkVar2.getCount()) ? null : (MediaTrack) zzbkVar2.getItem(zzbkVar2.b);
                        if (mediaTrack2 != null) {
                            arrayList.add(Long.valueOf(mediaTrack2.a));
                        }
                        long[] jArr = tracksChooserDialogFragment.t;
                        if (jArr != null && jArr.length > 0) {
                            HashSet hashSet = new HashSet();
                            Iterator it = tracksChooserDialogFragment.s.iterator();
                            while (it.hasNext()) {
                                hashSet.add(Long.valueOf(((MediaTrack) it.next()).a));
                            }
                            Iterator it2 = tracksChooserDialogFragment.r.iterator();
                            while (it2.hasNext()) {
                                hashSet.add(Long.valueOf(((MediaTrack) it2.next()).a));
                            }
                            for (long j2 : jArr) {
                                Long valueOf = Long.valueOf(j2);
                                if (!hashSet.contains(valueOf)) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        long[] jArr2 = new long[arrayList.size()];
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            jArr2[i5] = ((Long) arrayList.get(i5)).longValue();
                        }
                        Arrays.sort(jArr2);
                        Preconditions.e("Must be called from the main thread.");
                        if (remoteMediaClient.G()) {
                            RemoteMediaClient.I(new nhn(remoteMediaClient, jArr2, 2));
                        } else {
                            RemoteMediaClient.F();
                        }
                        AlertDialog alertDialog = tracksChooserDialogFragment.u;
                        if (alertDialog != null) {
                            alertDialog.cancel();
                            tracksChooserDialogFragment.u = null;
                            break;
                        }
                    } else {
                        AlertDialog alertDialog2 = tracksChooserDialogFragment.u;
                        if (alertDialog2 != null) {
                            alertDialog2.cancel();
                            tracksChooserDialogFragment.u = null;
                            break;
                        }
                    }
                } else {
                    AlertDialog alertDialog3 = tracksChooserDialogFragment.u;
                    if (alertDialog3 != null) {
                        alertDialog3.cancel();
                        tracksChooserDialogFragment.u = null;
                        break;
                    }
                }
                break;
            default:
                zzbyv zzbyvVar = (zzbyv) obj3;
                DownloadManager downloadManager = (DownloadManager) zzbyvVar.c.getSystemService("download");
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse((String) obj2));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, (String) obj);
                    zzt.zzc();
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    zzbyvVar.b("Could not store picture.");
                }
        }
    }
}
