package com.vk.movika.sdk.base.observable;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import xsna.brm0;
import xsna.hyg0;
import xsna.izs;
import xsna.qgi0;
import xsna.qwr0;
import xsna.qyg0;
import xsna.s3q0;
import xsna.tgi0;
import xsna.uk10;
import xsna.wjs0;
import xsna.zk10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ a0(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.l) obj).g(this.c);
                return s3q0.a;
            case 1:
                ClipsDraftPersistentStore.r((ClipsDraftPersistentStore) obj, this.c, 6);
                ClipsDraftPersistentStore.s();
                wjs0.a(qwr0.a);
                return s3q0.a;
            case 2:
                qgi0.r((tgi0) obj, this.c);
                return s3q0.a;
            case 3:
                String str2 = this.c;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT COUNT(DISTINCT p.pid) FROM playlist p\n        INNER JOIN playlists_to_tracks ptt on ptt.playlist_id = p.pid\n        AND ptt.uid = ?\n        INNER JOIN audio_track t on t.mid = ptt.music_track_id\n        WHERE t.json_raw LIKE '%\"moosic_audio\"%'\n        AND p.type = 1\n        AND p.uid = ?\n    ");
                try {
                    V0.D3(1, str2);
                    V0.D3(2, str2);
                    int i = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                zk10 zk10Var = (zk10) obj;
                uk10 c = zk10Var.a().c(1);
                if (c == null || (str = c.a) == null) {
                    str = "";
                }
                String str3 = this.c;
                if (brm0.B(str, str3, false)) {
                    return zk10Var.getValue();
                }
                return "name=\"" + str3 + str + '\"';
        }
    }
}
