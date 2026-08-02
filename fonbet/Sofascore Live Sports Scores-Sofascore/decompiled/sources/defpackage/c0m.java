package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c0m extends y0 {
    public c0m(k6g k6gVar) {
        super(k6gVar);
    }

    @Override // defpackage.y0
    public final String c() {
        return "UPDATE videos_liked_status SET is_liked = ? WHERE video_id == ?";
    }
}
