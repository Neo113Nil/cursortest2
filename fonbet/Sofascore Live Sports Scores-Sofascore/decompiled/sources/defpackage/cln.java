package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.a;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.inmobi.media.core.config.models.CrashConfig;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cln implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UIMediaController b;

    public cln(UIMediaController uIMediaController, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(uIMediaController);
                this.b = uIMediaController;
                break;
            case 2:
                Objects.requireNonNull(uIMediaController);
                this.b = uIMediaController;
                break;
            case 3:
                Objects.requireNonNull(uIMediaController);
                this.b = uIMediaController;
                break;
            case 4:
                Objects.requireNonNull(uIMediaController);
                this.b = uIMediaController;
                break;
            case 5:
                Objects.requireNonNull(uIMediaController);
                this.b = uIMediaController;
                break;
            case 6:
                this.b = uIMediaController;
                break;
            case 7:
                Objects.requireNonNull(uIMediaController);
                this.b = uIMediaController;
                break;
            default:
                Objects.requireNonNull(uIMediaController);
                this.b = uIMediaController;
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        UIMediaController uIMediaController = this.b;
        switch (i) {
            case 0:
                CastSession c = CastContext.c(uIMediaController.a.getApplicationContext()).b().c();
                if (c != null && c.c()) {
                    try {
                        boolean z = !c.l();
                        try {
                            Preconditions.e("Must be called from the main thread.");
                            zzbm zzbmVar = c.i;
                            if (zzbmVar != null && zzbmVar.n()) {
                                TaskApiCall.Builder a = TaskApiCall.a();
                                a.a = new fjg(zzbmVar, z);
                                a.d = 8412;
                                zzbmVar.h(1, a.a());
                                break;
                            }
                        } catch (IllegalArgumentException e) {
                            e = e;
                            UIMediaController.h.c("Unable to call CastSession.setMute(boolean).", e);
                            return;
                        }
                    } catch (IOException | IllegalArgumentException e2) {
                        e = e2;
                    }
                }
                break;
            case 1:
                RemoteMediaClient q = uIMediaController.q();
                if (q != null && q.k()) {
                    q.x();
                    break;
                }
                break;
            case 2:
                RemoteMediaClient q2 = uIMediaController.q();
                if (q2 != null && q2.k()) {
                    q2.r();
                    break;
                }
                break;
            case 3:
                RemoteMediaClient q3 = uIMediaController.q();
                if (q3 != null && q3.k()) {
                    q3.s();
                    break;
                }
                break;
            case 4:
                RemoteMediaClient q4 = uIMediaController.q();
                if (q4 != null && q4.k()) {
                    if (!q4.B()) {
                        q4.v(q4.d() + CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                        break;
                    } else {
                        q4.v(Math.min(q4.d() + CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, uIMediaController.e.g() + r7.f()));
                        break;
                    }
                }
                break;
            case 5:
                RemoteMediaClient q5 = uIMediaController.q();
                if (q5 != null && q5.k()) {
                    if (!q5.B()) {
                        q5.v(q5.d() - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                        break;
                    } else {
                        q5.v(Math.max(q5.d() - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, uIMediaController.e.g() + r7.e()));
                        break;
                    }
                }
                break;
            case 6:
                Activity activity = uIMediaController.a;
                CastContext c2 = CastContext.c(activity);
                c2.getClass();
                Preconditions.e("Must be called from the main thread.");
                CastMediaOptions castMediaOptions = c2.e.f;
                if (castMediaOptions != null) {
                    String str = castMediaOptions.b;
                    if (!TextUtils.isEmpty(str)) {
                        ComponentName componentName = new ComponentName(activity.getApplicationContext(), str);
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity.startActivity(intent);
                        break;
                    }
                }
                break;
            default:
                RemoteMediaClient q6 = uIMediaController.q();
                if (q6 != null && q6.k()) {
                    Activity activity2 = uIMediaController.a;
                    if (activity2 instanceof FragmentActivity) {
                        TracksChooserDialogFragment tracksChooserDialogFragment = new TracksChooserDialogFragment();
                        FragmentActivity fragmentActivity = (FragmentActivity) activity2;
                        a aVar = new a(fragmentActivity.k());
                        Fragment F = fragmentActivity.k().F("TRACKS_CHOOSER_DIALOG_TAG");
                        if (F != null) {
                            aVar.k(F);
                        }
                        tracksChooserDialogFragment.n = false;
                        tracksChooserDialogFragment.o = true;
                        aVar.i(0, tracksChooserDialogFragment, "TRACKS_CHOOSER_DIALOG_TAG", 1);
                        tracksChooserDialogFragment.m = false;
                        tracksChooserDialogFragment.i = aVar.g(false, true);
                        break;
                    }
                }
                break;
        }
    }
}
