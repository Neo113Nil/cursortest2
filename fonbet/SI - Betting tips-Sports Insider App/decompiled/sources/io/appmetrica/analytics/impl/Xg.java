package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final M8 f13190b;

    public Xg(@NonNull X4 x42) {
        this(x42, x42.j());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        EnumC0098da enumC0098da;
        if (!TextUtils.isEmpty(p52.getName())) {
            M8 m82 = this.f13190b;
            String name = p52.getName();
            if (m82.f12575c == null) {
                m82.a();
            }
            int hashCode = name.hashCode();
            if (m82.f12575c.f12683b.contains(Integer.valueOf(hashCode))) {
                enumC0098da = EnumC0098da.NON_FIRST_OCCURENCE;
            } else {
                O8 o82 = m82.f12575c;
                EnumC0098da enumC0098da2 = o82.f12682a ? EnumC0098da.FIRST_OCCURRENCE : EnumC0098da.UNKNOWN;
                if (o82.f12685d < 1000) {
                    o82.f12683b.add(Integer.valueOf(hashCode));
                    o82.f12685d++;
                } else {
                    o82.f12682a = false;
                }
                R8 r82 = m82.f12574b;
                O8 o83 = m82.f12575c;
                IBinaryDataHelper iBinaryDataHelper = r82.f12810c;
                Q8 q82 = r82.f12809b;
                r82.f12808a.getClass();
                iBinaryDataHelper.insert("event_hashes", q82.toByteArray((Q8) P8.a(o83)));
                enumC0098da = enumC0098da2;
            }
            p52.f12736k = enumC0098da;
        }
        return false;
    }

    public Xg(X4 x42, M8 m82) {
        super(x42);
        this.f13190b = m82;
    }
}
