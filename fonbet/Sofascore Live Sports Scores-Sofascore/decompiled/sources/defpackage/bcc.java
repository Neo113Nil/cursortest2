package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bcc extends MediaSession.Callback {
    public final /* synthetic */ ccc a;

    public bcc(ccc cccVar) {
        this.a = cccVar;
    }

    public static void b(dcc dccVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = dccVar.a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        dccVar.d(new icc(str, -1, -1));
    }

    public final dcc a() {
        dcc dccVar;
        ccc cccVar;
        synchronized (this.a.b) {
            dccVar = (dcc) ((WeakReference) this.a.d).get();
        }
        if (dccVar == null) {
            return null;
        }
        ccc cccVar2 = this.a;
        synchronized (dccVar.c) {
            cccVar = dccVar.h;
        }
        if (cccVar2 == cccVar) {
            return dccVar;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        mok mokVar;
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a.b;
                om9 a2 = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a2 == null ? null : a2.asBinder());
                synchronized (mediaSessionCompat$Token.a) {
                    mokVar = mediaSessionCompat$Token.d;
                }
                if (mokVar != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(mokVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
        }
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        ccc cccVar = this.a;
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                hcc.O(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    hcc.O(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    hcc.O(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    hcc.O(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    hcc.O(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                } else {
                    cccVar.c(str);
                }
            }
        } catch (BadParcelableException unused) {
        }
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        dcc a = a();
        if (a == null) {
            return false;
        }
        b(a);
        boolean d = this.a.d(intent);
        a.d(null);
        return d || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.e();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.f();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        dcc a = a();
        if (a == null) {
            return;
        }
        hcc.O(bundle);
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.g(j);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001a. Please report as an issue. */
    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        RatingCompat ratingCompat;
        float f;
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        if (rating != null) {
            int b = cnf.b(rating);
            if (cnf.e(rating)) {
                switch (b) {
                    case 1:
                        ratingCompat = new RatingCompat(1, cnf.d(rating) ? 1.0f : 0.0f);
                        ratingCompat.getClass();
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, cnf.f(rating) ? 1.0f : 0.0f);
                        ratingCompat.getClass();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c = cnf.c(rating);
                        if (b == 3) {
                            f = 3.0f;
                        } else if (b != 4) {
                            if (b == 5) {
                                f = 5.0f;
                            }
                            ratingCompat = null;
                            ratingCompat.getClass();
                            break;
                        } else {
                            f = 4.0f;
                        }
                        if (c >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && c <= f) {
                            ratingCompat = new RatingCompat(b, c);
                            ratingCompat.getClass();
                        }
                        ratingCompat = null;
                        ratingCompat.getClass();
                        break;
                    case 6:
                        float a2 = cnf.a(rating);
                        if (a2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a2 <= 100.0f) {
                            ratingCompat = new RatingCompat(6, a2);
                            ratingCompat.getClass();
                            break;
                        }
                        ratingCompat = null;
                        ratingCompat.getClass();
                        break;
                }
            } else {
                switch (b) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(b, -1.0f);
                        break;
                    default:
                        ratingCompat = null;
                        break;
                }
                ratingCompat.getClass();
            }
        }
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.h();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        this.a.i();
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        dcc a = a();
        if (a == null) {
            return;
        }
        b(a);
        a.d(null);
    }
}
