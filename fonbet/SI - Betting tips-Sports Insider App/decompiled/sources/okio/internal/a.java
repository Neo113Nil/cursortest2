package okio.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21369a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f21370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21373e;

    public /* synthetic */ a(Ref.ObjectRef objectRef, BufferedSource bufferedSource, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.f21371c = objectRef;
        this.f21370b = bufferedSource;
        this.f21372d = objectRef2;
        this.f21373e = objectRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit readCentralDirectoryZipEntry$lambda$1$0;
        Unit readOrSkipLocalHeader$lambda$0;
        int i5 = this.f21369a;
        int intValue = ((Integer) obj).intValue();
        long longValue = ((Long) obj2).longValue();
        switch (i5) {
            case 0:
                readCentralDirectoryZipEntry$lambda$1$0 = ZipFilesKt.readCentralDirectoryZipEntry$lambda$1$0(this.f21371c, this.f21370b, this.f21372d, this.f21373e, intValue, longValue);
                return readCentralDirectoryZipEntry$lambda$1$0;
            default:
                readOrSkipLocalHeader$lambda$0 = ZipFilesKt.readOrSkipLocalHeader$lambda$0(this.f21370b, this.f21371c, this.f21372d, this.f21373e, intValue, longValue);
                return readOrSkipLocalHeader$lambda$0;
        }
    }

    public /* synthetic */ a(BufferedSource bufferedSource, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.f21370b = bufferedSource;
        this.f21371c = objectRef;
        this.f21372d = objectRef2;
        this.f21373e = objectRef3;
    }
}
