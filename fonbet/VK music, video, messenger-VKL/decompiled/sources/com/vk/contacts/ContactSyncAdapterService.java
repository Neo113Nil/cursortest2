package com.vk.contacts;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import com.vk.log.L;
import xsna.bpn0;
import xsna.fbh;

/* compiled from: ContactSyncAdapterService.kt */
/* loaded from: classes17.dex */
public final class ContactSyncAdapterService extends Service {
    public static final /* synthetic */ int c = 0;
    public final bpn0 b = new bpn0(new fbh(this, 8));

    /* compiled from: ContactSyncAdapterService.kt */
    public static final class a extends AbstractThreadedSyncAdapter {
        @Override // android.content.AbstractThreadedSyncAdapter
        public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
            L.e("VkContactManager", "perform sync in SyncAdapterImpl");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((a) this.b.getValue()).getSyncAdapterBinder();
    }
}
