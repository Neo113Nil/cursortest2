package H4;

import com.bumptech.glide.load.engine.r;

/* loaded from: classes2.dex */
public class e extends F4.j implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return ((c) this.f3562a).i();
    }

    @Override // F4.j, com.bumptech.glide.load.engine.r
    public void initialize() {
        ((c) this.f3562a).e().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
        ((c) this.f3562a).stop();
        ((c) this.f3562a).k();
    }
}
