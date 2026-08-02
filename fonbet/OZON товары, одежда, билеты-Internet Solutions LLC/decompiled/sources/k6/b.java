package k6;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f70918a = new ArrayList();

    public final synchronized void a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f70918a.add(imageHeaderParser);
    }

    @NonNull
    public final synchronized ArrayList b() {
        return this.f70918a;
    }
}
