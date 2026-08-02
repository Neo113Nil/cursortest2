package t3;

import j3.C7275q;
import j3.y;
import m3.r;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f99051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f99052c;

    public /* synthetic */ w(int i11, int i12, Object obj) {
        this.f99050a = i12;
        this.f99052c = obj;
        this.f99051b = i11;
    }

    @Override // m3.r.a
    public final void invoke(Object obj) {
        switch (this.f99050a) {
            case 0:
                ((y.c) obj).onMediaItemTransition((C7275q) this.f99052c, this.f99051b);
                break;
            default:
                ((InterfaceC9928b) obj).onPlaybackStateChanged((InterfaceC9928b.a) this.f99052c, this.f99051b);
                break;
        }
    }
}
