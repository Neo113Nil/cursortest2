package h8;

import com.google.firebase.Timestamp;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class l extends PropertyReference1Impl {

    /* renamed from: a, reason: collision with root package name */
    public static final l f10423a = new l(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1
    public final Object get(Object obj) {
        return Integer.valueOf(((Timestamp) obj).f6051b);
    }
}
