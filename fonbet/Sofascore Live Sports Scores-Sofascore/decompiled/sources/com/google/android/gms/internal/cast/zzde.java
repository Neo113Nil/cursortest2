package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzde extends UIController {
    public final TextView b;
    public final ArrayList c;

    public zzde(TextView textView, List list) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = textView;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        MediaMetadata mediaMetadata;
        TextView textView;
        String str;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            return;
        }
        MediaStatus h = remoteMediaClient.h();
        Preconditions.i(h);
        MediaInfo mediaInfo = h.a;
        if (mediaInfo == null || (mediaMetadata = mediaInfo.d) == null) {
            return;
        }
        Iterator it = this.c.iterator();
        do {
            boolean hasNext = it.hasNext();
            textView = this.b;
            if (!hasNext) {
                textView.setText("");
                return;
            }
            str = (String) it.next();
        } while (!mediaMetadata.b.containsKey(str));
        textView.setText(mediaMetadata.Y0(str));
    }
}
