package s7;

import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends com.google.android.gms.internal.measurement.x implements c0 {
    @Override // s7.c0
    public final void H(List list) {
        Parcel O = O();
        O.writeTypedList(list);
        Q(O);
    }
}
