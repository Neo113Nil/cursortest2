package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tf extends Exception {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tf(int i, int i2, String str) {
        this(i, r3, str, null);
        int i3;
        int[] D = wt3.D(24);
        int length = D.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                i3 = D[i4];
                if (wt3.d(i3) == i2) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i3 = i2 == 1204 ? 1 : 15;
            }
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        return message == null ? "" : message;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = "null";
        int i = this.b;
        String str2 = i != 1 ? i != 2 ? "null" : "PLAY" : "LOAD";
        switch (this.a) {
            case 1:
                str = "INTERNAL_ERROR";
                break;
            case 2:
                str = "VAST_MALFORMED_RESPONSE";
                break;
            case 3:
                str = "UNKNOWN_AD_RESPONSE";
                break;
            case 4:
                str = "VAST_TRAFFICKING_ERROR";
                break;
            case 5:
                str = "VAST_LOAD_TIMEOUT";
                break;
            case 6:
                str = "VAST_TOO_MANY_REDIRECTS";
                break;
            case 7:
                str = "VAST_NO_ADS_AFTER_WRAPPER";
                break;
            case 8:
                str = "VIDEO_PLAY_ERROR";
                break;
            case 9:
                str = "VAST_MEDIA_LOAD_TIMEOUT";
                break;
            case 10:
                str = "VAST_LINEAR_ASSET_MISMATCH";
                break;
            case 11:
                str = "OVERLAY_AD_PLAYING_FAILED";
                break;
            case 12:
                str = "OVERLAY_AD_LOADING_FAILED";
                break;
            case 13:
                str = "VAST_NONLINEAR_ASSET_MISMATCH";
                break;
            case 14:
                str = "COMPANION_AD_LOADING_FAILED";
                break;
            case 15:
                str = "UNKNOWN_ERROR";
                break;
            case 16:
                str = "VAST_EMPTY_RESPONSE";
                break;
            case 17:
                str = "FAILED_TO_REQUEST_ADS";
                break;
            case 18:
                str = "VAST_ASSET_NOT_FOUND";
                break;
            case 19:
                str = "ADS_REQUEST_NETWORK_ERROR";
                break;
            case 20:
                str = "INVALID_ARGUMENTS";
                break;
            case 21:
                str = "PLAYLIST_NO_CONTENT_TRACKING";
                break;
            case 22:
                str = "UNEXPECTED_ADS_LOADED_EVENT";
                break;
            case 23:
                str = "ADS_PLAYER_NOT_PROVIDED";
                break;
            case 24:
                str = "WEB_VIEW_ERROR";
                break;
        }
        String message = getMessage();
        StringBuilder sb = new StringBuilder(wt3.h(str2.length(), 33, str.length(), 11, message.length()) + 1);
        bf3.v(sb, "AdError [errorType: ", str2, ", errorCode: ", str);
        return wt3.m(", message: ", message, sb, U3.j.e);
    }

    public tf(int i, int i2, String str, wt3 wt3Var) {
        super(str);
        this.b = i;
        this.a = i2;
    }
}
