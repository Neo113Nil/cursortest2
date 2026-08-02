package defpackage;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class xxk {
    public static Metadata a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = lik.a;
            String[] split = str.split(U3.j.b, 2);
            if (split.length != 2) {
                "Failed to parse Vorbis comment: ".concat(str);
                m6k.f0();
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.a(new nkk(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    m6k.g0("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static d4a b(nkk nkkVar, boolean z, boolean z2) {
        if (z) {
            c(3, nkkVar, false);
        }
        nkkVar.q((int) nkkVar.j(), xp2.c);
        long j = nkkVar.j();
        String[] strArr = new String[(int) j];
        for (int i = 0; i < j; i++) {
            strArr[i] = nkkVar.q((int) nkkVar.j(), xp2.c);
        }
        if (z2 && (nkkVar.s() & 1) == 0) {
            throw r9e.a("framing bit expected to be set", null);
        }
        return new d4a(strArr, 23);
    }

    public static boolean c(int i, nkk nkkVar, boolean z) {
        if (nkkVar.c() < 7) {
            if (z) {
                return false;
            }
            throw r9e.a("too short header: " + nkkVar.c(), null);
        }
        if (nkkVar.s() != i) {
            if (z) {
                return false;
            }
            throw r9e.a("expected header type " + Integer.toHexString(i), null);
        }
        if (nkkVar.s() == 118 && nkkVar.s() == 111 && nkkVar.s() == 114 && nkkVar.s() == 98 && nkkVar.s() == 105 && nkkVar.s() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw r9e.a("expected characters 'vorbis'", null);
    }
}
