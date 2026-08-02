package com.vk.reefton;

import android.net.Uri;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import xsna.emb;
import xsna.epx;
import xsna.sht0;

/* compiled from: ReefOneVideoPlayerAdapter.kt */
/* loaded from: classes5.dex */
public final class b {
    public final Reef a;
    public long b = -1;
    public String c;
    public boolean d;
    public one.video.player.tracks.c e;

    public b(Reef reef) {
        this.a = reef;
        reef.c();
    }

    public final void a(sht0 sht0Var) {
        Uri uri;
        String uri2;
        String str;
        if (sht0Var == null || (uri = sht0Var.b) == null || (uri2 = uri.toString()) == null || epx.f(this.c, uri2)) {
            return;
        }
        String str2 = this.c;
        Reef reef = this.a;
        if (str2 != null) {
            reef.a(new ReefEvent.y());
        }
        this.c = uri2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(uri2.getBytes(emb.b));
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString(b & 255));
            }
            str = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            str = "";
        }
        reef.a(new ReefEvent.x(sht0Var.c ? ReefContentType.LIVE : ReefContentType.VIDEO, str, Uri.parse(uri2)));
        reef.a(new ReefEvent.PlayerQualityChange(ReefContentQuality.AUTO, ReefEvent.PlayerQualityChange.Reason.AUTO, null));
        this.b = -1L;
        this.d = false;
        this.e = null;
    }
}
