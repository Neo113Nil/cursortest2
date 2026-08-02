package eh;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public enum d {
    APPLICATION_INITIALIZED(0),
    ACTIVITY_STARTED(1),
    ACTIVITY_RESUMED(2),
    CONTENT_PROVIDER_CREATED(3),
    ACTIVITY_CREATED(4),
    APPLICATION_RUNTIME_INITIALIZED(5),
    DID_FINISH_LAUNCHING(6),
    WINDOW_DID_BECOME_VISIBLE(7),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f9257a;

    d(int i5) {
        this.f9257a = i5;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f9257a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
