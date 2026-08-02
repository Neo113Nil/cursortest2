package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class thm extends y0 {
    public thm(k6g k6gVar) {
        super(k6gVar);
    }

    @Override // defpackage.y0
    public final String c() {
        return "UPDATE videos_viewed SET last_viewed_ms = ? WHERE video_id == ?";
    }
}
