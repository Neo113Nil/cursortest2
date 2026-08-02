package t2;

import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.List;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f65031a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65032b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65033c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65034d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC3445z.a f65035a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f65036b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f65037c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f65038d;

        public F e() {
            return new F(this);
        }

        public b f(boolean z10) {
            this.f65037c = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f65036b = z10;
            return this;
        }

        public b(E... eArr) {
            this.f65035a = new AbstractC3445z.a().j(eArr);
        }

        public b(List list) {
            this.f65035a = new AbstractC3445z.a().k(list);
        }

        public b(F f10) {
            this.f65035a = new AbstractC3445z.a().k(f10.f65031a);
            this.f65036b = f10.f65032b;
            this.f65037c = f10.f65033c;
            this.f65038d = f10.f65034d;
        }
    }

    public b a() {
        return new b();
    }

    public boolean b() {
        for (int i10 = 0; i10 < this.f65031a.size(); i10++) {
            if (((E) this.f65031a.get(i10)).c()) {
                return true;
            }
        }
        return false;
    }

    public F(b bVar) {
        AbstractC3445z m10 = bVar.f65035a.m();
        this.f65031a = m10;
        boolean z10 = true;
        AbstractC4134a.b(!m10.isEmpty(), "The sequence must contain at least one EditedMediaItem.");
        if (((E) m10.get(0)).c() && !bVar.f65037c && !bVar.f65038d) {
            z10 = false;
        }
        AbstractC4134a.b(z10, "If the first item in the sequence is a Gap, then forceAudioTrack or forceVideoTrack flag must be set");
        this.f65032b = bVar.f65036b;
        this.f65033c = bVar.f65037c;
        this.f65034d = bVar.f65038d;
    }
}
