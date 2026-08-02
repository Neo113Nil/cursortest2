package defpackage;

import androidx.media3.common.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wc9 extends xc9 {
    public final String l;
    public final hv9 m;

    public wc9(String str, wc9 wc9Var, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, wc9Var, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = hv9.v(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wc9(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, vvf.e);
        av9 av9Var = hv9.b;
    }
}
