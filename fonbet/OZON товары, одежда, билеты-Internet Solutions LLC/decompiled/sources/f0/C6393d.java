package f0;

import C.S;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import d0.Y;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x2.i;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6393d implements Y {

    /* renamed from: a, reason: collision with root package name */
    private final Y f62416a;

    /* renamed from: b, reason: collision with root package name */
    private final Range<Integer> f62417b;

    /* renamed from: c, reason: collision with root package name */
    private final Range<Integer> f62418c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f62419d;

    private C6393d(@NonNull Y y11) {
        HashSet hashSet = new HashSet();
        this.f62419d = hashSet;
        this.f62416a = y11;
        int j11 = y11.j();
        this.f62417b = Range.create(Integer.valueOf(j11), Integer.valueOf(((int) Math.ceil(4096.0d / j11)) * j11));
        int h11 = y11.h();
        this.f62418c = Range.create(Integer.valueOf(h11), Integer.valueOf(((int) Math.ceil(2160.0d / h11)) * h11));
        List<String> list = MediaCodecInfoReportIncorrectInfoQuirk.f38501a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f38501a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    @NonNull
    public static Y k(@NonNull Y y11, Size size) {
        if (!(y11 instanceof C6393d)) {
            if (androidx.camera.video.internal.compat.quirk.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !y11.b(size.getWidth(), size.getHeight())) {
                    S.k("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + y11.e() + "/" + y11.f());
                }
            }
            y11 = new C6393d(y11);
        }
        if (size != null && (y11 instanceof C6393d)) {
            ((C6393d) y11).f62419d.add(size);
        }
        return y11;
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> a(int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Range<Integer> range = this.f62418c;
        boolean contains = range.contains((Range<Integer>) valueOf);
        Y y11 = this.f62416a;
        i.a("Not supported height: " + i11 + " which is not in " + range + " or can not be divided by alignment " + y11.h(), contains && i11 % y11.h() == 0);
        return this.f62417b;
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> c() {
        return this.f62416a.c();
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> d(int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Range<Integer> range = this.f62417b;
        boolean contains = range.contains((Range<Integer>) valueOf);
        Y y11 = this.f62416a;
        i.a("Not supported width: " + i11 + " which is not in " + range + " or can not be divided by alignment " + y11.j(), contains && i11 % y11.j() == 0);
        return this.f62418c;
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> e() {
        return this.f62417b;
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> f() {
        return this.f62418c;
    }

    @Override // d0.Y
    public final boolean g() {
        return this.f62416a.g();
    }

    @Override // d0.Y
    public final int h() {
        return this.f62416a.h();
    }

    @Override // d0.Y
    public final boolean i(int i11, int i12) {
        Y y11 = this.f62416a;
        if (y11.i(i11, i12)) {
            return true;
        }
        Iterator it = this.f62419d.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i11 && size.getHeight() == i12) {
                return true;
            }
        }
        if (this.f62417b.contains((Range<Integer>) Integer.valueOf(i11))) {
            return this.f62418c.contains((Range<Integer>) Integer.valueOf(i12)) && i11 % y11.j() == 0 && i12 % y11.h() == 0;
        }
        return false;
    }

    @Override // d0.Y
    public final int j() {
        return this.f62416a.j();
    }
}
