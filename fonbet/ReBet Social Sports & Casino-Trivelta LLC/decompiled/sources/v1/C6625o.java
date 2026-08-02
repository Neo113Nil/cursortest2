package v1;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import e1.AbstractC4134a;
import java.util.HashSet;
import java.util.Iterator;
import v1.C6625o;

/* renamed from: v1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6625o {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f66971a;

    /* renamed from: b, reason: collision with root package name */
    public final b f66972b;

    /* renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f66973c;

    /* renamed from: v1.o$a */
    public class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        public a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return C6625o.this.f66972b.a(bundle);
        }
    }

    /* renamed from: v1.o$b */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66975a = new b() { // from class: v1.p
            @Override // v1.C6625o.b
            public final Bundle a(Bundle bundle) {
                return C6625o.b.b(bundle);
            }
        };

        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }

        Bundle a(Bundle bundle);
    }

    public C6625o() {
        this(b.f66975a);
    }

    public void b(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.f66973c;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        AbstractC4134a.g(this.f66971a.add(mediaCodec));
    }

    public void c() {
        this.f66971a.clear();
        LoudnessCodecController loudnessCodecController = this.f66973c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f66971a.remove(mediaCodec) || (loudnessCodecController = this.f66973c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.f66973c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f66973c = null;
        }
        create = LoudnessCodecController.create(i10, Ta.r.a(), new a());
        this.f66973c = create;
        Iterator it = this.f66971a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public C6625o(b bVar) {
        this.f66971a = new HashSet();
        this.f66972b = bVar;
    }
}
