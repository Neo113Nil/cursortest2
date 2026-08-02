package Hh;

import io.radar.sdk.C4589c;
import java.util.Date;

/* loaded from: classes3.dex */
public interface d {

    public static final class a {
        public static /* synthetic */ void a(d dVar, C4589c.EnumC4599k enumC4599k, C4589c.EnumC4600l enumC4600l, String str, Date date, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i10 & 8) != 0) {
                date = new Date();
            }
            dVar.b(enumC4599k, enumC4600l, str, date);
        }
    }

    void a();

    void b(C4589c.EnumC4599k enumC4599k, C4589c.EnumC4600l enumC4600l, String str, Date date);

    void c(boolean z10);

    b d();
}
