package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ojn implements njn, zkn {
    public final /* synthetic */ int a;
    public final FileChannel b;
    public final long c;
    public final long d;

    public /* synthetic */ ojn(FileChannel fileChannel, long j, long j2, int i) {
        this.a = i;
        this.b = fileChannel;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.njn
    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        int i2 = this.a;
        long j2 = this.c;
        switch (i2) {
            case 0:
                MappedByteBuffer map = this.b.map(FileChannel.MapMode.READ_ONLY, j2 + j, i);
                map.load();
                for (MessageDigest messageDigest : messageDigestArr) {
                    map.position(0);
                    messageDigest.update(map);
                }
                break;
            default:
                MappedByteBuffer map2 = this.b.map(FileChannel.MapMode.READ_ONLY, j2 + j, i);
                map2.load();
                for (MessageDigest messageDigest2 : messageDigestArr) {
                    map2.position(0);
                    messageDigest2.update(map2);
                }
                break;
        }
    }

    @Override // defpackage.njn
    public final long zza() {
        switch (this.a) {
        }
        return this.d;
    }
}
