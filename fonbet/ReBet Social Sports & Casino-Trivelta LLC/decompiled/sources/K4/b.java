package K4;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f6232a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f6232a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f6232a;
    }
}
