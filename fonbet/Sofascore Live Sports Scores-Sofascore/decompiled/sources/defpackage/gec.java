package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gec {
    public static final gec c;
    public static final /* synthetic */ gec[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;

    static {
        gec gecVar = new gec("ALL", 0, R.string.all, bec.b);
        c = gecVar;
        gec[] gecVarArr = {gecVar, new gec("HIGHLIGHTS", 1, R.string.event_highlights, cec.b), new gec("CLIPS", 2, R.string.video_clips, dec.b), new gec("NEWS", 3, R.string.news, eec.b), new gec("SOCIAL", 4, R.string.social_media_feed, fec.b)};
        d = gecVarArr;
        e = new kp5(gecVarArr);
    }

    public gec(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static gec valueOf(String str) {
        return (gec) Enum.valueOf(gec.class, str);
    }

    public static gec[] values() {
        return (gec[]) d.clone();
    }
}
