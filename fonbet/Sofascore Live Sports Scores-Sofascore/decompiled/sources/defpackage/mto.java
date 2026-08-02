package defpackage;

import android.util.LruCache;
import com.google.android.gms.cast.framework.media.MediaQueue;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mto extends LruCache {
    public final /* synthetic */ MediaQueue a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mto(MediaQueue mediaQueue) {
        super(20);
        this.a = mediaQueue;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            ArrayList arrayList = this.a.g;
            Preconditions.i(arrayList);
            arrayList.add(num);
        }
    }
}
