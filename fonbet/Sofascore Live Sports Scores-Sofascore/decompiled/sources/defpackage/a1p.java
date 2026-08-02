package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.KeyEvent;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.internal.zzs;
import com.google.android.gms.cast.internal.Logger;
import com.ironsource.U3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a1p extends ccc {
    public final /* synthetic */ zzs f;

    public a1p(zzs zzsVar) {
        Objects.requireNonNull(zzsVar);
        this.f = zzsVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ccc
    public final void c(String str) {
        zzs.v.a("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        zzs zzsVar = this.f;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j = -zzsVar.e.c;
                    RemoteMediaClient remoteMediaClient = zzsVar.n;
                    if (remoteMediaClient == null) {
                        return;
                    }
                    long min = Math.min(remoteMediaClient.j(), Math.max(0L, remoteMediaClient.d() + j));
                    RemoteMediaClient remoteMediaClient2 = zzsVar.n;
                    if (remoteMediaClient2 == null) {
                        return;
                    }
                    MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
                    builder.a = min;
                    remoteMediaClient2.w(new MediaSeekOptions(min, builder.b));
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    SessionManager sessionManager = zzsVar.d;
                    if (sessionManager != null) {
                        sessionManager.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    SessionManager sessionManager2 = zzsVar.d;
                    if (sessionManager2 != null) {
                        sessionManager2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j2 = zzsVar.e.c;
                    RemoteMediaClient remoteMediaClient3 = zzsVar.n;
                    if (remoteMediaClient3 == null) {
                        return;
                    }
                    long min2 = Math.min(remoteMediaClient3.j(), Math.max(0L, remoteMediaClient3.d() + j2));
                    RemoteMediaClient remoteMediaClient4 = zzsVar.n;
                    if (remoteMediaClient4 == null) {
                        return;
                    }
                    MediaSeekOptions.Builder builder2 = new MediaSeekOptions.Builder();
                    builder2.a = min2;
                    remoteMediaClient4.w(new MediaSeekOptions(min2, builder2.b));
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(zzsVar.g);
        int i = Build.VERSION.SDK_INT;
        Context context = zzsVar.a;
        if (i < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    @Override // defpackage.ccc
    public final boolean d(Intent intent) {
        RemoteMediaClient remoteMediaClient;
        zzs.v.a("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (remoteMediaClient = this.f.n) == null) {
            return true;
        }
        remoteMediaClient.x();
        return true;
    }

    @Override // defpackage.ccc
    public final void e() {
        zzs.v.a(U3.i.t0, new Object[0]);
        RemoteMediaClient remoteMediaClient = this.f.n;
        if (remoteMediaClient != null) {
            remoteMediaClient.x();
        }
    }

    @Override // defpackage.ccc
    public final void f() {
        zzs.v.a("onPlay", new Object[0]);
        RemoteMediaClient remoteMediaClient = this.f.n;
        if (remoteMediaClient != null) {
            remoteMediaClient.x();
        }
    }

    @Override // defpackage.ccc
    public final void g(long j) {
        Logger logger = zzs.v;
        zzs.v.a("onSeekTo %d", Long.valueOf(j));
        RemoteMediaClient remoteMediaClient = this.f.n;
        if (remoteMediaClient == null) {
            return;
        }
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.a = j;
        remoteMediaClient.w(new MediaSeekOptions(j, builder.b));
    }

    @Override // defpackage.ccc
    public final void h() {
        zzs.v.a("onSkipToNext", new Object[0]);
        RemoteMediaClient remoteMediaClient = this.f.n;
        if (remoteMediaClient != null) {
            remoteMediaClient.r();
        }
    }

    @Override // defpackage.ccc
    public final void i() {
        zzs.v.a("onSkipToPrevious", new Object[0]);
        RemoteMediaClient remoteMediaClient = this.f.n;
        if (remoteMediaClient != null) {
            remoteMediaClient.s();
        }
    }
}
