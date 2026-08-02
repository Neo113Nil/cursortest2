package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum len {
    DAI_INTEGRATION_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_NONE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_TRUMAN_STITCHED_MANIFEST_LINEAR(2),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_TRUMAN_STITCHED_MANIFEST_VOD(3),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_POD_API_SEGMENT_REDIRECT_LINEAR(4),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_POD_API_MANIFEST_LINEAR(5),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_POD_API_MANIFEST_VOD(6),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_CLOUD_SEGMENT_REDIRECT_LINEAR(7),
    /* JADX INFO: Fake field, exist only in values array */
    DAI_INTEGRATION_CLOUD_MANIFEST_VOD(8),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);

    public final int a;

    len(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }
}
