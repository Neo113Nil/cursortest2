package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class gp implements zl9 {

    @NotNull
    public static final fp Companion = new fp();
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;

    public /* synthetic */ gp(int i, int i2, int i3, String str, int i4, int i5, int i6, boolean z) {
        if (63 != (i & 63)) {
            oea.z(i, 63, ep.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        if ((i & 64) == 0) {
            this.g = str == null || str.length() == 0;
        } else {
            this.g = z;
        }
    }

    @Override // defpackage.zl9
    public final String b(Context context) {
        context.getClass();
        String str = this.c;
        if (str != null) {
            return str;
        }
        String string = context.getString(R.string.in_progress);
        string.getClass();
        return string;
    }

    @Override // defpackage.zl9
    public final String c(Context context) {
        context.getClass();
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f);
        int i = this.e;
        int i2 = i / 60;
        return dmi.q(" ", context.getString(R.string.am_football_drive_summary, valueOf, valueOf2, String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60))}, 2))));
    }

    @Override // defpackage.zl9
    public final boolean d() {
        return this.g;
    }

    @Override // defpackage.zl9
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return this.a == gpVar.a && this.b == gpVar.b && Intrinsics.c(this.c, gpVar.c) && this.d == gpVar.d && this.e == gpVar.e && this.f == gpVar.f;
    }

    @Override // defpackage.zl9
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return Integer.hashCode(this.f) + wv8.a(this.e, wv8.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "AmFootballCommentaryGroupItem(id=", ", teamId=", ", endReason=");
        w1l.q(this.d, this.c, ", playCount=", ", durationSeconds=", s);
        return me4.i(s, this.e, ", netDriveYards=", this.f, ")");
    }

    public gp(int i, int i2, int i3, int i4, int i5, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = str == null || str.length() == 0;
    }
}
