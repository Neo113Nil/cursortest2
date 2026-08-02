package h8;

import com.google.firebase.Timestamp;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class k extends PropertyReference1Impl {

    /* renamed from: a, reason: collision with root package name */
    public static final k f10422a = new k(Timestamp.class, "seconds", "getSeconds()J", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1
    public final Object get(Object obj) {
        return Long.valueOf(((Timestamp) obj).f6050a);
    }
}
