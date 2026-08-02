package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tfm extends y0 {
    public tfm(k6g k6gVar) {
        super(k6gVar);
    }

    @Override // defpackage.y0
    public final String c() {
        return "UPDATE videos_viewed SET is_read = ? WHERE video_id == ?";
    }
}
