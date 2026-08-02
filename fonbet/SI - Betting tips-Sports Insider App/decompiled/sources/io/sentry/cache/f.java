package io.sentry.cache;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f16251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f16252c;

    public /* synthetic */ f(g gVar, Map map, int i5) {
        this.f16250a = i5;
        this.f16251b = gVar;
        this.f16252c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16250a) {
            case 0:
                this.f16251b.p(this.f16252c, "tags.json");
                break;
            default:
                this.f16251b.p(this.f16252c, "extras.json");
                break;
        }
    }
}
